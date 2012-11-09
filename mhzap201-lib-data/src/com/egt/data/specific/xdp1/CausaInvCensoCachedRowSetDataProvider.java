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

public class CausaInvCensoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CausaInvCensoCachedRowSetDataProvider() {
        super();
    }

    public CausaInvCensoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "causa_inv_censo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Causas de Invalidacion de Censo";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_causa_inv_censo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "causa_inv_censo";

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

    public static final String COLUMNA_NUMERO_CAUSA_INV_CENSO = "numero_causa_inv_censo";
    public static final String COLUMNA_CODIGO_CAUSA_INV_CENSO = "codigo_causa_inv_censo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_INV_CENSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CAUSA_INV_CENSO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_INV_CENSO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CAUSA_INV_CENSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_INV_CENSO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CAUSA_INV_CENSO, true);
    }

    public Integer getNumeroCausaInvCenso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_INV_CENSO);
    }
    public Integer getNumeroCausaInvCenso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, rowKey);
    }
    public void setNumeroCausaInvCenso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, valor);
    }
    public void setNumeroCausaInvCenso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, rowKey, valor);
    }

    public String getCodigoCausaInvCenso() {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_INV_CENSO);
    }
    public String getCodigoCausaInvCenso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_INV_CENSO, rowKey);
    }
    public void setCodigoCausaInvCenso(String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_INV_CENSO, valor);
    }
    public void setCodigoCausaInvCenso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_INV_CENSO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_causa_inv_censo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_causa_inv_censo";

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
        return this.getCodigoCausaInvCenso();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCausaInvCenso(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCausaInvCenso(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCausaInvCenso(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCausaInvCenso();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCausaInvCenso(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCausaInvCenso(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCausaInvCenso(rowKey, numeroRecurso);
    }
}
