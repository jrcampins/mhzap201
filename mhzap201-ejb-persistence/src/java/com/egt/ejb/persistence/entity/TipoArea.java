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

import com.egt.base.persistence.entity.TipoAreaBase;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_area")
public class TipoArea implements TipoAreaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_area")
    private Integer numeroTipoArea;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_area")
    private String codigoTipoArea;

    @Column(name = "limite_indice_calidad_vida")
    private BigDecimal limiteIndiceCalidadVida;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAreaNumeroTipoArea")
    private Collection<FichaHogar> fichaHogarNumeroTipoAreaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAreaNumeroTipoAreaLugarNac")
    private Collection<FichaPersona> fichaPersonaNumeroTipoAreaLugarNacCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAreaNumeroTipoArea")
    private Collection<Persona> personaNumeroTipoAreaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAreaNumeroTipoArea")
    private Collection<PotencialBen> potencialBenNumeroTipoAreaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoAreaNumeroTipoArea")
    private Collection<Ubicacion> ubicacionNumeroTipoAreaCollection;

    public TipoArea() {
    }

    @Override
    public Integer getNumeroTipoArea() {
        return this.numeroTipoArea;
    }

    public void setNumeroTipoArea(Integer numeroTipoArea) {
        this.numeroTipoArea = numeroTipoArea;
    }

    @Override
    public String getCodigoTipoArea() {
        return this.codigoTipoArea;
    }

    public void setCodigoTipoArea(String codigoTipoArea) {
        this.codigoTipoArea = codigoTipoArea;
    }

    @Override
    public BigDecimal getLimiteIndiceCalidadVida() {
        return this.limiteIndiceCalidadVida;
    }

    public void setLimiteIndiceCalidadVida(BigDecimal limiteIndiceCalidadVida) {
        this.limiteIndiceCalidadVida = limiteIndiceCalidadVida;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroTipoAreaCollection() {
        return this.fichaHogarNumeroTipoAreaCollection;
    }

    public void setFichaHogarNumeroTipoAreaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroTipoAreaCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroTipoAreaLugarNacCollection() {
        return this.fichaPersonaNumeroTipoAreaLugarNacCollection;
    }

    public void setFichaPersonaNumeroTipoAreaLugarNacCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroTipoAreaLugarNacCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaNumeroTipoAreaCollection() {
        return this.personaNumeroTipoAreaCollection;
    }

    public void setPersonaNumeroTipoAreaCollection(Collection<Persona> collection) {
        this.personaNumeroTipoAreaCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenNumeroTipoAreaCollection() {
        return this.potencialBenNumeroTipoAreaCollection;
    }

    public void setPotencialBenNumeroTipoAreaCollection(Collection<PotencialBen> collection) {
        this.potencialBenNumeroTipoAreaCollection = collection;
    }

    @Override
    public Collection<Ubicacion> getUbicacionNumeroTipoAreaCollection() {
        return this.ubicacionNumeroTipoAreaCollection;
    }

    public void setUbicacionNumeroTipoAreaCollection(Collection<Ubicacion> collection) {
        this.ubicacionNumeroTipoAreaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoArea) {
            TipoArea that = (TipoArea) object;
            return numeroTipoArea == null ? that.numeroTipoArea == null ? 0 : -1
                    : numeroTipoArea.compareTo(that.numeroTipoArea);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoArea == null ? 0 : numeroTipoArea.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoArea) {
            TipoArea that = (TipoArea) object;
            return ((numeroTipoArea == null && that.numeroTipoArea == null) ||
                    (numeroTipoArea != null && numeroTipoArea.equals(that.numeroTipoArea)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoArea;
    }
}
