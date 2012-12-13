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
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class ProcesoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public ProcesoCachedRowSetDataProvider() {
        super();
    }

    public ProcesoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "proceso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Procesos Globales";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_proceso_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "proceso";

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

    public static final String COLUMNA_ID_PROCESO = "id_proceso";
    public static final String COLUMNA_VERSION_PROCESO = "version_proceso";
    public static final String COLUMNA_CODIGO_PROCESO = "codigo_proceso";
    public static final String COLUMNA_NOMBRE_PROCESO = "nombre_proceso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PROCESO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PROCESO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PROCESO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PROCESO, true);
        this.setColumnasModificables(COLUMNA_VERSION_PROCESO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PROCESO, true);
    }

    public Long getIdProceso() {
        return (Long) super.getValue(COLUMNA_ID_PROCESO);
    }
    public Long getIdProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PROCESO, rowKey);
    }
    public void setIdProceso(Long valor) {
        super.setValue(COLUMNA_ID_PROCESO, valor);
    }
    public void setIdProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PROCESO, rowKey, valor);
    }

    public Long getVersionProceso() {
        return (Long) super.getValue(COLUMNA_VERSION_PROCESO);
    }
    public Long getVersionProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PROCESO, rowKey);
    }
    public void setVersionProceso(Long valor) {
        super.setValue(COLUMNA_VERSION_PROCESO, valor);
    }
    public void setVersionProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PROCESO, rowKey, valor);
    }

    public String getCodigoProceso() {
        return (String) super.getValue(COLUMNA_CODIGO_PROCESO);
    }
    public String getCodigoProceso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PROCESO, rowKey);
    }
    public void setCodigoProceso(String valor) {
        super.setValue(COLUMNA_CODIGO_PROCESO, valor);
    }
    public void setCodigoProceso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PROCESO, rowKey, valor);
    }

    public String getNombreProceso() {
        return (String) super.getValue(COLUMNA_NOMBRE_PROCESO);
    }
    public String getNombreProceso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PROCESO, rowKey);
    }
    public void setNombreProceso(String valor) {
        super.setValue(COLUMNA_NOMBRE_PROCESO, valor);
    }
    public void setNombreProceso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PROCESO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_proceso";
    public static final String COLUMNA_VERSION_RECURSO = "version_proceso";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_proceso";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_proceso";

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
        return this.getIdProceso();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdProceso(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdProceso(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdProceso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionProceso();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionProceso(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionProceso(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionProceso(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoProceso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoProceso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoProceso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoProceso(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreProceso();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreProceso(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreProceso(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreProceso(rowKey, nombreRecurso);
    }
}
