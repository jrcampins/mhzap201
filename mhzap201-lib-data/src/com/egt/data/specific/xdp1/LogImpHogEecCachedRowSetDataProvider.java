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

public class LogImpHogEecCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public LogImpHogEecCachedRowSetDataProvider() {
        super();
    }

    public LogImpHogEecCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "log_imp_hog_eec";
    public static final String NOMBRE_DOMINIO_RECURSO = "Rastros de Importacion de Fichas Hogar DGEEC";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_log_imp_hog_eec_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "log_imp_hog_eec";

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

    public static final String COLUMNA_ID_LOG_IMP_HOG_EEC = "id_log_imp_hog_eec";
    public static final String COLUMNA_VERSION_LOG_IMP_HOG_EEC = "version_log_imp_hog_eec";
    public static final String COLUMNA_DPTOD = "dptod";
    public static final String COLUMNA_DISTRITOD = "distritod";
    public static final String COLUMNA_DISTRIPG = "distripg";
    public static final String COLUMNA_AREA = "area";
    public static final String COLUMNA_BARRIO = "barrio";
    public static final String COLUMNA_MANZANA = "manzana";
    public static final String COLUMNA_FORMULARIO = "formulario";
    public static final String COLUMNA_VIVI = "vivi";
    public static final String COLUMNA_HOGAR = "hogar";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_NRO_DE = "nro_de";
    public static final String COLUMNA_TELEFONO = "telefono";
    public static final String COLUMNA_FECHA = "fecha";
    public static final String COLUMNA_DIA = "dia";
    public static final String COLUMNA_MES = "mes";
    public static final String COLUMNA_ANO = "ano";
    public static final String COLUMNA_V10T = "v10t";
    public static final String COLUMNA_V11 = "v11";
    public static final String COLUMNA_V12 = "v12";
    public static final String COLUMNA_V13 = "v13";
    public static final String COLUMNA_V14 = "v14";
    public static final String COLUMNA_V15 = "v15";
    public static final String COLUMNA_V16 = "v16";
    public static final String COLUMNA_V16_OTR = "v16_otr";
    public static final String COLUMNA_V17A = "v17a";
    public static final String COLUMNA_V17B = "v17b";
    public static final String COLUMNA_V18 = "v18";
    public static final String COLUMNA_V19 = "v19";
    public static final String COLUMNA_V20 = "v20";
    public static final String COLUMNA_V21 = "v21";
    public static final String COLUMNA_V22 = "v22";
    public static final String COLUMNA_V23 = "v23";
    public static final String COLUMNA_V24 = "v24";
    public static final String COLUMNA_V25 = "v25";
    public static final String COLUMNA_V26 = "v26";
    public static final String COLUMNA_V26ESP_CELULAR = "v26esp_celular";
    public static final String COLUMNA_V27 = "v27";
    public static final String COLUMNA_V27ESP_LINEA = "v27esp_linea";
    public static final String COLUMNA_V28_1 = "v28_1";
    public static final String COLUMNA_V28_2 = "v28_2";
    public static final String COLUMNA_V28_3 = "v28_3";
    public static final String COLUMNA_V28_4 = "v28_4";
    public static final String COLUMNA_V28_5 = "v28_5";
    public static final String COLUMNA_V28_6 = "v28_6";
    public static final String COLUMNA_V28_7 = "v28_7";
    public static final String COLUMNA_V28_8 = "v28_8";
    public static final String COLUMNA_V29NOMBRE_JEFE = "v29nombre_jefe";
    public static final String COLUMNA_CEDULAJEFE = "cedulajefe";
    public static final String COLUMNA_VAR00001 = "var00001";
    public static final String COLUMNA_ES_IMPORTADO = "es_importado";
    public static final String COLUMNA_OBSERVACION = "observacion";
    public static final String COLUMNA_FECHA_HORA_TRANSACCION = "fecha_hora_transaccion";
    public static final String COLUMNA_NOMBRE_ARCHIVO = "nombre_archivo";
    public static final String COLUMNA_CODIGO_ARCHIVO = "codigo_archivo";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_LOG_IMP_HOG_EEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_LOG_IMP_HOG_EEC, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DPTOD, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTRITOD, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTRIPG, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_AREA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_BARRIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MANZANA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FORMULARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VIVI, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NRO_DE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TELEFONO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ANO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V10T, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V11, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V12, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V13, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V14, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V15, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V16, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V16_OTR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V17A, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V17B, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V18, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V19, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V20, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V21, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V22, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V23, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V24, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V25, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V26, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V26ESP_CELULAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V27, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V27ESP_LINEA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_1, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_2, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_3, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_4, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_5, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_6, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_7, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V28_8, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_V29NOMBRE_JEFE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CEDULAJEFE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VAR00001, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_IMPORTADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_TRANSACCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_ARCHIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_ARCHIVO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_LOG_IMP_HOG_EEC, true);
        this.setColumnasInsertables(COLUMNA_VERSION_LOG_IMP_HOG_EEC, true);
        this.setColumnasInsertables(COLUMNA_DPTOD, true);
        this.setColumnasInsertables(COLUMNA_DISTRITOD, true);
        this.setColumnasInsertables(COLUMNA_DISTRIPG, true);
        this.setColumnasInsertables(COLUMNA_AREA, true);
        this.setColumnasInsertables(COLUMNA_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_FORMULARIO, true);
        this.setColumnasInsertables(COLUMNA_VIVI, true);
        this.setColumnasInsertables(COLUMNA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_NRO_DE, true);
        this.setColumnasInsertables(COLUMNA_TELEFONO, true);
        this.setColumnasInsertables(COLUMNA_FECHA, true);
        this.setColumnasInsertables(COLUMNA_DIA, true);
        this.setColumnasInsertables(COLUMNA_MES, true);
        this.setColumnasInsertables(COLUMNA_ANO, true);
        this.setColumnasInsertables(COLUMNA_V10T, true);
        this.setColumnasInsertables(COLUMNA_V11, true);
        this.setColumnasInsertables(COLUMNA_V12, true);
        this.setColumnasInsertables(COLUMNA_V13, true);
        this.setColumnasInsertables(COLUMNA_V14, true);
        this.setColumnasInsertables(COLUMNA_V15, true);
        this.setColumnasInsertables(COLUMNA_V16, true);
        this.setColumnasInsertables(COLUMNA_V16_OTR, true);
        this.setColumnasInsertables(COLUMNA_V17A, true);
        this.setColumnasInsertables(COLUMNA_V17B, true);
        this.setColumnasInsertables(COLUMNA_V18, true);
        this.setColumnasInsertables(COLUMNA_V19, true);
        this.setColumnasInsertables(COLUMNA_V20, true);
        this.setColumnasInsertables(COLUMNA_V21, true);
        this.setColumnasInsertables(COLUMNA_V22, true);
        this.setColumnasInsertables(COLUMNA_V23, true);
        this.setColumnasInsertables(COLUMNA_V24, true);
        this.setColumnasInsertables(COLUMNA_V25, true);
        this.setColumnasInsertables(COLUMNA_V26, true);
        this.setColumnasInsertables(COLUMNA_V26ESP_CELULAR, true);
        this.setColumnasInsertables(COLUMNA_V27, true);
        this.setColumnasInsertables(COLUMNA_V27ESP_LINEA, true);
        this.setColumnasInsertables(COLUMNA_V28_1, true);
        this.setColumnasInsertables(COLUMNA_V28_2, true);
        this.setColumnasInsertables(COLUMNA_V28_3, true);
        this.setColumnasInsertables(COLUMNA_V28_4, true);
        this.setColumnasInsertables(COLUMNA_V28_5, true);
        this.setColumnasInsertables(COLUMNA_V28_6, true);
        this.setColumnasInsertables(COLUMNA_V28_7, true);
        this.setColumnasInsertables(COLUMNA_V28_8, true);
        this.setColumnasInsertables(COLUMNA_V29NOMBRE_JEFE, true);
        this.setColumnasInsertables(COLUMNA_CEDULAJEFE, true);
        this.setColumnasInsertables(COLUMNA_VAR00001, true);
        this.setColumnasInsertables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_LOG_IMP_HOG_EEC, true);
        this.setColumnasModificables(COLUMNA_VERSION_LOG_IMP_HOG_EEC, true);
        this.setColumnasModificables(COLUMNA_DPTOD, true);
        this.setColumnasModificables(COLUMNA_DISTRITOD, true);
        this.setColumnasModificables(COLUMNA_DISTRIPG, true);
        this.setColumnasModificables(COLUMNA_AREA, true);
        this.setColumnasModificables(COLUMNA_BARRIO, true);
        this.setColumnasModificables(COLUMNA_MANZANA, true);
        this.setColumnasModificables(COLUMNA_FORMULARIO, true);
        this.setColumnasModificables(COLUMNA_VIVI, true);
        this.setColumnasModificables(COLUMNA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_NRO_DE, true);
        this.setColumnasModificables(COLUMNA_TELEFONO, true);
        this.setColumnasModificables(COLUMNA_FECHA, true);
        this.setColumnasModificables(COLUMNA_DIA, true);
        this.setColumnasModificables(COLUMNA_MES, true);
        this.setColumnasModificables(COLUMNA_ANO, true);
        this.setColumnasModificables(COLUMNA_V10T, true);
        this.setColumnasModificables(COLUMNA_V11, true);
        this.setColumnasModificables(COLUMNA_V12, true);
        this.setColumnasModificables(COLUMNA_V13, true);
        this.setColumnasModificables(COLUMNA_V14, true);
        this.setColumnasModificables(COLUMNA_V15, true);
        this.setColumnasModificables(COLUMNA_V16, true);
        this.setColumnasModificables(COLUMNA_V16_OTR, true);
        this.setColumnasModificables(COLUMNA_V17A, true);
        this.setColumnasModificables(COLUMNA_V17B, true);
        this.setColumnasModificables(COLUMNA_V18, true);
        this.setColumnasModificables(COLUMNA_V19, true);
        this.setColumnasModificables(COLUMNA_V20, true);
        this.setColumnasModificables(COLUMNA_V21, true);
        this.setColumnasModificables(COLUMNA_V22, true);
        this.setColumnasModificables(COLUMNA_V23, true);
        this.setColumnasModificables(COLUMNA_V24, true);
        this.setColumnasModificables(COLUMNA_V25, true);
        this.setColumnasModificables(COLUMNA_V26, true);
        this.setColumnasModificables(COLUMNA_V26ESP_CELULAR, true);
        this.setColumnasModificables(COLUMNA_V27, true);
        this.setColumnasModificables(COLUMNA_V27ESP_LINEA, true);
        this.setColumnasModificables(COLUMNA_V28_1, true);
        this.setColumnasModificables(COLUMNA_V28_2, true);
        this.setColumnasModificables(COLUMNA_V28_3, true);
        this.setColumnasModificables(COLUMNA_V28_4, true);
        this.setColumnasModificables(COLUMNA_V28_5, true);
        this.setColumnasModificables(COLUMNA_V28_6, true);
        this.setColumnasModificables(COLUMNA_V28_7, true);
        this.setColumnasModificables(COLUMNA_V28_8, true);
        this.setColumnasModificables(COLUMNA_V29NOMBRE_JEFE, true);
        this.setColumnasModificables(COLUMNA_CEDULAJEFE, true);
        this.setColumnasModificables(COLUMNA_VAR00001, true);
        this.setColumnasModificables(COLUMNA_ES_IMPORTADO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACION, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_TRANSACCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_ARCHIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_ARCHIVO, true);
    }

    public Long getIdLogImpHogEec() {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_HOG_EEC);
    }
    public Long getIdLogImpHogEec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_LOG_IMP_HOG_EEC, rowKey);
    }
    public void setIdLogImpHogEec(Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_HOG_EEC, valor);
    }
    public void setIdLogImpHogEec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_LOG_IMP_HOG_EEC, rowKey, valor);
    }

    public Long getVersionLogImpHogEec() {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_HOG_EEC);
    }
    public Long getVersionLogImpHogEec(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_LOG_IMP_HOG_EEC, rowKey);
    }
    public void setVersionLogImpHogEec(Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_HOG_EEC, valor);
    }
    public void setVersionLogImpHogEec(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_LOG_IMP_HOG_EEC, rowKey, valor);
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

    public String getDireccion() {
        return (String) super.getValue(COLUMNA_DIRECCION);
    }
    public String getDireccion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DIRECCION, rowKey);
    }
    public void setDireccion(String valor) {
        super.setValue(COLUMNA_DIRECCION, valor);
    }
    public void setDireccion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DIRECCION, rowKey, valor);
    }

    public String getNroDe() {
        return (String) super.getValue(COLUMNA_NRO_DE);
    }
    public String getNroDe(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NRO_DE, rowKey);
    }
    public void setNroDe(String valor) {
        super.setValue(COLUMNA_NRO_DE, valor);
    }
    public void setNroDe(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NRO_DE, rowKey, valor);
    }

    public String getTelefono() {
        return (String) super.getValue(COLUMNA_TELEFONO);
    }
    public String getTelefono(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_TELEFONO, rowKey);
    }
    public void setTelefono(String valor) {
        super.setValue(COLUMNA_TELEFONO, valor);
    }
    public void setTelefono(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_TELEFONO, rowKey, valor);
    }

    public String getFecha() {
        return (String) super.getValue(COLUMNA_FECHA);
    }
    public String getFecha(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_FECHA, rowKey);
    }
    public void setFecha(String valor) {
        super.setValue(COLUMNA_FECHA, valor);
    }
    public void setFecha(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_FECHA, rowKey, valor);
    }

    public String getDia() {
        return (String) super.getValue(COLUMNA_DIA);
    }
    public String getDia(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DIA, rowKey);
    }
    public void setDia(String valor) {
        super.setValue(COLUMNA_DIA, valor);
    }
    public void setDia(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DIA, rowKey, valor);
    }

    public String getMes() {
        return (String) super.getValue(COLUMNA_MES);
    }
    public String getMes(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_MES, rowKey);
    }
    public void setMes(String valor) {
        super.setValue(COLUMNA_MES, valor);
    }
    public void setMes(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_MES, rowKey, valor);
    }

    public String getAno() {
        return (String) super.getValue(COLUMNA_ANO);
    }
    public String getAno(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_ANO, rowKey);
    }
    public void setAno(String valor) {
        super.setValue(COLUMNA_ANO, valor);
    }
    public void setAno(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_ANO, rowKey, valor);
    }

    public String getV10t() {
        return (String) super.getValue(COLUMNA_V10T);
    }
    public String getV10t(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V10T, rowKey);
    }
    public void setV10t(String valor) {
        super.setValue(COLUMNA_V10T, valor);
    }
    public void setV10t(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V10T, rowKey, valor);
    }

    public String getV11() {
        return (String) super.getValue(COLUMNA_V11);
    }
    public String getV11(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V11, rowKey);
    }
    public void setV11(String valor) {
        super.setValue(COLUMNA_V11, valor);
    }
    public void setV11(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V11, rowKey, valor);
    }

    public String getV12() {
        return (String) super.getValue(COLUMNA_V12);
    }
    public String getV12(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V12, rowKey);
    }
    public void setV12(String valor) {
        super.setValue(COLUMNA_V12, valor);
    }
    public void setV12(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V12, rowKey, valor);
    }

    public String getV13() {
        return (String) super.getValue(COLUMNA_V13);
    }
    public String getV13(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V13, rowKey);
    }
    public void setV13(String valor) {
        super.setValue(COLUMNA_V13, valor);
    }
    public void setV13(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V13, rowKey, valor);
    }

    public String getV14() {
        return (String) super.getValue(COLUMNA_V14);
    }
    public String getV14(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V14, rowKey);
    }
    public void setV14(String valor) {
        super.setValue(COLUMNA_V14, valor);
    }
    public void setV14(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V14, rowKey, valor);
    }

    public String getV15() {
        return (String) super.getValue(COLUMNA_V15);
    }
    public String getV15(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V15, rowKey);
    }
    public void setV15(String valor) {
        super.setValue(COLUMNA_V15, valor);
    }
    public void setV15(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V15, rowKey, valor);
    }

    public String getV16() {
        return (String) super.getValue(COLUMNA_V16);
    }
    public String getV16(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V16, rowKey);
    }
    public void setV16(String valor) {
        super.setValue(COLUMNA_V16, valor);
    }
    public void setV16(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V16, rowKey, valor);
    }

    public String getV16Otr() {
        return (String) super.getValue(COLUMNA_V16_OTR);
    }
    public String getV16Otr(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V16_OTR, rowKey);
    }
    public void setV16Otr(String valor) {
        super.setValue(COLUMNA_V16_OTR, valor);
    }
    public void setV16Otr(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V16_OTR, rowKey, valor);
    }

    public String getV17a() {
        return (String) super.getValue(COLUMNA_V17A);
    }
    public String getV17a(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V17A, rowKey);
    }
    public void setV17a(String valor) {
        super.setValue(COLUMNA_V17A, valor);
    }
    public void setV17a(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V17A, rowKey, valor);
    }

    public String getV17b() {
        return (String) super.getValue(COLUMNA_V17B);
    }
    public String getV17b(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V17B, rowKey);
    }
    public void setV17b(String valor) {
        super.setValue(COLUMNA_V17B, valor);
    }
    public void setV17b(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V17B, rowKey, valor);
    }

    public String getV18() {
        return (String) super.getValue(COLUMNA_V18);
    }
    public String getV18(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V18, rowKey);
    }
    public void setV18(String valor) {
        super.setValue(COLUMNA_V18, valor);
    }
    public void setV18(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V18, rowKey, valor);
    }

    public String getV19() {
        return (String) super.getValue(COLUMNA_V19);
    }
    public String getV19(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V19, rowKey);
    }
    public void setV19(String valor) {
        super.setValue(COLUMNA_V19, valor);
    }
    public void setV19(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V19, rowKey, valor);
    }

    public String getV20() {
        return (String) super.getValue(COLUMNA_V20);
    }
    public String getV20(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V20, rowKey);
    }
    public void setV20(String valor) {
        super.setValue(COLUMNA_V20, valor);
    }
    public void setV20(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V20, rowKey, valor);
    }

    public String getV21() {
        return (String) super.getValue(COLUMNA_V21);
    }
    public String getV21(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V21, rowKey);
    }
    public void setV21(String valor) {
        super.setValue(COLUMNA_V21, valor);
    }
    public void setV21(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V21, rowKey, valor);
    }

    public String getV22() {
        return (String) super.getValue(COLUMNA_V22);
    }
    public String getV22(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V22, rowKey);
    }
    public void setV22(String valor) {
        super.setValue(COLUMNA_V22, valor);
    }
    public void setV22(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V22, rowKey, valor);
    }

    public String getV23() {
        return (String) super.getValue(COLUMNA_V23);
    }
    public String getV23(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V23, rowKey);
    }
    public void setV23(String valor) {
        super.setValue(COLUMNA_V23, valor);
    }
    public void setV23(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V23, rowKey, valor);
    }

    public String getV24() {
        return (String) super.getValue(COLUMNA_V24);
    }
    public String getV24(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V24, rowKey);
    }
    public void setV24(String valor) {
        super.setValue(COLUMNA_V24, valor);
    }
    public void setV24(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V24, rowKey, valor);
    }

    public String getV25() {
        return (String) super.getValue(COLUMNA_V25);
    }
    public String getV25(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V25, rowKey);
    }
    public void setV25(String valor) {
        super.setValue(COLUMNA_V25, valor);
    }
    public void setV25(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V25, rowKey, valor);
    }

    public String getV26() {
        return (String) super.getValue(COLUMNA_V26);
    }
    public String getV26(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V26, rowKey);
    }
    public void setV26(String valor) {
        super.setValue(COLUMNA_V26, valor);
    }
    public void setV26(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V26, rowKey, valor);
    }

    public String getV26espCelular() {
        return (String) super.getValue(COLUMNA_V26ESP_CELULAR);
    }
    public String getV26espCelular(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V26ESP_CELULAR, rowKey);
    }
    public void setV26espCelular(String valor) {
        super.setValue(COLUMNA_V26ESP_CELULAR, valor);
    }
    public void setV26espCelular(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V26ESP_CELULAR, rowKey, valor);
    }

    public String getV27() {
        return (String) super.getValue(COLUMNA_V27);
    }
    public String getV27(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V27, rowKey);
    }
    public void setV27(String valor) {
        super.setValue(COLUMNA_V27, valor);
    }
    public void setV27(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V27, rowKey, valor);
    }

    public String getV27espLinea() {
        return (String) super.getValue(COLUMNA_V27ESP_LINEA);
    }
    public String getV27espLinea(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V27ESP_LINEA, rowKey);
    }
    public void setV27espLinea(String valor) {
        super.setValue(COLUMNA_V27ESP_LINEA, valor);
    }
    public void setV27espLinea(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V27ESP_LINEA, rowKey, valor);
    }

    public String getV281() {
        return (String) super.getValue(COLUMNA_V28_1);
    }
    public String getV281(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_1, rowKey);
    }
    public void setV281(String valor) {
        super.setValue(COLUMNA_V28_1, valor);
    }
    public void setV281(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_1, rowKey, valor);
    }

    public String getV282() {
        return (String) super.getValue(COLUMNA_V28_2);
    }
    public String getV282(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_2, rowKey);
    }
    public void setV282(String valor) {
        super.setValue(COLUMNA_V28_2, valor);
    }
    public void setV282(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_2, rowKey, valor);
    }

    public String getV283() {
        return (String) super.getValue(COLUMNA_V28_3);
    }
    public String getV283(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_3, rowKey);
    }
    public void setV283(String valor) {
        super.setValue(COLUMNA_V28_3, valor);
    }
    public void setV283(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_3, rowKey, valor);
    }

    public String getV284() {
        return (String) super.getValue(COLUMNA_V28_4);
    }
    public String getV284(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_4, rowKey);
    }
    public void setV284(String valor) {
        super.setValue(COLUMNA_V28_4, valor);
    }
    public void setV284(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_4, rowKey, valor);
    }

    public String getV285() {
        return (String) super.getValue(COLUMNA_V28_5);
    }
    public String getV285(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_5, rowKey);
    }
    public void setV285(String valor) {
        super.setValue(COLUMNA_V28_5, valor);
    }
    public void setV285(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_5, rowKey, valor);
    }

    public String getV286() {
        return (String) super.getValue(COLUMNA_V28_6);
    }
    public String getV286(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_6, rowKey);
    }
    public void setV286(String valor) {
        super.setValue(COLUMNA_V28_6, valor);
    }
    public void setV286(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_6, rowKey, valor);
    }

    public String getV287() {
        return (String) super.getValue(COLUMNA_V28_7);
    }
    public String getV287(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_7, rowKey);
    }
    public void setV287(String valor) {
        super.setValue(COLUMNA_V28_7, valor);
    }
    public void setV287(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_7, rowKey, valor);
    }

    public String getV288() {
        return (String) super.getValue(COLUMNA_V28_8);
    }
    public String getV288(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V28_8, rowKey);
    }
    public void setV288(String valor) {
        super.setValue(COLUMNA_V28_8, valor);
    }
    public void setV288(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V28_8, rowKey, valor);
    }

    public String getV29nombreJefe() {
        return (String) super.getValue(COLUMNA_V29NOMBRE_JEFE);
    }
    public String getV29nombreJefe(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_V29NOMBRE_JEFE, rowKey);
    }
    public void setV29nombreJefe(String valor) {
        super.setValue(COLUMNA_V29NOMBRE_JEFE, valor);
    }
    public void setV29nombreJefe(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_V29NOMBRE_JEFE, rowKey, valor);
    }

    public String getCedulajefe() {
        return (String) super.getValue(COLUMNA_CEDULAJEFE);
    }
    public String getCedulajefe(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CEDULAJEFE, rowKey);
    }
    public void setCedulajefe(String valor) {
        super.setValue(COLUMNA_CEDULAJEFE, valor);
    }
    public void setCedulajefe(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CEDULAJEFE, rowKey, valor);
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

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_log_imp_hog_eec";
    public static final String COLUMNA_VERSION_RECURSO = "version_log_imp_hog_eec";

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
        return this.getIdLogImpHogEec();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdLogImpHogEec(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdLogImpHogEec(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdLogImpHogEec(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionLogImpHogEec();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionLogImpHogEec(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionLogImpHogEec(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionLogImpHogEec(rowKey, versionRecurso);
    }
}
