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

public class LogImpCenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpCenCachedRowSetDataProvider() {
        super();
    }

    public LogImpCenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_cen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Censos Validados";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_cen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_cen";

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

    public static final String COLUMNA_ID_LOG_IMP_CEN = "id_log_imp_cen";
    public static final String COLUMNA_VERSION_LOG_IMP_CEN = "version_log_imp_cen";
    public static final String COLUMNA_ORDEN = "orden";
    public static final String COLUMNA_BARRIO = "barrio";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_TELEFONO = "telefono";
    public static final String COLUMNA_PRIMER_NOMBRE = "primer_nombre";
    public static final String COLUMNA_SEGUNDO_NOMBRE = "segundo_nombre";
    public static final String COLUMNA_PRIMER_APELLIDO = "primer_apellido";
    public static final String COLUMNA_SEGUNDO_APELLIDO = "segundo_apellido";
    public static final String COLUMNA_EDAD_A_LA_FECHA = "edad_a_la_fecha";
    public static final String COLUMNA_SEXO = "sexo";
    public static final String COLUMNA_PARENTESCO = "parentesco";
    public static final String COLUMNA_CEDULA = "cedula";
    public static final String COLUMNA_NOMBRE_JEFE_HOGAR = "nombre_jefe_hogar";
    public static final String COLUMNA_CEDULA_JEFE_HOGAR = "cedula_jefe_hogar";
    public static final String COLUMNA_ICV = "icv";
    public static final String COLUMNA_VALIDADO = "validado";
    public static final String COLUMNA_OBSERVACIONES = "observaciones";
    public static final String COLUMNA_FUNCIONARIO = "funcionario";
    public static final String COLUMNA_CAUSA_INVALIDACION = "causa_invalidacion";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_CEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_CEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_BARRIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TELEFONO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_EDAD_A_LA_FECHA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEXO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PARENTESCO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_JEFE_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULA_JEFE_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ICV, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALIDADO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FUNCIONARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CAUSA_INVALIDACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_CEN, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_CEN, true);
        this.setColumnasInsertables(COLUMNA_ORDEN, true);
        this.setColumnasInsertables(COLUMNA_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_TELEFONO, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_EDAD_A_LA_FECHA, true);
        this.setColumnasInsertables(COLUMNA_SEXO, true);
        this.setColumnasInsertables(COLUMNA_PARENTESCO, true);
        this.setColumnasInsertables(COLUMNA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_CEDULA_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_ICV, true);
        this.setColumnasInsertables(COLUMNA_VALIDADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasInsertables(COLUMNA_FUNCIONARIO, true);
        this.setColumnasInsertables(COLUMNA_CAUSA_INVALIDACION, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_CEN, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_CEN, true);
        this.setColumnasModificables(COLUMNA_ORDEN, true);
        this.setColumnasModificables(COLUMNA_BARRIO, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_TELEFONO, true);
        this.setColumnasModificables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_EDAD_A_LA_FECHA, true);
        this.setColumnasModificables(COLUMNA_SEXO, true);
        this.setColumnasModificables(COLUMNA_PARENTESCO, true);
        this.setColumnasModificables(COLUMNA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_CEDULA_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_ICV, true);
        this.setColumnasModificables(COLUMNA_VALIDADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasModificables(COLUMNA_FUNCIONARIO, true);
        this.setColumnasModificables(COLUMNA_CAUSA_INVALIDACION, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpCen() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_CEN);
    }
    public Long getIdLogImpCen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_CEN, rowKey);
    }
    public void setIdLogImpCen(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_CEN, valor);
    }
    public void setIdLogImpCen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_CEN, rowKey, valor);
    }

    public Long getVersionLogImpCen() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_CEN);
    }
    public Long getVersionLogImpCen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_CEN, rowKey);
    }
    public void setVersionLogImpCen(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_CEN, valor);
    }
    public void setVersionLogImpCen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_CEN, rowKey, valor);
    }

    public String getOrden() {
        return (String) super.getValue(COLUMNA_ORDEN);
    }
    public String getOrden(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ORDEN, rowKey);
    }
    public void setOrden(String valor) {
        super.setValue(COLUMNA_ORDEN, valor);
    }
    public void setOrden(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ORDEN, rowKey, valor);
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

    public String getParentesco() {
        return (String) super.getValue(COLUMNA_PARENTESCO);
    }
    public String getParentesco(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PARENTESCO, rowKey);
    }
    public void setParentesco(String valor) {
        super.setValue(COLUMNA_PARENTESCO, valor);
    }
    public void setParentesco(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PARENTESCO, rowKey, valor);
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

    public String getNombreJefeHogar() {
        return (String) super.getValue(COLUMNA_NOMBRE_JEFE_HOGAR);
    }
    public String getNombreJefeHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_JEFE_HOGAR, rowKey);
    }
    public void setNombreJefeHogar(String valor) {
        super.setValue(COLUMNA_NOMBRE_JEFE_HOGAR, valor);
    }
    public void setNombreJefeHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_JEFE_HOGAR, rowKey, valor);
    }

    public String getCedulaJefeHogar() {
        return (String) super.getValue(COLUMNA_CEDULA_JEFE_HOGAR);
    }
    public String getCedulaJefeHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CEDULA_JEFE_HOGAR, rowKey);
    }
    public void setCedulaJefeHogar(String valor) {
        super.setValue(COLUMNA_CEDULA_JEFE_HOGAR, valor);
    }
    public void setCedulaJefeHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CEDULA_JEFE_HOGAR, rowKey, valor);
    }

    public String getIcv() {
        return (String) super.getValue(COLUMNA_ICV);
    }
    public String getIcv(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ICV, rowKey);
    }
    public void setIcv(String valor) {
        super.setValue(COLUMNA_ICV, valor);
    }
    public void setIcv(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ICV, rowKey, valor);
    }

    public String getValidado() {
        return (String) super.getValue(COLUMNA_VALIDADO);
    }
    public String getValidado(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALIDADO, rowKey);
    }
    public void setValidado(String valor) {
        super.setValue(COLUMNA_VALIDADO, valor);
    }
    public void setValidado(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALIDADO, rowKey, valor);
    }

    public String getObservaciones() {
        return (String) super.getValue(COLUMNA_OBSERVACIONES);
    }
    public String getObservaciones(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACIONES, rowKey);
    }
    public void setObservaciones(String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, valor);
    }
    public void setObservaciones(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, rowKey, valor);
    }

    public String getFuncionario() {
        return (String) super.getValue(COLUMNA_FUNCIONARIO);
    }
    public String getFuncionario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_FUNCIONARIO, rowKey);
    }
    public void setFuncionario(String valor) {
        super.setValue(COLUMNA_FUNCIONARIO, valor);
    }
    public void setFuncionario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_FUNCIONARIO, rowKey, valor);
    }

    public String getCausaInvalidacion() {
        return (String) super.getValue(COLUMNA_CAUSA_INVALIDACION);
    }
    public String getCausaInvalidacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CAUSA_INVALIDACION, rowKey);
    }
    public void setCausaInvalidacion(String valor) {
        super.setValue(COLUMNA_CAUSA_INVALIDACION, valor);
    }
    public void setCausaInvalidacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CAUSA_INVALIDACION, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_cen";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_cen";

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
        return this.getIdLogImpCen();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpCen(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpCen(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpCen(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpCen();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpCen(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpCen(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpCen(rowKey, versionRecurso);
    }
}
