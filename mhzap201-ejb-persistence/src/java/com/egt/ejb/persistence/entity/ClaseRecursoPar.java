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

import com.egt.base.persistence.entity.ClaseRecursoParBase;
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
@Table(name = "clase_recurso_par")
public class ClaseRecursoPar implements ClaseRecursoParBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_clase_recurso_par")
    private Long idClaseRecursoPar;

    @Basic(optional = false)
    @Column(name = "version_clase_recurso_par")
    private long versionClaseRecursoPar;

    @Column(name = "id_lista_valor")
    private Long idListaValor;

    @Column(name = "id_clase_objeto_valor")
    private Long idClaseObjetoValor;

    @Column(name = "valor_minimo")
    private String valorMinimo;

    @Column(name = "valor_maximo")
    private String valorMaximo;

    @Column(name = "valor_omision")
    private String valorOmision;

    @Basic(optional = false)
    @Column(name = "es_parametro_omisible")
    private int esParametroOmisible;

    @Basic(optional = false)
    @Column(name = "es_parametro_inmutable")
    private int esParametroInmutable;

    @Basic(optional = false)
    @Column(name = "es_parametro_submit")
    private int esParametroSubmit;

    @Basic(optional = false)
    @Column(name = "es_parametro_primordial")
    private int esParametroPrimordial;

    @Basic(optional = false)
    @Column(name = "es_parametro_maestro")
    private int esParametroMaestro;

    @Basic(optional = false)
    @Column(name = "es_parametro_segmento")
    private int esParametroSegmento;

    @Basic(optional = false)
    @Column(name = "es_parametro_sin_rastro")
    private int esParametroSinRastro;

    @Basic(optional = false)
    @Column(name = "es_parametro_sincronizado")
    private int esParametroSincronizado;

    @Basic(optional = false)
    @Column(name = "orden_presentacion")
    private int ordenPresentacion;

    @Basic(optional = false)
    @Column(name = "es_referencia_alternativa")
    private int esReferenciaAlternativa;

    @Column(name = "id_funcion_referencia_alt")
    private Long idFuncionReferenciaAlt;

    @Column(name = "id_lista_valor_alternativa")
    private Long idListaValorAlternativa;

    @Column(name = "id_clase_objeto_valor_alt")
    private Long idClaseObjetoValorAlt;

    @Column(name = "id_clase_recurso_valor_alt")
    private Long idClaseRecursoValorAlt;

    @Basic(optional = false)
    @Column(name = "orden_pagina_seleccion")
    private int ordenPaginaSeleccion;

    @JoinColumn(name = "id_clase_recurso", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecurso;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne
    private Parametro parametroIdParametro;

    @JoinColumn(name = "numero_tipo_parametro", referencedColumnName = "numero_tipo_parametro")
    @ManyToOne
    private TipoParametro tipoParametroNumeroTipoParametro;

    @JoinColumn(name = "numero_tipo_comparacion", referencedColumnName = "numero_tipo_comparacion")
    @ManyToOne
    private TipoComparacion tipoComparacionNumeroTipoComparacion;

    @JoinColumn(name = "id_funcion_referencia", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncionReferencia;

    @JoinColumn(name = "numero_tipo_valor", referencedColumnName = "numero_tipo_valor")
    @ManyToOne
    private TipoValor tipoValorNumeroTipoValor;

    @JoinColumn(name = "id_clase_recurso_valor", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecursoValor;

    @JoinColumn(name = "id_clase_recurso_sec", referencedColumnName = "id_clase_recurso_sec")
    @ManyToOne
    private ClaseRecursoSec claseRecursoSecIdClaseRecursoSec;

    @JoinColumn(name = "numero_tipo_valor_alternativo", referencedColumnName = "numero_tipo_valor")
    @ManyToOne
    private TipoValor tipoValorNumeroTipoValorAlternativo;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParColumna")
    private Collection<FiltroClaRecFun> filtroClaRecFunIdClaseRecursoParColumnaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParValor")
    private Collection<FiltroClaRecFun> filtroClaRecFunIdClaseRecursoParValorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoPar")
    private Collection<FiltroClaRecPar> filtroClaRecParIdClaseRecursoParCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParColumna")
    private Collection<FiltroClaRecPar> filtroClaRecParIdClaseRecursoParColumnaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParValor")
    private Collection<FiltroClaRecPar> filtroClaRecParIdClaseRecursoParValorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParColumna")
    private Collection<FiltroClaRecSec> filtroClaRecSecIdClaseRecursoParColumnaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParValor")
    private Collection<FiltroClaRecSec> filtroClaRecSecIdClaseRecursoParValorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoPar")
    private Collection<FiltroClaRecVin> filtroClaRecVinIdClaseRecursoParCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParColumna")
    private Collection<FiltroClaRecVin> filtroClaRecVinIdClaseRecursoParColumnaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "claseRecursoParIdClaseRecursoParValor")
    private Collection<FiltroClaRecVin> filtroClaRecVinIdClaseRecursoParValorCollection;

    public ClaseRecursoPar() {
    }

    @Override
    public Long getIdClaseRecursoPar() {
        return this.idClaseRecursoPar;
    }

    public void setIdClaseRecursoPar(Long idClaseRecursoPar) {
        this.idClaseRecursoPar = idClaseRecursoPar;
    }

    @Override
    public long getVersionClaseRecursoPar() {
        return this.versionClaseRecursoPar;
    }

    public void setVersionClaseRecursoPar(long versionClaseRecursoPar) {
        this.versionClaseRecursoPar = versionClaseRecursoPar;
    }

    @Override
    public Long getIdListaValor() {
        return this.idListaValor;
    }

    public void setIdListaValor(Long idListaValor) {
        this.idListaValor = idListaValor;
    }

    @Override
    public Long getIdClaseObjetoValor() {
        return this.idClaseObjetoValor;
    }

    public void setIdClaseObjetoValor(Long idClaseObjetoValor) {
        this.idClaseObjetoValor = idClaseObjetoValor;
    }

    @Override
    public String getValorMinimo() {
        return this.valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    @Override
    public String getValorMaximo() {
        return this.valorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    @Override
    public String getValorOmision() {
        return this.valorOmision;
    }

    public void setValorOmision(String valorOmision) {
        this.valorOmision = valorOmision;
    }

    @Override
    public int getEsParametroOmisible() {
        return this.esParametroOmisible;
    }

    public void setEsParametroOmisible(int esParametroOmisible) {
        this.esParametroOmisible = esParametroOmisible;
    }

    @Override
    public int getEsParametroInmutable() {
        return this.esParametroInmutable;
    }

    public void setEsParametroInmutable(int esParametroInmutable) {
        this.esParametroInmutable = esParametroInmutable;
    }

    @Override
    public int getEsParametroSubmit() {
        return this.esParametroSubmit;
    }

    public void setEsParametroSubmit(int esParametroSubmit) {
        this.esParametroSubmit = esParametroSubmit;
    }

    @Override
    public int getEsParametroPrimordial() {
        return this.esParametroPrimordial;
    }

    public void setEsParametroPrimordial(int esParametroPrimordial) {
        this.esParametroPrimordial = esParametroPrimordial;
    }

    @Override
    public int getEsParametroMaestro() {
        return this.esParametroMaestro;
    }

    public void setEsParametroMaestro(int esParametroMaestro) {
        this.esParametroMaestro = esParametroMaestro;
    }

    @Override
    public int getEsParametroSegmento() {
        return this.esParametroSegmento;
    }

    public void setEsParametroSegmento(int esParametroSegmento) {
        this.esParametroSegmento = esParametroSegmento;
    }

    @Override
    public int getEsParametroSinRastro() {
        return this.esParametroSinRastro;
    }

    public void setEsParametroSinRastro(int esParametroSinRastro) {
        this.esParametroSinRastro = esParametroSinRastro;
    }

    @Override
    public int getEsParametroSincronizado() {
        return this.esParametroSincronizado;
    }

    public void setEsParametroSincronizado(int esParametroSincronizado) {
        this.esParametroSincronizado = esParametroSincronizado;
    }

    @Override
    public int getOrdenPresentacion() {
        return this.ordenPresentacion;
    }

    public void setOrdenPresentacion(int ordenPresentacion) {
        this.ordenPresentacion = ordenPresentacion;
    }

    @Override
    public int getEsReferenciaAlternativa() {
        return this.esReferenciaAlternativa;
    }

    public void setEsReferenciaAlternativa(int esReferenciaAlternativa) {
        this.esReferenciaAlternativa = esReferenciaAlternativa;
    }

    @Override
    public Long getIdFuncionReferenciaAlt() {
        return this.idFuncionReferenciaAlt;
    }

    public void setIdFuncionReferenciaAlt(Long idFuncionReferenciaAlt) {
        this.idFuncionReferenciaAlt = idFuncionReferenciaAlt;
    }

    @Override
    public Long getIdListaValorAlternativa() {
        return this.idListaValorAlternativa;
    }

    public void setIdListaValorAlternativa(Long idListaValorAlternativa) {
        this.idListaValorAlternativa = idListaValorAlternativa;
    }

    @Override
    public Long getIdClaseObjetoValorAlt() {
        return this.idClaseObjetoValorAlt;
    }

    public void setIdClaseObjetoValorAlt(Long idClaseObjetoValorAlt) {
        this.idClaseObjetoValorAlt = idClaseObjetoValorAlt;
    }

    @Override
    public Long getIdClaseRecursoValorAlt() {
        return this.idClaseRecursoValorAlt;
    }

    public void setIdClaseRecursoValorAlt(Long idClaseRecursoValorAlt) {
        this.idClaseRecursoValorAlt = idClaseRecursoValorAlt;
    }

    @Override
    public int getOrdenPaginaSeleccion() {
        return this.ordenPaginaSeleccion;
    }

    public void setOrdenPaginaSeleccion(int ordenPaginaSeleccion) {
        this.ordenPaginaSeleccion = ordenPaginaSeleccion;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecurso() {
        return this.claseRecursoIdClaseRecurso;
    }

    public void setClaseRecursoIdClaseRecurso(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecurso = claseRecurso;
    }

    @Override
    public Parametro getParametroIdParametro() {
        return this.parametroIdParametro;
    }

    public void setParametroIdParametro(Parametro parametro) {
        this.parametroIdParametro = parametro;
    }

    @Override
    public TipoParametro getTipoParametroNumeroTipoParametro() {
        return this.tipoParametroNumeroTipoParametro;
    }

    public void setTipoParametroNumeroTipoParametro(TipoParametro tipoParametro) {
        this.tipoParametroNumeroTipoParametro = tipoParametro;
    }

    @Override
    public TipoComparacion getTipoComparacionNumeroTipoComparacion() {
        return this.tipoComparacionNumeroTipoComparacion;
    }

    public void setTipoComparacionNumeroTipoComparacion(TipoComparacion tipoComparacion) {
        this.tipoComparacionNumeroTipoComparacion = tipoComparacion;
    }

    @Override
    public Funcion getFuncionIdFuncionReferencia() {
        return this.funcionIdFuncionReferencia;
    }

    public void setFuncionIdFuncionReferencia(Funcion funcion) {
        this.funcionIdFuncionReferencia = funcion;
    }

    @Override
    public TipoValor getTipoValorNumeroTipoValor() {
        return this.tipoValorNumeroTipoValor;
    }

    public void setTipoValorNumeroTipoValor(TipoValor tipoValor) {
        this.tipoValorNumeroTipoValor = tipoValor;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecursoValor() {
        return this.claseRecursoIdClaseRecursoValor;
    }

    public void setClaseRecursoIdClaseRecursoValor(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecursoValor = claseRecurso;
    }

    @Override
    public ClaseRecursoSec getClaseRecursoSecIdClaseRecursoSec() {
        return this.claseRecursoSecIdClaseRecursoSec;
    }

    public void setClaseRecursoSecIdClaseRecursoSec(ClaseRecursoSec claseRecursoSec) {
        this.claseRecursoSecIdClaseRecursoSec = claseRecursoSec;
    }

    @Override
    public TipoValor getTipoValorNumeroTipoValorAlternativo() {
        return this.tipoValorNumeroTipoValorAlternativo;
    }

    public void setTipoValorNumeroTipoValorAlternativo(TipoValor tipoValor) {
        this.tipoValorNumeroTipoValorAlternativo = tipoValor;
    }

    @Override
    public Collection<FiltroClaRecFun> getFiltroClaRecFunIdClaseRecursoParColumnaCollection() {
        return this.filtroClaRecFunIdClaseRecursoParColumnaCollection;
    }

    public void setFiltroClaRecFunIdClaseRecursoParColumnaCollection(Collection<FiltroClaRecFun> collection) {
        this.filtroClaRecFunIdClaseRecursoParColumnaCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecFun> getFiltroClaRecFunIdClaseRecursoParValorCollection() {
        return this.filtroClaRecFunIdClaseRecursoParValorCollection;
    }

    public void setFiltroClaRecFunIdClaseRecursoParValorCollection(Collection<FiltroClaRecFun> collection) {
        this.filtroClaRecFunIdClaseRecursoParValorCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecPar> getFiltroClaRecParIdClaseRecursoParCollection() {
        return this.filtroClaRecParIdClaseRecursoParCollection;
    }

    public void setFiltroClaRecParIdClaseRecursoParCollection(Collection<FiltroClaRecPar> collection) {
        this.filtroClaRecParIdClaseRecursoParCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecPar> getFiltroClaRecParIdClaseRecursoParColumnaCollection() {
        return this.filtroClaRecParIdClaseRecursoParColumnaCollection;
    }

    public void setFiltroClaRecParIdClaseRecursoParColumnaCollection(Collection<FiltroClaRecPar> collection) {
        this.filtroClaRecParIdClaseRecursoParColumnaCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecPar> getFiltroClaRecParIdClaseRecursoParValorCollection() {
        return this.filtroClaRecParIdClaseRecursoParValorCollection;
    }

    public void setFiltroClaRecParIdClaseRecursoParValorCollection(Collection<FiltroClaRecPar> collection) {
        this.filtroClaRecParIdClaseRecursoParValorCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecSec> getFiltroClaRecSecIdClaseRecursoParColumnaCollection() {
        return this.filtroClaRecSecIdClaseRecursoParColumnaCollection;
    }

    public void setFiltroClaRecSecIdClaseRecursoParColumnaCollection(Collection<FiltroClaRecSec> collection) {
        this.filtroClaRecSecIdClaseRecursoParColumnaCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecSec> getFiltroClaRecSecIdClaseRecursoParValorCollection() {
        return this.filtroClaRecSecIdClaseRecursoParValorCollection;
    }

    public void setFiltroClaRecSecIdClaseRecursoParValorCollection(Collection<FiltroClaRecSec> collection) {
        this.filtroClaRecSecIdClaseRecursoParValorCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecVin> getFiltroClaRecVinIdClaseRecursoParCollection() {
        return this.filtroClaRecVinIdClaseRecursoParCollection;
    }

    public void setFiltroClaRecVinIdClaseRecursoParCollection(Collection<FiltroClaRecVin> collection) {
        this.filtroClaRecVinIdClaseRecursoParCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecVin> getFiltroClaRecVinIdClaseRecursoParColumnaCollection() {
        return this.filtroClaRecVinIdClaseRecursoParColumnaCollection;
    }

    public void setFiltroClaRecVinIdClaseRecursoParColumnaCollection(Collection<FiltroClaRecVin> collection) {
        this.filtroClaRecVinIdClaseRecursoParColumnaCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecVin> getFiltroClaRecVinIdClaseRecursoParValorCollection() {
        return this.filtroClaRecVinIdClaseRecursoParValorCollection;
    }

    public void setFiltroClaRecVinIdClaseRecursoParValorCollection(Collection<FiltroClaRecVin> collection) {
        this.filtroClaRecVinIdClaseRecursoParValorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecursoPar) {
            ClaseRecursoPar that = (ClaseRecursoPar) object;
            return idClaseRecursoPar == null ? that.idClaseRecursoPar == null ? 0 : -1
                    : idClaseRecursoPar.compareTo(that.idClaseRecursoPar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idClaseRecursoPar == null ? 0 : idClaseRecursoPar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ClaseRecursoPar) {
            ClaseRecursoPar that = (ClaseRecursoPar) object;
            return ((idClaseRecursoPar == null && that.idClaseRecursoPar == null) ||
                    (idClaseRecursoPar != null && idClaseRecursoPar.equals(that.idClaseRecursoPar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idClaseRecursoPar;
    }
}
