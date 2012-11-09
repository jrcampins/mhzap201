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
import com.egt.data.general.xdp3.OpcionMenuCachedRowSetDataProvider3;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionOpcionMenu {

    private PaginaActualizacionOpcionMenu bean;

    public AsistentePaginaActualizacionOpcionMenu() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionOpcionMenu(PaginaActualizacionOpcionMenu bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(OpcionMenuCachedRowSetDataProvider3.FUNCION_MODIFICAR_OPCION_MENU, BundleWebui.getString("editar"))
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
                    bean.getOpcionMenuDataProvider(),
                    bean.getAplicacionReferenceDataProvider(),
                    OpcionMenuCachedRowSetDataProvider3.COLUMNA_ID_APLICACION,
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
            return STP.getString(bean.getOpcionMenuDataProvider().getIdAplicacion(rowKey));
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
            return STP.getString(bean.getOpcionMenuDataProvider().getIdAplicacion(rowKey));
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
//      Long id = bean.getOpcionMenuDataProvider().getIdAplicacion(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPagina">
    private GestorBusquedaReferencia gestorBusquedaIdPagina = null;

    private boolean funcionSelectEjecutableIdPagina = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPagina() {
        if (this.gestorBusquedaIdPagina == null) {
            this.gestorBusquedaIdPagina = new GestorBusquedaReferencia(
                    bean.getOpcionMenuDataProvider(),
                    bean.getPaginaReferenceDataProvider(),
                    OpcionMenuCachedRowSetDataProvider3.COLUMNA_ID_PAGINA,
                    this.funcionSelectEjecutableIdPagina);
        }
        return this.gestorBusquedaIdPagina;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPagina() {
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

    public void campoIdPagina1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPagina().setFiltroBusqueda(this.getFiltroBusquedaIdPagina());
        this.getGestorBusquedaIdPagina().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPagina1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getOpcionMenuDataProvider().getIdPagina(rowKey));
        }
        this.getGestorBusquedaIdPagina().setFiltroBusqueda(this.getFiltroBusquedaIdPagina());
        return this.getGestorBusquedaIdPagina().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPagina1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPagina().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPagina1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getOpcionMenuDataProvider().getIdPagina(rowKey));
        }
        this.getGestorBusquedaIdPagina().setFiltroBusqueda(this.getFiltroBusquedaIdPagina());
        return this.getGestorBusquedaIdPagina().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPagina1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PaginaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAGINA;
        String campo = bean.getCampoIdPagina1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdPagina());
    }

    public String getScriptCampoIdPagina1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PAGINA;
//      Long id = bean.getOpcionMenuDataProvider().getIdPagina(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdPagina1Boton2Rendered() {
        return bean == null ? true : bean.getPaginaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPagina1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPagina1Boton2Rendered();
    }

    public boolean isCampoIdPagina1Panel2Rendered() {
        return isCampoIdPagina1Boton2Rendered();
    }

    public boolean isTableColumnIdPagina3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPagina1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idOpcionMenuSuperior">
    private GestorBusquedaReferencia gestorBusquedaIdOpcionMenuSuperior = null;

    private boolean funcionSelectEjecutableIdOpcionMenuSuperior = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdOpcionMenuSuperior() {
        if (this.gestorBusquedaIdOpcionMenuSuperior == null) {
            this.gestorBusquedaIdOpcionMenuSuperior = new GestorBusquedaReferencia(
                    bean.getOpcionMenuDataProvider(),
                    bean.getOpcionMenuReferenceDataProvider(),
                    OpcionMenuCachedRowSetDataProvider3.COLUMNA_ID_OPCION_MENU_SUPERIOR,
                    this.funcionSelectEjecutableIdOpcionMenuSuperior);
        }
        return this.gestorBusquedaIdOpcionMenuSuperior;
    }

    protected FiltroBusqueda getFiltroBusquedaIdOpcionMenuSuperior() {
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

    public void campoIdOpcionMenuSuperior1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdOpcionMenuSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdOpcionMenuSuperior());
        this.getGestorBusquedaIdOpcionMenuSuperior().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdOpcionMenuSuperior1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getOpcionMenuDataProvider().getIdOpcionMenuSuperior(rowKey));
        }
        this.getGestorBusquedaIdOpcionMenuSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdOpcionMenuSuperior());
        return this.getGestorBusquedaIdOpcionMenuSuperior().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdOpcionMenuSuperior1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdOpcionMenuSuperior().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdOpcionMenuSuperior1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getOpcionMenuDataProvider().getIdOpcionMenuSuperior(rowKey));
        }
        this.getGestorBusquedaIdOpcionMenuSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdOpcionMenuSuperior());
        return this.getGestorBusquedaIdOpcionMenuSuperior().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdOpcionMenuSuperior1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = OpcionMenuCachedRowSetDataProvider3.FUNCION_CONSULTAR_OPCION_MENU;
        String campo = bean.getCampoIdOpcionMenuSuperior1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdOpcionMenuSuperior());
    }

    public String getScriptCampoIdOpcionMenuSuperior1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_OPCION_MENU;
//      Long id = bean.getOpcionMenuDataProvider().getIdOpcionMenuSuperior(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdOpcionMenuSuperior1Boton2Rendered() {
        return bean == null ? true : bean.getOpcionMenuReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdOpcionMenuSuperior1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdOpcionMenuSuperior1Boton2Rendered();
    }

    public boolean isCampoIdOpcionMenuSuperior1Panel2Rendered() {
        return isCampoIdOpcionMenuSuperior1Boton2Rendered();
    }

    public boolean isTableColumnIdOpcionMenuSuperior3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdOpcionMenuSuperior1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsOpcionMenuInactiva1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsOpcionMenuSincronizada1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsOpcionMenuInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getOpcionMenuDataProvider().getEsOpcionMenuInactiva(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsOpcionMenuInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getOpcionMenuDataProvider().getEsOpcionMenuInactiva(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsOpcionMenuSincronizada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getOpcionMenuDataProvider().getEsOpcionMenuSincronizada(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsOpcionMenuSincronizada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getOpcionMenuDataProvider().getEsOpcionMenuSincronizada(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdOpcionMenuRendered() {
        return true;
    }

    public boolean isGridCodigoOpcionMenuRendered() {
        return true;
    }

    public boolean isGridNombreOpcionMenuRendered() {
        return true;
    }

    public boolean isGridDescripcionOpcionMenuRendered() {
        return true;
    }

    public boolean isGridUrlOpcionMenuRendered() {
        return true;
    }

    public boolean isGridIdAplicacionRendered() {
        return true;
    }

    public boolean isGridIdPaginaRendered() {
        return true;
    }

    public boolean isGridIdOpcionMenuSuperiorRendered() {
        return true;
    }

    public boolean isGridEsOpcionMenuInactivaRendered() {
        return true;
    }

    public boolean isGridEsOpcionMenuSincronizadaRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
