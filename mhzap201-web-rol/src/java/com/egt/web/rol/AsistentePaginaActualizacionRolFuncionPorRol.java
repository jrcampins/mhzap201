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
package com.egt.web.rol;

import com.egt.data.general.xdp2.RolFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionRolFuncionPorRol {

    private PaginaActualizacionRolFuncionPorRol bean;

    public AsistentePaginaActualizacionRolFuncionPorRol() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolFuncionPorRol(PaginaActualizacionRolFuncionPorRol bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolFuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL_FUNCION, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncion">
    private GestorBusquedaReferencia gestorBusquedaIdFuncion = null;

    private boolean funcionSelectEjecutableIdFuncion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncion() {
        if (this.gestorBusquedaIdFuncion == null) {
            this.gestorBusquedaIdFuncion = new GestorBusquedaReferencia(
                    bean.getRolFuncionDataProvider(),
                    bean.getFuncionReferenceDataProvider(),
                    RolFuncionCachedRowSetDataProvider2.COLUMNA_ID_FUNCION,
                    this.funcionSelectEjecutableIdFuncion);
        }
        return this.gestorBusquedaIdFuncion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncion() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        array.clear();
        columna = FuncionCachedRowSetDataProvider2.COLUMNA_ID_FUNCION;
        comparacion = EnumOperadorCom.ESTA_ENTRE;
        string = "select id_funcion from funcion f, dominio d, clase_recurso c where es_programatica=0 and (es_publica=0 or es_segmentada=1) and f.id_dominio=d.id_dominio and d.id_clase_recurso=c.id_clase_recurso and id_grupo_aplicacion>200";
        string = STP.getStringSqlParametrizado(string, array.toArray());
        filtro.addCriterio(columna, comparacion, string);
        return filtro;
    }

    public void campoIdFuncion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncion());
        this.getGestorBusquedaIdFuncion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFuncionDataProvider().getIdFuncion(rowKey));
        }
        this.getGestorBusquedaIdFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncion());
        return this.getGestorBusquedaIdFuncion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFuncionDataProvider().getIdFuncion(rowKey));
        }
        this.getGestorBusquedaIdFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFuncion());
        return this.getGestorBusquedaIdFuncion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCION;
        String campo = bean.getCampoIdFuncion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdFuncion());
    }

    public String getScriptCampoIdFuncion1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_FUNCION;
        Long id = bean.getRolFuncionDataProvider().getIdFuncion(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncion1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncion1Boton2Rendered();
    }

    public boolean isCampoIdFuncion1Panel2Rendered() {
        return isCampoIdFuncion1Boton2Rendered();
    }

    public boolean isTableColumnIdFuncion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idConjuntoSegmento">
    private GestorBusquedaReferencia gestorBusquedaIdConjuntoSegmento = null;

    private boolean funcionSelectEjecutableIdConjuntoSegmento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdConjuntoSegmento() {
        if (this.gestorBusquedaIdConjuntoSegmento == null) {
            this.gestorBusquedaIdConjuntoSegmento = new GestorBusquedaReferencia(
                    bean.getRolFuncionDataProvider(),
                    bean.getConjuntoSegmentoReferenceDataProvider(),
                    RolFuncionCachedRowSetDataProvider2.COLUMNA_ID_CONJUNTO_SEGMENTO,
                    this.funcionSelectEjecutableIdConjuntoSegmento);
        }
        return this.gestorBusquedaIdConjuntoSegmento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdConjuntoSegmento() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        array.clear();
        array.add(bean.getRolFuncionDataProvider().getIdFuncion(rowKey));
        columna = ConjuntoSegmentoCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO;
        comparacion = EnumOperadorCom.ESTA_ENTRE;
        string = "select id_clase_recurso_segmento from funcion f, dominio d, clase_recurso c where es_segmentada=1 and f.id_dominio=d.id_dominio and d.id_clase_recurso=c.id_clase_recurso and id_clase_recurso_segmento is not null and id_funcion={0}";
        string = STP.getStringSqlParametrizado(string, array.toArray());
        filtro.addCriterio(columna, comparacion, string);
        return filtro;
    }

    public void campoIdConjuntoSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdConjuntoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdConjuntoSegmento());
        this.getGestorBusquedaIdConjuntoSegmento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdConjuntoSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFuncionDataProvider().getIdConjuntoSegmento(rowKey));
        }
        this.getGestorBusquedaIdConjuntoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdConjuntoSegmento());
        return this.getGestorBusquedaIdConjuntoSegmento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdConjuntoSegmento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdConjuntoSegmento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdConjuntoSegmento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFuncionDataProvider().getIdConjuntoSegmento(rowKey));
        }
        this.getGestorBusquedaIdConjuntoSegmento().setFiltroBusqueda(this.getFiltroBusquedaIdConjuntoSegmento());
        return this.getGestorBusquedaIdConjuntoSegmento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdConjuntoSegmento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CONJUNTO_SEGMENTO;
        String campo = bean.getCampoIdConjuntoSegmento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdConjuntoSegmento());
    }

    public String getScriptCampoIdConjuntoSegmento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_CONJUNTO_SEGMENTO;
        Long id = bean.getRolFuncionDataProvider().getIdConjuntoSegmento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdConjuntoSegmento1Boton2Rendered() {
        return bean == null ? true : bean.getConjuntoSegmentoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdConjuntoSegmento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdConjuntoSegmento1Boton2Rendered();
    }

    public boolean isCampoIdConjuntoSegmento1Panel2Rendered() {
        return isCampoIdConjuntoSegmento1Boton2Rendered();
    }

    public boolean isTableColumnIdConjuntoSegmento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdConjuntoSegmento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolFuncionRendered() {
        return true;
    }

    public boolean isGridIdFuncionRendered() {
        return true;
    }

    public boolean isGridIdConjuntoSegmentoRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
