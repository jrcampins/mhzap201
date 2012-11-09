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

import com.egt.base.persistence.entity.SionoBase;
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
@Table(name = "siono")
public class Siono implements SionoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_siono")
    private Integer numeroSiono;

    @Basic(optional = false)
    @Column(name = "codigo_siono")
    private String codigoSiono;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoPiezaCocina")
    private Collection<FichaHogar> fichaHogarNumeroSionoPiezaCocinaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoCorrienteElec")
    private Collection<FichaHogar> fichaHogarNumeroSionoCorrienteElecCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoTelefonoCelular")
    private Collection<FichaHogar> fichaHogarNumeroSionoTelefonoCelularCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoTlfLineaBaja")
    private Collection<FichaHogar> fichaHogarNumeroSionoTlfLineaBajaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispHeladera")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispHeladeraCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispLavarropas")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispLavarropasCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispTermo")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispTermoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispAireAcon")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispAireAconCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispAutomovil")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispAutomovilCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispCamion")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispCamionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDispMotocicleta")
    private Collection<FichaHogar> fichaHogarNumeroSionoDispMotocicletaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoMiembroHogar")
    private Collection<FichaPersona> fichaPersonaNumeroSionoMiembroHogarCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoAsistenciaEsc")
    private Collection<FichaPersona> fichaPersonaNumeroSionoAsistenciaEscCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoMatriculacionEsc")
    private Collection<FichaPersona> fichaPersonaNumeroSionoMatriculacionEscCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoCursoNoFormal")
    private Collection<FichaPersona> fichaPersonaNumeroSionoCursoNoFormalCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoAtencionMedica")
    private Collection<FichaPersona> fichaPersonaNumeroSionoAtencionMedicaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoCarnetVacunacion")
    private Collection<FichaPersona> fichaPersonaNumeroSionoCarnetVacunacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaCaminar")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaCaminarCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaVestirse")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaVestirseCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaBanarse")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaBanarseCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaComer")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaComerCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaLaCama")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaLaCamaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoDifParaElBano")
    private Collection<FichaPersona> fichaPersonaNumeroSionoDifParaElBanoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sionoNumeroSionoTrabajo")
    private Collection<FichaPersona> fichaPersonaNumeroSionoTrabajoCollection;

    public Siono() {
    }

    @Override
    public Integer getNumeroSiono() {
        return this.numeroSiono;
    }

    public void setNumeroSiono(Integer numeroSiono) {
        this.numeroSiono = numeroSiono;
    }

    @Override
    public String getCodigoSiono() {
        return this.codigoSiono;
    }

    public void setCodigoSiono(String codigoSiono) {
        this.codigoSiono = codigoSiono;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoPiezaCocinaCollection() {
        return this.fichaHogarNumeroSionoPiezaCocinaCollection;
    }

    public void setFichaHogarNumeroSionoPiezaCocinaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoPiezaCocinaCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoCorrienteElecCollection() {
        return this.fichaHogarNumeroSionoCorrienteElecCollection;
    }

    public void setFichaHogarNumeroSionoCorrienteElecCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoCorrienteElecCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoTelefonoCelularCollection() {
        return this.fichaHogarNumeroSionoTelefonoCelularCollection;
    }

    public void setFichaHogarNumeroSionoTelefonoCelularCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoTelefonoCelularCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoTlfLineaBajaCollection() {
        return this.fichaHogarNumeroSionoTlfLineaBajaCollection;
    }

    public void setFichaHogarNumeroSionoTlfLineaBajaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoTlfLineaBajaCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispHeladeraCollection() {
        return this.fichaHogarNumeroSionoDispHeladeraCollection;
    }

    public void setFichaHogarNumeroSionoDispHeladeraCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispHeladeraCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispLavarropasCollection() {
        return this.fichaHogarNumeroSionoDispLavarropasCollection;
    }

    public void setFichaHogarNumeroSionoDispLavarropasCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispLavarropasCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispTermoCollection() {
        return this.fichaHogarNumeroSionoDispTermoCollection;
    }

    public void setFichaHogarNumeroSionoDispTermoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispTermoCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispAireAconCollection() {
        return this.fichaHogarNumeroSionoDispAireAconCollection;
    }

    public void setFichaHogarNumeroSionoDispAireAconCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispAireAconCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispAutomovilCollection() {
        return this.fichaHogarNumeroSionoDispAutomovilCollection;
    }

    public void setFichaHogarNumeroSionoDispAutomovilCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispAutomovilCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispCamionCollection() {
        return this.fichaHogarNumeroSionoDispCamionCollection;
    }

    public void setFichaHogarNumeroSionoDispCamionCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispCamionCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarNumeroSionoDispMotocicletaCollection() {
        return this.fichaHogarNumeroSionoDispMotocicletaCollection;
    }

    public void setFichaHogarNumeroSionoDispMotocicletaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarNumeroSionoDispMotocicletaCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoMiembroHogarCollection() {
        return this.fichaPersonaNumeroSionoMiembroHogarCollection;
    }

    public void setFichaPersonaNumeroSionoMiembroHogarCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoMiembroHogarCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoAsistenciaEscCollection() {
        return this.fichaPersonaNumeroSionoAsistenciaEscCollection;
    }

    public void setFichaPersonaNumeroSionoAsistenciaEscCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoAsistenciaEscCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoMatriculacionEscCollection() {
        return this.fichaPersonaNumeroSionoMatriculacionEscCollection;
    }

    public void setFichaPersonaNumeroSionoMatriculacionEscCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoMatriculacionEscCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoCursoNoFormalCollection() {
        return this.fichaPersonaNumeroSionoCursoNoFormalCollection;
    }

    public void setFichaPersonaNumeroSionoCursoNoFormalCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoCursoNoFormalCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoAtencionMedicaCollection() {
        return this.fichaPersonaNumeroSionoAtencionMedicaCollection;
    }

    public void setFichaPersonaNumeroSionoAtencionMedicaCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoAtencionMedicaCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoCarnetVacunacionCollection() {
        return this.fichaPersonaNumeroSionoCarnetVacunacionCollection;
    }

    public void setFichaPersonaNumeroSionoCarnetVacunacionCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoCarnetVacunacionCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaCaminarCollection() {
        return this.fichaPersonaNumeroSionoDifParaCaminarCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaCaminarCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaCaminarCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaVestirseCollection() {
        return this.fichaPersonaNumeroSionoDifParaVestirseCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaVestirseCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaVestirseCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaBanarseCollection() {
        return this.fichaPersonaNumeroSionoDifParaBanarseCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaBanarseCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaBanarseCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaComerCollection() {
        return this.fichaPersonaNumeroSionoDifParaComerCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaComerCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaComerCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaLaCamaCollection() {
        return this.fichaPersonaNumeroSionoDifParaLaCamaCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaLaCamaCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaLaCamaCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoDifParaElBanoCollection() {
        return this.fichaPersonaNumeroSionoDifParaElBanoCollection;
    }

    public void setFichaPersonaNumeroSionoDifParaElBanoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoDifParaElBanoCollection = collection;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroSionoTrabajoCollection() {
        return this.fichaPersonaNumeroSionoTrabajoCollection;
    }

    public void setFichaPersonaNumeroSionoTrabajoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroSionoTrabajoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Siono) {
            Siono that = (Siono) object;
            return numeroSiono == null ? that.numeroSiono == null ? 0 : -1
                    : numeroSiono.compareTo(that.numeroSiono);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroSiono == null ? 0 : numeroSiono.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Siono) {
            Siono that = (Siono) object;
            return ((numeroSiono == null && that.numeroSiono == null) ||
                    (numeroSiono != null && numeroSiono.equals(that.numeroSiono)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroSiono;
    }
}
