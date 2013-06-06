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

public class AsignarRecoPenPersonaSelMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_CODIGO_SIME_RECO_PEN = 21015L;

    protected String codigoSimeRecoPen;

    public AsignarRecoPenPersonaSelMessage(String codigoSimeRecoPen) {
        this.init();
        this.funcion = 201000178L;
        this.codigoSimeRecoPen = codigoSimeRecoPen;
    }

    public String getCodigoSimeRecoPen() {
        return codigoSimeRecoPen;
    }

    public void setCodigoSimeRecoPen(String codigoSimeRecoPen) {
        this.codigoSimeRecoPen = codigoSimeRecoPen;
    }
}
