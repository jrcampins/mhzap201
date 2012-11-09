/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.web.conjunto.segmento;

import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.util.STP;
import com.egt.data.general.xdp2.ElementoSegmentoCachedRowSetDataProvider2;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento {

    private PaginaActualizacionElementoSegmentoPorConjuntoSegmento bean;

    public AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento(PaginaActualizacionElementoSegmentoPorConjuntoSegmento bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        return new Option[]{ //
                // Al implementar PaginaActualizacionConEdicionMultiple esta lista deberia incluir al menos 2 funciones
                // new Option("", bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion()),
                // new Option(ElementoSegmentoCachedRowSetDataProvider2.FUNCION_MODIFICAR_ELEMENTO_SEGMENTO, BundleWebui.getString("editar")),
                // new Option(ElementoSegmentoCachedRowSetDataProvider2.FUNCION_DESACTIVAR_ELEMENTO_SEGMENTO, BundleWebui.getString("desactivar")),
                // new Option(ElementoSegmentoCachedRowSetDataProvider2.FUNCION_REACTIVAR_ELEMENTO_SEGMENTO, BundleWebui.getString("reactivar"))
                };
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idSegmento">
    private GestorBusquedaReferencia gestorBusquedaIdRecurso = null;

    /* se consulta en posrefrescar */
    private boolean funcionSelectEjecutableIdRecurso = false;

    protected GestorBusquedaReferencia getGestorBusquedaIdRecurso() {
        if (this.gestorBusquedaIdRecurso == null) {
            this.gestorBusquedaIdRecurso = new GestorBusquedaReferencia(
                    bean.getElementoSegmentoDataProvider(),
                    bean.getListaRecursoReferenceDataProvider(),
                    ElementoSegmentoCachedRowSetDataProvider2.COLUMNA_ID_SEGMENTO,
                    this.funcionSelectEjecutableIdRecurso);
        }
        return this.gestorBusquedaIdRecurso;
    }

    private FiltroBusqueda filtroBusquedaIdRecurso = null;

    protected FiltroBusqueda getFiltroBusquedaIdRecurso() {
        this.filtroBusquedaIdRecurso = new FiltroBusqueda();
        return this.filtroBusquedaIdRecurso;
    }

    public void campoIdRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdRecurso());
        this.getGestorBusquedaIdRecurso().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdRecurso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getElementoSegmentoDataProvider().getIdSegmento(rowKey));
        }
        this.getGestorBusquedaIdRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdRecurso());
        return this.getGestorBusquedaIdRecurso().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdRecurso1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdRecurso().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdRecurso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getElementoSegmentoDataProvider().getIdSegmento(rowKey));
        }
        this.getGestorBusquedaIdRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdRecurso());
        return this.getGestorBusquedaIdRecurso().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdRecurso1Boton1() {
        if (bean == null) {
            return null;
        }
        String script = null;
        if (bean.getListaRecursoReferenceDataProvider().getRowCount() > 0) {
            long funcion = bean.getListaRecursoReferenceDataProvider().getFuncionSelect();
            String campo = bean.getCampoIdRecurso1().getClientId(bean.getFacesContext());
            String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
            script = bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
        }
//      bean.getGestor().track("getScriptCampoIdRecurso1Boton1", script);
        return script;
    }

    public String getScriptCampoIdRecurso1Boton2() {
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    // </editor-fold>
}
