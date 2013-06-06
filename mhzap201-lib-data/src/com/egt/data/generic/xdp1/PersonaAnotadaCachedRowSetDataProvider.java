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
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoPersonalizableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class PersonaAnotadaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoPersonalizableDataProvider {

    public PersonaAnotadaCachedRowSetDataProvider() {
        super();
    }

    public PersonaAnotadaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "persona_anotada";
    public static final String NOMBRE_DOMINIO_RECURSO = "Personas anotadas";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_persona_anotada_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "persona_anotada";

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

    public static final String COLUMNA_ID_PERSONA_ANOTADA = "id_persona_anotada";
    public static final String COLUMNA_VERSION_PERSONA_ANOTADA = "version_persona_anotada";
    public static final String COLUMNA_ID_PERSONA = "id_persona";
    public static final String COLUMNA_CODIGO_PERSONA = "codigo_persona";
    public static final String COLUMNA_NOMBRE_PERSONA = "nombre_persona";
    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_CODIGO_USUARIO = "codigo_usuario";
    public static final String COLUMNA_NOMBRE_USUARIO = "nombre_usuario";
    public static final String COLUMNA_FECHA_HORA_SELECCION = "fecha_hora_seleccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA_ANOTADA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PERSONA_ANOTADA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_SELECCION, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA_ANOTADA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PERSONA_ANOTADA, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_SELECCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PERSONA_ANOTADA, true);
        this.setColumnasModificables(COLUMNA_VERSION_PERSONA_ANOTADA, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_USUARIO, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_SELECCION, true);
    }

    public Long getIdPersonaAnotada() {
        return (Long) super.getValue(COLUMNA_ID_PERSONA_ANOTADA);
    }
    public Long getIdPersonaAnotada(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PERSONA_ANOTADA, rowKey);
    }
    public void setIdPersonaAnotada(Long valor) {
        super.setValue(COLUMNA_ID_PERSONA_ANOTADA, valor);
    }
    public void setIdPersonaAnotada(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PERSONA_ANOTADA, rowKey, valor);
    }

    public Long getVersionPersonaAnotada() {
        return (Long) super.getValue(COLUMNA_VERSION_PERSONA_ANOTADA);
    }
    public Long getVersionPersonaAnotada(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PERSONA_ANOTADA, rowKey);
    }
    public void setVersionPersonaAnotada(Long valor) {
        super.setValue(COLUMNA_VERSION_PERSONA_ANOTADA, valor);
    }
    public void setVersionPersonaAnotada(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PERSONA_ANOTADA, rowKey, valor);
    }

    public Long getIdPersona() {
        return (Long) super.getValue(COLUMNA_ID_PERSONA);
    }
    public Long getIdPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PERSONA, rowKey);
    }
    public void setIdPersona(Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, valor);
    }
    public void setIdPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, rowKey, valor);
    }

    public String getCodigoPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA);
    }
    public String getCodigoPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA, rowKey);
    }
    public void setCodigoPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, valor);
    }
    public void setCodigoPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, rowKey, valor);
    }

    public String getNombrePersona() {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA);
    }
    public String getNombrePersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA, rowKey);
    }
    public void setNombrePersona(String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, valor);
    }
    public void setNombrePersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, rowKey, valor);
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

    public String getCodigoUsuario() {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO);
    }
    public String getCodigoUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_USUARIO, rowKey);
    }
    public void setCodigoUsuario(String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, valor);
    }
    public void setCodigoUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_USUARIO, rowKey, valor);
    }

    public String getNombreUsuario() {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO);
    }
    public String getNombreUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_USUARIO, rowKey);
    }
    public void setNombreUsuario(String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, valor);
    }
    public void setNombreUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_USUARIO, rowKey, valor);
    }

    public Timestamp getFechaHoraSeleccion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_SELECCION);
    }
    public Timestamp getFechaHoraSeleccion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_SELECCION, rowKey);
    }
    public void setFechaHoraSeleccion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_SELECCION, valor);
    }
    public void setFechaHoraSeleccion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_SELECCION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_persona_anotada";
    public static final String COLUMNA_VERSION_RECURSO = "version_persona_anotada";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
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
    public String getEtiquetaPropietarioRecurso() {
        return ETIQUETA_PROPIETARIO_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdPersonaAnotada();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPersonaAnotada(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPersonaAnotada(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPersonaAnotada(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPersonaAnotada();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPersonaAnotada(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPersonaAnotada(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPersonaAnotada(rowKey, versionRecurso);
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
