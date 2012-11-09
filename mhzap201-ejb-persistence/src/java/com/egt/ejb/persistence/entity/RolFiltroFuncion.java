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

import com.egt.base.persistence.entity.RolFiltroFuncionBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_filtro_funcion")
public class RolFiltroFuncion implements RolFiltroFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol_filtro_funcion")
    private Long idRolFiltroFuncion;

    @Basic(optional = false)
    @Column(name = "version_rol_filtro_funcion")
    private long versionRolFiltroFuncion;

    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private Rol rolIdRol;

    @JoinColumn(name = "id_filtro_funcion", referencedColumnName = "id_filtro_funcion")
    @ManyToOne
    private FiltroFuncion filtroFuncionIdFiltroFuncion;

    public RolFiltroFuncion() {
    }

    @Override
    public Long getIdRolFiltroFuncion() {
        return this.idRolFiltroFuncion;
    }

    public void setIdRolFiltroFuncion(Long idRolFiltroFuncion) {
        this.idRolFiltroFuncion = idRolFiltroFuncion;
    }

    @Override
    public long getVersionRolFiltroFuncion() {
        return this.versionRolFiltroFuncion;
    }

    public void setVersionRolFiltroFuncion(long versionRolFiltroFuncion) {
        this.versionRolFiltroFuncion = versionRolFiltroFuncion;
    }

    @Override
    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    public void setRolIdRol(Rol rol) {
        this.rolIdRol = rol;
    }

    @Override
    public FiltroFuncion getFiltroFuncionIdFiltroFuncion() {
        return this.filtroFuncionIdFiltroFuncion;
    }

    public void setFiltroFuncionIdFiltroFuncion(FiltroFuncion filtroFuncion) {
        this.filtroFuncionIdFiltroFuncion = filtroFuncion;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolFiltroFuncion) {
            RolFiltroFuncion that = (RolFiltroFuncion) object;
            return idRolFiltroFuncion == null ? that.idRolFiltroFuncion == null ? 0 : -1
                    : idRolFiltroFuncion.compareTo(that.idRolFiltroFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRolFiltroFuncion == null ? 0 : idRolFiltroFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolFiltroFuncion) {
            RolFiltroFuncion that = (RolFiltroFuncion) object;
            return ((idRolFiltroFuncion == null && that.idRolFiltroFuncion == null) ||
                    (idRolFiltroFuncion != null && idRolFiltroFuncion.equals(that.idRolFiltroFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRolFiltroFuncion;
    }
}
