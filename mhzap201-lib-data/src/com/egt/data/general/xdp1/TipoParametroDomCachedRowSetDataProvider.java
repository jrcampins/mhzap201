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

public class TipoParametroDomCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoParametroDomCachedRowSetDataProvider() {
        super();
    }

    public TipoParametroDomCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_parametro_dom";
    public static final String NOMBRE_DOMINIO_RECURSO = "Roles de Parametro";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_parametro_dom_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_parametro_dom";

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

    public static final String COLUMNA_NUMERO_TIPO_PARAMETRO_DOM = "numero_tipo_parametro_dom";
    public static final String COLUMNA_CODIGO_TIPO_PARAMETRO_DOM = "codigo_tipo_parametro_dom";
    public static final String COLUMNA_CODIGO_PROPIEDAD_INTERFAZ = "codigo_propiedad_interfaz";
    public static final String COLUMNA_NOMBRE_INTERFAZ = "nombre_interfaz";
    public static final String COLUMNA_ETIQUETA_PARAMETRO = "etiqueta_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_INTERFAZ, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ETIQUETA_PARAMETRO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_INTERFAZ, true);
        this.setColumnasInsertables(COLUMNA_ETIQUETA_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_INTERFAZ, true);
        this.setColumnasModificables(COLUMNA_ETIQUETA_PARAMETRO, true);
    }

    public Integer getNumeroTipoParametroDom() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM);
    }
    public Integer getNumeroTipoParametroDom(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, rowKey);
    }
    public void setNumeroTipoParametroDom(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, valor);
    }
    public void setNumeroTipoParametroDom(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PARAMETRO_DOM, rowKey, valor);
    }

    public String getCodigoTipoParametroDom() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM);
    }
    public String getCodigoTipoParametroDom(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, rowKey);
    }
    public void setCodigoTipoParametroDom(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, valor);
    }
    public void setCodigoTipoParametroDom(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PARAMETRO_DOM, rowKey, valor);
    }

    public String getCodigoPropiedadInterfaz() {
        return (String) super.getValue(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ);
    }
    public String getCodigoPropiedadInterfaz(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, rowKey);
    }
    public void setCodigoPropiedadInterfaz(String valor) {
        super.setValue(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, valor);
    }
    public void setCodigoPropiedadInterfaz(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PROPIEDAD_INTERFAZ, rowKey, valor);
    }

    public String getNombreInterfaz() {
        return (String) super.getValue(COLUMNA_NOMBRE_INTERFAZ);
    }
    public String getNombreInterfaz(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_INTERFAZ, rowKey);
    }
    public void setNombreInterfaz(String valor) {
        super.setValue(COLUMNA_NOMBRE_INTERFAZ, valor);
    }
    public void setNombreInterfaz(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_INTERFAZ, rowKey, valor);
    }

    public String getEtiquetaParametro() {
        return (String) super.getValue(COLUMNA_ETIQUETA_PARAMETRO);
    }
    public String getEtiquetaParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ETIQUETA_PARAMETRO, rowKey);
    }
    public void setEtiquetaParametro(String valor) {
        super.setValue(COLUMNA_ETIQUETA_PARAMETRO, valor);
    }
    public void setEtiquetaParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ETIQUETA_PARAMETRO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_parametro_dom";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_parametro_dom";

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
        return this.getCodigoTipoParametroDom();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoParametroDom(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoParametroDom(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoParametroDom(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoParametroDom();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoParametroDom(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoParametroDom(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoParametroDom(rowKey, numeroRecurso);
    }
}
