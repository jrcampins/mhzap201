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
import com.egt.data.specific.xdp1.ClaseEnfAccCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ClaseEnfAccCachedRowSetDataProvider2 extends ClaseEnfAccCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ClaseEnfAccCachedRowSetDataProvider2() {
        super();
    }

    public ClaseEnfAccCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 322500101L;

    public static final long FUNCION_CONSULTAR_CLASE_ENF_ACC = 322500101L;
    public static final long FUNCION_CREAR_CLASE_ENF_ACC = 322500102L;
    public static final long FUNCION_MODIFICAR_CLASE_ENF_ACC = 322500103L;
    public static final long FUNCION_ELIMINAR_CLASE_ENF_ACC = 322500104L;

    protected static final long PARAMETRO_NUMERO_CLASE_ENF_ACC = 20605L;
    protected static final long PARAMETRO_CODIGO_CLASE_ENF_ACC = 20534L;

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
        if (funcion == FUNCION_CONSULTAR_CLASE_ENF_ACC) {
            this.consultarClaseEnfAcc(filtro);
            return;
        }
    }

    public void consultarClaseEnfAcc() throws ExcepcionAplicacion {
        this.consultarClaseEnfAcc(new FiltroBusqueda());
    }

    public void consultarClaseEnfAcc(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarClaseEnfAcc(new FiltroBusqueda());
        } else {
            this.consultarClaseEnfAcc(new FiltroBusqueda(filtro));
        }
    }

    public void consultarClaseEnfAcc(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CLASE_ENF_ACC);
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
                comando += clausula + " numero_clase_enf_acc ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearClaseEnfAcc() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CLASE_ENF_ACC);
    }

    public void modificarClaseEnfAcc(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CLASE_ENF_ACC);
    }

    public void modificarClaseEnfAcc(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CLASE_ENF_ACC);
    }

    public void eliminarClaseEnfAcc(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CLASE_ENF_ACC);
    }

    public void eliminarClaseEnfAcc(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CLASE_ENF_ACC);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CLASE_ENF_ACC) {
            this.posCrearClaseEnfAcc(rowKey);
            return;
        }
    }

    protected void posCrearClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CLASE_ENF_ACC) {
            es = this.esFilaModificableConModificarClaseEnfAcc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarClaseEnfAcc(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CLASE_ENF_ACC);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CLASE_ENF_ACC) {
            this.posModificarClaseEnfAcc(rowKey);
            return;
        }
    }

    protected void posModificarClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CLASE_ENF_ACC) {
            es = this.esFilaEliminableConEliminarClaseEnfAcc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarClaseEnfAcc(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_ENF_ACC) {
            this.preEliminarClaseEnfAcc(rowKey);
            return;
        }
    }

    protected void preEliminarClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_ENF_ACC) {
            this.posEliminarClaseEnfAcc(rowKey);
            return;
        }
    }

    protected void posEliminarClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CLASE_ENF_ACC) {
            es = this.esFilaValidaParaCrearClaseEnfAcc(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_ENF_ACC) {
            es = this.esFilaValidaParaModificarClaseEnfAcc(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearClaseEnfAcc(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarClaseEnfAcc(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CLASE_ENF_ACC) {
            this.preCommitCrearClaseEnfAcc(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_ENF_ACC) {
            this.preCommitModificarClaseEnfAcc(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CLASE_ENF_ACC) {
            this.preCommitEliminarClaseEnfAcc(rowKey);
            return;
        }
    }

    protected void preCommitCrearClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CLASE_ENF_ACC);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_ACC, this.getNumeroClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_ENF_ACC, this.getCodigoClaseEnfAcc(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CLASE_ENF_ACC);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_ACC, this.getNumeroClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_ENF_ACC, this.getCodigoClaseEnfAcc(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarClaseEnfAcc(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CLASE_ENF_ACC);
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_ACC, this.getNumeroClaseEnfAcc(rowKey));
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
