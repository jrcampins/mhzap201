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

public class ClaseImpedimentoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public ClaseImpedimentoCachedRowSetDataProvider() {
        super();
    }

    public ClaseImpedimentoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_impedimento";
    public static final String NOMBRE_DOMINIO_RECURSO = "Clases de Impedimento";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_impedimento_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_impedimento";

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

    public static final String COLUMNA_NUMERO_CLASE_IMPEDIMENTO = "numero_clase_impedimento";
    public static final String COLUMNA_CODIGO_CLASE_IMPEDIMENTO = "codigo_clase_impedimento";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, true);
    }

    public Integer getNumeroClaseImpedimento() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO);
    }
    public Integer getNumeroClaseImpedimento(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, rowKey);
    }
    public void setNumeroClaseImpedimento(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, valor);
    }
    public void setNumeroClaseImpedimento(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, rowKey, valor);
    }

    public String getCodigoClaseImpedimento() {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_IMPEDIMENTO);
    }
    public String getCodigoClaseImpedimento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, rowKey);
    }
    public void setCodigoClaseImpedimento(String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, valor);
    }
    public void setCodigoClaseImpedimento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_IMPEDIMENTO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_clase_impedimento";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_clase_impedimento";

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
        return this.getCodigoClaseImpedimento();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoClaseImpedimento(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoClaseImpedimento(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoClaseImpedimento(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroClaseImpedimento();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroClaseImpedimento(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroClaseImpedimento(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroClaseImpedimento(rowKey, numeroRecurso);
    }
}
