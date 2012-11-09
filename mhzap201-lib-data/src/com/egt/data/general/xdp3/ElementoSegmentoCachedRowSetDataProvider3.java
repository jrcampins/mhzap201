/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.data.general.xdp3;

import com.egt.core.aplicacion.Bitacora;
import com.egt.data.general.xdp2.ElementoSegmentoCachedRowSetDataProvider2;
import javax.sql.rowset.CachedRowSet;
import org.apache.commons.lang.StringUtils;

public class ElementoSegmentoCachedRowSetDataProvider3 extends ElementoSegmentoCachedRowSetDataProvider2 {

    public ElementoSegmentoCachedRowSetDataProvider3() {
        super();
        this.init();
    }

    public ElementoSegmentoCachedRowSetDataProvider3(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
        this.init();
    }

    private void init() {
        tablaRecursoCombinado = null;
        columnaIdentificacionRecursoCombinado = null;
        columnaCodigoRecursoCombinado = null;
        columnaNombreRecursoCombinado = null;
    }

    private String tablaRecursoCombinado;

    private String columnaIdentificacionRecursoCombinado;

    private String columnaCodigoRecursoCombinado;

    private String columnaNombreRecursoCombinado;

    public String getTablaRecursoCombinado() {
        return tablaRecursoCombinado;
    }

    public void setTablaRecursoCombinado(String tablaRecursoCombinado) {
        this.tablaRecursoCombinado = tablaRecursoCombinado;
    }

    public String getColumnaIdentificacionRecursoCombinado() {
        return columnaIdentificacionRecursoCombinado;
    }

    public void setColumnaIdentificacionRecursoCombinado(String columnaIdentificacionRecursoCombinado) {
        this.columnaIdentificacionRecursoCombinado = columnaIdentificacionRecursoCombinado;
    }

    public String getColumnaCodigoRecursoCombinado() {
        return columnaCodigoRecursoCombinado;
    }

    public void setColumnaCodigoRecursoCombinado(String columnaCodigoRecursoCombinado) {
        this.columnaCodigoRecursoCombinado = columnaCodigoRecursoCombinado;
    }

    public String getColumnaNombreRecursoCombinado() {
        return columnaNombreRecursoCombinado;
    }

    public void setColumnaNombreRecursoCombinado(String columnaNombreRecursoCombinado) {
        this.columnaNombreRecursoCombinado = columnaNombreRecursoCombinado;
    }

    @Override
    public String getComandoSelect() {
        Bitacora.trace(this.getClass(), "getComandoSelect",
                tablaRecursoCombinado,
                columnaIdentificacionRecursoCombinado,
                columnaCodigoRecursoCombinado,
                columnaNombreRecursoCombinado);
        /**/
        String base = "consulta_" + this.getTablaDestino() + "_1";
        String cisb = COLUMNA_ID_SEGMENTO;
        String ccsb = "codigo_segmento";
        String cnsb = "nombre_segmento";
        /**/
        String join = StringUtils.trimToEmpty(tablaRecursoCombinado);
        String circ = StringUtils.trimToEmpty(columnaIdentificacionRecursoCombinado);
        String ccrc = StringUtils.trimToEmpty(columnaCodigoRecursoCombinado);
        String cnrc = StringUtils.trimToEmpty(columnaNombreRecursoCombinado);
        /**/
        String c;
        /**/
        if (StringUtils.isBlank(join) || StringUtils.isBlank(circ)) {
            c = super.getComandoSelect();
        } else if (StringUtils.isBlank(ccrc) && StringUtils.isBlank(cnrc)) {
            c = super.getComandoSelect();
        } else {
            c = "SELECT";
            /**/
            c += c1(base, COLUMNA_ID_ELEMENTO_SEGMENTO);
            c += c1(base, COLUMNA_VERSION_ELEMENTO_SEGMENTO);
            c += c1(base, COLUMNA_ID_CONJUNTO_SEGMENTO);
            /**/
            c += c1(base, "codigo_conjunto_segmento_1x1y3");
            c += c1(base, "nombre_conjunto_segmento_1x1y4");
            c += c1(base, "descripcion_conjunto_seg_1x1y5");
            c += c1(base, "id_clase_recurso_1x1y6");
            /**/
            c += c1(base, COLUMNA_ID_SEGMENTO);
            c += c1(base, COLUMNA_VALOR_SEGMENTO);
            c += c1(base, COLUMNA_SIGNIFICADO_SEGMENTO);
            /**/
            if (StringUtils.isBlank(ccrc)) {
                c += c1(base, ccsb);
            } else {
                c += c3(join, ccrc, ccsb);
            }
            if (StringUtils.isBlank(cnrc)) {
                c += c1(base, cnsb);
            } else {
                c += c3(join, cnrc, cnsb);
            }
            c = StringUtils.chomp(c, ",");
            c += " FROM " + base + " LEFT OUTER JOIN " + join;
            c += " ON " + join + "." + circ + " = " + base + "." + cisb;
            c += " ";
        }
        return c;
    }

    @Override
    public String getComandoSelectNothing() {
        return getComandoSelect() + "WHERE (0=1)";
    }

    private String c1(String tabla, String columna) {
        return " " + tabla + "." + columna + ",";
    }
//
//  private String c2(String tabla, String columna, String sufijo) {
//      return " " + tabla + "." + columna + "_" + sufijo + ",";
//  }

    private String c3(String tabla, String columna, String alias) {
        return " " + tabla + "." + columna + " AS " + alias + ",";
    }

}
