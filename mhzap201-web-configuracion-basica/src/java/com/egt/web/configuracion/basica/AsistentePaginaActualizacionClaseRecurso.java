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
import com.egt.base.enums.EnumTipoClaseRecurso;
import com.egt.base.enums.EnumTipoRecurso;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoAplicacionCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionClaseRecurso {

    private PaginaActualizacionClaseRecurso bean;

    public AsistentePaginaActualizacionClaseRecurso() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionClaseRecurso(PaginaActualizacionClaseRecurso bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(ClaseRecursoCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionSeleccion">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionSeleccion = null;

    private boolean funcionSelectEjecutableIdFuncionSeleccion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionSeleccion() {
        if (this.gestorBusquedaIdFuncionSeleccion == null) {
            this.gestorBusquedaIdFuncionSeleccion = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getFuncionReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_FUNCION_SELECCION,
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
            return STP.getString(bean.getClaseRecursoDataProvider().getIdFuncionSeleccion(rowKey));
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
            return STP.getString(bean.getClaseRecursoDataProvider().getIdFuncionSeleccion(rowKey));
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
//      Long id = bean.getClaseRecursoDataProvider().getIdFuncionSeleccion(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPaginaSeleccion">
    private GestorBusquedaReferencia gestorBusquedaIdPaginaSeleccion = null;

    private boolean funcionSelectEjecutableIdPaginaSeleccion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPaginaSeleccion() {
        if (this.gestorBusquedaIdPaginaSeleccion == null) {
            this.gestorBusquedaIdPaginaSeleccion = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getPaginaReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_PAGINA_SELECCION,
                    this.funcionSelectEjecutableIdPaginaSeleccion);
        }
        return this.gestorBusquedaIdPaginaSeleccion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPaginaSeleccion() {
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

    public void campoIdPaginaSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaginaSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaSeleccion());
        this.getGestorBusquedaIdPaginaSeleccion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPaginaSeleccion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdPaginaSeleccion(rowKey));
        }
        this.getGestorBusquedaIdPaginaSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaSeleccion());
        return this.getGestorBusquedaIdPaginaSeleccion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPaginaSeleccion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaginaSeleccion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPaginaSeleccion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdPaginaSeleccion(rowKey));
        }
        this.getGestorBusquedaIdPaginaSeleccion().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaSeleccion());
        return this.getGestorBusquedaIdPaginaSeleccion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPaginaSeleccion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PaginaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAGINA;
        String campo = bean.getCampoIdPaginaSeleccion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdPaginaSeleccion());
    }

    public String getScriptCampoIdPaginaSeleccion1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PAGINA;
//      Long id = bean.getClaseRecursoDataProvider().getIdPaginaSeleccion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdPaginaSeleccion1Boton2Rendered() {
        return bean == null ? true : bean.getPaginaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPaginaSeleccion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPaginaSeleccion1Boton2Rendered();
    }

    public boolean isCampoIdPaginaSeleccion1Panel2Rendered() {
        return isCampoIdPaginaSeleccion1Boton2Rendered();
    }

    public boolean isTableColumnIdPaginaSeleccion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPaginaSeleccion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPaginaDetalle">
    private GestorBusquedaReferencia gestorBusquedaIdPaginaDetalle = null;

    private boolean funcionSelectEjecutableIdPaginaDetalle = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPaginaDetalle() {
        if (this.gestorBusquedaIdPaginaDetalle == null) {
            this.gestorBusquedaIdPaginaDetalle = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getPaginaReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_PAGINA_DETALLE,
                    this.funcionSelectEjecutableIdPaginaDetalle);
        }
        return this.gestorBusquedaIdPaginaDetalle;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPaginaDetalle() {
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

    public void campoIdPaginaDetalle1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaginaDetalle().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaDetalle());
        this.getGestorBusquedaIdPaginaDetalle().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPaginaDetalle1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdPaginaDetalle(rowKey));
        }
        this.getGestorBusquedaIdPaginaDetalle().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaDetalle());
        return this.getGestorBusquedaIdPaginaDetalle().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPaginaDetalle1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaginaDetalle().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPaginaDetalle1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdPaginaDetalle(rowKey));
        }
        this.getGestorBusquedaIdPaginaDetalle().setFiltroBusqueda(this.getFiltroBusquedaIdPaginaDetalle());
        return this.getGestorBusquedaIdPaginaDetalle().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPaginaDetalle1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PaginaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAGINA;
        String campo = bean.getCampoIdPaginaDetalle1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdPaginaDetalle());
    }

    public String getScriptCampoIdPaginaDetalle1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PAGINA;
//      Long id = bean.getClaseRecursoDataProvider().getIdPaginaDetalle(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdPaginaDetalle1Boton2Rendered() {
        return bean == null ? true : bean.getPaginaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPaginaDetalle1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPaginaDetalle1Boton2Rendered();
    }

    public boolean isCampoIdPaginaDetalle1Panel2Rendered() {
        return isCampoIdPaginaDetalle1Boton2Rendered();
    }

    public boolean isTableColumnIdPaginaDetalle3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPaginaDetalle1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoMaestro">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoMaestro = null;

    private boolean funcionSelectEjecutableIdClaseRecursoMaestro = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoMaestro() {
        if (this.gestorBusquedaIdClaseRecursoMaestro == null) {
            this.gestorBusquedaIdClaseRecursoMaestro = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_MAESTRO,
                    this.funcionSelectEjecutableIdClaseRecursoMaestro);
        }
        return this.gestorBusquedaIdClaseRecursoMaestro;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoMaestro() {
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

    public void campoIdClaseRecursoMaestro1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoMaestro());
        this.getGestorBusquedaIdClaseRecursoMaestro().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoMaestro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoMaestro(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoMaestro());
        return this.getGestorBusquedaIdClaseRecursoMaestro().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoMaestro1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoMaestro().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoMaestro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoMaestro(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoMaestro().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoMaestro());
        return this.getGestorBusquedaIdClaseRecursoMaestro().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoMaestro1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String campo = bean.getCampoIdClaseRecursoMaestro1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoMaestro());
    }

    public String getScriptCampoIdClaseRecursoMaestro1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO;
//      Long id = bean.getClaseRecursoDataProvider().getIdClaseRecursoMaestro(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoMaestro1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoMaestro1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoMaestro1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoMaestro1Panel2Rendered() {
        return isCampoIdClaseRecursoMaestro1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoMaestro3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoMaestro1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoSegmento">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoSegmento = null;

    private boolean funcionSelectEjecutableIdClaseRecursoSegmento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoSegmento() {
        if (this.gestorBusquedaIdClaseRecursoSegmento == null) {
            this.gestorBusquedaIdClaseRecursoSegmento = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_SEGMENTO,
                    this.funcionSelectEjecutableIdClaseRecursoSegmento);
        }
        return this.gestorBusquedaIdClaseRecursoSegmento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoSegmento() {
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

    public void campoIdClaseRecursoSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSegmento());
        this.getGestorBusquedaIdClaseRecursoSegmento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoSegmento(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSegmento());
        return this.getGestorBusquedaIdClaseRecursoSegmento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoSegmento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoSegmento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoSegmento(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoSegmento());
        return this.getGestorBusquedaIdClaseRecursoSegmento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoSegmento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String campo = bean.getCampoIdClaseRecursoSegmento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoSegmento());
    }

    public String getScriptCampoIdClaseRecursoSegmento1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO;
//      Long id = bean.getClaseRecursoDataProvider().getIdClaseRecursoSegmento(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoSegmento1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoSegmento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoSegmento1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoSegmento1Panel2Rendered() {
        return isCampoIdClaseRecursoSegmento1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoSegmento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoSegmento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoBase">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoBase = null;

    private boolean funcionSelectEjecutableIdClaseRecursoBase = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoBase() {
        if (this.gestorBusquedaIdClaseRecursoBase == null) {
            this.gestorBusquedaIdClaseRecursoBase = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_BASE,
                    this.funcionSelectEjecutableIdClaseRecursoBase);
        }
        return this.gestorBusquedaIdClaseRecursoBase;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoBase() {
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

    public void campoIdClaseRecursoBase1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoBase().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoBase());
        this.getGestorBusquedaIdClaseRecursoBase().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoBase1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoBase(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoBase().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoBase());
        return this.getGestorBusquedaIdClaseRecursoBase().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoBase1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoBase().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoBase1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdClaseRecursoBase(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoBase().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoBase());
        return this.getGestorBusquedaIdClaseRecursoBase().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoBase1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String campo = bean.getCampoIdClaseRecursoBase1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoBase());
    }

    public String getScriptCampoIdClaseRecursoBase1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO;
//      Long id = bean.getClaseRecursoDataProvider().getIdClaseRecursoBase(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoBase1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoBase1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoBase1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoBase1Panel2Rendered() {
        return isCampoIdClaseRecursoBase1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoBase3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoBase1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idGrupoAplicacion">
    private GestorBusquedaReferencia gestorBusquedaIdGrupoAplicacion = null;

    private boolean funcionSelectEjecutableIdGrupoAplicacion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdGrupoAplicacion() {
        if (this.gestorBusquedaIdGrupoAplicacion == null) {
            this.gestorBusquedaIdGrupoAplicacion = new GestorBusquedaReferencia(
                    bean.getClaseRecursoDataProvider(),
                    bean.getGrupoAplicacionReferenceDataProvider(),
                    ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_GRUPO_APLICACION,
                    this.funcionSelectEjecutableIdGrupoAplicacion);
        }
        return this.gestorBusquedaIdGrupoAplicacion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdGrupoAplicacion() {
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

    public void campoIdGrupoAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdGrupoAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoAplicacion());
        this.getGestorBusquedaIdGrupoAplicacion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdGrupoAplicacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdGrupoAplicacion(rowKey));
        }
        this.getGestorBusquedaIdGrupoAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoAplicacion());
        return this.getGestorBusquedaIdGrupoAplicacion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdGrupoAplicacion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdGrupoAplicacion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdGrupoAplicacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getClaseRecursoDataProvider().getIdGrupoAplicacion(rowKey));
        }
        this.getGestorBusquedaIdGrupoAplicacion().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoAplicacion());
        return this.getGestorBusquedaIdGrupoAplicacion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdGrupoAplicacion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = GrupoAplicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_GRUPO_APLICACION;
        String campo = bean.getCampoIdGrupoAplicacion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdGrupoAplicacion());
    }

    public String getScriptCampoIdGrupoAplicacion1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_GRUPO_APLICACION;
//      Long id = bean.getClaseRecursoDataProvider().getIdGrupoAplicacion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdGrupoAplicacion1Boton2Rendered() {
        return bean == null ? true : bean.getGrupoAplicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdGrupoAplicacion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdGrupoAplicacion1Boton2Rendered();
    }

    public boolean isCampoIdGrupoAplicacion1Panel2Rendered() {
        return isCampoIdGrupoAplicacion1Boton2Rendered();
    }

    public boolean isTableColumnIdGrupoAplicacion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdGrupoAplicacion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsClaseRecursoIndependiente1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoSinDetalle1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoConArbol1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoClaseRecurso1() {
        return JSF.getListaOpciones(EnumTipoClaseRecurso.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoRecurso1() {
        return JSF.getListaOpciones(EnumTipoRecurso.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoInsertable1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoModificable1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoEliminable1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsClaseRecursoExtendida1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsEnumeradorConNumero1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsClaseRecursoIndependiente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoIndependiente(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoIndependiente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoIndependiente(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsClaseRecursoSinDetalle() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoSinDetalle(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoSinDetalle() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoSinDetalle(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsClaseRecursoConArbol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoConArbol(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoConArbol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoConArbol(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isNullNumeroTipoClaseRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoClaseRecurso(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoClaseRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoClaseRecurso(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoClaseRecursoTabla() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoClaseRecurso(rowKey);
        return value != null && value.equals(EnumTipoClaseRecurso.TABLA.intValue());
    }

    public boolean isNumeroTipoClaseRecursoVista() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoClaseRecurso(rowKey);
        return value != null && value.equals(EnumTipoClaseRecurso.VISTA.intValue());
    }

    public boolean isNullNumeroTipoRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoRecursoConfiguracionBasica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.CONFIGURACION_BASICA.intValue());
    }

    public boolean isNumeroTipoRecursoConfiguracionFija() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.CONFIGURACION_FIJA.intValue());
    }

    public boolean isNumeroTipoRecursoConfiguracionManual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.CONFIGURACION_MANUAL.intValue());
    }

    public boolean isNumeroTipoRecursoConfiguracionAutomatica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.CONFIGURACION_AUTOMATICA.intValue());
    }

    public boolean isNumeroTipoRecursoGestionManual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.GESTION_MANUAL.intValue());
    }

    public boolean isNumeroTipoRecursoGestionAutomatica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getNumeroTipoRecurso(rowKey);
        return value != null && value.equals(EnumTipoRecurso.GESTION_AUTOMATICA.intValue());
    }

   public boolean isEsClaseRecursoInsertable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoInsertable(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoInsertable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoInsertable(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsClaseRecursoModificable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoModificable(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoModificable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoModificable(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsClaseRecursoEliminable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoEliminable(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoEliminable() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoEliminable(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsClaseRecursoExtendida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoExtendida(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsClaseRecursoExtendida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsClaseRecursoExtendida(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsEnumeradorConNumero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsEnumeradorConNumero(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsEnumeradorConNumero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getClaseRecursoDataProvider().getEsEnumeradorConNumero(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdClaseRecursoRendered() {
        return true;
    }

    public boolean isGridCodigoClaseRecursoRendered() {
        return true;
    }

    public boolean isGridNombreClaseRecursoRendered() {
        return true;
    }

    public boolean isGridDescripcionClaseRecursoRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoIndependienteRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoSinDetalleRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoConArbolRendered() {
        return true;
    }

    public boolean isGridNumeroTipoClaseRecursoRendered() {
        return true;
    }

    public boolean isGridNumeroTipoRecursoRendered() {
        return true;
    }

    public boolean isGridIdFuncionSeleccionRendered() {
        return true;
    }

    public boolean isGridIdPaginaSeleccionRendered() {
        return true;
    }

    public boolean isGridIdPaginaDetalleRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoMaestroRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoSegmentoRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoBaseRendered() {
        return true;
    }

    public boolean isGridIdGrupoAplicacionRendered() {
        return true;
    }

    public boolean isGridIdAplicacionWebRendered() {
        return true;
    }

    public boolean isGridLimiteFilasConsultaRendered() {
        return true;
    }

    public boolean isGridLimiteFilasInformeRendered() {
        return true;
    }

    public boolean isGridOrdenPresentacionRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoInsertableRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoModificableRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoEliminableRendered() {
        return true;
    }

    public boolean isGridEsClaseRecursoExtendidaRendered() {
        return true;
    }

    public boolean isGridEtiquetaHipervinculoRendered() {
        return true;
    }

    public boolean isGridEsEnumeradorConNumeroRendered() {
        return true;
    }

    public boolean isGridAliasClaseRecursoRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
