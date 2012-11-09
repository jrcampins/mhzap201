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

import com.egt.base.persistence.entity.TipoRastroFunBase;
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
@Table(name = "tipo_rastro_fun")
public class TipoRastroFun implements TipoRastroFunBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_rastro_fun")
    private Integer numeroTipoRastroFun;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_rastro_fun")
    private String codigoTipoRastroFun;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoRastroFunNumeroTipoRastroFun")
    private Collection<Funcion> funcionNumeroTipoRastroFunCollection;

    public TipoRastroFun() {
    }

    @Override
    public Integer getNumeroTipoRastroFun() {
        return this.numeroTipoRastroFun;
    }

    public void setNumeroTipoRastroFun(Integer numeroTipoRastroFun) {
        this.numeroTipoRastroFun = numeroTipoRastroFun;
    }

    @Override
    public String getCodigoTipoRastroFun() {
        return this.codigoTipoRastroFun;
    }

    public void setCodigoTipoRastroFun(String codigoTipoRastroFun) {
        this.codigoTipoRastroFun = codigoTipoRastroFun;
    }

    @Override
    public Collection<Funcion> getFuncionNumeroTipoRastroFunCollection() {
        return this.funcionNumeroTipoRastroFunCollection;
    }

    public void setFuncionNumeroTipoRastroFunCollection(Collection<Funcion> collection) {
        this.funcionNumeroTipoRastroFunCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRastroFun) {
            TipoRastroFun that = (TipoRastroFun) object;
            return numeroTipoRastroFun == null ? that.numeroTipoRastroFun == null ? 0 : -1
                    : numeroTipoRastroFun.compareTo(that.numeroTipoRastroFun);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoRastroFun == null ? 0 : numeroTipoRastroFun.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRastroFun) {
            TipoRastroFun that = (TipoRastroFun) object;
            return ((numeroTipoRastroFun == null && that.numeroTipoRastroFun == null) ||
                    (numeroTipoRastroFun != null && numeroTipoRastroFun.equals(that.numeroTipoRastroFun)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoRastroFun;
    }
}
