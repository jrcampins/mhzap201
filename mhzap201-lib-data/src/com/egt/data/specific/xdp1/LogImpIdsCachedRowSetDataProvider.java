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

public class LogImpIdsCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpIdsCachedRowSetDataProvider() {
        super();
    }

    public LogImpIdsCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_ids";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Identificaciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_ids_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_ids";

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

    public static final String COLUMNA_ID_LOG_IMP_IDS = "id_log_imp_ids";
    public static final String COLUMNA_VERSION_LOG_IMP_IDS = "version_log_imp_ids";
    public static final String COLUMNA_CEDULA = "cedula";
    public static final String COLUMNA_LETRA_CEDULA = "letra_cedula";
    public static final String COLUMNA_APELLIDOS = "apellidos";
    public static final String COLUMNA_NOMBRES = "nombres";
    public static final String COLUMNA_NACIMIENTO = "nacimiento";
    public static final String COLUMNA_SEXO = "sexo";
    public static final String COLUMNA_NACIONALIDAD = "nacionalidad";
    public static final String COLUMNA_ESTADO_CIVIL = "estado_civil";
    public static final String COLUMNA_LUGAR_NACIMIENTO = "lugar_nacimiento";
    public static final String COLUMNA_INDIGENA = "indigena";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";
    public static final String COLUMNA_ID_PERSONA = "id_persona";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_IDS, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_IDS, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APELLIDOS, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NACIMIENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEXO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NACIONALIDAD, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ESTADO_CIVIL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LUGAR_NACIMIENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_INDIGENA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_IDS, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_IDS, true);
        this.setColumnasInsertables(COLUMNA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_APELLIDOS, true);
        this.setColumnasInsertables(COLUMNA_NOMBRES, true);
        this.setColumnasInsertables(COLUMNA_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_SEXO, true);
        this.setColumnasInsertables(COLUMNA_NACIONALIDAD, true);
        this.setColumnasInsertables(COLUMNA_ESTADO_CIVIL, true);
        this.setColumnasInsertables(COLUMNA_LUGAR_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_IDS, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_IDS, true);
        this.setColumnasModificables(COLUMNA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_APELLIDOS, true);
        this.setColumnasModificables(COLUMNA_NOMBRES, true);
        this.setColumnasModificables(COLUMNA_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_SEXO, true);
        this.setColumnasModificables(COLUMNA_NACIONALIDAD, true);
        this.setColumnasModificables(COLUMNA_ESTADO_CIVIL, true);
        this.setColumnasModificables(COLUMNA_LUGAR_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
    }

    public Long getIdLogImpIds() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_IDS);
    }
    public Long getIdLogImpIds(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_IDS, rowKey);
    }
    public void setIdLogImpIds(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_IDS, valor);
    }
    public void setIdLogImpIds(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_IDS, rowKey, valor);
    }

    public Long getVersionLogImpIds() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_IDS);
    }
    public Long getVersionLogImpIds(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_IDS, rowKey);
    }
    public void setVersionLogImpIds(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_IDS, valor);
    }
    public void setVersionLogImpIds(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_IDS, rowKey, valor);
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

    public String getLetraCedula() {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA);
    }
    public String getLetraCedula(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA, rowKey);
    }
    public void setLetraCedula(String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, valor);
    }
    public void setLetraCedula(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, rowKey, valor);
    }

    public String getApellidos() {
        return (String) super.getValue(COLUMNA_APELLIDOS);
    }
    public String getApellidos(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APELLIDOS, rowKey);
    }
    public void setApellidos(String valor) {
        super.setValue(COLUMNA_APELLIDOS, valor);
    }
    public void setApellidos(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APELLIDOS, rowKey, valor);
    }

    public String getNombres() {
        return (String) super.getValue(COLUMNA_NOMBRES);
    }
    public String getNombres(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRES, rowKey);
    }
    public void setNombres(String valor) {
        super.setValue(COLUMNA_NOMBRES, valor);
    }
    public void setNombres(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRES, rowKey, valor);
    }

    public String getNacimiento() {
        return (String) super.getValue(COLUMNA_NACIMIENTO);
    }
    public String getNacimiento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NACIMIENTO, rowKey);
    }
    public void setNacimiento(String valor) {
        super.setValue(COLUMNA_NACIMIENTO, valor);
    }
    public void setNacimiento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NACIMIENTO, rowKey, valor);
    }

    public String getSexo() {
        return (String) super.getValue(COLUMNA_SEXO);
    }
    public String getSexo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEXO, rowKey);
    }
    public void setSexo(String valor) {
        super.setValue(COLUMNA_SEXO, valor);
    }
    public void setSexo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEXO, rowKey, valor);
    }

    public String getNacionalidad() {
        return (String) super.getValue(COLUMNA_NACIONALIDAD);
    }
    public String getNacionalidad(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NACIONALIDAD, rowKey);
    }
    public void setNacionalidad(String valor) {
        super.setValue(COLUMNA_NACIONALIDAD, valor);
    }
    public void setNacionalidad(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NACIONALIDAD, rowKey, valor);
    }

    public String getEstadoCivil() {
        return (String) super.getValue(COLUMNA_ESTADO_CIVIL);
    }
    public String getEstadoCivil(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ESTADO_CIVIL, rowKey);
    }
    public void setEstadoCivil(String valor) {
        super.setValue(COLUMNA_ESTADO_CIVIL, valor);
    }
    public void setEstadoCivil(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ESTADO_CIVIL, rowKey, valor);
    }

    public String getLugarNacimiento() {
        return (String) super.getValue(COLUMNA_LUGAR_NACIMIENTO);
    }
    public String getLugarNacimiento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LUGAR_NACIMIENTO, rowKey);
    }
    public void setLugarNacimiento(String valor) {
        super.setValue(COLUMNA_LUGAR_NACIMIENTO, valor);
    }
    public void setLugarNacimiento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LUGAR_NACIMIENTO, rowKey, valor);
    }

    public String getIndigena() {
        return (String) super.getValue(COLUMNA_INDIGENA);
    }
    public String getIndigena(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_INDIGENA, rowKey);
    }
    public void setIndigena(String valor) {
        super.setValue(COLUMNA_INDIGENA, valor);
    }
    public void setIndigena(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_INDIGENA, rowKey, valor);
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

    public Long getIdPersona() {
        return (Long) super.getValue(COLUMNA_ID_PERSONA);
    }
    public Long getIdPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PERSONA, rowKey);
    }
    public void setIdPersona(Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, valor);
    }
    public void setIdPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_ids";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_ids";

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
        return this.getIdLogImpIds();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpIds(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpIds(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpIds(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpIds();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpIds(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpIds(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpIds(rowKey, versionRecurso);
    }
}
