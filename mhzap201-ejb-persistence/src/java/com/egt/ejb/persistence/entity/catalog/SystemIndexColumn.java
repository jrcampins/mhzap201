/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.persistence.entity.catalog;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_sysindexcolumns")
@NamedQueries({})
public class SystemIndexColumn implements Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "indcolid", nullable = false)
    private Long indcolid;

    @Column(name = "indcolno", nullable = false)
    private Integer indcolno;

    @Column(name = "indcolopt", nullable = false)
    private Integer indcolopt;

    @JoinColumn(name = "indid", referencedColumnName = "indid")
    @ManyToOne
    private SystemIndex indid;

    @JoinColumn(name = "colid", referencedColumnName = "colid")
    @ManyToOne
    private SystemColumn colid;

    public SystemIndexColumn() {
    }

    public Long getIndcolid() {
        return indcolid;
    }

    public void setIndcolid(Long indcolid) {
        this.indcolid = indcolid;
    }

    public Integer getIndcolno() {
        return indcolno;
    }

    public void setIndcolno(Integer indcolno) {
        this.indcolno = indcolno;
    }

    public Integer getIndcolopt() {
        return indcolopt;
    }

    public void setIndcolopt(Integer indcolopt) {
        this.indcolopt = indcolopt;
    }

    public SystemIndex getIndid() {
        return indid;
    }

    public void setIndid(SystemIndex indid) {
        this.indid = indid;
    }

    public SystemColumn getColid() {
        return colid;
    }

    public void setColid(SystemColumn colid) {
        this.colid = colid;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work in the case the id field is not set
        if (object instanceof SystemIndexColumn && indid != null && indcolno != null) {
            SystemIndexColumn that = (SystemIndexColumn) object;
            return indid.equals(that.indid) ? indcolno.compareTo(that.indcolno) : indid.compareTo(that.indid);
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indid != null ? indid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemIndexColumn)) {
            return false;
        }
        SystemIndexColumn other = (SystemIndexColumn) object;
        if ((this.indid == null && other.indid != null) || (this.indid != null && !this.indid.equals(other.indid))) {
            return false;
        }
        return true;
    }

}
