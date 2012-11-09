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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_sysforeignkeys")
@NamedQueries({})
public class SystemForeignKey implements Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "conid", nullable = false)
    private Integer conid;

    @Column(name = "conname", nullable = false)
    private String conname;

    @Column(name = "deleterule", nullable = false)
    private String deleterule;

    @Column(name = "updaterule", nullable = false)
    private String updaterule;

    @Column(name = "colno", nullable = false)
    private Integer colno;

    @Column(name = "colname", nullable = false)
    private String colname;

    @Column(name = "pkcid", nullable = true)
    private Integer pkcid;

    @Column(name = "uqcid", nullable = true)
    private Integer uqcid;

    @Column(name = "refcolno", nullable = false)
    private Integer refcolno;

    @Column(name = "refcolname", nullable = false)
    private String refcolname;

    @JoinColumn(name = "tabid", referencedColumnName = "tabid")
    @ManyToOne
    private SystemTable tabid;

    @JoinColumn(name = "reftabid", referencedColumnName = "tabid")
    @ManyToOne
    private SystemTable reftabid;

    @OneToOne(cascade = {CascadeType.REFRESH}, mappedBy = "sysForeignKey")
    private SystemColumn sysColumn;

    public SystemForeignKey() {
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

    public String getDeleterule() {
        return deleterule;
    }

    public void setDeleterule(String deleterule) {
        this.deleterule = deleterule;
    }

    public String getUpdaterule() {
        return updaterule;
    }

    public void setUpdaterule(String updaterule) {
        this.updaterule = updaterule;
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

    public Integer getPkcid() {
        return pkcid;
    }

    public void setPkcid(Integer pkcid) {
        this.pkcid = pkcid;
    }

    public Integer getUqcid() {
        return uqcid;
    }

    public void setUqcid(Integer uqcid) {
        this.uqcid = uqcid;
    }

    public Integer getRefcolno() {
        return refcolno;
    }

    public void setRefcolno(Integer refcolno) {
        this.refcolno = refcolno;
    }

    public String getRefcolname() {
        return refcolname;
    }

    public void setRefcolname(String refcolname) {
        this.refcolname = refcolname;
    }

    public SystemTable getTabid() {
        return tabid;
    }

    public void setTabid(SystemTable tabid) {
        this.tabid = tabid;
    }

    public SystemTable getReftabid() {
        return reftabid;
    }

    public void setReftabid(SystemTable reftabid) {
        this.reftabid = reftabid;
    }

    public SystemColumn getSysColumn() {
        return sysColumn;
    }

    public void setSysColumn(SystemColumn sysColumn) {
        this.sysColumn = sysColumn;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work in the case the id field is not set
        if (object instanceof SystemForeignKey && tabid != null && colno != null) {
            SystemForeignKey that = (SystemForeignKey) object;
            return tabid.equals(that.tabid) ? colno.compareTo(that.colno) : tabid.compareTo(that.tabid);
        }
        return 0;
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
        if (object instanceof SystemForeignKey && conid != null) {
            SystemForeignKey that = (SystemForeignKey) object;
            return conid.equals(that.conid);
        }
        return false;
    }

    @Override
    public String toString() {
        return conname;
    }
}
