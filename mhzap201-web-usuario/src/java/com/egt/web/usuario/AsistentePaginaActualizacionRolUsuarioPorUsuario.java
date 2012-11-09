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

package com.egt.web.usuario;

import com.egt.data.general.xdp2.RolUsuarioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.util.STP;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class AsistentePaginaActualizacionRolUsuarioPorUsuario {

    private PaginaActualizacionRolUsuarioPorUsuario bean;

    public AsistentePaginaActualizacionRolUsuarioPorUsuario() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRolUsuarioPorUsuario(PaginaActualizacionRolUsuarioPorUsuario bean) {
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
        Option[] opciones = new Option[]{ //
        //  new Option("", etiquetaSeleccioneUnaOpcion),
        //  new Option(RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_USUARIO_ROL, BundleWebui.getString("emitir relacion usuario rol")),
        //  new Option(RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_ROL_USUARIO, BundleWebui.getString("emitir relacion rol usuario"))
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
        long f = bean.getRecursoDataProvider().getFuncionBusinessProcess();
        boolean esFilaAutorizada = bean.getRecursoDataProvider().esFilaAutorizada(rowKey, f);
//      if (!esFilaAutorizada) {
//      } else if (f == RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_USUARIO_ROL) {
//          this.emitirRelacionUsuarioRol(rowKey);
//      } else if (f == RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_ROL_USUARIO) {
//          this.emitirRelacionRolUsuario(rowKey);
//      }
    }

    private boolean emitirRelacionUsuarioRol(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirRelacionUsuarioRol", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
//      String report = RolUsuarioCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_RELACION_USUARIO_ROL;
//      long function = RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_USUARIO_ROL;
//      this.getReporter().executeReport(report, function);
        return true;
    }

    private boolean emitirRelacionRolUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirRelacionRolUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
//      String report = RolUsuarioCachedRowSetDataProvider2.INFORME_FUNCION_EMITIR_RELACION_ROL_USUARIO;
//      long function = RolUsuarioCachedRowSetDataProvider2.FUNCION_EMITIR_RELACION_ROL_USUARIO;
//      this.getReporter().executeReport(report, function);
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idRol">
    private GestorBusquedaReferencia gestorBusquedaIdRol = null;

    private boolean funcionSelectEjecutableIdRol = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdRol() {
        if (this.gestorBusquedaIdRol == null) {
            this.gestorBusquedaIdRol = new GestorBusquedaReferencia(
                    bean.getRolUsuarioDataProvider(),
                    bean.getRolReferenceDataProvider(),
                    RolUsuarioCachedRowSetDataProvider2.COLUMNA_ID_ROL,
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
            return STP.getString(bean.getRolUsuarioDataProvider().getIdRol(rowKey));
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
            return STP.getString(bean.getRolUsuarioDataProvider().getIdRol(rowKey));
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
        String urx = URX2.TABLA_ROL;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdRol());
    }

    public String getScriptCampoIdRol1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_ROL;
        Long id = bean.getRolUsuarioDataProvider().getIdRol(rowKey);
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
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolUsuarioRendered() {
        return true;
    }

    public boolean isGridIdRolRendered() {
        return true;
    }

    // </editor-fold>
    /**/
    private ReporterBrokerLocal getReporter() {
        return (ReporterBrokerLocal) bean.getReporter();
    }

}
