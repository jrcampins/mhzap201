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

public class PaginaFuncionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public PaginaFuncionCachedRowSetDataProvider() {
        super();
    }

    public PaginaFuncionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "pagina_funcion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Funciones por Pagina";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_pagina_funcion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "pagina_funcion";

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

    public static final String COLUMNA_ID_PAGINA_FUNCION = "id_pagina_funcion";
    public static final String COLUMNA_VERSION_PAGINA_FUNCION = "version_pagina_funcion";
    public static final String COLUMNA_ID_PAGINA = "id_pagina";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ES_FUNCION_INICIAL = "es_funcion_inicial";
    public static final String COLUMNA_CONTROL_PAGINA_FUNCION = "control_pagina_funcion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PAGINA_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_FUNCION_INICIAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CONTROL_PAGINA_FUNCION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PAGINA_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ES_FUNCION_INICIAL, true);
        this.setColumnasInsertables(COLUMNA_CONTROL_PAGINA_FUNCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PAGINA_FUNCION, true);
        this.setColumnasModificables(COLUMNA_VERSION_PAGINA_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ES_FUNCION_INICIAL, true);
        this.setColumnasModificables(COLUMNA_CONTROL_PAGINA_FUNCION, true);
    }

    public Long getIdPaginaFuncion() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_FUNCION);
    }
    public Long getIdPaginaFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_FUNCION, rowKey);
    }
    public void setIdPaginaFuncion(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_FUNCION, valor);
    }
    public void setIdPaginaFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_FUNCION, rowKey, valor);
    }

    public Long getVersionPaginaFuncion() {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA_FUNCION);
    }
    public Long getVersionPaginaFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA_FUNCION, rowKey);
    }
    public void setVersionPaginaFuncion(Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA_FUNCION, valor);
    }
    public void setVersionPaginaFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA_FUNCION, rowKey, valor);
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

    public Integer getEsFuncionInicial() {
        return (Integer) super.getValue(COLUMNA_ES_FUNCION_INICIAL);
    }
    public Integer getEsFuncionInicial(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_FUNCION_INICIAL, rowKey);
    }
    public void setEsFuncionInicial(Integer valor) {
        super.setValue(COLUMNA_ES_FUNCION_INICIAL, valor);
    }
    public void setEsFuncionInicial(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_FUNCION_INICIAL, rowKey, valor);
    }

    public String getControlPaginaFuncion() {
        return (String) super.getValue(COLUMNA_CONTROL_PAGINA_FUNCION);
    }
    public String getControlPaginaFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CONTROL_PAGINA_FUNCION, rowKey);
    }
    public void setControlPaginaFuncion(String valor) {
        super.setValue(COLUMNA_CONTROL_PAGINA_FUNCION, valor);
    }
    public void setControlPaginaFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CONTROL_PAGINA_FUNCION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_pagina_funcion";
    public static final String COLUMNA_VERSION_RECURSO = "version_pagina_funcion";

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
        return this.getIdPaginaFuncion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPaginaFuncion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPaginaFuncion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPaginaFuncion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPaginaFuncion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPaginaFuncion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPaginaFuncion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPaginaFuncion(rowKey, versionRecurso);
    }
}
