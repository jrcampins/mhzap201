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

import com.egt.data.general.xdp2.RolUsuarioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
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

public class AsistentePaginaActualizacionRolUsuarioPorRol {

    private PaginaActualizacionRolUsuarioPorRol bean;

    public AsistentePaginaActualizacionRolUsuarioPorRol() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolUsuarioPorRol(PaginaActualizacionRolUsuarioPorRol bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolUsuarioCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL_USUARIO, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private GestorBusquedaReferencia gestorBusquedaIdUsuario = null;

    private boolean funcionSelectEjecutableIdUsuario = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuario() {
        if (this.gestorBusquedaIdUsuario == null) {
            this.gestorBusquedaIdUsuario = new GestorBusquedaReferencia(
                    bean.getRolUsuarioDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    RolUsuarioCachedRowSetDataProvider2.COLUMNA_ID_USUARIO,
                    this.funcionSelectEjecutableIdUsuario);
        }
        return this.gestorBusquedaIdUsuario;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuario() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UsuarioCachedRowSetDataProvider3.COLUMNA_ES_USUARIO_ESPECIAL;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = com.egt.base.enums.EnumOpcionBinaria.NO.getOptionValue();
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
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
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolUsuarioDataProvider().getIdUsuario(rowKey));
        }
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
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getRolUsuarioDataProvider().getIdUsuario(rowKey));
        }
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        return this.getGestorBusquedaIdUsuario().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuario1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuario1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_USUARIO;
        Long id = bean.getRolUsuarioDataProvider().getIdUsuario(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuario1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuario1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuario1Boton2Rendered();
    }

    public boolean isCampoIdUsuario1Panel2Rendered() {
        return isCampoIdUsuario1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuario3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuario1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolUsuarioRendered() {
        return true;
    }

    public boolean isGridIdUsuarioRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
