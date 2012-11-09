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
import com.egt.data.specific.xdp1.CondicionCensoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CondicionCensoCachedRowSetDataProvider2 extends CondicionCensoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CondicionCensoCachedRowSetDataProvider2() {
        super();
    }

    public CondicionCensoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 324100101L;

    public static final long FUNCION_CONSULTAR_CONDICION_CENSO = 324100101L;
    public static final long FUNCION_CREAR_CONDICION_CENSO = 324100102L;
    public static final long FUNCION_MODIFICAR_CONDICION_CENSO = 324100103L;
    public static final long FUNCION_ELIMINAR_CONDICION_CENSO = 324100104L;

    protected static final long PARAMETRO_NUMERO_CONDICION_CENSO = 20643L;
    protected static final long PARAMETRO_CODIGO_CONDICION_CENSO = 20626L;

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
        if (funcion == FUNCION_CONSULTAR_CONDICION_CENSO) {
            this.consultarCondicionCenso(filtro);
            return;
        }
    }

    public void consultarCondicionCenso() throws ExcepcionAplicacion {
        this.consultarCondicionCenso(new FiltroBusqueda());
    }

    public void consultarCondicionCenso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCondicionCenso(new FiltroBusqueda());
        } else {
            this.consultarCondicionCenso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCondicionCenso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONDICION_CENSO);
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
                comando += clausula + " numero_condicion_censo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCondicionCenso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONDICION_CENSO);
    }

    public void modificarCondicionCenso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONDICION_CENSO);
    }

    public void modificarCondicionCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONDICION_CENSO);
    }

    public void eliminarCondicionCenso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONDICION_CENSO);
    }

    public void eliminarCondicionCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONDICION_CENSO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONDICION_CENSO) {
            this.posCrearCondicionCenso(rowKey);
            return;
        }
    }

    protected void posCrearCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONDICION_CENSO) {
            es = this.esFilaModificableConModificarCondicionCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCondicionCenso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONDICION_CENSO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONDICION_CENSO) {
            this.posModificarCondicionCenso(rowKey);
            return;
        }
    }

    protected void posModificarCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONDICION_CENSO) {
            es = this.esFilaEliminableConEliminarCondicionCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCondicionCenso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_CENSO) {
            this.preEliminarCondicionCenso(rowKey);
            return;
        }
    }

    protected void preEliminarCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_CENSO) {
            this.posEliminarCondicionCenso(rowKey);
            return;
        }
    }

    protected void posEliminarCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONDICION_CENSO) {
            es = this.esFilaValidaParaCrearCondicionCenso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_CENSO) {
            es = this.esFilaValidaParaModificarCondicionCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCondicionCenso(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCondicionCenso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CONDICION_CENSO) {
            this.preCommitCrearCondicionCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_CENSO) {
            this.preCommitModificarCondicionCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONDICION_CENSO) {
            this.preCommitEliminarCondicionCenso(rowKey);
            return;
        }
    }

    protected void preCommitCrearCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONDICION_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_CENSO, this.getNumeroCondicionCenso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_CENSO, this.getCodigoCondicionCenso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONDICION_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_CENSO, this.getNumeroCondicionCenso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_CENSO, this.getCodigoCondicionCenso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCondicionCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONDICION_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_CENSO, this.getNumeroCondicionCenso(rowKey));
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
