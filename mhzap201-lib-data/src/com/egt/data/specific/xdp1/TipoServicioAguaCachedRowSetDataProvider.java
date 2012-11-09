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

public class TipoServicioAguaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoServicioAguaCachedRowSetDataProvider() {
        super();
    }

    public TipoServicioAguaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_servicio_agua";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Servicio de Agua";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_servicio_agua_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_servicio_agua";

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

    public static final String COLUMNA_NUMERO_TIPO_SERVICIO_AGUA = "numero_tipo_servicio_agua";
    public static final String COLUMNA_CODIGO_TIPO_SERVICIO_AGUA = "codigo_tipo_servicio_agua";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, true);
    }

    public Integer getNumeroTipoServicioAgua() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA);
    }
    public Integer getNumeroTipoServicioAgua(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, rowKey);
    }
    public void setNumeroTipoServicioAgua(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, valor);
    }
    public void setNumeroTipoServicioAgua(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, rowKey, valor);
    }

    public String getCodigoTipoServicioAgua() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA);
    }
    public String getCodigoTipoServicioAgua(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, rowKey);
    }
    public void setCodigoTipoServicioAgua(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, valor);
    }
    public void setCodigoTipoServicioAgua(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_SERVICIO_AGUA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_servicio_agua";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_servicio_agua";

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
        return this.getCodigoTipoServicioAgua();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoServicioAgua(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoServicioAgua(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoServicioAgua(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoServicioAgua();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoServicioAgua(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoServicioAgua(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoServicioAgua(rowKey, numeroRecurso);
    }
}
