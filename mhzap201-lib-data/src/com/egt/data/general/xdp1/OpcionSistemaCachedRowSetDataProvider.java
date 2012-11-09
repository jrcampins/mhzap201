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

public class OpcionSistemaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public OpcionSistemaCachedRowSetDataProvider() {
        super();
    }

    public OpcionSistemaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "opcion_sistema";
    public static final String NOMBRE_DOMINIO_RECURSO = "Opciones de Sistema";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_opcion_sistema_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "opcion_sistema";

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

    public static final String COLUMNA_ID_OPCION_SISTEMA = "id_opcion_sistema";
    public static final String COLUMNA_VERSION_OPCION_SISTEMA = "version_opcion_sistema";
    public static final String COLUMNA_CLAVE_OPCION_SISTEMA = "clave_opcion_sistema";
    public static final String COLUMNA_VALOR_OPCION_SISTEMA = "valor_opcion_sistema";
    public static final String COLUMNA_SIGNIFICADO_OPCION_SISTEMA = "significado_opcion_sistema";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OPCION_SISTEMA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_OPCION_SISTEMA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_SISTEMA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_OPCION_SISTEMA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_OPCION_SISTEMA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_OPCION_SISTEMA, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_SISTEMA, true);
        this.setColumnasInsertables(COLUMNA_VALOR_OPCION_SISTEMA, true);
        this.setColumnasInsertables(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_OPCION_SISTEMA, true);
        this.setColumnasModificables(COLUMNA_VERSION_OPCION_SISTEMA, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_SISTEMA, true);
        this.setColumnasModificables(COLUMNA_VALOR_OPCION_SISTEMA, true);
        this.setColumnasModificables(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, true);
    }

    public Long getIdOpcionSistema() {
        return (Long) super.getValue(COLUMNA_ID_OPCION_SISTEMA);
    }
    public Long getIdOpcionSistema(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OPCION_SISTEMA, rowKey);
    }
    public void setIdOpcionSistema(Long valor) {
        super.setValue(COLUMNA_ID_OPCION_SISTEMA, valor);
    }
    public void setIdOpcionSistema(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OPCION_SISTEMA, rowKey, valor);
    }

    public Long getVersionOpcionSistema() {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_SISTEMA);
    }
    public Long getVersionOpcionSistema(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_SISTEMA, rowKey);
    }
    public void setVersionOpcionSistema(Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_SISTEMA, valor);
    }
    public void setVersionOpcionSistema(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_SISTEMA, rowKey, valor);
    }

    public String getClaveOpcionSistema() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_SISTEMA);
    }
    public String getClaveOpcionSistema(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_SISTEMA, rowKey);
    }
    public void setClaveOpcionSistema(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_SISTEMA, valor);
    }
    public void setClaveOpcionSistema(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_SISTEMA, rowKey, valor);
    }

    public String getValorOpcionSistema() {
        return (String) super.getValue(COLUMNA_VALOR_OPCION_SISTEMA);
    }
    public String getValorOpcionSistema(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_OPCION_SISTEMA, rowKey);
    }
    public void setValorOpcionSistema(String valor) {
        super.setValue(COLUMNA_VALOR_OPCION_SISTEMA, valor);
    }
    public void setValorOpcionSistema(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_OPCION_SISTEMA, rowKey, valor);
    }

    public String getSignificadoOpcionSistema() {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_OPCION_SISTEMA);
    }
    public String getSignificadoOpcionSistema(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, rowKey);
    }
    public void setSignificadoOpcionSistema(String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, valor);
    }
    public void setSignificadoOpcionSistema(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_OPCION_SISTEMA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_opcion_sistema";
    public static final String COLUMNA_VERSION_RECURSO = "version_opcion_sistema";

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
        return this.getIdOpcionSistema();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdOpcionSistema(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdOpcionSistema(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdOpcionSistema(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionOpcionSistema();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionOpcionSistema(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionOpcionSistema(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionOpcionSistema(rowKey, versionRecurso);
    }
}
