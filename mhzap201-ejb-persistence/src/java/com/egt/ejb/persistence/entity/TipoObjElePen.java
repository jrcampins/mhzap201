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

import com.egt.base.persistence.entity.TipoObjElePenBase;
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
@Table(name = "tipo_obj_ele_pen")
public class TipoObjElePen implements TipoObjElePenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_obj_ele_pen")
    private Integer numeroTipoObjElePen;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_obj_ele_pen")
    private String codigoTipoObjElePen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoObjElePenNumeroTipoObjElePen")
    private Collection<ObjecionElePen> objecionElePenNumeroTipoObjElePenCollection;

    public TipoObjElePen() {
    }

    @Override
    public Integer getNumeroTipoObjElePen() {
        return this.numeroTipoObjElePen;
    }

    public void setNumeroTipoObjElePen(Integer numeroTipoObjElePen) {
        this.numeroTipoObjElePen = numeroTipoObjElePen;
    }

    @Override
    public String getCodigoTipoObjElePen() {
        return this.codigoTipoObjElePen;
    }

    public void setCodigoTipoObjElePen(String codigoTipoObjElePen) {
        this.codigoTipoObjElePen = codigoTipoObjElePen;
    }

    @Override
    public Collection<ObjecionElePen> getObjecionElePenNumeroTipoObjElePenCollection() {
        return this.objecionElePenNumeroTipoObjElePenCollection;
    }

    public void setObjecionElePenNumeroTipoObjElePenCollection(Collection<ObjecionElePen> collection) {
        this.objecionElePenNumeroTipoObjElePenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoObjElePen) {
            TipoObjElePen that = (TipoObjElePen) object;
            return numeroTipoObjElePen == null ? that.numeroTipoObjElePen == null ? 0 : -1
                    : numeroTipoObjElePen.compareTo(that.numeroTipoObjElePen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoObjElePen == null ? 0 : numeroTipoObjElePen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoObjElePen) {
            TipoObjElePen that = (TipoObjElePen) object;
            return ((numeroTipoObjElePen == null && that.numeroTipoObjElePen == null) ||
                    (numeroTipoObjElePen != null && numeroTipoObjElePen.equals(that.numeroTipoObjElePen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoObjElePen;
    }
}
