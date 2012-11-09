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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class ParametroCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public ParametroCachedRowSetDataProvider() {
        super();
    }

    public ParametroCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "parametro";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_parametro_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "parametro";

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

    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";
    public static final String COLUMNA_VERSION_PARAMETRO = "version_parametro";
    public static final String COLUMNA_CODIGO_PARAMETRO = "codigo_parametro";
    public static final String COLUMNA_NOMBRE_PARAMETRO = "nombre_parametro";
    public static final String COLUMNA_DETALLE_PARAMETRO = "detalle_parametro";
    public static final String COLUMNA_DESCRIPCION_PARAMETRO = "descripcion_parametro";
    public static final String COLUMNA_NUMERO_TIPO_DATO_PAR = "numero_tipo_dato_par";
    public static final String COLUMNA_ALIAS_PARAMETRO = "alias_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PARAMETRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DETALLE_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_PARAMETRO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_DATO_PAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ALIAS_PARAMETRO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_DETALLE_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_PARAMETRO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_DATO_PAR, true);
        this.setColumnasInsertables(COLUMNA_ALIAS_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_VERSION_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_DETALLE_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_PARAMETRO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_DATO_PAR, true);
        this.setColumnasModificables(COLUMNA_ALIAS_PARAMETRO, true);
    }

    public Long getIdParametro() {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO);
    }
    public Long getIdParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PARAMETRO, rowKey);
    }
    public void setIdParametro(Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, valor);
    }
    public void setIdParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PARAMETRO, rowKey, valor);
    }

    public Long getVersionParametro() {
        return (Long) super.getValue(COLUMNA_VERSION_PARAMETRO);
    }
    public Long getVersionParametro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PARAMETRO, rowKey);
    }
    public void setVersionParametro(Long valor) {
        super.setValue(COLUMNA_VERSION_PARAMETRO, valor);
    }
    public void setVersionParametro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PARAMETRO, rowKey, valor);
    }

    public String getCodigoParametro() {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO);
    }
    public String getCodigoParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO, rowKey);
    }
    public void setCodigoParametro(String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO, valor);
    }
    public void setCodigoParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO, rowKey, valor);
    }

    public String getNombreParametro() {
        return (String) super.getValue(COLUMNA_NOMBRE_PARAMETRO);
    }
    public String getNombreParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PARAMETRO, rowKey);
    }
    public void setNombreParametro(String valor) {
        super.setValue(COLUMNA_NOMBRE_PARAMETRO, valor);
    }
    public void setNombreParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PARAMETRO, rowKey, valor);
    }

    public String getDetalleParametro() {
        return (String) super.getValue(COLUMNA_DETALLE_PARAMETRO);
    }
    public String getDetalleParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DETALLE_PARAMETRO, rowKey);
    }
    public void setDetalleParametro(String valor) {
        super.setValue(COLUMNA_DETALLE_PARAMETRO, valor);
    }
    public void setDetalleParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DETALLE_PARAMETRO, rowKey, valor);
    }

    public String getDescripcionParametro() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PARAMETRO);
    }
    public String getDescripcionParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PARAMETRO, rowKey);
    }
    public void setDescripcionParametro(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PARAMETRO, valor);
    }
    public void setDescripcionParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PARAMETRO, rowKey, valor);
    }

    public Integer getNumeroTipoDatoPar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DATO_PAR);
    }
    public Integer getNumeroTipoDatoPar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DATO_PAR, rowKey);
    }
    public void setNumeroTipoDatoPar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DATO_PAR, valor);
    }
    public void setNumeroTipoDatoPar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DATO_PAR, rowKey, valor);
    }

    public String getAliasParametro() {
        return (String) super.getValue(COLUMNA_ALIAS_PARAMETRO);
    }
    public String getAliasParametro(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ALIAS_PARAMETRO, rowKey);
    }
    public void setAliasParametro(String valor) {
        super.setValue(COLUMNA_ALIAS_PARAMETRO, valor);
    }
    public void setAliasParametro(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ALIAS_PARAMETRO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_parametro";
    public static final String COLUMNA_VERSION_RECURSO = "version_parametro";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_parametro";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_parametro";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdParametro();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdParametro(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdParametro(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdParametro(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionParametro();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionParametro(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionParametro(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionParametro(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoParametro();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoParametro(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoParametro(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoParametro(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreParametro();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreParametro(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreParametro(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreParametro(rowKey, nombreRecurso);
    }
}
