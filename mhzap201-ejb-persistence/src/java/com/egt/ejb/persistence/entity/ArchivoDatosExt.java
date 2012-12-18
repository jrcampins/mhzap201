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

import com.egt.base.persistence.entity.ArchivoDatosExtBase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "archivo_datos_ext")
public class ArchivoDatosExt implements ArchivoDatosExtBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_archivo_datos_ext")
    private Long idArchivoDatosExt;

    @Basic(optional = false)
    @Column(name = "version_archivo_datos_ext")
    private long versionArchivoDatosExt;

    @Basic(optional = false)
    @Column(name = "codigo_archivo_datos_ext")
    private String codigoArchivoDatosExt;

    @Column(name = "nombre_archivo_datos_ext")
    private String nombreArchivoDatosExt;

    @Column(name = "objeto_archivo_datos_ext")
    private String objetoArchivoDatosExt;

    @Column(name = "bytes_archivo_datos_ext")
    private Integer bytesArchivoDatosExt;

    @Basic(optional = false)
    @Column(name = "es_archivo_datos_ext_importado")
    private int esArchivoDatosExtImportado;

    @Basic(optional = false)
    @Column(name = "es_archivo_datos_ext_inactivo")
    private int esArchivoDatosExtInactivo;

    @Column(name = "fecha_hora_ultima_carga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraUltimaCarga;

    @Column(name = "fecha_hora_ultima_importacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraUltimaImportacion;

    @JoinColumn(name = "id_proveedor_dat_ext", referencedColumnName = "id_proveedor_dat_ext")
    @ManyToOne
    private ProveedorDatExt proveedorDatExtIdProveedorDatExt;

    @JoinColumn(name = "numero_tipo_arc_dat_ext", referencedColumnName = "numero_tipo_arc_dat_ext")
    @ManyToOne
    private TipoArcDatExt tipoArcDatExtNumeroTipoArcDatExt;

    @JoinColumn(name = "id_usuario_ultima_carga", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuarioUltimaCarga;

    @JoinColumn(name = "id_usuario_ultima_importacion", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuarioUltimaImportacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "archivoDatosExtIdArchivoDatosExt")
    private Collection<LogProImpArcExt> logProImpArcExtIdArchivoDatosExtCollection;

    public ArchivoDatosExt() {
    }

    @Override
    public Long getIdArchivoDatosExt() {
        return this.idArchivoDatosExt;
    }

    public void setIdArchivoDatosExt(Long idArchivoDatosExt) {
        this.idArchivoDatosExt = idArchivoDatosExt;
    }

    @Override
    public long getVersionArchivoDatosExt() {
        return this.versionArchivoDatosExt;
    }

    public void setVersionArchivoDatosExt(long versionArchivoDatosExt) {
        this.versionArchivoDatosExt = versionArchivoDatosExt;
    }

    @Override
    public String getCodigoArchivoDatosExt() {
        return this.codigoArchivoDatosExt;
    }

    public void setCodigoArchivoDatosExt(String codigoArchivoDatosExt) {
        this.codigoArchivoDatosExt = codigoArchivoDatosExt;
    }

    @Override
    public String getNombreArchivoDatosExt() {
        return this.nombreArchivoDatosExt;
    }

    public void setNombreArchivoDatosExt(String nombreArchivoDatosExt) {
        this.nombreArchivoDatosExt = nombreArchivoDatosExt;
    }

    @Override
    public String getObjetoArchivoDatosExt() {
        return this.objetoArchivoDatosExt;
    }

    public void setObjetoArchivoDatosExt(String objetoArchivoDatosExt) {
        this.objetoArchivoDatosExt = objetoArchivoDatosExt;
    }

    @Override
    public Integer getBytesArchivoDatosExt() {
        return this.bytesArchivoDatosExt;
    }

    public void setBytesArchivoDatosExt(Integer bytesArchivoDatosExt) {
        this.bytesArchivoDatosExt = bytesArchivoDatosExt;
    }

    @Override
    public int getEsArchivoDatosExtImportado() {
        return this.esArchivoDatosExtImportado;
    }

    public void setEsArchivoDatosExtImportado(int esArchivoDatosExtImportado) {
        this.esArchivoDatosExtImportado = esArchivoDatosExtImportado;
    }

    @Override
    public int getEsArchivoDatosExtInactivo() {
        return this.esArchivoDatosExtInactivo;
    }

    public void setEsArchivoDatosExtInactivo(int esArchivoDatosExtInactivo) {
        this.esArchivoDatosExtInactivo = esArchivoDatosExtInactivo;
    }

    @Override
    public Date getFechaHoraUltimaCarga() {
        return this.fechaHoraUltimaCarga;
    }

    public void setFechaHoraUltimaCarga(Date fechaHoraUltimaCarga) {
        this.fechaHoraUltimaCarga = fechaHoraUltimaCarga;
    }

    @Override
    public Date getFechaHoraUltimaImportacion() {
        return this.fechaHoraUltimaImportacion;
    }

    public void setFechaHoraUltimaImportacion(Date fechaHoraUltimaImportacion) {
        this.fechaHoraUltimaImportacion = fechaHoraUltimaImportacion;
    }

    @Override
    public ProveedorDatExt getProveedorDatExtIdProveedorDatExt() {
        return this.proveedorDatExtIdProveedorDatExt;
    }

    public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExt proveedorDatExt) {
        this.proveedorDatExtIdProveedorDatExt = proveedorDatExt;
    }

    @Override
    public TipoArcDatExt getTipoArcDatExtNumeroTipoArcDatExt() {
        return this.tipoArcDatExtNumeroTipoArcDatExt;
    }

    public void setTipoArcDatExtNumeroTipoArcDatExt(TipoArcDatExt tipoArcDatExt) {
        this.tipoArcDatExtNumeroTipoArcDatExt = tipoArcDatExt;
    }

    @Override
    public Usuario getUsuarioIdUsuarioUltimaCarga() {
        return this.usuarioIdUsuarioUltimaCarga;
    }

    public void setUsuarioIdUsuarioUltimaCarga(Usuario usuario) {
        this.usuarioIdUsuarioUltimaCarga = usuario;
    }

    @Override
    public Usuario getUsuarioIdUsuarioUltimaImportacion() {
        return this.usuarioIdUsuarioUltimaImportacion;
    }

    public void setUsuarioIdUsuarioUltimaImportacion(Usuario usuario) {
        this.usuarioIdUsuarioUltimaImportacion = usuario;
    }

    @Override
    public Collection<LogProImpArcExt> getLogProImpArcExtIdArchivoDatosExtCollection() {
        return this.logProImpArcExtIdArchivoDatosExtCollection;
    }

    public void setLogProImpArcExtIdArchivoDatosExtCollection(Collection<LogProImpArcExt> collection) {
        this.logProImpArcExtIdArchivoDatosExtCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ArchivoDatosExt) {
            ArchivoDatosExt that = (ArchivoDatosExt) object;
            return idArchivoDatosExt == null ? that.idArchivoDatosExt == null ? 0 : -1
                    : idArchivoDatosExt.compareTo(that.idArchivoDatosExt);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idArchivoDatosExt == null ? 0 : idArchivoDatosExt.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ArchivoDatosExt) {
            ArchivoDatosExt that = (ArchivoDatosExt) object;
            return ((idArchivoDatosExt == null && that.idArchivoDatosExt == null) ||
                    (idArchivoDatosExt != null && idArchivoDatosExt.equals(that.idArchivoDatosExt)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idArchivoDatosExt;
    }
}
