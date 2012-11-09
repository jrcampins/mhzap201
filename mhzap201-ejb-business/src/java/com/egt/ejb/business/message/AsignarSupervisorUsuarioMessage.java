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
package com.egt.ejb.business.message;

import com.egt.ejb.business.jms.BusinessProcessMessage;
import java.io.Serializable;

public class AsignarSupervisorUsuarioMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_USUARIO = 1379L;

    public static final long PARAMETRO_ID_USUARIO_SUPERVISOR = 1985L;

    protected Long idUsuario;

    protected Long idUsuarioSupervisor;

    public AsignarSupervisorUsuarioMessage(Long idUsuario, Long idUsuarioSupervisor) {
        this.init();
        this.funcion = 106100114L;
        this.idUsuario = idUsuario;
        this.idUsuarioSupervisor = idUsuarioSupervisor;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuarioSupervisor() {
        return idUsuarioSupervisor;
    }

    public void setIdUsuarioSupervisor(Long idUsuarioSupervisor) {
        this.idUsuarioSupervisor = idUsuarioSupervisor;
    }
}
