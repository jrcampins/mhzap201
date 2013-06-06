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
import com.egt.base.entity.constants.PersonaAnotadaConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.BorrarPersonaAnotadaMessage;
import com.egt.ejb.business.message.BorrarPersonaAnotadaOtroMessage;
import com.egt.ejb.business.process.logic.PersonaAnotadaBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.PersonaAnotada;
import com.egt.ejb.persistence.facade.PersonaAnotadaFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PersonaAnotadaBusinessProcessBean implements PersonaAnotadaBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PersonaAnotadaBusinessProcessLogicLocal logician;

    @EJB
    private PersonaAnotadaFacadeLocal facade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public BorrarPersonaAnotadaMessage borrarPersonaAnotada(BorrarPersonaAnotadaMessage message) {
        Object idPersonaAnotada = null;
        PersonaAnotada personaAnotada = null;
        try {
//          idPersonaAnotada = message.getIdPersonaAnotada();
//          personaAnotada = facade.find(idPersonaAnotada, true);
//          if (personaAnotada == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersonaAnotada));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.borrarPersonaAnotada(message, personaAnotada);
                this.grabarRastroFuncion(message, personaAnotada);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void borrarPersonaAnotada(BorrarPersonaAnotadaMessage message, PersonaAnotada personaAnotada) throws Exception {
        String sql = PersonaAnotadaConstants.PROCESO_FUNCION_BORRAR_PERSONA_ANOTADA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[1]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.borrarPersonaAnotada(message, personaAnotada);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(BorrarPersonaAnotadaMessage message, PersonaAnotada personaAnotada) {
        RastroFuncion rastro = this.getRastroFuncion(message, personaAnotada);
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public BorrarPersonaAnotadaOtroMessage borrarPersonaAnotadaOtro(BorrarPersonaAnotadaOtroMessage message) {
        Object idPersonaAnotada = null;
        PersonaAnotada personaAnotada = null;
        try {
//          idPersonaAnotada = message.getIdPersonaAnotada();
//          personaAnotada = facade.find(idPersonaAnotada, true);
//          if (personaAnotada == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersonaAnotada));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.borrarPersonaAnotadaOtro(message, personaAnotada);
                this.grabarRastroFuncion(message, personaAnotada);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void borrarPersonaAnotadaOtro(BorrarPersonaAnotadaOtroMessage message, PersonaAnotada personaAnotada) throws Exception {
        String sql = PersonaAnotadaConstants.PROCESO_FUNCION_BORRAR_PERSONA_ANOTADA_OTRO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.borrarPersonaAnotadaOtro(message, personaAnotada);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(BorrarPersonaAnotadaOtroMessage message, PersonaAnotada personaAnotada) {
        RastroFuncion rastro = this.getRastroFuncion(message, personaAnotada);
        rastro.addParametro(BorrarPersonaAnotadaOtroMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, PersonaAnotada personaAnotada) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (personaAnotada == null) {
            return rastro;
        }
        rastro.setIdRecurso(personaAnotada.getIdPersonaAnotada());
        rastro.setVersionRecurso(personaAnotada.getVersionPersonaAnotada());
//      rastro.setIdPropietarioRecurso(personaAnotada.getIdUsuario());
        return rastro;
    }
}
