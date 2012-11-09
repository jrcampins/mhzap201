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

import com.egt.base.persistence.entity.TipoComparacionBase;
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
@Table(name = "tipo_comparacion")
public class TipoComparacion implements TipoComparacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_comparacion")
    private Integer numeroTipoComparacion;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_comparacion")
    private String codigoTipoComparacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoComparacionNumeroTipoComparacion")
    private Collection<ClaseRecursoPar> claseRecursoParNumeroTipoComparacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoComparacionNumeroTipoComparacion")
    private Collection<FuncionParametro> funcionParametroNumeroTipoComparacionCollection;

    public TipoComparacion() {
    }

    @Override
    public Integer getNumeroTipoComparacion() {
        return this.numeroTipoComparacion;
    }

    public void setNumeroTipoComparacion(Integer numeroTipoComparacion) {
        this.numeroTipoComparacion = numeroTipoComparacion;
    }

    @Override
    public String getCodigoTipoComparacion() {
        return this.codigoTipoComparacion;
    }

    public void setCodigoTipoComparacion(String codigoTipoComparacion) {
        this.codigoTipoComparacion = codigoTipoComparacion;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParNumeroTipoComparacionCollection() {
        return this.claseRecursoParNumeroTipoComparacionCollection;
    }

    public void setClaseRecursoParNumeroTipoComparacionCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParNumeroTipoComparacionCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroNumeroTipoComparacionCollection() {
        return this.funcionParametroNumeroTipoComparacionCollection;
    }

    public void setFuncionParametroNumeroTipoComparacionCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroNumeroTipoComparacionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoComparacion) {
            TipoComparacion that = (TipoComparacion) object;
            return numeroTipoComparacion == null ? that.numeroTipoComparacion == null ? 0 : -1
                    : numeroTipoComparacion.compareTo(that.numeroTipoComparacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoComparacion == null ? 0 : numeroTipoComparacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoComparacion) {
            TipoComparacion that = (TipoComparacion) object;
            return ((numeroTipoComparacion == null && that.numeroTipoComparacion == null) ||
                    (numeroTipoComparacion != null && numeroTipoComparacion.equals(that.numeroTipoComparacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoComparacion;
    }
}
