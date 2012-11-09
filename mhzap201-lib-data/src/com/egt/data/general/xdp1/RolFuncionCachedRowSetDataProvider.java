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

public class RolFuncionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public RolFuncionCachedRowSetDataProvider() {
        super();
    }

    public RolFuncionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "rol_funcion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Funciones por Rol";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_rol_funcion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "rol_funcion";

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

    public static final String COLUMNA_ID_ROL_FUNCION = "id_rol_funcion";
    public static final String COLUMNA_VERSION_ROL_FUNCION = "version_rol_funcion";
    public static final String COLUMNA_ID_ROL = "id_rol";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ID_CONJUNTO_SEGMENTO = "id_conjunto_segmento";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ROL_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ROL, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CONJUNTO_SEGMENTO, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ROL_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ROL_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_ROL, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ROL_FUNCION, true);
        this.setColumnasModificables(COLUMNA_VERSION_ROL_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_ROL, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
    }

    public Long getIdRolFuncion() {
        return (Long) super.getValue(COLUMNA_ID_ROL_FUNCION);
    }
    public Long getIdRolFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ROL_FUNCION, rowKey);
    }
    public void setIdRolFuncion(Long valor) {
        super.setValue(COLUMNA_ID_ROL_FUNCION, valor);
    }
    public void setIdRolFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ROL_FUNCION, rowKey, valor);
    }

    public Long getVersionRolFuncion() {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_FUNCION);
    }
    public Long getVersionRolFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ROL_FUNCION, rowKey);
    }
    public void setVersionRolFuncion(Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_FUNCION, valor);
    }
    public void setVersionRolFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ROL_FUNCION, rowKey, valor);
    }

    public Long getIdRol() {
        return (Long) super.getValue(COLUMNA_ID_ROL);
    }
    public Long getIdRol(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ROL, rowKey);
    }
    public void setIdRol(Long valor) {
        super.setValue(COLUMNA_ID_ROL, valor);
    }
    public void setIdRol(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ROL, rowKey, valor);
    }

    public Long getIdFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION);
    }
    public Long getIdFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION, rowKey);
    }
    public void setIdFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, valor);
    }
    public void setIdFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, rowKey, valor);
    }

    public Long getIdConjuntoSegmento() {
        return (Long) super.getValue(COLUMNA_ID_CONJUNTO_SEGMENTO);
    }
    public Long getIdConjuntoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setIdConjuntoSegmento(Long valor) {
        super.setValue(COLUMNA_ID_CONJUNTO_SEGMENTO, valor);
    }
    public void setIdConjuntoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_rol_funcion";
    public static final String COLUMNA_VERSION_RECURSO = "version_rol_funcion";

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
        return this.getIdRolFuncion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdRolFuncion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdRolFuncion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdRolFuncion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionRolFuncion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionRolFuncion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionRolFuncion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionRolFuncion(rowKey, versionRecurso);
    }
}
