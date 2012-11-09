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

import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import javax.ejb.Local;

@Local
public interface UsuarioBusinessProcessLocal {

    public DesignarSuperUsuarioMessage designarSuperUsuario(DesignarSuperUsuarioMessage message);

    public AnularSuperUsuarioMessage anularSuperUsuario(AnularSuperUsuarioMessage message);

    public DesactivarUsuarioMessage desactivarUsuario(DesactivarUsuarioMessage message);

    public ReactivarUsuarioMessage reactivarUsuario(ReactivarUsuarioMessage message);

    public SincronizarUsuarioMessage sincronizarUsuario(SincronizarUsuarioMessage message);

    public AsignarPasswordUsuarioMessage asignarPasswordUsuario(AsignarPasswordUsuarioMessage message);

    public AsignarSupervisorUsuarioMessage asignarSupervisorUsuario(AsignarSupervisorUsuarioMessage message);
}
