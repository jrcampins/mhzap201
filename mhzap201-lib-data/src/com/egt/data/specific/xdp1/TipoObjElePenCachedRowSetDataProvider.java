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

public class TipoObjElePenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoObjElePenCachedRowSetDataProvider() {
        super();
    }

    public TipoObjElePenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_obj_ele_pen";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Objecion de Elegibilidad de Pension";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_obj_ele_pen_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_obj_ele_pen";

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

    public static final String COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN = "numero_tipo_obj_ele_pen";
    public static final String COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN = "codigo_tipo_obj_ele_pen";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, true);
    }

    public Integer getNumeroTipoObjElePen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN);
    }
    public Integer getNumeroTipoObjElePen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, rowKey);
    }
    public void setNumeroTipoObjElePen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, valor);
    }
    public void setNumeroTipoObjElePen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OBJ_ELE_PEN, rowKey, valor);
    }

    public String getCodigoTipoObjElePen() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN);
    }
    public String getCodigoTipoObjElePen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, rowKey);
    }
    public void setCodigoTipoObjElePen(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, valor);
    }
    public void setCodigoTipoObjElePen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_OBJ_ELE_PEN, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_obj_ele_pen";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_obj_ele_pen";

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
        return this.getCodigoTipoObjElePen();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoObjElePen(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoObjElePen(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoObjElePen(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoObjElePen();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoObjElePen(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoObjElePen(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoObjElePen(rowKey, numeroRecurso);
    }
}
