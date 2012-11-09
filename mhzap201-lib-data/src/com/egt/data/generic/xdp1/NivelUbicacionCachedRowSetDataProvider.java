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
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoEnumerableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class NivelUbicacionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public NivelUbicacionCachedRowSetDataProvider() {
        super();
    }

    public NivelUbicacionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "nivel_ubicacion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Niveles Jerarquicos de Ubicacion";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_nivel_ubicacion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "nivel_ubicacion";

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

    public static final String COLUMNA_NUMERO_NIVEL_UBICACION = "numero_nivel_ubicacion";
    public static final String COLUMNA_CODIGO_NIVEL_UBICACION = "codigo_nivel_ubicacion";
    public static final String COLUMNA_DIGITOS_NIVEL_UBICACION = "digitos_nivel_ubicacion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_UBICACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_NIVEL_UBICACION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIGITOS_NIVEL_UBICACION, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_NIVEL_UBICACION, true);
        this.setColumnasInsertables(COLUMNA_DIGITOS_NIVEL_UBICACION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_UBICACION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_NIVEL_UBICACION, true);
        this.setColumnasModificables(COLUMNA_DIGITOS_NIVEL_UBICACION, true);
    }

    public Integer getNumeroNivelUbicacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION);
    }
    public Integer getNumeroNivelUbicacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey);
    }
    public void setNumeroNivelUbicacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, valor);
    }
    public void setNumeroNivelUbicacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_UBICACION, rowKey, valor);
    }

    public String getCodigoNivelUbicacion() {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION);
    }
    public String getCodigoNivelUbicacion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_NIVEL_UBICACION, rowKey);
    }
    public void setCodigoNivelUbicacion(String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION, valor);
    }
    public void setCodigoNivelUbicacion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_NIVEL_UBICACION, rowKey, valor);
    }

    public Integer getDigitosNivelUbicacion() {
        return (Integer) super.getValue(COLUMNA_DIGITOS_NIVEL_UBICACION);
    }
    public Integer getDigitosNivelUbicacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_DIGITOS_NIVEL_UBICACION, rowKey);
    }
    public void setDigitosNivelUbicacion(Integer valor) {
        super.setValue(COLUMNA_DIGITOS_NIVEL_UBICACION, valor);
    }
    public void setDigitosNivelUbicacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_DIGITOS_NIVEL_UBICACION, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_nivel_ubicacion";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_nivel_ubicacion";

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
        return this.getCodigoNivelUbicacion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoNivelUbicacion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoNivelUbicacion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoNivelUbicacion(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroNivelUbicacion();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroNivelUbicacion(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroNivelUbicacion(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroNivelUbicacion(rowKey, numeroRecurso);
    }
}
