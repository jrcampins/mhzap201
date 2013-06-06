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
import com.egt.base.entity.constants.ObjecionElePenConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.AnularObjecionElePenMessage;
import com.egt.ejb.business.process.logic.ObjecionElePenBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.ObjecionElePen;
import com.egt.ejb.persistence.facade.ObjecionElePenFacadeLocal;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.ProveedorDatExtFacadeLocal;
import com.egt.ejb.persistence.facade.TipoObjElePenFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class ObjecionElePenBusinessProcessBean implements ObjecionElePenBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ObjecionElePenBusinessProcessLogicLocal logician;

    @EJB
    private ObjecionElePenFacadeLocal facade;

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;

    @EJB
    private TipoObjElePenFacadeLocal tipoObjElePenFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public AnularObjecionElePenMessage anularObjecionElePen(AnularObjecionElePenMessage message) {
        Long idObjecionElePen = null;
        ObjecionElePen objecionElePen = null;
        try {
            idObjecionElePen = message.getIdObjecionElePen();
            objecionElePen = facade.find(idObjecionElePen, true);
            if (objecionElePen == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idObjecionElePen));
            } else if (BitUtils.valueOf(objecionElePen.getEsObjecionElePenInactiva())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + ObjecionElePenConstants.COLUMNA_ID_OBJECION_ELE_PEN + ">", idObjecionElePen));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularObjecionElePen(message, objecionElePen);
                this.grabarRastroFuncion(message, objecionElePen);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularObjecionElePen(AnularObjecionElePenMessage message, ObjecionElePen objecionElePen) throws Exception {
        String sql = ObjecionElePenConstants.PROCESO_FUNCION_ANULAR_OBJECION_ELE_PEN;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdObjecionElePen();
            args[index++] = message.getObservacionesAnulacion();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularObjecionElePen(message, objecionElePen);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularObjecionElePenMessage message, ObjecionElePen objecionElePen) {
        RastroFuncion rastro = this.getRastroFuncion(message, objecionElePen);
        rastro.addParametro(AnularObjecionElePenMessage.PARAMETRO_ID_OBJECION_ELE_PEN, STP.getString(message.getIdObjecionElePen()));
        rastro.addParametro(AnularObjecionElePenMessage.PARAMETRO_OBSERVACIONES_ANULACION, STP.getString(message.getObservacionesAnulacion()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, ObjecionElePen objecionElePen) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (objecionElePen == null) {
            return rastro;
        }
        rastro.setIdRecurso(objecionElePen.getIdObjecionElePen());
        rastro.setVersionRecurso(objecionElePen.getVersionObjecionElePen());
        return rastro;
    }
}
