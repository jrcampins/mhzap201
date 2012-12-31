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

public class SolicitarRecoPenPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_COMENTARIOS_SOLICITUD_RECO_PEN = 20237L;

    protected Long idPersona;

    protected String comentariosSolicitudRecoPen;

    public SolicitarRecoPenPersonaMessage(Long idPersona, String comentariosSolicitudRecoPen) {
        this.init();
        this.funcion = 201000161L;
        this.idPersona = idPersona;
        this.comentariosSolicitudRecoPen = comentariosSolicitudRecoPen;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getComentariosSolicitudRecoPen() {
        return comentariosSolicitudRecoPen;
    }

    public void setComentariosSolicitudRecoPen(String comentariosSolicitudRecoPen) {
        this.comentariosSolicitudRecoPen = comentariosSolicitudRecoPen;
    }
}
