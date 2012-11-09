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

import com.egt.base.persistence.entity.MensajeBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensaje")
public class Mensaje implements MensajeBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_mensaje")
    private Long idMensaje;

    @Basic(optional = false)
    @Column(name = "version_mensaje")
    private long versionMensaje;

    @Basic(optional = false)
    @Column(name = "codigo_mensaje")
    private String codigoMensaje;

    @Column(name = "patron_mensaje")
    private String patronMensaje;

    @Column(name = "descripcion_mensaje")
    private String descripcionMensaje;

    public Mensaje() {
    }

    @Override
    public Long getIdMensaje() {
        return this.idMensaje;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    @Override
    public long getVersionMensaje() {
        return this.versionMensaje;
    }

    public void setVersionMensaje(long versionMensaje) {
        this.versionMensaje = versionMensaje;
    }

    @Override
    public String getCodigoMensaje() {
        return this.codigoMensaje;
    }

    public void setCodigoMensaje(String codigoMensaje) {
        this.codigoMensaje = codigoMensaje;
    }

    @Override
    public String getPatronMensaje() {
        return this.patronMensaje;
    }

    public void setPatronMensaje(String patronMensaje) {
        this.patronMensaje = patronMensaje;
    }

    @Override
    public String getDescripcionMensaje() {
        return this.descripcionMensaje;
    }

    public void setDescripcionMensaje(String descripcionMensaje) {
        this.descripcionMensaje = descripcionMensaje;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Mensaje) {
            Mensaje that = (Mensaje) object;
            return idMensaje == null ? that.idMensaje == null ? 0 : -1
                    : idMensaje.compareTo(that.idMensaje);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idMensaje == null ? 0 : idMensaje.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Mensaje) {
            Mensaje that = (Mensaje) object;
            return ((idMensaje == null && that.idMensaje == null) ||
                    (idMensaje != null && idMensaje.equals(that.idMensaje)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idMensaje;
    }
}
