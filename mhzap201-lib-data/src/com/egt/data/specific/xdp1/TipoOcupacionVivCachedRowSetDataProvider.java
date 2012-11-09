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

public class TipoOcupacionVivCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoOcupacionVivCachedRowSetDataProvider() {
        super();
    }

    public TipoOcupacionVivCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_ocupacion_viv";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Ocupacion de Vivienda";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_ocupacion_viv_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_ocupacion_viv";

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

    public static final String COLUMNA_NUMERO_TIPO_OCUPACION_VIV = "numero_tipo_ocupacion_viv";
    public static final String COLUMNA_CODIGO_TIPO_OCUPACION_VIV = "codigo_tipo_ocupacion_viv";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, true);
    }

    public Integer getNumeroTipoOcupacionViv() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV);
    }
    public Integer getNumeroTipoOcupacionViv(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, rowKey);
    }
    public void setNumeroTipoOcupacionViv(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, valor);
    }
    public void setNumeroTipoOcupacionViv(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, rowKey, valor);
    }

    public String getCodigoTipoOcupacionViv() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_OCUPACION_VIV);
    }
    public String getCodigoTipoOcupacionViv(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, rowKey);
    }
    public void setCodigoTipoOcupacionViv(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, valor);
    }
    public void setCodigoTipoOcupacionViv(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_OCUPACION_VIV, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_ocupacion_viv";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_ocupacion_viv";

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
        return this.getCodigoTipoOcupacionViv();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoOcupacionViv(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoOcupacionViv(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoOcupacionViv(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoOcupacionViv();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoOcupacionViv(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoOcupacionViv(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoOcupacionViv(rowKey, numeroRecurso);
    }
}
