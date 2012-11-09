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

import com.egt.base.persistence.entity.PaginaFuncionBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pagina_funcion")
public class PaginaFuncion implements PaginaFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_pagina_funcion")
    private Long idPaginaFuncion;

    @Basic(optional = false)
    @Column(name = "version_pagina_funcion")
    private long versionPaginaFuncion;

    @Basic(optional = false)
    @Column(name = "es_funcion_inicial")
    private int esFuncionInicial;

    @Column(name = "control_pagina_funcion")
    private String controlPaginaFuncion;

    @JoinColumn(name = "id_pagina", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPagina;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    public PaginaFuncion() {
    }

    @Override
    public Long getIdPaginaFuncion() {
        return this.idPaginaFuncion;
    }

    public void setIdPaginaFuncion(Long idPaginaFuncion) {
        this.idPaginaFuncion = idPaginaFuncion;
    }

    @Override
    public long getVersionPaginaFuncion() {
        return this.versionPaginaFuncion;
    }

    public void setVersionPaginaFuncion(long versionPaginaFuncion) {
        this.versionPaginaFuncion = versionPaginaFuncion;
    }

    @Override
    public int getEsFuncionInicial() {
        return this.esFuncionInicial;
    }

    public void setEsFuncionInicial(int esFuncionInicial) {
        this.esFuncionInicial = esFuncionInicial;
    }

    @Override
    public String getControlPaginaFuncion() {
        return this.controlPaginaFuncion;
    }

    public void setControlPaginaFuncion(String controlPaginaFuncion) {
        this.controlPaginaFuncion = controlPaginaFuncion;
    }

    @Override
    public Pagina getPaginaIdPagina() {
        return this.paginaIdPagina;
    }

    public void setPaginaIdPagina(Pagina pagina) {
        this.paginaIdPagina = pagina;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PaginaFuncion) {
            PaginaFuncion that = (PaginaFuncion) object;
            return idPaginaFuncion == null ? that.idPaginaFuncion == null ? 0 : -1
                    : idPaginaFuncion.compareTo(that.idPaginaFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPaginaFuncion == null ? 0 : idPaginaFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PaginaFuncion) {
            PaginaFuncion that = (PaginaFuncion) object;
            return ((idPaginaFuncion == null && that.idPaginaFuncion == null) ||
                    (idPaginaFuncion != null && idPaginaFuncion.equals(that.idPaginaFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPaginaFuncion;
    }
}
