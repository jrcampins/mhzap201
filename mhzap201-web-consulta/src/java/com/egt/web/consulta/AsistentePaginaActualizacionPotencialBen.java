/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.consulta;

import com.egt.base.enums.EnumTipoRegPotBen;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.enums.EnumTipoArea;
import com.egt.base.enums.EnumCondicionCenso;
import com.egt.base.enums.EnumCausaInvCenso;
import com.egt.base.enums.EnumCondicionReclCen;
import com.egt.base.enums.EnumCausaDenReclCen;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
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
import com.egt.ejb.business.message.DesactivarPotencialBenMessage;
import com.egt.ejb.business.message.ReactivarPotencialBenMessage;
import com.egt.ejb.business.message.AcreditarPotencialBenMessage;
import com.egt.ejb.business.process.PotencialBenBusinessProcessLocal;
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

public class AsistentePaginaActualizacionPotencialBen {

    private PaginaActualizacionPotencialBen bean;

    public AsistentePaginaActualizacionPotencialBen() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionPotencialBen(PaginaActualizacionPotencialBen bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_MODIFICAR_POTENCIAL_BEN, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
        //  new Option("", etiquetaSeleccioneUnaOpcion),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_DESACTIVAR_POTENCIAL_BEN, BundleWebui.getString("desactivar_potencial_ben")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_REACTIVAR_POTENCIAL_BEN, BundleWebui.getString("reactivar_potencial_ben")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_ACREDITAR_POTENCIAL_BEN, BundleWebui.getString("acreditar_potencial_ben")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN, BundleWebui.getString("emitir_constancia_registro_potencial_ben")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR, BundleWebui.getString("emitir_potencial_ben_por_censar")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR, BundleWebui.getString("emitir_potencial_ben_por_validar")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION, BundleWebui.getString("emitir_potencial_ben_por_resultado_validacion")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV, BundleWebui.getString("emitir_potencial_ben_por_icv")),
        //  new Option(PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO, BundleWebui.getString("emitir_potencial_ben_acreditado"))
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
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_DESACTIVAR_POTENCIAL_BEN) {
            this.desactivarPotencialBen(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_REACTIVAR_POTENCIAL_BEN) {
            this.reactivarPotencialBen(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_ACREDITAR_POTENCIAL_BEN) {
            this.acreditarPotencialBen(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN) {
            this.emitirConstanciaRegistroPotencialBen(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR) {
            this.emitirPotencialBenPorCensar(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR) {
            this.emitirPotencialBenPorValidar(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION) {
            this.emitirPotencialBenPorResultadoValidacion(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV) {
            this.emitirPotencialBenPorIcv(rowKey);
        } else if (f == PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO) {
            this.emitirPotencialBenAcreditado(rowKey);
        }
    }

    private boolean desactivarPotencialBen(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "desactivarPotencialBen", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idPotencialBen = bean.getPotencialBenDataProvider().getIdPotencialBen(rowKey);
        DesactivarPotencialBenMessage message = new DesactivarPotencialBenMessage(idPotencialBen);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getPotencialBenBusinessProcess().desactivarPotencialBen(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean reactivarPotencialBen(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "reactivarPotencialBen", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idPotencialBen = bean.getPotencialBenDataProvider().getIdPotencialBen(rowKey);
        ReactivarPotencialBenMessage message = new ReactivarPotencialBenMessage(idPotencialBen);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getPotencialBenBusinessProcess().reactivarPotencialBen(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean acreditarPotencialBen(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "acreditarPotencialBen", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idPotencialBen = bean.getPotencialBenDataProvider().getIdPotencialBen(rowKey);
        AcreditarPotencialBenMessage message = new AcreditarPotencialBenMessage(idPotencialBen);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getPotencialBenBusinessProcess().acreditarPotencialBen(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean emitirConstanciaRegistroPotencialBen(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirConstanciaRegistroPotencialBen", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idPotencialBen = bean.getPotencialBenDataProvider().getIdPotencialBen(rowKey);
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN;
        Map parameters = new LinkedHashMap();
        parameters.put("id_potencial_ben", idPotencialBen);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
        String search = "";
        ArrayList args = new ArrayList();
        if (idPotencialBen != null) {
            args.add(idPotencialBen);
            search += " and id_potencial_ben=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPotencialBenPorCensar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPotencialBenPorCensar", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Integer numeroTipoArea = null;
        Date fechaRegistroPotBenDesde = null;
        Date fechaRegistroPotBenHasta = null;
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("numero_tipo_area", numeroTipoArea);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (numeroTipoArea != null) {
            args.add(numeroTipoArea);
            search += " and numero_tipo_area=?";
        }
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPotencialBenPorValidar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPotencialBenPorValidar", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Integer numeroTipoArea = null;
        Date fechaRegistroPotBenDesde = null;
        Date fechaRegistroPotBenHasta = null;
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("numero_tipo_area", numeroTipoArea);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (numeroTipoArea != null) {
            args.add(numeroTipoArea);
            search += " and numero_tipo_area=?";
        }
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPotencialBenPorResultadoValidacion(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPotencialBenPorResultadoValidacion", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Integer numeroTipoArea = null;
        Date fechaRegistroPotBenDesde = null;
        Date fechaRegistroPotBenHasta = null;
        BigDecimal indiceCalidadVidaDesde = null;
        BigDecimal indiceCalidadVidaHasta = null;
        Date fechaValidacionCensoDesde = null;
        Date fechaValidacionCensoHasta = null;
        Integer numeroCondicionCenso = null;
        Long idFuncionarioValidacionCen = null;
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("numero_tipo_area", numeroTipoArea);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("indice_calidad_vida_desde", indiceCalidadVidaDesde);
        parameters.put("indice_calidad_vida_hasta", indiceCalidadVidaHasta);
        parameters.put("fecha_validacion_censo_desde", fechaValidacionCensoDesde);
        parameters.put("fecha_validacion_censo_hasta", fechaValidacionCensoHasta);
        parameters.put("numero_condicion_censo", numeroCondicionCenso);
        parameters.put("id_funcionario_validacion_cen", idFuncionarioValidacionCen);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (numeroTipoArea != null) {
            args.add(numeroTipoArea);
            search += " and numero_tipo_area=?";
        }
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (indiceCalidadVidaDesde != null) {
            args.add(indiceCalidadVidaDesde);
            search += " and indice_calidad_vida>=?";
        }
        if (indiceCalidadVidaHasta != null) {
            args.add(indiceCalidadVidaHasta);
            search += " and indice_calidad_vida<=?";
        }
        if (fechaValidacionCensoDesde != null) {
            args.add(fechaValidacionCensoDesde);
            search += " and fecha_validacion_censo>=?";
        }
        if (fechaValidacionCensoHasta != null) {
            args.add(fechaValidacionCensoHasta);
            search += " and fecha_validacion_censo<=?";
        }
        if (numeroCondicionCenso != null) {
            args.add(numeroCondicionCenso);
            search += " and numero_condicion_censo=?";
        }
        if (idFuncionarioValidacionCen != null) {
            args.add(idFuncionarioValidacionCen);
            search += " and id_funcionario_validacion_cen=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPotencialBenPorIcv(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPotencialBenPorIcv", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Integer numeroTipoArea = null;
        Date fechaRegistroPotBenDesde = null;
        Date fechaRegistroPotBenHasta = null;
        BigDecimal indiceCalidadVidaDesde = null;
        BigDecimal indiceCalidadVidaHasta = null;
        Integer numeroCondicionCenso = null;
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("numero_tipo_area", numeroTipoArea);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("indice_calidad_vida_desde", indiceCalidadVidaDesde);
        parameters.put("indice_calidad_vida_hasta", indiceCalidadVidaHasta);
        parameters.put("numero_condicion_censo", numeroCondicionCenso);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (numeroTipoArea != null) {
            args.add(numeroTipoArea);
            search += " and numero_tipo_area=?";
        }
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (indiceCalidadVidaDesde != null) {
            args.add(indiceCalidadVidaDesde);
            search += " and indice_calidad_vida>=?";
        }
        if (indiceCalidadVidaHasta != null) {
            args.add(indiceCalidadVidaHasta);
            search += " and indice_calidad_vida<=?";
        }
        if (numeroCondicionCenso != null) {
            args.add(numeroCondicionCenso);
            search += " and numero_condicion_censo=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.getReporter().executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.getReporter().executeReport(report, function);
        }
        return true;
    }

    private boolean emitirPotencialBenAcreditado(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirPotencialBenAcreditado", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
        Long idDepartamento = null;
        Long idDistrito = null;
        Long idBarrio = null;
        Integer numeroTipoArea = null;
        Date fechaRegistroPotBenDesde = null;
        Date fechaRegistroPotBenHasta = null;
        Integer numeroTipoRegPotBen = null;
        String report = PotencialBenCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO;
        long function = PotencialBenCachedRowSetDataProvider2.FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("numero_tipo_area", numeroTipoArea);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("numero_tipo_reg_pot_ben", numeroTipoRegPotBen);
//      ------------------------------------------------------------------------
//      this.getReporter().executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (numeroTipoArea != null) {
            args.add(numeroTipoArea);
            search += " and numero_tipo_area=?";
        }
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (numeroTipoRegPotBen != null) {
            args.add(numeroTipoRegPotBen);
            search += " and numero_tipo_reg_pot_ben=?";
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
//      String urx = URX2.COMANDO_POTENCIAL_BEN;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private GestorBusquedaReferencia gestorBusquedaIdPersona = null;

    private boolean funcionSelectEjecutableIdPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPersona() {
        if (this.gestorBusquedaIdPersona == null) {
            this.gestorBusquedaIdPersona = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_PERSONA,
                    this.funcionSelectEjecutableIdPersona);
        }
        return this.gestorBusquedaIdPersona;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPersona() {
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

    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        this.getGestorBusquedaIdPersona().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdPersona(rowKey));
        }
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        return this.getGestorBusquedaIdPersona().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPersona1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPersona().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdPersona(rowKey));
        }
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        return this.getGestorBusquedaIdPersona().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPersona1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PERSONA;
        String campo = bean.getCampoIdPersona1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.TABLA_PERSONA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPersona());
    }

    public String getScriptCampoIdPersona1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PERSONA;
        Long id = bean.getPotencialBenDataProvider().getIdPersona(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdPersona1Boton2Rendered() {
        return bean == null ? true : bean.getPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPersona1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPersona1Boton2Rendered();
    }

    public boolean isCampoIdPersona1Panel2Rendered() {
        return isCampoIdPersona1Boton2Rendered() && isGridIdPersonaRendered();
    }

    public boolean isTableColumnIdPersona3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPersona1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idEtniaIndigena">
    private GestorBusquedaReferencia gestorBusquedaIdEtniaIndigena = null;

    private boolean funcionSelectEjecutableIdEtniaIndigena = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdEtniaIndigena() {
        if (this.gestorBusquedaIdEtniaIndigena == null) {
            this.gestorBusquedaIdEtniaIndigena = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getEtniaIndigenaReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_ETNIA_INDIGENA,
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdEtniaIndigena(rowKey));
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdEtniaIndigena(rowKey));
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
        Long id = bean.getPotencialBenDataProvider().getIdEtniaIndigena(rowKey);
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
                    bean.getPotencialBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO,
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdDepartamento(rowKey));
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdDepartamento(rowKey));
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
        Long id = bean.getPotencialBenDataProvider().getIdDepartamento(rowKey);
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
                    bean.getPotencialBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO,
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
        valor = bean.getPotencialBenDataProvider().getIdDepartamento(rowKey);
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdDistrito(rowKey));
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdDistrito(rowKey));
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
        Long id = bean.getPotencialBenDataProvider().getIdDistrito(rowKey);
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
                    bean.getPotencialBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_BARRIO,
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
        valor = bean.getPotencialBenDataProvider().getIdDistrito(rowKey);
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdBarrio(rowKey));
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdBarrio(rowKey));
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
        Long id = bean.getPotencialBenDataProvider().getIdBarrio(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioValidacionCen">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioValidacionCen = null;

    private boolean funcionSelectEjecutableIdFuncionarioValidacionCen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioValidacionCen() {
        if (this.gestorBusquedaIdFuncionarioValidacionCen == null) {
            this.gestorBusquedaIdFuncionarioValidacionCen = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN,
                    this.funcionSelectEjecutableIdFuncionarioValidacionCen);
        }
        return this.gestorBusquedaIdFuncionarioValidacionCen;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioValidacionCen() {
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

    public void campoIdFuncionarioValidacionCen1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioValidacionCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioValidacionCen());
        this.getGestorBusquedaIdFuncionarioValidacionCen().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioValidacionCen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdFuncionarioValidacionCen(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioValidacionCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioValidacionCen());
        return this.getGestorBusquedaIdFuncionarioValidacionCen().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioValidacionCen1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioValidacionCen().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioValidacionCen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdFuncionarioValidacionCen(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioValidacionCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioValidacionCen());
        return this.getGestorBusquedaIdFuncionarioValidacionCen().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioValidacionCen1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioValidacionCen1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioValidacionCen());
    }

    public String getScriptCampoIdFuncionarioValidacionCen1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getPotencialBenDataProvider().getIdFuncionarioValidacionCen(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioValidacionCen1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioValidacionCen1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioValidacionCen1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioValidacionCen1Panel2Rendered() {
        return isCampoIdFuncionarioValidacionCen1Boton2Rendered() && isGridIdFuncionarioValidacionCenRendered();
    }

    public boolean isTableColumnIdFuncionarioValidacionCen3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioValidacionCen1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaPersona">
    private GestorBusquedaReferencia gestorBusquedaIdFichaPersona = null;

    private boolean funcionSelectEjecutableIdFichaPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFichaPersona() {
        if (this.gestorBusquedaIdFichaPersona == null) {
            this.gestorBusquedaIdFichaPersona = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getFichaPersonaReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_FICHA_PERSONA,
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdFichaPersona(rowKey));
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
            return STP.getString(bean.getPotencialBenDataProvider().getIdFichaPersona(rowKey));
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
        Long id = bean.getPotencialBenDataProvider().getIdFichaPersona(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuarioRegPotBen">
    private GestorBusquedaReferencia gestorBusquedaIdUsuarioRegPotBen = null;

    private boolean funcionSelectEjecutableIdUsuarioRegPotBen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuarioRegPotBen() {
        if (this.gestorBusquedaIdUsuarioRegPotBen == null) {
            this.gestorBusquedaIdUsuarioRegPotBen = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_USUARIO_REG_POT_BEN,
                    this.funcionSelectEjecutableIdUsuarioRegPotBen);
        }
        return this.gestorBusquedaIdUsuarioRegPotBen;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuarioRegPotBen() {
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

    public void campoIdUsuarioRegPotBen1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioRegPotBen().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioRegPotBen());
        this.getGestorBusquedaIdUsuarioRegPotBen().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuarioRegPotBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdUsuarioRegPotBen(rowKey));
        }
        this.getGestorBusquedaIdUsuarioRegPotBen().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioRegPotBen());
        return this.getGestorBusquedaIdUsuarioRegPotBen().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuarioRegPotBen1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioRegPotBen().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuarioRegPotBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdUsuarioRegPotBen(rowKey));
        }
        this.getGestorBusquedaIdUsuarioRegPotBen().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioRegPotBen());
        return this.getGestorBusquedaIdUsuarioRegPotBen().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuarioRegPotBen1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuarioRegPotBen1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuarioRegPotBen());
    }

    public String getScriptCampoIdUsuarioRegPotBen1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_USUARIO;
        Long id = bean.getPotencialBenDataProvider().getIdUsuarioRegPotBen(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuarioRegPotBen1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuarioRegPotBen1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuarioRegPotBen1Boton2Rendered();
    }

    public boolean isCampoIdUsuarioRegPotBen1Panel2Rendered() {
        return isCampoIdUsuarioRegPotBen1Boton2Rendered() && isGridIdUsuarioRegPotBenRendered();
    }

    public boolean isTableColumnIdUsuarioRegPotBen3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuarioRegPotBen1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioUltVisitaCen">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioUltVisitaCen = null;

    private boolean funcionSelectEjecutableIdFuncionarioUltVisitaCen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioUltVisitaCen() {
        if (this.gestorBusquedaIdFuncionarioUltVisitaCen == null) {
            this.gestorBusquedaIdFuncionarioUltVisitaCen = new GestorBusquedaReferencia(
                    bean.getPotencialBenDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    PotencialBenCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN,
                    this.funcionSelectEjecutableIdFuncionarioUltVisitaCen);
        }
        return this.gestorBusquedaIdFuncionarioUltVisitaCen;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioUltVisitaCen() {
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

    public void campoIdFuncionarioUltVisitaCen1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioUltVisitaCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioUltVisitaCen());
        this.getGestorBusquedaIdFuncionarioUltVisitaCen().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioUltVisitaCen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdFuncionarioUltVisitaCen(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioUltVisitaCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioUltVisitaCen());
        return this.getGestorBusquedaIdFuncionarioUltVisitaCen().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioUltVisitaCen1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioUltVisitaCen().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioUltVisitaCen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPotencialBenDataProvider().getIdFuncionarioUltVisitaCen(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioUltVisitaCen().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioUltVisitaCen());
        return this.getGestorBusquedaIdFuncionarioUltVisitaCen().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioUltVisitaCen1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioUltVisitaCen1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioUltVisitaCen());
    }

    public String getScriptCampoIdFuncionarioUltVisitaCen1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getPotencialBenDataProvider().getIdFuncionarioUltVisitaCen(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioUltVisitaCen1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioUltVisitaCen1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioUltVisitaCen1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioUltVisitaCen1Panel2Rendered() {
        return isCampoIdFuncionarioUltVisitaCen1Boton2Rendered() && isGridIdFuncionarioUltVisitaCenRendered();
    }

    public boolean isTableColumnIdFuncionarioUltVisitaCen3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioUltVisitaCen1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoRegPotBen1() {
        return JSF.getListaOpciones(EnumTipoRegPotBen.values(), true, false);
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

    public Object getOpcionesListaEsPersonaConJubilacion1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConPension1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonaConSubsidio1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroCondicionCenso1() {
        return JSF.getListaOpciones(EnumCondicionCenso.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaInvCenso1() {
        return JSF.getListaOpciones(EnumCausaInvCenso.values(), true, false);
    }

    public Object getOpcionesListaNumeroCondicionReclCen1() {
        return JSF.getListaOpciones(EnumCondicionReclCen.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaDenReclCen1() {
        return JSF.getListaOpciones(EnumCausaDenReclCen.values(), true, false);
    }

    public Object getOpcionesListaEsPotencialBenInactivo1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPotencialBenMigrado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoRegPotBen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoRegPotBen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoRegPotBen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoRegPotBen(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoRegPotBenConCedula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoRegPotBen(rowKey);
        return value != null && value.equals(EnumTipoRegPotBen.CON_CEDULA.intValue());
    }

    public boolean isNumeroTipoRegPotBenSinCedula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoRegPotBen(rowKey);
        return value != null && value.equals(EnumTipoRegPotBen.SIN_CEDULA.intValue());
    }

   public boolean isEsParaguayoNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsParaguayoNatural(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParaguayoNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsParaguayoNatural(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsIndigena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsIndigena(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsIndigena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsIndigena(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoArea(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoArea(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAreaUrbana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.URBANA.intValue());
    }

    public boolean isNumeroTipoAreaRural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.RURAL.intValue());
    }

   public boolean isEsPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConJubilacion(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConJubilacion(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConPension(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConPension(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConSubsidio(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPersonaConSubsidio(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroCondicionCenso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCondicionCenso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null;
    }

    public boolean isNumeroCondicionCensoPorCensar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null && value.equals(EnumCondicionCenso.POR_CENSAR.intValue());
    }

    public boolean isNumeroCondicionCensoPorValidar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null && value.equals(EnumCondicionCenso.POR_VALIDAR.intValue());
    }

    public boolean isNumeroCondicionCensoValidado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null && value.equals(EnumCondicionCenso.VALIDADO.intValue());
    }

    public boolean isNumeroCondicionCensoInvalidado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null && value.equals(EnumCondicionCenso.INVALIDADO.intValue());
    }

    public boolean isNumeroCondicionCensoCensado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionCenso(rowKey);
        return value != null && value.equals(EnumCondicionCenso.CENSADO.intValue());
    }

    public boolean isNullNumeroCausaInvCenso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaInvCenso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaInvCensoBeneficiarioDesconocido() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value != null && value.equals(EnumCausaInvCenso.BENEFICIARIO_DESCONOCIDO.intValue());
    }

    public boolean isNumeroCausaInvCensoBenficiarioFallecido() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value != null && value.equals(EnumCausaInvCenso.BENFICIARIO_FALLECIDO.intValue());
    }

    public boolean isNumeroCausaInvCensoIcvNoCorresponde() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value != null && value.equals(EnumCausaInvCenso.ICV_NO_CORRESPONDE.intValue());
    }

    public boolean isNumeroCausaInvCensoOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaInvCenso(rowKey);
        return value != null && value.equals(EnumCausaInvCenso.OTRA_CAUSA.intValue());
    }

    public boolean isNullNumeroCondicionReclCen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionReclCen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCondicionReclCen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionReclCen(rowKey);
        return value != null;
    }

    public boolean isNumeroCondicionReclCenRegistrado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionReclCen(rowKey);
        return value != null && value.equals(EnumCondicionReclCen.REGISTRADO.intValue());
    }

    public boolean isNumeroCondicionReclCenAprobado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionReclCen(rowKey);
        return value != null && value.equals(EnumCondicionReclCen.APROBADO.intValue());
    }

    public boolean isNumeroCondicionReclCenDenegado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCondicionReclCen(rowKey);
        return value != null && value.equals(EnumCondicionReclCen.DENEGADO.intValue());
    }

    public boolean isNullNumeroCausaDenReclCen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaDenReclCen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaDenReclCen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaDenReclCen(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaDenReclCenOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getNumeroCausaDenReclCen(rowKey);
        return value != null && value.equals(EnumCausaDenReclCen.OTRA_CAUSA.intValue());
    }

   public boolean isEsPotencialBenInactivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPotencialBenInactivo(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPotencialBenInactivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPotencialBenInactivo(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPotencialBenMigrado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPotencialBenMigrado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPotencialBenMigrado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPotencialBenDataProvider().getEsPotencialBenMigrado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdPotencialBenRendered() {
        return true;
    }

    public boolean isGridCodigoPotencialBenRendered() {
        return true;
    }

    public boolean isGridNombrePotencialBenRendered() {
        return true;
    }

    public boolean isGridNumeroTipoRegPotBenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaCreada() && isSeccionGeneralRendered();
    }

    public boolean isGridFechaRegistroPotBenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionGeneralRendered();
    }

    public boolean isGridIdUsuarioRegPotBenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionGeneralRendered();
    }

    public boolean isGridEsPotencialBenInactivoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionGeneralRendered();
    }

    public boolean isGridEsPotencialBenMigradoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionGeneralRendered();
    }

    public boolean isGridIdPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCedulaRendered();
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
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
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
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridApellidoCasadaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridApodoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridFechaNacimientoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIdentificacionRendered();
    }

    public boolean isGridEdadRendered() {
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
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridIdDistritoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridNumeroTipoAreaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridIdBarrioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridManzanaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridCompaniaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridDireccionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridReferenciaDireccionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionContactoRendered();
    }

    public boolean isGridEsPersonaConJubilacionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPensionRendered();
    }

    public boolean isGridEsPersonaConPensionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPensionRendered();
    }

    public boolean isGridEsPersonaConSubsidioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPensionRendered();
    }

    public boolean isGridNombreResponsableHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionHogarRendered();
    }

    public boolean isGridNumeroTelefonoRespHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionHogarRendered();
    }

    public boolean isGridNombreReferenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReferenciaRendered();
    }

    public boolean isGridNumeroTelefonoReferenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReferenciaRendered();
    }

    public boolean isGridNumeroCondicionCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridFechaValidacionCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridIdFuncionarioValidacionCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridNumeroCausaInvCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridOtraCausaInvCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridComentariosValidacionCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridIdFichaPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridIndiceCalidadVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionCensoRendered();
    }

    public boolean isGridNumeroCondicionReclCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridFechaReclamoCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridComentariosReclamoCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridFechaAprobacionReclamoCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridComentariosAprReclCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridFechaDenegacionReclamoCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridNumeroCausaDenReclCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridOtraCausaDenReclCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridComentariosDenReclCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionReclamoRendered();
    }

    public boolean isGridFechaUltimaVisitaCensoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVisitaRendered();
    }

    public boolean isGridObservacionesUltVisitaCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVisitaRendered();
    }

    public boolean isGridIdFuncionarioUltVisitaCenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVisitaRendered();
    }

    public boolean isSeccionGeneralRendered() {
        return true;
    }

    public boolean isSeccionGeneralHidden() {
        return !isSeccionGeneralRendered();
    }

    public boolean isSeccionCedulaRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNumeroTipoRegPotBenConCedula();
        return b;
    }

    public boolean isSeccionCedulaHidden() {
        return !isSeccionCedulaRendered();
    }

    public boolean isSeccionIdentificacionRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNumeroTipoRegPotBenSinCedula();
        return b;
    }

    public boolean isSeccionIdentificacionHidden() {
        return !isSeccionIdentificacionRendered();
    }

    public boolean isSeccionOrigenRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNumeroTipoRegPotBenSinCedula();
        return b;
    }

    public boolean isSeccionOrigenHidden() {
        return !isSeccionOrigenRendered();
    }

    public boolean isSeccionContactoRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNotNullNumeroTipoRegPotBen();
        return b;
    }

    public boolean isSeccionContactoHidden() {
        return !isSeccionContactoRendered();
    }

    public boolean isSeccionPensionRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNotNullNumeroTipoRegPotBen();
        return b;
    }

    public boolean isSeccionPensionHidden() {
        return !isSeccionPensionRendered();
    }

    public boolean isSeccionHogarRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNotNullNumeroTipoRegPotBen();
        return b;
    }

    public boolean isSeccionHogarHidden() {
        return !isSeccionHogarRendered();
    }

    public boolean isSeccionReferenciaRendered() {
        if (bean == null) {
            return true;
        }
        boolean b = true;
        b &= isNotNullNumeroTipoRegPotBen();
        return b;
    }

    public boolean isSeccionReferenciaHidden() {
        return !isSeccionReferenciaRendered();
    }

    public boolean isSeccionCensoRendered() {
        return true;
    }

    public boolean isSeccionCensoHidden() {
        return !isSeccionCensoRendered();
    }

    public boolean isSeccionReclamoRendered() {
        return true;
    }

    public boolean isSeccionReclamoHidden() {
        return !isSeccionReclamoRendered();
    }

    public boolean isSeccionVisitaRendered() {
        return true;
    }

    public boolean isSeccionVisitaHidden() {
        return !isSeccionVisitaRendered();
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private PotencialBenBusinessProcessLocal getPotencialBenBusinessProcess() {
        return (PotencialBenBusinessProcessLocal) bean.getPotencialBenBusinessProcess();
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
