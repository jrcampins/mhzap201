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

import com.egt.base.enums.EnumTipoParametroDom;
import com.egt.data.general.xdp2.DominioParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionDominioParametroPorDominio {

    private PaginaActualizacionDominioParametroPorDominio bean;

    public AsistentePaginaActualizacionDominioParametroPorDominio() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionDominioParametroPorDominio(PaginaActualizacionDominioParametroPorDominio bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(DominioParametroCachedRowSetDataProvider2.FUNCION_MODIFICAR_DOMINIO_PARAMETRO, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idParametro">
    private GestorBusquedaReferencia gestorBusquedaIdParametro = null;

    private boolean funcionSelectEjecutableIdParametro = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdParametro() {
        if (this.gestorBusquedaIdParametro == null) {
            this.gestorBusquedaIdParametro = new GestorBusquedaReferencia(
                    bean.getDominioParametroDataProvider(),
                    bean.getParametroReferenceDataProvider(),
                    DominioParametroCachedRowSetDataProvider2.COLUMNA_ID_PARAMETRO,
                    this.funcionSelectEjecutableIdParametro);
        }
        return this.gestorBusquedaIdParametro;
    }

    protected FiltroBusqueda getFiltroBusquedaIdParametro() {
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

    public void campoIdParametro1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        this.getGestorBusquedaIdParametro().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdParametro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioParametroDataProvider().getIdParametro(rowKey));
        }
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        return this.getGestorBusquedaIdParametro().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdParametro1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdParametro().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdParametro1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getDominioParametroDataProvider().getIdParametro(rowKey));
        }
        this.getGestorBusquedaIdParametro().setFiltroBusqueda(this.getFiltroBusquedaIdParametro());
        return this.getGestorBusquedaIdParametro().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdParametro1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ParametroCachedRowSetDataProvider2.FUNCION_CONSULTAR_PARAMETRO;
        String campo = bean.getCampoIdParametro1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdParametro());
    }

    public String getScriptCampoIdParametro1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_PARAMETRO;
//      Long id = bean.getDominioParametroDataProvider().getIdParametro(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdParametro1Boton2Rendered() {
        return bean == null ? true : bean.getParametroReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdParametro1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdParametro1Boton2Rendered();
    }

    public boolean isCampoIdParametro1Panel2Rendered() {
        return isCampoIdParametro1Boton2Rendered();
    }

    public boolean isTableColumnIdParametro3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdParametro1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoParametroDom1() {
        return JSF.getListaOpciones(EnumTipoParametroDom.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoParametroDom() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoParametroDom() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoParametroDomId() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.ID.intValue());
    }

    public boolean isNumeroTipoParametroDomVersion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.VERSION.intValue());
    }

    public boolean isNumeroTipoParametroDomCodigo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.CODIGO.intValue());
    }

    public boolean isNumeroTipoParametroDomNombre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.NOMBRE.intValue());
    }

    public boolean isNumeroTipoParametroDomPropietario() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.PROPIETARIO.intValue());
    }

    public boolean isNumeroTipoParametroDomSegmento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.SEGMENTO.intValue());
    }

    public boolean isNumeroTipoParametroDomSuperior() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.SUPERIOR.intValue());
    }

    public boolean isNumeroTipoParametroDomInactivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.INACTIVO.intValue());
    }

    public boolean isNumeroTipoParametroDomNumero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getDominioParametroDataProvider().getNumeroTipoParametroDom(rowKey);
        return value != null && value.equals(EnumTipoParametroDom.NUMERO.intValue());
    }

    public boolean isGridIdDominioParametroRendered() {
        return true;
    }

    public boolean isGridIdParametroRendered() {
        return true;
    }

    public boolean isGridNumeroTipoParametroDomRendered() {
        return true;
    }

    public boolean isGridEtiquetaParametroRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
