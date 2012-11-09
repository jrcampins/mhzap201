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
import com.egt.data.specific.xdp1.TipoServicioSanCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoServicioSanCachedRowSetDataProvider2 extends TipoServicioSanCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoServicioSanCachedRowSetDataProvider2() {
        super();
    }

    public TipoServicioSanCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323700101L;

    public static final long FUNCION_CONSULTAR_TIPO_SERVICIO_SAN = 323700101L;
    public static final long FUNCION_CREAR_TIPO_SERVICIO_SAN = 323700102L;
    public static final long FUNCION_MODIFICAR_TIPO_SERVICIO_SAN = 323700103L;
    public static final long FUNCION_ELIMINAR_TIPO_SERVICIO_SAN = 323700104L;

    protected static final long PARAMETRO_NUMERO_TIPO_SERVICIO_SAN = 20428L;
    protected static final long PARAMETRO_CODIGO_TIPO_SERVICIO_SAN = 20323L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_SERVICIO_SAN) {
            this.consultarTipoServicioSan(filtro);
            return;
        }
    }

    public void consultarTipoServicioSan() throws ExcepcionAplicacion {
        this.consultarTipoServicioSan(new FiltroBusqueda());
    }

    public void consultarTipoServicioSan(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoServicioSan(new FiltroBusqueda());
        } else {
            this.consultarTipoServicioSan(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoServicioSan(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_SERVICIO_SAN);
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
                comando += clausula + " numero_tipo_servicio_san ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoServicioSan() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_SERVICIO_SAN);
    }

    public void modificarTipoServicioSan(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_SERVICIO_SAN);
    }

    public void modificarTipoServicioSan(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_SAN);
    }

    public void eliminarTipoServicioSan(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_SERVICIO_SAN);
    }

    public void eliminarTipoServicioSan(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_SERVICIO_SAN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_SAN) {
            this.posCrearTipoServicioSan(rowKey);
            return;
        }
    }

    protected void posCrearTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_SAN) {
            es = this.esFilaModificableConModificarTipoServicioSan(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoServicioSan(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_SAN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_SAN) {
            this.posModificarTipoServicioSan(rowKey);
            return;
        }
    }

    protected void posModificarTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_SAN) {
            es = this.esFilaEliminableConEliminarTipoServicioSan(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoServicioSan(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_SAN) {
            this.preEliminarTipoServicioSan(rowKey);
            return;
        }
    }

    protected void preEliminarTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_SAN) {
            this.posEliminarTipoServicioSan(rowKey);
            return;
        }
    }

    protected void posEliminarTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_SAN) {
            es = this.esFilaValidaParaCrearTipoServicioSan(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_SAN) {
            es = this.esFilaValidaParaModificarTipoServicioSan(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoServicioSan(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoServicioSan(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_SERVICIO_SAN) {
            this.preCommitCrearTipoServicioSan(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SERVICIO_SAN) {
            this.preCommitModificarTipoServicioSan(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_SERVICIO_SAN) {
            this.preCommitEliminarTipoServicioSan(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_SERVICIO_SAN);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_SAN, this.getNumeroTipoServicioSan(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SERVICIO_SAN, this.getCodigoTipoServicioSan(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_SERVICIO_SAN);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_SAN, this.getNumeroTipoServicioSan(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SERVICIO_SAN, this.getCodigoTipoServicioSan(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoServicioSan(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_SERVICIO_SAN);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_SAN, this.getNumeroTipoServicioSan(rowKey));
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
