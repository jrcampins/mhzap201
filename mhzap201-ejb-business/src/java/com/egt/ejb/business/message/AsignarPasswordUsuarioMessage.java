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

public class AsignarPasswordUsuarioMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_USUARIO = 1379L;

    public static final long PARAMETRO_PASSWORD_USUARIO = 1505L;

    protected Long idUsuario;

    protected String passwordUsuario;

    public AsignarPasswordUsuarioMessage(Long idUsuario, String passwordUsuario) {
        this.init();
        this.funcion = 106100113L;
        this.idUsuario = idUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
}
