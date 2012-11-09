/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.specific.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class CondicionReclCenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CondicionReclCenCachedRowSetDataProvider() {
        super();
    }

    public CondicionReclCenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "condicion_recl_cen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Condiciones de Reclamo de Censo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_condicion_recl_cen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "condicion_recl_cen";

    @Override
    public String getComandoSelect() {
        return COMANDO_SELECT;
    }

    @Override
    public String getComandoSelectNothing() {
        return COMANDO_SELECT_NOTHING;
    }

    @Override
    public String getTablaDestino() {
        return TABLA_DESTINO;
    }

    public static final String COLUMNA_NUMERO_CONDICION_RECL_CEN = "numero_condicion_recl_cen";
    public static final String COLUMNA_CODIGO_CONDICION_RECL_CEN = "codigo_condicion_recl_cen";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_RECL_CEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONDICION_RECL_CEN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONDICION_RECL_CEN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CONDICION_RECL_CEN, true);
    }

    public Integer getNumeroCondicionReclCen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECL_CEN);
    }
    public Integer getNumeroCondicionReclCen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, rowKey);
    }
    public void setNumeroCondicionReclCen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, valor);
    }
    public void setNumeroCondicionReclCen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, rowKey, valor);
    }

    public String getCodigoCondicionReclCen() {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_RECL_CEN);
    }
    public String getCodigoCondicionReclCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_RECL_CEN, rowKey);
    }
    public void setCodigoCondicionReclCen(String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_RECL_CEN, valor);
    }
    public void setCodigoCondicionReclCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_RECL_CEN, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_condicion_recl_cen";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_condicion_recl_cen";

    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NUMERO_RECURSO = "Numero";

    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNumeroRecurso() {
        return COLUMNA_NUMERO_RECURSO;
    }

    @Override
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNumeroRecurso() {
        return ETIQUETA_NUMERO_RECURSO;
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoCondicionReclCen();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCondicionReclCen(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCondicionReclCen(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCondicionReclCen(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCondicionReclCen();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCondicionReclCen(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCondicionReclCen(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCondicionReclCen(rowKey, numeroRecurso);
    }
}
