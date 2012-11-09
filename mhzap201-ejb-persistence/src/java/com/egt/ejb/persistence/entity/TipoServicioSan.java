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

import com.egt.base.persistence.entity.TipoServicioSanBase;
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
@Table(name = "tipo_servicio_san")
public class TipoServicioSan implements TipoServicioSanBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_servicio_san")
    private Integer numeroTipoServicioSan;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_servicio_san")
    private String codigoTipoServicioSan;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoServicioSanNumeroTipoServicioSan")
    private Collection<FichaHogar> fichaHogarNumeroTipoServicioSanCollection;

    public TipoServicioSan() {
    }

    @Override
    public Integer getNumeroTipoServicioSan() {
        return this.numeroTipoServicioSan;
    }

    public void setNumeroTipoServicioSan(Integer numeroTipoServicioSan) {
        this.numeroTipoServicioSan = numeroTipoServicioSan;
    }

    @Override
    public String getCodigoTipoServicioSan() {
        return this.codigoTipoServicioSan;
    }

    public void setCodigoTipoServicioSan(String codigoTipoServicioSan) {
        this.codigoTipoServicioSan = codigoTipoServicioSan;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoServicioSanCollection() {
        return this.fichaHogarNumeroTipoServicioSanCollection;
    }

    public void setFichaHogarNumeroTipoServicioSanCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoServicioSanCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoServicioSan) {
            TipoServicioSan that = (TipoServicioSan) object;
            return numeroTipoServicioSan == null ? that.numeroTipoServicioSan == null ? 0 : -1
                    : numeroTipoServicioSan.compareTo(that.numeroTipoServicioSan);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoServicioSan == null ? 0 : numeroTipoServicioSan.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoServicioSan) {
            TipoServicioSan that = (TipoServicioSan) object;
            return ((numeroTipoServicioSan == null && that.numeroTipoServicioSan == null) ||
                    (numeroTipoServicioSan != null && numeroTipoServicioSan.equals(that.numeroTipoServicioSan)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoServicioSan;
    }
}
