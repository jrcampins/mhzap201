/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.data.generic.xdp2.PersonaAnotadaCachedRowSetDataProvider2;
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
import com.egt.ejb.business.message.BorrarPersonaAnotadaMessage;
import com.egt.ejb.business.process.PersonaAnotadaBusinessProcessLocal;
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

public class AsistentePaginaActualizacionPersonaAnotada {

    private PaginaActualizacionPersonaAnotada bean;

    public AsistentePaginaActualizacionPersonaAnotada() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionPersonaAnotada(PaginaActualizacionPersonaAnotada bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(PersonaAnotadaCachedRowSetDataProvider2.FUNCION_MODIFICAR_PERSONA_ANOTADA, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(PersonaAnotadaCachedRowSetDataProvider2.FUNCION_BORRAR_PERSONA_ANOTADA, BundleWebui.getString("borrar_persona_anotada"))
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
        } else if (f == PersonaAnotadaCachedRowSetDataProvider2.FUNCION_BORRAR_PERSONA_ANOTADA) {
            this.borrarPersonaAnotada(rowKey);
        }
    }

    private boolean borrarPersonaAnotada(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "borrarPersonaAnotada", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        BorrarPersonaAnotadaMessage message = new BorrarPersonaAnotadaMessage();
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getPersonaAnotadaBusinessProcess().borrarPersonaAnotada(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_PERSONA_ANOTADA;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdPersonaAnotadaRendered() {
        return true;
    }

    public boolean isGridIdPersonaRendered() {
        return true;
    }

    public boolean isGridCodigoPersonaRendered() {
        return true;
    }

    public boolean isGridNombrePersonaRendered() {
        return true;
    }

    public boolean isGridIdUsuarioRendered() {
        return true;
    }

    public boolean isGridCodigoUsuarioRendered() {
        return true;
    }

    public boolean isGridNombreUsuarioRendered() {
        return true;
    }

    public boolean isGridFechaHoraSeleccionRendered() {
        return true;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private PersonaAnotadaBusinessProcessLocal getPersonaAnotadaBusinessProcess() {
        return (PersonaAnotadaBusinessProcessLocal) bean.getPersonaAnotadaBusinessProcess();
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
