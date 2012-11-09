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

import com.egt.base.persistence.entity.MotivoNoTrabajoBase;
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
@Table(name = "motivo_no_trabajo")
public class MotivoNoTrabajo implements MotivoNoTrabajoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_motivo_no_trabajo")
    private Integer numeroMotivoNoTrabajo;

    @Basic(optional = false)
    @Column(name = "codigo_motivo_no_trabajo")
    private String codigoMotivoNoTrabajo;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "motivoNoTrabajoNumeroMotivoNoTrabajo")
    private Collection<FichaPersona> fichaPersonaNumeroMotivoNoTrabajoCollection;

    public MotivoNoTrabajo() {
    }

    @Override
    public Integer getNumeroMotivoNoTrabajo() {
        return this.numeroMotivoNoTrabajo;
    }

    public void setNumeroMotivoNoTrabajo(Integer numeroMotivoNoTrabajo) {
        this.numeroMotivoNoTrabajo = numeroMotivoNoTrabajo;
    }

    @Override
    public String getCodigoMotivoNoTrabajo() {
        return this.codigoMotivoNoTrabajo;
    }

    public void setCodigoMotivoNoTrabajo(String codigoMotivoNoTrabajo) {
        this.codigoMotivoNoTrabajo = codigoMotivoNoTrabajo;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroMotivoNoTrabajoCollection() {
        return this.fichaPersonaNumeroMotivoNoTrabajoCollection;
    }

    public void setFichaPersonaNumeroMotivoNoTrabajoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroMotivoNoTrabajoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoNoTrabajo) {
            MotivoNoTrabajo that = (MotivoNoTrabajo) object;
            return numeroMotivoNoTrabajo == null ? that.numeroMotivoNoTrabajo == null ? 0 : -1
                    : numeroMotivoNoTrabajo.compareTo(that.numeroMotivoNoTrabajo);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroMotivoNoTrabajo == null ? 0 : numeroMotivoNoTrabajo.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoNoTrabajo) {
            MotivoNoTrabajo that = (MotivoNoTrabajo) object;
            return ((numeroMotivoNoTrabajo == null && that.numeroMotivoNoTrabajo == null) ||
                    (numeroMotivoNoTrabajo != null && numeroMotivoNoTrabajo.equals(that.numeroMotivoNoTrabajo)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroMotivoNoTrabajo;
    }
}
