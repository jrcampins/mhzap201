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

import com.egt.base.persistence.entity.TipoPersonaHogarBase;
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
@Table(name = "tipo_persona_hogar")
public class TipoPersonaHogar implements TipoPersonaHogarBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_persona_hogar")
    private Integer numeroTipoPersonaHogar;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_persona_hogar")
    private String codigoTipoPersonaHogar;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoPersonaHogarNumeroTipoPersonaHogar")
    private Collection<FichaPersona> fichaPersonaNumeroTipoPersonaHogarCollection;

    public TipoPersonaHogar() {
    }

    @Override
    public Integer getNumeroTipoPersonaHogar() {
        return this.numeroTipoPersonaHogar;
    }

    public void setNumeroTipoPersonaHogar(Integer numeroTipoPersonaHogar) {
        this.numeroTipoPersonaHogar = numeroTipoPersonaHogar;
    }

    @Override
    public String getCodigoTipoPersonaHogar() {
        return this.codigoTipoPersonaHogar;
    }

    public void setCodigoTipoPersonaHogar(String codigoTipoPersonaHogar) {
        this.codigoTipoPersonaHogar = codigoTipoPersonaHogar;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroTipoPersonaHogarCollection() {
        return this.fichaPersonaNumeroTipoPersonaHogarCollection;
    }

    public void setFichaPersonaNumeroTipoPersonaHogarCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroTipoPersonaHogarCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPersonaHogar) {
            TipoPersonaHogar that = (TipoPersonaHogar) object;
            return numeroTipoPersonaHogar == null ? that.numeroTipoPersonaHogar == null ? 0 : -1
                    : numeroTipoPersonaHogar.compareTo(that.numeroTipoPersonaHogar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoPersonaHogar == null ? 0 : numeroTipoPersonaHogar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoPersonaHogar) {
            TipoPersonaHogar that = (TipoPersonaHogar) object;
            return ((numeroTipoPersonaHogar == null && that.numeroTipoPersonaHogar == null) ||
                    (numeroTipoPersonaHogar != null && numeroTipoPersonaHogar.equals(that.numeroTipoPersonaHogar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoPersonaHogar;
    }
}
