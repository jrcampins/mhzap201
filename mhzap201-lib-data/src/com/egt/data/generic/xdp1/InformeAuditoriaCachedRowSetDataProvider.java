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
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class InformeAuditoriaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public InformeAuditoriaCachedRowSetDataProvider() {
        super();
    }

    public InformeAuditoriaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "informe_auditoria";
    public static final String NOMBRE_DOMINIO_RECURSO = "Informes de Auditoria";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_informe_auditoria_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "informe_auditoria";

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

    public static final String COLUMNA_ID_INFORME_AUDITORIA = "id_informe_auditoria";
    public static final String COLUMNA_VERSION_INFORME_AUDITORIA = "version_informe_auditoria";
    public static final String COLUMNA_CODIGO_INFORME_AUDITORIA = "codigo_informe_auditoria";
    public static final String COLUMNA_NOMBRE_INFORME_AUDITORIA = "nombre_informe_auditoria";
    public static final String COLUMNA_FECHA_TRANSACCION = "fecha_transaccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_INFORME_AUDITORIA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_INFORME_AUDITORIA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_INFORME_AUDITORIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_INFORME_AUDITORIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_TRANSACCION, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_INFORME_AUDITORIA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_INFORME_AUDITORIA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_INFORME_AUDITORIA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_INFORME_AUDITORIA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_TRANSACCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_INFORME_AUDITORIA, true);
        this.setColumnasModificables(COLUMNA_VERSION_INFORME_AUDITORIA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_INFORME_AUDITORIA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_INFORME_AUDITORIA, true);
        this.setColumnasModificables(COLUMNA_FECHA_TRANSACCION, true);
    }

    public Long getIdInformeAuditoria() {
        return (Long) super.getValue(COLUMNA_ID_INFORME_AUDITORIA);
    }
    public Long getIdInformeAuditoria(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_INFORME_AUDITORIA, rowKey);
    }
    public void setIdInformeAuditoria(Long valor) {
        super.setValue(COLUMNA_ID_INFORME_AUDITORIA, valor);
    }
    public void setIdInformeAuditoria(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_INFORME_AUDITORIA, rowKey, valor);
    }

    public Long getVersionInformeAuditoria() {
        return (Long) super.getValue(COLUMNA_VERSION_INFORME_AUDITORIA);
    }
    public Long getVersionInformeAuditoria(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_INFORME_AUDITORIA, rowKey);
    }
    public void setVersionInformeAuditoria(Long valor) {
        super.setValue(COLUMNA_VERSION_INFORME_AUDITORIA, valor);
    }
    public void setVersionInformeAuditoria(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_INFORME_AUDITORIA, rowKey, valor);
    }

    public String getCodigoInformeAuditoria() {
        return (String) super.getValue(COLUMNA_CODIGO_INFORME_AUDITORIA);
    }
    public String getCodigoInformeAuditoria(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_INFORME_AUDITORIA, rowKey);
    }
    public void setCodigoInformeAuditoria(String valor) {
        super.setValue(COLUMNA_CODIGO_INFORME_AUDITORIA, valor);
    }
    public void setCodigoInformeAuditoria(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_INFORME_AUDITORIA, rowKey, valor);
    }

    public String getNombreInformeAuditoria() {
        return (String) super.getValue(COLUMNA_NOMBRE_INFORME_AUDITORIA);
    }
    public String getNombreInformeAuditoria(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_INFORME_AUDITORIA, rowKey);
    }
    public void setNombreInformeAuditoria(String valor) {
        super.setValue(COLUMNA_NOMBRE_INFORME_AUDITORIA, valor);
    }
    public void setNombreInformeAuditoria(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_INFORME_AUDITORIA, rowKey, valor);
    }

    public Timestamp getFechaTransaccion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_TRANSACCION);
    }
    public Timestamp getFechaTransaccion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_TRANSACCION, rowKey);
    }
    public void setFechaTransaccion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_TRANSACCION, valor);
    }
    public void setFechaTransaccion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_TRANSACCION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_informe_auditoria";
    public static final String COLUMNA_VERSION_RECURSO = "version_informe_auditoria";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_informe_auditoria";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_informe_auditoria";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

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
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdInformeAuditoria();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdInformeAuditoria(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdInformeAuditoria(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdInformeAuditoria(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionInformeAuditoria();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionInformeAuditoria(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionInformeAuditoria(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionInformeAuditoria(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoInformeAuditoria();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoInformeAuditoria(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoInformeAuditoria(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoInformeAuditoria(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreInformeAuditoria();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreInformeAuditoria(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreInformeAuditoria(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreInformeAuditoria(rowKey, nombreRecurso);
    }
}
