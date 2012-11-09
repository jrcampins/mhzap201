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
import com.egt.data.general.xdp1.OpcionMenuCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class OpcionMenuCachedRowSetDataProvider2 extends OpcionMenuCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public OpcionMenuCachedRowSetDataProvider2() {
        super();
    }

    public OpcionMenuCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 105100101L;

    public static final long FUNCION_DESACTIVAR_OPCION_MENU = 105100105L;
    public static final long FUNCION_REACTIVAR_OPCION_MENU = 105100106L;
    public static final long FUNCION_RECONSTRUIR_OPCION_MENU = 105100151L;
    public static final long FUNCION_CONSULTAR_OPCION_MENU = 105100101L;
    public static final long FUNCION_CREAR_OPCION_MENU = 105100102L;
    public static final long FUNCION_MODIFICAR_OPCION_MENU = 105100103L;
    public static final long FUNCION_ELIMINAR_OPCION_MENU = 105100104L;

    public static final String PROCESO_FUNCION_DESACTIVAR_OPCION_MENU = "opcion_menu_desactivar";
    public static final String PROCESO_FUNCION_REACTIVAR_OPCION_MENU = "opcion_menu_reactivar";
    public static final String PROCESO_FUNCION_RECONSTRUIR_OPCION_MENU = "opcion_menu_reconstruir";

    protected static final long PARAMETRO_ID_OPCION_MENU = 1343L;
    protected static final long PARAMETRO_ES_OPCION_MENU_INACTIVA = 1262L;
    protected static final long PARAMETRO_NUMERO_TIPO_NODO = 1495L;
    protected static final long PARAMETRO_NUMERO_NIVEL_OPCION_MENU = 1479L;
    protected static final long PARAMETRO_SECUENCIA_OPCION_MENU = 1513L;
    protected static final long PARAMETRO_CLAVE_OPCION_MENU = 1003L;
    protected static final long PARAMETRO_VERSION_OPCION_MENU = 1573L;
    protected static final long PARAMETRO_CODIGO_OPCION_MENU = 1156L;
    protected static final long PARAMETRO_NOMBRE_OPCION_MENU = 1444L;
    protected static final long PARAMETRO_DESCRIPCION_OPCION_MENU = 1229L;
    protected static final long PARAMETRO_URL_OPCION_MENU = 1526L;
    protected static final long PARAMETRO_ID_APLICACION = 1295L;
    protected static final long PARAMETRO_ID_PAGINA = 1346L;
    protected static final long PARAMETRO_ID_OPCION_MENU_SUPERIOR = 1344L;
    protected static final long PARAMETRO_ES_OPCION_MENU_SINCRONIZADA = 1241L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_NODO = 100300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_NIVEL_OPCION_MENU = 105300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_APLICACION = 104100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_MENU = 105100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_NODO = {"tipo_nodo", "numero_tipo_nodo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_NIVEL_OPCION_MENU = {"nivel_opcion_menu", "numero_nivel_opcion_menu", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_APLICACION = {"aplicacion", "id_aplicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_MENU = {"opcion_menu", "id_opcion_menu", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_OPCION_MENU) {
            this.consultarOpcionMenu(filtro);
            return;
        }
    }

    public void consultarOpcionMenu() throws ExcepcionAplicacion {
        this.consultarOpcionMenu(new FiltroBusqueda());
    }

    public void consultarOpcionMenu(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarOpcionMenu(new FiltroBusqueda());
        } else {
            this.consultarOpcionMenu(new FiltroBusqueda(filtro));
        }
    }

    public void consultarOpcionMenu(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_OPCION_MENU);
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
                comando += clausula + " id_opcion_menu ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearOpcionMenu() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_OPCION_MENU);
    }

    public void modificarOpcionMenu(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_OPCION_MENU);
    }

    public void modificarOpcionMenu(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_OPCION_MENU);
    }

    public void eliminarOpcionMenu(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_OPCION_MENU);
    }

    public void eliminarOpcionMenu(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_OPCION_MENU);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_OPCION_MENU) {
            this.posCrearOpcionMenu(rowKey);
            return;
        }
    }

    protected void posCrearOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_OPCION_MENU) {
            es = this.esFilaModificableConModificarOpcionMenu(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarOpcionMenu(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_OPCION_MENU);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_OPCION_MENU) {
            this.posModificarOpcionMenu(rowKey);
            return;
        }
    }

    protected void posModificarOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_OPCION_MENU) {
            es = this.esFilaEliminableConEliminarOpcionMenu(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarOpcionMenu(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_OPCION_MENU) {
            this.preEliminarOpcionMenu(rowKey);
            return;
        }
    }

    protected void preEliminarOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_OPCION_MENU) {
            this.posEliminarOpcionMenu(rowKey);
            return;
        }
    }

    protected void posEliminarOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_OPCION_MENU) {
            es = this.esFilaValidaParaCrearOpcionMenu(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_OPCION_MENU) {
            es = this.esFilaValidaParaModificarOpcionMenu(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearOpcionMenu(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_APLICACION, STRINGS_REFERENCIA_CONSULTAR_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_APLICACION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_OPCION_MENU_SUPERIOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdOpcionMenuSuperior(rowKey), FUNCION_REFERENCIA_CONSULTAR_OPCION_MENU, STRINGS_REFERENCIA_CONSULTAR_OPCION_MENU);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_OPCION_MENU_SUPERIOR + ">");
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

    protected boolean esFilaValidaParaModificarOpcionMenu(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_APLICACION, STRINGS_REFERENCIA_CONSULTAR_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_APLICACION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_OPCION_MENU_SUPERIOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdOpcionMenuSuperior(rowKey), FUNCION_REFERENCIA_CONSULTAR_OPCION_MENU, STRINGS_REFERENCIA_CONSULTAR_OPCION_MENU);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_OPCION_MENU_SUPERIOR + ">");
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
        if (funcion == FUNCION_CREAR_OPCION_MENU) {
            this.preCommitCrearOpcionMenu(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_OPCION_MENU) {
            this.preCommitModificarOpcionMenu(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_OPCION_MENU) {
            this.preCommitEliminarOpcionMenu(rowKey);
            return;
        }
    }

    protected void preCommitCrearOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_OPCION_MENU);
        rastro.addParametro(PARAMETRO_ID_OPCION_MENU, this.getIdOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_OPCION_MENU, this.getVersionOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_MENU, this.getCodigoOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_OPCION_MENU, this.getNombreOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_OPCION_MENU, this.getDescripcionOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_URL_OPCION_MENU, this.getUrlOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_OPCION_MENU_SUPERIOR, this.getIdOpcionMenuSuperior(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_OPCION_MENU, this.getNumeroNivelOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_SECUENCIA_OPCION_MENU, this.getSecuenciaOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_CLAVE_OPCION_MENU, this.getClaveOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_ES_OPCION_MENU_INACTIVA, this.getEsOpcionMenuInactiva(rowKey));
        rastro.addParametro(PARAMETRO_ES_OPCION_MENU_SINCRONIZADA, this.getEsOpcionMenuSincronizada(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_OPCION_MENU);
        rastro.addParametro(PARAMETRO_ID_OPCION_MENU, this.getIdOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_OPCION_MENU, this.getVersionOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_MENU, this.getCodigoOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_OPCION_MENU, this.getNombreOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_OPCION_MENU, this.getDescripcionOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_URL_OPCION_MENU, this.getUrlOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_OPCION_MENU_SUPERIOR, this.getIdOpcionMenuSuperior(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_OPCION_MENU, this.getNumeroNivelOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_SECUENCIA_OPCION_MENU, this.getSecuenciaOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_CLAVE_OPCION_MENU, this.getClaveOpcionMenu(rowKey));
        rastro.addParametro(PARAMETRO_ES_OPCION_MENU_INACTIVA, this.getEsOpcionMenuInactiva(rowKey));
        rastro.addParametro(PARAMETRO_ES_OPCION_MENU_SINCRONIZADA, this.getEsOpcionMenuSincronizada(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarOpcionMenu(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_OPCION_MENU);
        rastro.addParametro(PARAMETRO_ID_OPCION_MENU, this.getIdOpcionMenu(rowKey));
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
        this.setVersionOpcionMenu(rowKey, 0L);
        this.setEsOpcionMenuInactiva(rowKey, 0);
        this.setEsOpcionMenuSincronizada(rowKey, 0);
    }
}
