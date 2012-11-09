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

import com.egt.base.persistence.entity.RastroInformeBase;
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
@Table(name = "rastro_informe")
public class RastroInforme implements RastroInformeBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rastro_informe")
    private Long idRastroInforme;

    @Basic(optional = false)
    @Column(name = "version_rastro_informe")
    private long versionRastroInforme;

    @Basic(optional = false)
    @Column(name = "fecha_hora_inicio_ejecucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicioEjecucion;

    @Column(name = "fecha_hora_fin_ejecucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFinEjecucion;

    @Basic(optional = false)
    @Column(name = "id_usuario")
    private long idUsuario;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;

    @Column(name = "descripcion_error")
    private String descripcionError;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "numero_condicion_eje_fun", referencedColumnName = "numero_condicion_eje_fun")
    @ManyToOne
    private CondicionEjeFun condicionEjeFunNumeroCondicionEjeFun;

    public RastroInforme() {
    }

    @Override
    public Long getIdRastroInforme() {
        return this.idRastroInforme;
    }

    public void setIdRastroInforme(Long idRastroInforme) {
        this.idRastroInforme = idRastroInforme;
    }

    @Override
    public long getVersionRastroInforme() {
        return this.versionRastroInforme;
    }

    public void setVersionRastroInforme(long versionRastroInforme) {
        this.versionRastroInforme = versionRastroInforme;
    }

    @Override
    public Date getFechaHoraInicioEjecucion() {
        return this.fechaHoraInicioEjecucion;
    }

    public void setFechaHoraInicioEjecucion(Date fechaHoraInicioEjecucion) {
        this.fechaHoraInicioEjecucion = fechaHoraInicioEjecucion;
    }

    @Override
    public Date getFechaHoraFinEjecucion() {
        return this.fechaHoraFinEjecucion;
    }

    public void setFechaHoraFinEjecucion(Date fechaHoraFinEjecucion) {
        this.fechaHoraFinEjecucion = fechaHoraFinEjecucion;
    }

    @Override
    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String getNombreArchivo() {
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String getDescripcionError() {
        return this.descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public CondicionEjeFun getCondicionEjeFunNumeroCondicionEjeFun() {
        return this.condicionEjeFunNumeroCondicionEjeFun;
    }

    public void setCondicionEjeFunNumeroCondicionEjeFun(CondicionEjeFun condicionEjeFun) {
        this.condicionEjeFunNumeroCondicionEjeFun = condicionEjeFun;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroInforme) {
            RastroInforme that = (RastroInforme) object;
            return idRastroInforme == null ? that.idRastroInforme == null ? 0 : -1
                    : idRastroInforme.compareTo(that.idRastroInforme);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRastroInforme == null ? 0 : idRastroInforme.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroInforme) {
            RastroInforme that = (RastroInforme) object;
            return ((idRastroInforme == null && that.idRastroInforme == null) ||
                    (idRastroInforme != null && idRastroInforme.equals(that.idRastroInforme)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRastroInforme;
    }
}
