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

import com.egt.base.persistence.entity.DominioParametroBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dominio_parametro")
public class DominioParametro implements DominioParametroBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_dominio_parametro")
    private Long idDominioParametro;

    @Basic(optional = false)
    @Column(name = "version_dominio_parametro")
    private long versionDominioParametro;

    @Column(name = "etiqueta_parametro")
    private String etiquetaParametro;

    @JoinColumn(name = "id_dominio", referencedColumnName = "id_dominio")
    @ManyToOne
    private Dominio dominioIdDominio;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne
    private Parametro parametroIdParametro;

    @JoinColumn(name = "numero_tipo_parametro_dom", referencedColumnName = "numero_tipo_parametro_dom")
    @ManyToOne
    private TipoParametroDom tipoParametroDomNumeroTipoParametroDom;

    public DominioParametro() {
    }

    @Override
    public Long getIdDominioParametro() {
        return this.idDominioParametro;
    }

    public void setIdDominioParametro(Long idDominioParametro) {
        this.idDominioParametro = idDominioParametro;
    }

    @Override
    public long getVersionDominioParametro() {
        return this.versionDominioParametro;
    }

    public void setVersionDominioParametro(long versionDominioParametro) {
        this.versionDominioParametro = versionDominioParametro;
    }

    @Override
    public String getEtiquetaParametro() {
        return this.etiquetaParametro;
    }

    public void setEtiquetaParametro(String etiquetaParametro) {
        this.etiquetaParametro = etiquetaParametro;
    }

    @Override
    public Dominio getDominioIdDominio() {
        return this.dominioIdDominio;
    }

    public void setDominioIdDominio(Dominio dominio) {
        this.dominioIdDominio = dominio;
    }

    @Override
    public Parametro getParametroIdParametro() {
        return this.parametroIdParametro;
    }

    public void setParametroIdParametro(Parametro parametro) {
        this.parametroIdParametro = parametro;
    }

    @Override
    public TipoParametroDom getTipoParametroDomNumeroTipoParametroDom() {
        return this.tipoParametroDomNumeroTipoParametroDom;
    }

    public void setTipoParametroDomNumeroTipoParametroDom(TipoParametroDom tipoParametroDom) {
        this.tipoParametroDomNumeroTipoParametroDom = tipoParametroDom;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof DominioParametro) {
            DominioParametro that = (DominioParametro) object;
            return idDominioParametro == null ? that.idDominioParametro == null ? 0 : -1
                    : idDominioParametro.compareTo(that.idDominioParametro);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idDominioParametro == null ? 0 : idDominioParametro.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof DominioParametro) {
            DominioParametro that = (DominioParametro) object;
            return ((idDominioParametro == null && that.idDominioParametro == null) ||
                    (idDominioParametro != null && idDominioParametro.equals(that.idDominioParametro)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idDominioParametro;
    }
}
