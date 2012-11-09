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
import com.egt.data.specific.xdp1.TipoExcepcionCedCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoExcepcionCedCachedRowSetDataProvider2 extends TipoExcepcionCedCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoExcepcionCedCachedRowSetDataProvider2() {
        super();
    }

    public TipoExcepcionCedCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 322700101L;

    public static final long FUNCION_CONSULTAR_TIPO_EXCEPCION_CED = 322700101L;
    public static final long FUNCION_CREAR_TIPO_EXCEPCION_CED = 322700102L;
    public static final long FUNCION_MODIFICAR_TIPO_EXCEPCION_CED = 322700103L;
    public static final long FUNCION_ELIMINAR_TIPO_EXCEPCION_CED = 322700104L;

    protected static final long PARAMETRO_NUMERO_TIPO_EXCEPCION_CED = 20418L;
    protected static final long PARAMETRO_CODIGO_TIPO_EXCEPCION_CED = 20313L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_EXCEPCION_CED) {
            this.consultarTipoExcepcionCed(filtro);
            return;
        }
    }

    public void consultarTipoExcepcionCed() throws ExcepcionAplicacion {
        this.consultarTipoExcepcionCed(new FiltroBusqueda());
    }

    public void consultarTipoExcepcionCed(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoExcepcionCed(new FiltroBusqueda());
        } else {
            this.consultarTipoExcepcionCed(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoExcepcionCed(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_EXCEPCION_CED);
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
                comando += clausula + " numero_tipo_excepcion_ced ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoExcepcionCed() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_EXCEPCION_CED);
    }

    public void modificarTipoExcepcionCed(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_EXCEPCION_CED);
    }

    public void modificarTipoExcepcionCed(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_EXCEPCION_CED);
    }

    public void eliminarTipoExcepcionCed(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_EXCEPCION_CED);
    }

    public void eliminarTipoExcepcionCed(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_EXCEPCION_CED);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_EXCEPCION_CED) {
            this.posCrearTipoExcepcionCed(rowKey);
            return;
        }
    }

    protected void posCrearTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_EXCEPCION_CED) {
            es = this.esFilaModificableConModificarTipoExcepcionCed(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoExcepcionCed(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_EXCEPCION_CED);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_EXCEPCION_CED) {
            this.posModificarTipoExcepcionCed(rowKey);
            return;
        }
    }

    protected void posModificarTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_EXCEPCION_CED) {
            es = this.esFilaEliminableConEliminarTipoExcepcionCed(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoExcepcionCed(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_EXCEPCION_CED) {
            this.preEliminarTipoExcepcionCed(rowKey);
            return;
        }
    }

    protected void preEliminarTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_EXCEPCION_CED) {
            this.posEliminarTipoExcepcionCed(rowKey);
            return;
        }
    }

    protected void posEliminarTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_EXCEPCION_CED) {
            es = this.esFilaValidaParaCrearTipoExcepcionCed(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_EXCEPCION_CED) {
            es = this.esFilaValidaParaModificarTipoExcepcionCed(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoExcepcionCed(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoExcepcionCed(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_EXCEPCION_CED) {
            this.preCommitCrearTipoExcepcionCed(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_EXCEPCION_CED) {
            this.preCommitModificarTipoExcepcionCed(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_EXCEPCION_CED) {
            this.preCommitEliminarTipoExcepcionCed(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_EXCEPCION_CED);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_EXCEPCION_CED, this.getNumeroTipoExcepcionCed(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_EXCEPCION_CED, this.getCodigoTipoExcepcionCed(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_EXCEPCION_CED);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_EXCEPCION_CED, this.getNumeroTipoExcepcionCed(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_EXCEPCION_CED, this.getCodigoTipoExcepcionCed(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoExcepcionCed(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_EXCEPCION_CED);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_EXCEPCION_CED, this.getNumeroTipoExcepcionCed(rowKey));
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
