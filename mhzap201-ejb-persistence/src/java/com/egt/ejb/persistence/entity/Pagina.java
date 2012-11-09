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

import com.egt.base.persistence.entity.PaginaBase;
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
@Table(name = "pagina")
public class Pagina implements PaginaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_pagina")
    private Long idPagina;

    @Basic(optional = false)
    @Column(name = "version_pagina")
    private long versionPagina;

    @Basic(optional = false)
    @Column(name = "codigo_pagina")
    private String codigoPagina;

    @Column(name = "nombre_pagina")
    private String nombrePagina;

    @Column(name = "descripcion_pagina")
    private String descripcionPagina;

    @Column(name = "url_pagina")
    private String urlPagina;

    @Basic(optional = false)
    @Column(name = "es_publica")
    private int esPublica;

    @JoinColumn(name = "id_aplicacion", referencedColumnName = "id_aplicacion")
    @ManyToOne
    private Aplicacion aplicacionIdAplicacion;

    @JoinColumn(name = "numero_tipo_pagina", referencedColumnName = "numero_tipo_pagina")
    @ManyToOne
    private TipoPagina tipoPaginaNumeroTipoPagina;

    @JoinColumn(name = "id_dominio", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominio;

    @JoinColumn(name = "id_dominio_maestro", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominioMaestro;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne
    private Parametro parametroIdParametro;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPaginaSeleccion")
    private Collection<ClaseRecurso> claseRecursoIdPaginaSeleccionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPaginaDetalle")
    private Collection<ClaseRecurso> claseRecursoIdPaginaDetalleCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPagina")
    private Collection<OpcionMenu> opcionMenuIdPaginaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPagina")
    private Collection<PaginaFuncion> paginaFuncionIdPaginaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPagina")
    private Collection<PaginaUsuario> paginaUsuarioIdPaginaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "paginaIdPagina")
    private Collection<RolPagina> rolPaginaIdPaginaCollection;

    public Pagina() {
    }

    @Override
    public Long getIdPagina() {
        return this.idPagina;
    }

    public void setIdPagina(Long idPagina) {
        this.idPagina = idPagina;
    }

    @Override
    public long getVersionPagina() {
        return this.versionPagina;
    }

    public void setVersionPagina(long versionPagina) {
        this.versionPagina = versionPagina;
    }

    @Override
    public String getCodigoPagina() {
        return this.codigoPagina;
    }

    public void setCodigoPagina(String codigoPagina) {
        this.codigoPagina = codigoPagina;
    }

    @Override
    public String getNombrePagina() {
        return this.nombrePagina;
    }

    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    @Override
    public String getDescripcionPagina() {
        return this.descripcionPagina;
    }

    public void setDescripcionPagina(String descripcionPagina) {
        this.descripcionPagina = descripcionPagina;
    }

    @Override
    public String getUrlPagina() {
        return this.urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    @Override
    public int getEsPublica() {
        return this.esPublica;
    }

    public void setEsPublica(int esPublica) {
        this.esPublica = esPublica;
    }

    @Override
    public Aplicacion getAplicacionIdAplicacion() {
        return this.aplicacionIdAplicacion;
    }

    public void setAplicacionIdAplicacion(Aplicacion aplicacion) {
        this.aplicacionIdAplicacion = aplicacion;
    }

    @Override
    public TipoPagina getTipoPaginaNumeroTipoPagina() {
        return this.tipoPaginaNumeroTipoPagina;
    }

    public void setTipoPaginaNumeroTipoPagina(TipoPagina tipoPagina) {
        this.tipoPaginaNumeroTipoPagina = tipoPagina;
    }

    @Override
    public Dominio getDominioIdDominio() {
        return this.dominioIdDominio;
    }

    public void setDominioIdDominio(Dominio dominio) {
        this.dominioIdDominio = dominio;
    }

    @Override
    public Dominio getDominioIdDominioMaestro() {
        return this.dominioIdDominioMaestro;
    }

    public void setDominioIdDominioMaestro(Dominio dominio) {
        this.dominioIdDominioMaestro = dominio;
    }

    @Override
    public Parametro getParametroIdParametro() {
        return this.parametroIdParametro;
    }

    public void setParametroIdParametro(Parametro parametro) {
        this.parametroIdParametro = parametro;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdPaginaSeleccionCollection() {
        return this.claseRecursoIdPaginaSeleccionCollection;
    }

    public void setClaseRecursoIdPaginaSeleccionCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdPaginaSeleccionCollection = collection;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdPaginaDetalleCollection() {
        return this.claseRecursoIdPaginaDetalleCollection;
    }

    public void setClaseRecursoIdPaginaDetalleCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdPaginaDetalleCollection = collection;
    }

    @Override
    public Collection<OpcionMenu> getOpcionMenuIdPaginaCollection() {
        return this.opcionMenuIdPaginaCollection;
    }

    public void setOpcionMenuIdPaginaCollection(Collection<OpcionMenu> collection) {
        this.opcionMenuIdPaginaCollection = collection;
    }

    @Override
    public Collection<PaginaFuncion> getPaginaFuncionIdPaginaCollection() {
        return this.paginaFuncionIdPaginaCollection;
    }

    public void setPaginaFuncionIdPaginaCollection(Collection<PaginaFuncion> collection) {
        this.paginaFuncionIdPaginaCollection = collection;
    }

    @Override
    public Collection<PaginaUsuario> getPaginaUsuarioIdPaginaCollection() {
        return this.paginaUsuarioIdPaginaCollection;
    }

    public void setPaginaUsuarioIdPaginaCollection(Collection<PaginaUsuario> collection) {
        this.paginaUsuarioIdPaginaCollection = collection;
    }

    @Override
    public Collection<RolPagina> getRolPaginaIdPaginaCollection() {
        return this.rolPaginaIdPaginaCollection;
    }

    public void setRolPaginaIdPaginaCollection(Collection<RolPagina> collection) {
        this.rolPaginaIdPaginaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Pagina) {
            Pagina that = (Pagina) object;
            return idPagina == null ? that.idPagina == null ? 0 : -1
                    : idPagina.compareTo(that.idPagina);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPagina == null ? 0 : idPagina.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Pagina) {
            Pagina that = (Pagina) object;
            return ((idPagina == null && that.idPagina == null) ||
                    (idPagina != null && idPagina.equals(that.idPagina)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPagina;
    }
}
