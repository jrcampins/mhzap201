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
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FavoritosCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoNombrableDataProvider, RecursoPersonalizableDataProvider {

    public FavoritosCachedRowSetDataProvider() {
        super();
    }

    public FavoritosCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "favoritos";
    public static final String NOMBRE_DOMINIO_RECURSO = "Favoritos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM favoritos ";
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
    public static final String COLUMNA_CODIGO_PAGINA = "codigo_pagina";
    public static final String COLUMNA_NOMBRE_PAGINA = "nombre_pagina";
    public static final String COLUMNA_ID_APLICACION = "id_aplicacion";
    public static final String COLUMNA_NUMERO_TIPO_PAGINA = "numero_tipo_pagina";
    public static final String COLUMNA_URL_PAGINA = "url_pagina";
    public static final String COLUMNA_CODIGO_USUARIO = "codigo_usuario";
    public static final String COLUMNA_NOMBRE_USUARIO = "nombre_usuario";
    public static final String COLUMNA_URL_APLICACION = "url_aplicacion";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_NUMERO_TIPO_RECURSO = "numero_tipo_recurso";
    public static final String COLUMNA_ID_GRUPO_APLICACION = "id_grupo_aplicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PAGINA_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PAGINA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_URL_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_URL_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RECURSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_APLICACION, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PAGINA_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PAGINA, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PAGINA, false);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION, false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PAGINA, false);
        this.setColumnasInsertables(COLUMNA_URL_PAGINA, false);
        this.setColumnasInsertables(COLUMNA_CODIGO_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_URL_APLICACION, false);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_APLICACION, false);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PAGINA_USUARIO, true);
        this.setColumnasModificables(COLUMNA_VERSION_PAGINA_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PAGINA, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_PAGINA, false);
        this.setColumnasModificables(COLUMNA_ID_APLICACION, false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PAGINA, false);
        this.setColumnasModificables(COLUMNA_URL_PAGINA, false);
        this.setColumnasModificables(COLUMNA_CODIGO_USUARIO, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_USUARIO, false);
        this.setColumnasModificables(COLUMNA_URL_APLICACION, false);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RECURSO, false);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_APLICACION, false);
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

    public String getCodigoPagina() {
        return (String) super.getValue(COLUMNA_CODIGO_PAGINA);
    }
    public String getCodigoPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PAGINA, rowKey);
    }
    public void setCodigoPagina(String valor) {
        super.setValue(COLUMNA_CODIGO_PAGINA, valor);
    }
    public void setCodigoPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PAGINA, rowKey, valor);
    }

    public String getNombrePagina() {
        return (String) super.getValue(COLUMNA_NOMBRE_PAGINA);
    }
    public String getNombrePagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PAGINA, rowKey);
    }
    public void setNombrePagina(String valor) {
        super.setValue(COLUMNA_NOMBRE_PAGINA, valor);
    }
    public void setNombrePagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PAGINA, rowKey, valor);
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

    public Integer getNumeroTipoPagina() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA);
    }
    public Integer getNumeroTipoPagina(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey);
    }
    public void setNumeroTipoPagina(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, valor);
    }
    public void setNumeroTipoPagina(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey, valor);
    }

    public String getUrlPagina() {
        return (String) super.getValue(COLUMNA_URL_PAGINA);
    }
    public String getUrlPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_URL_PAGINA, rowKey);
    }
    public void setUrlPagina(String valor) {
        super.setValue(COLUMNA_URL_PAGINA, valor);
    }
    public void setUrlPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_URL_PAGINA, rowKey, valor);
    }

    public String getCodigoUsuario() {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO);
    }
    public String getCodigoUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO, rowKey);
    }
    public void setCodigoUsuario(String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, valor);
    }
    public void setCodigoUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, rowKey, valor);
    }

    public String getNombreUsuario() {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO);
    }
    public String getNombreUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO, rowKey);
    }
    public void setNombreUsuario(String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, valor);
    }
    public void setNombreUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, rowKey, valor);
    }

    public String getUrlAplicacion() {
        return (String) super.getValue(COLUMNA_URL_APLICACION);
    }
    public String getUrlAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_URL_APLICACION, rowKey);
    }
    public void setUrlAplicacion(String valor) {
        super.setValue(COLUMNA_URL_APLICACION, valor);
    }
    public void setUrlAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_URL_APLICACION, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_pagina_usuario";
    public static final String COLUMNA_VERSION_RECURSO = "version_pagina_usuario";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_pagina";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
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
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
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
    public String getNombreRecurso() {
        return this.getNombrePagina();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombrePagina(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombrePagina(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombrePagina(rowKey, nombreRecurso);
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
