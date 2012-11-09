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
package com.egt.web;

import com.egt.data.general.xdp2.FavoritosCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.UsuarioCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.constants.Global;
import com.egt.core.jsf.JSF;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class AsistentePaginaActualizacionFavoritos {

    private PaginaActualizacionFavoritos bean;

    public AsistentePaginaActualizacionFavoritos() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionFavoritos(PaginaActualizacionFavoritos bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        return new Option[]{};
    }

    public Option[] getOpcionesListaFuncionAccion() {
        return new Option[]{};
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
        long f = bean.getRecursoDataProvider().getFuncionBusinessProcess();
        boolean b = bean.getRecursoDataProvider().esFilaAutorizada(rowKey, f);
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPagina">
    private GestorBusquedaReferencia gestorBusquedaIdPagina = null;

    private boolean funcionSelectEjecutableIdPagina = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPagina() {
        if (this.gestorBusquedaIdPagina == null) {
            this.gestorBusquedaIdPagina = new GestorBusquedaReferencia(
                    bean.getPaginaUsuarioDataProvider(),
                    bean.getPaginaReferenceDataProvider(),
                    FavoritosCachedRowSetDataProvider2.COLUMNA_ID_PAGINA,
                    this.funcionSelectEjecutableIdPagina);
        }
        return this.gestorBusquedaIdPagina;
    }

    private FiltroBusqueda filtroBusquedaIdPagina = null;

    protected FiltroBusqueda getFiltroBusquedaIdPagina() {
        this.filtroBusquedaIdPagina = new FiltroBusqueda();
        /*
        this.filtroBusquedaIdPagina.addCriterio(...)
         */
        return this.filtroBusquedaIdPagina;
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
        String urx = URX2.TABLA_PAGINA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPagina());
    }

    public String getScriptCampoIdPagina1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = bean.getPaginaUsuarioDataProvider().getUrlAplicacion(rowKey) + bean.getPaginaUsuarioDataProvider().getUrlPagina(rowKey);
        return bean.getGestor().getScriptAbrirVentana(urx, 0L);
    }

    public String getUrlCampoIdPagina1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = bean.getPaginaUsuarioDataProvider().getUrlAplicacion(rowKey) + bean.getPaginaUsuarioDataProvider().getUrlPagina(rowKey);
        String url = URX2.REDIRECT + "?url=" + JSF.encodeURX(urx);
        return url;
    }

    public boolean isCampoIdPagina1Boton2Rendered() {
        return bean == null ? true : bean.getPaginaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPagina1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPagina1Boton2Rendered();
    }

    public boolean isTableColumnIdPagina3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPagina1Boton3Rendered();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private GestorBusquedaReferencia gestorBusquedaIdUsuario = null;

    private boolean funcionSelectEjecutableIdUsuario = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuario() {
        if (this.gestorBusquedaIdUsuario == null) {
            this.gestorBusquedaIdUsuario = new GestorBusquedaReferencia(
                    bean.getPaginaUsuarioDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    FavoritosCachedRowSetDataProvider2.COLUMNA_ID_USUARIO,
                    this.funcionSelectEjecutableIdUsuario);
        }
        return this.gestorBusquedaIdUsuario;
    }

    private FiltroBusqueda filtroBusquedaIdUsuario = null;

    protected FiltroBusqueda getFiltroBusquedaIdUsuario() {
        this.filtroBusquedaIdUsuario = new FiltroBusqueda();
        /*
        this.filtroBusquedaIdUsuario.addCriterio(...)
         */
        return this.filtroBusquedaIdUsuario;
    }

    public void campoIdUsuario1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        this.getGestorBusquedaIdUsuario().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuario1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        return this.getGestorBusquedaIdUsuario().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuario1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuario1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        return this.getGestorBusquedaIdUsuario().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuario1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuario1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.TABLA_USUARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_USUARIO;
        Long id = bean.getPaginaUsuarioDataProvider().getIdUsuario(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuario1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuario1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuario1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuario3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuario1Boton3Rendered();
    }
    // </editor-fold>

    public String getDefaultWindowName() {
        return Global.DEFAULT_WINDOW_NAME;
    }
}
