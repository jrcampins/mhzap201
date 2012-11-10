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

import com.egt.base.persistence.entity.RolBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements RolBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Long idRol;

    @Basic(optional = false)
    @Column(name = "version_rol")
    private long versionRol;

    @Basic(optional = false)
    @Column(name = "codigo_rol")
    private String codigoRol;

    @Column(name = "nombre_rol")
    private String nombreRol;

    @Column(name = "descripcion_rol")
    private String descripcionRol;

    @JoinColumn(name = "numero_tipo_rol", referencedColumnName = "numero_tipo_rol")
    @ManyToOne
    private TipoRol tipoRolNumeroTipoRol;

    @JoinColumn(name = "id_grupo_aplicacion", referencedColumnName = "id_grupo_aplicacion")
    @ManyToOne
    private GrupoAplicacion grupoAplicacionIdGrupoAplicacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rolIdRol")
    private Collection<RolAplicacion> rolAplicacionIdRolCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rolIdRol")
    private Collection<RolFiltroFuncion> rolFiltroFuncionIdRolCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rolIdRol")
    private Collection<RolFuncion> rolFuncionIdRolCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rolIdRol")
    private Collection<RolPagina> rolPaginaIdRolCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rolIdRol")
    private Collection<RolUsuario> rolUsuarioIdRolCollection;

    public Rol() {
    }

    @Override
    public Long getIdRol() {
        return this.idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    @Override
    public long getVersionRol() {
        return this.versionRol;
    }

    public void setVersionRol(long versionRol) {
        this.versionRol = versionRol;
    }

    @Override
    public String getCodigoRol() {
        return this.codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    @Override
    public String getNombreRol() {
        return this.nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public String getDescripcionRol() {
        return this.descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    @Override
    public TipoRol getTipoRolNumeroTipoRol() {
        return this.tipoRolNumeroTipoRol;
    }

    public void setTipoRolNumeroTipoRol(TipoRol tipoRol) {
        this.tipoRolNumeroTipoRol = tipoRol;
    }

    @Override
    public GrupoAplicacion getGrupoAplicacionIdGrupoAplicacion() {
        return this.grupoAplicacionIdGrupoAplicacion;
    }

    public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacion grupoAplicacion) {
        this.grupoAplicacionIdGrupoAplicacion = grupoAplicacion;
    }

    @Override
    public Collection<RolAplicacion> getRolAplicacionIdRolCollection() {
        return this.rolAplicacionIdRolCollection;
    }

    public void setRolAplicacionIdRolCollection(Collection<RolAplicacion> collection) {
        this.rolAplicacionIdRolCollection = collection;
    }

    @Override
    public Collection<RolFiltroFuncion> getRolFiltroFuncionIdRolCollection() {
        return this.rolFiltroFuncionIdRolCollection;
    }

    public void setRolFiltroFuncionIdRolCollection(Collection<RolFiltroFuncion> collection) {
        this.rolFiltroFuncionIdRolCollection = collection;
    }

    @Override
    public Collection<RolFuncion> getRolFuncionIdRolCollection() {
        return this.rolFuncionIdRolCollection;
    }

    public void setRolFuncionIdRolCollection(Collection<RolFuncion> collection) {
        this.rolFuncionIdRolCollection = collection;
    }

    @Override
    public Collection<RolPagina> getRolPaginaIdRolCollection() {
        return this.rolPaginaIdRolCollection;
    }

    public void setRolPaginaIdRolCollection(Collection<RolPagina> collection) {
        this.rolPaginaIdRolCollection = collection;
    }

    @Override
    public Collection<RolUsuario> getRolUsuarioIdRolCollection() {
        return this.rolUsuarioIdRolCollection;
    }

    public void setRolUsuarioIdRolCollection(Collection<RolUsuario> collection) {
        this.rolUsuarioIdRolCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Rol) {
            Rol that = (Rol) object;
            return idRol == null ? that.idRol == null ? 0 : -1
                    : idRol.compareTo(that.idRol);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRol == null ? 0 : idRol.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Rol) {
            Rol that = (Rol) object;
            return ((idRol == null && that.idRol == null) ||
                    (idRol != null && idRol.equals(that.idRol)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRol;
    }
}
