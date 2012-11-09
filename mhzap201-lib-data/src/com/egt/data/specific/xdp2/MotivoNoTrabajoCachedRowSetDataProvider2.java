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
import com.egt.data.specific.xdp1.MotivoNoTrabajoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class MotivoNoTrabajoCachedRowSetDataProvider2 extends MotivoNoTrabajoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public MotivoNoTrabajoCachedRowSetDataProvider2() {
        super();
    }

    public MotivoNoTrabajoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 321900101L;

    public static final long FUNCION_CONSULTAR_MOTIVO_NO_TRABAJO = 321900101L;
    public static final long FUNCION_CREAR_MOTIVO_NO_TRABAJO = 321900102L;
    public static final long FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO = 321900103L;
    public static final long FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO = 321900104L;

    protected static final long PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO = 20374L;
    protected static final long PARAMETRO_CODIGO_MOTIVO_NO_TRABAJO = 20304L;

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
        if (funcion == FUNCION_CONSULTAR_MOTIVO_NO_TRABAJO) {
            this.consultarMotivoNoTrabajo(filtro);
            return;
        }
    }

    public void consultarMotivoNoTrabajo() throws ExcepcionAplicacion {
        this.consultarMotivoNoTrabajo(new FiltroBusqueda());
    }

    public void consultarMotivoNoTrabajo(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarMotivoNoTrabajo(new FiltroBusqueda());
        } else {
            this.consultarMotivoNoTrabajo(new FiltroBusqueda(filtro));
        }
    }

    public void consultarMotivoNoTrabajo(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_MOTIVO_NO_TRABAJO);
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
                comando += clausula + " numero_motivo_no_trabajo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearMotivoNoTrabajo() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_MOTIVO_NO_TRABAJO);
    }

    public void modificarMotivoNoTrabajo(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO);
    }

    public void modificarMotivoNoTrabajo(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO);
    }

    public void eliminarMotivoNoTrabajo(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO);
    }

    public void eliminarMotivoNoTrabajo(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_MOTIVO_NO_TRABAJO) {
            this.posCrearMotivoNoTrabajo(rowKey);
            return;
        }
    }

    protected void posCrearMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO) {
            es = this.esFilaModificableConModificarMotivoNoTrabajo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarMotivoNoTrabajo(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO) {
            this.posModificarMotivoNoTrabajo(rowKey);
            return;
        }
    }

    protected void posModificarMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO) {
            es = this.esFilaEliminableConEliminarMotivoNoTrabajo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarMotivoNoTrabajo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO) {
            this.preEliminarMotivoNoTrabajo(rowKey);
            return;
        }
    }

    protected void preEliminarMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO) {
            this.posEliminarMotivoNoTrabajo(rowKey);
            return;
        }
    }

    protected void posEliminarMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_MOTIVO_NO_TRABAJO) {
            es = this.esFilaValidaParaCrearMotivoNoTrabajo(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO) {
            es = this.esFilaValidaParaModificarMotivoNoTrabajo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearMotivoNoTrabajo(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarMotivoNoTrabajo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_MOTIVO_NO_TRABAJO) {
            this.preCommitCrearMotivoNoTrabajo(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO) {
            this.preCommitModificarMotivoNoTrabajo(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO) {
            this.preCommitEliminarMotivoNoTrabajo(rowKey);
            return;
        }
    }

    protected void preCommitCrearMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_MOTIVO_NO_TRABAJO);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO, this.getNumeroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_NO_TRABAJO, this.getCodigoMotivoNoTrabajo(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_TRABAJO);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO, this.getNumeroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_NO_TRABAJO, this.getCodigoMotivoNoTrabajo(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarMotivoNoTrabajo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_MOTIVO_NO_TRABAJO);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO, this.getNumeroMotivoNoTrabajo(rowKey));
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
