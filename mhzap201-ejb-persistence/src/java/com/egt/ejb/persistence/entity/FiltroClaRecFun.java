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

import com.egt.base.persistence.entity.FiltroClaRecFunBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filtro_cla_rec_fun")
public class FiltroClaRecFun implements FiltroClaRecFunBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_filtro_cla_rec_fun")
    private Long idFiltroClaRecFun;

    @Basic(optional = false)
    @Column(name = "version_filtro_cla_rec_fun")
    private long versionFiltroClaRecFun;

    @Column(name = "valor")
    private String valor;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "id_clase_recurso_par_columna", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParColumna;

    @JoinColumn(name = "numero_operador_com", referencedColumnName = "numero_operador_com")
    @ManyToOne
    private OperadorCom operadorComNumeroOperadorCom;

    @JoinColumn(name = "id_clase_recurso_par_valor", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParValor;

    public FiltroClaRecFun() {
    }

    @Override
    public Long getIdFiltroClaRecFun() {
        return this.idFiltroClaRecFun;
    }

    public void setIdFiltroClaRecFun(Long idFiltroClaRecFun) {
        this.idFiltroClaRecFun = idFiltroClaRecFun;
    }

    @Override
    public long getVersionFiltroClaRecFun() {
        return this.versionFiltroClaRecFun;
    }

    public void setVersionFiltroClaRecFun(long versionFiltroClaRecFun) {
        this.versionFiltroClaRecFun = versionFiltroClaRecFun;
    }

    @Override
    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public ClaseRecursoPar getClaseRecursoParIdClaseRecursoParColumna() {
        return this.claseRecursoParIdClaseRecursoParColumna;
    }

    public void setClaseRecursoParIdClaseRecursoParColumna(ClaseRecursoPar claseRecursoPar) {
        this.claseRecursoParIdClaseRecursoParColumna = claseRecursoPar;
    }

    @Override
    public OperadorCom getOperadorComNumeroOperadorCom() {
        return this.operadorComNumeroOperadorCom;
    }

    public void setOperadorComNumeroOperadorCom(OperadorCom operadorCom) {
        this.operadorComNumeroOperadorCom = operadorCom;
    }

    @Override
    public ClaseRecursoPar getClaseRecursoParIdClaseRecursoParValor() {
        return this.claseRecursoParIdClaseRecursoParValor;
    }

    public void setClaseRecursoParIdClaseRecursoParValor(ClaseRecursoPar claseRecursoPar) {
        this.claseRecursoParIdClaseRecursoParValor = claseRecursoPar;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroClaRecFun) {
            FiltroClaRecFun that = (FiltroClaRecFun) object;
            return idFiltroClaRecFun == null ? that.idFiltroClaRecFun == null ? 0 : -1
                    : idFiltroClaRecFun.compareTo(that.idFiltroClaRecFun);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFiltroClaRecFun == null ? 0 : idFiltroClaRecFun.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroClaRecFun) {
            FiltroClaRecFun that = (FiltroClaRecFun) object;
            return ((idFiltroClaRecFun == null && that.idFiltroClaRecFun == null) ||
                    (idFiltroClaRecFun != null && idFiltroClaRecFun.equals(that.idFiltroClaRecFun)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFiltroClaRecFun;
    }
}
