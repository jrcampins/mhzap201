/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.PaqueteBase;
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
@Table(name = "paquete")
public class Paquete implements PaqueteBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_paquete")
    private Long idPaquete;

    @Basic(optional = false)
    @Column(name = "version_paquete")
    private long versionPaquete;

    @Basic(optional = false)
    @Column(name = "codigo_paquete")
    private String codigoPaquete;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paqueteIdPaquete")
    private Collection<Dominio> dominioIdPaqueteCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paqueteIdPaquete")
    private Collection<DominioPaquete> dominioPaqueteIdPaqueteCollection;

    public Paquete() {
    }

    @Override
    public Long getIdPaquete() {
        return this.idPaquete;
    }

    public void setIdPaquete(Long idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public long getVersionPaquete() {
        return this.versionPaquete;
    }

    public void setVersionPaquete(long versionPaquete) {
        this.versionPaquete = versionPaquete;
    }

    @Override
    public String getCodigoPaquete() {
        return this.codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    @Override
    public Collection<Dominio> getDominioIdPaqueteCollection() {
        return this.dominioIdPaqueteCollection;
    }

    public void setDominioIdPaqueteCollection(Collection<Dominio> collection) {
        this.dominioIdPaqueteCollection = collection;
    }

    @Override
    public Collection<DominioPaquete> getDominioPaqueteIdPaqueteCollection() {
        return this.dominioPaqueteIdPaqueteCollection;
    }

    public void setDominioPaqueteIdPaqueteCollection(Collection<DominioPaquete> collection) {
        this.dominioPaqueteIdPaqueteCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Paquete) {
            Paquete that = (Paquete) object;
            return idPaquete == null ? that.idPaquete == null ? 0 : -1
                    : idPaquete.compareTo(that.idPaquete);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPaquete == null ? 0 : idPaquete.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Paquete) {
            Paquete that = (Paquete) object;
            return ((idPaquete == null && that.idPaquete == null) ||
                    (idPaquete != null && idPaquete.equals(that.idPaquete)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPaquete;
    }
}
