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

import com.egt.base.persistence.entity.GrupoAplicacionBase;
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
@Table(name = "grupo_aplicacion")
public class GrupoAplicacion implements GrupoAplicacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_grupo_aplicacion")
    private Long idGrupoAplicacion;

    @Basic(optional = false)
    @Column(name = "version_grupo_aplicacion")
    private long versionGrupoAplicacion;

    @Basic(optional = false)
    @Column(name = "codigo_grupo_aplicacion")
    private String codigoGrupoAplicacion;

    @Column(name = "nombre_grupo_aplicacion")
    private String nombreGrupoAplicacion;

    @Column(name = "descripcion_grupo_aplicacion")
    private String descripcionGrupoAplicacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "grupoAplicacionIdGrupoAplicacion")
    private Collection<Aplicacion> aplicacionIdGrupoAplicacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "grupoAplicacionIdGrupoAplicacion")
    private Collection<ClaseRecurso> claseRecursoIdGrupoAplicacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "grupoAplicacionIdGrupoAplicacion")
    private Collection<Rol> rolIdGrupoAplicacionCollection;

    public GrupoAplicacion() {
    }

    @Override
    public Long getIdGrupoAplicacion() {
        return this.idGrupoAplicacion;
    }

    public void setIdGrupoAplicacion(Long idGrupoAplicacion) {
        this.idGrupoAplicacion = idGrupoAplicacion;
    }

    @Override
    public long getVersionGrupoAplicacion() {
        return this.versionGrupoAplicacion;
    }

    public void setVersionGrupoAplicacion(long versionGrupoAplicacion) {
        this.versionGrupoAplicacion = versionGrupoAplicacion;
    }

    @Override
    public String getCodigoGrupoAplicacion() {
        return this.codigoGrupoAplicacion;
    }

    public void setCodigoGrupoAplicacion(String codigoGrupoAplicacion) {
        this.codigoGrupoAplicacion = codigoGrupoAplicacion;
    }

    @Override
    public String getNombreGrupoAplicacion() {
        return this.nombreGrupoAplicacion;
    }

    public void setNombreGrupoAplicacion(String nombreGrupoAplicacion) {
        this.nombreGrupoAplicacion = nombreGrupoAplicacion;
    }

    @Override
    public String getDescripcionGrupoAplicacion() {
        return this.descripcionGrupoAplicacion;
    }

    public void setDescripcionGrupoAplicacion(String descripcionGrupoAplicacion) {
        this.descripcionGrupoAplicacion = descripcionGrupoAplicacion;
    }

    @Override
    public Collection<Aplicacion> getAplicacionIdGrupoAplicacionCollection() {
        return this.aplicacionIdGrupoAplicacionCollection;
    }

    public void setAplicacionIdGrupoAplicacionCollection(Collection<Aplicacion> collection) {
        this.aplicacionIdGrupoAplicacionCollection = collection;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdGrupoAplicacionCollection() {
        return this.claseRecursoIdGrupoAplicacionCollection;
    }

    public void setClaseRecursoIdGrupoAplicacionCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdGrupoAplicacionCollection = collection;
    }

    @Override
    public Collection<Rol> getRolIdGrupoAplicacionCollection() {
        return this.rolIdGrupoAplicacionCollection;
    }

    public void setRolIdGrupoAplicacionCollection(Collection<Rol> collection) {
        this.rolIdGrupoAplicacionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof GrupoAplicacion) {
            GrupoAplicacion that = (GrupoAplicacion) object;
            return idGrupoAplicacion == null ? that.idGrupoAplicacion == null ? 0 : -1
                    : idGrupoAplicacion.compareTo(that.idGrupoAplicacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idGrupoAplicacion == null ? 0 : idGrupoAplicacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof GrupoAplicacion) {
            GrupoAplicacion that = (GrupoAplicacion) object;
            return ((idGrupoAplicacion == null && that.idGrupoAplicacion == null) ||
                    (idGrupoAplicacion != null && idGrupoAplicacion.equals(that.idGrupoAplicacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idGrupoAplicacion;
    }
}
