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

import com.egt.base.persistence.entity.ClaseRecursoSecBase;
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
@Table(name = "clase_recurso_sec")
public class ClaseRecursoSec implements ClaseRecursoSecBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_clase_recurso_sec")
    private Long idClaseRecursoSec;

    @Basic(optional = false)
    @Column(name = "version_clase_recurso_sec")
    private long versionClaseRecursoSec;

    @Basic(optional = false)
    @Column(name = "etiqueta_clase_recurso_sec")
    private String etiquetaClaseRecursoSec;

    @Column(name = "descripcion_clase_recurso_sec")
    private String descripcionClaseRecursoSec;

    @Basic(optional = false)
    @Column(name = "orden_presentacion")
    private int ordenPresentacion;

    @Basic(optional = false)
    @Column(name = "es_pestana_detalle")
    private int esPestanaDetalle;

    @JoinColumn(name = "id_clase_recurso", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecurso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoSecIdClaseRecursoSec")
    private Collection<ClaseRecursoPar> claseRecursoParIdClaseRecursoSecCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoSecIdClaseRecursoSec")
    private Collection<FiltroClaRecSec> filtroClaRecSecIdClaseRecursoSecCollection;

    public ClaseRecursoSec() {
    }

    @Override
    public Long getIdClaseRecursoSec() {
        return this.idClaseRecursoSec;
    }

    public void setIdClaseRecursoSec(Long idClaseRecursoSec) {
        this.idClaseRecursoSec = idClaseRecursoSec;
    }

    @Override
    public long getVersionClaseRecursoSec() {
        return this.versionClaseRecursoSec;
    }

    public void setVersionClaseRecursoSec(long versionClaseRecursoSec) {
        this.versionClaseRecursoSec = versionClaseRecursoSec;
    }

    @Override
    public String getEtiquetaClaseRecursoSec() {
        return this.etiquetaClaseRecursoSec;
    }

    public void setEtiquetaClaseRecursoSec(String etiquetaClaseRecursoSec) {
        this.etiquetaClaseRecursoSec = etiquetaClaseRecursoSec;
    }

    @Override
    public String getDescripcionClaseRecursoSec() {
        return this.descripcionClaseRecursoSec;
    }

    public void setDescripcionClaseRecursoSec(String descripcionClaseRecursoSec) {
        this.descripcionClaseRecursoSec = descripcionClaseRecursoSec;
    }

    @Override
    public int getOrdenPresentacion() {
        return this.ordenPresentacion;
    }

    public void setOrdenPresentacion(int ordenPresentacion) {
        this.ordenPresentacion = ordenPresentacion;
    }

    @Override
    public int getEsPestanaDetalle() {
        return this.esPestanaDetalle;
    }

    public void setEsPestanaDetalle(int esPestanaDetalle) {
        this.esPestanaDetalle = esPestanaDetalle;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecurso() {
        return this.claseRecursoIdClaseRecurso;
    }

    public void setClaseRecursoIdClaseRecurso(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecurso = claseRecurso;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParIdClaseRecursoSecCollection() {
        return this.claseRecursoParIdClaseRecursoSecCollection;
    }

    public void setClaseRecursoParIdClaseRecursoSecCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParIdClaseRecursoSecCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecSec> getFiltroClaRecSecIdClaseRecursoSecCollection() {
        return this.filtroClaRecSecIdClaseRecursoSecCollection;
    }

    public void setFiltroClaRecSecIdClaseRecursoSecCollection(Collection<FiltroClaRecSec> collection) {
        this.filtroClaRecSecIdClaseRecursoSecCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecursoSec) {
            ClaseRecursoSec that = (ClaseRecursoSec) object;
            return idClaseRecursoSec == null ? that.idClaseRecursoSec == null ? 0 : -1
                    : idClaseRecursoSec.compareTo(that.idClaseRecursoSec);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idClaseRecursoSec == null ? 0 : idClaseRecursoSec.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecursoSec) {
            ClaseRecursoSec that = (ClaseRecursoSec) object;
            return ((idClaseRecursoSec == null && that.idClaseRecursoSec == null) ||
                    (idClaseRecursoSec != null && idClaseRecursoSec.equals(that.idClaseRecursoSec)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idClaseRecursoSec;
    }
}
