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

import com.egt.base.persistence.entity.TipoAbaAguaBase;
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
@Table(name = "tipo_aba_agua")
public class TipoAbaAgua implements TipoAbaAguaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_aba_agua")
    private Integer numeroTipoAbaAgua;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_aba_agua")
    private String codigoTipoAbaAgua;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAbaAguaNumeroTipoAbaAgua")
    private Collection<FichaHogar> fichaHogarNumeroTipoAbaAguaCollection;

    public TipoAbaAgua() {
    }

    @Override
    public Integer getNumeroTipoAbaAgua() {
        return this.numeroTipoAbaAgua;
    }

    public void setNumeroTipoAbaAgua(Integer numeroTipoAbaAgua) {
        this.numeroTipoAbaAgua = numeroTipoAbaAgua;
    }

    @Override
    public String getCodigoTipoAbaAgua() {
        return this.codigoTipoAbaAgua;
    }

    public void setCodigoTipoAbaAgua(String codigoTipoAbaAgua) {
        this.codigoTipoAbaAgua = codigoTipoAbaAgua;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoAbaAguaCollection() {
        return this.fichaHogarNumeroTipoAbaAguaCollection;
    }

    public void setFichaHogarNumeroTipoAbaAguaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoAbaAguaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoAbaAgua) {
            TipoAbaAgua that = (TipoAbaAgua) object;
            return numeroTipoAbaAgua == null ? that.numeroTipoAbaAgua == null ? 0 : -1
                    : numeroTipoAbaAgua.compareTo(that.numeroTipoAbaAgua);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoAbaAgua == null ? 0 : numeroTipoAbaAgua.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoAbaAgua) {
            TipoAbaAgua that = (TipoAbaAgua) object;
            return ((numeroTipoAbaAgua == null && that.numeroTipoAbaAgua == null) ||
                    (numeroTipoAbaAgua != null && numeroTipoAbaAgua.equals(that.numeroTipoAbaAgua)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoAbaAgua;
    }
}
