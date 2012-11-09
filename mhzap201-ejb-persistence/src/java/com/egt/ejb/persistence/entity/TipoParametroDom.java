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

import com.egt.base.persistence.entity.TipoParametroDomBase;
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
@Table(name = "tipo_parametro_dom")
public class TipoParametroDom implements TipoParametroDomBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_parametro_dom")
    private Integer numeroTipoParametroDom;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_parametro_dom")
    private String codigoTipoParametroDom;

    @Basic(optional = false)
    @Column(name = "codigo_propiedad_interfaz")
    private String codigoPropiedadInterfaz;

    @Basic(optional = false)
    @Column(name = "nombre_interfaz")
    private String nombreInterfaz;

    @Basic(optional = false)
    @Column(name = "etiqueta_parametro")
    private String etiquetaParametro;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoParametroDomNumeroTipoParametroDom")
    private Collection<DominioParametro> dominioParametroNumeroTipoParametroDomCollection;

    public TipoParametroDom() {
    }

    @Override
    public Integer getNumeroTipoParametroDom() {
        return this.numeroTipoParametroDom;
    }

    public void setNumeroTipoParametroDom(Integer numeroTipoParametroDom) {
        this.numeroTipoParametroDom = numeroTipoParametroDom;
    }

    @Override
    public String getCodigoTipoParametroDom() {
        return this.codigoTipoParametroDom;
    }

    public void setCodigoTipoParametroDom(String codigoTipoParametroDom) {
        this.codigoTipoParametroDom = codigoTipoParametroDom;
    }

    @Override
    public String getCodigoPropiedadInterfaz() {
        return this.codigoPropiedadInterfaz;
    }

    public void setCodigoPropiedadInterfaz(String codigoPropiedadInterfaz) {
        this.codigoPropiedadInterfaz = codigoPropiedadInterfaz;
    }

    @Override
    public String getNombreInterfaz() {
        return this.nombreInterfaz;
    }

    public void setNombreInterfaz(String nombreInterfaz) {
        this.nombreInterfaz = nombreInterfaz;
    }

    @Override
    public String getEtiquetaParametro() {
        return this.etiquetaParametro;
    }

    public void setEtiquetaParametro(String etiquetaParametro) {
        this.etiquetaParametro = etiquetaParametro;
    }

    @Override
    public Collection<DominioParametro> getDominioParametroNumeroTipoParametroDomCollection() {
        return this.dominioParametroNumeroTipoParametroDomCollection;
    }

    public void setDominioParametroNumeroTipoParametroDomCollection(Collection<DominioParametro> collection) {
        this.dominioParametroNumeroTipoParametroDomCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoParametroDom) {
            TipoParametroDom that = (TipoParametroDom) object;
            return numeroTipoParametroDom == null ? that.numeroTipoParametroDom == null ? 0 : -1
                    : numeroTipoParametroDom.compareTo(that.numeroTipoParametroDom);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoParametroDom == null ? 0 : numeroTipoParametroDom.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoParametroDom) {
            TipoParametroDom that = (TipoParametroDom) object;
            return ((numeroTipoParametroDom == null && that.numeroTipoParametroDom == null) ||
                    (numeroTipoParametroDom != null && numeroTipoParametroDom.equals(that.numeroTipoParametroDom)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoParametroDom;
    }
}
