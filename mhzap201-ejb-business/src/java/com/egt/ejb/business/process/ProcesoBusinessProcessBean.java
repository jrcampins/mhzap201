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
package com.egt.ejb.business.process;

import com.egt.base.constants.CBM2;
import com.egt.base.entity.constants.ProcesoConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.ProcesoImportarArchivosExtMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.process.logic.ProcesoBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Proceso;
import com.egt.ejb.persistence.facade.ProcesoFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class ProcesoBusinessProcessBean implements ProcesoBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ProcesoBusinessProcessLogicLocal logician;

    @EJB
    private ProcesoFacadeLocal facade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public ProcesoImportarArchivosExtMessage procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoImportarArchivosExt(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_IMPORTAR_ARCHIVOS_EXT;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[1]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoImportarArchivosExt(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoImportarArchivosExtMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ProcesoAcreditarPotBenMessage procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoAcreditarPotBen(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_ACREDITAR_POT_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUbicacion();
            args[index++] = message.getFechaRegistroPotBenDesde();
            args[index++] = message.getFechaRegistroPotBenHasta();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoAcreditarPotBen(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoAcreditarPotBenMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        rastro.addParametro(ProcesoAcreditarPotBenMessage.PARAMETRO_ID_UBICACION, STP.getString(message.getIdUbicacion()));
        rastro.addParametro(ProcesoAcreditarPotBenMessage.PARAMETRO_FECHA_REGISTRO_POT_BEN_DESDE, STP.getString(message.getFechaRegistroPotBenDesde()));
        rastro.addParametro(ProcesoAcreditarPotBenMessage.PARAMETRO_FECHA_REGISTRO_POT_BEN_HASTA, STP.getString(message.getFechaRegistroPotBenHasta()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ProcesoPrepararProxPagoPenMessage procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoPrepararProxPagoPen(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_PREPARAR_PROX_PAGO_PEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUbicacion();
            args[index++] = message.getFechaSolicitudPensionDesde();
            args[index++] = message.getFechaSolicitudPensionHasta();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoPrepararProxPagoPen(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoPrepararProxPagoPenMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        rastro.addParametro(ProcesoPrepararProxPagoPenMessage.PARAMETRO_ID_UBICACION, STP.getString(message.getIdUbicacion()));
        rastro.addParametro(ProcesoPrepararProxPagoPenMessage.PARAMETRO_FECHA_SOLICITUD_PENSION_DESDE, STP.getString(message.getFechaSolicitudPensionDesde()));
        rastro.addParametro(ProcesoPrepararProxPagoPenMessage.PARAMETRO_FECHA_SOLICITUD_PENSION_HASTA, STP.getString(message.getFechaSolicitudPensionHasta()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ProcesoOtorgarPensionesAprMessage procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoOtorgarPensionesApr(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_OTORGAR_PENSIONES_APR;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUbicacion();
            args[index++] = message.getNumeroResolucionOtorPen();
            args[index++] = message.getFechaResolucionOtorPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoOtorgarPensionesApr(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoOtorgarPensionesAprMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        rastro.addParametro(ProcesoOtorgarPensionesAprMessage.PARAMETRO_ID_UBICACION, STP.getString(message.getIdUbicacion()));
        rastro.addParametro(ProcesoOtorgarPensionesAprMessage.PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN, STP.getString(message.getNumeroResolucionOtorPen()));
        rastro.addParametro(ProcesoOtorgarPensionesAprMessage.PARAMETRO_FECHA_RESOLUCION_OTOR_PEN, STP.getString(message.getFechaResolucionOtorPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ProcesoActualizarPenEnJupeMessage procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoActualizarPenEnJupe(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_ACTUALIZAR_PEN_EN_JUPE;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[1]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoActualizarPenEnJupe(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoActualizarPenEnJupeMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ProcesoVerificarElePenMessage procesoVerificarElePen(ProcesoVerificarElePenMessage message) {
        Object idProceso = null;
        Proceso proceso = null;
        try {
//          idProceso = message.getIdProceso();
//          proceso = facade.find(idProceso, true);
//          if (proceso == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idProceso));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.procesoVerificarElePen(message, proceso);
                this.grabarRastroFuncion(message, proceso);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void procesoVerificarElePen(ProcesoVerificarElePenMessage message, Proceso proceso) throws Exception {
        String sql = ProcesoConstants.PROCESO_FUNCION_PROCESO_VERIFICAR_ELE_PEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUbicacion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.procesoVerificarElePen(message, proceso);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ProcesoVerificarElePenMessage message, Proceso proceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, proceso);
        rastro.addParametro(ProcesoVerificarElePenMessage.PARAMETRO_ID_UBICACION, STP.getString(message.getIdUbicacion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, Proceso proceso) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (proceso == null) {
            return rastro;
        }
        rastro.setIdRecurso(proceso.getIdProceso());
        rastro.setVersionRecurso(proceso.getVersionProceso());
        rastro.setCodigoRecurso(proceso.getCodigoProceso());
        rastro.setNombreRecurso(proceso.getNombreProceso());
        return rastro;
    }
}
