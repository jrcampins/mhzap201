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

public class AnularCerVidaPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_COMENTARIOS_ANUL_CER_VIDA = 20260L;

    protected Long idPersona;

    protected String comentariosAnulCerVida;

    public AnularCerVidaPersonaMessage(Long idPersona, String comentariosAnulCerVida) {
        this.init();
        this.funcion = 201000152L;
        this.idPersona = idPersona;
        this.comentariosAnulCerVida = comentariosAnulCerVida;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getComentariosAnulCerVida() {
        return comentariosAnulCerVida;
    }

    public void setComentariosAnulCerVida(String comentariosAnulCerVida) {
        this.comentariosAnulCerVida = comentariosAnulCerVida;
    }
}
