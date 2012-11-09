/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

import com.egt.base.constants.CBM2;
import com.egt.base.constants.EAB;
import com.egt.base.constants.FGS;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.Controlador;
import com.egt.ejb.core.AuditorLocal;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jms.ObjectMessage;

@DeclareRoles({"analyst", "designer", "programmer"})
@Stateless
public class ToolKitBrokerBean implements ToolKitBrokerLocal {

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @Resource
    private SessionContext sc;

    @EJB
    private ToolKitMessengerLocal messenger;

    @EJB
    private ToolKitSessionLocal toolKit;

    @EJB
    private AuditorLocal auditor;

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generar() {
        return this.generar(EnumToolKitMessageType.GENERAR_BASE, FGS.FUNCION_INICIAR_SESION);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarEntityClass() {
        return this.generar(EnumToolKitMessageType.GENERAR_ENTITY, FGS.FUNCION_GENERAR_ENTITY_CLASS);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarFacade() {
        return this.generar(EnumToolKitMessageType.GENERAR_FACADE, FGS.FUNCION_GENERAR_FACADE);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarURX() {
        return this.generar(EnumToolKitMessageType.GENERAR_URX, FGS.FUNCION_GENERAR_URX);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarMenu() {
        return this.generar(EnumToolKitMessageType.GENERAR_MENU, FGS.FUNCION_GENERAR_MENU);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarBundles() {
        return this.generar(EnumToolKitMessageType.GENERAR_BUNDLES, FGS.FUNCION_GENERAR_BUNDLES);
    }

    @RolesAllowed({"analyst", "designer"})
    @Override
    public ObjectMessage generarEntityConstants() {
        return this.generar(EnumToolKitMessageType.GENERAR_ENTITY_CONSTANTS, FGS.FUNCION_GENERAR_ENTITY_CONSTANTS);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarJasperReport() {
        return this.generar(EnumToolKitMessageType.GENERAR_INFORME, FGS.FUNCION_GENERAR_JASPER_REPORT);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarJasperViews() {
        return this.generar(EnumToolKitMessageType.GENERAR_VISTAS, FGS.FUNCION_GENERAR_JASPER_VIEWS);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarBusinessMessage() {
        return this.generar(EnumToolKitMessageType.GENERAR_MENSAJE, FGS.FUNCION_GENERAR_BUSINESS_MESSAGE);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarBusinessProcess() {
        return this.generar(EnumToolKitMessageType.GENERAR_PROCESO, FGS.FUNCION_GENERAR_BUSINESS_PROCESS);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarPlantillas() {
        return this.generar(EnumToolKitMessageType.GENERAR_PLANTILLA, FGS.FUNCION_GENERAR_PLANTILLAS);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarAplicaciones() {
        return this.generar(EnumToolKitMessageType.GENERAR_APLICACIONES, FGS.FUNCION_GENERAR_APLICACIONES);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarAplicacionesEspecificas() {
        return this.generar(EnumToolKitMessageType.GENERAR_APLICACIONES_ESPECIFICAS, FGS.FUNCION_GENERAR_APLICACIONES_ESPECIFICAS);
    }

    @RolesAllowed({"designer", "programmer"})
    @Override
    public ObjectMessage generarWebViews() {
        return this.generar(EnumToolKitMessageType.GENERAR_VISTAS_WEB, FGS.FUNCION_GENERAR_WEB_VIEWS);
    }

    private ObjectMessage generar(EnumToolKitMessageType tipo, long funcion) {
        Bitacora.trace(this.getClass(), "generar", tipo, funcion);
        Long rastro = null;
        ToolKitMessage message;
        ObjectMessage reply = null;
        try {
            if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                TLC.getConnection(ds);
                rastro = TLC.getControlador().ponerProcesoPendiente(funcion);
                message = new ToolKitMessage(tipo, funcion);
                TLC.getControlador().ponerUsuarioEnMensaje(message);
                message.setRastro(rastro);
                message.setMensaje(Bitacora.getTextoMensaje(CBM2.PROCESS_EXECUTION_REQUEST, tipo));
                reply = messenger.send(message);
                TLC.getBitacora().info(message.getMensaje());
            } else {
                throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.FUNCION_NO_AUTORIZADA, funcion));
            }
        } catch (Exception ex) {
            EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            String mensaje = ThrowableUtils.getString(ex);
            Auditor.grabarRastroProceso(rastro, condicion, null, mensaje);
            TLC.getBitacora().error(mensaje);
        }
        return reply;
    }

    @Override
    public ToolKitMessage processToolKitMessage(ToolKitMessage message) {
        Bitacora.trace(this.getClass(), "processToolKitMessage", message, sc.getCallerPrincipal());
        message = (ToolKitMessage) Controlador.ponerProcesoEnEjecucion(message);
        if (EnumCondicionEjeFun.EJECUCION_EN_PROGRESO.equals(message.getCondicion())) {
            message.setSubprocesos(0);
            message.setGrabarRastroPendiente(true);
            try {
//              long funcion = message.getFuncion();
                Long recurso = message.getRecurso();
                EnumToolKitMessageType tipo = message.getTipo();
                // <editor-fold defaultstate="collapsed" desc="switch (tipo)">
                switch (tipo) {
                    case GENERAR_BASE:
                        toolKit.generar(message);
                        break;
                    case GENERAR_ENTITY:
                        if (recurso == null) {
                            toolKit.generarEntityClass();
                        } else {
                            toolKit.generarEntityClass(recurso.intValue());
                        }
                        break;
                    case GENERAR_FACADE:
                        if (recurso == null) {
                            toolKit.generarFacade();
                        } else {
                            toolKit.generarFacade(recurso.intValue());
                        }
                        break;
                    case GENERAR_URX:
                        toolKit.generarURX();
                        break;
                    case GENERAR_MENU:
                        toolKit.generarMenu(message);
                        break;
                    case GENERAR_BUNDLES:
                        toolKit.generarBundles();
                        break;
                    case GENERAR_ENTITY_CONSTANTS:
                        toolKit.generarEntityConstants();
                        break;
                    case GENERAR_INFORME:
                        if (recurso == null) {
                            toolKit.generarJasperReport();
                        } else {
                            toolKit.generarJasperReport(recurso);
                        }
                        break;
                    case GENERAR_VISTAS:
                        toolKit.generarJasperViews();
                        break;
                    case GENERAR_MENSAJE:
                        toolKit.generarBusinessMessage();
                        break;
                    case GENERAR_PROCESO:
                        toolKit.generarBusinessProcess();
                        break;
                    case GENERAR_PLANTILLA:
                        if (recurso == null) {
                            toolKit.generarPlantilla();
                        } else {
                            toolKit.generarPlantilla(recurso);
                        }
                        break;
                    case GENERAR_APLICACIONES:
                        toolKit.generarAplicaciones(message);
                        break;
                    case GENERAR_APLICACIONES_ESPECIFICAS:
                        toolKit.generarAplicacionesEspecificas(message);
                        break;
                    case GENERAR_VISTAS_WEB:
                        toolKit.generarWebViews();
                        break;
                    case GENERAR_APLICACION:
                        if (recurso == null) {
                            toolKit.generarAplicacion();
                        } else {
                            toolKit.generarAplicacion(recurso);
                        }
                        break;
                    case GENERAR_PAGINA:
                        if (recurso == null) {
                            toolKit.generarPagina();
                        } else {
                            toolKit.generarPagina(recurso);
                        }
                        break;
                    default:
                        message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
                        message.setMensaje(TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND,
                                message.getRastro() + "(" + message.getClass().getName() + ")"));
                        break;
                }
                // </editor-fold>
                if (message.getSubprocesos() > 0) {
                    auditor.grabarRastroProceso(message.getRastro(), message.getSubprocesos(), message.getProcedimiento());
                } else if (message.isGrabarRastroPendiente()) {
                    if (EnumCondicionEjeFun.EJECUCION_EN_PROGRESO.equals(message.getCondicion())) {
                        message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                        message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getRastro() + "(" + message + ")"));
                    }
                    auditor.grabarRastroProceso(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje());
                }
            } catch (Exception ex) {
                message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
                message.setMensaje(ThrowableUtils.getString(ex));
                Auditor.grabarRastroProceso(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje());
                TLC.getBitacora().fatal(message.getMensaje());
                TLC.getBitacora().fatal(CBM2.PROCESS_EXECUTION_ABEND, message.getRastro());
                throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
            }
        }
        return message;
    }

}
