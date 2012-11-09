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

import com.egt.base.persistence.entity.InformeBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informe")
public class Informe implements InformeBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_informe")
    private Long idInforme;

    @Basic(optional = false)
    @Column(name = "version_informe")
    private long versionInforme;

    @Basic(optional = false)
    @Column(name = "codigo_proceso_informe")
    private String codigoProcesoInforme;

    @Basic(optional = false)
    @Column(name = "nombre_proceso_informe")
    private String nombreProcesoInforme;

    public Informe() {
    }

    @Override
    public Long getIdInforme() {
        return this.idInforme;
    }

    public void setIdInforme(Long idInforme) {
        this.idInforme = idInforme;
    }

    @Override
    public long getVersionInforme() {
        return this.versionInforme;
    }

    public void setVersionInforme(long versionInforme) {
        this.versionInforme = versionInforme;
    }

    @Override
    public String getCodigoProcesoInforme() {
        return this.codigoProcesoInforme;
    }

    public void setCodigoProcesoInforme(String codigoProcesoInforme) {
        this.codigoProcesoInforme = codigoProcesoInforme;
    }

    @Override
    public String getNombreProcesoInforme() {
        return this.nombreProcesoInforme;
    }

    public void setNombreProcesoInforme(String nombreProcesoInforme) {
        this.nombreProcesoInforme = nombreProcesoInforme;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Informe) {
            Informe that = (Informe) object;
            return idInforme == null ? that.idInforme == null ? 0 : -1
                    : idInforme.compareTo(that.idInforme);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idInforme == null ? 0 : idInforme.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Informe) {
            Informe that = (Informe) object;
            return ((idInforme == null && that.idInforme == null) ||
                    (idInforme != null && idInforme.equals(that.idInforme)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idInforme;
    }
}
