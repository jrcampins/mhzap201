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
import com.egt.data.general.xdp1.TipoComparacionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoComparacionCachedRowSetDataProvider2 extends TipoComparacionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoComparacionCachedRowSetDataProvider2() {
        super();
    }

    public TipoComparacionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 103500101L;

    public static final long FUNCION_CONSULTAR_TIPO_COMPARACION = 103500101L;
    public static final long FUNCION_CREAR_TIPO_COMPARACION = 103500102L;
    public static final long FUNCION_MODIFICAR_TIPO_COMPARACION = 103500103L;
    public static final long FUNCION_ELIMINAR_TIPO_COMPARACION = 103500104L;

    protected static final long PARAMETRO_NUMERO_TIPO_COMPARACION = 1485L;
    protected static final long PARAMETRO_CODIGO_TIPO_COMPARACION = 1188L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_COMPARACION) {
            this.consultarTipoComparacion(filtro);
            return;
        }
    }

    public void consultarTipoComparacion() throws ExcepcionAplicacion {
        this.consultarTipoComparacion(new FiltroBusqueda());
    }

    public void consultarTipoComparacion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoComparacion(new FiltroBusqueda());
        } else {
            this.consultarTipoComparacion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoComparacion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_COMPARACION);
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
                comando += clausula + " numero_tipo_comparacion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoComparacion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_COMPARACION);
    }

    public void modificarTipoComparacion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_COMPARACION);
    }

    public void modificarTipoComparacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_COMPARACION);
    }

    public void eliminarTipoComparacion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_COMPARACION);
    }

    public void eliminarTipoComparacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_COMPARACION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_COMPARACION) {
            this.posCrearTipoComparacion(rowKey);
            return;
        }
    }

    protected void posCrearTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_COMPARACION) {
            es = this.esFilaModificableConModificarTipoComparacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoComparacion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_COMPARACION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_COMPARACION) {
            this.posModificarTipoComparacion(rowKey);
            return;
        }
    }

    protected void posModificarTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_COMPARACION) {
            es = this.esFilaEliminableConEliminarTipoComparacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoComparacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_COMPARACION) {
            this.preEliminarTipoComparacion(rowKey);
            return;
        }
    }

    protected void preEliminarTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_COMPARACION) {
            this.posEliminarTipoComparacion(rowKey);
            return;
        }
    }

    protected void posEliminarTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_COMPARACION) {
            es = this.esFilaValidaParaCrearTipoComparacion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_COMPARACION) {
            es = this.esFilaValidaParaModificarTipoComparacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoComparacion(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoComparacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_COMPARACION) {
            this.preCommitCrearTipoComparacion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_COMPARACION) {
            this.preCommitModificarTipoComparacion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_COMPARACION) {
            this.preCommitEliminarTipoComparacion(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_COMPARACION);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMPARACION, this.getNumeroTipoComparacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_COMPARACION, this.getCodigoTipoComparacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_COMPARACION);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMPARACION, this.getNumeroTipoComparacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_COMPARACION, this.getCodigoTipoComparacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoComparacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_COMPARACION);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMPARACION, this.getNumeroTipoComparacion(rowKey));
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
