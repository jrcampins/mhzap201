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

import com.egt.base.persistence.entity.LogImpPotBase;
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
@Table(name = "log_imp_pot")
public class LogImpPot implements LogImpPotBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_pot")
    private Long idLogImpPot;

    @Basic(optional = false)
    @Column(name = "version_log_imp_pot")
    private long versionLogImpPot;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "nombres_apellidos")
    private String nombresApellidos;

    @Column(name = "apodo")
    private String apodo;

    @Column(name = "edad_a_la_fecha")
    private String edadALaFecha;

    @Column(name = "nacimiento")
    private String nacimiento;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "nombre_referente")
    private String nombreReferente;

    @Column(name = "telefono_referente")
    private String telefonoReferente;

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

    public LogImpPot() {
    }

    @Override
    public Long getIdLogImpPot() {
        return this.idLogImpPot;
    }

    public void setIdLogImpPot(Long idLogImpPot) {
        this.idLogImpPot = idLogImpPot;
    }

    @Override
    public long getVersionLogImpPot() {
        return this.versionLogImpPot;
    }

    public void setVersionLogImpPot(long versionLogImpPot) {
        this.versionLogImpPot = versionLogImpPot;
    }

    @Override
    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getDistrito() {
        return this.distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String getNombresApellidos() {
        return this.nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    @Override
    public String getApodo() {
        return this.apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String getEdadALaFecha() {
        return this.edadALaFecha;
    }

    public void setEdadALaFecha(String edadALaFecha) {
        this.edadALaFecha = edadALaFecha;
    }

    @Override
    public String getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String getNombreReferente() {
        return this.nombreReferente;
    }

    public void setNombreReferente(String nombreReferente) {
        this.nombreReferente = nombreReferente;
    }

    @Override
    public String getTelefonoReferente() {
        return this.telefonoReferente;
    }

    public void setTelefonoReferente(String telefonoReferente) {
        this.telefonoReferente = telefonoReferente;
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
        if (object instanceof LogImpPot) {
            LogImpPot that = (LogImpPot) object;
            return idLogImpPot == null ? that.idLogImpPot == null ? 0 : -1
                    : idLogImpPot.compareTo(that.idLogImpPot);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpPot == null ? 0 : idLogImpPot.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpPot) {
            LogImpPot that = (LogImpPot) object;
            return ((idLogImpPot == null && that.idLogImpPot == null) ||
                    (idLogImpPot != null && idLogImpPot.equals(that.idLogImpPot)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpPot;
    }
}
