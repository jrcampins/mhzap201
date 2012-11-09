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
package com.egt.ejb.business.message;

import com.egt.ejb.business.jms.BusinessProcessMessage;
import java.io.Serializable;
import java.util.Date;

public class RegistrarCerDefunPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_CERTIFICADO_DEFUNCION = 20111L;

    public static final long PARAMETRO_FECHA_CERTIFICADO_DEFUNCION = 20121L;

    protected Long idPersona;

    protected String certificadoDefuncion;

    protected Date fechaCertificadoDefuncion;

    public RegistrarCerDefunPersonaMessage(Long idPersona, String certificadoDefuncion, Date fechaCertificadoDefuncion) {
        this.init();
        this.funcion = 201000162L;
        this.idPersona = idPersona;
        this.certificadoDefuncion = certificadoDefuncion;
        this.fechaCertificadoDefuncion = fechaCertificadoDefuncion;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getCertificadoDefuncion() {
        return certificadoDefuncion;
    }

    public void setCertificadoDefuncion(String certificadoDefuncion) {
        this.certificadoDefuncion = certificadoDefuncion;
    }

    public Date getFechaCertificadoDefuncion() {
        return fechaCertificadoDefuncion;
    }

    public void setFechaCertificadoDefuncion(Date fechaCertificadoDefuncion) {
        this.fechaCertificadoDefuncion = fechaCertificadoDefuncion;
    }
}
