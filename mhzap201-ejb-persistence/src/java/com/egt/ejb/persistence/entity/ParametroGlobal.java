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

import com.egt.base.persistence.entity.ParametroGlobalBase;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parametro_global")
public class ParametroGlobal implements ParametroGlobalBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_parametro_global")
    private Integer numeroParametroGlobal;

    @Basic(optional = false)
    @Column(name = "codigo_parametro_global")
    private String codigoParametroGlobal;

    @Basic(optional = false)
    @Column(name = "monto_salario_minimo")
    private BigDecimal montoSalarioMinimo;

    @Basic(optional = false)
    @Column(name = "porcentaje_pension_alimentaria")
    private BigDecimal porcentajePensionAlimentaria;

    @Basic(optional = false)
    @Column(name = "es_control_cer_vida_activo")
    private int esControlCerVidaActivo;

    @Basic(optional = false)
    @Column(name = "meses_validez_certificado_vida")
    private int mesesValidezCertificadoVida;

    @Basic(optional = false)
    @Column(name = "es_control_cobro_pension_activ")
    private int esControlCobroPensionActiv;

    @Basic(optional = false)
    @Column(name = "meses_ultimo_cobro_pension")
    private int mesesUltimoCobroPension;

    @Basic(optional = false)
    @Column(name = "es_control_reproceso_pen_activ")
    private int esControlReprocesoPenActiv;

    @Basic(optional = false)
    @Column(name = "limite_indice_calidad_vida")
    private BigDecimal limiteIndiceCalidadVida;

    @Basic(optional = false)
    @Column(name = "limite_pensiones")
    private int limitePensiones;

    public ParametroGlobal() {
    }

    @Override
    public Integer getNumeroParametroGlobal() {
        return this.numeroParametroGlobal;
    }

    public void setNumeroParametroGlobal(Integer numeroParametroGlobal) {
        this.numeroParametroGlobal = numeroParametroGlobal;
    }

    @Override
    public String getCodigoParametroGlobal() {
        return this.codigoParametroGlobal;
    }

    public void setCodigoParametroGlobal(String codigoParametroGlobal) {
        this.codigoParametroGlobal = codigoParametroGlobal;
    }

    @Override
    public BigDecimal getMontoSalarioMinimo() {
        return this.montoSalarioMinimo;
    }

    public void setMontoSalarioMinimo(BigDecimal montoSalarioMinimo) {
        this.montoSalarioMinimo = montoSalarioMinimo;
    }

    @Override
    public BigDecimal getPorcentajePensionAlimentaria() {
        return this.porcentajePensionAlimentaria;
    }

    public void setPorcentajePensionAlimentaria(BigDecimal porcentajePensionAlimentaria) {
        this.porcentajePensionAlimentaria = porcentajePensionAlimentaria;
    }

    @Override
    public int getEsControlCerVidaActivo() {
        return this.esControlCerVidaActivo;
    }

    public void setEsControlCerVidaActivo(int esControlCerVidaActivo) {
        this.esControlCerVidaActivo = esControlCerVidaActivo;
    }

    @Override
    public int getMesesValidezCertificadoVida() {
        return this.mesesValidezCertificadoVida;
    }

    public void setMesesValidezCertificadoVida(int mesesValidezCertificadoVida) {
        this.mesesValidezCertificadoVida = mesesValidezCertificadoVida;
    }

    @Override
    public int getEsControlCobroPensionActiv() {
        return this.esControlCobroPensionActiv;
    }

    public void setEsControlCobroPensionActiv(int esControlCobroPensionActiv) {
        this.esControlCobroPensionActiv = esControlCobroPensionActiv;
    }

    @Override
    public int getMesesUltimoCobroPension() {
        return this.mesesUltimoCobroPension;
    }

    public void setMesesUltimoCobroPension(int mesesUltimoCobroPension) {
        this.mesesUltimoCobroPension = mesesUltimoCobroPension;
    }

    @Override
    public int getEsControlReprocesoPenActiv() {
        return this.esControlReprocesoPenActiv;
    }

    public void setEsControlReprocesoPenActiv(int esControlReprocesoPenActiv) {
        this.esControlReprocesoPenActiv = esControlReprocesoPenActiv;
    }

    @Override
    public BigDecimal getLimiteIndiceCalidadVida() {
        return this.limiteIndiceCalidadVida;
    }

    public void setLimiteIndiceCalidadVida(BigDecimal limiteIndiceCalidadVida) {
        this.limiteIndiceCalidadVida = limiteIndiceCalidadVida;
    }

    @Override
    public int getLimitePensiones() {
        return this.limitePensiones;
    }

    public void setLimitePensiones(int limitePensiones) {
        this.limitePensiones = limitePensiones;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ParametroGlobal) {
            ParametroGlobal that = (ParametroGlobal) object;
            return numeroParametroGlobal == null ? that.numeroParametroGlobal == null ? 0 : -1
                    : numeroParametroGlobal.compareTo(that.numeroParametroGlobal);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroParametroGlobal == null ? 0 : numeroParametroGlobal.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof ParametroGlobal) {
            ParametroGlobal that = (ParametroGlobal) object;
            return ((numeroParametroGlobal == null && that.numeroParametroGlobal == null) ||
                    (numeroParametroGlobal != null && numeroParametroGlobal.equals(that.numeroParametroGlobal)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroParametroGlobal;
    }
}
