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

public class TipoMatParedesCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoMatParedesCachedRowSetDataProvider() {
        super();
    }

    public TipoMatParedesCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_mat_paredes";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Material de Paredes Exteriores";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_mat_paredes_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_mat_paredes";

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

    public static final String COLUMNA_NUMERO_TIPO_MAT_PAREDES = "numero_tipo_mat_paredes";
    public static final String COLUMNA_CODIGO_TIPO_MAT_PAREDES = "codigo_tipo_mat_paredes";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_PAREDES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_MAT_PAREDES, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_PAREDES, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_MAT_PAREDES, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_PAREDES, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_MAT_PAREDES, true);
    }

    public Integer getNumeroTipoMatParedes() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES);
    }
    public Integer getNumeroTipoMatParedes(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, rowKey);
    }
    public void setNumeroTipoMatParedes(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, valor);
    }
    public void setNumeroTipoMatParedes(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, rowKey, valor);
    }

    public String getCodigoTipoMatParedes() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_PAREDES);
    }
    public String getCodigoTipoMatParedes(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_PAREDES, rowKey);
    }
    public void setCodigoTipoMatParedes(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_PAREDES, valor);
    }
    public void setCodigoTipoMatParedes(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_PAREDES, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_mat_paredes";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_mat_paredes";

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
        return this.getCodigoTipoMatParedes();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoMatParedes(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoMatParedes(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoMatParedes(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoMatParedes();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoMatParedes(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoMatParedes(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoMatParedes(rowKey, numeroRecurso);
    }
}
