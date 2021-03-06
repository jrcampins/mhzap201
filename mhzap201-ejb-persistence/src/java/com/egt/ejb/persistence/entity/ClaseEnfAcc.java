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

import com.egt.base.persistence.entity.ClaseEnfAccBase;
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
@Table(name = "clase_enf_acc")
public class ClaseEnfAcc implements ClaseEnfAccBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_clase_enf_acc")
    private Integer numeroClaseEnfAcc;

    @Basic(optional = false)
    @Column(name = "codigo_clase_enf_acc")
    private String codigoClaseEnfAcc;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseEnfAccNumeroClaseEnfAcc")
    private Collection<FichaPersona> fichaPersonaNumeroClaseEnfAccCollection;

    public ClaseEnfAcc() {
    }

    @Override
    public Integer getNumeroClaseEnfAcc() {
        return this.numeroClaseEnfAcc;
    }

    public void setNumeroClaseEnfAcc(Integer numeroClaseEnfAcc) {
        this.numeroClaseEnfAcc = numeroClaseEnfAcc;
    }

    @Override
    public String getCodigoClaseEnfAcc() {
        return this.codigoClaseEnfAcc;
    }

    public void setCodigoClaseEnfAcc(String codigoClaseEnfAcc) {
        this.codigoClaseEnfAcc = codigoClaseEnfAcc;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroClaseEnfAccCollection() {
        return this.fichaPersonaNumeroClaseEnfAccCollection;
    }

    public void setFichaPersonaNumeroClaseEnfAccCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroClaseEnfAccCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseEnfAcc) {
            ClaseEnfAcc that = (ClaseEnfAcc) object;
            return numeroClaseEnfAcc == null ? that.numeroClaseEnfAcc == null ? 0 : -1
                    : numeroClaseEnfAcc.compareTo(that.numeroClaseEnfAcc);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroClaseEnfAcc == null ? 0 : numeroClaseEnfAcc.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseEnfAcc) {
            ClaseEnfAcc that = (ClaseEnfAcc) object;
            return ((numeroClaseEnfAcc == null && that.numeroClaseEnfAcc == null) ||
                    (numeroClaseEnfAcc != null && numeroClaseEnfAcc.equals(that.numeroClaseEnfAcc)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroClaseEnfAcc;
    }
}
