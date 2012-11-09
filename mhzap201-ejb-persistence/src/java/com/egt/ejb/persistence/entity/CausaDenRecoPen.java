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

import com.egt.base.persistence.entity.CausaDenRecoPenBase;
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
@Table(name = "causa_den_reco_pen")
public class CausaDenRecoPen implements CausaDenRecoPenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_causa_den_reco_pen")
    private Integer numeroCausaDenRecoPen;

    @Basic(optional = false)
    @Column(name = "codigo_causa_den_reco_pen")
    private String codigoCausaDenRecoPen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaDenRecoPenNumeroCausaDenRecoPen")
    private Collection<Persona> personaNumeroCausaDenRecoPenCollection;

    public CausaDenRecoPen() {
    }

    @Override
    public Integer getNumeroCausaDenRecoPen() {
        return this.numeroCausaDenRecoPen;
    }

    public void setNumeroCausaDenRecoPen(Integer numeroCausaDenRecoPen) {
        this.numeroCausaDenRecoPen = numeroCausaDenRecoPen;
    }

    @Override
    public String getCodigoCausaDenRecoPen() {
        return this.codigoCausaDenRecoPen;
    }

    public void setCodigoCausaDenRecoPen(String codigoCausaDenRecoPen) {
        this.codigoCausaDenRecoPen = codigoCausaDenRecoPen;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCausaDenRecoPenCollection() {
        return this.personaNumeroCausaDenRecoPenCollection;
    }

    public void setPersonaNumeroCausaDenRecoPenCollection(Collection<Persona> collection) {
        this.personaNumeroCausaDenRecoPenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenRecoPen) {
            CausaDenRecoPen that = (CausaDenRecoPen) object;
            return numeroCausaDenRecoPen == null ? that.numeroCausaDenRecoPen == null ? 0 : -1
                    : numeroCausaDenRecoPen.compareTo(that.numeroCausaDenRecoPen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCausaDenRecoPen == null ? 0 : numeroCausaDenRecoPen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenRecoPen) {
            CausaDenRecoPen that = (CausaDenRecoPen) object;
            return ((numeroCausaDenRecoPen == null && that.numeroCausaDenRecoPen == null) ||
                    (numeroCausaDenRecoPen != null && numeroCausaDenRecoPen.equals(that.numeroCausaDenRecoPen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCausaDenRecoPen;
    }
}
