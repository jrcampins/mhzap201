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

public class DenegarRecoPenPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN = 20248L;

    public static final long PARAMETRO_OTRA_CAUSA_DEN_RECO_PEN = 20249L;

    public static final long PARAMETRO_COMENTARIOS_DEN_RECO_PEN = 20232L;

    protected Long idPersona;

    protected Integer numeroCausaDenRecoPen;

    protected String otraCausaDenRecoPen;

    protected String comentariosDenRecoPen;

    public DenegarRecoPenPersonaMessage(Long idPersona, Integer numeroCausaDenRecoPen, String otraCausaDenRecoPen, String comentariosDenRecoPen) {
        this.init();
        this.funcion = 201000156L;
        this.idPersona = idPersona;
        this.numeroCausaDenRecoPen = numeroCausaDenRecoPen;
        this.otraCausaDenRecoPen = otraCausaDenRecoPen;
        this.comentariosDenRecoPen = comentariosDenRecoPen;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getNumeroCausaDenRecoPen() {
        return numeroCausaDenRecoPen;
    }

    public void setNumeroCausaDenRecoPen(Integer numeroCausaDenRecoPen) {
        this.numeroCausaDenRecoPen = numeroCausaDenRecoPen;
    }

    public String getOtraCausaDenRecoPen() {
        return otraCausaDenRecoPen;
    }

    public void setOtraCausaDenRecoPen(String otraCausaDenRecoPen) {
        this.otraCausaDenRecoPen = otraCausaDenRecoPen;
    }

    public String getComentariosDenRecoPen() {
        return comentariosDenRecoPen;
    }

    public void setComentariosDenRecoPen(String comentariosDenRecoPen) {
        this.comentariosDenRecoPen = comentariosDenRecoPen;
    }
}
