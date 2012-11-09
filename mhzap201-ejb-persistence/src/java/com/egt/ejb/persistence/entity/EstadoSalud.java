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

import com.egt.base.persistence.entity.EstadoSaludBase;
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
@Table(name = "estado_salud")
public class EstadoSalud implements EstadoSaludBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_estado_salud")
    private Integer numeroEstadoSalud;

    @Basic(optional = false)
    @Column(name = "codigo_estado_salud")
    private String codigoEstadoSalud;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "estadoSaludNumeroEstadoSalud")
    private Collection<FichaPersona> fichaPersonaNumeroEstadoSaludCollection;

    public EstadoSalud() {
    }

    @Override
    public Integer getNumeroEstadoSalud() {
        return this.numeroEstadoSalud;
    }

    public void setNumeroEstadoSalud(Integer numeroEstadoSalud) {
        this.numeroEstadoSalud = numeroEstadoSalud;
    }

    @Override
    public String getCodigoEstadoSalud() {
        return this.codigoEstadoSalud;
    }

    public void setCodigoEstadoSalud(String codigoEstadoSalud) {
        this.codigoEstadoSalud = codigoEstadoSalud;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroEstadoSaludCollection() {
        return this.fichaPersonaNumeroEstadoSaludCollection;
    }

    public void setFichaPersonaNumeroEstadoSaludCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroEstadoSaludCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EstadoSalud) {
            EstadoSalud that = (EstadoSalud) object;
            return numeroEstadoSalud == null ? that.numeroEstadoSalud == null ? 0 : -1
                    : numeroEstadoSalud.compareTo(that.numeroEstadoSalud);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroEstadoSalud == null ? 0 : numeroEstadoSalud.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof EstadoSalud) {
            EstadoSalud that = (EstadoSalud) object;
            return ((numeroEstadoSalud == null && that.numeroEstadoSalud == null) ||
                    (numeroEstadoSalud != null && numeroEstadoSalud.equals(that.numeroEstadoSalud)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroEstadoSalud;
    }
}
