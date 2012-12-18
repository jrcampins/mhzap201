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

import com.egt.base.persistence.entity.LogImpUbiBase;
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
@Table(name = "log_imp_ubi")
public class LogImpUbi implements LogImpUbiBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_ubi")
    private Long idLogImpUbi;

    @Basic(optional = false)
    @Column(name = "version_log_imp_ubi")
    private long versionLogImpUbi;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "tipo_ubicacion")
    private String tipoUbicacion;

    @Column(name = "tipo_area")
    private String tipoArea;

    @Column(name = "codigo_ubicacion_superior")
    private String codigoUbicacionSuperior;

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

    public LogImpUbi() {
    }

    @Override
    public Long getIdLogImpUbi() {
        return this.idLogImpUbi;
    }

    public void setIdLogImpUbi(Long idLogImpUbi) {
        this.idLogImpUbi = idLogImpUbi;
    }

    @Override
    public long getVersionLogImpUbi() {
        return this.versionLogImpUbi;
    }

    public void setVersionLogImpUbi(long versionLogImpUbi) {
        this.versionLogImpUbi = versionLogImpUbi;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String getTipoUbicacion() {
        return this.tipoUbicacion;
    }

    public void setTipoUbicacion(String tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }

    @Override
    public String getTipoArea() {
        return this.tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    @Override
    public String getCodigoUbicacionSuperior() {
        return this.codigoUbicacionSuperior;
    }

    public void setCodigoUbicacionSuperior(String codigoUbicacionSuperior) {
        this.codigoUbicacionSuperior = codigoUbicacionSuperior;
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
        if (object instanceof LogImpUbi) {
            LogImpUbi that = (LogImpUbi) object;
            return idLogImpUbi == null ? that.idLogImpUbi == null ? 0 : -1
                    : idLogImpUbi.compareTo(that.idLogImpUbi);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpUbi == null ? 0 : idLogImpUbi.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpUbi) {
            LogImpUbi that = (LogImpUbi) object;
            return ((idLogImpUbi == null && that.idLogImpUbi == null) ||
                    (idLogImpUbi != null && idLogImpUbi.equals(that.idLogImpUbi)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpUbi;
    }
}
