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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class MensajeCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider {

    public MensajeCachedRowSetDataProvider() {
        super();
    }

    public MensajeCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "mensaje";
    public static final String NOMBRE_DOMINIO_RECURSO = "Mensajes";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_mensaje_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "mensaje";

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

    public static final String COLUMNA_ID_MENSAJE = "id_mensaje";
    public static final String COLUMNA_VERSION_MENSAJE = "version_mensaje";
    public static final String COLUMNA_CODIGO_MENSAJE = "codigo_mensaje";
    public static final String COLUMNA_PATRON_MENSAJE = "patron_mensaje";
    public static final String COLUMNA_DESCRIPCION_MENSAJE = "descripcion_mensaje";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_MENSAJE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_MENSAJE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_MENSAJE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PATRON_MENSAJE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_MENSAJE, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_MENSAJE, true);
        this.setColumnasInsertables(COLUMNA_VERSION_MENSAJE, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_MENSAJE, true);
        this.setColumnasInsertables(COLUMNA_PATRON_MENSAJE, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_MENSAJE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_MENSAJE, true);
        this.setColumnasModificables(COLUMNA_VERSION_MENSAJE, true);
        this.setColumnasModificables(COLUMNA_CODIGO_MENSAJE, true);
        this.setColumnasModificables(COLUMNA_PATRON_MENSAJE, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_MENSAJE, true);
    }

    public Long getIdMensaje() {
        return (Long) super.getValue(COLUMNA_ID_MENSAJE);
    }
    public Long getIdMensaje(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_MENSAJE, rowKey);
    }
    public void setIdMensaje(Long valor) {
        super.setValue(COLUMNA_ID_MENSAJE, valor);
    }
    public void setIdMensaje(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_MENSAJE, rowKey, valor);
    }

    public Long getVersionMensaje() {
        return (Long) super.getValue(COLUMNA_VERSION_MENSAJE);
    }
    public Long getVersionMensaje(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_MENSAJE, rowKey);
    }
    public void setVersionMensaje(Long valor) {
        super.setValue(COLUMNA_VERSION_MENSAJE, valor);
    }
    public void setVersionMensaje(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_MENSAJE, rowKey, valor);
    }

    public String getCodigoMensaje() {
        return (String) super.getValue(COLUMNA_CODIGO_MENSAJE);
    }
    public String getCodigoMensaje(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_MENSAJE, rowKey);
    }
    public void setCodigoMensaje(String valor) {
        super.setValue(COLUMNA_CODIGO_MENSAJE, valor);
    }
    public void setCodigoMensaje(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_MENSAJE, rowKey, valor);
    }

    public String getPatronMensaje() {
        return (String) super.getValue(COLUMNA_PATRON_MENSAJE);
    }
    public String getPatronMensaje(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PATRON_MENSAJE, rowKey);
    }
    public void setPatronMensaje(String valor) {
        super.setValue(COLUMNA_PATRON_MENSAJE, valor);
    }
    public void setPatronMensaje(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PATRON_MENSAJE, rowKey, valor);
    }

    public String getDescripcionMensaje() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_MENSAJE);
    }
    public String getDescripcionMensaje(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_MENSAJE, rowKey);
    }
    public void setDescripcionMensaje(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_MENSAJE, valor);
    }
    public void setDescripcionMensaje(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_MENSAJE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_mensaje";
    public static final String COLUMNA_VERSION_RECURSO = "version_mensaje";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_mensaje";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";

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
    public Long getIdentificacionRecurso() {
        return this.getIdMensaje();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdMensaje(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdMensaje(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdMensaje(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionMensaje();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionMensaje(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionMensaje(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionMensaje(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoMensaje();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoMensaje(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoMensaje(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoMensaje(rowKey, codigoRecurso);
    }
}
