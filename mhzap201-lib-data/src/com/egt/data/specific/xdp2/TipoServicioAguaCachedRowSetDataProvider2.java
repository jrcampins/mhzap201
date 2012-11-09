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
import com.egt.data.specific.xdp1.TipoServicioAguaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoServicioAguaCachedRowSetDataProvider2 extends TipoServicioAguaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoServicioAguaCachedRowSetDataProvider2() {
        super();
    }

    public TipoServicioAguaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323600101L;

    public static final long FUNCION_CONSULTAR_TIPO_SERVICIO_AGUA = 323600101L;
    public static final long FUNCION_CREAR_TIPO_SERVICIO_AGUA = 323600102L;
    public static final long FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA = 323600103L;
    public static final long FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA = 323600104L;

    protected static final long PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA = 20427L;
    protected static final long PARAMETRO_CODIGO_TIPO_SERVICIO_AGUA = 20322L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_SERVICIO_AGUA) {
            this.consultarTipoServicioAgua(filtro);
            return;
        }
    }

    public void consultarTipoServicioAgua() throws ExcepcionAplicacion {
        this.consultarTipoServicioAgua(new FiltroBusqueda());
    }

    public void consultarTipoServicioAgua(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoServicioAgua(new FiltroBusqueda());
        } else {
            this.consultarTipoServicioAgua(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoServicioAgua(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_SERVICIO_AGUA);
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
                comando += clausula + " numero_tipo_servicio_agua ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoServicioAgua() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_SERVICIO_AGUA);
    }

    public void modificarTipoServicioAgua(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA);
    }

    public void modificarTipoServicioAgua(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA);
    }

    public void eliminarTipoServicioAgua(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA);
    }

    public void eliminarTipoServicioAgua(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_AGUA) {
            this.posCrearTipoServicioAgua(rowKey);
            return;
        }
    }

    protected void posCrearTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA) {
            es = this.esFilaModificableConModificarTipoServicioAgua(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoServicioAgua(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA) {
            this.posModificarTipoServicioAgua(rowKey);
            return;
        }
    }

    protected void posModificarTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA) {
            es = this.esFilaEliminableConEliminarTipoServicioAgua(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoServicioAgua(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA) {
            this.preEliminarTipoServicioAgua(rowKey);
            return;
        }
    }

    protected void preEliminarTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA) {
            this.posEliminarTipoServicioAgua(rowKey);
            return;
        }
    }

    protected void posEliminarTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_AGUA) {
            es = this.esFilaValidaParaCrearTipoServicioAgua(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA) {
            es = this.esFilaValidaParaModificarTipoServicioAgua(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoServicioAgua(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoServicioAgua(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_AGUA) {
            this.preCommitCrearTipoServicioAgua(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA) {
            this.preCommitModificarTipoServicioAgua(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA) {
            this.preCommitEliminarTipoServicioAgua(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_SERVICIO_AGUA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA, this.getNumeroTipoServicioAgua(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SERVICIO_AGUA, this.getCodigoTipoServicioAgua(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_AGUA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA, this.getNumeroTipoServicioAgua(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SERVICIO_AGUA, this.getCodigoTipoServicioAgua(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoServicioAgua(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_SERVICIO_AGUA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA, this.getNumeroTipoServicioAgua(rowKey));
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
