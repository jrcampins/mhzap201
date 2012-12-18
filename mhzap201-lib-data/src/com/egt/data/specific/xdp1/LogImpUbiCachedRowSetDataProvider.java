/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.specific.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class LogImpUbiCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpUbiCachedRowSetDataProvider() {
        super();
    }

    public LogImpUbiCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_ubi";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Ubicaciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_ubi_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_ubi";

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

    public static final String COLUMNA_ID_LOG_IMP_UBI = "id_log_imp_ubi";
    public static final String COLUMNA_VERSION_LOG_IMP_UBI = "version_log_imp_ubi";
    public static final String COLUMNA_CODIGO = "codigo";
    public static final String COLUMNA_UBICACION = "ubicacion";
    public static final String COLUMNA_TIPO_UBICACION = "tipo_ubicacion";
    public static final String COLUMNA_TIPO_AREA = "tipo_area";
    public static final String COLUMNA_CODIGO_UBICACION_SUPERIOR = "codigo_ubicacion_superior";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_UBI, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_UBI, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TIPO_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TIPO_AREA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_SUPERIOR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_UBI, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_UBI, true);
        this.setColumnasInsertables(COLUMNA_CODIGO, true);
        this.setColumnasInsertables(COLUMNA_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_TIPO_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_TIPO_AREA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_SUPERIOR, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_UBI, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_UBI, true);
        this.setColumnasModificables(COLUMNA_CODIGO, true);
        this.setColumnasModificables(COLUMNA_UBICACION, true);
        this.setColumnasModificables(COLUMNA_TIPO_UBICACION, true);
        this.setColumnasModificables(COLUMNA_TIPO_AREA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_SUPERIOR, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpUbi() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_UBI);
    }
    public Long getIdLogImpUbi(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_UBI, rowKey);
    }
    public void setIdLogImpUbi(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_UBI, valor);
    }
    public void setIdLogImpUbi(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_UBI, rowKey, valor);
    }

    public Long getVersionLogImpUbi() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_UBI);
    }
    public Long getVersionLogImpUbi(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_UBI, rowKey);
    }
    public void setVersionLogImpUbi(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_UBI, valor);
    }
    public void setVersionLogImpUbi(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_UBI, rowKey, valor);
    }

    public String getCodigo() {
        return (String) super.getValue(COLUMNA_CODIGO);
    }
    public String getCodigo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO, rowKey);
    }
    public void setCodigo(String valor) {
        super.setValue(COLUMNA_CODIGO, valor);
    }
    public void setCodigo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO, rowKey, valor);
    }

    public String getUbicacion() {
        return (String) super.getValue(COLUMNA_UBICACION);
    }
    public String getUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_UBICACION, rowKey);
    }
    public void setUbicacion(String valor) {
        super.setValue(COLUMNA_UBICACION, valor);
    }
    public void setUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_UBICACION, rowKey, valor);
    }

    public String getTipoUbicacion() {
        return (String) super.getValue(COLUMNA_TIPO_UBICACION);
    }
    public String getTipoUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TIPO_UBICACION, rowKey);
    }
    public void setTipoUbicacion(String valor) {
        super.setValue(COLUMNA_TIPO_UBICACION, valor);
    }
    public void setTipoUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TIPO_UBICACION, rowKey, valor);
    }

    public String getTipoArea() {
        return (String) super.getValue(COLUMNA_TIPO_AREA);
    }
    public String getTipoArea(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TIPO_AREA, rowKey);
    }
    public void setTipoArea(String valor) {
        super.setValue(COLUMNA_TIPO_AREA, valor);
    }
    public void setTipoArea(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TIPO_AREA, rowKey, valor);
    }

    public String getCodigoUbicacionSuperior() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_SUPERIOR);
    }
    public String getCodigoUbicacionSuperior(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_SUPERIOR, rowKey);
    }
    public void setCodigoUbicacionSuperior(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_SUPERIOR, valor);
    }
    public void setCodigoUbicacionSuperior(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_SUPERIOR, rowKey, valor);
    }

    public Integer getEsImportado() {
        return (Integer) super.getValue(COLUMNA_ES_IMPORTADO);
    }
    public Integer getEsImportado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_IMPORTADO, rowKey);
    }
    public void setEsImportado(Integer valor) {
        super.setValue(COLUMNA_ES_IMPORTADO, valor);
    }
    public void setEsImportado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_IMPORTADO, rowKey, valor);
    }

    public String getObservacion() {
        return (String) super.getValue(COLUMNA_OBSERVACION);
    }
    public String getObservacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACION, rowKey);
    }
    public void setObservacion(String valor) {
        super.setValue(COLUMNA_OBSERVACION, valor);
    }
    public void setObservacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACION, rowKey, valor);
    }

    public Timestamp getFechaHoraTransaccion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_TRANSACCION);
    }
    public Timestamp getFechaHoraTransaccion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_TRANSACCION, rowKey);
    }
    public void setFechaHoraTransaccion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_TRANSACCION, valor);
    }
    public void setFechaHoraTransaccion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_TRANSACCION, rowKey, valor);
    }

    public String getNombreArchivo() {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO);
    }
    public String getNombreArchivo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO, rowKey);
    }
    public void setNombreArchivo(String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO, valor);
    }
    public void setNombreArchivo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO, rowKey, valor);
    }

    public String getCodigoArchivo() {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO);
    }
    public String getCodigoArchivo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO, rowKey);
    }
    public void setCodigoArchivo(String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO, valor);
    }
    public void setCodigoArchivo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_ubi";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_ubi";

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
        return this.getIdLogImpUbi();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpUbi(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpUbi(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpUbi(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpUbi();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpUbi(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpUbi(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpUbi(rowKey, versionRecurso);
    }
}
