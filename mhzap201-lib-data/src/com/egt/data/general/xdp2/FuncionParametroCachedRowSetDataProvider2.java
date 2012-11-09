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
import com.egt.data.general.xdp1.FuncionParametroCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FuncionParametroCachedRowSetDataProvider2 extends FuncionParametroCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FuncionParametroCachedRowSetDataProvider2() {
        super();
    }

    public FuncionParametroCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 103400101L;

    public static final long FUNCION_CONSULTAR_FUNCION_PARAMETRO = 103400101L;
    public static final long FUNCION_CREAR_FUNCION_PARAMETRO = 103400102L;
    public static final long FUNCION_MODIFICAR_FUNCION_PARAMETRO = 103400103L;
    public static final long FUNCION_ELIMINAR_FUNCION_PARAMETRO = 103400104L;

    protected static final long PARAMETRO_ID_FUNCION_PARAMETRO = 1329L;
    protected static final long PARAMETRO_VERSION_FUNCION_PARAMETRO = 1562L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_ID_PARAMETRO = 1352L;
    protected static final long PARAMETRO_NUMERO_TIPO_PARAMETRO = 1496L;
    protected static final long PARAMETRO_NUMERO_TIPO_COMPARACION = 1485L;
    protected static final long PARAMETRO_ID_FUNCION_REFERENCIA = 1330L;
    protected static final long PARAMETRO_NUMERO_TIPO_VALOR = 1502L;
    protected static final long PARAMETRO_ID_LISTA_VALOR = 1334L;
    protected static final long PARAMETRO_ID_CLASE_OBJETO_VALOR = 1301L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_VALOR = 1305L;
    protected static final long PARAMETRO_VALOR_MINIMO = 1532L;
    protected static final long PARAMETRO_VALOR_MAXIMO = 1531L;
    protected static final long PARAMETRO_VALOR_OMISION = 1533L;
    protected static final long PARAMETRO_ES_PARAMETRO_SIN_RASTRO = 1264L;
    protected static final long PARAMETRO_ES_PARAMETRO_SEGMENTO = 1263L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PARAMETRO = 101100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PARAMETRO = 101200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_COMPARACION = 103500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_VALOR = 100500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO = 102100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PARAMETRO = {"parametro", "id_parametro", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PARAMETRO = {"tipo_parametro", "numero_tipo_parametro", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_COMPARACION = {"tipo_comparacion", "numero_tipo_comparacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_VALOR = {"tipo_valor", "numero_tipo_valor", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO = {"clase_recurso", "id_clase_recurso", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_FUNCION_PARAMETRO) {
            this.consultarFuncionParametro(filtro);
            return;
        }
    }

    public void consultarFuncionParametro() throws ExcepcionAplicacion {
        this.consultarFuncionParametro(new FiltroBusqueda());
    }

    public void consultarFuncionParametro(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFuncionParametro(new FiltroBusqueda());
        } else {
            this.consultarFuncionParametro(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFuncionParametro(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FUNCION_PARAMETRO);
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
                comando += clausula + " id_funcion_parametro ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFuncionParametro() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FUNCION_PARAMETRO);
    }

    public void modificarFuncionParametro(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FUNCION_PARAMETRO);
    }

    public void modificarFuncionParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FUNCION_PARAMETRO);
    }

    public void eliminarFuncionParametro(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FUNCION_PARAMETRO);
    }

    public void eliminarFuncionParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FUNCION_PARAMETRO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FUNCION_PARAMETRO) {
            this.posCrearFuncionParametro(rowKey);
            return;
        }
    }

    protected void posCrearFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FUNCION_PARAMETRO) {
            es = this.esFilaModificableConModificarFuncionParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFuncionParametro(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FUNCION_PARAMETRO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FUNCION_PARAMETRO) {
            this.posModificarFuncionParametro(rowKey);
            return;
        }
    }

    protected void posModificarFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FUNCION_PARAMETRO) {
            es = this.esFilaEliminableConEliminarFuncionParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFuncionParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCION_PARAMETRO) {
            this.preEliminarFuncionParametro(rowKey);
            return;
        }
    }

    protected void preEliminarFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCION_PARAMETRO) {
            this.posEliminarFuncionParametro(rowKey);
            return;
        }
    }

    protected void posEliminarFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FUNCION_PARAMETRO) {
            es = this.esFilaValidaParaCrearFuncionParametro(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCION_PARAMETRO) {
            es = this.esFilaValidaParaModificarFuncionParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFuncionParametro(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_REFERENCIA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionReferencia(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_REFERENCIA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_VALOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoValor(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_VALOR + ">");
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

    protected boolean esFilaValidaParaModificarFuncionParametro(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_REFERENCIA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionReferencia(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_REFERENCIA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_VALOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoValor(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_VALOR + ">");
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
        if (funcion == FUNCION_CREAR_FUNCION_PARAMETRO) {
            this.preCommitCrearFuncionParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCION_PARAMETRO) {
            this.preCommitModificarFuncionParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FUNCION_PARAMETRO) {
            this.preCommitEliminarFuncionParametro(rowKey);
            return;
        }
    }

    protected void preCommitCrearFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FUNCION_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_FUNCION_PARAMETRO, this.getIdFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCION_PARAMETRO, this.getVersionFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO, this.getNumeroTipoParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMPARACION, this.getNumeroTipoComparacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_REFERENCIA, this.getIdFuncionReferencia(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_VALOR, this.getNumeroTipoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_LISTA_VALOR, this.getIdListaValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_OBJETO_VALOR, this.getIdClaseObjetoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_VALOR, this.getIdClaseRecursoValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_MINIMO, this.getValorMinimo(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_MAXIMO, this.getValorMaximo(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_OMISION, this.getValorOmision(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAMETRO_SIN_RASTRO, this.getEsParametroSinRastro(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAMETRO_SEGMENTO, this.getEsParametroSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FUNCION_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_FUNCION_PARAMETRO, this.getIdFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCION_PARAMETRO, this.getVersionFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO, this.getNumeroTipoParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMPARACION, this.getNumeroTipoComparacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_REFERENCIA, this.getIdFuncionReferencia(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_VALOR, this.getNumeroTipoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_LISTA_VALOR, this.getIdListaValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_OBJETO_VALOR, this.getIdClaseObjetoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_VALOR, this.getIdClaseRecursoValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_MINIMO, this.getValorMinimo(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_MAXIMO, this.getValorMaximo(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_OMISION, this.getValorOmision(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAMETRO_SIN_RASTRO, this.getEsParametroSinRastro(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAMETRO_SEGMENTO, this.getEsParametroSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFuncionParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FUNCION_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_FUNCION_PARAMETRO, this.getIdFuncionParametro(rowKey));
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
        this.setVersionFuncionParametro(rowKey, 0L);
        this.setNumeroTipoValor(rowKey, 11);
        this.setEsParametroSinRastro(rowKey, 0);
        this.setEsParametroSegmento(rowKey, 0);
    }
}
