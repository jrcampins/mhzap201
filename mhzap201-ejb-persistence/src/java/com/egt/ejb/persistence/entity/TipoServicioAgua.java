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

import com.egt.base.persistence.entity.TipoServicioAguaBase;
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
@Table(name = "tipo_servicio_agua")
public class TipoServicioAgua implements TipoServicioAguaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_servicio_agua")
    private Integer numeroTipoServicioAgua;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_servicio_agua")
    private String codigoTipoServicioAgua;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoServicioAguaNumeroTipoServicioAgua")
    private Collection<FichaHogar> fichaHogarNumeroTipoServicioAguaCollection;

    public TipoServicioAgua() {
    }

    @Override
    public Integer getNumeroTipoServicioAgua() {
        return this.numeroTipoServicioAgua;
    }

    public void setNumeroTipoServicioAgua(Integer numeroTipoServicioAgua) {
        this.numeroTipoServicioAgua = numeroTipoServicioAgua;
    }

    @Override
    public String getCodigoTipoServicioAgua() {
        return this.codigoTipoServicioAgua;
    }

    public void setCodigoTipoServicioAgua(String codigoTipoServicioAgua) {
        this.codigoTipoServicioAgua = codigoTipoServicioAgua;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoServicioAguaCollection() {
        return this.fichaHogarNumeroTipoServicioAguaCollection;
    }

    public void setFichaHogarNumeroTipoServicioAguaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoServicioAguaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoServicioAgua) {
            TipoServicioAgua that = (TipoServicioAgua) object;
            return numeroTipoServicioAgua == null ? that.numeroTipoServicioAgua == null ? 0 : -1
                    : numeroTipoServicioAgua.compareTo(that.numeroTipoServicioAgua);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoServicioAgua == null ? 0 : numeroTipoServicioAgua.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoServicioAgua) {
            TipoServicioAgua that = (TipoServicioAgua) object;
            return ((numeroTipoServicioAgua == null && that.numeroTipoServicioAgua == null) ||
                    (numeroTipoServicioAgua != null && numeroTipoServicioAgua.equals(that.numeroTipoServicioAgua)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoServicioAgua;
    }
}
