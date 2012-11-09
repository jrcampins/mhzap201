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

public class CausaImpedimentoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public CausaImpedimentoCachedRowSetDataProvider() {
        super();
    }

    public CausaImpedimentoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "causa_impedimento";
    public static final String NOMBRE_DOMINIO_RECURSO = "Causas del Impedimento";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_causa_impedimento_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "causa_impedimento";

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

    public static final String COLUMNA_NUMERO_CAUSA_IMPEDIMENTO = "numero_causa_impedimento";
    public static final String COLUMNA_CODIGO_CAUSA_IMPEDIMENTO = "codigo_causa_impedimento";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, true);
    }

    public Integer getNumeroCausaImpedimento() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO);
    }
    public Integer getNumeroCausaImpedimento(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, rowKey);
    }
    public void setNumeroCausaImpedimento(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, valor);
    }
    public void setNumeroCausaImpedimento(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, rowKey, valor);
    }

    public String getCodigoCausaImpedimento() {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO);
    }
    public String getCodigoCausaImpedimento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, rowKey);
    }
    public void setCodigoCausaImpedimento(String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, valor);
    }
    public void setCodigoCausaImpedimento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CAUSA_IMPEDIMENTO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_causa_impedimento";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_causa_impedimento";

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
        return this.getCodigoCausaImpedimento();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoCausaImpedimento(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoCausaImpedimento(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoCausaImpedimento(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroCausaImpedimento();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroCausaImpedimento(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroCausaImpedimento(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroCausaImpedimento(rowKey, numeroRecurso);
    }
}
