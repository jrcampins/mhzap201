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

public class TipoMatTechoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoMatTechoCachedRowSetDataProvider() {
        super();
    }

    public TipoMatTechoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_mat_techo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Material de Techos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_mat_techo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_mat_techo";

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

    public static final String COLUMNA_NUMERO_TIPO_MAT_TECHO = "numero_tipo_mat_techo";
    public static final String COLUMNA_CODIGO_TIPO_MAT_TECHO = "codigo_tipo_mat_techo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_TECHO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_MAT_TECHO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_TECHO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_MAT_TECHO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_TECHO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_MAT_TECHO, true);
    }

    public Integer getNumeroTipoMatTecho() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_TECHO);
    }
    public Integer getNumeroTipoMatTecho(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, rowKey);
    }
    public void setNumeroTipoMatTecho(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, valor);
    }
    public void setNumeroTipoMatTecho(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, rowKey, valor);
    }

    public String getCodigoTipoMatTecho() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_TECHO);
    }
    public String getCodigoTipoMatTecho(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_TECHO, rowKey);
    }
    public void setCodigoTipoMatTecho(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_TECHO, valor);
    }
    public void setCodigoTipoMatTecho(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_TECHO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_mat_techo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_mat_techo";

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
        return this.getCodigoTipoMatTecho();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoMatTecho(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoMatTecho(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoMatTecho(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoMatTecho();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoMatTecho(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoMatTecho(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoMatTecho(rowKey, numeroRecurso);
    }
}
