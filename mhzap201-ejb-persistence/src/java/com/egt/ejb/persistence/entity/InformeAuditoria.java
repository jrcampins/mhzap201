/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.InformeAuditoriaBase;
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
@Table(name = "informe_auditoria")
public class InformeAuditoria implements InformeAuditoriaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_informe_auditoria")
    private Long idInformeAuditoria;

    @Basic(optional = false)
    @Column(name = "version_informe_auditoria")
    private long versionInformeAuditoria;

    @Basic(optional = false)
    @Column(name = "codigo_informe_auditoria")
    private String codigoInformeAuditoria;

    @Basic(optional = false)
    @Column(name = "nombre_informe_auditoria")
    private String nombreInformeAuditoria;

    @Column(name = "fecha_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransaccion;

    public InformeAuditoria() {
    }

    @Override
    public Long getIdInformeAuditoria() {
        return this.idInformeAuditoria;
    }

    public void setIdInformeAuditoria(Long idInformeAuditoria) {
        this.idInformeAuditoria = idInformeAuditoria;
    }

    @Override
    public long getVersionInformeAuditoria() {
        return this.versionInformeAuditoria;
    }

    public void setVersionInformeAuditoria(long versionInformeAuditoria) {
        this.versionInformeAuditoria = versionInformeAuditoria;
    }

    @Override
    public String getCodigoInformeAuditoria() {
        return this.codigoInformeAuditoria;
    }

    public void setCodigoInformeAuditoria(String codigoInformeAuditoria) {
        this.codigoInformeAuditoria = codigoInformeAuditoria;
    }

    @Override
    public String getNombreInformeAuditoria() {
        return this.nombreInformeAuditoria;
    }

    public void setNombreInformeAuditoria(String nombreInformeAuditoria) {
        this.nombreInformeAuditoria = nombreInformeAuditoria;
    }

    @Override
    public Date getFechaTransaccion() {
        return this.fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof InformeAuditoria) {
            InformeAuditoria that = (InformeAuditoria) object;
            return idInformeAuditoria == null ? that.idInformeAuditoria == null ? 0 : -1
                    : idInformeAuditoria.compareTo(that.idInformeAuditoria);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idInformeAuditoria == null ? 0 : idInformeAuditoria.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof InformeAuditoria) {
            InformeAuditoria that = (InformeAuditoria) object;
            return ((idInformeAuditoria == null && that.idInformeAuditoria == null) ||
                    (idInformeAuditoria != null && idInformeAuditoria.equals(that.idInformeAuditoria)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idInformeAuditoria;
    }
}
