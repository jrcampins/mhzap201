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

public class TipoMatPisoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoMatPisoCachedRowSetDataProvider() {
        super();
    }

    public TipoMatPisoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_mat_piso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Material de Pisos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_mat_piso_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_mat_piso";

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

    public static final String COLUMNA_NUMERO_TIPO_MAT_PISO = "numero_tipo_mat_piso";
    public static final String COLUMNA_CODIGO_TIPO_MAT_PISO = "codigo_tipo_mat_piso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_PISO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_MAT_PISO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_PISO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_MAT_PISO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_PISO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_MAT_PISO, true);
    }

    public Integer getNumeroTipoMatPiso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PISO);
    }
    public Integer getNumeroTipoMatPiso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PISO, rowKey);
    }
    public void setNumeroTipoMatPiso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PISO, valor);
    }
    public void setNumeroTipoMatPiso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PISO, rowKey, valor);
    }

    public String getCodigoTipoMatPiso() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_PISO);
    }
    public String getCodigoTipoMatPiso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_MAT_PISO, rowKey);
    }
    public void setCodigoTipoMatPiso(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_PISO, valor);
    }
    public void setCodigoTipoMatPiso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_MAT_PISO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_mat_piso";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_mat_piso";

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
        return this.getCodigoTipoMatPiso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoMatPiso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoMatPiso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoMatPiso(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoMatPiso();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoMatPiso(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoMatPiso(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoMatPiso(rowKey, numeroRecurso);
    }
}
