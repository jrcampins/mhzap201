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
import com.egt.data.specific.xdp1.CausaDenRecoPenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CausaDenRecoPenCachedRowSetDataProvider2 extends CausaDenRecoPenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CausaDenRecoPenCachedRowSetDataProvider2() {
        super();
    }

    public CausaDenRecoPenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311620101L;

    public static final long FUNCION_CONSULTAR_CAUSA_DEN_RECO_PEN = 311620101L;
    public static final long FUNCION_CREAR_CAUSA_DEN_RECO_PEN = 311620102L;
    public static final long FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN = 311620103L;
    public static final long FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN = 311620104L;

    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN = 20248L;
    protected static final long PARAMETRO_CODIGO_CAUSA_DEN_RECO_PEN = 20652L;

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
        if (funcion == FUNCION_CONSULTAR_CAUSA_DEN_RECO_PEN) {
            this.consultarCausaDenRecoPen(filtro);
            return;
        }
    }

    public void consultarCausaDenRecoPen() throws ExcepcionAplicacion {
        this.consultarCausaDenRecoPen(new FiltroBusqueda());
    }

    public void consultarCausaDenRecoPen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCausaDenRecoPen(new FiltroBusqueda());
        } else {
            this.consultarCausaDenRecoPen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCausaDenRecoPen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CAUSA_DEN_RECO_PEN);
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
                comando += clausula + " numero_causa_den_reco_pen ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCausaDenRecoPen() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CAUSA_DEN_RECO_PEN);
    }

    public void modificarCausaDenRecoPen(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN);
    }

    public void modificarCausaDenRecoPen(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN);
    }

    public void eliminarCausaDenRecoPen(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN);
    }

    public void eliminarCausaDenRecoPen(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECO_PEN) {
            this.posCrearCausaDenRecoPen(rowKey);
            return;
        }
    }

    protected void posCrearCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN) {
            es = this.esFilaModificableConModificarCausaDenRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCausaDenRecoPen(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN) {
            this.posModificarCausaDenRecoPen(rowKey);
            return;
        }
    }

    protected void posModificarCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN) {
            es = this.esFilaEliminableConEliminarCausaDenRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCausaDenRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN) {
            this.preEliminarCausaDenRecoPen(rowKey);
            return;
        }
    }

    protected void preEliminarCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN) {
            this.posEliminarCausaDenRecoPen(rowKey);
            return;
        }
    }

    protected void posEliminarCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECO_PEN) {
            es = this.esFilaValidaParaCrearCausaDenRecoPen(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN) {
            es = this.esFilaValidaParaModificarCausaDenRecoPen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCausaDenRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCausaDenRecoPen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CAUSA_DEN_RECO_PEN) {
            this.preCommitCrearCausaDenRecoPen(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN) {
            this.preCommitModificarCausaDenRecoPen(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN) {
            this.preCommitEliminarCausaDenRecoPen(rowKey);
            return;
        }
    }

    protected void preCommitCrearCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CAUSA_DEN_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, this.getNumeroCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_RECO_PEN, this.getCodigoCausaDenRecoPen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, this.getNumeroCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_RECO_PEN, this.getCodigoCausaDenRecoPen(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCausaDenRecoPen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_RECO_PEN);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, this.getNumeroCausaDenRecoPen(rowKey));
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
