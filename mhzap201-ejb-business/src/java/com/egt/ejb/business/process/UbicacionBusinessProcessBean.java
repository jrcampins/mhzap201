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
import com.egt.base.entity.constants.UbicacionConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.ReconstruirUbicacionMessage;
import com.egt.ejb.business.process.logic.UbicacionBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Ubicacion;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoNodoFacadeLocal;
import com.egt.ejb.persistence.facade.NivelUbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class UbicacionBusinessProcessBean implements UbicacionBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private UbicacionBusinessProcessLogicLocal logician;

    @EJB
    private UbicacionFacadeLocal facade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoNodoFacadeLocal tipoNodoFacade;

    @EJB
    private NivelUbicacionFacadeLocal nivelUbicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public ReconstruirUbicacionMessage reconstruirUbicacion(ReconstruirUbicacionMessage message) {
        Object idUbicacion = null;
        Ubicacion ubicacion = null;
        try {
//          idUbicacion = message.getIdUbicacion();
//          ubicacion = facade.find(idUbicacion, true);
//          if (ubicacion == null) {
//              message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
//              message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUbicacion));
//          } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.reconstruirUbicacion(message, ubicacion);
                this.grabarRastroFuncion(message, ubicacion);
//          }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void reconstruirUbicacion(ReconstruirUbicacionMessage message, Ubicacion ubicacion) throws Exception {
        String sql = UbicacionConstants.PROCESO_FUNCION_RECONSTRUIR_UBICACION;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[1]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
//          logician.reconstruirUbicacion(message, ubicacion);
//          facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ReconstruirUbicacionMessage message, Ubicacion ubicacion) {
        RastroFuncion rastro = this.getRastroFuncion(message, ubicacion);
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, Ubicacion ubicacion) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (ubicacion == null) {
            return rastro;
        }
        rastro.setIdRecurso(ubicacion.getIdUbicacion());
        rastro.setVersionRecurso(ubicacion.getVersionUbicacion());
        rastro.setCodigoRecurso(ubicacion.getCodigoUbicacion());
        rastro.setNombreRecurso(ubicacion.getNombreUbicacion());
        return rastro;
    }
}
