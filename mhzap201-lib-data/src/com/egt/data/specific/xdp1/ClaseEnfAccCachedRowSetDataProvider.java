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

public class ClaseEnfAccCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public ClaseEnfAccCachedRowSetDataProvider() {
        super();
    }

    public ClaseEnfAccCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_enf_acc";
    public static final String NOMBRE_DOMINIO_RECURSO = "Clases de Enfermedad y/o Accidente";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_enf_acc_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_enf_acc";

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

    public static final String COLUMNA_NUMERO_CLASE_ENF_ACC = "numero_clase_enf_acc";
    public static final String COLUMNA_CODIGO_CLASE_ENF_ACC = "codigo_clase_enf_acc";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_ENF_ACC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CLASE_ENF_ACC, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_ENF_ACC, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CLASE_ENF_ACC, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_ENF_ACC, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CLASE_ENF_ACC, true);
    }

    public Integer getNumeroClaseEnfAcc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_ACC);
    }
    public Integer getNumeroClaseEnfAcc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_ACC, rowKey);
    }
    public void setNumeroClaseEnfAcc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_ACC, valor);
    }
    public void setNumeroClaseEnfAcc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_ACC, rowKey, valor);
    }

    public String getCodigoClaseEnfAcc() {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_ENF_ACC);
    }
    public String getCodigoClaseEnfAcc(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_ENF_ACC, rowKey);
    }
    public void setCodigoClaseEnfAcc(String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_ENF_ACC, valor);
    }
    public void setCodigoClaseEnfAcc(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_ENF_ACC, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_clase_enf_acc";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_clase_enf_acc";

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
        return this.getCodigoClaseEnfAcc();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoClaseEnfAcc(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoClaseEnfAcc(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoClaseEnfAcc(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroClaseEnfAcc();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroClaseEnfAcc(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroClaseEnfAcc(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroClaseEnfAcc(rowKey, numeroRecurso);
    }
}
