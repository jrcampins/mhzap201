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

import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import com.egt.ejb.persistence.entity.Usuario;
import javax.ejb.Local;

@Local
public interface UsuarioBusinessProcessLogicLocal {

    public void designarSuperUsuario(DesignarSuperUsuarioMessage message, Usuario usuario) throws Exception;

    public void anularSuperUsuario(AnularSuperUsuarioMessage message, Usuario usuario) throws Exception;

    public void desactivarUsuario(DesactivarUsuarioMessage message, Usuario usuario) throws Exception;

    public void reactivarUsuario(ReactivarUsuarioMessage message, Usuario usuario) throws Exception;

    public void sincronizarUsuario(SincronizarUsuarioMessage message, Usuario usuario) throws Exception;

    public void asignarPasswordUsuario(AsignarPasswordUsuarioMessage message, Usuario usuario) throws Exception;

    public void asignarSupervisorUsuario(AsignarSupervisorUsuarioMessage message, Usuario usuario) throws Exception;
}
