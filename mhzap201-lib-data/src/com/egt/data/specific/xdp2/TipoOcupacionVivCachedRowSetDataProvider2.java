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
import com.egt.data.specific.xdp1.TipoOcupacionVivCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoOcupacionVivCachedRowSetDataProvider2 extends TipoOcupacionVivCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoOcupacionVivCachedRowSetDataProvider2() {
        super();
    }

    public TipoOcupacionVivCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323200101L;

    public static final long FUNCION_CONSULTAR_TIPO_OCUPACION_VIV = 323200101L;
    public static final long FUNCION_CREAR_TIPO_OCUPACION_VIV = 323200102L;
    public static final long FUNCION_MODIFICAR_TIPO_OCUPACION_VIV = 323200103L;
    public static final long FUNCION_ELIMINAR_TIPO_OCUPACION_VIV = 323200104L;

    protected static final long PARAMETRO_NUMERO_TIPO_OCUPACION_VIV = 20423L;
    protected static final long PARAMETRO_CODIGO_TIPO_OCUPACION_VIV = 20318L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_OCUPACION_VIV) {
            this.consultarTipoOcupacionViv(filtro);
            return;
        }
    }

    public void consultarTipoOcupacionViv() throws ExcepcionAplicacion {
        this.consultarTipoOcupacionViv(new FiltroBusqueda());
    }

    public void consultarTipoOcupacionViv(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoOcupacionViv(new FiltroBusqueda());
        } else {
            this.consultarTipoOcupacionViv(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoOcupacionViv(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_OCUPACION_VIV);
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
                comando += clausula + " numero_tipo_ocupacion_viv ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoOcupacionViv() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_OCUPACION_VIV);
    }

    public void modificarTipoOcupacionViv(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_OCUPACION_VIV);
    }

    public void modificarTipoOcupacionViv(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_OCUPACION_VIV);
    }

    public void eliminarTipoOcupacionViv(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_OCUPACION_VIV);
    }

    public void eliminarTipoOcupacionViv(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_OCUPACION_VIV);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_OCUPACION_VIV) {
            this.posCrearTipoOcupacionViv(rowKey);
            return;
        }
    }

    protected void posCrearTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_OCUPACION_VIV) {
            es = this.esFilaModificableConModificarTipoOcupacionViv(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoOcupacionViv(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_OCUPACION_VIV);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_OCUPACION_VIV) {
            this.posModificarTipoOcupacionViv(rowKey);
            return;
        }
    }

    protected void posModificarTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_OCUPACION_VIV) {
            es = this.esFilaEliminableConEliminarTipoOcupacionViv(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoOcupacionViv(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_OCUPACION_VIV) {
            this.preEliminarTipoOcupacionViv(rowKey);
            return;
        }
    }

    protected void preEliminarTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_OCUPACION_VIV) {
            this.posEliminarTipoOcupacionViv(rowKey);
            return;
        }
    }

    protected void posEliminarTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_OCUPACION_VIV) {
            es = this.esFilaValidaParaCrearTipoOcupacionViv(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_OCUPACION_VIV) {
            es = this.esFilaValidaParaModificarTipoOcupacionViv(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoOcupacionViv(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoOcupacionViv(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_OCUPACION_VIV) {
            this.preCommitCrearTipoOcupacionViv(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_OCUPACION_VIV) {
            this.preCommitModificarTipoOcupacionViv(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_OCUPACION_VIV) {
            this.preCommitEliminarTipoOcupacionViv(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_OCUPACION_VIV);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_OCUPACION_VIV, this.getNumeroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_OCUPACION_VIV, this.getCodigoTipoOcupacionViv(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_OCUPACION_VIV);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_OCUPACION_VIV, this.getNumeroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_OCUPACION_VIV, this.getCodigoTipoOcupacionViv(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoOcupacionViv(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_OCUPACION_VIV);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_OCUPACION_VIV, this.getNumeroTipoOcupacionViv(rowKey));
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
