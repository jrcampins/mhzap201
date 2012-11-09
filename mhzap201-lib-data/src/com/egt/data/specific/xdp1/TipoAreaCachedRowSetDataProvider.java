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

public class TipoAreaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoAreaCachedRowSetDataProvider() {
        super();
    }

    public TipoAreaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_area";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Area";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_area_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_area";

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

    public static final String COLUMNA_NUMERO_TIPO_AREA = "numero_tipo_area";
    public static final String COLUMNA_CODIGO_TIPO_AREA = "codigo_tipo_area";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_AREA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_AREA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_AREA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_AREA, true);
    }

    public Integer getNumeroTipoArea() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA);
    }
    public Integer getNumeroTipoArea(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA, rowKey);
    }
    public void setNumeroTipoArea(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, valor);
    }
    public void setNumeroTipoArea(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, rowKey, valor);
    }

    public String getCodigoTipoArea() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_AREA);
    }
    public String getCodigoTipoArea(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_AREA, rowKey);
    }
    public void setCodigoTipoArea(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_AREA, valor);
    }
    public void setCodigoTipoArea(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_AREA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_area";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_area";

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
        return this.getCodigoTipoArea();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoArea(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoArea(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoArea(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoArea();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoArea(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoArea(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoArea(rowKey, numeroRecurso);
    }
}
