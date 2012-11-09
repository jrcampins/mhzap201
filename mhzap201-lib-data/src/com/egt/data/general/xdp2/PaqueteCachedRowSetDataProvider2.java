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
import com.egt.data.general.xdp1.PaqueteCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PaqueteCachedRowSetDataProvider2 extends PaqueteCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PaqueteCachedRowSetDataProvider2() {
        super();
    }

    public PaqueteCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102700101L;

    public static final long FUNCION_CONSULTAR_PAQUETE = 102700101L;
    public static final long FUNCION_CREAR_PAQUETE = 102700102L;
    public static final long FUNCION_MODIFICAR_PAQUETE = 102700103L;
    public static final long FUNCION_ELIMINAR_PAQUETE = 102700104L;

    protected static final long PARAMETRO_ID_PAQUETE = 1351L;
    protected static final long PARAMETRO_VERSION_PAQUETE = 1578L;
    protected static final long PARAMETRO_CODIGO_PAQUETE = 1178L;

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
        if (funcion == FUNCION_CONSULTAR_PAQUETE) {
            this.consultarPaquete(filtro);
            return;
        }
    }

    public void consultarPaquete() throws ExcepcionAplicacion {
        this.consultarPaquete(new FiltroBusqueda());
    }

    public void consultarPaquete(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPaquete(new FiltroBusqueda());
        } else {
            this.consultarPaquete(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPaquete(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PAQUETE);
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
                comando += clausula + " id_paquete ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPaquete() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PAQUETE);
    }

    public void modificarPaquete(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PAQUETE);
    }

    public void modificarPaquete(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PAQUETE);
    }

    public void eliminarPaquete(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PAQUETE);
    }

    public void eliminarPaquete(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PAQUETE);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PAQUETE) {
            this.posCrearPaquete(rowKey);
            return;
        }
    }

    protected void posCrearPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PAQUETE) {
            es = this.esFilaModificableConModificarPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPaquete(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PAQUETE);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PAQUETE) {
            this.posModificarPaquete(rowKey);
            return;
        }
    }

    protected void posModificarPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PAQUETE) {
            es = this.esFilaEliminableConEliminarPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPaquete(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAQUETE) {
            this.preEliminarPaquete(rowKey);
            return;
        }
    }

    protected void preEliminarPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAQUETE) {
            this.posEliminarPaquete(rowKey);
            return;
        }
    }

    protected void posEliminarPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PAQUETE) {
            es = this.esFilaValidaParaCrearPaquete(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PAQUETE) {
            es = this.esFilaValidaParaModificarPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPaquete(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarPaquete(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PAQUETE) {
            this.preCommitCrearPaquete(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PAQUETE) {
            this.preCommitModificarPaquete(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PAQUETE) {
            this.preCommitEliminarPaquete(rowKey);
            return;
        }
    }

    protected void preCommitCrearPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAQUETE, this.getVersionPaquete(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PAQUETE, this.getCodigoPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAQUETE, this.getVersionPaquete(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PAQUETE, this.getCodigoPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
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
        this.setVersionPaquete(rowKey, 0L);
    }
}
