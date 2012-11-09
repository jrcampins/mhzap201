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

public class AplicacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public AplicacionCachedRowSetDataProvider() {
        super();
    }

    public AplicacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "aplicacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Aplicaciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_aplicacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "aplicacion";

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

    public static final String COLUMNA_ID_APLICACION = "id_aplicacion";
    public static final String COLUMNA_VERSION_APLICACION = "version_aplicacion";
    public static final String COLUMNA_CODIGO_APLICACION = "codigo_aplicacion";
    public static final String COLUMNA_NOMBRE_APLICACION = "nombre_aplicacion";
    public static final String COLUMNA_DESCRIPCION_APLICACION = "descripcion_aplicacion";
    public static final String COLUMNA_SERVIDOR_APLICACION = "servidor_aplicacion";
    public static final String COLUMNA_PUERTO_APLICACION = "puerto_aplicacion";
    public static final String COLUMNA_URL_APLICACION = "url_aplicacion";
    public static final String COLUMNA_ES_PUBLICA = "es_publica";
    public static final String COLUMNA_ID_GRUPO_APLICACION = "id_grupo_aplicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_APLICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SERVIDOR_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PUERTO_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_URL_APLICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PUBLICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_GRUPO_APLICACION, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_SERVIDOR_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_PUERTO_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_URL_APLICACION, true);
        this.setColumnasInsertables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasInsertables(COLUMNA_ID_GRUPO_APLICACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_APLICACION, true);
        this.setColumnasModificables(COLUMNA_VERSION_APLICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_APLICACION, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_APLICACION, true);
        this.setColumnasModificables(COLUMNA_SERVIDOR_APLICACION, true);
        this.setColumnasModificables(COLUMNA_PUERTO_APLICACION, true);
        this.setColumnasModificables(COLUMNA_URL_APLICACION, true);
        this.setColumnasModificables(COLUMNA_ES_PUBLICA, true);
        this.setColumnasModificables(COLUMNA_ID_GRUPO_APLICACION, true);
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

    public Long getVersionAplicacion() {
        return (Long) super.getValue(COLUMNA_VERSION_APLICACION);
    }
    public Long getVersionAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_APLICACION, rowKey);
    }
    public void setVersionAplicacion(Long valor) {
        super.setValue(COLUMNA_VERSION_APLICACION, valor);
    }
    public void setVersionAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_APLICACION, rowKey, valor);
    }

    public String getCodigoAplicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_APLICACION);
    }
    public String getCodigoAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_APLICACION, rowKey);
    }
    public void setCodigoAplicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_APLICACION, valor);
    }
    public void setCodigoAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_APLICACION, rowKey, valor);
    }

    public String getNombreAplicacion() {
        return (String) super.getValue(COLUMNA_NOMBRE_APLICACION);
    }
    public String getNombreAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_APLICACION, rowKey);
    }
    public void setNombreAplicacion(String valor) {
        super.setValue(COLUMNA_NOMBRE_APLICACION, valor);
    }
    public void setNombreAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_APLICACION, rowKey, valor);
    }

    public String getDescripcionAplicacion() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_APLICACION);
    }
    public String getDescripcionAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_APLICACION, rowKey);
    }
    public void setDescripcionAplicacion(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_APLICACION, valor);
    }
    public void setDescripcionAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_APLICACION, rowKey, valor);
    }

    public String getServidorAplicacion() {
        return (String) super.getValue(COLUMNA_SERVIDOR_APLICACION);
    }
    public String getServidorAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SERVIDOR_APLICACION, rowKey);
    }
    public void setServidorAplicacion(String valor) {
        super.setValue(COLUMNA_SERVIDOR_APLICACION, valor);
    }
    public void setServidorAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SERVIDOR_APLICACION, rowKey, valor);
    }

    public String getPuertoAplicacion() {
        return (String) super.getValue(COLUMNA_PUERTO_APLICACION);
    }
    public String getPuertoAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PUERTO_APLICACION, rowKey);
    }
    public void setPuertoAplicacion(String valor) {
        super.setValue(COLUMNA_PUERTO_APLICACION, valor);
    }
    public void setPuertoAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PUERTO_APLICACION, rowKey, valor);
    }

    public String getUrlAplicacion() {
        return (String) super.getValue(COLUMNA_URL_APLICACION);
    }
    public String getUrlAplicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_URL_APLICACION, rowKey);
    }
    public void setUrlAplicacion(String valor) {
        super.setValue(COLUMNA_URL_APLICACION, valor);
    }
    public void setUrlAplicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_URL_APLICACION, rowKey, valor);
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

    public Long getIdGrupoAplicacion() {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_APLICACION);
    }
    public Long getIdGrupoAplicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_GRUPO_APLICACION, rowKey);
    }
    public void setIdGrupoAplicacion(Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_APLICACION, valor);
    }
    public void setIdGrupoAplicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_GRUPO_APLICACION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_aplicacion";
    public static final String COLUMNA_VERSION_RECURSO = "version_aplicacion";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_aplicacion";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_aplicacion";

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
        return this.getIdAplicacion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdAplicacion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdAplicacion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdAplicacion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionAplicacion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionAplicacion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionAplicacion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionAplicacion(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoAplicacion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoAplicacion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoAplicacion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoAplicacion(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreAplicacion();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreAplicacion(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreAplicacion(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreAplicacion(rowKey, nombreRecurso);
    }
}
