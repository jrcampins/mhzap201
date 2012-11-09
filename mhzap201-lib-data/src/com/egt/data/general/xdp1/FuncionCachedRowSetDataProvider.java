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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FuncionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public FuncionCachedRowSetDataProvider() {
        super();
    }

    public FuncionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "funcion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Funciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_funcion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "funcion";

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

    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_VERSION_FUNCION = "version_funcion";
    public static final String COLUMNA_CODIGO_FUNCION = "codigo_funcion";
    public static final String COLUMNA_NOMBRE_FUNCION = "nombre_funcion";
    public static final String COLUMNA_DESCRIPCION_FUNCION = "descripcion_funcion";
    public static final String COLUMNA_NUMERO_TIPO_FUNCION = "numero_tipo_funcion";
    public static final String COLUMNA_NUMERO_TIPO_RASTRO_FUN = "numero_tipo_rastro_fun";
    public static final String COLUMNA_ID_DOMINIO = "id_dominio";
    public static final String COLUMNA_CLAUSULA_WHERE = "clausula_where";
    public static final String COLUMNA_CLAUSULA_ORDER = "clausula_order";
    public static final String COLUMNA_ES_PUBLICA = "es_publica";
    public static final String COLUMNA_ES_PROGRAMATICA = "es_programatica";
    public static final String COLUMNA_ES_PERSONALIZADA = "es_personalizada";
    public static final String COLUMNA_ES_SEGMENTADA = "es_segmentada";
    public static final String COLUMNA_ID_GRUPO_PROCESO = "id_grupo_proceso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_FUNCION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RASTRO_FUN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAUSULA_WHERE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAUSULA_ORDER, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PUBLICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PROGRAMATICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONALIZADA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_SEGMENTADA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_PROCESO, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RASTRO_FUN, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_CLAUSULA_WHERE, true);
        this.setColumnasInsertables(COLUMNA_CLAUSULA_ORDER, true);
        this.setColumnasInsertables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasInsertables(COLUMNA_ES_PROGRAMATICA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONALIZADA, true);
        this.setColumnasInsertables(COLUMNA_ES_SEGMENTADA, true);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_PROCESO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_VERSION_FUNCION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_FUNCION, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RASTRO_FUN, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_CLAUSULA_WHERE, true);
        this.setColumnasModificables(COLUMNA_CLAUSULA_ORDER, true);
        this.setColumnasModificables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasModificables(COLUMNA_ES_PROGRAMATICA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONALIZADA, true);
        this.setColumnasModificables(COLUMNA_ES_SEGMENTADA, true);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_PROCESO, true);
    }

    public Long getIdFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION);
    }
    public Long getIdFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION, rowKey);
    }
    public void setIdFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, valor);
    }
    public void setIdFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, rowKey, valor);
    }

    public Long getVersionFuncion() {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCION);
    }
    public Long getVersionFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCION, rowKey);
    }
    public void setVersionFuncion(Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCION, valor);
    }
    public void setVersionFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCION, rowKey, valor);
    }

    public String getCodigoFuncion() {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCION);
    }
    public String getCodigoFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCION, rowKey);
    }
    public void setCodigoFuncion(String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCION, valor);
    }
    public void setCodigoFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCION, rowKey, valor);
    }

    public String getNombreFuncion() {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCION);
    }
    public String getNombreFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCION, rowKey);
    }
    public void setNombreFuncion(String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCION, valor);
    }
    public void setNombreFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCION, rowKey, valor);
    }

    public String getDescripcionFuncion() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_FUNCION);
    }
    public String getDescripcionFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_FUNCION, rowKey);
    }
    public void setDescripcionFuncion(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_FUNCION, valor);
    }
    public void setDescripcionFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_FUNCION, rowKey, valor);
    }

    public Integer getNumeroTipoFuncion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_FUNCION);
    }
    public Integer getNumeroTipoFuncion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_FUNCION, rowKey);
    }
    public void setNumeroTipoFuncion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_FUNCION, valor);
    }
    public void setNumeroTipoFuncion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_FUNCION, rowKey, valor);
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

    public String getClausulaWhere() {
        return (String) super.getValue(COLUMNA_CLAUSULA_WHERE);
    }
    public String getClausulaWhere(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAUSULA_WHERE, rowKey);
    }
    public void setClausulaWhere(String valor) {
        super.setValue(COLUMNA_CLAUSULA_WHERE, valor);
    }
    public void setClausulaWhere(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAUSULA_WHERE, rowKey, valor);
    }

    public String getClausulaOrder() {
        return (String) super.getValue(COLUMNA_CLAUSULA_ORDER);
    }
    public String getClausulaOrder(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAUSULA_ORDER, rowKey);
    }
    public void setClausulaOrder(String valor) {
        super.setValue(COLUMNA_CLAUSULA_ORDER, valor);
    }
    public void setClausulaOrder(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAUSULA_ORDER, rowKey, valor);
    }

    public Integer getEsPublica() {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA);
    }
    public Integer getEsPublica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA, rowKey);
    }
    public void setEsPublica(Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, valor);
    }
    public void setEsPublica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, rowKey, valor);
    }

    public Integer getEsProgramatica() {
        return (Integer) super.getValue(COLUMNA_ES_PROGRAMATICA);
    }
    public Integer getEsProgramatica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PROGRAMATICA, rowKey);
    }
    public void setEsProgramatica(Integer valor) {
        super.setValue(COLUMNA_ES_PROGRAMATICA, valor);
    }
    public void setEsProgramatica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PROGRAMATICA, rowKey, valor);
    }

    public Integer getEsPersonalizada() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONALIZADA);
    }
    public Integer getEsPersonalizada(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONALIZADA, rowKey);
    }
    public void setEsPersonalizada(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONALIZADA, valor);
    }
    public void setEsPersonalizada(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONALIZADA, rowKey, valor);
    }

    public Integer getEsSegmentada() {
        return (Integer) super.getValue(COLUMNA_ES_SEGMENTADA);
    }
    public Integer getEsSegmentada(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_SEGMENTADA, rowKey);
    }
    public void setEsSegmentada(Integer valor) {
        super.setValue(COLUMNA_ES_SEGMENTADA, valor);
    }
    public void setEsSegmentada(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_SEGMENTADA, rowKey, valor);
    }

    public Long getIdGrupoProceso() {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_PROCESO);
    }
    public Long getIdGrupoProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_PROCESO, rowKey);
    }
    public void setIdGrupoProceso(Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_PROCESO, valor);
    }
    public void setIdGrupoProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_PROCESO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_funcion";
    public static final String COLUMNA_VERSION_RECURSO = "version_funcion";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_funcion";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_funcion";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdFuncion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFuncion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFuncion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFuncion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFuncion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFuncion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFuncion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFuncion(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoFuncion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoFuncion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoFuncion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoFuncion(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreFuncion();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreFuncion(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreFuncion(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreFuncion(rowKey, nombreRecurso);
    }
}
