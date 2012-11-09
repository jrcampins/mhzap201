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

import com.egt.base.persistence.entity.TipoDominioBase;
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
@Table(name = "tipo_dominio")
public class TipoDominio implements TipoDominioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_dominio")
    private Integer numeroTipoDominio;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_dominio")
    private String codigoTipoDominio;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoDominioNumeroTipoDominio")
    private Collection<Dominio> dominioNumeroTipoDominioCollection;

    public TipoDominio() {
    }

    @Override
    public Integer getNumeroTipoDominio() {
        return this.numeroTipoDominio;
    }

    public void setNumeroTipoDominio(Integer numeroTipoDominio) {
        this.numeroTipoDominio = numeroTipoDominio;
    }

    @Override
    public String getCodigoTipoDominio() {
        return this.codigoTipoDominio;
    }

    public void setCodigoTipoDominio(String codigoTipoDominio) {
        this.codigoTipoDominio = codigoTipoDominio;
    }

    @Override
    public Collection<Dominio> getDominioNumeroTipoDominioCollection() {
        return this.dominioNumeroTipoDominioCollection;
    }

    public void setDominioNumeroTipoDominioCollection(Collection<Dominio> collection) {
        this.dominioNumeroTipoDominioCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDominio) {
            TipoDominio that = (TipoDominio) object;
            return numeroTipoDominio == null ? that.numeroTipoDominio == null ? 0 : -1
                    : numeroTipoDominio.compareTo(that.numeroTipoDominio);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoDominio == null ? 0 : numeroTipoDominio.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDominio) {
            TipoDominio that = (TipoDominio) object;
            return ((numeroTipoDominio == null && that.numeroTipoDominio == null) ||
                    (numeroTipoDominio != null && numeroTipoDominio.equals(that.numeroTipoDominio)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoDominio;
    }
}
