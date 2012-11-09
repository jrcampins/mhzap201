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

public class RegistrarCerVidaPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_CERTIFICADO_VIDA = 20112L;

    public static final long PARAMETRO_FECHA_CERTIFICADO_VIDA = 20122L;

    protected Long idPersona;

    protected String certificadoVida;

    protected Date fechaCertificadoVida;

    public RegistrarCerVidaPersonaMessage(Long idPersona, String certificadoVida, Date fechaCertificadoVida) {
        this.init();
        this.funcion = 201000160L;
        this.idPersona = idPersona;
        this.certificadoVida = certificadoVida;
        this.fechaCertificadoVida = fechaCertificadoVida;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getCertificadoVida() {
        return certificadoVida;
    }

    public void setCertificadoVida(String certificadoVida) {
        this.certificadoVida = certificadoVida;
    }

    public Date getFechaCertificadoVida() {
        return fechaCertificadoVida;
    }

    public void setFechaCertificadoVida(Date fechaCertificadoVida) {
        this.fechaCertificadoVida = fechaCertificadoVida;
    }
}
