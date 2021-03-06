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

import com.egt.ejb.persistence.entity.Dominio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JasperReport {

    private String name;

    private String title;

    private JasperQuery query;

    private String queryString;

    private int interFieldGapWidth;

    private Collection<JasperReportGroup> groups;

    private static final int COLUMN_WIDTH = 960;

    private ToolKitBeanLocator locator;

    private Dominio dominio;

    public JasperReport(ToolKitBeanLocator locator, Dominio dominio) {
        this.locator = locator;
        this.dominio = dominio;
        this.name = dominio.getCodigoDominio();
        this.title = dominio.getNombreDominio();
        this.query = new JasperQuery(locator, dominio);
        this.queryString = "";
        this.interFieldGapWidth = 0;
        this.groups = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public JasperQuery getQuery() {
        return query;
    }

    public String getQueryString() {
        return queryString;
    }

    public int getInterFieldGapWidth() {
        return interFieldGapWidth;
    }

    public Collection<JasperReportGroup> getGroups() {
        List list = (List) groups;
        Collections.sort(list);
        return list;
    }

    public void designReport() {
        this.queryString = "select * from consulta_" + dominio.getCodigoDominio() + "_1";
        this.groups.add(new JasperReportGroup(1));
        this.groups.add(new JasperReportGroup(2));
        this.groups.add(new JasperReportGroup(3));
        this.groups.add(new JasperReportGroup(4));
        JasperReportGroup group = new JasperReportGroup();
        query.designQuery(1);
        group.fields = query.getFields();
        if (group.fields.size() > 0) {
            this.resize(group);
            this.groups.add(group);
        }
    }

    private void resize(JasperReportGroup group) {
        int used = 0;
        int size = 0;
        JasperReportField last = null;
        for (JasperReportField field : group.getFields()) {
            if (field.pixels > 0 && field.pixels + used <= COLUMN_WIDTH) {
                used += field.pixels;
                if (field.resizeable()) {
                    last = field;
                    size += field.pixels;
                }
            }
        }
        int free = COLUMN_WIDTH - used;
        if (last != null && free > 0) {
            int extra;
            for (JasperReportField field : group.getFields()) {
                if (field.pixels > 0 && used < COLUMN_WIDTH) {
                    if (field == last) {
                        extra = COLUMN_WIDTH - used;
                    } else if (field.resizeable()) {
                        extra = field.pixels * free / size;
                    } else {
                        extra = 0;
                    }
                    if (extra > field.pixels) {
                        extra = field.pixels;
                    }
                    used += extra;
                    field.pixels += extra;
                }
            }
        }
    }

}
