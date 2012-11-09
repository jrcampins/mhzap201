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
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.egt.core.db.xdp.RecursoJerarquizableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class RelacionRastroProcesoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoPersonalizableDataProvider, RecursoJerarquizableDataProvider {

    public RelacionRastroProcesoCachedRowSetDataProvider() {
        super();
    }

    public RelacionRastroProcesoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "relacion_rastro_proceso";
    public static final String NOMBRE_DOMINIO_RECURSO = "Ejecucion de Procesos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM relacion_rastro_proceso ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rastro_proceso";

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

    public static final String COLUMNA_ID_RASTRO_PROCESO = "id_rastro_proceso";
    public static final String COLUMNA_VERSION_RASTRO_PROCESO = "version_rastro_proceso";
    public static final String COLUMNA_FECHA_HORA_INICIO_EJECUCION = "fecha_hora_inicio_ejecucion";
    public static final String COLUMNA_FECHA_HORA_FIN_EJECUCION = "fecha_hora_fin_ejecucion";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_NUMERO_CONDICION_EJE_FUN = "numero_condicion_eje_fun";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_DESCRIPCION_ERROR = "descripcion_error";
    public static final String COLUMNA_ID_GRUPO_PROCESO = "id_grupo_proceso";
    public static final String COLUMNA_ID_RASTRO_PROCESO_SUPERIOR = "id_rastro_proceso_superior";
    public static final String COLUMNA_SUBPROCESOS = "subprocesos";
    public static final String COLUMNA_SUBPROCESOS_PENDIENTES = "subprocesos_pendientes";
    public static final String COLUMNA_SUBPROCESOS_EN_PROGRESO = "subprocesos_en_progreso";
    public static final String COLUMNA_SUBPROCESOS_SIN_ERRORES = "subprocesos_sin_errores";
    public static final String COLUMNA_SUBPROCESOS_CON_ERRORES = "subprocesos_con_errores";
    public static final String COLUMNA_SUBPROCESOS_CANCELADOS = "subprocesos_cancelados";
    public static final String COLUMNA_PROCEDIMIENTO_AFTER_UPDATE = "procedimiento_after_update";
    public static final String COLUMNA_CODIGO_USUARIO = "codigo_usuario";
    public static final String COLUMNA_NOMBRE_USUARIO = "nombre_usuario";
    public static final String COLUMNA_ES_SUPER_USUARIO = "es_super_usuario";
    public static final String COLUMNA_CODIGO_FUNCION = "codigo_funcion";
    public static final String COLUMNA_NOMBRE_FUNCION = "nombre_funcion";
    public static final String COLUMNA_NUMERO_TIPO_FUNCION = "numero_tipo_funcion";
    public static final String COLUMNA_ES_PUBLICA = "es_publica";
    public static final String COLUMNA_ES_PROGRAMATICA = "es_programatica";
    public static final String COLUMNA_ES_PERSONALIZADA = "es_personalizada";
    public static final String COLUMNA_ES_SEGMENTADA = "es_segmentada";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_CODIGO_CLASE_RECURSO = "codigo_clase_recurso";
    public static final String COLUMNA_NOMBRE_CLASE_RECURSO = "nombre_clase_recurso";
    public static final String COLUMNA_CODIGO_CONDICION_EJE_FUN = "codigo_condicion_eje_fun";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_RASTRO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_INICIO_EJECUCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_FIN_EJECUCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_EJE_FUN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_ERROR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_PROCESO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS_PENDIENTES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS_EN_PROGRESO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS_SIN_ERRORES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS_CON_ERRORES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SUBPROCESOS_CANCELADOS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_SUPER_USUARIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_FUNCION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PUBLICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PROGRAMATICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONALIZADA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_SEGMENTADA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CLASE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_CLASE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONDICION_EJE_FUN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_RASTRO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_INICIO_EJECUCION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_FIN_EJECUCION, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ERROR, true);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_PROCESO, true);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS_PENDIENTES, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS_EN_PROGRESO, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS_SIN_ERRORES, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS_CON_ERRORES, true);
        this.setColumnasInsertables(COLUMNA_SUBPROCESOS_CANCELADOS, true);
        this.setColumnasInsertables(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_ES_SUPER_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_CODIGO_FUNCION, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FUNCION, false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_FUNCION, false);
        this.setColumnasInsertables(COLUMNA_ES_PUBLICA, false);
        this.setColumnasInsertables(COLUMNA_ES_PROGRAMATICA, false);
        this.setColumnasInsertables(COLUMNA_ES_PERSONALIZADA, false);
        this.setColumnasInsertables(COLUMNA_ES_SEGMENTADA, false);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_CODIGO_CLASE_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_CLASE_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONDICION_EJE_FUN, false);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_VERSION_RASTRO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_INICIO_EJECUCION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_FIN_EJECUCION, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ERROR, true);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_PROCESO, true);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS_PENDIENTES, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS_EN_PROGRESO, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS_SIN_ERRORES, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS_CON_ERRORES, true);
        this.setColumnasModificables(COLUMNA_SUBPROCESOS_CANCELADOS, true);
        this.setColumnasModificables(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, true);
        this.setColumnasModificables(COLUMNA_CODIGO_USUARIO, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_USUARIO, false);
        this.setColumnasModificables(COLUMNA_ES_SUPER_USUARIO, false);
        this.setColumnasModificables(COLUMNA_CODIGO_FUNCION, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_FUNCION, false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_FUNCION, false);
        this.setColumnasModificables(COLUMNA_ES_PUBLICA, false);
        this.setColumnasModificables(COLUMNA_ES_PROGRAMATICA, false);
        this.setColumnasModificables(COLUMNA_ES_PERSONALIZADA, false);
        this.setColumnasModificables(COLUMNA_ES_SEGMENTADA, false);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, false);
        this.setColumnasModificables(COLUMNA_CODIGO_CLASE_RECURSO, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_CLASE_RECURSO, false);
        this.setColumnasModificables(COLUMNA_CODIGO_CONDICION_EJE_FUN, false);
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

    public Long getVersionRastroProceso() {
        return (Long) super.getValue(COLUMNA_VERSION_RASTRO_PROCESO);
    }
    public Long getVersionRastroProceso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_RASTRO_PROCESO, rowKey);
    }
    public void setVersionRastroProceso(Long valor) {
        super.setValue(COLUMNA_VERSION_RASTRO_PROCESO, valor);
    }
    public void setVersionRastroProceso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_RASTRO_PROCESO, rowKey, valor);
    }

    public Timestamp getFechaHoraInicioEjecucion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_INICIO_EJECUCION);
    }
    public Timestamp getFechaHoraInicioEjecucion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_INICIO_EJECUCION, rowKey);
    }
    public void setFechaHoraInicioEjecucion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_INICIO_EJECUCION, valor);
    }
    public void setFechaHoraInicioEjecucion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_INICIO_EJECUCION, rowKey, valor);
    }

    public Timestamp getFechaHoraFinEjecucion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_FIN_EJECUCION);
    }
    public Timestamp getFechaHoraFinEjecucion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_FIN_EJECUCION, rowKey);
    }
    public void setFechaHoraFinEjecucion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_FIN_EJECUCION, valor);
    }
    public void setFechaHoraFinEjecucion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_FIN_EJECUCION, rowKey, valor);
    }

    public Long getIdUsuario() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO);
    }
    public Long getIdUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO, rowKey);
    }
    public void setIdUsuario(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, valor);
    }
    public void setIdUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, rowKey, valor);
    }

    public Long getIdFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION);
    }
    public Long getIdFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION, rowKey);
    }
    public void setIdFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, valor);
    }
    public void setIdFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, rowKey, valor);
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

    public String getDescripcionError() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ERROR);
    }
    public String getDescripcionError(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ERROR, rowKey);
    }
    public void setDescripcionError(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ERROR, valor);
    }
    public void setDescripcionError(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ERROR, rowKey, valor);
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

    public Long getIdRastroProcesoSuperior() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR);
    }
    public Long getIdRastroProcesoSuperior(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, rowKey);
    }
    public void setIdRastroProcesoSuperior(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, valor);
    }
    public void setIdRastroProcesoSuperior(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_PROCESO_SUPERIOR, rowKey, valor);
    }

    public Integer getSubprocesos() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS);
    }
    public Integer getSubprocesos(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS, rowKey);
    }
    public void setSubprocesos(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS, valor);
    }
    public void setSubprocesos(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS, rowKey, valor);
    }

    public Integer getSubprocesosPendientes() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_PENDIENTES);
    }
    public Integer getSubprocesosPendientes(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_PENDIENTES, rowKey);
    }
    public void setSubprocesosPendientes(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_PENDIENTES, valor);
    }
    public void setSubprocesosPendientes(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_PENDIENTES, rowKey, valor);
    }

    public Integer getSubprocesosEnProgreso() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_EN_PROGRESO);
    }
    public Integer getSubprocesosEnProgreso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_EN_PROGRESO, rowKey);
    }
    public void setSubprocesosEnProgreso(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_EN_PROGRESO, valor);
    }
    public void setSubprocesosEnProgreso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_EN_PROGRESO, rowKey, valor);
    }

    public Integer getSubprocesosSinErrores() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_SIN_ERRORES);
    }
    public Integer getSubprocesosSinErrores(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_SIN_ERRORES, rowKey);
    }
    public void setSubprocesosSinErrores(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_SIN_ERRORES, valor);
    }
    public void setSubprocesosSinErrores(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_SIN_ERRORES, rowKey, valor);
    }

    public Integer getSubprocesosConErrores() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_CON_ERRORES);
    }
    public Integer getSubprocesosConErrores(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_CON_ERRORES, rowKey);
    }
    public void setSubprocesosConErrores(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_CON_ERRORES, valor);
    }
    public void setSubprocesosConErrores(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_CON_ERRORES, rowKey, valor);
    }

    public Integer getSubprocesosCancelados() {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_CANCELADOS);
    }
    public Integer getSubprocesosCancelados(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SUBPROCESOS_CANCELADOS, rowKey);
    }
    public void setSubprocesosCancelados(Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_CANCELADOS, valor);
    }
    public void setSubprocesosCancelados(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SUBPROCESOS_CANCELADOS, rowKey, valor);
    }

    public String getProcedimientoAfterUpdate() {
        return (String) super.getValue(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE);
    }
    public String getProcedimientoAfterUpdate(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, rowKey);
    }
    public void setProcedimientoAfterUpdate(String valor) {
        super.setValue(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, valor);
    }
    public void setProcedimientoAfterUpdate(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PROCEDIMIENTO_AFTER_UPDATE, rowKey, valor);
    }

    public String getCodigoUsuario() {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO);
    }
    public String getCodigoUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO, rowKey);
    }
    public void setCodigoUsuario(String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, valor);
    }
    public void setCodigoUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, rowKey, valor);
    }

    public String getNombreUsuario() {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO);
    }
    public String getNombreUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO, rowKey);
    }
    public void setNombreUsuario(String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, valor);
    }
    public void setNombreUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, rowKey, valor);
    }

    public Integer getEsSuperUsuario() {
        return (Integer) super.getValue(COLUMNA_ES_SUPER_USUARIO);
    }
    public Integer getEsSuperUsuario(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_SUPER_USUARIO, rowKey);
    }
    public void setEsSuperUsuario(Integer valor) {
        super.setValue(COLUMNA_ES_SUPER_USUARIO, valor);
    }
    public void setEsSuperUsuario(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_SUPER_USUARIO, rowKey, valor);
    }

    public String getCodigoFuncion() {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCION);
    }
    public String getCodigoFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCION, rowKey);
    }
    public void setCodigoFuncion(String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCION, valor);
    }
    public void setCodigoFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCION, rowKey, valor);
    }

    public String getNombreFuncion() {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCION);
    }
    public String getNombreFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCION, rowKey);
    }
    public void setNombreFuncion(String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCION, valor);
    }
    public void setNombreFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCION, rowKey, valor);
    }

    public Integer getNumeroTipoFuncion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_FUNCION);
    }
    public Integer getNumeroTipoFuncion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_FUNCION, rowKey);
    }
    public void setNumeroTipoFuncion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_FUNCION, valor);
    }
    public void setNumeroTipoFuncion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_FUNCION, rowKey, valor);
    }

    public Integer getEsPublica() {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA);
    }
    public Integer getEsPublica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA, rowKey);
    }
    public void setEsPublica(Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, valor);
    }
    public void setEsPublica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, rowKey, valor);
    }

    public Integer getEsProgramatica() {
        return (Integer) super.getValue(COLUMNA_ES_PROGRAMATICA);
    }
    public Integer getEsProgramatica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PROGRAMATICA, rowKey);
    }
    public void setEsProgramatica(Integer valor) {
        super.setValue(COLUMNA_ES_PROGRAMATICA, valor);
    }
    public void setEsProgramatica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PROGRAMATICA, rowKey, valor);
    }

    public Integer getEsPersonalizada() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONALIZADA);
    }
    public Integer getEsPersonalizada(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONALIZADA, rowKey);
    }
    public void setEsPersonalizada(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONALIZADA, valor);
    }
    public void setEsPersonalizada(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONALIZADA, rowKey, valor);
    }

    public Integer getEsSegmentada() {
        return (Integer) super.getValue(COLUMNA_ES_SEGMENTADA);
    }
    public Integer getEsSegmentada(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_SEGMENTADA, rowKey);
    }
    public void setEsSegmentada(Integer valor) {
        super.setValue(COLUMNA_ES_SEGMENTADA, valor);
    }
    public void setEsSegmentada(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_SEGMENTADA, rowKey, valor);
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

    public String getCodigoClaseRecurso() {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_RECURSO);
    }
    public String getCodigoClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_RECURSO, rowKey);
    }
    public void setCodigoClaseRecurso(String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_RECURSO, valor);
    }
    public void setCodigoClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_RECURSO, rowKey, valor);
    }

    public String getNombreClaseRecurso() {
        return (String) super.getValue(COLUMNA_NOMBRE_CLASE_RECURSO);
    }
    public String getNombreClaseRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_CLASE_RECURSO, rowKey);
    }
    public void setNombreClaseRecurso(String valor) {
        super.setValue(COLUMNA_NOMBRE_CLASE_RECURSO, valor);
    }
    public void setNombreClaseRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_CLASE_RECURSO, rowKey, valor);
    }

    public String getCodigoCondicionEjeFun() {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_EJE_FUN);
    }
    public String getCodigoCondicionEjeFun(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_EJE_FUN, rowKey);
    }
    public void setCodigoCondicionEjeFun(String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_EJE_FUN, valor);
    }
    public void setCodigoCondicionEjeFun(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_EJE_FUN, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rastro_proceso";
    public static final String COLUMNA_VERSION_RECURSO = "version_rastro_proceso";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";
    public static final String COLUMNA_RECURSO_SUPERIOR = "id_rastro_proceso_superior";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";
    public static final String ETIQUETA_RECURSO_SUPERIOR = "Rastro Proceso Superior";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaPropietarioRecurso() {
        return COLUMNA_PROPIETARIO_RECURSO;
    }
    @Override
    public String getColumnaRecursoSuperior() {
        return COLUMNA_RECURSO_SUPERIOR;
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
    public String getEtiquetaPropietarioRecurso() {
        return ETIQUETA_PROPIETARIO_RECURSO;
    }
    @Override
    public String getEtiquetaRecursoSuperior() {
        return ETIQUETA_RECURSO_SUPERIOR;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdRastroProceso();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRastroProceso(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRastroProceso(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRastroProceso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRastroProceso();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRastroProceso(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRastroProceso(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRastroProceso(rowKey, versionRecurso);
    }

    @Override
    public Long getPropietarioRecurso() {
        return this.getIdUsuario();
    }
    @Override
    public Long getPropietarioRecurso(RowKey rowKey) {
        return this.getIdUsuario(rowKey);
    }
    @Override
    public void setPropietarioRecurso(Long propietarioRecurso) {
        this.setIdUsuario(propietarioRecurso);
    }
    @Override
    public void setPropietarioRecurso(RowKey rowKey, Long propietarioRecurso) {
        this.setIdUsuario(rowKey, propietarioRecurso);
    }

    @Override
    public Long getRecursoSuperior() {
        return this.getIdRastroProcesoSuperior();
    }
    @Override
    public Long getRecursoSuperior(RowKey rowKey) {
        return this.getIdRastroProcesoSuperior(rowKey);
    }
    @Override
    public void setRecursoSuperior(Long recursoSuperior) {
        this.setIdRastroProcesoSuperior(recursoSuperior);
    }
    @Override
    public void setRecursoSuperior(RowKey rowKey, Long recursoSuperior) {
        this.setIdRastroProcesoSuperior(rowKey, recursoSuperior);
    }
}
