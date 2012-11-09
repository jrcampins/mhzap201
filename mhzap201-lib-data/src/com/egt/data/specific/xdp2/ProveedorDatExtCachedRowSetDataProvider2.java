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
import com.egt.data.specific.xdp1.ProveedorDatExtCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ProveedorDatExtCachedRowSetDataProvider2 extends ProveedorDatExtCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ProveedorDatExtCachedRowSetDataProvider2() {
        super();
    }

    public ProveedorDatExtCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 312100101L;

    public static final long FUNCION_CONSULTAR_PROVEEDOR_DAT_EXT = 312100101L;
    public static final long FUNCION_CREAR_PROVEEDOR_DAT_EXT = 312100102L;
    public static final long FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT = 312100103L;
    public static final long FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT = 312100104L;

    protected static final long PARAMETRO_ID_PROVEEDOR_DAT_EXT = 20269L;
    protected static final long PARAMETRO_VERSION_PROVEEDOR_DAT_EXT = 20273L;
    protected static final long PARAMETRO_CODIGO_PROVEEDOR_DAT_EXT = 20266L;
    protected static final long PARAMETRO_NOMBRE_PROVEEDOR_DAT_EXT = 20270L;

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
        if (funcion == FUNCION_CONSULTAR_PROVEEDOR_DAT_EXT) {
            this.consultarProveedorDatExt(filtro);
            return;
        }
    }

    public void consultarProveedorDatExt() throws ExcepcionAplicacion {
        this.consultarProveedorDatExt(new FiltroBusqueda());
    }

    public void consultarProveedorDatExt(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarProveedorDatExt(new FiltroBusqueda());
        } else {
            this.consultarProveedorDatExt(new FiltroBusqueda(filtro));
        }
    }

    public void consultarProveedorDatExt(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PROVEEDOR_DAT_EXT);
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
                comando += clausula + " id_proveedor_dat_ext ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearProveedorDatExt() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PROVEEDOR_DAT_EXT);
    }

    public void modificarProveedorDatExt(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT);
    }

    public void modificarProveedorDatExt(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT);
    }

    public void eliminarProveedorDatExt(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT);
    }

    public void eliminarProveedorDatExt(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PROVEEDOR_DAT_EXT) {
            this.posCrearProveedorDatExt(rowKey);
            return;
        }
    }

    protected void posCrearProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT) {
            es = this.esFilaModificableConModificarProveedorDatExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarProveedorDatExt(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT) {
            this.posModificarProveedorDatExt(rowKey);
            return;
        }
    }

    protected void posModificarProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT) {
            es = this.esFilaEliminableConEliminarProveedorDatExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarProveedorDatExt(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT) {
            this.preEliminarProveedorDatExt(rowKey);
            return;
        }
    }

    protected void preEliminarProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT) {
            this.posEliminarProveedorDatExt(rowKey);
            return;
        }
    }

    protected void posEliminarProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PROVEEDOR_DAT_EXT) {
            es = this.esFilaValidaParaCrearProveedorDatExt(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT) {
            es = this.esFilaValidaParaModificarProveedorDatExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearProveedorDatExt(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarProveedorDatExt(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PROVEEDOR_DAT_EXT) {
            this.preCommitCrearProveedorDatExt(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT) {
            this.preCommitModificarProveedorDatExt(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT) {
            this.preCommitEliminarProveedorDatExt(rowKey);
            return;
        }
    }

    protected void preCommitCrearProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PROVEEDOR_DAT_EXT);
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PROVEEDOR_DAT_EXT, this.getVersionProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PROVEEDOR_DAT_EXT, this.getCodigoProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PROVEEDOR_DAT_EXT, this.getNombreProveedorDatExt(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PROVEEDOR_DAT_EXT);
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PROVEEDOR_DAT_EXT, this.getVersionProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PROVEEDOR_DAT_EXT, this.getCodigoProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PROVEEDOR_DAT_EXT, this.getNombreProveedorDatExt(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarProveedorDatExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PROVEEDOR_DAT_EXT);
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        rastro.setNombreRecurso(this.getNombreRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionProveedorDatExt(rowKey, 0L);
    }
}
