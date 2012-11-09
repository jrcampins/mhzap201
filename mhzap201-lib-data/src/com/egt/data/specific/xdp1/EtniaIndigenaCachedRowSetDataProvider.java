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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class EtniaIndigenaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public EtniaIndigenaCachedRowSetDataProvider() {
        super();
    }

    public EtniaIndigenaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "etnia_indigena";
    public static final String NOMBRE_DOMINIO_RECURSO = "Etnias Indigenas";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_etnia_indigena_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "etnia_indigena";

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

    public static final String COLUMNA_ID_ETNIA_INDIGENA = "id_etnia_indigena";
    public static final String COLUMNA_VERSION_ETNIA_INDIGENA = "version_etnia_indigena";
    public static final String COLUMNA_CODIGO_ETNIA_INDIGENA = "codigo_etnia_indigena";
    public static final String COLUMNA_NOMBRE_ETNIA_INDIGENA = "nombre_etnia_indigena";
    public static final String COLUMNA_DESCRIPCION_ETNIA_INDIGENA = "descripcion_etnia_indigena";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ETNIA_INDIGENA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ETNIA_INDIGENA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ETNIA_INDIGENA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ETNIA_INDIGENA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ETNIA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ETNIA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ETNIA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ETNIA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ETNIA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_VERSION_ETNIA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ETNIA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ETNIA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, true);
    }

    public Long getIdEtniaIndigena() {
        return (Long) super.getValue(COLUMNA_ID_ETNIA_INDIGENA);
    }
    public Long getIdEtniaIndigena(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ETNIA_INDIGENA, rowKey);
    }
    public void setIdEtniaIndigena(Long valor) {
        super.setValue(COLUMNA_ID_ETNIA_INDIGENA, valor);
    }
    public void setIdEtniaIndigena(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ETNIA_INDIGENA, rowKey, valor);
    }

    public Long getVersionEtniaIndigena() {
        return (Long) super.getValue(COLUMNA_VERSION_ETNIA_INDIGENA);
    }
    public Long getVersionEtniaIndigena(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ETNIA_INDIGENA, rowKey);
    }
    public void setVersionEtniaIndigena(Long valor) {
        super.setValue(COLUMNA_VERSION_ETNIA_INDIGENA, valor);
    }
    public void setVersionEtniaIndigena(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ETNIA_INDIGENA, rowKey, valor);
    }

    public String getCodigoEtniaIndigena() {
        return (String) super.getValue(COLUMNA_CODIGO_ETNIA_INDIGENA);
    }
    public String getCodigoEtniaIndigena(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ETNIA_INDIGENA, rowKey);
    }
    public void setCodigoEtniaIndigena(String valor) {
        super.setValue(COLUMNA_CODIGO_ETNIA_INDIGENA, valor);
    }
    public void setCodigoEtniaIndigena(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ETNIA_INDIGENA, rowKey, valor);
    }

    public String getNombreEtniaIndigena() {
        return (String) super.getValue(COLUMNA_NOMBRE_ETNIA_INDIGENA);
    }
    public String getNombreEtniaIndigena(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ETNIA_INDIGENA, rowKey);
    }
    public void setNombreEtniaIndigena(String valor) {
        super.setValue(COLUMNA_NOMBRE_ETNIA_INDIGENA, valor);
    }
    public void setNombreEtniaIndigena(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ETNIA_INDIGENA, rowKey, valor);
    }

    public String getDescripcionEtniaIndigena() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ETNIA_INDIGENA);
    }
    public String getDescripcionEtniaIndigena(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, rowKey);
    }
    public void setDescripcionEtniaIndigena(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, valor);
    }
    public void setDescripcionEtniaIndigena(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_ETNIA_INDIGENA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_etnia_indigena";
    public static final String COLUMNA_VERSION_RECURSO = "version_etnia_indigena";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_etnia_indigena";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_etnia_indigena";

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
        return this.getIdEtniaIndigena();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdEtniaIndigena(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdEtniaIndigena(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdEtniaIndigena(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionEtniaIndigena();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionEtniaIndigena(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionEtniaIndigena(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionEtniaIndigena(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoEtniaIndigena();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoEtniaIndigena(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoEtniaIndigena(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoEtniaIndigena(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreEtniaIndigena();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreEtniaIndigena(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreEtniaIndigena(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreEtniaIndigena(rowKey, nombreRecurso);
    }
}
