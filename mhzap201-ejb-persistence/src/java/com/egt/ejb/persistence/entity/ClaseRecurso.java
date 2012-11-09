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

import com.egt.base.persistence.entity.ClaseRecursoBase;
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
@Table(name = "clase_recurso")
public class ClaseRecurso implements ClaseRecursoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_clase_recurso")
    private Long idClaseRecurso;

    @Basic(optional = false)
    @Column(name = "version_clase_recurso")
    private long versionClaseRecurso;

    @Basic(optional = false)
    @Column(name = "codigo_clase_recurso")
    private String codigoClaseRecurso;

    @Column(name = "nombre_clase_recurso")
    private String nombreClaseRecurso;

    @Column(name = "descripcion_clase_recurso")
    private String descripcionClaseRecurso;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_independiente")
    private int esClaseRecursoIndependiente;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_sin_detalle")
    private int esClaseRecursoSinDetalle;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_con_arbol")
    private int esClaseRecursoConArbol;

    @Column(name = "id_aplicacion_web")
    private Long idAplicacionWeb;

    @Column(name = "limite_filas_consulta")
    private Integer limiteFilasConsulta;

    @Column(name = "limite_filas_informe")
    private Integer limiteFilasInforme;

    @Column(name = "orden_presentacion")
    private Integer ordenPresentacion;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_insertable")
    private int esClaseRecursoInsertable;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_modificable")
    private int esClaseRecursoModificable;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_eliminable")
    private int esClaseRecursoEliminable;

    @Basic(optional = false)
    @Column(name = "es_clase_recurso_extendida")
    private int esClaseRecursoExtendida;

    @Column(name = "etiqueta_hipervinculo")
    private String etiquetaHipervinculo;

    @Basic(optional = false)
    @Column(name = "es_enumerador_con_numero")
    private int esEnumeradorConNumero;

    @Column(name = "alias_clase_recurso")
    private String aliasClaseRecurso;

    @JoinColumn(name = "numero_tipo_clase_recurso", referencedColumnName = "numero_tipo_clase_recurso")
    @ManyToOne
    private TipoClaseRecurso tipoClaseRecursoNumeroTipoClaseRecurso;

    @JoinColumn(name = "numero_tipo_recurso", referencedColumnName = "numero_tipo_recurso")
    @ManyToOne
    private TipoRecurso tipoRecursoNumeroTipoRecurso;

    @JoinColumn(name = "id_funcion_seleccion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncionSeleccion;

    @JoinColumn(name = "id_pagina_seleccion", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPaginaSeleccion;

    @JoinColumn(name = "id_pagina_detalle", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPaginaDetalle;

    @JoinColumn(name = "id_clase_recurso_maestro", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecursoMaestro;

    @JoinColumn(name = "id_clase_recurso_segmento", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecursoSegmento;

    @JoinColumn(name = "id_clase_recurso_base", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecursoBase;

    @JoinColumn(name = "id_grupo_aplicacion", referencedColumnName = "id_grupo_aplicacion")
    @ManyToOne
    private GrupoAplicacion grupoAplicacionIdGrupoAplicacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecursoMaestro")
    private Collection<ClaseRecurso> claseRecursoIdClaseRecursoMaestroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecursoSegmento")
    private Collection<ClaseRecurso> claseRecursoIdClaseRecursoSegmentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecursoBase")
    private Collection<ClaseRecurso> claseRecursoIdClaseRecursoBaseCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecurso")
    private Collection<ClaseRecursoPar> claseRecursoParIdClaseRecursoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecursoValor")
    private Collection<ClaseRecursoPar> claseRecursoParIdClaseRecursoValorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecurso")
    private Collection<ClaseRecursoSec> claseRecursoSecIdClaseRecursoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecurso")
    private Collection<ConjuntoSegmento> conjuntoSegmentoIdClaseRecursoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecurso")
    private Collection<Dominio> dominioIdClaseRecursoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoIdClaseRecursoValor")
    private Collection<FuncionParametro> funcionParametroIdClaseRecursoValorCollection;

    public ClaseRecurso() {
    }

    @Override
    public Long getIdClaseRecurso() {
        return this.idClaseRecurso;
    }

    public void setIdClaseRecurso(Long idClaseRecurso) {
        this.idClaseRecurso = idClaseRecurso;
    }

    @Override
    public long getVersionClaseRecurso() {
        return this.versionClaseRecurso;
    }

    public void setVersionClaseRecurso(long versionClaseRecurso) {
        this.versionClaseRecurso = versionClaseRecurso;
    }

    @Override
    public String getCodigoClaseRecurso() {
        return this.codigoClaseRecurso;
    }

    public void setCodigoClaseRecurso(String codigoClaseRecurso) {
        this.codigoClaseRecurso = codigoClaseRecurso;
    }

    @Override
    public String getNombreClaseRecurso() {
        return this.nombreClaseRecurso;
    }

    public void setNombreClaseRecurso(String nombreClaseRecurso) {
        this.nombreClaseRecurso = nombreClaseRecurso;
    }

    @Override
    public String getDescripcionClaseRecurso() {
        return this.descripcionClaseRecurso;
    }

    public void setDescripcionClaseRecurso(String descripcionClaseRecurso) {
        this.descripcionClaseRecurso = descripcionClaseRecurso;
    }

    @Override
    public int getEsClaseRecursoIndependiente() {
        return this.esClaseRecursoIndependiente;
    }

    public void setEsClaseRecursoIndependiente(int esClaseRecursoIndependiente) {
        this.esClaseRecursoIndependiente = esClaseRecursoIndependiente;
    }

    @Override
    public int getEsClaseRecursoSinDetalle() {
        return this.esClaseRecursoSinDetalle;
    }

    public void setEsClaseRecursoSinDetalle(int esClaseRecursoSinDetalle) {
        this.esClaseRecursoSinDetalle = esClaseRecursoSinDetalle;
    }

    @Override
    public int getEsClaseRecursoConArbol() {
        return this.esClaseRecursoConArbol;
    }

    public void setEsClaseRecursoConArbol(int esClaseRecursoConArbol) {
        this.esClaseRecursoConArbol = esClaseRecursoConArbol;
    }

    @Override
    public Long getIdAplicacionWeb() {
        return this.idAplicacionWeb;
    }

    public void setIdAplicacionWeb(Long idAplicacionWeb) {
        this.idAplicacionWeb = idAplicacionWeb;
    }

    @Override
    public Integer getLimiteFilasConsulta() {
        return this.limiteFilasConsulta;
    }

    public void setLimiteFilasConsulta(Integer limiteFilasConsulta) {
        this.limiteFilasConsulta = limiteFilasConsulta;
    }

    @Override
    public Integer getLimiteFilasInforme() {
        return this.limiteFilasInforme;
    }

    public void setLimiteFilasInforme(Integer limiteFilasInforme) {
        this.limiteFilasInforme = limiteFilasInforme;
    }

    @Override
    public Integer getOrdenPresentacion() {
        return this.ordenPresentacion;
    }

    public void setOrdenPresentacion(Integer ordenPresentacion) {
        this.ordenPresentacion = ordenPresentacion;
    }

    @Override
    public int getEsClaseRecursoInsertable() {
        return this.esClaseRecursoInsertable;
    }

    public void setEsClaseRecursoInsertable(int esClaseRecursoInsertable) {
        this.esClaseRecursoInsertable = esClaseRecursoInsertable;
    }

    @Override
    public int getEsClaseRecursoModificable() {
        return this.esClaseRecursoModificable;
    }

    public void setEsClaseRecursoModificable(int esClaseRecursoModificable) {
        this.esClaseRecursoModificable = esClaseRecursoModificable;
    }

    @Override
    public int getEsClaseRecursoEliminable() {
        return this.esClaseRecursoEliminable;
    }

    public void setEsClaseRecursoEliminable(int esClaseRecursoEliminable) {
        this.esClaseRecursoEliminable = esClaseRecursoEliminable;
    }

    @Override
    public int getEsClaseRecursoExtendida() {
        return this.esClaseRecursoExtendida;
    }

    public void setEsClaseRecursoExtendida(int esClaseRecursoExtendida) {
        this.esClaseRecursoExtendida = esClaseRecursoExtendida;
    }

    @Override
    public String getEtiquetaHipervinculo() {
        return this.etiquetaHipervinculo;
    }

    public void setEtiquetaHipervinculo(String etiquetaHipervinculo) {
        this.etiquetaHipervinculo = etiquetaHipervinculo;
    }

    @Override
    public int getEsEnumeradorConNumero() {
        return this.esEnumeradorConNumero;
    }

    public void setEsEnumeradorConNumero(int esEnumeradorConNumero) {
        this.esEnumeradorConNumero = esEnumeradorConNumero;
    }

    @Override
    public String getAliasClaseRecurso() {
        return this.aliasClaseRecurso;
    }

    public void setAliasClaseRecurso(String aliasClaseRecurso) {
        this.aliasClaseRecurso = aliasClaseRecurso;
    }

    @Override
    public TipoClaseRecurso getTipoClaseRecursoNumeroTipoClaseRecurso() {
        return this.tipoClaseRecursoNumeroTipoClaseRecurso;
    }

    public void setTipoClaseRecursoNumeroTipoClaseRecurso(TipoClaseRecurso tipoClaseRecurso) {
        this.tipoClaseRecursoNumeroTipoClaseRecurso = tipoClaseRecurso;
    }

    @Override
    public TipoRecurso getTipoRecursoNumeroTipoRecurso() {
        return this.tipoRecursoNumeroTipoRecurso;
    }

    public void setTipoRecursoNumeroTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecursoNumeroTipoRecurso = tipoRecurso;
    }

    @Override
    public Funcion getFuncionIdFuncionSeleccion() {
        return this.funcionIdFuncionSeleccion;
    }

    public void setFuncionIdFuncionSeleccion(Funcion funcion) {
        this.funcionIdFuncionSeleccion = funcion;
    }

    @Override
    public Pagina getPaginaIdPaginaSeleccion() {
        return this.paginaIdPaginaSeleccion;
    }

    public void setPaginaIdPaginaSeleccion(Pagina pagina) {
        this.paginaIdPaginaSeleccion = pagina;
    }

    @Override
    public Pagina getPaginaIdPaginaDetalle() {
        return this.paginaIdPaginaDetalle;
    }

    public void setPaginaIdPaginaDetalle(Pagina pagina) {
        this.paginaIdPaginaDetalle = pagina;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecursoMaestro() {
        return this.claseRecursoIdClaseRecursoMaestro;
    }

    public void setClaseRecursoIdClaseRecursoMaestro(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecursoMaestro = claseRecurso;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecursoSegmento() {
        return this.claseRecursoIdClaseRecursoSegmento;
    }

    public void setClaseRecursoIdClaseRecursoSegmento(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecursoSegmento = claseRecurso;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecursoBase() {
        return this.claseRecursoIdClaseRecursoBase;
    }

    public void setClaseRecursoIdClaseRecursoBase(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecursoBase = claseRecurso;
    }

    @Override
    public GrupoAplicacion getGrupoAplicacionIdGrupoAplicacion() {
        return this.grupoAplicacionIdGrupoAplicacion;
    }

    public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacion grupoAplicacion) {
        this.grupoAplicacionIdGrupoAplicacion = grupoAplicacion;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdClaseRecursoMaestroCollection() {
        return this.claseRecursoIdClaseRecursoMaestroCollection;
    }

    public void setClaseRecursoIdClaseRecursoMaestroCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdClaseRecursoMaestroCollection = collection;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdClaseRecursoSegmentoCollection() {
        return this.claseRecursoIdClaseRecursoSegmentoCollection;
    }

    public void setClaseRecursoIdClaseRecursoSegmentoCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdClaseRecursoSegmentoCollection = collection;
    }

    @Override
    public Collection<ClaseRecurso> getClaseRecursoIdClaseRecursoBaseCollection() {
        return this.claseRecursoIdClaseRecursoBaseCollection;
    }

    public void setClaseRecursoIdClaseRecursoBaseCollection(Collection<ClaseRecurso> collection) {
        this.claseRecursoIdClaseRecursoBaseCollection = collection;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParIdClaseRecursoCollection() {
        return this.claseRecursoParIdClaseRecursoCollection;
    }

    public void setClaseRecursoParIdClaseRecursoCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParIdClaseRecursoCollection = collection;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParIdClaseRecursoValorCollection() {
        return this.claseRecursoParIdClaseRecursoValorCollection;
    }

    public void setClaseRecursoParIdClaseRecursoValorCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParIdClaseRecursoValorCollection = collection;
    }

    @Override
    public Collection<ClaseRecursoSec> getClaseRecursoSecIdClaseRecursoCollection() {
        return this.claseRecursoSecIdClaseRecursoCollection;
    }

    public void setClaseRecursoSecIdClaseRecursoCollection(Collection<ClaseRecursoSec> collection) {
        this.claseRecursoSecIdClaseRecursoCollection = collection;
    }

    @Override
    public Collection<ConjuntoSegmento> getConjuntoSegmentoIdClaseRecursoCollection() {
        return this.conjuntoSegmentoIdClaseRecursoCollection;
    }

    public void setConjuntoSegmentoIdClaseRecursoCollection(Collection<ConjuntoSegmento> collection) {
        this.conjuntoSegmentoIdClaseRecursoCollection = collection;
    }

    @Override
    public Collection<Dominio> getDominioIdClaseRecursoCollection() {
        return this.dominioIdClaseRecursoCollection;
    }

    public void setDominioIdClaseRecursoCollection(Collection<Dominio> collection) {
        this.dominioIdClaseRecursoCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroIdClaseRecursoValorCollection() {
        return this.funcionParametroIdClaseRecursoValorCollection;
    }

    public void setFuncionParametroIdClaseRecursoValorCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroIdClaseRecursoValorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecurso) {
            ClaseRecurso that = (ClaseRecurso) object;
            return idClaseRecurso == null ? that.idClaseRecurso == null ? 0 : -1
                    : idClaseRecurso.compareTo(that.idClaseRecurso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idClaseRecurso == null ? 0 : idClaseRecurso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecurso) {
            ClaseRecurso that = (ClaseRecurso) object;
            return ((idClaseRecurso == null && that.idClaseRecurso == null) ||
                    (idClaseRecurso != null && idClaseRecurso.equals(that.idClaseRecurso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idClaseRecurso;
    }
}
