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

import com.egt.base.persistence.entity.CausaDenReclCenBase;
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
@Table(name = "causa_den_recl_cen")
public class CausaDenReclCen implements CausaDenReclCenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_causa_den_recl_cen")
    private Integer numeroCausaDenReclCen;

    @Basic(optional = false)
    @Column(name = "codigo_causa_den_recl_cen")
    private String codigoCausaDenReclCen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaDenReclCenNumeroCausaDenReclCen")
    private Collection<PotencialBen> potencialBenNumeroCausaDenReclCenCollection;

    public CausaDenReclCen() {
    }

    @Override
    public Integer getNumeroCausaDenReclCen() {
        return this.numeroCausaDenReclCen;
    }

    public void setNumeroCausaDenReclCen(Integer numeroCausaDenReclCen) {
        this.numeroCausaDenReclCen = numeroCausaDenReclCen;
    }

    @Override
    public String getCodigoCausaDenReclCen() {
        return this.codigoCausaDenReclCen;
    }

    public void setCodigoCausaDenReclCen(String codigoCausaDenReclCen) {
        this.codigoCausaDenReclCen = codigoCausaDenReclCen;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenNumeroCausaDenReclCenCollection() {
        return this.potencialBenNumeroCausaDenReclCenCollection;
    }

    public void setPotencialBenNumeroCausaDenReclCenCollection(Collection<PotencialBen> collection) {
        this.potencialBenNumeroCausaDenReclCenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenReclCen) {
            CausaDenReclCen that = (CausaDenReclCen) object;
            return numeroCausaDenReclCen == null ? that.numeroCausaDenReclCen == null ? 0 : -1
                    : numeroCausaDenReclCen.compareTo(that.numeroCausaDenReclCen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCausaDenReclCen == null ? 0 : numeroCausaDenReclCen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenReclCen) {
            CausaDenReclCen that = (CausaDenReclCen) object;
            return ((numeroCausaDenReclCen == null && that.numeroCausaDenReclCen == null) ||
                    (numeroCausaDenReclCen != null && numeroCausaDenReclCen.equals(that.numeroCausaDenReclCen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCausaDenReclCen;
    }
}
