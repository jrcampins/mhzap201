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

import com.egt.base.persistence.entity.LogImpDeuBase;
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
@Table(name = "log_imp_deu")
public class LogImpDeu implements LogImpDeuBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_deu")
    private Long idLogImpDeu;

    @Basic(optional = false)
    @Column(name = "version_log_imp_deu")
    private long versionLogImpDeu;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "apellido_casada")
    private String apellidoCasada;

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

    public LogImpDeu() {
    }

    @Override
    public Long getIdLogImpDeu() {
        return this.idLogImpDeu;
    }

    public void setIdLogImpDeu(Long idLogImpDeu) {
        this.idLogImpDeu = idLogImpDeu;
    }

    @Override
    public long getVersionLogImpDeu() {
        return this.versionLogImpDeu;
    }

    public void setVersionLogImpDeu(long versionLogImpDeu) {
        this.versionLogImpDeu = versionLogImpDeu;
    }

    @Override
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    public String getApellidoCasada() {
        return this.apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
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
        if (object instanceof LogImpDeu) {
            LogImpDeu that = (LogImpDeu) object;
            return idLogImpDeu == null ? that.idLogImpDeu == null ? 0 : -1
                    : idLogImpDeu.compareTo(that.idLogImpDeu);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpDeu == null ? 0 : idLogImpDeu.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpDeu) {
            LogImpDeu that = (LogImpDeu) object;
            return ((idLogImpDeu == null && that.idLogImpDeu == null) ||
                    (idLogImpDeu != null && idLogImpDeu.equals(that.idLogImpDeu)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpDeu;
    }
}
