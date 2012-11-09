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

import com.egt.base.persistence.entity.ProveedorDatExtBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor_dat_ext")
public class ProveedorDatExt implements ProveedorDatExtBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_proveedor_dat_ext")
    private Long idProveedorDatExt;

    @Basic(optional = false)
    @Column(name = "version_proveedor_dat_ext")
    private long versionProveedorDatExt;

    @Basic(optional = false)
    @Column(name = "codigo_proveedor_dat_ext")
    private String codigoProveedorDatExt;

    @Basic(optional = false)
    @Column(name = "nombre_proveedor_dat_ext")
    private String nombreProveedorDatExt;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "proveedorDatExtIdProveedorDatExt")
    private Collection<ArchivoDatosExt> archivoDatosExtIdProveedorDatExtCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "proveedorDatExtIdProveedorDatExt")
    private Collection<FichaHogar> fichaHogarIdProveedorDatExtCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "proveedorDatExtIdProveedorDatExt")
    private Collection<ObjecionElePen> objecionElePenIdProveedorDatExtCollection;

    public ProveedorDatExt() {
    }

    @Override
    public Long getIdProveedorDatExt() {
        return this.idProveedorDatExt;
    }

    public void setIdProveedorDatExt(Long idProveedorDatExt) {
        this.idProveedorDatExt = idProveedorDatExt;
    }

    @Override
    public long getVersionProveedorDatExt() {
        return this.versionProveedorDatExt;
    }

    public void setVersionProveedorDatExt(long versionProveedorDatExt) {
        this.versionProveedorDatExt = versionProveedorDatExt;
    }

    @Override
    public String getCodigoProveedorDatExt() {
        return this.codigoProveedorDatExt;
    }

    public void setCodigoProveedorDatExt(String codigoProveedorDatExt) {
        this.codigoProveedorDatExt = codigoProveedorDatExt;
    }

    @Override
    public String getNombreProveedorDatExt() {
        return this.nombreProveedorDatExt;
    }

    public void setNombreProveedorDatExt(String nombreProveedorDatExt) {
        this.nombreProveedorDatExt = nombreProveedorDatExt;
    }

    @Override
    public Collection<ArchivoDatosExt> getArchivoDatosExtIdProveedorDatExtCollection() {
        return this.archivoDatosExtIdProveedorDatExtCollection;
    }

    public void setArchivoDatosExtIdProveedorDatExtCollection(Collection<ArchivoDatosExt> collection) {
        this.archivoDatosExtIdProveedorDatExtCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdProveedorDatExtCollection() {
        return this.fichaHogarIdProveedorDatExtCollection;
    }

    public void setFichaHogarIdProveedorDatExtCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdProveedorDatExtCollection = collection;
    }

    @Override
    public Collection<ObjecionElePen> getObjecionElePenIdProveedorDatExtCollection() {
        return this.objecionElePenIdProveedorDatExtCollection;
    }

    public void setObjecionElePenIdProveedorDatExtCollection(Collection<ObjecionElePen> collection) {
        this.objecionElePenIdProveedorDatExtCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ProveedorDatExt) {
            ProveedorDatExt that = (ProveedorDatExt) object;
            return idProveedorDatExt == null ? that.idProveedorDatExt == null ? 0 : -1
                    : idProveedorDatExt.compareTo(that.idProveedorDatExt);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idProveedorDatExt == null ? 0 : idProveedorDatExt.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ProveedorDatExt) {
            ProveedorDatExt that = (ProveedorDatExt) object;
            return ((idProveedorDatExt == null && that.idProveedorDatExt == null) ||
                    (idProveedorDatExt != null && idProveedorDatExt.equals(that.idProveedorDatExt)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idProveedorDatExt;
    }
}
