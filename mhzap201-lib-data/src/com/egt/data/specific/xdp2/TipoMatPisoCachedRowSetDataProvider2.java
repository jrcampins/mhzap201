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
import com.egt.data.specific.xdp1.TipoMatPisoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoMatPisoCachedRowSetDataProvider2 extends TipoMatPisoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoMatPisoCachedRowSetDataProvider2() {
        super();
    }

    public TipoMatPisoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323000101L;

    public static final long FUNCION_CONSULTAR_TIPO_MAT_PISO = 323000101L;
    public static final long FUNCION_CREAR_TIPO_MAT_PISO = 323000102L;
    public static final long FUNCION_MODIFICAR_TIPO_MAT_PISO = 323000103L;
    public static final long FUNCION_ELIMINAR_TIPO_MAT_PISO = 323000104L;

    protected static final long PARAMETRO_NUMERO_TIPO_MAT_PISO = 20421L;
    protected static final long PARAMETRO_CODIGO_TIPO_MAT_PISO = 20316L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_MAT_PISO) {
            this.consultarTipoMatPiso(filtro);
            return;
        }
    }

    public void consultarTipoMatPiso() throws ExcepcionAplicacion {
        this.consultarTipoMatPiso(new FiltroBusqueda());
    }

    public void consultarTipoMatPiso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoMatPiso(new FiltroBusqueda());
        } else {
            this.consultarTipoMatPiso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoMatPiso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_MAT_PISO);
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
                comando += clausula + " numero_tipo_mat_piso ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoMatPiso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_MAT_PISO);
    }

    public void modificarTipoMatPiso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_MAT_PISO);
    }

    public void modificarTipoMatPiso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_MAT_PISO);
    }

    public void eliminarTipoMatPiso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_MAT_PISO);
    }

    public void eliminarTipoMatPiso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_MAT_PISO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_MAT_PISO) {
            this.posCrearTipoMatPiso(rowKey);
            return;
        }
    }

    protected void posCrearTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_MAT_PISO) {
            es = this.esFilaModificableConModificarTipoMatPiso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoMatPiso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_MAT_PISO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_MAT_PISO) {
            this.posModificarTipoMatPiso(rowKey);
            return;
        }
    }

    protected void posModificarTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_MAT_PISO) {
            es = this.esFilaEliminableConEliminarTipoMatPiso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoMatPiso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_MAT_PISO) {
            this.preEliminarTipoMatPiso(rowKey);
            return;
        }
    }

    protected void preEliminarTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_MAT_PISO) {
            this.posEliminarTipoMatPiso(rowKey);
            return;
        }
    }

    protected void posEliminarTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_MAT_PISO) {
            es = this.esFilaValidaParaCrearTipoMatPiso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_MAT_PISO) {
            es = this.esFilaValidaParaModificarTipoMatPiso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoMatPiso(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoMatPiso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_MAT_PISO) {
            this.preCommitCrearTipoMatPiso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_MAT_PISO) {
            this.preCommitModificarTipoMatPiso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_MAT_PISO) {
            this.preCommitEliminarTipoMatPiso(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_MAT_PISO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PISO, this.getNumeroTipoMatPiso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_MAT_PISO, this.getCodigoTipoMatPiso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_MAT_PISO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PISO, this.getNumeroTipoMatPiso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_MAT_PISO, this.getCodigoTipoMatPiso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoMatPiso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_MAT_PISO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PISO, this.getNumeroTipoMatPiso(rowKey));
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
