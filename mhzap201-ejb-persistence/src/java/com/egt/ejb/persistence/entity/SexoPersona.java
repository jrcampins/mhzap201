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

import com.egt.base.persistence.entity.SexoPersonaBase;
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
@Table(name = "sexo_persona")
public class SexoPersona implements SexoPersonaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_sexo_persona")
    private Integer numeroSexoPersona;

    @Basic(optional = false)
    @Column(name = "codigo_sexo_persona")
    private String codigoSexoPersona;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sexoPersonaNumeroSexoPersona")
    private Collection<FichaPersona> fichaPersonaNumeroSexoPersonaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sexoPersonaNumeroSexoPersona")
    private Collection<Persona> personaNumeroSexoPersonaCollection;

    public SexoPersona() {
    }

    @Override
    public Integer getNumeroSexoPersona() {
        return this.numeroSexoPersona;
    }

    public void setNumeroSexoPersona(Integer numeroSexoPersona) {
        this.numeroSexoPersona = numeroSexoPersona;
    }

    @Override
    public String getCodigoSexoPersona() {
        return this.codigoSexoPersona;
    }

    public void setCodigoSexoPersona(String codigoSexoPersona) {
        this.codigoSexoPersona = codigoSexoPersona;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSexoPersonaCollection() {
        return this.fichaPersonaNumeroSexoPersonaCollection;
    }

    public void setFichaPersonaNumeroSexoPersonaCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSexoPersonaCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroSexoPersonaCollection() {
        return this.personaNumeroSexoPersonaCollection;
    }

    public void setPersonaNumeroSexoPersonaCollection(Collection<Persona> collection) {
        this.personaNumeroSexoPersonaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof SexoPersona) {
            SexoPersona that = (SexoPersona) object;
            return numeroSexoPersona == null ? that.numeroSexoPersona == null ? 0 : -1
                    : numeroSexoPersona.compareTo(that.numeroSexoPersona);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroSexoPersona == null ? 0 : numeroSexoPersona.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof SexoPersona) {
            SexoPersona that = (SexoPersona) object;
            return ((numeroSexoPersona == null && that.numeroSexoPersona == null) ||
                    (numeroSexoPersona != null && numeroSexoPersona.equals(that.numeroSexoPersona)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroSexoPersona;
    }
}
