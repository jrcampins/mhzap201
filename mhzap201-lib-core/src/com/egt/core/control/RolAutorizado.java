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
import java.security.Principal;

public class RolAutorizado implements Principal, Serializable {

    /**
     * Creates a new instance of RolAutorizado
     */
    public RolAutorizado(String codigo) {
        this.codigoRol = codigo;
        this.nombreRol = "";
    }

    /**
     * Conserva el valor de la propiedad idRol.
     */
    private Long idRol = 0L;

    /**
     * Getter para propiedad idRol.
     * @return Valor de la propiedad idRol.
     */
    public Long getIdRol() {
        return this.idRol;
    }

    /**
     * Setter para propiedad idRol.
     * @param idRol Nuevo valor de la propiedad idRol.
     */
    void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    /**
     * Conserva el valor de la propiedad codigoRol.
     */
    private String codigoRol;

    /**
     * Getter para propiedad codigoRol.
     * @return Valor de la propiedad codigoRol.
     */
    public String getCodigoRol() {
        return this.codigoRol;
    }

    /**
     * Setter para propiedad codigoRol.
     * @param codigoRol Nuevo valor de la propiedad codigoRol.
     */
    void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    /**
     * Conserva el valor de la propiedad nombreRol.
     */
    private String nombreRol;

    /**
     * Getter para propiedad nombreRol.
     * @return Valor de la propiedad nombreRol.
     */
    public String getNombreRol() {
        return this.nombreRol;
    }

    /**
     * Setter para propiedad nombreRol.
     * @param nombreRol Nuevo valor de la propiedad nombreRol.
     */
    void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
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
        if (obj instanceof RolAutorizado) {
            RolAutorizado that = (RolAutorizado) obj;
            if (this.getName().equals(that.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Getter para propiedad name.
     * @return Valor de la propiedad name.
     */
    public String getName() {
        return this.codigoRol;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return this.codigoRol.hashCode();
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return (this.codigoRol + "(" + this.nombreRol + ")");
    }
}
