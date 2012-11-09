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
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.NivelUbicacionBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nivel_ubicacion")
public class NivelUbicacion implements NivelUbicacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_nivel_ubicacion")
    private Integer numeroNivelUbicacion;

    @Basic(optional = false)
    @Column(name = "codigo_nivel_ubicacion")
    private String codigoNivelUbicacion;

    @Basic(optional = false)
    @Column(name = "digitos_nivel_ubicacion")
    private int digitosNivelUbicacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "nivelUbicacionNumeroNivelUbicacion")
    private Collection<Ubicacion> ubicacionNumeroNivelUbicacionCollection;

    public NivelUbicacion() {
    }

    @Override
    public Integer getNumeroNivelUbicacion() {
        return this.numeroNivelUbicacion;
    }

    public void setNumeroNivelUbicacion(Integer numeroNivelUbicacion) {
        this.numeroNivelUbicacion = numeroNivelUbicacion;
    }

    @Override
    public String getCodigoNivelUbicacion() {
        return this.codigoNivelUbicacion;
    }

    public void setCodigoNivelUbicacion(String codigoNivelUbicacion) {
        this.codigoNivelUbicacion = codigoNivelUbicacion;
    }

    @Override
    public int getDigitosNivelUbicacion() {
        return this.digitosNivelUbicacion;
    }

    public void setDigitosNivelUbicacion(int digitosNivelUbicacion) {
        this.digitosNivelUbicacion = digitosNivelUbicacion;
    }

    @Override
    public Collection<Ubicacion> getUbicacionNumeroNivelUbicacionCollection() {
        return this.ubicacionNumeroNivelUbicacionCollection;
    }

    public void setUbicacionNumeroNivelUbicacionCollection(Collection<Ubicacion> collection) {
        this.ubicacionNumeroNivelUbicacionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelUbicacion) {
            NivelUbicacion that = (NivelUbicacion) object;
            return numeroNivelUbicacion == null ? that.numeroNivelUbicacion == null ? 0 : -1
                    : numeroNivelUbicacion.compareTo(that.numeroNivelUbicacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroNivelUbicacion == null ? 0 : numeroNivelUbicacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelUbicacion) {
            NivelUbicacion that = (NivelUbicacion) object;
            return ((numeroNivelUbicacion == null && that.numeroNivelUbicacion == null) ||
                    (numeroNivelUbicacion != null && numeroNivelUbicacion.equals(that.numeroNivelUbicacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroNivelUbicacion;
    }
}
