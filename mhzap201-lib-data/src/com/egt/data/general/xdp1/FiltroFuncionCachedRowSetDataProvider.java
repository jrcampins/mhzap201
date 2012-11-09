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
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FiltroFuncionCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoPersonalizableDataProvider {

    public FiltroFuncionCachedRowSetDataProvider() {
        super();
    }

    public FiltroFuncionCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "filtro_funcion";
    public static final String NOMBRE_DOMINIO_RECURSO = "Filtros";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_filtro_funcion_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "filtro_funcion";

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

    public static final String COLUMNA_ID_FILTRO_FUNCION = "id_filtro_funcion";
    public static final String COLUMNA_VERSION_FILTRO_FUNCION = "version_filtro_funcion";
    public static final String COLUMNA_CODIGO_FILTRO_FUNCION = "codigo_filtro_funcion";
    public static final String COLUMNA_NOMBRE_FILTRO_FUNCION = "nombre_filtro_funcion";
    public static final String COLUMNA_DESCRIPCION_FILTRO_FUNCION = "descripcion_filtro_funcion";
    public static final String COLUMNA_ID_FUNCION = "id_funcion";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_ES_PUBLICO = "es_publico";
    public static final String COLUMNA_ID_FILTRO_FUNCION_ORIGINAL = "id_filtro_funcion_original";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FILTRO_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FILTRO_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FILTRO_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FILTRO_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_FILTRO_FUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCION, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PUBLICO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, Long.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_FILTRO_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCION, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ES_PUBLICO, true);
        this.setColumnasInsertables(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_VERSION_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_FILTRO_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCION, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ES_PUBLICO, true);
        this.setColumnasModificables(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, true);
    }

    public Long getIdFiltroFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION);
    }
    public Long getIdFiltroFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION, rowKey);
    }
    public void setIdFiltroFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION, valor);
    }
    public void setIdFiltroFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION, rowKey, valor);
    }

    public Long getVersionFiltroFuncion() {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_FUNCION);
    }
    public Long getVersionFiltroFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FILTRO_FUNCION, rowKey);
    }
    public void setVersionFiltroFuncion(Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_FUNCION, valor);
    }
    public void setVersionFiltroFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FILTRO_FUNCION, rowKey, valor);
    }

    public String getCodigoFiltroFuncion() {
        return (String) super.getValue(COLUMNA_CODIGO_FILTRO_FUNCION);
    }
    public String getCodigoFiltroFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FILTRO_FUNCION, rowKey);
    }
    public void setCodigoFiltroFuncion(String valor) {
        super.setValue(COLUMNA_CODIGO_FILTRO_FUNCION, valor);
    }
    public void setCodigoFiltroFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FILTRO_FUNCION, rowKey, valor);
    }

    public String getNombreFiltroFuncion() {
        return (String) super.getValue(COLUMNA_NOMBRE_FILTRO_FUNCION);
    }
    public String getNombreFiltroFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FILTRO_FUNCION, rowKey);
    }
    public void setNombreFiltroFuncion(String valor) {
        super.setValue(COLUMNA_NOMBRE_FILTRO_FUNCION, valor);
    }
    public void setNombreFiltroFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FILTRO_FUNCION, rowKey, valor);
    }

    public String getDescripcionFiltroFuncion() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_FILTRO_FUNCION);
    }
    public String getDescripcionFiltroFuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_FILTRO_FUNCION, rowKey);
    }
    public void setDescripcionFiltroFuncion(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_FILTRO_FUNCION, valor);
    }
    public void setDescripcionFiltroFuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_FILTRO_FUNCION, rowKey, valor);
    }

    public Long getIdFuncion() {
        return (Long) super.getValue(COLUMNA_ID_FUNCION);
    }
    public Long getIdFuncion(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCION, rowKey);
    }
    public void setIdFuncion(Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, valor);
    }
    public void setIdFuncion(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCION, rowKey, valor);
    }

    public Long getIdUsuario() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO);
    }
    public Long getIdUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO, rowKey);
    }
    public void setIdUsuario(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, valor);
    }
    public void setIdUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO, rowKey, valor);
    }

    public Integer getEsPublico() {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICO);
    }
    public Integer getEsPublico(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PUBLICO, rowKey);
    }
    public void setEsPublico(Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICO, valor);
    }
    public void setEsPublico(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PUBLICO, rowKey, valor);
    }

    public Long getIdFiltroFuncionOriginal() {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL);
    }
    public Long getIdFiltroFuncionOriginal(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, rowKey);
    }
    public void setIdFiltroFuncionOriginal(Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, valor);
    }
    public void setIdFiltroFuncionOriginal(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FILTRO_FUNCION_ORIGINAL, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_filtro_funcion";
    public static final String COLUMNA_VERSION_RECURSO = "version_filtro_funcion";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_filtro_funcion";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_filtro_funcion";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";

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
    public String getColumnaPropietarioRecurso() {
        return COLUMNA_PROPIETARIO_RECURSO;
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
    public String getEtiquetaPropietarioRecurso() {
        return ETIQUETA_PROPIETARIO_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdFiltroFuncion();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFiltroFuncion(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFiltroFuncion(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFiltroFuncion(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFiltroFuncion();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFiltroFuncion(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFiltroFuncion(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFiltroFuncion(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoFiltroFuncion();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoFiltroFuncion(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoFiltroFuncion(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoFiltroFuncion(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreFiltroFuncion();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreFiltroFuncion(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreFiltroFuncion(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreFiltroFuncion(rowKey, nombreRecurso);
    }

    @Override
    public Long getPropietarioRecurso() {
        return this.getIdUsuario();
    }
    @Override
    public Long getPropietarioRecurso(RowKey rowKey) {
        return this.getIdUsuario(rowKey);
    }
    @Override
    public void setPropietarioRecurso(Long propietarioRecurso) {
        this.setIdUsuario(propietarioRecurso);
    }
    @Override
    public void setPropietarioRecurso(RowKey rowKey, Long propietarioRecurso) {
        this.setIdUsuario(rowKey, propietarioRecurso);
    }
}
