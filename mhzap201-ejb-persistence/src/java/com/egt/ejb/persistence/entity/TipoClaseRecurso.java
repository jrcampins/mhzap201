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

import com.egt.base.persistence.entity.TipoClaseRecursoBase;
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
@Table(name = "tipo_clase_recurso")
public class TipoClaseRecurso implements TipoClaseRecursoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_clase_recurso")
    private Integer numeroTipoClaseRecurso;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_clase_recurso")
    private String codigoTipoClaseRecurso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoClaseRecursoNumeroTipoClaseRecurso")
    private Collection<ClaseRecurso> claseRecursoNumeroTipoClaseRecursoCollection;

    public TipoClaseRecurso() {
    }

    @Override
    public Integer getNumeroTipoClaseRecurso() {
        return this.numeroTipoClaseRecurso;
    }

    public void setNumeroTipoClaseRecurso(Integer numeroTipoClaseRecurso) {
        this.numeroTipoClaseRecurso = numeroTipoClaseRecurso;
    }

    @Override
    public String getCodigoTipoClaseRecurso() {
        return this.codigoTipoClaseRecurso;
    }

    public void setCodigoTipoClaseRecurso(String codigoTipoClaseRecurso) {
        this.codigoTipoClaseRecurso = codigoTipoClaseRecurso;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoNumeroTipoClaseRecursoCollection() {
        return this.claseRecursoNumeroTipoClaseRecursoCollection;
    }

    public void setClaseRecursoNumeroTipoClaseRecursoCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoNumeroTipoClaseRecursoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoClaseRecurso) {
            TipoClaseRecurso that = (TipoClaseRecurso) object;
            return numeroTipoClaseRecurso == null ? that.numeroTipoClaseRecurso == null ? 0 : -1
                    : numeroTipoClaseRecurso.compareTo(that.numeroTipoClaseRecurso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoClaseRecurso == null ? 0 : numeroTipoClaseRecurso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoClaseRecurso) {
            TipoClaseRecurso that = (TipoClaseRecurso) object;
            return ((numeroTipoClaseRecurso == null && that.numeroTipoClaseRecurso == null) ||
                    (numeroTipoClaseRecurso != null && numeroTipoClaseRecurso.equals(that.numeroTipoClaseRecurso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoClaseRecurso;
    }
}
