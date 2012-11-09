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
import com.egt.core.db.xdp.RecursoJerarquizableDataProvider;
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class OpcionMenuCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoJerarquizableDataProvider, RecursoDesactivableDataProvider {

    public OpcionMenuCachedRowSetDataProvider() {
        super();
    }

    public OpcionMenuCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "opcion_menu";
    public static final String NOMBRE_DOMINIO_RECURSO = "Opciones de Menu";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_opcion_menu_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "opcion_menu";

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

    public static final String COLUMNA_ID_OPCION_MENU = "id_opcion_menu";
    public static final String COLUMNA_VERSION_OPCION_MENU = "version_opcion_menu";
    public static final String COLUMNA_CODIGO_OPCION_MENU = "codigo_opcion_menu";
    public static final String COLUMNA_NOMBRE_OPCION_MENU = "nombre_opcion_menu";
    public static final String COLUMNA_DESCRIPCION_OPCION_MENU = "descripcion_opcion_menu";
    public static final String COLUMNA_URL_OPCION_MENU = "url_opcion_menu";
    public static final String COLUMNA_ID_APLICACION = "id_aplicacion";
    public static final String COLUMNA_ID_PAGINA = "id_pagina";
    public static final String COLUMNA_ID_OPCION_MENU_SUPERIOR = "id_opcion_menu_superior";
    public static final String COLUMNA_NUMERO_TIPO_NODO = "numero_tipo_nodo";
    public static final String COLUMNA_NUMERO_NIVEL_OPCION_MENU = "numero_nivel_opcion_menu";
    public static final String COLUMNA_SECUENCIA_OPCION_MENU = "secuencia_opcion_menu";
    public static final String COLUMNA_CLAVE_OPCION_MENU = "clave_opcion_menu";
    public static final String COLUMNA_ES_OPCION_MENU_INACTIVA = "es_opcion_menu_inactiva";
    public static final String COLUMNA_ES_OPCION_MENU_SINCRONIZADA = "es_opcion_menu_sincronizada";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OPCION_MENU, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_OPCION_MENU, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_URL_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OPCION_MENU_SUPERIOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_NODO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_OPCION_MENU, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SECUENCIA_OPCION_MENU, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_OPCION_MENU_INACTIVA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_VERSION_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_URL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_OPCION_MENU_SUPERIOR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_SECUENCIA_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_ES_OPCION_MENU_INACTIVA, true);
        this.setColumnasInsertables(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_VERSION_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_URL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_ID_APLICACION, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_OPCION_MENU_SUPERIOR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_SECUENCIA_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_ES_OPCION_MENU_INACTIVA, true);
        this.setColumnasModificables(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, true);
    }

    public Long getIdOpcionMenu() {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU);
    }
    public Long getIdOpcionMenu(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU, rowKey);
    }
    public void setIdOpcionMenu(Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU, valor);
    }
    public void setIdOpcionMenu(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU, rowKey, valor);
    }

    public Long getVersionOpcionMenu() {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_MENU);
    }
    public Long getVersionOpcionMenu(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_MENU, rowKey);
    }
    public void setVersionOpcionMenu(Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_MENU, valor);
    }
    public void setVersionOpcionMenu(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_MENU, rowKey, valor);
    }

    public String getCodigoOpcionMenu() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU);
    }
    public String getCodigoOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU, rowKey);
    }
    public void setCodigoOpcionMenu(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU, valor);
    }
    public void setCodigoOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU, rowKey, valor);
    }

    public String getNombreOpcionMenu() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU);
    }
    public String getNombreOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU, rowKey);
    }
    public void setNombreOpcionMenu(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU, valor);
    }
    public void setNombreOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU, rowKey, valor);
    }

    public String getDescripcionOpcionMenu() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_OPCION_MENU);
    }
    public String getDescripcionOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_OPCION_MENU, rowKey);
    }
    public void setDescripcionOpcionMenu(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_OPCION_MENU, valor);
    }
    public void setDescripcionOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_OPCION_MENU, rowKey, valor);
    }

    public String getUrlOpcionMenu() {
        return (String) super.getValue(COLUMNA_URL_OPCION_MENU);
    }
    public String getUrlOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_URL_OPCION_MENU, rowKey);
    }
    public void setUrlOpcionMenu(String valor) {
        super.setValue(COLUMNA_URL_OPCION_MENU, valor);
    }
    public void setUrlOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_URL_OPCION_MENU, rowKey, valor);
    }

    public Long getIdAplicacion() {
        return (Long) super.getValue(COLUMNA_ID_APLICACION);
    }
    public Long getIdAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_APLICACION, rowKey);
    }
    public void setIdAplicacion(Long valor) {
        super.setValue(COLUMNA_ID_APLICACION, valor);
    }
    public void setIdAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_APLICACION, rowKey, valor);
    }

    public Long getIdPagina() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA);
    }
    public Long getIdPagina(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA, rowKey);
    }
    public void setIdPagina(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA, valor);
    }
    public void setIdPagina(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA, rowKey, valor);
    }

    public Long getIdOpcionMenuSuperior() {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU_SUPERIOR);
    }
    public Long getIdOpcionMenuSuperior(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU_SUPERIOR, rowKey);
    }
    public void setIdOpcionMenuSuperior(Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU_SUPERIOR, valor);
    }
    public void setIdOpcionMenuSuperior(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU_SUPERIOR, rowKey, valor);
    }

    public Integer getNumeroTipoNodo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO);
    }
    public Integer getNumeroTipoNodo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO, rowKey);
    }
    public void setNumeroTipoNodo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, valor);
    }
    public void setNumeroTipoNodo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, rowKey, valor);
    }

    public Integer getNumeroNivelOpcionMenu() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU);
    }
    public Integer getNumeroNivelOpcionMenu(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, rowKey);
    }
    public void setNumeroNivelOpcionMenu(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, valor);
    }
    public void setNumeroNivelOpcionMenu(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, rowKey, valor);
    }

    public Integer getSecuenciaOpcionMenu() {
        return (Integer) super.getValue(COLUMNA_SECUENCIA_OPCION_MENU);
    }
    public Integer getSecuenciaOpcionMenu(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SECUENCIA_OPCION_MENU, rowKey);
    }
    public void setSecuenciaOpcionMenu(Integer valor) {
        super.setValue(COLUMNA_SECUENCIA_OPCION_MENU, valor);
    }
    public void setSecuenciaOpcionMenu(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SECUENCIA_OPCION_MENU, rowKey, valor);
    }

    public String getClaveOpcionMenu() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU);
    }
    public String getClaveOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU, rowKey);
    }
    public void setClaveOpcionMenu(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU, valor);
    }
    public void setClaveOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU, rowKey, valor);
    }

    public Integer getEsOpcionMenuInactiva() {
        return (Integer) super.getValue(COLUMNA_ES_OPCION_MENU_INACTIVA);
    }
    public Integer getEsOpcionMenuInactiva(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_OPCION_MENU_INACTIVA, rowKey);
    }
    public void setEsOpcionMenuInactiva(Integer valor) {
        super.setValue(COLUMNA_ES_OPCION_MENU_INACTIVA, valor);
    }
    public void setEsOpcionMenuInactiva(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_OPCION_MENU_INACTIVA, rowKey, valor);
    }

    public Integer getEsOpcionMenuSincronizada() {
        return (Integer) super.getValue(COLUMNA_ES_OPCION_MENU_SINCRONIZADA);
    }
    public Integer getEsOpcionMenuSincronizada(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, rowKey);
    }
    public void setEsOpcionMenuSincronizada(Integer valor) {
        super.setValue(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, valor);
    }
    public void setEsOpcionMenuSincronizada(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_OPCION_MENU_SINCRONIZADA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_opcion_menu";
    public static final String COLUMNA_VERSION_RECURSO = "version_opcion_menu";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_opcion_menu";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_opcion_menu";
    public static final String COLUMNA_RECURSO_SUPERIOR = "id_opcion_menu_superior";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_opcion_menu_inactiva";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_RECURSO_SUPERIOR = "Opcion Menu Superior";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Opcion Menu Inactiva";

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
    public String getColumnaRecursoSuperior() {
        return COLUMNA_RECURSO_SUPERIOR;
    }
    @Override
    public String getColumnaEsRecursoInactivo() {
        return COLUMNA_ES_RECURSO_INACTIVO;
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
    public String getEtiquetaRecursoSuperior() {
        return ETIQUETA_RECURSO_SUPERIOR;
    }
    @Override
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdOpcionMenu();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdOpcionMenu(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdOpcionMenu(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdOpcionMenu(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionOpcionMenu();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionOpcionMenu(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionOpcionMenu(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionOpcionMenu(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoOpcionMenu();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoOpcionMenu(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoOpcionMenu(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoOpcionMenu(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreOpcionMenu();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreOpcionMenu(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreOpcionMenu(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreOpcionMenu(rowKey, nombreRecurso);
    }

    @Override
    public Long getRecursoSuperior() {
        return this.getIdOpcionMenuSuperior();
    }
    @Override
    public Long getRecursoSuperior(RowKey rowKey) {
        return this.getIdOpcionMenuSuperior(rowKey);
    }
    @Override
    public void setRecursoSuperior(Long recursoSuperior) {
        this.setIdOpcionMenuSuperior(recursoSuperior);
    }
    @Override
    public void setRecursoSuperior(RowKey rowKey, Long recursoSuperior) {
        this.setIdOpcionMenuSuperior(rowKey, recursoSuperior);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsOpcionMenuInactiva();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsOpcionMenuInactiva(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsOpcionMenuInactiva(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsOpcionMenuInactiva(rowKey, esRecursoInactivo);
    }
}
