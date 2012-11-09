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

public class IdiomaHogarCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public IdiomaHogarCachedRowSetDataProvider() {
        super();
    }

    public IdiomaHogarCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "idioma_hogar";
    public static final String NOMBRE_DOMINIO_RECURSO = "Idiomas";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_idioma_hogar_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "idioma_hogar";

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

    public static final String COLUMNA_NUMERO_IDIOMA_HOGAR = "numero_idioma_hogar";
    public static final String COLUMNA_CODIGO_IDIOMA_HOGAR = "codigo_idioma_hogar";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_IDIOMA_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_IDIOMA_HOGAR, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_IDIOMA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_IDIOMA_HOGAR, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_IDIOMA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_CODIGO_IDIOMA_HOGAR, true);
    }

    public Integer getNumeroIdiomaHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_IDIOMA_HOGAR);
    }
    public Integer getNumeroIdiomaHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_IDIOMA_HOGAR, rowKey);
    }
    public void setNumeroIdiomaHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_IDIOMA_HOGAR, valor);
    }
    public void setNumeroIdiomaHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_IDIOMA_HOGAR, rowKey, valor);
    }

    public String getCodigoIdiomaHogar() {
        return (String) super.getValue(COLUMNA_CODIGO_IDIOMA_HOGAR);
    }
    public String getCodigoIdiomaHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_IDIOMA_HOGAR, rowKey);
    }
    public void setCodigoIdiomaHogar(String valor) {
        super.setValue(COLUMNA_CODIGO_IDIOMA_HOGAR, valor);
    }
    public void setCodigoIdiomaHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_IDIOMA_HOGAR, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_idioma_hogar";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_idioma_hogar";

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
        return this.getCodigoIdiomaHogar();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoIdiomaHogar(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoIdiomaHogar(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoIdiomaHogar(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroIdiomaHogar();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroIdiomaHogar(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroIdiomaHogar(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroIdiomaHogar(rowKey, numeroRecurso);
    }
}
