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

import com.egt.base.persistence.entity.RolPaginaBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_pagina")
public class RolPagina implements RolPaginaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol_pagina")
    private Long idRolPagina;

    @Basic(optional = false)
    @Column(name = "version_rol_pagina")
    private long versionRolPagina;

    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private Rol rolIdRol;

    @JoinColumn(name = "id_pagina", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPagina;

    public RolPagina() {
    }

    @Override
    public Long getIdRolPagina() {
        return this.idRolPagina;
    }

    public void setIdRolPagina(Long idRolPagina) {
        this.idRolPagina = idRolPagina;
    }

    @Override
    public long getVersionRolPagina() {
        return this.versionRolPagina;
    }

    public void setVersionRolPagina(long versionRolPagina) {
        this.versionRolPagina = versionRolPagina;
    }

    @Override
    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    public void setRolIdRol(Rol rol) {
        this.rolIdRol = rol;
    }

    @Override
    public Pagina getPaginaIdPagina() {
        return this.paginaIdPagina;
    }

    public void setPaginaIdPagina(Pagina pagina) {
        this.paginaIdPagina = pagina;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolPagina) {
            RolPagina that = (RolPagina) object;
            return idRolPagina == null ? that.idRolPagina == null ? 0 : -1
                    : idRolPagina.compareTo(that.idRolPagina);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRolPagina == null ? 0 : idRolPagina.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolPagina) {
            RolPagina that = (RolPagina) object;
            return ((idRolPagina == null && that.idRolPagina == null) ||
                    (idRolPagina != null && idRolPagina.equals(that.idRolPagina)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRolPagina;
    }
}
