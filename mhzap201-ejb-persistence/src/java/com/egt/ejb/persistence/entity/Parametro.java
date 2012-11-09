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

import com.egt.base.persistence.entity.ParametroBase;
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
@Table(name = "parametro")
public class Parametro implements ParametroBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_parametro")
    private Long idParametro;

    @Basic(optional = false)
    @Column(name = "version_parametro")
    private long versionParametro;

    @Basic(optional = false)
    @Column(name = "codigo_parametro")
    private String codigoParametro;

    @Basic(optional = false)
    @Column(name = "nombre_parametro")
    private String nombreParametro;

    @Column(name = "detalle_parametro")
    private String detalleParametro;

    @Column(name = "descripcion_parametro")
    private String descripcionParametro;

    @Column(name = "alias_parametro")
    private String aliasParametro;

    @JoinColumn(name = "numero_tipo_dato_par", referencedColumnName = "numero_tipo_dato_par")
    @ManyToOne
    private TipoDatoPar tipoDatoParNumeroTipoDatoPar;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "parametroIdParametro")
    private Collection<ClaseRecursoPar> claseRecursoParIdParametroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "parametroIdParametro")
    private Collection<DominioParametro> dominioParametroIdParametroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "parametroIdParametro")
    private Collection<FuncionParametro> funcionParametroIdParametroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "parametroIdParametro")
    private Collection<Pagina> paginaIdParametroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "parametroIdParametro")
    private Collection<RastroFuncionPar> rastroFuncionParIdParametroCollection;

    public Parametro() {
    }

    @Override
    public Long getIdParametro() {
        return this.idParametro;
    }

    public void setIdParametro(Long idParametro) {
        this.idParametro = idParametro;
    }

    @Override
    public long getVersionParametro() {
        return this.versionParametro;
    }

    public void setVersionParametro(long versionParametro) {
        this.versionParametro = versionParametro;
    }

    @Override
    public String getCodigoParametro() {
        return this.codigoParametro;
    }

    public void setCodigoParametro(String codigoParametro) {
        this.codigoParametro = codigoParametro;
    }

    @Override
    public String getNombreParametro() {
        return this.nombreParametro;
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    @Override
    public String getDetalleParametro() {
        return this.detalleParametro;
    }

    public void setDetalleParametro(String detalleParametro) {
        this.detalleParametro = detalleParametro;
    }

    @Override
    public String getDescripcionParametro() {
        return this.descripcionParametro;
    }

    public void setDescripcionParametro(String descripcionParametro) {
        this.descripcionParametro = descripcionParametro;
    }

    @Override
    public String getAliasParametro() {
        return this.aliasParametro;
    }

    public void setAliasParametro(String aliasParametro) {
        this.aliasParametro = aliasParametro;
    }

    @Override
    public TipoDatoPar getTipoDatoParNumeroTipoDatoPar() {
        return this.tipoDatoParNumeroTipoDatoPar;
    }

    public void setTipoDatoParNumeroTipoDatoPar(TipoDatoPar tipoDatoPar) {
        this.tipoDatoParNumeroTipoDatoPar = tipoDatoPar;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParIdParametroCollection() {
        return this.claseRecursoParIdParametroCollection;
    }

    public void setClaseRecursoParIdParametroCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParIdParametroCollection = collection;
    }

    @Override
    public Collection<DominioParametro> getDominioParametroIdParametroCollection() {
        return this.dominioParametroIdParametroCollection;
    }

    public void setDominioParametroIdParametroCollection(Collection<DominioParametro> collection) {
        this.dominioParametroIdParametroCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroIdParametroCollection() {
        return this.funcionParametroIdParametroCollection;
    }

    public void setFuncionParametroIdParametroCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroIdParametroCollection = collection;
    }

    @Override
    public Collection<Pagina> getPaginaIdParametroCollection() {
        return this.paginaIdParametroCollection;
    }

    public void setPaginaIdParametroCollection(Collection<Pagina> collection) {
        this.paginaIdParametroCollection = collection;
    }

    @Override
    public Collection<RastroFuncionPar> getRastroFuncionParIdParametroCollection() {
        return this.rastroFuncionParIdParametroCollection;
    }

    public void setRastroFuncionParIdParametroCollection(Collection<RastroFuncionPar> collection) {
        this.rastroFuncionParIdParametroCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Parametro) {
            Parametro that = (Parametro) object;
            return idParametro == null ? that.idParametro == null ? 0 : -1
                    : idParametro.compareTo(that.idParametro);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idParametro == null ? 0 : idParametro.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Parametro) {
            Parametro that = (Parametro) object;
            return ((idParametro == null && that.idParametro == null) ||
                    (idParametro != null && idParametro.equals(that.idParametro)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idParametro;
    }
}
