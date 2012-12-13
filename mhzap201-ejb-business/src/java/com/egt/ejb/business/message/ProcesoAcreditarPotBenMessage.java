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

public class ProcesoAcreditarPotBenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_UBICACION = 20513L;

    public static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_DESDE = 10011L;

    public static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_HASTA = 10012L;

    protected Long idUbicacion;

    protected Date fechaRegistroPotBenDesde;

    protected Date fechaRegistroPotBenHasta;

    public ProcesoAcreditarPotBenMessage(Long idUbicacion, Date fechaRegistroPotBenDesde, Date fechaRegistroPotBenHasta) {
        this.init();
        this.funcion = 200200152L;
        this.idUbicacion = idUbicacion;
        this.fechaRegistroPotBenDesde = fechaRegistroPotBenDesde;
        this.fechaRegistroPotBenHasta = fechaRegistroPotBenHasta;
    }

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Date getFechaRegistroPotBenDesde() {
        return fechaRegistroPotBenDesde;
    }

    public void setFechaRegistroPotBenDesde(Date fechaRegistroPotBenDesde) {
        this.fechaRegistroPotBenDesde = fechaRegistroPotBenDesde;
    }

    public Date getFechaRegistroPotBenHasta() {
        return fechaRegistroPotBenHasta;
    }

    public void setFechaRegistroPotBenHasta(Date fechaRegistroPotBenHasta) {
        this.fechaRegistroPotBenHasta = fechaRegistroPotBenHasta;
    }
}
