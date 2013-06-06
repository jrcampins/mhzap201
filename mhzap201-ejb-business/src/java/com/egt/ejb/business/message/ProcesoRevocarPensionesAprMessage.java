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

public class ProcesoRevocarPensionesAprMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    public static final long PARAMETRO_FECHA_RESOLUCION_REV_PEN = 21009L;

    public static final long PARAMETRO_NUMERO_RESOLUCION_REV_PEN = 21011L;

    public static final long PARAMETRO_CEDULA_DESDE = 10029L;

    public static final long PARAMETRO_CEDULA_HASTA = 10030L;

    protected String codigoSime;

    protected Date fechaResolucionRevPen;

    protected String numeroResolucionRevPen;

    protected String cedulaDesde;

    protected String cedulaHasta;

    public ProcesoRevocarPensionesAprMessage(String codigoSime, Date fechaResolucionRevPen, String numeroResolucionRevPen, String cedulaDesde, String cedulaHasta) {
        this.init();
        this.funcion = 200200161L;
        this.codigoSime = codigoSime;
        this.fechaResolucionRevPen = fechaResolucionRevPen;
        this.numeroResolucionRevPen = numeroResolucionRevPen;
        this.cedulaDesde = cedulaDesde;
        this.cedulaHasta = cedulaHasta;
    }

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }

    public Date getFechaResolucionRevPen() {
        return fechaResolucionRevPen;
    }

    public void setFechaResolucionRevPen(Date fechaResolucionRevPen) {
        this.fechaResolucionRevPen = fechaResolucionRevPen;
    }

    public String getNumeroResolucionRevPen() {
        return numeroResolucionRevPen;
    }

    public void setNumeroResolucionRevPen(String numeroResolucionRevPen) {
        this.numeroResolucionRevPen = numeroResolucionRevPen;
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
