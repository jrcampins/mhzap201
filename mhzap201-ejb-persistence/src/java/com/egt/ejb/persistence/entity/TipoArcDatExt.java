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

import com.egt.base.persistence.entity.TipoArcDatExtBase;
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
@Table(name = "tipo_arc_dat_ext")
public class TipoArcDatExt implements TipoArcDatExtBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_tipo_arc_dat_ext")
    private Integer numeroTipoArcDatExt;

    @Basic(optional = false)
    @Column(name = "codigo_tipo_arc_dat_ext")
    private String codigoTipoArcDatExt;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "tipoArcDatExtNumeroTipoArcDatExt")
    private Collection<ArchivoDatosExt> archivoDatosExtNumeroTipoArcDatExtCollection;

    public TipoArcDatExt() {
    }

    @Override
    public Integer getNumeroTipoArcDatExt() {
        return this.numeroTipoArcDatExt;
    }

    public void setNumeroTipoArcDatExt(Integer numeroTipoArcDatExt) {
        this.numeroTipoArcDatExt = numeroTipoArcDatExt;
    }

    @Override
    public String getCodigoTipoArcDatExt() {
        return this.codigoTipoArcDatExt;
    }

    public void setCodigoTipoArcDatExt(String codigoTipoArcDatExt) {
        this.codigoTipoArcDatExt = codigoTipoArcDatExt;
    }

    @Override
    public Collection<ArchivoDatosExt> getArchivoDatosExtNumeroTipoArcDatExtCollection() {
        return this.archivoDatosExtNumeroTipoArcDatExtCollection;
    }

    public void setArchivoDatosExtNumeroTipoArcDatExtCollection(Collection<ArchivoDatosExt> collection) {
        this.archivoDatosExtNumeroTipoArcDatExtCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoArcDatExt) {
            TipoArcDatExt that = (TipoArcDatExt) object;
            return numeroTipoArcDatExt == null ? that.numeroTipoArcDatExt == null ? 0 : -1
                    : numeroTipoArcDatExt.compareTo(that.numeroTipoArcDatExt);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroTipoArcDatExt == null ? 0 : numeroTipoArcDatExt.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof TipoArcDatExt) {
            TipoArcDatExt that = (TipoArcDatExt) object;
            return ((numeroTipoArcDatExt == null && that.numeroTipoArcDatExt == null) ||
                    (numeroTipoArcDatExt != null && numeroTipoArcDatExt.equals(that.numeroTipoArcDatExt)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroTipoArcDatExt;
    }
}
