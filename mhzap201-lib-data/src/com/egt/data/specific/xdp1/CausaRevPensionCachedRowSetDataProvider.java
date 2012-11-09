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

public class CausaRevPensionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CausaRevPensionCachedRowSetDataProvider() {
        super();
    }

    public CausaRevPensionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "causa_rev_pension";
    public static final String NOMBRE_DOMINIO_RECURSO = "Causas de Revocacion de Pension";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_causa_rev_pension_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "causa_rev_pension";

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

    public static final String COLUMNA_NUMERO_CAUSA_REV_PENSION = "numero_causa_rev_pension";
    public static final String COLUMNA_CODIGO_CAUSA_REV_PENSION = "codigo_causa_rev_pension";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_REV_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CAUSA_REV_PENSION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_REV_PENSION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CAUSA_REV_PENSION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_REV_PENSION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CAUSA_REV_PENSION, true);
    }

    public Integer getNumeroCausaRevPension() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_REV_PENSION);
    }
    public Integer getNumeroCausaRevPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, rowKey);
    }
    public void setNumeroCausaRevPension(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, valor);
    }
    public void setNumeroCausaRevPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, rowKey, valor);
    }

    public String getCodigoCausaRevPension() {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_REV_PENSION);
    }
    public String getCodigoCausaRevPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_REV_PENSION, rowKey);
    }
    public void setCodigoCausaRevPension(String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_REV_PENSION, valor);
    }
    public void setCodigoCausaRevPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_REV_PENSION, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_causa_rev_pension";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_causa_rev_pension";

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
        return this.getCodigoCausaRevPension();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCausaRevPension(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCausaRevPension(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCausaRevPension(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCausaRevPension();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCausaRevPension(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCausaRevPension(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCausaRevPension(rowKey, numeroRecurso);
    }
}
