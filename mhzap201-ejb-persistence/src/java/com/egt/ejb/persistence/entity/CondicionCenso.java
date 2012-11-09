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

import com.egt.base.persistence.entity.CondicionCensoBase;
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
@Table(name = "condicion_censo")
public class CondicionCenso implements CondicionCensoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_condicion_censo")
    private Integer numeroCondicionCenso;

    @Basic(optional = false)
    @Column(name = "codigo_condicion_censo")
    private String codigoCondicionCenso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "condicionCensoNumeroCondicionCenso")
    private Collection<PotencialBen> potencialBenNumeroCondicionCensoCollection;

    public CondicionCenso() {
    }

    @Override
    public Integer getNumeroCondicionCenso() {
        return this.numeroCondicionCenso;
    }

    public void setNumeroCondicionCenso(Integer numeroCondicionCenso) {
        this.numeroCondicionCenso = numeroCondicionCenso;
    }

    @Override
    public String getCodigoCondicionCenso() {
        return this.codigoCondicionCenso;
    }

    public void setCodigoCondicionCenso(String codigoCondicionCenso) {
        this.codigoCondicionCenso = codigoCondicionCenso;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenNumeroCondicionCensoCollection() {
        return this.potencialBenNumeroCondicionCensoCollection;
    }

    public void setPotencialBenNumeroCondicionCensoCollection(Collection<PotencialBen> collection) {
        this.potencialBenNumeroCondicionCensoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionCenso) {
            CondicionCenso that = (CondicionCenso) object;
            return numeroCondicionCenso == null ? that.numeroCondicionCenso == null ? 0 : -1
                    : numeroCondicionCenso.compareTo(that.numeroCondicionCenso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroCondicionCenso == null ? 0 : numeroCondicionCenso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof CondicionCenso) {
            CondicionCenso that = (CondicionCenso) object;
            return ((numeroCondicionCenso == null && that.numeroCondicionCenso == null) ||
                    (numeroCondicionCenso != null && numeroCondicionCenso.equals(that.numeroCondicionCenso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroCondicionCenso;
    }
}
