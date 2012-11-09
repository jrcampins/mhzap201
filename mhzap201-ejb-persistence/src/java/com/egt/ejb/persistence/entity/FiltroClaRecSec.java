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

import com.egt.base.persistence.entity.FiltroClaRecSecBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filtro_cla_rec_sec")
public class FiltroClaRecSec implements FiltroClaRecSecBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_filtro_cla_rec_sec")
    private Long idFiltroClaRecSec;

    @Basic(optional = false)
    @Column(name = "version_filtro_cla_rec_sec")
    private long versionFiltroClaRecSec;

    @Column(name = "valor")
    private String valor;

    @JoinColumn(name = "id_clase_recurso_sec", referencedColumnName = "id_clase_recurso_sec")
    @ManyToOne
    private ClaseRecursoSec claseRecursoSecIdClaseRecursoSec;

    @JoinColumn(name = "id_clase_recurso_par_columna", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParColumna;

    @JoinColumn(name = "numero_operador_com", referencedColumnName = "numero_operador_com")
    @ManyToOne
    private OperadorCom operadorComNumeroOperadorCom;

    @JoinColumn(name = "id_clase_recurso_par_valor", referencedColumnName = "id_clase_recurso_par")
    @ManyToOne
    private ClaseRecursoPar claseRecursoParIdClaseRecursoParValor;

    public FiltroClaRecSec() {
    }

    @Override
    public Long getIdFiltroClaRecSec() {
        return this.idFiltroClaRecSec;
    }

    public void setIdFiltroClaRecSec(Long idFiltroClaRecSec) {
        this.idFiltroClaRecSec = idFiltroClaRecSec;
    }

    @Override
    public long getVersionFiltroClaRecSec() {
        return this.versionFiltroClaRecSec;
    }

    public void setVersionFiltroClaRecSec(long versionFiltroClaRecSec) {
        this.versionFiltroClaRecSec = versionFiltroClaRecSec;
    }

    @Override
    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public ClaseRecursoSec getClaseRecursoSecIdClaseRecursoSec() {
        return this.claseRecursoSecIdClaseRecursoSec;
    }

    public void setClaseRecursoSecIdClaseRecursoSec(ClaseRecursoSec claseRecursoSec) {
        this.claseRecursoSecIdClaseRecursoSec = claseRecursoSec;
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
        if (object instanceof FiltroClaRecSec) {
            FiltroClaRecSec that = (FiltroClaRecSec) object;
            return idFiltroClaRecSec == null ? that.idFiltroClaRecSec == null ? 0 : -1
                    : idFiltroClaRecSec.compareTo(that.idFiltroClaRecSec);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFiltroClaRecSec == null ? 0 : idFiltroClaRecSec.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroClaRecSec) {
            FiltroClaRecSec that = (FiltroClaRecSec) object;
            return ((idFiltroClaRecSec == null && that.idFiltroClaRecSec == null) ||
                    (idFiltroClaRecSec != null && idFiltroClaRecSec.equals(that.idFiltroClaRecSec)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFiltroClaRecSec;
    }
}
