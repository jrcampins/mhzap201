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
import com.egt.data.general.xdp1.PaginaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PaginaCachedRowSetDataProvider2 extends PaginaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PaginaCachedRowSetDataProvider2() {
        super();
    }

    public PaginaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104200101L;

    public static final long FUNCION_GENERAR_PAGINA = 104200901L;
    public static final long FUNCION_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_CREAR_PAGINA = 104200102L;
    public static final long FUNCION_MODIFICAR_PAGINA = 104200103L;
    public static final long FUNCION_ELIMINAR_PAGINA = 104200104L;

    public static final String PROCESO_FUNCION_GENERAR_PAGINA = "pagina_generar";

    protected static final long PARAMETRO_ID_PAGINA = 1346L;
    protected static final long PARAMETRO_VERSION_PAGINA = 1576L;
    protected static final long PARAMETRO_CODIGO_PAGINA = 1177L;
    protected static final long PARAMETRO_NOMBRE_PAGINA = 1460L;
    protected static final long PARAMETRO_DESCRIPCION_PAGINA = 1231L;
    protected static final long PARAMETRO_URL_PAGINA = 1527L;
    protected static final long PARAMETRO_ID_APLICACION = 1295L;
    protected static final long PARAMETRO_ES_PUBLICA = 1274L;
    protected static final long PARAMETRO_NUMERO_TIPO_PAGINA = 1826L;
    protected static final long PARAMETRO_ID_DOMINIO = 1315L;
    protected static final long PARAMETRO_ID_DOMINIO_MAESTRO = 1828L;
    protected static final long PARAMETRO_ID_PARAMETRO = 1352L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_APLICACION = 104100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PAGINA = 104250101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PARAMETRO = 101100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_APLICACION = {"aplicacion", "id_aplicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PAGINA = {"tipo_pagina", "numero_tipo_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_DOMINIO = {"dominio", "id_dominio", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PARAMETRO = {"parametro", "id_parametro", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PAGINA) {
            this.consultarPagina(filtro);
            return;
        }
    }

    public void consultarPagina() throws ExcepcionAplicacion {
        this.consultarPagina(new FiltroBusqueda());
    }

    public void consultarPagina(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPagina(new FiltroBusqueda());
        } else {
            this.consultarPagina(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPagina(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PAGINA);
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
                comando += clausula + " id_pagina ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPagina() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PAGINA);
    }

    public void modificarPagina(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PAGINA);
    }

    public void modificarPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PAGINA);
    }

    public void eliminarPagina(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PAGINA);
    }

    public void eliminarPagina(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PAGINA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PAGINA) {
            this.posCrearPagina(rowKey);
            return;
        }
    }

    protected void posCrearPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PAGINA) {
            es = this.esFilaModificableConModificarPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPagina(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PAGINA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PAGINA) {
            this.posModificarPagina(rowKey);
            return;
        }
    }

    protected void posModificarPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PAGINA) {
            es = this.esFilaEliminableConEliminarPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPagina(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA) {
            this.preEliminarPagina(rowKey);
            return;
        }
    }

    protected void preEliminarPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PAGINA) {
            this.posEliminarPagina(rowKey);
            return;
        }
    }

    protected void posEliminarPagina(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PAGINA) {
            es = this.esFilaValidaParaCrearPagina(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA) {
            es = this.esFilaValidaParaModificarPagina(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPagina(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO_MAESTRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominioMaestro(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO_MAESTRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
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

    protected boolean esFilaValidaParaModificarPagina(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO_MAESTRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominioMaestro(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO_MAESTRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
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
        if (funcion == FUNCION_CREAR_PAGINA) {
            this.preCommitCrearPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PAGINA) {
            this.preCommitModificarPagina(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PAGINA) {
            this.preCommitEliminarPagina(rowKey);
            return;
        }
    }

    protected void preCommitCrearPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PAGINA);
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA, this.getVersionPagina(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PAGINA, this.getCodigoPagina(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PAGINA, this.getNombrePagina(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_PAGINA, this.getDescripcionPagina(rowKey));
        rastro.addParametro(PARAMETRO_URL_PAGINA, this.getUrlPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PAGINA, this.getNumeroTipoPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO_MAESTRO, this.getIdDominioMaestro(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PAGINA);
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PAGINA, this.getVersionPagina(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PAGINA, this.getCodigoPagina(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PAGINA, this.getNombrePagina(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_PAGINA, this.getDescripcionPagina(rowKey));
        rastro.addParametro(PARAMETRO_URL_PAGINA, this.getUrlPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PAGINA, this.getNumeroTipoPagina(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO_MAESTRO, this.getIdDominioMaestro(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPagina(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PAGINA);
        rastro.addParametro(PARAMETRO_ID_PAGINA, this.getIdPagina(rowKey));
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
        this.setVersionPagina(rowKey, 0L);
        this.setEsPublica(rowKey, 0);
    }
}
