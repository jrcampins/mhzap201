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

import com.egt.base.persistence.entity.EtniaIndigenaBase;
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
@Table(name = "etnia_indigena")
public class EtniaIndigena implements EtniaIndigenaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_etnia_indigena")
    private Long idEtniaIndigena;

    @Basic(optional = false)
    @Column(name = "version_etnia_indigena")
    private long versionEtniaIndigena;

    @Basic(optional = false)
    @Column(name = "codigo_etnia_indigena")
    private String codigoEtniaIndigena;

    @Column(name = "nombre_etnia_indigena")
    private String nombreEtniaIndigena;

    @Column(name = "descripcion_etnia_indigena")
    private String descripcionEtniaIndigena;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "etniaIndigenaIdEtniaIndigena")
    private Collection<Persona> personaIdEtniaIndigenaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "etniaIndigenaIdEtniaIndigena")
    private Collection<PotencialBen> potencialBenIdEtniaIndigenaCollection;

    public EtniaIndigena() {
    }

    @Override
    public Long getIdEtniaIndigena() {
        return this.idEtniaIndigena;
    }

    public void setIdEtniaIndigena(Long idEtniaIndigena) {
        this.idEtniaIndigena = idEtniaIndigena;
    }

    @Override
    public long getVersionEtniaIndigena() {
        return this.versionEtniaIndigena;
    }

    public void setVersionEtniaIndigena(long versionEtniaIndigena) {
        this.versionEtniaIndigena = versionEtniaIndigena;
    }

    @Override
    public String getCodigoEtniaIndigena() {
        return this.codigoEtniaIndigena;
    }

    public void setCodigoEtniaIndigena(String codigoEtniaIndigena) {
        this.codigoEtniaIndigena = codigoEtniaIndigena;
    }

    @Override
    public String getNombreEtniaIndigena() {
        return this.nombreEtniaIndigena;
    }

    public void setNombreEtniaIndigena(String nombreEtniaIndigena) {
        this.nombreEtniaIndigena = nombreEtniaIndigena;
    }

    @Override
    public String getDescripcionEtniaIndigena() {
        return this.descripcionEtniaIndigena;
    }

    public void setDescripcionEtniaIndigena(String descripcionEtniaIndigena) {
        this.descripcionEtniaIndigena = descripcionEtniaIndigena;
    }

    @Override
    public Collection<Persona> getPersonaIdEtniaIndigenaCollection() {
        return this.personaIdEtniaIndigenaCollection;
    }

    public void setPersonaIdEtniaIndigenaCollection(Collection<Persona> collection) {
        this.personaIdEtniaIndigenaCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdEtniaIndigenaCollection() {
        return this.potencialBenIdEtniaIndigenaCollection;
    }

    public void setPotencialBenIdEtniaIndigenaCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdEtniaIndigenaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EtniaIndigena) {
            EtniaIndigena that = (EtniaIndigena) object;
            return idEtniaIndigena == null ? that.idEtniaIndigena == null ? 0 : -1
                    : idEtniaIndigena.compareTo(that.idEtniaIndigena);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idEtniaIndigena == null ? 0 : idEtniaIndigena.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EtniaIndigena) {
            EtniaIndigena that = (EtniaIndigena) object;
            return ((idEtniaIndigena == null && that.idEtniaIndigena == null) ||
                    (idEtniaIndigena != null && idEtniaIndigena.equals(that.idEtniaIndigena)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idEtniaIndigena;
    }
}
