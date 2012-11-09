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
import com.egt.data.specific.xdp1.MotivoInaEscCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class MotivoInaEscCachedRowSetDataProvider2 extends MotivoInaEscCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public MotivoInaEscCachedRowSetDataProvider2() {
        super();
    }

    public MotivoInaEscCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 321700101L;

    public static final long FUNCION_CONSULTAR_MOTIVO_INA_ESC = 321700101L;
    public static final long FUNCION_CREAR_MOTIVO_INA_ESC = 321700102L;
    public static final long FUNCION_MODIFICAR_MOTIVO_INA_ESC = 321700103L;
    public static final long FUNCION_ELIMINAR_MOTIVO_INA_ESC = 321700104L;

    protected static final long PARAMETRO_NUMERO_MOTIVO_INA_ESC = 20608L;
    protected static final long PARAMETRO_CODIGO_MOTIVO_INA_ESC = 20302L;

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
        if (funcion == FUNCION_CONSULTAR_MOTIVO_INA_ESC) {
            this.consultarMotivoInaEsc(filtro);
            return;
        }
    }

    public void consultarMotivoInaEsc() throws ExcepcionAplicacion {
        this.consultarMotivoInaEsc(new FiltroBusqueda());
    }

    public void consultarMotivoInaEsc(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarMotivoInaEsc(new FiltroBusqueda());
        } else {
            this.consultarMotivoInaEsc(new FiltroBusqueda(filtro));
        }
    }

    public void consultarMotivoInaEsc(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_MOTIVO_INA_ESC);
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
                comando += clausula + " numero_motivo_ina_esc ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearMotivoInaEsc() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_MOTIVO_INA_ESC);
    }

    public void modificarMotivoInaEsc(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_MOTIVO_INA_ESC);
    }

    public void modificarMotivoInaEsc(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_MOTIVO_INA_ESC);
    }

    public void eliminarMotivoInaEsc(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_MOTIVO_INA_ESC);
    }

    public void eliminarMotivoInaEsc(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_MOTIVO_INA_ESC);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_MOTIVO_INA_ESC) {
            this.posCrearMotivoInaEsc(rowKey);
            return;
        }
    }

    protected void posCrearMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_MOTIVO_INA_ESC) {
            es = this.esFilaModificableConModificarMotivoInaEsc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarMotivoInaEsc(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_MOTIVO_INA_ESC);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_MOTIVO_INA_ESC) {
            this.posModificarMotivoInaEsc(rowKey);
            return;
        }
    }

    protected void posModificarMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_MOTIVO_INA_ESC) {
            es = this.esFilaEliminableConEliminarMotivoInaEsc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarMotivoInaEsc(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_INA_ESC) {
            this.preEliminarMotivoInaEsc(rowKey);
            return;
        }
    }

    protected void preEliminarMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_INA_ESC) {
            this.posEliminarMotivoInaEsc(rowKey);
            return;
        }
    }

    protected void posEliminarMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_MOTIVO_INA_ESC) {
            es = this.esFilaValidaParaCrearMotivoInaEsc(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_INA_ESC) {
            es = this.esFilaValidaParaModificarMotivoInaEsc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearMotivoInaEsc(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarMotivoInaEsc(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_MOTIVO_INA_ESC) {
            this.preCommitCrearMotivoInaEsc(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_INA_ESC) {
            this.preCommitModificarMotivoInaEsc(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_MOTIVO_INA_ESC) {
            this.preCommitEliminarMotivoInaEsc(rowKey);
            return;
        }
    }

    protected void preCommitCrearMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_MOTIVO_INA_ESC);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_INA_ESC, this.getNumeroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_INA_ESC, this.getCodigoMotivoInaEsc(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_MOTIVO_INA_ESC);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_INA_ESC, this.getNumeroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_INA_ESC, this.getCodigoMotivoInaEsc(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarMotivoInaEsc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_MOTIVO_INA_ESC);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_INA_ESC, this.getNumeroMotivoInaEsc(rowKey));
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
