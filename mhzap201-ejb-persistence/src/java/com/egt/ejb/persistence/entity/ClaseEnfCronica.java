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

import com.egt.base.persistence.entity.ClaseEnfCronicaBase;
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
@Table(name = "clase_enf_cronica")
public class ClaseEnfCronica implements ClaseEnfCronicaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_clase_enf_cronica")
    private Integer numeroClaseEnfCronica;

    @Basic(optional = false)
    @Column(name = "codigo_clase_enf_cronica")
    private String codigoClaseEnfCronica;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseEnfCronicaNumeroClaseEnfCronica")
    private Collection<FichaPersona> fichaPersonaNumeroClaseEnfCronicaCollection;

    public ClaseEnfCronica() {
    }

    @Override
    public Integer getNumeroClaseEnfCronica() {
        return this.numeroClaseEnfCronica;
    }

    public void setNumeroClaseEnfCronica(Integer numeroClaseEnfCronica) {
        this.numeroClaseEnfCronica = numeroClaseEnfCronica;
    }

    @Override
    public String getCodigoClaseEnfCronica() {
        return this.codigoClaseEnfCronica;
    }

    public void setCodigoClaseEnfCronica(String codigoClaseEnfCronica) {
        this.codigoClaseEnfCronica = codigoClaseEnfCronica;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroClaseEnfCronicaCollection() {
        return this.fichaPersonaNumeroClaseEnfCronicaCollection;
    }

    public void setFichaPersonaNumeroClaseEnfCronicaCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroClaseEnfCronicaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseEnfCronica) {
            ClaseEnfCronica that = (ClaseEnfCronica) object;
            return numeroClaseEnfCronica == null ? that.numeroClaseEnfCronica == null ? 0 : -1
                    : numeroClaseEnfCronica.compareTo(that.numeroClaseEnfCronica);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroClaseEnfCronica == null ? 0 : numeroClaseEnfCronica.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseEnfCronica) {
            ClaseEnfCronica that = (ClaseEnfCronica) object;
            return ((numeroClaseEnfCronica == null && that.numeroClaseEnfCronica == null) ||
                    (numeroClaseEnfCronica != null && numeroClaseEnfCronica.equals(that.numeroClaseEnfCronica)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroClaseEnfCronica;
    }
}
