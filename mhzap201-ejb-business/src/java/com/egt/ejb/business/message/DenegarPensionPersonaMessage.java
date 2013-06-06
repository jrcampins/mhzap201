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

    public static final long PARAMETRO_NUMERO_RESOLUCION_DEN_PEN = 20683L;

    public static final long PARAMETRO_FECHA_RESOLUCION_DEN_PEN = 20681L;

    public static final long PARAMETRO_COMENTARIOS_DENEGACION_PENSION = 20231L;

    protected Long idPersona;

    protected String numeroResolucionDenPen;

    protected Date fechaResolucionDenPen;

    protected String comentariosDenegacionPension;

    public DenegarPensionPersonaMessage(Long idPersona, String numeroResolucionDenPen, Date fechaResolucionDenPen, String comentariosDenegacionPension) {
        this.init();
        this.funcion = 201000160L;
        this.idPersona = idPersona;
        this.numeroResolucionDenPen = numeroResolucionDenPen;
        this.fechaResolucionDenPen = fechaResolucionDenPen;
        this.comentariosDenegacionPension = comentariosDenegacionPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroResolucionDenPen() {
        return numeroResolucionDenPen;
    }

    public void setNumeroResolucionDenPen(String numeroResolucionDenPen) {
        this.numeroResolucionDenPen = numeroResolucionDenPen;
    }

    public Date getFechaResolucionDenPen() {
        return fechaResolucionDenPen;
    }

    public void setFechaResolucionDenPen(Date fechaResolucionDenPen) {
        this.fechaResolucionDenPen = fechaResolucionDenPen;
    }

    public String getComentariosDenegacionPension() {
        return comentariosDenegacionPension;
    }

    public void setComentariosDenegacionPension(String comentariosDenegacionPension) {
        this.comentariosDenegacionPension = comentariosDenegacionPension;
    }
}
