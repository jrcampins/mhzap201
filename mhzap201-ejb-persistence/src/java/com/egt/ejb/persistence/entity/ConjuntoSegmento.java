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

import com.egt.base.persistence.entity.ConjuntoSegmentoBase;
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
@Table(name = "conjunto_segmento")
public class ConjuntoSegmento implements ConjuntoSegmentoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_conjunto_segmento")
    private Long idConjuntoSegmento;

    @Basic(optional = false)
    @Column(name = "version_conjunto_segmento")
    private long versionConjuntoSegmento;

    @Basic(optional = false)
    @Column(name = "codigo_conjunto_segmento")
    private String codigoConjuntoSegmento;

    @Column(name = "nombre_conjunto_segmento")
    private String nombreConjuntoSegmento;

    @Column(name = "descripcion_conjunto_segmento")
    private String descripcionConjuntoSegmento;

    @JoinColumn(name = "id_clase_recurso", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecurso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "conjuntoSegmentoIdConjuntoSegmento")
    private Collection<ElementoSegmento> elementoSegmentoIdConjuntoSegmentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "conjuntoSegmentoIdConjuntoSegmento")
    private Collection<RolFuncion> rolFuncionIdConjuntoSegmentoCollection;

    public ConjuntoSegmento() {
    }

    @Override
    public Long getIdConjuntoSegmento() {
        return this.idConjuntoSegmento;
    }

    public void setIdConjuntoSegmento(Long idConjuntoSegmento) {
        this.idConjuntoSegmento = idConjuntoSegmento;
    }

    @Override
    public long getVersionConjuntoSegmento() {
        return this.versionConjuntoSegmento;
    }

    public void setVersionConjuntoSegmento(long versionConjuntoSegmento) {
        this.versionConjuntoSegmento = versionConjuntoSegmento;
    }

    @Override
    public String getCodigoConjuntoSegmento() {
        return this.codigoConjuntoSegmento;
    }

    public void setCodigoConjuntoSegmento(String codigoConjuntoSegmento) {
        this.codigoConjuntoSegmento = codigoConjuntoSegmento;
    }

    @Override
    public String getNombreConjuntoSegmento() {
        return this.nombreConjuntoSegmento;
    }

    public void setNombreConjuntoSegmento(String nombreConjuntoSegmento) {
        this.nombreConjuntoSegmento = nombreConjuntoSegmento;
    }

    @Override
    public String getDescripcionConjuntoSegmento() {
        return this.descripcionConjuntoSegmento;
    }

    public void setDescripcionConjuntoSegmento(String descripcionConjuntoSegmento) {
        this.descripcionConjuntoSegmento = descripcionConjuntoSegmento;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecurso() {
        return this.claseRecursoIdClaseRecurso;
    }

    public void setClaseRecursoIdClaseRecurso(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecurso = claseRecurso;
    }

    @Override
    public Collection<ElementoSegmento> getElementoSegmentoIdConjuntoSegmentoCollection() {
        return this.elementoSegmentoIdConjuntoSegmentoCollection;
    }

    public void setElementoSegmentoIdConjuntoSegmentoCollection(Collection<ElementoSegmento> collection) {
        this.elementoSegmentoIdConjuntoSegmentoCollection = collection;
    }

    @Override
    public Collection<RolFuncion> getRolFuncionIdConjuntoSegmentoCollection() {
        return this.rolFuncionIdConjuntoSegmentoCollection;
    }

    public void setRolFuncionIdConjuntoSegmentoCollection(Collection<RolFuncion> collection) {
        this.rolFuncionIdConjuntoSegmentoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ConjuntoSegmento) {
            ConjuntoSegmento that = (ConjuntoSegmento) object;
            return idConjuntoSegmento == null ? that.idConjuntoSegmento == null ? 0 : -1
                    : idConjuntoSegmento.compareTo(that.idConjuntoSegmento);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idConjuntoSegmento == null ? 0 : idConjuntoSegmento.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ConjuntoSegmento) {
            ConjuntoSegmento that = (ConjuntoSegmento) object;
            return ((idConjuntoSegmento == null && that.idConjuntoSegmento == null)
                    || (idConjuntoSegmento != null && idConjuntoSegmento.equals(that.idConjuntoSegmento)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idConjuntoSegmento;
    }

}
