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

public class TipoNodoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoNodoCachedRowSetDataProvider() {
        super();
    }

    public TipoNodoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_nodo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Nodo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_nodo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_nodo";

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

    public static final String COLUMNA_NUMERO_TIPO_NODO = "numero_tipo_nodo";
    public static final String COLUMNA_CODIGO_TIPO_NODO = "codigo_tipo_nodo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_NODO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_NODO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_NODO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_NODO, true);
    }

    public Integer getNumeroTipoNodo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO);
    }
    public Integer getNumeroTipoNodo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO, rowKey);
    }
    public void setNumeroTipoNodo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, valor);
    }
    public void setNumeroTipoNodo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, rowKey, valor);
    }

    public String getCodigoTipoNodo() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_NODO);
    }
    public String getCodigoTipoNodo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_NODO, rowKey);
    }
    public void setCodigoTipoNodo(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_NODO, valor);
    }
    public void setCodigoTipoNodo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_NODO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_nodo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_nodo";

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
        return this.getCodigoTipoNodo();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoNodo(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoNodo(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoNodo(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoNodo();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoNodo(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoNodo(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoNodo(rowKey, numeroRecurso);
    }
}
