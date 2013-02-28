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
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.egt.core.db.xdp.RecursoJerarquizableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class UbicacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoJerarquizableDataProvider {

    public UbicacionCachedRowSetDataProvider() {
        super();
    }

    public UbicacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "ubicacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Ubicaciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_ubicacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "ubicacion";

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

    public static final String COLUMNA_ID_UBICACION = "id_ubicacion";
    public static final String COLUMNA_VERSION_UBICACION = "version_ubicacion";
    public static final String COLUMNA_CODIGO_UBICACION = "codigo_ubicacion";
    public static final String COLUMNA_NOMBRE_UBICACION = "nombre_ubicacion";
    public static final String COLUMNA_ID_UBICACION_SUPERIOR = "id_ubicacion_superior";
    public static final String COLUMNA_NUMERO_TIPO_NODO = "numero_tipo_nodo";
    public static final String COLUMNA_NUMERO_NIVEL_UBICACION = "numero_nivel_ubicacion";
    public static final String COLUMNA_SECUENCIA_UBICACION = "secuencia_ubicacion";
    public static final String COLUMNA_CLAVE_UBICACION = "clave_ubicacion";
    public static final String COLUMNA_NUMERO_TIPO_AREA = "numero_tipo_area";
    public static final String COLUMNA_CODIGO_UBICACION_JUPE = "codigo_ubicacion_jupe";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_UBICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_UBICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_UBICACION_SUPERIOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_NODO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_UBICACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SECUENCIA_UBICACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_AREA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_JUPE, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_ID_UBICACION_SUPERIOR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_SECUENCIA_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_JUPE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_UBICACION, true);
        this.setColumnasModificables(COLUMNA_VERSION_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION, true);
        this.setColumnasModificables(COLUMNA_ID_UBICACION_SUPERIOR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasModificables(COLUMNA_SECUENCIA_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_JUPE, true);
    }

    public Long getIdUbicacion() {
        return (Long) super.getValue(COLUMNA_ID_UBICACION);
    }
    public Long getIdUbicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_UBICACION, rowKey);
    }
    public void setIdUbicacion(Long valor) {
        super.setValue(COLUMNA_ID_UBICACION, valor);
    }
    public void setIdUbicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_UBICACION, rowKey, valor);
    }

    public Long getVersionUbicacion() {
        return (Long) super.getValue(COLUMNA_VERSION_UBICACION);
    }
    public Long getVersionUbicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_UBICACION, rowKey);
    }
    public void setVersionUbicacion(Long valor) {
        super.setValue(COLUMNA_VERSION_UBICACION, valor);
    }
    public void setVersionUbicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_UBICACION, rowKey, valor);
    }

    public String getCodigoUbicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION);
    }
    public String getCodigoUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION, rowKey);
    }
    public void setCodigoUbicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION, valor);
    }
    public void setCodigoUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION, rowKey, valor);
    }

    public String getNombreUbicacion() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION);
    }
    public String getNombreUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION, rowKey);
    }
    public void setNombreUbicacion(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION, valor);
    }
    public void setNombreUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION, rowKey, valor);
    }

    public Long getIdUbicacionSuperior() {
        return (Long) super.getValue(COLUMNA_ID_UBICACION_SUPERIOR);
    }
    public Long getIdUbicacionSuperior(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_UBICACION_SUPERIOR, rowKey);
    }
    public void setIdUbicacionSuperior(Long valor) {
        super.setValue(COLUMNA_ID_UBICACION_SUPERIOR, valor);
    }
    public void setIdUbicacionSuperior(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_UBICACION_SUPERIOR, rowKey, valor);
    }

    public Integer getNumeroTipoNodo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO);
    }
    public Integer getNumeroTipoNodo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO, rowKey);
    }
    public void setNumeroTipoNodo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, valor);
    }
    public void setNumeroTipoNodo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, rowKey, valor);
    }

    public Integer getNumeroNivelUbicacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION);
    }
    public Integer getNumeroNivelUbicacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey);
    }
    public void setNumeroNivelUbicacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, valor);
    }
    public void setNumeroNivelUbicacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey, valor);
    }

    public Integer getSecuenciaUbicacion() {
        return (Integer) super.getValue(COLUMNA_SECUENCIA_UBICACION);
    }
    public Integer getSecuenciaUbicacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_SECUENCIA_UBICACION, rowKey);
    }
    public void setSecuenciaUbicacion(Integer valor) {
        super.setValue(COLUMNA_SECUENCIA_UBICACION, valor);
    }
    public void setSecuenciaUbicacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_SECUENCIA_UBICACION, rowKey, valor);
    }

    public String getClaveUbicacion() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION);
    }
    public String getClaveUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION, rowKey);
    }
    public void setClaveUbicacion(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION, valor);
    }
    public void setClaveUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION, rowKey, valor);
    }

    public Integer getNumeroTipoArea() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA);
    }
    public Integer getNumeroTipoArea(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA, rowKey);
    }
    public void setNumeroTipoArea(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, valor);
    }
    public void setNumeroTipoArea(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, rowKey, valor);
    }

    public String getCodigoUbicacionJupe() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_JUPE);
    }
    public String getCodigoUbicacionJupe(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_JUPE, rowKey);
    }
    public void setCodigoUbicacionJupe(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_JUPE, valor);
    }
    public void setCodigoUbicacionJupe(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_JUPE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_ubicacion";
    public static final String COLUMNA_VERSION_RECURSO = "version_ubicacion";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_ubicacion";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_ubicacion";
    public static final String COLUMNA_RECURSO_SUPERIOR = "id_ubicacion_superior";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_RECURSO_SUPERIOR = "Ubicacion Superior";

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
    public String getColumnaRecursoSuperior() {
        return COLUMNA_RECURSO_SUPERIOR;
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
    public String getEtiquetaRecursoSuperior() {
        return ETIQUETA_RECURSO_SUPERIOR;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdUbicacion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdUbicacion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdUbicacion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdUbicacion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionUbicacion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionUbicacion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionUbicacion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionUbicacion(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoUbicacion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoUbicacion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoUbicacion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoUbicacion(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreUbicacion();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreUbicacion(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreUbicacion(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreUbicacion(rowKey, nombreRecurso);
    }

    @Override
    public Long getRecursoSuperior() {
        return this.getIdUbicacionSuperior();
    }
    @Override
    public Long getRecursoSuperior(RowKey rowKey) {
        return this.getIdUbicacionSuperior(rowKey);
    }
    @Override
    public void setRecursoSuperior(Long recursoSuperior) {
        this.setIdUbicacionSuperior(recursoSuperior);
    }
    @Override
    public void setRecursoSuperior(RowKey rowKey, Long recursoSuperior) {
        this.setIdUbicacionSuperior(rowKey, recursoSuperior);
    }
}
