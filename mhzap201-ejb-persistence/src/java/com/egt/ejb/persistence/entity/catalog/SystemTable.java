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
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_systables")
@NamedQueries({})
public class SystemTable implements Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "tabid", nullable = false)
    private Integer tabid;

    @Column(name = "tabname", nullable = false)
    private String tabname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabid")
    private Collection<SystemColumn> columns;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tabid")
    private SystemPrimaryKey primaryKey;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabid")
    private Collection<SystemUniqueConstraint> uniqueConstraints;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabid")
    private Collection<SystemColumnConstraint> columnConstraints;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabid")
    private Collection<SystemForeignKey> foreignKeys;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reftabid")
    private Collection<SystemForeignKey> refForeignKeys;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabid")
    private Collection<SystemIndex> indexes;

    public SystemTable() {
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public Collection<SystemColumn> getColumns() {
        return columns;
    }

    public void setColumns(Collection<SystemColumn> columns) {
        this.columns = columns;
    }

    public SystemPrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(SystemPrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Collection<SystemUniqueConstraint> getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setUniqueConstraints(Collection<SystemUniqueConstraint> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    public Collection<SystemColumnConstraint> getColumnConstraints() {
        return columnConstraints;
    }

    public void setColumnConstraints(Collection<SystemColumnConstraint> columnConstraints) {
        this.columnConstraints = columnConstraints;
    }

    public Collection<SystemForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(Collection<SystemForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    public Collection<SystemForeignKey> getRefForeignKeys() {
        return refForeignKeys;
    }

    public void setRefForeignKeys(Collection<SystemForeignKey> refForeignKeys) {
        this.refForeignKeys = refForeignKeys;
    }

    public Collection<SystemIndex> getIndexes() {
        return indexes;
    }

    public void setIndexes(Collection<SystemIndex> indexes) {
        this.indexes = indexes;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work in the case the id field is not set
        if (object instanceof SystemTable && tabname != null) {
            SystemTable that = (SystemTable) object;
            return tabname.compareTo(that.tabname);
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabid != null ? tabid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work in the case the id fields are not set
        if (object instanceof SystemTable && tabid != null) {
            SystemTable that = (SystemTable) object;
            return tabid.equals(that.tabid);
        }
        return false;
    }

    @Override
    public String toString() {
        return tabname;
    }
}
