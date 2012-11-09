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
import com.egt.data.general.xdp1.CondicionEjeFunCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CondicionEjeFunCachedRowSetDataProvider2 extends CondicionEjeFunCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CondicionEjeFunCachedRowSetDataProvider2() {
        super();
    }

    public CondicionEjeFunCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 107800101L;

    public static final long FUNCION_CONSULTAR_CONDICION_EJE_FUN = 107800101L;
    public static final long FUNCION_CREAR_CONDICION_EJE_FUN = 107800102L;
    public static final long FUNCION_MODIFICAR_CONDICION_EJE_FUN = 107800103L;
    public static final long FUNCION_ELIMINAR_CONDICION_EJE_FUN = 107800104L;

    protected static final long PARAMETRO_NUMERO_CONDICION_EJE_FUN = 1473L;
    protected static final long PARAMETRO_CODIGO_CONDICION_EJE_FUN = 1062L;

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
        if (funcion == FUNCION_CONSULTAR_CONDICION_EJE_FUN) {
            this.consultarCondicionEjeFun(filtro);
            return;
        }
    }

    public void consultarCondicionEjeFun() throws ExcepcionAplicacion {
        this.consultarCondicionEjeFun(new FiltroBusqueda());
    }

    public void consultarCondicionEjeFun(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCondicionEjeFun(new FiltroBusqueda());
        } else {
            this.consultarCondicionEjeFun(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCondicionEjeFun(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONDICION_EJE_FUN);
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
                comando += clausula + " numero_condicion_eje_fun ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCondicionEjeFun() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONDICION_EJE_FUN);
    }

    public void modificarCondicionEjeFun(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONDICION_EJE_FUN);
    }

    public void modificarCondicionEjeFun(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONDICION_EJE_FUN);
    }

    public void eliminarCondicionEjeFun(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONDICION_EJE_FUN);
    }

    public void eliminarCondicionEjeFun(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONDICION_EJE_FUN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONDICION_EJE_FUN) {
            this.posCrearCondicionEjeFun(rowKey);
            return;
        }
    }

    protected void posCrearCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONDICION_EJE_FUN) {
            es = this.esFilaModificableConModificarCondicionEjeFun(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCondicionEjeFun(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONDICION_EJE_FUN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONDICION_EJE_FUN) {
            this.posModificarCondicionEjeFun(rowKey);
            return;
        }
    }

    protected void posModificarCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONDICION_EJE_FUN) {
            es = this.esFilaEliminableConEliminarCondicionEjeFun(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCondicionEjeFun(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_EJE_FUN) {
            this.preEliminarCondicionEjeFun(rowKey);
            return;
        }
    }

    protected void preEliminarCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_EJE_FUN) {
            this.posEliminarCondicionEjeFun(rowKey);
            return;
        }
    }

    protected void posEliminarCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONDICION_EJE_FUN) {
            es = this.esFilaValidaParaCrearCondicionEjeFun(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_EJE_FUN) {
            es = this.esFilaValidaParaModificarCondicionEjeFun(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCondicionEjeFun(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCondicionEjeFun(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CONDICION_EJE_FUN) {
            this.preCommitCrearCondicionEjeFun(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_EJE_FUN) {
            this.preCommitModificarCondicionEjeFun(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONDICION_EJE_FUN) {
            this.preCommitEliminarCondicionEjeFun(rowKey);
            return;
        }
    }

    protected void preCommitCrearCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONDICION_EJE_FUN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_EJE_FUN, this.getNumeroCondicionEjeFun(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_EJE_FUN, this.getCodigoCondicionEjeFun(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONDICION_EJE_FUN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_EJE_FUN, this.getNumeroCondicionEjeFun(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_EJE_FUN, this.getCodigoCondicionEjeFun(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCondicionEjeFun(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONDICION_EJE_FUN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_EJE_FUN, this.getNumeroCondicionEjeFun(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
    }
}
