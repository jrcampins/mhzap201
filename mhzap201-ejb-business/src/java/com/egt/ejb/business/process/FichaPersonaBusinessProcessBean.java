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
import com.egt.base.entity.constants.FichaPersonaConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.VincularFichaPersonaMessage;
import com.egt.ejb.business.message.DesvincularFichaPersonaMessage;
import com.egt.ejb.business.process.logic.FichaPersonaBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.FichaPersona;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.FichaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.SexoPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoCivilFacadeLocal;
import com.egt.ejb.persistence.facade.TipoPersonaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.SionoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoExcepcionCedFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.IdiomaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoInaEscFacadeLocal;
import com.egt.ejb.persistence.facade.NivelEducativoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoSeguroMedicoFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoSaludFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseEnfAccFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseEnfCronicaFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoNoAtencionFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseImpedimentoFacadeLocal;
import com.egt.ejb.persistence.facade.CausaImpedimentoFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoNoTrabajoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoRelacionLabFacadeLocal;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class FichaPersonaBusinessProcessBean implements FichaPersonaBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private FichaPersonaBusinessProcessLogicLocal logician;

    @EJB
    private FichaPersonaFacadeLocal facade;

    @EJB
    private FichaHogarFacadeLocal fichaHogarFacade;

    @EJB
    private SexoPersonaFacadeLocal sexoPersonaFacade;

    @EJB
    private EstadoCivilFacadeLocal estadoCivilFacade;

    @EJB
    private TipoPersonaHogarFacadeLocal tipoPersonaHogarFacade;

    @EJB
    private SionoFacadeLocal sionoFacade;

    @EJB
    private TipoExcepcionCedFacadeLocal tipoExcepcionCedFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private IdiomaHogarFacadeLocal idiomaHogarFacade;

    @EJB
    private MotivoInaEscFacadeLocal motivoInaEscFacade;

    @EJB
    private NivelEducativoFacadeLocal nivelEducativoFacade;

    @EJB
    private TipoSeguroMedicoFacadeLocal tipoSeguroMedicoFacade;

    @EJB
    private EstadoSaludFacadeLocal estadoSaludFacade;

    @EJB
    private ClaseEnfAccFacadeLocal claseEnfAccFacade;

    @EJB
    private ClaseEnfCronicaFacadeLocal claseEnfCronicaFacade;

    @EJB
    private MotivoNoAtencionFacadeLocal motivoNoAtencionFacade;

    @EJB
    private ClaseImpedimentoFacadeLocal claseImpedimentoFacade;

    @EJB
    private CausaImpedimentoFacadeLocal causaImpedimentoFacade;

    @EJB
    private MotivoNoTrabajoFacadeLocal motivoNoTrabajoFacade;

    @EJB
    private TipoRelacionLabFacadeLocal tipoRelacionLabFacade;

    @EJB
    private PotencialBenFacadeLocal potencialBenFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public VincularFichaPersonaMessage vincularFichaPersona(VincularFichaPersonaMessage message) {
        Long idFichaPersona = null;
        FichaPersona fichaPersona = null;
        try {
            idFichaPersona = message.getIdFichaPersona();
            fichaPersona = facade.find(idFichaPersona, true);
            if (fichaPersona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idFichaPersona));
            } else if (BitUtils.valueOf(fichaPersona.getEsFichaPersonaInactiva())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + FichaPersonaConstants.COLUMNA_ID_FICHA_PERSONA + ">", idFichaPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.vincularFichaPersona(message, fichaPersona);
                this.grabarRastroFuncion(message, fichaPersona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void vincularFichaPersona(VincularFichaPersonaMessage message, FichaPersona fichaPersona) throws Exception {
        String sql = FichaPersonaConstants.PROCESO_FUNCION_VINCULAR_FICHA_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdFichaPersona();
            args[index++] = message.getIdPotencialBen();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.vincularFichaPersona(message, fichaPersona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(VincularFichaPersonaMessage message, FichaPersona fichaPersona) {
        RastroFuncion rastro = this.getRastroFuncion(message, fichaPersona);
        rastro.addParametro(VincularFichaPersonaMessage.PARAMETRO_ID_FICHA_PERSONA, STP.getString(message.getIdFichaPersona()));
        rastro.addParametro(VincularFichaPersonaMessage.PARAMETRO_ID_POTENCIAL_BEN, STP.getString(message.getIdPotencialBen()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DesvincularFichaPersonaMessage desvincularFichaPersona(DesvincularFichaPersonaMessage message) {
        Long idFichaPersona = null;
        FichaPersona fichaPersona = null;
        try {
            idFichaPersona = message.getIdFichaPersona();
            fichaPersona = facade.find(idFichaPersona, true);
            if (fichaPersona == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idFichaPersona));
            } else if (BitUtils.valueOf(fichaPersona.getEsFichaPersonaInactiva())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + FichaPersonaConstants.COLUMNA_ID_FICHA_PERSONA + ">", idFichaPersona));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.desvincularFichaPersona(message, fichaPersona);
                this.grabarRastroFuncion(message, fichaPersona);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void desvincularFichaPersona(DesvincularFichaPersonaMessage message, FichaPersona fichaPersona) throws Exception {
        String sql = FichaPersonaConstants.PROCESO_FUNCION_DESVINCULAR_FICHA_PERSONA;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdFichaPersona();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.desvincularFichaPersona(message, fichaPersona);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesvincularFichaPersonaMessage message, FichaPersona fichaPersona) {
        RastroFuncion rastro = this.getRastroFuncion(message, fichaPersona);
        rastro.addParametro(DesvincularFichaPersonaMessage.PARAMETRO_ID_FICHA_PERSONA, STP.getString(message.getIdFichaPersona()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, FichaPersona fichaPersona) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (fichaPersona == null) {
            return rastro;
        }
        rastro.setIdRecurso(fichaPersona.getIdFichaPersona());
        rastro.setVersionRecurso(fichaPersona.getVersionFichaPersona());
        rastro.setCodigoRecurso(fichaPersona.getCodigoFichaPersona());
        rastro.setNombreRecurso(fichaPersona.getNombreFichaPersona());
        return rastro;
    }
}
