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

public class TipoRelacionLabCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoRelacionLabCachedRowSetDataProvider() {
        super();
    }

    public TipoRelacionLabCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_relacion_lab";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Relacion Laboral";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_relacion_lab_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_relacion_lab";

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

    public static final String COLUMNA_NUMERO_TIPO_RELACION_LAB = "numero_tipo_relacion_lab";
    public static final String COLUMNA_CODIGO_TIPO_RELACION_LAB = "codigo_tipo_relacion_lab";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RELACION_LAB, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_RELACION_LAB, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RELACION_LAB, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_RELACION_LAB, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RELACION_LAB, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_RELACION_LAB, true);
    }

    public Integer getNumeroTipoRelacionLab() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RELACION_LAB);
    }
    public Integer getNumeroTipoRelacionLab(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, rowKey);
    }
    public void setNumeroTipoRelacionLab(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, valor);
    }
    public void setNumeroTipoRelacionLab(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, rowKey, valor);
    }

    public String getCodigoTipoRelacionLab() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_RELACION_LAB);
    }
    public String getCodigoTipoRelacionLab(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_RELACION_LAB, rowKey);
    }
    public void setCodigoTipoRelacionLab(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_RELACION_LAB, valor);
    }
    public void setCodigoTipoRelacionLab(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_RELACION_LAB, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_relacion_lab";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_relacion_lab";

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
        return this.getCodigoTipoRelacionLab();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoRelacionLab(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoRelacionLab(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoRelacionLab(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoRelacionLab();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoRelacionLab(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoRelacionLab(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoRelacionLab(rowKey, numeroRecurso);
    }
}
