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

public class CondicionRecoPenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CondicionRecoPenCachedRowSetDataProvider() {
        super();
    }

    public CondicionRecoPenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "condicion_reco_pen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Condiciones de Reconsideracion de Pension";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_condicion_reco_pen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "condicion_reco_pen";

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

    public static final String COLUMNA_NUMERO_CONDICION_RECO_PEN = "numero_condicion_reco_pen";
    public static final String COLUMNA_CODIGO_CONDICION_RECO_PEN = "codigo_condicion_reco_pen";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_RECO_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONDICION_RECO_PEN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONDICION_RECO_PEN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CONDICION_RECO_PEN, true);
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

    public String getCodigoCondicionRecoPen() {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_RECO_PEN);
    }
    public String getCodigoCondicionRecoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_RECO_PEN, rowKey);
    }
    public void setCodigoCondicionRecoPen(String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_RECO_PEN, valor);
    }
    public void setCodigoCondicionRecoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_RECO_PEN, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_condicion_reco_pen";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_condicion_reco_pen";

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
        return this.getCodigoCondicionRecoPen();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCondicionRecoPen(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCondicionRecoPen(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCondicionRecoPen(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCondicionRecoPen();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCondicionRecoPen(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCondicionRecoPen(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCondicionRecoPen(rowKey, numeroRecurso);
    }
}
