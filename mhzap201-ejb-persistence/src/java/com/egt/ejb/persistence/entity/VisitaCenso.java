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

import com.egt.base.persistence.entity.VisitaCensoBase;
import java.io.Serializable;
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
@Table(name = "visita_censo")
public class VisitaCenso implements VisitaCensoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_visita_censo")
    private Long idVisitaCenso;

    @Basic(optional = false)
    @Column(name = "version_visita_censo")
    private long versionVisitaCenso;

    @Basic(optional = false)
    @Column(name = "fecha_visita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVisita;

    @Column(name = "observaciones")
    private String observaciones;

    @JoinColumn(name = "id_potencial_ben", referencedColumnName = "id_potencial_ben")
    @ManyToOne
    private PotencialBen potencialBenIdPotencialBen;

    @JoinColumn(name = "id_funcionario_censista", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioCensista;

    public VisitaCenso() {
    }

    @Override
    public Long getIdVisitaCenso() {
        return this.idVisitaCenso;
    }

    public void setIdVisitaCenso(Long idVisitaCenso) {
        this.idVisitaCenso = idVisitaCenso;
    }

    @Override
    public long getVersionVisitaCenso() {
        return this.versionVisitaCenso;
    }

    public void setVersionVisitaCenso(long versionVisitaCenso) {
        this.versionVisitaCenso = versionVisitaCenso;
    }

    @Override
    public Date getFechaVisita() {
        return this.fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    @Override
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public PotencialBen getPotencialBenIdPotencialBen() {
        return this.potencialBenIdPotencialBen;
    }

    public void setPotencialBenIdPotencialBen(PotencialBen potencialBen) {
        this.potencialBenIdPotencialBen = potencialBen;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioCensista() {
        return this.funcionarioIdFuncionarioCensista;
    }

    public void setFuncionarioIdFuncionarioCensista(Funcionario funcionario) {
        this.funcionarioIdFuncionarioCensista = funcionario;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof VisitaCenso) {
            VisitaCenso that = (VisitaCenso) object;
            return idVisitaCenso == null ? that.idVisitaCenso == null ? 0 : -1
                    : idVisitaCenso.compareTo(that.idVisitaCenso);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idVisitaCenso == null ? 0 : idVisitaCenso.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof VisitaCenso) {
            VisitaCenso that = (VisitaCenso) object;
            return ((idVisitaCenso == null && that.idVisitaCenso == null) ||
                    (idVisitaCenso != null && idVisitaCenso.equals(that.idVisitaCenso)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idVisitaCenso;
    }
}
