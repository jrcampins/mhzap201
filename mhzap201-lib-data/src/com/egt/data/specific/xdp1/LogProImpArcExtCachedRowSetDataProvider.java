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

public class LogProImpArcExtCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogProImpArcExtCachedRowSetDataProvider() {
        super();
    }

    public LogProImpArcExtCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_pro_imp_arc_ext";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Archivos Externos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_pro_imp_arc_ext_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_pro_imp_arc_ext";

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

    public static final String COLUMNA_ID_LOG_PRO_IMP_ARC_EXT = "id_log_pro_imp_arc_ext";
    public static final String COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT = "version_log_pro_imp_arc_ext";
    public static final String COLUMNA_ID_ARCHIVO_DATOS_EXT = "id_archivo_datos_ext";
    public static final String COLUMNA_CODIGO_TIPO_ARC_DAT_EXT = "codigo_tipo_arc_dat_ext";
    public static final String COLUMNA_NUMERO_TIPO_ARC_DAT_EXT = "numero_tipo_arc_dat_ext";
    public static final String COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT = "nombre_proveedor_dat_ext";
    public static final String COLUMNA_CODIGO_PROVEEDOR_DAT_EXT = "codigo_proveedor_dat_ext";
    public static final String COLUMNA_CODIGO_ARCHIVO_DATOS_EXT = "codigo_archivo_datos_ext";
    public static final String COLUMNA_RUTA_ARCHIVO_DATOS_EXT = "ruta_archivo_datos_ext";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ARCHIVO_DATOS_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, true);
        this.setColumnasInsertables(COLUMNA_ID_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, true);
        this.setColumnasModificables(COLUMNA_ID_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    public Long getIdLogProImpArcExt() {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT);
    }
    public Long getIdLogProImpArcExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, rowKey);
    }
    public void setIdLogProImpArcExt(Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, valor);
    }
    public void setIdLogProImpArcExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_IMP_ARC_EXT, rowKey, valor);
    }

    public Long getVersionLogProImpArcExt() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT);
    }
    public Long getVersionLogProImpArcExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, rowKey);
    }
    public void setVersionLogProImpArcExt(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, valor);
    }
    public void setVersionLogProImpArcExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_IMP_ARC_EXT, rowKey, valor);
    }

    public Long getIdArchivoDatosExt() {
        return (Long) super.getValue(COLUMNA_ID_ARCHIVO_DATOS_EXT);
    }
    public Long getIdArchivoDatosExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setIdArchivoDatosExt(Long valor) {
        super.setValue(COLUMNA_ID_ARCHIVO_DATOS_EXT, valor);
    }
    public void setIdArchivoDatosExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ARCHIVO_DATOS_EXT, rowKey, valor);
    }

    public String getCodigoTipoArcDatExt() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT);
    }
    public String getCodigoTipoArcDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, rowKey);
    }
    public void setCodigoTipoArcDatExt(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, valor);
    }
    public void setCodigoTipoArcDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, rowKey, valor);
    }

    public Integer getNumeroTipoArcDatExt() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT);
    }
    public Integer getNumeroTipoArcDatExt(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, rowKey);
    }
    public void setNumeroTipoArcDatExt(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, valor);
    }
    public void setNumeroTipoArcDatExt(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, rowKey, valor);
    }

    public String getNombreProveedorDatExt() {
        return (String) super.getValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT);
    }
    public String getNombreProveedorDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setNombreProveedorDatExt(String valor) {
        super.setValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, valor);
    }
    public void setNombreProveedorDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public String getCodigoProveedorDatExt() {
        return (String) super.getValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT);
    }
    public String getCodigoProveedorDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setCodigoProveedorDatExt(String valor) {
        super.setValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, valor);
    }
    public void setCodigoProveedorDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public String getCodigoArchivoDatosExt() {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT);
    }
    public String getCodigoArchivoDatosExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setCodigoArchivoDatosExt(String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, valor);
    }
    public void setCodigoArchivoDatosExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, rowKey, valor);
    }

    public String getRutaArchivoDatosExt() {
        return (String) super.getValue(COLUMNA_RUTA_ARCHIVO_DATOS_EXT);
    }
    public String getRutaArchivoDatosExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setRutaArchivoDatosExt(String valor) {
        super.setValue(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, valor);
    }
    public void setRutaArchivoDatosExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_RUTA_ARCHIVO_DATOS_EXT, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_pro_imp_arc_ext";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_pro_imp_arc_ext";

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
        return this.getIdLogProImpArcExt();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogProImpArcExt(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogProImpArcExt(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogProImpArcExt(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogProImpArcExt();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogProImpArcExt(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogProImpArcExt(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogProImpArcExt(rowKey, versionRecurso);
    }
}
