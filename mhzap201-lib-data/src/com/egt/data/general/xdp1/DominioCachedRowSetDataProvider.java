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

public class DominioCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public DominioCachedRowSetDataProvider() {
        super();
    }

    public DominioCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "dominio";
    public static final String NOMBRE_DOMINIO_RECURSO = "Dominios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_dominio_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "dominio";

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

    public static final String COLUMNA_ID_DOMINIO = "id_dominio";
    public static final String COLUMNA_VERSION_DOMINIO = "version_dominio";
    public static final String COLUMNA_CODIGO_DOMINIO = "codigo_dominio";
    public static final String COLUMNA_NOMBRE_DOMINIO = "nombre_dominio";
    public static final String COLUMNA_DESCRIPCION_DOMINIO = "descripcion_dominio";
    public static final String COLUMNA_NOMBRE_TABLA = "nombre_tabla";
    public static final String COLUMNA_NUMERO_TIPO_DOMINIO = "numero_tipo_dominio";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";
    public static final String COLUMNA_ID_FUNCION_SELECCION = "id_funcion_seleccion";
    public static final String COLUMNA_ID_DOMINIO_SEGMENTO = "id_dominio_segmento";
    public static final String COLUMNA_ID_PAQUETE = "id_paquete";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_DOMINIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_DOMINIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_DOMINIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_TABLA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_DOMINIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION_SELECCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAQUETE, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_TABLA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION_SELECCION, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_PAQUETE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_VERSION_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_TABLA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION_SELECCION, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_PAQUETE, true);
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

    public Long getVersionDominio() {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO);
    }
    public Long getVersionDominio(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO, rowKey);
    }
    public void setVersionDominio(Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO, valor);
    }
    public void setVersionDominio(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO, rowKey, valor);
    }

    public String getCodigoDominio() {
        return (String) super.getValue(COLUMNA_CODIGO_DOMINIO);
    }
    public String getCodigoDominio(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_DOMINIO, rowKey);
    }
    public void setCodigoDominio(String valor) {
        super.setValue(COLUMNA_CODIGO_DOMINIO, valor);
    }
    public void setCodigoDominio(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_DOMINIO, rowKey, valor);
    }

    public String getNombreDominio() {
        return (String) super.getValue(COLUMNA_NOMBRE_DOMINIO);
    }
    public String getNombreDominio(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_DOMINIO, rowKey);
    }
    public void setNombreDominio(String valor) {
        super.setValue(COLUMNA_NOMBRE_DOMINIO, valor);
    }
    public void setNombreDominio(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_DOMINIO, rowKey, valor);
    }

    public String getDescripcionDominio() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_DOMINIO);
    }
    public String getDescripcionDominio(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_DOMINIO, rowKey);
    }
    public void setDescripcionDominio(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_DOMINIO, valor);
    }
    public void setDescripcionDominio(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_DOMINIO, rowKey, valor);
    }

    public String getNombreTabla() {
        return (String) super.getValue(COLUMNA_NOMBRE_TABLA);
    }
    public String getNombreTabla(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_TABLA, rowKey);
    }
    public void setNombreTabla(String valor) {
        super.setValue(COLUMNA_NOMBRE_TABLA, valor);
    }
    public void setNombreTabla(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_TABLA, rowKey, valor);
    }

    public Integer getNumeroTipoDominio() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DOMINIO);
    }
    public Integer getNumeroTipoDominio(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DOMINIO, rowKey);
    }
    public void setNumeroTipoDominio(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DOMINIO, valor);
    }
    public void setNumeroTipoDominio(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DOMINIO, rowKey, valor);
    }

    public Long getIdClaseRecurso() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO);
    }
    public Long getIdClaseRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO, rowKey);
    }
    public void setIdClaseRecurso(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, valor);
    }
    public void setIdClaseRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, rowKey, valor);
    }

    public Long getIdFuncionSeleccion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_SELECCION);
    }
    public Long getIdFuncionSeleccion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION_SELECCION, rowKey);
    }
    public void setIdFuncionSeleccion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_SELECCION, valor);
    }
    public void setIdFuncionSeleccion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION_SELECCION, rowKey, valor);
    }

    public Long getIdDominioSegmento() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_SEGMENTO);
    }
    public Long getIdDominioSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_SEGMENTO, rowKey);
    }
    public void setIdDominioSegmento(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_SEGMENTO, valor);
    }
    public void setIdDominioSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_SEGMENTO, rowKey, valor);
    }

    public Long getIdPaquete() {
        return (Long) super.getValue(COLUMNA_ID_PAQUETE);
    }
    public Long getIdPaquete(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PAQUETE, rowKey);
    }
    public void setIdPaquete(Long valor) {
        super.setValue(COLUMNA_ID_PAQUETE, valor);
    }
    public void setIdPaquete(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PAQUETE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_dominio";
    public static final String COLUMNA_VERSION_RECURSO = "version_dominio";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_dominio";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_dominio";

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
        return this.getIdDominio();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdDominio(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdDominio(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdDominio(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionDominio();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionDominio(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionDominio(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionDominio(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoDominio();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoDominio(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoDominio(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoDominio(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreDominio();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreDominio(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreDominio(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreDominio(rowKey, nombreRecurso);
    }
}
