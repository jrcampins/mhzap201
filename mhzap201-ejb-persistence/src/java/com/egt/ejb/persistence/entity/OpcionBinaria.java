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

import com.egt.base.persistence.entity.OpcionBinariaBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opcion_binaria")
public class OpcionBinaria implements OpcionBinariaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_opcion_binaria")
    private Integer numeroOpcionBinaria;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_si_no")
    private String codigoOpcionSiNo;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_activo_inactivo")
    private String codigoOpcionActivoInactivo;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_enc_apa")
    private String codigoOpcionEncApa;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_presente_ausente")
    private String codigoOpcionPresenteAusente;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_pos_neg")
    private String codigoOpcionPosNeg;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_verdadero_falso")
    private String codigoOpcionVerdaderoFalso;

    public OpcionBinaria() {
    }

    @Override
    public Integer getNumeroOpcionBinaria() {
        return this.numeroOpcionBinaria;
    }

    public void setNumeroOpcionBinaria(Integer numeroOpcionBinaria) {
        this.numeroOpcionBinaria = numeroOpcionBinaria;
    }

    @Override
    public String getCodigoOpcionSiNo() {
        return this.codigoOpcionSiNo;
    }

    public void setCodigoOpcionSiNo(String codigoOpcionSiNo) {
        this.codigoOpcionSiNo = codigoOpcionSiNo;
    }

    @Override
    public String getCodigoOpcionActivoInactivo() {
        return this.codigoOpcionActivoInactivo;
    }

    public void setCodigoOpcionActivoInactivo(String codigoOpcionActivoInactivo) {
        this.codigoOpcionActivoInactivo = codigoOpcionActivoInactivo;
    }

    @Override
    public String getCodigoOpcionEncApa() {
        return this.codigoOpcionEncApa;
    }

    public void setCodigoOpcionEncApa(String codigoOpcionEncApa) {
        this.codigoOpcionEncApa = codigoOpcionEncApa;
    }

    @Override
    public String getCodigoOpcionPresenteAusente() {
        return this.codigoOpcionPresenteAusente;
    }

    public void setCodigoOpcionPresenteAusente(String codigoOpcionPresenteAusente) {
        this.codigoOpcionPresenteAusente = codigoOpcionPresenteAusente;
    }

    @Override
    public String getCodigoOpcionPosNeg() {
        return this.codigoOpcionPosNeg;
    }

    public void setCodigoOpcionPosNeg(String codigoOpcionPosNeg) {
        this.codigoOpcionPosNeg = codigoOpcionPosNeg;
    }

    @Override
    public String getCodigoOpcionVerdaderoFalso() {
        return this.codigoOpcionVerdaderoFalso;
    }

    public void setCodigoOpcionVerdaderoFalso(String codigoOpcionVerdaderoFalso) {
        this.codigoOpcionVerdaderoFalso = codigoOpcionVerdaderoFalso;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionBinaria) {
            OpcionBinaria that = (OpcionBinaria) object;
            return numeroOpcionBinaria == null ? that.numeroOpcionBinaria == null ? 0 : -1
                    : numeroOpcionBinaria.compareTo(that.numeroOpcionBinaria);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroOpcionBinaria == null ? 0 : numeroOpcionBinaria.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionBinaria) {
            OpcionBinaria that = (OpcionBinaria) object;
            return ((numeroOpcionBinaria == null && that.numeroOpcionBinaria == null) ||
                    (numeroOpcionBinaria != null && numeroOpcionBinaria.equals(that.numeroOpcionBinaria)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroOpcionBinaria;
    }
}
