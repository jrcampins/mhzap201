/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.TipoParametroBase;
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
@Table(name = "tipo_parametro")
public class TipoParametro implements TipoParametroBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_parametro")
    private Integer numeroTipoParametro;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_parametro")
    private String codigoTipoParametro;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoParametroNumeroTipoParametro")
    private Collection<ClaseRecursoPar> claseRecursoParNumeroTipoParametroCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoParametroNumeroTipoParametro")
    private Collection<FuncionParametro> funcionParametroNumeroTipoParametroCollection;

    public TipoParametro() {
    }

    @Override
    public Integer getNumeroTipoParametro() {
        return this.numeroTipoParametro;
    }

    public void setNumeroTipoParametro(Integer numeroTipoParametro) {
        this.numeroTipoParametro = numeroTipoParametro;
    }

    @Override
    public String getCodigoTipoParametro() {
        return this.codigoTipoParametro;
    }

    public void setCodigoTipoParametro(String codigoTipoParametro) {
        this.codigoTipoParametro = codigoTipoParametro;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParNumeroTipoParametroCollection() {
        return this.claseRecursoParNumeroTipoParametroCollection;
    }

    public void setClaseRecursoParNumeroTipoParametroCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParNumeroTipoParametroCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroNumeroTipoParametroCollection() {
        return this.funcionParametroNumeroTipoParametroCollection;
    }

    public void setFuncionParametroNumeroTipoParametroCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroNumeroTipoParametroCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoParametro) {
            TipoParametro that = (TipoParametro) object;
            return numeroTipoParametro == null ? that.numeroTipoParametro == null ? 0 : -1
                    : numeroTipoParametro.compareTo(that.numeroTipoParametro);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoParametro == null ? 0 : numeroTipoParametro.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoParametro) {
            TipoParametro that = (TipoParametro) object;
            return ((numeroTipoParametro == null && that.numeroTipoParametro == null) ||
                    (numeroTipoParametro != null && numeroTipoParametro.equals(that.numeroTipoParametro)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoParametro;
    }
}
