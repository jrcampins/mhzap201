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

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    public static final long PARAMETRO_CEDULA_DESDE = 10029L;

    public static final long PARAMETRO_CEDULA_HASTA = 10030L;

    protected Long idUbicacion;

    protected String numeroResolucionDenPen;

    protected Date fechaResolucionDenPen;

    protected String codigoSime;

    protected String cedulaDesde;

    protected String cedulaHasta;

    public ProcesoDenegarPensionesObjMessage(Long idUbicacion, String numeroResolucionDenPen, Date fechaResolucionDenPen, String codigoSime, String cedulaDesde, String cedulaHasta) {
        this.init();
        this.funcion = 200200156L;
        this.idUbicacion = idUbicacion;
        this.numeroResolucionDenPen = numeroResolucionDenPen;
        this.fechaResolucionDenPen = fechaResolucionDenPen;
        this.codigoSime = codigoSime;
        this.cedulaDesde = cedulaDesde;
        this.cedulaHasta = cedulaHasta;
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

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }

    public String getCedulaDesde() {
        return cedulaDesde;
    }

    public void setCedulaDesde(String cedulaDesde) {
        this.cedulaDesde = cedulaDesde;
    }

    public String getCedulaHasta() {
        return cedulaHasta;
    }

    public void setCedulaHasta(String cedulaHasta) {
        this.cedulaHasta = cedulaHasta;
    }
}
