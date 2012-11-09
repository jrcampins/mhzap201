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

import com.egt.base.persistence.entity.FiltroClaRecParBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filtro_cla_rec_par")
public class FiltroClaRecPar implements FiltroClaRecParBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_filtro_cla_rec_par")
    private Long idFiltroClaRecPar;

    @Basic(optional = false)
    @Column(name = "version_filtro_cla_rec_par")
    private long versionFiltroClaRecPar;

    @Column(name = "valor")
    private String valor;

    @JoinColumn(name = "id_clase_recurso_par", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoPar;

    @JoinColumn(name = "id_clase_recurso_par_columna", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParColumna;

    @JoinColumn(name = "numero_operador_com", referencedColumnName = "numero_operador_com")
    @ManyToOne
    private OperadorCom operadorComNumeroOperadorCom;

    @JoinColumn(name = "id_clase_recurso_par_valor", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParValor;

    public FiltroClaRecPar() {
    }

    @Override
    public Long getIdFiltroClaRecPar() {
        return this.idFiltroClaRecPar;
    }

    public void setIdFiltroClaRecPar(Long idFiltroClaRecPar) {
        this.idFiltroClaRecPar = idFiltroClaRecPar;
    }

    @Override
    public long getVersionFiltroClaRecPar() {
        return this.versionFiltroClaRecPar;
    }

    public void setVersionFiltroClaRecPar(long versionFiltroClaRecPar) {
        this.versionFiltroClaRecPar = versionFiltroClaRecPar;
    }

    @Override
    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public ClaseRecursoPar getClaseRecursoParIdClaseRecursoPar() {
        return this.claseRecursoParIdClaseRecursoPar;
    }

    public void setClaseRecursoParIdClaseRecursoPar(ClaseRecursoPar claseRecursoPar) {
        this.claseRecursoParIdClaseRecursoPar = claseRecursoPar;
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
        if (object instanceof FiltroClaRecPar) {
            FiltroClaRecPar that = (FiltroClaRecPar) object;
            return idFiltroClaRecPar == null ? that.idFiltroClaRecPar == null ? 0 : -1
                    : idFiltroClaRecPar.compareTo(that.idFiltroClaRecPar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFiltroClaRecPar == null ? 0 : idFiltroClaRecPar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroClaRecPar) {
            FiltroClaRecPar that = (FiltroClaRecPar) object;
            return ((idFiltroClaRecPar == null && that.idFiltroClaRecPar == null) ||
                    (idFiltroClaRecPar != null && idFiltroClaRecPar.equals(that.idFiltroClaRecPar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFiltroClaRecPar;
    }
}
