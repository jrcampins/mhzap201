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
package com.egt.ejb.business.process.logic;

import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.IntUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.UsuarioAutenticado;
import com.egt.core.control.UsuarioAutenticadoCachingServiceLocator;
import com.egt.ejb.business.Bundle;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.persistence.entity.Usuario;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class UsuarioBusinessProcessLogicBean implements UsuarioBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    // </editor-fold>

    @Override
    public void designarSuperUsuario(DesignarSuperUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(DesignarSuperUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        if (BitUtils.valueOf(usuario.getEsSuperUsuario())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().warn(Bundle.getString("usuario_ya_super_usuario")));
        } else {
            usuario.setEsSuperUsuario(IntUtils.TRUE);
        }
    }

    @Override
    public void anularSuperUsuario(AnularSuperUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(AnularSuperUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        if (usuario.getIdUsuario().equals(message.getUsuario())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().error(Bundle.getString("usuario_es_usuario_actual")));
        } else if (!BitUtils.valueOf(usuario.getEsSuperUsuario())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().warn(Bundle.getString("usuario_no_super_usuario")));
        } else {
            usuario.setEsSuperUsuario(IntUtils.FALSE);
        }
    }

    @Override
    public void desactivarUsuario(DesactivarUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(DesactivarUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        if (usuario.getIdUsuario().equals(message.getUsuario())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().error(Bundle.getString("usuario_es_usuario_actual")));
        } else if (BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().warn(Bundle.getString("usuario_ya_inactivo")));
        } else {
            usuario.setEsUsuarioInactivo(IntUtils.TRUE);
        }
    }

    @Override
    public void reactivarUsuario(ReactivarUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(ReactivarUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        if (!BitUtils.valueOf(usuario.getEsUsuarioInactivo())) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().warn(Bundle.getString("usuario_no_inactivo")));
        } else {
            usuario.setEsUsuarioInactivo(IntUtils.FALSE);
        }
    }

    @Override
    public void sincronizarUsuario(SincronizarUsuarioMessage message, Usuario usuario) throws Exception {
        UsuarioAutenticado ua;
        if (message == null) {
            throw new EJBException(SincronizarUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        if (BitUtils.valueOf(usuario.getEsUsuarioModificado())) {
            ua = UsuarioAutenticadoCachingServiceLocator.getInstance(usuario.getCodigoUsuario());
            if (ua != null) {
                ua.setModificado(true);
            }
            usuario.setEsUsuarioModificado(IntUtils.FALSE);
        }
    }

    @Override
    public void asignarPasswordUsuario(AsignarPasswordUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(AsignarPasswordUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        usuario.setPasswordUsuario(message.getPasswordUsuario());
    }

    @Override
    public void asignarSupervisorUsuario(AsignarSupervisorUsuarioMessage message, Usuario usuario) throws Exception {
        if (message == null) {
            throw new EJBException(AsignarSupervisorUsuarioMessage.class.getSimpleName());
        }
        if (usuario == null) {
            throw new EJBException(Usuario.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        usuario.setUsuarioIdUsuarioSupervisor(this.usuarioFacade.find(message.getIdUsuarioSupervisor()));
    }

}
