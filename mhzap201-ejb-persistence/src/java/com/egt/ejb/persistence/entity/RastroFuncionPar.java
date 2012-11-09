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

import com.egt.base.persistence.entity.RastroFuncionParBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rastro_funcion_par")
public class RastroFuncionPar implements RastroFuncionParBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rastro_funcion_par")
    private Long idRastroFuncionPar;

    @Column(name = "valor_parametro")
    private String valorParametro;

    @JoinColumn(name = "id_rastro_funcion", referencedColumnName = "id_rastro_funcion")
    @ManyToOne
    private RastroFuncion rastroFuncionIdRastroFuncion;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne
    private Parametro parametroIdParametro;

    public RastroFuncionPar() {
    }

    @Override
    public Long getIdRastroFuncionPar() {
        return this.idRastroFuncionPar;
    }

    public void setIdRastroFuncionPar(Long idRastroFuncionPar) {
        this.idRastroFuncionPar = idRastroFuncionPar;
    }

    @Override
    public String getValorParametro() {
        return this.valorParametro;
    }

    public void setValorParametro(String valorParametro) {
        this.valorParametro = valorParametro;
    }

    @Override
    public RastroFuncion getRastroFuncionIdRastroFuncion() {
        return this.rastroFuncionIdRastroFuncion;
    }

    public void setRastroFuncionIdRastroFuncion(RastroFuncion rastroFuncion) {
        this.rastroFuncionIdRastroFuncion = rastroFuncion;
    }

    @Override
    public Parametro getParametroIdParametro() {
        return this.parametroIdParametro;
    }

    public void setParametroIdParametro(Parametro parametro) {
        this.parametroIdParametro = parametro;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroFuncionPar) {
            RastroFuncionPar that = (RastroFuncionPar) object;
            return idRastroFuncionPar == null ? that.idRastroFuncionPar == null ? 0 : -1
                    : idRastroFuncionPar.compareTo(that.idRastroFuncionPar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRastroFuncionPar == null ? 0 : idRastroFuncionPar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroFuncionPar) {
            RastroFuncionPar that = (RastroFuncionPar) object;
            return ((idRastroFuncionPar == null && that.idRastroFuncionPar == null) ||
                    (idRastroFuncionPar != null && idRastroFuncionPar.equals(that.idRastroFuncionPar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRastroFuncionPar;
    }
}
