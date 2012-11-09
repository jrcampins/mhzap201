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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class OpcionMenuPlusCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider {

    public OpcionMenuPlusCachedRowSetDataProvider() {
        super();
    }

    public OpcionMenuPlusCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "opcion_menu_plus";
    public static final String NOMBRE_DOMINIO_RECURSO = "Opciones de Menu";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_opcion_menu_plus_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "opcion_menu_plus";

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

    public static final String COLUMNA_ID_OPCION_MENU = "id_opcion_menu";
    public static final String COLUMNA_VERSION_OPCION_MENU = "version_opcion_menu";
    public static final String COLUMNA_NUMERO_TIPO_NODO = "numero_tipo_nodo";
    public static final String COLUMNA_NUMERO_NIVEL_OPCION_MENU = "numero_nivel_opcion_menu";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU = "codigo_nivel_opcion_menu";
    public static final String COLUMNA_CODIGO_OPCION_MENU = "codigo_opcion_menu";
    public static final String COLUMNA_NOMBRE_OPCION_MENU = "nombre_opcion_menu";
    public static final String COLUMNA_CLAVE_OPCION_MENU = "clave_opcion_menu";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_01 = "codigo_nivel_opcion_menu_01";
    public static final String COLUMNA_CODIGO_OPCION_MENU_01 = "codigo_opcion_menu_01";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_01 = "nombre_opcion_menu_01";
    public static final String COLUMNA_CLAVE_OPCION_MENU_01 = "clave_opcion_menu_01";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_02 = "codigo_nivel_opcion_menu_02";
    public static final String COLUMNA_CODIGO_OPCION_MENU_02 = "codigo_opcion_menu_02";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_02 = "nombre_opcion_menu_02";
    public static final String COLUMNA_CLAVE_OPCION_MENU_02 = "clave_opcion_menu_02";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_03 = "codigo_nivel_opcion_menu_03";
    public static final String COLUMNA_CODIGO_OPCION_MENU_03 = "codigo_opcion_menu_03";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_03 = "nombre_opcion_menu_03";
    public static final String COLUMNA_CLAVE_OPCION_MENU_03 = "clave_opcion_menu_03";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_04 = "codigo_nivel_opcion_menu_04";
    public static final String COLUMNA_CODIGO_OPCION_MENU_04 = "codigo_opcion_menu_04";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_04 = "nombre_opcion_menu_04";
    public static final String COLUMNA_CLAVE_OPCION_MENU_04 = "clave_opcion_menu_04";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_05 = "codigo_nivel_opcion_menu_05";
    public static final String COLUMNA_CODIGO_OPCION_MENU_05 = "codigo_opcion_menu_05";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_05 = "nombre_opcion_menu_05";
    public static final String COLUMNA_CLAVE_OPCION_MENU_05 = "clave_opcion_menu_05";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_06 = "codigo_nivel_opcion_menu_06";
    public static final String COLUMNA_CODIGO_OPCION_MENU_06 = "codigo_opcion_menu_06";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_06 = "nombre_opcion_menu_06";
    public static final String COLUMNA_CLAVE_OPCION_MENU_06 = "clave_opcion_menu_06";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_07 = "codigo_nivel_opcion_menu_07";
    public static final String COLUMNA_CODIGO_OPCION_MENU_07 = "codigo_opcion_menu_07";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_07 = "nombre_opcion_menu_07";
    public static final String COLUMNA_CLAVE_OPCION_MENU_07 = "clave_opcion_menu_07";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_08 = "codigo_nivel_opcion_menu_08";
    public static final String COLUMNA_CODIGO_OPCION_MENU_08 = "codigo_opcion_menu_08";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_08 = "nombre_opcion_menu_08";
    public static final String COLUMNA_CLAVE_OPCION_MENU_08 = "clave_opcion_menu_08";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_09 = "codigo_nivel_opcion_menu_09";
    public static final String COLUMNA_CODIGO_OPCION_MENU_09 = "codigo_opcion_menu_09";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_09 = "nombre_opcion_menu_09";
    public static final String COLUMNA_CLAVE_OPCION_MENU_09 = "clave_opcion_menu_09";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_10 = "codigo_nivel_opcion_menu_10";
    public static final String COLUMNA_CODIGO_OPCION_MENU_10 = "codigo_opcion_menu_10";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_10 = "nombre_opcion_menu_10";
    public static final String COLUMNA_CLAVE_OPCION_MENU_10 = "clave_opcion_menu_10";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_11 = "codigo_nivel_opcion_menu_11";
    public static final String COLUMNA_CODIGO_OPCION_MENU_11 = "codigo_opcion_menu_11";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_11 = "nombre_opcion_menu_11";
    public static final String COLUMNA_CLAVE_OPCION_MENU_11 = "clave_opcion_menu_11";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_12 = "codigo_nivel_opcion_menu_12";
    public static final String COLUMNA_CODIGO_OPCION_MENU_12 = "codigo_opcion_menu_12";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_12 = "nombre_opcion_menu_12";
    public static final String COLUMNA_CLAVE_OPCION_MENU_12 = "clave_opcion_menu_12";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_13 = "codigo_nivel_opcion_menu_13";
    public static final String COLUMNA_CODIGO_OPCION_MENU_13 = "codigo_opcion_menu_13";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_13 = "nombre_opcion_menu_13";
    public static final String COLUMNA_CLAVE_OPCION_MENU_13 = "clave_opcion_menu_13";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_14 = "codigo_nivel_opcion_menu_14";
    public static final String COLUMNA_CODIGO_OPCION_MENU_14 = "codigo_opcion_menu_14";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_14 = "nombre_opcion_menu_14";
    public static final String COLUMNA_CLAVE_OPCION_MENU_14 = "clave_opcion_menu_14";
    public static final String COLUMNA_CODIGO_NIVEL_OPCION_MENU_15 = "codigo_nivel_opcion_menu_15";
    public static final String COLUMNA_CODIGO_OPCION_MENU_15 = "codigo_opcion_menu_15";
    public static final String COLUMNA_NOMBRE_OPCION_MENU_15 = "nombre_opcion_menu_15";
    public static final String COLUMNA_CLAVE_OPCION_MENU_15 = "clave_opcion_menu_15";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_OPCION_MENU, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_OPCION_MENU, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_NODO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_OPCION_MENU, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_MENU_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_OPCION_MENU_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_OPCION_MENU_15, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_VERSION_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_01, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_01, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_01, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_02, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_02, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_02, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_03, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_03, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_03, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_04, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_04, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_04, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_05, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_05, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_05, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_06, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_06, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_06, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_07, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_07, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_07, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_08, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_08, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_08, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_09, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_09, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_09, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_10, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_10, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_10, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_11, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_11, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_11, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_12, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_12, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_12, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_13, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_13, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_13, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_14, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_14, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_14, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_MENU_15, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_OPCION_MENU_15, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_OPCION_MENU_15, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_VERSION_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_01, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_01, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_01, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_02, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_02, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_02, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_03, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_03, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_03, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_04, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_04, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_04, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_05, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_05, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_05, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_06, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_06, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_06, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_07, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_07, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_07, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_08, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_08, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_08, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_09, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_09, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_09, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_10, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_10, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_10, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_11, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_11, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_11, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_12, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_12, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_12, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_13, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_13, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_13, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_14, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_14, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_14, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_MENU_15, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_OPCION_MENU_15, true);
        this.setColumnasModificables(COLUMNA_CLAVE_OPCION_MENU_15, true);
    }

    public Long getIdOpcionMenu() {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU);
    }
    public Long getIdOpcionMenu(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_OPCION_MENU, rowKey);
    }
    public void setIdOpcionMenu(Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU, valor);
    }
    public void setIdOpcionMenu(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_OPCION_MENU, rowKey, valor);
    }

    public Long getVersionOpcionMenu() {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_MENU);
    }
    public Long getVersionOpcionMenu(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_OPCION_MENU, rowKey);
    }
    public void setVersionOpcionMenu(Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_MENU, valor);
    }
    public void setVersionOpcionMenu(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_OPCION_MENU, rowKey, valor);
    }

    public Integer getNumeroTipoNodo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO);
    }
    public Integer getNumeroTipoNodo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_NODO, rowKey);
    }
    public void setNumeroTipoNodo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, valor);
    }
    public void setNumeroTipoNodo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_NODO, rowKey, valor);
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

    public String getCodigoOpcionMenu() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU);
    }
    public String getCodigoOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU, rowKey);
    }
    public void setCodigoOpcionMenu(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU, valor);
    }
    public void setCodigoOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU, rowKey, valor);
    }

    public String getNombreOpcionMenu() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU);
    }
    public String getNombreOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU, rowKey);
    }
    public void setNombreOpcionMenu(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU, valor);
    }
    public void setNombreOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU, rowKey, valor);
    }

    public String getClaveOpcionMenu() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU);
    }
    public String getClaveOpcionMenu(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU, rowKey);
    }
    public void setClaveOpcionMenu(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU, valor);
    }
    public void setClaveOpcionMenu(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu01() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01);
    }
    public String getCodigoNivelOpcionMenu01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, rowKey);
    }
    public void setCodigoNivelOpcionMenu01(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, valor);
    }
    public void setCodigoNivelOpcionMenu01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_01, rowKey, valor);
    }

    public String getCodigoOpcionMenu01() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_01);
    }
    public String getCodigoOpcionMenu01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_01, rowKey);
    }
    public void setCodigoOpcionMenu01(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_01, valor);
    }
    public void setCodigoOpcionMenu01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_01, rowKey, valor);
    }

    public String getNombreOpcionMenu01() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_01);
    }
    public String getNombreOpcionMenu01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_01, rowKey);
    }
    public void setNombreOpcionMenu01(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_01, valor);
    }
    public void setNombreOpcionMenu01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_01, rowKey, valor);
    }

    public String getClaveOpcionMenu01() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_01);
    }
    public String getClaveOpcionMenu01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_01, rowKey);
    }
    public void setClaveOpcionMenu01(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_01, valor);
    }
    public void setClaveOpcionMenu01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_01, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu02() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02);
    }
    public String getCodigoNivelOpcionMenu02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, rowKey);
    }
    public void setCodigoNivelOpcionMenu02(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, valor);
    }
    public void setCodigoNivelOpcionMenu02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_02, rowKey, valor);
    }

    public String getCodigoOpcionMenu02() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_02);
    }
    public String getCodigoOpcionMenu02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_02, rowKey);
    }
    public void setCodigoOpcionMenu02(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_02, valor);
    }
    public void setCodigoOpcionMenu02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_02, rowKey, valor);
    }

    public String getNombreOpcionMenu02() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_02);
    }
    public String getNombreOpcionMenu02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_02, rowKey);
    }
    public void setNombreOpcionMenu02(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_02, valor);
    }
    public void setNombreOpcionMenu02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_02, rowKey, valor);
    }

    public String getClaveOpcionMenu02() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_02);
    }
    public String getClaveOpcionMenu02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_02, rowKey);
    }
    public void setClaveOpcionMenu02(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_02, valor);
    }
    public void setClaveOpcionMenu02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_02, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu03() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03);
    }
    public String getCodigoNivelOpcionMenu03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, rowKey);
    }
    public void setCodigoNivelOpcionMenu03(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, valor);
    }
    public void setCodigoNivelOpcionMenu03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_03, rowKey, valor);
    }

    public String getCodigoOpcionMenu03() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_03);
    }
    public String getCodigoOpcionMenu03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_03, rowKey);
    }
    public void setCodigoOpcionMenu03(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_03, valor);
    }
    public void setCodigoOpcionMenu03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_03, rowKey, valor);
    }

    public String getNombreOpcionMenu03() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_03);
    }
    public String getNombreOpcionMenu03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_03, rowKey);
    }
    public void setNombreOpcionMenu03(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_03, valor);
    }
    public void setNombreOpcionMenu03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_03, rowKey, valor);
    }

    public String getClaveOpcionMenu03() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_03);
    }
    public String getClaveOpcionMenu03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_03, rowKey);
    }
    public void setClaveOpcionMenu03(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_03, valor);
    }
    public void setClaveOpcionMenu03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_03, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu04() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04);
    }
    public String getCodigoNivelOpcionMenu04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, rowKey);
    }
    public void setCodigoNivelOpcionMenu04(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, valor);
    }
    public void setCodigoNivelOpcionMenu04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_04, rowKey, valor);
    }

    public String getCodigoOpcionMenu04() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_04);
    }
    public String getCodigoOpcionMenu04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_04, rowKey);
    }
    public void setCodigoOpcionMenu04(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_04, valor);
    }
    public void setCodigoOpcionMenu04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_04, rowKey, valor);
    }

    public String getNombreOpcionMenu04() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_04);
    }
    public String getNombreOpcionMenu04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_04, rowKey);
    }
    public void setNombreOpcionMenu04(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_04, valor);
    }
    public void setNombreOpcionMenu04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_04, rowKey, valor);
    }

    public String getClaveOpcionMenu04() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_04);
    }
    public String getClaveOpcionMenu04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_04, rowKey);
    }
    public void setClaveOpcionMenu04(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_04, valor);
    }
    public void setClaveOpcionMenu04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_04, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu05() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05);
    }
    public String getCodigoNivelOpcionMenu05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, rowKey);
    }
    public void setCodigoNivelOpcionMenu05(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, valor);
    }
    public void setCodigoNivelOpcionMenu05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_05, rowKey, valor);
    }

    public String getCodigoOpcionMenu05() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_05);
    }
    public String getCodigoOpcionMenu05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_05, rowKey);
    }
    public void setCodigoOpcionMenu05(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_05, valor);
    }
    public void setCodigoOpcionMenu05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_05, rowKey, valor);
    }

    public String getNombreOpcionMenu05() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_05);
    }
    public String getNombreOpcionMenu05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_05, rowKey);
    }
    public void setNombreOpcionMenu05(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_05, valor);
    }
    public void setNombreOpcionMenu05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_05, rowKey, valor);
    }

    public String getClaveOpcionMenu05() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_05);
    }
    public String getClaveOpcionMenu05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_05, rowKey);
    }
    public void setClaveOpcionMenu05(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_05, valor);
    }
    public void setClaveOpcionMenu05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_05, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu06() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06);
    }
    public String getCodigoNivelOpcionMenu06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, rowKey);
    }
    public void setCodigoNivelOpcionMenu06(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, valor);
    }
    public void setCodigoNivelOpcionMenu06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_06, rowKey, valor);
    }

    public String getCodigoOpcionMenu06() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_06);
    }
    public String getCodigoOpcionMenu06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_06, rowKey);
    }
    public void setCodigoOpcionMenu06(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_06, valor);
    }
    public void setCodigoOpcionMenu06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_06, rowKey, valor);
    }

    public String getNombreOpcionMenu06() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_06);
    }
    public String getNombreOpcionMenu06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_06, rowKey);
    }
    public void setNombreOpcionMenu06(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_06, valor);
    }
    public void setNombreOpcionMenu06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_06, rowKey, valor);
    }

    public String getClaveOpcionMenu06() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_06);
    }
    public String getClaveOpcionMenu06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_06, rowKey);
    }
    public void setClaveOpcionMenu06(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_06, valor);
    }
    public void setClaveOpcionMenu06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_06, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu07() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07);
    }
    public String getCodigoNivelOpcionMenu07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, rowKey);
    }
    public void setCodigoNivelOpcionMenu07(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, valor);
    }
    public void setCodigoNivelOpcionMenu07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_07, rowKey, valor);
    }

    public String getCodigoOpcionMenu07() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_07);
    }
    public String getCodigoOpcionMenu07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_07, rowKey);
    }
    public void setCodigoOpcionMenu07(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_07, valor);
    }
    public void setCodigoOpcionMenu07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_07, rowKey, valor);
    }

    public String getNombreOpcionMenu07() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_07);
    }
    public String getNombreOpcionMenu07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_07, rowKey);
    }
    public void setNombreOpcionMenu07(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_07, valor);
    }
    public void setNombreOpcionMenu07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_07, rowKey, valor);
    }

    public String getClaveOpcionMenu07() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_07);
    }
    public String getClaveOpcionMenu07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_07, rowKey);
    }
    public void setClaveOpcionMenu07(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_07, valor);
    }
    public void setClaveOpcionMenu07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_07, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu08() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08);
    }
    public String getCodigoNivelOpcionMenu08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, rowKey);
    }
    public void setCodigoNivelOpcionMenu08(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, valor);
    }
    public void setCodigoNivelOpcionMenu08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_08, rowKey, valor);
    }

    public String getCodigoOpcionMenu08() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_08);
    }
    public String getCodigoOpcionMenu08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_08, rowKey);
    }
    public void setCodigoOpcionMenu08(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_08, valor);
    }
    public void setCodigoOpcionMenu08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_08, rowKey, valor);
    }

    public String getNombreOpcionMenu08() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_08);
    }
    public String getNombreOpcionMenu08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_08, rowKey);
    }
    public void setNombreOpcionMenu08(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_08, valor);
    }
    public void setNombreOpcionMenu08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_08, rowKey, valor);
    }

    public String getClaveOpcionMenu08() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_08);
    }
    public String getClaveOpcionMenu08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_08, rowKey);
    }
    public void setClaveOpcionMenu08(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_08, valor);
    }
    public void setClaveOpcionMenu08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_08, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu09() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09);
    }
    public String getCodigoNivelOpcionMenu09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, rowKey);
    }
    public void setCodigoNivelOpcionMenu09(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, valor);
    }
    public void setCodigoNivelOpcionMenu09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_09, rowKey, valor);
    }

    public String getCodigoOpcionMenu09() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_09);
    }
    public String getCodigoOpcionMenu09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_09, rowKey);
    }
    public void setCodigoOpcionMenu09(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_09, valor);
    }
    public void setCodigoOpcionMenu09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_09, rowKey, valor);
    }

    public String getNombreOpcionMenu09() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_09);
    }
    public String getNombreOpcionMenu09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_09, rowKey);
    }
    public void setNombreOpcionMenu09(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_09, valor);
    }
    public void setNombreOpcionMenu09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_09, rowKey, valor);
    }

    public String getClaveOpcionMenu09() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_09);
    }
    public String getClaveOpcionMenu09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_09, rowKey);
    }
    public void setClaveOpcionMenu09(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_09, valor);
    }
    public void setClaveOpcionMenu09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_09, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu10() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10);
    }
    public String getCodigoNivelOpcionMenu10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, rowKey);
    }
    public void setCodigoNivelOpcionMenu10(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, valor);
    }
    public void setCodigoNivelOpcionMenu10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_10, rowKey, valor);
    }

    public String getCodigoOpcionMenu10() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_10);
    }
    public String getCodigoOpcionMenu10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_10, rowKey);
    }
    public void setCodigoOpcionMenu10(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_10, valor);
    }
    public void setCodigoOpcionMenu10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_10, rowKey, valor);
    }

    public String getNombreOpcionMenu10() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_10);
    }
    public String getNombreOpcionMenu10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_10, rowKey);
    }
    public void setNombreOpcionMenu10(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_10, valor);
    }
    public void setNombreOpcionMenu10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_10, rowKey, valor);
    }

    public String getClaveOpcionMenu10() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_10);
    }
    public String getClaveOpcionMenu10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_10, rowKey);
    }
    public void setClaveOpcionMenu10(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_10, valor);
    }
    public void setClaveOpcionMenu10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_10, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu11() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11);
    }
    public String getCodigoNivelOpcionMenu11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, rowKey);
    }
    public void setCodigoNivelOpcionMenu11(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, valor);
    }
    public void setCodigoNivelOpcionMenu11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_11, rowKey, valor);
    }

    public String getCodigoOpcionMenu11() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_11);
    }
    public String getCodigoOpcionMenu11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_11, rowKey);
    }
    public void setCodigoOpcionMenu11(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_11, valor);
    }
    public void setCodigoOpcionMenu11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_11, rowKey, valor);
    }

    public String getNombreOpcionMenu11() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_11);
    }
    public String getNombreOpcionMenu11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_11, rowKey);
    }
    public void setNombreOpcionMenu11(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_11, valor);
    }
    public void setNombreOpcionMenu11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_11, rowKey, valor);
    }

    public String getClaveOpcionMenu11() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_11);
    }
    public String getClaveOpcionMenu11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_11, rowKey);
    }
    public void setClaveOpcionMenu11(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_11, valor);
    }
    public void setClaveOpcionMenu11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_11, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu12() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12);
    }
    public String getCodigoNivelOpcionMenu12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, rowKey);
    }
    public void setCodigoNivelOpcionMenu12(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, valor);
    }
    public void setCodigoNivelOpcionMenu12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_12, rowKey, valor);
    }

    public String getCodigoOpcionMenu12() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_12);
    }
    public String getCodigoOpcionMenu12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_12, rowKey);
    }
    public void setCodigoOpcionMenu12(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_12, valor);
    }
    public void setCodigoOpcionMenu12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_12, rowKey, valor);
    }

    public String getNombreOpcionMenu12() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_12);
    }
    public String getNombreOpcionMenu12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_12, rowKey);
    }
    public void setNombreOpcionMenu12(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_12, valor);
    }
    public void setNombreOpcionMenu12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_12, rowKey, valor);
    }

    public String getClaveOpcionMenu12() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_12);
    }
    public String getClaveOpcionMenu12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_12, rowKey);
    }
    public void setClaveOpcionMenu12(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_12, valor);
    }
    public void setClaveOpcionMenu12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_12, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu13() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13);
    }
    public String getCodigoNivelOpcionMenu13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, rowKey);
    }
    public void setCodigoNivelOpcionMenu13(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, valor);
    }
    public void setCodigoNivelOpcionMenu13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_13, rowKey, valor);
    }

    public String getCodigoOpcionMenu13() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_13);
    }
    public String getCodigoOpcionMenu13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_13, rowKey);
    }
    public void setCodigoOpcionMenu13(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_13, valor);
    }
    public void setCodigoOpcionMenu13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_13, rowKey, valor);
    }

    public String getNombreOpcionMenu13() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_13);
    }
    public String getNombreOpcionMenu13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_13, rowKey);
    }
    public void setNombreOpcionMenu13(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_13, valor);
    }
    public void setNombreOpcionMenu13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_13, rowKey, valor);
    }

    public String getClaveOpcionMenu13() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_13);
    }
    public String getClaveOpcionMenu13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_13, rowKey);
    }
    public void setClaveOpcionMenu13(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_13, valor);
    }
    public void setClaveOpcionMenu13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_13, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu14() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14);
    }
    public String getCodigoNivelOpcionMenu14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, rowKey);
    }
    public void setCodigoNivelOpcionMenu14(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, valor);
    }
    public void setCodigoNivelOpcionMenu14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_14, rowKey, valor);
    }

    public String getCodigoOpcionMenu14() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_14);
    }
    public String getCodigoOpcionMenu14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_14, rowKey);
    }
    public void setCodigoOpcionMenu14(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_14, valor);
    }
    public void setCodigoOpcionMenu14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_14, rowKey, valor);
    }

    public String getNombreOpcionMenu14() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_14);
    }
    public String getNombreOpcionMenu14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_14, rowKey);
    }
    public void setNombreOpcionMenu14(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_14, valor);
    }
    public void setNombreOpcionMenu14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_14, rowKey, valor);
    }

    public String getClaveOpcionMenu14() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_14);
    }
    public String getClaveOpcionMenu14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_14, rowKey);
    }
    public void setClaveOpcionMenu14(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_14, valor);
    }
    public void setClaveOpcionMenu14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_14, rowKey, valor);
    }

    public String getCodigoNivelOpcionMenu15() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15);
    }
    public String getCodigoNivelOpcionMenu15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, rowKey);
    }
    public void setCodigoNivelOpcionMenu15(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, valor);
    }
    public void setCodigoNivelOpcionMenu15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_OPCION_MENU_15, rowKey, valor);
    }

    public String getCodigoOpcionMenu15() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_15);
    }
    public String getCodigoOpcionMenu15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_MENU_15, rowKey);
    }
    public void setCodigoOpcionMenu15(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_15, valor);
    }
    public void setCodigoOpcionMenu15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_MENU_15, rowKey, valor);
    }

    public String getNombreOpcionMenu15() {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_15);
    }
    public String getNombreOpcionMenu15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_OPCION_MENU_15, rowKey);
    }
    public void setNombreOpcionMenu15(String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_15, valor);
    }
    public void setNombreOpcionMenu15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_OPCION_MENU_15, rowKey, valor);
    }

    public String getClaveOpcionMenu15() {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_15);
    }
    public String getClaveOpcionMenu15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_OPCION_MENU_15, rowKey);
    }
    public void setClaveOpcionMenu15(String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_15, valor);
    }
    public void setClaveOpcionMenu15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_OPCION_MENU_15, rowKey, valor);
    }




}
