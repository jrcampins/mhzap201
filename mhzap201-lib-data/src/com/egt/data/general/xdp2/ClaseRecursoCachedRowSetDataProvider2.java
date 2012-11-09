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
import com.egt.data.general.xdp1.ClaseRecursoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ClaseRecursoCachedRowSetDataProvider2 extends ClaseRecursoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ClaseRecursoCachedRowSetDataProvider2() {
        super();
    }

    public ClaseRecursoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102100101L;

    public static final long FUNCION_CONSULTAR_CLASE_RECURSO = 102100101L;
    public static final long FUNCION_CREAR_CLASE_RECURSO = 102100102L;
    public static final long FUNCION_MODIFICAR_CLASE_RECURSO = 102100103L;
    public static final long FUNCION_ELIMINAR_CLASE_RECURSO = 102100104L;

    protected static final long PARAMETRO_ID_CLASE_RECURSO = 1303L;
    protected static final long PARAMETRO_VERSION_CLASE_RECURSO = 1542L;
    protected static final long PARAMETRO_CODIGO_CLASE_RECURSO = 1056L;
    protected static final long PARAMETRO_NOMBRE_CLASE_RECURSO = 1394L;
    protected static final long PARAMETRO_DESCRIPCION_CLASE_RECURSO = 1216L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_INDEPENDIENTE = 1831L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_SIN_DETALLE = 1881L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_CON_ARBOL = 1880L;
    protected static final long PARAMETRO_NUMERO_TIPO_CLASE_RECURSO = 1501L;
    protected static final long PARAMETRO_NUMERO_TIPO_RECURSO = 1500L;
    protected static final long PARAMETRO_ID_FUNCION_SELECCION = 1331L;
    protected static final long PARAMETRO_ID_PAGINA_SELECCION = 1349L;
    protected static final long PARAMETRO_ID_PAGINA_DETALLE = 1347L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_MAESTRO = 1832L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_SEGMENTO = 1304L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_BASE = 1302L;
    protected static final long PARAMETRO_ID_GRUPO_APLICACION = 1332L;
    protected static final long PARAMETRO_ID_APLICACION_WEB = 1297L;
    protected static final long PARAMETRO_LIMITE_FILAS_CONSULTA = 1946L;
    protected static final long PARAMETRO_LIMITE_FILAS_INFORME = 1947L;
    protected static final long PARAMETRO_ORDEN_PRESENTACION = 1966L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_INSERTABLE = 1974L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_MODIFICABLE = 1975L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_ELIMINABLE = 1973L;
    protected static final long PARAMETRO_ES_CLASE_RECURSO_EXTENDIDA = 1976L;
    protected static final long PARAMETRO_ETIQUETA_HIPERVINCULO = 1984L;
    protected static final long PARAMETRO_ES_ENUMERADOR_CON_NUMERO = 20617L;
    protected static final long PARAMETRO_ALIAS_CLASE_RECURSO = 1011L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_CLASE_RECURSO = 102150101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_RECURSO = 102200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO = 102100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION = 104500101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_CLASE_RECURSO = {"tipo_clase_recurso", "numero_tipo_clase_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_RECURSO = {"tipo_recurso", "numero_tipo_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO = {"clase_recurso", "id_clase_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION = {"grupo_aplicacion", "id_grupo_aplicacion", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_CLASE_RECURSO) {
            this.consultarClaseRecurso(filtro);
            return;
        }
    }

    public void consultarClaseRecurso() throws ExcepcionAplicacion {
        this.consultarClaseRecurso(new FiltroBusqueda());
    }

    public void consultarClaseRecurso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarClaseRecurso(new FiltroBusqueda());
        } else {
            this.consultarClaseRecurso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarClaseRecurso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CLASE_RECURSO);
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
                comando += clausula + " id_clase_recurso ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearClaseRecurso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CLASE_RECURSO);
    }

    public void modificarClaseRecurso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CLASE_RECURSO);
    }

    public void modificarClaseRecurso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CLASE_RECURSO);
    }

    public void eliminarClaseRecurso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CLASE_RECURSO);
    }

    public void eliminarClaseRecurso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CLASE_RECURSO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CLASE_RECURSO) {
            this.posCrearClaseRecurso(rowKey);
            return;
        }
    }

    protected void posCrearClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CLASE_RECURSO) {
            es = this.esFilaModificableConModificarClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarClaseRecurso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CLASE_RECURSO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CLASE_RECURSO) {
            this.posModificarClaseRecurso(rowKey);
            return;
        }
    }

    protected void posModificarClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CLASE_RECURSO) {
            es = this.esFilaEliminableConEliminarClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarClaseRecurso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_RECURSO) {
            this.preEliminarClaseRecurso(rowKey);
            return;
        }
    }

    protected void preEliminarClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CLASE_RECURSO) {
            this.posEliminarClaseRecurso(rowKey);
            return;
        }
    }

    protected void posEliminarClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CLASE_RECURSO) {
            es = this.esFilaValidaParaCrearClaseRecurso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_RECURSO) {
            es = this.esFilaValidaParaModificarClaseRecurso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearClaseRecurso(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaginaSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA_DETALLE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaginaDetalle(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA_DETALLE + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_MAESTRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoMaestro(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_MAESTRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_SEGMENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_BASE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoBase(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_BASE + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION, STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_APLICACION + ">");
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

    protected boolean esFilaValidaParaModificarClaseRecurso(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaginaSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA_DETALLE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaginaDetalle(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA_DETALLE + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_MAESTRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoMaestro(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_MAESTRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_SEGMENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_BASE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoBase(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_BASE + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION, STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_APLICACION + ">");
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
        if (funcion == FUNCION_CREAR_CLASE_RECURSO) {
            this.preCommitCrearClaseRecurso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CLASE_RECURSO) {
            this.preCommitModificarClaseRecurso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CLASE_RECURSO) {
            this.preCommitEliminarClaseRecurso(rowKey);
            return;
        }
    }

    protected void preCommitCrearClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_CLASE_RECURSO, this.getVersionClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_RECURSO, this.getCodigoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_CLASE_RECURSO, this.getNombreClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_CLASE_RECURSO, this.getDescripcionClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_INDEPENDIENTE, this.getEsClaseRecursoIndependiente(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_SIN_DETALLE, this.getEsClaseRecursoSinDetalle(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_CON_ARBOL, this.getEsClaseRecursoConArbol(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_CLASE_RECURSO, this.getNumeroTipoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RECURSO, this.getNumeroTipoRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_SELECCION, this.getIdFuncionSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA_SELECCION, this.getIdPaginaSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA_DETALLE, this.getIdPaginaDetalle(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_MAESTRO, this.getIdClaseRecursoMaestro(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_SEGMENTO, this.getIdClaseRecursoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_BASE, this.getIdClaseRecursoBase(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION_WEB, this.getIdAplicacionWeb(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_FILAS_CONSULTA, this.getLimiteFilasConsulta(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_FILAS_INFORME, this.getLimiteFilasInforme(rowKey));
        rastro.addParametro(PARAMETRO_ORDEN_PRESENTACION, this.getOrdenPresentacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_INSERTABLE, this.getEsClaseRecursoInsertable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_MODIFICABLE, this.getEsClaseRecursoModificable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_ELIMINABLE, this.getEsClaseRecursoEliminable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_EXTENDIDA, this.getEsClaseRecursoExtendida(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_HIPERVINCULO, this.getEtiquetaHipervinculo(rowKey));
        rastro.addParametro(PARAMETRO_ES_ENUMERADOR_CON_NUMERO, this.getEsEnumeradorConNumero(rowKey));
        rastro.addParametro(PARAMETRO_ALIAS_CLASE_RECURSO, this.getAliasClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_CLASE_RECURSO, this.getVersionClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CLASE_RECURSO, this.getCodigoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_CLASE_RECURSO, this.getNombreClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_CLASE_RECURSO, this.getDescripcionClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_INDEPENDIENTE, this.getEsClaseRecursoIndependiente(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_SIN_DETALLE, this.getEsClaseRecursoSinDetalle(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_CON_ARBOL, this.getEsClaseRecursoConArbol(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_CLASE_RECURSO, this.getNumeroTipoClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RECURSO, this.getNumeroTipoRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_SELECCION, this.getIdFuncionSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA_SELECCION, this.getIdPaginaSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAGINA_DETALLE, this.getIdPaginaDetalle(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_MAESTRO, this.getIdClaseRecursoMaestro(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_SEGMENTO, this.getIdClaseRecursoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_BASE, this.getIdClaseRecursoBase(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_APLICACION_WEB, this.getIdAplicacionWeb(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_FILAS_CONSULTA, this.getLimiteFilasConsulta(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_FILAS_INFORME, this.getLimiteFilasInforme(rowKey));
        rastro.addParametro(PARAMETRO_ORDEN_PRESENTACION, this.getOrdenPresentacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_INSERTABLE, this.getEsClaseRecursoInsertable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_MODIFICABLE, this.getEsClaseRecursoModificable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_ELIMINABLE, this.getEsClaseRecursoEliminable(rowKey));
        rastro.addParametro(PARAMETRO_ES_CLASE_RECURSO_EXTENDIDA, this.getEsClaseRecursoExtendida(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_HIPERVINCULO, this.getEtiquetaHipervinculo(rowKey));
        rastro.addParametro(PARAMETRO_ES_ENUMERADOR_CON_NUMERO, this.getEsEnumeradorConNumero(rowKey));
        rastro.addParametro(PARAMETRO_ALIAS_CLASE_RECURSO, this.getAliasClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarClaseRecurso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CLASE_RECURSO);
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
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
        this.setVersionClaseRecurso(rowKey, 0L);
        this.setEsClaseRecursoIndependiente(rowKey, 0);
        this.setEsClaseRecursoSinDetalle(rowKey, 0);
        this.setEsClaseRecursoConArbol(rowKey, 0);
        this.setNumeroTipoClaseRecurso(rowKey, 1);
        this.setEsClaseRecursoInsertable(rowKey, 1);
        this.setEsClaseRecursoModificable(rowKey, 1);
        this.setEsClaseRecursoEliminable(rowKey, 1);
        this.setEsClaseRecursoExtendida(rowKey, 0);
        this.setEsEnumeradorConNumero(rowKey, 0);
    }
}
