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

public class PaginaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public PaginaCachedRowSetDataProvider() {
        super();
    }

    public PaginaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "pagina";
    public static final String NOMBRE_DOMINIO_RECURSO = "Paginas";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_pagina_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "pagina";

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

    public static final String COLUMNA_ID_PAGINA = "id_pagina";
    public static final String COLUMNA_VERSION_PAGINA = "version_pagina";
    public static final String COLUMNA_CODIGO_PAGINA = "codigo_pagina";
    public static final String COLUMNA_NOMBRE_PAGINA = "nombre_pagina";
    public static final String COLUMNA_DESCRIPCION_PAGINA = "descripcion_pagina";
    public static final String COLUMNA_URL_PAGINA = "url_pagina";
    public static final String COLUMNA_ID_APLICACION = "id_aplicacion";
    public static final String COLUMNA_ES_PUBLICA = "es_publica";
    public static final String COLUMNA_NUMERO_TIPO_PAGINA = "numero_tipo_pagina";
    public static final String COLUMNA_ID_DOMINIO = "id_dominio";
    public static final String COLUMNA_ID_DOMINIO_MAESTRO = "id_dominio_maestro";
    public static final String COLUMNA_ID_PARAMETRO = "id_parametro";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PAGINA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_URL_PAGINA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PUBLICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PAGINA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO_MAESTRO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PARAMETRO, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_URL_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO_MAESTRO, true);
        this.setColumnasInsertables(COLUMNA_ID_PARAMETRO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PAGINA, true);
        this.setColumnasModificables(COLUMNA_VERSION_PAGINA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PAGINA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PAGINA, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_PAGINA, true);
        this.setColumnasModificables(COLUMNA_URL_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_APLICACION, true);
        this.setColumnasModificables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PAGINA, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO_MAESTRO, true);
        this.setColumnasModificables(COLUMNA_ID_PARAMETRO, true);
    }

    public Long getIdPagina() {
        return (Long) super.getValue(COLUMNA_ID_PAGINA);
    }
    public Long getIdPagina(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAGINA, rowKey);
    }
    public void setIdPagina(Long valor) {
        super.setValue(COLUMNA_ID_PAGINA, valor);
    }
    public void setIdPagina(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAGINA, rowKey, valor);
    }

    public Long getVersionPagina() {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA);
    }
    public Long getVersionPagina(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PAGINA, rowKey);
    }
    public void setVersionPagina(Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA, valor);
    }
    public void setVersionPagina(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PAGINA, rowKey, valor);
    }

    public String getCodigoPagina() {
        return (String) super.getValue(COLUMNA_CODIGO_PAGINA);
    }
    public String getCodigoPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PAGINA, rowKey);
    }
    public void setCodigoPagina(String valor) {
        super.setValue(COLUMNA_CODIGO_PAGINA, valor);
    }
    public void setCodigoPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PAGINA, rowKey, valor);
    }

    public String getNombrePagina() {
        return (String) super.getValue(COLUMNA_NOMBRE_PAGINA);
    }
    public String getNombrePagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PAGINA, rowKey);
    }
    public void setNombrePagina(String valor) {
        super.setValue(COLUMNA_NOMBRE_PAGINA, valor);
    }
    public void setNombrePagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PAGINA, rowKey, valor);
    }

    public String getDescripcionPagina() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PAGINA);
    }
    public String getDescripcionPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_PAGINA, rowKey);
    }
    public void setDescripcionPagina(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PAGINA, valor);
    }
    public void setDescripcionPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_PAGINA, rowKey, valor);
    }

    public String getUrlPagina() {
        return (String) super.getValue(COLUMNA_URL_PAGINA);
    }
    public String getUrlPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_URL_PAGINA, rowKey);
    }
    public void setUrlPagina(String valor) {
        super.setValue(COLUMNA_URL_PAGINA, valor);
    }
    public void setUrlPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_URL_PAGINA, rowKey, valor);
    }

    public Long getIdAplicacion() {
        return (Long) super.getValue(COLUMNA_ID_APLICACION);
    }
    public Long getIdAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_APLICACION, rowKey);
    }
    public void setIdAplicacion(Long valor) {
        super.setValue(COLUMNA_ID_APLICACION, valor);
    }
    public void setIdAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_APLICACION, rowKey, valor);
    }

    public Integer getEsPublica() {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA);
    }
    public Integer getEsPublica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICA, rowKey);
    }
    public void setEsPublica(Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, valor);
    }
    public void setEsPublica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICA, rowKey, valor);
    }

    public Integer getNumeroTipoPagina() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA);
    }
    public Integer getNumeroTipoPagina(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey);
    }
    public void setNumeroTipoPagina(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, valor);
    }
    public void setNumeroTipoPagina(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey, valor);
    }

    public Long getIdDominio() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO);
    }
    public Long getIdDominio(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO, rowKey);
    }
    public void setIdDominio(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO, valor);
    }
    public void setIdDominio(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO, rowKey, valor);
    }

    public Long getIdDominioMaestro() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_MAESTRO);
    }
    public Long getIdDominioMaestro(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_MAESTRO, rowKey);
    }
    public void setIdDominioMaestro(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_MAESTRO, valor);
    }
    public void setIdDominioMaestro(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_MAESTRO, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_pagina";
    public static final String COLUMNA_VERSION_RECURSO = "version_pagina";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_pagina";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_pagina";

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
        return this.getIdPagina();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPagina(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPagina(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPagina(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPagina();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPagina(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPagina(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPagina(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoPagina();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoPagina(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoPagina(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoPagina(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombrePagina();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombrePagina(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombrePagina(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombrePagina(rowKey, nombreRecurso);
    }
}
