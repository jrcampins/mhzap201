/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

import com.egt.base.enums.EnumTipoDatoPar;

public class JasperReportField {

    String name;

    String alias;

    String colname;

    String tabname;

    String tabalias;

    String suffix;

    String label;

    String javaClassName;

    int pixels;

    boolean printable;

    EnumTipoDatoPar dataType;

    public JasperReportField() {
        this.name = "";
        this.alias = "";
        this.colname = "";
        this.tabname = "";
        this.tabalias = "";
        this.suffix = "";
        this.label = "";
        this.javaClassName = "";
        this.pixels = 0;
        this.printable = false;
        this.dataType = null;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

//  public String getColname() {
//      return colname;
//  }
//
//  public String getTabname() {
//      return tabname;
//  }
//
//  public String getTabalias() {
//      return tabalias;
//  }
//
//
    public String getSuffix() {
        return suffix;
    }

    public String getLabel() {
        return label;
    }

    public String getJavaClassName() {
        return javaClassName;
    }

    public int getPixels() {
        return dataType == null ? 0 : pixels;
    }

    public EnumTipoDatoPar getDataType() {
        return dataType;
    }

}
