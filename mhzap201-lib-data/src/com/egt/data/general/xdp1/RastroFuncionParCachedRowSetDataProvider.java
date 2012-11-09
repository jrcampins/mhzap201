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
package com.egt.data.general.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoIdentificableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class RastroFuncionParCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoIdentificableDataProvider {

    public RastroFuncionParCachedRowSetDataProvider() {
        super();
    }

    public RastroFuncionParCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rastro_funcion_par";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Parametros de Ejecuciones de Funciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rastro_funcion_par_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rastro_funcion_par";

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

    public static final String COLUMNA_ID_RASTRO_FUNCION_PAR = "id_rastro_funcion_par";
    public static final String COLUMNA_ID_RASTRO_FUNCION = "id_rastro_funcion";
    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";
    public static final String COLUMNA_VALOR_PARAMETRO = "valor_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_FUNCION_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RASTRO_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_PARAMETRO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_FUNCION_PAR, true);
        this.setColumnasInsertables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_VALOR_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_FUNCION_PAR, true);
        this.setColumnasModificables(COLUMNA_ID_RASTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_VALOR_PARAMETRO, true);
    }

    public Long getIdRastroFuncionPar() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION_PAR);
    }
    public Long getIdRastroFuncionPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION_PAR, rowKey);
    }
    public void setIdRastroFuncionPar(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION_PAR, valor);
    }
    public void setIdRastroFuncionPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION_PAR, rowKey, valor);
    }

    public Long getIdRastroFuncion() {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION);
    }
    public Long getIdRastroFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RASTRO_FUNCION, rowKey);
    }
    public void setIdRastroFuncion(Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION, valor);
    }
    public void setIdRastroFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RASTRO_FUNCION, rowKey, valor);
    }

    public Long getIdParametro() {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO);
    }
    public Long getIdParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO, rowKey);
    }
    public void setIdParametro(Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, valor);
    }
    public void setIdParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, rowKey, valor);
    }

    public String getValorParametro() {
        return (String) super.getValue(COLUMNA_VALOR_PARAMETRO);
    }
    public String getValorParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_PARAMETRO, rowKey);
    }
    public void setValorParametro(String valor) {
        super.setValue(COLUMNA_VALOR_PARAMETRO, valor);
    }
    public void setValorParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_PARAMETRO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rastro_funcion_par";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }

    @Override
    public String getEtiquetaIdentificacionRecurso() {
        return ETIQUETA_IDENTIFICACION_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdRastroFuncionPar();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRastroFuncionPar(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRastroFuncionPar(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRastroFuncionPar(rowKey, identificacionRecurso);
    }
}
