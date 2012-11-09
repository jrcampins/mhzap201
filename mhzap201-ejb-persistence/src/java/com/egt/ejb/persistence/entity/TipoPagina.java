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

import com.egt.base.persistence.entity.TipoPaginaBase;
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
@Table(name = "tipo_pagina")
public class TipoPagina implements TipoPaginaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_pagina")
    private Integer numeroTipoPagina;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_pagina")
    private String codigoTipoPagina;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoPaginaNumeroTipoPagina")
    private Collection<Pagina> paginaNumeroTipoPaginaCollection;

    public TipoPagina() {
    }

    @Override
    public Integer getNumeroTipoPagina() {
        return this.numeroTipoPagina;
    }

    public void setNumeroTipoPagina(Integer numeroTipoPagina) {
        this.numeroTipoPagina = numeroTipoPagina;
    }

    @Override
    public String getCodigoTipoPagina() {
        return this.codigoTipoPagina;
    }

    public void setCodigoTipoPagina(String codigoTipoPagina) {
        this.codigoTipoPagina = codigoTipoPagina;
    }

    @Override
    public Collection<Pagina> getPaginaNumeroTipoPaginaCollection() {
        return this.paginaNumeroTipoPaginaCollection;
    }

    public void setPaginaNumeroTipoPaginaCollection(Collection<Pagina> collection) {
        this.paginaNumeroTipoPaginaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPagina) {
            TipoPagina that = (TipoPagina) object;
            return numeroTipoPagina == null ? that.numeroTipoPagina == null ? 0 : -1
                    : numeroTipoPagina.compareTo(that.numeroTipoPagina);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoPagina == null ? 0 : numeroTipoPagina.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPagina) {
            TipoPagina that = (TipoPagina) object;
            return ((numeroTipoPagina == null && that.numeroTipoPagina == null) ||
                    (numeroTipoPagina != null && numeroTipoPagina.equals(that.numeroTipoPagina)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoPagina;
    }
}
