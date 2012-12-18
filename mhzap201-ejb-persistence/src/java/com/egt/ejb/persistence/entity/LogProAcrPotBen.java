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

import com.egt.base.persistence.entity.LogProAcrPotBenBase;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_pro_acr_pot_ben")
public class LogProAcrPotBen implements LogProAcrPotBenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_pro_acr_pot_ben")
    private Long idLogProAcrPotBen;

    @Basic(optional = false)
    @Column(name = "version_log_pro_acr_pot_ben")
    private long versionLogProAcrPotBen;

    @Column(name = "nombre_potencial_ben")
    private String nombrePotencialBen;

    @Column(name = "codigo_potencial_ben")
    private String codigoPotencialBen;

    @Column(name = "fecha_registro_pot_ben")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroPotBen;

    @Column(name = "nombre_persona")
    private String nombrePersona;

    @Column(name = "codigo_persona")
    private String codigoPersona;

    @Column(name = "codigo_ficha_persona")
    private String codigoFichaPersona;

    @Column(name = "nombre_ficha_persona")
    private String nombreFichaPersona;

    @Column(name = "codigo_ficha_hogar")
    private String codigoFichaHogar;

    @Column(name = "indice_calidad_vida")
    private BigDecimal indiceCalidadVida;

    @Basic(optional = false)
    @Column(name = "es_procesado")
    private int esProcesado;

    @Column(name = "observacion")
    private String observacion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @JoinColumn(name = "id_potencial_ben", referencedColumnName = "id_potencial_ben")
    @ManyToOne
    private PotencialBen potencialBenIdPotencialBen;

    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona personaIdPersona;

    @JoinColumn(name = "id_departamento", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDepartamento;

    @JoinColumn(name = "id_distrito", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDistrito;

    @JoinColumn(name = "id_barrio", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdBarrio;

    @JoinColumn(name = "id_ficha_persona", referencedColumnName = "id_ficha_persona")
    @ManyToOne
    private FichaPersona fichaPersonaIdFichaPersona;

    @JoinColumn(name = "id_ficha_hogar", referencedColumnName = "id_ficha_hogar")
    @ManyToOne
    private FichaHogar fichaHogarIdFichaHogar;

    public LogProAcrPotBen() {
    }

    @Override
    public Long getIdLogProAcrPotBen() {
        return this.idLogProAcrPotBen;
    }

    public void setIdLogProAcrPotBen(Long idLogProAcrPotBen) {
        this.idLogProAcrPotBen = idLogProAcrPotBen;
    }

    @Override
    public long getVersionLogProAcrPotBen() {
        return this.versionLogProAcrPotBen;
    }

    public void setVersionLogProAcrPotBen(long versionLogProAcrPotBen) {
        this.versionLogProAcrPotBen = versionLogProAcrPotBen;
    }

    @Override
    public String getNombrePotencialBen() {
        return this.nombrePotencialBen;
    }

    public void setNombrePotencialBen(String nombrePotencialBen) {
        this.nombrePotencialBen = nombrePotencialBen;
    }

    @Override
    public String getCodigoPotencialBen() {
        return this.codigoPotencialBen;
    }

    public void setCodigoPotencialBen(String codigoPotencialBen) {
        this.codigoPotencialBen = codigoPotencialBen;
    }

    @Override
    public Date getFechaRegistroPotBen() {
        return this.fechaRegistroPotBen;
    }

    public void setFechaRegistroPotBen(Date fechaRegistroPotBen) {
        this.fechaRegistroPotBen = fechaRegistroPotBen;
    }

    @Override
    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String getCodigoPersona() {
        return this.codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    @Override
    public String getCodigoFichaPersona() {
        return this.codigoFichaPersona;
    }

    public void setCodigoFichaPersona(String codigoFichaPersona) {
        this.codigoFichaPersona = codigoFichaPersona;
    }

    @Override
    public String getNombreFichaPersona() {
        return this.nombreFichaPersona;
    }

    public void setNombreFichaPersona(String nombreFichaPersona) {
        this.nombreFichaPersona = nombreFichaPersona;
    }

    @Override
    public String getCodigoFichaHogar() {
        return this.codigoFichaHogar;
    }

    public void setCodigoFichaHogar(String codigoFichaHogar) {
        this.codigoFichaHogar = codigoFichaHogar;
    }

    @Override
    public BigDecimal getIndiceCalidadVida() {
        return this.indiceCalidadVida;
    }

    public void setIndiceCalidadVida(BigDecimal indiceCalidadVida) {
        this.indiceCalidadVida = indiceCalidadVida;
    }

    @Override
    public int getEsProcesado() {
        return this.esProcesado;
    }

    public void setEsProcesado(int esProcesado) {
        this.esProcesado = esProcesado;
    }

    @Override
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public Date getFechaHoraTransaccion() {
        return this.fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    @Override
    public PotencialBen getPotencialBenIdPotencialBen() {
        return this.potencialBenIdPotencialBen;
    }

    public void setPotencialBenIdPotencialBen(PotencialBen potencialBen) {
        this.potencialBenIdPotencialBen = potencialBen;
    }

    @Override
    public Persona getPersonaIdPersona() {
        return this.personaIdPersona;
    }

    public void setPersonaIdPersona(Persona persona) {
        this.personaIdPersona = persona;
    }

    @Override
    public Ubicacion getUbicacionIdDepartamento() {
        return this.ubicacionIdDepartamento;
    }

    public void setUbicacionIdDepartamento(Ubicacion ubicacion) {
        this.ubicacionIdDepartamento = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdDistrito() {
        return this.ubicacionIdDistrito;
    }

    public void setUbicacionIdDistrito(Ubicacion ubicacion) {
        this.ubicacionIdDistrito = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdBarrio() {
        return this.ubicacionIdBarrio;
    }

    public void setUbicacionIdBarrio(Ubicacion ubicacion) {
        this.ubicacionIdBarrio = ubicacion;
    }

    @Override
    public FichaPersona getFichaPersonaIdFichaPersona() {
        return this.fichaPersonaIdFichaPersona;
    }

    public void setFichaPersonaIdFichaPersona(FichaPersona fichaPersona) {
        this.fichaPersonaIdFichaPersona = fichaPersona;
    }

    @Override
    public FichaHogar getFichaHogarIdFichaHogar() {
        return this.fichaHogarIdFichaHogar;
    }

    public void setFichaHogarIdFichaHogar(FichaHogar fichaHogar) {
        this.fichaHogarIdFichaHogar = fichaHogar;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProAcrPotBen) {
            LogProAcrPotBen that = (LogProAcrPotBen) object;
            return idLogProAcrPotBen == null ? that.idLogProAcrPotBen == null ? 0 : -1
                    : idLogProAcrPotBen.compareTo(that.idLogProAcrPotBen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogProAcrPotBen == null ? 0 : idLogProAcrPotBen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProAcrPotBen) {
            LogProAcrPotBen that = (LogProAcrPotBen) object;
            return ((idLogProAcrPotBen == null && that.idLogProAcrPotBen == null) ||
                    (idLogProAcrPotBen != null && idLogProAcrPotBen.equals(that.idLogProAcrPotBen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogProAcrPotBen;
    }
}
