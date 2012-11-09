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
import com.egt.data.general.xdp2.PaginaFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionPaginaFuncionPorPagina {

    private PaginaActualizacionPaginaFuncionPorPagina bean;

    public AsistentePaginaActualizacionPaginaFuncionPorPagina() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionPaginaFuncionPorPagina(PaginaActualizacionPaginaFuncionPorPagina bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(PaginaFuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_PAGINA_FUNCION, BundleWebui.getString("editar"))
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
                    bean.getPaginaFuncionDataProvider(),
                    bean.getFuncionReferenceDataProvider(),
                    PaginaFuncionCachedRowSetDataProvider2.COLUMNA_ID_FUNCION,
                    this.funcionSelectEjecutableIdFuncion);
        }
        return this.gestorBusquedaIdFuncion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncion() {
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
            return STP.getString(bean.getPaginaFuncionDataProvider().getIdFuncion(rowKey));
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
            return STP.getString(bean.getPaginaFuncionDataProvider().getIdFuncion(rowKey));
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
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_FUNCION;
//      Long id = bean.getPaginaFuncionDataProvider().getIdFuncion(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsFuncionInicial1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsFuncionInicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaFuncionDataProvider().getEsFuncionInicial(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsFuncionInicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getPaginaFuncionDataProvider().getEsFuncionInicial(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdPaginaFuncionRendered() {
        return true;
    }

    public boolean isGridIdFuncionRendered() {
        return true;
    }

    public boolean isGridEsFuncionInicialRendered() {
        return true;
    }

    public boolean isGridControlPaginaFuncionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
