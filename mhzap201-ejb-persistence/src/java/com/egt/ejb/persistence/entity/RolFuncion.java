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

import com.egt.base.persistence.entity.RolFuncionBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_funcion")
public class RolFuncion implements RolFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rol_funcion")
    private Long idRolFuncion;

    @Basic(optional = false)
    @Column(name = "version_rol_funcion")
    private long versionRolFuncion;

    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private Rol rolIdRol;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "id_conjunto_segmento", referencedColumnName = "id_conjunto_segmento")
    @ManyToOne
    private ConjuntoSegmento conjuntoSegmentoIdConjuntoSegmento;

    public RolFuncion() {
    }

    @Override
    public Long getIdRolFuncion() {
        return this.idRolFuncion;
    }

    public void setIdRolFuncion(Long idRolFuncion) {
        this.idRolFuncion = idRolFuncion;
    }

    @Override
    public long getVersionRolFuncion() {
        return this.versionRolFuncion;
    }

    public void setVersionRolFuncion(long versionRolFuncion) {
        this.versionRolFuncion = versionRolFuncion;
    }

    @Override
    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    public void setRolIdRol(Rol rol) {
        this.rolIdRol = rol;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public ConjuntoSegmento getConjuntoSegmentoIdConjuntoSegmento() {
        return this.conjuntoSegmentoIdConjuntoSegmento;
    }

    public void setConjuntoSegmentoIdConjuntoSegmento(ConjuntoSegmento conjuntoSegmento) {
        this.conjuntoSegmentoIdConjuntoSegmento = conjuntoSegmento;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolFuncion) {
            RolFuncion that = (RolFuncion) object;
            return idRolFuncion == null ? that.idRolFuncion == null ? 0 : -1
                    : idRolFuncion.compareTo(that.idRolFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRolFuncion == null ? 0 : idRolFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RolFuncion) {
            RolFuncion that = (RolFuncion) object;
            return ((idRolFuncion == null && that.idRolFuncion == null) ||
                    (idRolFuncion != null && idRolFuncion.equals(that.idRolFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRolFuncion;
    }
}
