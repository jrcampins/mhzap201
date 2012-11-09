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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import javax.sql.rowset.CachedRowSet;

public class ParametroGlobalCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public ParametroGlobalCachedRowSetDataProvider() {
        super();
    }

    public ParametroGlobalCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "parametro_global";
    public static final String NOMBRE_DOMINIO_RECURSO = "Parametros Globales";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_parametro_global_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "parametro_global";

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

    public static final String COLUMNA_NUMERO_PARAMETRO_GLOBAL = "numero_parametro_global";
    public static final String COLUMNA_CODIGO_PARAMETRO_GLOBAL = "codigo_parametro_global";
    public static final String COLUMNA_MONTO_SALARIO_MINIMO = "monto_salario_minimo";
    public static final String COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA = "porcentaje_pension_alimentaria";
    public static final String COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO = "es_control_cer_vida_activo";
    public static final String COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA = "meses_validez_certificado_vida";
    public static final String COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV = "es_control_cobro_pension_activ";
    public static final String COLUMNA_MESES_ULTIMO_COBRO_PENSION = "meses_ultimo_cobro_pension";
    public static final String COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV = "es_control_reproceso_pen_activ";
    public static final String COLUMNA_LIMITE_INDICE_CALIDAD_VIDA = "limite_indice_calidad_vida";
    public static final String COLUMNA_LIMITE_PENSIONES = "limite_pensiones";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_PARAMETRO_GLOBAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PARAMETRO_GLOBAL, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_SALARIO_MINIMO, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MESES_ULTIMO_COBRO_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LIMITE_PENSIONES, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_PARAMETRO_GLOBAL, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PARAMETRO_GLOBAL, true);
        this.setColumnasInsertables(COLUMNA_MONTO_SALARIO_MINIMO, true);
        this.setColumnasInsertables(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, true);
        this.setColumnasInsertables(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, true);
        this.setColumnasInsertables(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, true);
        this.setColumnasInsertables(COLUMNA_MESES_ULTIMO_COBRO_PENSION, true);
        this.setColumnasInsertables(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, true);
        this.setColumnasInsertables(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, true);
        this.setColumnasInsertables(COLUMNA_LIMITE_PENSIONES, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_PARAMETRO_GLOBAL, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PARAMETRO_GLOBAL, true);
        this.setColumnasModificables(COLUMNA_MONTO_SALARIO_MINIMO, true);
        this.setColumnasModificables(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, true);
        this.setColumnasModificables(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, true);
        this.setColumnasModificables(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, true);
        this.setColumnasModificables(COLUMNA_MESES_ULTIMO_COBRO_PENSION, true);
        this.setColumnasModificables(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, true);
        this.setColumnasModificables(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, true);
        this.setColumnasModificables(COLUMNA_LIMITE_PENSIONES, true);
    }

    public Integer getNumeroParametroGlobal() {
        return (Integer) super.getValue(COLUMNA_NUMERO_PARAMETRO_GLOBAL);
    }
    public Integer getNumeroParametroGlobal(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_PARAMETRO_GLOBAL, rowKey);
    }
    public void setNumeroParametroGlobal(Integer valor) {
        super.setValue(COLUMNA_NUMERO_PARAMETRO_GLOBAL, valor);
    }
    public void setNumeroParametroGlobal(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_PARAMETRO_GLOBAL, rowKey, valor);
    }

    public String getCodigoParametroGlobal() {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO_GLOBAL);
    }
    public String getCodigoParametroGlobal(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PARAMETRO_GLOBAL, rowKey);
    }
    public void setCodigoParametroGlobal(String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO_GLOBAL, valor);
    }
    public void setCodigoParametroGlobal(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PARAMETRO_GLOBAL, rowKey, valor);
    }

    public BigDecimal getMontoSalarioMinimo() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_SALARIO_MINIMO);
    }
    public BigDecimal getMontoSalarioMinimo(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_SALARIO_MINIMO, rowKey);
    }
    public void setMontoSalarioMinimo(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_SALARIO_MINIMO, valor);
    }
    public void setMontoSalarioMinimo(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_SALARIO_MINIMO, rowKey, valor);
    }

    public BigDecimal getPorcentajePensionAlimentaria() {
        return (BigDecimal) super.getValue(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA);
    }
    public BigDecimal getPorcentajePensionAlimentaria(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, rowKey);
    }
    public void setPorcentajePensionAlimentaria(BigDecimal valor) {
        super.setValue(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, valor);
    }
    public void setPorcentajePensionAlimentaria(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_PORCENTAJE_PENSION_ALIMENTARIA, rowKey, valor);
    }

    public Integer getEsControlCerVidaActivo() {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO);
    }
    public Integer getEsControlCerVidaActivo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, rowKey);
    }
    public void setEsControlCerVidaActivo(Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, valor);
    }
    public void setEsControlCerVidaActivo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_CER_VIDA_ACTIVO, rowKey, valor);
    }

    public Integer getMesesValidezCertificadoVida() {
        return (Integer) super.getValue(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA);
    }
    public Integer getMesesValidezCertificadoVida(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, rowKey);
    }
    public void setMesesValidezCertificadoVida(Integer valor) {
        super.setValue(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, valor);
    }
    public void setMesesValidezCertificadoVida(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_MESES_VALIDEZ_CERTIFICADO_VIDA, rowKey, valor);
    }

    public Integer getEsControlCobroPensionActiv() {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV);
    }
    public Integer getEsControlCobroPensionActiv(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, rowKey);
    }
    public void setEsControlCobroPensionActiv(Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, valor);
    }
    public void setEsControlCobroPensionActiv(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_COBRO_PENSION_ACTIV, rowKey, valor);
    }

    public Integer getMesesUltimoCobroPension() {
        return (Integer) super.getValue(COLUMNA_MESES_ULTIMO_COBRO_PENSION);
    }
    public Integer getMesesUltimoCobroPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_MESES_ULTIMO_COBRO_PENSION, rowKey);
    }
    public void setMesesUltimoCobroPension(Integer valor) {
        super.setValue(COLUMNA_MESES_ULTIMO_COBRO_PENSION, valor);
    }
    public void setMesesUltimoCobroPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_MESES_ULTIMO_COBRO_PENSION, rowKey, valor);
    }

    public Integer getEsControlReprocesoPenActiv() {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV);
    }
    public Integer getEsControlReprocesoPenActiv(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, rowKey);
    }
    public void setEsControlReprocesoPenActiv(Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, valor);
    }
    public void setEsControlReprocesoPenActiv(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CONTROL_REPROCESO_PEN_ACTIV, rowKey, valor);
    }

    public BigDecimal getLimiteIndiceCalidadVida() {
        return (BigDecimal) super.getValue(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA);
    }
    public BigDecimal getLimiteIndiceCalidadVida(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, rowKey);
    }
    public void setLimiteIndiceCalidadVida(BigDecimal valor) {
        super.setValue(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, valor);
    }
    public void setLimiteIndiceCalidadVida(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_LIMITE_INDICE_CALIDAD_VIDA, rowKey, valor);
    }

    public Integer getLimitePensiones() {
        return (Integer) super.getValue(COLUMNA_LIMITE_PENSIONES);
    }
    public Integer getLimitePensiones(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_LIMITE_PENSIONES, rowKey);
    }
    public void setLimitePensiones(Integer valor) {
        super.setValue(COLUMNA_LIMITE_PENSIONES, valor);
    }
    public void setLimitePensiones(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_LIMITE_PENSIONES, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_parametro_global";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_parametro_global";

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
        return this.getCodigoParametroGlobal();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoParametroGlobal(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoParametroGlobal(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoParametroGlobal(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroParametroGlobal();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroParametroGlobal(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroParametroGlobal(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroParametroGlobal(rowKey, numeroRecurso);
    }
}
