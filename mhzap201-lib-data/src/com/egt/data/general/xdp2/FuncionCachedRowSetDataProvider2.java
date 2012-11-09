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
import com.egt.data.general.xdp1.FuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FuncionCachedRowSetDataProvider2 extends FuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FuncionCachedRowSetDataProvider2() {
        super();
    }

    public FuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 103100101L;

    public static final long FUNCION_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_CREAR_FUNCION = 103100102L;
    public static final long FUNCION_MODIFICAR_FUNCION = 103100103L;
    public static final long FUNCION_ELIMINAR_FUNCION = 103100104L;

    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_VERSION_FUNCION = 1560L;
    protected static final long PARAMETRO_CODIGO_FUNCION = 1083L;
    protected static final long PARAMETRO_NOMBRE_FUNCION = 1422L;
    protected static final long PARAMETRO_DESCRIPCION_FUNCION = 1225L;
    protected static final long PARAMETRO_NUMERO_TIPO_FUNCION = 1492L;
    protected static final long PARAMETRO_NUMERO_TIPO_RASTRO_FUN = 1499L;
    protected static final long PARAMETRO_ID_DOMINIO = 1315L;
    protected static final long PARAMETRO_CLAUSULA_WHERE = 1002L;
    protected static final long PARAMETRO_CLAUSULA_ORDER = 1001L;
    protected static final long PARAMETRO_ES_PUBLICA = 1274L;
    protected static final long PARAMETRO_ES_PROGRAMATICA = 1270L;
    protected static final long PARAMETRO_ES_PERSONALIZADA = 1269L;
    protected static final long PARAMETRO_ES_SEGMENTADA = 1280L;
    protected static final long PARAMETRO_ID_GRUPO_PROCESO = 1333L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_FUNCION = 103200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_RASTRO_FUN = 103300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_GRUPO_PROCESO = 107500101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_FUNCION = {"tipo_funcion", "numero_tipo_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_RASTRO_FUN = {"tipo_rastro_fun", "numero_tipo_rastro_fun", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_DOMINIO = {"dominio", "id_dominio", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_GRUPO_PROCESO = {"grupo_proceso", "id_grupo_proceso", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FUNCION) {
            this.consultarFuncion(filtro);
            return;
        }
    }

    public void consultarFuncion() throws ExcepcionAplicacion {
        this.consultarFuncion(new FiltroBusqueda());
    }

    public void consultarFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFuncion(new FiltroBusqueda());
        } else {
            this.consultarFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FUNCION);
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
                comando += clausula + " id_funcion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFuncion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FUNCION);
    }

    public void modificarFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FUNCION);
    }

    public void modificarFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FUNCION);
    }

    public void eliminarFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FUNCION);
    }

    public void eliminarFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FUNCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FUNCION) {
            this.posCrearFuncion(rowKey);
            return;
        }
    }

    protected void posCrearFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FUNCION) {
            es = this.esFilaModificableConModificarFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FUNCION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FUNCION) {
            this.posModificarFuncion(rowKey);
            return;
        }
    }

    protected void posModificarFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FUNCION) {
            es = this.esFilaEliminableConEliminarFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFuncion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCION) {
            this.preEliminarFuncion(rowKey);
            return;
        }
    }

    protected void preEliminarFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCION) {
            this.posEliminarFuncion(rowKey);
            return;
        }
    }

    protected void posEliminarFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FUNCION) {
            es = this.esFilaValidaParaCrearFuncion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCION) {
            es = this.esFilaValidaParaModificarFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_PROCESO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoProceso(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_PROCESO, STRINGS_REFERENCIA_CONSULTAR_GRUPO_PROCESO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_PROCESO + ">");
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

    protected boolean esFilaValidaParaModificarFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_PROCESO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoProceso(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_PROCESO, STRINGS_REFERENCIA_CONSULTAR_GRUPO_PROCESO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_PROCESO + ">");
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
        if (funcion == FUNCION_CREAR_FUNCION) {
            this.preCommitCrearFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCION) {
            this.preCommitModificarFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FUNCION) {
            this.preCommitEliminarFuncion(rowKey);
            return;
        }
    }

    protected void preCommitCrearFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCION, this.getVersionFuncion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FUNCION, this.getCodigoFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FUNCION, this.getNombreFuncion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_FUNCION, this.getDescripcionFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_FUNCION, this.getNumeroTipoFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RASTRO_FUN, this.getNumeroTipoRastroFun(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_CLAUSULA_WHERE, this.getClausulaWhere(rowKey));
        rastro.addParametro(PARAMETRO_CLAUSULA_ORDER, this.getClausulaOrder(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_ES_PROGRAMATICA, this.getEsProgramatica(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONALIZADA, this.getEsPersonalizada(rowKey));
        rastro.addParametro(PARAMETRO_ES_SEGMENTADA, this.getEsSegmentada(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_PROCESO, this.getIdGrupoProceso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCION, this.getVersionFuncion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FUNCION, this.getCodigoFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FUNCION, this.getNombreFuncion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_FUNCION, this.getDescripcionFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_FUNCION, this.getNumeroTipoFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RASTRO_FUN, this.getNumeroTipoRastroFun(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_CLAUSULA_WHERE, this.getClausulaWhere(rowKey));
        rastro.addParametro(PARAMETRO_CLAUSULA_ORDER, this.getClausulaOrder(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_ES_PROGRAMATICA, this.getEsProgramatica(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONALIZADA, this.getEsPersonalizada(rowKey));
        rastro.addParametro(PARAMETRO_ES_SEGMENTADA, this.getEsSegmentada(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_PROCESO, this.getIdGrupoProceso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
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
        this.setVersionFuncion(rowKey, 0L);
        this.setNumeroTipoRastroFun(rowKey, 0);
        this.setEsPublica(rowKey, 0);
        this.setEsProgramatica(rowKey, 0);
        this.setEsPersonalizada(rowKey, 0);
        this.setEsSegmentada(rowKey, 0);
    }
}
