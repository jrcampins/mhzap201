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

import com.egt.base.persistence.entity.DominioPaqueteBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dominio_paquete")
public class DominioPaquete implements DominioPaqueteBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_dominio_paquete")
    private Long idDominioPaquete;

    @Basic(optional = false)
    @Column(name = "version_dominio_paquete")
    private long versionDominioPaquete;

    @JoinColumn(name = "id_dominio", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominio;

    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne
    private Paquete paqueteIdPaquete;

    public DominioPaquete() {
    }

    @Override
    public Long getIdDominioPaquete() {
        return this.idDominioPaquete;
    }

    public void setIdDominioPaquete(Long idDominioPaquete) {
        this.idDominioPaquete = idDominioPaquete;
    }

    @Override
    public long getVersionDominioPaquete() {
        return this.versionDominioPaquete;
    }

    public void setVersionDominioPaquete(long versionDominioPaquete) {
        this.versionDominioPaquete = versionDominioPaquete;
    }

    @Override
    public Dominio getDominioIdDominio() {
        return this.dominioIdDominio;
    }

    public void setDominioIdDominio(Dominio dominio) {
        this.dominioIdDominio = dominio;
    }

    @Override
    public Paquete getPaqueteIdPaquete() {
        return this.paqueteIdPaquete;
    }

    public void setPaqueteIdPaquete(Paquete paquete) {
        this.paqueteIdPaquete = paquete;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof DominioPaquete) {
            DominioPaquete that = (DominioPaquete) object;
            return idDominioPaquete == null ? that.idDominioPaquete == null ? 0 : -1
                    : idDominioPaquete.compareTo(that.idDominioPaquete);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idDominioPaquete == null ? 0 : idDominioPaquete.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof DominioPaquete) {
            DominioPaquete that = (DominioPaquete) object;
            return ((idDominioPaquete == null && that.idDominioPaquete == null) ||
                    (idDominioPaquete != null && idDominioPaquete.equals(that.idDominioPaquete)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idDominioPaquete;
    }
}
