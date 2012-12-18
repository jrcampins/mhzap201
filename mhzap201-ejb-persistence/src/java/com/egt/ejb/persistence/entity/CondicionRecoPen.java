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

import com.egt.base.persistence.entity.CondicionRecoPenBase;
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
@Table(name = "condicion_reco_pen")
public class CondicionRecoPen implements CondicionRecoPenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_condicion_reco_pen")
    private Integer numeroCondicionRecoPen;

    @Basic(optional = false)
    @Column(name = "codigo_condicion_reco_pen")
    private String codigoCondicionRecoPen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionRecoPenNumeroCondicionRecoPen")
    private Collection<LogProPreProPag> logProPreProPagNumeroCondicionRecoPenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionRecoPenNumeroCondicionRecoPen")
    private Collection<LogProVerElePen> logProVerElePenNumeroCondicionRecoPenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionRecoPenNumeroCondicionRecoPen")
    private Collection<Persona> personaNumeroCondicionRecoPenCollection;

    public CondicionRecoPen() {
    }

    @Override
    public Integer getNumeroCondicionRecoPen() {
        return this.numeroCondicionRecoPen;
    }

    public void setNumeroCondicionRecoPen(Integer numeroCondicionRecoPen) {
        this.numeroCondicionRecoPen = numeroCondicionRecoPen;
    }

    @Override
    public String getCodigoCondicionRecoPen() {
        return this.codigoCondicionRecoPen;
    }

    public void setCodigoCondicionRecoPen(String codigoCondicionRecoPen) {
        this.codigoCondicionRecoPen = codigoCondicionRecoPen;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagNumeroCondicionRecoPenCollection() {
        return this.logProPreProPagNumeroCondicionRecoPenCollection;
    }

    public void setLogProPreProPagNumeroCondicionRecoPenCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagNumeroCondicionRecoPenCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenNumeroCondicionRecoPenCollection() {
        return this.logProVerElePenNumeroCondicionRecoPenCollection;
    }

    public void setLogProVerElePenNumeroCondicionRecoPenCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenNumeroCondicionRecoPenCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCondicionRecoPenCollection() {
        return this.personaNumeroCondicionRecoPenCollection;
    }

    public void setPersonaNumeroCondicionRecoPenCollection(Collection<Persona> collection) {
        this.personaNumeroCondicionRecoPenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionRecoPen) {
            CondicionRecoPen that = (CondicionRecoPen) object;
            return numeroCondicionRecoPen == null ? that.numeroCondicionRecoPen == null ? 0 : -1
                    : numeroCondicionRecoPen.compareTo(that.numeroCondicionRecoPen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCondicionRecoPen == null ? 0 : numeroCondicionRecoPen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionRecoPen) {
            CondicionRecoPen that = (CondicionRecoPen) object;
            return ((numeroCondicionRecoPen == null && that.numeroCondicionRecoPen == null) ||
                    (numeroCondicionRecoPen != null && numeroCondicionRecoPen.equals(that.numeroCondicionRecoPen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCondicionRecoPen;
    }
}
