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
import com.egt.core.db.xdp.RecursoIdentificableDataProvider;
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class RastroFuncionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoIdentificableDataProvider, RecursoPersonalizableDataProvider {

    public RastroFuncionCachedRowSetDataProvider() {
        super();
    }

    public RastroFuncionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rastro_funcion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Ejecuciones de Funciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rastro_funcion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rastro_funcion";

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

    public static final String COLUMNA_ID_RASTRO_FUNCION = "id_rastro_funcion";
    public static final String COLUMNA_FECHA_HORA_EJECUCION = "fecha_hora_ejecucion";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ID_RECURSO = "id_recurso";
    public static final String COLUMNA_VERSION_RECURSO = "version_recurso";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_recurso";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_recurso";
    public static final String COLUMNA_ID_PROPIETARIO_RECURSO = "id_propietario_recurso";
    public static final String COLUMNA_ID_SEGMENTO_RECURSO = "id_segmento_recurso";
    public static final String COLUMNA_NUMERO_ERROR = "numero_error";
    public static final String COLUMNA_DESCRIPCION_ERROR = "descripcion_error";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_EJECUCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_RECURSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROPIETARIO_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_SEGMENTO_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ERROR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_ERROR, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_EJECUCION, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ID_PROPIETARIO_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ID_SEGMENTO_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ERROR, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ERROR, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_EJECUCION, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_RECURSO, true);
        this.setColumnasModificables(COLUMNA_VERSION_RECURSO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_RECURSO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ID_PROPIETARIO_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ID_SEGMENTO_RECURSO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ERROR, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ERROR, true);
    }

    public Long getIdRastroFuncion() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION);
    }
    public Long getIdRastroFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION, rowKey);
    }
    public void setIdRastroFuncion(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION, valor);
    }
    public void setIdRastroFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION, rowKey, valor);
    }

    public Timestamp getFechaHoraEjecucion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_EJECUCION);
    }
    public Timestamp getFechaHoraEjecucion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_EJECUCION, rowKey);
    }
    public void setFechaHoraEjecucion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_EJECUCION, valor);
    }
    public void setFechaHoraEjecucion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_EJECUCION, rowKey, valor);
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

    public Long getIdRecurso() {
        return (Long) super.getValue(COLUMNA_ID_RECURSO);
    }
    public Long getIdRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RECURSO, rowKey);
    }
    public void setIdRecurso(Long valor) {
        super.setValue(COLUMNA_ID_RECURSO, valor);
    }
    public void setIdRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RECURSO, rowKey, valor);
    }

    public Long getVersionRecurso() {
        return (Long) super.getValue(COLUMNA_VERSION_RECURSO);
    }
    public Long getVersionRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_RECURSO, rowKey);
    }
    public void setVersionRecurso(Long valor) {
        super.setValue(COLUMNA_VERSION_RECURSO, valor);
    }
    public void setVersionRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_RECURSO, rowKey, valor);
    }

    public String getCodigoRecurso() {
        return (String) super.getValue(COLUMNA_CODIGO_RECURSO);
    }
    public String getCodigoRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_RECURSO, rowKey);
    }
    public void setCodigoRecurso(String valor) {
        super.setValue(COLUMNA_CODIGO_RECURSO, valor);
    }
    public void setCodigoRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_RECURSO, rowKey, valor);
    }

    public String getNombreRecurso() {
        return (String) super.getValue(COLUMNA_NOMBRE_RECURSO);
    }
    public String getNombreRecurso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_RECURSO, rowKey);
    }
    public void setNombreRecurso(String valor) {
        super.setValue(COLUMNA_NOMBRE_RECURSO, valor);
    }
    public void setNombreRecurso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_RECURSO, rowKey, valor);
    }

    public Long getIdPropietarioRecurso() {
        return (Long) super.getValue(COLUMNA_ID_PROPIETARIO_RECURSO);
    }
    public Long getIdPropietarioRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PROPIETARIO_RECURSO, rowKey);
    }
    public void setIdPropietarioRecurso(Long valor) {
        super.setValue(COLUMNA_ID_PROPIETARIO_RECURSO, valor);
    }
    public void setIdPropietarioRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PROPIETARIO_RECURSO, rowKey, valor);
    }

    public Long getIdSegmentoRecurso() {
        return (Long) super.getValue(COLUMNA_ID_SEGMENTO_RECURSO);
    }
    public Long getIdSegmentoRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_SEGMENTO_RECURSO, rowKey);
    }
    public void setIdSegmentoRecurso(Long valor) {
        super.setValue(COLUMNA_ID_SEGMENTO_RECURSO, valor);
    }
    public void setIdSegmentoRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_SEGMENTO_RECURSO, rowKey, valor);
    }

    public Integer getNumeroError() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ERROR);
    }
    public Integer getNumeroError(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ERROR, rowKey);
    }
    public void setNumeroError(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ERROR, valor);
    }
    public void setNumeroError(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ERROR, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rastro_funcion";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
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
    public String getEtiquetaPropietarioRecurso() {
        return ETIQUETA_PROPIETARIO_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdRastroFuncion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRastroFuncion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRastroFuncion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRastroFuncion(rowKey, identificacionRecurso);
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
