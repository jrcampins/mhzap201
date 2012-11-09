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

import com.egt.base.persistence.entity.RolAplicacionBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_aplicacion")
public class RolAplicacion implements RolAplicacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol_aplicacion")
    private Long idRolAplicacion;

    @Basic(optional = false)
    @Column(name = "version_rol_aplicacion")
    private long versionRolAplicacion;

    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private Rol rolIdRol;

    @JoinColumn(name = "id_aplicacion", referencedColumnName = "id_aplicacion")
    @ManyToOne
    private Aplicacion aplicacionIdAplicacion;

    public RolAplicacion() {
    }

    @Override
    public Long getIdRolAplicacion() {
        return this.idRolAplicacion;
    }

    public void setIdRolAplicacion(Long idRolAplicacion) {
        this.idRolAplicacion = idRolAplicacion;
    }

    @Override
    public long getVersionRolAplicacion() {
        return this.versionRolAplicacion;
    }

    public void setVersionRolAplicacion(long versionRolAplicacion) {
        this.versionRolAplicacion = versionRolAplicacion;
    }

    @Override
    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    public void setRolIdRol(Rol rol) {
        this.rolIdRol = rol;
    }

    @Override
    public Aplicacion getAplicacionIdAplicacion() {
        return this.aplicacionIdAplicacion;
    }

    public void setAplicacionIdAplicacion(Aplicacion aplicacion) {
        this.aplicacionIdAplicacion = aplicacion;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolAplicacion) {
            RolAplicacion that = (RolAplicacion) object;
            return idRolAplicacion == null ? that.idRolAplicacion == null ? 0 : -1
                    : idRolAplicacion.compareTo(that.idRolAplicacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRolAplicacion == null ? 0 : idRolAplicacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolAplicacion) {
            RolAplicacion that = (RolAplicacion) object;
            return ((idRolAplicacion == null && that.idRolAplicacion == null) ||
                    (idRolAplicacion != null && idRolAplicacion.equals(that.idRolAplicacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRolAplicacion;
    }
}
