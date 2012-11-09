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

import com.egt.base.persistence.entity.TipoMatPisoBase;
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
@Table(name = "tipo_mat_piso")
public class TipoMatPiso implements TipoMatPisoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_mat_piso")
    private Integer numeroTipoMatPiso;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_mat_piso")
    private String codigoTipoMatPiso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoMatPisoNumeroTipoMatPiso")
    private Collection<FichaHogar> fichaHogarNumeroTipoMatPisoCollection;

    public TipoMatPiso() {
    }

    @Override
    public Integer getNumeroTipoMatPiso() {
        return this.numeroTipoMatPiso;
    }

    public void setNumeroTipoMatPiso(Integer numeroTipoMatPiso) {
        this.numeroTipoMatPiso = numeroTipoMatPiso;
    }

    @Override
    public String getCodigoTipoMatPiso() {
        return this.codigoTipoMatPiso;
    }

    public void setCodigoTipoMatPiso(String codigoTipoMatPiso) {
        this.codigoTipoMatPiso = codigoTipoMatPiso;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoMatPisoCollection() {
        return this.fichaHogarNumeroTipoMatPisoCollection;
    }

    public void setFichaHogarNumeroTipoMatPisoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoMatPisoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatPiso) {
            TipoMatPiso that = (TipoMatPiso) object;
            return numeroTipoMatPiso == null ? that.numeroTipoMatPiso == null ? 0 : -1
                    : numeroTipoMatPiso.compareTo(that.numeroTipoMatPiso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoMatPiso == null ? 0 : numeroTipoMatPiso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatPiso) {
            TipoMatPiso that = (TipoMatPiso) object;
            return ((numeroTipoMatPiso == null && that.numeroTipoMatPiso == null) ||
                    (numeroTipoMatPiso != null && numeroTipoMatPiso.equals(that.numeroTipoMatPiso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoMatPiso;
    }
}
