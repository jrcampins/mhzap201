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

import com.egt.base.persistence.entity.MotivoNoAtencionBase;
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
@Table(name = "motivo_no_atencion")
public class MotivoNoAtencion implements MotivoNoAtencionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_motivo_no_atencion")
    private Integer numeroMotivoNoAtencion;

    @Basic(optional = false)
    @Column(name = "codigo_motivo_no_atencion")
    private String codigoMotivoNoAtencion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "motivoNoAtencionNumeroMotivoNoAtencion")
    private Collection<FichaPersona> fichaPersonaNumeroMotivoNoAtencionCollection;

    public MotivoNoAtencion() {
    }

    @Override
    public Integer getNumeroMotivoNoAtencion() {
        return this.numeroMotivoNoAtencion;
    }

    public void setNumeroMotivoNoAtencion(Integer numeroMotivoNoAtencion) {
        this.numeroMotivoNoAtencion = numeroMotivoNoAtencion;
    }

    @Override
    public String getCodigoMotivoNoAtencion() {
        return this.codigoMotivoNoAtencion;
    }

    public void setCodigoMotivoNoAtencion(String codigoMotivoNoAtencion) {
        this.codigoMotivoNoAtencion = codigoMotivoNoAtencion;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroMotivoNoAtencionCollection() {
        return this.fichaPersonaNumeroMotivoNoAtencionCollection;
    }

    public void setFichaPersonaNumeroMotivoNoAtencionCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroMotivoNoAtencionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoNoAtencion) {
            MotivoNoAtencion that = (MotivoNoAtencion) object;
            return numeroMotivoNoAtencion == null ? that.numeroMotivoNoAtencion == null ? 0 : -1
                    : numeroMotivoNoAtencion.compareTo(that.numeroMotivoNoAtencion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroMotivoNoAtencion == null ? 0 : numeroMotivoNoAtencion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoNoAtencion) {
            MotivoNoAtencion that = (MotivoNoAtencion) object;
            return ((numeroMotivoNoAtencion == null && that.numeroMotivoNoAtencion == null) ||
                    (numeroMotivoNoAtencion != null && numeroMotivoNoAtencion.equals(that.numeroMotivoNoAtencion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroMotivoNoAtencion;
    }
}
