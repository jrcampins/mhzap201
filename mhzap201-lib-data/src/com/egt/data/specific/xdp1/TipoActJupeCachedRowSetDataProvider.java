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

public class TipoActJupeCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoActJupeCachedRowSetDataProvider() {
        super();
    }

    public TipoActJupeCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_act_jupe";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Actualizacion JUPE";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_act_jupe_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_act_jupe";

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

    public static final String COLUMNA_NUMERO_TIPO_ACT_JUPE = "numero_tipo_act_jupe";
    public static final String COLUMNA_CODIGO_TIPO_ACT_JUPE = "codigo_tipo_act_jupe";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ACT_JUPE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_ACT_JUPE, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ACT_JUPE, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_ACT_JUPE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ACT_JUPE, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_ACT_JUPE, true);
    }

    public Integer getNumeroTipoActJupe() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ACT_JUPE);
    }
    public Integer getNumeroTipoActJupe(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, rowKey);
    }
    public void setNumeroTipoActJupe(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, valor);
    }
    public void setNumeroTipoActJupe(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, rowKey, valor);
    }

    public String getCodigoTipoActJupe() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ACT_JUPE);
    }
    public String getCodigoTipoActJupe(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ACT_JUPE, rowKey);
    }
    public void setCodigoTipoActJupe(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ACT_JUPE, valor);
    }
    public void setCodigoTipoActJupe(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ACT_JUPE, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_act_jupe";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_act_jupe";

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
        return this.getCodigoTipoActJupe();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoActJupe(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoActJupe(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoActJupe(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoActJupe();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoActJupe(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoActJupe(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoActJupe(rowKey, numeroRecurso);
    }
}
