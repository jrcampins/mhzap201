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

import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.enums.EnumTipoPagina;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionPagina {

    private PaginaActualizacionPagina bean;

    public AsistentePaginaActualizacionPagina() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionPagina(PaginaActualizacionPagina bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(PaginaCachedRowSetDataProvider2.FUNCION_MODIFICAR_PAGINA, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idAplicacion">
    private GestorBusquedaReferencia gestorBusquedaIdAplicacion = null;

    private boolean funcionSelectEjecutableIdAplicacion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdAplicacion() {
        if (this.gestorBusquedaIdAplicacion == null) {
            this.gestorBusquedaIdAplicacion = new GestorBusquedaReferencia(
                    bean.getPaginaDataProvider(),
                    bean.getAplicacionReferenceDataProvider(),
                    PaginaCachedRowSetDataProvider2.COLUMNA_ID_APLICACION,
                    this.funcionSelectEjecutableIdAplicacion);
        }
        return this.gestorBusquedaIdAplicacion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdAplicacion() {
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

    public void campoIdAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdAplicacion());
        this.getGestorBusquedaIdAplicacion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdAplicacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdAplicacion(rowKey));
        }
        this.getGestorBusquedaIdAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdAplicacion());
        return this.getGestorBusquedaIdAplicacion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdAplicacion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdAplicacion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdAplicacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdAplicacion(rowKey));
        }
        this.getGestorBusquedaIdAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdAplicacion());
        return this.getGestorBusquedaIdAplicacion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdAplicacion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = AplicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_APLICACION;
        String campo = bean.getCampoIdAplicacion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdAplicacion());
    }

    public String getScriptCampoIdAplicacion1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_APLICACION;
//      Long id = bean.getPaginaDataProvider().getIdAplicacion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdAplicacion1Boton2Rendered() {
        return bean == null ? true : bean.getAplicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdAplicacion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdAplicacion1Boton2Rendered();
    }

    public boolean isCampoIdAplicacion1Panel2Rendered() {
        return isCampoIdAplicacion1Boton2Rendered();
    }

    public boolean isTableColumnIdAplicacion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdAplicacion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDominio">
    private GestorBusquedaReferencia gestorBusquedaIdDominio = null;

    private boolean funcionSelectEjecutableIdDominio = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDominio() {
        if (this.gestorBusquedaIdDominio == null) {
            this.gestorBusquedaIdDominio = new GestorBusquedaReferencia(
                    bean.getPaginaDataProvider(),
                    bean.getDominioReferenceDataProvider(),
                    PaginaCachedRowSetDataProvider2.COLUMNA_ID_DOMINIO,
                    this.funcionSelectEjecutableIdDominio);
        }
        return this.gestorBusquedaIdDominio;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDominio() {
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

    public void campoIdDominio1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominio().setFiltroBusqueda(this.getFiltroBusquedaIdDominio());
        this.getGestorBusquedaIdDominio().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDominio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdDominio(rowKey));
        }
        this.getGestorBusquedaIdDominio().setFiltroBusqueda(this.getFiltroBusquedaIdDominio());
        return this.getGestorBusquedaIdDominio().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDominio1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominio().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDominio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdDominio(rowKey));
        }
        this.getGestorBusquedaIdDominio().setFiltroBusqueda(this.getFiltroBusquedaIdDominio());
        return this.getGestorBusquedaIdDominio().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDominio1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = DominioCachedRowSetDataProvider2.FUNCION_CONSULTAR_DOMINIO;
        String campo = bean.getCampoIdDominio1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdDominio());
    }

    public String getScriptCampoIdDominio1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_DOMINIO;
//      Long id = bean.getPaginaDataProvider().getIdDominio(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdDominio1Boton2Rendered() {
        return bean == null ? true : bean.getDominioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDominio1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDominio1Boton2Rendered();
    }

    public boolean isCampoIdDominio1Panel2Rendered() {
        return isCampoIdDominio1Boton2Rendered();
    }

    public boolean isTableColumnIdDominio3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDominio1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDominioMaestro">
    private GestorBusquedaReferencia gestorBusquedaIdDominioMaestro = null;

    private boolean funcionSelectEjecutableIdDominioMaestro = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDominioMaestro() {
        if (this.gestorBusquedaIdDominioMaestro == null) {
            this.gestorBusquedaIdDominioMaestro = new GestorBusquedaReferencia(
                    bean.getPaginaDataProvider(),
                    bean.getDominioReferenceDataProvider(),
                    PaginaCachedRowSetDataProvider2.COLUMNA_ID_DOMINIO_MAESTRO,
                    this.funcionSelectEjecutableIdDominioMaestro);
        }
        return this.gestorBusquedaIdDominioMaestro;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDominioMaestro() {
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

    public void campoIdDominioMaestro1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominioMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdDominioMaestro());
        this.getGestorBusquedaIdDominioMaestro().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDominioMaestro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdDominioMaestro(rowKey));
        }
        this.getGestorBusquedaIdDominioMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdDominioMaestro());
        return this.getGestorBusquedaIdDominioMaestro().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDominioMaestro1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominioMaestro().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDominioMaestro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getPaginaDataProvider().getIdDominioMaestro(rowKey));
        }
        this.getGestorBusquedaIdDominioMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdDominioMaestro());
        return this.getGestorBusquedaIdDominioMaestro().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDominioMaestro1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = DominioCachedRowSetDataProvider2.FUNCION_CONSULTAR_DOMINIO;
        String campo = bean.getCampoIdDominioMaestro1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdDominioMaestro());
    }

    public String getScriptCampoIdDominioMaestro1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_DOMINIO;
//      Long id = bean.getPaginaDataProvider().getIdDominioMaestro(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdDominioMaestro1Boton2Rendered() {
        return bean == null ? true : bean.getDominioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDominioMaestro1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDominioMaestro1Boton2Rendered();
    }

    public boolean isCampoIdDominioMaestro1Panel2Rendered() {
        return isCampoIdDominioMaestro1Boton2Rendered();
    }

    public boolean isTableColumnIdDominioMaestro3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDominioMaestro1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idParametro">
    private GestorBusquedaReferencia gestorBusquedaIdParametro = null;

    private boolean funcionSelectEjecutableIdParametro = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdParametro() {
        if (this.gestorBusquedaIdParametro == null) {
            this.gestorBusquedaIdParametro = new GestorBusquedaReferencia(
                    bean.getPaginaDataProvider(),
                    bean.getParametroReferenceDataProvider(),
                    PaginaCachedRowSetDataProvider2.COLUMNA_ID_PARAMETRO,
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
            return STP.getString(bean.getPaginaDataProvider().getIdParametro(rowKey));
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
            return STP.getString(bean.getPaginaDataProvider().getIdParametro(rowKey));
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
//      Long id = bean.getPaginaDataProvider().getIdParametro(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsPublica1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoPagina1() {
        return JSF.getListaOpciones(EnumTipoPagina.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getEsPublica(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getEsPublica(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroTipoPagina() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoPagina() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoPaginaTabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.TABLA.intValue());
    }

    public boolean isNumeroTipoPaginaDetalle() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.DETALLE.intValue());
    }

    public boolean isNumeroTipoPaginaArbol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.ARBOL.intValue());
    }

    public boolean isNumeroTipoPaginaComando() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.COMANDO.intValue());
    }

    public boolean isNumeroTipoPaginaConsultaTabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.CONSULTA_TABLA.intValue());
    }

    public boolean isNumeroTipoPaginaConsultaDetalle() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.CONSULTA_DETALLE.intValue());
    }

    public boolean isNumeroTipoPaginaConsultaArbol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaDataProvider().getNumeroTipoPagina(rowKey);
        return value != null && value.equals(EnumTipoPagina.CONSULTA_ARBOL.intValue());
    }

    public boolean isGridIdPaginaRendered() {
        return true;
    }

    public boolean isGridCodigoPaginaRendered() {
        return true;
    }

    public boolean isGridNombrePaginaRendered() {
        return true;
    }

    public boolean isGridDescripcionPaginaRendered() {
        return true;
    }

    public boolean isGridUrlPaginaRendered() {
        return true;
    }

    public boolean isGridIdAplicacionRendered() {
        return true;
    }

    public boolean isGridEsPublicaRendered() {
        return true;
    }

    public boolean isGridNumeroTipoPaginaRendered() {
        return true;
    }

    public boolean isGridIdDominioRendered() {
        return true;
    }

    public boolean isGridIdDominioMaestroRendered() {
        return true;
    }

    public boolean isGridIdParametroRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
