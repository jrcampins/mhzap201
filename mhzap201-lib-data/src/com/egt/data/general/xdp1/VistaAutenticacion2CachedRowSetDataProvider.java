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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class VistaAutenticacion2CachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public VistaAutenticacion2CachedRowSetDataProvider() {
        super();
    }

    public VistaAutenticacion2CachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "vista_autenticacion_2";
    public static final String NOMBRE_DOMINIO_RECURSO = "Roles";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM vista_autenticacion_2 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rol";

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

    public static final String COLUMNA_CODIGO_ROL = "codigo_rol";
    public static final String COLUMNA_NOMBRE_ROL = "nombre_rol";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ROL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ROL, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_CODIGO_ROL, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ROL, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_CODIGO_ROL, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ROL, true);
    }

    public String getCodigoRol() {
        return (String) super.getValue(COLUMNA_CODIGO_ROL);
    }
    public String getCodigoRol(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ROL, rowKey);
    }
    public void setCodigoRol(String valor) {
        super.setValue(COLUMNA_CODIGO_ROL, valor);
    }
    public void setCodigoRol(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ROL, rowKey, valor);
    }

    public String getNombreRol() {
        return (String) super.getValue(COLUMNA_NOMBRE_ROL);
    }
    public String getNombreRol(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ROL, rowKey);
    }
    public void setNombreRol(String valor) {
        super.setValue(COLUMNA_NOMBRE_ROL, valor);
    }
    public void setNombreRol(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ROL, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_rol";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_rol";

    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getCodigoRecurso() {
        return this.getCodigoRol();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoRol(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoRol(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoRol(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreRol();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreRol(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreRol(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreRol(rowKey, nombreRecurso);
    }
}
