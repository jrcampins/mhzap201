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
@Table(name = "vista_system_sysuniqueconstraints")
@NamedQueries({})
public class SystemUniqueConstraint implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "conid", nullable = false)
    private Integer conid;

    @Column(name = "conname", nullable = false)
    private String conname;

    @Column(name = "colno", nullable = false)
    private Integer colno;

    @Column(name = "colname", nullable = false)
    private String colname;

    @JoinColumn(name = "tabid", referencedColumnName = "tabid")
    @ManyToOne
    private SystemTable tabid;

    public SystemUniqueConstraint() {
    }

    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public Integer getColno() {
        return colno;
    }

    public void setColno(Integer colno) {
        this.colno = colno;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname;
    }

    public SystemTable getTabid() {
        return tabid;
    }

    public void setTabid(SystemTable tabid) {
        this.tabid = tabid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conid != null ? conid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemUniqueConstraint)) {
            return false;
        }
        SystemUniqueConstraint other = (SystemUniqueConstraint) object;
        if ((this.conid == null && other.conid != null) || (this.conid != null && !this.conid.equals(other.conid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return conname;
    }
}
