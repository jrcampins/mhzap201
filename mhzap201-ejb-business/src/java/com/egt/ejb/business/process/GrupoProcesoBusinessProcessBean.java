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
package com.egt.ejb.business.process;

import com.egt.base.constants.CBM2;
import com.egt.base.entity.constants.GrupoProcesoConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.CancelarGrupoProcesoMessage;
import com.egt.ejb.business.process.logic.GrupoProcesoBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.GrupoProceso;
import com.egt.ejb.persistence.facade.GrupoProcesoFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionEjeFunFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class GrupoProcesoBusinessProcessBean implements GrupoProcesoBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private GrupoProcesoBusinessProcessLogicLocal logician;

    @EJB
    private GrupoProcesoFacadeLocal facade;

    @EJB
    private CondicionEjeFunFacadeLocal condicionEjeFunFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public CancelarGrupoProcesoMessage cancelarGrupoProceso(CancelarGrupoProcesoMessage message) {
        Long idGrupoProceso = null;
        GrupoProceso grupoProceso = null;
        try {
            idGrupoProceso = message.getIdGrupoProceso();
            grupoProceso = facade.find(idGrupoProceso, true);
            if (grupoProceso == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idGrupoProceso));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.cancelarGrupoProceso(message, grupoProceso);
                this.grabarRastroFuncion(message, grupoProceso);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void cancelarGrupoProceso(CancelarGrupoProcesoMessage message, GrupoProceso grupoProceso) throws Exception {
        String sql = GrupoProcesoConstants.PROCESO_FUNCION_CANCELAR_GRUPO_PROCESO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdGrupoProceso();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.cancelarGrupoProceso(message, grupoProceso);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(CancelarGrupoProcesoMessage message, GrupoProceso grupoProceso) {
        RastroFuncion rastro = this.getRastroFuncion(message, grupoProceso);
        rastro.addParametro(CancelarGrupoProcesoMessage.PARAMETRO_ID_GRUPO_PROCESO, STP.getString(message.getIdGrupoProceso()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, GrupoProceso grupoProceso) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (grupoProceso == null) {
            return rastro;
        }
        rastro.setIdRecurso(grupoProceso.getIdGrupoProceso());
        rastro.setVersionRecurso(grupoProceso.getVersionGrupoProceso());
        rastro.setCodigoRecurso(grupoProceso.getCodigoGrupoProceso());
        rastro.setNombreRecurso(grupoProceso.getNombreGrupoProceso());
        return rastro;
    }
}
