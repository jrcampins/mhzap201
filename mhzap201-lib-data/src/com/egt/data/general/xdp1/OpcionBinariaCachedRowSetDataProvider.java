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

public class OpcionBinariaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public OpcionBinariaCachedRowSetDataProvider() {
        super();
    }

    public OpcionBinariaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "opcion_binaria";
    public static final String NOMBRE_DOMINIO_RECURSO = "Opciones Binarias";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_opcion_binaria_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "opcion_binaria";

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

    public static final String COLUMNA_NUMERO_OPCION_BINARIA = "numero_opcion_binaria";
    public static final String COLUMNA_CODIGO_OPCION_SI_NO = "codigo_opcion_si_no";
    public static final String COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO = "codigo_opcion_activo_inactivo";
    public static final String COLUMNA_CODIGO_OPCION_ENC_APA = "codigo_opcion_enc_apa";
    public static final String COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE = "codigo_opcion_presente_ausente";
    public static final String COLUMNA_CODIGO_OPCION_POS_NEG = "codigo_opcion_pos_neg";
    public static final String COLUMNA_CODIGO_OPCION_VERDADERO_FALSO = "codigo_opcion_verdadero_falso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_OPCION_BINARIA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_SI_NO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_ENC_APA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_POS_NEG, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_OPCION_BINARIA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_SI_NO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_ENC_APA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_POS_NEG, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_OPCION_BINARIA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_SI_NO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_ENC_APA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_POS_NEG, true);
        this.setColumnasModificables(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, true);
    }

    public Integer getNumeroOpcionBinaria() {
        return (Integer) super.getValue(COLUMNA_NUMERO_OPCION_BINARIA);
    }
    public Integer getNumeroOpcionBinaria(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_OPCION_BINARIA, rowKey);
    }
    public void setNumeroOpcionBinaria(Integer valor) {
        super.setValue(COLUMNA_NUMERO_OPCION_BINARIA, valor);
    }
    public void setNumeroOpcionBinaria(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_OPCION_BINARIA, rowKey, valor);
    }

    public String getCodigoOpcionSiNo() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_SI_NO);
    }
    public String getCodigoOpcionSiNo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_SI_NO, rowKey);
    }
    public void setCodigoOpcionSiNo(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_SI_NO, valor);
    }
    public void setCodigoOpcionSiNo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_SI_NO, rowKey, valor);
    }

    public String getCodigoOpcionActivoInactivo() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO);
    }
    public String getCodigoOpcionActivoInactivo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, rowKey);
    }
    public void setCodigoOpcionActivoInactivo(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, valor);
    }
    public void setCodigoOpcionActivoInactivo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_ACTIVO_INACTIVO, rowKey, valor);
    }

    public String getCodigoOpcionEncApa() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_ENC_APA);
    }
    public String getCodigoOpcionEncApa(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_ENC_APA, rowKey);
    }
    public void setCodigoOpcionEncApa(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_ENC_APA, valor);
    }
    public void setCodigoOpcionEncApa(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_ENC_APA, rowKey, valor);
    }

    public String getCodigoOpcionPresenteAusente() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE);
    }
    public String getCodigoOpcionPresenteAusente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, rowKey);
    }
    public void setCodigoOpcionPresenteAusente(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, valor);
    }
    public void setCodigoOpcionPresenteAusente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_PRESENTE_AUSENTE, rowKey, valor);
    }

    public String getCodigoOpcionPosNeg() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_POS_NEG);
    }
    public String getCodigoOpcionPosNeg(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_POS_NEG, rowKey);
    }
    public void setCodigoOpcionPosNeg(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_POS_NEG, valor);
    }
    public void setCodigoOpcionPosNeg(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_POS_NEG, rowKey, valor);
    }

    public String getCodigoOpcionVerdaderoFalso() {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO);
    }
    public String getCodigoOpcionVerdaderoFalso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, rowKey);
    }
    public void setCodigoOpcionVerdaderoFalso(String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, valor);
    }
    public void setCodigoOpcionVerdaderoFalso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_OPCION_VERDADERO_FALSO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_opcion_si_no";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_opcion_binaria";

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
        return this.getCodigoOpcionSiNo();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoOpcionSiNo(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoOpcionSiNo(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoOpcionSiNo(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroOpcionBinaria();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroOpcionBinaria(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroOpcionBinaria(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroOpcionBinaria(rowKey, numeroRecurso);
    }
}
