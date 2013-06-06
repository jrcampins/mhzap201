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

public class ProcesoAsignarMesaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_LOTE = 20997L;

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    protected Long lote;

    protected String codigoSime;

    public ProcesoAsignarMesaMessage(Long lote, String codigoSime) {
        this.init();
        this.funcion = 200200153L;
        this.lote = lote;
        this.codigoSime = codigoSime;
    }

    public Long getLote() {
        return lote;
    }

    public void setLote(Long lote) {
        this.lote = lote;
    }

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }
}
