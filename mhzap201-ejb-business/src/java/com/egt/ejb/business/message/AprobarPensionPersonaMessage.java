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

public class AprobarPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_COMENTARIOS_APROBACION_PENSION = 20228L;

    protected Long idPersona;

    protected String comentariosAprobacionPension;

    public AprobarPensionPersonaMessage(Long idPersona, String comentariosAprobacionPension) {
        this.init();
        this.funcion = 201000155L;
        this.idPersona = idPersona;
        this.comentariosAprobacionPension = comentariosAprobacionPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getComentariosAprobacionPension() {
        return comentariosAprobacionPension;
    }

    public void setComentariosAprobacionPension(String comentariosAprobacionPension) {
        this.comentariosAprobacionPension = comentariosAprobacionPension;
    }
}
