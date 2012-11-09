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
import com.egt.data.specific.xdp1.CausaDenPensionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class CausaDenPensionCachedRowSetDataProvider2 extends CausaDenPensionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public CausaDenPensionCachedRowSetDataProvider2() {
        super();
    }

    public CausaDenPensionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 311600101L;

    public static final long FUNCION_CONSULTAR_CAUSA_DEN_PENSION = 311600101L;
    public static final long FUNCION_CREAR_CAUSA_DEN_PENSION = 311600102L;
    public static final long FUNCION_MODIFICAR_CAUSA_DEN_PENSION = 311600103L;
    public static final long FUNCION_ELIMINAR_CAUSA_DEN_PENSION = 311600104L;

    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_PENSION = 20224L;
    protected static final long PARAMETRO_CODIGO_CAUSA_DEN_PENSION = 20222L;

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
        if (funcion == FUNCION_CONSULTAR_CAUSA_DEN_PENSION) {
            this.consultarCausaDenPension(filtro);
            return;
        }
    }

    public void consultarCausaDenPension() throws ExcepcionAplicacion {
        this.consultarCausaDenPension(new FiltroBusqueda());
    }

    public void consultarCausaDenPension(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarCausaDenPension(new FiltroBusqueda());
        } else {
            this.consultarCausaDenPension(new FiltroBusqueda(filtro));
        }
    }

    public void consultarCausaDenPension(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CAUSA_DEN_PENSION);
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
                comando += clausula + " numero_causa_den_pension ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearCausaDenPension() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CAUSA_DEN_PENSION);
    }

    public void modificarCausaDenPension(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CAUSA_DEN_PENSION);
    }

    public void modificarCausaDenPension(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_PENSION);
    }

    public void eliminarCausaDenPension(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CAUSA_DEN_PENSION);
    }

    public void eliminarCausaDenPension(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_PENSION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CAUSA_DEN_PENSION) {
            this.posCrearCausaDenPension(rowKey);
            return;
        }
    }

    protected void posCrearCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_PENSION) {
            es = this.esFilaModificableConModificarCausaDenPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarCausaDenPension(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_PENSION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_PENSION) {
            this.posModificarCausaDenPension(rowKey);
            return;
        }
    }

    protected void posModificarCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_PENSION) {
            es = this.esFilaEliminableConEliminarCausaDenPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarCausaDenPension(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_PENSION) {
            this.preEliminarCausaDenPension(rowKey);
            return;
        }
    }

    protected void preEliminarCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_PENSION) {
            this.posEliminarCausaDenPension(rowKey);
            return;
        }
    }

    protected void posEliminarCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CAUSA_DEN_PENSION) {
            es = this.esFilaValidaParaCrearCausaDenPension(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_PENSION) {
            es = this.esFilaValidaParaModificarCausaDenPension(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearCausaDenPension(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarCausaDenPension(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_CAUSA_DEN_PENSION) {
            this.preCommitCrearCausaDenPension(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CAUSA_DEN_PENSION) {
            this.preCommitModificarCausaDenPension(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CAUSA_DEN_PENSION) {
            this.preCommitEliminarCausaDenPension(rowKey);
            return;
        }
    }

    protected void preCommitCrearCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CAUSA_DEN_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_PENSION, this.getNumeroCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_PENSION, this.getCodigoCausaDenPension(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CAUSA_DEN_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_PENSION, this.getNumeroCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CAUSA_DEN_PENSION, this.getCodigoCausaDenPension(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarCausaDenPension(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CAUSA_DEN_PENSION);
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_PENSION, this.getNumeroCausaDenPension(rowKey));
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
