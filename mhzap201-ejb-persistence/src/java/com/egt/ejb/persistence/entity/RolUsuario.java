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

import com.egt.base.persistence.entity.RolUsuarioBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class RolUsuario implements RolUsuarioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol_usuario")
    private Long idRolUsuario;

    @Basic(optional = false)
    @Column(name = "version_rol_usuario")
    private long versionRolUsuario;

    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private Rol rolIdRol;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuario;

    public RolUsuario() {
    }

    @Override
    public Long getIdRolUsuario() {
        return this.idRolUsuario;
    }

    public void setIdRolUsuario(Long idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    @Override
    public long getVersionRolUsuario() {
        return this.versionRolUsuario;
    }

    public void setVersionRolUsuario(long versionRolUsuario) {
        this.versionRolUsuario = versionRolUsuario;
    }

    @Override
    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    public void setRolIdRol(Rol rol) {
        this.rolIdRol = rol;
    }

    @Override
    public Usuario getUsuarioIdUsuario() {
        return this.usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuario) {
        this.usuarioIdUsuario = usuario;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolUsuario) {
            RolUsuario that = (RolUsuario) object;
            return idRolUsuario == null ? that.idRolUsuario == null ? 0 : -1
                    : idRolUsuario.compareTo(that.idRolUsuario);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRolUsuario == null ? 0 : idRolUsuario.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolUsuario) {
            RolUsuario that = (RolUsuario) object;
            return ((idRolUsuario == null && that.idRolUsuario == null) ||
                    (idRolUsuario != null && idRolUsuario.equals(that.idRolUsuario)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRolUsuario;
    }
}
