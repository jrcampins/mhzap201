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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FuncionarioCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public FuncionarioCachedRowSetDataProvider() {
        super();
    }

    public FuncionarioCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "funcionario";
    public static final String NOMBRE_DOMINIO_RECURSO = "Funcionarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_funcionario_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "funcionario";

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

    public static final String COLUMNA_ID_FUNCIONARIO = "id_funcionario";
    public static final String COLUMNA_VERSION_FUNCIONARIO = "version_funcionario";
    public static final String COLUMNA_CODIGO_FUNCIONARIO = "codigo_funcionario";
    public static final String COLUMNA_NOMBRE_FUNCIONARIO = "nombre_funcionario";
    public static final String COLUMNA_NUMERO_CEDULA = "numero_cedula";
    public static final String COLUMNA_LETRA_CEDULA = "letra_cedula";
    public static final String COLUMNA_PRIMER_NOMBRE = "primer_nombre";
    public static final String COLUMNA_SEGUNDO_NOMBRE = "segundo_nombre";
    public static final String COLUMNA_PRIMER_APELLIDO = "primer_apellido";
    public static final String COLUMNA_SEGUNDO_APELLIDO = "segundo_apellido";
    public static final String COLUMNA_APELLIDO_CASADA = "apellido_casada";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FUNCIONARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FUNCIONARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FUNCIONARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CEDULA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APELLIDO_CASADA, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FUNCIONARIO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FUNCIONARIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FUNCIONARIO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_APELLIDO_CASADA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO, true);
        this.setColumnasModificables(COLUMNA_VERSION_FUNCIONARIO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FUNCIONARIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_FUNCIONARIO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_APELLIDO_CASADA, true);
    }

    public Long getIdFuncionario() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO);
    }
    public Long getIdFuncionario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO, rowKey);
    }
    public void setIdFuncionario(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO, valor);
    }
    public void setIdFuncionario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO, rowKey, valor);
    }

    public Long getVersionFuncionario() {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCIONARIO);
    }
    public Long getVersionFuncionario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FUNCIONARIO, rowKey);
    }
    public void setVersionFuncionario(Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCIONARIO, valor);
    }
    public void setVersionFuncionario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FUNCIONARIO, rowKey, valor);
    }

    public String getCodigoFuncionario() {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCIONARIO);
    }
    public String getCodigoFuncionario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FUNCIONARIO, rowKey);
    }
    public void setCodigoFuncionario(String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCIONARIO, valor);
    }
    public void setCodigoFuncionario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FUNCIONARIO, rowKey, valor);
    }

    public String getNombreFuncionario() {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCIONARIO);
    }
    public String getNombreFuncionario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FUNCIONARIO, rowKey);
    }
    public void setNombreFuncionario(String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCIONARIO, valor);
    }
    public void setNombreFuncionario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FUNCIONARIO, rowKey, valor);
    }

    public Integer getNumeroCedula() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA);
    }
    public Integer getNumeroCedula(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA, rowKey);
    }
    public void setNumeroCedula(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA, valor);
    }
    public void setNumeroCedula(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA, rowKey, valor);
    }

    public String getLetraCedula() {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA);
    }
    public String getLetraCedula(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA, rowKey);
    }
    public void setLetraCedula(String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, valor);
    }
    public void setLetraCedula(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, rowKey, valor);
    }

    public String getPrimerNombre() {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE);
    }
    public String getPrimerNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE, rowKey);
    }
    public void setPrimerNombre(String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, valor);
    }
    public void setPrimerNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, rowKey, valor);
    }

    public String getSegundoNombre() {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE);
    }
    public String getSegundoNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE, rowKey);
    }
    public void setSegundoNombre(String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, valor);
    }
    public void setSegundoNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, rowKey, valor);
    }

    public String getPrimerApellido() {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO);
    }
    public String getPrimerApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO, rowKey);
    }
    public void setPrimerApellido(String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, valor);
    }
    public void setPrimerApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, rowKey, valor);
    }

    public String getSegundoApellido() {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO);
    }
    public String getSegundoApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO, rowKey);
    }
    public void setSegundoApellido(String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, valor);
    }
    public void setSegundoApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, rowKey, valor);
    }

    public String getApellidoCasada() {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA);
    }
    public String getApellidoCasada(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA, rowKey);
    }
    public void setApellidoCasada(String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, valor);
    }
    public void setApellidoCasada(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_funcionario";
    public static final String COLUMNA_VERSION_RECURSO = "version_funcionario";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_funcionario";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_funcionario";

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
        return this.getIdFuncionario();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFuncionario(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFuncionario(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFuncionario(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFuncionario();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFuncionario(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFuncionario(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFuncionario(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoFuncionario();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoFuncionario(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoFuncionario(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoFuncionario(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreFuncionario();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreFuncionario(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreFuncionario(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreFuncionario(rowKey, nombreRecurso);
    }
}
