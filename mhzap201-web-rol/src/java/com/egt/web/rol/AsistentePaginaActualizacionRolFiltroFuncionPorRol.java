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

import com.egt.data.general.xdp2.RolFiltroFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FiltroFuncionCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionRolFiltroFuncionPorRol {

    private PaginaActualizacionRolFiltroFuncionPorRol bean;

    public AsistentePaginaActualizacionRolFiltroFuncionPorRol() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolFiltroFuncionPorRol(PaginaActualizacionRolFiltroFuncionPorRol bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolFiltroFuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL_FILTRO_FUNCION, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFiltroFuncion">
    private GestorBusquedaReferencia gestorBusquedaIdFiltroFuncion = null;

    private boolean funcionSelectEjecutableIdFiltroFuncion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFiltroFuncion() {
        if (this.gestorBusquedaIdFiltroFuncion == null) {
            this.gestorBusquedaIdFiltroFuncion = new GestorBusquedaReferencia(
                    bean.getRolFiltroFuncionDataProvider(),
                    bean.getFiltroFuncionReferenceDataProvider(),
                    RolFiltroFuncionCachedRowSetDataProvider2.COLUMNA_ID_FILTRO_FUNCION,
                    this.funcionSelectEjecutableIdFiltroFuncion);
        }
        return this.gestorBusquedaIdFiltroFuncion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFiltroFuncion() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = FiltroFuncionCachedRowSetDataProvider2.COLUMNA_ID_USUARIO;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = TLC.getControlador().getUsuario().getIdUsuario();
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdFiltroFuncion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFiltroFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFiltroFuncion());
        this.getGestorBusquedaIdFiltroFuncion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFiltroFuncion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFiltroFuncionDataProvider().getIdFiltroFuncion(rowKey));
        }
        this.getGestorBusquedaIdFiltroFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFiltroFuncion());
        return this.getGestorBusquedaIdFiltroFuncion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFiltroFuncion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFiltroFuncion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFiltroFuncion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolFiltroFuncionDataProvider().getIdFiltroFuncion(rowKey));
        }
        this.getGestorBusquedaIdFiltroFuncion().setFiltroBusqueda(this.getFiltroBusquedaIdFiltroFuncion());
        return this.getGestorBusquedaIdFiltroFuncion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFiltroFuncion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FiltroFuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_FILTRO_FUNCION;
        String campo = bean.getCampoIdFiltroFuncion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdFiltroFuncion());
    }

    public String getScriptCampoIdFiltroFuncion1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_FILTRO_FUNCION;
//      Long id = bean.getRolFiltroFuncionDataProvider().getIdFiltroFuncion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdFiltroFuncion1Boton2Rendered() {
        return bean == null ? true : bean.getFiltroFuncionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFiltroFuncion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFiltroFuncion1Boton2Rendered();
    }

    public boolean isCampoIdFiltroFuncion1Panel2Rendered() {
        return isCampoIdFiltroFuncion1Boton2Rendered();
    }

    public boolean isTableColumnIdFiltroFuncion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFiltroFuncion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolFiltroFuncionRendered() {
        return true;
    }

    public boolean isGridIdFiltroFuncionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
