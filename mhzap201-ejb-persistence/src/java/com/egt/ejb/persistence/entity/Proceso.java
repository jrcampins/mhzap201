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

import com.egt.base.persistence.entity.ProcesoBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proceso")
public class Proceso implements ProcesoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_proceso")
    private Long idProceso;

    @Basic(optional = false)
    @Column(name = "version_proceso")
    private long versionProceso;

    @Basic(optional = false)
    @Column(name = "codigo_proceso")
    private String codigoProceso;

    @Basic(optional = false)
    @Column(name = "nombre_proceso")
    private String nombreProceso;

    public Proceso() {
    }

    @Override
    public Long getIdProceso() {
        return this.idProceso;
    }

    public void setIdProceso(Long idProceso) {
        this.idProceso = idProceso;
    }

    @Override
    public long getVersionProceso() {
        return this.versionProceso;
    }

    public void setVersionProceso(long versionProceso) {
        this.versionProceso = versionProceso;
    }

    @Override
    public String getCodigoProceso() {
        return this.codigoProceso;
    }

    public void setCodigoProceso(String codigoProceso) {
        this.codigoProceso = codigoProceso;
    }

    @Override
    public String getNombreProceso() {
        return this.nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Proceso) {
            Proceso that = (Proceso) object;
            return idProceso == null ? that.idProceso == null ? 0 : -1
                    : idProceso.compareTo(that.idProceso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idProceso == null ? 0 : idProceso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Proceso) {
            Proceso that = (Proceso) object;
            return ((idProceso == null && that.idProceso == null) ||
                    (idProceso != null && idProceso.equals(that.idProceso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idProceso;
    }
}
