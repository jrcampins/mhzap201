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
import com.egt.data.specific.xdp1.ClaseImpedimentoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ClaseImpedimentoCachedRowSetDataProvider2 extends ClaseImpedimentoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ClaseImpedimentoCachedRowSetDataProvider2() {
        super();
    }

    public ClaseImpedimentoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 322800101L;

    public static final long FUNCION_CONSULTAR_CLASE_IMPEDIMENTO = 322800101L;
    public static final long FUNCION_CREAR_CLASE_IMPEDIMENTO = 322800102L;
    public static final long FUNCION_MODIFICAR_CLASE_IMPEDIMENTO = 322800103L;
    public static final long FUNCION_ELIMINAR_CLASE_IMPEDIMENTO = 322800104L;

    protected static final long PARAMETRO_NUMERO_CLASE_IMPEDIMENTO = 20607L;
    protected static final long PARAMETRO_CODIGO_CLASE_IMPEDIMENTO = 20536L;

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
        if (funcion == FUNCION_CONSULTAR_CLASE_IMPEDIMENTO) {
            this.consultarClaseImpedimento(filtro);
            return;
        }
    }

    public void consultarClaseImpedimento() throws ExcepcionAplicacion {
        this.consultarClaseImpedimento(new FiltroBusqueda());
    }

    public void consultarClaseImpedimento(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarClaseImpedimento(new FiltroBusqueda());
        } else {
            this.consultarClaseImpedimento(new FiltroBusqueda(filtro));
        }
    }

    public void consultarClaseImpedimento(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CLASE_IMPEDIMENTO);
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
                comando += clausula + " numero_clase_impedimento ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearClaseImpedimento() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CLASE_IMPEDIMENTO);
    }

    public void modificarClaseImpedimento(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CLASE_IMPEDIMENTO);
    }

    public void modificarClaseImpedimento(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CLASE_IMPEDIMENTO);
    }

    public void eliminarClaseImpedimento(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CLASE_IMPEDIMENTO);
    }

    public void eliminarClaseImpedimento(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CLASE_IMPEDIMENTO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CLASE_IMPEDIMENTO) {
            this.posCrearClaseImpedimento(rowKey);
            return;
        }
    }

    protected void posCrearClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CLASE_IMPEDIMENTO) {
            es = this.esFilaModificableConModificarClaseImpedimento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarClaseImpedimento(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CLASE_IMPEDIMENTO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CLASE_IMPEDIMENTO) {
            this.posModificarClaseImpedimento(rowKey);
            return;
        }
    }

    protected void posModificarClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CLASE_IMPEDIMENTO) {
            es = this.esFilaEliminableConEliminarClaseImpedimento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarClaseImpedimento(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_IMPEDIMENTO) {
            this.preEliminarClaseImpedimento(rowKey);
            return;
        }
    }

    protected void preEliminarClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_IMPEDIMENTO) {
            this.posEliminarClaseImpedimento(rowKey);
            return;
        }
    }

    protected void posEliminarClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CLASE_IMPEDIMENTO) {
            es = this.esFilaValidaParaCrearClaseImpedimento(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_IMPEDIMENTO) {
            es = this.esFilaValidaParaModificarClaseImpedimento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearClaseImpedimento(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarClaseImpedimento(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CLASE_IMPEDIMENTO) {
            this.preCommitCrearClaseImpedimento(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_IMPEDIMENTO) {
            this.preCommitModificarClaseImpedimento(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CLASE_IMPEDIMENTO) {
            this.preCommitEliminarClaseImpedimento(rowKey);
            return;
        }
    }

    protected void preCommitCrearClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CLASE_IMPEDIMENTO);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_IMPEDIMENTO, this.getNumeroClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_IMPEDIMENTO, this.getCodigoClaseImpedimento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CLASE_IMPEDIMENTO);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_IMPEDIMENTO, this.getNumeroClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_IMPEDIMENTO, this.getCodigoClaseImpedimento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarClaseImpedimento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CLASE_IMPEDIMENTO);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_IMPEDIMENTO, this.getNumeroClaseImpedimento(rowKey));
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
