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

public class ProveedorDatExtCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public ProveedorDatExtCachedRowSetDataProvider() {
        super();
    }

    public ProveedorDatExtCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "proveedor_dat_ext";
    public static final String NOMBRE_DOMINIO_RECURSO = "Proveedores de Datos Externos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_proveedor_dat_ext_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "proveedor_dat_ext";

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

    public static final String COLUMNA_ID_PROVEEDOR_DAT_EXT = "id_proveedor_dat_ext";
    public static final String COLUMNA_VERSION_PROVEEDOR_DAT_EXT = "version_proveedor_dat_ext";
    public static final String COLUMNA_CODIGO_PROVEEDOR_DAT_EXT = "codigo_proveedor_dat_ext";
    public static final String COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT = "nombre_proveedor_dat_ext";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROVEEDOR_DAT_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, true);
    }

    public Long getIdProveedorDatExt() {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT);
    }
    public Long getIdProveedorDatExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setIdProveedorDatExt(Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, valor);
    }
    public void setIdProveedorDatExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public Long getVersionProveedorDatExt() {
        return (Long) super.getValue(COLUMNA_VERSION_PROVEEDOR_DAT_EXT);
    }
    public Long getVersionProveedorDatExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setVersionProveedorDatExt(Long valor) {
        super.setValue(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, valor);
    }
    public void setVersionProveedorDatExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public String getCodigoProveedorDatExt() {
        return (String) super.getValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT);
    }
    public String getCodigoProveedorDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setCodigoProveedorDatExt(String valor) {
        super.setValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, valor);
    }
    public void setCodigoProveedorDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public String getNombreProveedorDatExt() {
        return (String) super.getValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT);
    }
    public String getNombreProveedorDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setNombreProveedorDatExt(String valor) {
        super.setValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, valor);
    }
    public void setNombreProveedorDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PROVEEDOR_DAT_EXT, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_proveedor_dat_ext";
    public static final String COLUMNA_VERSION_RECURSO = "version_proveedor_dat_ext";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_proveedor_dat_ext";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_proveedor_dat_ext";

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
        return this.getIdProveedorDatExt();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdProveedorDatExt(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdProveedorDatExt(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdProveedorDatExt(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionProveedorDatExt();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionProveedorDatExt(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionProveedorDatExt(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionProveedorDatExt(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoProveedorDatExt();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoProveedorDatExt(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoProveedorDatExt(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoProveedorDatExt(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreProveedorDatExt();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreProveedorDatExt(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreProveedorDatExt(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreProveedorDatExt(rowKey, nombreRecurso);
    }
}
