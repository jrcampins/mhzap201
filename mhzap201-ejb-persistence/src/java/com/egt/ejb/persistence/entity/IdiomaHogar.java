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

import com.egt.base.persistence.entity.IdiomaHogarBase;
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
@Table(name = "idioma_hogar")
public class IdiomaHogar implements IdiomaHogarBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_idioma_hogar")
    private Integer numeroIdiomaHogar;

    @Basic(optional = false)
    @Column(name = "codigo_idioma_hogar")
    private String codigoIdiomaHogar;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "idiomaHogarNumeroIdiomaHogar")
    private Collection<FichaPersona> fichaPersonaNumeroIdiomaHogarCollection;

    public IdiomaHogar() {
    }

    @Override
    public Integer getNumeroIdiomaHogar() {
        return this.numeroIdiomaHogar;
    }

    public void setNumeroIdiomaHogar(Integer numeroIdiomaHogar) {
        this.numeroIdiomaHogar = numeroIdiomaHogar;
    }

    @Override
    public String getCodigoIdiomaHogar() {
        return this.codigoIdiomaHogar;
    }

    public void setCodigoIdiomaHogar(String codigoIdiomaHogar) {
        this.codigoIdiomaHogar = codigoIdiomaHogar;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroIdiomaHogarCollection() {
        return this.fichaPersonaNumeroIdiomaHogarCollection;
    }

    public void setFichaPersonaNumeroIdiomaHogarCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroIdiomaHogarCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof IdiomaHogar) {
            IdiomaHogar that = (IdiomaHogar) object;
            return numeroIdiomaHogar == null ? that.numeroIdiomaHogar == null ? 0 : -1
                    : numeroIdiomaHogar.compareTo(that.numeroIdiomaHogar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroIdiomaHogar == null ? 0 : numeroIdiomaHogar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof IdiomaHogar) {
            IdiomaHogar that = (IdiomaHogar) object;
            return ((numeroIdiomaHogar == null && that.numeroIdiomaHogar == null) ||
                    (numeroIdiomaHogar != null && numeroIdiomaHogar.equals(that.numeroIdiomaHogar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroIdiomaHogar;
    }
}
