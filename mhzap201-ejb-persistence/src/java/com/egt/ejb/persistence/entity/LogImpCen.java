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

import com.egt.base.persistence.entity.LogImpCenBase;
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
@Table(name = "log_imp_cen")
public class LogImpCen implements LogImpCenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_cen")
    private Long idLogImpCen;

    @Basic(optional = false)
    @Column(name = "version_log_imp_cen")
    private long versionLogImpCen;

    @Column(name = "orden")
    private String orden;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "edad_a_la_fecha")
    private String edadALaFecha;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "parentesco")
    private String parentesco;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "nombre_jefe_hogar")
    private String nombreJefeHogar;

    @Column(name = "cedula_jefe_hogar")
    private String cedulaJefeHogar;

    @Column(name = "icv")
    private String icv;

    @Column(name = "validado")
    private String validado;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "funcionario")
    private String funcionario;

    @Column(name = "causa_invalidacion")
    private String causaInvalidacion;

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

    public LogImpCen() {
    }

    @Override
    public Long getIdLogImpCen() {
        return this.idLogImpCen;
    }

    public void setIdLogImpCen(Long idLogImpCen) {
        this.idLogImpCen = idLogImpCen;
    }

    @Override
    public long getVersionLogImpCen() {
        return this.versionLogImpCen;
    }

    public void setVersionLogImpCen(long versionLogImpCen) {
        this.versionLogImpCen = versionLogImpCen;
    }

    @Override
    public String getOrden() {
        return this.orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Override
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String getEdadALaFecha() {
        return this.edadALaFecha;
    }

    public void setEdadALaFecha(String edadALaFecha) {
        this.edadALaFecha = edadALaFecha;
    }

    @Override
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getNombreJefeHogar() {
        return this.nombreJefeHogar;
    }

    public void setNombreJefeHogar(String nombreJefeHogar) {
        this.nombreJefeHogar = nombreJefeHogar;
    }

    @Override
    public String getCedulaJefeHogar() {
        return this.cedulaJefeHogar;
    }

    public void setCedulaJefeHogar(String cedulaJefeHogar) {
        this.cedulaJefeHogar = cedulaJefeHogar;
    }

    @Override
    public String getIcv() {
        return this.icv;
    }

    public void setIcv(String icv) {
        this.icv = icv;
    }

    @Override
    public String getValidado() {
        return this.validado;
    }

    public void setValidado(String validado) {
        this.validado = validado;
    }

    @Override
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String getCausaInvalidacion() {
        return this.causaInvalidacion;
    }

    public void setCausaInvalidacion(String causaInvalidacion) {
        this.causaInvalidacion = causaInvalidacion;
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
        if (object instanceof LogImpCen) {
            LogImpCen that = (LogImpCen) object;
            return idLogImpCen == null ? that.idLogImpCen == null ? 0 : -1
                    : idLogImpCen.compareTo(that.idLogImpCen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpCen == null ? 0 : idLogImpCen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpCen) {
            LogImpCen that = (LogImpCen) object;
            return ((idLogImpCen == null && that.idLogImpCen == null) ||
                    (idLogImpCen != null && idLogImpCen.equals(that.idLogImpCen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpCen;
    }
}
