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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FiltroFuncionParCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public FiltroFuncionParCachedRowSetDataProvider() {
        super();
    }

    public FiltroFuncionParCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "filtro_funcion_par";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros por Filtro";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_filtro_funcion_par_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "filtro_funcion_par";

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

    public static final String COLUMNA_ID_FILTRO_FUNCION_PAR = "id_filtro_funcion_par";
    public static final String COLUMNA_VERSION_FILTRO_FUNCION_PAR = "version_filtro_funcion_par";
    public static final String COLUMNA_ID_FILTRO_FUNCION = "id_filtro_funcion";
    public static final String COLUMNA_ID_FUNCION_PARAMETRO = "id_funcion_parametro";
    public static final String COLUMNA_NUMERO_OPERADOR_COM = "numero_operador_com";
    public static final String COLUMNA_ID_VALOR_LISTA = "id_valor_lista";
    public static final String COLUMNA_ID_OBJETO_VALOR = "id_objeto_valor";
    public static final String COLUMNA_ID_RECURSO_VALOR = "id_recurso_valor";
    public static final String COLUMNA_VALOR_PARAMETRO = "valor_parametro";
    public static final String COLUMNA_SIGNIFICADO_PARAMETRO = "significado_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FILTRO_FUNCION_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FILTRO_FUNCION_PAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FILTRO_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_OPERADOR_COM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_VALOR_LISTA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OBJETO_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_RECURSO_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SIGNIFICADO_PARAMETRO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FILTRO_FUNCION_PAR, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FILTRO_FUNCION_PAR, true);
        this.setColumnasInsertables(COLUMNA_ID_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasInsertables(COLUMNA_ID_VALOR_LISTA, true);
        this.setColumnasInsertables(COLUMNA_ID_OBJETO_VALOR, true);
        this.setColumnasInsertables(COLUMNA_ID_RECURSO_VALOR, true);
        this.setColumnasInsertables(COLUMNA_VALOR_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_SIGNIFICADO_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FILTRO_FUNCION_PAR, true);
        this.setColumnasModificables(COLUMNA_VERSION_FILTRO_FUNCION_PAR, true);
        this.setColumnasModificables(COLUMNA_ID_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasModificables(COLUMNA_ID_VALOR_LISTA, true);
        this.setColumnasModificables(COLUMNA_ID_OBJETO_VALOR, true);
        this.setColumnasModificables(COLUMNA_ID_RECURSO_VALOR, true);
        this.setColumnasModificables(COLUMNA_VALOR_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_SIGNIFICADO_PARAMETRO, true);
    }

    public Long getIdFiltroFuncionPar() {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION_PAR);
    }
    public Long getIdFiltroFuncionPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION_PAR, rowKey);
    }
    public void setIdFiltroFuncionPar(Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION_PAR, valor);
    }
    public void setIdFiltroFuncionPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION_PAR, rowKey, valor);
    }

    public Long getVersionFiltroFuncionPar() {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_FUNCION_PAR);
    }
    public Long getVersionFiltroFuncionPar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_FUNCION_PAR, rowKey);
    }
    public void setVersionFiltroFuncionPar(Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_FUNCION_PAR, valor);
    }
    public void setVersionFiltroFuncionPar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_FUNCION_PAR, rowKey, valor);
    }

    public Long getIdFiltroFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION);
    }
    public Long getIdFiltroFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION, rowKey);
    }
    public void setIdFiltroFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION, valor);
    }
    public void setIdFiltroFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION, rowKey, valor);
    }

    public Long getIdFuncionParametro() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_PARAMETRO);
    }
    public Long getIdFuncionParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_PARAMETRO, rowKey);
    }
    public void setIdFuncionParametro(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_PARAMETRO, valor);
    }
    public void setIdFuncionParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_PARAMETRO, rowKey, valor);
    }

    public Integer getNumeroOperadorCom() {
        return (Integer) super.getValue(COLUMNA_NUMERO_OPERADOR_COM);
    }
    public Integer getNumeroOperadorCom(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_OPERADOR_COM, rowKey);
    }
    public void setNumeroOperadorCom(Integer valor) {
        super.setValue(COLUMNA_NUMERO_OPERADOR_COM, valor);
    }
    public void setNumeroOperadorCom(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_OPERADOR_COM, rowKey, valor);
    }

    public Long getIdValorLista() {
        return (Long) super.getValue(COLUMNA_ID_VALOR_LISTA);
    }
    public Long getIdValorLista(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_VALOR_LISTA, rowKey);
    }
    public void setIdValorLista(Long valor) {
        super.setValue(COLUMNA_ID_VALOR_LISTA, valor);
    }
    public void setIdValorLista(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_VALOR_LISTA, rowKey, valor);
    }

    public Long getIdObjetoValor() {
        return (Long) super.getValue(COLUMNA_ID_OBJETO_VALOR);
    }
    public Long getIdObjetoValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OBJETO_VALOR, rowKey);
    }
    public void setIdObjetoValor(Long valor) {
        super.setValue(COLUMNA_ID_OBJETO_VALOR, valor);
    }
    public void setIdObjetoValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OBJETO_VALOR, rowKey, valor);
    }

    public Long getIdRecursoValor() {
        return (Long) super.getValue(COLUMNA_ID_RECURSO_VALOR);
    }
    public Long getIdRecursoValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_RECURSO_VALOR, rowKey);
    }
    public void setIdRecursoValor(Long valor) {
        super.setValue(COLUMNA_ID_RECURSO_VALOR, valor);
    }
    public void setIdRecursoValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_RECURSO_VALOR, rowKey, valor);
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

    public String getSignificadoParametro() {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_PARAMETRO);
    }
    public String getSignificadoParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_PARAMETRO, rowKey);
    }
    public void setSignificadoParametro(String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_PARAMETRO, valor);
    }
    public void setSignificadoParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_PARAMETRO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_filtro_funcion_par";
    public static final String COLUMNA_VERSION_RECURSO = "version_filtro_funcion_par";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }

    @Override
    public String getEtiquetaIdentificacionRecurso() {
        return ETIQUETA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getEtiquetaVersionRecurso() {
        return ETIQUETA_VERSION_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdFiltroFuncionPar();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFiltroFuncionPar(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFiltroFuncionPar(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFiltroFuncionPar(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFiltroFuncionPar();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFiltroFuncionPar(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFiltroFuncionPar(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFiltroFuncionPar(rowKey, versionRecurso);
    }
}
