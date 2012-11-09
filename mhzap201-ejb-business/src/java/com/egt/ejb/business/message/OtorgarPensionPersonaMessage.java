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

public class OtorgarPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN = 20675L;

    public static final long PARAMETRO_FECHA_RESOLUCION_OTOR_PEN = 20672L;

    public static final long PARAMETRO_COMENTARIOS_OTORGAMIENTO_PEN = 20662L;

    protected Long idPersona;

    protected String numeroResolucionOtorPen;

    protected Date fechaResolucionOtorPen;

    protected String comentariosOtorgamientoPen;

    public OtorgarPensionPersonaMessage(Long idPersona, String numeroResolucionOtorPen, Date fechaResolucionOtorPen, String comentariosOtorgamientoPen) {
        this.init();
        this.funcion = 201000166L;
        this.idPersona = idPersona;
        this.numeroResolucionOtorPen = numeroResolucionOtorPen;
        this.fechaResolucionOtorPen = fechaResolucionOtorPen;
        this.comentariosOtorgamientoPen = comentariosOtorgamientoPen;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroResolucionOtorPen() {
        return numeroResolucionOtorPen;
    }

    public void setNumeroResolucionOtorPen(String numeroResolucionOtorPen) {
        this.numeroResolucionOtorPen = numeroResolucionOtorPen;
    }

    public Date getFechaResolucionOtorPen() {
        return fechaResolucionOtorPen;
    }

    public void setFechaResolucionOtorPen(Date fechaResolucionOtorPen) {
        this.fechaResolucionOtorPen = fechaResolucionOtorPen;
    }

    public String getComentariosOtorgamientoPen() {
        return comentariosOtorgamientoPen;
    }

    public void setComentariosOtorgamientoPen(String comentariosOtorgamientoPen) {
        this.comentariosOtorgamientoPen = comentariosOtorgamientoPen;
    }
}
