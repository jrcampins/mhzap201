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

import com.egt.base.persistence.entity.CausaDenPensionBase;
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
@Table(name = "causa_den_pension")
public class CausaDenPension implements CausaDenPensionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_causa_den_pension")
    private Integer numeroCausaDenPension;

    @Basic(optional = false)
    @Column(name = "codigo_causa_den_pension")
    private String codigoCausaDenPension;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaDenPensionNumeroCausaDenPension")
    private Collection<LogProDenPenObj> logProDenPenObjNumeroCausaDenPensionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaDenPensionNumeroCausaDenPension")
    private Collection<Persona> personaNumeroCausaDenPensionCollection;

    public CausaDenPension() {
    }

    @Override
    public Integer getNumeroCausaDenPension() {
        return this.numeroCausaDenPension;
    }

    public void setNumeroCausaDenPension(Integer numeroCausaDenPension) {
        this.numeroCausaDenPension = numeroCausaDenPension;
    }

    @Override
    public String getCodigoCausaDenPension() {
        return this.codigoCausaDenPension;
    }

    public void setCodigoCausaDenPension(String codigoCausaDenPension) {
        this.codigoCausaDenPension = codigoCausaDenPension;
    }

    @Override
    public Collection<LogProDenPenObj> getLogProDenPenObjNumeroCausaDenPensionCollection() {
        return this.logProDenPenObjNumeroCausaDenPensionCollection;
    }

    public void setLogProDenPenObjNumeroCausaDenPensionCollection(Collection<LogProDenPenObj> collection) {
        this.logProDenPenObjNumeroCausaDenPensionCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCausaDenPensionCollection() {
        return this.personaNumeroCausaDenPensionCollection;
    }

    public void setPersonaNumeroCausaDenPensionCollection(Collection<Persona> collection) {
        this.personaNumeroCausaDenPensionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenPension) {
            CausaDenPension that = (CausaDenPension) object;
            return numeroCausaDenPension == null ? that.numeroCausaDenPension == null ? 0 : -1
                    : numeroCausaDenPension.compareTo(that.numeroCausaDenPension);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCausaDenPension == null ? 0 : numeroCausaDenPension.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaDenPension) {
            CausaDenPension that = (CausaDenPension) object;
            return ((numeroCausaDenPension == null && that.numeroCausaDenPension == null) ||
                    (numeroCausaDenPension != null && numeroCausaDenPension.equals(that.numeroCausaDenPension)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCausaDenPension;
    }
}
