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
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionAplicacion {

    private PaginaActualizacionAplicacion bean;

    public AsistentePaginaActualizacionAplicacion() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionAplicacion(PaginaActualizacionAplicacion bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(AplicacionCachedRowSetDataProvider2.FUNCION_MODIFICAR_APLICACION, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idGrupoAplicacion">
    private GestorBusquedaReferencia gestorBusquedaIdGrupoAplicacion = null;

    private boolean funcionSelectEjecutableIdGrupoAplicacion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdGrupoAplicacion() {
        if (this.gestorBusquedaIdGrupoAplicacion == null) {
            this.gestorBusquedaIdGrupoAplicacion = new GestorBusquedaReferencia(
                    bean.getAplicacionDataProvider(),
                    bean.getGrupoAplicacionReferenceDataProvider(),
                    AplicacionCachedRowSetDataProvider2.COLUMNA_ID_GRUPO_APLICACION,
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
            return STP.getString(bean.getAplicacionDataProvider().getIdGrupoAplicacion(rowKey));
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
            return STP.getString(bean.getAplicacionDataProvider().getIdGrupoAplicacion(rowKey));
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
//      Long id = bean.getAplicacionDataProvider().getIdGrupoAplicacion(rowKey);
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
    public Object getOpcionesListaEsPublica1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getAplicacionDataProvider().getEsPublica(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getAplicacionDataProvider().getEsPublica(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdAplicacionRendered() {
        return true;
    }

    public boolean isGridCodigoAplicacionRendered() {
        return true;
    }

    public boolean isGridNombreAplicacionRendered() {
        return true;
    }

    public boolean isGridDescripcionAplicacionRendered() {
        return true;
    }

    public boolean isGridServidorAplicacionRendered() {
        return true;
    }

    public boolean isGridPuertoAplicacionRendered() {
        return true;
    }

    public boolean isGridUrlAplicacionRendered() {
        return true;
    }

    public boolean isGridEsPublicaRendered() {
        return true;
    }

    public boolean isGridIdGrupoAplicacionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
