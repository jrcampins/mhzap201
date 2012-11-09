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
import com.egt.base.entity.constants.UsuarioConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import com.egt.ejb.business.process.logic.UsuarioBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Usuario;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class UsuarioBusinessProcessBean implements UsuarioBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private UsuarioBusinessProcessLogicLocal logician;

    @EJB
    private UsuarioFacadeLocal facade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public DesignarSuperUsuarioMessage designarSuperUsuario(DesignarSuperUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.designarSuperUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void designarSuperUsuario(DesignarSuperUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_DESIGNAR_SUPER_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.designarSuperUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesignarSuperUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(DesignarSuperUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AnularSuperUsuarioMessage anularSuperUsuario(AnularSuperUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.anularSuperUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void anularSuperUsuario(AnularSuperUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_ANULAR_SUPER_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.anularSuperUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AnularSuperUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(AnularSuperUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public DesactivarUsuarioMessage desactivarUsuario(DesactivarUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.desactivarUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void desactivarUsuario(DesactivarUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_DESACTIVAR_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.desactivarUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(DesactivarUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(DesactivarUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ReactivarUsuarioMessage reactivarUsuario(ReactivarUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.reactivarUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void reactivarUsuario(ReactivarUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_REACTIVAR_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.reactivarUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ReactivarUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(ReactivarUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public SincronizarUsuarioMessage sincronizarUsuario(SincronizarUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.sincronizarUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void sincronizarUsuario(SincronizarUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_SINCRONIZAR_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.sincronizarUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(SincronizarUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(SincronizarUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AsignarPasswordUsuarioMessage asignarPasswordUsuario(AsignarPasswordUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.asignarPasswordUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void asignarPasswordUsuario(AsignarPasswordUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_ASIGNAR_PASSWORD_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            args[index++] = message.getPasswordUsuario();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.asignarPasswordUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AsignarPasswordUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(AsignarPasswordUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        rastro.addParametro(AsignarPasswordUsuarioMessage.PARAMETRO_PASSWORD_USUARIO, STP.getString(message.getPasswordUsuario()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public AsignarSupervisorUsuarioMessage asignarSupervisorUsuario(AsignarSupervisorUsuarioMessage message) {
        Long idUsuario = null;
        Usuario usuario = null;
        try {
            idUsuario = message.getIdUsuario();
            usuario = facade.find(idUsuario, true);
            if (usuario == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idUsuario));
            } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + UsuarioConstants.COLUMNA_ID_USUARIO + ">", idUsuario));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.asignarSupervisorUsuario(message, usuario);
                this.grabarRastroFuncion(message, usuario);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void asignarSupervisorUsuario(AsignarSupervisorUsuarioMessage message, Usuario usuario) throws Exception {
        String sql = UsuarioConstants.PROCESO_FUNCION_ASIGNAR_SUPERVISOR_USUARIO;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[3]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdUsuario();
            args[index++] = message.getIdUsuarioSupervisor();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.asignarSupervisorUsuario(message, usuario);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(AsignarSupervisorUsuarioMessage message, Usuario usuario) {
        RastroFuncion rastro = this.getRastroFuncion(message, usuario);
        rastro.addParametro(AsignarSupervisorUsuarioMessage.PARAMETRO_ID_USUARIO, STP.getString(message.getIdUsuario()));
        rastro.addParametro(AsignarSupervisorUsuarioMessage.PARAMETRO_ID_USUARIO_SUPERVISOR, STP.getString(message.getIdUsuarioSupervisor()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, Usuario usuario) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (usuario == null) {
            return rastro;
        }
        rastro.setIdRecurso(usuario.getIdUsuario());
        rastro.setVersionRecurso(usuario.getVersionUsuario());
        rastro.setCodigoRecurso(usuario.getCodigoUsuario());
        rastro.setNombreRecurso(usuario.getNombreUsuario());
//      rastro.setIdPropietarioRecurso(usuario.getIdUsuario());
        return rastro;
    }
}
