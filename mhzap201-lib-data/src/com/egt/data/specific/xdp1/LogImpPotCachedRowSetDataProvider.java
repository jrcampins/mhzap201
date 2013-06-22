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

public class LogImpPotCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpPotCachedRowSetDataProvider() {
        super();
    }

    public LogImpPotCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_pot";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Potenciales Beneficiarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_pot_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_pot";

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

    public static final String COLUMNA_ID_LOG_IMP_POT = "id_log_imp_pot";
    public static final String COLUMNA_VERSION_LOG_IMP_POT = "version_log_imp_pot";
    public static final String COLUMNA_DEPARTAMENTO = "departamento";
    public static final String COLUMNA_DISTRITO = "distrito";
    public static final String COLUMNA_NOMBRES_APELLIDOS = "nombres_apellidos";
    public static final String COLUMNA_APODO = "apodo";
    public static final String COLUMNA_EDAD_A_LA_FECHA = "edad_a_la_fecha";
    public static final String COLUMNA_NACIMIENTO = "nacimiento";
    public static final String COLUMNA_CEDULA = "cedula";
    public static final String COLUMNA_TELEFONO = "telefono";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_REFERENCIA = "referencia";
    public static final String COLUMNA_BARRIO = "barrio";
    public static final String COLUMNA_NOMBRE_REFERENTE = "nombre_referente";
    public static final String COLUMNA_TELEFONO_REFERENTE = "telefono_referente";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";
    public static final String COLUMNA_ID_POTENCIAL_BEN = "id_potencial_ben";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_POT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_POT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DEPARTAMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTRITO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRES_APELLIDOS, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APODO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_EDAD_A_LA_FECHA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NACIMIENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TELEFONO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_REFERENCIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_BARRIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_REFERENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TELEFONO_REFERENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_POTENCIAL_BEN, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_POT, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_POT, true);
        this.setColumnasInsertables(COLUMNA_DEPARTAMENTO, true);
        this.setColumnasInsertables(COLUMNA_DISTRITO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRES_APELLIDOS, true);
        this.setColumnasInsertables(COLUMNA_APODO, true);
        this.setColumnasInsertables(COLUMNA_EDAD_A_LA_FECHA, true);
        this.setColumnasInsertables(COLUMNA_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_TELEFONO, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_REFERENCIA, true);
        this.setColumnasInsertables(COLUMNA_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_REFERENTE, true);
        this.setColumnasInsertables(COLUMNA_TELEFONO_REFERENTE, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_ID_POTENCIAL_BEN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_POT, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_POT, true);
        this.setColumnasModificables(COLUMNA_DEPARTAMENTO, true);
        this.setColumnasModificables(COLUMNA_DISTRITO, true);
        this.setColumnasModificables(COLUMNA_NOMBRES_APELLIDOS, true);
        this.setColumnasModificables(COLUMNA_APODO, true);
        this.setColumnasModificables(COLUMNA_EDAD_A_LA_FECHA, true);
        this.setColumnasModificables(COLUMNA_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_TELEFONO, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_REFERENCIA, true);
        this.setColumnasModificables(COLUMNA_BARRIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_REFERENTE, true);
        this.setColumnasModificables(COLUMNA_TELEFONO_REFERENTE, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_ID_POTENCIAL_BEN, true);
    }

    public Long getIdLogImpPot() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_POT);
    }
    public Long getIdLogImpPot(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_POT, rowKey);
    }
    public void setIdLogImpPot(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_POT, valor);
    }
    public void setIdLogImpPot(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_POT, rowKey, valor);
    }

    public Long getVersionLogImpPot() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_POT);
    }
    public Long getVersionLogImpPot(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_POT, rowKey);
    }
    public void setVersionLogImpPot(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_POT, valor);
    }
    public void setVersionLogImpPot(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_POT, rowKey, valor);
    }

    public String getDepartamento() {
        return (String) super.getValue(COLUMNA_DEPARTAMENTO);
    }
    public String getDepartamento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DEPARTAMENTO, rowKey);
    }
    public void setDepartamento(String valor) {
        super.setValue(COLUMNA_DEPARTAMENTO, valor);
    }
    public void setDepartamento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DEPARTAMENTO, rowKey, valor);
    }

    public String getDistrito() {
        return (String) super.getValue(COLUMNA_DISTRITO);
    }
    public String getDistrito(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DISTRITO, rowKey);
    }
    public void setDistrito(String valor) {
        super.setValue(COLUMNA_DISTRITO, valor);
    }
    public void setDistrito(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DISTRITO, rowKey, valor);
    }

    public String getNombresApellidos() {
        return (String) super.getValue(COLUMNA_NOMBRES_APELLIDOS);
    }
    public String getNombresApellidos(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRES_APELLIDOS, rowKey);
    }
    public void setNombresApellidos(String valor) {
        super.setValue(COLUMNA_NOMBRES_APELLIDOS, valor);
    }
    public void setNombresApellidos(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRES_APELLIDOS, rowKey, valor);
    }

    public String getApodo() {
        return (String) super.getValue(COLUMNA_APODO);
    }
    public String getApodo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APODO, rowKey);
    }
    public void setApodo(String valor) {
        super.setValue(COLUMNA_APODO, valor);
    }
    public void setApodo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APODO, rowKey, valor);
    }

    public String getEdadALaFecha() {
        return (String) super.getValue(COLUMNA_EDAD_A_LA_FECHA);
    }
    public String getEdadALaFecha(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_EDAD_A_LA_FECHA, rowKey);
    }
    public void setEdadALaFecha(String valor) {
        super.setValue(COLUMNA_EDAD_A_LA_FECHA, valor);
    }
    public void setEdadALaFecha(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_EDAD_A_LA_FECHA, rowKey, valor);
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

    public String getTelefono() {
        return (String) super.getValue(COLUMNA_TELEFONO);
    }
    public String getTelefono(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TELEFONO, rowKey);
    }
    public void setTelefono(String valor) {
        super.setValue(COLUMNA_TELEFONO, valor);
    }
    public void setTelefono(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TELEFONO, rowKey, valor);
    }

    public String getDireccion() {
        return (String) super.getValue(COLUMNA_DIRECCION);
    }
    public String getDireccion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DIRECCION, rowKey);
    }
    public void setDireccion(String valor) {
        super.setValue(COLUMNA_DIRECCION, valor);
    }
    public void setDireccion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DIRECCION, rowKey, valor);
    }

    public String getReferencia() {
        return (String) super.getValue(COLUMNA_REFERENCIA);
    }
    public String getReferencia(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_REFERENCIA, rowKey);
    }
    public void setReferencia(String valor) {
        super.setValue(COLUMNA_REFERENCIA, valor);
    }
    public void setReferencia(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_REFERENCIA, rowKey, valor);
    }

    public String getBarrio() {
        return (String) super.getValue(COLUMNA_BARRIO);
    }
    public String getBarrio(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_BARRIO, rowKey);
    }
    public void setBarrio(String valor) {
        super.setValue(COLUMNA_BARRIO, valor);
    }
    public void setBarrio(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_BARRIO, rowKey, valor);
    }

    public String getNombreReferente() {
        return (String) super.getValue(COLUMNA_NOMBRE_REFERENTE);
    }
    public String getNombreReferente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_REFERENTE, rowKey);
    }
    public void setNombreReferente(String valor) {
        super.setValue(COLUMNA_NOMBRE_REFERENTE, valor);
    }
    public void setNombreReferente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_REFERENTE, rowKey, valor);
    }

    public String getTelefonoReferente() {
        return (String) super.getValue(COLUMNA_TELEFONO_REFERENTE);
    }
    public String getTelefonoReferente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TELEFONO_REFERENTE, rowKey);
    }
    public void setTelefonoReferente(String valor) {
        super.setValue(COLUMNA_TELEFONO_REFERENTE, valor);
    }
    public void setTelefonoReferente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TELEFONO_REFERENTE, rowKey, valor);
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

    public Long getIdPotencialBen() {
        return (Long) super.getValue(COLUMNA_ID_POTENCIAL_BEN);
    }
    public Long getIdPotencialBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_POTENCIAL_BEN, rowKey);
    }
    public void setIdPotencialBen(Long valor) {
        super.setValue(COLUMNA_ID_POTENCIAL_BEN, valor);
    }
    public void setIdPotencialBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_POTENCIAL_BEN, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_pot";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_pot";

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
        return this.getIdLogImpPot();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpPot(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpPot(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpPot(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpPot();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpPot(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpPot(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpPot(rowKey, versionRecurso);
    }
}
