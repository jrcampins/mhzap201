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
import com.egt.data.general.xdp1.TipoClaseRecursoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoClaseRecursoCachedRowSetDataProvider2 extends TipoClaseRecursoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoClaseRecursoCachedRowSetDataProvider2() {
        super();
    }

    public TipoClaseRecursoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102150101L;

    public static final long FUNCION_CONSULTAR_TIPO_CLASE_RECURSO = 102150101L;
    public static final long FUNCION_CREAR_TIPO_CLASE_RECURSO = 102150102L;
    public static final long FUNCION_MODIFICAR_TIPO_CLASE_RECURSO = 102150103L;
    public static final long FUNCION_ELIMINAR_TIPO_CLASE_RECURSO = 102150104L;

    protected static final long PARAMETRO_NUMERO_TIPO_CLASE_RECURSO = 1501L;
    protected static final long PARAMETRO_CODIGO_TIPO_CLASE_RECURSO = 1204L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_CLASE_RECURSO) {
            this.consultarTipoClaseRecurso(filtro);
            return;
        }
    }

    public void consultarTipoClaseRecurso() throws ExcepcionAplicacion {
        this.consultarTipoClaseRecurso(new FiltroBusqueda());
    }

    public void consultarTipoClaseRecurso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoClaseRecurso(new FiltroBusqueda());
        } else {
            this.consultarTipoClaseRecurso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoClaseRecurso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_CLASE_RECURSO);
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
                comando += clausula + " numero_tipo_clase_recurso ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoClaseRecurso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_CLASE_RECURSO);
    }

    public void modificarTipoClaseRecurso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_CLASE_RECURSO);
    }

    public void modificarTipoClaseRecurso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_CLASE_RECURSO);
    }

    public void eliminarTipoClaseRecurso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_CLASE_RECURSO);
    }

    public void eliminarTipoClaseRecurso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_CLASE_RECURSO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_CLASE_RECURSO) {
            this.posCrearTipoClaseRecurso(rowKey);
            return;
        }
    }

    protected void posCrearTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_CLASE_RECURSO) {
            es = this.esFilaModificableConModificarTipoClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoClaseRecurso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_CLASE_RECURSO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_CLASE_RECURSO) {
            this.posModificarTipoClaseRecurso(rowKey);
            return;
        }
    }

    protected void posModificarTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_CLASE_RECURSO) {
            es = this.esFilaEliminableConEliminarTipoClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoClaseRecurso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_CLASE_RECURSO) {
            this.preEliminarTipoClaseRecurso(rowKey);
            return;
        }
    }

    protected void preEliminarTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_CLASE_RECURSO) {
            this.posEliminarTipoClaseRecurso(rowKey);
            return;
        }
    }

    protected void posEliminarTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_CLASE_RECURSO) {
            es = this.esFilaValidaParaCrearTipoClaseRecurso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_CLASE_RECURSO) {
            es = this.esFilaValidaParaModificarTipoClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoClaseRecurso(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoClaseRecurso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_CLASE_RECURSO) {
            this.preCommitCrearTipoClaseRecurso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_CLASE_RECURSO) {
            this.preCommitModificarTipoClaseRecurso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_CLASE_RECURSO) {
            this.preCommitEliminarTipoClaseRecurso(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_CLASE_RECURSO, this.getNumeroTipoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_CLASE_RECURSO, this.getCodigoTipoClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_CLASE_RECURSO, this.getNumeroTipoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_CLASE_RECURSO, this.getCodigoTipoClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_CLASE_RECURSO, this.getNumeroTipoClaseRecurso(rowKey));
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
