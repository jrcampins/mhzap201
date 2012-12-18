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

public class LogImpHogCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpHogCachedRowSetDataProvider() {
        super();
    }

    public LogImpHogCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_hog";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Fichas Hogar";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_hog_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_hog";

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

    public static final String COLUMNA_ID_LOG_IMP_HOG = "id_log_imp_hog";
    public static final String COLUMNA_VERSION_LOG_IMP_HOG = "version_log_imp_hog";
    public static final String COLUMNA_P20D = "p20d";
    public static final String COLUMNA_P20M = "p20m";
    public static final String COLUMNA_P20A = "p20a";
    public static final String COLUMNA_P17 = "p17";
    public static final String COLUMNA_P18 = "p18";
    public static final String COLUMNA_VAR00001 = "var00001";
    public static final String COLUMNA_P19 = "p19";
    public static final String COLUMNA_OBSERVACIONES = "observaciones";
    public static final String COLUMNA_UTM = "utm";
    public static final String COLUMNA_GPS = "gps";
    public static final String COLUMNA_ORDEN = "orden";
    public static final String COLUMNA_COORDX = "coordx";
    public static final String COLUMNA_P01A = "p01a";
    public static final String COLUMNA_P01B = "p01b";
    public static final String COLUMNA_P01C = "p01c";
    public static final String COLUMNA_P01D = "p01d";
    public static final String COLUMNA_P02 = "p02";
    public static final String COLUMNA_P03 = "p03";
    public static final String COLUMNA_P04 = "p04";
    public static final String COLUMNA_P05 = "p05";
    public static final String COLUMNA_P06 = "p06";
    public static final String COLUMNA_P08 = "p08";
    public static final String COLUMNA_P07 = "p07";
    public static final String COLUMNA_P09 = "p09";
    public static final String COLUMNA_P14 = "p14";
    public static final String COLUMNA_P15 = "p15";
    public static final String COLUMNA_P16 = "p16";
    public static final String COLUMNA_P24 = "p24";
    public static final String COLUMNA_P25 = "p25";
    public static final String COLUMNA_P26 = "p26";
    public static final String COLUMNA_P27 = "p27";
    public static final String COLUMNA_P27E = "p27e";
    public static final String COLUMNA_P28A = "p28a";
    public static final String COLUMNA_P28B = "p28b";
    public static final String COLUMNA_P29 = "p29";
    public static final String COLUMNA_P30 = "p30";
    public static final String COLUMNA_P31 = "p31";
    public static final String COLUMNA_P32 = "p32";
    public static final String COLUMNA_P33 = "p33";
    public static final String COLUMNA_P34 = "p34";
    public static final String COLUMNA_P35 = "p35";
    public static final String COLUMNA_P36 = "p36";
    public static final String COLUMNA_P37 = "p37";
    public static final String COLUMNA_NRO_CELULAR = "nro_celular";
    public static final String COLUMNA_P38 = "p38";
    public static final String COLUMNA_NRO_LINEA_BAJA = "nro_linea_baja";
    public static final String COLUMNA_P391 = "p391";
    public static final String COLUMNA_P392 = "p392";
    public static final String COLUMNA_P393 = "p393";
    public static final String COLUMNA_P394 = "p394";
    public static final String COLUMNA_P395 = "p395";
    public static final String COLUMNA_P396 = "p396";
    public static final String COLUMNA_P397 = "p397";
    public static final String COLUMNA_P42N = "p42n";
    public static final String COLUMNA_P42CI = "p42ci";
    public static final String COLUMNA_LETRA_CI = "letra_ci";
    public static final String COLUMNA_P43 = "p43";
    public static final String COLUMNA_VAR00002 = "var00002";
    public static final String COLUMNA_VAR00003 = "var00003";
    public static final String COLUMNA_VAR00004 = "var00004";
    public static final String COLUMNA_P104 = "p104";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_HOG, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_HOG, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P20D, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P20M, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P20A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P17, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P18, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00001, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P19, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_UTM, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_GPS, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COORDX, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P01D, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P02, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P03, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P04, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P05, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P06, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P08, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P07, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P09, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P16, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P24, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P25, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P26, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P27, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P27E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P28A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P28B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P29, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P30, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P31, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P32, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P33, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P34, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P35, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P36, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P37, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NRO_CELULAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P38, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NRO_LINEA_BAJA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P391, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P392, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P393, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P394, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P395, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P396, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P397, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P42N, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P42CI, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CI, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P43, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00002, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00003, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00004, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P104, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_HOG, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_HOG, true);
        this.setColumnasInsertables(COLUMNA_P20D, true);
        this.setColumnasInsertables(COLUMNA_P20M, true);
        this.setColumnasInsertables(COLUMNA_P20A, true);
        this.setColumnasInsertables(COLUMNA_P17, true);
        this.setColumnasInsertables(COLUMNA_P18, true);
        this.setColumnasInsertables(COLUMNA_VAR00001, true);
        this.setColumnasInsertables(COLUMNA_P19, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasInsertables(COLUMNA_UTM, true);
        this.setColumnasInsertables(COLUMNA_GPS, true);
        this.setColumnasInsertables(COLUMNA_ORDEN, true);
        this.setColumnasInsertables(COLUMNA_COORDX, true);
        this.setColumnasInsertables(COLUMNA_P01A, true);
        this.setColumnasInsertables(COLUMNA_P01B, true);
        this.setColumnasInsertables(COLUMNA_P01C, true);
        this.setColumnasInsertables(COLUMNA_P01D, true);
        this.setColumnasInsertables(COLUMNA_P02, true);
        this.setColumnasInsertables(COLUMNA_P03, true);
        this.setColumnasInsertables(COLUMNA_P04, true);
        this.setColumnasInsertables(COLUMNA_P05, true);
        this.setColumnasInsertables(COLUMNA_P06, true);
        this.setColumnasInsertables(COLUMNA_P08, true);
        this.setColumnasInsertables(COLUMNA_P07, true);
        this.setColumnasInsertables(COLUMNA_P09, true);
        this.setColumnasInsertables(COLUMNA_P14, true);
        this.setColumnasInsertables(COLUMNA_P15, true);
        this.setColumnasInsertables(COLUMNA_P16, true);
        this.setColumnasInsertables(COLUMNA_P24, true);
        this.setColumnasInsertables(COLUMNA_P25, true);
        this.setColumnasInsertables(COLUMNA_P26, true);
        this.setColumnasInsertables(COLUMNA_P27, true);
        this.setColumnasInsertables(COLUMNA_P27E, true);
        this.setColumnasInsertables(COLUMNA_P28A, true);
        this.setColumnasInsertables(COLUMNA_P28B, true);
        this.setColumnasInsertables(COLUMNA_P29, true);
        this.setColumnasInsertables(COLUMNA_P30, true);
        this.setColumnasInsertables(COLUMNA_P31, true);
        this.setColumnasInsertables(COLUMNA_P32, true);
        this.setColumnasInsertables(COLUMNA_P33, true);
        this.setColumnasInsertables(COLUMNA_P34, true);
        this.setColumnasInsertables(COLUMNA_P35, true);
        this.setColumnasInsertables(COLUMNA_P36, true);
        this.setColumnasInsertables(COLUMNA_P37, true);
        this.setColumnasInsertables(COLUMNA_NRO_CELULAR, true);
        this.setColumnasInsertables(COLUMNA_P38, true);
        this.setColumnasInsertables(COLUMNA_NRO_LINEA_BAJA, true);
        this.setColumnasInsertables(COLUMNA_P391, true);
        this.setColumnasInsertables(COLUMNA_P392, true);
        this.setColumnasInsertables(COLUMNA_P393, true);
        this.setColumnasInsertables(COLUMNA_P394, true);
        this.setColumnasInsertables(COLUMNA_P395, true);
        this.setColumnasInsertables(COLUMNA_P396, true);
        this.setColumnasInsertables(COLUMNA_P397, true);
        this.setColumnasInsertables(COLUMNA_P42N, true);
        this.setColumnasInsertables(COLUMNA_P42CI, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CI, true);
        this.setColumnasInsertables(COLUMNA_P43, true);
        this.setColumnasInsertables(COLUMNA_VAR00002, true);
        this.setColumnasInsertables(COLUMNA_VAR00003, true);
        this.setColumnasInsertables(COLUMNA_VAR00004, true);
        this.setColumnasInsertables(COLUMNA_P104, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_HOG, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_HOG, true);
        this.setColumnasModificables(COLUMNA_P20D, true);
        this.setColumnasModificables(COLUMNA_P20M, true);
        this.setColumnasModificables(COLUMNA_P20A, true);
        this.setColumnasModificables(COLUMNA_P17, true);
        this.setColumnasModificables(COLUMNA_P18, true);
        this.setColumnasModificables(COLUMNA_VAR00001, true);
        this.setColumnasModificables(COLUMNA_P19, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasModificables(COLUMNA_UTM, true);
        this.setColumnasModificables(COLUMNA_GPS, true);
        this.setColumnasModificables(COLUMNA_ORDEN, true);
        this.setColumnasModificables(COLUMNA_COORDX, true);
        this.setColumnasModificables(COLUMNA_P01A, true);
        this.setColumnasModificables(COLUMNA_P01B, true);
        this.setColumnasModificables(COLUMNA_P01C, true);
        this.setColumnasModificables(COLUMNA_P01D, true);
        this.setColumnasModificables(COLUMNA_P02, true);
        this.setColumnasModificables(COLUMNA_P03, true);
        this.setColumnasModificables(COLUMNA_P04, true);
        this.setColumnasModificables(COLUMNA_P05, true);
        this.setColumnasModificables(COLUMNA_P06, true);
        this.setColumnasModificables(COLUMNA_P08, true);
        this.setColumnasModificables(COLUMNA_P07, true);
        this.setColumnasModificables(COLUMNA_P09, true);
        this.setColumnasModificables(COLUMNA_P14, true);
        this.setColumnasModificables(COLUMNA_P15, true);
        this.setColumnasModificables(COLUMNA_P16, true);
        this.setColumnasModificables(COLUMNA_P24, true);
        this.setColumnasModificables(COLUMNA_P25, true);
        this.setColumnasModificables(COLUMNA_P26, true);
        this.setColumnasModificables(COLUMNA_P27, true);
        this.setColumnasModificables(COLUMNA_P27E, true);
        this.setColumnasModificables(COLUMNA_P28A, true);
        this.setColumnasModificables(COLUMNA_P28B, true);
        this.setColumnasModificables(COLUMNA_P29, true);
        this.setColumnasModificables(COLUMNA_P30, true);
        this.setColumnasModificables(COLUMNA_P31, true);
        this.setColumnasModificables(COLUMNA_P32, true);
        this.setColumnasModificables(COLUMNA_P33, true);
        this.setColumnasModificables(COLUMNA_P34, true);
        this.setColumnasModificables(COLUMNA_P35, true);
        this.setColumnasModificables(COLUMNA_P36, true);
        this.setColumnasModificables(COLUMNA_P37, true);
        this.setColumnasModificables(COLUMNA_NRO_CELULAR, true);
        this.setColumnasModificables(COLUMNA_P38, true);
        this.setColumnasModificables(COLUMNA_NRO_LINEA_BAJA, true);
        this.setColumnasModificables(COLUMNA_P391, true);
        this.setColumnasModificables(COLUMNA_P392, true);
        this.setColumnasModificables(COLUMNA_P393, true);
        this.setColumnasModificables(COLUMNA_P394, true);
        this.setColumnasModificables(COLUMNA_P395, true);
        this.setColumnasModificables(COLUMNA_P396, true);
        this.setColumnasModificables(COLUMNA_P397, true);
        this.setColumnasModificables(COLUMNA_P42N, true);
        this.setColumnasModificables(COLUMNA_P42CI, true);
        this.setColumnasModificables(COLUMNA_LETRA_CI, true);
        this.setColumnasModificables(COLUMNA_P43, true);
        this.setColumnasModificables(COLUMNA_VAR00002, true);
        this.setColumnasModificables(COLUMNA_VAR00003, true);
        this.setColumnasModificables(COLUMNA_VAR00004, true);
        this.setColumnasModificables(COLUMNA_P104, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpHog() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_HOG);
    }
    public Long getIdLogImpHog(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_HOG, rowKey);
    }
    public void setIdLogImpHog(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_HOG, valor);
    }
    public void setIdLogImpHog(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_HOG, rowKey, valor);
    }

    public Long getVersionLogImpHog() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_HOG);
    }
    public Long getVersionLogImpHog(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_HOG, rowKey);
    }
    public void setVersionLogImpHog(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_HOG, valor);
    }
    public void setVersionLogImpHog(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_HOG, rowKey, valor);
    }

    public String getP20d() {
        return (String) super.getValue(COLUMNA_P20D);
    }
    public String getP20d(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P20D, rowKey);
    }
    public void setP20d(String valor) {
        super.setValue(COLUMNA_P20D, valor);
    }
    public void setP20d(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P20D, rowKey, valor);
    }

    public String getP20m() {
        return (String) super.getValue(COLUMNA_P20M);
    }
    public String getP20m(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P20M, rowKey);
    }
    public void setP20m(String valor) {
        super.setValue(COLUMNA_P20M, valor);
    }
    public void setP20m(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P20M, rowKey, valor);
    }

    public String getP20a() {
        return (String) super.getValue(COLUMNA_P20A);
    }
    public String getP20a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P20A, rowKey);
    }
    public void setP20a(String valor) {
        super.setValue(COLUMNA_P20A, valor);
    }
    public void setP20a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P20A, rowKey, valor);
    }

    public String getP17() {
        return (String) super.getValue(COLUMNA_P17);
    }
    public String getP17(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P17, rowKey);
    }
    public void setP17(String valor) {
        super.setValue(COLUMNA_P17, valor);
    }
    public void setP17(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P17, rowKey, valor);
    }

    public String getP18() {
        return (String) super.getValue(COLUMNA_P18);
    }
    public String getP18(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P18, rowKey);
    }
    public void setP18(String valor) {
        super.setValue(COLUMNA_P18, valor);
    }
    public void setP18(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P18, rowKey, valor);
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

    public String getP19() {
        return (String) super.getValue(COLUMNA_P19);
    }
    public String getP19(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P19, rowKey);
    }
    public void setP19(String valor) {
        super.setValue(COLUMNA_P19, valor);
    }
    public void setP19(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P19, rowKey, valor);
    }

    public String getObservaciones() {
        return (String) super.getValue(COLUMNA_OBSERVACIONES);
    }
    public String getObservaciones(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACIONES, rowKey);
    }
    public void setObservaciones(String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, valor);
    }
    public void setObservaciones(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, rowKey, valor);
    }

    public String getUtm() {
        return (String) super.getValue(COLUMNA_UTM);
    }
    public String getUtm(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_UTM, rowKey);
    }
    public void setUtm(String valor) {
        super.setValue(COLUMNA_UTM, valor);
    }
    public void setUtm(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_UTM, rowKey, valor);
    }

    public String getGps() {
        return (String) super.getValue(COLUMNA_GPS);
    }
    public String getGps(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_GPS, rowKey);
    }
    public void setGps(String valor) {
        super.setValue(COLUMNA_GPS, valor);
    }
    public void setGps(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_GPS, rowKey, valor);
    }

    public String getOrden() {
        return (String) super.getValue(COLUMNA_ORDEN);
    }
    public String getOrden(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ORDEN, rowKey);
    }
    public void setOrden(String valor) {
        super.setValue(COLUMNA_ORDEN, valor);
    }
    public void setOrden(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ORDEN, rowKey, valor);
    }

    public String getCoordx() {
        return (String) super.getValue(COLUMNA_COORDX);
    }
    public String getCoordx(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COORDX, rowKey);
    }
    public void setCoordx(String valor) {
        super.setValue(COLUMNA_COORDX, valor);
    }
    public void setCoordx(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COORDX, rowKey, valor);
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

    public String getP04() {
        return (String) super.getValue(COLUMNA_P04);
    }
    public String getP04(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P04, rowKey);
    }
    public void setP04(String valor) {
        super.setValue(COLUMNA_P04, valor);
    }
    public void setP04(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P04, rowKey, valor);
    }

    public String getP05() {
        return (String) super.getValue(COLUMNA_P05);
    }
    public String getP05(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P05, rowKey);
    }
    public void setP05(String valor) {
        super.setValue(COLUMNA_P05, valor);
    }
    public void setP05(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P05, rowKey, valor);
    }

    public String getP06() {
        return (String) super.getValue(COLUMNA_P06);
    }
    public String getP06(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P06, rowKey);
    }
    public void setP06(String valor) {
        super.setValue(COLUMNA_P06, valor);
    }
    public void setP06(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P06, rowKey, valor);
    }

    public String getP08() {
        return (String) super.getValue(COLUMNA_P08);
    }
    public String getP08(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P08, rowKey);
    }
    public void setP08(String valor) {
        super.setValue(COLUMNA_P08, valor);
    }
    public void setP08(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P08, rowKey, valor);
    }

    public String getP07() {
        return (String) super.getValue(COLUMNA_P07);
    }
    public String getP07(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P07, rowKey);
    }
    public void setP07(String valor) {
        super.setValue(COLUMNA_P07, valor);
    }
    public void setP07(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P07, rowKey, valor);
    }

    public String getP09() {
        return (String) super.getValue(COLUMNA_P09);
    }
    public String getP09(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P09, rowKey);
    }
    public void setP09(String valor) {
        super.setValue(COLUMNA_P09, valor);
    }
    public void setP09(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P09, rowKey, valor);
    }

    public String getP14() {
        return (String) super.getValue(COLUMNA_P14);
    }
    public String getP14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P14, rowKey);
    }
    public void setP14(String valor) {
        super.setValue(COLUMNA_P14, valor);
    }
    public void setP14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P14, rowKey, valor);
    }

    public String getP15() {
        return (String) super.getValue(COLUMNA_P15);
    }
    public String getP15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P15, rowKey);
    }
    public void setP15(String valor) {
        super.setValue(COLUMNA_P15, valor);
    }
    public void setP15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P15, rowKey, valor);
    }

    public String getP16() {
        return (String) super.getValue(COLUMNA_P16);
    }
    public String getP16(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P16, rowKey);
    }
    public void setP16(String valor) {
        super.setValue(COLUMNA_P16, valor);
    }
    public void setP16(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P16, rowKey, valor);
    }

    public String getP24() {
        return (String) super.getValue(COLUMNA_P24);
    }
    public String getP24(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P24, rowKey);
    }
    public void setP24(String valor) {
        super.setValue(COLUMNA_P24, valor);
    }
    public void setP24(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P24, rowKey, valor);
    }

    public String getP25() {
        return (String) super.getValue(COLUMNA_P25);
    }
    public String getP25(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P25, rowKey);
    }
    public void setP25(String valor) {
        super.setValue(COLUMNA_P25, valor);
    }
    public void setP25(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P25, rowKey, valor);
    }

    public String getP26() {
        return (String) super.getValue(COLUMNA_P26);
    }
    public String getP26(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P26, rowKey);
    }
    public void setP26(String valor) {
        super.setValue(COLUMNA_P26, valor);
    }
    public void setP26(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P26, rowKey, valor);
    }

    public String getP27() {
        return (String) super.getValue(COLUMNA_P27);
    }
    public String getP27(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P27, rowKey);
    }
    public void setP27(String valor) {
        super.setValue(COLUMNA_P27, valor);
    }
    public void setP27(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P27, rowKey, valor);
    }

    public String getP27e() {
        return (String) super.getValue(COLUMNA_P27E);
    }
    public String getP27e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P27E, rowKey);
    }
    public void setP27e(String valor) {
        super.setValue(COLUMNA_P27E, valor);
    }
    public void setP27e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P27E, rowKey, valor);
    }

    public String getP28a() {
        return (String) super.getValue(COLUMNA_P28A);
    }
    public String getP28a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P28A, rowKey);
    }
    public void setP28a(String valor) {
        super.setValue(COLUMNA_P28A, valor);
    }
    public void setP28a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P28A, rowKey, valor);
    }

    public String getP28b() {
        return (String) super.getValue(COLUMNA_P28B);
    }
    public String getP28b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P28B, rowKey);
    }
    public void setP28b(String valor) {
        super.setValue(COLUMNA_P28B, valor);
    }
    public void setP28b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P28B, rowKey, valor);
    }

    public String getP29() {
        return (String) super.getValue(COLUMNA_P29);
    }
    public String getP29(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P29, rowKey);
    }
    public void setP29(String valor) {
        super.setValue(COLUMNA_P29, valor);
    }
    public void setP29(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P29, rowKey, valor);
    }

    public String getP30() {
        return (String) super.getValue(COLUMNA_P30);
    }
    public String getP30(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P30, rowKey);
    }
    public void setP30(String valor) {
        super.setValue(COLUMNA_P30, valor);
    }
    public void setP30(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P30, rowKey, valor);
    }

    public String getP31() {
        return (String) super.getValue(COLUMNA_P31);
    }
    public String getP31(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P31, rowKey);
    }
    public void setP31(String valor) {
        super.setValue(COLUMNA_P31, valor);
    }
    public void setP31(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P31, rowKey, valor);
    }

    public String getP32() {
        return (String) super.getValue(COLUMNA_P32);
    }
    public String getP32(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P32, rowKey);
    }
    public void setP32(String valor) {
        super.setValue(COLUMNA_P32, valor);
    }
    public void setP32(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P32, rowKey, valor);
    }

    public String getP33() {
        return (String) super.getValue(COLUMNA_P33);
    }
    public String getP33(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P33, rowKey);
    }
    public void setP33(String valor) {
        super.setValue(COLUMNA_P33, valor);
    }
    public void setP33(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P33, rowKey, valor);
    }

    public String getP34() {
        return (String) super.getValue(COLUMNA_P34);
    }
    public String getP34(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P34, rowKey);
    }
    public void setP34(String valor) {
        super.setValue(COLUMNA_P34, valor);
    }
    public void setP34(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P34, rowKey, valor);
    }

    public String getP35() {
        return (String) super.getValue(COLUMNA_P35);
    }
    public String getP35(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P35, rowKey);
    }
    public void setP35(String valor) {
        super.setValue(COLUMNA_P35, valor);
    }
    public void setP35(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P35, rowKey, valor);
    }

    public String getP36() {
        return (String) super.getValue(COLUMNA_P36);
    }
    public String getP36(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P36, rowKey);
    }
    public void setP36(String valor) {
        super.setValue(COLUMNA_P36, valor);
    }
    public void setP36(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P36, rowKey, valor);
    }

    public String getP37() {
        return (String) super.getValue(COLUMNA_P37);
    }
    public String getP37(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P37, rowKey);
    }
    public void setP37(String valor) {
        super.setValue(COLUMNA_P37, valor);
    }
    public void setP37(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P37, rowKey, valor);
    }

    public String getNroCelular() {
        return (String) super.getValue(COLUMNA_NRO_CELULAR);
    }
    public String getNroCelular(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NRO_CELULAR, rowKey);
    }
    public void setNroCelular(String valor) {
        super.setValue(COLUMNA_NRO_CELULAR, valor);
    }
    public void setNroCelular(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NRO_CELULAR, rowKey, valor);
    }

    public String getP38() {
        return (String) super.getValue(COLUMNA_P38);
    }
    public String getP38(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P38, rowKey);
    }
    public void setP38(String valor) {
        super.setValue(COLUMNA_P38, valor);
    }
    public void setP38(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P38, rowKey, valor);
    }

    public String getNroLineaBaja() {
        return (String) super.getValue(COLUMNA_NRO_LINEA_BAJA);
    }
    public String getNroLineaBaja(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NRO_LINEA_BAJA, rowKey);
    }
    public void setNroLineaBaja(String valor) {
        super.setValue(COLUMNA_NRO_LINEA_BAJA, valor);
    }
    public void setNroLineaBaja(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NRO_LINEA_BAJA, rowKey, valor);
    }

    public String getP391() {
        return (String) super.getValue(COLUMNA_P391);
    }
    public String getP391(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P391, rowKey);
    }
    public void setP391(String valor) {
        super.setValue(COLUMNA_P391, valor);
    }
    public void setP391(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P391, rowKey, valor);
    }

    public String getP392() {
        return (String) super.getValue(COLUMNA_P392);
    }
    public String getP392(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P392, rowKey);
    }
    public void setP392(String valor) {
        super.setValue(COLUMNA_P392, valor);
    }
    public void setP392(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P392, rowKey, valor);
    }

    public String getP393() {
        return (String) super.getValue(COLUMNA_P393);
    }
    public String getP393(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P393, rowKey);
    }
    public void setP393(String valor) {
        super.setValue(COLUMNA_P393, valor);
    }
    public void setP393(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P393, rowKey, valor);
    }

    public String getP394() {
        return (String) super.getValue(COLUMNA_P394);
    }
    public String getP394(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P394, rowKey);
    }
    public void setP394(String valor) {
        super.setValue(COLUMNA_P394, valor);
    }
    public void setP394(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P394, rowKey, valor);
    }

    public String getP395() {
        return (String) super.getValue(COLUMNA_P395);
    }
    public String getP395(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P395, rowKey);
    }
    public void setP395(String valor) {
        super.setValue(COLUMNA_P395, valor);
    }
    public void setP395(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P395, rowKey, valor);
    }

    public String getP396() {
        return (String) super.getValue(COLUMNA_P396);
    }
    public String getP396(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P396, rowKey);
    }
    public void setP396(String valor) {
        super.setValue(COLUMNA_P396, valor);
    }
    public void setP396(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P396, rowKey, valor);
    }

    public String getP397() {
        return (String) super.getValue(COLUMNA_P397);
    }
    public String getP397(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P397, rowKey);
    }
    public void setP397(String valor) {
        super.setValue(COLUMNA_P397, valor);
    }
    public void setP397(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P397, rowKey, valor);
    }

    public String getP42n() {
        return (String) super.getValue(COLUMNA_P42N);
    }
    public String getP42n(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P42N, rowKey);
    }
    public void setP42n(String valor) {
        super.setValue(COLUMNA_P42N, valor);
    }
    public void setP42n(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P42N, rowKey, valor);
    }

    public String getP42ci() {
        return (String) super.getValue(COLUMNA_P42CI);
    }
    public String getP42ci(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P42CI, rowKey);
    }
    public void setP42ci(String valor) {
        super.setValue(COLUMNA_P42CI, valor);
    }
    public void setP42ci(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P42CI, rowKey, valor);
    }

    public String getLetraCi() {
        return (String) super.getValue(COLUMNA_LETRA_CI);
    }
    public String getLetraCi(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CI, rowKey);
    }
    public void setLetraCi(String valor) {
        super.setValue(COLUMNA_LETRA_CI, valor);
    }
    public void setLetraCi(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CI, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_hog";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_hog";

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
        return this.getIdLogImpHog();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpHog(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpHog(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpHog(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpHog();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpHog(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpHog(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpHog(rowKey, versionRecurso);
    }
}
