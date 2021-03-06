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

public class SionoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public SionoCachedRowSetDataProvider() {
        super();
    }

    public SionoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "siono";
    public static final String NOMBRE_DOMINIO_RECURSO = "Opciones de Si o No";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_siono_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "siono";

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

    public static final String COLUMNA_NUMERO_SIONO = "numero_siono";
    public static final String COLUMNA_CODIGO_SIONO = "codigo_siono";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_SIONO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_SIONO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_SIONO, true);
    }

    public Integer getNumeroSiono() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO);
    }
    public Integer getNumeroSiono(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO, rowKey);
    }
    public void setNumeroSiono(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO, valor);
    }
    public void setNumeroSiono(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO, rowKey, valor);
    }

    public String getCodigoSiono() {
        return (String) super.getValue(COLUMNA_CODIGO_SIONO);
    }
    public String getCodigoSiono(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_SIONO, rowKey);
    }
    public void setCodigoSiono(String valor) {
        super.setValue(COLUMNA_CODIGO_SIONO, valor);
    }
    public void setCodigoSiono(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_SIONO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_siono";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_siono";

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
        return this.getCodigoSiono();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoSiono(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoSiono(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoSiono(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroSiono();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroSiono(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroSiono(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroSiono(rowKey, numeroRecurso);
    }
}
