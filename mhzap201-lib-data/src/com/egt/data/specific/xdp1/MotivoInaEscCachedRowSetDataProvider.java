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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class MotivoInaEscCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public MotivoInaEscCachedRowSetDataProvider() {
        super();
    }

    public MotivoInaEscCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "motivo_ina_esc";
    public static final String NOMBRE_DOMINIO_RECURSO = "Motivos de Inasistencia Escolar";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_motivo_ina_esc_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "motivo_ina_esc";

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

    public static final String COLUMNA_NUMERO_MOTIVO_INA_ESC = "numero_motivo_ina_esc";
    public static final String COLUMNA_CODIGO_MOTIVO_INA_ESC = "codigo_motivo_ina_esc";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_INA_ESC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_MOTIVO_INA_ESC, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_INA_ESC, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_MOTIVO_INA_ESC, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_INA_ESC, true);
        this.setColumnasModificables(COLUMNA_CODIGO_MOTIVO_INA_ESC, true);
    }

    public Integer getNumeroMotivoInaEsc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_INA_ESC);
    }
    public Integer getNumeroMotivoInaEsc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, rowKey);
    }
    public void setNumeroMotivoInaEsc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, valor);
    }
    public void setNumeroMotivoInaEsc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, rowKey, valor);
    }

    public String getCodigoMotivoInaEsc() {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_INA_ESC);
    }
    public String getCodigoMotivoInaEsc(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_INA_ESC, rowKey);
    }
    public void setCodigoMotivoInaEsc(String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_INA_ESC, valor);
    }
    public void setCodigoMotivoInaEsc(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_INA_ESC, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_motivo_ina_esc";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_motivo_ina_esc";

    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NUMERO_RECURSO = "Numero";

    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNumeroRecurso() {
        return COLUMNA_NUMERO_RECURSO;
    }

    @Override
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNumeroRecurso() {
        return ETIQUETA_NUMERO_RECURSO;
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoMotivoInaEsc();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoMotivoInaEsc(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoMotivoInaEsc(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoMotivoInaEsc(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroMotivoInaEsc();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroMotivoInaEsc(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroMotivoInaEsc(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroMotivoInaEsc(rowKey, numeroRecurso);
    }
}
