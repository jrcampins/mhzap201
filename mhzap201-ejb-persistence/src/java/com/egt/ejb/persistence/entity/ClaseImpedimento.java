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

import com.egt.base.persistence.entity.ClaseImpedimentoBase;
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
@Table(name = "clase_impedimento")
public class ClaseImpedimento implements ClaseImpedimentoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_clase_impedimento")
    private Integer numeroClaseImpedimento;

    @Basic(optional = false)
    @Column(name = "codigo_clase_impedimento")
    private String codigoClaseImpedimento;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseImpedimentoNumeroClaseImpedimento")
    private Collection<FichaPersona> fichaPersonaNumeroClaseImpedimentoCollection;

    public ClaseImpedimento() {
    }

    @Override
    public Integer getNumeroClaseImpedimento() {
        return this.numeroClaseImpedimento;
    }

    public void setNumeroClaseImpedimento(Integer numeroClaseImpedimento) {
        this.numeroClaseImpedimento = numeroClaseImpedimento;
    }

    @Override
    public String getCodigoClaseImpedimento() {
        return this.codigoClaseImpedimento;
    }

    public void setCodigoClaseImpedimento(String codigoClaseImpedimento) {
        this.codigoClaseImpedimento = codigoClaseImpedimento;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroClaseImpedimentoCollection() {
        return this.fichaPersonaNumeroClaseImpedimentoCollection;
    }

    public void setFichaPersonaNumeroClaseImpedimentoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroClaseImpedimentoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseImpedimento) {
            ClaseImpedimento that = (ClaseImpedimento) object;
            return numeroClaseImpedimento == null ? that.numeroClaseImpedimento == null ? 0 : -1
                    : numeroClaseImpedimento.compareTo(that.numeroClaseImpedimento);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroClaseImpedimento == null ? 0 : numeroClaseImpedimento.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseImpedimento) {
            ClaseImpedimento that = (ClaseImpedimento) object;
            return ((numeroClaseImpedimento == null && that.numeroClaseImpedimento == null) ||
                    (numeroClaseImpedimento != null && numeroClaseImpedimento.equals(that.numeroClaseImpedimento)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroClaseImpedimento;
    }
}
