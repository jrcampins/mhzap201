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

import com.egt.base.persistence.entity.LogProImpArcExtBase;
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
@Table(name = "log_pro_imp_arc_ext")
public class LogProImpArcExt implements LogProImpArcExtBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_pro_imp_arc_ext")
    private Long idLogProImpArcExt;

    @Basic(optional = false)
    @Column(name = "version_log_pro_imp_arc_ext")
    private long versionLogProImpArcExt;

    @Column(name = "codigo_tipo_arc_dat_ext")
    private String codigoTipoArcDatExt;

    @Column(name = "nombre_proveedor_dat_ext")
    private String nombreProveedorDatExt;

    @Column(name = "codigo_proveedor_dat_ext")
    private String codigoProveedorDatExt;

    @Column(name = "codigo_archivo_datos_ext")
    private String codigoArchivoDatosExt;

    @Column(name = "ruta_archivo_datos_ext")
    private String rutaArchivoDatosExt;

    @Basic(optional = false)
    @Column(name = "es_importado")
    private int esImportado;

    @Column(name = "observacion")
    private String observacion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @JoinColumn(name = "id_archivo_datos_ext", referencedColumnName = "id_archivo_datos_ext")
    @ManyToOne
    private ArchivoDatosExt archivoDatosExtIdArchivoDatosExt;

    @JoinColumn(name = "numero_tipo_arc_dat_ext", referencedColumnName = "numero_tipo_arc_dat_ext")
    @ManyToOne
    private TipoArcDatExt tipoArcDatExtNumeroTipoArcDatExt;

    public LogProImpArcExt() {
    }

    @Override
    public Long getIdLogProImpArcExt() {
        return this.idLogProImpArcExt;
    }

    public void setIdLogProImpArcExt(Long idLogProImpArcExt) {
        this.idLogProImpArcExt = idLogProImpArcExt;
    }

    @Override
    public long getVersionLogProImpArcExt() {
        return this.versionLogProImpArcExt;
    }

    public void setVersionLogProImpArcExt(long versionLogProImpArcExt) {
        this.versionLogProImpArcExt = versionLogProImpArcExt;
    }

    @Override
    public String getCodigoTipoArcDatExt() {
        return this.codigoTipoArcDatExt;
    }

    public void setCodigoTipoArcDatExt(String codigoTipoArcDatExt) {
        this.codigoTipoArcDatExt = codigoTipoArcDatExt;
    }

    @Override
    public String getNombreProveedorDatExt() {
        return this.nombreProveedorDatExt;
    }

    public void setNombreProveedorDatExt(String nombreProveedorDatExt) {
        this.nombreProveedorDatExt = nombreProveedorDatExt;
    }

    @Override
    public String getCodigoProveedorDatExt() {
        return this.codigoProveedorDatExt;
    }

    public void setCodigoProveedorDatExt(String codigoProveedorDatExt) {
        this.codigoProveedorDatExt = codigoProveedorDatExt;
    }

    @Override
    public String getCodigoArchivoDatosExt() {
        return this.codigoArchivoDatosExt;
    }

    public void setCodigoArchivoDatosExt(String codigoArchivoDatosExt) {
        this.codigoArchivoDatosExt = codigoArchivoDatosExt;
    }

    @Override
    public String getRutaArchivoDatosExt() {
        return this.rutaArchivoDatosExt;
    }

    public void setRutaArchivoDatosExt(String rutaArchivoDatosExt) {
        this.rutaArchivoDatosExt = rutaArchivoDatosExt;
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
    public ArchivoDatosExt getArchivoDatosExtIdArchivoDatosExt() {
        return this.archivoDatosExtIdArchivoDatosExt;
    }

    public void setArchivoDatosExtIdArchivoDatosExt(ArchivoDatosExt archivoDatosExt) {
        this.archivoDatosExtIdArchivoDatosExt = archivoDatosExt;
    }

    @Override
    public TipoArcDatExt getTipoArcDatExtNumeroTipoArcDatExt() {
        return this.tipoArcDatExtNumeroTipoArcDatExt;
    }

    public void setTipoArcDatExtNumeroTipoArcDatExt(TipoArcDatExt tipoArcDatExt) {
        this.tipoArcDatExtNumeroTipoArcDatExt = tipoArcDatExt;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProImpArcExt) {
            LogProImpArcExt that = (LogProImpArcExt) object;
            return idLogProImpArcExt == null ? that.idLogProImpArcExt == null ? 0 : -1
                    : idLogProImpArcExt.compareTo(that.idLogProImpArcExt);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogProImpArcExt == null ? 0 : idLogProImpArcExt.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProImpArcExt) {
            LogProImpArcExt that = (LogProImpArcExt) object;
            return ((idLogProImpArcExt == null && that.idLogProImpArcExt == null) ||
                    (idLogProImpArcExt != null && idLogProImpArcExt.equals(that.idLogProImpArcExt)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogProImpArcExt;
    }
}
