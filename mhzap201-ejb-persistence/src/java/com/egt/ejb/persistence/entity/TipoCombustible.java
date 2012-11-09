/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.TipoCombustibleBase;
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
@Table(name = "tipo_combustible")
public class TipoCombustible implements TipoCombustibleBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_combustible")
    private Integer numeroTipoCombustible;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_combustible")
    private String codigoTipoCombustible;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoCombustibleNumeroTipoCombustible")
    private Collection<FichaHogar> fichaHogarNumeroTipoCombustibleCollection;

    public TipoCombustible() {
    }

    @Override
    public Integer getNumeroTipoCombustible() {
        return this.numeroTipoCombustible;
    }

    public void setNumeroTipoCombustible(Integer numeroTipoCombustible) {
        this.numeroTipoCombustible = numeroTipoCombustible;
    }

    @Override
    public String getCodigoTipoCombustible() {
        return this.codigoTipoCombustible;
    }

    public void setCodigoTipoCombustible(String codigoTipoCombustible) {
        this.codigoTipoCombustible = codigoTipoCombustible;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoCombustibleCollection() {
        return this.fichaHogarNumeroTipoCombustibleCollection;
    }

    public void setFichaHogarNumeroTipoCombustibleCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoCombustibleCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoCombustible) {
            TipoCombustible that = (TipoCombustible) object;
            return numeroTipoCombustible == null ? that.numeroTipoCombustible == null ? 0 : -1
                    : numeroTipoCombustible.compareTo(that.numeroTipoCombustible);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoCombustible == null ? 0 : numeroTipoCombustible.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoCombustible) {
            TipoCombustible that = (TipoCombustible) object;
            return ((numeroTipoCombustible == null && that.numeroTipoCombustible == null) ||
                    (numeroTipoCombustible != null && numeroTipoCombustible.equals(that.numeroTipoCombustible)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoCombustible;
    }
}
