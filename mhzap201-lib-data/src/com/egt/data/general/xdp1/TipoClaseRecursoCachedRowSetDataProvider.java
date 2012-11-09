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

public class TipoClaseRecursoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoClaseRecursoCachedRowSetDataProvider() {
        super();
    }

    public TipoClaseRecursoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_clase_recurso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Clase de Recurso";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_clase_recurso_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_clase_recurso";

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

    public static final String COLUMNA_NUMERO_TIPO_CLASE_RECURSO = "numero_tipo_clase_recurso";
    public static final String COLUMNA_CODIGO_TIPO_CLASE_RECURSO = "codigo_tipo_clase_recurso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, true);
    }

    public Integer getNumeroTipoClaseRecurso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_CLASE_RECURSO);
    }
    public Integer getNumeroTipoClaseRecurso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, rowKey);
    }
    public void setNumeroTipoClaseRecurso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, valor);
    }
    public void setNumeroTipoClaseRecurso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, rowKey, valor);
    }

    public String getCodigoTipoClaseRecurso() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_CLASE_RECURSO);
    }
    public String getCodigoTipoClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, rowKey);
    }
    public void setCodigoTipoClaseRecurso(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, valor);
    }
    public void setCodigoTipoClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_CLASE_RECURSO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_clase_recurso";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_clase_recurso";

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
        return this.getCodigoTipoClaseRecurso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoClaseRecurso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoClaseRecurso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoClaseRecurso(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoClaseRecurso();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoClaseRecurso(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoClaseRecurso(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoClaseRecurso(rowKey, numeroRecurso);
    }
}
