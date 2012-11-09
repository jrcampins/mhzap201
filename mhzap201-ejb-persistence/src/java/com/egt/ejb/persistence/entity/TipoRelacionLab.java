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

import com.egt.base.persistence.entity.TipoRelacionLabBase;
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
@Table(name = "tipo_relacion_lab")
public class TipoRelacionLab implements TipoRelacionLabBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_relacion_lab")
    private Integer numeroTipoRelacionLab;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_relacion_lab")
    private String codigoTipoRelacionLab;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoRelacionLabNumeroTipoRelacionLab")
    private Collection<FichaPersona> fichaPersonaNumeroTipoRelacionLabCollection;

    public TipoRelacionLab() {
    }

    @Override
    public Integer getNumeroTipoRelacionLab() {
        return this.numeroTipoRelacionLab;
    }

    public void setNumeroTipoRelacionLab(Integer numeroTipoRelacionLab) {
        this.numeroTipoRelacionLab = numeroTipoRelacionLab;
    }

    @Override
    public String getCodigoTipoRelacionLab() {
        return this.codigoTipoRelacionLab;
    }

    public void setCodigoTipoRelacionLab(String codigoTipoRelacionLab) {
        this.codigoTipoRelacionLab = codigoTipoRelacionLab;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroTipoRelacionLabCollection() {
        return this.fichaPersonaNumeroTipoRelacionLabCollection;
    }

    public void setFichaPersonaNumeroTipoRelacionLabCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroTipoRelacionLabCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRelacionLab) {
            TipoRelacionLab that = (TipoRelacionLab) object;
            return numeroTipoRelacionLab == null ? that.numeroTipoRelacionLab == null ? 0 : -1
                    : numeroTipoRelacionLab.compareTo(that.numeroTipoRelacionLab);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoRelacionLab == null ? 0 : numeroTipoRelacionLab.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoRelacionLab) {
            TipoRelacionLab that = (TipoRelacionLab) object;
            return ((numeroTipoRelacionLab == null && that.numeroTipoRelacionLab == null) ||
                    (numeroTipoRelacionLab != null && numeroTipoRelacionLab.equals(that.numeroTipoRelacionLab)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoRelacionLab;
    }
}
