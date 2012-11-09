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

import com.egt.base.persistence.entity.TipoMatTechoBase;
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
@Table(name = "tipo_mat_techo")
public class TipoMatTecho implements TipoMatTechoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_mat_techo")
    private Integer numeroTipoMatTecho;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_mat_techo")
    private String codigoTipoMatTecho;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoMatTechoNumeroTipoMatTecho")
    private Collection<FichaHogar> fichaHogarNumeroTipoMatTechoCollection;

    public TipoMatTecho() {
    }

    @Override
    public Integer getNumeroTipoMatTecho() {
        return this.numeroTipoMatTecho;
    }

    public void setNumeroTipoMatTecho(Integer numeroTipoMatTecho) {
        this.numeroTipoMatTecho = numeroTipoMatTecho;
    }

    @Override
    public String getCodigoTipoMatTecho() {
        return this.codigoTipoMatTecho;
    }

    public void setCodigoTipoMatTecho(String codigoTipoMatTecho) {
        this.codigoTipoMatTecho = codigoTipoMatTecho;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoMatTechoCollection() {
        return this.fichaHogarNumeroTipoMatTechoCollection;
    }

    public void setFichaHogarNumeroTipoMatTechoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoMatTechoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatTecho) {
            TipoMatTecho that = (TipoMatTecho) object;
            return numeroTipoMatTecho == null ? that.numeroTipoMatTecho == null ? 0 : -1
                    : numeroTipoMatTecho.compareTo(that.numeroTipoMatTecho);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoMatTecho == null ? 0 : numeroTipoMatTecho.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatTecho) {
            TipoMatTecho that = (TipoMatTecho) object;
            return ((numeroTipoMatTecho == null && that.numeroTipoMatTecho == null) ||
                    (numeroTipoMatTecho != null && numeroTipoMatTecho.equals(that.numeroTipoMatTecho)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoMatTecho;
    }
}
