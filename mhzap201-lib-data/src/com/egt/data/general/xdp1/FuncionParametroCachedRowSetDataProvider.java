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

public class FuncionParametroCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public FuncionParametroCachedRowSetDataProvider() {
        super();
    }

    public FuncionParametroCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "funcion_parametro";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros por Funcion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_funcion_parametro_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "funcion_parametro";

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

    public static final String COLUMNA_ID_FUNCION_PARAMETRO = "id_funcion_parametro";
    public static final String COLUMNA_VERSION_FUNCION_PARAMETRO = "version_funcion_parametro";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";
    public static final String COLUMNA_NUMERO_TIPO_PARAMETRO = "numero_tipo_parametro";
    public static final String COLUMNA_NUMERO_TIPO_COMPARACION = "numero_tipo_comparacion";
    public static final String COLUMNA_ID_FUNCION_REFERENCIA = "id_funcion_referencia";
    public static final String COLUMNA_NUMERO_TIPO_VALOR = "numero_tipo_valor";
    public static final String COLUMNA_ID_LISTA_VALOR = "id_lista_valor";
    public static final String COLUMNA_ID_CLASE_OBJETO_VALOR = "id_clase_objeto_valor";
    public static final String COLUMNA_ID_CLASE_RECURSO_VALOR = "id_clase_recurso_valor";
    public static final String COLUMNA_VALOR_MINIMO = "valor_minimo";
    public static final String COLUMNA_VALOR_MAXIMO = "valor_maximo";
    public static final String COLUMNA_VALOR_OMISION = "valor_omision";
    public static final String COLUMNA_ES_PARAMETRO_SIN_RASTRO = "es_parametro_sin_rastro";
    public static final String COLUMNA_ES_PARAMETRO_SEGMENTO = "es_parametro_segmento";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FUNCION_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PARAMETRO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_COMPARACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_REFERENCIA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_VALOR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LISTA_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_OBJETO_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_MINIMO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_MAXIMO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_OMISION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SIN_RASTRO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SEGMENTO, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FUNCION_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_COMPARACION, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_REFERENCIA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_VALOR, true);
        this.setColumnasInsertables(COLUMNA_ID_LISTA_VALOR, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_OBJETO_VALOR, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_VALOR, true);
        this.setColumnasInsertables(COLUMNA_VALOR_MINIMO, true);
        this.setColumnasInsertables(COLUMNA_VALOR_MAXIMO, true);
        this.setColumnasInsertables(COLUMNA_VALOR_OMISION, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SIN_RASTRO, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SEGMENTO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_VERSION_FUNCION_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_COMPARACION, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_REFERENCIA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_VALOR, true);
        this.setColumnasModificables(COLUMNA_ID_LISTA_VALOR, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_OBJETO_VALOR, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_VALOR, true);
        this.setColumnasModificables(COLUMNA_VALOR_MINIMO, true);
        this.setColumnasModificables(COLUMNA_VALOR_MAXIMO, true);
        this.setColumnasModificables(COLUMNA_VALOR_OMISION, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SIN_RASTRO, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SEGMENTO, true);
    }

    public Long getIdFuncionParametro() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_PARAMETRO);
    }
    public Long getIdFuncionParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_PARAMETRO, rowKey);
    }
    public void setIdFuncionParametro(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_PARAMETRO, valor);
    }
    public void setIdFuncionParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_PARAMETRO, rowKey, valor);
    }

    public Long getVersionFuncionParametro() {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCION_PARAMETRO);
    }
    public Long getVersionFuncionParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCION_PARAMETRO, rowKey);
    }
    public void setVersionFuncionParametro(Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCION_PARAMETRO, valor);
    }
    public void setVersionFuncionParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCION_PARAMETRO, rowKey, valor);
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

    public Integer getNumeroTipoParametro() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO);
    }
    public Integer getNumeroTipoParametro(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO, rowKey);
    }
    public void setNumeroTipoParametro(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO, valor);
    }
    public void setNumeroTipoParametro(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO, rowKey, valor);
    }

    public Integer getNumeroTipoComparacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMPARACION);
    }
    public Integer getNumeroTipoComparacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMPARACION, rowKey);
    }
    public void setNumeroTipoComparacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMPARACION, valor);
    }
    public void setNumeroTipoComparacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMPARACION, rowKey, valor);
    }

    public Long getIdFuncionReferencia() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_REFERENCIA);
    }
    public Long getIdFuncionReferencia(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_REFERENCIA, rowKey);
    }
    public void setIdFuncionReferencia(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_REFERENCIA, valor);
    }
    public void setIdFuncionReferencia(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_REFERENCIA, rowKey, valor);
    }

    public Integer getNumeroTipoValor() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_VALOR);
    }
    public Integer getNumeroTipoValor(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_VALOR, rowKey);
    }
    public void setNumeroTipoValor(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_VALOR, valor);
    }
    public void setNumeroTipoValor(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_VALOR, rowKey, valor);
    }

    public Long getIdListaValor() {
        return (Long) super.getValue(COLUMNA_ID_LISTA_VALOR);
    }
    public Long getIdListaValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LISTA_VALOR, rowKey);
    }
    public void setIdListaValor(Long valor) {
        super.setValue(COLUMNA_ID_LISTA_VALOR, valor);
    }
    public void setIdListaValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LISTA_VALOR, rowKey, valor);
    }

    public Long getIdClaseObjetoValor() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_OBJETO_VALOR);
    }
    public Long getIdClaseObjetoValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_OBJETO_VALOR, rowKey);
    }
    public void setIdClaseObjetoValor(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_OBJETO_VALOR, valor);
    }
    public void setIdClaseObjetoValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_OBJETO_VALOR, rowKey, valor);
    }

    public Long getIdClaseRecursoValor() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_VALOR);
    }
    public Long getIdClaseRecursoValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_VALOR, rowKey);
    }
    public void setIdClaseRecursoValor(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_VALOR, valor);
    }
    public void setIdClaseRecursoValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_VALOR, rowKey, valor);
    }

    public String getValorMinimo() {
        return (String) super.getValue(COLUMNA_VALOR_MINIMO);
    }
    public String getValorMinimo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_MINIMO, rowKey);
    }
    public void setValorMinimo(String valor) {
        super.setValue(COLUMNA_VALOR_MINIMO, valor);
    }
    public void setValorMinimo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_MINIMO, rowKey, valor);
    }

    public String getValorMaximo() {
        return (String) super.getValue(COLUMNA_VALOR_MAXIMO);
    }
    public String getValorMaximo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_MAXIMO, rowKey);
    }
    public void setValorMaximo(String valor) {
        super.setValue(COLUMNA_VALOR_MAXIMO, valor);
    }
    public void setValorMaximo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_MAXIMO, rowKey, valor);
    }

    public String getValorOmision() {
        return (String) super.getValue(COLUMNA_VALOR_OMISION);
    }
    public String getValorOmision(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_OMISION, rowKey);
    }
    public void setValorOmision(String valor) {
        super.setValue(COLUMNA_VALOR_OMISION, valor);
    }
    public void setValorOmision(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_OMISION, rowKey, valor);
    }

    public Integer getEsParametroSinRastro() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SIN_RASTRO);
    }
    public Integer getEsParametroSinRastro(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SIN_RASTRO, rowKey);
    }
    public void setEsParametroSinRastro(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SIN_RASTRO, valor);
    }
    public void setEsParametroSinRastro(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SIN_RASTRO, rowKey, valor);
    }

    public Integer getEsParametroSegmento() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SEGMENTO);
    }
    public Integer getEsParametroSegmento(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SEGMENTO, rowKey);
    }
    public void setEsParametroSegmento(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SEGMENTO, valor);
    }
    public void setEsParametroSegmento(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SEGMENTO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_funcion_parametro";
    public static final String COLUMNA_VERSION_RECURSO = "version_funcion_parametro";

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
        return this.getIdFuncionParametro();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFuncionParametro(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFuncionParametro(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFuncionParametro(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFuncionParametro();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFuncionParametro(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFuncionParametro(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFuncionParametro(rowKey, versionRecurso);
    }
}
