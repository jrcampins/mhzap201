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

import com.egt.base.persistence.entity.CausaImpedimentoBase;
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
@Table(name = "causa_impedimento")
public class CausaImpedimento implements CausaImpedimentoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_causa_impedimento")
    private Integer numeroCausaImpedimento;

    @Basic(optional = false)
    @Column(name = "codigo_causa_impedimento")
    private String codigoCausaImpedimento;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "causaImpedimentoNumeroCausaImpedimento")
    private Collection<FichaPersona> fichaPersonaNumeroCausaImpedimentoCollection;

    public CausaImpedimento() {
    }

    @Override
    public Integer getNumeroCausaImpedimento() {
        return this.numeroCausaImpedimento;
    }

    public void setNumeroCausaImpedimento(Integer numeroCausaImpedimento) {
        this.numeroCausaImpedimento = numeroCausaImpedimento;
    }

    @Override
    public String getCodigoCausaImpedimento() {
        return this.codigoCausaImpedimento;
    }

    public void setCodigoCausaImpedimento(String codigoCausaImpedimento) {
        this.codigoCausaImpedimento = codigoCausaImpedimento;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroCausaImpedimentoCollection() {
        return this.fichaPersonaNumeroCausaImpedimentoCollection;
    }

    public void setFichaPersonaNumeroCausaImpedimentoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroCausaImpedimentoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaImpedimento) {
            CausaImpedimento that = (CausaImpedimento) object;
            return numeroCausaImpedimento == null ? that.numeroCausaImpedimento == null ? 0 : -1
                    : numeroCausaImpedimento.compareTo(that.numeroCausaImpedimento);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCausaImpedimento == null ? 0 : numeroCausaImpedimento.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CausaImpedimento) {
            CausaImpedimento that = (CausaImpedimento) object;
            return ((numeroCausaImpedimento == null && that.numeroCausaImpedimento == null) ||
                    (numeroCausaImpedimento != null && numeroCausaImpedimento.equals(that.numeroCausaImpedimento)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCausaImpedimento;
    }
}
