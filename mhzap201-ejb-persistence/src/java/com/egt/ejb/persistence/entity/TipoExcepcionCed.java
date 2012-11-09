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

import com.egt.base.persistence.entity.TipoExcepcionCedBase;
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
@Table(name = "tipo_excepcion_ced")
public class TipoExcepcionCed implements TipoExcepcionCedBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_excepcion_ced")
    private Integer numeroTipoExcepcionCed;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_excepcion_ced")
    private String codigoTipoExcepcionCed;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoExcepcionCedNumeroTipoExcepcionCed")
    private Collection<FichaPersona> fichaPersonaNumeroTipoExcepcionCedCollection;

    public TipoExcepcionCed() {
    }

    @Override
    public Integer getNumeroTipoExcepcionCed() {
        return this.numeroTipoExcepcionCed;
    }

    public void setNumeroTipoExcepcionCed(Integer numeroTipoExcepcionCed) {
        this.numeroTipoExcepcionCed = numeroTipoExcepcionCed;
    }

    @Override
    public String getCodigoTipoExcepcionCed() {
        return this.codigoTipoExcepcionCed;
    }

    public void setCodigoTipoExcepcionCed(String codigoTipoExcepcionCed) {
        this.codigoTipoExcepcionCed = codigoTipoExcepcionCed;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroTipoExcepcionCedCollection() {
        return this.fichaPersonaNumeroTipoExcepcionCedCollection;
    }

    public void setFichaPersonaNumeroTipoExcepcionCedCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroTipoExcepcionCedCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoExcepcionCed) {
            TipoExcepcionCed that = (TipoExcepcionCed) object;
            return numeroTipoExcepcionCed == null ? that.numeroTipoExcepcionCed == null ? 0 : -1
                    : numeroTipoExcepcionCed.compareTo(that.numeroTipoExcepcionCed);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoExcepcionCed == null ? 0 : numeroTipoExcepcionCed.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoExcepcionCed) {
            TipoExcepcionCed that = (TipoExcepcionCed) object;
            return ((numeroTipoExcepcionCed == null && that.numeroTipoExcepcionCed == null) ||
                    (numeroTipoExcepcionCed != null && numeroTipoExcepcionCed.equals(that.numeroTipoExcepcionCed)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoExcepcionCed;
    }
}
