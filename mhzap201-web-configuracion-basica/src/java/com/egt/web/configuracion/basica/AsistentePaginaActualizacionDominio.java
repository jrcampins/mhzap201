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

import com.egt.base.enums.EnumTipoDominio;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaqueteCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionDominio {

    private PaginaActualizacionDominio bean;

    public AsistentePaginaActualizacionDominio() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionDominio(PaginaActualizacionDominio bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(DominioCachedRowSetDataProvider2.FUNCION_MODIFICAR_DOMINIO, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecurso">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecurso = null;

    private boolean funcionSelectEjecutableIdClaseRecurso = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecurso() {
        if (this.gestorBusquedaIdClaseRecurso == null) {
            this.gestorBusquedaIdClaseRecurso = new GestorBusquedaReferencia(
                    bean.getDominioDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    DominioCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO,
                    this.funcionSelectEjecutableIdClaseRecurso);
        }
        return this.gestorBusquedaIdClaseRecurso;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecurso() {
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

    public void campoIdClaseRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecurso());
        this.getGestorBusquedaIdClaseRecurso().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecurso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdClaseRecurso(rowKey));
        }
        this.getGestorBusquedaIdClaseRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecurso());
        return this.getGestorBusquedaIdClaseRecurso().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecurso1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecurso().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecurso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdClaseRecurso(rowKey));
        }
        this.getGestorBusquedaIdClaseRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecurso());
        return this.getGestorBusquedaIdClaseRecurso().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecurso1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String campo = bean.getCampoIdClaseRecurso1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecurso());
    }

    public String getScriptCampoIdClaseRecurso1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO;
//      Long id = bean.getDominioDataProvider().getIdClaseRecurso(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecurso1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecurso1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecurso1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecurso1Panel2Rendered() {
        return isCampoIdClaseRecurso1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecurso3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecurso1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionSeleccion">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionSeleccion = null;

    private boolean funcionSelectEjecutableIdFuncionSeleccion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionSeleccion() {
        if (this.gestorBusquedaIdFuncionSeleccion == null) {
            this.gestorBusquedaIdFuncionSeleccion = new GestorBusquedaReferencia(
                    bean.getDominioDataProvider(),
                    bean.getFuncionReferenceDataProvider(),
                    DominioCachedRowSetDataProvider2.COLUMNA_ID_FUNCION_SELECCION,
                    this.funcionSelectEjecutableIdFuncionSeleccion);
        }
        return this.gestorBusquedaIdFuncionSeleccion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionSeleccion() {
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

    public void campoIdFuncionSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionSeleccion());
        this.getGestorBusquedaIdFuncionSeleccion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionSeleccion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdFuncionSeleccion(rowKey));
        }
        this.getGestorBusquedaIdFuncionSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionSeleccion());
        return this.getGestorBusquedaIdFuncionSeleccion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionSeleccion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionSeleccion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionSeleccion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdFuncionSeleccion(rowKey));
        }
        this.getGestorBusquedaIdFuncionSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionSeleccion());
        return this.getGestorBusquedaIdFuncionSeleccion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionSeleccion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCION;
        String campo = bean.getCampoIdFuncionSeleccion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdFuncionSeleccion());
    }

    public String getScriptCampoIdFuncionSeleccion1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_FUNCION;
//      Long id = bean.getDominioDataProvider().getIdFuncionSeleccion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdFuncionSeleccion1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionSeleccion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionSeleccion1Boton2Rendered();
    }

    public boolean isCampoIdFuncionSeleccion1Panel2Rendered() {
        return isCampoIdFuncionSeleccion1Boton2Rendered();
    }

    public boolean isTableColumnIdFuncionSeleccion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionSeleccion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDominioSegmento">
    private GestorBusquedaReferencia gestorBusquedaIdDominioSegmento = null;

    private boolean funcionSelectEjecutableIdDominioSegmento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDominioSegmento() {
        if (this.gestorBusquedaIdDominioSegmento == null) {
            this.gestorBusquedaIdDominioSegmento = new GestorBusquedaReferencia(
                    bean.getDominioDataProvider(),
                    bean.getDominioReferenceDataProvider(),
                    DominioCachedRowSetDataProvider2.COLUMNA_ID_DOMINIO_SEGMENTO,
                    this.funcionSelectEjecutableIdDominioSegmento);
        }
        return this.gestorBusquedaIdDominioSegmento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDominioSegmento() {
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

    public void campoIdDominioSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominioSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdDominioSegmento());
        this.getGestorBusquedaIdDominioSegmento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDominioSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdDominioSegmento(rowKey));
        }
        this.getGestorBusquedaIdDominioSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdDominioSegmento());
        return this.getGestorBusquedaIdDominioSegmento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDominioSegmento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDominioSegmento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDominioSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdDominioSegmento(rowKey));
        }
        this.getGestorBusquedaIdDominioSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdDominioSegmento());
        return this.getGestorBusquedaIdDominioSegmento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDominioSegmento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = DominioCachedRowSetDataProvider2.FUNCION_CONSULTAR_DOMINIO;
        String campo = bean.getCampoIdDominioSegmento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdDominioSegmento());
    }

    public String getScriptCampoIdDominioSegmento1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_DOMINIO;
//      Long id = bean.getDominioDataProvider().getIdDominioSegmento(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdDominioSegmento1Boton2Rendered() {
        return bean == null ? true : bean.getDominioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDominioSegmento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDominioSegmento1Boton2Rendered();
    }

    public boolean isCampoIdDominioSegmento1Panel2Rendered() {
        return isCampoIdDominioSegmento1Boton2Rendered();
    }

    public boolean isTableColumnIdDominioSegmento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDominioSegmento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPaquete">
    private GestorBusquedaReferencia gestorBusquedaIdPaquete = null;

    private boolean funcionSelectEjecutableIdPaquete = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPaquete() {
        if (this.gestorBusquedaIdPaquete == null) {
            this.gestorBusquedaIdPaquete = new GestorBusquedaReferencia(
                    bean.getDominioDataProvider(),
                    bean.getPaqueteReferenceDataProvider(),
                    DominioCachedRowSetDataProvider2.COLUMNA_ID_PAQUETE,
                    this.funcionSelectEjecutableIdPaquete);
        }
        return this.gestorBusquedaIdPaquete;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPaquete() {
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

    public void campoIdPaquete1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        this.getGestorBusquedaIdPaquete().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPaquete1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdPaquete(rowKey));
        }
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        return this.getGestorBusquedaIdPaquete().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPaquete1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaquete().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPaquete1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioDataProvider().getIdPaquete(rowKey));
        }
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        return this.getGestorBusquedaIdPaquete().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPaquete1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PaqueteCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAQUETE;
        String campo = bean.getCampoIdPaquete1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdPaquete());
    }

    public String getScriptCampoIdPaquete1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PAQUETE;
//      Long id = bean.getDominioDataProvider().getIdPaquete(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdPaquete1Boton2Rendered() {
        return bean == null ? true : bean.getPaqueteReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPaquete1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPaquete1Boton2Rendered();
    }

    public boolean isCampoIdPaquete1Panel2Rendered() {
        return isCampoIdPaquete1Boton2Rendered();
    }

    public boolean isTableColumnIdPaquete3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPaquete1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoDominio1() {
        return JSF.getListaOpciones(EnumTipoDominio.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoDominio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioDataProvider().getNumeroTipoDominio(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoDominio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioDataProvider().getNumeroTipoDominio(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoDominioTabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioDataProvider().getNumeroTipoDominio(rowKey);
        return value != null && value.equals(EnumTipoDominio.TABLA.intValue());
    }

    public boolean isNumeroTipoDominioVista() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioDataProvider().getNumeroTipoDominio(rowKey);
        return value != null && value.equals(EnumTipoDominio.VISTA.intValue());
    }

    public boolean isGridIdDominioRendered() {
        return true;
    }

    public boolean isGridCodigoDominioRendered() {
        return true;
    }

    public boolean isGridNombreDominioRendered() {
        return true;
    }

    public boolean isGridDescripcionDominioRendered() {
        return true;
    }

    public boolean isGridNombreTablaRendered() {
        return true;
    }

    public boolean isGridNumeroTipoDominioRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoRendered() {
        return true;
    }

    public boolean isGridIdFuncionSeleccionRendered() {
        return true;
    }

    public boolean isGridIdDominioSegmentoRendered() {
        return true;
    }

    public boolean isGridIdPaqueteRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
