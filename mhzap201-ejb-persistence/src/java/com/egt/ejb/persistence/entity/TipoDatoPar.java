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

import com.egt.base.persistence.entity.TipoDatoParBase;
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
@Table(name = "tipo_dato_par")
public class TipoDatoPar implements TipoDatoParBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_dato_par")
    private Integer numeroTipoDatoPar;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_dato_par")
    private String codigoTipoDatoPar;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoDatoParNumeroTipoDatoPar")
    private Collection<Parametro> parametroNumeroTipoDatoParCollection;

    public TipoDatoPar() {
    }

    @Override
    public Integer getNumeroTipoDatoPar() {
        return this.numeroTipoDatoPar;
    }

    public void setNumeroTipoDatoPar(Integer numeroTipoDatoPar) {
        this.numeroTipoDatoPar = numeroTipoDatoPar;
    }

    @Override
    public String getCodigoTipoDatoPar() {
        return this.codigoTipoDatoPar;
    }

    public void setCodigoTipoDatoPar(String codigoTipoDatoPar) {
        this.codigoTipoDatoPar = codigoTipoDatoPar;
    }

    @Override
    public Collection<Parametro> getParametroNumeroTipoDatoParCollection() {
        return this.parametroNumeroTipoDatoParCollection;
    }

    public void setParametroNumeroTipoDatoParCollection(Collection<Parametro> collection) {
        this.parametroNumeroTipoDatoParCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDatoPar) {
            TipoDatoPar that = (TipoDatoPar) object;
            return numeroTipoDatoPar == null ? that.numeroTipoDatoPar == null ? 0 : -1
                    : numeroTipoDatoPar.compareTo(that.numeroTipoDatoPar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoDatoPar == null ? 0 : numeroTipoDatoPar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDatoPar) {
            TipoDatoPar that = (TipoDatoPar) object;
            return ((numeroTipoDatoPar == null && that.numeroTipoDatoPar == null) ||
                    (numeroTipoDatoPar != null && numeroTipoDatoPar.equals(that.numeroTipoDatoPar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoDatoPar;
    }
}
