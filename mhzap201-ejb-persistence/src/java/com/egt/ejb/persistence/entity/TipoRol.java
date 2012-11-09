/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.TipoRolBase;
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
@Table(name = "tipo_rol")
public class TipoRol implements TipoRolBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_rol")
    private Integer numeroTipoRol;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_rol")
    private String codigoTipoRol;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoRolNumeroTipoRol")
    private Collection<Rol> rolNumeroTipoRolCollection;

    public TipoRol() {
    }

    @Override
    public Integer getNumeroTipoRol() {
        return this.numeroTipoRol;
    }

    public void setNumeroTipoRol(Integer numeroTipoRol) {
        this.numeroTipoRol = numeroTipoRol;
    }

    @Override
    public String getCodigoTipoRol() {
        return this.codigoTipoRol;
    }

    public void setCodigoTipoRol(String codigoTipoRol) {
        this.codigoTipoRol = codigoTipoRol;
    }

    @Override
    public Collection<Rol> getRolNumeroTipoRolCollection() {
        return this.rolNumeroTipoRolCollection;
    }

    public void setRolNumeroTipoRolCollection(Collection<Rol> collection) {
        this.rolNumeroTipoRolCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRol) {
            TipoRol that = (TipoRol) object;
            return numeroTipoRol == null ? that.numeroTipoRol == null ? 0 : -1
                    : numeroTipoRol.compareTo(that.numeroTipoRol);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoRol == null ? 0 : numeroTipoRol.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRol) {
            TipoRol that = (TipoRol) object;
            return ((numeroTipoRol == null && that.numeroTipoRol == null) ||
                    (numeroTipoRol != null && numeroTipoRol.equals(that.numeroTipoRol)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoRol;
    }
}
