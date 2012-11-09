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

import com.egt.base.persistence.entity.TipoFuncionBase;
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
@Table(name = "tipo_funcion")
public class TipoFuncion implements TipoFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_funcion")
    private Integer numeroTipoFuncion;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_funcion")
    private String codigoTipoFuncion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoFuncionNumeroTipoFuncion")
    private Collection<Funcion> funcionNumeroTipoFuncionCollection;

    public TipoFuncion() {
    }

    @Override
    public Integer getNumeroTipoFuncion() {
        return this.numeroTipoFuncion;
    }

    public void setNumeroTipoFuncion(Integer numeroTipoFuncion) {
        this.numeroTipoFuncion = numeroTipoFuncion;
    }

    @Override
    public String getCodigoTipoFuncion() {
        return this.codigoTipoFuncion;
    }

    public void setCodigoTipoFuncion(String codigoTipoFuncion) {
        this.codigoTipoFuncion = codigoTipoFuncion;
    }

    @Override
    public Collection<Funcion> getFuncionNumeroTipoFuncionCollection() {
        return this.funcionNumeroTipoFuncionCollection;
    }

    public void setFuncionNumeroTipoFuncionCollection(Collection<Funcion> collection) {
        this.funcionNumeroTipoFuncionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoFuncion) {
            TipoFuncion that = (TipoFuncion) object;
            return numeroTipoFuncion == null ? that.numeroTipoFuncion == null ? 0 : -1
                    : numeroTipoFuncion.compareTo(that.numeroTipoFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoFuncion == null ? 0 : numeroTipoFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoFuncion) {
            TipoFuncion that = (TipoFuncion) object;
            return ((numeroTipoFuncion == null && that.numeroTipoFuncion == null) ||
                    (numeroTipoFuncion != null && numeroTipoFuncion.equals(that.numeroTipoFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoFuncion;
    }
}
