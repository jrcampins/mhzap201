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
package com.egt.data.specific.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.CondicionReclCenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CondicionReclCenCachedRowSetDataProvider2 extends CondicionReclCenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CondicionReclCenCachedRowSetDataProvider2() {
        super();
    }

    public CondicionReclCenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 324200101L;

    public static final long FUNCION_CONSULTAR_CONDICION_RECL_CEN = 324200101L;
    public static final long FUNCION_CREAR_CONDICION_RECL_CEN = 324200102L;
    public static final long FUNCION_MODIFICAR_CONDICION_RECL_CEN = 324200103L;
    public static final long FUNCION_ELIMINAR_CONDICION_RECL_CEN = 324200104L;

    protected static final long PARAMETRO_NUMERO_CONDICION_RECL_CEN = 20644L;
    protected static final long PARAMETRO_CODIGO_CONDICION_RECL_CEN = 20627L;

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
        if (funcion == FUNCION_CONSULTAR_CONDICION_RECL_CEN) {
            this.consultarCondicionReclCen(filtro);
            return;
        }
    }

    public void consultarCondicionReclCen() throws ExcepcionAplicacion {
        this.consultarCondicionReclCen(new FiltroBusqueda());
    }

    public void consultarCondicionReclCen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCondicionReclCen(new FiltroBusqueda());
        } else {
            this.consultarCondicionReclCen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCondicionReclCen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONDICION_RECL_CEN);
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
                comando += clausula + " numero_condicion_recl_cen ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCondicionReclCen() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONDICION_RECL_CEN);
    }

    public void modificarCondicionReclCen(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONDICION_RECL_CEN);
    }

    public void modificarCondicionReclCen(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONDICION_RECL_CEN);
    }

    public void eliminarCondicionReclCen(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONDICION_RECL_CEN);
    }

    public void eliminarCondicionReclCen(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONDICION_RECL_CEN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONDICION_RECL_CEN) {
            this.posCrearCondicionReclCen(rowKey);
            return;
        }
    }

    protected void posCrearCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECL_CEN) {
            es = this.esFilaModificableConModificarCondicionReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCondicionReclCen(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONDICION_RECL_CEN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECL_CEN) {
            this.posModificarCondicionReclCen(rowKey);
            return;
        }
    }

    protected void posModificarCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECL_CEN) {
            es = this.esFilaEliminableConEliminarCondicionReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCondicionReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECL_CEN) {
            this.preEliminarCondicionReclCen(rowKey);
            return;
        }
    }

    protected void preEliminarCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECL_CEN) {
            this.posEliminarCondicionReclCen(rowKey);
            return;
        }
    }

    protected void posEliminarCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONDICION_RECL_CEN) {
            es = this.esFilaValidaParaCrearCondicionReclCen(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECL_CEN) {
            es = this.esFilaValidaParaModificarCondicionReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCondicionReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCondicionReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CONDICION_RECL_CEN) {
            this.preCommitCrearCondicionReclCen(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECL_CEN) {
            this.preCommitModificarCondicionReclCen(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECL_CEN) {
            this.preCommitEliminarCondicionReclCen(rowKey);
            return;
        }
    }

    protected void preCommitCrearCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONDICION_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECL_CEN, this.getNumeroCondicionReclCen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_RECL_CEN, this.getCodigoCondicionReclCen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONDICION_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECL_CEN, this.getNumeroCondicionReclCen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_RECL_CEN, this.getCodigoCondicionReclCen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCondicionReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONDICION_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECL_CEN, this.getNumeroCondicionReclCen(rowKey));
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
