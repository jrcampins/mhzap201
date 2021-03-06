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
import com.egt.data.general.xdp1.ParametroCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ParametroCachedRowSetDataProvider2 extends ParametroCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ParametroCachedRowSetDataProvider2() {
        super();
    }

    public ParametroCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 101100101L;

    public static final long FUNCION_CONSULTAR_PARAMETRO = 101100101L;
    public static final long FUNCION_CREAR_PARAMETRO = 101100102L;
    public static final long FUNCION_MODIFICAR_PARAMETRO = 101100103L;
    public static final long FUNCION_ELIMINAR_PARAMETRO = 101100104L;

    protected static final long PARAMETRO_ID_PARAMETRO = 1352L;
    protected static final long PARAMETRO_VERSION_PARAMETRO = 1579L;
    protected static final long PARAMETRO_CODIGO_PARAMETRO = 1179L;
    protected static final long PARAMETRO_NOMBRE_PARAMETRO = 1461L;
    protected static final long PARAMETRO_DETALLE_PARAMETRO = 1230L;
    protected static final long PARAMETRO_DESCRIPCION_PARAMETRO = 1232L;
    protected static final long PARAMETRO_NUMERO_TIPO_DATO_PAR = 1488L;
    protected static final long PARAMETRO_ALIAS_PARAMETRO = 1012L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_DATO_PAR = 101300101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_DATO_PAR = {"tipo_dato_par", "numero_tipo_dato_par", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PARAMETRO) {
            this.consultarParametro(filtro);
            return;
        }
    }

    public void consultarParametro() throws ExcepcionAplicacion {
        this.consultarParametro(new FiltroBusqueda());
    }

    public void consultarParametro(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarParametro(new FiltroBusqueda());
        } else {
            this.consultarParametro(new FiltroBusqueda(filtro));
        }
    }

    public void consultarParametro(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PARAMETRO);
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
                comando += clausula + " id_parametro ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearParametro() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PARAMETRO);
    }

    public void modificarParametro(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PARAMETRO);
    }

    public void modificarParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PARAMETRO);
    }

    public void eliminarParametro(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PARAMETRO);
    }

    public void eliminarParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PARAMETRO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PARAMETRO) {
            this.posCrearParametro(rowKey);
            return;
        }
    }

    protected void posCrearParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PARAMETRO) {
            es = this.esFilaModificableConModificarParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarParametro(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PARAMETRO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PARAMETRO) {
            this.posModificarParametro(rowKey);
            return;
        }
    }

    protected void posModificarParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PARAMETRO) {
            es = this.esFilaEliminableConEliminarParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PARAMETRO) {
            this.preEliminarParametro(rowKey);
            return;
        }
    }

    protected void preEliminarParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PARAMETRO) {
            this.posEliminarParametro(rowKey);
            return;
        }
    }

    protected void posEliminarParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PARAMETRO) {
            es = this.esFilaValidaParaCrearParametro(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PARAMETRO) {
            es = this.esFilaValidaParaModificarParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearParametro(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PARAMETRO) {
            this.preCommitCrearParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PARAMETRO) {
            this.preCommitModificarParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PARAMETRO) {
            this.preCommitEliminarParametro(rowKey);
            return;
        }
    }

    protected void preCommitCrearParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PARAMETRO, this.getVersionParametro(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PARAMETRO, this.getCodigoParametro(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PARAMETRO, this.getNombreParametro(rowKey));
        rastro.addParametro(PARAMETRO_DETALLE_PARAMETRO, this.getDetalleParametro(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_PARAMETRO, this.getDescripcionParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DATO_PAR, this.getNumeroTipoDatoPar(rowKey));
        rastro.addParametro(PARAMETRO_ALIAS_PARAMETRO, this.getAliasParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PARAMETRO, this.getVersionParametro(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PARAMETRO, this.getCodigoParametro(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PARAMETRO, this.getNombreParametro(rowKey));
        rastro.addParametro(PARAMETRO_DETALLE_PARAMETRO, this.getDetalleParametro(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_PARAMETRO, this.getDescripcionParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DATO_PAR, this.getNumeroTipoDatoPar(rowKey));
        rastro.addParametro(PARAMETRO_ALIAS_PARAMETRO, this.getAliasParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
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
        this.setVersionParametro(rowKey, 0L);
    }
}
