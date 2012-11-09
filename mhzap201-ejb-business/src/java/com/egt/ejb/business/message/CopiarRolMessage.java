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

public class CopiarRolMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_ROL = 1370L;

    public static final long PARAMETRO_CODIGO_ROL = 1185L;

    public static final long PARAMETRO_NOMBRE_ROL = 1466L;

    protected Long idRol;

    protected String codigoRol;

    protected String nombreRol;

    public CopiarRolMessage(Long idRol, String codigoRol, String nombreRol) {
        this.init();
        this.funcion = 106400105L;
        this.idRol = idRol;
        this.codigoRol = codigoRol;
        this.nombreRol = nombreRol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
