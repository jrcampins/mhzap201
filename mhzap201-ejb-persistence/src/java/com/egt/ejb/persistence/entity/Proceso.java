/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.ProcesoBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "proceso")
public class Proceso implements ProcesoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_proceso")
    private Long idProceso;

    @Basic(optional = false)
    @Column(name = "version_proceso")
    private long versionProceso;

    @Basic(optional = false)
    @Column(name = "codigo_proceso_proceso")
    private String codigoProcesoProceso;

    @Basic(optional = false)
    @Column(name = "nombre_proceso_proceso")
    private String nombreProcesoProceso;

    @Column(name = "fecha_hora_ultima_ejecucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraUltimaEjecucion;

    @JoinColumn(name = "numero_condicion_ultima_eje", referencedColumnName = "numero_condicion_eje_fun")
    @ManyToOne
    private CondicionEjeFun condicionEjeFunNumeroCondicionUltimaEje;

    public Proceso() {
    }

    @Override
    public Long getIdProceso() {
        return this.idProceso;
    }

    public void setIdProceso(Long idProceso) {
        this.idProceso = idProceso;
    }

    @Override
    public long getVersionProceso() {
        return this.versionProceso;
    }

    public void setVersionProceso(long versionProceso) {
        this.versionProceso = versionProceso;
    }

    @Override
    public String getCodigoProcesoProceso() {
        return this.codigoProcesoProceso;
    }

    public void setCodigoProcesoProceso(String codigoProcesoProceso) {
        this.codigoProcesoProceso = codigoProcesoProceso;
    }

    @Override
    public String getNombreProcesoProceso() {
        return this.nombreProcesoProceso;
    }

    public void setNombreProcesoProceso(String nombreProcesoProceso) {
        this.nombreProcesoProceso = nombreProcesoProceso;
    }

    @Override
    public Date getFechaHoraUltimaEjecucion() {
        return this.fechaHoraUltimaEjecucion;
    }

    public void setFechaHoraUltimaEjecucion(Date fechaHoraUltimaEjecucion) {
        this.fechaHoraUltimaEjecucion = fechaHoraUltimaEjecucion;
    }

    @Override
    public CondicionEjeFun getCondicionEjeFunNumeroCondicionUltimaEje() {
        return this.condicionEjeFunNumeroCondicionUltimaEje;
    }

    public void setCondicionEjeFunNumeroCondicionUltimaEje(CondicionEjeFun condicionEjeFun) {
        this.condicionEjeFunNumeroCondicionUltimaEje = condicionEjeFun;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Proceso) {
            Proceso that = (Proceso) object;
            return idProceso == null ? that.idProceso == null ? 0 : -1
                    : idProceso.compareTo(that.idProceso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idProceso == null ? 0 : idProceso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Proceso) {
            Proceso that = (Proceso) object;
            return ((idProceso == null && that.idProceso == null) ||
                    (idProceso != null && idProceso.equals(that.idProceso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idProceso;
    }
}
