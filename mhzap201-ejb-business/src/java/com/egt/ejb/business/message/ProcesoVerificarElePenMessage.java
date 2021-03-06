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

public class ProcesoVerificarElePenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_UBICACION = 20513L;

    public static final long PARAMETRO_CODIGO_SIME = 20996L;

    protected Long idUbicacion;

    protected String codigoSime;

    public ProcesoVerificarElePenMessage(Long idUbicacion, String codigoSime) {
        this.init();
        this.funcion = 200200159L;
        this.idUbicacion = idUbicacion;
        this.codigoSime = codigoSime;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getCodigoSime() {
        return codigoSime;
    }

    public void setCodigoSime(String codigoSime) {
        this.codigoSime = codigoSime;
    }
}
