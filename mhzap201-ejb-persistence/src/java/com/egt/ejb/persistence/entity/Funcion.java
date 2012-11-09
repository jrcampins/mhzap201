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

import com.egt.base.persistence.entity.FuncionBase;
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
@Table(name = "funcion")
public class Funcion implements FuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_funcion")
    private Long idFuncion;

    @Basic(optional = false)
    @Column(name = "version_funcion")
    private long versionFuncion;

    @Basic(optional = false)
    @Column(name = "codigo_funcion")
    private String codigoFuncion;

    @Column(name = "nombre_funcion")
    private String nombreFuncion;

    @Column(name = "descripcion_funcion")
    private String descripcionFuncion;

    @Column(name = "clausula_where")
    private String clausulaWhere;

    @Column(name = "clausula_order")
    private String clausulaOrder;

    @Basic(optional = false)
    @Column(name = "es_publica")
    private int esPublica;

    @Basic(optional = false)
    @Column(name = "es_programatica")
    private int esProgramatica;

    @Basic(optional = false)
    @Column(name = "es_personalizada")
    private int esPersonalizada;

    @Basic(optional = false)
    @Column(name = "es_segmentada")
    private int esSegmentada;

    @JoinColumn(name = "numero_tipo_funcion", referencedColumnName = "numero_tipo_funcion")
    @ManyToOne
    private TipoFuncion tipoFuncionNumeroTipoFuncion;

    @JoinColumn(name = "numero_tipo_rastro_fun", referencedColumnName = "numero_tipo_rastro_fun")
    @ManyToOne
    private TipoRastroFun tipoRastroFunNumeroTipoRastroFun;

    @JoinColumn(name = "id_dominio", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominio;

    @JoinColumn(name = "id_grupo_proceso", referencedColumnName = "id_grupo_proceso")
    @ManyToOne
    private GrupoProceso grupoProcesoIdGrupoProceso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncionSeleccion")
    private Collection<ClaseRecurso> claseRecursoIdFuncionSeleccionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncionReferencia")
    private Collection<ClaseRecursoPar> claseRecursoParIdFuncionReferenciaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncionSeleccion")
    private Collection<Dominio> dominioIdFuncionSeleccionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<FiltroClaRecFun> filtroClaRecFunIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<FiltroFuncion> filtroFuncionIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<FuncionParametro> funcionParametroIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncionReferencia")
    private Collection<FuncionParametro> funcionParametroIdFuncionReferenciaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<PaginaFuncion> paginaFuncionIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<RastroFuncion> rastroFuncionIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<RastroInforme> rastroInformeIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<RastroProceso> rastroProcesoIdFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionIdFuncion")
    private Collection<RolFuncion> rolFuncionIdFuncionCollection;

    public Funcion() {
    }

    @Override
    public Long getIdFuncion() {
        return this.idFuncion;
    }

    public void setIdFuncion(Long idFuncion) {
        this.idFuncion = idFuncion;
    }

    @Override
    public long getVersionFuncion() {
        return this.versionFuncion;
    }

    public void setVersionFuncion(long versionFuncion) {
        this.versionFuncion = versionFuncion;
    }

    @Override
    public String getCodigoFuncion() {
        return this.codigoFuncion;
    }

    public void setCodigoFuncion(String codigoFuncion) {
        this.codigoFuncion = codigoFuncion;
    }

    @Override
    public String getNombreFuncion() {
        return this.nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    @Override
    public String getDescripcionFuncion() {
        return this.descripcionFuncion;
    }

    public void setDescripcionFuncion(String descripcionFuncion) {
        this.descripcionFuncion = descripcionFuncion;
    }

    @Override
    public String getClausulaWhere() {
        return this.clausulaWhere;
    }

    public void setClausulaWhere(String clausulaWhere) {
        this.clausulaWhere = clausulaWhere;
    }

    @Override
    public String getClausulaOrder() {
        return this.clausulaOrder;
    }

    public void setClausulaOrder(String clausulaOrder) {
        this.clausulaOrder = clausulaOrder;
    }

    @Override
    public int getEsPublica() {
        return this.esPublica;
    }

    public void setEsPublica(int esPublica) {
        this.esPublica = esPublica;
    }

    @Override
    public int getEsProgramatica() {
        return this.esProgramatica;
    }

    public void setEsProgramatica(int esProgramatica) {
        this.esProgramatica = esProgramatica;
    }

    @Override
    public int getEsPersonalizada() {
        return this.esPersonalizada;
    }

    public void setEsPersonalizada(int esPersonalizada) {
        this.esPersonalizada = esPersonalizada;
    }

    @Override
    public int getEsSegmentada() {
        return this.esSegmentada;
    }

    public void setEsSegmentada(int esSegmentada) {
        this.esSegmentada = esSegmentada;
    }

    @Override
    public TipoFuncion getTipoFuncionNumeroTipoFuncion() {
        return this.tipoFuncionNumeroTipoFuncion;
    }

    public void setTipoFuncionNumeroTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncionNumeroTipoFuncion = tipoFuncion;
    }

    @Override
    public TipoRastroFun getTipoRastroFunNumeroTipoRastroFun() {
        return this.tipoRastroFunNumeroTipoRastroFun;
    }

    public void setTipoRastroFunNumeroTipoRastroFun(TipoRastroFun tipoRastroFun) {
        this.tipoRastroFunNumeroTipoRastroFun = tipoRastroFun;
    }

    @Override
    public Dominio getDominioIdDominio() {
        return this.dominioIdDominio;
    }

    public void setDominioIdDominio(Dominio dominio) {
        this.dominioIdDominio = dominio;
    }

    @Override
    public GrupoProceso getGrupoProcesoIdGrupoProceso() {
        return this.grupoProcesoIdGrupoProceso;
    }

    public void setGrupoProcesoIdGrupoProceso(GrupoProceso grupoProceso) {
        this.grupoProcesoIdGrupoProceso = grupoProceso;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdFuncionSeleccionCollection() {
        return this.claseRecursoIdFuncionSeleccionCollection;
    }

    public void setClaseRecursoIdFuncionSeleccionCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdFuncionSeleccionCollection = collection;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParIdFuncionReferenciaCollection() {
        return this.claseRecursoParIdFuncionReferenciaCollection;
    }

    public void setClaseRecursoParIdFuncionReferenciaCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParIdFuncionReferenciaCollection = collection;
    }

    @Override
    public Collection<Dominio> getDominioIdFuncionSeleccionCollection() {
        return this.dominioIdFuncionSeleccionCollection;
    }

    public void setDominioIdFuncionSeleccionCollection(Collection<Dominio> collection) {
        this.dominioIdFuncionSeleccionCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecFun> getFiltroClaRecFunIdFuncionCollection() {
        return this.filtroClaRecFunIdFuncionCollection;
    }

    public void setFiltroClaRecFunIdFuncionCollection(Collection<FiltroClaRecFun> collection) {
        this.filtroClaRecFunIdFuncionCollection = collection;
    }

    @Override
    public Collection<FiltroFuncion> getFiltroFuncionIdFuncionCollection() {
        return this.filtroFuncionIdFuncionCollection;
    }

    public void setFiltroFuncionIdFuncionCollection(Collection<FiltroFuncion> collection) {
        this.filtroFuncionIdFuncionCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroIdFuncionCollection() {
        return this.funcionParametroIdFuncionCollection;
    }

    public void setFuncionParametroIdFuncionCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroIdFuncionCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroIdFuncionReferenciaCollection() {
        return this.funcionParametroIdFuncionReferenciaCollection;
    }

    public void setFuncionParametroIdFuncionReferenciaCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroIdFuncionReferenciaCollection = collection;
    }

    @Override
    public Collection<PaginaFuncion> getPaginaFuncionIdFuncionCollection() {
        return this.paginaFuncionIdFuncionCollection;
    }

    public void setPaginaFuncionIdFuncionCollection(Collection<PaginaFuncion> collection) {
        this.paginaFuncionIdFuncionCollection = collection;
    }

    @Override
    public Collection<RastroFuncion> getRastroFuncionIdFuncionCollection() {
        return this.rastroFuncionIdFuncionCollection;
    }

    public void setRastroFuncionIdFuncionCollection(Collection<RastroFuncion> collection) {
        this.rastroFuncionIdFuncionCollection = collection;
    }

    @Override
    public Collection<RastroInforme> getRastroInformeIdFuncionCollection() {
        return this.rastroInformeIdFuncionCollection;
    }

    public void setRastroInformeIdFuncionCollection(Collection<RastroInforme> collection) {
        this.rastroInformeIdFuncionCollection = collection;
    }

    @Override
    public Collection<RastroProceso> getRastroProcesoIdFuncionCollection() {
        return this.rastroProcesoIdFuncionCollection;
    }

    public void setRastroProcesoIdFuncionCollection(Collection<RastroProceso> collection) {
        this.rastroProcesoIdFuncionCollection = collection;
    }

    @Override
    public Collection<RolFuncion> getRolFuncionIdFuncionCollection() {
        return this.rolFuncionIdFuncionCollection;
    }

    public void setRolFuncionIdFuncionCollection(Collection<RolFuncion> collection) {
        this.rolFuncionIdFuncionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Funcion) {
            Funcion that = (Funcion) object;
            return idFuncion == null ? that.idFuncion == null ? 0 : -1
                    : idFuncion.compareTo(that.idFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFuncion == null ? 0 : idFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Funcion) {
            Funcion that = (Funcion) object;
            return ((idFuncion == null && that.idFuncion == null) ||
                    (idFuncion != null && idFuncion.equals(that.idFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFuncion;
    }
}
