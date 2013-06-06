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

public class ProcesoPrepararProxPagoPenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    public static final long PARAMETRO_ID_UBICACION = 20513L;

    public static final long PARAMETRO_FECHA_SOLICITUD_PENSION_DESDE = 10001L;

    public static final long PARAMETRO_FECHA_SOLICITUD_PENSION_HASTA = 10002L;

    protected String codigoSime;

    protected Long idUbicacion;

    protected Date fechaSolicitudPensionDesde;

    protected Date fechaSolicitudPensionHasta;

    public ProcesoPrepararProxPagoPenMessage(String codigoSime, Long idUbicacion, Date fechaSolicitudPensionDesde, Date fechaSolicitudPensionHasta) {
        this.init();
        this.funcion = 200200154L;
        this.codigoSime = codigoSime;
        this.idUbicacion = idUbicacion;
        this.fechaSolicitudPensionDesde = fechaSolicitudPensionDesde;
        this.fechaSolicitudPensionHasta = fechaSolicitudPensionHasta;
    }

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Date getFechaSolicitudPensionDesde() {
        return fechaSolicitudPensionDesde;
    }

    public void setFechaSolicitudPensionDesde(Date fechaSolicitudPensionDesde) {
        this.fechaSolicitudPensionDesde = fechaSolicitudPensionDesde;
    }

    public Date getFechaSolicitudPensionHasta() {
        return fechaSolicitudPensionHasta;
    }

    public void setFechaSolicitudPensionHasta(Date fechaSolicitudPensionHasta) {
        this.fechaSolicitudPensionHasta = fechaSolicitudPensionHasta;
    }
}
