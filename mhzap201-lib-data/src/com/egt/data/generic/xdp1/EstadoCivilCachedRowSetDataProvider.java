/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class EstadoCivilCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public EstadoCivilCachedRowSetDataProvider() {
        super();
    }

    public EstadoCivilCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "estado_civil";
    public static final String NOMBRE_DOMINIO_RECURSO = "Estados Civiles de Persona";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_estado_civil_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "estado_civil";

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

    public static final String COLUMNA_NUMERO_ESTADO_CIVIL = "numero_estado_civil";
    public static final String COLUMNA_CODIGO_ESTADO_CIVIL = "codigo_estado_civil";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ESTADO_CIVIL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ESTADO_CIVIL, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ESTADO_CIVIL, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ESTADO_CIVIL, true);
    }

    public Integer getNumeroEstadoCivil() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_CIVIL);
    }
    public Integer getNumeroEstadoCivil(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_CIVIL, rowKey);
    }
    public void setNumeroEstadoCivil(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_CIVIL, valor);
    }
    public void setNumeroEstadoCivil(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_CIVIL, rowKey, valor);
    }

    public String getCodigoEstadoCivil() {
        return (String) super.getValue(COLUMNA_CODIGO_ESTADO_CIVIL);
    }
    public String getCodigoEstadoCivil(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ESTADO_CIVIL, rowKey);
    }
    public void setCodigoEstadoCivil(String valor) {
        super.setValue(COLUMNA_CODIGO_ESTADO_CIVIL, valor);
    }
    public void setCodigoEstadoCivil(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ESTADO_CIVIL, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_estado_civil";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_estado_civil";

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
        return this.getCodigoEstadoCivil();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoEstadoCivil(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoEstadoCivil(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoEstadoCivil(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroEstadoCivil();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroEstadoCivil(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroEstadoCivil(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroEstadoCivil(rowKey, numeroRecurso);
    }
}
