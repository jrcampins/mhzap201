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

public class DesmentirDenuPenPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_COMENTARIOS_DES_DENU_PEN = 20233L;

    protected Long idPersona;

    protected String comentariosDesDenuPen;

    public DesmentirDenuPenPersonaMessage(Long idPersona, String comentariosDesDenuPen) {
        this.init();
        this.funcion = 201000159L;
        this.idPersona = idPersona;
        this.comentariosDesDenuPen = comentariosDesDenuPen;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getComentariosDesDenuPen() {
        return comentariosDesDenuPen;
    }

    public void setComentariosDesDenuPen(String comentariosDesDenuPen) {
        this.comentariosDesDenuPen = comentariosDesDenuPen;
    }
}
