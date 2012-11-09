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

import com.egt.base.persistence.entity.TipoRegPotBenBase;
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
@Table(name = "tipo_reg_pot_ben")
public class TipoRegPotBen implements TipoRegPotBenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_reg_pot_ben")
    private Integer numeroTipoRegPotBen;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_reg_pot_ben")
    private String codigoTipoRegPotBen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoRegPotBenNumeroTipoRegPotBen")
    private Collection<PotencialBen> potencialBenNumeroTipoRegPotBenCollection;

    public TipoRegPotBen() {
    }

    @Override
    public Integer getNumeroTipoRegPotBen() {
        return this.numeroTipoRegPotBen;
    }

    public void setNumeroTipoRegPotBen(Integer numeroTipoRegPotBen) {
        this.numeroTipoRegPotBen = numeroTipoRegPotBen;
    }

    @Override
    public String getCodigoTipoRegPotBen() {
        return this.codigoTipoRegPotBen;
    }

    public void setCodigoTipoRegPotBen(String codigoTipoRegPotBen) {
        this.codigoTipoRegPotBen = codigoTipoRegPotBen;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenNumeroTipoRegPotBenCollection() {
        return this.potencialBenNumeroTipoRegPotBenCollection;
    }

    public void setPotencialBenNumeroTipoRegPotBenCollection(Collection<PotencialBen> collection) {
        this.potencialBenNumeroTipoRegPotBenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRegPotBen) {
            TipoRegPotBen that = (TipoRegPotBen) object;
            return numeroTipoRegPotBen == null ? that.numeroTipoRegPotBen == null ? 0 : -1
                    : numeroTipoRegPotBen.compareTo(that.numeroTipoRegPotBen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoRegPotBen == null ? 0 : numeroTipoRegPotBen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRegPotBen) {
            TipoRegPotBen that = (TipoRegPotBen) object;
            return ((numeroTipoRegPotBen == null && that.numeroTipoRegPotBen == null) ||
                    (numeroTipoRegPotBen != null && numeroTipoRegPotBen.equals(that.numeroTipoRegPotBen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoRegPotBen;
    }
}
