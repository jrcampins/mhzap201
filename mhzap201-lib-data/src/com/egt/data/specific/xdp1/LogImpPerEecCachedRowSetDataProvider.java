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

public class LogImpPerEecCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpPerEecCachedRowSetDataProvider() {
        super();
    }

    public LogImpPerEecCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_per_eec";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Fichas Persona DGEEC";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_per_eec_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_per_eec";

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

    public static final String COLUMNA_ID_LOG_IMP_PER_EEC = "id_log_imp_per_eec";
    public static final String COLUMNA_VERSION_LOG_IMP_PER_EEC = "version_log_imp_per_eec";
    public static final String COLUMNA_DPTOD = "dptod";
    public static final String COLUMNA_DISTRITOD = "distritod";
    public static final String COLUMNA_DISTRIPG = "distripg";
    public static final String COLUMNA_AREA = "area";
    public static final String COLUMNA_BARRIO = "barrio";
    public static final String COLUMNA_MANZANA = "manzana";
    public static final String COLUMNA_FORMULARIO = "formulario";
    public static final String COLUMNA_VIVI = "vivi";
    public static final String COLUMNA_HOGAR = "hogar";
    public static final String COLUMNA_ORDEN = "orden";
    public static final String COLUMNA_P30 = "p30";
    public static final String COLUMNA_P31 = "p31";
    public static final String COLUMNA_P32 = "p32";
    public static final String COLUMNA_P33 = "p33";
    public static final String COLUMNA_P34 = "p34";
    public static final String COLUMNA_P35 = "p35";
    public static final String COLUMNA_P36_ORDEN_CONYUGUE = "p36_orden_conyugue";
    public static final String COLUMNA_P36_ORDEN_PADRE = "p36_orden_padre";
    public static final String COLUMNA_P36_ORDEN_MADRE = "p36_orden_madre";
    public static final String COLUMNA_P37 = "p37";
    public static final String COLUMNA_P37_CEDULA = "p37_cedula";
    public static final String COLUMNA_P38_DIA = "p38_dia";
    public static final String COLUMNA_P38_MES = "p38_mes";
    public static final String COLUMNA_P38_ANO = "p38_ano";
    public static final String COLUMNA_P39PAIS = "p39pais";
    public static final String COLUMNA_P39DPTO = "p39dpto";
    public static final String COLUMNA_P39DIST = "p39dist";
    public static final String COLUMNA_P39AREA = "p39area";
    public static final String COLUMNA_P40_IDIOMA = "p40_idioma";
    public static final String COLUMNA_P40OTR = "p40otr";
    public static final String COLUMNA_P41 = "p41";
    public static final String COLUMNA_P42 = "p42";
    public static final String COLUMNA_P43 = "p43";
    public static final String COLUMNA_P44_45T = "p44_45t";
    public static final String COLUMNA_P44 = "p44";
    public static final String COLUMNA_P45 = "p45";
    public static final String COLUMNA_P46 = "p46";
    public static final String COLUMNA_P47 = "p47";
    public static final String COLUMNA_P48 = "p48";
    public static final String COLUMNA_P49 = "p49";
    public static final String COLUMNA_P49_OTR = "p49_otr";
    public static final String COLUMNA_P50 = "p50";
    public static final String COLUMNA_P50_OTR = "p50_otr";
    public static final String COLUMNA_P51 = "p51";
    public static final String COLUMNA_P52 = "p52";
    public static final String COLUMNA_P52_OTR = "p52_otr";
    public static final String COLUMNA_P53 = "p53";
    public static final String COLUMNA_P54 = "p54";
    public static final String COLUMNA_P54A = "p54a";
    public static final String COLUMNA_P54_OTR = "p54_otr";
    public static final String COLUMNA_P55 = "p55";
    public static final String COLUMNA_P55_OTR = "p55_otr";
    public static final String COLUMNA_P56 = "p56";
    public static final String COLUMNA_P57 = "p57";
    public static final String COLUMNA_P58 = "p58";
    public static final String COLUMNA_P59 = "p59";
    public static final String COLUMNA_P60 = "p60";
    public static final String COLUMNA_P61 = "p61";
    public static final String COLUMNA_P62 = "p62";
    public static final String COLUMNA_P63 = "p63";
    public static final String COLUMNA_P63_ESPECIFICAR = "p63_especificar";
    public static final String COLUMNA_P64DES = "p64des";
    public static final String COLUMNA_P64C = "p64c";
    public static final String COLUMNA_P65DES = "p65des";
    public static final String COLUMNA_P65C = "p65c";
    public static final String COLUMNA_P66 = "p66";
    public static final String COLUMNA_P67A = "p67a";
    public static final String COLUMNA_P67B = "p67b";
    public static final String COLUMNA_P67C = "p67c";
    public static final String COLUMNA_P67D = "p67d";
    public static final String COLUMNA_P67E = "p67e";
    public static final String COLUMNA_P67F = "p67f";
    public static final String COLUMNA_P67G = "p67g";
    public static final String COLUMNA_P67H = "p67h";
    public static final String COLUMNA_P67I = "p67i";
    public static final String COLUMNA_P67J = "p67j";
    public static final String COLUMNA_P67K = "p67k";
    public static final String COLUMNA_P67L = "p67l";
    public static final String COLUMNA_P67TOT = "p67tot";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_PER_EEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_PER_EEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DPTOD, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTRITOD, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTRIPG, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_AREA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_BARRIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MANZANA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FORMULARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VIVI, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ORDEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P30, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P31, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P32, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P33, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P34, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P35, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P36_ORDEN_CONYUGUE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P36_ORDEN_PADRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P36_ORDEN_MADRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P37, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P37_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P38_DIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P38_MES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P38_ANO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P39PAIS, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P39DPTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P39DIST, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P39AREA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P40_IDIOMA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P40OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P41, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P42, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P43, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P44_45T, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P44, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P45, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P46, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P47, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P48, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P49, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P49_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P50, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P50_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P51, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P52, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P52_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P53, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P54, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P54A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P54_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P55, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P55_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P56, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P57, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P58, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P59, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P60, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P61, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P62, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P63, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P63_ESPECIFICAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P64DES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P64C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P65DES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P65C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P66, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67C, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67D, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67E, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67F, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67G, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67H, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67I, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67J, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67K, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67L, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_P67TOT, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_PER_EEC, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_PER_EEC, true);
        this.setColumnasInsertables(COLUMNA_DPTOD, true);
        this.setColumnasInsertables(COLUMNA_DISTRITOD, true);
        this.setColumnasInsertables(COLUMNA_DISTRIPG, true);
        this.setColumnasInsertables(COLUMNA_AREA, true);
        this.setColumnasInsertables(COLUMNA_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_FORMULARIO, true);
        this.setColumnasInsertables(COLUMNA_VIVI, true);
        this.setColumnasInsertables(COLUMNA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_ORDEN, true);
        this.setColumnasInsertables(COLUMNA_P30, true);
        this.setColumnasInsertables(COLUMNA_P31, true);
        this.setColumnasInsertables(COLUMNA_P32, true);
        this.setColumnasInsertables(COLUMNA_P33, true);
        this.setColumnasInsertables(COLUMNA_P34, true);
        this.setColumnasInsertables(COLUMNA_P35, true);
        this.setColumnasInsertables(COLUMNA_P36_ORDEN_CONYUGUE, true);
        this.setColumnasInsertables(COLUMNA_P36_ORDEN_PADRE, true);
        this.setColumnasInsertables(COLUMNA_P36_ORDEN_MADRE, true);
        this.setColumnasInsertables(COLUMNA_P37, true);
        this.setColumnasInsertables(COLUMNA_P37_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_P38_DIA, true);
        this.setColumnasInsertables(COLUMNA_P38_MES, true);
        this.setColumnasInsertables(COLUMNA_P38_ANO, true);
        this.setColumnasInsertables(COLUMNA_P39PAIS, true);
        this.setColumnasInsertables(COLUMNA_P39DPTO, true);
        this.setColumnasInsertables(COLUMNA_P39DIST, true);
        this.setColumnasInsertables(COLUMNA_P39AREA, true);
        this.setColumnasInsertables(COLUMNA_P40_IDIOMA, true);
        this.setColumnasInsertables(COLUMNA_P40OTR, true);
        this.setColumnasInsertables(COLUMNA_P41, true);
        this.setColumnasInsertables(COLUMNA_P42, true);
        this.setColumnasInsertables(COLUMNA_P43, true);
        this.setColumnasInsertables(COLUMNA_P44_45T, true);
        this.setColumnasInsertables(COLUMNA_P44, true);
        this.setColumnasInsertables(COLUMNA_P45, true);
        this.setColumnasInsertables(COLUMNA_P46, true);
        this.setColumnasInsertables(COLUMNA_P47, true);
        this.setColumnasInsertables(COLUMNA_P48, true);
        this.setColumnasInsertables(COLUMNA_P49, true);
        this.setColumnasInsertables(COLUMNA_P49_OTR, true);
        this.setColumnasInsertables(COLUMNA_P50, true);
        this.setColumnasInsertables(COLUMNA_P50_OTR, true);
        this.setColumnasInsertables(COLUMNA_P51, true);
        this.setColumnasInsertables(COLUMNA_P52, true);
        this.setColumnasInsertables(COLUMNA_P52_OTR, true);
        this.setColumnasInsertables(COLUMNA_P53, true);
        this.setColumnasInsertables(COLUMNA_P54, true);
        this.setColumnasInsertables(COLUMNA_P54A, true);
        this.setColumnasInsertables(COLUMNA_P54_OTR, true);
        this.setColumnasInsertables(COLUMNA_P55, true);
        this.setColumnasInsertables(COLUMNA_P55_OTR, true);
        this.setColumnasInsertables(COLUMNA_P56, true);
        this.setColumnasInsertables(COLUMNA_P57, true);
        this.setColumnasInsertables(COLUMNA_P58, true);
        this.setColumnasInsertables(COLUMNA_P59, true);
        this.setColumnasInsertables(COLUMNA_P60, true);
        this.setColumnasInsertables(COLUMNA_P61, true);
        this.setColumnasInsertables(COLUMNA_P62, true);
        this.setColumnasInsertables(COLUMNA_P63, true);
        this.setColumnasInsertables(COLUMNA_P63_ESPECIFICAR, true);
        this.setColumnasInsertables(COLUMNA_P64DES, true);
        this.setColumnasInsertables(COLUMNA_P64C, true);
        this.setColumnasInsertables(COLUMNA_P65DES, true);
        this.setColumnasInsertables(COLUMNA_P65C, true);
        this.setColumnasInsertables(COLUMNA_P66, true);
        this.setColumnasInsertables(COLUMNA_P67A, true);
        this.setColumnasInsertables(COLUMNA_P67B, true);
        this.setColumnasInsertables(COLUMNA_P67C, true);
        this.setColumnasInsertables(COLUMNA_P67D, true);
        this.setColumnasInsertables(COLUMNA_P67E, true);
        this.setColumnasInsertables(COLUMNA_P67F, true);
        this.setColumnasInsertables(COLUMNA_P67G, true);
        this.setColumnasInsertables(COLUMNA_P67H, true);
        this.setColumnasInsertables(COLUMNA_P67I, true);
        this.setColumnasInsertables(COLUMNA_P67J, true);
        this.setColumnasInsertables(COLUMNA_P67K, true);
        this.setColumnasInsertables(COLUMNA_P67L, true);
        this.setColumnasInsertables(COLUMNA_P67TOT, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_PER_EEC, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_PER_EEC, true);
        this.setColumnasModificables(COLUMNA_DPTOD, true);
        this.setColumnasModificables(COLUMNA_DISTRITOD, true);
        this.setColumnasModificables(COLUMNA_DISTRIPG, true);
        this.setColumnasModificables(COLUMNA_AREA, true);
        this.setColumnasModificables(COLUMNA_BARRIO, true);
        this.setColumnasModificables(COLUMNA_MANZANA, true);
        this.setColumnasModificables(COLUMNA_FORMULARIO, true);
        this.setColumnasModificables(COLUMNA_VIVI, true);
        this.setColumnasModificables(COLUMNA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_ORDEN, true);
        this.setColumnasModificables(COLUMNA_P30, true);
        this.setColumnasModificables(COLUMNA_P31, true);
        this.setColumnasModificables(COLUMNA_P32, true);
        this.setColumnasModificables(COLUMNA_P33, true);
        this.setColumnasModificables(COLUMNA_P34, true);
        this.setColumnasModificables(COLUMNA_P35, true);
        this.setColumnasModificables(COLUMNA_P36_ORDEN_CONYUGUE, true);
        this.setColumnasModificables(COLUMNA_P36_ORDEN_PADRE, true);
        this.setColumnasModificables(COLUMNA_P36_ORDEN_MADRE, true);
        this.setColumnasModificables(COLUMNA_P37, true);
        this.setColumnasModificables(COLUMNA_P37_CEDULA, true);
        this.setColumnasModificables(COLUMNA_P38_DIA, true);
        this.setColumnasModificables(COLUMNA_P38_MES, true);
        this.setColumnasModificables(COLUMNA_P38_ANO, true);
        this.setColumnasModificables(COLUMNA_P39PAIS, true);
        this.setColumnasModificables(COLUMNA_P39DPTO, true);
        this.setColumnasModificables(COLUMNA_P39DIST, true);
        this.setColumnasModificables(COLUMNA_P39AREA, true);
        this.setColumnasModificables(COLUMNA_P40_IDIOMA, true);
        this.setColumnasModificables(COLUMNA_P40OTR, true);
        this.setColumnasModificables(COLUMNA_P41, true);
        this.setColumnasModificables(COLUMNA_P42, true);
        this.setColumnasModificables(COLUMNA_P43, true);
        this.setColumnasModificables(COLUMNA_P44_45T, true);
        this.setColumnasModificables(COLUMNA_P44, true);
        this.setColumnasModificables(COLUMNA_P45, true);
        this.setColumnasModificables(COLUMNA_P46, true);
        this.setColumnasModificables(COLUMNA_P47, true);
        this.setColumnasModificables(COLUMNA_P48, true);
        this.setColumnasModificables(COLUMNA_P49, true);
        this.setColumnasModificables(COLUMNA_P49_OTR, true);
        this.setColumnasModificables(COLUMNA_P50, true);
        this.setColumnasModificables(COLUMNA_P50_OTR, true);
        this.setColumnasModificables(COLUMNA_P51, true);
        this.setColumnasModificables(COLUMNA_P52, true);
        this.setColumnasModificables(COLUMNA_P52_OTR, true);
        this.setColumnasModificables(COLUMNA_P53, true);
        this.setColumnasModificables(COLUMNA_P54, true);
        this.setColumnasModificables(COLUMNA_P54A, true);
        this.setColumnasModificables(COLUMNA_P54_OTR, true);
        this.setColumnasModificables(COLUMNA_P55, true);
        this.setColumnasModificables(COLUMNA_P55_OTR, true);
        this.setColumnasModificables(COLUMNA_P56, true);
        this.setColumnasModificables(COLUMNA_P57, true);
        this.setColumnasModificables(COLUMNA_P58, true);
        this.setColumnasModificables(COLUMNA_P59, true);
        this.setColumnasModificables(COLUMNA_P60, true);
        this.setColumnasModificables(COLUMNA_P61, true);
        this.setColumnasModificables(COLUMNA_P62, true);
        this.setColumnasModificables(COLUMNA_P63, true);
        this.setColumnasModificables(COLUMNA_P63_ESPECIFICAR, true);
        this.setColumnasModificables(COLUMNA_P64DES, true);
        this.setColumnasModificables(COLUMNA_P64C, true);
        this.setColumnasModificables(COLUMNA_P65DES, true);
        this.setColumnasModificables(COLUMNA_P65C, true);
        this.setColumnasModificables(COLUMNA_P66, true);
        this.setColumnasModificables(COLUMNA_P67A, true);
        this.setColumnasModificables(COLUMNA_P67B, true);
        this.setColumnasModificables(COLUMNA_P67C, true);
        this.setColumnasModificables(COLUMNA_P67D, true);
        this.setColumnasModificables(COLUMNA_P67E, true);
        this.setColumnasModificables(COLUMNA_P67F, true);
        this.setColumnasModificables(COLUMNA_P67G, true);
        this.setColumnasModificables(COLUMNA_P67H, true);
        this.setColumnasModificables(COLUMNA_P67I, true);
        this.setColumnasModificables(COLUMNA_P67J, true);
        this.setColumnasModificables(COLUMNA_P67K, true);
        this.setColumnasModificables(COLUMNA_P67L, true);
        this.setColumnasModificables(COLUMNA_P67TOT, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpPerEec() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_PER_EEC);
    }
    public Long getIdLogImpPerEec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_PER_EEC, rowKey);
    }
    public void setIdLogImpPerEec(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_PER_EEC, valor);
    }
    public void setIdLogImpPerEec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_PER_EEC, rowKey, valor);
    }

    public Long getVersionLogImpPerEec() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_PER_EEC);
    }
    public Long getVersionLogImpPerEec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_PER_EEC, rowKey);
    }
    public void setVersionLogImpPerEec(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_PER_EEC, valor);
    }
    public void setVersionLogImpPerEec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_PER_EEC, rowKey, valor);
    }

    public String getDptod() {
        return (String) super.getValue(COLUMNA_DPTOD);
    }
    public String getDptod(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DPTOD, rowKey);
    }
    public void setDptod(String valor) {
        super.setValue(COLUMNA_DPTOD, valor);
    }
    public void setDptod(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DPTOD, rowKey, valor);
    }

    public String getDistritod() {
        return (String) super.getValue(COLUMNA_DISTRITOD);
    }
    public String getDistritod(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DISTRITOD, rowKey);
    }
    public void setDistritod(String valor) {
        super.setValue(COLUMNA_DISTRITOD, valor);
    }
    public void setDistritod(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DISTRITOD, rowKey, valor);
    }

    public String getDistripg() {
        return (String) super.getValue(COLUMNA_DISTRIPG);
    }
    public String getDistripg(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DISTRIPG, rowKey);
    }
    public void setDistripg(String valor) {
        super.setValue(COLUMNA_DISTRIPG, valor);
    }
    public void setDistripg(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DISTRIPG, rowKey, valor);
    }

    public String getArea() {
        return (String) super.getValue(COLUMNA_AREA);
    }
    public String getArea(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_AREA, rowKey);
    }
    public void setArea(String valor) {
        super.setValue(COLUMNA_AREA, valor);
    }
    public void setArea(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_AREA, rowKey, valor);
    }

    public String getBarrio() {
        return (String) super.getValue(COLUMNA_BARRIO);
    }
    public String getBarrio(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_BARRIO, rowKey);
    }
    public void setBarrio(String valor) {
        super.setValue(COLUMNA_BARRIO, valor);
    }
    public void setBarrio(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_BARRIO, rowKey, valor);
    }

    public String getManzana() {
        return (String) super.getValue(COLUMNA_MANZANA);
    }
    public String getManzana(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_MANZANA, rowKey);
    }
    public void setManzana(String valor) {
        super.setValue(COLUMNA_MANZANA, valor);
    }
    public void setManzana(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_MANZANA, rowKey, valor);
    }

    public String getFormulario() {
        return (String) super.getValue(COLUMNA_FORMULARIO);
    }
    public String getFormulario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_FORMULARIO, rowKey);
    }
    public void setFormulario(String valor) {
        super.setValue(COLUMNA_FORMULARIO, valor);
    }
    public void setFormulario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_FORMULARIO, rowKey, valor);
    }

    public String getVivi() {
        return (String) super.getValue(COLUMNA_VIVI);
    }
    public String getVivi(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VIVI, rowKey);
    }
    public void setVivi(String valor) {
        super.setValue(COLUMNA_VIVI, valor);
    }
    public void setVivi(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VIVI, rowKey, valor);
    }

    public String getHogar() {
        return (String) super.getValue(COLUMNA_HOGAR);
    }
    public String getHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_HOGAR, rowKey);
    }
    public void setHogar(String valor) {
        super.setValue(COLUMNA_HOGAR, valor);
    }
    public void setHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_HOGAR, rowKey, valor);
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

    public String getP36OrdenConyugue() {
        return (String) super.getValue(COLUMNA_P36_ORDEN_CONYUGUE);
    }
    public String getP36OrdenConyugue(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P36_ORDEN_CONYUGUE, rowKey);
    }
    public void setP36OrdenConyugue(String valor) {
        super.setValue(COLUMNA_P36_ORDEN_CONYUGUE, valor);
    }
    public void setP36OrdenConyugue(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P36_ORDEN_CONYUGUE, rowKey, valor);
    }

    public String getP36OrdenPadre() {
        return (String) super.getValue(COLUMNA_P36_ORDEN_PADRE);
    }
    public String getP36OrdenPadre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P36_ORDEN_PADRE, rowKey);
    }
    public void setP36OrdenPadre(String valor) {
        super.setValue(COLUMNA_P36_ORDEN_PADRE, valor);
    }
    public void setP36OrdenPadre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P36_ORDEN_PADRE, rowKey, valor);
    }

    public String getP36OrdenMadre() {
        return (String) super.getValue(COLUMNA_P36_ORDEN_MADRE);
    }
    public String getP36OrdenMadre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P36_ORDEN_MADRE, rowKey);
    }
    public void setP36OrdenMadre(String valor) {
        super.setValue(COLUMNA_P36_ORDEN_MADRE, valor);
    }
    public void setP36OrdenMadre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P36_ORDEN_MADRE, rowKey, valor);
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

    public String getP37Cedula() {
        return (String) super.getValue(COLUMNA_P37_CEDULA);
    }
    public String getP37Cedula(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P37_CEDULA, rowKey);
    }
    public void setP37Cedula(String valor) {
        super.setValue(COLUMNA_P37_CEDULA, valor);
    }
    public void setP37Cedula(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P37_CEDULA, rowKey, valor);
    }

    public String getP38Dia() {
        return (String) super.getValue(COLUMNA_P38_DIA);
    }
    public String getP38Dia(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P38_DIA, rowKey);
    }
    public void setP38Dia(String valor) {
        super.setValue(COLUMNA_P38_DIA, valor);
    }
    public void setP38Dia(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P38_DIA, rowKey, valor);
    }

    public String getP38Mes() {
        return (String) super.getValue(COLUMNA_P38_MES);
    }
    public String getP38Mes(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P38_MES, rowKey);
    }
    public void setP38Mes(String valor) {
        super.setValue(COLUMNA_P38_MES, valor);
    }
    public void setP38Mes(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P38_MES, rowKey, valor);
    }

    public String getP38Ano() {
        return (String) super.getValue(COLUMNA_P38_ANO);
    }
    public String getP38Ano(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P38_ANO, rowKey);
    }
    public void setP38Ano(String valor) {
        super.setValue(COLUMNA_P38_ANO, valor);
    }
    public void setP38Ano(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P38_ANO, rowKey, valor);
    }

    public String getP39pais() {
        return (String) super.getValue(COLUMNA_P39PAIS);
    }
    public String getP39pais(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P39PAIS, rowKey);
    }
    public void setP39pais(String valor) {
        super.setValue(COLUMNA_P39PAIS, valor);
    }
    public void setP39pais(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P39PAIS, rowKey, valor);
    }

    public String getP39dpto() {
        return (String) super.getValue(COLUMNA_P39DPTO);
    }
    public String getP39dpto(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P39DPTO, rowKey);
    }
    public void setP39dpto(String valor) {
        super.setValue(COLUMNA_P39DPTO, valor);
    }
    public void setP39dpto(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P39DPTO, rowKey, valor);
    }

    public String getP39dist() {
        return (String) super.getValue(COLUMNA_P39DIST);
    }
    public String getP39dist(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P39DIST, rowKey);
    }
    public void setP39dist(String valor) {
        super.setValue(COLUMNA_P39DIST, valor);
    }
    public void setP39dist(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P39DIST, rowKey, valor);
    }

    public String getP39area() {
        return (String) super.getValue(COLUMNA_P39AREA);
    }
    public String getP39area(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P39AREA, rowKey);
    }
    public void setP39area(String valor) {
        super.setValue(COLUMNA_P39AREA, valor);
    }
    public void setP39area(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P39AREA, rowKey, valor);
    }

    public String getP40Idioma() {
        return (String) super.getValue(COLUMNA_P40_IDIOMA);
    }
    public String getP40Idioma(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P40_IDIOMA, rowKey);
    }
    public void setP40Idioma(String valor) {
        super.setValue(COLUMNA_P40_IDIOMA, valor);
    }
    public void setP40Idioma(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P40_IDIOMA, rowKey, valor);
    }

    public String getP40otr() {
        return (String) super.getValue(COLUMNA_P40OTR);
    }
    public String getP40otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P40OTR, rowKey);
    }
    public void setP40otr(String valor) {
        super.setValue(COLUMNA_P40OTR, valor);
    }
    public void setP40otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P40OTR, rowKey, valor);
    }

    public String getP41() {
        return (String) super.getValue(COLUMNA_P41);
    }
    public String getP41(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P41, rowKey);
    }
    public void setP41(String valor) {
        super.setValue(COLUMNA_P41, valor);
    }
    public void setP41(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P41, rowKey, valor);
    }

    public String getP42() {
        return (String) super.getValue(COLUMNA_P42);
    }
    public String getP42(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P42, rowKey);
    }
    public void setP42(String valor) {
        super.setValue(COLUMNA_P42, valor);
    }
    public void setP42(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P42, rowKey, valor);
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

    public String getP4445t() {
        return (String) super.getValue(COLUMNA_P44_45T);
    }
    public String getP4445t(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P44_45T, rowKey);
    }
    public void setP4445t(String valor) {
        super.setValue(COLUMNA_P44_45T, valor);
    }
    public void setP4445t(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P44_45T, rowKey, valor);
    }

    public String getP44() {
        return (String) super.getValue(COLUMNA_P44);
    }
    public String getP44(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P44, rowKey);
    }
    public void setP44(String valor) {
        super.setValue(COLUMNA_P44, valor);
    }
    public void setP44(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P44, rowKey, valor);
    }

    public String getP45() {
        return (String) super.getValue(COLUMNA_P45);
    }
    public String getP45(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P45, rowKey);
    }
    public void setP45(String valor) {
        super.setValue(COLUMNA_P45, valor);
    }
    public void setP45(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P45, rowKey, valor);
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

    public String getP49Otr() {
        return (String) super.getValue(COLUMNA_P49_OTR);
    }
    public String getP49Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P49_OTR, rowKey);
    }
    public void setP49Otr(String valor) {
        super.setValue(COLUMNA_P49_OTR, valor);
    }
    public void setP49Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P49_OTR, rowKey, valor);
    }

    public String getP50() {
        return (String) super.getValue(COLUMNA_P50);
    }
    public String getP50(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P50, rowKey);
    }
    public void setP50(String valor) {
        super.setValue(COLUMNA_P50, valor);
    }
    public void setP50(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P50, rowKey, valor);
    }

    public String getP50Otr() {
        return (String) super.getValue(COLUMNA_P50_OTR);
    }
    public String getP50Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P50_OTR, rowKey);
    }
    public void setP50Otr(String valor) {
        super.setValue(COLUMNA_P50_OTR, valor);
    }
    public void setP50Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P50_OTR, rowKey, valor);
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

    public String getP52() {
        return (String) super.getValue(COLUMNA_P52);
    }
    public String getP52(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P52, rowKey);
    }
    public void setP52(String valor) {
        super.setValue(COLUMNA_P52, valor);
    }
    public void setP52(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P52, rowKey, valor);
    }

    public String getP52Otr() {
        return (String) super.getValue(COLUMNA_P52_OTR);
    }
    public String getP52Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P52_OTR, rowKey);
    }
    public void setP52Otr(String valor) {
        super.setValue(COLUMNA_P52_OTR, valor);
    }
    public void setP52Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P52_OTR, rowKey, valor);
    }

    public String getP53() {
        return (String) super.getValue(COLUMNA_P53);
    }
    public String getP53(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P53, rowKey);
    }
    public void setP53(String valor) {
        super.setValue(COLUMNA_P53, valor);
    }
    public void setP53(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P53, rowKey, valor);
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

    public String getP54a() {
        return (String) super.getValue(COLUMNA_P54A);
    }
    public String getP54a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P54A, rowKey);
    }
    public void setP54a(String valor) {
        super.setValue(COLUMNA_P54A, valor);
    }
    public void setP54a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P54A, rowKey, valor);
    }

    public String getP54Otr() {
        return (String) super.getValue(COLUMNA_P54_OTR);
    }
    public String getP54Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P54_OTR, rowKey);
    }
    public void setP54Otr(String valor) {
        super.setValue(COLUMNA_P54_OTR, valor);
    }
    public void setP54Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P54_OTR, rowKey, valor);
    }

    public String getP55() {
        return (String) super.getValue(COLUMNA_P55);
    }
    public String getP55(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P55, rowKey);
    }
    public void setP55(String valor) {
        super.setValue(COLUMNA_P55, valor);
    }
    public void setP55(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P55, rowKey, valor);
    }

    public String getP55Otr() {
        return (String) super.getValue(COLUMNA_P55_OTR);
    }
    public String getP55Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P55_OTR, rowKey);
    }
    public void setP55Otr(String valor) {
        super.setValue(COLUMNA_P55_OTR, valor);
    }
    public void setP55Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P55_OTR, rowKey, valor);
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

    public String getP57() {
        return (String) super.getValue(COLUMNA_P57);
    }
    public String getP57(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P57, rowKey);
    }
    public void setP57(String valor) {
        super.setValue(COLUMNA_P57, valor);
    }
    public void setP57(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P57, rowKey, valor);
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

    public String getP63Especificar() {
        return (String) super.getValue(COLUMNA_P63_ESPECIFICAR);
    }
    public String getP63Especificar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P63_ESPECIFICAR, rowKey);
    }
    public void setP63Especificar(String valor) {
        super.setValue(COLUMNA_P63_ESPECIFICAR, valor);
    }
    public void setP63Especificar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P63_ESPECIFICAR, rowKey, valor);
    }

    public String getP64des() {
        return (String) super.getValue(COLUMNA_P64DES);
    }
    public String getP64des(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P64DES, rowKey);
    }
    public void setP64des(String valor) {
        super.setValue(COLUMNA_P64DES, valor);
    }
    public void setP64des(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P64DES, rowKey, valor);
    }

    public String getP64c() {
        return (String) super.getValue(COLUMNA_P64C);
    }
    public String getP64c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P64C, rowKey);
    }
    public void setP64c(String valor) {
        super.setValue(COLUMNA_P64C, valor);
    }
    public void setP64c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P64C, rowKey, valor);
    }

    public String getP65des() {
        return (String) super.getValue(COLUMNA_P65DES);
    }
    public String getP65des(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P65DES, rowKey);
    }
    public void setP65des(String valor) {
        super.setValue(COLUMNA_P65DES, valor);
    }
    public void setP65des(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P65DES, rowKey, valor);
    }

    public String getP65c() {
        return (String) super.getValue(COLUMNA_P65C);
    }
    public String getP65c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P65C, rowKey);
    }
    public void setP65c(String valor) {
        super.setValue(COLUMNA_P65C, valor);
    }
    public void setP65c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P65C, rowKey, valor);
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

    public String getP67a() {
        return (String) super.getValue(COLUMNA_P67A);
    }
    public String getP67a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67A, rowKey);
    }
    public void setP67a(String valor) {
        super.setValue(COLUMNA_P67A, valor);
    }
    public void setP67a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67A, rowKey, valor);
    }

    public String getP67b() {
        return (String) super.getValue(COLUMNA_P67B);
    }
    public String getP67b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67B, rowKey);
    }
    public void setP67b(String valor) {
        super.setValue(COLUMNA_P67B, valor);
    }
    public void setP67b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67B, rowKey, valor);
    }

    public String getP67c() {
        return (String) super.getValue(COLUMNA_P67C);
    }
    public String getP67c(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67C, rowKey);
    }
    public void setP67c(String valor) {
        super.setValue(COLUMNA_P67C, valor);
    }
    public void setP67c(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67C, rowKey, valor);
    }

    public String getP67d() {
        return (String) super.getValue(COLUMNA_P67D);
    }
    public String getP67d(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67D, rowKey);
    }
    public void setP67d(String valor) {
        super.setValue(COLUMNA_P67D, valor);
    }
    public void setP67d(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67D, rowKey, valor);
    }

    public String getP67e() {
        return (String) super.getValue(COLUMNA_P67E);
    }
    public String getP67e(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67E, rowKey);
    }
    public void setP67e(String valor) {
        super.setValue(COLUMNA_P67E, valor);
    }
    public void setP67e(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67E, rowKey, valor);
    }

    public String getP67f() {
        return (String) super.getValue(COLUMNA_P67F);
    }
    public String getP67f(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67F, rowKey);
    }
    public void setP67f(String valor) {
        super.setValue(COLUMNA_P67F, valor);
    }
    public void setP67f(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67F, rowKey, valor);
    }

    public String getP67g() {
        return (String) super.getValue(COLUMNA_P67G);
    }
    public String getP67g(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67G, rowKey);
    }
    public void setP67g(String valor) {
        super.setValue(COLUMNA_P67G, valor);
    }
    public void setP67g(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67G, rowKey, valor);
    }

    public String getP67h() {
        return (String) super.getValue(COLUMNA_P67H);
    }
    public String getP67h(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67H, rowKey);
    }
    public void setP67h(String valor) {
        super.setValue(COLUMNA_P67H, valor);
    }
    public void setP67h(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67H, rowKey, valor);
    }

    public String getP67i() {
        return (String) super.getValue(COLUMNA_P67I);
    }
    public String getP67i(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67I, rowKey);
    }
    public void setP67i(String valor) {
        super.setValue(COLUMNA_P67I, valor);
    }
    public void setP67i(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67I, rowKey, valor);
    }

    public String getP67j() {
        return (String) super.getValue(COLUMNA_P67J);
    }
    public String getP67j(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67J, rowKey);
    }
    public void setP67j(String valor) {
        super.setValue(COLUMNA_P67J, valor);
    }
    public void setP67j(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67J, rowKey, valor);
    }

    public String getP67k() {
        return (String) super.getValue(COLUMNA_P67K);
    }
    public String getP67k(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67K, rowKey);
    }
    public void setP67k(String valor) {
        super.setValue(COLUMNA_P67K, valor);
    }
    public void setP67k(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67K, rowKey, valor);
    }

    public String getP67l() {
        return (String) super.getValue(COLUMNA_P67L);
    }
    public String getP67l(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67L, rowKey);
    }
    public void setP67l(String valor) {
        super.setValue(COLUMNA_P67L, valor);
    }
    public void setP67l(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67L, rowKey, valor);
    }

    public String getP67tot() {
        return (String) super.getValue(COLUMNA_P67TOT);
    }
    public String getP67tot(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_P67TOT, rowKey);
    }
    public void setP67tot(String valor) {
        super.setValue(COLUMNA_P67TOT, valor);
    }
    public void setP67tot(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_P67TOT, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_per_eec";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_per_eec";

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
        return this.getIdLogImpPerEec();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpPerEec(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpPerEec(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpPerEec(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpPerEec();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpPerEec(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpPerEec(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpPerEec(rowKey, versionRecurso);
    }
}
