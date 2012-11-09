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
import com.egt.data.general.xdp1.TipoNodoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoNodoCachedRowSetDataProvider2 extends TipoNodoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoNodoCachedRowSetDataProvider2() {
        super();
    }

    public TipoNodoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 100300101L;

    public static final long FUNCION_CONSULTAR_TIPO_NODO = 100300101L;
    public static final long FUNCION_CREAR_TIPO_NODO = 100300102L;
    public static final long FUNCION_MODIFICAR_TIPO_NODO = 100300103L;
    public static final long FUNCION_ELIMINAR_TIPO_NODO = 100300104L;

    protected static final long PARAMETRO_NUMERO_TIPO_NODO = 1495L;
    protected static final long PARAMETRO_CODIGO_TIPO_NODO = 1198L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_NODO) {
            this.consultarTipoNodo(filtro);
            return;
        }
    }

    public void consultarTipoNodo() throws ExcepcionAplicacion {
        this.consultarTipoNodo(new FiltroBusqueda());
    }

    public void consultarTipoNodo(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoNodo(new FiltroBusqueda());
        } else {
            this.consultarTipoNodo(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoNodo(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_NODO);
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
                comando += clausula + " numero_tipo_nodo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoNodo() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_NODO);
    }

    public void modificarTipoNodo(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_NODO);
    }

    public void modificarTipoNodo(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_NODO);
    }

    public void eliminarTipoNodo(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_NODO);
    }

    public void eliminarTipoNodo(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_NODO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_NODO) {
            this.posCrearTipoNodo(rowKey);
            return;
        }
    }

    protected void posCrearTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_NODO) {
            es = this.esFilaModificableConModificarTipoNodo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoNodo(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_NODO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_NODO) {
            this.posModificarTipoNodo(rowKey);
            return;
        }
    }

    protected void posModificarTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_NODO) {
            es = this.esFilaEliminableConEliminarTipoNodo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoNodo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_NODO) {
            this.preEliminarTipoNodo(rowKey);
            return;
        }
    }

    protected void preEliminarTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_NODO) {
            this.posEliminarTipoNodo(rowKey);
            return;
        }
    }

    protected void posEliminarTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_NODO) {
            es = this.esFilaValidaParaCrearTipoNodo(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_NODO) {
            es = this.esFilaValidaParaModificarTipoNodo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoNodo(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoNodo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_NODO) {
            this.preCommitCrearTipoNodo(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_NODO) {
            this.preCommitModificarTipoNodo(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_NODO) {
            this.preCommitEliminarTipoNodo(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_NODO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_NODO, this.getCodigoTipoNodo(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_NODO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_NODO, this.getCodigoTipoNodo(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoNodo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_NODO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
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
