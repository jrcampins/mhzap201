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

import com.egt.base.persistence.entity.TipoDesechoBasBase;
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
@Table(name = "tipo_desecho_bas")
public class TipoDesechoBas implements TipoDesechoBasBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_desecho_bas")
    private Integer numeroTipoDesechoBas;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_desecho_bas")
    private String codigoTipoDesechoBas;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoDesechoBasNumeroTipoDesechoBas")
    private Collection<FichaHogar> fichaHogarNumeroTipoDesechoBasCollection;

    public TipoDesechoBas() {
    }

    @Override
    public Integer getNumeroTipoDesechoBas() {
        return this.numeroTipoDesechoBas;
    }

    public void setNumeroTipoDesechoBas(Integer numeroTipoDesechoBas) {
        this.numeroTipoDesechoBas = numeroTipoDesechoBas;
    }

    @Override
    public String getCodigoTipoDesechoBas() {
        return this.codigoTipoDesechoBas;
    }

    public void setCodigoTipoDesechoBas(String codigoTipoDesechoBas) {
        this.codigoTipoDesechoBas = codigoTipoDesechoBas;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoDesechoBasCollection() {
        return this.fichaHogarNumeroTipoDesechoBasCollection;
    }

    public void setFichaHogarNumeroTipoDesechoBasCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoDesechoBasCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDesechoBas) {
            TipoDesechoBas that = (TipoDesechoBas) object;
            return numeroTipoDesechoBas == null ? that.numeroTipoDesechoBas == null ? 0 : -1
                    : numeroTipoDesechoBas.compareTo(that.numeroTipoDesechoBas);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoDesechoBas == null ? 0 : numeroTipoDesechoBas.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoDesechoBas) {
            TipoDesechoBas that = (TipoDesechoBas) object;
            return ((numeroTipoDesechoBas == null && that.numeroTipoDesechoBas == null) ||
                    (numeroTipoDesechoBas != null && numeroTipoDesechoBas.equals(that.numeroTipoDesechoBas)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoDesechoBas;
    }
}
