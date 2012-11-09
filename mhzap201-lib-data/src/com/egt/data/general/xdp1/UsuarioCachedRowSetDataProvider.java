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
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class UsuarioCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoPersonalizableDataProvider, RecursoDesactivableDataProvider {

    public UsuarioCachedRowSetDataProvider() {
        super();
    }

    public UsuarioCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "usuario";
    public static final String NOMBRE_DOMINIO_RECURSO = "Usuarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_usuario_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "usuario";

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

    public static final String COLUMNA_ID_USUARIO = "id_usuario";
    public static final String COLUMNA_VERSION_USUARIO = "version_usuario";
    public static final String COLUMNA_CODIGO_USUARIO = "codigo_usuario";
    public static final String COLUMNA_NOMBRE_USUARIO = "nombre_usuario";
    public static final String COLUMNA_PASSWORD_USUARIO = "password_usuario";
    public static final String COLUMNA_CORREO_ELECTRONICO = "correo_electronico";
    public static final String COLUMNA_ID_USUARIO_SUPERVISOR = "id_usuario_supervisor";
    public static final String COLUMNA_ES_SUPER_USUARIO = "es_super_usuario";
    public static final String COLUMNA_ES_USUARIO_ESPECIAL = "es_usuario_especial";
    public static final String COLUMNA_ES_USUARIO_INACTIVO = "es_usuario_inactivo";
    public static final String COLUMNA_ES_USUARIO_MODIFICADO = "es_usuario_modificado";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_USUARIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PASSWORD_USUARIO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CORREO_ELECTRONICO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO_SUPERVISOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_SUPER_USUARIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_USUARIO_ESPECIAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_USUARIO_INACTIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_USUARIO_MODIFICADO, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_VERSION_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_PASSWORD_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_CORREO_ELECTRONICO, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO_SUPERVISOR, true);
        this.setColumnasInsertables(COLUMNA_ES_SUPER_USUARIO, true);
        this.setColumnasInsertables(COLUMNA_ES_USUARIO_ESPECIAL, true);
        this.setColumnasInsertables(COLUMNA_ES_USUARIO_INACTIVO, true);
        this.setColumnasInsertables(COLUMNA_ES_USUARIO_MODIFICADO, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_USUARIO, true);
        this.setColumnasModificables(COLUMNA_VERSION_USUARIO, true);
        this.setColumnasModificables(COLUMNA_CODIGO_USUARIO, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_USUARIO, true);
        this.setColumnasModificables(COLUMNA_PASSWORD_USUARIO, true);
        this.setColumnasModificables(COLUMNA_CORREO_ELECTRONICO, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO_SUPERVISOR, true);
        this.setColumnasModificables(COLUMNA_ES_SUPER_USUARIO, true);
        this.setColumnasModificables(COLUMNA_ES_USUARIO_ESPECIAL, true);
        this.setColumnasModificables(COLUMNA_ES_USUARIO_INACTIVO, true);
        this.setColumnasModificables(COLUMNA_ES_USUARIO_MODIFICADO, true);
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

    public Long getVersionUsuario() {
        return (Long) super.getValue(COLUMNA_VERSION_USUARIO);
    }
    public Long getVersionUsuario(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_USUARIO, rowKey);
    }
    public void setVersionUsuario(Long valor) {
        super.setValue(COLUMNA_VERSION_USUARIO, valor);
    }
    public void setVersionUsuario(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_USUARIO, rowKey, valor);
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

    public String getPasswordUsuario() {
        return (String) super.getValue(COLUMNA_PASSWORD_USUARIO);
    }
    public String getPasswordUsuario(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PASSWORD_USUARIO, rowKey);
    }
    public void setPasswordUsuario(String valor) {
        super.setValue(COLUMNA_PASSWORD_USUARIO, valor);
    }
    public void setPasswordUsuario(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PASSWORD_USUARIO, rowKey, valor);
    }

    public String getCorreoElectronico() {
        return (String) super.getValue(COLUMNA_CORREO_ELECTRONICO);
    }
    public String getCorreoElectronico(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CORREO_ELECTRONICO, rowKey);
    }
    public void setCorreoElectronico(String valor) {
        super.setValue(COLUMNA_CORREO_ELECTRONICO, valor);
    }
    public void setCorreoElectronico(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CORREO_ELECTRONICO, rowKey, valor);
    }

    public Long getIdUsuarioSupervisor() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_SUPERVISOR);
    }
    public Long getIdUsuarioSupervisor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_SUPERVISOR, rowKey);
    }
    public void setIdUsuarioSupervisor(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_SUPERVISOR, valor);
    }
    public void setIdUsuarioSupervisor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_SUPERVISOR, rowKey, valor);
    }

    public Integer getEsSuperUsuario() {
        return (Integer) super.getValue(COLUMNA_ES_SUPER_USUARIO);
    }
    public Integer getEsSuperUsuario(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_SUPER_USUARIO, rowKey);
    }
    public void setEsSuperUsuario(Integer valor) {
        super.setValue(COLUMNA_ES_SUPER_USUARIO, valor);
    }
    public void setEsSuperUsuario(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_SUPER_USUARIO, rowKey, valor);
    }

    public Integer getEsUsuarioEspecial() {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_ESPECIAL);
    }
    public Integer getEsUsuarioEspecial(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_ESPECIAL, rowKey);
    }
    public void setEsUsuarioEspecial(Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_ESPECIAL, valor);
    }
    public void setEsUsuarioEspecial(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_ESPECIAL, rowKey, valor);
    }

    public Integer getEsUsuarioInactivo() {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_INACTIVO);
    }
    public Integer getEsUsuarioInactivo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_INACTIVO, rowKey);
    }
    public void setEsUsuarioInactivo(Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_INACTIVO, valor);
    }
    public void setEsUsuarioInactivo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_INACTIVO, rowKey, valor);
    }

    public Integer getEsUsuarioModificado() {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_MODIFICADO);
    }
    public Integer getEsUsuarioModificado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_USUARIO_MODIFICADO, rowKey);
    }
    public void setEsUsuarioModificado(Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_MODIFICADO, valor);
    }
    public void setEsUsuarioModificado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_USUARIO_MODIFICADO, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_usuario";
    public static final String COLUMNA_VERSION_RECURSO = "version_usuario";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_usuario";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_usuario";
    public static final String COLUMNA_PROPIETARIO_RECURSO = "id_usuario";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_usuario_inactivo";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_PROPIETARIO_RECURSO = "Usuario";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Usuario Inactivo";

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
    public String getColumnaEsRecursoInactivo() {
        return COLUMNA_ES_RECURSO_INACTIVO;
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
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdUsuario();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdUsuario(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdUsuario(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdUsuario(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionUsuario();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionUsuario(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionUsuario(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionUsuario(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoUsuario();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoUsuario(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoUsuario(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoUsuario(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreUsuario();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreUsuario(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreUsuario(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreUsuario(rowKey, nombreRecurso);
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

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsUsuarioInactivo();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsUsuarioInactivo(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsUsuarioInactivo(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsUsuarioInactivo(rowKey, esRecursoInactivo);
    }
}
