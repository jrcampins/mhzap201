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

import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.control.Auditor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.business.process.RolBusinessProcessLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.jms.ObjectMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AsistentePaginaActualizacionRol {

    private PaginaActualizacionRol bean;

    public AsistentePaginaActualizacionRol() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionRol(PaginaActualizacionRol bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(RolCachedRowSetDataProvider2.FUNCION_MODIFICAR_ROL, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(RolCachedRowSetDataProvider2.FUNCION_PROPAGAR_FILTROS_ROL, BundleWebui.getString("propagar filtros")),
            new Option(RolCachedRowSetDataProvider2.FUNCION_PROPAGAR_FAVORITOS_ROL, BundleWebui.getString("propagar favoritos"))
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
        if (!esFilaAutorizada) {
        } else if (f == RolCachedRowSetDataProvider2.FUNCION_PROPAGAR_FILTROS_ROL) {
            this.propagarFiltrosRol(rowKey);
        } else if (f == RolCachedRowSetDataProvider2.FUNCION_PROPAGAR_FAVORITOS_ROL) {
            this.propagarFavoritosRol(rowKey);
        }
    }

    private boolean propagarFiltrosRol(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "propagarFiltrosRol", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idRol = bean.getRolDataProvider().getIdRol(rowKey);
        PropagarFiltrosRolMessage message = new PropagarFiltrosRolMessage(idRol);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getRolBusinessProcess().propagarFiltrosRol(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean propagarFavoritosRol(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "propagarFavoritosRol", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idRol = bean.getRolDataProvider().getIdRol(rowKey);
        PropagarFavoritosRolMessage message = new PropagarFavoritosRolMessage(idRol);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getRolBusinessProcess().propagarFavoritosRol(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_ROL;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdRolRendered() {
        return true;
    }

    public boolean isGridCodigoRolRendered() {
        return true;
    }

    public boolean isGridNombreRolRendered() {
        return true;
    }

    public boolean isGridDescripcionRolRendered() {
        return true;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private RolBusinessProcessLocal getRolBusinessProcess() {
        return (RolBusinessProcessLocal) bean.getRolBusinessProcess();
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
