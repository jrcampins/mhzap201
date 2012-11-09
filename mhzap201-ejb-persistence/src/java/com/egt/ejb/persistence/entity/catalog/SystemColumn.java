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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_syscolumns")
@NamedQueries({})
public class SystemColumn implements Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "colid", nullable = false)
    private Long colid;

    @Column(name = "colno", nullable = false)
    private Integer colno;

    @Column(name = "colname", nullable = false)
    private String colname;

    @Column(name = "coltype", nullable = false)
    private Integer coltype;

    @Column(name = "typname", nullable = false)
    private String typname;

    @Column(name = "javatypname", nullable = false)
    private String javatypname;

    @Column(name = "javaclassname", nullable = false)
    private String javaclassname;

    @Column(name = "collength", nullable = false)
    private Integer collength;

    @Column(name = "colprec", nullable = false)
    private Integer colprec;

    @Column(name = "colscale", nullable = false)
    private Integer colscale;

    @Column(name = "colwidth", nullable = false)
    private Integer colwidth;

    @Column(name = "isnullable", nullable = false)
    private Integer isnullable;

    @Column(name = "hasdefault", nullable = false)
    private Integer hasdefault;

    @Column(name = "coldefault", nullable = true)
    private String coldefault;

    @Column(name = "pkcid", nullable = true)
    private Integer pkcid;

    @Column(name = "uqcid", nullable = true)
    private Integer uqcid;

    @Column(name = "fkcid", nullable = true)
    private Integer fkcid;

    @JoinColumn(name = "tabid", referencedColumnName = "tabid")
    @ManyToOne
    private SystemTable tabid;

    @JoinColumn(name = "fkcid", referencedColumnName = "conid", insertable = false, updatable = false)
    @OneToOne
    private SystemForeignKey sysForeignKey;

    public SystemColumn() {
    }

    public Long getColid() {
        return colid;
    }

    public void setColid(Long colid) {
        this.colid = colid;
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

    public Integer getColtype() {
        return coltype;
    }

    public void setColtype(Integer coltype) {
        this.coltype = coltype;
    }

    public String getTypname() {
        return typname;
    }

    public void setTypname(String typname) {
        this.typname = typname;
    }

    public String getJavatypname() {
        return javatypname;
    }

    public void setJavatypname(String javatypname) {
        this.javatypname = javatypname;
    }

    public String getJavaclassname() {
        return javaclassname;
    }

    public void setJavaclassname(String javaclassname) {
        this.javaclassname = javaclassname;
    }

    public Integer getCollength() {
        return collength;
    }

    public void setCollength(Integer collength) {
        this.collength = collength;
    }

    public Integer getColprec() {
        return colprec;
    }

    public void setColprec(Integer colprec) {
        this.colprec = colprec;
    }

    public Integer getColscale() {
        return colscale;
    }

    public void setColscale(Integer colscale) {
        this.colscale = colscale;
    }

    public Integer getColwidth() {
        return colwidth;
    }

    public void setColwidth(Integer colwidth) {
        this.colwidth = colwidth;
    }

    public Integer getIsnullable() {
        return isnullable;
    }

    public void setIsnullable(Integer isnullable) {
        this.isnullable = isnullable;
    }

    public Integer getHasdefault() {
        return hasdefault;
    }

    public void setHasdefault(Integer hasdefault) {
        this.hasdefault = hasdefault;
    }

    /**
     * @return the coldefault
     */
    public String getColdefault() {
        return coldefault;
    }

    /**
     * @param coldefault the coldefault to set
     */
    public void setColdefault(String coldefault) {
        this.coldefault = coldefault;
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

    public Integer getFkcid() {
        return fkcid;
    }

    public void setFkcid(Integer fkcid) {
        this.fkcid = fkcid;
    }

    public SystemTable getTabid() {
        return tabid;
    }

    public void setTabid(SystemTable tabid) {
        this.tabid = tabid;
    }

    public SystemForeignKey getSysForeignKey() {
        return sysForeignKey;
    }

    public void setSysForeignKey(SystemForeignKey sysForeignKey) {
        this.sysForeignKey = sysForeignKey;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work in the case the id field is not set
        if (object instanceof SystemColumn && tabid != null && colno != null) {
            SystemColumn that = (SystemColumn) object;
            return tabid.equals(that.tabid) ? colno.compareTo(that.colno) : tabid.compareTo(that.tabid);
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colid != null ? colid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work in the case the id fields are not set
        if (object instanceof SystemColumn && colid != null) {
            SystemColumn that = (SystemColumn) object;
            return colid.equals(that.colid);
        }
        return false;
    }

    @Override
    public String toString() {
        return colname;
    }

}
