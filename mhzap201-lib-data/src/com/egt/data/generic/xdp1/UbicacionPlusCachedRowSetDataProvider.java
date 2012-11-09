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
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class UbicacionPlusCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider {

    public UbicacionPlusCachedRowSetDataProvider() {
        super();
    }

    public UbicacionPlusCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "ubicacion_plus";
    public static final String NOMBRE_DOMINIO_RECURSO = "Ubicaciones";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_ubicacion_plus_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "ubicacion_plus";

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

    public static final String COLUMNA_ID_UBICACION = "id_ubicacion";
    public static final String COLUMNA_VERSION_UBICACION = "version_ubicacion";
    public static final String COLUMNA_NUMERO_TIPO_NODO = "numero_tipo_nodo";
    public static final String COLUMNA_NUMERO_NIVEL_UBICACION = "numero_nivel_ubicacion";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION = "codigo_nivel_ubicacion";
    public static final String COLUMNA_CODIGO_UBICACION = "codigo_ubicacion";
    public static final String COLUMNA_NOMBRE_UBICACION = "nombre_ubicacion";
    public static final String COLUMNA_CLAVE_UBICACION = "clave_ubicacion";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_01 = "codigo_nivel_ubicacion_01";
    public static final String COLUMNA_CODIGO_UBICACION_01 = "codigo_ubicacion_01";
    public static final String COLUMNA_NOMBRE_UBICACION_01 = "nombre_ubicacion_01";
    public static final String COLUMNA_CLAVE_UBICACION_01 = "clave_ubicacion_01";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_02 = "codigo_nivel_ubicacion_02";
    public static final String COLUMNA_CODIGO_UBICACION_02 = "codigo_ubicacion_02";
    public static final String COLUMNA_NOMBRE_UBICACION_02 = "nombre_ubicacion_02";
    public static final String COLUMNA_CLAVE_UBICACION_02 = "clave_ubicacion_02";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_03 = "codigo_nivel_ubicacion_03";
    public static final String COLUMNA_CODIGO_UBICACION_03 = "codigo_ubicacion_03";
    public static final String COLUMNA_NOMBRE_UBICACION_03 = "nombre_ubicacion_03";
    public static final String COLUMNA_CLAVE_UBICACION_03 = "clave_ubicacion_03";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_04 = "codigo_nivel_ubicacion_04";
    public static final String COLUMNA_CODIGO_UBICACION_04 = "codigo_ubicacion_04";
    public static final String COLUMNA_NOMBRE_UBICACION_04 = "nombre_ubicacion_04";
    public static final String COLUMNA_CLAVE_UBICACION_04 = "clave_ubicacion_04";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_05 = "codigo_nivel_ubicacion_05";
    public static final String COLUMNA_CODIGO_UBICACION_05 = "codigo_ubicacion_05";
    public static final String COLUMNA_NOMBRE_UBICACION_05 = "nombre_ubicacion_05";
    public static final String COLUMNA_CLAVE_UBICACION_05 = "clave_ubicacion_05";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_06 = "codigo_nivel_ubicacion_06";
    public static final String COLUMNA_CODIGO_UBICACION_06 = "codigo_ubicacion_06";
    public static final String COLUMNA_NOMBRE_UBICACION_06 = "nombre_ubicacion_06";
    public static final String COLUMNA_CLAVE_UBICACION_06 = "clave_ubicacion_06";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_07 = "codigo_nivel_ubicacion_07";
    public static final String COLUMNA_CODIGO_UBICACION_07 = "codigo_ubicacion_07";
    public static final String COLUMNA_NOMBRE_UBICACION_07 = "nombre_ubicacion_07";
    public static final String COLUMNA_CLAVE_UBICACION_07 = "clave_ubicacion_07";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_08 = "codigo_nivel_ubicacion_08";
    public static final String COLUMNA_CODIGO_UBICACION_08 = "codigo_ubicacion_08";
    public static final String COLUMNA_NOMBRE_UBICACION_08 = "nombre_ubicacion_08";
    public static final String COLUMNA_CLAVE_UBICACION_08 = "clave_ubicacion_08";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_09 = "codigo_nivel_ubicacion_09";
    public static final String COLUMNA_CODIGO_UBICACION_09 = "codigo_ubicacion_09";
    public static final String COLUMNA_NOMBRE_UBICACION_09 = "nombre_ubicacion_09";
    public static final String COLUMNA_CLAVE_UBICACION_09 = "clave_ubicacion_09";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_10 = "codigo_nivel_ubicacion_10";
    public static final String COLUMNA_CODIGO_UBICACION_10 = "codigo_ubicacion_10";
    public static final String COLUMNA_NOMBRE_UBICACION_10 = "nombre_ubicacion_10";
    public static final String COLUMNA_CLAVE_UBICACION_10 = "clave_ubicacion_10";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_11 = "codigo_nivel_ubicacion_11";
    public static final String COLUMNA_CODIGO_UBICACION_11 = "codigo_ubicacion_11";
    public static final String COLUMNA_NOMBRE_UBICACION_11 = "nombre_ubicacion_11";
    public static final String COLUMNA_CLAVE_UBICACION_11 = "clave_ubicacion_11";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_12 = "codigo_nivel_ubicacion_12";
    public static final String COLUMNA_CODIGO_UBICACION_12 = "codigo_ubicacion_12";
    public static final String COLUMNA_NOMBRE_UBICACION_12 = "nombre_ubicacion_12";
    public static final String COLUMNA_CLAVE_UBICACION_12 = "clave_ubicacion_12";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_13 = "codigo_nivel_ubicacion_13";
    public static final String COLUMNA_CODIGO_UBICACION_13 = "codigo_ubicacion_13";
    public static final String COLUMNA_NOMBRE_UBICACION_13 = "nombre_ubicacion_13";
    public static final String COLUMNA_CLAVE_UBICACION_13 = "clave_ubicacion_13";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_14 = "codigo_nivel_ubicacion_14";
    public static final String COLUMNA_CODIGO_UBICACION_14 = "codigo_ubicacion_14";
    public static final String COLUMNA_NOMBRE_UBICACION_14 = "nombre_ubicacion_14";
    public static final String COLUMNA_CLAVE_UBICACION_14 = "clave_ubicacion_14";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION_15 = "codigo_nivel_ubicacion_15";
    public static final String COLUMNA_CODIGO_UBICACION_15 = "codigo_ubicacion_15";
    public static final String COLUMNA_NOMBRE_UBICACION_15 = "nombre_ubicacion_15";
    public static final String COLUMNA_CLAVE_UBICACION_15 = "clave_ubicacion_15";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_UBICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_UBICACION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_NODO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_UBICACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_01, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_10, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_UBICACION_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_UBICACION_15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CLAVE_UBICACION_15, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_01, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_01, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_01, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_01, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_02, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_02, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_02, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_02, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_03, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_03, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_03, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_03, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_04, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_04, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_04, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_04, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_05, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_05, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_05, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_05, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_06, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_06, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_06, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_06, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_07, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_07, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_07, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_07, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_08, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_08, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_08, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_08, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_09, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_09, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_09, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_09, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_10, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_10, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_10, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_10, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_11, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_11, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_11, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_11, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_12, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_12, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_12, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_12, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_13, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_13, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_13, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_13, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_14, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_14, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_14, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_14, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION_15, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_UBICACION_15, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_UBICACION_15, true);
        this.setColumnasInsertables(COLUMNA_CLAVE_UBICACION_15, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_UBICACION, true);
        this.setColumnasModificables(COLUMNA_VERSION_UBICACION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_NODO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_01, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_01, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_01, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_01, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_02, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_02, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_02, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_02, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_03, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_03, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_03, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_03, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_04, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_04, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_04, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_04, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_05, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_05, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_05, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_05, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_06, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_06, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_06, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_06, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_07, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_07, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_07, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_07, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_08, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_08, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_08, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_08, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_09, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_09, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_09, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_09, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_10, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_10, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_10, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_10, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_11, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_11, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_11, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_11, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_12, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_12, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_12, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_12, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_13, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_13, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_13, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_13, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_14, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_14, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_14, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_14, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION_15, true);
        this.setColumnasModificables(COLUMNA_CODIGO_UBICACION_15, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_UBICACION_15, true);
        this.setColumnasModificables(COLUMNA_CLAVE_UBICACION_15, true);
    }

    public Long getIdUbicacion() {
        return (Long) super.getValue(COLUMNA_ID_UBICACION);
    }
    public Long getIdUbicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_UBICACION, rowKey);
    }
    public void setIdUbicacion(Long valor) {
        super.setValue(COLUMNA_ID_UBICACION, valor);
    }
    public void setIdUbicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_UBICACION, rowKey, valor);
    }

    public Long getVersionUbicacion() {
        return (Long) super.getValue(COLUMNA_VERSION_UBICACION);
    }
    public Long getVersionUbicacion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_UBICACION, rowKey);
    }
    public void setVersionUbicacion(Long valor) {
        super.setValue(COLUMNA_VERSION_UBICACION, valor);
    }
    public void setVersionUbicacion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_UBICACION, rowKey, valor);
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

    public Integer getNumeroNivelUbicacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION);
    }
    public Integer getNumeroNivelUbicacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey);
    }
    public void setNumeroNivelUbicacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, valor);
    }
    public void setNumeroNivelUbicacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey, valor);
    }

    public String getCodigoNivelUbicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION);
    }
    public String getCodigoNivelUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION, rowKey);
    }
    public void setCodigoNivelUbicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION, valor);
    }
    public void setCodigoNivelUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION, rowKey, valor);
    }

    public String getCodigoUbicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION);
    }
    public String getCodigoUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION, rowKey);
    }
    public void setCodigoUbicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION, valor);
    }
    public void setCodigoUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION, rowKey, valor);
    }

    public String getNombreUbicacion() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION);
    }
    public String getNombreUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION, rowKey);
    }
    public void setNombreUbicacion(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION, valor);
    }
    public void setNombreUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION, rowKey, valor);
    }

    public String getClaveUbicacion() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION);
    }
    public String getClaveUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION, rowKey);
    }
    public void setClaveUbicacion(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION, valor);
    }
    public void setClaveUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION, rowKey, valor);
    }

    public String getCodigoNivelUbicacion01() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_01);
    }
    public String getCodigoNivelUbicacion01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_01, rowKey);
    }
    public void setCodigoNivelUbicacion01(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_01, valor);
    }
    public void setCodigoNivelUbicacion01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_01, rowKey, valor);
    }

    public String getCodigoUbicacion01() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_01);
    }
    public String getCodigoUbicacion01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_01, rowKey);
    }
    public void setCodigoUbicacion01(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_01, valor);
    }
    public void setCodigoUbicacion01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_01, rowKey, valor);
    }

    public String getNombreUbicacion01() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_01);
    }
    public String getNombreUbicacion01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_01, rowKey);
    }
    public void setNombreUbicacion01(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_01, valor);
    }
    public void setNombreUbicacion01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_01, rowKey, valor);
    }

    public String getClaveUbicacion01() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_01);
    }
    public String getClaveUbicacion01(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_01, rowKey);
    }
    public void setClaveUbicacion01(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_01, valor);
    }
    public void setClaveUbicacion01(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_01, rowKey, valor);
    }

    public String getCodigoNivelUbicacion02() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_02);
    }
    public String getCodigoNivelUbicacion02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_02, rowKey);
    }
    public void setCodigoNivelUbicacion02(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_02, valor);
    }
    public void setCodigoNivelUbicacion02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_02, rowKey, valor);
    }

    public String getCodigoUbicacion02() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_02);
    }
    public String getCodigoUbicacion02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_02, rowKey);
    }
    public void setCodigoUbicacion02(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_02, valor);
    }
    public void setCodigoUbicacion02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_02, rowKey, valor);
    }

    public String getNombreUbicacion02() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_02);
    }
    public String getNombreUbicacion02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_02, rowKey);
    }
    public void setNombreUbicacion02(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_02, valor);
    }
    public void setNombreUbicacion02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_02, rowKey, valor);
    }

    public String getClaveUbicacion02() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_02);
    }
    public String getClaveUbicacion02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_02, rowKey);
    }
    public void setClaveUbicacion02(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_02, valor);
    }
    public void setClaveUbicacion02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_02, rowKey, valor);
    }

    public String getCodigoNivelUbicacion03() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_03);
    }
    public String getCodigoNivelUbicacion03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_03, rowKey);
    }
    public void setCodigoNivelUbicacion03(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_03, valor);
    }
    public void setCodigoNivelUbicacion03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_03, rowKey, valor);
    }

    public String getCodigoUbicacion03() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_03);
    }
    public String getCodigoUbicacion03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_03, rowKey);
    }
    public void setCodigoUbicacion03(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_03, valor);
    }
    public void setCodigoUbicacion03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_03, rowKey, valor);
    }

    public String getNombreUbicacion03() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_03);
    }
    public String getNombreUbicacion03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_03, rowKey);
    }
    public void setNombreUbicacion03(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_03, valor);
    }
    public void setNombreUbicacion03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_03, rowKey, valor);
    }

    public String getClaveUbicacion03() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_03);
    }
    public String getClaveUbicacion03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_03, rowKey);
    }
    public void setClaveUbicacion03(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_03, valor);
    }
    public void setClaveUbicacion03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_03, rowKey, valor);
    }

    public String getCodigoNivelUbicacion04() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_04);
    }
    public String getCodigoNivelUbicacion04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_04, rowKey);
    }
    public void setCodigoNivelUbicacion04(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_04, valor);
    }
    public void setCodigoNivelUbicacion04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_04, rowKey, valor);
    }

    public String getCodigoUbicacion04() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_04);
    }
    public String getCodigoUbicacion04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_04, rowKey);
    }
    public void setCodigoUbicacion04(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_04, valor);
    }
    public void setCodigoUbicacion04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_04, rowKey, valor);
    }

    public String getNombreUbicacion04() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_04);
    }
    public String getNombreUbicacion04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_04, rowKey);
    }
    public void setNombreUbicacion04(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_04, valor);
    }
    public void setNombreUbicacion04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_04, rowKey, valor);
    }

    public String getClaveUbicacion04() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_04);
    }
    public String getClaveUbicacion04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_04, rowKey);
    }
    public void setClaveUbicacion04(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_04, valor);
    }
    public void setClaveUbicacion04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_04, rowKey, valor);
    }

    public String getCodigoNivelUbicacion05() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_05);
    }
    public String getCodigoNivelUbicacion05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_05, rowKey);
    }
    public void setCodigoNivelUbicacion05(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_05, valor);
    }
    public void setCodigoNivelUbicacion05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_05, rowKey, valor);
    }

    public String getCodigoUbicacion05() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_05);
    }
    public String getCodigoUbicacion05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_05, rowKey);
    }
    public void setCodigoUbicacion05(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_05, valor);
    }
    public void setCodigoUbicacion05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_05, rowKey, valor);
    }

    public String getNombreUbicacion05() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_05);
    }
    public String getNombreUbicacion05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_05, rowKey);
    }
    public void setNombreUbicacion05(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_05, valor);
    }
    public void setNombreUbicacion05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_05, rowKey, valor);
    }

    public String getClaveUbicacion05() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_05);
    }
    public String getClaveUbicacion05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_05, rowKey);
    }
    public void setClaveUbicacion05(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_05, valor);
    }
    public void setClaveUbicacion05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_05, rowKey, valor);
    }

    public String getCodigoNivelUbicacion06() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_06);
    }
    public String getCodigoNivelUbicacion06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_06, rowKey);
    }
    public void setCodigoNivelUbicacion06(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_06, valor);
    }
    public void setCodigoNivelUbicacion06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_06, rowKey, valor);
    }

    public String getCodigoUbicacion06() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_06);
    }
    public String getCodigoUbicacion06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_06, rowKey);
    }
    public void setCodigoUbicacion06(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_06, valor);
    }
    public void setCodigoUbicacion06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_06, rowKey, valor);
    }

    public String getNombreUbicacion06() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_06);
    }
    public String getNombreUbicacion06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_06, rowKey);
    }
    public void setNombreUbicacion06(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_06, valor);
    }
    public void setNombreUbicacion06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_06, rowKey, valor);
    }

    public String getClaveUbicacion06() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_06);
    }
    public String getClaveUbicacion06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_06, rowKey);
    }
    public void setClaveUbicacion06(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_06, valor);
    }
    public void setClaveUbicacion06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_06, rowKey, valor);
    }

    public String getCodigoNivelUbicacion07() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_07);
    }
    public String getCodigoNivelUbicacion07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_07, rowKey);
    }
    public void setCodigoNivelUbicacion07(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_07, valor);
    }
    public void setCodigoNivelUbicacion07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_07, rowKey, valor);
    }

    public String getCodigoUbicacion07() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_07);
    }
    public String getCodigoUbicacion07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_07, rowKey);
    }
    public void setCodigoUbicacion07(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_07, valor);
    }
    public void setCodigoUbicacion07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_07, rowKey, valor);
    }

    public String getNombreUbicacion07() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_07);
    }
    public String getNombreUbicacion07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_07, rowKey);
    }
    public void setNombreUbicacion07(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_07, valor);
    }
    public void setNombreUbicacion07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_07, rowKey, valor);
    }

    public String getClaveUbicacion07() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_07);
    }
    public String getClaveUbicacion07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_07, rowKey);
    }
    public void setClaveUbicacion07(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_07, valor);
    }
    public void setClaveUbicacion07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_07, rowKey, valor);
    }

    public String getCodigoNivelUbicacion08() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_08);
    }
    public String getCodigoNivelUbicacion08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_08, rowKey);
    }
    public void setCodigoNivelUbicacion08(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_08, valor);
    }
    public void setCodigoNivelUbicacion08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_08, rowKey, valor);
    }

    public String getCodigoUbicacion08() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_08);
    }
    public String getCodigoUbicacion08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_08, rowKey);
    }
    public void setCodigoUbicacion08(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_08, valor);
    }
    public void setCodigoUbicacion08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_08, rowKey, valor);
    }

    public String getNombreUbicacion08() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_08);
    }
    public String getNombreUbicacion08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_08, rowKey);
    }
    public void setNombreUbicacion08(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_08, valor);
    }
    public void setNombreUbicacion08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_08, rowKey, valor);
    }

    public String getClaveUbicacion08() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_08);
    }
    public String getClaveUbicacion08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_08, rowKey);
    }
    public void setClaveUbicacion08(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_08, valor);
    }
    public void setClaveUbicacion08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_08, rowKey, valor);
    }

    public String getCodigoNivelUbicacion09() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_09);
    }
    public String getCodigoNivelUbicacion09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_09, rowKey);
    }
    public void setCodigoNivelUbicacion09(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_09, valor);
    }
    public void setCodigoNivelUbicacion09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_09, rowKey, valor);
    }

    public String getCodigoUbicacion09() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_09);
    }
    public String getCodigoUbicacion09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_09, rowKey);
    }
    public void setCodigoUbicacion09(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_09, valor);
    }
    public void setCodigoUbicacion09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_09, rowKey, valor);
    }

    public String getNombreUbicacion09() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_09);
    }
    public String getNombreUbicacion09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_09, rowKey);
    }
    public void setNombreUbicacion09(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_09, valor);
    }
    public void setNombreUbicacion09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_09, rowKey, valor);
    }

    public String getClaveUbicacion09() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_09);
    }
    public String getClaveUbicacion09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_09, rowKey);
    }
    public void setClaveUbicacion09(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_09, valor);
    }
    public void setClaveUbicacion09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_09, rowKey, valor);
    }

    public String getCodigoNivelUbicacion10() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_10);
    }
    public String getCodigoNivelUbicacion10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_10, rowKey);
    }
    public void setCodigoNivelUbicacion10(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_10, valor);
    }
    public void setCodigoNivelUbicacion10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_10, rowKey, valor);
    }

    public String getCodigoUbicacion10() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_10);
    }
    public String getCodigoUbicacion10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_10, rowKey);
    }
    public void setCodigoUbicacion10(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_10, valor);
    }
    public void setCodigoUbicacion10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_10, rowKey, valor);
    }

    public String getNombreUbicacion10() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_10);
    }
    public String getNombreUbicacion10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_10, rowKey);
    }
    public void setNombreUbicacion10(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_10, valor);
    }
    public void setNombreUbicacion10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_10, rowKey, valor);
    }

    public String getClaveUbicacion10() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_10);
    }
    public String getClaveUbicacion10(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_10, rowKey);
    }
    public void setClaveUbicacion10(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_10, valor);
    }
    public void setClaveUbicacion10(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_10, rowKey, valor);
    }

    public String getCodigoNivelUbicacion11() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_11);
    }
    public String getCodigoNivelUbicacion11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_11, rowKey);
    }
    public void setCodigoNivelUbicacion11(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_11, valor);
    }
    public void setCodigoNivelUbicacion11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_11, rowKey, valor);
    }

    public String getCodigoUbicacion11() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_11);
    }
    public String getCodigoUbicacion11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_11, rowKey);
    }
    public void setCodigoUbicacion11(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_11, valor);
    }
    public void setCodigoUbicacion11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_11, rowKey, valor);
    }

    public String getNombreUbicacion11() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_11);
    }
    public String getNombreUbicacion11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_11, rowKey);
    }
    public void setNombreUbicacion11(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_11, valor);
    }
    public void setNombreUbicacion11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_11, rowKey, valor);
    }

    public String getClaveUbicacion11() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_11);
    }
    public String getClaveUbicacion11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_11, rowKey);
    }
    public void setClaveUbicacion11(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_11, valor);
    }
    public void setClaveUbicacion11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_11, rowKey, valor);
    }

    public String getCodigoNivelUbicacion12() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_12);
    }
    public String getCodigoNivelUbicacion12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_12, rowKey);
    }
    public void setCodigoNivelUbicacion12(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_12, valor);
    }
    public void setCodigoNivelUbicacion12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_12, rowKey, valor);
    }

    public String getCodigoUbicacion12() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_12);
    }
    public String getCodigoUbicacion12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_12, rowKey);
    }
    public void setCodigoUbicacion12(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_12, valor);
    }
    public void setCodigoUbicacion12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_12, rowKey, valor);
    }

    public String getNombreUbicacion12() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_12);
    }
    public String getNombreUbicacion12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_12, rowKey);
    }
    public void setNombreUbicacion12(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_12, valor);
    }
    public void setNombreUbicacion12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_12, rowKey, valor);
    }

    public String getClaveUbicacion12() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_12);
    }
    public String getClaveUbicacion12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_12, rowKey);
    }
    public void setClaveUbicacion12(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_12, valor);
    }
    public void setClaveUbicacion12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_12, rowKey, valor);
    }

    public String getCodigoNivelUbicacion13() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_13);
    }
    public String getCodigoNivelUbicacion13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_13, rowKey);
    }
    public void setCodigoNivelUbicacion13(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_13, valor);
    }
    public void setCodigoNivelUbicacion13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_13, rowKey, valor);
    }

    public String getCodigoUbicacion13() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_13);
    }
    public String getCodigoUbicacion13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_13, rowKey);
    }
    public void setCodigoUbicacion13(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_13, valor);
    }
    public void setCodigoUbicacion13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_13, rowKey, valor);
    }

    public String getNombreUbicacion13() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_13);
    }
    public String getNombreUbicacion13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_13, rowKey);
    }
    public void setNombreUbicacion13(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_13, valor);
    }
    public void setNombreUbicacion13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_13, rowKey, valor);
    }

    public String getClaveUbicacion13() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_13);
    }
    public String getClaveUbicacion13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_13, rowKey);
    }
    public void setClaveUbicacion13(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_13, valor);
    }
    public void setClaveUbicacion13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_13, rowKey, valor);
    }

    public String getCodigoNivelUbicacion14() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_14);
    }
    public String getCodigoNivelUbicacion14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_14, rowKey);
    }
    public void setCodigoNivelUbicacion14(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_14, valor);
    }
    public void setCodigoNivelUbicacion14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_14, rowKey, valor);
    }

    public String getCodigoUbicacion14() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_14);
    }
    public String getCodigoUbicacion14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_14, rowKey);
    }
    public void setCodigoUbicacion14(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_14, valor);
    }
    public void setCodigoUbicacion14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_14, rowKey, valor);
    }

    public String getNombreUbicacion14() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_14);
    }
    public String getNombreUbicacion14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_14, rowKey);
    }
    public void setNombreUbicacion14(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_14, valor);
    }
    public void setNombreUbicacion14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_14, rowKey, valor);
    }

    public String getClaveUbicacion14() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_14);
    }
    public String getClaveUbicacion14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_14, rowKey);
    }
    public void setClaveUbicacion14(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_14, valor);
    }
    public void setClaveUbicacion14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_14, rowKey, valor);
    }

    public String getCodigoNivelUbicacion15() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_15);
    }
    public String getCodigoNivelUbicacion15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION_15, rowKey);
    }
    public void setCodigoNivelUbicacion15(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_15, valor);
    }
    public void setCodigoNivelUbicacion15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION_15, rowKey, valor);
    }

    public String getCodigoUbicacion15() {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_15);
    }
    public String getCodigoUbicacion15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_UBICACION_15, rowKey);
    }
    public void setCodigoUbicacion15(String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_15, valor);
    }
    public void setCodigoUbicacion15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_UBICACION_15, rowKey, valor);
    }

    public String getNombreUbicacion15() {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_15);
    }
    public String getNombreUbicacion15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_UBICACION_15, rowKey);
    }
    public void setNombreUbicacion15(String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_15, valor);
    }
    public void setNombreUbicacion15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_UBICACION_15, rowKey, valor);
    }

    public String getClaveUbicacion15() {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_15);
    }
    public String getClaveUbicacion15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CLAVE_UBICACION_15, rowKey);
    }
    public void setClaveUbicacion15(String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_15, valor);
    }
    public void setClaveUbicacion15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CLAVE_UBICACION_15, rowKey, valor);
    }




}
