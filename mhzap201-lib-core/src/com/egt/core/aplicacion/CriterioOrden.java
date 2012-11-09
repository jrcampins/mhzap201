/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.aplicacion;

import com.egt.core.enums.EnumCriterioOrden;

public class CriterioOrden {

    /**
     * Conserva el valor de la propiedad columna.
     */
    private String columna;

    /**
     * Conserva el valor de la propiedad orden.
     */
    private EnumCriterioOrden orden;

    public CriterioOrden() {
        columna = null;
        orden = EnumCriterioOrden.ORDEN_ASCENDENTE;
    }

    public CriterioOrden(String columna) {
        this.columna = columna;
        orden = EnumCriterioOrden.ORDEN_ASCENDENTE;
    }

    public CriterioOrden(String columna, EnumCriterioOrden orden) {
        this.columna = columna;
        this.orden = orden;
    }

    /**
     * Setter para propiedad columna.
     *
     * @param columna Nuevo valor de la propiedad columna.
     */
    public void setColumna(String columna) {
        this.columna = columna;
    }

    /**
     * Getter para propiedad columna.
     *
     * @return Valor de la propiedad columna.
     */
    public String getColumna() {
        return columna;
    }

    /**
     * Setter para propiedad orden.
     *
     * @param orden Nuevo valor de la propiedad orden.
     */
    public void setOrden(EnumCriterioOrden orden) {
        this.orden = orden;
    }

    /**
     * Getter para propiedad orden.
     *
     * @return Valor de la propiedad orden.
     */
    public EnumCriterioOrden getOrden() {
        return orden;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof CriterioOrden) {
            CriterioOrden that = (CriterioOrden) obj;
            if (this.toString().equals(that.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.columna != null ? this.columna.hashCode() : 0);
        return hash;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return TLC.getInterpreteSql().getStringCriterioOrden(this);
    }
}
