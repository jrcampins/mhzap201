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
import java.math.BigDecimal;

public class ProcesoAsignarMontoPensionMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    public static final long PARAMETRO_MONTO_PENSION = 20197L;

    protected String codigoSime;

    protected BigDecimal montoPension;

    public ProcesoAsignarMontoPensionMessage(String codigoSime, BigDecimal montoPension) {
        this.init();
        this.funcion = 200200158L;
        this.codigoSime = codigoSime;
        this.montoPension = montoPension;
    }

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }

    public BigDecimal getMontoPension() {
        return montoPension;
    }

    public void setMontoPension(BigDecimal montoPension) {
        this.montoPension = montoPension;
    }
}
