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

public class DenegarPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_NUMERO_CAUSA_DEN_PENSION = 20224L;

    public static final long PARAMETRO_OTRA_CAUSA_DEN_PENSION = 20226L;

    public static final long PARAMETRO_COMENTARIOS_DENEGACION_PENSION = 20231L;

    protected Long idPersona;

    protected Integer numeroCausaDenPension;

    protected String otraCausaDenPension;

    protected String comentariosDenegacionPension;

    public DenegarPensionPersonaMessage(Long idPersona, Integer numeroCausaDenPension, String otraCausaDenPension, String comentariosDenegacionPension) {
        this.init();
        this.funcion = 201000152L;
        this.idPersona = idPersona;
        this.numeroCausaDenPension = numeroCausaDenPension;
        this.otraCausaDenPension = otraCausaDenPension;
        this.comentariosDenegacionPension = comentariosDenegacionPension;
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

    public String getComentariosDenegacionPension() {
        return comentariosDenegacionPension;
    }

    public void setComentariosDenegacionPension(String comentariosDenegacionPension) {
        this.comentariosDenegacionPension = comentariosDenegacionPension;
    }
}
