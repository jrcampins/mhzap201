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
import com.egt.base.entity.constants.FichaHogarConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.DesactivarFichaHogarMessage;
import com.egt.ejb.business.message.ReactivarFichaHogarMessage;
import com.egt.ejb.business.message.CalcularIcvFichaHogarMessage;
import com.egt.ejb.business.process.logic.FichaHogarBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.FichaHogar;
import com.egt.ejb.persistence.facade.FichaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionarioFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatParedesFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatPisoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatTechoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoOcupacionVivFacadeLocal;
import com.egt.ejb.persistence.facade.SionoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoCombustibleFacadeLocal;
import com.egt.ejb.persistence.facade.TipoPiezaBanoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoServicioSanFacadeLocal;
import com.egt.ejb.persistence.facade.TipoServicioAguaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAbaAguaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoDesechoBasFacadeLocal;
import com.egt.ejb.persistence.facade.ProveedorDatExtFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class FichaHogarBusinessProcessBean implements FichaHogarBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private FichaHogarBusinessProcessLogicLocal logician;

    @EJB
    private FichaHogarFacadeLocal facade;

    @EJB
    private FuncionarioFacadeLocal funcionarioFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private TipoMatParedesFacadeLocal tipoMatParedesFacade;

    @EJB
    private TipoMatPisoFacadeLocal tipoMatPisoFacade;

    @EJB
    private TipoMatTechoFacadeLocal tipoMatTechoFacade;

    @EJB
    private TipoOcupacionVivFacadeLocal tipoOcupacionVivFacade;

    @EJB
    private SionoFacadeLocal sionoFacade;

    @EJB
    private TipoCombustibleFacadeLocal tipoCombustibleFacade;

    @EJB
    private TipoPiezaBanoFacadeLocal tipoPiezaBanoFacade;

    @EJB
    private TipoServicioSanFacadeLocal tipoServicioSanFacade;

    @EJB
    private TipoServicioAguaFacadeLocal tipoServicioAguaFacade;

    @EJB
    private TipoAbaAguaFacadeLocal tipoAbaAguaFacade;

    @EJB
    private TipoDesechoBasFacadeLocal tipoDesechoBasFacade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public DesactivarFichaHogarMessage desactivarFichaHogar(DesactivarFichaHogarMessage message) {
        Long idFichaHogar = null;
        FichaHogar fichaHogar = null;
        try {
            idFichaHogar = message.getIdFichaHogar();
            fichaHogar = facade.find(idFichaHogar, true);
            if (fichaHogar == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idFichaHogar));
            } else if (BitUtils.valueOf(fichaHogar.getEsFichaHogarInactiva())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + FichaHogarConstants.COLUMNA_ID_FICHA_HOGAR + ">", idFichaHogar));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.desactivarFichaHogar(message, fichaHogar);
                this.grabarRastroFuncion(message, fichaHogar);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void desactivarFichaHogar(DesactivarFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        String sql = FichaHogarConstants.PROCESO_FUNCION_DESACTIVAR_FICHA_HOGAR;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdFichaHogar();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.desactivarFichaHogar(message, fichaHogar);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesactivarFichaHogarMessage message, FichaHogar fichaHogar) {
        RastroFuncion rastro = this.getRastroFuncion(message, fichaHogar);
        rastro.addParametro(DesactivarFichaHogarMessage.PARAMETRO_ID_FICHA_HOGAR, STP.getString(message.getIdFichaHogar()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ReactivarFichaHogarMessage reactivarFichaHogar(ReactivarFichaHogarMessage message) {
        Long idFichaHogar = null;
        FichaHogar fichaHogar = null;
        try {
            idFichaHogar = message.getIdFichaHogar();
            fichaHogar = facade.find(idFichaHogar, true);
            if (fichaHogar == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idFichaHogar));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.reactivarFichaHogar(message, fichaHogar);
                this.grabarRastroFuncion(message, fichaHogar);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void reactivarFichaHogar(ReactivarFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        String sql = FichaHogarConstants.PROCESO_FUNCION_REACTIVAR_FICHA_HOGAR;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdFichaHogar();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.reactivarFichaHogar(message, fichaHogar);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ReactivarFichaHogarMessage message, FichaHogar fichaHogar) {
        RastroFuncion rastro = this.getRastroFuncion(message, fichaHogar);
        rastro.addParametro(ReactivarFichaHogarMessage.PARAMETRO_ID_FICHA_HOGAR, STP.getString(message.getIdFichaHogar()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public CalcularIcvFichaHogarMessage calcularIcvFichaHogar(CalcularIcvFichaHogarMessage message) {
        Long idFichaHogar = null;
        FichaHogar fichaHogar = null;
        try {
            idFichaHogar = message.getIdFichaHogar();
            fichaHogar = facade.find(idFichaHogar, true);
            if (fichaHogar == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idFichaHogar));
            } else if (BitUtils.valueOf(fichaHogar.getEsFichaHogarInactiva())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + FichaHogarConstants.COLUMNA_ID_FICHA_HOGAR + ">", idFichaHogar));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.calcularIcvFichaHogar(message, fichaHogar);
                this.grabarRastroFuncion(message, fichaHogar);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void calcularIcvFichaHogar(CalcularIcvFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        String sql = FichaHogarConstants.PROCESO_FUNCION_CALCULAR_ICV_FICHA_HOGAR;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdFichaHogar();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.calcularIcvFichaHogar(message, fichaHogar);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(CalcularIcvFichaHogarMessage message, FichaHogar fichaHogar) {
        RastroFuncion rastro = this.getRastroFuncion(message, fichaHogar);
        rastro.addParametro(CalcularIcvFichaHogarMessage.PARAMETRO_ID_FICHA_HOGAR, STP.getString(message.getIdFichaHogar()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, FichaHogar fichaHogar) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (fichaHogar == null) {
            return rastro;
        }
        rastro.setIdRecurso(fichaHogar.getIdFichaHogar());
        rastro.setVersionRecurso(fichaHogar.getVersionFichaHogar());
        rastro.setCodigoRecurso(fichaHogar.getCodigoFichaHogar());
        return rastro;
    }
}
