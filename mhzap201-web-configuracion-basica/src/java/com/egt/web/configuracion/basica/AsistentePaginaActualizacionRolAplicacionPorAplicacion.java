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

import com.egt.data.general.xdp2.RolAplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionRolAplicacionPorAplicacion {

    private PaginaActualizacionRolAplicacionPorAplicacion bean;

    public AsistentePaginaActualizacionRolAplicacionPorAplicacion() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolAplicacionPorAplicacion(PaginaActualizacionRolAplicacionPorAplicacion bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolAplicacionCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL_APLICACION, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idRol">
    private GestorBusquedaReferencia gestorBusquedaIdRol = null;

    private boolean funcionSelectEjecutableIdRol = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdRol() {
        if (this.gestorBusquedaIdRol == null) {
            this.gestorBusquedaIdRol = new GestorBusquedaReferencia(
                    bean.getRolAplicacionDataProvider(),
                    bean.getRolReferenceDataProvider(),
                    RolAplicacionCachedRowSetDataProvider2.COLUMNA_ID_ROL,
                    this.funcionSelectEjecutableIdRol);
        }
        return this.gestorBusquedaIdRol;
    }

    protected FiltroBusqueda getFiltroBusquedaIdRol() {
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

    public void campoIdRol1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdRol().setFiltroBusqueda(this.getFiltroBusquedaIdRol());
        this.getGestorBusquedaIdRol().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdRol1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolAplicacionDataProvider().getIdRol(rowKey));
        }
        this.getGestorBusquedaIdRol().setFiltroBusqueda(this.getFiltroBusquedaIdRol());
        return this.getGestorBusquedaIdRol().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdRol1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdRol().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdRol1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolAplicacionDataProvider().getIdRol(rowKey));
        }
        this.getGestorBusquedaIdRol().setFiltroBusqueda(this.getFiltroBusquedaIdRol());
        return this.getGestorBusquedaIdRol().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdRol1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = RolCachedRowSetDataProvider2.FUNCION_CONSULTAR_ROL;
        String campo = bean.getCampoIdRol1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdRol());
    }

    public String getScriptCampoIdRol1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_ROL;
        Long id = bean.getRolAplicacionDataProvider().getIdRol(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdRol1Boton2Rendered() {
        return bean == null ? true : bean.getRolReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdRol1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdRol1Boton2Rendered();
    }

    public boolean isCampoIdRol1Panel2Rendered() {
        return isCampoIdRol1Boton2Rendered();
    }

    public boolean isTableColumnIdRol3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdRol1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolAplicacionRendered() {
        return true;
    }

    public boolean isGridIdRolRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
