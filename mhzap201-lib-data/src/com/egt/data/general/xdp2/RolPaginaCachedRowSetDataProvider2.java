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
import com.egt.data.general.xdp1.RolPaginaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RolPaginaCachedRowSetDataProvider2 extends RolPaginaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RolPaginaCachedRowSetDataProvider2() {
        super();
    }

    public RolPaginaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106900101L;

    public static final long FUNCION_CONSULTAR_ROL_PAGINA = 106900101L;
    public static final long FUNCION_CREAR_ROL_PAGINA = 106900102L;
    public static final long FUNCION_MODIFICAR_ROL_PAGINA = 106900103L;
    public static final long FUNCION_ELIMINAR_ROL_PAGINA = 106900104L;

    protected static final long PARAMETRO_ID_ROL_PAGINA = 1979L;
    protected static final long PARAMETRO_VERSION_ROL_PAGINA = 1981L;
    protected static final long PARAMETRO_ID_ROL = 1370L;
    protected static final long PARAMETRO_ID_PAGINA = 1346L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ROL = {"rol", "id_rol", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_ROL_PAGINA) {
            this.consultarRolPagina(filtro);
            return;
        }
    }

    public void consultarRolPagina() throws ExcepcionAplicacion {
        this.consultarRolPagina(new FiltroBusqueda());
    }

    public void consultarRolPagina(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRolPagina(new FiltroBusqueda());
        } else {
            this.consultarRolPagina(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRolPagina(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ROL_PAGINA);
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
                comando += clausula + " id_rol_pagina ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearRolPagina() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ROL_PAGINA);
    }

    public void modificarRolPagina(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ROL_PAGINA);
    }

    public void modificarRolPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ROL_PAGINA);
    }

    public void eliminarRolPagina(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ROL_PAGINA);
    }

    public void eliminarRolPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ROL_PAGINA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ROL_PAGINA) {
            this.posCrearRolPagina(rowKey);
            return;
        }
    }

    protected void posCrearRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ROL_PAGINA) {
            es = this.esFilaModificableConModificarRolPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarRolPagina(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ROL_PAGINA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ROL_PAGINA) {
            this.posModificarRolPagina(rowKey);
            return;
        }
    }

    protected void posModificarRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ROL_PAGINA) {
            es = this.esFilaEliminableConEliminarRolPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarRolPagina(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_PAGINA) {
            this.preEliminarRolPagina(rowKey);
            return;
        }
    }

    protected void preEliminarRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_PAGINA) {
            this.posEliminarRolPagina(rowKey);
            return;
        }
    }

    protected void posEliminarRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ROL_PAGINA) {
            es = this.esFilaValidaParaCrearRolPagina(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_PAGINA) {
            es = this.esFilaValidaParaModificarRolPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearRolPagina(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
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

    protected boolean esFilaValidaParaModificarRolPagina(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
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
        if (funcion == FUNCION_CREAR_ROL_PAGINA) {
            this.preCommitCrearRolPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_PAGINA) {
            this.preCommitModificarRolPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ROL_PAGINA) {
            this.preCommitEliminarRolPagina(rowKey);
            return;
        }
    }

    protected void preCommitCrearRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ROL_PAGINA);
        rastro.addParametro(PARAMETRO_ID_ROL_PAGINA, this.getIdRolPagina(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_PAGINA, this.getVersionRolPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ROL_PAGINA);
        rastro.addParametro(PARAMETRO_ID_ROL_PAGINA, this.getIdRolPagina(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_PAGINA, this.getVersionRolPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarRolPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ROL_PAGINA);
        rastro.addParametro(PARAMETRO_ID_ROL_PAGINA, this.getIdRolPagina(rowKey));
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
        this.setVersionRolPagina(rowKey, 0L);
    }
}
