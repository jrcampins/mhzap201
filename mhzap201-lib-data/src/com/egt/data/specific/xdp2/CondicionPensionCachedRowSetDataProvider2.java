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
import com.egt.data.specific.xdp1.CondicionPensionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CondicionPensionCachedRowSetDataProvider2 extends CondicionPensionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CondicionPensionCachedRowSetDataProvider2() {
        super();
    }

    public CondicionPensionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311300101L;

    public static final long FUNCION_CONSULTAR_CONDICION_PENSION = 311300101L;
    public static final long FUNCION_CREAR_CONDICION_PENSION = 311300102L;
    public static final long FUNCION_MODIFICAR_CONDICION_PENSION = 311300103L;
    public static final long FUNCION_ELIMINAR_CONDICION_PENSION = 311300104L;

    protected static final long PARAMETRO_NUMERO_CONDICION_PENSION = 20169L;
    protected static final long PARAMETRO_CODIGO_CONDICION_PENSION = 20135L;

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
        if (funcion == FUNCION_CONSULTAR_CONDICION_PENSION) {
            this.consultarCondicionPension(filtro);
            return;
        }
    }

    public void consultarCondicionPension() throws ExcepcionAplicacion {
        this.consultarCondicionPension(new FiltroBusqueda());
    }

    public void consultarCondicionPension(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCondicionPension(new FiltroBusqueda());
        } else {
            this.consultarCondicionPension(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCondicionPension(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONDICION_PENSION);
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
                comando += clausula + " numero_condicion_pension ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCondicionPension() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONDICION_PENSION);
    }

    public void modificarCondicionPension(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONDICION_PENSION);
    }

    public void modificarCondicionPension(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONDICION_PENSION);
    }

    public void eliminarCondicionPension(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONDICION_PENSION);
    }

    public void eliminarCondicionPension(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONDICION_PENSION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONDICION_PENSION) {
            this.posCrearCondicionPension(rowKey);
            return;
        }
    }

    protected void posCrearCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONDICION_PENSION) {
            es = this.esFilaModificableConModificarCondicionPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCondicionPension(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONDICION_PENSION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONDICION_PENSION) {
            this.posModificarCondicionPension(rowKey);
            return;
        }
    }

    protected void posModificarCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONDICION_PENSION) {
            es = this.esFilaEliminableConEliminarCondicionPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCondicionPension(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_PENSION) {
            this.preEliminarCondicionPension(rowKey);
            return;
        }
    }

    protected void preEliminarCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONDICION_PENSION) {
            this.posEliminarCondicionPension(rowKey);
            return;
        }
    }

    protected void posEliminarCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONDICION_PENSION) {
            es = this.esFilaValidaParaCrearCondicionPension(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_PENSION) {
            es = this.esFilaValidaParaModificarCondicionPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCondicionPension(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCondicionPension(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CONDICION_PENSION) {
            this.preCommitCrearCondicionPension(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONDICION_PENSION) {
            this.preCommitModificarCondicionPension(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONDICION_PENSION) {
            this.preCommitEliminarCondicionPension(rowKey);
            return;
        }
    }

    protected void preCommitCrearCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONDICION_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_PENSION, this.getNumeroCondicionPension(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_PENSION, this.getCodigoCondicionPension(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONDICION_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_PENSION, this.getNumeroCondicionPension(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONDICION_PENSION, this.getCodigoCondicionPension(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCondicionPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONDICION_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_PENSION, this.getNumeroCondicionPension(rowKey));
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
