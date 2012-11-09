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

public class RolAplicacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public RolAplicacionCachedRowSetDataProvider() {
        super();
    }

    public RolAplicacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rol_aplicacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Aplicaciones por Rol";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rol_aplicacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rol_aplicacion";

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

    public static final String COLUMNA_ID_ROL_APLICACION = "id_rol_aplicacion";
    public static final String COLUMNA_VERSION_ROL_APLICACION = "version_rol_aplicacion";
    public static final String COLUMNA_ID_ROL = "id_rol";
    public static final String COLUMNA_ID_APLICACION = "id_aplicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ROL_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ROL_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ROL_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_ID_ROL, true);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ROL_APLICACION, true);
        this.setColumnasModificables(COLUMNA_VERSION_ROL_APLICACION, true);
        this.setColumnasModificables(COLUMNA_ID_ROL, true);
        this.setColumnasModificables(COLUMNA_ID_APLICACION, true);
    }

    public Long getIdRolAplicacion() {
        return (Long) super.getValue(COLUMNA_ID_ROL_APLICACION);
    }
    public Long getIdRolAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ROL_APLICACION, rowKey);
    }
    public void setIdRolAplicacion(Long valor) {
        super.setValue(COLUMNA_ID_ROL_APLICACION, valor);
    }
    public void setIdRolAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ROL_APLICACION, rowKey, valor);
    }

    public Long getVersionRolAplicacion() {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_APLICACION);
    }
    public Long getVersionRolAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_APLICACION, rowKey);
    }
    public void setVersionRolAplicacion(Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_APLICACION, valor);
    }
    public void setVersionRolAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_APLICACION, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rol_aplicacion";
    public static final String COLUMNA_VERSION_RECURSO = "version_rol_aplicacion";

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
        return this.getIdRolAplicacion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRolAplicacion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRolAplicacion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRolAplicacion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRolAplicacion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRolAplicacion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRolAplicacion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRolAplicacion(rowKey, versionRecurso);
    }
}
