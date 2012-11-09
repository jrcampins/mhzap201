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
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class PaginaUsuarioCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoPersonalizableDataProvider {

    public PaginaUsuarioCachedRowSetDataProvider() {
        super();
    }

    public PaginaUsuarioCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "pagina_usuario";
    public static final String NOMBRE_DOMINIO_RECURSO = "Paginas por Usuario";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_pagina_usuario_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "pagina_usuario";

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

    public static final String COLUMNA_ID_PAGINA_USUARIO = "id_pagina_usuario";
    public static final String COLUMNA_VERSION_PAGINA_USUARIO = "version_pagina_usuario";
    public static final String COLUMNA_ID_PAGINA = "id_pagina";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PAGINA_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PAGINA_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PAGINA_USUARIO, true);
        this.setColumnasModificables(COLUMNA_VERSION_PAGINA_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
    }

    public Long getIdPaginaUsuario() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_USUARIO);
    }
    public Long getIdPaginaUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA_USUARIO, rowKey);
    }
    public void setIdPaginaUsuario(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_USUARIO, valor);
    }
    public void setIdPaginaUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA_USUARIO, rowKey, valor);
    }

    public Long getVersionPaginaUsuario() {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA_USUARIO);
    }
    public Long getVersionPaginaUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA_USUARIO, rowKey);
    }
    public void setVersionPaginaUsuario(Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA_USUARIO, valor);
    }
    public void setVersionPaginaUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA_USUARIO, rowKey, valor);
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

    public Long getIdUsuario() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO);
    }
    public Long getIdUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO, rowKey);
    }
    public void setIdUsuario(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, valor);
    }
    public void setIdUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_pagina_usuario";
    public static final String COLUMNA_VERSION_RECURSO = "version_pagina_usuario";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaPropietarioRecurso() {
        return COLUMNA_PROPIETARIO_RECURSO;
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
    public String getEtiquetaPropietarioRecurso() {
        return ETIQUETA_PROPIETARIO_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdPaginaUsuario();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPaginaUsuario(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPaginaUsuario(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPaginaUsuario(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPaginaUsuario();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPaginaUsuario(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPaginaUsuario(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPaginaUsuario(rowKey, versionRecurso);
    }

    @Override
    public Long getPropietarioRecurso() {
        return this.getIdUsuario();
    }
    @Override
    public Long getPropietarioRecurso(RowKey rowKey) {
        return this.getIdUsuario(rowKey);
    }
    @Override
    public void setPropietarioRecurso(Long propietarioRecurso) {
        this.setIdUsuario(propietarioRecurso);
    }
    @Override
    public void setPropietarioRecurso(RowKey rowKey, Long propietarioRecurso) {
        this.setIdUsuario(rowKey, propietarioRecurso);
    }
}
