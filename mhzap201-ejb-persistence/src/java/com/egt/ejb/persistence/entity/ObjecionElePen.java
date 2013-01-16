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

import com.egt.base.persistence.entity.ObjecionElePenBase;
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
@Table(name = "objecion_ele_pen")
public class ObjecionElePen implements ObjecionElePenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_objecion_ele_pen")
    private Long idObjecionElePen;

    @Basic(optional = false)
    @Column(name = "version_objecion_ele_pen")
    private long versionObjecionElePen;

    @Basic(optional = false)
    @Column(name = "es_objecion_ele_pen_inactiva")
    private int esObjecionElePenInactiva;

    @Column(name = "fecha_ultima_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaActualizacion;

    @Column(name = "nombre_archivo_ultima_act")
    private String nombreArchivoUltimaAct;

    @Column(name = "observaciones")
    private String observaciones;

    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona personaIdPersona;

    @JoinColumn(name = "id_proveedor_dat_ext", referencedColumnName = "id_proveedor_dat_ext")
    @ManyToOne
    private ProveedorDatExt proveedorDatExtIdProveedorDatExt;

    @JoinColumn(name = "numero_tipo_obj_ele_pen", referencedColumnName = "numero_tipo_obj_ele_pen")
    @ManyToOne
    private TipoObjElePen tipoObjElePenNumeroTipoObjElePen;

    public ObjecionElePen() {
    }

    @Override
    public Long getIdObjecionElePen() {
        return this.idObjecionElePen;
    }

    public void setIdObjecionElePen(Long idObjecionElePen) {
        this.idObjecionElePen = idObjecionElePen;
    }

    @Override
    public long getVersionObjecionElePen() {
        return this.versionObjecionElePen;
    }

    public void setVersionObjecionElePen(long versionObjecionElePen) {
        this.versionObjecionElePen = versionObjecionElePen;
    }

    @Override
    public int getEsObjecionElePenInactiva() {
        return this.esObjecionElePenInactiva;
    }

    public void setEsObjecionElePenInactiva(int esObjecionElePenInactiva) {
        this.esObjecionElePenInactiva = esObjecionElePenInactiva;
    }

    @Override
    public Date getFechaUltimaActualizacion() {
        return this.fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    @Override
    public String getNombreArchivoUltimaAct() {
        return this.nombreArchivoUltimaAct;
    }

    public void setNombreArchivoUltimaAct(String nombreArchivoUltimaAct) {
        this.nombreArchivoUltimaAct = nombreArchivoUltimaAct;
    }

    @Override
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public Persona getPersonaIdPersona() {
        return this.personaIdPersona;
    }

    public void setPersonaIdPersona(Persona persona) {
        this.personaIdPersona = persona;
    }

    @Override
    public ProveedorDatExt getProveedorDatExtIdProveedorDatExt() {
        return this.proveedorDatExtIdProveedorDatExt;
    }

    public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExt proveedorDatExt) {
        this.proveedorDatExtIdProveedorDatExt = proveedorDatExt;
    }

    @Override
    public TipoObjElePen getTipoObjElePenNumeroTipoObjElePen() {
        return this.tipoObjElePenNumeroTipoObjElePen;
    }

    public void setTipoObjElePenNumeroTipoObjElePen(TipoObjElePen tipoObjElePen) {
        this.tipoObjElePenNumeroTipoObjElePen = tipoObjElePen;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ObjecionElePen) {
            ObjecionElePen that = (ObjecionElePen) object;
            return idObjecionElePen == null ? that.idObjecionElePen == null ? 0 : -1
                    : idObjecionElePen.compareTo(that.idObjecionElePen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idObjecionElePen == null ? 0 : idObjecionElePen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ObjecionElePen) {
            ObjecionElePen that = (ObjecionElePen) object;
            return ((idObjecionElePen == null && that.idObjecionElePen == null) ||
                    (idObjecionElePen != null && idObjecionElePen.equals(that.idObjecionElePen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idObjecionElePen;
    }
}
