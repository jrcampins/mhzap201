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

public class GrupoAplicacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public GrupoAplicacionCachedRowSetDataProvider() {
        super();
    }

    public GrupoAplicacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "grupo_aplicacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Grupos de Aplicacion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_grupo_aplicacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "grupo_aplicacion";

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

    public static final String COLUMNA_ID_GRUPO_APLICACION = "id_grupo_aplicacion";
    public static final String COLUMNA_VERSION_GRUPO_APLICACION = "version_grupo_aplicacion";
    public static final String COLUMNA_CODIGO_GRUPO_APLICACION = "codigo_grupo_aplicacion";
    public static final String COLUMNA_NOMBRE_GRUPO_APLICACION = "nombre_grupo_aplicacion";
    public static final String COLUMNA_DESCRIPCION_GRUPO_APLICACION = "descripcion_grupo_aplicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_GRUPO_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_GRUPO_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_GRUPO_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_GRUPO_APLICACION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_GRUPO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_GRUPO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_GRUPO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_GRUPO_APLICACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_VERSION_GRUPO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_GRUPO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_GRUPO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_GRUPO_APLICACION, true);
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

    public Long getVersionGrupoAplicacion() {
        return (Long) super.getValue(COLUMNA_VERSION_GRUPO_APLICACION);
    }
    public Long getVersionGrupoAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_GRUPO_APLICACION, rowKey);
    }
    public void setVersionGrupoAplicacion(Long valor) {
        super.setValue(COLUMNA_VERSION_GRUPO_APLICACION, valor);
    }
    public void setVersionGrupoAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_GRUPO_APLICACION, rowKey, valor);
    }

    public String getCodigoGrupoAplicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_GRUPO_APLICACION);
    }
    public String getCodigoGrupoAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_GRUPO_APLICACION, rowKey);
    }
    public void setCodigoGrupoAplicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_GRUPO_APLICACION, valor);
    }
    public void setCodigoGrupoAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_GRUPO_APLICACION, rowKey, valor);
    }

    public String getNombreGrupoAplicacion() {
        return (String) super.getValue(COLUMNA_NOMBRE_GRUPO_APLICACION);
    }
    public String getNombreGrupoAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_GRUPO_APLICACION, rowKey);
    }
    public void setNombreGrupoAplicacion(String valor) {
        super.setValue(COLUMNA_NOMBRE_GRUPO_APLICACION, valor);
    }
    public void setNombreGrupoAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_GRUPO_APLICACION, rowKey, valor);
    }

    public String getDescripcionGrupoAplicacion() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_GRUPO_APLICACION);
    }
    public String getDescripcionGrupoAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_GRUPO_APLICACION, rowKey);
    }
    public void setDescripcionGrupoAplicacion(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_GRUPO_APLICACION, valor);
    }
    public void setDescripcionGrupoAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_GRUPO_APLICACION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_grupo_aplicacion";
    public static final String COLUMNA_VERSION_RECURSO = "version_grupo_aplicacion";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_grupo_aplicacion";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_grupo_aplicacion";

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
        return this.getIdGrupoAplicacion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdGrupoAplicacion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdGrupoAplicacion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdGrupoAplicacion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionGrupoAplicacion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionGrupoAplicacion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionGrupoAplicacion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionGrupoAplicacion(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoGrupoAplicacion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoGrupoAplicacion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoGrupoAplicacion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoGrupoAplicacion(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreGrupoAplicacion();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreGrupoAplicacion(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreGrupoAplicacion(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreGrupoAplicacion(rowKey, nombreRecurso);
    }
}
