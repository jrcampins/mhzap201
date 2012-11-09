/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.general.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class TipoComparacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoComparacionCachedRowSetDataProvider() {
        super();
    }

    public TipoComparacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_comparacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Comparacion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_comparacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_comparacion";

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

    public static final String COLUMNA_NUMERO_TIPO_COMPARACION = "numero_tipo_comparacion";
    public static final String COLUMNA_CODIGO_TIPO_COMPARACION = "codigo_tipo_comparacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_COMPARACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_COMPARACION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_COMPARACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_COMPARACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_COMPARACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_COMPARACION, true);
    }

    public Integer getNumeroTipoComparacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMPARACION);
    }
    public Integer getNumeroTipoComparacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMPARACION, rowKey);
    }
    public void setNumeroTipoComparacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMPARACION, valor);
    }
    public void setNumeroTipoComparacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMPARACION, rowKey, valor);
    }

    public String getCodigoTipoComparacion() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_COMPARACION);
    }
    public String getCodigoTipoComparacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_COMPARACION, rowKey);
    }
    public void setCodigoTipoComparacion(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_COMPARACION, valor);
    }
    public void setCodigoTipoComparacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_COMPARACION, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_comparacion";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_comparacion";

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
        return this.getCodigoTipoComparacion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoComparacion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoComparacion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoComparacion(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoComparacion();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoComparacion(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoComparacion(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoComparacion(rowKey, numeroRecurso);
    }
}
