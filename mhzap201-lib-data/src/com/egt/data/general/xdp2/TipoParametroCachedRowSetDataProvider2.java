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
import com.egt.data.general.xdp1.TipoParametroCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoParametroCachedRowSetDataProvider2 extends TipoParametroCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoParametroCachedRowSetDataProvider2() {
        super();
    }

    public TipoParametroCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 101200101L;

    public static final long FUNCION_CONSULTAR_TIPO_PARAMETRO = 101200101L;
    public static final long FUNCION_CREAR_TIPO_PARAMETRO = 101200102L;
    public static final long FUNCION_MODIFICAR_TIPO_PARAMETRO = 101200103L;
    public static final long FUNCION_ELIMINAR_TIPO_PARAMETRO = 101200104L;

    protected static final long PARAMETRO_NUMERO_TIPO_PARAMETRO = 1496L;
    protected static final long PARAMETRO_CODIGO_TIPO_PARAMETRO = 1199L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_PARAMETRO) {
            this.consultarTipoParametro(filtro);
            return;
        }
    }

    public void consultarTipoParametro() throws ExcepcionAplicacion {
        this.consultarTipoParametro(new FiltroBusqueda());
    }

    public void consultarTipoParametro(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoParametro(new FiltroBusqueda());
        } else {
            this.consultarTipoParametro(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoParametro(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_PARAMETRO);
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
                comando += clausula + " numero_tipo_parametro ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoParametro() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_PARAMETRO);
    }

    public void modificarTipoParametro(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_PARAMETRO);
    }

    public void modificarTipoParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO);
    }

    public void eliminarTipoParametro(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_PARAMETRO);
    }

    public void eliminarTipoParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_PARAMETRO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO) {
            this.posCrearTipoParametro(rowKey);
            return;
        }
    }

    protected void posCrearTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO) {
            es = this.esFilaModificableConModificarTipoParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoParametro(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO) {
            this.posModificarTipoParametro(rowKey);
            return;
        }
    }

    protected void posModificarTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO) {
            es = this.esFilaEliminableConEliminarTipoParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO) {
            this.preEliminarTipoParametro(rowKey);
            return;
        }
    }

    protected void preEliminarTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO) {
            this.posEliminarTipoParametro(rowKey);
            return;
        }
    }

    protected void posEliminarTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO) {
            es = this.esFilaValidaParaCrearTipoParametro(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO) {
            es = this.esFilaValidaParaModificarTipoParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoParametro(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO) {
            this.preCommitCrearTipoParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO) {
            this.preCommitModificarTipoParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO) {
            this.preCommitEliminarTipoParametro(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_PARAMETRO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO, this.getNumeroTipoParametro(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PARAMETRO, this.getCodigoTipoParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO, this.getNumeroTipoParametro(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PARAMETRO, this.getCodigoTipoParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_PARAMETRO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO, this.getNumeroTipoParametro(rowKey));
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
