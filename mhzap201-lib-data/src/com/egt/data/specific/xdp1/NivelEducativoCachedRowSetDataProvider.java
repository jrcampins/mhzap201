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

public class NivelEducativoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public NivelEducativoCachedRowSetDataProvider() {
        super();
    }

    public NivelEducativoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "nivel_educativo";
    public static final String NOMBRE_DOMINIO_RECURSO = "Niveles Educativos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_nivel_educativo_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "nivel_educativo";

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

    public static final String COLUMNA_NUMERO_NIVEL_EDUCATIVO = "numero_nivel_educativo";
    public static final String COLUMNA_CODIGO_NIVEL_EDUCATIVO = "codigo_nivel_educativo";
    public static final String COLUMNA_PRIMER_CURSO = "primer_curso";
    public static final String COLUMNA_ULTIMO_CURSO = "ultimo_curso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_EDUCATIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_EDUCATIVO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_CURSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ULTIMO_CURSO, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_EDUCATIVO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_EDUCATIVO, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_CURSO, true);
        this.setColumnasInsertables(COLUMNA_ULTIMO_CURSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_EDUCATIVO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_EDUCATIVO, true);
        this.setColumnasModificables(COLUMNA_PRIMER_CURSO, true);
        this.setColumnasModificables(COLUMNA_ULTIMO_CURSO, true);
    }

    public Integer getNumeroNivelEducativo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_EDUCATIVO);
    }
    public Integer getNumeroNivelEducativo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_EDUCATIVO, rowKey);
    }
    public void setNumeroNivelEducativo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_EDUCATIVO, valor);
    }
    public void setNumeroNivelEducativo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_EDUCATIVO, rowKey, valor);
    }

    public String getCodigoNivelEducativo() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_EDUCATIVO);
    }
    public String getCodigoNivelEducativo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_EDUCATIVO, rowKey);
    }
    public void setCodigoNivelEducativo(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_EDUCATIVO, valor);
    }
    public void setCodigoNivelEducativo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_EDUCATIVO, rowKey, valor);
    }

    public Integer getPrimerCurso() {
        return (Integer) super.getValue(COLUMNA_PRIMER_CURSO);
    }
    public Integer getPrimerCurso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_PRIMER_CURSO, rowKey);
    }
    public void setPrimerCurso(Integer valor) {
        super.setValue(COLUMNA_PRIMER_CURSO, valor);
    }
    public void setPrimerCurso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_PRIMER_CURSO, rowKey, valor);
    }

    public Integer getUltimoCurso() {
        return (Integer) super.getValue(COLUMNA_ULTIMO_CURSO);
    }
    public Integer getUltimoCurso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ULTIMO_CURSO, rowKey);
    }
    public void setUltimoCurso(Integer valor) {
        super.setValue(COLUMNA_ULTIMO_CURSO, valor);
    }
    public void setUltimoCurso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ULTIMO_CURSO, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_nivel_educativo";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_nivel_educativo";

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
        return this.getCodigoNivelEducativo();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoNivelEducativo(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoNivelEducativo(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoNivelEducativo(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroNivelEducativo();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroNivelEducativo(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroNivelEducativo(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroNivelEducativo(rowKey, numeroRecurso);
    }
}
