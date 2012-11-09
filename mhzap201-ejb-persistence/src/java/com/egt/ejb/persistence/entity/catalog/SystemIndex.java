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
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_sysindexes")
@NamedQueries({})
public class SystemIndex implements Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "indid", nullable = false)
    private Integer indid;

    @Column(name = "indname", nullable = false)
    private String indname;

    @Column(name = "uqkey", nullable = false)
    private Integer uqkey;

    @Column(name = "ncols", nullable = false)
    private Integer ncols;

    @JoinColumn(name = "tabid", referencedColumnName = "tabid")
    @ManyToOne
    private SystemTable tabid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "indid")
    private Collection<SystemIndexColumn> columns;

    public SystemIndex() {
    }

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public String getIndname() {
        return indname;
    }

    public void setIndname(String indname) {
        this.indname = indname;
    }

    public Integer getUqkey() {
        return uqkey;
    }

    public void setUqkey(Integer uqkey) {
        this.uqkey = uqkey;
    }

    public Integer getNcols() {
        return ncols;
    }

    public void setNcols(Integer ncols) {
        this.ncols = ncols;
    }

    public SystemTable getTabid() {
        return tabid;
    }

    public void setTabid(SystemTable tabid) {
        this.tabid = tabid;
    }

    public Collection<SystemIndexColumn> getColumns() {
        return columns;
    }

    public void setColumns(Collection<SystemIndexColumn> columns) {
        this.columns = columns;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work in the case the id field is not set
        if (object instanceof SystemIndex && indid != null) {
            SystemIndex that = (SystemIndex) object;
            return indid.compareTo(that.indid);
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
        if (!(object instanceof SystemIndex)) {
            return false;
        }
        SystemIndex other = (SystemIndex) object;
        if ((this.indid == null && other.indid != null) || (this.indid != null && !this.indid.equals(other.indid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return indname;
    }

}
