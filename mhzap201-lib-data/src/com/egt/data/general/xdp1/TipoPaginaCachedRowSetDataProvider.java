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

public class TipoPaginaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoPaginaCachedRowSetDataProvider() {
        super();
    }

    public TipoPaginaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_pagina";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Pagina";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_pagina_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_pagina";

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

    public static final String COLUMNA_NUMERO_TIPO_PAGINA = "numero_tipo_pagina";
    public static final String COLUMNA_CODIGO_TIPO_PAGINA = "codigo_tipo_pagina";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PAGINA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_PAGINA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PAGINA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_PAGINA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PAGINA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_PAGINA, true);
    }

    public Integer getNumeroTipoPagina() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA);
    }
    public Integer getNumeroTipoPagina(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey);
    }
    public void setNumeroTipoPagina(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, valor);
    }
    public void setNumeroTipoPagina(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PAGINA, rowKey, valor);
    }

    public String getCodigoTipoPagina() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PAGINA);
    }
    public String getCodigoTipoPagina(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_PAGINA, rowKey);
    }
    public void setCodigoTipoPagina(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PAGINA, valor);
    }
    public void setCodigoTipoPagina(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_PAGINA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_pagina";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_pagina";

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
        return this.getCodigoTipoPagina();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoPagina(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoPagina(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoPagina(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoPagina();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoPagina(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoPagina(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoPagina(rowKey, numeroRecurso);
    }
}
