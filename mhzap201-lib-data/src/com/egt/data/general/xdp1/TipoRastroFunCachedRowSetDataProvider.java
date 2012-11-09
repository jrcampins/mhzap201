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

public class TipoRastroFunCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoRastroFunCachedRowSetDataProvider() {
        super();
    }

    public TipoRastroFunCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_rastro_fun";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Rastro";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_rastro_fun_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_rastro_fun";

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

    public static final String COLUMNA_NUMERO_TIPO_RASTRO_FUN = "numero_tipo_rastro_fun";
    public static final String COLUMNA_CODIGO_TIPO_RASTRO_FUN = "codigo_tipo_rastro_fun";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RASTRO_FUN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_RASTRO_FUN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RASTRO_FUN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_RASTRO_FUN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RASTRO_FUN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_RASTRO_FUN, true);
    }

    public Integer getNumeroTipoRastroFun() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RASTRO_FUN);
    }
    public Integer getNumeroTipoRastroFun(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RASTRO_FUN, rowKey);
    }
    public void setNumeroTipoRastroFun(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RASTRO_FUN, valor);
    }
    public void setNumeroTipoRastroFun(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RASTRO_FUN, rowKey, valor);
    }

    public String getCodigoTipoRastroFun() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_RASTRO_FUN);
    }
    public String getCodigoTipoRastroFun(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_RASTRO_FUN, rowKey);
    }
    public void setCodigoTipoRastroFun(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_RASTRO_FUN, valor);
    }
    public void setCodigoTipoRastroFun(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_RASTRO_FUN, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_rastro_fun";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_rastro_fun";

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
        return this.getCodigoTipoRastroFun();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoRastroFun(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoRastroFun(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoRastroFun(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoRastroFun();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoRastroFun(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoRastroFun(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoRastroFun(rowKey, numeroRecurso);
    }
}
