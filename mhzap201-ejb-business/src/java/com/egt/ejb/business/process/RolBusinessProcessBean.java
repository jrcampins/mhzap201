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
import com.egt.base.entity.constants.RolConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.CopiarRolMessage;
import com.egt.ejb.business.message.ModificarConjuntoRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.business.process.logic.RolBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Rol;
import com.egt.ejb.persistence.facade.RolFacadeLocal;
import com.egt.ejb.persistence.facade.TipoRolFacadeLocal;
import com.egt.ejb.persistence.facade.GrupoAplicacionFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class RolBusinessProcessBean implements RolBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private RolBusinessProcessLogicLocal logician;

    @EJB
    private RolFacadeLocal facade;

    @EJB
    private TipoRolFacadeLocal tipoRolFacade;

    @EJB
    private GrupoAplicacionFacadeLocal grupoAplicacionFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public CopiarRolMessage copiarRol(CopiarRolMessage message) {
        Long idRol = null;
        Rol rol = null;
        try {
            idRol = message.getIdRol();
            rol = facade.find(idRol, true);
            if (rol == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idRol));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.copiarRol(message, rol);
                this.grabarRastroFuncion(message, rol);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void copiarRol(CopiarRolMessage message, Rol rol) throws Exception {
        String sql = RolConstants.PROCESO_FUNCION_COPIAR_ROL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdRol();
            args[index++] = message.getCodigoRol();
            args[index++] = message.getNombreRol();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.copiarRol(message, rol);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(CopiarRolMessage message, Rol rol) {
        RastroFuncion rastro = this.getRastroFuncion(message, rol);
        rastro.addParametro(CopiarRolMessage.PARAMETRO_ID_ROL, STP.getString(message.getIdRol()));
        rastro.addParametro(CopiarRolMessage.PARAMETRO_CODIGO_ROL, STP.getString(message.getCodigoRol()));
        rastro.addParametro(CopiarRolMessage.PARAMETRO_NOMBRE_ROL, STP.getString(message.getNombreRol()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ModificarConjuntoRolMessage modificarConjuntoRol(ModificarConjuntoRolMessage message) {
        Long idRol = null;
        Rol rol = null;
        try {
            idRol = message.getIdRol();
            rol = facade.find(idRol, true);
            if (rol == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idRol));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.modificarConjuntoRol(message, rol);
                this.grabarRastroFuncion(message, rol);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void modificarConjuntoRol(ModificarConjuntoRolMessage message, Rol rol) throws Exception {
        String sql = RolConstants.PROCESO_FUNCION_MODIFICAR_CONJUNTO_ROL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdRol();
            args[index++] = message.getIdConjuntoSegmento();
            args[index++] = message.getEsSegmentada();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.modificarConjuntoRol(message, rol);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ModificarConjuntoRolMessage message, Rol rol) {
        RastroFuncion rastro = this.getRastroFuncion(message, rol);
        rastro.addParametro(ModificarConjuntoRolMessage.PARAMETRO_ID_ROL, STP.getString(message.getIdRol()));
        rastro.addParametro(ModificarConjuntoRolMessage.PARAMETRO_ID_CONJUNTO_SEGMENTO, STP.getString(message.getIdConjuntoSegmento()));
        rastro.addParametro(ModificarConjuntoRolMessage.PARAMETRO_ES_SEGMENTADA, STP.getString(message.getEsSegmentada()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public PropagarFiltrosRolMessage propagarFiltrosRol(PropagarFiltrosRolMessage message) {
        Long idRol = null;
        Rol rol = null;
        try {
            idRol = message.getIdRol();
            rol = facade.find(idRol, true);
            if (rol == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idRol));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.propagarFiltrosRol(message, rol);
                this.grabarRastroFuncion(message, rol);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void propagarFiltrosRol(PropagarFiltrosRolMessage message, Rol rol) throws Exception {
        String sql = RolConstants.PROCESO_FUNCION_PROPAGAR_FILTROS_ROL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdRol();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.propagarFiltrosRol(message, rol);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(PropagarFiltrosRolMessage message, Rol rol) {
        RastroFuncion rastro = this.getRastroFuncion(message, rol);
        rastro.addParametro(PropagarFiltrosRolMessage.PARAMETRO_ID_ROL, STP.getString(message.getIdRol()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public PropagarFavoritosRolMessage propagarFavoritosRol(PropagarFavoritosRolMessage message) {
        Long idRol = null;
        Rol rol = null;
        try {
            idRol = message.getIdRol();
            rol = facade.find(idRol, true);
            if (rol == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idRol));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.propagarFavoritosRol(message, rol);
                this.grabarRastroFuncion(message, rol);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void propagarFavoritosRol(PropagarFavoritosRolMessage message, Rol rol) throws Exception {
        String sql = RolConstants.PROCESO_FUNCION_PROPAGAR_FAVORITOS_ROL;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdRol();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.propagarFavoritosRol(message, rol);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(PropagarFavoritosRolMessage message, Rol rol) {
        RastroFuncion rastro = this.getRastroFuncion(message, rol);
        rastro.addParametro(PropagarFavoritosRolMessage.PARAMETRO_ID_ROL, STP.getString(message.getIdRol()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, Rol rol) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (rol == null) {
            return rastro;
        }
        rastro.setIdRecurso(rol.getIdRol());
        rastro.setVersionRecurso(rol.getVersionRol());
        rastro.setCodigoRecurso(rol.getCodigoRol());
        rastro.setNombreRecurso(rol.getNombreRol());
        return rastro;
    }
}
