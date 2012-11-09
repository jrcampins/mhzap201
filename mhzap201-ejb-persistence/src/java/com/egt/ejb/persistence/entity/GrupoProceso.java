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

import com.egt.base.persistence.entity.GrupoProcesoBase;
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
@Table(name = "grupo_proceso")
public class GrupoProceso implements GrupoProcesoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_grupo_proceso")
    private Long idGrupoProceso;

    @Basic(optional = false)
    @Column(name = "version_grupo_proceso")
    private long versionGrupoProceso;

    @Basic(optional = false)
    @Column(name = "codigo_grupo_proceso")
    private String codigoGrupoProceso;

    @Column(name = "nombre_grupo_proceso")
    private String nombreGrupoProceso;

    @Column(name = "descripcion_grupo_proceso")
    private String descripcionGrupoProceso;

    @Column(name = "id_rastro_proceso")
    private Long idRastroProceso;

    @JoinColumn(name = "numero_condicion_eje_fun", referencedColumnName = "numero_condicion_eje_fun")
    @ManyToOne
    private CondicionEjeFun condicionEjeFunNumeroCondicionEjeFun;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "grupoProcesoIdGrupoProceso")
    private Collection<Funcion> funcionIdGrupoProcesoCollection;

    public GrupoProceso() {
    }

    @Override
    public Long getIdGrupoProceso() {
        return this.idGrupoProceso;
    }

    public void setIdGrupoProceso(Long idGrupoProceso) {
        this.idGrupoProceso = idGrupoProceso;
    }

    @Override
    public long getVersionGrupoProceso() {
        return this.versionGrupoProceso;
    }

    public void setVersionGrupoProceso(long versionGrupoProceso) {
        this.versionGrupoProceso = versionGrupoProceso;
    }

    @Override
    public String getCodigoGrupoProceso() {
        return this.codigoGrupoProceso;
    }

    public void setCodigoGrupoProceso(String codigoGrupoProceso) {
        this.codigoGrupoProceso = codigoGrupoProceso;
    }

    @Override
    public String getNombreGrupoProceso() {
        return this.nombreGrupoProceso;
    }

    public void setNombreGrupoProceso(String nombreGrupoProceso) {
        this.nombreGrupoProceso = nombreGrupoProceso;
    }

    @Override
    public String getDescripcionGrupoProceso() {
        return this.descripcionGrupoProceso;
    }

    public void setDescripcionGrupoProceso(String descripcionGrupoProceso) {
        this.descripcionGrupoProceso = descripcionGrupoProceso;
    }

    @Override
    public Long getIdRastroProceso() {
        return this.idRastroProceso;
    }

    public void setIdRastroProceso(Long idRastroProceso) {
        this.idRastroProceso = idRastroProceso;
    }

    @Override
    public CondicionEjeFun getCondicionEjeFunNumeroCondicionEjeFun() {
        return this.condicionEjeFunNumeroCondicionEjeFun;
    }

    public void setCondicionEjeFunNumeroCondicionEjeFun(CondicionEjeFun condicionEjeFun) {
        this.condicionEjeFunNumeroCondicionEjeFun = condicionEjeFun;
    }

    @Override
    public Collection<Funcion> getFuncionIdGrupoProcesoCollection() {
        return this.funcionIdGrupoProcesoCollection;
    }

    public void setFuncionIdGrupoProcesoCollection(Collection<Funcion> collection) {
        this.funcionIdGrupoProcesoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof GrupoProceso) {
            GrupoProceso that = (GrupoProceso) object;
            return idGrupoProceso == null ? that.idGrupoProceso == null ? 0 : -1
                    : idGrupoProceso.compareTo(that.idGrupoProceso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idGrupoProceso == null ? 0 : idGrupoProceso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof GrupoProceso) {
            GrupoProceso that = (GrupoProceso) object;
            return ((idGrupoProceso == null && that.idGrupoProceso == null) ||
                    (idGrupoProceso != null && idGrupoProceso.equals(that.idGrupoProceso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idGrupoProceso;
    }
}
