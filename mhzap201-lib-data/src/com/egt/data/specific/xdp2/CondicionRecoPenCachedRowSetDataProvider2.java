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
import com.egt.data.specific.xdp1.CondicionRecoPenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CondicionRecoPenCachedRowSetDataProvider2 extends CondicionRecoPenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CondicionRecoPenCachedRowSetDataProvider2() {
        super();
    }

    public CondicionRecoPenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311400101L;

    public static final long FUNCION_CONSULTAR_CONDICION_RECO_PEN = 311400101L;
    public static final long FUNCION_CREAR_CONDICION_RECO_PEN = 311400102L;
    public static final long FUNCION_MODIFICAR_CONDICION_RECO_PEN = 311400103L;
    public static final long FUNCION_ELIMINAR_CONDICION_RECO_PEN = 311400104L;

    protected static final long PARAMETRO_NUMERO_CONDICION_RECO_PEN = 20170L;
    protected static final long PARAMETRO_CODIGO_CONDICION_RECO_PEN = 20136L;

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
        if (funcion == FUNCION_CONSULTAR_CONDICION_RECO_PEN) {
            this.consultarCondicionRecoPen(filtro);
            return;
        }
    }

    public void consultarCondicionRecoPen() throws ExcepcionAplicacion {
        this.consultarCondicionRecoPen(new FiltroBusqueda());
    }

    public void consultarCondicionRecoPen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCondicionRecoPen(new FiltroBusqueda());
        } else {
            this.consultarCondicionRecoPen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCondicionRecoPen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONDICION_RECO_PEN);
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
                comando += clausula + " numero_condicion_reco_pen ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCondicionRecoPen() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONDICION_RECO_PEN);
    }

    public void modificarCondicionRecoPen(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONDICION_RECO_PEN);
    }

    public void modificarCondicionRecoPen(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONDICION_RECO_PEN);
    }

    public void eliminarCondicionRecoPen(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONDICION_RECO_PEN);
    }

    public void eliminarCondicionRecoPen(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONDICION_RECO_PEN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONDICION_RECO_PEN) {
            this.posCrearCondicionRecoPen(rowKey);
            return;
        }
    }

    protected void posCrearCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECO_PEN) {
            es = this.esFilaModificableConModificarCondicionRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCondicionRecoPen(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONDICION_RECO_PEN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECO_PEN) {
            this.posModificarCondicionRecoPen(rowKey);
            return;
        }
    }

    protected void posModificarCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECO_PEN) {
            es = this.esFilaEliminableConEliminarCondicionRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCondicionRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECO_PEN) {
            this.preEliminarCondicionRecoPen(rowKey);
            return;
        }
    }

    protected void preEliminarCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECO_PEN) {
            this.posEliminarCondicionRecoPen(rowKey);
            return;
        }
    }

    protected void posEliminarCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONDICION_RECO_PEN) {
            es = this.esFilaValidaParaCrearCondicionRecoPen(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECO_PEN) {
            es = this.esFilaValidaParaModificarCondicionRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCondicionRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCondicionRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CONDICION_RECO_PEN) {
            this.preCommitCrearCondicionRecoPen(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_RECO_PEN) {
            this.preCommitModificarCondicionRecoPen(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONDICION_RECO_PEN) {
            this.preCommitEliminarCondicionRecoPen(rowKey);
            return;
        }
    }

    protected void preCommitCrearCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONDICION_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECO_PEN, this.getNumeroCondicionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_RECO_PEN, this.getCodigoCondicionRecoPen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONDICION_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECO_PEN, this.getNumeroCondicionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_RECO_PEN, this.getCodigoCondicionRecoPen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCondicionRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONDICION_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECO_PEN, this.getNumeroCondicionRecoPen(rowKey));
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
