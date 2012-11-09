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

import com.egt.base.persistence.entity.ElementoSegmentoBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "elemento_segmento")
public class ElementoSegmento implements ElementoSegmentoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_elemento_segmento")
    private Long idElementoSegmento;

    @Basic(optional = false)
    @Column(name = "version_elemento_segmento")
    private long versionElementoSegmento;

    @Basic(optional = false)
    @Column(name = "id_segmento")
    private long idSegmento;

    @Column(name = "valor_segmento")
    private String valorSegmento;

    @Column(name = "significado_segmento")
    private String significadoSegmento;

    @JoinColumn(name = "id_conjunto_segmento", referencedColumnName = "id_conjunto_segmento")
    @ManyToOne
    private ConjuntoSegmento conjuntoSegmentoIdConjuntoSegmento;

    public ElementoSegmento() {
    }

    @Override
    public Long getIdElementoSegmento() {
        return this.idElementoSegmento;
    }

    public void setIdElementoSegmento(Long idElementoSegmento) {
        this.idElementoSegmento = idElementoSegmento;
    }

    @Override
    public long getVersionElementoSegmento() {
        return this.versionElementoSegmento;
    }

    public void setVersionElementoSegmento(long versionElementoSegmento) {
        this.versionElementoSegmento = versionElementoSegmento;
    }

    @Override
    public long getIdSegmento() {
        return this.idSegmento;
    }

    public void setIdSegmento(long idSegmento) {
        this.idSegmento = idSegmento;
    }

    @Override
    public String getValorSegmento() {
        return this.valorSegmento;
    }

    public void setValorSegmento(String valorSegmento) {
        this.valorSegmento = valorSegmento;
    }

    @Override
    public String getSignificadoSegmento() {
        return this.significadoSegmento;
    }

    public void setSignificadoSegmento(String significadoSegmento) {
        this.significadoSegmento = significadoSegmento;
    }

    @Override
    public ConjuntoSegmento getConjuntoSegmentoIdConjuntoSegmento() {
        return this.conjuntoSegmentoIdConjuntoSegmento;
    }

    public void setConjuntoSegmentoIdConjuntoSegmento(ConjuntoSegmento conjuntoSegmento) {
        this.conjuntoSegmentoIdConjuntoSegmento = conjuntoSegmento;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ElementoSegmento) {
            ElementoSegmento that = (ElementoSegmento) object;
            return idElementoSegmento == null ? that.idElementoSegmento == null ? 0 : -1
                    : idElementoSegmento.compareTo(that.idElementoSegmento);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idElementoSegmento == null ? 0 : idElementoSegmento.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ElementoSegmento) {
            ElementoSegmento that = (ElementoSegmento) object;
            return ((idElementoSegmento == null && that.idElementoSegmento == null) ||
                    (idElementoSegmento != null && idElementoSegmento.equals(that.idElementoSegmento)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idElementoSegmento;
    }
}
