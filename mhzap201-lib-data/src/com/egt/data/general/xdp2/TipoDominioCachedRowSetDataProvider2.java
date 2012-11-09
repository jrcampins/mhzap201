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
import com.egt.data.general.xdp1.TipoDominioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoDominioCachedRowSetDataProvider2 extends TipoDominioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoDominioCachedRowSetDataProvider2() {
        super();
    }

    public TipoDominioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102400101L;

    public static final long FUNCION_CONSULTAR_TIPO_DOMINIO = 102400101L;
    public static final long FUNCION_CREAR_TIPO_DOMINIO = 102400102L;
    public static final long FUNCION_MODIFICAR_TIPO_DOMINIO = 102400103L;
    public static final long FUNCION_ELIMINAR_TIPO_DOMINIO = 102400104L;

    protected static final long PARAMETRO_NUMERO_TIPO_DOMINIO = 1490L;
    protected static final long PARAMETRO_CODIGO_TIPO_DOMINIO = 1193L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_DOMINIO) {
            this.consultarTipoDominio(filtro);
            return;
        }
    }

    public void consultarTipoDominio() throws ExcepcionAplicacion {
        this.consultarTipoDominio(new FiltroBusqueda());
    }

    public void consultarTipoDominio(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoDominio(new FiltroBusqueda());
        } else {
            this.consultarTipoDominio(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoDominio(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_DOMINIO);
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
                comando += clausula + " numero_tipo_dominio ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoDominio() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_DOMINIO);
    }

    public void modificarTipoDominio(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_DOMINIO);
    }

    public void modificarTipoDominio(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_DOMINIO);
    }

    public void eliminarTipoDominio(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_DOMINIO);
    }

    public void eliminarTipoDominio(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_DOMINIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_DOMINIO) {
            this.posCrearTipoDominio(rowKey);
            return;
        }
    }

    protected void posCrearTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_DOMINIO) {
            es = this.esFilaModificableConModificarTipoDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoDominio(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_DOMINIO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_DOMINIO) {
            this.posModificarTipoDominio(rowKey);
            return;
        }
    }

    protected void posModificarTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_DOMINIO) {
            es = this.esFilaEliminableConEliminarTipoDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoDominio(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_DOMINIO) {
            this.preEliminarTipoDominio(rowKey);
            return;
        }
    }

    protected void preEliminarTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_DOMINIO) {
            this.posEliminarTipoDominio(rowKey);
            return;
        }
    }

    protected void posEliminarTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_DOMINIO) {
            es = this.esFilaValidaParaCrearTipoDominio(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_DOMINIO) {
            es = this.esFilaValidaParaModificarTipoDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoDominio(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoDominio(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_DOMINIO) {
            this.preCommitCrearTipoDominio(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_DOMINIO) {
            this.preCommitModificarTipoDominio(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_DOMINIO) {
            this.preCommitEliminarTipoDominio(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_DOMINIO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DOMINIO, this.getNumeroTipoDominio(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_DOMINIO, this.getCodigoTipoDominio(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_DOMINIO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DOMINIO, this.getNumeroTipoDominio(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_DOMINIO, this.getCodigoTipoDominio(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_DOMINIO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DOMINIO, this.getNumeroTipoDominio(rowKey));
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
