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
package com.egt.data.generic.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.EstadoCivilCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class EstadoCivilCachedRowSetDataProvider2 extends EstadoCivilCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public EstadoCivilCachedRowSetDataProvider2() {
        super();
    }

    public EstadoCivilCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 201100101L;

    public static final long FUNCION_CONSULTAR_ESTADO_CIVIL = 201100101L;
    public static final long FUNCION_CREAR_ESTADO_CIVIL = 201100102L;
    public static final long FUNCION_MODIFICAR_ESTADO_CIVIL = 201100103L;
    public static final long FUNCION_ELIMINAR_ESTADO_CIVIL = 201100104L;

    protected static final long PARAMETRO_NUMERO_ESTADO_CIVIL = 20171L;
    protected static final long PARAMETRO_CODIGO_ESTADO_CIVIL = 20137L;

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
        if (funcion == FUNCION_CONSULTAR_ESTADO_CIVIL) {
            this.consultarEstadoCivil(filtro);
            return;
        }
    }

    public void consultarEstadoCivil() throws ExcepcionAplicacion {
        this.consultarEstadoCivil(new FiltroBusqueda());
    }

    public void consultarEstadoCivil(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarEstadoCivil(new FiltroBusqueda());
        } else {
            this.consultarEstadoCivil(new FiltroBusqueda(filtro));
        }
    }

    public void consultarEstadoCivil(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ESTADO_CIVIL);
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
                comando += clausula + " numero_estado_civil ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearEstadoCivil() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ESTADO_CIVIL);
    }

    public void modificarEstadoCivil(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ESTADO_CIVIL);
    }

    public void modificarEstadoCivil(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ESTADO_CIVIL);
    }

    public void eliminarEstadoCivil(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ESTADO_CIVIL);
    }

    public void eliminarEstadoCivil(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ESTADO_CIVIL);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ESTADO_CIVIL) {
            this.posCrearEstadoCivil(rowKey);
            return;
        }
    }

    protected void posCrearEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ESTADO_CIVIL) {
            es = this.esFilaModificableConModificarEstadoCivil(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarEstadoCivil(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ESTADO_CIVIL);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ESTADO_CIVIL) {
            this.posModificarEstadoCivil(rowKey);
            return;
        }
    }

    protected void posModificarEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ESTADO_CIVIL) {
            es = this.esFilaEliminableConEliminarEstadoCivil(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarEstadoCivil(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ESTADO_CIVIL) {
            this.preEliminarEstadoCivil(rowKey);
            return;
        }
    }

    protected void preEliminarEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ESTADO_CIVIL) {
            this.posEliminarEstadoCivil(rowKey);
            return;
        }
    }

    protected void posEliminarEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ESTADO_CIVIL) {
            es = this.esFilaValidaParaCrearEstadoCivil(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ESTADO_CIVIL) {
            es = this.esFilaValidaParaModificarEstadoCivil(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearEstadoCivil(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarEstadoCivil(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_ESTADO_CIVIL) {
            this.preCommitCrearEstadoCivil(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ESTADO_CIVIL) {
            this.preCommitModificarEstadoCivil(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ESTADO_CIVIL) {
            this.preCommitEliminarEstadoCivil(rowKey);
            return;
        }
    }

    protected void preCommitCrearEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ESTADO_CIVIL);
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ESTADO_CIVIL, this.getCodigoEstadoCivil(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ESTADO_CIVIL);
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ESTADO_CIVIL, this.getCodigoEstadoCivil(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarEstadoCivil(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ESTADO_CIVIL);
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
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
