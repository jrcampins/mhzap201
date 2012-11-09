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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.egt.core.db.xdp.RecursoSegmentableDataProvider;
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class ArchivoDatosExtCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoSegmentableDataProvider, RecursoDesactivableDataProvider {

    public ArchivoDatosExtCachedRowSetDataProvider() {
        super();
    }

    public ArchivoDatosExtCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "archivo_datos_ext";
    public static final String NOMBRE_DOMINIO_RECURSO = "Archivos de Datos Externos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_archivo_datos_ext_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "archivo_datos_ext";

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

    public static final String COLUMNA_ID_ARCHIVO_DATOS_EXT = "id_archivo_datos_ext";
    public static final String COLUMNA_VERSION_ARCHIVO_DATOS_EXT = "version_archivo_datos_ext";
    public static final String COLUMNA_CODIGO_ARCHIVO_DATOS_EXT = "codigo_archivo_datos_ext";
    public static final String COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT = "nombre_archivo_datos_ext";
    public static final String COLUMNA_ID_PROVEEDOR_DAT_EXT = "id_proveedor_dat_ext";
    public static final String COLUMNA_NUMERO_TIPO_ARC_DAT_EXT = "numero_tipo_arc_dat_ext";
    public static final String COLUMNA_OBJETO_ARCHIVO_DATOS_EXT = "objeto_archivo_datos_ext";
    public static final String COLUMNA_BYTES_ARCHIVO_DATOS_EXT = "bytes_archivo_datos_ext";
    public static final String COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO = "es_archivo_datos_ext_importado";
    public static final String COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO = "es_archivo_datos_ext_inactivo";
    public static final String COLUMNA_FECHA_HORA_ULTIMA_CARGA = "fecha_hora_ultima_carga";
    public static final String COLUMNA_ID_USUARIO_ULTIMA_CARGA = "id_usuario_ultima_carga";
    public static final String COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION = "fecha_hora_ultima_importacion";
    public static final String COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION = "id_usuario_ultima_importacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ARCHIVO_DATOS_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROVEEDOR_DAT_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_ULTIMA_CARGA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO_ULTIMA_CARGA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, true);
        this.setColumnasInsertables(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_ULTIMA_CARGA, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO_ULTIMA_CARGA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, true);
        this.setColumnasModificables(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_ULTIMA_CARGA, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO_ULTIMA_CARGA, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, true);
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

    public Long getVersionArchivoDatosExt() {
        return (Long) super.getValue(COLUMNA_VERSION_ARCHIVO_DATOS_EXT);
    }
    public Long getVersionArchivoDatosExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setVersionArchivoDatosExt(Long valor) {
        super.setValue(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, valor);
    }
    public void setVersionArchivoDatosExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ARCHIVO_DATOS_EXT, rowKey, valor);
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

    public String getNombreArchivoDatosExt() {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT);
    }
    public String getNombreArchivoDatosExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setNombreArchivoDatosExt(String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, valor);
    }
    public void setNombreArchivoDatosExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO_DATOS_EXT, rowKey, valor);
    }

    public Long getIdProveedorDatExt() {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT);
    }
    public Long getIdProveedorDatExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setIdProveedorDatExt(Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, valor);
    }
    public void setIdProveedorDatExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey, valor);
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

    public String getObjetoArchivoDatosExt() {
        return (String) super.getValue(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT);
    }
    public String getObjetoArchivoDatosExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setObjetoArchivoDatosExt(String valor) {
        super.setValue(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, valor);
    }
    public void setObjetoArchivoDatosExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBJETO_ARCHIVO_DATOS_EXT, rowKey, valor);
    }

    public Integer getBytesArchivoDatosExt() {
        return (Integer) super.getValue(COLUMNA_BYTES_ARCHIVO_DATOS_EXT);
    }
    public Integer getBytesArchivoDatosExt(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, rowKey);
    }
    public void setBytesArchivoDatosExt(Integer valor) {
        super.setValue(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, valor);
    }
    public void setBytesArchivoDatosExt(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_BYTES_ARCHIVO_DATOS_EXT, rowKey, valor);
    }

    public Integer getEsArchivoDatosExtImportado() {
        return (Integer) super.getValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO);
    }
    public Integer getEsArchivoDatosExtImportado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, rowKey);
    }
    public void setEsArchivoDatosExtImportado(Integer valor) {
        super.setValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, valor);
    }
    public void setEsArchivoDatosExtImportado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_IMPORTADO, rowKey, valor);
    }

    public Integer getEsArchivoDatosExtInactivo() {
        return (Integer) super.getValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO);
    }
    public Integer getEsArchivoDatosExtInactivo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, rowKey);
    }
    public void setEsArchivoDatosExtInactivo(Integer valor) {
        super.setValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, valor);
    }
    public void setEsArchivoDatosExtInactivo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_ARCHIVO_DATOS_EXT_INACTIVO, rowKey, valor);
    }

    public Timestamp getFechaHoraUltimaCarga() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULTIMA_CARGA);
    }
    public Timestamp getFechaHoraUltimaCarga(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULTIMA_CARGA, rowKey);
    }
    public void setFechaHoraUltimaCarga(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULTIMA_CARGA, valor);
    }
    public void setFechaHoraUltimaCarga(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULTIMA_CARGA, rowKey, valor);
    }

    public Long getIdUsuarioUltimaCarga() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_ULTIMA_CARGA);
    }
    public Long getIdUsuarioUltimaCarga(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_ULTIMA_CARGA, rowKey);
    }
    public void setIdUsuarioUltimaCarga(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_ULTIMA_CARGA, valor);
    }
    public void setIdUsuarioUltimaCarga(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_ULTIMA_CARGA, rowKey, valor);
    }

    public Timestamp getFechaHoraUltimaImportacion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION);
    }
    public Timestamp getFechaHoraUltimaImportacion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, rowKey);
    }
    public void setFechaHoraUltimaImportacion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, valor);
    }
    public void setFechaHoraUltimaImportacion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULTIMA_IMPORTACION, rowKey, valor);
    }

    public Long getIdUsuarioUltimaImportacion() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION);
    }
    public Long getIdUsuarioUltimaImportacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, rowKey);
    }
    public void setIdUsuarioUltimaImportacion(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, valor);
    }
    public void setIdUsuarioUltimaImportacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_archivo_datos_ext";
    public static final String COLUMNA_VERSION_RECURSO = "version_archivo_datos_ext";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_archivo_datos_ext";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_archivo_datos_ext";
    public static final String COLUMNA_SEGMENTO_RECURSO = "id_proveedor_dat_ext";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_archivo_datos_ext_inactivo";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_SEGMENTO_RECURSO = "Proveedor Datos Externos";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Archivo Datos Externos Inactivo";

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
    public String getColumnaSegmentoRecurso() {
        return COLUMNA_SEGMENTO_RECURSO;
    }
    @Override
    public String getColumnaEsRecursoInactivo() {
        return COLUMNA_ES_RECURSO_INACTIVO;
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
    public String getEtiquetaSegmentoRecurso() {
        return ETIQUETA_SEGMENTO_RECURSO;
    }
    @Override
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdArchivoDatosExt();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdArchivoDatosExt(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdArchivoDatosExt(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdArchivoDatosExt(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionArchivoDatosExt();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionArchivoDatosExt(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionArchivoDatosExt(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionArchivoDatosExt(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoArchivoDatosExt();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoArchivoDatosExt(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoArchivoDatosExt(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoArchivoDatosExt(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreArchivoDatosExt();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreArchivoDatosExt(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreArchivoDatosExt(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreArchivoDatosExt(rowKey, nombreRecurso);
    }

    @Override
    public Long getSegmentoRecurso() {
        return this.getIdProveedorDatExt();
    }
    @Override
    public Long getSegmentoRecurso(RowKey rowKey) {
        return this.getIdProveedorDatExt(rowKey);
    }
    @Override
    public void setSegmentoRecurso(Long segmentoRecurso) {
        this.setIdProveedorDatExt(segmentoRecurso);
    }
    @Override
    public void setSegmentoRecurso(RowKey rowKey, Long segmentoRecurso) {
        this.setIdProveedorDatExt(rowKey, segmentoRecurso);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsArchivoDatosExtInactivo();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsArchivoDatosExtInactivo(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsArchivoDatosExtInactivo(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsArchivoDatosExtInactivo(rowKey, esRecursoInactivo);
    }
}
