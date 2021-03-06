/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.basica;

import com.egt.base.enums.EnumTipoParametro;
import com.egt.base.enums.EnumTipoComparacion;
import com.egt.base.enums.EnumTipoValor;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.general.xdp2.ClaseRecursoParCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoSecCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso {

    private PaginaActualizacionClaseRecursoParPorClaseRecurso bean;

    public AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso(PaginaActualizacionClaseRecursoParPorClaseRecurso bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(ClaseRecursoParCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO_PAR, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idParametro">
    private GestorBusquedaReferencia gestorBusquedaIdParametro = null;

    private boolean funcionSelectEjecutableIdParametro = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdParametro() {
        if (this.gestorBusquedaIdParametro == null) {
            this.gestorBusquedaIdParametro = new GestorBusquedaReferencia(
                    bean.getClaseRecursoParDataProvider(),
                    bean.getParametroReferenceDataProvider(),
                    ClaseRecursoParCachedRowSetDataProvider2.COLUMNA_ID_PARAMETRO,
                    this.funcionSelectEjecutableIdParametro);
        }
        return this.gestorBusquedaIdParametro;
    }

    protected FiltroBusqueda getFiltroBusquedaIdParametro() {
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

    public void campoIdParametro1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        this.getGestorBusquedaIdParametro().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdParametro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdParametro(rowKey));
        }
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        return this.getGestorBusquedaIdParametro().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdParametro1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdParametro().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdParametro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdParametro(rowKey));
        }
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        return this.getGestorBusquedaIdParametro().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdParametro1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ParametroCachedRowSetDataProvider2.FUNCION_CONSULTAR_PARAMETRO;
        String campo = bean.getCampoIdParametro1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdParametro());
    }

    public String getScriptCampoIdParametro1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PARAMETRO;
//      Long id = bean.getClaseRecursoParDataProvider().getIdParametro(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdParametro1Boton2Rendered() {
        return bean == null ? true : bean.getParametroReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdParametro1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdParametro1Boton2Rendered();
    }

    public boolean isCampoIdParametro1Panel2Rendered() {
        return isCampoIdParametro1Boton2Rendered();
    }

    public boolean isTableColumnIdParametro3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdParametro1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionReferencia">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionReferencia = null;

    private boolean funcionSelectEjecutableIdFuncionReferencia = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionReferencia() {
        if (this.gestorBusquedaIdFuncionReferencia == null) {
            this.gestorBusquedaIdFuncionReferencia = new GestorBusquedaReferencia(
                    bean.getClaseRecursoParDataProvider(),
                    bean.getFuncionReferenceDataProvider(),
                    ClaseRecursoParCachedRowSetDataProvider2.COLUMNA_ID_FUNCION_REFERENCIA,
                    this.funcionSelectEjecutableIdFuncionReferencia);
        }
        return this.gestorBusquedaIdFuncionReferencia;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionReferencia() {
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

    public void campoIdFuncionReferencia1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionReferencia().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionReferencia());
        this.getGestorBusquedaIdFuncionReferencia().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionReferencia1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdFuncionReferencia(rowKey));
        }
        this.getGestorBusquedaIdFuncionReferencia().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionReferencia());
        return this.getGestorBusquedaIdFuncionReferencia().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionReferencia1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionReferencia().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionReferencia1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdFuncionReferencia(rowKey));
        }
        this.getGestorBusquedaIdFuncionReferencia().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionReferencia());
        return this.getGestorBusquedaIdFuncionReferencia().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionReferencia1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCION;
        String campo = bean.getCampoIdFuncionReferencia1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdFuncionReferencia());
    }

    public String getScriptCampoIdFuncionReferencia1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_FUNCION;
//      Long id = bean.getClaseRecursoParDataProvider().getIdFuncionReferencia(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdFuncionReferencia1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionReferencia1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionReferencia1Boton2Rendered();
    }

    public boolean isCampoIdFuncionReferencia1Panel2Rendered() {
        return isCampoIdFuncionReferencia1Boton2Rendered();
    }

    public boolean isTableColumnIdFuncionReferencia3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionReferencia1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoValor">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoValor = null;

    private boolean funcionSelectEjecutableIdClaseRecursoValor = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoValor() {
        if (this.gestorBusquedaIdClaseRecursoValor == null) {
            this.gestorBusquedaIdClaseRecursoValor = new GestorBusquedaReferencia(
                    bean.getClaseRecursoParDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    ClaseRecursoParCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_VALOR,
                    this.funcionSelectEjecutableIdClaseRecursoValor);
        }
        return this.gestorBusquedaIdClaseRecursoValor;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoValor() {
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

    public void campoIdClaseRecursoValor1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoValor());
        this.getGestorBusquedaIdClaseRecursoValor().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoValor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdClaseRecursoValor(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoValor());
        return this.getGestorBusquedaIdClaseRecursoValor().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoValor1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoValor().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoValor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdClaseRecursoValor(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoValor());
        return this.getGestorBusquedaIdClaseRecursoValor().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoValor1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String campo = bean.getCampoIdClaseRecursoValor1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoValor());
    }

    public String getScriptCampoIdClaseRecursoValor1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO;
//      Long id = bean.getClaseRecursoParDataProvider().getIdClaseRecursoValor(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoValor1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoValor1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoValor1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoValor1Panel2Rendered() {
        return isCampoIdClaseRecursoValor1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoValor3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoValor1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoSec">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoSec = null;

    private boolean funcionSelectEjecutableIdClaseRecursoSec = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoSec() {
        if (this.gestorBusquedaIdClaseRecursoSec == null) {
            this.gestorBusquedaIdClaseRecursoSec = new GestorBusquedaReferencia(
                    bean.getClaseRecursoParDataProvider(),
                    bean.getClaseRecursoSecReferenceDataProvider(),
                    ClaseRecursoParCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_SEC,
                    this.funcionSelectEjecutableIdClaseRecursoSec);
        }
        return this.gestorBusquedaIdClaseRecursoSec;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoSec() {
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

    public void campoIdClaseRecursoSec1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoSec().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSec());
        this.getGestorBusquedaIdClaseRecursoSec().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoSec1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdClaseRecursoSec(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoSec().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSec());
        return this.getGestorBusquedaIdClaseRecursoSec().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoSec1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoSec().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoSec1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoParDataProvider().getIdClaseRecursoSec(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoSec().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSec());
        return this.getGestorBusquedaIdClaseRecursoSec().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoSec1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoSecCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO_SEC;
        String campo = bean.getCampoIdClaseRecursoSec1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoSec());
    }

    public String getScriptCampoIdClaseRecursoSec1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO_SEC;
//      Long id = bean.getClaseRecursoParDataProvider().getIdClaseRecursoSec(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoSec1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoSecReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoSec1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoSec1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoSec1Panel2Rendered() {
        return isCampoIdClaseRecursoSec1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoSec3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoSec1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoParametro1() {
        return JSF.getListaOpciones(EnumTipoParametro.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoComparacion1() {
        return JSF.getListaOpciones(EnumTipoComparacion.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoValor1() {
        return JSF.getListaOpciones(EnumTipoValor.values(), true, false);
    }

    public Object getOpcionesListaEsParametroOmisible1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroInmutable1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroSubmit1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroPrimordial1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroMaestro1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroSegmento1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroSinRastro1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsParametroSincronizado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsReferenciaAlternativa1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoValorAlternativo1() {
        return JSF.getListaOpciones(EnumTipoValor.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoParametro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoParametro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoParametroObligatorio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value != null && value.equals(EnumTipoParametro.OBLIGATORIO.intValue());
    }

    public boolean isNumeroTipoParametroOmitido() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value != null && value.equals(EnumTipoParametro.OMITIDO.intValue());
    }

    public boolean isNumeroTipoParametroOpcional() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value != null && value.equals(EnumTipoParametro.OPCIONAL.intValue());
    }

    public boolean isNumeroTipoParametroProgramatico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoParametro(rowKey);
        return value != null && value.equals(EnumTipoParametro.PROGRAMATICO.intValue());
    }

    public boolean isNullNumeroTipoComparacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoComparacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoComparacionIgualNoIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value != null && value.equals(EnumTipoComparacion.IGUAL_NO_IGUAL.intValue());
    }

    public boolean isNumeroTipoComparacionMayorMenorOIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value != null && value.equals(EnumTipoComparacion.MAYOR_MENOR_O_IGUAL.intValue());
    }

    public boolean isNumeroTipoComparacionMayorOIgualMenor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value != null && value.equals(EnumTipoComparacion.MAYOR_O_IGUAL_MENOR.intValue());
    }

    public boolean isNumeroTipoComparacionComienzaNoComienza() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoComparacion(rowKey);
        return value != null && value.equals(EnumTipoComparacion.COMIENZA_NO_COMIENZA.intValue());
    }

    public boolean isNullNumeroTipoValor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoValor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoValorContinuo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value != null && value.equals(EnumTipoValor.CONTINUO.intValue());
    }

    public boolean isNumeroTipoValorDiscreto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value != null && value.equals(EnumTipoValor.DISCRETO.intValue());
    }

    public boolean isNumeroTipoValorObjeto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value != null && value.equals(EnumTipoValor.OBJETO.intValue());
    }

    public boolean isNumeroTipoValorRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValor(rowKey);
        return value != null && value.equals(EnumTipoValor.RECURSO.intValue());
    }

   public boolean isEsParametroOmisible() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroOmisible(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroOmisible() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroOmisible(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroInmutable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroInmutable(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroInmutable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroInmutable(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroSubmit() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSubmit(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroSubmit() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSubmit(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroPrimordial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroPrimordial(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroPrimordial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroPrimordial(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroMaestro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroMaestro(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroMaestro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroMaestro(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroSegmento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSegmento(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroSegmento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSegmento(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroSinRastro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSinRastro(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroSinRastro() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSinRastro(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsParametroSincronizado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSincronizado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsParametroSincronizado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsParametroSincronizado(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsReferenciaAlternativa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsReferenciaAlternativa(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsReferenciaAlternativa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getEsReferenciaAlternativa(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroTipoValorAlternativo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoValorAlternativo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoValorAlternativoContinuo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value != null && value.equals(EnumTipoValor.CONTINUO.intValue());
    }

    public boolean isNumeroTipoValorAlternativoDiscreto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value != null && value.equals(EnumTipoValor.DISCRETO.intValue());
    }

    public boolean isNumeroTipoValorAlternativoObjeto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value != null && value.equals(EnumTipoValor.OBJETO.intValue());
    }

    public boolean isNumeroTipoValorAlternativoRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoParDataProvider().getNumeroTipoValorAlternativo(rowKey);
        return value != null && value.equals(EnumTipoValor.RECURSO.intValue());
    }

    public boolean isGridIdClaseRecursoParRendered() {
        return true;
    }

    public boolean isGridIdParametroRendered() {
        return true;
    }

    public boolean isGridNumeroTipoParametroRendered() {
        return true;
    }

    public boolean isGridNumeroTipoComparacionRendered() {
        return true;
    }

    public boolean isGridIdFuncionReferenciaRendered() {
        return true;
    }

    public boolean isGridNumeroTipoValorRendered() {
        return true;
    }

    public boolean isGridIdListaValorRendered() {
        return true;
    }

    public boolean isGridIdClaseObjetoValorRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoValorRendered() {
        return true;
    }

    public boolean isGridValorMinimoRendered() {
        return true;
    }

    public boolean isGridValorMaximoRendered() {
        return true;
    }

    public boolean isGridValorOmisionRendered() {
        return true;
    }

    public boolean isGridEsParametroOmisibleRendered() {
        return true;
    }

    public boolean isGridEsParametroInmutableRendered() {
        return true;
    }

    public boolean isGridEsParametroSubmitRendered() {
        return true;
    }

    public boolean isGridEsParametroPrimordialRendered() {
        return true;
    }

    public boolean isGridEsParametroMaestroRendered() {
        return true;
    }

    public boolean isGridEsParametroSegmentoRendered() {
        return true;
    }

    public boolean isGridEsParametroSinRastroRendered() {
        return true;
    }

    public boolean isGridEsParametroSincronizadoRendered() {
        return true;
    }

    public boolean isGridOrdenPresentacionRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoSecRendered() {
        return true;
    }

    public boolean isGridEsReferenciaAlternativaRendered() {
        return true;
    }

    public boolean isGridNumeroTipoValorAlternativoRendered() {
        return true;
    }

    public boolean isGridIdFuncionReferenciaAltRendered() {
        return true;
    }

    public boolean isGridIdListaValorAlternativaRendered() {
        return true;
    }

    public boolean isGridIdClaseObjetoValorAltRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoValorAltRendered() {
        return true;
    }

    public boolean isGridOrdenPaginaSeleccionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
