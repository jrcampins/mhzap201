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

import com.egt.base.persistence.entity.OperadorComBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "operador_com")
public class OperadorCom implements OperadorComBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_operador_com")
    private Integer numeroOperadorCom;

    @Basic(optional = false)
    @Column(name = "codigo_operador_com")
    private String codigoOperadorCom;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "operadorComNumeroOperadorCom")
    private Collection<FiltroClaRecFun> filtroClaRecFunNumeroOperadorComCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "operadorComNumeroOperadorCom")
    private Collection<FiltroClaRecPar> filtroClaRecParNumeroOperadorComCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "operadorComNumeroOperadorCom")
    private Collection<FiltroClaRecSec> filtroClaRecSecNumeroOperadorComCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "operadorComNumeroOperadorCom")
    private Collection<FiltroClaRecVin> filtroClaRecVinNumeroOperadorComCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "operadorComNumeroOperadorCom")
    private Collection<FiltroFuncionPar> filtroFuncionParNumeroOperadorComCollection;

    public OperadorCom() {
    }

    @Override
    public Integer getNumeroOperadorCom() {
        return this.numeroOperadorCom;
    }

    public void setNumeroOperadorCom(Integer numeroOperadorCom) {
        this.numeroOperadorCom = numeroOperadorCom;
    }

    @Override
    public String getCodigoOperadorCom() {
        return this.codigoOperadorCom;
    }

    public void setCodigoOperadorCom(String codigoOperadorCom) {
        this.codigoOperadorCom = codigoOperadorCom;
    }

    @Override
    public Collection<FiltroClaRecFun> getFiltroClaRecFunNumeroOperadorComCollection() {
        return this.filtroClaRecFunNumeroOperadorComCollection;
    }

    public void setFiltroClaRecFunNumeroOperadorComCollection(Collection<FiltroClaRecFun> collection) {
        this.filtroClaRecFunNumeroOperadorComCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecPar> getFiltroClaRecParNumeroOperadorComCollection() {
        return this.filtroClaRecParNumeroOperadorComCollection;
    }

    public void setFiltroClaRecParNumeroOperadorComCollection(Collection<FiltroClaRecPar> collection) {
        this.filtroClaRecParNumeroOperadorComCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecSec> getFiltroClaRecSecNumeroOperadorComCollection() {
        return this.filtroClaRecSecNumeroOperadorComCollection;
    }

    public void setFiltroClaRecSecNumeroOperadorComCollection(Collection<FiltroClaRecSec> collection) {
        this.filtroClaRecSecNumeroOperadorComCollection = collection;
    }

    @Override
    public Collection<FiltroClaRecVin> getFiltroClaRecVinNumeroOperadorComCollection() {
        return this.filtroClaRecVinNumeroOperadorComCollection;
    }

    public void setFiltroClaRecVinNumeroOperadorComCollection(Collection<FiltroClaRecVin> collection) {
        this.filtroClaRecVinNumeroOperadorComCollection = collection;
    }

    @Override
    public Collection<FiltroFuncionPar> getFiltroFuncionParNumeroOperadorComCollection() {
        return this.filtroFuncionParNumeroOperadorComCollection;
    }

    public void setFiltroFuncionParNumeroOperadorComCollection(Collection<FiltroFuncionPar> collection) {
        this.filtroFuncionParNumeroOperadorComCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OperadorCom) {
            OperadorCom that = (OperadorCom) object;
            return numeroOperadorCom == null ? that.numeroOperadorCom == null ? 0 : -1
                    : numeroOperadorCom.compareTo(that.numeroOperadorCom);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroOperadorCom == null ? 0 : numeroOperadorCom.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OperadorCom) {
            OperadorCom that = (OperadorCom) object;
            return ((numeroOperadorCom == null && that.numeroOperadorCom == null) ||
                    (numeroOperadorCom != null && numeroOperadorCom.equals(that.numeroOperadorCom)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroOperadorCom;
    }
}
