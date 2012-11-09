/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.EstadoCivilBase;
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
@Table(name = "estado_civil")
public class EstadoCivil implements EstadoCivilBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_estado_civil")
    private Integer numeroEstadoCivil;

    @Basic(optional = false)
    @Column(name = "codigo_estado_civil")
    private String codigoEstadoCivil;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "estadoCivilNumeroEstadoCivil")
    private Collection<FichaPersona> fichaPersonaNumeroEstadoCivilCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "estadoCivilNumeroEstadoCivil")
    private Collection<Persona> personaNumeroEstadoCivilCollection;

    public EstadoCivil() {
    }

    @Override
    public Integer getNumeroEstadoCivil() {
        return this.numeroEstadoCivil;
    }

    public void setNumeroEstadoCivil(Integer numeroEstadoCivil) {
        this.numeroEstadoCivil = numeroEstadoCivil;
    }

    @Override
    public String getCodigoEstadoCivil() {
        return this.codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(String codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroEstadoCivilCollection() {
        return this.fichaPersonaNumeroEstadoCivilCollection;
    }

    public void setFichaPersonaNumeroEstadoCivilCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroEstadoCivilCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroEstadoCivilCollection() {
        return this.personaNumeroEstadoCivilCollection;
    }

    public void setPersonaNumeroEstadoCivilCollection(Collection<Persona> collection) {
        this.personaNumeroEstadoCivilCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EstadoCivil) {
            EstadoCivil that = (EstadoCivil) object;
            return numeroEstadoCivil == null ? that.numeroEstadoCivil == null ? 0 : -1
                    : numeroEstadoCivil.compareTo(that.numeroEstadoCivil);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroEstadoCivil == null ? 0 : numeroEstadoCivil.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EstadoCivil) {
            EstadoCivil that = (EstadoCivil) object;
            return ((numeroEstadoCivil == null && that.numeroEstadoCivil == null) ||
                    (numeroEstadoCivil != null && numeroEstadoCivil.equals(that.numeroEstadoCivil)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroEstadoCivil;
    }
}
