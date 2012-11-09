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

public class EstadoSaludCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public EstadoSaludCachedRowSetDataProvider() {
        super();
    }

    public EstadoSaludCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "estado_salud";
    public static final String NOMBRE_DOMINIO_RECURSO = "Estados de Salud General";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_estado_salud_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "estado_salud";

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

    public static final String COLUMNA_NUMERO_ESTADO_SALUD = "numero_estado_salud";
    public static final String COLUMNA_CODIGO_ESTADO_SALUD = "codigo_estado_salud";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ESTADO_SALUD, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ESTADO_SALUD, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_ESTADO_SALUD, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ESTADO_SALUD, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_ESTADO_SALUD, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ESTADO_SALUD, true);
    }

    public Integer getNumeroEstadoSalud() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_SALUD);
    }
    public Integer getNumeroEstadoSalud(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_SALUD, rowKey);
    }
    public void setNumeroEstadoSalud(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_SALUD, valor);
    }
    public void setNumeroEstadoSalud(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_SALUD, rowKey, valor);
    }

    public String getCodigoEstadoSalud() {
        return (String) super.getValue(COLUMNA_CODIGO_ESTADO_SALUD);
    }
    public String getCodigoEstadoSalud(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ESTADO_SALUD, rowKey);
    }
    public void setCodigoEstadoSalud(String valor) {
        super.setValue(COLUMNA_CODIGO_ESTADO_SALUD, valor);
    }
    public void setCodigoEstadoSalud(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ESTADO_SALUD, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_estado_salud";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_estado_salud";

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
        return this.getCodigoEstadoSalud();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoEstadoSalud(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoEstadoSalud(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoEstadoSalud(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroEstadoSalud();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroEstadoSalud(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroEstadoSalud(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroEstadoSalud(rowKey, numeroRecurso);
    }
}
