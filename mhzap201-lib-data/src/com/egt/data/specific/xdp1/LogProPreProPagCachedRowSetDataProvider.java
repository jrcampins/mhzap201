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

public class LogProPreProPagCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogProPreProPagCachedRowSetDataProvider() {
        super();
    }

    public LogProPreProPagCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_pro_pre_pro_pag";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Preparacion de Pagos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_pro_pre_pro_pag_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_pro_pre_pro_pag";

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

    public static final String COLUMNA_ID_LOG_PRO_PRE_PRO_PAG = "id_log_pro_pre_pro_pag";
    public static final String COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG = "version_log_pro_pre_pro_pag";
    public static final String COLUMNA_ID_PERSONA = "id_persona";
    public static final String COLUMNA_CODIGO_PERSONA = "codigo_persona";
    public static final String COLUMNA_NOMBRE_PERSONA = "nombre_persona";
    public static final String COLUMNA_ID_DEPARTAMENTO = "id_departamento";
    public static final String COLUMNA_ID_DISTRITO = "id_distrito";
    public static final String COLUMNA_ID_BARRIO = "id_barrio";
    public static final String COLUMNA_NUMERO_CONDICION_PENSION = "numero_condicion_pension";
    public static final String COLUMNA_FECHA_SOLICITUD_PENSION = "fecha_solicitud_pension";
    public static final String COLUMNA_NUMERO_CONDICION_DENU_PEN = "numero_condicion_denu_pen";
    public static final String COLUMNA_NUMERO_CONDICION_RECO_PEN = "numero_condicion_reco_pen";
    public static final String COLUMNA_ES_PROCESADO = "es_procesado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DEPARTAMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DISTRITO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_BARRIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_SOLICITUD_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_DENU_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_RECO_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PROCESADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasInsertables(COLUMNA_ID_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_SOLICITUD_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_ES_PROCESADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasModificables(COLUMNA_ID_BARRIO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_SOLICITUD_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_ES_PROCESADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    public Long getIdLogProPreProPag() {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG);
    }
    public Long getIdLogProPreProPag(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, rowKey);
    }
    public void setIdLogProPreProPag(Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, valor);
    }
    public void setIdLogProPreProPag(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_PRE_PRO_PAG, rowKey, valor);
    }

    public Long getVersionLogProPreProPag() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG);
    }
    public Long getVersionLogProPreProPag(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, rowKey);
    }
    public void setVersionLogProPreProPag(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, valor);
    }
    public void setVersionLogProPreProPag(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_PRE_PRO_PAG, rowKey, valor);
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

    public String getCodigoPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA);
    }
    public String getCodigoPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA, rowKey);
    }
    public void setCodigoPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, valor);
    }
    public void setCodigoPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, rowKey, valor);
    }

    public String getNombrePersona() {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA);
    }
    public String getNombrePersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA, rowKey);
    }
    public void setNombrePersona(String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, valor);
    }
    public void setNombrePersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, rowKey, valor);
    }

    public Long getIdDepartamento() {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO);
    }
    public Long getIdDepartamento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO, rowKey);
    }
    public void setIdDepartamento(Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO, valor);
    }
    public void setIdDepartamento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO, rowKey, valor);
    }

    public Long getIdDistrito() {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO);
    }
    public Long getIdDistrito(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO, rowKey);
    }
    public void setIdDistrito(Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO, valor);
    }
    public void setIdDistrito(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO, rowKey, valor);
    }

    public Long getIdBarrio() {
        return (Long) super.getValue(COLUMNA_ID_BARRIO);
    }
    public Long getIdBarrio(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_BARRIO, rowKey);
    }
    public void setIdBarrio(Long valor) {
        super.setValue(COLUMNA_ID_BARRIO, valor);
    }
    public void setIdBarrio(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_BARRIO, rowKey, valor);
    }

    public Integer getNumeroCondicionPension() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_PENSION);
    }
    public Integer getNumeroCondicionPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_PENSION, rowKey);
    }
    public void setNumeroCondicionPension(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_PENSION, valor);
    }
    public void setNumeroCondicionPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_PENSION, rowKey, valor);
    }

    public Timestamp getFechaSolicitudPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_PENSION);
    }
    public Timestamp getFechaSolicitudPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_PENSION, rowKey);
    }
    public void setFechaSolicitudPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_PENSION, valor);
    }
    public void setFechaSolicitudPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_PENSION, rowKey, valor);
    }

    public Integer getNumeroCondicionDenuPen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_DENU_PEN);
    }
    public Integer getNumeroCondicionDenuPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, rowKey);
    }
    public void setNumeroCondicionDenuPen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, valor);
    }
    public void setNumeroCondicionDenuPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, rowKey, valor);
    }

    public Integer getNumeroCondicionRecoPen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECO_PEN);
    }
    public Integer getNumeroCondicionRecoPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, rowKey);
    }
    public void setNumeroCondicionRecoPen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, valor);
    }
    public void setNumeroCondicionRecoPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, rowKey, valor);
    }

    public Integer getEsProcesado() {
        return (Integer) super.getValue(COLUMNA_ES_PROCESADO);
    }
    public Integer getEsProcesado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PROCESADO, rowKey);
    }
    public void setEsProcesado(Integer valor) {
        super.setValue(COLUMNA_ES_PROCESADO, valor);
    }
    public void setEsProcesado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PROCESADO, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_pro_pre_pro_pag";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_pro_pre_pro_pag";

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
        return this.getIdLogProPreProPag();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogProPreProPag(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogProPreProPag(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogProPreProPag(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogProPreProPag();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogProPreProPag(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogProPreProPag(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogProPreProPag(rowKey, versionRecurso);
    }
}