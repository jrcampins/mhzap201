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
import com.egt.data.specific.xdp1.CausaDenReclCenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CausaDenReclCenCachedRowSetDataProvider2 extends CausaDenReclCenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CausaDenReclCenCachedRowSetDataProvider2() {
        super();
    }

    public CausaDenReclCenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311650101L;

    public static final long FUNCION_CONSULTAR_CAUSA_DEN_RECL_CEN = 311650101L;
    public static final long FUNCION_CREAR_CAUSA_DEN_RECL_CEN = 311650102L;
    public static final long FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN = 311650103L;
    public static final long FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN = 311650104L;

    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN = 20642L;
    protected static final long PARAMETRO_CODIGO_CAUSA_DEN_RECL_CEN = 20625L;

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
        if (funcion == FUNCION_CONSULTAR_CAUSA_DEN_RECL_CEN) {
            this.consultarCausaDenReclCen(filtro);
            return;
        }
    }

    public void consultarCausaDenReclCen() throws ExcepcionAplicacion {
        this.consultarCausaDenReclCen(new FiltroBusqueda());
    }

    public void consultarCausaDenReclCen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCausaDenReclCen(new FiltroBusqueda());
        } else {
            this.consultarCausaDenReclCen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCausaDenReclCen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CAUSA_DEN_RECL_CEN);
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
                comando += clausula + " numero_causa_den_recl_cen ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCausaDenReclCen() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CAUSA_DEN_RECL_CEN);
    }

    public void modificarCausaDenReclCen(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN);
    }

    public void modificarCausaDenReclCen(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN);
    }

    public void eliminarCausaDenReclCen(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN);
    }

    public void eliminarCausaDenReclCen(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECL_CEN) {
            this.posCrearCausaDenReclCen(rowKey);
            return;
        }
    }

    protected void posCrearCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN) {
            es = this.esFilaModificableConModificarCausaDenReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCausaDenReclCen(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN) {
            this.posModificarCausaDenReclCen(rowKey);
            return;
        }
    }

    protected void posModificarCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN) {
            es = this.esFilaEliminableConEliminarCausaDenReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCausaDenReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN) {
            this.preEliminarCausaDenReclCen(rowKey);
            return;
        }
    }

    protected void preEliminarCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN) {
            this.posEliminarCausaDenReclCen(rowKey);
            return;
        }
    }

    protected void posEliminarCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECL_CEN) {
            es = this.esFilaValidaParaCrearCausaDenReclCen(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN) {
            es = this.esFilaValidaParaModificarCausaDenReclCen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCausaDenReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCausaDenReclCen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECL_CEN) {
            this.preCommitCrearCausaDenReclCen(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN) {
            this.preCommitModificarCausaDenReclCen(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN) {
            this.preCommitEliminarCausaDenReclCen(rowKey);
            return;
        }
    }

    protected void preCommitCrearCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CAUSA_DEN_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, this.getNumeroCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_RECL_CEN, this.getCodigoCausaDenReclCen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, this.getNumeroCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_RECL_CEN, this.getCodigoCausaDenReclCen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCausaDenReclCen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_RECL_CEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, this.getNumeroCausaDenReclCen(rowKey));
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
