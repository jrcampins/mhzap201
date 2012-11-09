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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class PaqueteCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider {

    public PaqueteCachedRowSetDataProvider() {
        super();
    }

    public PaqueteCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "paquete";
    public static final String NOMBRE_DOMINIO_RECURSO = "Paquetes";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_paquete_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "paquete";

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

    public static final String COLUMNA_ID_PAQUETE = "id_paquete";
    public static final String COLUMNA_VERSION_PAQUETE = "version_paquete";
    public static final String COLUMNA_CODIGO_PAQUETE = "codigo_paquete";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAQUETE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PAQUETE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PAQUETE, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PAQUETE, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PAQUETE, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PAQUETE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PAQUETE, true);
        this.setColumnasModificables(COLUMNA_VERSION_PAQUETE, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PAQUETE, true);
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

    public Long getVersionPaquete() {
        return (Long) super.getValue(COLUMNA_VERSION_PAQUETE);
    }
    public Long getVersionPaquete(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PAQUETE, rowKey);
    }
    public void setVersionPaquete(Long valor) {
        super.setValue(COLUMNA_VERSION_PAQUETE, valor);
    }
    public void setVersionPaquete(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PAQUETE, rowKey, valor);
    }

    public String getCodigoPaquete() {
        return (String) super.getValue(COLUMNA_CODIGO_PAQUETE);
    }
    public String getCodigoPaquete(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PAQUETE, rowKey);
    }
    public void setCodigoPaquete(String valor) {
        super.setValue(COLUMNA_CODIGO_PAQUETE, valor);
    }
    public void setCodigoPaquete(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PAQUETE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_paquete";
    public static final String COLUMNA_VERSION_RECURSO = "version_paquete";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_paquete";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";

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
    public Long getIdentificacionRecurso() {
        return this.getIdPaquete();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPaquete(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPaquete(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPaquete(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPaquete();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPaquete(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPaquete(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPaquete(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoPaquete();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoPaquete(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoPaquete(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoPaquete(rowKey, codigoRecurso);
    }
}
