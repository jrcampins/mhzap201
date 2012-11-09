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

import com.egt.data.general.xdp2.RolPaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionRolPaginaPorRol {

    private PaginaActualizacionRolPaginaPorRol bean;

    public AsistentePaginaActualizacionRolPaginaPorRol() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolPaginaPorRol(PaginaActualizacionRolPaginaPorRol bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolPaginaCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL_PAGINA, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPagina">
    private GestorBusquedaReferencia gestorBusquedaIdPagina = null;

    private boolean funcionSelectEjecutableIdPagina = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPagina() {
        if (this.gestorBusquedaIdPagina == null) {
            this.gestorBusquedaIdPagina = new GestorBusquedaReferencia(
                    bean.getRolPaginaDataProvider(),
                    bean.getPaginaReferenceDataProvider(),
                    RolPaginaCachedRowSetDataProvider2.COLUMNA_ID_PAGINA,
                    this.funcionSelectEjecutableIdPagina);
        }
        return this.gestorBusquedaIdPagina;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPagina() {
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
        columna = PaginaCachedRowSetDataProvider2.COLUMNA_ID_PAGINA;
        comparacion = EnumOperadorCom.ESTA_ENTRE;
        string = "select id_pagina from pagina p, aplicacion a where numero_tipo_pagina not in (2,6) and id_dominio_maestro is null and p.id_aplicacion=a.id_aplicacion and a.es_publica=0 and id_grupo_aplicacion>200";
        string = STP.getStringSqlParametrizado(string, array.toArray());
        filtro.addCriterio(columna, comparacion, string);
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
            return STP.getString(bean.getRolPaginaDataProvider().getIdPagina(rowKey));
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
            return STP.getString(bean.getRolPaginaDataProvider().getIdPagina(rowKey));
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
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_PAGINA;
        Long id = bean.getRolPaginaDataProvider().getIdPagina(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolPaginaRendered() {
        return true;
    }

    public boolean isGridIdPaginaRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
