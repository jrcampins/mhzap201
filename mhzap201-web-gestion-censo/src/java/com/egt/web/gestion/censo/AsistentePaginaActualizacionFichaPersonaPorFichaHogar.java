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
package com.egt.web.gestion.censo;

import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.enums.EnumSexoPersona;
import com.egt.base.enums.EnumEstadoCivil;
import com.egt.base.enums.EnumTipoPersonaHogar;
import com.egt.base.enums.EnumSiono;
import com.egt.base.enums.EnumTipoExcepcionCed;
import com.egt.base.enums.EnumTipoArea;
import com.egt.base.enums.EnumIdiomaHogar;
import com.egt.base.enums.EnumMotivoInaEsc;
import com.egt.base.enums.EnumNivelEducativo;
import com.egt.base.enums.EnumTipoSeguroMedico;
import com.egt.base.enums.EnumEstadoSalud;
import com.egt.base.enums.EnumClaseEnfAcc;
import com.egt.base.enums.EnumClaseEnfCronica;
import com.egt.base.enums.EnumMotivoNoAtencion;
import com.egt.base.enums.EnumClaseImpedimento;
import com.egt.base.enums.EnumCausaImpedimento;
import com.egt.base.enums.EnumMotivoNoTrabajo;
import com.egt.base.enums.EnumTipoRelacionLab;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
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
import com.egt.ejb.business.message.DesvincularFichaPersonaMessage;
import com.egt.ejb.business.process.FichaPersonaBusinessProcessLocal;
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

public class AsistentePaginaActualizacionFichaPersonaPorFichaHogar {

    private PaginaActualizacionFichaPersonaPorFichaHogar bean;

    public AsistentePaginaActualizacionFichaPersonaPorFichaHogar() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionFichaPersonaPorFichaHogar(PaginaActualizacionFichaPersonaPorFichaHogar bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(FichaPersonaCachedRowSetDataProvider2.FUNCION_MODIFICAR_FICHA_PERSONA, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(FichaPersonaCachedRowSetDataProvider2.FUNCION_DESVINCULAR_FICHA_PERSONA, BundleWebui.getString("desvincular_ficha_persona"))
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
        } else if (f == FichaPersonaCachedRowSetDataProvider2.FUNCION_DESVINCULAR_FICHA_PERSONA) {
            this.desvincularFichaPersona(rowKey);
        }
    }

    private boolean desvincularFichaPersona(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "desvincularFichaPersona", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idFichaPersona = bean.getFichaPersonaDataProvider().getIdFichaPersona(rowKey);
        DesvincularFichaPersonaMessage message = new DesvincularFichaPersonaMessage(idFichaPersona);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getFichaPersonaBusinessProcess().desvincularFichaPersona(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_FICHA_PERSONA;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamentoNacimiento">
    private GestorBusquedaReferencia gestorBusquedaIdDepartamentoNacimiento = null;

    private boolean funcionSelectEjecutableIdDepartamentoNacimiento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDepartamentoNacimiento() {
        if (this.gestorBusquedaIdDepartamentoNacimiento == null) {
            this.gestorBusquedaIdDepartamentoNacimiento = new GestorBusquedaReferencia(
                    bean.getFichaPersonaDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    FichaPersonaCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO_NACIMIENTO,
                    this.funcionSelectEjecutableIdDepartamentoNacimiento);
        }
        return this.gestorBusquedaIdDepartamentoNacimiento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDepartamentoNacimiento() {
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

    public void campoIdDepartamentoNacimiento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamentoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamentoNacimiento());
        this.getGestorBusquedaIdDepartamentoNacimiento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDepartamentoNacimiento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdDepartamentoNacimiento(rowKey));
        }
        this.getGestorBusquedaIdDepartamentoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamentoNacimiento());
        return this.getGestorBusquedaIdDepartamentoNacimiento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDepartamentoNacimiento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamentoNacimiento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDepartamentoNacimiento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdDepartamentoNacimiento(rowKey));
        }
        this.getGestorBusquedaIdDepartamentoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamentoNacimiento());
        return this.getGestorBusquedaIdDepartamentoNacimiento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDepartamentoNacimiento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDepartamentoNacimiento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDepartamentoNacimiento());
    }

    public String getScriptCampoIdDepartamentoNacimiento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getFichaPersonaDataProvider().getIdDepartamentoNacimiento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDepartamentoNacimiento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDepartamentoNacimiento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDepartamentoNacimiento1Boton2Rendered();
    }

    public boolean isCampoIdDepartamentoNacimiento1Panel2Rendered() {
        return isCampoIdDepartamentoNacimiento1Boton2Rendered() && isGridIdDepartamentoNacimientoRendered();
    }

    public boolean isTableColumnIdDepartamentoNacimiento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDepartamentoNacimiento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDistritoNacimiento">
    private GestorBusquedaReferencia gestorBusquedaIdDistritoNacimiento = null;

    private boolean funcionSelectEjecutableIdDistritoNacimiento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDistritoNacimiento() {
        if (this.gestorBusquedaIdDistritoNacimiento == null) {
            this.gestorBusquedaIdDistritoNacimiento = new GestorBusquedaReferencia(
                    bean.getFichaPersonaDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    FichaPersonaCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO_NACIMIENTO,
                    this.funcionSelectEjecutableIdDistritoNacimiento);
        }
        return this.gestorBusquedaIdDistritoNacimiento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDistritoNacimiento() {
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
        valor = bean.getFichaPersonaDataProvider().getIdDepartamentoNacimiento(rowKey);
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdDistritoNacimiento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistritoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDistritoNacimiento());
        this.getGestorBusquedaIdDistritoNacimiento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDistritoNacimiento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdDistritoNacimiento(rowKey));
        }
        this.getGestorBusquedaIdDistritoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDistritoNacimiento());
        return this.getGestorBusquedaIdDistritoNacimiento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDistritoNacimiento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistritoNacimiento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDistritoNacimiento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdDistritoNacimiento(rowKey));
        }
        this.getGestorBusquedaIdDistritoNacimiento().setFiltroBusqueda(this.getFiltroBusquedaIdDistritoNacimiento());
        return this.getGestorBusquedaIdDistritoNacimiento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDistritoNacimiento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDistritoNacimiento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDistritoNacimiento());
    }

    public String getScriptCampoIdDistritoNacimiento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getFichaPersonaDataProvider().getIdDistritoNacimiento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDistritoNacimiento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDistritoNacimiento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDistritoNacimiento1Boton2Rendered();
    }

    public boolean isCampoIdDistritoNacimiento1Panel2Rendered() {
        return isCampoIdDistritoNacimiento1Boton2Rendered() && isGridIdDistritoNacimientoRendered();
    }

    public boolean isTableColumnIdDistritoNacimiento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDistritoNacimiento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private GestorBusquedaReferencia gestorBusquedaIdPotencialBen = null;

    private boolean funcionSelectEjecutableIdPotencialBen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPotencialBen() {
        if (this.gestorBusquedaIdPotencialBen == null) {
            this.gestorBusquedaIdPotencialBen = new GestorBusquedaReferencia(
                    bean.getFichaPersonaDataProvider(),
                    bean.getPotencialBenReferenceDataProvider(),
                    FichaPersonaCachedRowSetDataProvider2.COLUMNA_ID_POTENCIAL_BEN,
                    this.funcionSelectEjecutableIdPotencialBen);
        }
        return this.gestorBusquedaIdPotencialBen;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPotencialBen() {
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

    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        this.getGestorBusquedaIdPotencialBen().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPotencialBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdPotencialBen(rowKey));
        }
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        return this.getGestorBusquedaIdPotencialBen().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPotencialBen1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPotencialBen().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPotencialBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaPersonaDataProvider().getIdPotencialBen(rowKey));
        }
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        return this.getGestorBusquedaIdPotencialBen().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPotencialBen1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PotencialBenCachedRowSetDataProvider2.FUNCION_CONSULTAR_POTENCIAL_BEN;
        String campo = bean.getCampoIdPotencialBen1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_POTENCIAL_BEN;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_POTENCIAL_BEN;
        Long id = bean.getFichaPersonaDataProvider().getIdPotencialBen(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdPotencialBen1Boton2Rendered() {
        return bean == null ? true : bean.getPotencialBenReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPotencialBen1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPotencialBen1Boton2Rendered();
    }

    public boolean isCampoIdPotencialBen1Panel2Rendered() {
        return isCampoIdPotencialBen1Boton2Rendered() && isGridIdPotencialBenRendered();
    }

    public boolean isTableColumnIdPotencialBen3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPotencialBen1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsRespondente1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroSexoPersona1() {
        return JSF.getListaOpciones(EnumSexoPersona.values(), true, false);
    }

    public Object getOpcionesListaNumeroEstadoCivil1() {
        return JSF.getListaOpciones(EnumEstadoCivil.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoPersonaHogar1() {
        return JSF.getListaOpciones(EnumTipoPersonaHogar.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoMiembroHogar1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoExcepcionCed1() {
        return JSF.getListaOpciones(EnumTipoExcepcionCed.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoAreaLugarNac1() {
        return JSF.getListaOpciones(EnumTipoArea.values(), true, false);
    }

    public Object getOpcionesListaNumeroIdiomaHogar1() {
        return JSF.getListaOpciones(EnumIdiomaHogar.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoAsistenciaEsc1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroMotivoInaEsc1() {
        return JSF.getListaOpciones(EnumMotivoInaEsc.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoMatriculacionEsc1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroNivelEduUltCurAprob1() {
        return JSF.getListaOpciones(EnumNivelEducativo.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoCursoNoFormal1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoSeguroMedico1() {
        return JSF.getListaOpciones(EnumTipoSeguroMedico.values(), true, false);
    }

    public Object getOpcionesListaNumeroEstadoSalud1() {
        return JSF.getListaOpciones(EnumEstadoSalud.values(), true, false);
    }

    public Object getOpcionesListaNumeroClaseEnfAcc1() {
        return JSF.getListaOpciones(EnumClaseEnfAcc.values(), true, false);
    }

    public Object getOpcionesListaNumeroClaseEnfCronica1() {
        return JSF.getListaOpciones(EnumClaseEnfCronica.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoAtencionMedica1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroMotivoNoAtencion1() {
        return JSF.getListaOpciones(EnumMotivoNoAtencion.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoCarnetVacunacion1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroClaseImpedimento1() {
        return JSF.getListaOpciones(EnumClaseImpedimento.values(), true, false);
    }

    public Object getOpcionesListaNumeroCausaImpedimento1() {
        return JSF.getListaOpciones(EnumCausaImpedimento.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaCaminar1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaVestirse1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaBanarse1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaComer1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaLaCama1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDifParaElBano1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoTrabajo1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroMotivoNoTrabajo1() {
        return JSF.getListaOpciones(EnumMotivoNoTrabajo.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoRelacionLab1() {
        return JSF.getListaOpciones(EnumTipoRelacionLab.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsRespondente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getEsRespondente(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsRespondente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getEsRespondente(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroSexoPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSexoPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null;
    }

    public boolean isNumeroSexoPersonaMasculino() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null && value.equals(EnumSexoPersona.MASCULINO.intValue());
    }

    public boolean isNumeroSexoPersonaFemenino() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSexoPersona(rowKey);
        return value != null && value.equals(EnumSexoPersona.FEMENINO.intValue());
    }

    public boolean isNullNumeroEstadoCivil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroEstadoCivil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null;
    }

    public boolean isNumeroEstadoCivilSoltero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.SOLTERO.intValue());
    }

    public boolean isNumeroEstadoCivilCasado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.CASADO.intValue());
    }

    public boolean isNumeroEstadoCivilViudo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.VIUDO.intValue());
    }

    public boolean isNumeroEstadoCivilDivorciado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoCivil(rowKey);
        return value != null && value.equals(EnumEstadoCivil.DIVORCIADO.intValue());
    }

    public boolean isNullNumeroTipoPersonaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoPersonaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoPersonaHogarJefeDelHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.JEFE_DEL_HOGAR.intValue());
    }

    public boolean isNumeroTipoPersonaHogarEsposoACompaneroA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.ESPOSO_A_COMPANERO_A.intValue());
    }

    public boolean isNumeroTipoPersonaHogarHijoAHijastroA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.HIJO_A_HIJASTRO_A.intValue());
    }

    public boolean isNumeroTipoPersonaHogarYernoONuera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.YERNO_O_NUERA.intValue());
    }

    public boolean isNumeroTipoPersonaHogarNietoA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.NIETO_A.intValue());
    }

    public boolean isNumeroTipoPersonaHogarOtroParentescoConElJefe() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.OTRO_PARENTESCO_CON_EL_JEFE.intValue());
    }

    public boolean isNumeroTipoPersonaHogarSinParentescoConElJefe() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.SIN_PARENTESCO_CON_EL_JEFE.intValue());
    }

    public boolean isNumeroTipoPersonaHogarEmpleadoADomesticoA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoPersonaHogar(rowKey);
        return value != null && value.equals(EnumTipoPersonaHogar.EMPLEADO_A_DOMESTICO_A.intValue());
    }

    public boolean isNullNumeroSionoMiembroHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMiembroHogar(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoMiembroHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMiembroHogar(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoMiembroHogarSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMiembroHogar(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoMiembroHogarNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMiembroHogar(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroTipoExcepcionCed() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoExcepcionCed() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoExcepcionCedNoInscritoEnElRegistro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.NO_INSCRITO_EN_EL_REGISTRO.intValue());
    }

    public boolean isNumeroTipoExcepcionCedNuncaObtuvoUnaCedula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.NUNCA_OBTUVO_UNA_CEDULA.intValue());
    }

    public boolean isNumeroTipoExcepcionCedYaTieneContrasena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.YA_TIENE_CONTRASENA.intValue());
    }

    public boolean isNumeroTipoExcepcionCedTienePeroNoLaRecuerda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.TIENE_PERO_NO_LA_RECUERDA.intValue());
    }

    public boolean isNumeroTipoExcepcionCedPersonaAusente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.PERSONA_AUSENTE.intValue());
    }

    public boolean isNumeroTipoExcepcionCedExtranjero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoExcepcionCed(rowKey);
        return value != null && value.equals(EnumTipoExcepcionCed.EXTRANJERO.intValue());
    }

    public boolean isNullNumeroTipoAreaLugarNac() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoAreaLugarNac(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoAreaLugarNac() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoAreaLugarNac(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAreaLugarNacUrbana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoAreaLugarNac(rowKey);
        return value != null && value.equals(EnumTipoArea.URBANA.intValue());
    }

    public boolean isNumeroTipoAreaLugarNacRural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoAreaLugarNac(rowKey);
        return value != null && value.equals(EnumTipoArea.RURAL.intValue());
    }

    public boolean isNullNumeroIdiomaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroIdiomaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null;
    }

    public boolean isNumeroIdiomaHogarSoloGuarani() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null && value.equals(EnumIdiomaHogar.SOLO_GUARANI.intValue());
    }

    public boolean isNumeroIdiomaHogarGuaraniYCastellano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null && value.equals(EnumIdiomaHogar.GUARANI_Y_CASTELLANO.intValue());
    }

    public boolean isNumeroIdiomaHogarCastellano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null && value.equals(EnumIdiomaHogar.CASTELLANO.intValue());
    }

    public boolean isNumeroIdiomaHogarOtroIdioma() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null && value.equals(EnumIdiomaHogar.OTRO_IDIOMA.intValue());
    }

    public boolean isNumeroIdiomaHogarNoHabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroIdiomaHogar(rowKey);
        return value != null && value.equals(EnumIdiomaHogar.NO_HABLA.intValue());
    }

    public boolean isNullNumeroSionoAsistenciaEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAsistenciaEsc(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoAsistenciaEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAsistenciaEsc(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoAsistenciaEscSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAsistenciaEsc(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoAsistenciaEscNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAsistenciaEsc(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroMotivoInaEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroMotivoInaEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null;
    }

    public boolean isNumeroMotivoInaEscSinRecursosEnElHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.SIN_RECURSOS_EN_EL_HOGAR.intValue());
    }

    public boolean isNumeroMotivoInaEscNecesidadDeTrabajar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.NECESIDAD_DE_TRABAJAR.intValue());
    }

    public boolean isNumeroMotivoInaEscDebeHacerLaboresEnElHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.DEBE_HACER_LABORES_EN_EL_HOGAR.intValue());
    }

    public boolean isNumeroMotivoInaEscMuyCostososLosMaterialesYMatriculas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.MUY_COSTOSOS_LOS_MATERIALES_Y_MATRICULAS.intValue());
    }

    public boolean isNumeroMotivoInaEscNoExisteInstitucionPublicaOficialCercana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.NO_EXISTE_INSTITUCION_PUBLICA_OFICIAL_CERCANA.intValue());
    }

    public boolean isNumeroMotivoInaEscNoExisteNingunaInstitucionCercana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.NO_EXISTE_NINGUNA_INSTITUCION_CERCANA.intValue());
    }

    public boolean isNumeroMotivoInaEscNoTieneEdadAdecuada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.NO_TIENE_EDAD_ADECUADA.intValue());
    }

    public boolean isNumeroMotivoInaEscConsideraQueTerminoLosEstudios() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.CONSIDERA_QUE_TERMINO_LOS_ESTUDIOS.intValue());
    }

    public boolean isNumeroMotivoInaEscConsideraDePocoValorLaEducacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.CONSIDERA_DE_POCO_VALOR_LA_EDUCACION.intValue());
    }

    public boolean isNumeroMotivoInaEscInstitucionCercanaDeBajaCalidad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.INSTITUCION_CERCANA_DE_BAJA_CALIDAD.intValue());
    }

    public boolean isNumeroMotivoInaEscEnLaInstitucionCercanaNoExisteCupo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.EN_LA_INSTITUCION_CERCANA_NO_EXISTE_CUPO.intValue());
    }

    public boolean isNumeroMotivoInaEscElHorarioNoEsConveniente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.EL_HORARIO_NO_ES_CONVENIENTE.intValue());
    }

    public boolean isNumeroMotivoInaEscLaInstitucionEstaClausurada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.LA_INSTITUCION_ESTA_CLAUSURADA.intValue());
    }

    public boolean isNumeroMotivoInaEscElDocenteNoAsisteConRegularidad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.EL_DOCENTE_NO_ASISTE_CON_REGULARIDAD.intValue());
    }

    public boolean isNumeroMotivoInaEscInstitucionNoOfreceTodosLosGradosCursos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.INSTITUCION_NO_OFRECE_TODOS_LOS_GRADOS_CURSOS.intValue());
    }

    public boolean isNumeroMotivoInaEscRequiereEducacionEspecial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.REQUIERE_EDUCACION_ESPECIAL.intValue());
    }

    public boolean isNumeroMotivoInaEscNoQuiereEstudiar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.NO_QUIERE_ESTUDIAR.intValue());
    }

    public boolean isNumeroMotivoInaEscAsisteAEnsenanzaNoFormal() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.ASISTE_A_ENSENANZA_NO_FORMAL.intValue());
    }

    public boolean isNumeroMotivoInaEscPorEnfermedad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.POR_ENFERMEDAD.intValue());
    }

    public boolean isNumeroMotivoInaEscPorEmbarazo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.POR_EMBARAZO.intValue());
    }

    public boolean isNumeroMotivoInaEscDebeCuidarDeHermanosMenores() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.DEBE_CUIDAR_DE_HERMANOS_MENORES.intValue());
    }

    public boolean isNumeroMotivoInaEscOtrasRazonesFamiliares() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.OTRAS_RAZONES_FAMILIARES.intValue());
    }

    public boolean isNumeroMotivoInaEscServicioMilitar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.SERVICIO_MILITAR.intValue());
    }

    public boolean isNumeroMotivoInaEscOtrosEspecificar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoInaEsc(rowKey);
        return value != null && value.equals(EnumMotivoInaEsc.OTROS_ESPECIFICAR.intValue());
    }

    public boolean isNullNumeroSionoMatriculacionEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMatriculacionEsc(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoMatriculacionEsc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMatriculacionEsc(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoMatriculacionEscSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMatriculacionEsc(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoMatriculacionEscNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoMatriculacionEsc(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroNivelEduUltCurAprob() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroNivelEduUltCurAprob() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null;
    }

    public boolean isNumeroNivelEduUltCurAprobNinguno() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.NINGUNO.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionEspecial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_ESPECIAL.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionInicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_INICIAL.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionEscolarBasicaDel1Al6Primaria() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_ESCOLAR_BASICA_DEL_1_AL_6_PRIMARIA.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionEscolarBasicaDel7Al9() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_ESCOLAR_BASICA_DEL_7_AL_9.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobSecundariaCicloBasico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.SECUNDARIA_CICLO_BASICO.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobBachilleratoHumanisticoCientifico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.BACHILLERATO_HUMANISTICO_CIENTIFICO.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobBachilleratoTecnicoComercial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.BACHILLERATO_TECNICO_COMERCIAL.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobBachilleratoADistancia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.BACHILLERATO_A_DISTANCIA.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionMediaCientifica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_MEDIA_CIENTIFICA.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionMediaTecnica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_MEDIA_TECNICA.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionBasicaBilingueDeJovenesYAdultos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_BASICA_BILINGUE_DE_JOVENES_Y_ADULTOS.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionMediaADistanciaParaJovenesYAdultos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_MEDIA_A_DISTANCIA_PARA_JOVENES_Y_ADULTOS.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionBasicaAlternativaDeJovenesYAdultos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_BASICA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobEducacionMediaAlternativaDeJovenesYAdultos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.EDUCACION_MEDIA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobFormacionProfesionalNoBachilleratoDeLaMedia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.FORMACION_PROFESIONAL_NO_BACHILLERATO_DE_LA_MEDIA.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobProgramaDeAlfabetizacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.PROGRAMA_DE_ALFABETIZACION.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobGradoEspecialProgramasEspeciales() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.GRADO_ESPECIAL_PROGRAMAS_ESPECIALES.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobTecnicaSuperior() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.TECNICA_SUPERIOR.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobFormacionDocente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.FORMACION_DOCENTE.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobProfesionalizacionDocente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.PROFESIONALIZACION_DOCENTE.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobFormacionMilitarPolicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.FORMACION_MILITAR_POLICIAL.intValue());
    }

    public boolean isNumeroNivelEduUltCurAprobSuperiorUniversitaria() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroNivelEduUltCurAprob(rowKey);
        return value != null && value.equals(EnumNivelEducativo.SUPERIOR_UNIVERSITARIA.intValue());
    }

    public boolean isNullNumeroSionoCursoNoFormal() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCursoNoFormal(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoCursoNoFormal() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCursoNoFormal(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoCursoNoFormalSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCursoNoFormal(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoCursoNoFormalNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCursoNoFormal(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroTipoSeguroMedico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoSeguroMedico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoSeguroMedicoIps() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null && value.equals(EnumTipoSeguroMedico.IPS.intValue());
    }

    public boolean isNumeroTipoSeguroMedicoPrivadoPersonalFamiliar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null && value.equals(EnumTipoSeguroMedico.PRIVADO_PERSONAL_FAMILIAR.intValue());
    }

    public boolean isNumeroTipoSeguroMedicoPrivadoLaboral() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null && value.equals(EnumTipoSeguroMedico.PRIVADO_LABORAL.intValue());
    }

    public boolean isNumeroTipoSeguroMedicoMilitarPolicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null && value.equals(EnumTipoSeguroMedico.MILITAR_POLICIAL.intValue());
    }

    public boolean isNumeroTipoSeguroMedicoNoTiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoSeguroMedico(rowKey);
        return value != null && value.equals(EnumTipoSeguroMedico.NO_TIENE.intValue());
    }

    public boolean isNullNumeroEstadoSalud() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroEstadoSalud() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value != null;
    }

    public boolean isNumeroEstadoSaludSoloEnfermoYOAccidentado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value != null && value.equals(EnumEstadoSalud.SOLO_ENFERMO_Y_O_ACCIDENTADO.intValue());
    }

    public boolean isNumeroEstadoSaludEnfermoCronico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value != null && value.equals(EnumEstadoSalud.ENFERMO_CRONICO.intValue());
    }

    public boolean isNumeroEstadoSaludEnfermoAccidentadoYCronico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value != null && value.equals(EnumEstadoSalud.ENFERMO_ACCIDENTADO_Y_CRONICO.intValue());
    }

    public boolean isNumeroEstadoSaludSano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroEstadoSalud(rowKey);
        return value != null && value.equals(EnumEstadoSalud.SANO.intValue());
    }

    public boolean isNullNumeroClaseEnfAcc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroClaseEnfAcc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null;
    }

    public boolean isNumeroClaseEnfAccSarampionRubeolaVaricela() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.SARAMPION_RUBEOLA_VARICELA.intValue());
    }

    public boolean isNumeroClaseEnfAccResfrioGripeTosDolorDeGarganta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.RESFRIO_GRIPE_TOS_DOLOR_DE_GARGANTA.intValue());
    }

    public boolean isNumeroClaseEnfAccBronquitis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.BRONQUITIS.intValue());
    }

    public boolean isNumeroClaseEnfAccNeumonia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.NEUMONIA.intValue());
    }

    public boolean isNumeroClaseEnfAccPaludismo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PALUDISMO.intValue());
    }

    public boolean isNumeroClaseEnfAccGranosSarnaOtrasEnfremedadesDeLaPiel() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.GRANOS_SARNA_OTRAS_ENFREMEDADES_DE_LA_PIEL.intValue());
    }

    public boolean isNumeroClaseEnfAccDiarrea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.DIARREA.intValue());
    }

    public boolean isNumeroClaseEnfAccAnemiaGrave() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.ANEMIA_GRAVE.intValue());
    }

    public boolean isNumeroClaseEnfAccParasitosis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PARASITOSIS.intValue());
    }

    public boolean isNumeroClaseEnfAccFiebre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.FIEBRE.intValue());
    }

    public boolean isNumeroClaseEnfAccDolorDeOido() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.DOLOR_DE_OIDO.intValue());
    }

    public boolean isNumeroClaseEnfAccGinecologico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.GINECOLOGICO.intValue());
    }

    public boolean isNumeroClaseEnfAccUlcera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.ULCERA.intValue());
    }

    public boolean isNumeroClaseEnfAccViruela() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.VIRUELA.intValue());
    }

    public boolean isNumeroClaseEnfAccAccidente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.ACCIDENTE.intValue());
    }

    public boolean isNumeroClaseEnfAccTiroides() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.TIROIDES.intValue());
    }

    public boolean isNumeroClaseEnfAccOperacionHipotema() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.OPERACION_HIPOTEMA.intValue());
    }

    public boolean isNumeroClaseEnfAccHepatitis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.HEPATITIS.intValue());
    }

    public boolean isNumeroClaseEnfAccGastritis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.GASTRITIS.intValue());
    }

    public boolean isNumeroClaseEnfAccHemorroide() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.HEMORROIDE.intValue());
    }

    public boolean isNumeroClaseEnfAccDengue() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.DENGUE.intValue());
    }

    public boolean isNumeroClaseEnfAccCefalea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.CEFALEA.intValue());
    }

    public boolean isNumeroClaseEnfAccEpilepsia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.EPILEPSIA.intValue());
    }

    public boolean isNumeroClaseEnfAccMiopia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.MIOPIA.intValue());
    }

    public boolean isNumeroClaseEnfAccEstres() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.ESTRES.intValue());
    }

    public boolean isNumeroClaseEnfAccUrticaria() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.URTICARIA.intValue());
    }

    public boolean isNumeroClaseEnfAccProblemasDeOjo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PROBLEMAS_DE_OJO.intValue());
    }

    public boolean isNumeroClaseEnfAccProblemasDelEstomago() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PROBLEMAS_DEL_ESTOMAGO.intValue());
    }

    public boolean isNumeroClaseEnfAccDoloresDeEspaldaCintura() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.DOLORES_DE_ESPALDA_CINTURA.intValue());
    }

    public boolean isNumeroClaseEnfAccPresionBaja() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PRESION_BAJA.intValue());
    }

    public boolean isNumeroClaseEnfAccPresionAlta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PRESION_ALTA.intValue());
    }

    public boolean isNumeroClaseEnfAccAlergia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.ALERGIA.intValue());
    }

    public boolean isNumeroClaseEnfAccPulmonia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.PULMONIA.intValue());
    }

    public boolean isNumeroClaseEnfAccOtrosEspecificar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfAcc(rowKey);
        return value != null && value.equals(EnumClaseEnfAcc.OTROS_ESPECIFICAR.intValue());
    }

    public boolean isNullNumeroClaseEnfCronica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroClaseEnfCronica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null;
    }

    public boolean isNumeroClaseEnfCronicaNoTieneEnfermedadCronica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.NO_TIENE_ENFERMEDAD_CRONICA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaAlergias() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ALERGIAS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaProblemasDeCorazonCardiopatias() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.PROBLEMAS_DE_CORAZON_CARDIOPATIAS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaAnemia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ANEMIA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaDiabetes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.DIABETES.intValue());
    }

    public boolean isNumeroClaseEnfCronicaAsma() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ASMA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaHipertensionPresionAlta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.HIPERTENSION_PRESION_ALTA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaConvulsiones() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.CONVULSIONES.intValue());
    }

    public boolean isNumeroClaseEnfCronicaLesmaniasis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.LESMANIASIS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaTuberculosis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.TUBERCULOSIS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaSida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.SIDA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaCancer() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.CANCER.intValue());
    }

    public boolean isNumeroClaseEnfCronicaArtritis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ARTRITIS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaCataratas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.CATARATAS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaEnfermedadRenalCronica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ENFERMEDAD_RENAL_CRONICA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaEnfermedadBroncopulmonarCronica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ENFERMEDAD_BRONCOPULMONAR_CRONICA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaHernia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.HERNIA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaProstataHipertrofiaProsteticaBenigna() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.PROSTATA_HIPERTROFIA_PROSTETICA_BENIGNA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaPiedraEnLaVesicula() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.PIEDRA_EN_LA_VESICULA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaCirrosis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.CIRROSIS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaArtrosis() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ARTROSIS.intValue());
    }

    public boolean isNumeroClaseEnfCronicaReuma() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.REUMA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaEpilepsia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.EPILEPSIA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaVarices() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.VARICES.intValue());
    }

    public boolean isNumeroClaseEnfCronicaAccidenteCerebroVascular() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ACCIDENTE_CEREBRO_VASCULAR.intValue());
    }

    public boolean isNumeroClaseEnfCronicaColesterolHipercolesterolemia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.COLESTEROL_HIPERCOLESTEROLEMIA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaExema() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.EXEMA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaAcidoUricoGota() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.ACIDO_URICO_GOTA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaInfeccion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.INFECCION.intValue());
    }

    public boolean isNumeroClaseEnfCronicaHidrocefalia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.HIDROCEFALIA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaMalDeParkinson() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.MAL_DE_PARKINSON.intValue());
    }

    public boolean isNumeroClaseEnfCronicaFiebreReumatica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.FIEBRE_REUMATICA.intValue());
    }

    public boolean isNumeroClaseEnfCronicaOtrosEspecificar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseEnfCronica(rowKey);
        return value != null && value.equals(EnumClaseEnfCronica.OTROS_ESPECIFICAR.intValue());
    }

    public boolean isNullNumeroSionoAtencionMedica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAtencionMedica(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoAtencionMedica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAtencionMedica(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoAtencionMedicaSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAtencionMedica(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoAtencionMedicaNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoAtencionMedica(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroMotivoNoAtencion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroMotivoNoAtencion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null;
    }

    public boolean isNumeroMotivoNoAtencionNoFueGraveNoHaciaFalta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.NO_FUE_GRAVE_NO_HACIA_FALTA.intValue());
    }

    public boolean isNumeroMotivoNoAtencionEstaLejosDeSuCasa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.ESTA_LEJOS_DE_SU_CASA.intValue());
    }

    public boolean isNumeroMotivoNoAtencionMalaAtencion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.MALA_ATENCION.intValue());
    }

    public boolean isNumeroMotivoNoAtencionNoHayMedicosOPrefesionales() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.NO_HAY_MEDICOS_O_PREFESIONALES.intValue());
    }

    public boolean isNumeroMotivoNoAtencionNoHayTransporte() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.NO_HAY_TRANSPORTE.intValue());
    }

    public boolean isNumeroMotivoNoAtencionEsCaro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.ES_CARO.intValue());
    }

    public boolean isNumeroMotivoNoAtencionNoTuvoTiempo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.NO_TUVO_TIEMPO.intValue());
    }

    public boolean isNumeroMotivoNoAtencionNoConfiaEnLosMedicos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.NO_CONFIA_EN_LOS_MEDICOS.intValue());
    }

    public boolean isNumeroMotivoNoAtencionOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoAtencion(rowKey);
        return value != null && value.equals(EnumMotivoNoAtencion.OTROS.intValue());
    }

    public boolean isNullNumeroSionoCarnetVacunacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCarnetVacunacion(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoCarnetVacunacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCarnetVacunacion(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoCarnetVacunacionSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCarnetVacunacion(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoCarnetVacunacionNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoCarnetVacunacion(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroClaseImpedimento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroClaseImpedimento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null;
    }

    public boolean isNumeroClaseImpedimentoTieneParalisisEnSusPiernasOBrazosODisminucionDeSusFuerzasKangy() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.TIENE_PARALISIS_EN_SUS_PIERNAS_O_BRAZOS_O_DISMINUCION_DE_SUS_FUERZAS_KANGY.intValue());
    }

    public boolean isNumeroClaseImpedimentoLeFaltaAlgunaParteDeSuCuerpo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.LE_FALTA_ALGUNA_PARTE_DE_SU_CUERPO.intValue());
    }

    public boolean isNumeroClaseImpedimentoEsSordoNoEscuchaNada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.ES_SORDO_NO_ESCUCHA_NADA.intValue());
    }

    public boolean isNumeroClaseImpedimentoNoEscuchaBienNecesitaOUsaAparatoParaOir() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.NO_ESCUCHA_BIEN_NECESITA_O_USA_APARATO_PARA_OIR.intValue());
    }

    public boolean isNumeroClaseImpedimentoEsMudoNoHabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.ES_MUDO_NO_HABLA.intValue());
    }

    public boolean isNumeroClaseImpedimentoNoTieneImpedimento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.NO_TIENE_IMPEDIMENTO.intValue());
    }

    public boolean isNumeroClaseImpedimentoEsCiegoEnAmbosOjosNoVeNada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.ES_CIEGO_EN_AMBOS_OJOS_NO_VE_NADA.intValue());
    }

    public boolean isNumeroClaseImpedimentoEsCiegoEnUnOjo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.ES_CIEGO_EN_UN_OJO.intValue());
    }

    public boolean isNumeroClaseImpedimentoVeConDificultadAunConAnteojos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.VE_CON_DIFICULTAD_AUN_CON_ANTEOJOS.intValue());
    }

    public boolean isNumeroClaseImpedimentoTieneSindromeDeDownMongolico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.TIENE_SINDROME_DE_DOWN_MONGOLICO.intValue());
    }

    public boolean isNumeroClaseImpedimentoTieneAlgunRetrasoMental() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.TIENE_ALGUN_RETRASO_MENTAL.intValue());
    }

    public boolean isNumeroClaseImpedimentoTieneLocuraDemencia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.TIENE_LOCURA_DEMENCIA.intValue());
    }

    public boolean isNumeroClaseImpedimentoOtrosEspecificar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.OTROS_ESPECIFICAR.intValue());
    }

    public boolean isNumeroClaseImpedimentoHablaConMuchaDificultad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroClaseImpedimento(rowKey);
        return value != null && value.equals(EnumClaseImpedimento.HABLA_CON_MUCHA_DIFICULTAD.intValue());
    }

    public boolean isNullNumeroCausaImpedimento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaImpedimento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaImpedimentoPorqueNacioAsi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null && value.equals(EnumCausaImpedimento.PORQUE_NACIO_ASI.intValue());
    }

    public boolean isNumeroCausaImpedimentoPorUnaEnfermedad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null && value.equals(EnumCausaImpedimento.POR_UNA_ENFERMEDAD.intValue());
    }

    public boolean isNumeroCausaImpedimentoPorUnAccidente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null && value.equals(EnumCausaImpedimento.POR_UN_ACCIDENTE.intValue());
    }

    public boolean isNumeroCausaImpedimentoPorEdadAvanzada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null && value.equals(EnumCausaImpedimento.POR_EDAD_AVANZADA.intValue());
    }

    public boolean isNumeroCausaImpedimentoOtrosEspecificar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroCausaImpedimento(rowKey);
        return value != null && value.equals(EnumCausaImpedimento.OTROS_ESPECIFICAR.intValue());
    }

    public boolean isNullNumeroSionoDifParaCaminar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaCaminar(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaCaminar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaCaminar(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaCaminarSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaCaminar(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaCaminarNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaCaminar(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDifParaVestirse() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaVestirse(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaVestirse() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaVestirse(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaVestirseSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaVestirse(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaVestirseNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaVestirse(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDifParaBanarse() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaBanarse(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaBanarse() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaBanarse(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaBanarseSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaBanarse(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaBanarseNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaBanarse(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDifParaComer() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaComer(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaComer() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaComer(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaComerSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaComer(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaComerNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaComer(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDifParaLaCama() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaLaCama(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaLaCama() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaLaCama(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaLaCamaSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaLaCama(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaLaCamaNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaLaCama(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDifParaElBano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaElBano(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDifParaElBano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaElBano(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDifParaElBanoSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaElBano(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDifParaElBanoNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoDifParaElBano(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoTrabajo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoTrabajo(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoTrabajo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoTrabajo(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoTrabajoSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoTrabajo(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoTrabajoNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroSionoTrabajo(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroMotivoNoTrabajo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroMotivoNoTrabajo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null;
    }

    public boolean isNumeroMotivoNoTrabajoBuscoTrabajo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.BUSCO_TRABAJO.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoDedicacionExclusivaAlHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.DEDICACION_EXCLUSIVA_AL_HOGAR.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoEstudiante() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.ESTUDIANTE.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoPrestaServicioMilitar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.PRESTA_SERVICIO_MILITAR.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoDiscapacitado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.DISCAPACITADO.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoRentista() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.RENTISTA.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoJubiladoA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.JUBILADO_A.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoPensionadoA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.PENSIONADO_A.intValue());
    }

    public boolean isNumeroMotivoNoTrabajoOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroMotivoNoTrabajo(rowKey);
        return value != null && value.equals(EnumMotivoNoTrabajo.OTROS.intValue());
    }

    public boolean isNullNumeroTipoRelacionLab() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoRelacionLab() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoRelacionLabEmpleadoPublico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.EMPLEADO_PUBLICO.intValue());
    }

    public boolean isNumeroTipoRelacionLabEmpleadoPrivado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.EMPLEADO_PRIVADO.intValue());
    }

    public boolean isNumeroTipoRelacionLabObreroPublico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.OBRERO_PUBLICO.intValue());
    }

    public boolean isNumeroTipoRelacionLabObreroPrivado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.OBRERO_PRIVADO.intValue());
    }

    public boolean isNumeroTipoRelacionLabEmpleadorOPatron() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.EMPLEADOR_O_PATRON.intValue());
    }

    public boolean isNumeroTipoRelacionLabTrabajadorPorCuentaPropia() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.TRABAJADOR_POR_CUENTA_PROPIA.intValue());
    }

    public boolean isNumeroTipoRelacionLabTrabajadorNoRemunerado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.TRABAJADOR_NO_REMUNERADO.intValue());
    }

    public boolean isNumeroTipoRelacionLabEmpleadoADomesticoA() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaPersonaDataProvider().getNumeroTipoRelacionLab(rowKey);
        return value != null && value.equals(EnumTipoRelacionLab.EMPLEADO_A_DOMESTICO_A.intValue());
    }

    public boolean isGridIdFichaPersonaRendered() {
        return true;
    }

    public boolean isGridCodigoFichaPersonaRendered() {
        return true;
    }

    public boolean isGridNombreFichaPersonaRendered() {
        return true;
    }

    public boolean isGridEsRespondenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridNumeroOrdenIdentificacionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridPrimerNombreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridSegundoNombreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridPrimerApellidoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridSegundoApellidoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridApellidoCasadaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridApodoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridEdadRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridNumeroSexoPersonaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridNumeroEstadoCivilRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes1Rendered();
    }

    public boolean isGridNumeroTipoPersonaHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroSionoMiembroHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroOrdenIdenConyugeRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroOrdenIdenPadreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroOrdenIdenMadreRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridLetraCedulaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridNumeroTipoExcepcionCedRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes2Rendered();
    }

    public boolean isGridFechaNacimientoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes3Rendered();
    }

    public boolean isGridIdDepartamentoNacimientoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes3Rendered();
    }

    public boolean isGridIdDistritoNacimientoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes3Rendered();
    }

    public boolean isGridNumeroTipoAreaLugarNacRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionAntecedentes3Rendered();
    }

    public boolean isGridNumeroIdiomaHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridOtroIdiomaHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroSionoAsistenciaEscRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroMotivoInaEscRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridOtroMotivoInaEscRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroSionoMatriculacionEscRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridUltimoCursoAprobadoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroNivelEduUltCurAprobRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroSionoCursoNoFormalRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEducacionRendered();
    }

    public boolean isGridNumeroTipoSeguroMedicoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroEstadoSaludRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroClaseEnfAccRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridOtraClaseEnfAccRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroClaseEnfCronicaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridOtraClaseEnfCronicaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroSionoAtencionMedicaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroMotivoNoAtencionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridOtroMotivoNoAtencionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroSionoCarnetVacunacionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud1Rendered();
    }

    public boolean isGridNumeroClaseImpedimentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridOtraClaseImpedimentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroCausaImpedimentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridOtraCausaImpedimentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaCaminarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaVestirseRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaBanarseRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaComerRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaLaCamaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoDifParaElBanoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionSalud2Rendered();
    }

    public boolean isGridNumeroSionoTrabajoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridNumeroMotivoNoTrabajoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridOtroMotivoNoTrabajoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridDescripcionOcupacionPrinRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridDescripcionDedicacionPrinRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridNumeroTipoRelacionLabRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionEmpleoRendered();
    }

    public boolean isGridMontoIngresoOcupacionPrinRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoOcupacionSecunRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoOtrasOcupRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoAlquileresRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoInteresesRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoAyudaFamPaisRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoAyudaFamExterRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoJubilacionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoPensionesRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoTekoporaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoProgramasRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridMontoIngresoAdicionalRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridTotalIngresoMensualRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionIngresosRendered();
    }

    public boolean isGridIdPotencialBenRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isSeccionAntecedentes1Rendered() {
        return true;
    }

    public boolean isSeccionAntecedentes1Hidden() {
        return !isSeccionAntecedentes1Rendered();
    }

    public boolean isSeccionAntecedentes2Rendered() {
        return true;
    }

    public boolean isSeccionAntecedentes2Hidden() {
        return !isSeccionAntecedentes2Rendered();
    }

    public boolean isSeccionAntecedentes3Rendered() {
        return true;
    }

    public boolean isSeccionAntecedentes3Hidden() {
        return !isSeccionAntecedentes3Rendered();
    }

    public boolean isSeccionEducacionRendered() {
        return true;
    }

    public boolean isSeccionEducacionHidden() {
        return !isSeccionEducacionRendered();
    }

    public boolean isSeccionSalud1Rendered() {
        return true;
    }

    public boolean isSeccionSalud1Hidden() {
        return !isSeccionSalud1Rendered();
    }

    public boolean isSeccionSalud2Rendered() {
        return true;
    }

    public boolean isSeccionSalud2Hidden() {
        return !isSeccionSalud2Rendered();
    }

    public boolean isSeccionEmpleoRendered() {
        return true;
    }

    public boolean isSeccionEmpleoHidden() {
        return !isSeccionEmpleoRendered();
    }

    public boolean isSeccionIngresosRendered() {
        return true;
    }

    public boolean isSeccionIngresosHidden() {
        return !isSeccionIngresosRendered();
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

    private FichaPersonaBusinessProcessLocal getFichaPersonaBusinessProcess() {
        return (FichaPersonaBusinessProcessLocal) bean.getFichaPersonaBusinessProcess();
    }

    private BusinessProcessMessengerLocal getMessenger() {
        return (BusinessProcessMessengerLocal) bean.getMessenger();
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
