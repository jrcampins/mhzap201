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
package com.egt.web.rastro;

import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleWebui;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.jsf.JSF;
import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.CancelarGrupoProcesoMessage;
import com.egt.ejb.business.process.GrupoProcesoBusinessProcessLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.jms.ObjectMessage;

public class AsistentePaginaActualizacionGrupoProceso {

    private PaginaActualizacionGrupoProceso bean;

    public AsistentePaginaActualizacionGrupoProceso() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionGrupoProceso(PaginaActualizacionGrupoProceso bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        return new Option[]{ //
                    new Option("", etiquetaSeleccioneUnaOpcion),
                    new Option(GrupoProcesoCachedRowSetDataProvider2.FUNCION_CANCELAR_GRUPO_PROCESO, BundleWebui.getString("cancelar ejecucion"))
                };
    }

    void procesar() {
        if (bean.getRecursoDataProvider().isFuncionBusinessProcessAutorizada()) {
            bean.getGestor().procesar(new RowProcessor() {
                // override metodo processRow

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
        b = !b ? false
                : f == GrupoProcesoCachedRowSetDataProvider2.FUNCION_CANCELAR_GRUPO_PROCESO ? this.cancelarEjecucionGrupoProceso(rowKey)
                : false;
    }

    private boolean cancelarEjecucionGrupoProceso(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "cancelarEjecucionGrupoProceso", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idGrupoProceso = bean.getGrupoProcesoDataProvider().getIdGrupoProceso(rowKey);
        CancelarGrupoProcesoMessage message = new CancelarGrupoProcesoMessage(idGrupoProceso);
        if (synchronously) {
            this.getGrupoProcesoBusinessProcess().cancelarGrupoProceso(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_GRUPO_PROCESO_10750000410;
//      return bean.getGestor().isLoteSinCambios();
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroCondicionEjeFun1() {
        return JSF.getListaOpciones(EnumCondicionEjeFun.values(), true, false);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNumeroCondicionEjeFunEjecucionPendiente() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getGrupoProcesoDataProvider().getNumeroCondicionEjeFun(rowKey);
        return value != null && value.equals(EnumCondicionEjeFun.EJECUCION_PENDIENTE.intValue());
    }

    public boolean isNumeroCondicionEjeFunEjecucionEnProgreso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getGrupoProcesoDataProvider().getNumeroCondicionEjeFun(rowKey);
        return value != null && value.equals(EnumCondicionEjeFun.EJECUCION_EN_PROGRESO.intValue());
    }

    public boolean isNumeroCondicionEjeFunEjecutadoSinErrores() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getGrupoProcesoDataProvider().getNumeroCondicionEjeFun(rowKey);
        return value != null && value.equals(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES.intValue());
    }

    public boolean isNumeroCondicionEjeFunEjecutadoConErrores() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getGrupoProcesoDataProvider().getNumeroCondicionEjeFun(rowKey);
        return value != null && value.equals(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES.intValue());
    }

    public boolean isNumeroCondicionEjeFunEjecucionCancelada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getGrupoProcesoDataProvider().getNumeroCondicionEjeFun(rowKey);
        return value != null && value.equals(EnumCondicionEjeFun.EJECUCION_CANCELADA.intValue());
    }

    // </editor-fold>

    /**/
    boolean synchronously = false;

    private GrupoProcesoBusinessProcessLocal getGrupoProcesoBusinessProcess() {
        return (GrupoProcesoBusinessProcessLocal) bean.getGrupoProcesoBusinessProcess();
    }

    private BusinessProcessMessengerLocal getMessenger() {
        return (BusinessProcessMessengerLocal) bean.getMessenger();
    }

    private AbstractMessage requestReply(AbstractMessage message) throws Exception {
        ObjectMessage solicitud = this.getMessenger().postRequest(message);
        ObjectMessage respuesta = this.getMessenger().receiveReply(solicitud);
        AbstractMessage mensaje = respuesta == null
                ? (AbstractMessage) solicitud.getObject()
                : (AbstractMessage) respuesta.getObject();
        /**/
        TLC.getBitacora().add(mensaje);
        return mensaje;
    }

}
