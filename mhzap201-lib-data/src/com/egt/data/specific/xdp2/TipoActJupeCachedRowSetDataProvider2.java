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
import com.egt.data.specific.xdp1.TipoActJupeCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoActJupeCachedRowSetDataProvider2 extends TipoActJupeCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoActJupeCachedRowSetDataProvider2() {
        super();
    }

    public TipoActJupeCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 324300101L;

    public static final long FUNCION_CONSULTAR_TIPO_ACT_JUPE = 324300101L;
    public static final long FUNCION_CREAR_TIPO_ACT_JUPE = 324300102L;
    public static final long FUNCION_MODIFICAR_TIPO_ACT_JUPE = 324300103L;
    public static final long FUNCION_ELIMINAR_TIPO_ACT_JUPE = 324300104L;

    protected static final long PARAMETRO_NUMERO_TIPO_ACT_JUPE = 20645L;
    protected static final long PARAMETRO_CODIGO_TIPO_ACT_JUPE = 20628L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_ACT_JUPE) {
            this.consultarTipoActJupe(filtro);
            return;
        }
    }

    public void consultarTipoActJupe() throws ExcepcionAplicacion {
        this.consultarTipoActJupe(new FiltroBusqueda());
    }

    public void consultarTipoActJupe(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoActJupe(new FiltroBusqueda());
        } else {
            this.consultarTipoActJupe(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoActJupe(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_ACT_JUPE);
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
                comando += clausula + " numero_tipo_act_jupe ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoActJupe() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_ACT_JUPE);
    }

    public void modificarTipoActJupe(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_ACT_JUPE);
    }

    public void modificarTipoActJupe(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_ACT_JUPE);
    }

    public void eliminarTipoActJupe(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_ACT_JUPE);
    }

    public void eliminarTipoActJupe(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_ACT_JUPE);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_ACT_JUPE) {
            this.posCrearTipoActJupe(rowKey);
            return;
        }
    }

    protected void posCrearTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_ACT_JUPE) {
            es = this.esFilaModificableConModificarTipoActJupe(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoActJupe(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_ACT_JUPE);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_ACT_JUPE) {
            this.posModificarTipoActJupe(rowKey);
            return;
        }
    }

    protected void posModificarTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_ACT_JUPE) {
            es = this.esFilaEliminableConEliminarTipoActJupe(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoActJupe(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_ACT_JUPE) {
            this.preEliminarTipoActJupe(rowKey);
            return;
        }
    }

    protected void preEliminarTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_ACT_JUPE) {
            this.posEliminarTipoActJupe(rowKey);
            return;
        }
    }

    protected void posEliminarTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_ACT_JUPE) {
            es = this.esFilaValidaParaCrearTipoActJupe(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_ACT_JUPE) {
            es = this.esFilaValidaParaModificarTipoActJupe(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoActJupe(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoActJupe(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_ACT_JUPE) {
            this.preCommitCrearTipoActJupe(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_ACT_JUPE) {
            this.preCommitModificarTipoActJupe(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_ACT_JUPE) {
            this.preCommitEliminarTipoActJupe(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_ACT_JUPE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ACT_JUPE, this.getNumeroTipoActJupe(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_ACT_JUPE, this.getCodigoTipoActJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_ACT_JUPE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ACT_JUPE, this.getNumeroTipoActJupe(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_ACT_JUPE, this.getCodigoTipoActJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoActJupe(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_ACT_JUPE);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ACT_JUPE, this.getNumeroTipoActJupe(rowKey));
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
