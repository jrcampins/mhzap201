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
import com.egt.data.general.xdp1.RolUsuarioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RolUsuarioCachedRowSetDataProvider2 extends RolUsuarioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RolUsuarioCachedRowSetDataProvider2() {
        super();
    }

    public RolUsuarioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106700101L;

    public static final long FUNCION_CONSULTAR_ROL_USUARIO = 106700101L;
    public static final long FUNCION_CREAR_ROL_USUARIO = 106700102L;
    public static final long FUNCION_MODIFICAR_ROL_USUARIO = 106700103L;
    public static final long FUNCION_ELIMINAR_ROL_USUARIO = 106700104L;

    protected static final long PARAMETRO_ID_ROL_USUARIO = 1373L;
    protected static final long PARAMETRO_VERSION_ROL_USUARIO = 1591L;
    protected static final long PARAMETRO_ID_ROL = 1370L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ROL = {"rol", "id_rol", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_ROL_USUARIO) {
            this.consultarRolUsuario(filtro);
            return;
        }
    }

    public void consultarRolUsuario() throws ExcepcionAplicacion {
        this.consultarRolUsuario(new FiltroBusqueda());
    }

    public void consultarRolUsuario(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRolUsuario(new FiltroBusqueda());
        } else {
            this.consultarRolUsuario(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRolUsuario(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ROL_USUARIO);
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
                comando += clausula + " id_rol_usuario ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearRolUsuario() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ROL_USUARIO);
    }

    public void modificarRolUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ROL_USUARIO);
    }

    public void modificarRolUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ROL_USUARIO);
    }

    public void eliminarRolUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ROL_USUARIO);
    }

    public void eliminarRolUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ROL_USUARIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ROL_USUARIO) {
            this.posCrearRolUsuario(rowKey);
            return;
        }
    }

    protected void posCrearRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ROL_USUARIO) {
            es = this.esFilaModificableConModificarRolUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarRolUsuario(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ROL_USUARIO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ROL_USUARIO) {
            this.posModificarRolUsuario(rowKey);
            return;
        }
    }

    protected void posModificarRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ROL_USUARIO) {
            es = this.esFilaEliminableConEliminarRolUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarRolUsuario(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_USUARIO) {
            this.preEliminarRolUsuario(rowKey);
            return;
        }
    }

    protected void preEliminarRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_USUARIO) {
            this.posEliminarRolUsuario(rowKey);
            return;
        }
    }

    protected void posEliminarRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ROL_USUARIO) {
            es = this.esFilaValidaParaCrearRolUsuario(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_USUARIO) {
            es = this.esFilaValidaParaModificarRolUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearRolUsuario(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ROL)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdRol(rowKey), FUNCION_REFERENCIA_CONSULTAR_ROL, STRINGS_REFERENCIA_CONSULTAR_ROL);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ROL + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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

    protected boolean esFilaValidaParaModificarRolUsuario(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ROL)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdRol(rowKey), FUNCION_REFERENCIA_CONSULTAR_ROL, STRINGS_REFERENCIA_CONSULTAR_ROL);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ROL + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_ROL_USUARIO) {
            this.preCommitCrearRolUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_USUARIO) {
            this.preCommitModificarRolUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ROL_USUARIO) {
            this.preCommitEliminarRolUsuario(rowKey);
            return;
        }
    }

    protected void preCommitCrearRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ROL_USUARIO);
        rastro.addParametro(PARAMETRO_ID_ROL_USUARIO, this.getIdRolUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_USUARIO, this.getVersionRolUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ROL_USUARIO);
        rastro.addParametro(PARAMETRO_ID_ROL_USUARIO, this.getIdRolUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_USUARIO, this.getVersionRolUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarRolUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ROL_USUARIO);
        rastro.addParametro(PARAMETRO_ID_ROL_USUARIO, this.getIdRolUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionRolUsuario(rowKey, 0L);
    }
}
