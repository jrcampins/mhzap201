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
import com.egt.base.entity.constants.PersonaConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.RegistrarCerVidaPersonaMessage;
import com.egt.ejb.business.message.AnularCerVidaPersonaMessage;
import com.egt.ejb.business.message.RegistrarCerDefunPersonaMessage;
import com.egt.ejb.business.message.AnularCerDefunPersonaMessage;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularAprobacionPenPersonaMessage;
import com.egt.ejb.business.message.ObjetarPensionPersonaMessage;
import com.egt.ejb.business.message.RevocarPensionPersonaMessage;
import com.egt.ejb.business.message.OtorgarPensionPersonaMessage;
import com.egt.ejb.business.message.DenegarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularDenegacionPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarEntregaDocPersonaMessage;
import com.egt.ejb.business.message.IncluirPersonaEnJupeMessage;
import com.egt.ejb.business.message.AsignarMontoPensionPersonaMessage;
import com.egt.ejb.business.message.ActFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.AnulFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarDenuPenPersonaMessage;
import com.egt.ejb.business.message.ConfirmarDenuPenPersonaMessage;
import com.egt.ejb.business.message.DesmentirDenuPenPersonaMessage;
import com.egt.ejb.business.message.AnotarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaOtroMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaSelMessage;
import com.egt.ejb.business.process.logic.PersonaBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Persona;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.SexoPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoCivilFacadeLocal;
import com.egt.ejb.persistence.facade.EtniaIndigenaFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CausaRevPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionRecoPenFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenRecoPenFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionDenuPenFacadeLocal;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoActJupeFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PersonaBusinessProcessBean implements PersonaBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PersonaBusinessProcessLogicLocal logician;

    @EJB
    private PersonaFacadeLocal facade;

    @EJB
    private SexoPersonaFacadeLocal sexoPersonaFacade;

    @EJB
    private EstadoCivilFacadeLocal estadoCivilFacade;

    @EJB
    private EtniaIndigenaFacadeLocal etniaIndigenaFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private CondicionPensionFacadeLocal condicionPensionFacade;

    @EJB
    private CausaDenPensionFacadeLocal causaDenPensionFacade;

    @EJB
    private CausaRevPensionFacadeLocal causaRevPensionFacade;

    @EJB
    private CondicionRecoPenFacadeLocal condicionRecoPenFacade;

    @EJB
    private CausaDenRecoPenFacadeLocal causaDenRecoPenFacade;

    @EJB
    private CondicionDenuPenFacadeLocal condicionDenuPenFacade;

    @EJB
    private FichaPersonaFacadeLocal fichaPersonaFacade;

    @EJB
    private TipoActJupeFacadeLocal tipoActJupeFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public RegistrarCerVidaPersonaMessage registrarCerVidaPersona(RegistrarCerVidaPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.registrarCerVidaPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void registrarCerVidaPersona(RegistrarCerVidaPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_REGISTRAR_CER_VIDA_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getCertificadoVida();
            args[index++] = message.getFechaCertificadoVida();
            args[index++] = message.getDiasVigenciaCertificadoVida();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.registrarCerVidaPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegistrarCerVidaPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(RegistrarCerVidaPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(RegistrarCerVidaPersonaMessage.PARAMETRO_CERTIFICADO_VIDA, STP.getString(message.getCertificadoVida()));
        rastro.addParametro(RegistrarCerVidaPersonaMessage.PARAMETRO_FECHA_CERTIFICADO_VIDA, STP.getString(message.getFechaCertificadoVida()));
        rastro.addParametro(RegistrarCerVidaPersonaMessage.PARAMETRO_DIAS_VIGENCIA_CERTIFICADO_VIDA, STP.getString(message.getDiasVigenciaCertificadoVida()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnularCerVidaPersonaMessage anularCerVidaPersona(AnularCerVidaPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularCerVidaPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularCerVidaPersona(AnularCerVidaPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANULAR_CER_VIDA_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularCerVidaPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularCerVidaPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnularCerVidaPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RegistrarCerDefunPersonaMessage registrarCerDefunPersona(RegistrarCerDefunPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.registrarCerDefunPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void registrarCerDefunPersona(RegistrarCerDefunPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_REGISTRAR_CER_DEFUN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getCertificadoDefuncion();
            args[index++] = message.getFechaCertificadoDefuncion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.registrarCerDefunPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegistrarCerDefunPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(RegistrarCerDefunPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(RegistrarCerDefunPersonaMessage.PARAMETRO_CERTIFICADO_DEFUNCION, STP.getString(message.getCertificadoDefuncion()));
        rastro.addParametro(RegistrarCerDefunPersonaMessage.PARAMETRO_FECHA_CERTIFICADO_DEFUNCION, STP.getString(message.getFechaCertificadoDefuncion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnularCerDefunPersonaMessage anularCerDefunPersona(AnularCerDefunPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularCerDefunPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularCerDefunPersona(AnularCerDefunPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANULAR_CER_DEFUN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularCerDefunPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularCerDefunPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnularCerDefunPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AprobarPensionPersonaMessage aprobarPensionPersona(AprobarPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.aprobarPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void aprobarPensionPersona(AprobarPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_APROBAR_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getComentariosAprobacionPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.aprobarPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AprobarPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AprobarPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(AprobarPensionPersonaMessage.PARAMETRO_COMENTARIOS_APROBACION_PENSION, STP.getString(message.getComentariosAprobacionPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnularAprobacionPenPersonaMessage anularAprobacionPenPersona(AnularAprobacionPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularAprobacionPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularAprobacionPenPersona(AnularAprobacionPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANULAR_APROBACION_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularAprobacionPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularAprobacionPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnularAprobacionPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ObjetarPensionPersonaMessage objetarPensionPersona(ObjetarPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.objetarPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void objetarPensionPersona(ObjetarPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_OBJETAR_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroCausaDenPension();
            args[index++] = message.getOtraCausaDenPension();
            args[index++] = message.getComentariosObjecionPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.objetarPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ObjetarPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(ObjetarPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(ObjetarPensionPersonaMessage.PARAMETRO_NUMERO_CAUSA_DEN_PENSION, STP.getString(message.getNumeroCausaDenPension()));
        rastro.addParametro(ObjetarPensionPersonaMessage.PARAMETRO_OTRA_CAUSA_DEN_PENSION, STP.getString(message.getOtraCausaDenPension()));
        rastro.addParametro(ObjetarPensionPersonaMessage.PARAMETRO_COMENTARIOS_OBJECION_PENSION, STP.getString(message.getComentariosObjecionPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RevocarPensionPersonaMessage revocarPensionPersona(RevocarPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.revocarPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void revocarPensionPersona(RevocarPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_REVOCAR_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroCausaRevPension();
            args[index++] = message.getOtraCausaRevPension();
            args[index++] = message.getComentariosRevocacionPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.revocarPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RevocarPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(RevocarPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(RevocarPensionPersonaMessage.PARAMETRO_NUMERO_CAUSA_REV_PENSION, STP.getString(message.getNumeroCausaRevPension()));
        rastro.addParametro(RevocarPensionPersonaMessage.PARAMETRO_OTRA_CAUSA_REV_PENSION, STP.getString(message.getOtraCausaRevPension()));
        rastro.addParametro(RevocarPensionPersonaMessage.PARAMETRO_COMENTARIOS_REVOCACION_PENSION, STP.getString(message.getComentariosRevocacionPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public OtorgarPensionPersonaMessage otorgarPensionPersona(OtorgarPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.otorgarPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void otorgarPensionPersona(OtorgarPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_OTORGAR_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroResolucionOtorPen();
            args[index++] = message.getFechaResolucionOtorPen();
            args[index++] = message.getComentariosOtorgamientoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.otorgarPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(OtorgarPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(OtorgarPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(OtorgarPensionPersonaMessage.PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN, STP.getString(message.getNumeroResolucionOtorPen()));
        rastro.addParametro(OtorgarPensionPersonaMessage.PARAMETRO_FECHA_RESOLUCION_OTOR_PEN, STP.getString(message.getFechaResolucionOtorPen()));
        rastro.addParametro(OtorgarPensionPersonaMessage.PARAMETRO_COMENTARIOS_OTORGAMIENTO_PEN, STP.getString(message.getComentariosOtorgamientoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DenegarPensionPersonaMessage denegarPensionPersona(DenegarPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.denegarPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void denegarPensionPersona(DenegarPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_DENEGAR_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroResolucionDenPen();
            args[index++] = message.getFechaResolucionDenPen();
            args[index++] = message.getComentariosDenegacionPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.denegarPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DenegarPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(DenegarPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(DenegarPensionPersonaMessage.PARAMETRO_NUMERO_RESOLUCION_DEN_PEN, STP.getString(message.getNumeroResolucionDenPen()));
        rastro.addParametro(DenegarPensionPersonaMessage.PARAMETRO_FECHA_RESOLUCION_DEN_PEN, STP.getString(message.getFechaResolucionDenPen()));
        rastro.addParametro(DenegarPensionPersonaMessage.PARAMETRO_COMENTARIOS_DENEGACION_PENSION, STP.getString(message.getComentariosDenegacionPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnularDenegacionPenPersonaMessage anularDenegacionPenPersona(AnularDenegacionPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularDenegacionPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularDenegacionPenPersona(AnularDenegacionPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANULAR_DENEGACION_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularDenegacionPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularDenegacionPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnularDenegacionPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RegistrarEntregaDocPersonaMessage registrarEntregaDocPersona(RegistrarEntregaDocPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.registrarEntregaDocPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void registrarEntregaDocPersona(RegistrarEntregaDocPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_REGISTRAR_ENTREGA_DOC_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[8]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getEsPersonaConCerVida();
            args[index++] = message.getCertificadoVida();
            args[index++] = message.getFechaCertificadoVida();
            args[index++] = message.getEsPersonaConCopiaCedula();
            args[index++] = message.getEsPersonaConDeclaracionJur();
            args[index++] = message.getComentariosEntregaDocumentos();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.registrarEntregaDocPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegistrarEntregaDocPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_ES_PERSONA_CON_CER_VIDA, STP.getString(message.getEsPersonaConCerVida()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_CERTIFICADO_VIDA, STP.getString(message.getCertificadoVida()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_FECHA_CERTIFICADO_VIDA, STP.getString(message.getFechaCertificadoVida()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA, STP.getString(message.getEsPersonaConCopiaCedula()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR, STP.getString(message.getEsPersonaConDeclaracionJur()));
        rastro.addParametro(RegistrarEntregaDocPersonaMessage.PARAMETRO_COMENTARIOS_ENTREGA_DOCUMENTOS, STP.getString(message.getComentariosEntregaDocumentos()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public IncluirPersonaEnJupeMessage incluirPersonaEnJupe(IncluirPersonaEnJupeMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.incluirPersonaEnJupe(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void incluirPersonaEnJupe(IncluirPersonaEnJupeMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_INCLUIR_PERSONA_EN_JUPE;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.incluirPersonaEnJupe(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(IncluirPersonaEnJupeMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(IncluirPersonaEnJupeMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AsignarMontoPensionPersonaMessage asignarMontoPensionPersona(AsignarMontoPensionPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.asignarMontoPensionPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void asignarMontoPensionPersona(AsignarMontoPensionPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ASIGNAR_MONTO_PENSION_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getMontoPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.asignarMontoPensionPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AsignarMontoPensionPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AsignarMontoPensionPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(AsignarMontoPensionPersonaMessage.PARAMETRO_MONTO_PENSION, STP.getString(message.getMontoPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ActFecUltCobPenPersonaMessage actFecUltCobPenPersona(ActFecUltCobPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.actFecUltCobPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void actFecUltCobPenPersona(ActFecUltCobPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ACT_FEC_ULT_COB_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getFechaUltimoCobroPension();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.actFecUltCobPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ActFecUltCobPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(ActFecUltCobPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(ActFecUltCobPenPersonaMessage.PARAMETRO_FECHA_ULTIMO_COBRO_PENSION, STP.getString(message.getFechaUltimoCobroPension()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnulFecUltCobPenPersonaMessage anulFecUltCobPenPersona(AnulFecUltCobPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anulFecUltCobPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anulFecUltCobPenPersona(AnulFecUltCobPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANUL_FEC_ULT_COB_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNotasAnulFecUltCobPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anulFecUltCobPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnulFecUltCobPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnulFecUltCobPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(AnulFecUltCobPenPersonaMessage.PARAMETRO_NOTAS_ANUL_FEC_ULT_COB_PEN, STP.getString(message.getNotasAnulFecUltCobPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public SolicitarRecoPenPersonaMessage solicitarRecoPenPersona(SolicitarRecoPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.solicitarRecoPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void solicitarRecoPenPersona(SolicitarRecoPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_SOLICITAR_RECO_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getComentariosSolicitudRecoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.solicitarRecoPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(SolicitarRecoPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(SolicitarRecoPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(SolicitarRecoPenPersonaMessage.PARAMETRO_COMENTARIOS_SOLICITUD_RECO_PEN, STP.getString(message.getComentariosSolicitudRecoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AsignarRecoPenPersonaMessage asignarRecoPenPersona(AsignarRecoPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.asignarRecoPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void asignarRecoPenPersona(AsignarRecoPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ASIGNAR_RECO_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getCodigoSimeRecoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.asignarRecoPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AsignarRecoPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AsignarRecoPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(AsignarRecoPenPersonaMessage.PARAMETRO_CODIGO_SIME_RECO_PEN, STP.getString(message.getCodigoSimeRecoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AprobarRecoPenPersonaMessage aprobarRecoPenPersona(AprobarRecoPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.aprobarRecoPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void aprobarRecoPenPersona(AprobarRecoPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_APROBAR_RECO_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getComentariosAprRecoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.aprobarRecoPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AprobarRecoPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AprobarRecoPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(AprobarRecoPenPersonaMessage.PARAMETRO_COMENTARIOS_APR_RECO_PEN, STP.getString(message.getComentariosAprRecoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DenegarRecoPenPersonaMessage denegarRecoPenPersona(DenegarRecoPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.denegarRecoPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void denegarRecoPenPersona(DenegarRecoPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_DENEGAR_RECO_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroCausaDenRecoPen();
            args[index++] = message.getOtraCausaDenRecoPen();
            args[index++] = message.getComentariosDenRecoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.denegarRecoPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DenegarRecoPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(DenegarRecoPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(DenegarRecoPenPersonaMessage.PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, STP.getString(message.getNumeroCausaDenRecoPen()));
        rastro.addParametro(DenegarRecoPenPersonaMessage.PARAMETRO_OTRA_CAUSA_DEN_RECO_PEN, STP.getString(message.getOtraCausaDenRecoPen()));
        rastro.addParametro(DenegarRecoPenPersonaMessage.PARAMETRO_COMENTARIOS_DEN_RECO_PEN, STP.getString(message.getComentariosDenRecoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RegistrarDenuPenPersonaMessage registrarDenuPenPersona(RegistrarDenuPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.registrarDenuPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void registrarDenuPenPersona(RegistrarDenuPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_REGISTRAR_DENU_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getComentariosRegistroDenuPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.registrarDenuPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegistrarDenuPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(RegistrarDenuPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(RegistrarDenuPenPersonaMessage.PARAMETRO_COMENTARIOS_REGISTRO_DENU_PEN, STP.getString(message.getComentariosRegistroDenuPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ConfirmarDenuPenPersonaMessage confirmarDenuPenPersona(ConfirmarDenuPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.confirmarDenuPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void confirmarDenuPenPersona(ConfirmarDenuPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_CONFIRMAR_DENU_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getNumeroCausaRevPension();
            args[index++] = message.getOtraCausaRevPension();
            args[index++] = message.getComentariosConfDenuPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.confirmarDenuPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ConfirmarDenuPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(ConfirmarDenuPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(ConfirmarDenuPenPersonaMessage.PARAMETRO_NUMERO_CAUSA_REV_PENSION, STP.getString(message.getNumeroCausaRevPension()));
        rastro.addParametro(ConfirmarDenuPenPersonaMessage.PARAMETRO_OTRA_CAUSA_REV_PENSION, STP.getString(message.getOtraCausaRevPension()));
        rastro.addParametro(ConfirmarDenuPenPersonaMessage.PARAMETRO_COMENTARIOS_CONF_DENU_PEN, STP.getString(message.getComentariosConfDenuPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DesmentirDenuPenPersonaMessage desmentirDenuPenPersona(DesmentirDenuPenPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.desmentirDenuPenPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void desmentirDenuPenPersona(DesmentirDenuPenPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_DESMENTIR_DENU_PEN_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            args[index++] = message.getComentariosDesDenuPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.desmentirDenuPenPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesmentirDenuPenPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(DesmentirDenuPenPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        rastro.addParametro(DesmentirDenuPenPersonaMessage.PARAMETRO_COMENTARIOS_DES_DENU_PEN, STP.getString(message.getComentariosDesDenuPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnotarPersonaMessage anotarPersona(AnotarPersonaMessage message) {
        Long idPersona = null;
        Persona persona = null;
        try {
            idPersona = message.getIdPersona();
            persona = facade.find(idPersona, true);
            if (persona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anotarPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anotarPersona(AnotarPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ANOTAR_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anotarPersona(message, persona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnotarPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AnotarPersonaMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public BorrarPersonaMessage borrarPersona(BorrarPersonaMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.borrarPersona(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void borrarPersona(BorrarPersonaMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_BORRAR_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[1]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.borrarPersona(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(BorrarPersonaMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public BorrarPersonaOtroMessage borrarPersonaOtro(BorrarPersonaOtroMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.borrarPersonaOtro(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void borrarPersonaOtro(BorrarPersonaOtroMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_BORRAR_PERSONA_OTRO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.borrarPersonaOtro(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(BorrarPersonaOtroMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(BorrarPersonaOtroMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public SolicitarRecoPenPersonaSelMessage solicitarRecoPenPersonaSel(SolicitarRecoPenPersonaSelMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.solicitarRecoPenPersonaSel(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void solicitarRecoPenPersonaSel(SolicitarRecoPenPersonaSelMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_SOLICITAR_RECO_PEN_PERSONA_SEL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getObservacion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.solicitarRecoPenPersonaSel(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(SolicitarRecoPenPersonaSelMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(SolicitarRecoPenPersonaSelMessage.PARAMETRO_OBSERVACION, STP.getString(message.getObservacion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AsignarRecoPenPersonaSelMessage asignarRecoPenPersonaSel(AsignarRecoPenPersonaSelMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.asignarRecoPenPersonaSel(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void asignarRecoPenPersonaSel(AsignarRecoPenPersonaSelMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_ASIGNAR_RECO_PEN_PERSONA_SEL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getCodigoSimeRecoPen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.asignarRecoPenPersonaSel(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AsignarRecoPenPersonaSelMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AsignarRecoPenPersonaSelMessage.PARAMETRO_CODIGO_SIME_RECO_PEN, STP.getString(message.getCodigoSimeRecoPen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AprobarRecoPenPersonaSelMessage aprobarRecoPenPersonaSel(AprobarRecoPenPersonaSelMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.aprobarRecoPenPersonaSel(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void aprobarRecoPenPersonaSel(AprobarRecoPenPersonaSelMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_APROBAR_RECO_PEN_PERSONA_SEL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getObservacion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.aprobarRecoPenPersonaSel(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AprobarRecoPenPersonaSelMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(AprobarRecoPenPersonaSelMessage.PARAMETRO_OBSERVACION, STP.getString(message.getObservacion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DenegarRecoPenPersonaSelMessage denegarRecoPenPersonaSel(DenegarRecoPenPersonaSelMessage message) {
        Object idPersona = null;
        Persona persona = null;
        try {
//          idPersona = message.getIdPersona();
//          persona = facade.find(idPersona, true);
//          if (persona == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPersona));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.denegarRecoPenPersonaSel(message, persona);
                this.grabarRastroFuncion(message, persona);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void denegarRecoPenPersonaSel(DenegarRecoPenPersonaSelMessage message, Persona persona) throws Exception {
        String sql = PersonaConstants.PROCESO_FUNCION_DENEGAR_RECO_PEN_PERSONA_SEL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getObservacion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.denegarRecoPenPersonaSel(message, persona);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DenegarRecoPenPersonaSelMessage message, Persona persona) {
        RastroFuncion rastro = this.getRastroFuncion(message, persona);
        rastro.addParametro(DenegarRecoPenPersonaSelMessage.PARAMETRO_OBSERVACION, STP.getString(message.getObservacion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, Persona persona) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (persona == null) {
            return rastro;
        }
        rastro.setIdRecurso(persona.getIdPersona());
        rastro.setVersionRecurso(persona.getVersionPersona());
        rastro.setCodigoRecurso(persona.getCodigoPersona());
        rastro.setNombreRecurso(persona.getNombrePersona());
        return rastro;
    }
}
