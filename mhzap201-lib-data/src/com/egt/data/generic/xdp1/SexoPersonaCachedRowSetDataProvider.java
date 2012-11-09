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

public class SexoPersonaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoCodificableDataProvider, RecursoEnumerableDataProvider {

    public SexoPersonaCachedRowSetDataProvider() {
        super();
    }

    public SexoPersonaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "sexo_persona";
    public static final String NOMBRE_DOMINIO_RECURSO = "Sexos de Persona";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_sexo_persona_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "sexo_persona";

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

    public static final String COLUMNA_NUMERO_SEXO_PERSONA = "numero_sexo_persona";
    public static final String COLUMNA_CODIGO_SEXO_PERSONA = "codigo_sexo_persona";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SEXO_PERSONA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_SEXO_PERSONA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_SEXO_PERSONA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_SEXO_PERSONA, true);
    }

    public Integer getNumeroSexoPersona() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SEXO_PERSONA);
    }
    public Integer getNumeroSexoPersona(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SEXO_PERSONA, rowKey);
    }
    public void setNumeroSexoPersona(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SEXO_PERSONA, valor);
    }
    public void setNumeroSexoPersona(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SEXO_PERSONA, rowKey, valor);
    }

    public String getCodigoSexoPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_SEXO_PERSONA);
    }
    public String getCodigoSexoPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_SEXO_PERSONA, rowKey);
    }
    public void setCodigoSexoPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_SEXO_PERSONA, valor);
    }
    public void setCodigoSexoPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_SEXO_PERSONA, rowKey, valor);
    }

    public static final String COLUMNA_CODIGO_RECURSO = "codigo_sexo_persona";
    public static final String COLUMNA_NUMERO_RECURSO = "numero_sexo_persona";

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
        return this.getCodigoSexoPersona();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoSexoPersona(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoSexoPersona(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoSexoPersona(rowKey, codigoRecurso);
    }

    @Override
    public Integer getNumeroRecurso() {
        return this.getNumeroSexoPersona();
    }
    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.getNumeroSexoPersona(rowKey);
    }
    @Override
    public void setNumeroRecurso(Integer numeroRecurso) {
        this.setNumeroSexoPersona(numeroRecurso);
    }
    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso) {
        this.setNumeroSexoPersona(rowKey, numeroRecurso);
    }
}
