/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.LogImpIdsBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_imp_ids")
public class LogImpIds implements LogImpIdsBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_ids")
    private Long idLogImpIds;

    @Basic(optional = false)
    @Column(name = "version_log_imp_ids")
    private long versionLogImpIds;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "letra_cedula")
    private String letraCedula;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "nacimiento")
    private String nacimiento;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;

    @Column(name = "indigena")
    private String indigena;

    @Basic(optional = false)
    @Column(name = "es_importado")
    private int esImportado;

    @Column(name = "observacion")
    private String observacion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;

    @Column(name = "codigo_archivo")
    private String codigoArchivo;

    public LogImpIds() {
    }

    @Override
    public Long getIdLogImpIds() {
        return this.idLogImpIds;
    }

    public void setIdLogImpIds(Long idLogImpIds) {
        this.idLogImpIds = idLogImpIds;
    }

    @Override
    public long getVersionLogImpIds() {
        return this.versionLogImpIds;
    }

    public void setVersionLogImpIds(long versionLogImpIds) {
        this.versionLogImpIds = versionLogImpIds;
    }

    @Override
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getLetraCedula() {
        return this.letraCedula;
    }

    public void setLetraCedula(String letraCedula) {
        this.letraCedula = letraCedula;
    }

    @Override
    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String getIndigena() {
        return this.indigena;
    }

    public void setIndigena(String indigena) {
        this.indigena = indigena;
    }

    @Override
    public int getEsImportado() {
        return this.esImportado;
    }

    public void setEsImportado(int esImportado) {
        this.esImportado = esImportado;
    }

    @Override
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public Date getFechaHoraTransaccion() {
        return this.fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    @Override
    public String getNombreArchivo() {
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String getCodigoArchivo() {
        return this.codigoArchivo;
    }

    public void setCodigoArchivo(String codigoArchivo) {
        this.codigoArchivo = codigoArchivo;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpIds) {
            LogImpIds that = (LogImpIds) object;
            return idLogImpIds == null ? that.idLogImpIds == null ? 0 : -1
                    : idLogImpIds.compareTo(that.idLogImpIds);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpIds == null ? 0 : idLogImpIds.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpIds) {
            LogImpIds that = (LogImpIds) object;
            return ((idLogImpIds == null && that.idLogImpIds == null) ||
                    (idLogImpIds != null && idLogImpIds.equals(that.idLogImpIds)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpIds;
    }
}
