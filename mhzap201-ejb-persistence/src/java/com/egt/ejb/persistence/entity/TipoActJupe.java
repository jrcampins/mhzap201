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

import com.egt.base.persistence.entity.TipoActJupeBase;
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
@Table(name = "tipo_act_jupe")
public class TipoActJupe implements TipoActJupeBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_act_jupe")
    private Integer numeroTipoActJupe;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_act_jupe")
    private String codigoTipoActJupe;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoActJupeNumeroTipoActJupe")
    private Collection<Persona> personaNumeroTipoActJupeCollection;

    public TipoActJupe() {
    }

    @Override
    public Integer getNumeroTipoActJupe() {
        return this.numeroTipoActJupe;
    }

    public void setNumeroTipoActJupe(Integer numeroTipoActJupe) {
        this.numeroTipoActJupe = numeroTipoActJupe;
    }

    @Override
    public String getCodigoTipoActJupe() {
        return this.codigoTipoActJupe;
    }

    public void setCodigoTipoActJupe(String codigoTipoActJupe) {
        this.codigoTipoActJupe = codigoTipoActJupe;
    }

    @Override
    public Collection<Persona> getPersonaNumeroTipoActJupeCollection() {
        return this.personaNumeroTipoActJupeCollection;
    }

    public void setPersonaNumeroTipoActJupeCollection(Collection<Persona> collection) {
        this.personaNumeroTipoActJupeCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoActJupe) {
            TipoActJupe that = (TipoActJupe) object;
            return numeroTipoActJupe == null ? that.numeroTipoActJupe == null ? 0 : -1
                    : numeroTipoActJupe.compareTo(that.numeroTipoActJupe);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoActJupe == null ? 0 : numeroTipoActJupe.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoActJupe) {
            TipoActJupe that = (TipoActJupe) object;
            return ((numeroTipoActJupe == null && that.numeroTipoActJupe == null) ||
                    (numeroTipoActJupe != null && numeroTipoActJupe.equals(that.numeroTipoActJupe)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoActJupe;
    }
}
