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

import com.egt.base.persistence.entity.DominioBase;
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
@Table(name = "dominio")
public class Dominio implements DominioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_dominio")
    private Long idDominio;

    @Basic(optional = false)
    @Column(name = "version_dominio")
    private long versionDominio;

    @Basic(optional = false)
    @Column(name = "codigo_dominio")
    private String codigoDominio;

    @Column(name = "nombre_dominio")
    private String nombreDominio;

    @Column(name = "descripcion_dominio")
    private String descripcionDominio;

    @Column(name = "nombre_tabla")
    private String nombreTabla;

    @JoinColumn(name = "numero_tipo_dominio", referencedColumnName = "numero_tipo_dominio")
    @ManyToOne
    private TipoDominio tipoDominioNumeroTipoDominio;

    @JoinColumn(name = "id_clase_recurso", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecurso;

    @JoinColumn(name = "id_funcion_seleccion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncionSeleccion;

    @JoinColumn(name = "id_dominio_segmento", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominioSegmento;

    @JoinColumn(name = "id_paquete", referencedColumnName = "id_paquete")
    @ManyToOne
    private Paquete paqueteIdPaquete;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominioSegmento")
    private Collection<Dominio> dominioIdDominioSegmentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominio")
    private Collection<DominioPaquete> dominioPaqueteIdDominioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominio")
    private Collection<DominioParametro> dominioParametroIdDominioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominio")
    private Collection<Funcion> funcionIdDominioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominio")
    private Collection<Pagina> paginaIdDominioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "dominioIdDominioMaestro")
    private Collection<Pagina> paginaIdDominioMaestroCollection;

    public Dominio() {
    }

    @Override
    public Long getIdDominio() {
        return this.idDominio;
    }

    public void setIdDominio(Long idDominio) {
        this.idDominio = idDominio;
    }

    @Override
    public long getVersionDominio() {
        return this.versionDominio;
    }

    public void setVersionDominio(long versionDominio) {
        this.versionDominio = versionDominio;
    }

    @Override
    public String getCodigoDominio() {
        return this.codigoDominio;
    }

    public void setCodigoDominio(String codigoDominio) {
        this.codigoDominio = codigoDominio;
    }

    @Override
    public String getNombreDominio() {
        return this.nombreDominio;
    }

    public void setNombreDominio(String nombreDominio) {
        this.nombreDominio = nombreDominio;
    }

    @Override
    public String getDescripcionDominio() {
        return this.descripcionDominio;
    }

    public void setDescripcionDominio(String descripcionDominio) {
        this.descripcionDominio = descripcionDominio;
    }

    @Override
    public String getNombreTabla() {
        return this.nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    @Override
    public TipoDominio getTipoDominioNumeroTipoDominio() {
        return this.tipoDominioNumeroTipoDominio;
    }

    public void setTipoDominioNumeroTipoDominio(TipoDominio tipoDominio) {
        this.tipoDominioNumeroTipoDominio = tipoDominio;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecurso() {
        return this.claseRecursoIdClaseRecurso;
    }

    public void setClaseRecursoIdClaseRecurso(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecurso = claseRecurso;
    }

    @Override
    public Funcion getFuncionIdFuncionSeleccion() {
        return this.funcionIdFuncionSeleccion;
    }

    public void setFuncionIdFuncionSeleccion(Funcion funcion) {
        this.funcionIdFuncionSeleccion = funcion;
    }

    @Override
    public Dominio getDominioIdDominioSegmento() {
        return this.dominioIdDominioSegmento;
    }

    public void setDominioIdDominioSegmento(Dominio dominio) {
        this.dominioIdDominioSegmento = dominio;
    }

    @Override
    public Paquete getPaqueteIdPaquete() {
        return this.paqueteIdPaquete;
    }

    public void setPaqueteIdPaquete(Paquete paquete) {
        this.paqueteIdPaquete = paquete;
    }

    @Override
    public Collection<Dominio> getDominioIdDominioSegmentoCollection() {
        return this.dominioIdDominioSegmentoCollection;
    }

    public void setDominioIdDominioSegmentoCollection(Collection<Dominio> collection) {
        this.dominioIdDominioSegmentoCollection = collection;
    }

    @Override
    public Collection<DominioPaquete> getDominioPaqueteIdDominioCollection() {
        return this.dominioPaqueteIdDominioCollection;
    }

    public void setDominioPaqueteIdDominioCollection(Collection<DominioPaquete> collection) {
        this.dominioPaqueteIdDominioCollection = collection;
    }

    @Override
    public Collection<DominioParametro> getDominioParametroIdDominioCollection() {
        return this.dominioParametroIdDominioCollection;
    }

    public void setDominioParametroIdDominioCollection(Collection<DominioParametro> collection) {
        this.dominioParametroIdDominioCollection = collection;
    }

    @Override
    public Collection<Funcion> getFuncionIdDominioCollection() {
        return this.funcionIdDominioCollection;
    }

    public void setFuncionIdDominioCollection(Collection<Funcion> collection) {
        this.funcionIdDominioCollection = collection;
    }

    @Override
    public Collection<Pagina> getPaginaIdDominioCollection() {
        return this.paginaIdDominioCollection;
    }

    public void setPaginaIdDominioCollection(Collection<Pagina> collection) {
        this.paginaIdDominioCollection = collection;
    }

    @Override
    public Collection<Pagina> getPaginaIdDominioMaestroCollection() {
        return this.paginaIdDominioMaestroCollection;
    }

    public void setPaginaIdDominioMaestroCollection(Collection<Pagina> collection) {
        this.paginaIdDominioMaestroCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Dominio) {
            Dominio that = (Dominio) object;
            return idDominio == null ? that.idDominio == null ? 0 : -1
                    : idDominio.compareTo(that.idDominio);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idDominio == null ? 0 : idDominio.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Dominio) {
            Dominio that = (Dominio) object;
            return ((idDominio == null && that.idDominio == null)
                    || (idDominio != null && idDominio.equals(that.idDominio)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idDominio;
    }

}
