/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.base.enums.EnumSexoPersona;
import com.egt.base.enums.EnumEstadoCivil;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.enums.EnumTipoArea;
import com.egt.base.enums.EnumCondicionPension;
import com.egt.base.enums.EnumCausaDenPension;
import com.egt.base.enums.EnumCausaRevPension;
import com.egt.base.enums.EnumCondicionRecoPen;
import com.egt.base.enums.EnumCausaDenRecoPen;
import com.egt.base.enums.EnumCondicionDenuPen;
import com.egt.base.enums.EnumTipoActJupe;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.control.Auditor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.process.PersonaBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.jms.ObjectMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AsistentePaginaActualizacionPersona {

    private PaginaActualizacionPersona bean;

    public AsistentePaginaActualizacionPersona() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionPersona(PaginaActualizacionPersona bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(PersonaCachedRowSetDataProvider2.FUNCION_MODIFICAR_PERSONA, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_APROBAR_PENSION_PERSONA, BundleWebui.getString("aprobar_pension_persona")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA, BundleWebui.getString("emitir_persona_con_pension_solicitada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES, BundleWebui.getString("emitir_persona_acreditada_sin_objeciones")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES, BundleWebui.getString("emitir_persona_acreditada_con_objeciones")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA, BundleWebui.getString("emitir_persona_con_pension_aprobada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA, BundleWebui.getString("emitir_persona_con_pension_denegada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA, BundleWebui.getString("emitir_persona_con_pension_revocada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA, BundleWebui.getString("emitir_persona_con_pension_otorgada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA, BundleWebui.getString("emitir_documentos_persona_pension_otorgada")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE, BundleWebui.getString("emitir_ultima_actualizacion_persona_en_jupe")),
            new Option(PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA, BundleWebui.getString("emitir_cuadro_resumen_pension_persona"))
        };
        return bean.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    void procesar() {
        if (bean.getRecursoDataProvider().isFuncionBusinessProcessAutorizada()) {
            bean.getGestor().procesar(new RowProcessor() {

                @Override
                public void processRow(RowKey rowKey) throws Exception {
                    procesar(rowKey);
                }
            });
        }
    }

    void procesar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "procesar", rowKey);
        long f = bean.getRecursoDataProvider().getFuncionBusinessProcess();
        boolean esFilaAutorizada = bean.getRecursoDataProvider().esFilaAutorizada(rowKey, f);
        if (!esFilaAutorizada) {
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_APROBAR_PENSION_PERSONA) {
            this.aprobarPensionPersona(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA) {
            this.emitirPersonaConPensionSolicitada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES) {
            this.emitirPersonaAcreditadaSinObjeciones(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES) {
            this.emitirPersonaAcreditadaConObjeciones(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA) {
            this.emitirPersonaConPensionAprobada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA) {
            this.emitirPersonaConPensionDenegada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA) {
            this.emitirPersonaConPensionRevocada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA) {
            this.emitirPersonaConPensionOtorgada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA) {
            this.emitirDocumentosPersonaPensionOtorgada(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE) {
            this.emitirUltimaActualizacionPersonaEnJupe(rowKey);
        } else if (f == PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA) {
            this.emitirCuadroResumenPensionPersona(rowKey);
        }
    }

    private boolean aprobarPensionPersona(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "aprobarPensionPersona", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idPersona = bean.getPersonaDataProvider().getIdPersona(rowKey);
        String comentariosAprobacionPension = null;
        AprobarPensionPersonaMessage message = new AprobarPensionPersonaMessage(idPersona, comentariosAprobacionPension);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getPersonaBusinessProcess().aprobarPensionPersona(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean emitirPersonaConPensionSolicitada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaConPensionSolicitada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaSolicitudPensionDesde = null;
        Date fechaSolicitudPensionHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaAcreditadaSinObjeciones(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaAcreditadaSinObjeciones", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaSolicitudPensionDesde = null;
        Date fechaSolicitudPensionHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaAcreditadaConObjeciones(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaAcreditadaConObjeciones", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaSolicitudPensionDesde = null;
        Date fechaSolicitudPensionHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaConPensionAprobada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaConPensionAprobada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaAprobacionPensionDesde = null;
        Date fechaAprobacionPensionHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_aprobacion_pension_desde", fechaAprobacionPensionDesde);
        parameters.put("fecha_aprobacion_pension_hasta", fechaAprobacionPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaAprobacionPensionDesde != null) {
            args.add(fechaAprobacionPensionDesde);
            search += " and fecha_aprobacion_pension>=?";
        }
        if (fechaAprobacionPensionHasta != null) {
            args.add(fechaAprobacionPensionHasta);
            search += " and fecha_aprobacion_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaConPensionDenegada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaConPensionDenegada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaDenegacionPensionDesde = null;
        Date fechaDenegacionPensionHasta = null;
        Integer numeroCausaDenPension = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_denegacion_pension_desde", fechaDenegacionPensionDesde);
        parameters.put("fecha_denegacion_pension_hasta", fechaDenegacionPensionHasta);
        parameters.put("numero_causa_den_pension", numeroCausaDenPension);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaDenegacionPensionDesde != null) {
            args.add(fechaDenegacionPensionDesde);
            search += " and fecha_denegacion_pension>=?";
        }
        if (fechaDenegacionPensionHasta != null) {
            args.add(fechaDenegacionPensionHasta);
            search += " and fecha_denegacion_pension<=?";
        }
        if (numeroCausaDenPension != null) {
            args.add(numeroCausaDenPension);
            search += " and numero_causa_den_pension=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaConPensionRevocada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaConPensionRevocada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaRevocacionPensionDesde = null;
        Date fechaRevocacionPensionHasta = null;
        Integer numeroCausaRevPension = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_revocacion_pension_desde", fechaRevocacionPensionDesde);
        parameters.put("fecha_revocacion_pension_hasta", fechaRevocacionPensionHasta);
        parameters.put("numero_causa_rev_pension", numeroCausaRevPension);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaRevocacionPensionDesde != null) {
            args.add(fechaRevocacionPensionDesde);
            search += " and fecha_revocacion_pension>=?";
        }
        if (fechaRevocacionPensionHasta != null) {
            args.add(fechaRevocacionPensionHasta);
            search += " and fecha_revocacion_pension<=?";
        }
        if (numeroCausaRevPension != null) {
            args.add(numeroCausaRevPension);
            search += " and numero_causa_rev_pension=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPersonaConPensionOtorgada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPersonaConPensionOtorgada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaOtorgamientoPenDesde = null;
        Date fechaOtorgamientoPenHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_otorgamiento_pen_desde", fechaOtorgamientoPenDesde);
        parameters.put("fecha_otorgamiento_pen_hasta", fechaOtorgamientoPenHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaOtorgamientoPenDesde != null) {
            args.add(fechaOtorgamientoPenDesde);
            search += " and fecha_otorgamiento_pen>=?";
        }
        if (fechaOtorgamientoPenHasta != null) {
            args.add(fechaOtorgamientoPenHasta);
            search += " and fecha_otorgamiento_pen<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirDocumentosPersonaPensionOtorgada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirDocumentosPersonaPensionOtorgada", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Date fechaOtorgamientoPenDesde = null;
        Date fechaOtorgamientoPenHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_otorgamiento_pen_desde", fechaOtorgamientoPenDesde);
        parameters.put("fecha_otorgamiento_pen_hasta", fechaOtorgamientoPenHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaOtorgamientoPenDesde != null) {
            args.add(fechaOtorgamientoPenDesde);
            search += " and fecha_otorgamiento_pen>=?";
        }
        if (fechaOtorgamientoPenHasta != null) {
            args.add(fechaOtorgamientoPenHasta);
            search += " and fecha_otorgamiento_pen<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirUltimaActualizacionPersonaEnJupe(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirUltimaActualizacionPersonaEnJupe", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Date fechaHoraUltActJupeDesde = null;
        Date fechaHoraUltActJupeHasta = null;
        String codigoSime = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_hora_ult_act_jupe_desde", fechaHoraUltActJupeDesde);
        parameters.put("fecha_hora_ult_act_jupe_hasta", fechaHoraUltActJupeHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaHoraUltActJupeDesde != null) {
            args.add(fechaHoraUltActJupeDesde);
            search += " and fecha_hora_ult_act_jupe>=?";
        }
        if (fechaHoraUltActJupeHasta != null) {
            args.add(fechaHoraUltActJupeHasta);
            search += " and fecha_hora_ult_act_jupe<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirCuadroResumenPensionPersona(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirCuadroResumenPensionPersona", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        String report = PersonaCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA;
        long function = PersonaCachedRowSetDataProvider2.FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_PERSONA;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idEtniaIndigena">
    private GestorBusquedaReferencia gestorBusquedaIdEtniaIndigena = null;

    private boolean funcionSelectEjecutableIdEtniaIndigena = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdEtniaIndigena() {
        if (this.gestorBusquedaIdEtniaIndigena == null) {
            this.gestorBusquedaIdEtniaIndigena = new GestorBusquedaReferencia(
                    bean.getPersonaDataProvider(),
                    bean.getEtniaIndigenaReferenceDataProvider(),
                    PersonaCachedRowSetDataProvider2.COLUMNA_ID_ETNIA_INDIGENA,
                    this.funcionSelectEjecutableIdEtniaIndigena);
        }
        return this.gestorBusquedaIdEtniaIndigena;
    }

    protected FiltroBusqueda getFiltroBusquedaIdEtniaIndigena() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdEtniaIndigena1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdEtniaIndigena().setFiltroBusqueda(this.getFiltroBusquedaIdEtniaIndigena());
        this.getGestorBusquedaIdEtniaIndigena().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdEtniaIndigena1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdEtniaIndigena(rowKey));
        }
        this.getGestorBusquedaIdEtniaIndigena().setFiltroBusqueda(this.getFiltroBusquedaIdEtniaIndigena());
        return this.getGestorBusquedaIdEtniaIndigena().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdEtniaIndigena1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdEtniaIndigena().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdEtniaIndigena1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdEtniaIndigena(rowKey));
        }
        this.getGestorBusquedaIdEtniaIndigena().setFiltroBusqueda(this.getFiltroBusquedaIdEtniaIndigena());
        return this.getGestorBusquedaIdEtniaIndigena().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdEtniaIndigena1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = EtniaIndigenaCachedRowSetDataProvider2.FUNCION_CONSULTAR_ETNIA_INDIGENA;
        String campo = bean.getCampoIdEtniaIndigena1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_ETNIA_INDIGENA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdEtniaIndigena());
    }

    public String getScriptCampoIdEtniaIndigena1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_ETNIA_INDIGENA;
        Long id = bean.getPersonaDataProvider().getIdEtniaIndigena(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdEtniaIndigena1Boton2Rendered() {
        return bean == null ? true : bean.getEtniaIndigenaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdEtniaIndigena1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdEtniaIndigena1Boton2Rendered();
    }

    public boolean isCampoIdEtniaIndigena1Panel2Rendered() {
        return isCampoIdEtniaIndigena1Boton2Rendered() && isGridIdEtniaIndigenaRendered();
    }

    public boolean isTableColumnIdEtniaIndigena3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdEtniaIndigena1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamento">
    private GestorBusquedaReferencia gestorBusquedaIdDepartamento = null;

    private boolean funcionSelectEjecutableIdDepartamento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDepartamento() {
        if (this.gestorBusquedaIdDepartamento == null) {
            this.gestorBusquedaIdDepartamento = new GestorBusquedaReferencia(
                    bean.getPersonaDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PersonaCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO,
                    this.funcionSelectEjecutableIdDepartamento);
        }
        return this.gestorBusquedaIdDepartamento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDepartamento() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_NULO;
        valor = null;
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        this.getGestorBusquedaIdDepartamento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDepartamento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDepartamento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDepartamento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDepartamento());
    }

    public String getScriptCampoIdDepartamento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getPersonaDataProvider().getIdDepartamento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDepartamento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDepartamento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDepartamento1Boton2Rendered();
    }

    public boolean isCampoIdDepartamento1Panel2Rendered() {
        return isCampoIdDepartamento1Boton2Rendered() && isGridIdDepartamentoRendered();
    }

    public boolean isTableColumnIdDepartamento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDepartamento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDistrito">
    private GestorBusquedaReferencia gestorBusquedaIdDistrito = null;

    private boolean funcionSelectEjecutableIdDistrito = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDistrito() {
        if (this.gestorBusquedaIdDistrito == null) {
            this.gestorBusquedaIdDistrito = new GestorBusquedaReferencia(
                    bean.getPersonaDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PersonaCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO,
                    this.funcionSelectEjecutableIdDistrito);
        }
        return this.gestorBusquedaIdDistrito;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDistrito() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = bean.getPersonaDataProvider().getIdDepartamento(rowKey);
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        this.getGestorBusquedaIdDistrito().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDistrito1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDistrito1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDistrito1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDistrito());
    }

    public String getScriptCampoIdDistrito1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getPersonaDataProvider().getIdDistrito(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDistrito1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDistrito1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDistrito1Boton2Rendered();
    }

    public boolean isCampoIdDistrito1Panel2Rendered() {
        return isCampoIdDistrito1Boton2Rendered() && isGridIdDistritoRendered();
    }

    public boolean isTableColumnIdDistrito3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDistrito1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idBarrio">
    private GestorBusquedaReferencia gestorBusquedaIdBarrio = null;

    private boolean funcionSelectEjecutableIdBarrio = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdBarrio() {
        if (this.gestorBusquedaIdBarrio == null) {
            this.gestorBusquedaIdBarrio = new GestorBusquedaReferencia(
                    bean.getPersonaDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PersonaCachedRowSetDataProvider2.COLUMNA_ID_BARRIO,
                    this.funcionSelectEjecutableIdBarrio);
        }
        return this.gestorBusquedaIdBarrio;
    }

    protected FiltroBusqueda getFiltroBusquedaIdBarrio() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = bean.getPersonaDataProvider().getIdDistrito(rowKey);
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        this.getGestorBusquedaIdBarrio().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdBarrio1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdBarrio1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdBarrio1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdBarrio());
    }

    public String getScriptCampoIdBarrio1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getPersonaDataProvider().getIdBarrio(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdBarrio1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdBarrio1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isCampoIdBarrio1Panel2Rendered() {
        return isCampoIdBarrio1Boton2Rendered() && isGridIdBarrioRendered();
    }

    public boolean isTableColumnIdBarrio3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdBarrio1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaPersona">
    private GestorBusquedaReferencia gestorBusquedaIdFichaPersona = null;

    private boolean funcionSelectEjecutableIdFichaPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFichaPersona() {
        if (this.gestorBusquedaIdFichaPersona == null) {
            this.gestorBusquedaIdFichaPersona = new GestorBusquedaReferencia(
                    bean.getPersonaDataProvider(),
                    bean.getFichaPersonaReferenceDataProvider(),
                    PersonaCachedRowSetDataProvider2.COLUMNA_ID_FICHA_PERSONA,
                    this.funcionSelectEjecutableIdFichaPersona);
        }
        return this.gestorBusquedaIdFichaPersona;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFichaPersona() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        this.getGestorBusquedaIdFichaPersona().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFichaPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdFichaPersona(rowKey));
        }
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        return this.getGestorBusquedaIdFichaPersona().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFichaPersona1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaPersona().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFichaPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPersonaDataProvider().getIdFichaPersona(rowKey));
        }
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        return this.getGestorBusquedaIdFichaPersona().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFichaPersona1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FichaPersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_PERSONA;
        String campo = bean.getCampoIdFichaPersona1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FICHA_PERSONA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFichaPersona());
    }

    public String getScriptCampoIdFichaPersona1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FICHA_PERSONA;
        Long id = bean.getPersonaDataProvider().getIdFichaPersona(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFichaPersona1Boton2Rendered() {
        return bean == null ? true : bean.getFichaPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFichaPersona1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFichaPersona1Boton2Rendered();
    }

    public boolean isCampoIdFichaPersona1Panel2Rendered() {
        return isCampoIdFichaPersona1Boton2Rendered() && isGridIdFichaPersonaRendered();
    }

    public boolean isTableColumnIdFichaPersona3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFichaPersona1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroSexoPersona1() {
        return JSF.getListaOpciones(EnumSexoPersona.values(), true, false);
    }

    public Object getOpcionesListaNumeroEstadoCivil1() {
        return JSF.getListaOpciones(EnumEstadoCivil.values(), true, false);
    }

    public Object getOpcionesListaEsParaguayoNatural1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsIndigena1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoArea1() {
        return JSF.getListaOpciones(EnumTipoArea.values(), true, false);
    }

    public Object getOpcionesListaEsCertificadoVidaAnulado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsCerDefuncionAnulado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConEmpleo1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConJubilacion1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConPension1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConSubsidio1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConDeuda1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConPenaJudicial1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConCerVida1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConCartaRenuncia1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaElegibleParaPen1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaAcreditadaParaPen1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConCopiaCedula1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConDeclaracionJur1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroCondicionPension1() {
        return JSF.getListaOpciones(EnumCondicionPension.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaDenPension1() {
        return JSF.getListaOpciones(EnumCausaDenPension.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaRevPension1() {
        return JSF.getListaOpciones(EnumCausaRevPension.values(), true, false);
    }

    public Object getOpcionesListaNumeroCondicionRecoPen1() {
        return JSF.getListaOpciones(EnumCondicionRecoPen.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaDenRecoPen1() {
        return JSF.getListaOpciones(EnumCausaDenRecoPen.values(), true, false);
    }

    public Object getOpcionesListaNumeroCondicionDenuPen1() {
        return JSF.getListaOpciones(EnumCondicionDenuPen.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoActJupe1() {
        return JSF.getListaOpciones(EnumTipoActJupe.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroSexoPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSexoPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null;
    }

    public boolean isNumeroSexoPersonaMasculino() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null && value.equals(EnumSexoPersona.MASCULINO.intValue());
    }

    public boolean isNumeroSexoPersonaFemenino() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null && value.equals(EnumSexoPersona.FEMENINO.intValue());
    }

    public boolean isNullNumeroEstadoCivil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroEstadoCivil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null;
    }

    public boolean isNumeroEstadoCivilSoltero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.SOLTERO.intValue());
    }

    public boolean isNumeroEstadoCivilCasado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.CASADO.intValue());
    }

    public boolean isNumeroEstadoCivilViudo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.VIUDO.intValue());
    }

    public boolean isNumeroEstadoCivilDivorciado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.DIVORCIADO.intValue());
    }

   public boolean isEsParaguayoNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsParaguayoNatural(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParaguayoNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsParaguayoNatural(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsIndigena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsIndigena(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsIndigena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsIndigena(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoArea(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoArea(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAreaUrbana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.URBANA.intValue());
    }

    public boolean isNumeroTipoAreaRural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.RURAL.intValue());
    }

   public boolean isEsCertificadoVidaAnulado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsCertificadoVidaAnulado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsCertificadoVidaAnulado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsCertificadoVidaAnulado(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsCerDefuncionAnulado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsCerDefuncionAnulado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsCerDefuncionAnulado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsCerDefuncionAnulado(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConEmpleo(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConEmpleo(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConJubilacion(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConJubilacion(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConPension(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConPension(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConSubsidio(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConSubsidio(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConDeuda(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConDeuda(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConPenaJudicial(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConPenaJudicial(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConCerVida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCerVida(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConCerVida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCerVida(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConCartaRenuncia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCartaRenuncia(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConCartaRenuncia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCartaRenuncia(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaElegibleParaPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaElegibleParaPen(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaElegibleParaPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaElegibleParaPen(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaAcreditadaParaPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaAcreditadaParaPen(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaAcreditadaParaPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaAcreditadaParaPen(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConCopiaCedula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCopiaCedula(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConCopiaCedula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConCopiaCedula(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConDeclaracionJur() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConDeclaracionJur(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConDeclaracionJur() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getEsPersonaConDeclaracionJur(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroCondicionPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCondicionPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null;
    }

    public boolean isNumeroCondicionPensionSolicitada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.SOLICITADA.intValue());
    }

    public boolean isNumeroCondicionPensionAprobada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.APROBADA.intValue());
    }

    public boolean isNumeroCondicionPensionObjetada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.OBJETADA.intValue());
    }

    public boolean isNumeroCondicionPensionRevocada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.REVOCADA.intValue());
    }

    public boolean isNumeroCondicionPensionOtorgada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.OTORGADA.intValue());
    }

    public boolean isNumeroCondicionPensionDenegada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionPension(rowKey);
        return value != null && value.equals(EnumCondicionPension.DENEGADA.intValue());
    }

    public boolean isNullNumeroCausaDenPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaDenPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaDenPensionPersonaSinCvrVigente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_SIN_CVR_VIGENTE.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_FALLECIDA.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaNoEsNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_NO_ES_NATURAL.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaNoEsMayorDe65Anos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_NO_ES_MAYOR_DE_65_ANOS.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_EMPLEO.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_JUBILACION.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_DEUDA.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_PENA_JUDICIAL.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConOtraPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_OTRA_PENSION.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_SUBSIDIO.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaSinFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_SIN_FICHA_HOGAR.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConIcvMayorQue65() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_ICV_MAYOR_QUE_65.intValue());
    }

    public boolean isNumeroCausaDenPensionOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.OTRA_CAUSA.intValue());
    }

    public boolean isNullNumeroCausaRevPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaRevPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaRevPensionPersonaSePresumeFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_SE_PRESUME_FALLECIDA.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_FALLECIDA.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaNoEsNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_NO_ES_NATURAL.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaNoEsMayorDe65Anos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_NO_ES_MAYOR_DE_65_ANOS.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_EMPLEO.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_JUBILACION.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_DEUDA.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_PENA_JUDICIAL.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConOtraPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_OTRA_PENSION.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_SUBSIDIO.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaSinFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_SIN_FICHA_HOGAR.intValue());
    }

    public boolean isNumeroCausaRevPensionPersonaConIcvMayorQue65() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.PERSONA_CON_ICV_MAYOR_QUE_65.intValue());
    }

    public boolean isNumeroCausaRevPensionOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaRevPension(rowKey);
        return value != null && value.equals(EnumCausaRevPension.OTRA_CAUSA.intValue());
    }

    public boolean isNullNumeroCondicionRecoPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionRecoPen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCondicionRecoPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionRecoPen(rowKey);
        return value != null;
    }

    public boolean isNumeroCondicionRecoPenSolicitada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionRecoPen(rowKey);
        return value != null && value.equals(EnumCondicionRecoPen.SOLICITADA.intValue());
    }

    public boolean isNumeroCondicionRecoPenAprobada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionRecoPen(rowKey);
        return value != null && value.equals(EnumCondicionRecoPen.APROBADA.intValue());
    }

    public boolean isNumeroCondicionRecoPenDenegada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionRecoPen(rowKey);
        return value != null && value.equals(EnumCondicionRecoPen.DENEGADA.intValue());
    }

    public boolean isNullNumeroCausaDenRecoPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaDenRecoPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaDenRecoPenPersonaSinCvrVigente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_SIN_CVR_VIGENTE.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_FALLECIDA.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaNoEsNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_NO_ES_NATURAL.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaNoEsMayorDe65Anos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_NO_ES_MAYOR_DE_65_ANOS.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_EMPLEO.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_JUBILACION.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_DEUDA.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_PENA_JUDICIAL.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConOtraPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_OTRA_PENSION.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_SUBSIDIO.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaSinFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_SIN_FICHA_HOGAR.intValue());
    }

    public boolean isNumeroCausaDenRecoPenPersonaConIcvMayorQue65() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.PERSONA_CON_ICV_MAYOR_QUE_65.intValue());
    }

    public boolean isNumeroCausaDenRecoPenOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCausaDenRecoPen(rowKey);
        return value != null && value.equals(EnumCausaDenRecoPen.OTRA_CAUSA.intValue());
    }

    public boolean isNullNumeroCondicionDenuPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionDenuPen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCondicionDenuPen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionDenuPen(rowKey);
        return value != null;
    }

    public boolean isNumeroCondicionDenuPenRegistrada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionDenuPen(rowKey);
        return value != null && value.equals(EnumCondicionDenuPen.REGISTRADA.intValue());
    }

    public boolean isNumeroCondicionDenuPenConfirmada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionDenuPen(rowKey);
        return value != null && value.equals(EnumCondicionDenuPen.CONFIRMADA.intValue());
    }

    public boolean isNumeroCondicionDenuPenDesmentida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroCondicionDenuPen(rowKey);
        return value != null && value.equals(EnumCondicionDenuPen.DESMENTIDA.intValue());
    }

    public boolean isNullNumeroTipoActJupe() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoActJupe(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoActJupe() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoActJupe(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoActJupeAgregarPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoActJupe(rowKey);
        return value != null && value.equals(EnumTipoActJupe.AGREGAR_PENSION.intValue());
    }

    public boolean isNumeroTipoActJupeRevocarPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPersonaDataProvider().getNumeroTipoActJupe(rowKey);
        return value != null && value.equals(EnumTipoActJupe.REVOCAR_PENSION.intValue());
    }

    public boolean isGridIdPersonaRendered() {
        return true;
    }

    public boolean isGridCodigoPersonaRendered() {
        return true;
    }

    public boolean isGridNombrePersonaRendered() {
        return true;
    }

    public boolean isGridNumeroCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCedulaRendered();
    }

    public boolean isGridLetraCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCedulaRendered();
    }

    public boolean isGridFechaExpedicionCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCedulaRendered();
    }

    public boolean isGridFechaVencimientoCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCedulaRendered();
    }

    public boolean isGridPrimerNombreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridSegundoNombreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridPrimerApellidoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridSegundoApellidoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridApellidoCasadaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridApodoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridFechaNacimientoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridNumeroSexoPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridNumeroEstadoCivilRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridEsParaguayoNaturalRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOrigenRendered();
    }

    public boolean isGridEsIndigenaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOrigenRendered();
    }

    public boolean isGridIdEtniaIndigenaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOrigenRendered();
    }

    public boolean isGridNombreComunidadIndigenaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOrigenRendered();
    }

    public boolean isGridIdDepartamentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridIdDistritoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridNumeroTipoAreaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridIdBarrioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridDireccionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridNumeroTelefonoLineaBajaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridNumeroTelefonoCelularRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaModificada() && isSeccionContactoRendered();
    }

    public boolean isGridCertificadoVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridFechaCertificadoVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridEsCertificadoVidaAnuladoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridComentariosAnulCerVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridCertificadoDefuncionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridFechaCertificadoDefuncionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridEsCerDefuncionAnuladoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridComentariosAnulCerDefuncionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRegistroRendered();
    }

    public boolean isGridEsPersonaConEmpleoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConJubilacionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConSubsidioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConDeudaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConPenaJudicialRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConCerVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConCartaRenunciaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaElegibleParaPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaAcreditadaParaPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConCopiaCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridEsPersonaConDeclaracionJurRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension1Rendered();
    }

    public boolean isGridMontoPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridNumeroCondicionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridFechaSolicitudPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridComentariosSolicitudPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridFechaAprobacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridComentariosAprobacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridFechaOtorgamientoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridNumeroResolucionOtorPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridFechaResolucionOtorPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridComentariosOtorgamientoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension2Rendered();
    }

    public boolean isGridFechaObjecionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridNumeroCausaDenPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridOtraCausaDenPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridComentariosObjecionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridFechaDenegacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridNumeroResolucionDenPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridFechaResolucionDenPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridComentariosDenegacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridFechaRevocacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridNumeroCausaRevPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridOtraCausaRevPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridComentariosRevocacionPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension3Rendered();
    }

    public boolean isGridNumeroCondicionRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridFechaSolicitudRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridComentariosSolicitudRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridFechaAprobacionRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridComentariosAprRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridFechaDenegacionRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridNumeroCausaDenRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridOtraCausaDenRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridComentariosDenRecoPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension4Rendered();
    }

    public boolean isGridNumeroCondicionDenuPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridFechaRegistroDenunciaPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridComentariosRegistroDenuPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridFechaConfirmacionDenuPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridComentariosConfDenuPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridFechaDesmentidoDenunciaPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridComentariosDesDenuPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPension5Rendered();
    }

    public boolean isGridIdFichaPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridFechaFichaPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridIndiceCalidadVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridFechaUltimoCobroPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridNotasAnulFecUltCobPenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridNumeroTipoActJupeRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridFechaHoraUltActJupeRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridLoteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridCodigoSimeRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isSeccionCedulaRendered() {
        return true;
    }

    public boolean isSeccionCedulaHidden() {
        return !isSeccionCedulaRendered();
    }

    public boolean isSeccionIdentificacionRendered() {
        return true;
    }

    public boolean isSeccionIdentificacionHidden() {
        return !isSeccionIdentificacionRendered();
    }

    public boolean isSeccionOrigenRendered() {
        return true;
    }

    public boolean isSeccionOrigenHidden() {
        return !isSeccionOrigenRendered();
    }

    public boolean isSeccionContactoRendered() {
        return true;
    }

    public boolean isSeccionContactoHidden() {
        return !isSeccionContactoRendered();
    }

    public boolean isSeccionRegistroRendered() {
        return true;
    }

    public boolean isSeccionRegistroHidden() {
        return !isSeccionRegistroRendered();
    }

    public boolean isSeccionPension1Rendered() {
        return true;
    }

    public boolean isSeccionPension1Hidden() {
        return !isSeccionPension1Rendered();
    }

    public boolean isSeccionPension2Rendered() {
        return true;
    }

    public boolean isSeccionPension2Hidden() {
        return !isSeccionPension2Rendered();
    }

    public boolean isSeccionPension3Rendered() {
        return true;
    }

    public boolean isSeccionPension3Hidden() {
        return !isSeccionPension3Rendered();
    }

    public boolean isSeccionPension4Rendered() {
        return true;
    }

    public boolean isSeccionPension4Hidden() {
        return !isSeccionPension4Rendered();
    }

    public boolean isSeccionPension5Rendered() {
        return true;
    }

    public boolean isSeccionPension5Hidden() {
        return !isSeccionPension5Rendered();
    }

    public boolean isSeccionOtrosRendered() {
        return true;
    }

    public boolean isSeccionOtrosHidden() {
        return !isSeccionOtrosRendered();
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private PersonaBusinessProcessLocal getPersonaBusinessProcess() {
        return (PersonaBusinessProcessLocal) bean.getPersonaBusinessProcess();
    }

    private BusinessProcessMessengerLocal getMessenger() {
        return (BusinessProcessMessengerLocal) bean.getMessenger();
    }

    private ReporterBrokerLocal getReporter() {
        return (ReporterBrokerLocal) bean.getReporter();
    }

    private AbstractMessage requestReply(AbstractMessage message) throws Exception {
        ObjectMessage solicitud = this.getMessenger().postRequest(message);
        ObjectMessage respuesta = this.getMessenger().receiveReply(solicitud);
        AbstractMessage mensaje = respuesta == null
                ? (AbstractMessage) solicitud.getObject()
                : (AbstractMessage) respuesta.getObject();
        /**/
        TLC.getBitacora().add(mensaje);
        return mensaje;
    }
}
