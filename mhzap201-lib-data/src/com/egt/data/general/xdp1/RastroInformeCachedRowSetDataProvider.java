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
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class RastroInformeCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoPersonalizableDataProvider {

    public RastroInformeCachedRowSetDataProvider() {
        super();
    }

    public RastroInformeCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rastro_informe";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Informes";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rastro_informe_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rastro_informe";

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

    public static final String COLUMNA_ID_RASTRO_INFORME = "id_rastro_informe";
    public static final String COLUMNA_VERSION_RASTRO_INFORME = "version_rastro_informe";
    public static final String COLUMNA_FECHA_HORA_INICIO_EJECUCION = "fecha_hora_inicio_ejecucion";
    public static final String COLUMNA_FECHA_HORA_FIN_EJECUCION = "fecha_hora_fin_ejecucion";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_NUMERO_CONDICION_EJE_FUN = "numero_condicion_eje_fun";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_DESCRIPCION_ERROR = "descripcion_error";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_INFORME, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_RASTRO_INFORME, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_INICIO_EJECUCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_FIN_EJECUCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_EJE_FUN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_ERROR, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_INFORME, true);
        this.setColumnasInsertables(COLUMNA_VERSION_RASTRO_INFORME, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_INICIO_EJECUCION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_FIN_EJECUCION, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ERROR, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_INFORME, true);
        this.setColumnasModificables(COLUMNA_VERSION_RASTRO_INFORME, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_INICIO_EJECUCION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_FIN_EJECUCION, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_EJE_FUN, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ERROR, true);
    }

    public Long getIdRastroInforme() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_INFORME);
    }
    public Long getIdRastroInforme(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_INFORME, rowKey);
    }
    public void setIdRastroInforme(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_INFORME, valor);
    }
    public void setIdRastroInforme(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_INFORME, rowKey, valor);
    }

    public Long getVersionRastroInforme() {
        return (Long) super.getValue(COLUMNA_VERSION_RASTRO_INFORME);
    }
    public Long getVersionRastroInforme(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_RASTRO_INFORME, rowKey);
    }
    public void setVersionRastroInforme(Long valor) {
        super.setValue(COLUMNA_VERSION_RASTRO_INFORME, valor);
    }
    public void setVersionRastroInforme(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_RASTRO_INFORME, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rastro_informe";
    public static final String COLUMNA_VERSION_RECURSO = "version_rastro_informe";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";

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
    public Long getIdentificacionRecurso() {
        return this.getIdRastroInforme();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRastroInforme(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRastroInforme(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRastroInforme(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRastroInforme();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRastroInforme(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRastroInforme(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRastroInforme(rowKey, versionRecurso);
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
}
