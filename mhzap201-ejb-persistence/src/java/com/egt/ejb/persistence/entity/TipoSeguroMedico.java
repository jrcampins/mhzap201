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

import com.egt.base.persistence.entity.TipoSeguroMedicoBase;
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
@Table(name = "tipo_seguro_medico")
public class TipoSeguroMedico implements TipoSeguroMedicoBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_seguro_medico")
    private Integer numeroTipoSeguroMedico;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_seguro_medico")
    private String codigoTipoSeguroMedico;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoSeguroMedicoNumeroTipoSeguroMedico")
    private Collection<FichaPersona> fichaPersonaNumeroTipoSeguroMedicoCollection;

    public TipoSeguroMedico() {
    }

    @Override
    public Integer getNumeroTipoSeguroMedico() {
        return this.numeroTipoSeguroMedico;
    }

    public void setNumeroTipoSeguroMedico(Integer numeroTipoSeguroMedico) {
        this.numeroTipoSeguroMedico = numeroTipoSeguroMedico;
    }

    @Override
    public String getCodigoTipoSeguroMedico() {
        return this.codigoTipoSeguroMedico;
    }

    public void setCodigoTipoSeguroMedico(String codigoTipoSeguroMedico) {
        this.codigoTipoSeguroMedico = codigoTipoSeguroMedico;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaNumeroTipoSeguroMedicoCollection() {
        return this.fichaPersonaNumeroTipoSeguroMedicoCollection;
    }

    public void setFichaPersonaNumeroTipoSeguroMedicoCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaNumeroTipoSeguroMedicoCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoSeguroMedico) {
            TipoSeguroMedico that = (TipoSeguroMedico) object;
            return numeroTipoSeguroMedico == null ? that.numeroTipoSeguroMedico == null ? 0 : -1
                    : numeroTipoSeguroMedico.compareTo(that.numeroTipoSeguroMedico);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoSeguroMedico == null ? 0 : numeroTipoSeguroMedico.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoSeguroMedico) {
            TipoSeguroMedico that = (TipoSeguroMedico) object;
            return ((numeroTipoSeguroMedico == null && that.numeroTipoSeguroMedico == null) ||
                    (numeroTipoSeguroMedico != null && numeroTipoSeguroMedico.equals(that.numeroTipoSeguroMedico)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoSeguroMedico;
    }
}
