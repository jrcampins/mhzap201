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

import com.egt.base.persistence.entity.TipoRecursoBase;
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
@Table(name = "tipo_recurso")
public class TipoRecurso implements TipoRecursoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_recurso")
    private Integer numeroTipoRecurso;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_recurso")
    private String codigoTipoRecurso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoRecursoNumeroTipoRecurso")
    private Collection<ClaseRecurso> claseRecursoNumeroTipoRecursoCollection;

    public TipoRecurso() {
    }

    @Override
    public Integer getNumeroTipoRecurso() {
        return this.numeroTipoRecurso;
    }

    public void setNumeroTipoRecurso(Integer numeroTipoRecurso) {
        this.numeroTipoRecurso = numeroTipoRecurso;
    }

    @Override
    public String getCodigoTipoRecurso() {
        return this.codigoTipoRecurso;
    }

    public void setCodigoTipoRecurso(String codigoTipoRecurso) {
        this.codigoTipoRecurso = codigoTipoRecurso;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoNumeroTipoRecursoCollection() {
        return this.claseRecursoNumeroTipoRecursoCollection;
    }

    public void setClaseRecursoNumeroTipoRecursoCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoNumeroTipoRecursoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRecurso) {
            TipoRecurso that = (TipoRecurso) object;
            return numeroTipoRecurso == null ? that.numeroTipoRecurso == null ? 0 : -1
                    : numeroTipoRecurso.compareTo(that.numeroTipoRecurso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoRecurso == null ? 0 : numeroTipoRecurso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRecurso) {
            TipoRecurso that = (TipoRecurso) object;
            return ((numeroTipoRecurso == null && that.numeroTipoRecurso == null) ||
                    (numeroTipoRecurso != null && numeroTipoRecurso.equals(that.numeroTipoRecurso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoRecurso;
    }
}
