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

public class CondicionCensoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CondicionCensoCachedRowSetDataProvider() {
        super();
    }

    public CondicionCensoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "condicion_censo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Condiciones Censos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_condicion_censo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "condicion_censo";

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

    public static final String COLUMNA_NUMERO_CONDICION_CENSO = "numero_condicion_censo";
    public static final String COLUMNA_CODIGO_CONDICION_CENSO = "codigo_condicion_censo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_CENSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONDICION_CENSO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_CENSO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONDICION_CENSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_CENSO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CONDICION_CENSO, true);
    }

    public Integer getNumeroCondicionCenso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_CENSO);
    }
    public Integer getNumeroCondicionCenso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_CENSO, rowKey);
    }
    public void setNumeroCondicionCenso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_CENSO, valor);
    }
    public void setNumeroCondicionCenso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_CENSO, rowKey, valor);
    }

    public String getCodigoCondicionCenso() {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_CENSO);
    }
    public String getCodigoCondicionCenso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_CENSO, rowKey);
    }
    public void setCodigoCondicionCenso(String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_CENSO, valor);
    }
    public void setCodigoCondicionCenso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_CENSO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_condicion_censo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_condicion_censo";

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
        return this.getCodigoCondicionCenso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCondicionCenso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCondicionCenso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCondicionCenso(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCondicionCenso();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCondicionCenso(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCondicionCenso(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCondicionCenso(rowKey, numeroRecurso);
    }
}
