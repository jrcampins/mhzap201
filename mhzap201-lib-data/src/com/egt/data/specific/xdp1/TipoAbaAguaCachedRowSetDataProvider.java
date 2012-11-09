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

public class TipoAbaAguaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoAbaAguaCachedRowSetDataProvider() {
        super();
    }

    public TipoAbaAguaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_aba_agua";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Abastecimiento de Agua";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_aba_agua_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_aba_agua";

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

    public static final String COLUMNA_NUMERO_TIPO_ABA_AGUA = "numero_tipo_aba_agua";
    public static final String COLUMNA_CODIGO_TIPO_ABA_AGUA = "codigo_tipo_aba_agua";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ABA_AGUA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_ABA_AGUA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ABA_AGUA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_ABA_AGUA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ABA_AGUA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_ABA_AGUA, true);
    }

    public Integer getNumeroTipoAbaAgua() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ABA_AGUA);
    }
    public Integer getNumeroTipoAbaAgua(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, rowKey);
    }
    public void setNumeroTipoAbaAgua(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, valor);
    }
    public void setNumeroTipoAbaAgua(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, rowKey, valor);
    }

    public String getCodigoTipoAbaAgua() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ABA_AGUA);
    }
    public String getCodigoTipoAbaAgua(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ABA_AGUA, rowKey);
    }
    public void setCodigoTipoAbaAgua(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ABA_AGUA, valor);
    }
    public void setCodigoTipoAbaAgua(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ABA_AGUA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_aba_agua";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_aba_agua";

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
        return this.getCodigoTipoAbaAgua();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoAbaAgua(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoAbaAgua(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoAbaAgua(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoAbaAgua();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoAbaAgua(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoAbaAgua(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoAbaAgua(rowKey, numeroRecurso);
    }
}
