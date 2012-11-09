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
import com.egt.data.general.xdp1.RolFiltroFuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RolFiltroFuncionCachedRowSetDataProvider2 extends RolFiltroFuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RolFiltroFuncionCachedRowSetDataProvider2() {
        super();
    }

    public RolFiltroFuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106800101L;

    public static final long FUNCION_CONSULTAR_ROL_FILTRO_FUNCION = 106800101L;
    public static final long FUNCION_CREAR_ROL_FILTRO_FUNCION = 106800102L;
    public static final long FUNCION_MODIFICAR_ROL_FILTRO_FUNCION = 106800103L;
    public static final long FUNCION_ELIMINAR_ROL_FILTRO_FUNCION = 106800104L;

    protected static final long PARAMETRO_ID_ROL_FILTRO_FUNCION = 1978L;
    protected static final long PARAMETRO_VERSION_ROL_FILTRO_FUNCION = 1980L;
    protected static final long PARAMETRO_ID_ROL = 1370L;
    protected static final long PARAMETRO_ID_FILTRO_FUNCION = 1325L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION = 108100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ROL = {"rol", "id_rol", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION = {"filtro_funcion", "id_filtro_funcion", "id_usuario", ""};

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
        if (funcion == FUNCION_CONSULTAR_ROL_FILTRO_FUNCION) {
            this.consultarRolFiltroFuncion(filtro);
            return;
        }
    }

    public void consultarRolFiltroFuncion() throws ExcepcionAplicacion {
        this.consultarRolFiltroFuncion(new FiltroBusqueda());
    }

    public void consultarRolFiltroFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRolFiltroFuncion(new FiltroBusqueda());
        } else {
            this.consultarRolFiltroFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRolFiltroFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ROL_FILTRO_FUNCION);
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
                comando += clausula + " id_rol_filtro_funcion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearRolFiltroFuncion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ROL_FILTRO_FUNCION);
    }

    public void modificarRolFiltroFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ROL_FILTRO_FUNCION);
    }

    public void modificarRolFiltroFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ROL_FILTRO_FUNCION);
    }

    public void eliminarRolFiltroFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ROL_FILTRO_FUNCION);
    }

    public void eliminarRolFiltroFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ROL_FILTRO_FUNCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ROL_FILTRO_FUNCION) {
            this.posCrearRolFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posCrearRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ROL_FILTRO_FUNCION) {
            es = this.esFilaModificableConModificarRolFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarRolFiltroFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ROL_FILTRO_FUNCION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ROL_FILTRO_FUNCION) {
            this.posModificarRolFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posModificarRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ROL_FILTRO_FUNCION) {
            es = this.esFilaEliminableConEliminarRolFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarRolFiltroFuncion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_FILTRO_FUNCION) {
            this.preEliminarRolFiltroFuncion(rowKey);
            return;
        }
    }

    protected void preEliminarRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_FILTRO_FUNCION) {
            this.posEliminarRolFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posEliminarRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ROL_FILTRO_FUNCION) {
            es = this.esFilaValidaParaCrearRolFiltroFuncion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_FILTRO_FUNCION) {
            es = this.esFilaValidaParaModificarRolFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearRolFiltroFuncion(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FILTRO_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFiltroFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FILTRO_FUNCION + ">");
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

    protected boolean esFilaValidaParaModificarRolFiltroFuncion(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FILTRO_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFiltroFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FILTRO_FUNCION + ">");
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
        if (funcion == FUNCION_CREAR_ROL_FILTRO_FUNCION) {
            this.preCommitCrearRolFiltroFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_FILTRO_FUNCION) {
            this.preCommitModificarRolFiltroFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ROL_FILTRO_FUNCION) {
            this.preCommitEliminarRolFiltroFuncion(rowKey);
            return;
        }
    }

    protected void preCommitCrearRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ROL_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FILTRO_FUNCION, this.getIdRolFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_FILTRO_FUNCION, this.getVersionRolFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ROL_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FILTRO_FUNCION, this.getIdRolFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_FILTRO_FUNCION, this.getVersionRolFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarRolFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ROL_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FILTRO_FUNCION, this.getIdRolFiltroFuncion(rowKey));
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
        this.setVersionRolFiltroFuncion(rowKey, 0L);
    }
}
