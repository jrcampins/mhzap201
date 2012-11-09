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

import com.egt.base.persistence.entity.MotivoInaEscBase;
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
@Table(name = "motivo_ina_esc")
public class MotivoInaEsc implements MotivoInaEscBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_motivo_ina_esc")
    private Integer numeroMotivoInaEsc;

    @Basic(optional = false)
    @Column(name = "codigo_motivo_ina_esc")
    private String codigoMotivoInaEsc;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "motivoInaEscNumeroMotivoInaEsc")
    private Collection<FichaPersona> fichaPersonaNumeroMotivoInaEscCollection;

    public MotivoInaEsc() {
    }

    @Override
    public Integer getNumeroMotivoInaEsc() {
        return this.numeroMotivoInaEsc;
    }

    public void setNumeroMotivoInaEsc(Integer numeroMotivoInaEsc) {
        this.numeroMotivoInaEsc = numeroMotivoInaEsc;
    }

    @Override
    public String getCodigoMotivoInaEsc() {
        return this.codigoMotivoInaEsc;
    }

    public void setCodigoMotivoInaEsc(String codigoMotivoInaEsc) {
        this.codigoMotivoInaEsc = codigoMotivoInaEsc;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroMotivoInaEscCollection() {
        return this.fichaPersonaNumeroMotivoInaEscCollection;
    }

    public void setFichaPersonaNumeroMotivoInaEscCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroMotivoInaEscCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoInaEsc) {
            MotivoInaEsc that = (MotivoInaEsc) object;
            return numeroMotivoInaEsc == null ? that.numeroMotivoInaEsc == null ? 0 : -1
                    : numeroMotivoInaEsc.compareTo(that.numeroMotivoInaEsc);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroMotivoInaEsc == null ? 0 : numeroMotivoInaEsc.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof MotivoInaEsc) {
            MotivoInaEsc that = (MotivoInaEsc) object;
            return ((numeroMotivoInaEsc == null && that.numeroMotivoInaEsc == null) ||
                    (numeroMotivoInaEsc != null && numeroMotivoInaEsc.equals(that.numeroMotivoInaEsc)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroMotivoInaEsc;
    }
}
