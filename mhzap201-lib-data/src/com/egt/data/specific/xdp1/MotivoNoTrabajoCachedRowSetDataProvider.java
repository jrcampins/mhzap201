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

public class MotivoNoTrabajoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public MotivoNoTrabajoCachedRowSetDataProvider() {
        super();
    }

    public MotivoNoTrabajoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "motivo_no_trabajo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Motivos de No Trabajo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_motivo_no_trabajo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "motivo_no_trabajo";

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

    public static final String COLUMNA_NUMERO_MOTIVO_NO_TRABAJO = "numero_motivo_no_trabajo";
    public static final String COLUMNA_CODIGO_MOTIVO_NO_TRABAJO = "codigo_motivo_no_trabajo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, true);
    }

    public Integer getNumeroMotivoNoTrabajo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO);
    }
    public Integer getNumeroMotivoNoTrabajo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, rowKey);
    }
    public void setNumeroMotivoNoTrabajo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, valor);
    }
    public void setNumeroMotivoNoTrabajo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, rowKey, valor);
    }

    public String getCodigoMotivoNoTrabajo() {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO);
    }
    public String getCodigoMotivoNoTrabajo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, rowKey);
    }
    public void setCodigoMotivoNoTrabajo(String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, valor);
    }
    public void setCodigoMotivoNoTrabajo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_NO_TRABAJO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_motivo_no_trabajo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_motivo_no_trabajo";

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
        return this.getCodigoMotivoNoTrabajo();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoMotivoNoTrabajo(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoMotivoNoTrabajo(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoMotivoNoTrabajo(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroMotivoNoTrabajo();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroMotivoNoTrabajo(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroMotivoNoTrabajo(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroMotivoNoTrabajo(rowKey, numeroRecurso);
    }
}
