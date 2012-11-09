/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
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
import com.egt.base.entity.constants.PotencialBenConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.DesactivarPotencialBenMessage;
import com.egt.ejb.business.message.ReactivarPotencialBenMessage;
import com.egt.ejb.business.message.VincularPotencialBenMessage;
import com.egt.ejb.business.message.ValidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.InvalidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.RegReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AprobarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.DenegarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AcreditarPotencialBenMessage;
import com.egt.ejb.business.message.RegUltVisCenPotencialBenMessage;
import com.egt.ejb.business.process.logic.PotencialBenBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.PotencialBen;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
import com.egt.ejb.persistence.facade.TipoRegPotBenFacadeLocal;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EtniaIndigenaFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionCensoFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionarioFacadeLocal;
import com.egt.ejb.persistence.facade.CausaInvCensoFacadeLocal;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionReclCenFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenReclCenFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PotencialBenBusinessProcessBean implements PotencialBenBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PotencialBenBusinessProcessLogicLocal logician;

    @EJB
    private PotencialBenFacadeLocal facade;

    @EJB
    private TipoRegPotBenFacadeLocal tipoRegPotBenFacade;

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private EtniaIndigenaFacadeLocal etniaIndigenaFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private CondicionCensoFacadeLocal condicionCensoFacade;

    @EJB
    private FuncionarioFacadeLocal funcionarioFacade;

    @EJB
    private CausaInvCensoFacadeLocal causaInvCensoFacade;

    @EJB
    private FichaPersonaFacadeLocal fichaPersonaFacade;

    @EJB
    private CondicionReclCenFacadeLocal condicionReclCenFacade;

    @EJB
    private CausaDenReclCenFacadeLocal causaDenReclCenFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public DesactivarPotencialBenMessage desactivarPotencialBen(DesactivarPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.desactivarPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void desactivarPotencialBen(DesactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_DESACTIVAR_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.desactivarPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesactivarPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(DesactivarPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ReactivarPotencialBenMessage reactivarPotencialBen(ReactivarPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.reactivarPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void reactivarPotencialBen(ReactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_REACTIVAR_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.reactivarPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ReactivarPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(ReactivarPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public VincularPotencialBenMessage vincularPotencialBen(VincularPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.vincularPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void vincularPotencialBen(VincularPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_VINCULAR_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getIdPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.vincularPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(VincularPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(VincularPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(VincularPotencialBenMessage.PARAMETRO_ID_PERSONA, STP.getString(message.getIdPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ValidarCensoPotencialBenMessage validarCensoPotencialBen(ValidarCensoPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.validarCensoPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void validarCensoPotencialBen(ValidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_VALIDAR_CENSO_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getIdFuncionarioValidacionCen();
            args[index++] = message.getComentariosValidacionCenso();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.validarCensoPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ValidarCensoPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(ValidarCensoPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(ValidarCensoPotencialBenMessage.PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN, STP.getString(message.getIdFuncionarioValidacionCen()));
        rastro.addParametro(ValidarCensoPotencialBenMessage.PARAMETRO_COMENTARIOS_VALIDACION_CENSO, STP.getString(message.getComentariosValidacionCenso()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public InvalidarCensoPotencialBenMessage invalidarCensoPotencialBen(InvalidarCensoPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.invalidarCensoPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void invalidarCensoPotencialBen(InvalidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_INVALIDAR_CENSO_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[6]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getIdFuncionarioValidacionCen();
            args[index++] = message.getNumeroCausaInvCenso();
            args[index++] = message.getOtraCausaInvCenso();
            args[index++] = message.getComentariosValidacionCenso();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.invalidarCensoPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(InvalidarCensoPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(InvalidarCensoPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(InvalidarCensoPotencialBenMessage.PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN, STP.getString(message.getIdFuncionarioValidacionCen()));
        rastro.addParametro(InvalidarCensoPotencialBenMessage.PARAMETRO_NUMERO_CAUSA_INV_CENSO, STP.getString(message.getNumeroCausaInvCenso()));
        rastro.addParametro(InvalidarCensoPotencialBenMessage.PARAMETRO_OTRA_CAUSA_INV_CENSO, STP.getString(message.getOtraCausaInvCenso()));
        rastro.addParametro(InvalidarCensoPotencialBenMessage.PARAMETRO_COMENTARIOS_VALIDACION_CENSO, STP.getString(message.getComentariosValidacionCenso()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RegReclCenPotencialBenMessage regReclCenPotencialBen(RegReclCenPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.regReclCenPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void regReclCenPotencialBen(RegReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_REG_RECL_CEN_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getComentariosReclamoCenso();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.regReclCenPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegReclCenPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(RegReclCenPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(RegReclCenPotencialBenMessage.PARAMETRO_COMENTARIOS_RECLAMO_CENSO, STP.getString(message.getComentariosReclamoCenso()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AprobarReclCenPotencialBenMessage aprobarReclCenPotencialBen(AprobarReclCenPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.aprobarReclCenPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void aprobarReclCenPotencialBen(AprobarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_APROBAR_RECL_CEN_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getComentariosAprReclCen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.aprobarReclCenPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AprobarReclCenPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(AprobarReclCenPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(AprobarReclCenPotencialBenMessage.PARAMETRO_COMENTARIOS_APR_RECL_CEN, STP.getString(message.getComentariosAprReclCen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DenegarReclCenPotencialBenMessage denegarReclCenPotencialBen(DenegarReclCenPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.denegarReclCenPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void denegarReclCenPotencialBen(DenegarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_DENEGAR_RECL_CEN_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getNumeroCausaDenReclCen();
            args[index++] = message.getOtraCausaDenReclCen();
            args[index++] = message.getComentariosDenReclCen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.denegarReclCenPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DenegarReclCenPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(DenegarReclCenPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(DenegarReclCenPotencialBenMessage.PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, STP.getString(message.getNumeroCausaDenReclCen()));
        rastro.addParametro(DenegarReclCenPotencialBenMessage.PARAMETRO_OTRA_CAUSA_DEN_RECL_CEN, STP.getString(message.getOtraCausaDenReclCen()));
        rastro.addParametro(DenegarReclCenPotencialBenMessage.PARAMETRO_COMENTARIOS_DEN_RECL_CEN, STP.getString(message.getComentariosDenReclCen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AcreditarPotencialBenMessage acreditarPotencialBen(AcreditarPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.acreditarPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void acreditarPotencialBen(AcreditarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_ACREDITAR_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.acreditarPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AcreditarPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(AcreditarPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public RegUltVisCenPotencialBenMessage regUltVisCenPotencialBen(RegUltVisCenPotencialBenMessage message) {
        Long idPotencialBen = null;
        PotencialBen potencialBen = null;
        try {
            idPotencialBen = message.getIdPotencialBen();
            potencialBen = facade.find(idPotencialBen, true);
            if (potencialBen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idPotencialBen));
            } else if (BitUtils.valueOf(potencialBen.getEsPotencialBenInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + PotencialBenConstants.COLUMNA_ID_POTENCIAL_BEN + ">", idPotencialBen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.regUltVisCenPotencialBen(message, potencialBen);
                this.grabarRastroFuncion(message, potencialBen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void regUltVisCenPotencialBen(RegUltVisCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        String sql = PotencialBenConstants.PROCESO_FUNCION_REG_ULT_VIS_CEN_POTENCIAL_BEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[5]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdPotencialBen();
            args[index++] = message.getFechaUltimaVisitaCenso();
            args[index++] = message.getIdFuncionarioUltVisitaCen();
            args[index++] = message.getObservacionesUltVisitaCen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.regUltVisCenPotencialBen(message, potencialBen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(RegUltVisCenPotencialBenMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = this.getRastroFuncion(message, potencialBen);
        rastro.addParametro(RegUltVisCenPotencialBenMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        rastro.addParametro(RegUltVisCenPotencialBenMessage.PARAMETRO_FECHA_ULTIMA_VISITA_CENSO, STP.getString(message.getFechaUltimaVisitaCenso()));
        rastro.addParametro(RegUltVisCenPotencialBenMessage.PARAMETRO_ID_FUNCIONARIO_ULT_VISITA_CEN, STP.getString(message.getIdFuncionarioUltVisitaCen()));
        rastro.addParametro(RegUltVisCenPotencialBenMessage.PARAMETRO_OBSERVACIONES_ULT_VISITA_CEN, STP.getString(message.getObservacionesUltVisitaCen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, PotencialBen potencialBen) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (potencialBen == null) {
            return rastro;
        }
        rastro.setIdRecurso(potencialBen.getIdPotencialBen());
        rastro.setVersionRecurso(potencialBen.getVersionPotencialBen());
        rastro.setCodigoRecurso(potencialBen.getCodigoPotencialBen());
        rastro.setNombreRecurso(potencialBen.getNombrePotencialBen());
        return rastro;
    }
}
