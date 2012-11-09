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

import com.egt.base.persistence.entity.CondicionEjeFunBase;
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
@Table(name = "condicion_eje_fun")
public class CondicionEjeFun implements CondicionEjeFunBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_condicion_eje_fun")
    private Integer numeroCondicionEjeFun;

    @Basic(optional = false)
    @Column(name = "codigo_condicion_eje_fun")
    private String codigoCondicionEjeFun;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionEjeFunNumeroCondicionEjeFun")
    private Collection<GrupoProceso> grupoProcesoNumeroCondicionEjeFunCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionEjeFunNumeroCondicionUltimaEje")
    private Collection<Proceso> procesoNumeroCondicionUltimaEjeCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionEjeFunNumeroCondicionEjeFun")
    private Collection<RastroInforme> rastroInformeNumeroCondicionEjeFunCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionEjeFunNumeroCondicionEjeFun")
    private Collection<RastroProceso> rastroProcesoNumeroCondicionEjeFunCollection;

    public CondicionEjeFun() {
    }

    @Override
    public Integer getNumeroCondicionEjeFun() {
        return this.numeroCondicionEjeFun;
    }

    public void setNumeroCondicionEjeFun(Integer numeroCondicionEjeFun) {
        this.numeroCondicionEjeFun = numeroCondicionEjeFun;
    }

    @Override
    public String getCodigoCondicionEjeFun() {
        return this.codigoCondicionEjeFun;
    }

    public void setCodigoCondicionEjeFun(String codigoCondicionEjeFun) {
        this.codigoCondicionEjeFun = codigoCondicionEjeFun;
    }

    @Override
    public Collection<GrupoProceso> getGrupoProcesoNumeroCondicionEjeFunCollection() {
        return this.grupoProcesoNumeroCondicionEjeFunCollection;
    }

    public void setGrupoProcesoNumeroCondicionEjeFunCollection(Collection<GrupoProceso> collection) {
        this.grupoProcesoNumeroCondicionEjeFunCollection = collection;
    }

    @Override
    public Collection<Proceso> getProcesoNumeroCondicionUltimaEjeCollection() {
        return this.procesoNumeroCondicionUltimaEjeCollection;
    }

    public void setProcesoNumeroCondicionUltimaEjeCollection(Collection<Proceso> collection) {
        this.procesoNumeroCondicionUltimaEjeCollection = collection;
    }

    @Override
    public Collection<RastroInforme> getRastroInformeNumeroCondicionEjeFunCollection() {
        return this.rastroInformeNumeroCondicionEjeFunCollection;
    }

    public void setRastroInformeNumeroCondicionEjeFunCollection(Collection<RastroInforme> collection) {
        this.rastroInformeNumeroCondicionEjeFunCollection = collection;
    }

    @Override
    public Collection<RastroProceso> getRastroProcesoNumeroCondicionEjeFunCollection() {
        return this.rastroProcesoNumeroCondicionEjeFunCollection;
    }

    public void setRastroProcesoNumeroCondicionEjeFunCollection(Collection<RastroProceso> collection) {
        this.rastroProcesoNumeroCondicionEjeFunCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionEjeFun) {
            CondicionEjeFun that = (CondicionEjeFun) object;
            return numeroCondicionEjeFun == null ? that.numeroCondicionEjeFun == null ? 0 : -1
                    : numeroCondicionEjeFun.compareTo(that.numeroCondicionEjeFun);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCondicionEjeFun == null ? 0 : numeroCondicionEjeFun.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionEjeFun) {
            CondicionEjeFun that = (CondicionEjeFun) object;
            return ((numeroCondicionEjeFun == null && that.numeroCondicionEjeFun == null) ||
                    (numeroCondicionEjeFun != null && numeroCondicionEjeFun.equals(that.numeroCondicionEjeFun)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCondicionEjeFun;
    }
}
