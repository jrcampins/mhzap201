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

public class ProcesoDenegarPensionesObjMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_UBICACION = 20513L;

    public static final long PARAMETRO_NUMERO_RESOLUCION_DEN_PEN = 20683L;

    public static final long PARAMETRO_FECHA_RESOLUCION_DEN_PEN = 20681L;

    protected Long idUbicacion;

    protected String numeroResolucionDenPen;

    protected Date fechaResolucionDenPen;

    public ProcesoDenegarPensionesObjMessage(Long idUbicacion, String numeroResolucionDenPen, Date fechaResolucionDenPen) {
        this.init();
        this.funcion = 200200155L;
        this.idUbicacion = idUbicacion;
        this.numeroResolucionDenPen = numeroResolucionDenPen;
        this.fechaResolucionDenPen = fechaResolucionDenPen;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
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
}
