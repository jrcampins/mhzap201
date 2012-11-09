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

public class FiltroClaRecFunCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public FiltroClaRecFunCachedRowSetDataProvider() {
        super();
    }

    public FiltroClaRecFunCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "filtro_cla_rec_fun";
    public static final String NOMBRE_DOMINIO_RECURSO = "Filtros por Funcion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_filtro_cla_rec_fun_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "filtro_cla_rec_fun";

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

    public static final String COLUMNA_ID_FILTRO_CLA_REC_FUN = "id_filtro_cla_rec_fun";
    public static final String COLUMNA_VERSION_FILTRO_CLA_REC_FUN = "version_filtro_cla_rec_fun";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA = "id_clase_recurso_par_columna";
    public static final String COLUMNA_NUMERO_OPERADOR_COM = "numero_operador_com";
    public static final String COLUMNA_ID_CLASE_RECURSO_PAR_VALOR = "id_clase_recurso_par_valor";
    public static final String COLUMNA_VALOR = "valor";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FILTRO_CLA_REC_FUN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_OPERADOR_COM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FILTRO_CLA_REC_FUN, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, true);
        this.setColumnasInsertables(COLUMNA_VALOR, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FILTRO_CLA_REC_FUN, true);
        this.setColumnasModificables(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, true);
        this.setColumnasModificables(COLUMNA_VALOR, true);
    }

    public Long getIdFiltroClaRecFun() {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_CLA_REC_FUN);
    }
    public Long getIdFiltroClaRecFun(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_CLA_REC_FUN, rowKey);
    }
    public void setIdFiltroClaRecFun(Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_CLA_REC_FUN, valor);
    }
    public void setIdFiltroClaRecFun(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_CLA_REC_FUN, rowKey, valor);
    }

    public Long getVersionFiltroClaRecFun() {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_CLA_REC_FUN);
    }
    public Long getVersionFiltroClaRecFun(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, rowKey);
    }
    public void setVersionFiltroClaRecFun(Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, valor);
    }
    public void setVersionFiltroClaRecFun(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_CLA_REC_FUN, rowKey, valor);
    }

    public Long getIdFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION);
    }
    public Long getIdFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION, rowKey);
    }
    public void setIdFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, valor);
    }
    public void setIdFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, rowKey, valor);
    }

    public Long getIdClaseRecursoParColumna() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA);
    }
    public Long getIdClaseRecursoParColumna(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, rowKey);
    }
    public void setIdClaseRecursoParColumna(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, valor);
    }
    public void setIdClaseRecursoParColumna(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA, rowKey, valor);
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

    public Long getIdClaseRecursoParValor() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR);
    }
    public Long getIdClaseRecursoParValor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, rowKey);
    }
    public void setIdClaseRecursoParValor(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, valor);
    }
    public void setIdClaseRecursoParValor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR, rowKey, valor);
    }

    public String getValor() {
        return (String) super.getValue(COLUMNA_VALOR);
    }
    public String getValor(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR, rowKey);
    }
    public void setValor(String valor) {
        super.setValue(COLUMNA_VALOR, valor);
    }
    public void setValor(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_filtro_cla_rec_fun";
    public static final String COLUMNA_VERSION_RECURSO = "version_filtro_cla_rec_fun";

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
        return this.getIdFiltroClaRecFun();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFiltroClaRecFun(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFiltroClaRecFun(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFiltroClaRecFun(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFiltroClaRecFun();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFiltroClaRecFun(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFiltroClaRecFun(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFiltroClaRecFun(rowKey, versionRecurso);
    }
}
