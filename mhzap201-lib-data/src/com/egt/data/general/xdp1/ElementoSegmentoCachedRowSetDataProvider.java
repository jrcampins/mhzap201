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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class ElementoSegmentoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider {

    public ElementoSegmentoCachedRowSetDataProvider() {
        super();
    }

    public ElementoSegmentoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "elemento_segmento";
    public static final String NOMBRE_DOMINIO_RECURSO = "Elementos de Conjunto de Segmentos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_elemento_segmento_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "elemento_segmento";

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

    public static final String COLUMNA_ID_ELEMENTO_SEGMENTO = "id_elemento_segmento";
    public static final String COLUMNA_VERSION_ELEMENTO_SEGMENTO = "version_elemento_segmento";
    public static final String COLUMNA_ID_CONJUNTO_SEGMENTO = "id_conjunto_segmento";
    public static final String COLUMNA_ID_SEGMENTO = "id_segmento";
    public static final String COLUMNA_VALOR_SEGMENTO = "valor_segmento";
    public static final String COLUMNA_SIGNIFICADO_SEGMENTO = "significado_segmento";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ELEMENTO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_ELEMENTO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CONJUNTO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VALOR_SEGMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SIGNIFICADO_SEGMENTO, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_ELEMENTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_ELEMENTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_VALOR_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_SIGNIFICADO_SEGMENTO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_ELEMENTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_VERSION_ELEMENTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_VALOR_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_SIGNIFICADO_SEGMENTO, true);
    }

    public Long getIdElementoSegmento() {
        return (Long) super.getValue(COLUMNA_ID_ELEMENTO_SEGMENTO);
    }
    public Long getIdElementoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ELEMENTO_SEGMENTO, rowKey);
    }
    public void setIdElementoSegmento(Long valor) {
        super.setValue(COLUMNA_ID_ELEMENTO_SEGMENTO, valor);
    }
    public void setIdElementoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ELEMENTO_SEGMENTO, rowKey, valor);
    }

    public Long getVersionElementoSegmento() {
        return (Long) super.getValue(COLUMNA_VERSION_ELEMENTO_SEGMENTO);
    }
    public Long getVersionElementoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_ELEMENTO_SEGMENTO, rowKey);
    }
    public void setVersionElementoSegmento(Long valor) {
        super.setValue(COLUMNA_VERSION_ELEMENTO_SEGMENTO, valor);
    }
    public void setVersionElementoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_ELEMENTO_SEGMENTO, rowKey, valor);
    }

    public Long getIdConjuntoSegmento() {
        return (Long) super.getValue(COLUMNA_ID_CONJUNTO_SEGMENTO);
    }
    public Long getIdConjuntoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setIdConjuntoSegmento(Long valor) {
        super.setValue(COLUMNA_ID_CONJUNTO_SEGMENTO, valor);
    }
    public void setIdConjuntoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public Long getIdSegmento() {
        return (Long) super.getValue(COLUMNA_ID_SEGMENTO);
    }
    public Long getIdSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_SEGMENTO, rowKey);
    }
    public void setIdSegmento(Long valor) {
        super.setValue(COLUMNA_ID_SEGMENTO, valor);
    }
    public void setIdSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_SEGMENTO, rowKey, valor);
    }

    public String getValorSegmento() {
        return (String) super.getValue(COLUMNA_VALOR_SEGMENTO);
    }
    public String getValorSegmento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_VALOR_SEGMENTO, rowKey);
    }
    public void setValorSegmento(String valor) {
        super.setValue(COLUMNA_VALOR_SEGMENTO, valor);
    }
    public void setValorSegmento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_VALOR_SEGMENTO, rowKey, valor);
    }

    public String getSignificadoSegmento() {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_SEGMENTO);
    }
    public String getSignificadoSegmento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SIGNIFICADO_SEGMENTO, rowKey);
    }
    public void setSignificadoSegmento(String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_SEGMENTO, valor);
    }
    public void setSignificadoSegmento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SIGNIFICADO_SEGMENTO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_elemento_segmento";
    public static final String COLUMNA_VERSION_RECURSO = "version_elemento_segmento";

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
        return this.getIdElementoSegmento();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdElementoSegmento(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdElementoSegmento(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdElementoSegmento(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionElementoSegmento();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionElementoSegmento(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionElementoSegmento(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionElementoSegmento(rowKey, versionRecurso);
    }
}
