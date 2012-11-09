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

import com.egt.base.persistence.entity.TipoOcupacionVivBase;
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
@Table(name = "tipo_ocupacion_viv")
public class TipoOcupacionViv implements TipoOcupacionVivBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_ocupacion_viv")
    private Integer numeroTipoOcupacionViv;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_ocupacion_viv")
    private String codigoTipoOcupacionViv;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoOcupacionVivNumeroTipoOcupacionViv")
    private Collection<FichaHogar> fichaHogarNumeroTipoOcupacionVivCollection;

    public TipoOcupacionViv() {
    }

    @Override
    public Integer getNumeroTipoOcupacionViv() {
        return this.numeroTipoOcupacionViv;
    }

    public void setNumeroTipoOcupacionViv(Integer numeroTipoOcupacionViv) {
        this.numeroTipoOcupacionViv = numeroTipoOcupacionViv;
    }

    @Override
    public String getCodigoTipoOcupacionViv() {
        return this.codigoTipoOcupacionViv;
    }

    public void setCodigoTipoOcupacionViv(String codigoTipoOcupacionViv) {
        this.codigoTipoOcupacionViv = codigoTipoOcupacionViv;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoOcupacionVivCollection() {
        return this.fichaHogarNumeroTipoOcupacionVivCollection;
    }

    public void setFichaHogarNumeroTipoOcupacionVivCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoOcupacionVivCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoOcupacionViv) {
            TipoOcupacionViv that = (TipoOcupacionViv) object;
            return numeroTipoOcupacionViv == null ? that.numeroTipoOcupacionViv == null ? 0 : -1
                    : numeroTipoOcupacionViv.compareTo(that.numeroTipoOcupacionViv);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoOcupacionViv == null ? 0 : numeroTipoOcupacionViv.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoOcupacionViv) {
            TipoOcupacionViv that = (TipoOcupacionViv) object;
            return ((numeroTipoOcupacionViv == null && that.numeroTipoOcupacionViv == null) ||
                    (numeroTipoOcupacionViv != null && numeroTipoOcupacionViv.equals(that.numeroTipoOcupacionViv)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoOcupacionViv;
    }
}
