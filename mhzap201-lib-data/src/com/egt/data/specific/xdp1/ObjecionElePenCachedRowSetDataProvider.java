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
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class ObjecionElePenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoDesactivableDataProvider {

    public ObjecionElePenCachedRowSetDataProvider() {
        super();
    }

    public ObjecionElePenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "objecion_ele_pen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Objeciones de Elegibilidad de Pension";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_objecion_ele_pen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "objecion_ele_pen";

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

    public static final String COLUMNA_ID_OBJECION_ELE_PEN = "id_objecion_ele_pen";
    public static final String COLUMNA_VERSION_OBJECION_ELE_PEN = "version_objecion_ele_pen";
    public static final String COLUMNA_ID_PERSONA = "id_persona";
    public static final String COLUMNA_ID_PROVEEDOR_DAT_EXT = "id_proveedor_dat_ext";
    public static final String COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN = "numero_tipo_obj_ele_pen";
    public static final String COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA = "es_objecion_ele_pen_inactiva";
    public static final String COLUMNA_FECHA_ULTIMA_ACTUALIZACION = "fecha_ultima_actualizacion";
    public static final String COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT = "nombre_archivo_ultima_act";
    public static final String COLUMNA_OBSERVACIONES = "observaciones";
    public static final String COLUMNA_FECHA_ANULACION = "fecha_anulacion";
    public static final String COLUMNA_OBSERVACIONES_ANULACION = "observaciones_anulacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OBJECION_ELE_PEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_OBJECION_ELE_PEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROVEEDOR_DAT_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_ANULACION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES_ANULACION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_OBJECION_ELE_PEN, true);
        this.setColumnasInsertables(COLUMNA_VERSION_OBJECION_ELE_PEN, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, true);
        this.setColumnasInsertables(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasInsertables(COLUMNA_FECHA_ANULACION, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES_ANULACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_OBJECION_ELE_PEN, true);
        this.setColumnasModificables(COLUMNA_VERSION_OBJECION_ELE_PEN, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, true);
        this.setColumnasModificables(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, true);
        this.setColumnasModificables(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasModificables(COLUMNA_FECHA_ANULACION, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES_ANULACION, true);
    }

    public Long getIdObjecionElePen() {
        return (Long) super.getValue(COLUMNA_ID_OBJECION_ELE_PEN);
    }
    public Long getIdObjecionElePen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OBJECION_ELE_PEN, rowKey);
    }
    public void setIdObjecionElePen(Long valor) {
        super.setValue(COLUMNA_ID_OBJECION_ELE_PEN, valor);
    }
    public void setIdObjecionElePen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OBJECION_ELE_PEN, rowKey, valor);
    }

    public Long getVersionObjecionElePen() {
        return (Long) super.getValue(COLUMNA_VERSION_OBJECION_ELE_PEN);
    }
    public Long getVersionObjecionElePen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_OBJECION_ELE_PEN, rowKey);
    }
    public void setVersionObjecionElePen(Long valor) {
        super.setValue(COLUMNA_VERSION_OBJECION_ELE_PEN, valor);
    }
    public void setVersionObjecionElePen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_OBJECION_ELE_PEN, rowKey, valor);
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

    public Integer getNumeroTipoObjElePen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN);
    }
    public Integer getNumeroTipoObjElePen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, rowKey);
    }
    public void setNumeroTipoObjElePen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, valor);
    }
    public void setNumeroTipoObjElePen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, rowKey, valor);
    }

    public Integer getEsObjecionElePenInactiva() {
        return (Integer) super.getValue(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA);
    }
    public Integer getEsObjecionElePenInactiva(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, rowKey);
    }
    public void setEsObjecionElePenInactiva(Integer valor) {
        super.setValue(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, valor);
    }
    public void setEsObjecionElePenInactiva(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_OBJECION_ELE_PEN_INACTIVA, rowKey, valor);
    }

    public Timestamp getFechaUltimaActualizacion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMA_ACTUALIZACION);
    }
    public Timestamp getFechaUltimaActualizacion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, rowKey);
    }
    public void setFechaUltimaActualizacion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, valor);
    }
    public void setFechaUltimaActualizacion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMA_ACTUALIZACION, rowKey, valor);
    }

    public String getNombreArchivoUltimaAct() {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT);
    }
    public String getNombreArchivoUltimaAct(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, rowKey);
    }
    public void setNombreArchivoUltimaAct(String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, valor);
    }
    public void setNombreArchivoUltimaAct(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO_ULTIMA_ACT, rowKey, valor);
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

    public Timestamp getFechaAnulacion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ANULACION);
    }
    public Timestamp getFechaAnulacion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ANULACION, rowKey);
    }
    public void setFechaAnulacion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ANULACION, valor);
    }
    public void setFechaAnulacion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ANULACION, rowKey, valor);
    }

    public String getObservacionesAnulacion() {
        return (String) super.getValue(COLUMNA_OBSERVACIONES_ANULACION);
    }
    public String getObservacionesAnulacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACIONES_ANULACION, rowKey);
    }
    public void setObservacionesAnulacion(String valor) {
        super.setValue(COLUMNA_OBSERVACIONES_ANULACION, valor);
    }
    public void setObservacionesAnulacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACIONES_ANULACION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_objecion_ele_pen";
    public static final String COLUMNA_VERSION_RECURSO = "version_objecion_ele_pen";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_objecion_ele_pen_inactiva";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Objecion Elegibilidad Pension Inactiva";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
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
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdObjecionElePen();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdObjecionElePen(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdObjecionElePen(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdObjecionElePen(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionObjecionElePen();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionObjecionElePen(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionObjecionElePen(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionObjecionElePen(rowKey, versionRecurso);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsObjecionElePenInactiva();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsObjecionElePenInactiva(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsObjecionElePenInactiva(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsObjecionElePenInactiva(rowKey, esRecursoInactivo);
    }
}
