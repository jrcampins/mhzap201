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

public class CondicionPensionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CondicionPensionCachedRowSetDataProvider() {
        super();
    }

    public CondicionPensionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "condicion_pension";
    public static final String NOMBRE_DOMINIO_RECURSO = "Condiciones de Tramite de Pension";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_condicion_pension_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "condicion_pension";

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

    public static final String COLUMNA_NUMERO_CONDICION_PENSION = "numero_condicion_pension";
    public static final String COLUMNA_CODIGO_CONDICION_PENSION = "codigo_condicion_pension";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONDICION_PENSION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONDICION_PENSION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CONDICION_PENSION, true);
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

    public String getCodigoCondicionPension() {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_PENSION);
    }
    public String getCodigoCondicionPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONDICION_PENSION, rowKey);
    }
    public void setCodigoCondicionPension(String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_PENSION, valor);
    }
    public void setCodigoCondicionPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONDICION_PENSION, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_condicion_pension";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_condicion_pension";

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
        return this.getCodigoCondicionPension();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCondicionPension(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCondicionPension(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCondicionPension(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCondicionPension();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCondicionPension(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCondicionPension(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCondicionPension(rowKey, numeroRecurso);
    }
}
