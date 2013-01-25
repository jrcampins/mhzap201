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
import com.egt.base.enums.EnumTipoParametro;
import com.egt.commons.util.BitUtils;
import com.egt.ejb.persistence.entity.ClaseRecursoPar;
import com.egt.ejb.persistence.entity.Dominio;
import com.egt.ejb.persistence.entity.catalog.SystemColumn;
import com.egt.ejb.persistence.entity.catalog.SystemTable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang.StringUtils;

public class JasperQuery {

    private String name;

    private String queryString;

    Collection<JasperReportField> fields;

    private int depthLimit;

    private int tableLimit;

    private int fieldLimit;

    private int depthCount;

    private int tableCount;

    private int fieldCount;

    private int fieldDepth;

    private int[] tableIndexArray;

    private int[] fieldCountArray;

//  private static final String DQ = "\"";
    private static final String DQ = "";

    private static final String NL = "\n";

    private static final String TAB = "\t";

    private static final int DEPTH_LIMIT = 255;

    private static final int TABLE_LIMIT = 255;

    private static final int FIELD_LIMIT = 1023;

    private ToolKitBeanLocator locator;

    private Dominio dominio;

    private Collection<ClaseRecursoPar> parametros;

    private SystemTable baseTable;

    private Collection<SystemColumn> baseTableColumns;

    public JasperQuery(ToolKitBeanLocator locator, Dominio dominio) {
        this.locator = locator;
        this.dominio = dominio;
        this.parametros = dominio.getClaseRecursoIdClaseRecurso().getClaseRecursoParIdClaseRecursoCollection();
        this.name = dominio.getCodigoDominio();
        this.queryString = "";
        this.fields = new LinkedHashSet();
        this.initBaseTable();
        this.initBaseTableColumns();
    }

    private void initBaseTable() {
        baseTable = dominio.getClaseRecursoIdClaseRecurso().getClaseRecursoIdClaseRecursoBase() == null
            ? locator.getSystemTableFacade().findByCodigo(dominio.getClaseRecursoIdClaseRecurso().getCodigoClaseRecurso())
            : locator.getSystemTableFacade().findByCodigo(dominio.getClaseRecursoIdClaseRecurso().getClaseRecursoIdClaseRecursoBase().getCodigoClaseRecurso());
    }

    private void initBaseTableColumns() {
        baseTableColumns = new LinkedHashSet();
        for (SystemColumn c : baseTable.getColumns()) {
            if (this.isFairBaseTableColumn(c)) {
                baseTableColumns.add(c);
            }
        }
    }

    private boolean isFairBaseTableColumn(SystemColumn c) {
        for (ClaseRecursoPar crp : dominio.getClaseRecursoIdClaseRecurso().getClaseRecursoParIdClaseRecursoCollection()) {
            if (crp.getParametroIdParametro().getCodigoParametro().equals(c.getColname())) {
//              return crp.getTipoParametroNumeroTipoParametro().getNumeroTipoParametro().equals(EnumTipoParametro.OMITIDO.intValue());
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getQueryString() {
        return queryString;
    }

    public Collection<JasperReportField> getFields() {
        return fields;
    }

    public void designQuery() {
        this.designQuery(DEPTH_LIMIT);
    }

    public void designQuery(int depthLimit) {
        this.designQuery(depthLimit, TABLE_LIMIT);
    }

    public void designQuery(int depthLimit, int tableLimit) {
        this.designQuery(depthLimit, tableLimit, FIELD_LIMIT);
    }

    public void designQuery(int depthLimit, int tableLimit, int fieldLimit) {
        this.depthLimit = depthLimit;
        this.tableLimit = tableLimit;
        this.fieldLimit = fieldLimit;
        this.queryString = this.query();
    }

    private String query() {
        this.initFieldCountArray();
        String query = "SELECT";
        query += this.fields(baseTable, 0, new LinkedHashSet(), null);
        query = query.substring(0, query.length() - 1);
        query += NL + "FROM";
        query += NL + TAB + DQ + name + DQ + " " + baseTable.getTabname();
        query += this.joins(baseTable, 0, new LinkedHashSet());
//      String stats = "";
//      stats += "--" + TAB + "table........: " + name + NL;
//      stats += "--" + TAB + "depth-limit..: " + depthLimit + NL;
//      stats += "--" + TAB + "table-limit..: " + tableLimit + NL;
//      stats += "--" + TAB + "field-limit..: " + fieldLimit + NL;
//      stats += "--" + TAB + "field-count[]: " + this.fieldCountArrayString() + NL;
//      stats += "--" + TAB + "field-depth..: " + fieldDepth + NL;
//      stats += "--" + TAB + "depth-count..: " + depthCount + NL;
//      stats += "--" + TAB + "table-count..: " + tableCount + NL;
//      stats += "--" + TAB + "field-count..: " + fieldCount + NL;
//      for (JasperReportField field : fields) {
//          stats += "--" + TAB + field.name + NL;
//          stats += "--" + TAB + TAB + field.colname + NL;
//          stats += "--" + TAB + TAB + field.tabname + NL;
//          stats += "--" + TAB + TAB + field.tabalias + NL;
//          stats += "--" + TAB + TAB + field.suffix + NL;
//          stats += "--" + TAB + TAB + field.label + NL;
//          stats += "--" + TAB + TAB + field.javaClassName + NL;
//          stats += "--" + TAB + TAB + field.pixels + NL;
//      }
        return query;
    }

    private void initFieldCountArray() {
        fieldDepth = 0;
        fieldCountArray = new int[depthLimit + 1];
        this.initFieldCountArray(baseTable, 0, new LinkedHashSet());
        for (int i = 0, j = 0; i <= depthLimit; i++) {
            if (fieldCountArray[i] > 0 && j + fieldCountArray[i] <= fieldLimit) {
                j += fieldCountArray[i];
                fieldDepth = i;
            } else {
                break;
            }
        }
    }

    private void initFieldCountArray(SystemTable table, int depth, Set joined) {
        if (depth == 0) {
            tableCount = 0;
        } else {
            if (depth > depthLimit || tableCount >= tableLimit) {
                return;
            }
            tableCount++;
        }
        boolean debutante = !joined.contains(table.getTabname());
        if (debutante) {
            joined.add(table.getTabname());
        }
        SystemTable reftable;
        Collection<SystemColumn> tableColumns = depth == 0 ? baseTableColumns : table.getColumns();
        for (SystemColumn c : tableColumns) {
            add2FieldCountArray(c, depth);
            if (debutante && c.getSysForeignKey() != null) {
                reftable = c.getSysForeignKey().getReftabid();
                this.initFieldCountArray(reftable, depth + 1, joined);
            }
        }
        if (debutante) {
            joined.remove(table.getTabname());
        }
    }

    private void add2FieldCountArray(SystemColumn c, int depth) {
        if (depth > 0) {
            if (c.getPkcid() != null || c.getColname().equals("version" + "_" + c.getTabid().getTabname())) {
                return;
            }
        }
        fieldCountArray[depth]++;
    }

    private String fieldCountArrayString() {
        String s = "";
        for (int i = 0; i <= depthLimit; i++) {
            if (fieldCountArray[i] > 0) {
                s += "," + fieldCountArray[i];
            }
        }
        return s.length() == 0 ? s : s.substring(1);
    }

    private String fields(SystemTable table, int depth, Set joined, JasperReportField keyField) {
        String suffix = "";
        if (depth == 0) {
            tableCount = 0;
            tableIndexArray = new int[fieldDepth + 1];
            fieldCount = baseTableColumns.size();
            fields.clear();
        } else {
            if (depth > fieldDepth || tableCount >= tableLimit) {
                return "";
            }
            tableCount++;
            tableIndexArray[depth]++;
            suffix = "_" + depth + "x" + tableIndexArray[depth];
        }
        boolean debutante = !joined.contains(table.getTabname());
        if (debutante) {
            joined.add(table.getTabname());
        }
        String alias = table.getTabname() + suffix;
        String columns = "";
        JasperReportField field;
        Collection<SystemColumn> tableColumns = depth == 0 ? baseTableColumns : table.getColumns();
        for (SystemColumn c : tableColumns) {
            columns += field(c, alias, suffix, depth);
            field = field(c, alias, suffix, depth, keyField);
            if (debutante && c.getSysForeignKey() != null) {
                columns += this.fields(c.getSysForeignKey().getReftabid(), depth + 1, joined, field);
            }
        }
        if (debutante) {
            joined.remove(table.getTabname());
        }
        return columns;
    }

    private String field(SystemColumn c, String alias, String suffix, int depth) {
        boolean pkey = c.getPkcid() != null;
//      boolean fkey = c.getFkcid() != null;
//      boolean col1 = prefixed(c, "id");
        boolean col2 = prefixed(c, "version");
//      boolean col3 = prefixed(c, "codigo");
//      boolean col4 = prefixed(c, "nombre");
//      boolean col5 = prefixed(c, "descripcion");
        boolean join = depth > 0;
        boolean skip = depth > fieldDepth || fieldCount >= fieldLimit || pkey || col2;
        if (join) {
            if (skip) {
                return "";
            }
            fieldCount++;
        }
        return NL + StringUtils.repeat(TAB, depth + 1) + alias + "." + DQ + c.getColname() + DQ + " AS " + shortAlias(c, suffix) + ",";
    }

    private JasperReportField field(SystemColumn c, String alias, String suffix, int depth, JasperReportField keyField) {
        boolean pkey = c.getPkcid() != null;
        boolean fkey = c.getFkcid() != null;
        boolean col1 = prefixed(c, "id");
        boolean col2 = prefixed(c, "version");
        boolean col3 = prefixed(c, "codigo");
        boolean col4 = prefixed(c, "nombre");
        boolean col5 = prefixed(c, "numero_condicion");
        boolean col6 = enclosed(c, "es", "inactiva");
        boolean col7 = enclosed(c, "es", "inactivo");
        boolean join = depth > 0;
        boolean skip = depth > fieldDepth || fieldCount >= fieldLimit || pkey || col2;
        if (join) {
            if (skip) {
                return null;
            }
        }
        boolean hidden = pkey || fkey || col1 || col2;
        boolean omitted = false;
        boolean printable = false;
        boolean cvp0 = false;
        if (depth == 0) {
            String colname = c.getColname();
            EnumTipoParametro tipo;
            for (ClaseRecursoPar crp : parametros) {
                if (crp.getParametroIdParametro().getCodigoParametro().equals(colname)) {
                    tipo = EnumTipoParametro.valueOf(crp.getTipoParametroNumeroTipoParametro().getNumeroTipoParametro());
                    omitted = EnumTipoParametro.OMITIDO.equals(tipo);
                    printable = !omitted && BitUtils.valueOf(crp.getEsParametroPrimordial());
                    break;
                }
            }
            cvp0 = !omitted && (col3 || col4 || col5 || col6 || col7);
        }
        boolean cvp1 = depth == 1 && col3 && keyField != null && keyField.printable;
        boolean show = !hidden && (printable || cvp0 || cvp1);
        JasperReportField f = field(c, alias, suffix, join, show, keyField);
        f.printable = printable;
        fields.add(f);
        return f;
    }

    private boolean prefixed(SystemColumn c, String prefix) {
        return c.getColname().equals(prefix + "_" + c.getTabid().getTabname());
    }

    private boolean enclosed(SystemColumn c, String prefix, String suffix) {
        return c.getColname().equals(prefix + "_" + c.getTabid().getTabname() + "_" + suffix);
    }

    private JasperReportField field(SystemColumn c, String alias, String suffix, boolean join, boolean show, JasperReportField keyField) {
        JasperReportField field = field(c);
        if (StringUtils.isNotBlank(suffix)) {
            field.name = shortAlias(c, suffix);
            field.alias = longAlias(c, suffix);
        }
        if (join) {
            field.tabalias = alias;
            field.label = this.getJoinFieldLabel(c);
            if (keyField != null) {
                keyField.suffix = suffix;
            }
        }
        if (!show) {
            field.pixels = 0;
        } else if (field.pixels > 384) {
            field.pixels = 384;
        }
        return field;
    }

    private JasperReportField field(SystemColumn c) {
        JasperReportField field = new JasperReportField();
        field.name = c.getColname();
        field.alias = c.getColname();
        field.colname = c.getColname();
        field.tabname = c.getTabid().getTabname();
        field.tabalias = c.getTabid().getTabname();
        field.suffix = "";
        field.label = this.getFieldLabel(c);
        field.javaClassName = c.getJavaclassname();
        field.pixels = c.getColwidth();
        field.dataType = EnumTipoDatoPar.valueOf(c.getColtype());
        return field;
    }

    private String getFieldLabel(SystemColumn c) {
        String label = "$" + c.getColname();
        String tabname = c.getTabid().getTabname();
        if (c.getSysForeignKey() != null) {
            label = label.replace("$id_", "").replace("$numero_", "");
        }
        label = label.replace("_" + tabname, "").replace("$es_", "").replace("$", "");
        return ToolKitUtils.getUnderscoreless(label);
    }

    private String getJoinFieldLabel(SystemColumn c) {
        String label = "$" + c.getColname();
        label = label.replace("$id_", "").replace("$codigo_", "").replace("$numero_", "").replace("$", "");
        return ToolKitUtils.getUnderscoreless(label);
    }

    private String joins(SystemTable table, int depth, Set joined) {
        String suffix = "";
        if (depth == 0) {
            depthCount = 0;
            tableCount = 0;
            tableIndexArray = new int[fieldDepth + 1];
        } else {
            if (depth > depthCount) {
                depthCount = depth;
            }
            if (depth == this.fieldDepth) {
                return "";
            }
            suffix = "_" + depth + "x" + tableIndexArray[depth];
        }
        joined.add(table.getTabname());
        String alias = table.getTabname() + suffix;
        SystemTable reftable;
        String refalias;
        String LP = " (";
        String RP = ") ";
        String ij;
        String nj;
        String on;
        String joins = "";
        int depthPlus1 = depth + 1;
        Collection<SystemColumn> tableColumns = depth == 0 ? baseTableColumns : table.getColumns();
        for (SystemColumn c : tableColumns) {
            if (c.getSysForeignKey() != null && tableCount < tableLimit) {
                reftable = c.getSysForeignKey().getReftabid();
//              refalias = reftable.getTabname() + "_" + ++tableCount;
                tableCount++;
                tableIndexArray[depthPlus1]++;
                refalias = reftable.getTabname() + "_" + depthPlus1 + "x" + tableIndexArray[depthPlus1];
                nj = joined.contains(reftable.getTabname()) ? "" : this.joins(reftable, depthPlus1, joined);
                ij = NL + StringUtils.repeat(TAB, depthPlus1);
                ij += BitUtils.valueOf(c.getIsnullable()) ? "LEFT OUTER JOIN" : "INNER JOIN";
                ij += StringUtils.isBlank(nj) ? " " : LP;
                ij += DQ + reftable.getTabname() + DQ + " " + refalias;
                on = StringUtils.isBlank(nj) ? " " : NL + StringUtils.repeat(TAB, depthPlus1) + RP;
                on += "ON ";
                on += refalias + "." + DQ + c.getSysForeignKey().getRefcolname() + DQ;
                on += " = ";
                on += alias + "." + DQ + c.getColname() + DQ;
                joins += ij + nj + on;
            }
        }
        joined.remove(table.getTabname());
        return joins;
    }

    private String shortAlias(SystemColumn c, String suffix) {
        String str1 = c.getColname();
        if (StringUtils.isBlank(suffix)) {
            return str1;
        }
        String str2 = suffix + "y" + c.getColno();
        int end = 30 - str2.length();
        return end > 0 && end < str1.length() ? str1.substring(0, end) + str2 : str1 + str2;
    }

    private String longAlias(SystemColumn c, String suffix) {
        String str1 = c.getColname();
        return StringUtils.isBlank(suffix) ? str1 : str1 + suffix;
    }

}
