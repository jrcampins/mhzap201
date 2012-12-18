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

public class LogImpJubCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpJubCachedRowSetDataProvider() {
        super();
    }

    public LogImpJubCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_jub";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Jubilados y Pensionados";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_jub_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_jub";

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

    public static final String COLUMNA_ID_LOG_IMP_JUB = "id_log_imp_jub";
    public static final String COLUMNA_VERSION_LOG_IMP_JUB = "version_log_imp_jub";
    public static final String COLUMNA_CEDULA = "cedula";
    public static final String COLUMNA_PRIMER_NOMBRE = "primer_nombre";
    public static final String COLUMNA_SEGUNDO_NOMBRE = "segundo_nombre";
    public static final String COLUMNA_PRIMER_APELLIDO = "primer_apellido";
    public static final String COLUMNA_SEGUNDO_APELLIDO = "segundo_apellido";
    public static final String COLUMNA_APELLIDO_CASADA = "apellido_casada";
    public static final String COLUMNA_TIPO_REGISTRO = "tipo_registro";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_JUB, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_JUB, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APELLIDO_CASADA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TIPO_REGISTRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_JUB, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_JUB, true);
        this.setColumnasInsertables(COLUMNA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasInsertables(COLUMNA_TIPO_REGISTRO, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_JUB, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_JUB, true);
        this.setColumnasModificables(COLUMNA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasModificables(COLUMNA_TIPO_REGISTRO, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpJub() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_JUB);
    }
    public Long getIdLogImpJub(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_JUB, rowKey);
    }
    public void setIdLogImpJub(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_JUB, valor);
    }
    public void setIdLogImpJub(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_JUB, rowKey, valor);
    }

    public Long getVersionLogImpJub() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_JUB);
    }
    public Long getVersionLogImpJub(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_JUB, rowKey);
    }
    public void setVersionLogImpJub(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_JUB, valor);
    }
    public void setVersionLogImpJub(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_JUB, rowKey, valor);
    }

    public String getCedula() {
        return (String) super.getValue(COLUMNA_CEDULA);
    }
    public String getCedula(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CEDULA, rowKey);
    }
    public void setCedula(String valor) {
        super.setValue(COLUMNA_CEDULA, valor);
    }
    public void setCedula(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CEDULA, rowKey, valor);
    }

    public String getPrimerNombre() {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE);
    }
    public String getPrimerNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE, rowKey);
    }
    public void setPrimerNombre(String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, valor);
    }
    public void setPrimerNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, rowKey, valor);
    }

    public String getSegundoNombre() {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE);
    }
    public String getSegundoNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE, rowKey);
    }
    public void setSegundoNombre(String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, valor);
    }
    public void setSegundoNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, rowKey, valor);
    }

    public String getPrimerApellido() {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO);
    }
    public String getPrimerApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO, rowKey);
    }
    public void setPrimerApellido(String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, valor);
    }
    public void setPrimerApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, rowKey, valor);
    }

    public String getSegundoApellido() {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO);
    }
    public String getSegundoApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO, rowKey);
    }
    public void setSegundoApellido(String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, valor);
    }
    public void setSegundoApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, rowKey, valor);
    }

    public String getApellidoCasada() {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA);
    }
    public String getApellidoCasada(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA, rowKey);
    }
    public void setApellidoCasada(String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, valor);
    }
    public void setApellidoCasada(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, rowKey, valor);
    }

    public String getTipoRegistro() {
        return (String) super.getValue(COLUMNA_TIPO_REGISTRO);
    }
    public String getTipoRegistro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TIPO_REGISTRO, rowKey);
    }
    public void setTipoRegistro(String valor) {
        super.setValue(COLUMNA_TIPO_REGISTRO, valor);
    }
    public void setTipoRegistro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TIPO_REGISTRO, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_jub";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_jub";

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
        return this.getIdLogImpJub();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpJub(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpJub(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpJub(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpJub();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpJub(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpJub(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpJub(rowKey, versionRecurso);
    }
}
