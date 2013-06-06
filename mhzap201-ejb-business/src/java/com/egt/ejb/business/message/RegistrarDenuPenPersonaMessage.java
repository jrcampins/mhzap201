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

public class RegistrarDenuPenPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_COMENTARIOS_REGISTRO_DENU_PEN = 20234L;

    protected Long idPersona;

    protected String comentariosRegistroDenuPen;

    public RegistrarDenuPenPersonaMessage(Long idPersona, String comentariosRegistroDenuPen) {
        this.init();
        this.funcion = 201000171L;
        this.idPersona = idPersona;
        this.comentariosRegistroDenuPen = comentariosRegistroDenuPen;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getComentariosRegistroDenuPen() {
        return comentariosRegistroDenuPen;
    }

    public void setComentariosRegistroDenuPen(String comentariosRegistroDenuPen) {
        this.comentariosRegistroDenuPen = comentariosRegistroDenuPen;
    }
}
