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
import com.egt.data.specific.xdp1.TipoCombustibleCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoCombustibleCachedRowSetDataProvider2 extends TipoCombustibleCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoCombustibleCachedRowSetDataProvider2() {
        super();
    }

    public TipoCombustibleCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 322300101L;

    public static final long FUNCION_CONSULTAR_TIPO_COMBUSTIBLE = 322300101L;
    public static final long FUNCION_CREAR_TIPO_COMBUSTIBLE = 322300102L;
    public static final long FUNCION_MODIFICAR_TIPO_COMBUSTIBLE = 322300103L;
    public static final long FUNCION_ELIMINAR_TIPO_COMBUSTIBLE = 322300104L;

    protected static final long PARAMETRO_NUMERO_TIPO_COMBUSTIBLE = 20414L;
    protected static final long PARAMETRO_CODIGO_TIPO_COMBUSTIBLE = 20309L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_COMBUSTIBLE) {
            this.consultarTipoCombustible(filtro);
            return;
        }
    }

    public void consultarTipoCombustible() throws ExcepcionAplicacion {
        this.consultarTipoCombustible(new FiltroBusqueda());
    }

    public void consultarTipoCombustible(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoCombustible(new FiltroBusqueda());
        } else {
            this.consultarTipoCombustible(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoCombustible(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_COMBUSTIBLE);
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
                comando += clausula + " numero_tipo_combustible ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoCombustible() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_COMBUSTIBLE);
    }

    public void modificarTipoCombustible(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_COMBUSTIBLE);
    }

    public void modificarTipoCombustible(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_COMBUSTIBLE);
    }

    public void eliminarTipoCombustible(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_COMBUSTIBLE);
    }

    public void eliminarTipoCombustible(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_COMBUSTIBLE);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_COMBUSTIBLE) {
            this.posCrearTipoCombustible(rowKey);
            return;
        }
    }

    protected void posCrearTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_COMBUSTIBLE) {
            es = this.esFilaModificableConModificarTipoCombustible(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoCombustible(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_COMBUSTIBLE);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_COMBUSTIBLE) {
            this.posModificarTipoCombustible(rowKey);
            return;
        }
    }

    protected void posModificarTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_COMBUSTIBLE) {
            es = this.esFilaEliminableConEliminarTipoCombustible(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoCombustible(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_COMBUSTIBLE) {
            this.preEliminarTipoCombustible(rowKey);
            return;
        }
    }

    protected void preEliminarTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_COMBUSTIBLE) {
            this.posEliminarTipoCombustible(rowKey);
            return;
        }
    }

    protected void posEliminarTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_COMBUSTIBLE) {
            es = this.esFilaValidaParaCrearTipoCombustible(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_COMBUSTIBLE) {
            es = this.esFilaValidaParaModificarTipoCombustible(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoCombustible(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoCombustible(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_COMBUSTIBLE) {
            this.preCommitCrearTipoCombustible(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_COMBUSTIBLE) {
            this.preCommitModificarTipoCombustible(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_COMBUSTIBLE) {
            this.preCommitEliminarTipoCombustible(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_COMBUSTIBLE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMBUSTIBLE, this.getNumeroTipoCombustible(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_COMBUSTIBLE, this.getCodigoTipoCombustible(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_COMBUSTIBLE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMBUSTIBLE, this.getNumeroTipoCombustible(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_COMBUSTIBLE, this.getCodigoTipoCombustible(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoCombustible(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_COMBUSTIBLE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMBUSTIBLE, this.getNumeroTipoCombustible(rowKey));
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
