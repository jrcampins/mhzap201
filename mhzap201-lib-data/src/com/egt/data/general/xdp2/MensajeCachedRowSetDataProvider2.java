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
import com.egt.data.general.xdp1.MensajeCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class MensajeCachedRowSetDataProvider2 extends MensajeCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public MensajeCachedRowSetDataProvider2() {
        super();
    }

    public MensajeCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 100400101L;

    public static final long FUNCION_CONSULTAR_MENSAJE = 100400101L;
    public static final long FUNCION_CREAR_MENSAJE = 100400102L;
    public static final long FUNCION_MODIFICAR_MENSAJE = 100400103L;
    public static final long FUNCION_ELIMINAR_MENSAJE = 100400104L;

    protected static final long PARAMETRO_ID_MENSAJE = 1335L;
    protected static final long PARAMETRO_VERSION_MENSAJE = 1565L;
    protected static final long PARAMETRO_CODIGO_MENSAJE = 1102L;
    protected static final long PARAMETRO_PATRON_MENSAJE = 1506L;
    protected static final long PARAMETRO_DESCRIPCION_MENSAJE = 1226L;

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
        if (funcion == FUNCION_CONSULTAR_MENSAJE) {
            this.consultarMensaje(filtro);
            return;
        }
    }

    public void consultarMensaje() throws ExcepcionAplicacion {
        this.consultarMensaje(new FiltroBusqueda());
    }

    public void consultarMensaje(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarMensaje(new FiltroBusqueda());
        } else {
            this.consultarMensaje(new FiltroBusqueda(filtro));
        }
    }

    public void consultarMensaje(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_MENSAJE);
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
                comando += clausula + " id_mensaje ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearMensaje() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_MENSAJE);
    }

    public void modificarMensaje(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_MENSAJE);
    }

    public void modificarMensaje(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_MENSAJE);
    }

    public void eliminarMensaje(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_MENSAJE);
    }

    public void eliminarMensaje(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_MENSAJE);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_MENSAJE) {
            this.posCrearMensaje(rowKey);
            return;
        }
    }

    protected void posCrearMensaje(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_MENSAJE) {
            es = this.esFilaModificableConModificarMensaje(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarMensaje(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_MENSAJE);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_MENSAJE) {
            this.posModificarMensaje(rowKey);
            return;
        }
    }

    protected void posModificarMensaje(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_MENSAJE) {
            es = this.esFilaEliminableConEliminarMensaje(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarMensaje(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MENSAJE) {
            this.preEliminarMensaje(rowKey);
            return;
        }
    }

    protected void preEliminarMensaje(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_MENSAJE) {
            this.posEliminarMensaje(rowKey);
            return;
        }
    }

    protected void posEliminarMensaje(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_MENSAJE) {
            es = this.esFilaValidaParaCrearMensaje(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_MENSAJE) {
            es = this.esFilaValidaParaModificarMensaje(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearMensaje(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarMensaje(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_MENSAJE) {
            this.preCommitCrearMensaje(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_MENSAJE) {
            this.preCommitModificarMensaje(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_MENSAJE) {
            this.preCommitEliminarMensaje(rowKey);
            return;
        }
    }

    protected void preCommitCrearMensaje(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_MENSAJE);
        rastro.addParametro(PARAMETRO_ID_MENSAJE, this.getIdMensaje(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_MENSAJE, this.getVersionMensaje(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MENSAJE, this.getCodigoMensaje(rowKey));
        rastro.addParametro(PARAMETRO_PATRON_MENSAJE, this.getPatronMensaje(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_MENSAJE, this.getDescripcionMensaje(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarMensaje(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_MENSAJE);
        rastro.addParametro(PARAMETRO_ID_MENSAJE, this.getIdMensaje(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_MENSAJE, this.getVersionMensaje(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_MENSAJE, this.getCodigoMensaje(rowKey));
        rastro.addParametro(PARAMETRO_PATRON_MENSAJE, this.getPatronMensaje(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_MENSAJE, this.getDescripcionMensaje(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarMensaje(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_MENSAJE);
        rastro.addParametro(PARAMETRO_ID_MENSAJE, this.getIdMensaje(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionMensaje(rowKey, 0L);
    }
}
