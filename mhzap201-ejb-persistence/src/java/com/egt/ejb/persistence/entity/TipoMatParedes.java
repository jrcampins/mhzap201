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

import com.egt.base.persistence.entity.TipoMatParedesBase;
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
@Table(name = "tipo_mat_paredes")
public class TipoMatParedes implements TipoMatParedesBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_mat_paredes")
    private Integer numeroTipoMatParedes;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_mat_paredes")
    private String codigoTipoMatParedes;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoMatParedesNumeroTipoMatParedes")
    private Collection<FichaHogar> fichaHogarNumeroTipoMatParedesCollection;

    public TipoMatParedes() {
    }

    @Override
    public Integer getNumeroTipoMatParedes() {
        return this.numeroTipoMatParedes;
    }

    public void setNumeroTipoMatParedes(Integer numeroTipoMatParedes) {
        this.numeroTipoMatParedes = numeroTipoMatParedes;
    }

    @Override
    public String getCodigoTipoMatParedes() {
        return this.codigoTipoMatParedes;
    }

    public void setCodigoTipoMatParedes(String codigoTipoMatParedes) {
        this.codigoTipoMatParedes = codigoTipoMatParedes;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoMatParedesCollection() {
        return this.fichaHogarNumeroTipoMatParedesCollection;
    }

    public void setFichaHogarNumeroTipoMatParedesCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoMatParedesCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatParedes) {
            TipoMatParedes that = (TipoMatParedes) object;
            return numeroTipoMatParedes == null ? that.numeroTipoMatParedes == null ? 0 : -1
                    : numeroTipoMatParedes.compareTo(that.numeroTipoMatParedes);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoMatParedes == null ? 0 : numeroTipoMatParedes.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoMatParedes) {
            TipoMatParedes that = (TipoMatParedes) object;
            return ((numeroTipoMatParedes == null && that.numeroTipoMatParedes == null) ||
                    (numeroTipoMatParedes != null && numeroTipoMatParedes.equals(that.numeroTipoMatParedes)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoMatParedes;
    }
}
