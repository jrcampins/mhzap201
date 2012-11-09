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

import com.egt.base.persistence.entity.TipoValorBase;
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
@Table(name = "tipo_valor")
public class TipoValor implements TipoValorBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_valor")
    private Integer numeroTipoValor;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_valor")
    private String codigoTipoValor;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoValorNumeroTipoValor")
    private Collection<ClaseRecursoPar> claseRecursoParNumeroTipoValorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoValorNumeroTipoValorAlternativo")
    private Collection<ClaseRecursoPar> claseRecursoParNumeroTipoValorAlternativoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoValorNumeroTipoValor")
    private Collection<FuncionParametro> funcionParametroNumeroTipoValorCollection;

    public TipoValor() {
    }

    @Override
    public Integer getNumeroTipoValor() {
        return this.numeroTipoValor;
    }

    public void setNumeroTipoValor(Integer numeroTipoValor) {
        this.numeroTipoValor = numeroTipoValor;
    }

    @Override
    public String getCodigoTipoValor() {
        return this.codigoTipoValor;
    }

    public void setCodigoTipoValor(String codigoTipoValor) {
        this.codigoTipoValor = codigoTipoValor;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParNumeroTipoValorCollection() {
        return this.claseRecursoParNumeroTipoValorCollection;
    }

    public void setClaseRecursoParNumeroTipoValorCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParNumeroTipoValorCollection = collection;
    }

    @Override
    public Collection<ClaseRecursoPar> getClaseRecursoParNumeroTipoValorAlternativoCollection() {
        return this.claseRecursoParNumeroTipoValorAlternativoCollection;
    }

    public void setClaseRecursoParNumeroTipoValorAlternativoCollection(Collection<ClaseRecursoPar> collection) {
        this.claseRecursoParNumeroTipoValorAlternativoCollection = collection;
    }

    @Override
    public Collection<FuncionParametro> getFuncionParametroNumeroTipoValorCollection() {
        return this.funcionParametroNumeroTipoValorCollection;
    }

    public void setFuncionParametroNumeroTipoValorCollection(Collection<FuncionParametro> collection) {
        this.funcionParametroNumeroTipoValorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoValor) {
            TipoValor that = (TipoValor) object;
            return numeroTipoValor == null ? that.numeroTipoValor == null ? 0 : -1
                    : numeroTipoValor.compareTo(that.numeroTipoValor);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoValor == null ? 0 : numeroTipoValor.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoValor) {
            TipoValor that = (TipoValor) object;
            return ((numeroTipoValor == null && that.numeroTipoValor == null) ||
                    (numeroTipoValor != null && numeroTipoValor.equals(that.numeroTipoValor)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoValor;
    }
}
