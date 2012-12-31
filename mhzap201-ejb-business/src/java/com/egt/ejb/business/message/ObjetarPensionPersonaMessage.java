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

public class ObjetarPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_NUMERO_CAUSA_DEN_PENSION = 20224L;

    public static final long PARAMETRO_OTRA_CAUSA_DEN_PENSION = 20226L;

    public static final long PARAMETRO_COMENTARIOS_OBJECION_PENSION = 20896L;

    protected Long idPersona;

    protected Integer numeroCausaDenPension;

    protected String otraCausaDenPension;

    protected String comentariosObjecionPension;

    public ObjetarPensionPersonaMessage(Long idPersona, Integer numeroCausaDenPension, String otraCausaDenPension, String comentariosObjecionPension) {
        this.init();
        this.funcion = 201000156L;
        this.idPersona = idPersona;
        this.numeroCausaDenPension = numeroCausaDenPension;
        this.otraCausaDenPension = otraCausaDenPension;
        this.comentariosObjecionPension = comentariosObjecionPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getNumeroCausaDenPension() {
        return numeroCausaDenPension;
    }

    public void setNumeroCausaDenPension(Integer numeroCausaDenPension) {
        this.numeroCausaDenPension = numeroCausaDenPension;
    }

    public String getOtraCausaDenPension() {
        return otraCausaDenPension;
    }

    public void setOtraCausaDenPension(String otraCausaDenPension) {
        this.otraCausaDenPension = otraCausaDenPension;
    }

    public String getComentariosObjecionPension() {
        return comentariosObjecionPension;
    }

    public void setComentariosObjecionPension(String comentariosObjecionPension) {
        this.comentariosObjecionPension = comentariosObjecionPension;
    }
}
