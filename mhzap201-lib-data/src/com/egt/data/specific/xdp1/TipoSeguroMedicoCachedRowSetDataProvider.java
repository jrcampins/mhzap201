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
import javax.sql.rowset.CachedRowSet;

public class TipoSeguroMedicoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoSeguroMedicoCachedRowSetDataProvider() {
        super();
    }

    public TipoSeguroMedicoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_seguro_medico";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Seguro Medico";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_seguro_medico_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_seguro_medico";

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

    public static final String COLUMNA_NUMERO_TIPO_SEGURO_MEDICO = "numero_tipo_seguro_medico";
    public static final String COLUMNA_CODIGO_TIPO_SEGURO_MEDICO = "codigo_tipo_seguro_medico";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, true);
    }

    public Integer getNumeroTipoSeguroMedico() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO);
    }
    public Integer getNumeroTipoSeguroMedico(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, rowKey);
    }
    public void setNumeroTipoSeguroMedico(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, valor);
    }
    public void setNumeroTipoSeguroMedico(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, rowKey, valor);
    }

    public String getCodigoTipoSeguroMedico() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO);
    }
    public String getCodigoTipoSeguroMedico(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, rowKey);
    }
    public void setCodigoTipoSeguroMedico(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, valor);
    }
    public void setCodigoTipoSeguroMedico(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_SEGURO_MEDICO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_seguro_medico";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_seguro_medico";

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
        return this.getCodigoTipoSeguroMedico();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoSeguroMedico(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoSeguroMedico(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoSeguroMedico(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoSeguroMedico();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoSeguroMedico(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoSeguroMedico(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoSeguroMedico(rowKey, numeroRecurso);
    }
}
