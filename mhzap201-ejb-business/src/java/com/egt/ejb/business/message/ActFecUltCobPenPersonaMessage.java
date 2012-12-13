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

public class ActFecUltCobPenPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_FECHA_ULTIMO_COBRO_PENSION = 20635L;

    protected Long idPersona;

    protected Date fechaUltimoCobroPension;

    public ActFecUltCobPenPersonaMessage(Long idPersona, Date fechaUltimoCobroPension) {
        this.init();
        this.funcion = 201000166L;
        this.idPersona = idPersona;
        this.fechaUltimoCobroPension = fechaUltimoCobroPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaUltimoCobroPension() {
        return fechaUltimoCobroPension;
    }

    public void setFechaUltimoCobroPension(Date fechaUltimoCobroPension) {
        this.fechaUltimoCobroPension = fechaUltimoCobroPension;
    }
}
