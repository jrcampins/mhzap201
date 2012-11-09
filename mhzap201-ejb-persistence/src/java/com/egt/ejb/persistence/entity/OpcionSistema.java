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

import com.egt.base.persistence.entity.OpcionSistemaBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opcion_sistema")
public class OpcionSistema implements OpcionSistemaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_opcion_sistema")
    private Long idOpcionSistema;

    @Basic(optional = false)
    @Column(name = "version_opcion_sistema")
    private long versionOpcionSistema;

    @Basic(optional = false)
    @Column(name = "clave_opcion_sistema")
    private String claveOpcionSistema;

    @Basic(optional = false)
    @Column(name = "valor_opcion_sistema")
    private String valorOpcionSistema;

    @Column(name = "significado_opcion_sistema")
    private String significadoOpcionSistema;

    public OpcionSistema() {
    }

    @Override
    public Long getIdOpcionSistema() {
        return this.idOpcionSistema;
    }

    public void setIdOpcionSistema(Long idOpcionSistema) {
        this.idOpcionSistema = idOpcionSistema;
    }

    @Override
    public long getVersionOpcionSistema() {
        return this.versionOpcionSistema;
    }

    public void setVersionOpcionSistema(long versionOpcionSistema) {
        this.versionOpcionSistema = versionOpcionSistema;
    }

    @Override
    public String getClaveOpcionSistema() {
        return this.claveOpcionSistema;
    }

    public void setClaveOpcionSistema(String claveOpcionSistema) {
        this.claveOpcionSistema = claveOpcionSistema;
    }

    @Override
    public String getValorOpcionSistema() {
        return this.valorOpcionSistema;
    }

    public void setValorOpcionSistema(String valorOpcionSistema) {
        this.valorOpcionSistema = valorOpcionSistema;
    }

    @Override
    public String getSignificadoOpcionSistema() {
        return this.significadoOpcionSistema;
    }

    public void setSignificadoOpcionSistema(String significadoOpcionSistema) {
        this.significadoOpcionSistema = significadoOpcionSistema;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionSistema) {
            OpcionSistema that = (OpcionSistema) object;
            return idOpcionSistema == null ? that.idOpcionSistema == null ? 0 : -1
                    : idOpcionSistema.compareTo(that.idOpcionSistema);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idOpcionSistema == null ? 0 : idOpcionSistema.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionSistema) {
            OpcionSistema that = (OpcionSistema) object;
            return ((idOpcionSistema == null && that.idOpcionSistema == null) ||
                    (idOpcionSistema != null && idOpcionSistema.equals(that.idOpcionSistema)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idOpcionSistema;
    }
}
