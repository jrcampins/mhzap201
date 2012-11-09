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

public class RolPaginaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public RolPaginaCachedRowSetDataProvider() {
        super();
    }

    public RolPaginaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rol_pagina";
    public static final String NOMBRE_DOMINIO_RECURSO = "Paginas por Rol";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rol_pagina_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rol_pagina";

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

    public static final String COLUMNA_ID_ROL_PAGINA = "id_rol_pagina";
    public static final String COLUMNA_VERSION_ROL_PAGINA = "version_rol_pagina";
    public static final String COLUMNA_ID_ROL = "id_rol";
    public static final String COLUMNA_ID_PAGINA = "id_pagina";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ROL_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ROL_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ROL_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_ROL, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ROL_PAGINA, true);
        this.setColumnasModificables(COLUMNA_VERSION_ROL_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_ROL, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
    }

    public Long getIdRolPagina() {
        return (Long) super.getValue(COLUMNA_ID_ROL_PAGINA);
    }
    public Long getIdRolPagina(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ROL_PAGINA, rowKey);
    }
    public void setIdRolPagina(Long valor) {
        super.setValue(COLUMNA_ID_ROL_PAGINA, valor);
    }
    public void setIdRolPagina(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ROL_PAGINA, rowKey, valor);
    }

    public Long getVersionRolPagina() {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_PAGINA);
    }
    public Long getVersionRolPagina(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_PAGINA, rowKey);
    }
    public void setVersionRolPagina(Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_PAGINA, valor);
    }
    public void setVersionRolPagina(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_PAGINA, rowKey, valor);
    }

    public Long getIdRol() {
        return (Long) super.getValue(COLUMNA_ID_ROL);
    }
    public Long getIdRol(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ROL, rowKey);
    }
    public void setIdRol(Long valor) {
        super.setValue(COLUMNA_ID_ROL, valor);
    }
    public void setIdRol(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ROL, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rol_pagina";
    public static final String COLUMNA_VERSION_RECURSO = "version_rol_pagina";

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
        return this.getIdRolPagina();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRolPagina(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRolPagina(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRolPagina(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRolPagina();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRolPagina(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRolPagina(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRolPagina(rowKey, versionRecurso);
    }
}
