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

import com.egt.base.constants.CPP;
import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.util.STP;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class AsistentePaginaActualizacionConjuntoSegmento {

    private PaginaActualizacionConjuntoSegmento bean;

    public AsistentePaginaActualizacionConjuntoSegmento() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionConjuntoSegmento(PaginaActualizacionConjuntoSegmento bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        return new Option[]{ //
                // Al implementar PaginaActualizacionConEdicionMultiple esta lista deberia incluir al menos 2 funciones
                // new Option("", bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion()),
                // new Option(ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_MODIFICAR_CONJUNTO_SEGMENTO, BundleWebui.getString("editar")),
                // new Option(ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_DESACTIVAR_CONJUNTO_SEGMENTO, BundleWebui.getString("desactivar")),
                // new Option(ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_REACTIVAR_CONJUNTO_SEGMENTO, BundleWebui.getString("reactivar"))
                };
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecurso">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecurso = null;

    private boolean funcionSelectEjecutableIdClaseRecurso = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecurso() {
        if (this.gestorBusquedaIdClaseRecurso == null) {
            this.gestorBusquedaIdClaseRecurso = new GestorBusquedaReferencia(
                    bean.getConjuntoSegmentoDataProvider(),
                    bean.getClaseRecursoReferenceDataProvider(),
                    ConjuntoSegmentoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO,
                    this.funcionSelectEjecutableIdClaseRecurso);
        }
        return this.gestorBusquedaIdClaseRecurso;
    }

    private FiltroBusqueda filtroBusquedaIdClaseRecurso = null;

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecurso() {
        this.filtroBusquedaIdClaseRecurso = new FiltroBusqueda();
//      this.filtroBusquedaIdClaseRecurso.addCriterio(ClaseRecursoCachedRowSetDataProvider2.COLUMNA_NUMERO_TIPO_RECURSO, EnumTipoRecurso.GESTION_MANUAL.intValue());
        this.filtroBusquedaIdClaseRecurso.addCriterio(ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_FUNCION_SELECCION, false);
        // <editor-fold defaultstate="collapsed">
//      String expresion = "SELECT 1 FROM funcion,dominio_parametro WHERE";
//      expresion += "(funcion.id_funcion=clase_recurso.id_funcion_seleccion)AND";
//      expresion += "(dominio_parametro.id_dominio=funcion.id_dominio)AND";
//      expresion += "(dominio_parametro.numero_tipo_parametro_dom=" + EnumTipoParametroDom.CODIGO.intValue() + ")";
//      this.filtroBusquedaIdClaseRecurso.addCriterio(true, expresion);
//      String expresion = "SELECT id_funcion_seleccion FROM dominio,dominio_parametro WHERE";
//      expresion += "(dominio_parametro.id_dominio=dominio.id_dominio)AND";
//      expresion += "(id_funcion_seleccion IS NOT NULL)AND";
//      expresion += "(numero_tipo_dominio=" + EnumTipoDominio.TABLA.intValue() + ")AND";
//      expresion += "(numero_tipo_parametro_dom=" + EnumTipoParametroDom.CODIGO.intValue() + ")";
//      this.filtroBusquedaIdClaseRecurso.addCriterio(ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_FUNCION_SELECCION, EnumOperadorCom.ESTA_ENTRE, expresion);
        // </editor-fold>
        String expresion = "SELECT id_clase_recurso_segmento FROM clase_recurso WHERE id_clase_recurso_segmento IS NOT NULL";
        this.filtroBusquedaIdClaseRecurso.addCriterio(ClaseRecursoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO, EnumOperadorCom.ESTA_ENTRE, expresion);
        return this.filtroBusquedaIdClaseRecurso;
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
            return STP.getString(bean.getConjuntoSegmentoDataProvider().getIdClaseRecurso(rowKey));
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
            return STP.getString(bean.getConjuntoSegmentoDataProvider().getIdClaseRecurso(rowKey));
        }
        this.getGestorBusquedaIdClaseRecurso().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecurso());
        return this.getGestorBusquedaIdClaseRecurso().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecurso1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
        String urx = URX2.LISTA_RECURSOS;
        String campo = bean.getCampoIdClaseRecurso1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        ListaParametros rpl = new ListaParametros();
        rpl.addParametro(CPP.ID_FUNCION_REFERENCIA, Long.valueOf(funcion));
        rpl.addParametro(FiltroBusqueda.class.getSimpleName(), this.getFiltroBusquedaIdClaseRecurso().toString());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, campo, boton, rpl);
    }

    public String getScriptCampoIdClaseRecurso1Boton2() {
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    // </editor-fold>
}
