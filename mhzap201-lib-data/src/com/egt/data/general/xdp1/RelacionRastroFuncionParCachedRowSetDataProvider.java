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

public class RelacionRastroFuncionParCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoIdentificableDataProvider, RecursoPersonalizableDataProvider {

    public RelacionRastroFuncionParCachedRowSetDataProvider() {
        super();
    }

    public RelacionRastroFuncionParCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "relacion_rastro_funcion_par";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros de Ejecuciones de Funciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM relacion_rastro_funcion_par ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rastro_funcion_par";

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
    public static final String COLUMNA_ID_RASTRO_FUNCION_PAR = "id_rastro_funcion_par";
    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";
    public static final String COLUMNA_VALOR_PARAMETRO = "valor_parametro";
    public static final String COLUMNA_CODIGO_PARAMETRO = "codigo_parametro";
    public static final String COLUMNA_NOMBRE_PARAMETRO = "nombre_parametro";
    public static final String COLUMNA_DESCRIPCION_PARAMETRO = "descripcion_parametro";
    public static final String COLUMNA_NUMERO_TIPO_DATO_PAR = "numero_tipo_dato_par";

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
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_FUNCION_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_DATO_PAR, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_EJECUCION, false);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, false);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, false);
        this.setColumnasInsertables(COLUMNA_ID_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_VERSION_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_CODIGO_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_ID_PROPIETARIO_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_ID_SEGMENTO_RECURSO, false);
        this.setColumnasInsertables(COLUMNA_NUMERO_ERROR, false);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ERROR, false);
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
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_FUNCION_PAR, true);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_VALOR_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PARAMETRO, false);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PARAMETRO, false);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_PARAMETRO, false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_DATO_PAR, false);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_EJECUCION, false);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, false);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, false);
        this.setColumnasModificables(COLUMNA_ID_RECURSO, false);
        this.setColumnasModificables(COLUMNA_VERSION_RECURSO, false);
        this.setColumnasModificables(COLUMNA_CODIGO_RECURSO, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_RECURSO, false);
        this.setColumnasModificables(COLUMNA_ID_PROPIETARIO_RECURSO, false);
        this.setColumnasModificables(COLUMNA_ID_SEGMENTO_RECURSO, false);
        this.setColumnasModificables(COLUMNA_NUMERO_ERROR, false);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ERROR, false);
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
        this.setColumnasModificables(COLUMNA_ID_RASTRO_FUNCION_PAR, true);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_VALOR_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PARAMETRO, false);
        this.setColumnasModificables(COLUMNA_NOMBRE_PARAMETRO, false);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_PARAMETRO, false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_DATO_PAR, false);
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

    public Long getIdRastroFuncionPar() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION_PAR);
    }
    public Long getIdRastroFuncionPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION_PAR, rowKey);
    }
    public void setIdRastroFuncionPar(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION_PAR, valor);
    }
    public void setIdRastroFuncionPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION_PAR, rowKey, valor);
    }

    public Long getIdParametro() {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO);
    }
    public Long getIdParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO, rowKey);
    }
    public void setIdParametro(Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, valor);
    }
    public void setIdParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, rowKey, valor);
    }

    public String getValorParametro() {
        return (String) super.getValue(COLUMNA_VALOR_PARAMETRO);
    }
    public String getValorParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_PARAMETRO, rowKey);
    }
    public void setValorParametro(String valor) {
        super.setValue(COLUMNA_VALOR_PARAMETRO, valor);
    }
    public void setValorParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_PARAMETRO, rowKey, valor);
    }

    public String getCodigoParametro() {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO);
    }
    public String getCodigoParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO, rowKey);
    }
    public void setCodigoParametro(String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO, valor);
    }
    public void setCodigoParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO, rowKey, valor);
    }

    public String getNombreParametro() {
        return (String) super.getValue(COLUMNA_NOMBRE_PARAMETRO);
    }
    public String getNombreParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PARAMETRO, rowKey);
    }
    public void setNombreParametro(String valor) {
        super.setValue(COLUMNA_NOMBRE_PARAMETRO, valor);
    }
    public void setNombreParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PARAMETRO, rowKey, valor);
    }

    public String getDescripcionParametro() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PARAMETRO);
    }
    public String getDescripcionParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PARAMETRO, rowKey);
    }
    public void setDescripcionParametro(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PARAMETRO, valor);
    }
    public void setDescripcionParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PARAMETRO, rowKey, valor);
    }

    public Integer getNumeroTipoDatoPar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DATO_PAR);
    }
    public Integer getNumeroTipoDatoPar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DATO_PAR, rowKey);
    }
    public void setNumeroTipoDatoPar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DATO_PAR, valor);
    }
    public void setNumeroTipoDatoPar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DATO_PAR, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rastro_funcion_par";
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
        return this.getIdRastroFuncionPar();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRastroFuncionPar(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRastroFuncionPar(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRastroFuncionPar(rowKey, identificacionRecurso);
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
