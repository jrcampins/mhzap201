/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.db.xdp;

import com.egt.base.constants.CBM2;
import com.egt.commons.util.IntUtils;
import com.egt.commons.util.LongUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.db.util.DBUtils;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.sun.data.provider.RowKey;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.sql.rowset.SyncResolverX;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.sql.rowset.spi.SyncProviderException;
import javax.sql.rowset.spi.SyncResolver;
import org.apache.commons.lang.StringUtils;

public class RecursoCachedRowSet extends CachedRowSetXImpl {

    private static final long serialVersionUID = 7869446608483773881L;

    /**
     * Conserva el valor de la propiedad inicializado.
     */
    private boolean inicializado;

    /**
     * Conserva el valor de la propiedad soloReferencia.
     */
    private boolean soloReferencia;

    /**
     * Conserva el valor de la propiedad filaEscogida.
     */
    private RowKey filaEscogida;

    /**
     * Conserva el valor de la propiedad identificacionFilaEscogida.
     */
    private Long identificacionFilaEscogida;

    /**
     * Conserva el valor de la propiedad numeroFilaEscogida.
     */
    private Integer numeroFilaEscogida;

    /**
     * Conserva el valor de la propiedad codigoFilaEscogida.
     */
    private String codigoFilaEscogida;

    /**
     * Conserva el valor de la propiedad tablaMaestro.
     */
    private String tablaMaestro;

    /**
     * Conserva el valor de la propiedad columnaMaestro.
     */
    private String columnaMaestro;

    /**
     * Conserva el valor de la propiedad columnaMaestroAnterior.
     */
    private String columnaMaestroAnterior;

    /**
     * Conserva el valor de la propiedad identificacionMaestro.
     */
    private Long identificacionMaestro;

    /**
     * Conserva el valor de la propiedad identificacionMaestroAnterior.
     */
    private Long identificacionMaestroAnterior;

    /**
     * Conserva el valor de la propiedad filasProcesadas.
     */
    private Map filasProcesadas;

    /**
     * Conserva el valor de la propiedad filasRemovidas.
     */
    private Map filasRemovidas;

    /**
     * Conserva el valor de la propiedad filasConflictivas.
     */
    private Map filasConflictivas;

    /**
     * Conserva el valor de la propiedad filasEliminadas.
     */
    private int filasEliminadas;

    /**
     * Conserva el valor de la propiedad filtroFuncionSelect.
     */
    private Long filtroFuncionSelect;

    /**
     * Conserva el valor de la propiedad filtroFuncionSelectAnterior.
     */
    private Long filtroFuncionSelectAnterior;

    /**
     * Conserva el valor de la propiedad filtroFuncionSelectModificado.
     */
    private boolean filtroFuncionSelectModificado;

    /**
     * Conserva el valor de la propiedad codigoFuncionSelect.
     */
    private String codigoFuncionSelect;

    /**
     * Conserva el valor de la propiedad codigoFuncionSelectAnterior.
     */
    private String codigoFuncionSelectAnterior;

    /**
     * Conserva el valor de la propiedad codigoFuncionSelectModificado.
     */
    private boolean codigoFuncionSelectModificado;

    /**
     * Conserva el valor de la propiedad nombreFuncionSelect.
     */
    private String nombreFuncionSelect;

    /**
     * Conserva el valor de la propiedad nombreFuncionSelectAnterior.
     */
    private String nombreFuncionSelectAnterior;

    /**
     * Conserva el valor de la propiedad nombreFuncionSelectModificado.
     */
    private boolean nombreFuncionSelectModificado;

    /**
     * Conserva el valor de la propiedad segmentoFuncionSelect.
     */
    private Long segmentoFuncionSelect;

    /**
     * Conserva el valor de la propiedad funcionSelect.
     */
    private long funcionSelect;

    /**
     * Conserva el valor de la propiedad funcionInsert.
     */
    private long funcionInsert;

    /**
     * Conserva el valor de la propiedad funcionUpdate.
     */
    private long funcionUpdate;

    /**
     * Conserva el valor de la propiedad funcionDelete.
     */
    private long funcionDelete;

    /**
     * Conserva el valor de la propiedad funcionBusinessProcess.
     */
    private long funcionBusinessProcess;

    /**
     * Conserva el valor de la propiedad funcionSelectAutorizada.
     */
    private boolean funcionSelectAutorizada;

    /**
     * Conserva el valor de la propiedad funcionInsertAutorizada.
     */
    private boolean funcionInsertAutorizada;

    /**
     * Conserva el valor de la propiedad funcionUpdateAutorizada.
     */
    private boolean funcionUpdateAutorizada;

    /**
     * Conserva el valor de la propiedad funcionDeleteAutorizada.
     */
    private boolean funcionDeleteAutorizada;

    /**
     * Conserva el valor de la propiedad funcionBusinessProcessAutorizada.
     */
    private boolean funcionBusinessProcessAutorizada;

    /**
     * Conserva el valor de la propiedad funcionSelectEjecutada.
     */
    private boolean funcionSelectEjecutada;

    /**
     * Conserva el valor de la propiedad funcionInsertEjecutada.
     */
    private boolean funcionInsertEjecutada;

    /**
     * Conserva el valor de la propiedad funcionUpdateEjecutada.
     */
    private boolean funcionUpdateEjecutada;

    /**
     * Conserva el valor de la propiedad funcionDeleteEjecutada.
     */
    private boolean funcionDeleteEjecutada;

    // <editor-fold defaultstate="collapsed">
    /**
     * Conserva el valor de la propiedad funcionBusinessProcessEjecutada.
     */
//  private boolean funcionBusinessProcessEjecutada;
    // </editor-fold>
    /**/
    private boolean filtroEscondido;

    /**
     * Conserva el valor de la propiedad versionComandoSelect.
     */
    private long versionComandoSelect;

    /**
     * Conserva el valor de la propiedad versionComandoSelectAnterior.
     */
    private long versionComandoSelectAnterior;

    /**
     * Conserva el valor de la propiedad versionComandoInsert.
     */
    private long versionComandoInsert;

    /**
     * Conserva el valor de la propiedad criteriosBusqueda.
     */
    private String criteriosBusqueda;

    /**
     * Conserva el valor de la propiedad criteriosOrden.
     */
    private String criteriosOrden;

    /**
     * Conserva el valor de la propiedad comandoSelectAnsi.
     */
    private String comandoSelectAnsi;

    /**
     * Conserva el valor de la propiedad comandoSelectAnterior.
     */
    private String comandoSelectAnterior;

    /**
     * Conserva el valor de la propiedad opcionZumNodo.
     */
    private EnumOpcionZumNodo opcionZumNodo;

//  /**
//   * Conserva el valor de la propiedad segmentoKeyColumn.
//   */
//  private String segmentoKeyColumn;
//
//  /**
//   * Conserva el valor de la propiedad segmentoFunctionName.
//   */
//  private String segmentoFunctionName;
//
    private Map<String, Class<?>> columnTypes;

    /**
     * @return the columnTypes
     */
    public Map<String, Class<?>> getColumnTypes() {
        return columnTypes;
    }

    /**
     * Creates a new instance of RecursoCachedRowSet
     */
    public RecursoCachedRowSet() {
        super();
        this.init();
    }

    /**
     * Creates a new instance of RecursoCachedRowSet
     */
    public RecursoCachedRowSet(Hashtable env) throws SQLException {
        super(env);
        this.init();
    }

    private void init() {
        this.inicializado = false;
        this.soloReferencia = false;
        this.filaEscogida = null;
        this.identificacionFilaEscogida = null;
        this.numeroFilaEscogida = null;
        this.codigoFilaEscogida = null;
        this.tablaMaestro = null;
        this.columnaMaestro = null;
        this.columnaMaestroAnterior = null;
        this.identificacionMaestro = null;
        this.identificacionMaestroAnterior = null;
        this.filasProcesadas = new LinkedHashMap();
        this.filasRemovidas = new LinkedHashMap();
        this.filasConflictivas = new LinkedHashMap();
        this.filasEliminadas = 0;
        this.filtroFuncionSelect = null;
        this.filtroFuncionSelectAnterior = null;
        this.filtroFuncionSelectModificado = true;
        this.codigoFuncionSelect = null;
        this.codigoFuncionSelectAnterior = null;
        this.codigoFuncionSelectModificado = true;
        this.nombreFuncionSelect = null;
        this.nombreFuncionSelectAnterior = null;
        this.nombreFuncionSelectModificado = true;
        this.segmentoFuncionSelect = null;
        this.funcionSelect = -1L;
        this.funcionInsert = -1L;
        this.funcionUpdate = -1L;
        this.funcionDelete = -1L;
        this.funcionBusinessProcess = -1L;
        this.funcionSelectAutorizada = false;
        this.funcionInsertAutorizada = false;
        this.funcionUpdateAutorizada = false;
        this.funcionDeleteAutorizada = false;
        this.funcionBusinessProcessAutorizada = false;
        this.funcionSelectEjecutada = false;
        this.funcionInsertEjecutada = false;
        this.funcionUpdateEjecutada = false;
        this.funcionDeleteEjecutada = false;
//      this.funcionBusinessProcessEjecutada = false;
        this.filtroEscondido = false;
        this.versionComandoSelect = 0L;
        this.versionComandoSelectAnterior = 0L;
        this.versionComandoInsert = 0L;
        this.criteriosBusqueda = null;
        this.criteriosOrden = null;
        this.comandoSelectAnsi = null;
        this.comandoSelectAnterior = null;
        this.opcionZumNodo = null;
//      this.segmentoKeyColumn = null;
//      this.segmentoFunctionName = null;
        this.columnTypes = new LinkedHashMap<>();
//      this.initColumnTypes();
        this.setPrintStatements(false);
    }

    /**
     * Getter para propiedad inicializado.
     *
     * @return Valor de la propiedad inicializado.
     */
    boolean isInicializado() {
        return this.inicializado;
    }

    /**
     * Setter para propiedad inicializado.
     *
     * @param inicializado Nuevo valor de la propiedad inicializado.
     */
    void setInicializado(boolean inicializado) {
        this.inicializado = inicializado;
    }

    /**
     * Getter para propiedad soloReferencia.
     *
     * @return Valor de la propiedad soloReferencia.
     */
    boolean isSoloReferencia() {
        return soloReferencia;
    }

    /**
     * Setter para propiedad soloReferencia.
     *
     * @param soloReferencia Nuevo valor de la propiedad soloReferencia.
     */
    void setSoloReferencia(boolean soloReferencia) {
        this.soloReferencia = soloReferencia;
    }

    /**
     * Getter para propiedad filaEscogida.
     *
     * @return Valor de la propiedad filaEscogida.
     */
    RowKey getFilaEscogida() {
        return this.filaEscogida;
    }

    /**
     * Setter para propiedad filaEscogida.
     *
     * @param filaElegida Nuevo valor de la propiedad filaEscogida.
     */
    void setFilaEscogida(RowKey filaEscogida) {
        this.filaEscogida = filaEscogida;
    }

    /**
     * Getter para propiedad identificacionFilaEscogida.
     *
     * @return Valor de la propiedad identificacionFilaEscogida.
     */
    public Long getIdentificacionFilaEscogida() {
        return this.identificacionFilaEscogida;
    }

    /**
     * Setter para propiedad identificacionFilaEscogida.
     *
     * @param identificacionFilaEscogida Nuevo valor de la propiedad identificacionFilaEscogida.
     */
    void setIdentificacionFilaEscogida(Long identificacionFilaEscogida) {
        this.identificacionFilaEscogida = identificacionFilaEscogida;
    }

    /**
     * Getter para propiedad numeroFilaEscogida.
     *
     * @return Valor de la propiedad numeroFilaEscogida.
     */
    Integer getNumeroFilaEscogida() {
        return this.numeroFilaEscogida;
    }

    /**
     * Setter para propiedad numeroFilaEscogida.
     *
     * @param numeroFilaEscogida Nuevo valor de la propiedad numeroFilaEscogida.
     */
    void setNumeroFilaEscogida(Integer numeroFilaEscogida) {
        this.numeroFilaEscogida = numeroFilaEscogida;
    }

    /**
     * Getter para propiedad codigoFilaEscogida.
     *
     * @return Valor de la propiedad codigoFilaEscogida.
     */
    String getCodigoFilaEscogida() {
        return this.codigoFilaEscogida;
    }

    /**
     * Setter para propiedad codigoFilaEscogida.
     *
     * @param codigoFilaEscogida Nuevo valor de la propiedad codigoFilaEscogida.
     */
    void setCodigoFilaEscogida(String codigoFilaEscogida) {
        this.codigoFilaEscogida = codigoFilaEscogida;
    }

    /**
     * Getter para propiedad tablaMaestro.
     *
     * @return Valor de la propiedad tablaMaestro.
     */
    String getTablaMaestro() {
        return this.tablaMaestro;
    }

    /**
     * Setter para propiedad tablaMaestro.
     *
     * @param tablaMaestro Nuevo valor de la propiedad tablaMaestro.
     */
    void setTablaMaestro(String tablaMaestro) {
        this.tablaMaestro = tablaMaestro;
    }

    /**
     * Getter para propiedad columnaMaestro.
     *
     * @return Valor de la propiedad columnaMaestro.
     */
    String getColumnaMaestro() {
        return this.columnaMaestro;
    }

    /**
     * Setter para propiedad columnaMaestro.
     *
     * @param columnaMaestro Nuevo valor de la propiedad columnaMaestro.
     */
    void setColumnaMaestro(String columnaMaestro) {
        this.columnaMaestro = columnaMaestro;
    }

    /**
     * Getter para propiedad columnaMaestroAnterior.
     *
     * @return Valor de la propiedad columnaMaestroAnterior.
     */
    String getColumnaMaestroAnterior() {
        return this.columnaMaestroAnterior;
    }

    /**
     * Setter para propiedad columnaMaestroAnterior.
     *
     * @param columnaMaestroAnterior Nuevo valor de la propiedad columnaMaestroAnterior.
     */
    void setColumnaMaestroAnterior(String columnaMaestroAnterior) {
        this.columnaMaestroAnterior = columnaMaestroAnterior;
    }

    /**
     * Getter para propiedad identificacionMaestro.
     *
     * @return Valor de la propiedad identificacionMaestro.
     */
    Long getIdentificacionMaestro() {
        return this.identificacionMaestro;
    }

    /**
     * Setter para propiedad identificacionMaestro.
     *
     * @param identificacionMaestro Nuevo valor de la propiedad identificacionMaestro.
     */
    void setIdentificacionMaestro(Long identificacionMaestro) {
        this.identificacionMaestro = identificacionMaestro;
    }

    /**
     * Getter para propiedad identificacionMaestroAnterior.
     *
     * @return Valor de la propiedad identificacionMaestroAnterior.
     */
    Long getIdentificacionMaestroAnterior() {
        return this.identificacionMaestroAnterior;
    }

    /**
     * Setter para propiedad identificacionMaestroAnterior.
     *
     * @param identificacionMaestroAnterior Nuevo valor de la propiedad identificacionMaestroAnterior.
     */
    void setIdentificacionMaestroAnterior(Long identificacionMaestroAnterior) {
        this.identificacionMaestroAnterior = identificacionMaestroAnterior;
    }

    /**
     * Getter para propiedad filasProcesadas.
     *
     * @return Valor de la propiedad filasProcesadas.
     */
    Map getFilasProcesadas() {
        return this.filasProcesadas;
    }

    /**
     * Getter para propiedad filasRemovidas.
     *
     * @return Valor de la propiedad filasRemovidas.
     */
    Map getFilasRemovidas() {
        return this.filasRemovidas;
    }

    /**
     * Getter para propiedad filasConflictivas.
     *
     * @return Valor de la propiedad filasConflictivas.
     */
    Map getFilasConflictivas() {
        return this.filasConflictivas;
    }

    /**
     * Getter para propiedad filasEliminadas.
     *
     * @return Valor de la propiedad filasEliminadas.
     */
    int getFilasEliminadas() {
        return this.filasEliminadas;
    }

    /**
     * Setter para propiedad filasEliminadas.
     *
     * @param filasEliminadas Nuevo valor de la propiedad filasEliminadas.
     */
    void setFilasEliminadas(int filasEliminadas) {
        this.filasEliminadas = filasEliminadas;
    }

    /**
     * Getter para propiedad filtroFuncionSelect.
     *
     * @return Valor de la propiedad filtroFuncionSelect.
     */
    Long getFiltroFuncionSelect() {
        return this.filtroFuncionSelect;
    }

    /**
     * Setter para propiedad filtroFuncionSelect.
     *
     * @param filtroFuncionSelect Nuevo valor de la propiedad filtroFuncionSelect.
     */
    void setFiltroFuncionSelect(Long filtroFuncionSelect) {
        if (this.filtroFuncionSelect == null && filtroFuncionSelect != null) {
            this.filtroFuncionSelectModificado = true;
        } else if (this.filtroFuncionSelect != null && !this.filtroFuncionSelect.equals(filtroFuncionSelect)) {
            this.filtroFuncionSelectModificado = true;
        }
        this.filtroFuncionSelect = filtroFuncionSelect;
    }

    /**
     * Getter para propiedad filtroFuncionSelectAnterior.
     *
     * @return Valor de la propiedad filtroFuncionSelectAnterior.
     */
    Long getFiltroFuncionSelectAnterior() {
        return this.filtroFuncionSelectAnterior;
    }

    /**
     * Setter para propiedad filtroFuncionSelectAnterior.
     *
     * @param filtroFuncionSelectAnterior Nuevo valor de la propiedad filtroFuncionSelectAnterior.
     */
    void setFiltroFuncionSelectAnterior(Long filtroFuncionSelectAnterior) {
        this.filtroFuncionSelectAnterior = filtroFuncionSelectAnterior;
    }

    /**
     * Getter para propiedad filtroFuncionSelectModificado.
     *
     * @return Valor de la propiedad filtroFuncionSelectModificado.
     */
    boolean isFiltroFuncionSelectModificado() {
        return this.filtroFuncionSelectModificado;
    }

    /**
     * Setter para propiedad filtroFuncionSelectModificado.
     *
     * @param filtroFuncionSelectModificado Nuevo valor de la propiedad filtroFuncionSelectModificado.
     */
    void setFiltroFuncionSelectModificado(boolean filtroFuncionSelectModificado) {
        this.filtroFuncionSelectModificado = filtroFuncionSelectModificado;
    }

    /**
     * Getter para propiedad codigoFuncionSelect.
     *
     * @return Valor de la propiedad codigoFuncionSelect.
     */
    String getCodigoFuncionSelect() {
        return this.codigoFuncionSelect;
    }

    /**
     * Setter para propiedad codigoFuncionSelect.
     *
     * @param codigoFuncionSelect Nuevo valor de la propiedad codigoFuncionSelect.
     */
    void setCodigoFuncionSelect(String codigoFuncionSelect) {
        if (this.codigoFuncionSelect == null && codigoFuncionSelect != null) {
            this.codigoFuncionSelectModificado = true;
        } else if (this.codigoFuncionSelect != null && !this.codigoFuncionSelect.equals(codigoFuncionSelect)) {
            this.codigoFuncionSelectModificado = true;
        }
        this.codigoFuncionSelect = codigoFuncionSelect;
    }

    /**
     * Getter para propiedad codigoFuncionSelectAnterior.
     *
     * @return Valor de la propiedad codigoFuncionSelectAnterior.
     */
    String getCodigoFuncionSelectAnterior() {
        return this.codigoFuncionSelectAnterior;
    }

    /**
     * Setter para propiedad codigoFuncionSelectAnterior.
     *
     * @param codigoFuncionSelectAnterior Nuevo valor de la propiedad codigoFuncionSelectAnterior.
     */
    void setCodigoFuncionSelectAnterior(String codigoFuncionSelectAnterior) {
        this.codigoFuncionSelectAnterior = codigoFuncionSelectAnterior;
    }

    /**
     * Getter para propiedad codigoFuncionSelectModificado.
     *
     * @return Valor de la propiedad codigoFuncionSelectModificado.
     */
    boolean isCodigoFuncionSelectModificado() {
        return this.codigoFuncionSelectModificado;
    }

    /**
     * Setter para propiedad codigoFuncionSelectModificado.
     *
     * @param codigoFuncionSelectModificado Nuevo valor de la propiedad codigoFuncionSelectModificado.
     */
    void setCodigoFuncionSelectModificado(boolean codigoFuncionSelectModificado) {
        this.codigoFuncionSelectModificado = codigoFuncionSelectModificado;
    }

    /**
     * Getter para propiedad nombreFuncionSelect.
     *
     * @return Valor de la propiedad nombreFuncionSelect.
     */
    String getNombreFuncionSelect() {
        return this.nombreFuncionSelect;
    }

    /**
     * Setter para propiedad nombreFuncionSelect.
     *
     * @param nombreFuncionSelect Nuevo valor de la propiedad nombreFuncionSelect.
     */
    void setNombreFuncionSelect(String nombreFuncionSelect) {
        if (this.nombreFuncionSelect == null && nombreFuncionSelect != null) {
            this.nombreFuncionSelectModificado = true;
        } else if (this.nombreFuncionSelect != null && !this.nombreFuncionSelect.equals(nombreFuncionSelect)) {
            this.nombreFuncionSelectModificado = true;
        }
        this.nombreFuncionSelect = nombreFuncionSelect;
    }

    /**
     * Getter para propiedad nombreFuncionSelectAnterior.
     *
     * @return Valor de la propiedad nombreFuncionSelectAnterior.
     */
    String getNombreFuncionSelectAnterior() {
        return this.nombreFuncionSelectAnterior;
    }

    /**
     * Setter para propiedad nombreFuncionSelectAnterior.
     *
     * @param nombreFuncionSelectAnterior Nuevo valor de la propiedad nombreFuncionSelectAnterior.
     */
    void setNombreFuncionSelectAnterior(String nombreFuncionSelectAnterior) {
        this.nombreFuncionSelectAnterior = nombreFuncionSelectAnterior;
    }

    /**
     * Getter para propiedad nombreFuncionSelectModificado.
     *
     * @return Valor de la propiedad nombreFuncionSelectModificado.
     */
    boolean isNombreFuncionSelectModificado() {
        return this.nombreFuncionSelectModificado;
    }

    /**
     * Setter para propiedad nombreFuncionSelectModificado.
     *
     * @param nombreFuncionSelectModificado Nuevo valor de la propiedad nombreFuncionSelectModificado.
     */
    void setNombreFuncionSelectModificado(boolean nombreFuncionSelectModificado) {
        this.nombreFuncionSelectModificado = nombreFuncionSelectModificado;
    }

    /**
     * Getter para propiedad segmentoFuncionSelect.
     *
     * @return Valor de la propiedad segmentoFuncionSelect.
     */
    Long getSegmentoFuncionSelect() {
        return this.segmentoFuncionSelect;
    }

    /**
     * Setter para propiedad segmentoFuncionSelect.
     *
     * @param segmentoFuncionSelect Nuevo valor de la propiedad segmentoFuncionSelect.
     */
    void setSegmentoFuncionSelect(Long segmentoFuncionSelect) {
        this.segmentoFuncionSelect = segmentoFuncionSelect;
    }

    /**
     * Getter para propiedad funcionSelect.
     *
     * @return Valor de la propiedad funcionSelect.
     */
    long getFuncionSelect() {
        return this.funcionSelect;
    }

    /**
     * Setter para propiedad funcionSelect.
     *
     * @param funcionSelect Nuevo valor de la propiedad funcionSelect.
     */
    void setFuncionSelect(long funcion) throws ExcepcionAplicacion {
        if (funcion > 0) {
            if (funcion != this.funcionSelect) {
                if (this.soloReferencia) {
                    this.funcionSelectAutorizada = true;
                } else {
                    this.funcionSelectAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
                }
            }
            if (this.funcionSelectAutorizada) {
                this.funcionSelect = funcion;
            } else {
                this.funcionSelect = -1;
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.SELECT_ROW_EXCEPTION_1));
            }
        } else {
            this.funcionSelectAutorizada = false;
            this.funcionSelect = -1;
        }
    }

    /**
     * Getter para propiedad funcionInsert.
     *
     * @return Valor de la propiedad funcionInsert.
     */
    long getFuncionInsert() {
        return this.funcionInsert;
    }

    /**
     * Setter para propiedad funcionInsert.
     *
     * @param funcionInsert Nuevo valor de la propiedad funcionInsert.
     */
    void setFuncionInsert(long funcion) throws ExcepcionAplicacion {
        if (funcion > 0) {
            if (funcion != this.funcionInsert) {
                if (this.funcionInsertEjecutada) {
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.INSERT_ROW_EXCEPTION_0));
                }
                this.funcionInsertAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
            }
            if (this.funcionInsertAutorizada && !this.soloReferencia) {
                this.funcionInsert = funcion;
            } else {
                this.funcionInsert = -1;
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.INSERT_ROW_EXCEPTION_1));
            }
        } else {
            this.funcionInsertAutorizada = false;
            this.funcionInsert = -1;
        }
    }

    /**
     * Getter para propiedad funcionUpdate.
     *
     * @return Valor de la propiedad funcionUpdate.
     */
    long getFuncionUpdate() {
        return this.funcionUpdate;
    }

    /**
     * Setter para propiedad funcionUpdate.
     *
     * @param funcionUpdate Nuevo valor de la propiedad funcionUpdate.
     */
    void setFuncionUpdate(long funcion) throws ExcepcionAplicacion {
        if (funcion > 0) {
            if (funcion != this.funcionUpdate) {
                if (this.funcionUpdateEjecutada) {
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.UPDATE_ROW_EXCEPTION_0));
                }
                this.funcionUpdateAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
            }
            if (this.funcionUpdateAutorizada && !this.soloReferencia) {
                this.funcionUpdate = funcion;
            } else {
                this.funcionUpdate = -1;
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.UPDATE_ROW_EXCEPTION_1));
            }
        } else {
            this.funcionUpdateAutorizada = false;
            this.funcionUpdate = -1;
        }
    }

    /**
     * Getter para propiedad funcionDelete.
     *
     * @return Valor de la propiedad funcionDelete.
     */
    long getFuncionDelete() {
        return this.funcionDelete;
    }

    /**
     * Setter para propiedad funcionDelete.
     *
     * @param funcionDelete Nuevo valor de la propiedad funcionDelete.
     */
    void setFuncionDelete(long funcion) throws ExcepcionAplicacion {
        if (funcion > 0) {
            if (funcion != this.funcionDelete) {
                if (this.funcionDeleteEjecutada) {
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.DELETE_ROW_EXCEPTION_0));
                }
                this.funcionDeleteAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
            }
            if (this.funcionDeleteAutorizada && !this.soloReferencia) {
                this.funcionDelete = funcion;
            } else {
                this.funcionDelete = -1;
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.DELETE_ROW_EXCEPTION_1));
            }
        } else {
            this.funcionDeleteAutorizada = false;
            this.funcionDelete = -1;
        }
    }

    /**
     * Getter para propiedad funcionBusinessProcess.
     *
     * @return Valor de la propiedad funcionBusinessProcess.
     */
    long getFuncionBusinessProcess() {
        return this.funcionBusinessProcess;
    }

    /**
     * Setter para propiedad funcionBusinessProcess.
     *
     * @param funcionBusinessProcess Nuevo valor de la propiedad funcionBusinessProcess.
     */
    void setFuncionBusinessProcess(long funcion) throws ExcepcionAplicacion {
        if (funcion > 0) {
            if (funcion != this.funcionBusinessProcess) {
                this.funcionBusinessProcessAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
            }
            if (this.funcionBusinessProcessAutorizada) {
                this.funcionBusinessProcess = funcion;
            } else {
                this.funcionBusinessProcess = -1;
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_1));
            }
        } else {
            this.funcionBusinessProcessAutorizada = false;
            this.funcionBusinessProcess = -1;
        }
    }

    /**
     * Getter para propiedad funcionSelectAutorizada.
     *
     * @return Valor de la propiedad funcionSelectAutorizada.
     */
    boolean isFuncionSelectAutorizada() {
        return this.funcionSelectAutorizada;
    }

    /**
     * Getter para propiedad funcionInsertAutorizada.
     *
     * @return Valor de la propiedad funcionInsertAutorizada.
     */
    boolean isFuncionInsertAutorizada() {
        return this.funcionInsertAutorizada;
    }

    /**
     * Getter para propiedad funcionUpdateAutorizada.
     *
     * @return Valor de la propiedad funcionUpdateAutorizada.
     */
    boolean isFuncionUpdateAutorizada() {
        return this.funcionUpdateAutorizada;
    }

    /**
     * Getter para propiedad funcionDeleteAutorizada.
     *
     * @return Valor de la propiedad funcionDeleteAutorizada.
     */
    boolean isFuncionDeleteAutorizada() {
        return this.funcionDeleteAutorizada;
    }

    /**
     * Getter para propiedad funcionBusinessProcessAutorizada.
     *
     * @return Valor de la propiedad funcionBusinessProcessAutorizada.
     */
    boolean isFuncionBusinessProcessAutorizada() {
        return this.funcionBusinessProcessAutorizada;
    }

    /**
     * Getter para propiedad funcionSelectEjecutada.
     *
     * @return Valor de la propiedad funcionSelectEjecutada.
     */
    boolean isFuncionSelectEjecutada() {
        return this.funcionSelectEjecutada;
    }

    /**
     * Setter para propiedad funcionSelectEjecutada.
     *
     * @param funcionSelectEjecutada Nuevo valor de la propiedad funcionSelectEjecutada.
     */
    void setFuncionSelectEjecutada(boolean funcionSelectEjecutada) {
        this.funcionSelectEjecutada = funcionSelectEjecutada;
    }

    /**
     * Getter para propiedad funcionInsertEjecutada.
     *
     * @return Valor de la propiedad funcionInsertEjecutada.
     */
    boolean isFuncionInsertEjecutada() {
        return this.funcionInsertEjecutada;
    }

    /**
     * Setter para propiedad funcionInsertEjecutada.
     *
     * @param funcionInsertEjecutada Nuevo valor de la propiedad funcionInsertEjecutada.
     */
    void setFuncionInsertEjecutada(boolean funcionInsertEjecutada) {
        this.funcionInsertEjecutada = funcionInsertEjecutada;
    }

    /**
     * Getter para propiedad funcionUpdateEjecutada.
     *
     * @return Valor de la propiedad funcionUpdateEjecutada.
     */
    boolean isFuncionUpdateEjecutada() {
        return this.funcionUpdateEjecutada;
    }

    /**
     * Setter para propiedad funcionUpdateEjecutada.
     *
     * @param funcionUpdateEjecutada Nuevo valor de la propiedad funcionUpdateEjecutada.
     */
    void setFuncionUpdateEjecutada(boolean funcionUpdateEjecutada) {
        this.funcionUpdateEjecutada = funcionUpdateEjecutada;
    }

    /**
     * Getter para propiedad funcionDeleteEjecutada.
     *
     * @return Valor de la propiedad funcionDeleteEjecutada.
     */
    boolean isFuncionDeleteEjecutada() {
        return this.funcionDeleteEjecutada;
    }

    /**
     * Setter para propiedad funcionDeleteEjecutada.
     *
     * @param funcionDeleteEjecutada Nuevo valor de la propiedad funcionDeleteEjecutada.
     */
    void setFuncionDeleteEjecutada(boolean funcionDeleteEjecutada) {
        this.funcionDeleteEjecutada = funcionDeleteEjecutada;
    }

//  /**
//   * Getter para propiedad funcionBusinessProcessEjecutada.
//   *
//   * @return Valor de la propiedad funcionBusinessProcessEjecutada.
//   */
//  boolean isFuncionBusinessProcessEjecutada() {
//      return this.funcionBusinessProcessEjecutada;
//  }
//
//  /**
//   * Setter para propiedad funcionBusinessProcessEjecutada.
//   *
//   * @param funcionBusinessProcessEjecutada Nuevo valor de la propiedad funcionBusinessProcessEjecutada.
//   */
//  void setFuncionBusinessProcessEjecutada(boolean funcionBusinessProcessEjecutada) {
//      this.funcionBusinessProcessEjecutada = funcionBusinessProcessEjecutada;
//  }
//
    public boolean isFiltroEscondido() {
        return filtroEscondido;
    }

    public void setFiltroEscondido(boolean filtroEscondido) {
        this.filtroEscondido = filtroEscondido;
    }

    /**
     * Getter para propiedad versionComandoSelect.
     *
     * @return Valor de la propiedad versionComandoSelect.
     */
    long getVersionComandoSelect() {
        return this.versionComandoSelect;
    }

    /**
     * Setter para propiedad versionComandoSelect.
     *
     * @param versionComandoSelect Nuevo valor de la propiedad versionComandoSelect.
     */
    void setVersionComandoSelect(long versionComandoSelect) {
        this.versionComandoSelect = versionComandoSelect;
    }

    /**
     * Getter para propiedad versionComandoSelectAnterior.
     *
     * @return Valor de la propiedad versionComandoSelectAnterior.
     */
    long getVersionComandoSelectAnterior() {
        return this.versionComandoSelectAnterior;
    }

    /**
     * Setter para propiedad versionComandoSelectAnterior.
     *
     * @param versionComandoSelectAnterior Nuevo valor de la propiedad versionComandoSelectAnterior.
     */
    void setVersionComandoSelectAnterior(long versionComandoSelectAnterior) {
        this.versionComandoSelectAnterior = versionComandoSelectAnterior;
    }

    /**
     * Getter para propiedad versionComandoInsert.
     *
     * @return Valor de la propiedad versionComandoInsert.
     */
    long getVersionComandoInsert() {
        return this.versionComandoInsert;
    }

    /**
     * Setter para propiedad versionComandoInsert.
     *
     * @param versionComandoInsert Nuevo valor de la propiedad versionComandoInsert.
     */
    void setVersionComandoInsert(long versionComandoInsert) {
        this.versionComandoInsert = versionComandoInsert;
    }

    /**
     * Getter para propiedad criteriosBusqueda.
     *
     * @return Valor de la propiedad criteriosBusqueda.
     */
    String getCriteriosBusqueda() {
        return this.criteriosBusqueda;
    }

    /**
     * Setter para propiedad criteriosBusqueda.
     *
     * @param criteriosBusqueda Nuevo valor de la propiedad criteriosBusqueda.
     */
    void setCriteriosBusqueda(String criteriosBusqueda) {
        this.criteriosBusqueda = criteriosBusqueda;
    }

    /**
     * Getter para propiedad criteriosOrden.
     *
     * @return Valor de la propiedad criteriosOrden.
     */
    String getCriteriosOrden() {
        return this.criteriosOrden;
    }

    /**
     * Setter para propiedad criteriosOrden.
     *
     * @param criteriosOrden Nuevo valor de la propiedad criteriosOrden.
     */
    void setCriteriosOrden(String criteriosOrden) {
        this.criteriosOrden = criteriosOrden;
    }

    /**
     * Getter para propiedad comandoSelectAnsi.
     *
     * @return Valor de la propiedad comandoSelectAnsi.
     */
    String getComandoSelectAnsi() {
        return this.comandoSelectAnsi;
    }

    /**
     * Setter para propiedad comandoSelectAnsi.
     *
     * @param comandoSelectAnsi Nuevo valor de la propiedad comandoSelectAnsi.
     */
    void setComandoSelectAnsi(String comandoSelectAnsi) {
        this.comandoSelectAnsi = comandoSelectAnsi;
    }

    /**
     * Getter para propiedad comandoSelectAnterior.
     *
     * @return Valor de la propiedad comandoSelectAnterior.
     */
    String getComandoSelectAnterior() {
        return this.comandoSelectAnterior;
    }

    /**
     * Setter para propiedad comandoSelectAnterior.
     *
     * @param comandoSelectAnterior Nuevo valor de la propiedad comandoSelectAnterior.
     */
    void setComandoSelectAnterior(String comandoSelectAnterior) {
        this.comandoSelectAnterior = comandoSelectAnterior;
    }

    /**
     * Getter para propiedad opcionZumNodo.
     *
     * @return Valor de la propiedad opcionZumNodo.
     */
    EnumOpcionZumNodo getOpcionZumNodo() {
        return opcionZumNodo;
    }

    /**
     * Setter para propiedad opcionZumNodo.
     *
     * @param opcionZumNodo Nuevo valor de la propiedad opcionZumNodo.
     */
    void setOpcionZumNodo(EnumOpcionZumNodo opcionZumNodo) {
        this.opcionZumNodo = opcionZumNodo;
    }

//  public String getSegmentoKeyColumn() {
//      return segmentoKeyColumn;
//  }
//
//  public void setSegmentoKeyColumn(String segmentoKeyColumn) {
//      this.segmentoKeyColumn = segmentoKeyColumn;
//  }
//
//  public String getSegmentoFunctionName() {
//      return segmentoFunctionName;
//  }
//
//  public void setSegmentoFunctionName(String segmentoFunctionName) {
//      this.segmentoFunctionName = segmentoFunctionName;
//  }
//
    @Override
    public void setCommand(String command) throws SQLException {
        boolean autoCommit;
        Bitacora.trace(getClass(), "setCommand", command);
        Connection connection = getConnection();
        Bitacora.trace("connection=" + connection);
        if (connection != null) {
            autoCommit = connection.getAutoCommit();
            Bitacora.trace("autocommit=" + autoCommit);
            if (autoCommit) {
                connection.setAutoCommit(false);
                autoCommit = connection.getAutoCommit();
                Bitacora.trace("autocommit=" + autoCommit);
            }
        }
        super.setCommand(command);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void acceptChanges() throws SyncProviderException {
        try {
            this.getFilasConflictivas().clear();
            super.acceptChanges();
        } catch (SyncProviderException spe) {
            SyncResolver resolver = spe.getSyncResolver();
            if (resolver != null && resolver instanceof SyncResolverX) {
                boolean showDeleted = this.tryToGetShowDeleted();
                boolean sinDuplicados = TLC.getBitacora().isSinDuplicados();
                int conflictos = 0;
                int row;
                int status = SyncResolver.NO_ROW_CONFLICT;
                String transaction = DBUtils.getTransactionLabel(status);
                SQLException sqlException;
                int errorCode;
                String message;
                String localizedMessage;
                String sqlState;
                String heading;
                String clave = CBM2.COMMIT_CHANGES_UNKNOWN_EXCEPTION;
                int tipoError; /* OJO con la constante, 1 -> fila con un error desconocido */
                String mensaje;
                String prefijo = Global.PREFIJO_ETIQUETA_ID_RECURSO;
                try {
                    this.tryToSetShowDeleted(true);
                    TLC.getBitacora().setSinDuplicados(true);
                    while (resolver.nextConflict()) {
                        conflictos++;
                        row = resolver.getRow();
                        status = resolver.getStatus();
                        transaction = DBUtils.getTransactionLabel(status);
                        sqlException = ((SyncResolverX) resolver).getSQLException();
                        errorCode = sqlException.getErrorCode();
                        message = sqlException.getMessage();
                        localizedMessage = StringUtils.substringBefore(sqlException.getLocalizedMessage(), " Where: ");
                        sqlState = sqlException.getSQLState();
                        heading = "Row:" + row + ", Status:" + status + ", Code:" + errorCode + ", State:" + sqlState;
                        Bitacora.trace(heading + message);
                        if (TLC.getInterpreteSql().isCommandIgnoredException(sqlException)) {
                            clave = CBM2.COMMIT_CHANGES_COMMAND_IGNORED_EXCEPTION;
                            tipoError = 0; /* OJO con la constante, 0 -> fila "ignorada" (no se sabe si tiene o no errores) */
                            mensaje = tipoError + Bitacora.getTextoMensaje(clave, transaction, prefijo + row);
                            TLC.getBitacora().error(CBM2.COMMIT_CHANGES_COMMAND_IGNORED);
                            if (status == SyncResolver.DELETE_ROW_CONFLICT) {
                                this.tryToSetShowDeleted(false);
                            }
                        } else {
                            String columna = TLC.getInterpreteSql().getNotNullConstraintViolationColumn(sqlException);
                            if (StringUtils.isNotBlank(columna)) {
                                clave = CBM2.DATABASE_NOT_NULL_CONSTRAINT_VIOLATION;
                                tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                                mensaje = tipoError + TLC.getBitacora().error(clave, transaction, prefijo + row, columna);
                            } else {
                                clave = DBUtils.getConstraintMessageKey(message, status);
                                if (clave == null) {
                                    clave = CBM2.COMMIT_CHANGES_UNKNOWN_EXCEPTION;
                                    tipoError = 1; /* OJO con la constante, 1 -> fila con un error desconocido */
                                    mensaje = tipoError + TLC.getBitacora().error(clave, transaction, prefijo + row, localizedMessage);
                                } else {
                                    tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                                    mensaje = tipoError + TLC.getBitacora().error(clave, transaction, prefijo + row);
                                }
                            }
                        }
                        this.getFilasConflictivas().put(String.valueOf(row - 1), mensaje);
//                      if (status == SyncResolver.DELETE_ROW_CONFLICT)
//                          if (this.absolute(row))
//                              if (this.rowDeleted()) // RETORNA FALSO!
//                                  this.undoDelete();
                    }
                    if (conflictos == 0) { /* esto parece un BUG, y pasa cuando se elimina la ultima fila y showDeleted==false */
                        TLC.getBitacora().error(clave, transaction, "", spe.getLocalizedMessage());
                    }
                } catch (SQLException ex) {
                    TLC.getBitacora().fatal(ex);
                } finally {
                    this.tryToSetShowDeleted(showDeleted);
                    TLC.getBitacora().setSinDuplicados(sinDuplicados);
                    throw new SyncProviderException(this.getSyncProviderExceptionString(spe));
                }
            }
            throw spe;
        }
    }

    boolean tryToGetShowDeleted() {
        boolean showDeleted = false;
        try {
            showDeleted = this.getShowDeleted();
        } catch (SQLException sqle) {
            TLC.getBitacora().fatal(sqle);
        }
        return showDeleted;
    }

    void tryToSetShowDeleted(boolean showDeleted) {
        try {
            this.setShowDeleted(showDeleted);
        } catch (SQLException sqle) {
            TLC.getBitacora().fatal(sqle);
        }
    }

    private String getSyncProviderExceptionString(SyncProviderException spe) {
        String mensaje = ThrowableUtils.getString(spe);
        return mensaje.replace(
                "Number of conflicts while synchronizing",
                "Número de conflictos al confirmar");
    }

    @Override
    public Object getObject(int columnIndex) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "getObject", columnIndex);
        Object object = super.getObject(columnIndex);
        return getJavaValue(columnIndex, findColumn(columnIndex), object);
    }

    @Override
    public Object getObject(int columnIndex, Map map) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "getObject", columnIndex, "map");
        Object object = super.getObject(columnIndex, map);
        return getJavaValue(columnIndex, findColumn(columnIndex), object);
    }

    @Override
    public Object getObject(String columnName) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "getObject", columnName);
        Object object = super.getObject(columnName);
        return getJavaValue(findColumn(columnName), columnName, object);
    }

    @Override
    public Object getObject(String columnName, Map map) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "getObject", columnName, "map");
        Object object = super.getObject(columnName, map);
        return getJavaValue(findColumn(columnName), columnName, object);
    }

    private String findColumn(int columnIndex) {
        try {
            ResultSetMetaData rsmd = getMetaData();
            return rsmd.getColumnName(columnIndex);
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
        }
        return null;
    }

    private Object getJavaValue(int columnIndex, String columnName, Object x) {
        if (x == null) {
            return x;
        }
        Class<?> cx = x.getClass();
        Class<?> cy = columnTypes.get(columnName.toLowerCase());
        if (cy == null || cy.isAssignableFrom(cx)) {
            return x;
        } else if (cy.equals(Long.class)) {
            return LongUtils.toLong(x);
        } else if (cy.equals(Integer.class)) {
            return IntUtils.toInteger(x);
        } else {
            return x;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="updateObject">
//  @Override
//  public void updateObject(int columnIndex, Object x) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "updateObject", columnIndex, x);
//      Object object = getSqlValue(columnIndex, findColumn(columnIndex), x);
//      super.updateObject(columnIndex, object);
//  }
//
//  @Override
//  public void updateObject(int columnIndex, Object x, int scale) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "updateObject", columnIndex, x, scale);
//      Object object = getSqlValue(columnIndex, findColumn(columnIndex), x);
//      super.updateObject(columnIndex, object, scale);
//  }
//
//  @Override
//  public void updateObject(String columnName, Object x) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "updateObject", columnName, x);
//      Object object = getSqlValue(findColumn(columnName), columnName, x);
//      super.updateObject(columnName, object);
//  }
//
//  @Override
//  public void updateObject(String columnName, Object x, int scale) throws SQLException {
//      Bitacora.trace(RecursoCachedRowSet.class, "updateObject", columnName, x, scale);
//      Object object = getSqlValue(findColumn(columnName), columnName, x);
//      super.updateObject(columnName, object, scale);
//  }
    // </editor-fold>
//
    // <editor-fold defaultstate="collapsed" desc="updateInt">
//  @Override
//  public void updateInt(int columnIndex, int x) throws SQLException {
//      super.updateObject(columnIndex, BigDecimal.valueOf(x));
//  }
//
//  @Override
//  public void updateInt(String columnName, int x) throws SQLException {
//      super.updateObject(columnName, BigDecimal.valueOf(x));
//  }
    // </editor-fold>
//
    // <editor-fold defaultstate="collapsed" desc="updateLong">
//  @Override
//  public void updateLong(int columnIndex, long x) throws SQLException {
//      super.updateObject(columnIndex, BigDecimal.valueOf(x));
//  }
//
//  @Override
//  public void updateLong(String columnName, long x) throws SQLException {
//      super.updateObject(columnName, BigDecimal.valueOf(x));
//  }
    // </editor-fold>
//
    // <editor-fold defaultstate="collapsed" desc="getColumnType">
//  private int getColumnType(int columnIndex) {
//      try {
//          ResultSetMetaData rsmd = getMetaData();
//          return rsmd.getColumnType(columnIndex);
//      } catch (SQLException ex) {
//          TLC.getBitacora().fatal(ex);
//      }
//      return java.sql.Types.OTHER;
//  }
    // </editor-fold>
//
    // <editor-fold defaultstate="collapsed" desc="initColumnTypes">
//  private void initColumnTypes() {
//      try {
//          ResultSetMetaData rsmd = getMetaData();
//          int numberOfColumns = rsmd.getColumnCount();
//          String columnName;
//          int columnType;
//          for (int i = 1; i <= numberOfColumns; i++) {
//              columnName = rsmd.getColumnName(i);
//              columnType = rsmd.getColumnType(i);
//              switch (columnType) {
//                  case java.sql.Types.BOOLEAN:
//                      columnTypes.put(columnName, Boolean.class);
//                      break;
//                  case java.sql.Types.CHAR:
//                  case java.sql.Types.VARCHAR:
//                  case java.sql.Types.LONGVARCHAR:
//                  case java.sql.Types.NCHAR:
//                  case java.sql.Types.NVARCHAR:
//                  case java.sql.Types.LONGNVARCHAR:
//                      columnTypes.put(columnName, String.class);
//                      break;
//                  case java.sql.Types.BIT:
//                  case java.sql.Types.TINYINT:
//                  case java.sql.Types.SMALLINT:
//                  case java.sql.Types.INTEGER:
//                      columnTypes.put(columnName, Integer.class);
//                      break;
//                  case java.sql.Types.BIGINT:
//                      columnTypes.put(columnName, Long.class);
//                      break;
//                  case java.sql.Types.FLOAT:
//                  case java.sql.Types.REAL:
//                      columnTypes.put(columnName, Float.class);
//                      break;
//                  case java.sql.Types.DOUBLE:
//                      columnTypes.put(columnName, Double.class);
//                      break;
//                  case java.sql.Types.NUMERIC:
//                  case java.sql.Types.DECIMAL:
//                      columnTypes.put(columnName, BigDecimal.class);
//                      break;
//                  case java.sql.Types.DATE:
//                  case java.sql.Types.TIME:
//                  case java.sql.Types.TIMESTAMP:
//                      columnTypes.put(columnName, Timestamp.class);
//                      break;
//              }
//          }
//      } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
//      }
//  }
    // </editor-fold>
//
    // <editor-fold defaultstate="collapsed" desc="getSqlValue">
//  private Object getSqlValue(int columnIndex, String columnName, Object x) {
//      if (x == null) {
//          return x;
//      }
//      Class<?> cx = x.getClass();
//      String cxsn = cx.getSimpleName();
//      Bitacora.trace("[#]" + columnIndex + ":" + columnName + "[" + cxsn + "]" + x);
//      if (x instanceof Integer) {
//          return BigDecimal.valueOf(((Integer) x).longValue());
//      } else if (x instanceof Long) {
//          return BigDecimal.valueOf(((Long) x).longValue());
//      } else if (x instanceof BigInteger) {
//          return BigDecimal.valueOf(((BigInteger) x).longValue());
//      } else if (x instanceof Double) {
//          return BigDecimal.valueOf(((Double) x).doubleValue());
//      }
//      return x;
//  }
    // </editor-fold>
//
}
