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
import com.egt.data.specific.xdp1.CausaInvCensoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CausaInvCensoCachedRowSetDataProvider2 extends CausaInvCensoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CausaInvCensoCachedRowSetDataProvider2() {
        super();
    }

    public CausaInvCensoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311670101L;

    public static final long FUNCION_CONSULTAR_CAUSA_INV_CENSO = 311670101L;
    public static final long FUNCION_CREAR_CAUSA_INV_CENSO = 311670102L;
    public static final long FUNCION_MODIFICAR_CAUSA_INV_CENSO = 311670103L;
    public static final long FUNCION_ELIMINAR_CAUSA_INV_CENSO = 311670104L;

    protected static final long PARAMETRO_NUMERO_CAUSA_INV_CENSO = 20649L;
    protected static final long PARAMETRO_CODIGO_CAUSA_INV_CENSO = 20648L;

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
        if (funcion == FUNCION_CONSULTAR_CAUSA_INV_CENSO) {
            this.consultarCausaInvCenso(filtro);
            return;
        }
    }

    public void consultarCausaInvCenso() throws ExcepcionAplicacion {
        this.consultarCausaInvCenso(new FiltroBusqueda());
    }

    public void consultarCausaInvCenso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCausaInvCenso(new FiltroBusqueda());
        } else {
            this.consultarCausaInvCenso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCausaInvCenso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CAUSA_INV_CENSO);
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
                comando += clausula + " numero_causa_inv_censo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCausaInvCenso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CAUSA_INV_CENSO);
    }

    public void modificarCausaInvCenso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CAUSA_INV_CENSO);
    }

    public void modificarCausaInvCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CAUSA_INV_CENSO);
    }

    public void eliminarCausaInvCenso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CAUSA_INV_CENSO);
    }

    public void eliminarCausaInvCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CAUSA_INV_CENSO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CAUSA_INV_CENSO) {
            this.posCrearCausaInvCenso(rowKey);
            return;
        }
    }

    protected void posCrearCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CAUSA_INV_CENSO) {
            es = this.esFilaModificableConModificarCausaInvCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCausaInvCenso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CAUSA_INV_CENSO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CAUSA_INV_CENSO) {
            this.posModificarCausaInvCenso(rowKey);
            return;
        }
    }

    protected void posModificarCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CAUSA_INV_CENSO) {
            es = this.esFilaEliminableConEliminarCausaInvCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCausaInvCenso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_INV_CENSO) {
            this.preEliminarCausaInvCenso(rowKey);
            return;
        }
    }

    protected void preEliminarCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_INV_CENSO) {
            this.posEliminarCausaInvCenso(rowKey);
            return;
        }
    }

    protected void posEliminarCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CAUSA_INV_CENSO) {
            es = this.esFilaValidaParaCrearCausaInvCenso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_INV_CENSO) {
            es = this.esFilaValidaParaModificarCausaInvCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCausaInvCenso(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCausaInvCenso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CAUSA_INV_CENSO) {
            this.preCommitCrearCausaInvCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_INV_CENSO) {
            this.preCommitModificarCausaInvCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CAUSA_INV_CENSO) {
            this.preCommitEliminarCausaInvCenso(rowKey);
            return;
        }
    }

    protected void preCommitCrearCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CAUSA_INV_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_INV_CENSO, this.getNumeroCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_INV_CENSO, this.getCodigoCausaInvCenso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CAUSA_INV_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_INV_CENSO, this.getNumeroCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_INV_CENSO, this.getCodigoCausaInvCenso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCausaInvCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CAUSA_INV_CENSO);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_INV_CENSO, this.getNumeroCausaInvCenso(rowKey));
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
