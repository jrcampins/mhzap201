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

import com.egt.base.persistence.entity.TipoPiezaBanoBase;
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
@Table(name = "tipo_pieza_bano")
public class TipoPiezaBano implements TipoPiezaBanoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_pieza_bano")
    private Integer numeroTipoPiezaBano;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_pieza_bano")
    private String codigoTipoPiezaBano;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoPiezaBanoNumeroTipoPiezaBano")
    private Collection<FichaHogar> fichaHogarNumeroTipoPiezaBanoCollection;

    public TipoPiezaBano() {
    }

    @Override
    public Integer getNumeroTipoPiezaBano() {
        return this.numeroTipoPiezaBano;
    }

    public void setNumeroTipoPiezaBano(Integer numeroTipoPiezaBano) {
        this.numeroTipoPiezaBano = numeroTipoPiezaBano;
    }

    @Override
    public String getCodigoTipoPiezaBano() {
        return this.codigoTipoPiezaBano;
    }

    public void setCodigoTipoPiezaBano(String codigoTipoPiezaBano) {
        this.codigoTipoPiezaBano = codigoTipoPiezaBano;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoPiezaBanoCollection() {
        return this.fichaHogarNumeroTipoPiezaBanoCollection;
    }

    public void setFichaHogarNumeroTipoPiezaBanoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoPiezaBanoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPiezaBano) {
            TipoPiezaBano that = (TipoPiezaBano) object;
            return numeroTipoPiezaBano == null ? that.numeroTipoPiezaBano == null ? 0 : -1
                    : numeroTipoPiezaBano.compareTo(that.numeroTipoPiezaBano);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoPiezaBano == null ? 0 : numeroTipoPiezaBano.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPiezaBano) {
            TipoPiezaBano that = (TipoPiezaBano) object;
            return ((numeroTipoPiezaBano == null && that.numeroTipoPiezaBano == null) ||
                    (numeroTipoPiezaBano != null && numeroTipoPiezaBano.equals(that.numeroTipoPiezaBano)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoPiezaBano;
    }
}
