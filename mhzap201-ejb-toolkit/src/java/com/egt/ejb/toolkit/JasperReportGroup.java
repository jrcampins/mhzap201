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

import java.util.ArrayList;
import java.util.Collection;

public class JasperReportGroup implements Comparable {

    int sequence;

    boolean detail;

    String name;

    String label;

    String expression;

    Collection<JasperReportField> fields;

    public JasperReportGroup() {
        this.init();
    }

    public JasperReportGroup(int sequence) {
        this.init();
        this.sequence = sequence;
        this.detail = false;
    }

    private void init() {
        this.sequence = Integer.MAX_VALUE;
        this.detail = true;
        this.name = "";
        this.label = "";
        this.expression = "";
        this.fields = new ArrayList();
    }

    public int getSequence() {
        return sequence;
    }

    public Boolean isDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public String getExpression() {
        return expression;
    }

    public Collection<JasperReportField> getFields() {
        return fields;
    }

    @Override
    public int compareTo(Object object) {
        JasperReportGroup that = object instanceof JasperReportGroup ? (JasperReportGroup) object : null;
        return that == null ? 0 : Integer.valueOf(this.sequence).compareTo(Integer.valueOf(that.sequence));
    }
}
