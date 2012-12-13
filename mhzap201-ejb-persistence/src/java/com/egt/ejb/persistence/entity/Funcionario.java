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

import com.egt.base.persistence.entity.FuncionarioBase;
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
@Table(name = "funcionario")
public class Funcionario implements FuncionarioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_funcionario")
    private Long idFuncionario;

    @Basic(optional = false)
    @Column(name = "version_funcionario")
    private long versionFuncionario;

    @Basic(optional = false)
    @Column(name = "codigo_funcionario")
    private String codigoFuncionario;

    @Basic(optional = false)
    @Column(name = "nombre_funcionario")
    private String nombreFuncionario;

    @Column(name = "numero_cedula")
    private Integer numeroCedula;

    @Column(name = "letra_cedula")
    private String letraCedula;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "apellido_casada")
    private String apellidoCasada;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioCensista")
    private Collection<FichaHogar> fichaHogarIdFuncionarioCensistaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioSupervisor")
    private Collection<FichaHogar> fichaHogarIdFuncionarioSupervisorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioCriticoDeco")
    private Collection<FichaHogar> fichaHogarIdFuncionarioCriticoDecoCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioDigitador")
    private Collection<FichaHogar> fichaHogarIdFuncionarioDigitadorCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioValidacionCen")
    private Collection<PotencialBen> potencialBenIdFuncionarioValidacionCenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioRegPotBen")
    private Collection<PotencialBen> potencialBenIdFuncionarioRegPotBenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioUltVisitaCen")
    private Collection<PotencialBen> potencialBenIdFuncionarioUltVisitaCenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionarioIdFuncionarioCensista")
    private Collection<VisitaCenso> visitaCensoIdFuncionarioCensistaCollection;

    public Funcionario() {
    }

    @Override
    public Long getIdFuncionario() {
        return this.idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public long getVersionFuncionario() {
        return this.versionFuncionario;
    }

    public void setVersionFuncionario(long versionFuncionario) {
        this.versionFuncionario = versionFuncionario;
    }

    @Override
    public String getCodigoFuncionario() {
        return this.codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String getNombreFuncionario() {
        return this.nombreFuncionario;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    @Override
    public Integer getNumeroCedula() {
        return this.numeroCedula;
    }

    public void setNumeroCedula(Integer numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    @Override
    public String getLetraCedula() {
        return this.letraCedula;
    }

    public void setLetraCedula(String letraCedula) {
        this.letraCedula = letraCedula;
    }

    @Override
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Override
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String getApellidoCasada() {
        return this.apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdFuncionarioCensistaCollection() {
        return this.fichaHogarIdFuncionarioCensistaCollection;
    }

    public void setFichaHogarIdFuncionarioCensistaCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdFuncionarioCensistaCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdFuncionarioSupervisorCollection() {
        return this.fichaHogarIdFuncionarioSupervisorCollection;
    }

    public void setFichaHogarIdFuncionarioSupervisorCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdFuncionarioSupervisorCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdFuncionarioCriticoDecoCollection() {
        return this.fichaHogarIdFuncionarioCriticoDecoCollection;
    }

    public void setFichaHogarIdFuncionarioCriticoDecoCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdFuncionarioCriticoDecoCollection = collection;
    }

    @Override
    public Collection<FichaHogar> getFichaHogarIdFuncionarioDigitadorCollection() {
        return this.fichaHogarIdFuncionarioDigitadorCollection;
    }

    public void setFichaHogarIdFuncionarioDigitadorCollection(Collection<FichaHogar> collection) {
        this.fichaHogarIdFuncionarioDigitadorCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdFuncionarioValidacionCenCollection() {
        return this.potencialBenIdFuncionarioValidacionCenCollection;
    }

    public void setPotencialBenIdFuncionarioValidacionCenCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdFuncionarioValidacionCenCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdFuncionarioRegPotBenCollection() {
        return this.potencialBenIdFuncionarioRegPotBenCollection;
    }

    public void setPotencialBenIdFuncionarioRegPotBenCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdFuncionarioRegPotBenCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdFuncionarioUltVisitaCenCollection() {
        return this.potencialBenIdFuncionarioUltVisitaCenCollection;
    }

    public void setPotencialBenIdFuncionarioUltVisitaCenCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdFuncionarioUltVisitaCenCollection = collection;
    }

    @Override
    public Collection<VisitaCenso> getVisitaCensoIdFuncionarioCensistaCollection() {
        return this.visitaCensoIdFuncionarioCensistaCollection;
    }

    public void setVisitaCensoIdFuncionarioCensistaCollection(Collection<VisitaCenso> collection) {
        this.visitaCensoIdFuncionarioCensistaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Funcionario) {
            Funcionario that = (Funcionario) object;
            return idFuncionario == null ? that.idFuncionario == null ? 0 : -1
                    : idFuncionario.compareTo(that.idFuncionario);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFuncionario == null ? 0 : idFuncionario.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Funcionario) {
            Funcionario that = (Funcionario) object;
            return ((idFuncionario == null && that.idFuncionario == null) ||
                    (idFuncionario != null && idFuncionario.equals(that.idFuncionario)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFuncionario;
    }
}
