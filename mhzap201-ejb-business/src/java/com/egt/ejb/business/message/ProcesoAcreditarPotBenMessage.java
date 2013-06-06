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

    public static final long PARAMETRO_EDAD_DESDE = 10027L;

    public static final long PARAMETRO_EDAD_HASTA = 10028L;

    protected Long idUbicacion;

    protected Date fechaRegistroPotBenDesde;

    protected Date fechaRegistroPotBenHasta;

    protected Integer edadDesde;

    protected Integer edadHasta;

    public ProcesoAcreditarPotBenMessage(Long idUbicacion, Date fechaRegistroPotBenDesde, Date fechaRegistroPotBenHasta, Integer edadDesde, Integer edadHasta) {
        this.init();
        this.funcion = 200200152L;
        this.idUbicacion = idUbicacion;
        this.fechaRegistroPotBenDesde = fechaRegistroPotBenDesde;
        this.fechaRegistroPotBenHasta = fechaRegistroPotBenHasta;
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
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

    public Integer getEdadDesde() {
        return edadDesde;
    }

    public void setEdadDesde(Integer edadDesde) {
        this.edadDesde = edadDesde;
    }

    public Integer getEdadHasta() {
        return edadHasta;
    }

    public void setEdadHasta(Integer edadHasta) {
        this.edadHasta = edadHasta;
    }
}
