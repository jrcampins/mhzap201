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
import com.egt.data.general.xdp1.PaginaUsuarioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PaginaUsuarioCachedRowSetDataProvider2 extends PaginaUsuarioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PaginaUsuarioCachedRowSetDataProvider2() {
        super();
    }

    public PaginaUsuarioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104400101L;

    public static final long FUNCION_CONSULTAR_PAGINA_USUARIO = 104400101L;
    public static final long FUNCION_CREAR_PAGINA_USUARIO = 104400102L;
    public static final long FUNCION_MODIFICAR_PAGINA_USUARIO = 104400103L;
    public static final long FUNCION_ELIMINAR_PAGINA_USUARIO = 104400104L;

    protected static final long PARAMETRO_ID_PAGINA_USUARIO = 1350L;
    protected static final long PARAMETRO_VERSION_PAGINA_USUARIO = 1619L;
    protected static final long PARAMETRO_ID_PAGINA = 1346L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PAGINA_USUARIO) {
            this.consultarPaginaUsuario(filtro);
            return;
        }
    }

    public void consultarPaginaUsuario() throws ExcepcionAplicacion {
        this.consultarPaginaUsuario(new FiltroBusqueda());
    }

    public void consultarPaginaUsuario(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPaginaUsuario(new FiltroBusqueda());
        } else {
            this.consultarPaginaUsuario(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPaginaUsuario(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PAGINA_USUARIO);
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            Long propietario = TLC.getControlador().getPropietarioAutorizado();
            if (propietario != null) {
                filtro.addCriterio(COLUMNA_PROPIETARIO_RECURSO, EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
            }
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " id_pagina_usuario ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPaginaUsuario() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PAGINA_USUARIO);
    }

    public void modificarPaginaUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PAGINA_USUARIO);
    }

    public void modificarPaginaUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PAGINA_USUARIO);
    }

    public void eliminarPaginaUsuario(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PAGINA_USUARIO);
    }

    public void eliminarPaginaUsuario(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PAGINA_USUARIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PAGINA_USUARIO) {
            this.posCrearPaginaUsuario(rowKey);
            return;
        }
    }

    protected void posCrearPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        this.setPropietarioRecurso(rowKey, TLC.getControlador().getUsuario().getIdUsuario());
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PAGINA_USUARIO) {
            es = this.esFilaModificableConModificarPaginaUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPaginaUsuario(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PAGINA_USUARIO);
            if (es) {
                es = this.esFilaRecursoPropio(rowKey, FUNCION_MODIFICAR_PAGINA_USUARIO);
            }
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PAGINA_USUARIO) {
            this.posModificarPaginaUsuario(rowKey);
            return;
        }
    }

    protected void posModificarPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PAGINA_USUARIO) {
            es = this.esFilaEliminableConEliminarPaginaUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPaginaUsuario(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_ELIMINAR_PAGINA_USUARIO);
        }
        return es;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA_USUARIO) {
            this.preEliminarPaginaUsuario(rowKey);
            return;
        }
    }

    protected void preEliminarPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA_USUARIO) {
            this.posEliminarPaginaUsuario(rowKey);
            return;
        }
    }

    protected void posEliminarPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PAGINA_USUARIO) {
            es = this.esFilaValidaParaCrearPaginaUsuario(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA_USUARIO) {
            es = this.esFilaValidaParaModificarPaginaUsuario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPaginaUsuario(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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

    protected boolean esFilaValidaParaModificarPaginaUsuario(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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
        if (funcion == FUNCION_CREAR_PAGINA_USUARIO) {
            this.preCommitCrearPaginaUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA_USUARIO) {
            this.preCommitModificarPaginaUsuario(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PAGINA_USUARIO) {
            this.preCommitEliminarPaginaUsuario(rowKey);
            return;
        }
    }

    protected void preCommitCrearPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PAGINA_USUARIO);
        rastro.addParametro(PARAMETRO_ID_PAGINA_USUARIO, this.getIdPaginaUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA_USUARIO, this.getVersionPaginaUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PAGINA_USUARIO);
        rastro.addParametro(PARAMETRO_ID_PAGINA_USUARIO, this.getIdPaginaUsuario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA_USUARIO, this.getVersionPaginaUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPaginaUsuario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PAGINA_USUARIO);
        rastro.addParametro(PARAMETRO_ID_PAGINA_USUARIO, this.getIdPaginaUsuario(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setIdPropietarioRecurso(this.getPropietarioRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionPaginaUsuario(rowKey, 0L);
    }
}
