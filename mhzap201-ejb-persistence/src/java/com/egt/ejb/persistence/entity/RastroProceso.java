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

import com.egt.base.persistence.entity.RastroProcesoBase;
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
@Table(name = "rastro_proceso")
public class RastroProceso implements RastroProcesoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rastro_proceso")
    private Long idRastroProceso;

    @Basic(optional = false)
    @Column(name = "version_rastro_proceso")
    private long versionRastroProceso;

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

    @Column(name = "id_grupo_proceso")
    private Long idGrupoProceso;

    @Column(name = "id_rastro_proceso_superior")
    private Long idRastroProcesoSuperior;

    @Basic(optional = false)
    @Column(name = "subprocesos")
    private int subprocesos;

    @Basic(optional = false)
    @Column(name = "subprocesos_pendientes")
    private int subprocesosPendientes;

    @Basic(optional = false)
    @Column(name = "subprocesos_en_progreso")
    private int subprocesosEnProgreso;

    @Basic(optional = false)
    @Column(name = "subprocesos_sin_errores")
    private int subprocesosSinErrores;

    @Basic(optional = false)
    @Column(name = "subprocesos_con_errores")
    private int subprocesosConErrores;

    @Basic(optional = false)
    @Column(name = "subprocesos_cancelados")
    private int subprocesosCancelados;

    @Column(name = "procedimiento_after_update")
    private String procedimientoAfterUpdate;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "numero_condicion_eje_fun", referencedColumnName = "numero_condicion_eje_fun")
    @ManyToOne
    private CondicionEjeFun condicionEjeFunNumeroCondicionEjeFun;

    public RastroProceso() {
    }

    @Override
    public Long getIdRastroProceso() {
        return this.idRastroProceso;
    }

    public void setIdRastroProceso(Long idRastroProceso) {
        this.idRastroProceso = idRastroProceso;
    }

    @Override
    public long getVersionRastroProceso() {
        return this.versionRastroProceso;
    }

    public void setVersionRastroProceso(long versionRastroProceso) {
        this.versionRastroProceso = versionRastroProceso;
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
    public Long getIdGrupoProceso() {
        return this.idGrupoProceso;
    }

    public void setIdGrupoProceso(Long idGrupoProceso) {
        this.idGrupoProceso = idGrupoProceso;
    }

    @Override
    public Long getIdRastroProcesoSuperior() {
        return this.idRastroProcesoSuperior;
    }

    public void setIdRastroProcesoSuperior(Long idRastroProcesoSuperior) {
        this.idRastroProcesoSuperior = idRastroProcesoSuperior;
    }

    @Override
    public int getSubprocesos() {
        return this.subprocesos;
    }

    public void setSubprocesos(int subprocesos) {
        this.subprocesos = subprocesos;
    }

    @Override
    public int getSubprocesosPendientes() {
        return this.subprocesosPendientes;
    }

    public void setSubprocesosPendientes(int subprocesosPendientes) {
        this.subprocesosPendientes = subprocesosPendientes;
    }

    @Override
    public int getSubprocesosEnProgreso() {
        return this.subprocesosEnProgreso;
    }

    public void setSubprocesosEnProgreso(int subprocesosEnProgreso) {
        this.subprocesosEnProgreso = subprocesosEnProgreso;
    }

    @Override
    public int getSubprocesosSinErrores() {
        return this.subprocesosSinErrores;
    }

    public void setSubprocesosSinErrores(int subprocesosSinErrores) {
        this.subprocesosSinErrores = subprocesosSinErrores;
    }

    @Override
    public int getSubprocesosConErrores() {
        return this.subprocesosConErrores;
    }

    public void setSubprocesosConErrores(int subprocesosConErrores) {
        this.subprocesosConErrores = subprocesosConErrores;
    }

    @Override
    public int getSubprocesosCancelados() {
        return this.subprocesosCancelados;
    }

    public void setSubprocesosCancelados(int subprocesosCancelados) {
        this.subprocesosCancelados = subprocesosCancelados;
    }

    @Override
    public String getProcedimientoAfterUpdate() {
        return this.procedimientoAfterUpdate;
    }

    public void setProcedimientoAfterUpdate(String procedimientoAfterUpdate) {
        this.procedimientoAfterUpdate = procedimientoAfterUpdate;
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
        if (object instanceof RastroProceso) {
            RastroProceso that = (RastroProceso) object;
            return idRastroProceso == null ? that.idRastroProceso == null ? 0 : -1
                    : idRastroProceso.compareTo(that.idRastroProceso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRastroProceso == null ? 0 : idRastroProceso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroProceso) {
            RastroProceso that = (RastroProceso) object;
            return ((idRastroProceso == null && that.idRastroProceso == null) ||
                    (idRastroProceso != null && idRastroProceso.equals(that.idRastroProceso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRastroProceso;
    }
}
