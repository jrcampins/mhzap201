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

import com.egt.base.enums.EnumCausaDenPension;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.LogProDenPenObjCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AsistentePaginaActualizacionLogProDenPenObj {

    private PaginaActualizacionLogProDenPenObj bean;

    public AsistentePaginaActualizacionLogProDenPenObj() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogProDenPenObj(PaginaActualizacionLogProDenPenObj bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
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
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private GestorBusquedaReferencia gestorBusquedaIdPersona = null;

    private boolean funcionSelectEjecutableIdPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPersona() {
        if (this.gestorBusquedaIdPersona == null) {
            this.gestorBusquedaIdPersona = new GestorBusquedaReferencia(
                    bean.getLogProDenPenObjDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    LogProDenPenObjCachedRowSetDataProvider2.COLUMNA_ID_PERSONA,
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdPersona(rowKey));
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdPersona(rowKey));
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
        String urx = URX2.CONSULTA_TABLA_PERSONA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPersona());
    }

    public String getScriptCampoIdPersona1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PERSONA;
        Long id = bean.getLogProDenPenObjDataProvider().getIdPersona(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdPersona1Boton2Rendered() {
        return bean == null ? true : bean.getPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPersona1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPersona1Boton2Rendered();
    }

    public boolean isCampoIdPersona1Panel2Rendered() {
        return isCampoIdPersona1Boton2Rendered();
    }

    public boolean isTableColumnIdPersona3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPersona1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamento">
    private GestorBusquedaReferencia gestorBusquedaIdDepartamento = null;

    private boolean funcionSelectEjecutableIdDepartamento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDepartamento() {
        if (this.gestorBusquedaIdDepartamento == null) {
            this.gestorBusquedaIdDepartamento = new GestorBusquedaReferencia(
                    bean.getLogProDenPenObjDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProDenPenObjCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO,
                    this.funcionSelectEjecutableIdDepartamento);
        }
        return this.gestorBusquedaIdDepartamento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDepartamento() {
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdDepartamento(rowKey));
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdDepartamento(rowKey));
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
        Long id = bean.getLogProDenPenObjDataProvider().getIdDepartamento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDepartamento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDepartamento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDepartamento1Boton2Rendered();
    }

    public boolean isCampoIdDepartamento1Panel2Rendered() {
        return isCampoIdDepartamento1Boton2Rendered();
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
                    bean.getLogProDenPenObjDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProDenPenObjCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO,
                    this.funcionSelectEjecutableIdDistrito);
        }
        return this.gestorBusquedaIdDistrito;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDistrito() {
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdDistrito(rowKey));
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdDistrito(rowKey));
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
        Long id = bean.getLogProDenPenObjDataProvider().getIdDistrito(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDistrito1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDistrito1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDistrito1Boton2Rendered();
    }

    public boolean isCampoIdDistrito1Panel2Rendered() {
        return isCampoIdDistrito1Boton2Rendered();
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
                    bean.getLogProDenPenObjDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProDenPenObjCachedRowSetDataProvider2.COLUMNA_ID_BARRIO,
                    this.funcionSelectEjecutableIdBarrio);
        }
        return this.gestorBusquedaIdBarrio;
    }

    protected FiltroBusqueda getFiltroBusquedaIdBarrio() {
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdBarrio(rowKey));
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
            return STP.getString(bean.getLogProDenPenObjDataProvider().getIdBarrio(rowKey));
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
        Long id = bean.getLogProDenPenObjDataProvider().getIdBarrio(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdBarrio1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdBarrio1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isCampoIdBarrio1Panel2Rendered() {
        return isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isTableColumnIdBarrio3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdBarrio1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroCausaDenPension1() {
        return JSF.getListaOpciones(EnumCausaDenPension.values(), true, false);
    }

    public Object getOpcionesListaEsProcesado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroCausaDenPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroCausaDenPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null;
    }

    public boolean isNumeroCausaDenPensionPersonaSinCvrVigente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_SIN_CVR_VIGENTE.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_FALLECIDA.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaNoEsNatural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_NO_ES_NATURAL.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaNoEsMayorDe65Anos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_NO_ES_MAYOR_DE_65_ANOS.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_EMPLEO.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_JUBILACION.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_DEUDA.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_PENA_JUDICIAL.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConOtraPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_OTRA_PENSION.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaSinFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_SIN_FICHA_HOGAR.intValue());
    }

    public boolean isNumeroCausaDenPensionPersonaConIcvMayorQue65() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.PERSONA_CON_ICV_MAYOR_QUE_65.intValue());
    }

    public boolean isNumeroCausaDenPensionOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getNumeroCausaDenPension(rowKey);
        return value != null && value.equals(EnumCausaDenPension.OTRA_CAUSA.intValue());
    }

   public boolean isEsProcesado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getEsProcesado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsProcesado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProDenPenObjDataProvider().getEsProcesado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogProDenPenObjRendered() {
        return true;
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

    public boolean isGridIdDepartamentoRendered() {
        return true;
    }

    public boolean isGridIdDistritoRendered() {
        return true;
    }

    public boolean isGridIdBarrioRendered() {
        return true;
    }

    public boolean isGridNumeroCausaDenPensionRendered() {
        return true;
    }

    public boolean isGridEsProcesadoRendered() {
        return true;
    }

    public boolean isGridObservacionRendered() {
        return true;
    }

    public boolean isGridFechaHoraTransaccionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
