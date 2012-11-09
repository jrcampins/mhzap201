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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class OperadorComCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public OperadorComCachedRowSetDataProvider() {
        super();
    }

    public OperadorComCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "operador_com";
    public static final String NOMBRE_DOMINIO_RECURSO = "Operadores de Comparacion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_operador_com_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "operador_com";

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

    public static final String COLUMNA_NUMERO_OPERADOR_COM = "numero_operador_com";
    public static final String COLUMNA_CODIGO_OPERADOR_COM = "codigo_operador_com";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_OPERADOR_COM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPERADOR_COM, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPERADOR_COM, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_OPERADOR_COM, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPERADOR_COM, true);
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

    public String getCodigoOperadorCom() {
        return (String) super.getValue(COLUMNA_CODIGO_OPERADOR_COM);
    }
    public String getCodigoOperadorCom(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPERADOR_COM, rowKey);
    }
    public void setCodigoOperadorCom(String valor) {
        super.setValue(COLUMNA_CODIGO_OPERADOR_COM, valor);
    }
    public void setCodigoOperadorCom(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPERADOR_COM, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_operador_com";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_operador_com";

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
        return this.getCodigoOperadorCom();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoOperadorCom(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoOperadorCom(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoOperadorCom(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroOperadorCom();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroOperadorCom(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroOperadorCom(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroOperadorCom(rowKey, numeroRecurso);
    }
}
