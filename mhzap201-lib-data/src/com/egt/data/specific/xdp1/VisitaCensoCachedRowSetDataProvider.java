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

public class VisitaCensoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public VisitaCensoCachedRowSetDataProvider() {
        super();
    }

    public VisitaCensoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "visita_censo";
    public static final String NOMBRE_DOMINIO_RECURSO = "VisItas de Censo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_visita_censo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "visita_censo";

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

    public static final String COLUMNA_ID_VISITA_CENSO = "id_visita_censo";
    public static final String COLUMNA_VERSION_VISITA_CENSO = "version_visita_censo";
    public static final String COLUMNA_ID_POTENCIAL_BEN = "id_potencial_ben";
    public static final String COLUMNA_ID_FUNCIONARIO_CENSISTA = "id_funcionario_censista";
    public static final String COLUMNA_FECHA_VISITA = "fecha_visita";
    public static final String COLUMNA_OBSERVACIONES = "observaciones";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_VISITA_CENSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_VISITA_CENSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_POTENCIAL_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_CENSISTA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_VISITA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_VISITA_CENSO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_VISITA_CENSO, true);
        this.setColumnasInsertables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_CENSISTA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_VISITA, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_VISITA_CENSO, true);
        this.setColumnasModificables(COLUMNA_VERSION_VISITA_CENSO, true);
        this.setColumnasModificables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_CENSISTA, true);
        this.setColumnasModificables(COLUMNA_FECHA_VISITA, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES, true);
    }

    public Long getIdVisitaCenso() {
        return (Long) super.getValue(COLUMNA_ID_VISITA_CENSO);
    }
    public Long getIdVisitaCenso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_VISITA_CENSO, rowKey);
    }
    public void setIdVisitaCenso(Long valor) {
        super.setValue(COLUMNA_ID_VISITA_CENSO, valor);
    }
    public void setIdVisitaCenso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_VISITA_CENSO, rowKey, valor);
    }

    public Long getVersionVisitaCenso() {
        return (Long) super.getValue(COLUMNA_VERSION_VISITA_CENSO);
    }
    public Long getVersionVisitaCenso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_VISITA_CENSO, rowKey);
    }
    public void setVersionVisitaCenso(Long valor) {
        super.setValue(COLUMNA_VERSION_VISITA_CENSO, valor);
    }
    public void setVersionVisitaCenso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_VISITA_CENSO, rowKey, valor);
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

    public Long getIdFuncionarioCensista() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CENSISTA);
    }
    public Long getIdFuncionarioCensista(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, rowKey);
    }
    public void setIdFuncionarioCensista(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, valor);
    }
    public void setIdFuncionarioCensista(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, rowKey, valor);
    }

    public Timestamp getFechaVisita() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VISITA);
    }
    public Timestamp getFechaVisita(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VISITA, rowKey);
    }
    public void setFechaVisita(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VISITA, valor);
    }
    public void setFechaVisita(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VISITA, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_visita_censo";
    public static final String COLUMNA_VERSION_RECURSO = "version_visita_censo";

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
        return this.getIdVisitaCenso();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdVisitaCenso(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdVisitaCenso(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdVisitaCenso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionVisitaCenso();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionVisitaCenso(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionVisitaCenso(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionVisitaCenso(rowKey, versionRecurso);
    }
}
