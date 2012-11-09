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

import com.egt.base.persistence.entity.TipoNodoBase;
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
@Table(name = "tipo_nodo")
public class TipoNodo implements TipoNodoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_nodo")
    private Integer numeroTipoNodo;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_nodo")
    private String codigoTipoNodo;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoNodoNumeroTipoNodo")
    private Collection<OpcionMenu> opcionMenuNumeroTipoNodoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoNodoNumeroTipoNodo")
    private Collection<Ubicacion> ubicacionNumeroTipoNodoCollection;

    public TipoNodo() {
    }

    @Override
    public Integer getNumeroTipoNodo() {
        return this.numeroTipoNodo;
    }

    public void setNumeroTipoNodo(Integer numeroTipoNodo) {
        this.numeroTipoNodo = numeroTipoNodo;
    }

    @Override
    public String getCodigoTipoNodo() {
        return this.codigoTipoNodo;
    }

    public void setCodigoTipoNodo(String codigoTipoNodo) {
        this.codigoTipoNodo = codigoTipoNodo;
    }

    @Override
    public Collection<OpcionMenu> getOpcionMenuNumeroTipoNodoCollection() {
        return this.opcionMenuNumeroTipoNodoCollection;
    }

    public void setOpcionMenuNumeroTipoNodoCollection(Collection<OpcionMenu> collection) {
        this.opcionMenuNumeroTipoNodoCollection = collection;
    }

    @Override
    public Collection<Ubicacion> getUbicacionNumeroTipoNodoCollection() {
        return this.ubicacionNumeroTipoNodoCollection;
    }

    public void setUbicacionNumeroTipoNodoCollection(Collection<Ubicacion> collection) {
        this.ubicacionNumeroTipoNodoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoNodo) {
            TipoNodo that = (TipoNodo) object;
            return numeroTipoNodo == null ? that.numeroTipoNodo == null ? 0 : -1
                    : numeroTipoNodo.compareTo(that.numeroTipoNodo);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoNodo == null ? 0 : numeroTipoNodo.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoNodo) {
            TipoNodo that = (TipoNodo) object;
            return ((numeroTipoNodo == null && that.numeroTipoNodo == null) ||
                    (numeroTipoNodo != null && numeroTipoNodo.equals(that.numeroTipoNodo)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoNodo;
    }
}
