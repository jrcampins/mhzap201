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

public class ClaseRecursoSecCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public ClaseRecursoSecCachedRowSetDataProvider() {
        super();
    }

    public ClaseRecursoSecCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_recurso_sec";
    public static final String NOMBRE_DOMINIO_RECURSO = "Secciones por Clase de Recurso";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_recurso_sec_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_recurso_sec";

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

    public static final String COLUMNA_ID_CLASE_RECURSO_SEC = "id_clase_recurso_sec";
    public static final String COLUMNA_VERSION_CLASE_RECURSO_SEC = "version_clase_recurso_sec";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_ETIQUETA_CLASE_RECURSO_SEC = "etiqueta_clase_recurso_sec";
    public static final String COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC = "descripcion_clase_recurso_sec";
    public static final String COLUMNA_ORDEN_PRESENTACION = "orden_presentacion";
    public static final String COLUMNA_ES_PESTANA_DETALLE = "es_pestana_detalle";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_SEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_CLASE_RECURSO_SEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN_PRESENTACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PESTANA_DETALLE, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_SEC, true);
        this.setColumnasInsertables(COLUMNA_VERSION_CLASE_RECURSO_SEC, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, true);
        this.setColumnasInsertables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasInsertables(COLUMNA_ES_PESTANA_DETALLE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_SEC, true);
        this.setColumnasModificables(COLUMNA_VERSION_CLASE_RECURSO_SEC, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, true);
        this.setColumnasModificables(COLUMNA_ORDEN_PRESENTACION, true);
        this.setColumnasModificables(COLUMNA_ES_PESTANA_DETALLE, true);
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

    public Long getVersionClaseRecursoSec() {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO_SEC);
    }
    public Long getVersionClaseRecursoSec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_CLASE_RECURSO_SEC, rowKey);
    }
    public void setVersionClaseRecursoSec(Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO_SEC, valor);
    }
    public void setVersionClaseRecursoSec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_CLASE_RECURSO_SEC, rowKey, valor);
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

    public String getEtiquetaClaseRecursoSec() {
        return (String) super.getValue(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC);
    }
    public String getEtiquetaClaseRecursoSec(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, rowKey);
    }
    public void setEtiquetaClaseRecursoSec(String valor) {
        super.setValue(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, valor);
    }
    public void setEtiquetaClaseRecursoSec(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ETIQUETA_CLASE_RECURSO_SEC, rowKey, valor);
    }

    public String getDescripcionClaseRecursoSec() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC);
    }
    public String getDescripcionClaseRecursoSec(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, rowKey);
    }
    public void setDescripcionClaseRecursoSec(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, valor);
    }
    public void setDescripcionClaseRecursoSec(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CLASE_RECURSO_SEC, rowKey, valor);
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

    public Integer getEsPestanaDetalle() {
        return (Integer) super.getValue(COLUMNA_ES_PESTANA_DETALLE);
    }
    public Integer getEsPestanaDetalle(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PESTANA_DETALLE, rowKey);
    }
    public void setEsPestanaDetalle(Integer valor) {
        super.setValue(COLUMNA_ES_PESTANA_DETALLE, valor);
    }
    public void setEsPestanaDetalle(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PESTANA_DETALLE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_clase_recurso_sec";
    public static final String COLUMNA_VERSION_RECURSO = "version_clase_recurso_sec";

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
        return this.getIdClaseRecursoSec();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdClaseRecursoSec(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdClaseRecursoSec(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdClaseRecursoSec(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionClaseRecursoSec();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionClaseRecursoSec(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionClaseRecursoSec(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionClaseRecursoSec(rowKey, versionRecurso);
    }
}
