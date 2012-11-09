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

public class ClaseRecursoParCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public ClaseRecursoParCachedRowSetDataProvider() {
        super();
    }

    public ClaseRecursoParCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_recurso_par";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros por Clase de Recurso";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_recurso_par_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_recurso_par";

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

    public static final String COLUMNA_ID_CLASE_RECURSO_PAR = "id_clase_recurso_par";
    public static final String COLUMNA_VERSION_CLASE_RECURSO_PAR = "version_clase_recurso_par";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
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
    public static final String COLUMNA_ES_PARAMETRO_OMISIBLE = "es_parametro_omisible";
    public static final String COLUMNA_ES_PARAMETRO_INMUTABLE = "es_parametro_inmutable";
    public static final String COLUMNA_ES_PARAMETRO_SUBMIT = "es_parametro_submit";
    public static final String COLUMNA_ES_PARAMETRO_PRIMORDIAL = "es_parametro_primordial";
    public static final String COLUMNA_ES_PARAMETRO_MAESTRO = "es_parametro_maestro";
    public static final String COLUMNA_ES_PARAMETRO_SEGMENTO = "es_parametro_segmento";
    public static final String COLUMNA_ES_PARAMETRO_SIN_RASTRO = "es_parametro_sin_rastro";
    public static final String COLUMNA_ES_PARAMETRO_SINCRONIZADO = "es_parametro_sincronizado";
    public static final String COLUMNA_ORDEN_PRESENTACION = "orden_presentacion";
    public static final String COLUMNA_ID_CLASE_RECURSO_SEC = "id_clase_recurso_sec";
    public static final String COLUMNA_ES_REFERENCIA_ALTERNATIVA = "es_referencia_alternativa";
    public static final String COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO = "numero_tipo_valor_alternativo";
    public static final String COLUMNA_ID_FUNCION_REFERENCIA_ALT = "id_funcion_referencia_alt";
    public static final String COLUMNA_ID_LISTA_VALOR_ALTERNATIVA = "id_lista_valor_alternativa";
    public static final String COLUMNA_ID_CLASE_OBJETO_VALOR_ALT = "id_clase_objeto_valor_alt";
    public static final String COLUMNA_ID_CLASE_RECURSO_VALOR_ALT = "id_clase_recurso_valor_alt";
    public static final String COLUMNA_ORDEN_PAGINA_SELECCION = "orden_pagina_seleccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_CLASE_RECURSO_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
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
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_OMISIBLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_INMUTABLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SUBMIT, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_PRIMORDIAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_MAESTRO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SEGMENTO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SIN_RASTRO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAMETRO_SINCRONIZADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN_PRESENTACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_SEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_REFERENCIA_ALTERNATIVA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_REFERENCIA_ALT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN_PAGINA_SELECCION, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_PAR, true);
        this.setColumnasInsertables(COLUMNA_VERSION_CLASE_RECURSO_PAR, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, true);
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
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_OMISIBLE, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_INMUTABLE, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SUBMIT, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_PRIMORDIAL, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_MAESTRO, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SIN_RASTRO, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAMETRO_SINCRONIZADO, true);
        this.setColumnasInsertables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_SEC, true);
        this.setColumnasInsertables(COLUMNA_ES_REFERENCIA_ALTERNATIVA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_REFERENCIA_ALT, true);
        this.setColumnasInsertables(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, true);
        this.setColumnasInsertables(COLUMNA_ORDEN_PAGINA_SELECCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_PAR, true);
        this.setColumnasModificables(COLUMNA_VERSION_CLASE_RECURSO_PAR, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, true);
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
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_OMISIBLE, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_INMUTABLE, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SUBMIT, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_PRIMORDIAL, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_MAESTRO, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SIN_RASTRO, true);
        this.setColumnasModificables(COLUMNA_ES_PARAMETRO_SINCRONIZADO, true);
        this.setColumnasModificables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_SEC, true);
        this.setColumnasModificables(COLUMNA_ES_REFERENCIA_ALTERNATIVA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_REFERENCIA_ALT, true);
        this.setColumnasModificables(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, true);
        this.setColumnasModificables(COLUMNA_ORDEN_PAGINA_SELECCION, true);
    }

    public Long getIdClaseRecursoPar() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR);
    }
    public Long getIdClaseRecursoPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR, rowKey);
    }
    public void setIdClaseRecursoPar(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR, valor);
    }
    public void setIdClaseRecursoPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR, rowKey, valor);
    }

    public Long getVersionClaseRecursoPar() {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO_PAR);
    }
    public Long getVersionClaseRecursoPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO_PAR, rowKey);
    }
    public void setVersionClaseRecursoPar(Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO_PAR, valor);
    }
    public void setVersionClaseRecursoPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO_PAR, rowKey, valor);
    }

    public Long getIdClaseRecurso() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO);
    }
    public Long getIdClaseRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO, rowKey);
    }
    public void setIdClaseRecurso(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, valor);
    }
    public void setIdClaseRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, rowKey, valor);
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

    public Integer getEsParametroOmisible() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_OMISIBLE);
    }
    public Integer getEsParametroOmisible(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_OMISIBLE, rowKey);
    }
    public void setEsParametroOmisible(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_OMISIBLE, valor);
    }
    public void setEsParametroOmisible(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_OMISIBLE, rowKey, valor);
    }

    public Integer getEsParametroInmutable() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_INMUTABLE);
    }
    public Integer getEsParametroInmutable(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_INMUTABLE, rowKey);
    }
    public void setEsParametroInmutable(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_INMUTABLE, valor);
    }
    public void setEsParametroInmutable(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_INMUTABLE, rowKey, valor);
    }

    public Integer getEsParametroSubmit() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SUBMIT);
    }
    public Integer getEsParametroSubmit(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SUBMIT, rowKey);
    }
    public void setEsParametroSubmit(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SUBMIT, valor);
    }
    public void setEsParametroSubmit(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SUBMIT, rowKey, valor);
    }

    public Integer getEsParametroPrimordial() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_PRIMORDIAL);
    }
    public Integer getEsParametroPrimordial(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_PRIMORDIAL, rowKey);
    }
    public void setEsParametroPrimordial(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_PRIMORDIAL, valor);
    }
    public void setEsParametroPrimordial(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_PRIMORDIAL, rowKey, valor);
    }

    public Integer getEsParametroMaestro() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_MAESTRO);
    }
    public Integer getEsParametroMaestro(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_MAESTRO, rowKey);
    }
    public void setEsParametroMaestro(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_MAESTRO, valor);
    }
    public void setEsParametroMaestro(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_MAESTRO, rowKey, valor);
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

    public Integer getEsParametroSincronizado() {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SINCRONIZADO);
    }
    public Integer getEsParametroSincronizado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAMETRO_SINCRONIZADO, rowKey);
    }
    public void setEsParametroSincronizado(Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SINCRONIZADO, valor);
    }
    public void setEsParametroSincronizado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAMETRO_SINCRONIZADO, rowKey, valor);
    }

    public Integer getOrdenPresentacion() {
        return (Integer) super.getValue(COLUMNA_ORDEN_PRESENTACION);
    }
    public Integer getOrdenPresentacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ORDEN_PRESENTACION, rowKey);
    }
    public void setOrdenPresentacion(Integer valor) {
        super.setValue(COLUMNA_ORDEN_PRESENTACION, valor);
    }
    public void setOrdenPresentacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ORDEN_PRESENTACION, rowKey, valor);
    }

    public Long getIdClaseRecursoSec() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_SEC);
    }
    public Long getIdClaseRecursoSec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_SEC, rowKey);
    }
    public void setIdClaseRecursoSec(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_SEC, valor);
    }
    public void setIdClaseRecursoSec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_SEC, rowKey, valor);
    }

    public Integer getEsReferenciaAlternativa() {
        return (Integer) super.getValue(COLUMNA_ES_REFERENCIA_ALTERNATIVA);
    }
    public Integer getEsReferenciaAlternativa(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_REFERENCIA_ALTERNATIVA, rowKey);
    }
    public void setEsReferenciaAlternativa(Integer valor) {
        super.setValue(COLUMNA_ES_REFERENCIA_ALTERNATIVA, valor);
    }
    public void setEsReferenciaAlternativa(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_REFERENCIA_ALTERNATIVA, rowKey, valor);
    }

    public Integer getNumeroTipoValorAlternativo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO);
    }
    public Integer getNumeroTipoValorAlternativo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, rowKey);
    }
    public void setNumeroTipoValorAlternativo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, valor);
    }
    public void setNumeroTipoValorAlternativo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_VALOR_ALTERNATIVO, rowKey, valor);
    }

    public Long getIdFuncionReferenciaAlt() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_REFERENCIA_ALT);
    }
    public Long getIdFuncionReferenciaAlt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_REFERENCIA_ALT, rowKey);
    }
    public void setIdFuncionReferenciaAlt(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_REFERENCIA_ALT, valor);
    }
    public void setIdFuncionReferenciaAlt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_REFERENCIA_ALT, rowKey, valor);
    }

    public Long getIdListaValorAlternativa() {
        return (Long) super.getValue(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA);
    }
    public Long getIdListaValorAlternativa(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, rowKey);
    }
    public void setIdListaValorAlternativa(Long valor) {
        super.setValue(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, valor);
    }
    public void setIdListaValorAlternativa(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LISTA_VALOR_ALTERNATIVA, rowKey, valor);
    }

    public Long getIdClaseObjetoValorAlt() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT);
    }
    public Long getIdClaseObjetoValorAlt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, rowKey);
    }
    public void setIdClaseObjetoValorAlt(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, valor);
    }
    public void setIdClaseObjetoValorAlt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_OBJETO_VALOR_ALT, rowKey, valor);
    }

    public Long getIdClaseRecursoValorAlt() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT);
    }
    public Long getIdClaseRecursoValorAlt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, rowKey);
    }
    public void setIdClaseRecursoValorAlt(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, valor);
    }
    public void setIdClaseRecursoValorAlt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_VALOR_ALT, rowKey, valor);
    }

    public Integer getOrdenPaginaSeleccion() {
        return (Integer) super.getValue(COLUMNA_ORDEN_PAGINA_SELECCION);
    }
    public Integer getOrdenPaginaSeleccion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ORDEN_PAGINA_SELECCION, rowKey);
    }
    public void setOrdenPaginaSeleccion(Integer valor) {
        super.setValue(COLUMNA_ORDEN_PAGINA_SELECCION, valor);
    }
    public void setOrdenPaginaSeleccion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ORDEN_PAGINA_SELECCION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_clase_recurso_par";
    public static final String COLUMNA_VERSION_RECURSO = "version_clase_recurso_par";

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
        return this.getIdClaseRecursoPar();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdClaseRecursoPar(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdClaseRecursoPar(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdClaseRecursoPar(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionClaseRecursoPar();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionClaseRecursoPar(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionClaseRecursoPar(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionClaseRecursoPar(rowKey, versionRecurso);
    }
}
