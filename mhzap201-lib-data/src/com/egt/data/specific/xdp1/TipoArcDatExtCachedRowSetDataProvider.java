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

public class TipoArcDatExtCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public TipoArcDatExtCachedRowSetDataProvider() {
        super();
    }

    public TipoArcDatExtCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "tipo_arc_dat_ext";
    public static final String NOMBRE_DOMINIO_RECURSO = "Tipos de Archivo de Datos Externos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_tipo_arc_dat_ext_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "tipo_arc_dat_ext";

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

    public static final String COLUMNA_NUMERO_TIPO_ARC_DAT_EXT = "numero_tipo_arc_dat_ext";
    public static final String COLUMNA_CODIGO_TIPO_ARC_DAT_EXT = "codigo_tipo_arc_dat_ext";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, true);
    }

    public Integer getNumeroTipoArcDatExt() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT);
    }
    public Integer getNumeroTipoArcDatExt(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, rowKey);
    }
    public void setNumeroTipoArcDatExt(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, valor);
    }
    public void setNumeroTipoArcDatExt(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ARC_DAT_EXT, rowKey, valor);
    }

    public String getCodigoTipoArcDatExt() {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT);
    }
    public String getCodigoTipoArcDatExt(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, rowKey);
    }
    public void setCodigoTipoArcDatExt(String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, valor);
    }
    public void setCodigoTipoArcDatExt(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_TIPO_ARC_DAT_EXT, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_tipo_arc_dat_ext";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_tipo_arc_dat_ext";

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
        return this.getCodigoTipoArcDatExt();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoTipoArcDatExt(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoTipoArcDatExt(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoTipoArcDatExt(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroTipoArcDatExt();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroTipoArcDatExt(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroTipoArcDatExt(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroTipoArcDatExt(rowKey, numeroRecurso);
    }
}
