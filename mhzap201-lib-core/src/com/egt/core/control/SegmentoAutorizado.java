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
package com.egt.core.control;

import java.io.Serializable;

public class SegmentoAutorizado implements Serializable {

    /**
     * Conserva el valor de la propiedad funcion.
     */
    private long funcion;

    /**
     * Conserva el valor de la propiedad segmento.
     */
    private Long segmento;

    /**
     * Creates a new instance of SegmentoAutorizado
     */
    public SegmentoAutorizado() {
        funcion = -1;
        segmento = null;
    }

    /**
     * Getter para propiedad funcion.
     * 
     * @return Valor de la propiedad funcion.
     */
    public long getFuncion() {
        return funcion;
    }

    /**
     * Setter para propiedad funcion.
     * 
     * @param funcion
     *            Nuevo valor de la propiedad funcion.
     */
    public void setFuncion(long funcion) {
        this.funcion = funcion;
    }

    /**
     * Getter para propiedad segmento.
     * 
     * @return Valor de la propiedad segmento.
     */
    public Long getSegmento() {
        return segmento;
    }

    /**
     * Setter para propiedad segmento.
     * 
     * @param segmento
     *            Nuevo valor de la propiedad segmento.
     */
    public void setSegmento(Long segmento) {
        this.segmento = segmento;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj instanceof SegmentoAutorizado) {
            SegmentoAutorizado that = (SegmentoAutorizado) obj;
            if (this.funcion == that.getFuncion()) {
                return this.segmento == null ? that.getSegmento() == null : this.segmento.equals(that.getSegmento());
            }
        }
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.funcion ^ (this.funcion >>> 32));
        hash = 47 * hash + (this.segmento != null ? this.segmento.hashCode() : 0);
        return hash;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() 
                + "(" + "funcion=" + funcion
                + "," + "segmento=" + segmento
                + ")";
    }
}
