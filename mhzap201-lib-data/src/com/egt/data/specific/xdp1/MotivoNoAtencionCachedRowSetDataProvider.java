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

public class MotivoNoAtencionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public MotivoNoAtencionCachedRowSetDataProvider() {
        super();
    }

    public MotivoNoAtencionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "motivo_no_atencion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Motivos de No Atencion Medica";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_motivo_no_atencion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "motivo_no_atencion";

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

    public static final String COLUMNA_NUMERO_MOTIVO_NO_ATENCION = "numero_motivo_no_atencion";
    public static final String COLUMNA_CODIGO_MOTIVO_NO_ATENCION = "codigo_motivo_no_atencion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, true);
    }

    public Integer getNumeroMotivoNoAtencion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION);
    }
    public Integer getNumeroMotivoNoAtencion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, rowKey);
    }
    public void setNumeroMotivoNoAtencion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, valor);
    }
    public void setNumeroMotivoNoAtencion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, rowKey, valor);
    }

    public String getCodigoMotivoNoAtencion() {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_NO_ATENCION);
    }
    public String getCodigoMotivoNoAtencion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, rowKey);
    }
    public void setCodigoMotivoNoAtencion(String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, valor);
    }
    public void setCodigoMotivoNoAtencion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_MOTIVO_NO_ATENCION, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_motivo_no_atencion";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_motivo_no_atencion";

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
        return this.getCodigoMotivoNoAtencion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoMotivoNoAtencion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoMotivoNoAtencion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoMotivoNoAtencion(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroMotivoNoAtencion();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroMotivoNoAtencion(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroMotivoNoAtencion(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroMotivoNoAtencion(rowKey, numeroRecurso);
    }
}
