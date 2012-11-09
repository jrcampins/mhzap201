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
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class ConjuntoSegmentoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public ConjuntoSegmentoCachedRowSetDataProvider() {
        super();
    }

    public ConjuntoSegmentoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "conjunto_segmento";
    public static final String NOMBRE_DOMINIO_RECURSO = "Conjuntos de Segmentos";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_conjunto_segmento_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "conjunto_segmento";

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

    public static final String COLUMNA_ID_CONJUNTO_SEGMENTO = "id_conjunto_segmento";
    public static final String COLUMNA_VERSION_CONJUNTO_SEGMENTO = "version_conjunto_segmento";
    public static final String COLUMNA_CODIGO_CONJUNTO_SEGMENTO = "codigo_conjunto_segmento";
    public static final String COLUMNA_NOMBRE_CONJUNTO_SEGMENTO = "nombre_conjunto_segmento";
    public static final String COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO = "descripcion_conjunto_segmento";
    public static final String COLUMNA_ID_CLASE_RECURSO = "id_clase_recurso";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CONJUNTO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_CONJUNTO_SEGMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_CLASE_RECURSO, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_CLASE_RECURSO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_VERSION_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_CLASE_RECURSO, true);
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

    public Long getVersionConjuntoSegmento() {
        return (Long) super.getValue(COLUMNA_VERSION_CONJUNTO_SEGMENTO);
    }
    public Long getVersionConjuntoSegmento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setVersionConjuntoSegmento(Long valor) {
        super.setValue(COLUMNA_VERSION_CONJUNTO_SEGMENTO, valor);
    }
    public void setVersionConjuntoSegmento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public String getCodigoConjuntoSegmento() {
        return (String) super.getValue(COLUMNA_CODIGO_CONJUNTO_SEGMENTO);
    }
    public String getCodigoConjuntoSegmento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setCodigoConjuntoSegmento(String valor) {
        super.setValue(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, valor);
    }
    public void setCodigoConjuntoSegmento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public String getNombreConjuntoSegmento() {
        return (String) super.getValue(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO);
    }
    public String getNombreConjuntoSegmento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setNombreConjuntoSegmento(String valor) {
        super.setValue(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, valor);
    }
    public void setNombreConjuntoSegmento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public String getDescripcionConjuntoSegmento() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO);
    }
    public String getDescripcionConjuntoSegmento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, rowKey);
    }
    public void setDescripcionConjuntoSegmento(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, valor);
    }
    public void setDescripcionConjuntoSegmento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_CONJUNTO_SEGMENTO, rowKey, valor);
    }

    public Long getIdClaseRecurso() {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO);
    }
    public Long getIdClaseRecurso(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_CLASE_RECURSO, rowKey);
    }
    public void setIdClaseRecurso(Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, valor);
    }
    public void setIdClaseRecurso(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_CLASE_RECURSO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_conjunto_segmento";
    public static final String COLUMNA_VERSION_RECURSO = "version_conjunto_segmento";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_conjunto_segmento";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_conjunto_segmento";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
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
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdConjuntoSegmento();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdConjuntoSegmento(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdConjuntoSegmento(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdConjuntoSegmento(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionConjuntoSegmento();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionConjuntoSegmento(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionConjuntoSegmento(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionConjuntoSegmento(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoConjuntoSegmento();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoConjuntoSegmento(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoConjuntoSegmento(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoConjuntoSegmento(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreConjuntoSegmento();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreConjuntoSegmento(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreConjuntoSegmento(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreConjuntoSegmento(rowKey, nombreRecurso);
    }
}
