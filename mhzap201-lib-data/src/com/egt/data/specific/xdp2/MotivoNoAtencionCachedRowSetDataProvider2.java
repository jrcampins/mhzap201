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
import com.egt.data.specific.xdp1.MotivoNoAtencionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class MotivoNoAtencionCachedRowSetDataProvider2 extends MotivoNoAtencionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public MotivoNoAtencionCachedRowSetDataProvider2() {
        super();
    }

    public MotivoNoAtencionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 321800101L;

    public static final long FUNCION_CONSULTAR_MOTIVO_NO_ATENCION = 321800101L;
    public static final long FUNCION_CREAR_MOTIVO_NO_ATENCION = 321800102L;
    public static final long FUNCION_MODIFICAR_MOTIVO_NO_ATENCION = 321800103L;
    public static final long FUNCION_ELIMINAR_MOTIVO_NO_ATENCION = 321800104L;

    protected static final long PARAMETRO_NUMERO_MOTIVO_NO_ATENCION = 20373L;
    protected static final long PARAMETRO_CODIGO_MOTIVO_NO_ATENCION = 20303L;

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
        if (funcion == FUNCION_CONSULTAR_MOTIVO_NO_ATENCION) {
            this.consultarMotivoNoAtencion(filtro);
            return;
        }
    }

    public void consultarMotivoNoAtencion() throws ExcepcionAplicacion {
        this.consultarMotivoNoAtencion(new FiltroBusqueda());
    }

    public void consultarMotivoNoAtencion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarMotivoNoAtencion(new FiltroBusqueda());
        } else {
            this.consultarMotivoNoAtencion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarMotivoNoAtencion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_MOTIVO_NO_ATENCION);
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
                comando += clausula + " numero_motivo_no_atencion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearMotivoNoAtencion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_MOTIVO_NO_ATENCION);
    }

    public void modificarMotivoNoAtencion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_MOTIVO_NO_ATENCION);
    }

    public void modificarMotivoNoAtencion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_ATENCION);
    }

    public void eliminarMotivoNoAtencion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_MOTIVO_NO_ATENCION);
    }

    public void eliminarMotivoNoAtencion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_MOTIVO_NO_ATENCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_MOTIVO_NO_ATENCION) {
            this.posCrearMotivoNoAtencion(rowKey);
            return;
        }
    }

    protected void posCrearMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_ATENCION) {
            es = this.esFilaModificableConModificarMotivoNoAtencion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarMotivoNoAtencion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_ATENCION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_ATENCION) {
            this.posModificarMotivoNoAtencion(rowKey);
            return;
        }
    }

    protected void posModificarMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_ATENCION) {
            es = this.esFilaEliminableConEliminarMotivoNoAtencion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarMotivoNoAtencion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_ATENCION) {
            this.preEliminarMotivoNoAtencion(rowKey);
            return;
        }
    }

    protected void preEliminarMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_ATENCION) {
            this.posEliminarMotivoNoAtencion(rowKey);
            return;
        }
    }

    protected void posEliminarMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_MOTIVO_NO_ATENCION) {
            es = this.esFilaValidaParaCrearMotivoNoAtencion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_ATENCION) {
            es = this.esFilaValidaParaModificarMotivoNoAtencion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearMotivoNoAtencion(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarMotivoNoAtencion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_MOTIVO_NO_ATENCION) {
            this.preCommitCrearMotivoNoAtencion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_MOTIVO_NO_ATENCION) {
            this.preCommitModificarMotivoNoAtencion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_MOTIVO_NO_ATENCION) {
            this.preCommitEliminarMotivoNoAtencion(rowKey);
            return;
        }
    }

    protected void preCommitCrearMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_MOTIVO_NO_ATENCION);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_ATENCION, this.getNumeroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_NO_ATENCION, this.getCodigoMotivoNoAtencion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_MOTIVO_NO_ATENCION);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_ATENCION, this.getNumeroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MOTIVO_NO_ATENCION, this.getCodigoMotivoNoAtencion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarMotivoNoAtencion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_MOTIVO_NO_ATENCION);
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_ATENCION, this.getNumeroMotivoNoAtencion(rowKey));
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
