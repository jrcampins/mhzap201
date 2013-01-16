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

import com.egt.base.persistence.entity.CondicionPensionBase;
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
@Table(name = "condicion_pension")
public class CondicionPension implements CondicionPensionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_condicion_pension")
    private Integer numeroCondicionPension;

    @Basic(optional = false)
    @Column(name = "codigo_condicion_pension")
    private String codigoCondicionPension;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionPensionNumeroCondicionPension")
    private Collection<LogProActJupe> logProActJupeNumeroCondicionPensionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionPensionNumeroCondicionPension")
    private Collection<LogProOtoPenApr> logProOtoPenAprNumeroCondicionPensionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionPensionNumeroCondicionPension")
    private Collection<LogProPreProPag> logProPreProPagNumeroCondicionPensionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionPensionNumeroCondicionPension")
    private Collection<LogProVerElePen> logProVerElePenNumeroCondicionPensionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionPensionNumeroCondicionPension")
    private Collection<Persona> personaNumeroCondicionPensionCollection;

    public CondicionPension() {
    }

    @Override
    public Integer getNumeroCondicionPension() {
        return this.numeroCondicionPension;
    }

    public void setNumeroCondicionPension(Integer numeroCondicionPension) {
        this.numeroCondicionPension = numeroCondicionPension;
    }

    @Override
    public String getCodigoCondicionPension() {
        return this.codigoCondicionPension;
    }

    public void setCodigoCondicionPension(String codigoCondicionPension) {
        this.codigoCondicionPension = codigoCondicionPension;
    }

    @Override
    public Collection<LogProActJupe> getLogProActJupeNumeroCondicionPensionCollection() {
        return this.logProActJupeNumeroCondicionPensionCollection;
    }

    public void setLogProActJupeNumeroCondicionPensionCollection(Collection<LogProActJupe> collection) {
        this.logProActJupeNumeroCondicionPensionCollection = collection;
    }

    @Override
    public Collection<LogProOtoPenApr> getLogProOtoPenAprNumeroCondicionPensionCollection() {
        return this.logProOtoPenAprNumeroCondicionPensionCollection;
    }

    public void setLogProOtoPenAprNumeroCondicionPensionCollection(Collection<LogProOtoPenApr> collection) {
        this.logProOtoPenAprNumeroCondicionPensionCollection = collection;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagNumeroCondicionPensionCollection() {
        return this.logProPreProPagNumeroCondicionPensionCollection;
    }

    public void setLogProPreProPagNumeroCondicionPensionCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagNumeroCondicionPensionCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenNumeroCondicionPensionCollection() {
        return this.logProVerElePenNumeroCondicionPensionCollection;
    }

    public void setLogProVerElePenNumeroCondicionPensionCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenNumeroCondicionPensionCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroCondicionPensionCollection() {
        return this.personaNumeroCondicionPensionCollection;
    }

    public void setPersonaNumeroCondicionPensionCollection(Collection<Persona> collection) {
        this.personaNumeroCondicionPensionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionPension) {
            CondicionPension that = (CondicionPension) object;
            return numeroCondicionPension == null ? that.numeroCondicionPension == null ? 0 : -1
                    : numeroCondicionPension.compareTo(that.numeroCondicionPension);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCondicionPension == null ? 0 : numeroCondicionPension.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionPension) {
            CondicionPension that = (CondicionPension) object;
            return ((numeroCondicionPension == null && that.numeroCondicionPension == null) ||
                    (numeroCondicionPension != null && numeroCondicionPension.equals(that.numeroCondicionPension)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCondicionPension;
    }
}
