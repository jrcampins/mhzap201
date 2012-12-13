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

public class RegistrarEntregaDocPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_CERTIFICADO_VIDA = 20112L;

    public static final long PARAMETRO_FECHA_CERTIFICADO_VIDA = 20122L;

    public static final long PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA = 20679L;

    public static final long PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR = 20680L;

    protected Long idPersona;

    protected String certificadoVida;

    protected Date fechaCertificadoVida;

    protected Integer esPersonaConCopiaCedula;

    protected Integer esPersonaConDeclaracionJur;

    public RegistrarEntregaDocPersonaMessage(Long idPersona, String certificadoVida, Date fechaCertificadoVida, Integer esPersonaConCopiaCedula, Integer esPersonaConDeclaracionJur) {
        this.init();
        this.funcion = 201000159L;
        this.idPersona = idPersona;
        this.certificadoVida = certificadoVida;
        this.fechaCertificadoVida = fechaCertificadoVida;
        this.esPersonaConCopiaCedula = esPersonaConCopiaCedula;
        this.esPersonaConDeclaracionJur = esPersonaConDeclaracionJur;
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

    public Integer getEsPersonaConCopiaCedula() {
        return esPersonaConCopiaCedula;
    }

    public void setEsPersonaConCopiaCedula(Integer esPersonaConCopiaCedula) {
        this.esPersonaConCopiaCedula = esPersonaConCopiaCedula;
    }

    public Integer getEsPersonaConDeclaracionJur() {
        return esPersonaConDeclaracionJur;
    }

    public void setEsPersonaConDeclaracionJur(Integer esPersonaConDeclaracionJur) {
        this.esPersonaConDeclaracionJur = esPersonaConDeclaracionJur;
    }
}
