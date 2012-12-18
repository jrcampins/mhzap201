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

import com.egt.base.persistence.entity.CondicionDenuPenBase;
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
@Table(name = "condicion_denu_pen")
public class CondicionDenuPen implements CondicionDenuPenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_condicion_denu_pen")
    private Integer numeroCondicionDenuPen;

    @Basic(optional = false)
    @Column(name = "codigo_condicion_denu_pen")
    private String codigoCondicionDenuPen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionDenuPenNumeroCondicionDenuPen")
    private Collection<LogProPreProPag> logProPreProPagNumeroCondicionDenuPenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionDenuPenNumeroCondicionDenuPen")
    private Collection<LogProVerElePen> logProVerElePenNumeroCondicionDenuPenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionDenuPenNumeroCondicionDenuPen")
    private Collection<Persona> personaNumeroCondicionDenuPenCollection;

    public CondicionDenuPen() {
    }

    @Override
    public Integer getNumeroCondicionDenuPen() {
        return this.numeroCondicionDenuPen;
    }

    public void setNumeroCondicionDenuPen(Integer numeroCondicionDenuPen) {
        this.numeroCondicionDenuPen = numeroCondicionDenuPen;
    }

    @Override
    public String getCodigoCondicionDenuPen() {
        return this.codigoCondicionDenuPen;
    }

    public void setCodigoCondicionDenuPen(String codigoCondicionDenuPen) {
        this.codigoCondicionDenuPen = codigoCondicionDenuPen;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagNumeroCondicionDenuPenCollection() {
        return this.logProPreProPagNumeroCondicionDenuPenCollection;
    }

    public void setLogProPreProPagNumeroCondicionDenuPenCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagNumeroCondicionDenuPenCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenNumeroCondicionDenuPenCollection() {
        return this.logProVerElePenNumeroCondicionDenuPenCollection;
    }

    public void setLogProVerElePenNumeroCondicionDenuPenCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenNumeroCondicionDenuPenCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCondicionDenuPenCollection() {
        return this.personaNumeroCondicionDenuPenCollection;
    }

    public void setPersonaNumeroCondicionDenuPenCollection(Collection<Persona> collection) {
        this.personaNumeroCondicionDenuPenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionDenuPen) {
            CondicionDenuPen that = (CondicionDenuPen) object;
            return numeroCondicionDenuPen == null ? that.numeroCondicionDenuPen == null ? 0 : -1
                    : numeroCondicionDenuPen.compareTo(that.numeroCondicionDenuPen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCondicionDenuPen == null ? 0 : numeroCondicionDenuPen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionDenuPen) {
            CondicionDenuPen that = (CondicionDenuPen) object;
            return ((numeroCondicionDenuPen == null && that.numeroCondicionDenuPen == null) ||
                    (numeroCondicionDenuPen != null && numeroCondicionDenuPen.equals(that.numeroCondicionDenuPen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCondicionDenuPen;
    }
}
