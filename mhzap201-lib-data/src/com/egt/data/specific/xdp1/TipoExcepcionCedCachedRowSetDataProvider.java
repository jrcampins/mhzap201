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

public class TipoExcepcionCedCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoExcepcionCedCachedRowSetDataProvider() {
        super();
    }

    public TipoExcepcionCedCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_excepcion_ced";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Excepcion de Cedula";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_excepcion_ced_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_excepcion_ced";

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

    public static final String COLUMNA_NUMERO_TIPO_EXCEPCION_CED = "numero_tipo_excepcion_ced";
    public static final String COLUMNA_CODIGO_TIPO_EXCEPCION_CED = "codigo_tipo_excepcion_ced";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, true);
    }

    public Integer getNumeroTipoExcepcionCed() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED);
    }
    public Integer getNumeroTipoExcepcionCed(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, rowKey);
    }
    public void setNumeroTipoExcepcionCed(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, valor);
    }
    public void setNumeroTipoExcepcionCed(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, rowKey, valor);
    }

    public String getCodigoTipoExcepcionCed() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_EXCEPCION_CED);
    }
    public String getCodigoTipoExcepcionCed(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, rowKey);
    }
    public void setCodigoTipoExcepcionCed(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, valor);
    }
    public void setCodigoTipoExcepcionCed(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_EXCEPCION_CED, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_excepcion_ced";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_excepcion_ced";

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
        return this.getCodigoTipoExcepcionCed();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoExcepcionCed(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoExcepcionCed(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoExcepcionCed(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoExcepcionCed();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoExcepcionCed(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoExcepcionCed(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoExcepcionCed(rowKey, numeroRecurso);
    }
}
