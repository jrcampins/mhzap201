/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.UbicacionBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ubicacion")
public class Ubicacion implements UbicacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_ubicacion")
    private Long idUbicacion;

    @Basic(optional = false)
    @Column(name = "version_ubicacion")
    private long versionUbicacion;

    @Basic(optional = false)
    @Column(name = "codigo_ubicacion")
    private String codigoUbicacion;

    @Basic(optional = false)
    @Column(name = "nombre_ubicacion")
    private String nombreUbicacion;

    @Column(name = "secuencia_ubicacion")
    private Integer secuenciaUbicacion;

    @Column(name = "clave_ubicacion")
    private String claveUbicacion;

    @JoinColumn(name = "id_ubicacion_superior", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdUbicacionSuperior;

    @JoinColumn(name = "numero_tipo_nodo", referencedColumnName = "numero_tipo_nodo")
    @ManyToOne
    private TipoNodo tipoNodoNumeroTipoNodo;

    @JoinColumn(name = "numero_nivel_ubicacion", referencedColumnName = "numero_nivel_ubicacion")
    @ManyToOne
    private NivelUbicacion nivelUbicacionNumeroNivelUbicacion;

    @JoinColumn(name = "numero_tipo_area", referencedColumnName = "numero_tipo_area")
    @ManyToOne
    private TipoArea tipoAreaNumeroTipoArea;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<FichaHogar> fichaHogarIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<FichaHogar> fichaHogarIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<FichaHogar> fichaHogarIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdManzana")
    private Collection<FichaHogar> fichaHogarIdManzanaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamentoNacimiento")
    private Collection<FichaPersona> fichaPersonaIdDepartamentoNacimientoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistritoNacimiento")
    private Collection<FichaPersona> fichaPersonaIdDistritoNacimientoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<LogProDenPenObj> logProDenPenObjIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<LogProDenPenObj> logProDenPenObjIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<LogProDenPenObj> logProDenPenObjIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<LogProOtoPenApr> logProOtoPenAprIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<LogProOtoPenApr> logProOtoPenAprIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<LogProOtoPenApr> logProOtoPenAprIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<LogProPreProPag> logProPreProPagIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<LogProPreProPag> logProPreProPagIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<LogProPreProPag> logProPreProPagIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<LogProVerElePen> logProVerElePenIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<LogProVerElePen> logProVerElePenIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<LogProVerElePen> logProVerElePenIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<Persona> personaIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<Persona> personaIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<Persona> personaIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdManzana")
    private Collection<Persona> personaIdManzanaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDepartamento")
    private Collection<PotencialBen> potencialBenIdDepartamentoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdDistrito")
    private Collection<PotencialBen> potencialBenIdDistritoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdBarrio")
    private Collection<PotencialBen> potencialBenIdBarrioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdManzana")
    private Collection<PotencialBen> potencialBenIdManzanaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ubicacionIdUbicacionSuperior")
    private Collection<Ubicacion> ubicacionIdUbicacionSuperiorCollection;

    public Ubicacion() {
    }

    @Override
    public Long getIdUbicacion() {
        return this.idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Override
    public long getVersionUbicacion() {
        return this.versionUbicacion;
    }

    public void setVersionUbicacion(long versionUbicacion) {
        this.versionUbicacion = versionUbicacion;
    }

    @Override
    public String getCodigoUbicacion() {
        return this.codigoUbicacion;
    }

    public void setCodigoUbicacion(String codigoUbicacion) {
        this.codigoUbicacion = codigoUbicacion;
    }

    @Override
    public String getNombreUbicacion() {
        return this.nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    @Override
    public Integer getSecuenciaUbicacion() {
        return this.secuenciaUbicacion;
    }

    public void setSecuenciaUbicacion(Integer secuenciaUbicacion) {
        this.secuenciaUbicacion = secuenciaUbicacion;
    }

    @Override
    public String getClaveUbicacion() {
        return this.claveUbicacion;
    }

    public void setClaveUbicacion(String claveUbicacion) {
        this.claveUbicacion = claveUbicacion;
    }

    @Override
    public Ubicacion getUbicacionIdUbicacionSuperior() {
        return this.ubicacionIdUbicacionSuperior;
    }

    public void setUbicacionIdUbicacionSuperior(Ubicacion ubicacion) {
        this.ubicacionIdUbicacionSuperior = ubicacion;
    }

    @Override
    public TipoNodo getTipoNodoNumeroTipoNodo() {
        return this.tipoNodoNumeroTipoNodo;
    }

    public void setTipoNodoNumeroTipoNodo(TipoNodo tipoNodo) {
        this.tipoNodoNumeroTipoNodo = tipoNodo;
    }

    @Override
    public NivelUbicacion getNivelUbicacionNumeroNivelUbicacion() {
        return this.nivelUbicacionNumeroNivelUbicacion;
    }

    public void setNivelUbicacionNumeroNivelUbicacion(NivelUbicacion nivelUbicacion) {
        this.nivelUbicacionNumeroNivelUbicacion = nivelUbicacion;
    }

    @Override
    public TipoArea getTipoAreaNumeroTipoArea() {
        return this.tipoAreaNumeroTipoArea;
    }

    public void setTipoAreaNumeroTipoArea(TipoArea tipoArea) {
        this.tipoAreaNumeroTipoArea = tipoArea;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdDepartamentoCollection() {
        return this.fichaHogarIdDepartamentoCollection;
    }

    public void setFichaHogarIdDepartamentoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdDistritoCollection() {
        return this.fichaHogarIdDistritoCollection;
    }

    public void setFichaHogarIdDistritoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdDistritoCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdBarrioCollection() {
        return this.fichaHogarIdBarrioCollection;
    }

    public void setFichaHogarIdBarrioCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdBarrioCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdManzanaCollection() {
        return this.fichaHogarIdManzanaCollection;
    }

    public void setFichaHogarIdManzanaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdManzanaCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaIdDepartamentoNacimientoCollection() {
        return this.fichaPersonaIdDepartamentoNacimientoCollection;
    }

    public void setFichaPersonaIdDepartamentoNacimientoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaIdDepartamentoNacimientoCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaIdDistritoNacimientoCollection() {
        return this.fichaPersonaIdDistritoNacimientoCollection;
    }

    public void setFichaPersonaIdDistritoNacimientoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaIdDistritoNacimientoCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdDepartamentoCollection() {
        return this.logProAcrPotBenIdDepartamentoCollection;
    }

    public void setLogProAcrPotBenIdDepartamentoCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdDistritoCollection() {
        return this.logProAcrPotBenIdDistritoCollection;
    }

    public void setLogProAcrPotBenIdDistritoCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdDistritoCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdBarrioCollection() {
        return this.logProAcrPotBenIdBarrioCollection;
    }

    public void setLogProAcrPotBenIdBarrioCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdBarrioCollection = collection;
    }

    @Override
    public Collection<LogProDenPenObj> getLogProDenPenObjIdDepartamentoCollection() {
        return this.logProDenPenObjIdDepartamentoCollection;
    }

    public void setLogProDenPenObjIdDepartamentoCollection(Collection<LogProDenPenObj> collection) {
        this.logProDenPenObjIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<LogProDenPenObj> getLogProDenPenObjIdDistritoCollection() {
        return this.logProDenPenObjIdDistritoCollection;
    }

    public void setLogProDenPenObjIdDistritoCollection(Collection<LogProDenPenObj> collection) {
        this.logProDenPenObjIdDistritoCollection = collection;
    }

    @Override
    public Collection<LogProDenPenObj> getLogProDenPenObjIdBarrioCollection() {
        return this.logProDenPenObjIdBarrioCollection;
    }

    public void setLogProDenPenObjIdBarrioCollection(Collection<LogProDenPenObj> collection) {
        this.logProDenPenObjIdBarrioCollection = collection;
    }

    @Override
    public Collection<LogProOtoPenApr> getLogProOtoPenAprIdDepartamentoCollection() {
        return this.logProOtoPenAprIdDepartamentoCollection;
    }

    public void setLogProOtoPenAprIdDepartamentoCollection(Collection<LogProOtoPenApr> collection) {
        this.logProOtoPenAprIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<LogProOtoPenApr> getLogProOtoPenAprIdDistritoCollection() {
        return this.logProOtoPenAprIdDistritoCollection;
    }

    public void setLogProOtoPenAprIdDistritoCollection(Collection<LogProOtoPenApr> collection) {
        this.logProOtoPenAprIdDistritoCollection = collection;
    }

    @Override
    public Collection<LogProOtoPenApr> getLogProOtoPenAprIdBarrioCollection() {
        return this.logProOtoPenAprIdBarrioCollection;
    }

    public void setLogProOtoPenAprIdBarrioCollection(Collection<LogProOtoPenApr> collection) {
        this.logProOtoPenAprIdBarrioCollection = collection;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagIdDepartamentoCollection() {
        return this.logProPreProPagIdDepartamentoCollection;
    }

    public void setLogProPreProPagIdDepartamentoCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagIdDistritoCollection() {
        return this.logProPreProPagIdDistritoCollection;
    }

    public void setLogProPreProPagIdDistritoCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagIdDistritoCollection = collection;
    }

    @Override
    public Collection<LogProPreProPag> getLogProPreProPagIdBarrioCollection() {
        return this.logProPreProPagIdBarrioCollection;
    }

    public void setLogProPreProPagIdBarrioCollection(Collection<LogProPreProPag> collection) {
        this.logProPreProPagIdBarrioCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenIdDepartamentoCollection() {
        return this.logProVerElePenIdDepartamentoCollection;
    }

    public void setLogProVerElePenIdDepartamentoCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenIdDistritoCollection() {
        return this.logProVerElePenIdDistritoCollection;
    }

    public void setLogProVerElePenIdDistritoCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenIdDistritoCollection = collection;
    }

    @Override
    public Collection<LogProVerElePen> getLogProVerElePenIdBarrioCollection() {
        return this.logProVerElePenIdBarrioCollection;
    }

    public void setLogProVerElePenIdBarrioCollection(Collection<LogProVerElePen> collection) {
        this.logProVerElePenIdBarrioCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaIdDepartamentoCollection() {
        return this.personaIdDepartamentoCollection;
    }

    public void setPersonaIdDepartamentoCollection(Collection<Persona> collection) {
        this.personaIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaIdDistritoCollection() {
        return this.personaIdDistritoCollection;
    }

    public void setPersonaIdDistritoCollection(Collection<Persona> collection) {
        this.personaIdDistritoCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaIdBarrioCollection() {
        return this.personaIdBarrioCollection;
    }

    public void setPersonaIdBarrioCollection(Collection<Persona> collection) {
        this.personaIdBarrioCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaIdManzanaCollection() {
        return this.personaIdManzanaCollection;
    }

    public void setPersonaIdManzanaCollection(Collection<Persona> collection) {
        this.personaIdManzanaCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdDepartamentoCollection() {
        return this.potencialBenIdDepartamentoCollection;
    }

    public void setPotencialBenIdDepartamentoCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdDepartamentoCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdDistritoCollection() {
        return this.potencialBenIdDistritoCollection;
    }

    public void setPotencialBenIdDistritoCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdDistritoCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdBarrioCollection() {
        return this.potencialBenIdBarrioCollection;
    }

    public void setPotencialBenIdBarrioCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdBarrioCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdManzanaCollection() {
        return this.potencialBenIdManzanaCollection;
    }

    public void setPotencialBenIdManzanaCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdManzanaCollection = collection;
    }

    @Override
    public Collection<Ubicacion> getUbicacionIdUbicacionSuperiorCollection() {
        return this.ubicacionIdUbicacionSuperiorCollection;
    }

    public void setUbicacionIdUbicacionSuperiorCollection(Collection<Ubicacion> collection) {
        this.ubicacionIdUbicacionSuperiorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Ubicacion) {
            Ubicacion that = (Ubicacion) object;
            return idUbicacion == null ? that.idUbicacion == null ? 0 : -1
                    : idUbicacion.compareTo(that.idUbicacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idUbicacion == null ? 0 : idUbicacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Ubicacion) {
            Ubicacion that = (Ubicacion) object;
            return ((idUbicacion == null && that.idUbicacion == null) ||
                    (idUbicacion != null && idUbicacion.equals(that.idUbicacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idUbicacion;
    }
}
