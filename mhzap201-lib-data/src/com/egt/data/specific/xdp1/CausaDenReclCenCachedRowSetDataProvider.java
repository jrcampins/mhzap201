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

public class CausaDenReclCenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CausaDenReclCenCachedRowSetDataProvider() {
        super();
    }

    public CausaDenReclCenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "causa_den_recl_cen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Causas de Denegacion de Reclamo de Censo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_causa_den_recl_cen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "causa_den_recl_cen";

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

    public static final String COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN = "numero_causa_den_recl_cen";
    public static final String COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN = "codigo_causa_den_recl_cen";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, true);
    }

    public Integer getNumeroCausaDenReclCen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN);
    }
    public Integer getNumeroCausaDenReclCen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, rowKey);
    }
    public void setNumeroCausaDenReclCen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, valor);
    }
    public void setNumeroCausaDenReclCen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, rowKey, valor);
    }

    public String getCodigoCausaDenReclCen() {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN);
    }
    public String getCodigoCausaDenReclCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, rowKey);
    }
    public void setCodigoCausaDenReclCen(String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, valor);
    }
    public void setCodigoCausaDenReclCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_DEN_RECL_CEN, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_causa_den_recl_cen";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_causa_den_recl_cen";

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
        return this.getCodigoCausaDenReclCen();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCausaDenReclCen(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCausaDenReclCen(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCausaDenReclCen(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCausaDenReclCen();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCausaDenReclCen(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCausaDenReclCen(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCausaDenReclCen(rowKey, numeroRecurso);
    }
}
