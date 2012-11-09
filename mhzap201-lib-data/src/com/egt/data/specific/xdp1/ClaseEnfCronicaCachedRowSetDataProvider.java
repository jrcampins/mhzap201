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

public class ClaseEnfCronicaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public ClaseEnfCronicaCachedRowSetDataProvider() {
        super();
    }

    public ClaseEnfCronicaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "clase_enf_cronica";
    public static final String NOMBRE_DOMINIO_RECURSO = "Clases de Enfermedad Cronica";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_clase_enf_cronica_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "clase_enf_cronica";

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

    public static final String COLUMNA_NUMERO_CLASE_ENF_CRONICA = "numero_clase_enf_cronica";
    public static final String COLUMNA_CODIGO_CLASE_ENF_CRONICA = "codigo_clase_enf_cronica";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_ENF_CRONICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CLASE_ENF_CRONICA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_ENF_CRONICA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CLASE_ENF_CRONICA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_ENF_CRONICA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CLASE_ENF_CRONICA, true);
    }

    public Integer getNumeroClaseEnfCronica() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA);
    }
    public Integer getNumeroClaseEnfCronica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, rowKey);
    }
    public void setNumeroClaseEnfCronica(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, valor);
    }
    public void setNumeroClaseEnfCronica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, rowKey, valor);
    }

    public String getCodigoClaseEnfCronica() {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_ENF_CRONICA);
    }
    public String getCodigoClaseEnfCronica(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CLASE_ENF_CRONICA, rowKey);
    }
    public void setCodigoClaseEnfCronica(String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_ENF_CRONICA, valor);
    }
    public void setCodigoClaseEnfCronica(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CLASE_ENF_CRONICA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_clase_enf_cronica";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_clase_enf_cronica";

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
        return this.getCodigoClaseEnfCronica();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoClaseEnfCronica(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoClaseEnfCronica(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoClaseEnfCronica(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroClaseEnfCronica();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroClaseEnfCronica(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroClaseEnfCronica(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroClaseEnfCronica(rowKey, numeroRecurso);
    }
}
