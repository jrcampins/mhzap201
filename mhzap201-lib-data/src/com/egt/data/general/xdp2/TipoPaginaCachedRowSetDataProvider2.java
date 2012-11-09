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
import com.egt.data.general.xdp1.TipoPaginaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoPaginaCachedRowSetDataProvider2 extends TipoPaginaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoPaginaCachedRowSetDataProvider2() {
        super();
    }

    public TipoPaginaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104250101L;

    public static final long FUNCION_CONSULTAR_TIPO_PAGINA = 104250101L;
    public static final long FUNCION_CREAR_TIPO_PAGINA = 104250102L;
    public static final long FUNCION_MODIFICAR_TIPO_PAGINA = 104250103L;
    public static final long FUNCION_ELIMINAR_TIPO_PAGINA = 104250104L;

    protected static final long PARAMETRO_NUMERO_TIPO_PAGINA = 1826L;
    protected static final long PARAMETRO_CODIGO_TIPO_PAGINA = 1827L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_PAGINA) {
            this.consultarTipoPagina(filtro);
            return;
        }
    }

    public void consultarTipoPagina() throws ExcepcionAplicacion {
        this.consultarTipoPagina(new FiltroBusqueda());
    }

    public void consultarTipoPagina(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoPagina(new FiltroBusqueda());
        } else {
            this.consultarTipoPagina(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoPagina(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_PAGINA);
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
                comando += clausula + " numero_tipo_pagina ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoPagina() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_PAGINA);
    }

    public void modificarTipoPagina(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_PAGINA);
    }

    public void modificarTipoPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_PAGINA);
    }

    public void eliminarTipoPagina(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_PAGINA);
    }

    public void eliminarTipoPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_PAGINA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_PAGINA) {
            this.posCrearTipoPagina(rowKey);
            return;
        }
    }

    protected void posCrearTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_PAGINA) {
            es = this.esFilaModificableConModificarTipoPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoPagina(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_PAGINA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_PAGINA) {
            this.posModificarTipoPagina(rowKey);
            return;
        }
    }

    protected void posModificarTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_PAGINA) {
            es = this.esFilaEliminableConEliminarTipoPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoPagina(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PAGINA) {
            this.preEliminarTipoPagina(rowKey);
            return;
        }
    }

    protected void preEliminarTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PAGINA) {
            this.posEliminarTipoPagina(rowKey);
            return;
        }
    }

    protected void posEliminarTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_PAGINA) {
            es = this.esFilaValidaParaCrearTipoPagina(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PAGINA) {
            es = this.esFilaValidaParaModificarTipoPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoPagina(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoPagina(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_PAGINA) {
            this.preCommitCrearTipoPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PAGINA) {
            this.preCommitModificarTipoPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_PAGINA) {
            this.preCommitEliminarTipoPagina(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_PAGINA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PAGINA, this.getNumeroTipoPagina(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PAGINA, this.getCodigoTipoPagina(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_PAGINA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PAGINA, this.getNumeroTipoPagina(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PAGINA, this.getCodigoTipoPagina(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_PAGINA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PAGINA, this.getNumeroTipoPagina(rowKey));
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
