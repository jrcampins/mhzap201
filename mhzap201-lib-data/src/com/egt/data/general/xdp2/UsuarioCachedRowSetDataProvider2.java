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
package com.egt.data.general.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.general.xdp1.UsuarioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class UsuarioCachedRowSetDataProvider2 extends UsuarioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public UsuarioCachedRowSetDataProvider2() {
        super();
    }

    public UsuarioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
        if (cachedRowSet != null) {
            this.initCachedRowSet();
        }
    }

    @Override
    public void setCachedRowSet(CachedRowSet cachedRowSet) {
        super.setCachedRowSet(cachedRowSet);
        if (cachedRowSet != null) {
            this.initCachedRowSet();
        }
    }

    private void initCachedRowSet() {
        try {
            if (!this.isInicializado()) {
                this.setInicializado(true);
                this.setComandoCachedRowSet(this.getComandoSelectNothing());
                this.setTablaCachedRowSet(this.getTablaDestino());
                this.setMapaTiposJava();
                this.setColumnasInsertables();
                this.setColumnasModificables();
            }
        } catch (Exception ex) {
            TLC.getBitacora().error(ex);
        }
    }

    @Override
    public void setComandoEmptyCachedRowSet() throws ExcepcionAplicacion {
        this.setComandoEmptyCachedRowSet(this.getComandoSelectNothing());
    }

    public static final long FUNCION_CONSULTAR_RECURSO = 106100101L;

    public static final long FUNCION_DESIGNAR_SUPER_USUARIO = 106100105L;
    public static final long FUNCION_ANULAR_SUPER_USUARIO = 106100106L;
    public static final long FUNCION_DESACTIVAR_USUARIO = 106100107L;
    public static final long FUNCION_REACTIVAR_USUARIO = 106100108L;
    public static final long FUNCION_SINCRONIZAR_USUARIO = 106100109L;
    public static final long FUNCION_ASIGNAR_PASSWORD_USUARIO = 106100113L;
    public static final long FUNCION_ASIGNAR_SUPERVISOR_USUARIO = 106100114L;
    public static final long FUNCION_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_CONSULTAR_PASSWORD = 106100111L;
    public static final long FUNCION_CREAR_USUARIO = 106100102L;
    public static final long FUNCION_MODIFICAR_USUARIO = 106100103L;
    public static final long FUNCION_CAMBIAR_PASSWORD = 106100112L;
    public static final long FUNCION_ELIMINAR_USUARIO = 106100104L;

    public static final String PROCESO_FUNCION_DESIGNAR_SUPER_USUARIO = "usuario_designar_super";
    public static final String PROCESO_FUNCION_ANULAR_SUPER_USUARIO = "usuario_anular_super";
    public static final String PROCESO_FUNCION_DESACTIVAR_USUARIO = "usuario_desactivar";
    public static final String PROCESO_FUNCION_REACTIVAR_USUARIO = "usuario_reactivar";
    public static final String PROCESO_FUNCION_SINCRONIZAR_USUARIO = "usuario_sincronizar";
    public static final String PROCESO_FUNCION_ASIGNAR_PASSWORD_USUARIO = "usuario_asignar_password";
    public static final String PROCESO_FUNCION_ASIGNAR_SUPERVISOR_USUARIO = "usuario_asignar_supervisor";

    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_ES_SUPER_USUARIO = 1281L;
    protected static final long PARAMETRO_ES_USUARIO_INACTIVO = 1284L;
    protected static final long PARAMETRO_ES_USUARIO_MODIFICADO = 1283L;
    protected static final long PARAMETRO_PASSWORD_USUARIO = 1505L;
    protected static final long PARAMETRO_ID_USUARIO_SUPERVISOR = 1985L;
    protected static final long PARAMETRO_VERSION_USUARIO = 1613L;
    protected static final long PARAMETRO_CODIGO_USUARIO = 1207L;
    protected static final long PARAMETRO_NOMBRE_USUARIO = 1471L;
    protected static final long PARAMETRO_CORREO_ELECTRONICO = 1982L;
    protected static final long PARAMETRO_ES_USUARIO_ESPECIAL = 1977L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};

    @Override
    public long getFuncionConsultarRecurso() {
        return FUNCION_CONSULTAR_RECURSO;
    }

    @Override
    public void ejecutarFuncionSelect() throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect());
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso());
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion) throws ExcepcionAplicacion {
        this.ejecutarFuncionSelect(funcion, new FiltroBusqueda());
    }

    @Override
    public void ejecutarFuncionSelect(Long filtro) throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect(), filtro);
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.ejecutarFuncionSelect(funcion, new FiltroBusqueda());
        } else {
            this.ejecutarFuncionSelect(funcion, new FiltroBusqueda(filtro));
        }
    }

    @Override
    public void ejecutarFuncionSelect(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect(), filtro);
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (funcion == FUNCION_CONSULTAR_USUARIO) {
            this.consultarUsuario(filtro);
            return;
        }
        if (funcion == FUNCION_CONSULTAR_PASSWORD) {
            this.consultarPassword(filtro);
            return;
        }
    }

    public void consultarUsuario() throws ExcepcionAplicacion {
        this.consultarUsuario(new FiltroBusqueda());
    }

    public void consultarUsuario(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarUsuario(new FiltroBusqueda());
        } else {
            this.consultarUsuario(new FiltroBusqueda(filtro));
        }
    }

    public void consultarUsuario(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_USUARIO);
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro == null ? null : filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " id_usuario ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public void consultarPassword() throws ExcepcionAplicacion {
        this.consultarPassword(new FiltroBusqueda());
    }

    public void consultarPassword(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPassword(new FiltroBusqueda());
        } else {
            this.consultarPassword(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPassword(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PASSWORD);
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            Long propietario = TLC.getControlador().getPropietarioAutorizado();
            if (propietario != null) {
                filtro.addCriterio(COLUMNA_PROPIETARIO_RECURSO, EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
            }
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " id_usuario ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearUsuario() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_USUARIO);
    }

    public void modificarUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_USUARIO);
    }

    public void modificarUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_USUARIO);
    }

    public void cambiarPassword(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_CAMBIAR_PASSWORD);
    }

    public void cambiarPassword(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_CAMBIAR_PASSWORD);
    }

    public void eliminarUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_USUARIO);
    }

    public void eliminarUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_USUARIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_USUARIO) {
            this.posCrearUsuario(rowKey);
            return;
        }
    }

    protected void posCrearUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_USUARIO) {
            es = this.esFilaModificableConModificarUsuario(rowKey);
            return es;
        }
        if (funcion == FUNCION_CAMBIAR_PASSWORD) {
            es = this.esFilaModificableConCambiarPassword(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarUsuario(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_USUARIO);
        }
        return es;
    }

    protected boolean esFilaModificableConCambiarPassword(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_CAMBIAR_PASSWORD);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_USUARIO) {
            this.posModificarUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_CAMBIAR_PASSWORD) {
            this.posCambiarPassword(rowKey);
            return;
        }
    }

    protected void posModificarUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    protected void posCambiarPassword(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_USUARIO) {
            es = this.esFilaEliminableConEliminarUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarUsuario(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_USUARIO) {
            this.preEliminarUsuario(rowKey);
            return;
        }
    }

    protected void preEliminarUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_USUARIO) {
            this.posEliminarUsuario(rowKey);
            return;
        }
    }

    protected void posEliminarUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_USUARIO) {
            es = this.esFilaValidaParaCrearUsuario(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_USUARIO) {
            es = this.esFilaValidaParaModificarUsuario(rowKey);
            return es;
        }
        if (funcion == FUNCION_CAMBIAR_PASSWORD) {
            es = this.esFilaValidaParaCambiarPassword(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearUsuario(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_SUPERVISOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioSupervisor(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_SUPERVISOR + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    protected boolean esFilaValidaParaModificarUsuario(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_SUPERVISOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioSupervisor(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_SUPERVISOR + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    protected boolean esFilaValidaParaCambiarPassword(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_USUARIO) {
            this.preCommitCrearUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_USUARIO) {
            this.preCommitModificarUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_CAMBIAR_PASSWORD) {
            this.preCommitCambiarPassword(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_USUARIO) {
            this.preCommitEliminarUsuario(rowKey);
            return;
        }
    }

    protected void preCommitCrearUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_USUARIO);
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_USUARIO, this.getVersionUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_USUARIO, this.getCodigoUsuario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_USUARIO, this.getNombreUsuario(rowKey));
        rastro.addParametro(PARAMETRO_PASSWORD_USUARIO, this.getPasswordUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CORREO_ELECTRONICO, this.getCorreoElectronico(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_SUPERVISOR, this.getIdUsuarioSupervisor(rowKey));
        rastro.addParametro(PARAMETRO_ES_SUPER_USUARIO, this.getEsSuperUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_ESPECIAL, this.getEsUsuarioEspecial(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_INACTIVO, this.getEsUsuarioInactivo(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_MODIFICADO, this.getEsUsuarioModificado(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_USUARIO);
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_USUARIO, this.getVersionUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_USUARIO, this.getCodigoUsuario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_USUARIO, this.getNombreUsuario(rowKey));
        rastro.addParametro(PARAMETRO_PASSWORD_USUARIO, this.getPasswordUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CORREO_ELECTRONICO, this.getCorreoElectronico(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_SUPERVISOR, this.getIdUsuarioSupervisor(rowKey));
        rastro.addParametro(PARAMETRO_ES_SUPER_USUARIO, this.getEsSuperUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_ESPECIAL, this.getEsUsuarioEspecial(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_INACTIVO, this.getEsUsuarioInactivo(rowKey));
        rastro.addParametro(PARAMETRO_ES_USUARIO_MODIFICADO, this.getEsUsuarioModificado(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitCambiarPassword(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CAMBIAR_PASSWORD);
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_PASSWORD_USUARIO, this.getPasswordUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_USUARIO);
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        rastro.setNombreRecurso(this.getNombreRecurso(rowKey));
        rastro.setIdPropietarioRecurso(this.getPropietarioRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionUsuario(rowKey, 0L);
        this.setEsSuperUsuario(rowKey, 0);
        this.setEsUsuarioEspecial(rowKey, 0);
        this.setEsUsuarioInactivo(rowKey, 0);
        this.setEsUsuarioModificado(rowKey, 0);
    }
}
