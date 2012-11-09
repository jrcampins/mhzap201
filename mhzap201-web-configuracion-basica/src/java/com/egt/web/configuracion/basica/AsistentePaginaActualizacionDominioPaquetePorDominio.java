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

import com.egt.data.general.xdp2.DominioPaqueteCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaqueteCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionDominioPaquetePorDominio {

    private PaginaActualizacionDominioPaquetePorDominio bean;

    public AsistentePaginaActualizacionDominioPaquetePorDominio() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionDominioPaquetePorDominio(PaginaActualizacionDominioPaquetePorDominio bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(DominioPaqueteCachedRowSetDataProvider2.FUNCION_MODIFICAR_DOMINIO_PAQUETE, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPaquete">
    private GestorBusquedaReferencia gestorBusquedaIdPaquete = null;

    private boolean funcionSelectEjecutableIdPaquete = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPaquete() {
        if (this.gestorBusquedaIdPaquete == null) {
            this.gestorBusquedaIdPaquete = new GestorBusquedaReferencia(
                    bean.getDominioPaqueteDataProvider(),
                    bean.getPaqueteReferenceDataProvider(),
                    DominioPaqueteCachedRowSetDataProvider2.COLUMNA_ID_PAQUETE,
                    this.funcionSelectEjecutableIdPaquete);
        }
        return this.gestorBusquedaIdPaquete;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPaquete() {
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

    public void campoIdPaquete1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        this.getGestorBusquedaIdPaquete().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPaquete1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioPaqueteDataProvider().getIdPaquete(rowKey));
        }
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        return this.getGestorBusquedaIdPaquete().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPaquete1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPaquete().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPaquete1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioPaqueteDataProvider().getIdPaquete(rowKey));
        }
        this.getGestorBusquedaIdPaquete().setFiltroBusqueda(this.getFiltroBusquedaIdPaquete());
        return this.getGestorBusquedaIdPaquete().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPaquete1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PaqueteCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAQUETE;
        String campo = bean.getCampoIdPaquete1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdPaquete());
    }

    public String getScriptCampoIdPaquete1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PAQUETE;
//      Long id = bean.getDominioPaqueteDataProvider().getIdPaquete(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdPaquete1Boton2Rendered() {
        return bean == null ? true : bean.getPaqueteReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPaquete1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPaquete1Boton2Rendered();
    }

    public boolean isCampoIdPaquete1Panel2Rendered() {
        return isCampoIdPaquete1Boton2Rendered();
    }

    public boolean isTableColumnIdPaquete3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPaquete1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdDominioPaqueteRendered() {
        return true;
    }

    public boolean isGridIdPaqueteRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
