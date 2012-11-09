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

import com.egt.base.persistence.entity.FiltroFuncionParBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filtro_funcion_par")
public class FiltroFuncionPar implements FiltroFuncionParBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_filtro_funcion_par")
    private Long idFiltroFuncionPar;

    @Basic(optional = false)
    @Column(name = "version_filtro_funcion_par")
    private long versionFiltroFuncionPar;

    @Column(name = "id_valor_lista")
    private Long idValorLista;

    @Column(name = "id_objeto_valor")
    private Long idObjetoValor;

    @Column(name = "id_recurso_valor")
    private Long idRecursoValor;

    @Column(name = "valor_parametro")
    private String valorParametro;

    @Column(name = "significado_parametro")
    private String significadoParametro;

    @JoinColumn(name = "id_filtro_funcion", referencedColumnName = "id_filtro_funcion")
    @ManyToOne
    private FiltroFuncion filtroFuncionIdFiltroFuncion;

    @JoinColumn(name = "id_funcion_parametro", referencedColumnName = "id_funcion_parametro")
    @ManyToOne
    private FuncionParametro funcionParametroIdFuncionParametro;

    @JoinColumn(name = "numero_operador_com", referencedColumnName = "numero_operador_com")
    @ManyToOne
    private OperadorCom operadorComNumeroOperadorCom;

    public FiltroFuncionPar() {
    }

    @Override
    public Long getIdFiltroFuncionPar() {
        return this.idFiltroFuncionPar;
    }

    public void setIdFiltroFuncionPar(Long idFiltroFuncionPar) {
        this.idFiltroFuncionPar = idFiltroFuncionPar;
    }

    @Override
    public long getVersionFiltroFuncionPar() {
        return this.versionFiltroFuncionPar;
    }

    public void setVersionFiltroFuncionPar(long versionFiltroFuncionPar) {
        this.versionFiltroFuncionPar = versionFiltroFuncionPar;
    }

    @Override
    public Long getIdValorLista() {
        return this.idValorLista;
    }

    public void setIdValorLista(Long idValorLista) {
        this.idValorLista = idValorLista;
    }

    @Override
    public Long getIdObjetoValor() {
        return this.idObjetoValor;
    }

    public void setIdObjetoValor(Long idObjetoValor) {
        this.idObjetoValor = idObjetoValor;
    }

    @Override
    public Long getIdRecursoValor() {
        return this.idRecursoValor;
    }

    public void setIdRecursoValor(Long idRecursoValor) {
        this.idRecursoValor = idRecursoValor;
    }

    @Override
    public String getValorParametro() {
        return this.valorParametro;
    }

    public void setValorParametro(String valorParametro) {
        this.valorParametro = valorParametro;
    }

    @Override
    public String getSignificadoParametro() {
        return this.significadoParametro;
    }

    public void setSignificadoParametro(String significadoParametro) {
        this.significadoParametro = significadoParametro;
    }

    @Override
    public FiltroFuncion getFiltroFuncionIdFiltroFuncion() {
        return this.filtroFuncionIdFiltroFuncion;
    }

    public void setFiltroFuncionIdFiltroFuncion(FiltroFuncion filtroFuncion) {
        this.filtroFuncionIdFiltroFuncion = filtroFuncion;
    }

    @Override
    public FuncionParametro getFuncionParametroIdFuncionParametro() {
        return this.funcionParametroIdFuncionParametro;
    }

    public void setFuncionParametroIdFuncionParametro(FuncionParametro funcionParametro) {
        this.funcionParametroIdFuncionParametro = funcionParametro;
    }

    @Override
    public OperadorCom getOperadorComNumeroOperadorCom() {
        return this.operadorComNumeroOperadorCom;
    }

    public void setOperadorComNumeroOperadorCom(OperadorCom operadorCom) {
        this.operadorComNumeroOperadorCom = operadorCom;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroFuncionPar) {
            FiltroFuncionPar that = (FiltroFuncionPar) object;
            return idFiltroFuncionPar == null ? that.idFiltroFuncionPar == null ? 0 : -1
                    : idFiltroFuncionPar.compareTo(that.idFiltroFuncionPar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFiltroFuncionPar == null ? 0 : idFiltroFuncionPar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroFuncionPar) {
            FiltroFuncionPar that = (FiltroFuncionPar) object;
            return ((idFiltroFuncionPar == null && that.idFiltroFuncionPar == null) ||
                    (idFiltroFuncionPar != null && idFiltroFuncionPar.equals(that.idFiltroFuncionPar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFiltroFuncionPar;
    }
}
