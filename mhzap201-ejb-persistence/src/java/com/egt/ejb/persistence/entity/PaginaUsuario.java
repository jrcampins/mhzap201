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

import com.egt.base.persistence.entity.PaginaUsuarioBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pagina_usuario")
public class PaginaUsuario implements PaginaUsuarioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_pagina_usuario")
    private Long idPaginaUsuario;

    @Basic(optional = false)
    @Column(name = "version_pagina_usuario")
    private long versionPaginaUsuario;

    @JoinColumn(name = "id_pagina", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPagina;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuario;

    public PaginaUsuario() {
    }

    @Override
    public Long getIdPaginaUsuario() {
        return this.idPaginaUsuario;
    }

    public void setIdPaginaUsuario(Long idPaginaUsuario) {
        this.idPaginaUsuario = idPaginaUsuario;
    }

    @Override
    public long getVersionPaginaUsuario() {
        return this.versionPaginaUsuario;
    }

    public void setVersionPaginaUsuario(long versionPaginaUsuario) {
        this.versionPaginaUsuario = versionPaginaUsuario;
    }

    @Override
    public Pagina getPaginaIdPagina() {
        return this.paginaIdPagina;
    }

    public void setPaginaIdPagina(Pagina pagina) {
        this.paginaIdPagina = pagina;
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
        if (object instanceof PaginaUsuario) {
            PaginaUsuario that = (PaginaUsuario) object;
            return idPaginaUsuario == null ? that.idPaginaUsuario == null ? 0 : -1
                    : idPaginaUsuario.compareTo(that.idPaginaUsuario);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPaginaUsuario == null ? 0 : idPaginaUsuario.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PaginaUsuario) {
            PaginaUsuario that = (PaginaUsuario) object;
            return ((idPaginaUsuario == null && that.idPaginaUsuario == null) ||
                    (idPaginaUsuario != null && idPaginaUsuario.equals(that.idPaginaUsuario)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPaginaUsuario;
    }
}
