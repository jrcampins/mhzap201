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

public class TipoPiezaBanoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoPiezaBanoCachedRowSetDataProvider() {
        super();
    }

    public TipoPiezaBanoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_pieza_bano";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Pieza de Bano";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_pieza_bano_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_pieza_bano";

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

    public static final String COLUMNA_NUMERO_TIPO_PIEZA_BANO = "numero_tipo_pieza_bano";
    public static final String COLUMNA_CODIGO_TIPO_PIEZA_BANO = "codigo_tipo_pieza_bano";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PIEZA_BANO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_PIEZA_BANO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PIEZA_BANO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_PIEZA_BANO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PIEZA_BANO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_PIEZA_BANO, true);
    }

    public Integer getNumeroTipoPiezaBano() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO);
    }
    public Integer getNumeroTipoPiezaBano(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, rowKey);
    }
    public void setNumeroTipoPiezaBano(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, valor);
    }
    public void setNumeroTipoPiezaBano(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, rowKey, valor);
    }

    public String getCodigoTipoPiezaBano() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PIEZA_BANO);
    }
    public String getCodigoTipoPiezaBano(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PIEZA_BANO, rowKey);
    }
    public void setCodigoTipoPiezaBano(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PIEZA_BANO, valor);
    }
    public void setCodigoTipoPiezaBano(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PIEZA_BANO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_pieza_bano";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_pieza_bano";

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
        return this.getCodigoTipoPiezaBano();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoPiezaBano(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoPiezaBano(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoPiezaBano(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoPiezaBano();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoPiezaBano(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoPiezaBano(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoPiezaBano(rowKey, numeroRecurso);
    }
}
