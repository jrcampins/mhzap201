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
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class LogProAcrPotBenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogProAcrPotBenCachedRowSetDataProvider() {
        super();
    }

    public LogProAcrPotBenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_pro_acr_pot_ben";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Acreditacion de Potenciales Beneficiarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_pro_acr_pot_ben_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_pro_acr_pot_ben";

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

    public static final String COLUMNA_ID_LOG_PRO_ACR_POT_BEN = "id_log_pro_acr_pot_ben";
    public static final String COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN = "version_log_pro_acr_pot_ben";
    public static final String COLUMNA_ID_POTENCIAL_BEN = "id_potencial_ben";
    public static final String COLUMNA_NOMBRE_POTENCIAL_BEN = "nombre_potencial_ben";
    public static final String COLUMNA_CODIGO_POTENCIAL_BEN = "codigo_potencial_ben";
    public static final String COLUMNA_FECHA_REGISTRO_POT_BEN = "fecha_registro_pot_ben";
    public static final String COLUMNA_ID_PERSONA = "id_persona";
    public static final String COLUMNA_NOMBRE_PERSONA = "nombre_persona";
    public static final String COLUMNA_CODIGO_PERSONA = "codigo_persona";
    public static final String COLUMNA_ID_DEPARTAMENTO = "id_departamento";
    public static final String COLUMNA_ID_DISTRITO = "id_distrito";
    public static final String COLUMNA_ID_BARRIO = "id_barrio";
    public static final String COLUMNA_ID_FICHA_PERSONA = "id_ficha_persona";
    public static final String COLUMNA_CODIGO_FICHA_PERSONA = "codigo_ficha_persona";
    public static final String COLUMNA_NOMBRE_FICHA_PERSONA = "nombre_ficha_persona";
    public static final String COLUMNA_ID_FICHA_HOGAR = "id_ficha_hogar";
    public static final String COLUMNA_CODIGO_FICHA_HOGAR = "codigo_ficha_hogar";
    public static final String COLUMNA_INDICE_CALIDAD_VIDA = "indice_calidad_vida";
    public static final String COLUMNA_ES_PROCESADO = "es_procesado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_POTENCIAL_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_POTENCIAL_BEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_POTENCIAL_BEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_REGISTRO_POT_BEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DEPARTAMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DISTRITO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_BARRIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FICHA_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FICHA_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_HOGAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FICHA_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_INDICE_CALIDAD_VIDA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PROCESADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_REGISTRO_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasInsertables(COLUMNA_ID_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_PROCESADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_REGISTRO_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasModificables(COLUMNA_ID_BARRIO, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_PROCESADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
    }

    public Long getIdLogProAcrPotBen() {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_ACR_POT_BEN);
    }
    public Long getIdLogProAcrPotBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, rowKey);
    }
    public void setIdLogProAcrPotBen(Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, valor);
    }
    public void setIdLogProAcrPotBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_PRO_ACR_POT_BEN, rowKey, valor);
    }

    public Long getVersionLogProAcrPotBen() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN);
    }
    public Long getVersionLogProAcrPotBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, rowKey);
    }
    public void setVersionLogProAcrPotBen(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, valor);
    }
    public void setVersionLogProAcrPotBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_PRO_ACR_POT_BEN, rowKey, valor);
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

    public String getNombrePotencialBen() {
        return (String) super.getValue(COLUMNA_NOMBRE_POTENCIAL_BEN);
    }
    public String getNombrePotencialBen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_POTENCIAL_BEN, rowKey);
    }
    public void setNombrePotencialBen(String valor) {
        super.setValue(COLUMNA_NOMBRE_POTENCIAL_BEN, valor);
    }
    public void setNombrePotencialBen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_POTENCIAL_BEN, rowKey, valor);
    }

    public String getCodigoPotencialBen() {
        return (String) super.getValue(COLUMNA_CODIGO_POTENCIAL_BEN);
    }
    public String getCodigoPotencialBen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_POTENCIAL_BEN, rowKey);
    }
    public void setCodigoPotencialBen(String valor) {
        super.setValue(COLUMNA_CODIGO_POTENCIAL_BEN, valor);
    }
    public void setCodigoPotencialBen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_POTENCIAL_BEN, rowKey, valor);
    }

    public Timestamp getFechaRegistroPotBen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_POT_BEN);
    }
    public Timestamp getFechaRegistroPotBen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_POT_BEN, rowKey);
    }
    public void setFechaRegistroPotBen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_POT_BEN, valor);
    }
    public void setFechaRegistroPotBen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_POT_BEN, rowKey, valor);
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

    public Long getIdFichaPersona() {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA);
    }
    public Long getIdFichaPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA, rowKey);
    }
    public void setIdFichaPersona(Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, valor);
    }
    public void setIdFichaPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, rowKey, valor);
    }

    public String getCodigoFichaPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_PERSONA);
    }
    public String getCodigoFichaPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_PERSONA, rowKey);
    }
    public void setCodigoFichaPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_PERSONA, valor);
    }
    public void setCodigoFichaPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_PERSONA, rowKey, valor);
    }

    public String getNombreFichaPersona() {
        return (String) super.getValue(COLUMNA_NOMBRE_FICHA_PERSONA);
    }
    public String getNombreFichaPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FICHA_PERSONA, rowKey);
    }
    public void setNombreFichaPersona(String valor) {
        super.setValue(COLUMNA_NOMBRE_FICHA_PERSONA, valor);
    }
    public void setNombreFichaPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FICHA_PERSONA, rowKey, valor);
    }

    public Long getIdFichaHogar() {
        return (Long) super.getValue(COLUMNA_ID_FICHA_HOGAR);
    }
    public Long getIdFichaHogar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FICHA_HOGAR, rowKey);
    }
    public void setIdFichaHogar(Long valor) {
        super.setValue(COLUMNA_ID_FICHA_HOGAR, valor);
    }
    public void setIdFichaHogar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FICHA_HOGAR, rowKey, valor);
    }

    public String getCodigoFichaHogar() {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_HOGAR);
    }
    public String getCodigoFichaHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_HOGAR, rowKey);
    }
    public void setCodigoFichaHogar(String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_HOGAR, valor);
    }
    public void setCodigoFichaHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_HOGAR, rowKey, valor);
    }

    public BigDecimal getIndiceCalidadVida() {
        return (BigDecimal) super.getValue(COLUMNA_INDICE_CALIDAD_VIDA);
    }
    public BigDecimal getIndiceCalidadVida(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_INDICE_CALIDAD_VIDA, rowKey);
    }
    public void setIndiceCalidadVida(BigDecimal valor) {
        super.setValue(COLUMNA_INDICE_CALIDAD_VIDA, valor);
    }
    public void setIndiceCalidadVida(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_INDICE_CALIDAD_VIDA, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_pro_acr_pot_ben";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_pro_acr_pot_ben";

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
        return this.getIdLogProAcrPotBen();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogProAcrPotBen(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogProAcrPotBen(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogProAcrPotBen(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogProAcrPotBen();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogProAcrPotBen(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogProAcrPotBen(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogProAcrPotBen(rowKey, versionRecurso);
    }
}
