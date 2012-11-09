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

import com.egt.base.persistence.entity.NivelEducativoBase;
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
@Table(name = "nivel_educativo")
public class NivelEducativo implements NivelEducativoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_nivel_educativo")
    private Integer numeroNivelEducativo;

    @Basic(optional = false)
    @Column(name = "codigo_nivel_educativo")
    private String codigoNivelEducativo;

    @Basic(optional = false)
    @Column(name = "primer_curso")
    private int primerCurso;

    @Basic(optional = false)
    @Column(name = "ultimo_curso")
    private int ultimoCurso;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "nivelEducativoNumeroNivelEduUltCurAprob")
    private Collection<FichaPersona> fichaPersonaNumeroNivelEduUltCurAprobCollection;

    public NivelEducativo() {
    }

    @Override
    public Integer getNumeroNivelEducativo() {
        return this.numeroNivelEducativo;
    }

    public void setNumeroNivelEducativo(Integer numeroNivelEducativo) {
        this.numeroNivelEducativo = numeroNivelEducativo;
    }

    @Override
    public String getCodigoNivelEducativo() {
        return this.codigoNivelEducativo;
    }

    public void setCodigoNivelEducativo(String codigoNivelEducativo) {
        this.codigoNivelEducativo = codigoNivelEducativo;
    }

    @Override
    public int getPrimerCurso() {
        return this.primerCurso;
    }

    public void setPrimerCurso(int primerCurso) {
        this.primerCurso = primerCurso;
    }

    @Override
    public int getUltimoCurso() {
        return this.ultimoCurso;
    }

    public void setUltimoCurso(int ultimoCurso) {
        this.ultimoCurso = ultimoCurso;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroNivelEduUltCurAprobCollection() {
        return this.fichaPersonaNumeroNivelEduUltCurAprobCollection;
    }

    public void setFichaPersonaNumeroNivelEduUltCurAprobCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroNivelEduUltCurAprobCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelEducativo) {
            NivelEducativo that = (NivelEducativo) object;
            return numeroNivelEducativo == null ? that.numeroNivelEducativo == null ? 0 : -1
                    : numeroNivelEducativo.compareTo(that.numeroNivelEducativo);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroNivelEducativo == null ? 0 : numeroNivelEducativo.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelEducativo) {
            NivelEducativo that = (NivelEducativo) object;
            return ((numeroNivelEducativo == null && that.numeroNivelEducativo == null) ||
                    (numeroNivelEducativo != null && numeroNivelEducativo.equals(that.numeroNivelEducativo)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroNivelEducativo;
    }
}
