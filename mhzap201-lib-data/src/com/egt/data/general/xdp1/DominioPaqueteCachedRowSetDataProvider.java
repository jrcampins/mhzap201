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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class DominioPaqueteCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public DominioPaqueteCachedRowSetDataProvider() {
        super();
    }

    public DominioPaqueteCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "dominio_paquete";
    public static final String NOMBRE_DOMINIO_RECURSO = "Dominios por Paquete";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_dominio_paquete_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "dominio_paquete";

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

    public static final String COLUMNA_ID_DOMINIO_PAQUETE = "id_dominio_paquete";
    public static final String COLUMNA_VERSION_DOMINIO_PAQUETE = "version_dominio_paquete";
    public static final String COLUMNA_ID_DOMINIO = "id_dominio";
    public static final String COLUMNA_ID_PAQUETE = "id_paquete";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO_PAQUETE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_DOMINIO_PAQUETE, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DOMINIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PAQUETE, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO_PAQUETE, true);
        this.setColumnasInsertables(COLUMNA_VERSION_DOMINIO_PAQUETE, true);
        this.setColumnasInsertables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasInsertables(COLUMNA_ID_PAQUETE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO_PAQUETE, true);
        this.setColumnasModificables(COLUMNA_VERSION_DOMINIO_PAQUETE, true);
        this.setColumnasModificables(COLUMNA_ID_DOMINIO, true);
        this.setColumnasModificables(COLUMNA_ID_PAQUETE, true);
    }

    public Long getIdDominioPaquete() {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_PAQUETE);
    }
    public Long getIdDominioPaquete(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DOMINIO_PAQUETE, rowKey);
    }
    public void setIdDominioPaquete(Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_PAQUETE, valor);
    }
    public void setIdDominioPaquete(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DOMINIO_PAQUETE, rowKey, valor);
    }

    public Long getVersionDominioPaquete() {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO_PAQUETE);
    }
    public Long getVersionDominioPaquete(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_DOMINIO_PAQUETE, rowKey);
    }
    public void setVersionDominioPaquete(Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO_PAQUETE, valor);
    }
    public void setVersionDominioPaquete(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_DOMINIO_PAQUETE, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_dominio_paquete";
    public static final String COLUMNA_VERSION_RECURSO = "version_dominio_paquete";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
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
    public Long getIdentificacionRecurso() {
        return this.getIdDominioPaquete();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdDominioPaquete(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdDominioPaquete(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdDominioPaquete(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionDominioPaquete();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionDominioPaquete(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionDominioPaquete(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionDominioPaquete(rowKey, versionRecurso);
    }
}
