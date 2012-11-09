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
import com.egt.data.general.xdp1.PaginaFuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PaginaFuncionCachedRowSetDataProvider2 extends PaginaFuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PaginaFuncionCachedRowSetDataProvider2() {
        super();
    }

    public PaginaFuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104300101L;

    public static final long FUNCION_CONSULTAR_PAGINA_FUNCION = 104300101L;
    public static final long FUNCION_CREAR_PAGINA_FUNCION = 104300102L;
    public static final long FUNCION_MODIFICAR_PAGINA_FUNCION = 104300103L;
    public static final long FUNCION_ELIMINAR_PAGINA_FUNCION = 104300104L;

    protected static final long PARAMETRO_ID_PAGINA_FUNCION = 1348L;
    protected static final long PARAMETRO_VERSION_PAGINA_FUNCION = 1577L;
    protected static final long PARAMETRO_ID_PAGINA = 1346L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_ES_FUNCION_INICIAL = 1253L;
    protected static final long PARAMETRO_CONTROL_PAGINA_FUNCION = 1209L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PAGINA_FUNCION) {
            this.consultarPaginaFuncion(filtro);
            return;
        }
    }

    public void consultarPaginaFuncion() throws ExcepcionAplicacion {
        this.consultarPaginaFuncion(new FiltroBusqueda());
    }

    public void consultarPaginaFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPaginaFuncion(new FiltroBusqueda());
        } else {
            this.consultarPaginaFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPaginaFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PAGINA_FUNCION);
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
                comando += clausula + " id_pagina_funcion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPaginaFuncion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PAGINA_FUNCION);
    }

    public void modificarPaginaFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PAGINA_FUNCION);
    }

    public void modificarPaginaFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PAGINA_FUNCION);
    }

    public void eliminarPaginaFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PAGINA_FUNCION);
    }

    public void eliminarPaginaFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PAGINA_FUNCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PAGINA_FUNCION) {
            this.posCrearPaginaFuncion(rowKey);
            return;
        }
    }

    protected void posCrearPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PAGINA_FUNCION) {
            es = this.esFilaModificableConModificarPaginaFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPaginaFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PAGINA_FUNCION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PAGINA_FUNCION) {
            this.posModificarPaginaFuncion(rowKey);
            return;
        }
    }

    protected void posModificarPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PAGINA_FUNCION) {
            es = this.esFilaEliminableConEliminarPaginaFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPaginaFuncion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA_FUNCION) {
            this.preEliminarPaginaFuncion(rowKey);
            return;
        }
    }

    protected void preEliminarPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA_FUNCION) {
            this.posEliminarPaginaFuncion(rowKey);
            return;
        }
    }

    protected void posEliminarPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PAGINA_FUNCION) {
            es = this.esFilaValidaParaCrearPaginaFuncion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA_FUNCION) {
            es = this.esFilaValidaParaModificarPaginaFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPaginaFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    protected boolean esFilaValidaParaModificarPaginaFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PAGINA_FUNCION) {
            this.preCommitCrearPaginaFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA_FUNCION) {
            this.preCommitModificarPaginaFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PAGINA_FUNCION) {
            this.preCommitEliminarPaginaFuncion(rowKey);
            return;
        }
    }

    protected void preCommitCrearPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PAGINA_FUNCION);
        rastro.addParametro(PARAMETRO_ID_PAGINA_FUNCION, this.getIdPaginaFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA_FUNCION, this.getVersionPaginaFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_FUNCION_INICIAL, this.getEsFuncionInicial(rowKey));
        rastro.addParametro(PARAMETRO_CONTROL_PAGINA_FUNCION, this.getControlPaginaFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PAGINA_FUNCION);
        rastro.addParametro(PARAMETRO_ID_PAGINA_FUNCION, this.getIdPaginaFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA_FUNCION, this.getVersionPaginaFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_FUNCION_INICIAL, this.getEsFuncionInicial(rowKey));
        rastro.addParametro(PARAMETRO_CONTROL_PAGINA_FUNCION, this.getControlPaginaFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPaginaFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PAGINA_FUNCION);
        rastro.addParametro(PARAMETRO_ID_PAGINA_FUNCION, this.getIdPaginaFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionPaginaFuncion(rowKey, 0L);
        this.setEsFuncionInicial(rowKey, 0);
    }
}
