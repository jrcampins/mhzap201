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

public class RolCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public RolCachedRowSetDataProvider() {
        super();
    }

    public RolCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rol";
    public static final String NOMBRE_DOMINIO_RECURSO = "Roles";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rol_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rol";

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

    public static final String COLUMNA_ID_ROL = "id_rol";
    public static final String COLUMNA_VERSION_ROL = "version_rol";
    public static final String COLUMNA_CODIGO_ROL = "codigo_rol";
    public static final String COLUMNA_NOMBRE_ROL = "nombre_rol";
    public static final String COLUMNA_DESCRIPCION_ROL = "descripcion_rol";
    public static final String COLUMNA_NUMERO_TIPO_ROL = "numero_tipo_rol";
    public static final String COLUMNA_ID_GRUPO_APLICACION = "id_grupo_aplicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ROL, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ROL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ROL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_ROL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ROL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_APLICACION, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ROL, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ROL, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ROL, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ROL, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ROL, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ROL, true);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_APLICACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ROL, true);
        this.setColumnasModificables(COLUMNA_VERSION_ROL, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ROL, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ROL, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ROL, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ROL, true);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_APLICACION, true);
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

    public Long getVersionRol() {
        return (Long) super.getValue(COLUMNA_VERSION_ROL);
    }
    public Long getVersionRol(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ROL, rowKey);
    }
    public void setVersionRol(Long valor) {
        super.setValue(COLUMNA_VERSION_ROL, valor);
    }
    public void setVersionRol(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ROL, rowKey, valor);
    }

    public String getCodigoRol() {
        return (String) super.getValue(COLUMNA_CODIGO_ROL);
    }
    public String getCodigoRol(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ROL, rowKey);
    }
    public void setCodigoRol(String valor) {
        super.setValue(COLUMNA_CODIGO_ROL, valor);
    }
    public void setCodigoRol(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ROL, rowKey, valor);
    }

    public String getNombreRol() {
        return (String) super.getValue(COLUMNA_NOMBRE_ROL);
    }
    public String getNombreRol(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ROL, rowKey);
    }
    public void setNombreRol(String valor) {
        super.setValue(COLUMNA_NOMBRE_ROL, valor);
    }
    public void setNombreRol(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ROL, rowKey, valor);
    }

    public String getDescripcionRol() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ROL);
    }
    public String getDescripcionRol(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ROL, rowKey);
    }
    public void setDescripcionRol(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ROL, valor);
    }
    public void setDescripcionRol(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ROL, rowKey, valor);
    }

    public Integer getNumeroTipoRol() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ROL);
    }
    public Integer getNumeroTipoRol(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ROL, rowKey);
    }
    public void setNumeroTipoRol(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ROL, valor);
    }
    public void setNumeroTipoRol(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ROL, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rol";
    public static final String COLUMNA_VERSION_RECURSO = "version_rol";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_rol";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_rol";

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
        return this.getIdRol();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRol(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRol(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRol(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRol();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRol(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRol(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRol(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoRol();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoRol(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoRol(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoRol(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreRol();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreRol(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreRol(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreRol(rowKey, nombreRecurso);
    }
}
