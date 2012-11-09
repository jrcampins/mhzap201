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

public class RevocarPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_NUMERO_CAUSA_REV_PENSION = 20211L;

    public static final long PARAMETRO_OTRA_CAUSA_REV_PENSION = 20227L;

    public static final long PARAMETRO_COMENTARIOS_REVOCACION_PENSION = 20235L;

    protected Long idPersona;

    protected Integer numeroCausaRevPension;

    protected String otraCausaRevPension;

    protected String comentariosRevocacionPension;

    public RevocarPensionPersonaMessage(Long idPersona, Integer numeroCausaRevPension, String otraCausaRevPension, String comentariosRevocacionPension) {
        this.init();
        this.funcion = 201000153L;
        this.idPersona = idPersona;
        this.numeroCausaRevPension = numeroCausaRevPension;
        this.otraCausaRevPension = otraCausaRevPension;
        this.comentariosRevocacionPension = comentariosRevocacionPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getNumeroCausaRevPension() {
        return numeroCausaRevPension;
    }

    public void setNumeroCausaRevPension(Integer numeroCausaRevPension) {
        this.numeroCausaRevPension = numeroCausaRevPension;
    }

    public String getOtraCausaRevPension() {
        return otraCausaRevPension;
    }

    public void setOtraCausaRevPension(String otraCausaRevPension) {
        this.otraCausaRevPension = otraCausaRevPension;
    }

    public String getComentariosRevocacionPension() {
        return comentariosRevocacionPension;
    }

    public void setComentariosRevocacionPension(String comentariosRevocacionPension) {
        this.comentariosRevocacionPension = comentariosRevocacionPension;
    }
}
