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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class InformeCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public InformeCachedRowSetDataProvider() {
        super();
    }

    public InformeCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "informe";
    public static final String NOMBRE_DOMINIO_RECURSO = "Informes Globales";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_informe_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "informe";

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

    public static final String COLUMNA_ID_INFORME = "id_informe";
    public static final String COLUMNA_VERSION_INFORME = "version_informe";
    public static final String COLUMNA_CODIGO_INFORME = "codigo_informe";
    public static final String COLUMNA_NOMBRE_INFORME = "nombre_informe";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_INFORME, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_INFORME, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_INFORME, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_INFORME, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_INFORME, true);
        this.setColumnasInsertables(COLUMNA_VERSION_INFORME, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_INFORME, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_INFORME, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_INFORME, true);
        this.setColumnasModificables(COLUMNA_VERSION_INFORME, true);
        this.setColumnasModificables(COLUMNA_CODIGO_INFORME, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_INFORME, true);
    }

    public Long getIdInforme() {
        return (Long) super.getValue(COLUMNA_ID_INFORME);
    }
    public Long getIdInforme(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_INFORME, rowKey);
    }
    public void setIdInforme(Long valor) {
        super.setValue(COLUMNA_ID_INFORME, valor);
    }
    public void setIdInforme(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_INFORME, rowKey, valor);
    }

    public Long getVersionInforme() {
        return (Long) super.getValue(COLUMNA_VERSION_INFORME);
    }
    public Long getVersionInforme(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_INFORME, rowKey);
    }
    public void setVersionInforme(Long valor) {
        super.setValue(COLUMNA_VERSION_INFORME, valor);
    }
    public void setVersionInforme(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_INFORME, rowKey, valor);
    }

    public String getCodigoInforme() {
        return (String) super.getValue(COLUMNA_CODIGO_INFORME);
    }
    public String getCodigoInforme(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_INFORME, rowKey);
    }
    public void setCodigoInforme(String valor) {
        super.setValue(COLUMNA_CODIGO_INFORME, valor);
    }
    public void setCodigoInforme(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_INFORME, rowKey, valor);
    }

    public String getNombreInforme() {
        return (String) super.getValue(COLUMNA_NOMBRE_INFORME);
    }
    public String getNombreInforme(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_INFORME, rowKey);
    }
    public void setNombreInforme(String valor) {
        super.setValue(COLUMNA_NOMBRE_INFORME, valor);
    }
    public void setNombreInforme(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_INFORME, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_informe";
    public static final String COLUMNA_VERSION_RECURSO = "version_informe";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_informe";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_informe";

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
        return this.getIdInforme();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdInforme(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdInforme(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdInforme(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionInforme();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionInforme(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionInforme(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionInforme(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoInforme();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoInforme(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoInforme(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoInforme(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreInforme();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreInforme(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreInforme(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreInforme(rowKey, nombreRecurso);
    }
}
