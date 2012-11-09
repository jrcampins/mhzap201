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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class VistaAutenticacion1CachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider {

    public VistaAutenticacion1CachedRowSetDataProvider() {
        super();
    }

    public VistaAutenticacion1CachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "vista_autenticacion_1";
    public static final String NOMBRE_DOMINIO_RECURSO = "Usuarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM vista_autenticacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "usuario";

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

    public static final String COLUMNA_CODIGO_USUARIO = "codigo_usuario";
    public static final String COLUMNA_PASSWORD_USUARIO = "password_usuario";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PASSWORD_USUARIO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_PASSWORD_USUARIO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasModificables(COLUMNA_PASSWORD_USUARIO, true);
    }

    public String getCodigoUsuario() {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO);
    }
    public String getCodigoUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO, rowKey);
    }
    public void setCodigoUsuario(String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, valor);
    }
    public void setCodigoUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, rowKey, valor);
    }

    public String getPasswordUsuario() {
        return (String) super.getValue(COLUMNA_PASSWORD_USUARIO);
    }
    public String getPasswordUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PASSWORD_USUARIO, rowKey);
    }
    public void setPasswordUsuario(String valor) {
        super.setValue(COLUMNA_PASSWORD_USUARIO, valor);
    }
    public void setPasswordUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PASSWORD_USUARIO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_usuario";

    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";

    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }

    @Override
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoUsuario();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoUsuario(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoUsuario(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoUsuario(rowKey, codigoRecurso);
    }
}
