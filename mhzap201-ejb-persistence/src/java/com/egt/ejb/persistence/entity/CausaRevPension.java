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

import com.egt.base.persistence.entity.CausaRevPensionBase;
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
@Table(name = "causa_rev_pension")
public class CausaRevPension implements CausaRevPensionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_causa_rev_pension")
    private Integer numeroCausaRevPension;

    @Basic(optional = false)
    @Column(name = "codigo_causa_rev_pension")
    private String codigoCausaRevPension;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaRevPensionNumeroCausaRevPension")
    private Collection<Persona> personaNumeroCausaRevPensionCollection;

    public CausaRevPension() {
    }

    @Override
    public Integer getNumeroCausaRevPension() {
        return this.numeroCausaRevPension;
    }

    public void setNumeroCausaRevPension(Integer numeroCausaRevPension) {
        this.numeroCausaRevPension = numeroCausaRevPension;
    }

    @Override
    public String getCodigoCausaRevPension() {
        return this.codigoCausaRevPension;
    }

    public void setCodigoCausaRevPension(String codigoCausaRevPension) {
        this.codigoCausaRevPension = codigoCausaRevPension;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCausaRevPensionCollection() {
        return this.personaNumeroCausaRevPensionCollection;
    }

    public void setPersonaNumeroCausaRevPensionCollection(Collection<Persona> collection) {
        this.personaNumeroCausaRevPensionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaRevPension) {
            CausaRevPension that = (CausaRevPension) object;
            return numeroCausaRevPension == null ? that.numeroCausaRevPension == null ? 0 : -1
                    : numeroCausaRevPension.compareTo(that.numeroCausaRevPension);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCausaRevPension == null ? 0 : numeroCausaRevPension.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaRevPension) {
            CausaRevPension that = (CausaRevPension) object;
            return ((numeroCausaRevPension == null && that.numeroCausaRevPension == null) ||
                    (numeroCausaRevPension != null && numeroCausaRevPension.equals(that.numeroCausaRevPension)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCausaRevPension;
    }
}
