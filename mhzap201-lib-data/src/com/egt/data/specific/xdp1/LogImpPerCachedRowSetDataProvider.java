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
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class LogImpPerCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpPerCachedRowSetDataProvider() {
        super();
    }

    public LogImpPerCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_per";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Fichas Persona SAS";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_per_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_per";

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

    public static final String COLUMNA_ID_LOG_IMP_PER = "id_log_imp_per";
    public static final String COLUMNA_VERSION_LOG_IMP_PER = "version_log_imp_per";
    public static final String COLUMNA_P01A = "p01a";
    public static final String COLUMNA_P01B = "p01b";
    public static final String COLUMNA_P01C = "p01c";
    public static final String COLUMNA_P01D = "p01d";
    public static final String COLUMNA_P02 = "p02";
    public static final String COLUMNA_P03 = "p03";
    public static final String COLUMNA_P104 = "p104";
    public static final String COLUMNA_P43 = "p43";
    public static final String COLUMNA_P45A = "p45a";
    public static final String COLUMNA_P45B = "p45b";
    public static final String COLUMNA_P44A = "p44a";
    public static final String COLUMNA_P44B = "p44b";
    public static final String COLUMNA_VAR00001 = "var00001";
    public static final String COLUMNA_VAR00002 = "var00002";
    public static final String COLUMNA_P46 = "p46";
    public static final String COLUMNA_P47 = "p47";
    public static final String COLUMNA_VAR00030 = "var00030";
    public static final String COLUMNA_P48 = "p48";
    public static final String COLUMNA_P49 = "p49";
    public static final String COLUMNA_P50A = "p50a";
    public static final String COLUMNA_P50B = "p50b";
    public static final String COLUMNA_P50C = "p50c";
    public static final String COLUMNA_P51 = "p51";
    public static final String COLUMNA_VAR00003 = "var00003";
    public static final String COLUMNA_VAR00004 = "var00004";
    public static final String COLUMNA_P52D = "p52d";
    public static final String COLUMNA_P52M = "p52m";
    public static final String COLUMNA_P52A = "p52a";
    public static final String COLUMNA_P53A = "p53a";
    public static final String COLUMNA_P53B = "p53b";
    public static final String COLUMNA_P53C = "p53c";
    public static final String COLUMNA_P53Z = "p53z";
    public static final String COLUMNA_P54 = "p54";
    public static final String COLUMNA_P54E = "p54e";
    public static final String COLUMNA_P56 = "p56";
    public static final String COLUMNA_P58 = "p58";
    public static final String COLUMNA_P58E = "p58e";
    public static final String COLUMNA_P59 = "p59";
    public static final String COLUMNA_P60 = "p60";
    public static final String COLUMNA_P61 = "p61";
    public static final String COLUMNA_P62 = "p62";
    public static final String COLUMNA_P63 = "p63";
    public static final String COLUMNA_P64 = "p64";
    public static final String COLUMNA_P65 = "p65";
    public static final String COLUMNA_P65E = "p65e";
    public static final String COLUMNA_P66 = "p66";
    public static final String COLUMNA_P66E = "p66e";
    public static final String COLUMNA_P67 = "p67";
    public static final String COLUMNA_P68 = "p68";
    public static final String COLUMNA_P68E = "p68e";
    public static final String COLUMNA_P73 = "p73";
    public static final String COLUMNA_P74 = "p74";
    public static final String COLUMNA_VAR00006 = "var00006";
    public static final String COLUMNA_VAR00007 = "var00007";
    public static final String COLUMNA_VAR00008 = "var00008";
    public static final String COLUMNA_VAR00009 = "var00009";
    public static final String COLUMNA_VAR00010 = "var00010";
    public static final String COLUMNA_VAR00011 = "var00011";
    public static final String COLUMNA_VAR00031 = "var00031";
    public static final String COLUMNA_VAR00012 = "var00012";
    public static final String COLUMNA_VAR00013 = "var00013";
    public static final String COLUMNA_P86 = "p86";
    public static final String COLUMNA_P87 = "p87";
    public static final String COLUMNA_P87E = "p87e";
    public static final String COLUMNA_P88 = "p88";
    public static final String COLUMNA_P88E = "p88e";
    public static final String COLUMNA_P91 = "p91";
    public static final String COLUMNA_VAR00017 = "var00017";
    public static final String COLUMNA_VAR00018 = "var00018";
    public static final String COLUMNA_VAR00019 = "var00019";
    public static final String COLUMNA_VAR00020 = "var00020";
    public static final String COLUMNA_VAR00021 = "var00021";
    public static final String COLUMNA_VAR00022 = "var00022";
    public static final String COLUMNA_VAR00023 = "var00023";
    public static final String COLUMNA_VAR00024 = "var00024";
    public static final String COLUMNA_VAR00025 = "var00025";
    public static final String COLUMNA_VAR00026 = "var00026";
    public static final String COLUMNA_VAR00027 = "var00027";
    public static final String COLUMNA_VAR00028 = "var00028";
    public static final String COLUMNA_P92 = "p92";
    public static final String COLUMNA_ICV = "icv";
    public static final String COLUMNA_FICHA_ACTIVA = "ficha_activa";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";
    public static final String COLUMNA_ID_FICHA_PERSONA = "id_ficha_persona";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_PER, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_PER, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01D, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P104, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P43, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P45A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P45B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P44A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P44B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00001, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00002, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P46, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P47, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00030, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P48, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P49, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P50A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P50B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P50C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P51, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00003, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00004, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P52D, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P52M, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P52A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P53A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P53B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P53C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P53Z, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P54, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P54E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P56, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P58, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P58E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P59, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P60, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P61, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P62, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P63, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P64, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P65, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P65E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P66, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P66E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P68, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P68E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P73, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P74, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00006, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00007, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00008, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00009, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00010, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00011, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00031, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00012, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00013, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P86, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P87, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P87E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P88, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P88E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P91, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00017, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00018, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00019, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00020, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00021, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00022, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00023, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00024, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00025, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00026, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00027, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00028, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P92, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ICV, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FICHA_ACTIVA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_PERSONA, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_PER, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_PER, true);
        this.setColumnasInsertables(COLUMNA_P01A, true);
        this.setColumnasInsertables(COLUMNA_P01B, true);
        this.setColumnasInsertables(COLUMNA_P01C, true);
        this.setColumnasInsertables(COLUMNA_P01D, true);
        this.setColumnasInsertables(COLUMNA_P02, true);
        this.setColumnasInsertables(COLUMNA_P03, true);
        this.setColumnasInsertables(COLUMNA_P104, true);
        this.setColumnasInsertables(COLUMNA_P43, true);
        this.setColumnasInsertables(COLUMNA_P45A, true);
        this.setColumnasInsertables(COLUMNA_P45B, true);
        this.setColumnasInsertables(COLUMNA_P44A, true);
        this.setColumnasInsertables(COLUMNA_P44B, true);
        this.setColumnasInsertables(COLUMNA_VAR00001, true);
        this.setColumnasInsertables(COLUMNA_VAR00002, true);
        this.setColumnasInsertables(COLUMNA_P46, true);
        this.setColumnasInsertables(COLUMNA_P47, true);
        this.setColumnasInsertables(COLUMNA_VAR00030, true);
        this.setColumnasInsertables(COLUMNA_P48, true);
        this.setColumnasInsertables(COLUMNA_P49, true);
        this.setColumnasInsertables(COLUMNA_P50A, true);
        this.setColumnasInsertables(COLUMNA_P50B, true);
        this.setColumnasInsertables(COLUMNA_P50C, true);
        this.setColumnasInsertables(COLUMNA_P51, true);
        this.setColumnasInsertables(COLUMNA_VAR00003, true);
        this.setColumnasInsertables(COLUMNA_VAR00004, true);
        this.setColumnasInsertables(COLUMNA_P52D, true);
        this.setColumnasInsertables(COLUMNA_P52M, true);
        this.setColumnasInsertables(COLUMNA_P52A, true);
        this.setColumnasInsertables(COLUMNA_P53A, true);
        this.setColumnasInsertables(COLUMNA_P53B, true);
        this.setColumnasInsertables(COLUMNA_P53C, true);
        this.setColumnasInsertables(COLUMNA_P53Z, true);
        this.setColumnasInsertables(COLUMNA_P54, true);
        this.setColumnasInsertables(COLUMNA_P54E, true);
        this.setColumnasInsertables(COLUMNA_P56, true);
        this.setColumnasInsertables(COLUMNA_P58, true);
        this.setColumnasInsertables(COLUMNA_P58E, true);
        this.setColumnasInsertables(COLUMNA_P59, true);
        this.setColumnasInsertables(COLUMNA_P60, true);
        this.setColumnasInsertables(COLUMNA_P61, true);
        this.setColumnasInsertables(COLUMNA_P62, true);
        this.setColumnasInsertables(COLUMNA_P63, true);
        this.setColumnasInsertables(COLUMNA_P64, true);
        this.setColumnasInsertables(COLUMNA_P65, true);
        this.setColumnasInsertables(COLUMNA_P65E, true);
        this.setColumnasInsertables(COLUMNA_P66, true);
        this.setColumnasInsertables(COLUMNA_P66E, true);
        this.setColumnasInsertables(COLUMNA_P67, true);
        this.setColumnasInsertables(COLUMNA_P68, true);
        this.setColumnasInsertables(COLUMNA_P68E, true);
        this.setColumnasInsertables(COLUMNA_P73, true);
        this.setColumnasInsertables(COLUMNA_P74, true);
        this.setColumnasInsertables(COLUMNA_VAR00006, true);
        this.setColumnasInsertables(COLUMNA_VAR00007, true);
        this.setColumnasInsertables(COLUMNA_VAR00008, true);
        this.setColumnasInsertables(COLUMNA_VAR00009, true);
        this.setColumnasInsertables(COLUMNA_VAR00010, true);
        this.setColumnasInsertables(COLUMNA_VAR00011, true);
        this.setColumnasInsertables(COLUMNA_VAR00031, true);
        this.setColumnasInsertables(COLUMNA_VAR00012, true);
        this.setColumnasInsertables(COLUMNA_VAR00013, true);
        this.setColumnasInsertables(COLUMNA_P86, true);
        this.setColumnasInsertables(COLUMNA_P87, true);
        this.setColumnasInsertables(COLUMNA_P87E, true);
        this.setColumnasInsertables(COLUMNA_P88, true);
        this.setColumnasInsertables(COLUMNA_P88E, true);
        this.setColumnasInsertables(COLUMNA_P91, true);
        this.setColumnasInsertables(COLUMNA_VAR00017, true);
        this.setColumnasInsertables(COLUMNA_VAR00018, true);
        this.setColumnasInsertables(COLUMNA_VAR00019, true);
        this.setColumnasInsertables(COLUMNA_VAR00020, true);
        this.setColumnasInsertables(COLUMNA_VAR00021, true);
        this.setColumnasInsertables(COLUMNA_VAR00022, true);
        this.setColumnasInsertables(COLUMNA_VAR00023, true);
        this.setColumnasInsertables(COLUMNA_VAR00024, true);
        this.setColumnasInsertables(COLUMNA_VAR00025, true);
        this.setColumnasInsertables(COLUMNA_VAR00026, true);
        this.setColumnasInsertables(COLUMNA_VAR00027, true);
        this.setColumnasInsertables(COLUMNA_VAR00028, true);
        this.setColumnasInsertables(COLUMNA_P92, true);
        this.setColumnasInsertables(COLUMNA_ICV, true);
        this.setColumnasInsertables(COLUMNA_FICHA_ACTIVA, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_PERSONA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_PER, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_PER, true);
        this.setColumnasModificables(COLUMNA_P01A, true);
        this.setColumnasModificables(COLUMNA_P01B, true);
        this.setColumnasModificables(COLUMNA_P01C, true);
        this.setColumnasModificables(COLUMNA_P01D, true);
        this.setColumnasModificables(COLUMNA_P02, true);
        this.setColumnasModificables(COLUMNA_P03, true);
        this.setColumnasModificables(COLUMNA_P104, true);
        this.setColumnasModificables(COLUMNA_P43, true);
        this.setColumnasModificables(COLUMNA_P45A, true);
        this.setColumnasModificables(COLUMNA_P45B, true);
        this.setColumnasModificables(COLUMNA_P44A, true);
        this.setColumnasModificables(COLUMNA_P44B, true);
        this.setColumnasModificables(COLUMNA_VAR00001, true);
        this.setColumnasModificables(COLUMNA_VAR00002, true);
        this.setColumnasModificables(COLUMNA_P46, true);
        this.setColumnasModificables(COLUMNA_P47, true);
        this.setColumnasModificables(COLUMNA_VAR00030, true);
        this.setColumnasModificables(COLUMNA_P48, true);
        this.setColumnasModificables(COLUMNA_P49, true);
        this.setColumnasModificables(COLUMNA_P50A, true);
        this.setColumnasModificables(COLUMNA_P50B, true);
        this.setColumnasModificables(COLUMNA_P50C, true);
        this.setColumnasModificables(COLUMNA_P51, true);
        this.setColumnasModificables(COLUMNA_VAR00003, true);
        this.setColumnasModificables(COLUMNA_VAR00004, true);
        this.setColumnasModificables(COLUMNA_P52D, true);
        this.setColumnasModificables(COLUMNA_P52M, true);
        this.setColumnasModificables(COLUMNA_P52A, true);
        this.setColumnasModificables(COLUMNA_P53A, true);
        this.setColumnasModificables(COLUMNA_P53B, true);
        this.setColumnasModificables(COLUMNA_P53C, true);
        this.setColumnasModificables(COLUMNA_P53Z, true);
        this.setColumnasModificables(COLUMNA_P54, true);
        this.setColumnasModificables(COLUMNA_P54E, true);
        this.setColumnasModificables(COLUMNA_P56, true);
        this.setColumnasModificables(COLUMNA_P58, true);
        this.setColumnasModificables(COLUMNA_P58E, true);
        this.setColumnasModificables(COLUMNA_P59, true);
        this.setColumnasModificables(COLUMNA_P60, true);
        this.setColumnasModificables(COLUMNA_P61, true);
        this.setColumnasModificables(COLUMNA_P62, true);
        this.setColumnasModificables(COLUMNA_P63, true);
        this.setColumnasModificables(COLUMNA_P64, true);
        this.setColumnasModificables(COLUMNA_P65, true);
        this.setColumnasModificables(COLUMNA_P65E, true);
        this.setColumnasModificables(COLUMNA_P66, true);
        this.setColumnasModificables(COLUMNA_P66E, true);
        this.setColumnasModificables(COLUMNA_P67, true);
        this.setColumnasModificables(COLUMNA_P68, true);
        this.setColumnasModificables(COLUMNA_P68E, true);
        this.setColumnasModificables(COLUMNA_P73, true);
        this.setColumnasModificables(COLUMNA_P74, true);
        this.setColumnasModificables(COLUMNA_VAR00006, true);
        this.setColumnasModificables(COLUMNA_VAR00007, true);
        this.setColumnasModificables(COLUMNA_VAR00008, true);
        this.setColumnasModificables(COLUMNA_VAR00009, true);
        this.setColumnasModificables(COLUMNA_VAR00010, true);
        this.setColumnasModificables(COLUMNA_VAR00011, true);
        this.setColumnasModificables(COLUMNA_VAR00031, true);
        this.setColumnasModificables(COLUMNA_VAR00012, true);
        this.setColumnasModificables(COLUMNA_VAR00013, true);
        this.setColumnasModificables(COLUMNA_P86, true);
        this.setColumnasModificables(COLUMNA_P87, true);
        this.setColumnasModificables(COLUMNA_P87E, true);
        this.setColumnasModificables(COLUMNA_P88, true);
        this.setColumnasModificables(COLUMNA_P88E, true);
        this.setColumnasModificables(COLUMNA_P91, true);
        this.setColumnasModificables(COLUMNA_VAR00017, true);
        this.setColumnasModificables(COLUMNA_VAR00018, true);
        this.setColumnasModificables(COLUMNA_VAR00019, true);
        this.setColumnasModificables(COLUMNA_VAR00020, true);
        this.setColumnasModificables(COLUMNA_VAR00021, true);
        this.setColumnasModificables(COLUMNA_VAR00022, true);
        this.setColumnasModificables(COLUMNA_VAR00023, true);
        this.setColumnasModificables(COLUMNA_VAR00024, true);
        this.setColumnasModificables(COLUMNA_VAR00025, true);
        this.setColumnasModificables(COLUMNA_VAR00026, true);
        this.setColumnasModificables(COLUMNA_VAR00027, true);
        this.setColumnasModificables(COLUMNA_VAR00028, true);
        this.setColumnasModificables(COLUMNA_P92, true);
        this.setColumnasModificables(COLUMNA_ICV, true);
        this.setColumnasModificables(COLUMNA_FICHA_ACTIVA, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_PERSONA, true);
    }

    public Long getIdLogImpPer() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_PER);
    }
    public Long getIdLogImpPer(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_PER, rowKey);
    }
    public void setIdLogImpPer(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_PER, valor);
    }
    public void setIdLogImpPer(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_PER, rowKey, valor);
    }

    public Long getVersionLogImpPer() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_PER);
    }
    public Long getVersionLogImpPer(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_PER, rowKey);
    }
    public void setVersionLogImpPer(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_PER, valor);
    }
    public void setVersionLogImpPer(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_PER, rowKey, valor);
    }

    public String getP01a() {
        return (String) super.getValue(COLUMNA_P01A);
    }
    public String getP01a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P01A, rowKey);
    }
    public void setP01a(String valor) {
        super.setValue(COLUMNA_P01A, valor);
    }
    public void setP01a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P01A, rowKey, valor);
    }

    public String getP01b() {
        return (String) super.getValue(COLUMNA_P01B);
    }
    public String getP01b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P01B, rowKey);
    }
    public void setP01b(String valor) {
        super.setValue(COLUMNA_P01B, valor);
    }
    public void setP01b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P01B, rowKey, valor);
    }

    public String getP01c() {
        return (String) super.getValue(COLUMNA_P01C);
    }
    public String getP01c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P01C, rowKey);
    }
    public void setP01c(String valor) {
        super.setValue(COLUMNA_P01C, valor);
    }
    public void setP01c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P01C, rowKey, valor);
    }

    public String getP01d() {
        return (String) super.getValue(COLUMNA_P01D);
    }
    public String getP01d(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P01D, rowKey);
    }
    public void setP01d(String valor) {
        super.setValue(COLUMNA_P01D, valor);
    }
    public void setP01d(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P01D, rowKey, valor);
    }

    public String getP02() {
        return (String) super.getValue(COLUMNA_P02);
    }
    public String getP02(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P02, rowKey);
    }
    public void setP02(String valor) {
        super.setValue(COLUMNA_P02, valor);
    }
    public void setP02(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P02, rowKey, valor);
    }

    public String getP03() {
        return (String) super.getValue(COLUMNA_P03);
    }
    public String getP03(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P03, rowKey);
    }
    public void setP03(String valor) {
        super.setValue(COLUMNA_P03, valor);
    }
    public void setP03(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P03, rowKey, valor);
    }

    public String getP104() {
        return (String) super.getValue(COLUMNA_P104);
    }
    public String getP104(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P104, rowKey);
    }
    public void setP104(String valor) {
        super.setValue(COLUMNA_P104, valor);
    }
    public void setP104(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P104, rowKey, valor);
    }

    public String getP43() {
        return (String) super.getValue(COLUMNA_P43);
    }
    public String getP43(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P43, rowKey);
    }
    public void setP43(String valor) {
        super.setValue(COLUMNA_P43, valor);
    }
    public void setP43(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P43, rowKey, valor);
    }

    public String getP45a() {
        return (String) super.getValue(COLUMNA_P45A);
    }
    public String getP45a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P45A, rowKey);
    }
    public void setP45a(String valor) {
        super.setValue(COLUMNA_P45A, valor);
    }
    public void setP45a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P45A, rowKey, valor);
    }

    public String getP45b() {
        return (String) super.getValue(COLUMNA_P45B);
    }
    public String getP45b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P45B, rowKey);
    }
    public void setP45b(String valor) {
        super.setValue(COLUMNA_P45B, valor);
    }
    public void setP45b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P45B, rowKey, valor);
    }

    public String getP44a() {
        return (String) super.getValue(COLUMNA_P44A);
    }
    public String getP44a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P44A, rowKey);
    }
    public void setP44a(String valor) {
        super.setValue(COLUMNA_P44A, valor);
    }
    public void setP44a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P44A, rowKey, valor);
    }

    public String getP44b() {
        return (String) super.getValue(COLUMNA_P44B);
    }
    public String getP44b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P44B, rowKey);
    }
    public void setP44b(String valor) {
        super.setValue(COLUMNA_P44B, valor);
    }
    public void setP44b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P44B, rowKey, valor);
    }

    public String getVar00001() {
        return (String) super.getValue(COLUMNA_VAR00001);
    }
    public String getVar00001(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00001, rowKey);
    }
    public void setVar00001(String valor) {
        super.setValue(COLUMNA_VAR00001, valor);
    }
    public void setVar00001(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00001, rowKey, valor);
    }

    public String getVar00002() {
        return (String) super.getValue(COLUMNA_VAR00002);
    }
    public String getVar00002(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00002, rowKey);
    }
    public void setVar00002(String valor) {
        super.setValue(COLUMNA_VAR00002, valor);
    }
    public void setVar00002(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00002, rowKey, valor);
    }

    public String getP46() {
        return (String) super.getValue(COLUMNA_P46);
    }
    public String getP46(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P46, rowKey);
    }
    public void setP46(String valor) {
        super.setValue(COLUMNA_P46, valor);
    }
    public void setP46(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P46, rowKey, valor);
    }

    public String getP47() {
        return (String) super.getValue(COLUMNA_P47);
    }
    public String getP47(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P47, rowKey);
    }
    public void setP47(String valor) {
        super.setValue(COLUMNA_P47, valor);
    }
    public void setP47(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P47, rowKey, valor);
    }

    public String getVar00030() {
        return (String) super.getValue(COLUMNA_VAR00030);
    }
    public String getVar00030(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00030, rowKey);
    }
    public void setVar00030(String valor) {
        super.setValue(COLUMNA_VAR00030, valor);
    }
    public void setVar00030(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00030, rowKey, valor);
    }

    public String getP48() {
        return (String) super.getValue(COLUMNA_P48);
    }
    public String getP48(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P48, rowKey);
    }
    public void setP48(String valor) {
        super.setValue(COLUMNA_P48, valor);
    }
    public void setP48(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P48, rowKey, valor);
    }

    public String getP49() {
        return (String) super.getValue(COLUMNA_P49);
    }
    public String getP49(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P49, rowKey);
    }
    public void setP49(String valor) {
        super.setValue(COLUMNA_P49, valor);
    }
    public void setP49(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P49, rowKey, valor);
    }

    public String getP50a() {
        return (String) super.getValue(COLUMNA_P50A);
    }
    public String getP50a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P50A, rowKey);
    }
    public void setP50a(String valor) {
        super.setValue(COLUMNA_P50A, valor);
    }
    public void setP50a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P50A, rowKey, valor);
    }

    public String getP50b() {
        return (String) super.getValue(COLUMNA_P50B);
    }
    public String getP50b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P50B, rowKey);
    }
    public void setP50b(String valor) {
        super.setValue(COLUMNA_P50B, valor);
    }
    public void setP50b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P50B, rowKey, valor);
    }

    public String getP50c() {
        return (String) super.getValue(COLUMNA_P50C);
    }
    public String getP50c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P50C, rowKey);
    }
    public void setP50c(String valor) {
        super.setValue(COLUMNA_P50C, valor);
    }
    public void setP50c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P50C, rowKey, valor);
    }

    public String getP51() {
        return (String) super.getValue(COLUMNA_P51);
    }
    public String getP51(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P51, rowKey);
    }
    public void setP51(String valor) {
        super.setValue(COLUMNA_P51, valor);
    }
    public void setP51(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P51, rowKey, valor);
    }

    public String getVar00003() {
        return (String) super.getValue(COLUMNA_VAR00003);
    }
    public String getVar00003(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00003, rowKey);
    }
    public void setVar00003(String valor) {
        super.setValue(COLUMNA_VAR00003, valor);
    }
    public void setVar00003(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00003, rowKey, valor);
    }

    public String getVar00004() {
        return (String) super.getValue(COLUMNA_VAR00004);
    }
    public String getVar00004(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00004, rowKey);
    }
    public void setVar00004(String valor) {
        super.setValue(COLUMNA_VAR00004, valor);
    }
    public void setVar00004(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00004, rowKey, valor);
    }

    public String getP52d() {
        return (String) super.getValue(COLUMNA_P52D);
    }
    public String getP52d(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P52D, rowKey);
    }
    public void setP52d(String valor) {
        super.setValue(COLUMNA_P52D, valor);
    }
    public void setP52d(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P52D, rowKey, valor);
    }

    public String getP52m() {
        return (String) super.getValue(COLUMNA_P52M);
    }
    public String getP52m(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P52M, rowKey);
    }
    public void setP52m(String valor) {
        super.setValue(COLUMNA_P52M, valor);
    }
    public void setP52m(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P52M, rowKey, valor);
    }

    public String getP52a() {
        return (String) super.getValue(COLUMNA_P52A);
    }
    public String getP52a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P52A, rowKey);
    }
    public void setP52a(String valor) {
        super.setValue(COLUMNA_P52A, valor);
    }
    public void setP52a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P52A, rowKey, valor);
    }

    public String getP53a() {
        return (String) super.getValue(COLUMNA_P53A);
    }
    public String getP53a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P53A, rowKey);
    }
    public void setP53a(String valor) {
        super.setValue(COLUMNA_P53A, valor);
    }
    public void setP53a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P53A, rowKey, valor);
    }

    public String getP53b() {
        return (String) super.getValue(COLUMNA_P53B);
    }
    public String getP53b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P53B, rowKey);
    }
    public void setP53b(String valor) {
        super.setValue(COLUMNA_P53B, valor);
    }
    public void setP53b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P53B, rowKey, valor);
    }

    public String getP53c() {
        return (String) super.getValue(COLUMNA_P53C);
    }
    public String getP53c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P53C, rowKey);
    }
    public void setP53c(String valor) {
        super.setValue(COLUMNA_P53C, valor);
    }
    public void setP53c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P53C, rowKey, valor);
    }

    public String getP53z() {
        return (String) super.getValue(COLUMNA_P53Z);
    }
    public String getP53z(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P53Z, rowKey);
    }
    public void setP53z(String valor) {
        super.setValue(COLUMNA_P53Z, valor);
    }
    public void setP53z(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P53Z, rowKey, valor);
    }

    public String getP54() {
        return (String) super.getValue(COLUMNA_P54);
    }
    public String getP54(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P54, rowKey);
    }
    public void setP54(String valor) {
        super.setValue(COLUMNA_P54, valor);
    }
    public void setP54(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P54, rowKey, valor);
    }

    public String getP54e() {
        return (String) super.getValue(COLUMNA_P54E);
    }
    public String getP54e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P54E, rowKey);
    }
    public void setP54e(String valor) {
        super.setValue(COLUMNA_P54E, valor);
    }
    public void setP54e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P54E, rowKey, valor);
    }

    public String getP56() {
        return (String) super.getValue(COLUMNA_P56);
    }
    public String getP56(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P56, rowKey);
    }
    public void setP56(String valor) {
        super.setValue(COLUMNA_P56, valor);
    }
    public void setP56(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P56, rowKey, valor);
    }

    public String getP58() {
        return (String) super.getValue(COLUMNA_P58);
    }
    public String getP58(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P58, rowKey);
    }
    public void setP58(String valor) {
        super.setValue(COLUMNA_P58, valor);
    }
    public void setP58(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P58, rowKey, valor);
    }

    public String getP58e() {
        return (String) super.getValue(COLUMNA_P58E);
    }
    public String getP58e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P58E, rowKey);
    }
    public void setP58e(String valor) {
        super.setValue(COLUMNA_P58E, valor);
    }
    public void setP58e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P58E, rowKey, valor);
    }

    public String getP59() {
        return (String) super.getValue(COLUMNA_P59);
    }
    public String getP59(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P59, rowKey);
    }
    public void setP59(String valor) {
        super.setValue(COLUMNA_P59, valor);
    }
    public void setP59(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P59, rowKey, valor);
    }

    public String getP60() {
        return (String) super.getValue(COLUMNA_P60);
    }
    public String getP60(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P60, rowKey);
    }
    public void setP60(String valor) {
        super.setValue(COLUMNA_P60, valor);
    }
    public void setP60(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P60, rowKey, valor);
    }

    public String getP61() {
        return (String) super.getValue(COLUMNA_P61);
    }
    public String getP61(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P61, rowKey);
    }
    public void setP61(String valor) {
        super.setValue(COLUMNA_P61, valor);
    }
    public void setP61(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P61, rowKey, valor);
    }

    public String getP62() {
        return (String) super.getValue(COLUMNA_P62);
    }
    public String getP62(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P62, rowKey);
    }
    public void setP62(String valor) {
        super.setValue(COLUMNA_P62, valor);
    }
    public void setP62(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P62, rowKey, valor);
    }

    public String getP63() {
        return (String) super.getValue(COLUMNA_P63);
    }
    public String getP63(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P63, rowKey);
    }
    public void setP63(String valor) {
        super.setValue(COLUMNA_P63, valor);
    }
    public void setP63(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P63, rowKey, valor);
    }

    public String getP64() {
        return (String) super.getValue(COLUMNA_P64);
    }
    public String getP64(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P64, rowKey);
    }
    public void setP64(String valor) {
        super.setValue(COLUMNA_P64, valor);
    }
    public void setP64(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P64, rowKey, valor);
    }

    public String getP65() {
        return (String) super.getValue(COLUMNA_P65);
    }
    public String getP65(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P65, rowKey);
    }
    public void setP65(String valor) {
        super.setValue(COLUMNA_P65, valor);
    }
    public void setP65(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P65, rowKey, valor);
    }

    public String getP65e() {
        return (String) super.getValue(COLUMNA_P65E);
    }
    public String getP65e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P65E, rowKey);
    }
    public void setP65e(String valor) {
        super.setValue(COLUMNA_P65E, valor);
    }
    public void setP65e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P65E, rowKey, valor);
    }

    public String getP66() {
        return (String) super.getValue(COLUMNA_P66);
    }
    public String getP66(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P66, rowKey);
    }
    public void setP66(String valor) {
        super.setValue(COLUMNA_P66, valor);
    }
    public void setP66(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P66, rowKey, valor);
    }

    public String getP66e() {
        return (String) super.getValue(COLUMNA_P66E);
    }
    public String getP66e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P66E, rowKey);
    }
    public void setP66e(String valor) {
        super.setValue(COLUMNA_P66E, valor);
    }
    public void setP66e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P66E, rowKey, valor);
    }

    public String getP67() {
        return (String) super.getValue(COLUMNA_P67);
    }
    public String getP67(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67, rowKey);
    }
    public void setP67(String valor) {
        super.setValue(COLUMNA_P67, valor);
    }
    public void setP67(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67, rowKey, valor);
    }

    public String getP68() {
        return (String) super.getValue(COLUMNA_P68);
    }
    public String getP68(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P68, rowKey);
    }
    public void setP68(String valor) {
        super.setValue(COLUMNA_P68, valor);
    }
    public void setP68(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P68, rowKey, valor);
    }

    public String getP68e() {
        return (String) super.getValue(COLUMNA_P68E);
    }
    public String getP68e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P68E, rowKey);
    }
    public void setP68e(String valor) {
        super.setValue(COLUMNA_P68E, valor);
    }
    public void setP68e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P68E, rowKey, valor);
    }

    public String getP73() {
        return (String) super.getValue(COLUMNA_P73);
    }
    public String getP73(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P73, rowKey);
    }
    public void setP73(String valor) {
        super.setValue(COLUMNA_P73, valor);
    }
    public void setP73(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P73, rowKey, valor);
    }

    public String getP74() {
        return (String) super.getValue(COLUMNA_P74);
    }
    public String getP74(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P74, rowKey);
    }
    public void setP74(String valor) {
        super.setValue(COLUMNA_P74, valor);
    }
    public void setP74(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P74, rowKey, valor);
    }

    public String getVar00006() {
        return (String) super.getValue(COLUMNA_VAR00006);
    }
    public String getVar00006(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00006, rowKey);
    }
    public void setVar00006(String valor) {
        super.setValue(COLUMNA_VAR00006, valor);
    }
    public void setVar00006(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00006, rowKey, valor);
    }

    public String getVar00007() {
        return (String) super.getValue(COLUMNA_VAR00007);
    }
    public String getVar00007(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00007, rowKey);
    }
    public void setVar00007(String valor) {
        super.setValue(COLUMNA_VAR00007, valor);
    }
    public void setVar00007(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00007, rowKey, valor);
    }

    public String getVar00008() {
        return (String) super.getValue(COLUMNA_VAR00008);
    }
    public String getVar00008(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00008, rowKey);
    }
    public void setVar00008(String valor) {
        super.setValue(COLUMNA_VAR00008, valor);
    }
    public void setVar00008(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00008, rowKey, valor);
    }

    public String getVar00009() {
        return (String) super.getValue(COLUMNA_VAR00009);
    }
    public String getVar00009(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00009, rowKey);
    }
    public void setVar00009(String valor) {
        super.setValue(COLUMNA_VAR00009, valor);
    }
    public void setVar00009(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00009, rowKey, valor);
    }

    public String getVar00010() {
        return (String) super.getValue(COLUMNA_VAR00010);
    }
    public String getVar00010(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00010, rowKey);
    }
    public void setVar00010(String valor) {
        super.setValue(COLUMNA_VAR00010, valor);
    }
    public void setVar00010(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00010, rowKey, valor);
    }

    public String getVar00011() {
        return (String) super.getValue(COLUMNA_VAR00011);
    }
    public String getVar00011(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00011, rowKey);
    }
    public void setVar00011(String valor) {
        super.setValue(COLUMNA_VAR00011, valor);
    }
    public void setVar00011(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00011, rowKey, valor);
    }

    public String getVar00031() {
        return (String) super.getValue(COLUMNA_VAR00031);
    }
    public String getVar00031(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00031, rowKey);
    }
    public void setVar00031(String valor) {
        super.setValue(COLUMNA_VAR00031, valor);
    }
    public void setVar00031(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00031, rowKey, valor);
    }

    public String getVar00012() {
        return (String) super.getValue(COLUMNA_VAR00012);
    }
    public String getVar00012(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00012, rowKey);
    }
    public void setVar00012(String valor) {
        super.setValue(COLUMNA_VAR00012, valor);
    }
    public void setVar00012(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00012, rowKey, valor);
    }

    public String getVar00013() {
        return (String) super.getValue(COLUMNA_VAR00013);
    }
    public String getVar00013(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00013, rowKey);
    }
    public void setVar00013(String valor) {
        super.setValue(COLUMNA_VAR00013, valor);
    }
    public void setVar00013(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00013, rowKey, valor);
    }

    public String getP86() {
        return (String) super.getValue(COLUMNA_P86);
    }
    public String getP86(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P86, rowKey);
    }
    public void setP86(String valor) {
        super.setValue(COLUMNA_P86, valor);
    }
    public void setP86(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P86, rowKey, valor);
    }

    public String getP87() {
        return (String) super.getValue(COLUMNA_P87);
    }
    public String getP87(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P87, rowKey);
    }
    public void setP87(String valor) {
        super.setValue(COLUMNA_P87, valor);
    }
    public void setP87(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P87, rowKey, valor);
    }

    public String getP87e() {
        return (String) super.getValue(COLUMNA_P87E);
    }
    public String getP87e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P87E, rowKey);
    }
    public void setP87e(String valor) {
        super.setValue(COLUMNA_P87E, valor);
    }
    public void setP87e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P87E, rowKey, valor);
    }

    public String getP88() {
        return (String) super.getValue(COLUMNA_P88);
    }
    public String getP88(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P88, rowKey);
    }
    public void setP88(String valor) {
        super.setValue(COLUMNA_P88, valor);
    }
    public void setP88(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P88, rowKey, valor);
    }

    public String getP88e() {
        return (String) super.getValue(COLUMNA_P88E);
    }
    public String getP88e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P88E, rowKey);
    }
    public void setP88e(String valor) {
        super.setValue(COLUMNA_P88E, valor);
    }
    public void setP88e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P88E, rowKey, valor);
    }

    public String getP91() {
        return (String) super.getValue(COLUMNA_P91);
    }
    public String getP91(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P91, rowKey);
    }
    public void setP91(String valor) {
        super.setValue(COLUMNA_P91, valor);
    }
    public void setP91(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P91, rowKey, valor);
    }

    public String getVar00017() {
        return (String) super.getValue(COLUMNA_VAR00017);
    }
    public String getVar00017(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00017, rowKey);
    }
    public void setVar00017(String valor) {
        super.setValue(COLUMNA_VAR00017, valor);
    }
    public void setVar00017(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00017, rowKey, valor);
    }

    public String getVar00018() {
        return (String) super.getValue(COLUMNA_VAR00018);
    }
    public String getVar00018(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00018, rowKey);
    }
    public void setVar00018(String valor) {
        super.setValue(COLUMNA_VAR00018, valor);
    }
    public void setVar00018(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00018, rowKey, valor);
    }

    public String getVar00019() {
        return (String) super.getValue(COLUMNA_VAR00019);
    }
    public String getVar00019(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00019, rowKey);
    }
    public void setVar00019(String valor) {
        super.setValue(COLUMNA_VAR00019, valor);
    }
    public void setVar00019(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00019, rowKey, valor);
    }

    public String getVar00020() {
        return (String) super.getValue(COLUMNA_VAR00020);
    }
    public String getVar00020(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00020, rowKey);
    }
    public void setVar00020(String valor) {
        super.setValue(COLUMNA_VAR00020, valor);
    }
    public void setVar00020(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00020, rowKey, valor);
    }

    public String getVar00021() {
        return (String) super.getValue(COLUMNA_VAR00021);
    }
    public String getVar00021(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00021, rowKey);
    }
    public void setVar00021(String valor) {
        super.setValue(COLUMNA_VAR00021, valor);
    }
    public void setVar00021(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00021, rowKey, valor);
    }

    public String getVar00022() {
        return (String) super.getValue(COLUMNA_VAR00022);
    }
    public String getVar00022(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00022, rowKey);
    }
    public void setVar00022(String valor) {
        super.setValue(COLUMNA_VAR00022, valor);
    }
    public void setVar00022(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00022, rowKey, valor);
    }

    public String getVar00023() {
        return (String) super.getValue(COLUMNA_VAR00023);
    }
    public String getVar00023(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00023, rowKey);
    }
    public void setVar00023(String valor) {
        super.setValue(COLUMNA_VAR00023, valor);
    }
    public void setVar00023(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00023, rowKey, valor);
    }

    public String getVar00024() {
        return (String) super.getValue(COLUMNA_VAR00024);
    }
    public String getVar00024(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00024, rowKey);
    }
    public void setVar00024(String valor) {
        super.setValue(COLUMNA_VAR00024, valor);
    }
    public void setVar00024(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00024, rowKey, valor);
    }

    public String getVar00025() {
        return (String) super.getValue(COLUMNA_VAR00025);
    }
    public String getVar00025(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00025, rowKey);
    }
    public void setVar00025(String valor) {
        super.setValue(COLUMNA_VAR00025, valor);
    }
    public void setVar00025(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00025, rowKey, valor);
    }

    public String getVar00026() {
        return (String) super.getValue(COLUMNA_VAR00026);
    }
    public String getVar00026(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00026, rowKey);
    }
    public void setVar00026(String valor) {
        super.setValue(COLUMNA_VAR00026, valor);
    }
    public void setVar00026(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00026, rowKey, valor);
    }

    public String getVar00027() {
        return (String) super.getValue(COLUMNA_VAR00027);
    }
    public String getVar00027(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00027, rowKey);
    }
    public void setVar00027(String valor) {
        super.setValue(COLUMNA_VAR00027, valor);
    }
    public void setVar00027(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00027, rowKey, valor);
    }

    public String getVar00028() {
        return (String) super.getValue(COLUMNA_VAR00028);
    }
    public String getVar00028(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VAR00028, rowKey);
    }
    public void setVar00028(String valor) {
        super.setValue(COLUMNA_VAR00028, valor);
    }
    public void setVar00028(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VAR00028, rowKey, valor);
    }

    public String getP92() {
        return (String) super.getValue(COLUMNA_P92);
    }
    public String getP92(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P92, rowKey);
    }
    public void setP92(String valor) {
        super.setValue(COLUMNA_P92, valor);
    }
    public void setP92(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P92, rowKey, valor);
    }

    public String getIcv() {
        return (String) super.getValue(COLUMNA_ICV);
    }
    public String getIcv(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ICV, rowKey);
    }
    public void setIcv(String valor) {
        super.setValue(COLUMNA_ICV, valor);
    }
    public void setIcv(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ICV, rowKey, valor);
    }

    public String getFichaActiva() {
        return (String) super.getValue(COLUMNA_FICHA_ACTIVA);
    }
    public String getFichaActiva(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_FICHA_ACTIVA, rowKey);
    }
    public void setFichaActiva(String valor) {
        super.setValue(COLUMNA_FICHA_ACTIVA, valor);
    }
    public void setFichaActiva(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_FICHA_ACTIVA, rowKey, valor);
    }

    public Integer getEsImportado() {
        return (Integer) super.getValue(COLUMNA_ES_IMPORTADO);
    }
    public Integer getEsImportado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_IMPORTADO, rowKey);
    }
    public void setEsImportado(Integer valor) {
        super.setValue(COLUMNA_ES_IMPORTADO, valor);
    }
    public void setEsImportado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_IMPORTADO, rowKey, valor);
    }

    public String getObservacion() {
        return (String) super.getValue(COLUMNA_OBSERVACION);
    }
    public String getObservacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACION, rowKey);
    }
    public void setObservacion(String valor) {
        super.setValue(COLUMNA_OBSERVACION, valor);
    }
    public void setObservacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACION, rowKey, valor);
    }

    public Timestamp getFechaHoraTransaccion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_TRANSACCION);
    }
    public Timestamp getFechaHoraTransaccion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_TRANSACCION, rowKey);
    }
    public void setFechaHoraTransaccion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_TRANSACCION, valor);
    }
    public void setFechaHoraTransaccion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_TRANSACCION, rowKey, valor);
    }

    public String getNombreArchivo() {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO);
    }
    public String getNombreArchivo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_ARCHIVO, rowKey);
    }
    public void setNombreArchivo(String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO, valor);
    }
    public void setNombreArchivo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_ARCHIVO, rowKey, valor);
    }

    public String getCodigoArchivo() {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO);
    }
    public String getCodigoArchivo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_ARCHIVO, rowKey);
    }
    public void setCodigoArchivo(String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO, valor);
    }
    public void setCodigoArchivo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_ARCHIVO, rowKey, valor);
    }

    public Long getIdFichaPersona() {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA);
    }
    public Long getIdFichaPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA, rowKey);
    }
    public void setIdFichaPersona(Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, valor);
    }
    public void setIdFichaPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_per";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_per";

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
        return this.getIdLogImpPer();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpPer(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpPer(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpPer(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpPer();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpPer(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpPer(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpPer(rowKey, versionRecurso);
    }
}
