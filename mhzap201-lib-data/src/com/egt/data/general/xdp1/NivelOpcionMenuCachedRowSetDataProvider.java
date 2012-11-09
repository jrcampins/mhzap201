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
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class NivelOpcionMenuCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public NivelOpcionMenuCachedRowSetDataProvider() {
        super();
    }

    public NivelOpcionMenuCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "nivel_opcion_menu";
    public static final String NOMBRE_DOMINIO_RECURSO = "Niveles Jerarquicos de Opciones de Menu";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_nivel_opcion_menu_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "nivel_opcion_menu";

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

    public static final String COLUMNA_NUMERO_NIVEL_OPCION_MENU = "numero_nivel_opcion_menu";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU = "codigo_nivel_opcion_menu";
    public static final String COLUMNA_DIGITOS_NIVEL_OPCION_MENU = "digitos_nivel_opcion_menu";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_OPCION_MENU, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, true);
    }

    public Integer getNumeroNivelOpcionMenu() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU);
    }
    public Integer getNumeroNivelOpcionMenu(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, rowKey);
    }
    public void setNumeroNivelOpcionMenu(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, valor);
    }
    public void setNumeroNivelOpcionMenu(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_OPCION_MENU, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU);
    }
    public String getCodigoNivelOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU, rowKey);
    }
    public void setCodigoNivelOpcionMenu(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU, valor);
    }
    public void setCodigoNivelOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU, rowKey, valor);
    }

    public Integer getDigitosNivelOpcionMenu() {
        return (Integer) super.getValue(COLUMNA_DIGITOS_NIVEL_OPCION_MENU);
    }
    public Integer getDigitosNivelOpcionMenu(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, rowKey);
    }
    public void setDigitosNivelOpcionMenu(Integer valor) {
        super.setValue(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, valor);
    }
    public void setDigitosNivelOpcionMenu(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_DIGITOS_NIVEL_OPCION_MENU, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_nivel_opcion_menu";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_nivel_opcion_menu";

    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NUMERO_RECURSO = "Numero";

    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNumeroRecurso() {
        return COLUMNA_NUMERO_RECURSO;
    }

    @Override
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNumeroRecurso() {
        return ETIQUETA_NUMERO_RECURSO;
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoNivelOpcionMenu();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoNivelOpcionMenu(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoNivelOpcionMenu(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoNivelOpcionMenu(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroNivelOpcionMenu();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroNivelOpcionMenu(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroNivelOpcionMenu(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroNivelOpcionMenu(rowKey, numeroRecurso);
    }
}
