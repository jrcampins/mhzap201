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

public class ProcesoOtorgarPensionesAprMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_UBICACION = 20513L;

    public static final long PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN = 20675L;

    public static final long PARAMETRO_FECHA_RESOLUCION_OTOR_PEN = 20672L;

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    protected Long idUbicacion;

    protected String numeroResolucionOtorPen;

    protected Date fechaResolucionOtorPen;

    protected String codigoSime;

    public ProcesoOtorgarPensionesAprMessage(Long idUbicacion, String numeroResolucionOtorPen, Date fechaResolucionOtorPen, String codigoSime) {
        this.init();
        this.funcion = 200200154L;
        this.idUbicacion = idUbicacion;
        this.numeroResolucionOtorPen = numeroResolucionOtorPen;
        this.fechaResolucionOtorPen = fechaResolucionOtorPen;
        this.codigoSime = codigoSime;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
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

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }
}
