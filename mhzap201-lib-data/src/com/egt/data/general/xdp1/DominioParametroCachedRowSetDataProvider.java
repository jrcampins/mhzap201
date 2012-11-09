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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class DominioParametroCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public DominioParametroCachedRowSetDataProvider() {
        super();
    }

    public DominioParametroCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "dominio_parametro";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros por Dominio";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_dominio_parametro_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "dominio_parametro";

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

    public static final String COLUMNA_ID_DOMINIO_PARAMETRO = "id_dominio_parametro";
    public static final String COLUMNA_VERSION_DOMINIO_PARAMETRO = "version_dominio_parametro";
    public static final String COLUMNA_ID_DOMINIO = "id_dominio";
    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";
    public static final String COLUMNA_NUMERO_TIPO_PARAMETRO_DOM = "numero_tipo_parametro_dom";
    public static final String COLUMNA_ETIQUETA_PARAMETRO = "etiqueta_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_DOMINIO_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ETIQUETA_PARAMETRO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_DOMINIO_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasInsertables(COLUMNA_ETIQUETA_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_VERSION_DOMINIO_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasModificables(COLUMNA_ETIQUETA_PARAMETRO, true);
    }

    public Long getIdDominioParametro() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_PARAMETRO);
    }
    public Long getIdDominioParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_PARAMETRO, rowKey);
    }
    public void setIdDominioParametro(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_PARAMETRO, valor);
    }
    public void setIdDominioParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_PARAMETRO, rowKey, valor);
    }

    public Long getVersionDominioParametro() {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO_PARAMETRO);
    }
    public Long getVersionDominioParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO_PARAMETRO, rowKey);
    }
    public void setVersionDominioParametro(Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO_PARAMETRO, valor);
    }
    public void setVersionDominioParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO_PARAMETRO, rowKey, valor);
    }

    public Long getIdDominio() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO);
    }
    public Long getIdDominio(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO, rowKey);
    }
    public void setIdDominio(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO, valor);
    }
    public void setIdDominio(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO, rowKey, valor);
    }

    public Long getIdParametro() {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO);
    }
    public Long getIdParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO, rowKey);
    }
    public void setIdParametro(Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, valor);
    }
    public void setIdParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, rowKey, valor);
    }

    public Integer getNumeroTipoParametroDom() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM);
    }
    public Integer getNumeroTipoParametroDom(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, rowKey);
    }
    public void setNumeroTipoParametroDom(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, valor);
    }
    public void setNumeroTipoParametroDom(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, rowKey, valor);
    }

    public String getEtiquetaParametro() {
        return (String) super.getValue(COLUMNA_ETIQUETA_PARAMETRO);
    }
    public String getEtiquetaParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ETIQUETA_PARAMETRO, rowKey);
    }
    public void setEtiquetaParametro(String valor) {
        super.setValue(COLUMNA_ETIQUETA_PARAMETRO, valor);
    }
    public void setEtiquetaParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ETIQUETA_PARAMETRO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_dominio_parametro";
    public static final String COLUMNA_VERSION_RECURSO = "version_dominio_parametro";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }

    @Override
    public String getEtiquetaIdentificacionRecurso() {
        return ETIQUETA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getEtiquetaVersionRecurso() {
        return ETIQUETA_VERSION_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdDominioParametro();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdDominioParametro(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdDominioParametro(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdDominioParametro(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionDominioParametro();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionDominioParametro(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionDominioParametro(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionDominioParametro(rowKey, versionRecurso);
    }
}
