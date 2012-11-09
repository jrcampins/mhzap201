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

public class ClaseRecursoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public ClaseRecursoCachedRowSetDataProvider() {
        super();
    }

    public ClaseRecursoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_recurso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Clases de Recurso";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_recurso_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_recurso";

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

    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_VERSION_CLASE_RECURSO = "version_clase_recurso";
    public static final String COLUMNA_CODIGO_CLASE_RECURSO = "codigo_clase_recurso";
    public static final String COLUMNA_NOMBRE_CLASE_RECURSO = "nombre_clase_recurso";
    public static final String COLUMNA_DESCRIPCION_CLASE_RECURSO = "descripcion_clase_recurso";
    public static final String COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE = "es_clase_recurso_independiente";
    public static final String COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE = "es_clase_recurso_sin_detalle";
    public static final String COLUMNA_ES_CLASE_RECURSO_CON_ARBOL = "es_clase_recurso_con_arbol";
    public static final String COLUMNA_NUMERO_TIPO_CLASE_RECURSO = "numero_tipo_clase_recurso";
    public static final String COLUMNA_NUMERO_TIPO_RECURSO = "numero_tipo_recurso";
    public static final String COLUMNA_ID_FUNCION_SELECCION = "id_funcion_seleccion";
    public static final String COLUMNA_ID_PAGINA_SELECCION = "id_pagina_seleccion";
    public static final String COLUMNA_ID_PAGINA_DETALLE = "id_pagina_detalle";
    public static final String COLUMNA_ID_CLASE_RECURSO_MAESTRO = "id_clase_recurso_maestro";
    public static final String COLUMNA_ID_CLASE_RECURSO_SEGMENTO = "id_clase_recurso_segmento";
    public static final String COLUMNA_ID_CLASE_RECURSO_BASE = "id_clase_recurso_base";
    public static final String COLUMNA_ID_GRUPO_APLICACION = "id_grupo_aplicacion";
    public static final String COLUMNA_ID_APLICACION_WEB = "id_aplicacion_web";
    public static final String COLUMNA_LIMITE_FILAS_CONSULTA = "limite_filas_consulta";
    public static final String COLUMNA_LIMITE_FILAS_INFORME = "limite_filas_informe";
    public static final String COLUMNA_ORDEN_PRESENTACION = "orden_presentacion";
    public static final String COLUMNA_ES_CLASE_RECURSO_INSERTABLE = "es_clase_recurso_insertable";
    public static final String COLUMNA_ES_CLASE_RECURSO_MODIFICABLE = "es_clase_recurso_modificable";
    public static final String COLUMNA_ES_CLASE_RECURSO_ELIMINABLE = "es_clase_recurso_eliminable";
    public static final String COLUMNA_ES_CLASE_RECURSO_EXTENDIDA = "es_clase_recurso_extendida";
    public static final String COLUMNA_ETIQUETA_HIPERVINCULO = "etiqueta_hipervinculo";
    public static final String COLUMNA_ES_ENUMERADOR_CON_NUMERO = "es_enumerador_con_numero";
    public static final String COLUMNA_ALIAS_CLASE_RECURSO = "alias_clase_recurso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CLASE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_CLASE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_CLASE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RECURSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_SELECCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA_SELECCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA_DETALLE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_MAESTRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_BASE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION_WEB, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LIMITE_FILAS_CONSULTA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LIMITE_FILAS_INFORME, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN_PRESENTACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ETIQUETA_HIPERVINCULO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_ENUMERADOR_CON_NUMERO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ALIAS_CLASE_RECURSO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_SELECCION, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA_SELECCION, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA_DETALLE, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_MAESTRO, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_BASE, true);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION_WEB, true);
        this.setColumnasInsertables(COLUMNA_LIMITE_FILAS_CONSULTA, true);
        this.setColumnasInsertables(COLUMNA_LIMITE_FILAS_INFORME, true);
        this.setColumnasInsertables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, true);
        this.setColumnasInsertables(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, true);
        this.setColumnasInsertables(COLUMNA_ETIQUETA_HIPERVINCULO, true);
        this.setColumnasInsertables(COLUMNA_ES_ENUMERADOR_CON_NUMERO, true);
        this.setColumnasInsertables(COLUMNA_ALIAS_CLASE_RECURSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_VERSION_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_SELECCION, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA_SELECCION, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA_DETALLE, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_MAESTRO, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_BASE, true);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_ID_APLICACION_WEB, true);
        this.setColumnasModificables(COLUMNA_LIMITE_FILAS_CONSULTA, true);
        this.setColumnasModificables(COLUMNA_LIMITE_FILAS_INFORME, true);
        this.setColumnasModificables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, true);
        this.setColumnasModificables(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, true);
        this.setColumnasModificables(COLUMNA_ETIQUETA_HIPERVINCULO, true);
        this.setColumnasModificables(COLUMNA_ES_ENUMERADOR_CON_NUMERO, true);
        this.setColumnasModificables(COLUMNA_ALIAS_CLASE_RECURSO, true);
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

    public Long getVersionClaseRecurso() {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO);
    }
    public Long getVersionClaseRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO, rowKey);
    }
    public void setVersionClaseRecurso(Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO, valor);
    }
    public void setVersionClaseRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO, rowKey, valor);
    }

    public String getCodigoClaseRecurso() {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_RECURSO);
    }
    public String getCodigoClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_RECURSO, rowKey);
    }
    public void setCodigoClaseRecurso(String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_RECURSO, valor);
    }
    public void setCodigoClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_RECURSO, rowKey, valor);
    }

    public String getNombreClaseRecurso() {
        return (String) super.getValue(COLUMNA_NOMBRE_CLASE_RECURSO);
    }
    public String getNombreClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_CLASE_RECURSO, rowKey);
    }
    public void setNombreClaseRecurso(String valor) {
        super.setValue(COLUMNA_NOMBRE_CLASE_RECURSO, valor);
    }
    public void setNombreClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_CLASE_RECURSO, rowKey, valor);
    }

    public String getDescripcionClaseRecurso() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CLASE_RECURSO);
    }
    public String getDescripcionClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CLASE_RECURSO, rowKey);
    }
    public void setDescripcionClaseRecurso(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CLASE_RECURSO, valor);
    }
    public void setDescripcionClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CLASE_RECURSO, rowKey, valor);
    }

    public Integer getEsClaseRecursoIndependiente() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE);
    }
    public Integer getEsClaseRecursoIndependiente(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, rowKey);
    }
    public void setEsClaseRecursoIndependiente(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, valor);
    }
    public void setEsClaseRecursoIndependiente(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_INDEPENDIENTE, rowKey, valor);
    }

    public Integer getEsClaseRecursoSinDetalle() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE);
    }
    public Integer getEsClaseRecursoSinDetalle(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, rowKey);
    }
    public void setEsClaseRecursoSinDetalle(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, valor);
    }
    public void setEsClaseRecursoSinDetalle(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_SIN_DETALLE, rowKey, valor);
    }

    public Integer getEsClaseRecursoConArbol() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL);
    }
    public Integer getEsClaseRecursoConArbol(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, rowKey);
    }
    public void setEsClaseRecursoConArbol(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, valor);
    }
    public void setEsClaseRecursoConArbol(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_CON_ARBOL, rowKey, valor);
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

    public Integer getNumeroTipoRecurso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RECURSO);
    }
    public Integer getNumeroTipoRecurso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RECURSO, rowKey);
    }
    public void setNumeroTipoRecurso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RECURSO, valor);
    }
    public void setNumeroTipoRecurso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RECURSO, rowKey, valor);
    }

    public Long getIdFuncionSeleccion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_SELECCION);
    }
    public Long getIdFuncionSeleccion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_SELECCION, rowKey);
    }
    public void setIdFuncionSeleccion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_SELECCION, valor);
    }
    public void setIdFuncionSeleccion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_SELECCION, rowKey, valor);
    }

    public Long getIdPaginaSeleccion() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_SELECCION);
    }
    public Long getIdPaginaSeleccion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_SELECCION, rowKey);
    }
    public void setIdPaginaSeleccion(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_SELECCION, valor);
    }
    public void setIdPaginaSeleccion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_SELECCION, rowKey, valor);
    }

    public Long getIdPaginaDetalle() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_DETALLE);
    }
    public Long getIdPaginaDetalle(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_DETALLE, rowKey);
    }
    public void setIdPaginaDetalle(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_DETALLE, valor);
    }
    public void setIdPaginaDetalle(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_DETALLE, rowKey, valor);
    }

    public Long getIdClaseRecursoMaestro() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_MAESTRO);
    }
    public Long getIdClaseRecursoMaestro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_MAESTRO, rowKey);
    }
    public void setIdClaseRecursoMaestro(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_MAESTRO, valor);
    }
    public void setIdClaseRecursoMaestro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_MAESTRO, rowKey, valor);
    }

    public Long getIdClaseRecursoSegmento() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_SEGMENTO);
    }
    public Long getIdClaseRecursoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, rowKey);
    }
    public void setIdClaseRecursoSegmento(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, valor);
    }
    public void setIdClaseRecursoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_SEGMENTO, rowKey, valor);
    }

    public Long getIdClaseRecursoBase() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_BASE);
    }
    public Long getIdClaseRecursoBase(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_BASE, rowKey);
    }
    public void setIdClaseRecursoBase(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_BASE, valor);
    }
    public void setIdClaseRecursoBase(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_BASE, rowKey, valor);
    }

    public Long getIdGrupoAplicacion() {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_APLICACION);
    }
    public Long getIdGrupoAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_APLICACION, rowKey);
    }
    public void setIdGrupoAplicacion(Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_APLICACION, valor);
    }
    public void setIdGrupoAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_APLICACION, rowKey, valor);
    }

    public Long getIdAplicacionWeb() {
        return (Long) super.getValue(COLUMNA_ID_APLICACION_WEB);
    }
    public Long getIdAplicacionWeb(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_APLICACION_WEB, rowKey);
    }
    public void setIdAplicacionWeb(Long valor) {
        super.setValue(COLUMNA_ID_APLICACION_WEB, valor);
    }
    public void setIdAplicacionWeb(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_APLICACION_WEB, rowKey, valor);
    }

    public Integer getLimiteFilasConsulta() {
        return (Integer) super.getValue(COLUMNA_LIMITE_FILAS_CONSULTA);
    }
    public Integer getLimiteFilasConsulta(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_LIMITE_FILAS_CONSULTA, rowKey);
    }
    public void setLimiteFilasConsulta(Integer valor) {
        super.setValue(COLUMNA_LIMITE_FILAS_CONSULTA, valor);
    }
    public void setLimiteFilasConsulta(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_LIMITE_FILAS_CONSULTA, rowKey, valor);
    }

    public Integer getLimiteFilasInforme() {
        return (Integer) super.getValue(COLUMNA_LIMITE_FILAS_INFORME);
    }
    public Integer getLimiteFilasInforme(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_LIMITE_FILAS_INFORME, rowKey);
    }
    public void setLimiteFilasInforme(Integer valor) {
        super.setValue(COLUMNA_LIMITE_FILAS_INFORME, valor);
    }
    public void setLimiteFilasInforme(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_LIMITE_FILAS_INFORME, rowKey, valor);
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

    public Integer getEsClaseRecursoInsertable() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_INSERTABLE);
    }
    public Integer getEsClaseRecursoInsertable(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, rowKey);
    }
    public void setEsClaseRecursoInsertable(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, valor);
    }
    public void setEsClaseRecursoInsertable(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_INSERTABLE, rowKey, valor);
    }

    public Integer getEsClaseRecursoModificable() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE);
    }
    public Integer getEsClaseRecursoModificable(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, rowKey);
    }
    public void setEsClaseRecursoModificable(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, valor);
    }
    public void setEsClaseRecursoModificable(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_MODIFICABLE, rowKey, valor);
    }

    public Integer getEsClaseRecursoEliminable() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE);
    }
    public Integer getEsClaseRecursoEliminable(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, rowKey);
    }
    public void setEsClaseRecursoEliminable(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, valor);
    }
    public void setEsClaseRecursoEliminable(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_ELIMINABLE, rowKey, valor);
    }

    public Integer getEsClaseRecursoExtendida() {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA);
    }
    public Integer getEsClaseRecursoExtendida(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, rowKey);
    }
    public void setEsClaseRecursoExtendida(Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, valor);
    }
    public void setEsClaseRecursoExtendida(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CLASE_RECURSO_EXTENDIDA, rowKey, valor);
    }

    public String getEtiquetaHipervinculo() {
        return (String) super.getValue(COLUMNA_ETIQUETA_HIPERVINCULO);
    }
    public String getEtiquetaHipervinculo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ETIQUETA_HIPERVINCULO, rowKey);
    }
    public void setEtiquetaHipervinculo(String valor) {
        super.setValue(COLUMNA_ETIQUETA_HIPERVINCULO, valor);
    }
    public void setEtiquetaHipervinculo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ETIQUETA_HIPERVINCULO, rowKey, valor);
    }

    public Integer getEsEnumeradorConNumero() {
        return (Integer) super.getValue(COLUMNA_ES_ENUMERADOR_CON_NUMERO);
    }
    public Integer getEsEnumeradorConNumero(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_ENUMERADOR_CON_NUMERO, rowKey);
    }
    public void setEsEnumeradorConNumero(Integer valor) {
        super.setValue(COLUMNA_ES_ENUMERADOR_CON_NUMERO, valor);
    }
    public void setEsEnumeradorConNumero(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_ENUMERADOR_CON_NUMERO, rowKey, valor);
    }

    public String getAliasClaseRecurso() {
        return (String) super.getValue(COLUMNA_ALIAS_CLASE_RECURSO);
    }
    public String getAliasClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ALIAS_CLASE_RECURSO, rowKey);
    }
    public void setAliasClaseRecurso(String valor) {
        super.setValue(COLUMNA_ALIAS_CLASE_RECURSO, valor);
    }
    public void setAliasClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ALIAS_CLASE_RECURSO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_VERSION_RECURSO = "version_clase_recurso";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_clase_recurso";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_clase_recurso";

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
        return this.getIdClaseRecurso();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdClaseRecurso(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdClaseRecurso(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdClaseRecurso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionClaseRecurso();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionClaseRecurso(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionClaseRecurso(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionClaseRecurso(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoClaseRecurso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoClaseRecurso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoClaseRecurso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoClaseRecurso(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreClaseRecurso();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreClaseRecurso(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreClaseRecurso(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreClaseRecurso(rowKey, nombreRecurso);
    }
}
