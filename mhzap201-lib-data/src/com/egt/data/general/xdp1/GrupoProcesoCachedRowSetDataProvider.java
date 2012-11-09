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

public class GrupoProcesoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public GrupoProcesoCachedRowSetDataProvider() {
        super();
    }

    public GrupoProcesoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "grupo_proceso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Grupos de Proceso";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_grupo_proceso_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "grupo_proceso";

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

    public static final String COLUMNA_ID_GRUPO_PROCESO = "id_grupo_proceso";
    public static final String COLUMNA_VERSION_GRUPO_PROCESO = "version_grupo_proceso";
    public static final String COLUMNA_CODIGO_GRUPO_PROCESO = "codigo_grupo_proceso";
    public static final String COLUMNA_NOMBRE_GRUPO_PROCESO = "nombre_grupo_proceso";
    public static final String COLUMNA_DESCRIPCION_GRUPO_PROCESO = "descripcion_grupo_proceso";
    public static final String COLUMNA_ID_RASTRO_PROCESO = "id_rastro_proceso";
    public static final String COLUMNA_NUMERO_CONDICION_EJE_FUN = "numero_condicion_eje_fun";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_GRUPO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_GRUPO_PROCESO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_GRUPO_PROCESO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_GRUPO_PROCESO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_EJE_FUN, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_VERSION_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
    }

    public Long getIdGrupoProceso() {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_PROCESO);
    }
    public Long getIdGrupoProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_PROCESO, rowKey);
    }
    public void setIdGrupoProceso(Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_PROCESO, valor);
    }
    public void setIdGrupoProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_PROCESO, rowKey, valor);
    }

    public Long getVersionGrupoProceso() {
        return (Long) super.getValue(COLUMNA_VERSION_GRUPO_PROCESO);
    }
    public Long getVersionGrupoProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_GRUPO_PROCESO, rowKey);
    }
    public void setVersionGrupoProceso(Long valor) {
        super.setValue(COLUMNA_VERSION_GRUPO_PROCESO, valor);
    }
    public void setVersionGrupoProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_GRUPO_PROCESO, rowKey, valor);
    }

    public String getCodigoGrupoProceso() {
        return (String) super.getValue(COLUMNA_CODIGO_GRUPO_PROCESO);
    }
    public String getCodigoGrupoProceso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_GRUPO_PROCESO, rowKey);
    }
    public void setCodigoGrupoProceso(String valor) {
        super.setValue(COLUMNA_CODIGO_GRUPO_PROCESO, valor);
    }
    public void setCodigoGrupoProceso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_GRUPO_PROCESO, rowKey, valor);
    }

    public String getNombreGrupoProceso() {
        return (String) super.getValue(COLUMNA_NOMBRE_GRUPO_PROCESO);
    }
    public String getNombreGrupoProceso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_GRUPO_PROCESO, rowKey);
    }
    public void setNombreGrupoProceso(String valor) {
        super.setValue(COLUMNA_NOMBRE_GRUPO_PROCESO, valor);
    }
    public void setNombreGrupoProceso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_GRUPO_PROCESO, rowKey, valor);
    }

    public String getDescripcionGrupoProceso() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_GRUPO_PROCESO);
    }
    public String getDescripcionGrupoProceso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_GRUPO_PROCESO, rowKey);
    }
    public void setDescripcionGrupoProceso(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_GRUPO_PROCESO, valor);
    }
    public void setDescripcionGrupoProceso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_GRUPO_PROCESO, rowKey, valor);
    }

    public Long getIdRastroProceso() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_PROCESO);
    }
    public Long getIdRastroProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_PROCESO, rowKey);
    }
    public void setIdRastroProceso(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_PROCESO, valor);
    }
    public void setIdRastroProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_PROCESO, rowKey, valor);
    }

    public Integer getNumeroCondicionEjeFun() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_EJE_FUN);
    }
    public Integer getNumeroCondicionEjeFun(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_EJE_FUN, rowKey);
    }
    public void setNumeroCondicionEjeFun(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_EJE_FUN, valor);
    }
    public void setNumeroCondicionEjeFun(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_EJE_FUN, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_grupo_proceso";
    public static final String COLUMNA_VERSION_RECURSO = "version_grupo_proceso";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_grupo_proceso";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_grupo_proceso";

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
        return this.getIdGrupoProceso();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdGrupoProceso(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdGrupoProceso(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdGrupoProceso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionGrupoProceso();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionGrupoProceso(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionGrupoProceso(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionGrupoProceso(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoGrupoProceso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoGrupoProceso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoGrupoProceso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoGrupoProceso(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreGrupoProceso();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreGrupoProceso(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreGrupoProceso(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreGrupoProceso(rowKey, nombreRecurso);
    }
}
