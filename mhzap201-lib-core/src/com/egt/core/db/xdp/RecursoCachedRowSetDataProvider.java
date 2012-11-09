/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener cursor informacion.
 *
 */
package com.egt.core.db.xdp;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.util.BundleSegmentos;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.OrdenConjuntoResultados;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.DBC;
import com.egt.core.constants.EAC;
import com.egt.core.constants.Global;
import com.egt.core.db.util.DB;
import com.egt.core.db.util.DBUtils;
import com.egt.core.db.util.InterpreteSql;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.egt.core.jsf.JSF;
import com.egt.core.util.EA;
import com.egt.core.util.STP;
import com.sun.data.provider.DataProviderException;
import com.sun.data.provider.FieldKey;
import com.sun.data.provider.RowKey;
import com.sun.data.provider.TableCursorVetoException;
import com.sun.data.provider.TableDataAdapter;
import com.sun.data.provider.TableDataProvider;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.data.provider.impl.TableRowDataProvider;
import com.sun.sql.rowset.CachedRowSetX;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.spi.SyncResolver;
import org.apache.commons.lang.StringUtils;

public class RecursoCachedRowSetDataProvider extends CachedRowSetDataProvider {

    /**
     * Conserva el valor de la propiedad filasElegidas.
     */
    private Set filasElegidas = new LinkedHashSet();

    /**
     * Creates a new instance of RecursoCachedRowSetDataProvider
     */
    public RecursoCachedRowSetDataProvider() {
        super();
        this.init();
    }

    /**
     * Creates a new instance of RecursoCachedRowSetDataProvider
     */
    public RecursoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
        this.init();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCachedRowSet(CachedRowSet cachedRowSet) {
        super.setCachedRowSet(cachedRowSet);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRowAvailable(RowKey row) throws DataProviderException {
        return row == null ? false : super.isRowAvailable(row);
    }

    private void init() {
        super.addTableDataListener(new TableDataAdapter() {

            @Override
            public void valueChanged(TableDataProvider tdp, FieldKey fk, RowKey rk, Object o3, Object o4) {
                recursoCachedRowSetDataProvider_valueChanged(tdp, fk, rk, o3, o4);
            }

        });
    }

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a interfaces">
    public boolean isRecursoIdentificable() {
        return this instanceof RecursoIdentificableDataProvider
                && StringUtils.isNotBlank(((RecursoIdentificableDataProvider) this).getColumnaIdentificacionRecurso());
    }

    public boolean isRecursoVersionable() {
        return this instanceof RecursoVersionableDataProvider
                && StringUtils.isNotBlank(((RecursoVersionableDataProvider) this).getColumnaVersionRecurso());
    }

    public boolean isRecursoCodificable() {
        return this instanceof RecursoCodificableDataProvider
                && StringUtils.isNotBlank(((RecursoCodificableDataProvider) this).getColumnaCodigoRecurso());
    }

    public boolean isRecursoNombrable() {
        return this instanceof RecursoNombrableDataProvider
                && StringUtils.isNotBlank(((RecursoNombrableDataProvider) this).getColumnaNombreRecurso());
    }

    public boolean isRecursoPersonalizable() {
        return this instanceof RecursoPersonalizableDataProvider
                && StringUtils.isNotBlank(((RecursoPersonalizableDataProvider) this).getColumnaPropietarioRecurso());
    }

    public boolean isRecursoSegmentable() {
        return this instanceof RecursoSegmentableDataProvider
                && StringUtils.isNotBlank(((RecursoSegmentableDataProvider) this).getColumnaSegmentoRecurso());
    }

    public boolean isRecursoJerarquizable() {
        return this instanceof RecursoJerarquizableDataProvider
                && StringUtils.isNotBlank(((RecursoJerarquizableDataProvider) this).getColumnaRecursoSuperior());
    }

    public boolean isRecursoDesactivable() {
        return this instanceof RecursoDesactivableDataProvider
                && StringUtils.isNotBlank(((RecursoDesactivableDataProvider) this).getColumnaEsRecursoInactivo());
    }

    public boolean isRecursoEnumerable() {
        return this instanceof RecursoEnumerableDataProvider
                && StringUtils.isNotBlank(((RecursoEnumerableDataProvider) this).getColumnaNumeroRecurso());
    }

    public boolean isRecursoLocalizable() {
        return this instanceof RecursoLocalizableDataProvider;
    }

    public boolean isRecursoConsultable() {
        return this instanceof RecursoConsultableDataProvider;
    }

    public RecursoIdentificableDataProvider getRecursoIdentificableDataProvider() {
        return this.isRecursoIdentificable()
                ? (RecursoIdentificableDataProvider) this
                : null;
    }

    public RecursoVersionableDataProvider getRecursoVersionableDataProvider() {
        return this.isRecursoVersionable()
                ? (RecursoVersionableDataProvider) this
                : null;
    }

    public RecursoCodificableDataProvider getRecursoCodificableDataProvider() {
        return this.isRecursoCodificable()
                ? (RecursoCodificableDataProvider) this
                : null;
    }

    public RecursoNombrableDataProvider getRecursoNombrableDataProvider() {
        return this.isRecursoNombrable()
                ? (RecursoNombrableDataProvider) this
                : null;
    }

    public RecursoPersonalizableDataProvider getRecursoPersonalizableDataProvider() {
        return this.isRecursoPersonalizable()
                ? (RecursoPersonalizableDataProvider) this
                : null;
    }

    public RecursoSegmentableDataProvider getRecursoSegmentableDataProvider() {
        return this.isRecursoSegmentable()
                ? (RecursoSegmentableDataProvider) this
                : null;
    }

    public RecursoJerarquizableDataProvider getRecursoJerarquizableDataProvider() {
        return this.isRecursoJerarquizable()
                ? (RecursoJerarquizableDataProvider) this
                : null;
    }

    public RecursoDesactivableDataProvider getRecursoDesactivableDataProvider() {
        return this.isRecursoDesactivable()
                ? (RecursoDesactivableDataProvider) this
                : null;
    }

    public RecursoEnumerableDataProvider getRecursoEnumerableDataProvider() {
        return this.isRecursoEnumerable()
                ? (RecursoEnumerableDataProvider) this
                : null;
    }

    public RecursoLocalizableDataProvider getRecursoLocalizableDataProvider() {
        return this.isRecursoLocalizable()
                ? (RecursoLocalizableDataProvider) this
                : null;
    }

    public RecursoConsultableDataProvider getRecursoConsultableDataProvider() {
        return this.isRecursoConsultable()
                ? (RecursoConsultableDataProvider) this
                : null;
    }

    public Long getIdentificacionRecurso() {
        return this.isRecursoIdentificable() ? this.getRecursoIdentificableDataProvider().getIdentificacionRecurso() : null;
    }

    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.isRecursoIdentificable() ? this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey) : null;
    }

    public Long getVersionRecurso() {
        return this.isRecursoVersionable() ? this.getRecursoVersionableDataProvider().getVersionRecurso() : null;
    }

    public Long getVersionRecurso(RowKey rowKey) {
        return this.isRecursoVersionable() ? this.getRecursoVersionableDataProvider().getVersionRecurso(rowKey) : null;
    }

    public String getCodigoRecurso() {
        return this.isRecursoCodificable() ? this.getRecursoCodificableDataProvider().getCodigoRecurso() : null;
    }

    public String getCodigoRecurso(RowKey rowKey) {
        return this.isRecursoCodificable() ? this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey) : null;
    }

    public String getNombreRecurso() {
        return this.isRecursoNombrable() ? this.getRecursoNombrableDataProvider().getNombreRecurso() : null;
    }

    public String getNombreRecurso(RowKey rowKey) {
        return this.isRecursoNombrable() ? this.getRecursoNombrableDataProvider().getNombreRecurso(rowKey) : null;
    }

    public Long getPropietarioRecurso() {
        return this.isRecursoPersonalizable() ? this.getRecursoPersonalizableDataProvider().getPropietarioRecurso() : null;
    }

    public Long getPropietarioRecurso(RowKey rowKey) {
        return this.isRecursoPersonalizable() ? this.getRecursoPersonalizableDataProvider().getPropietarioRecurso(rowKey) : null;
    }

    public Long getSegmentoRecurso() {
        return this.isRecursoSegmentable() ? this.getRecursoSegmentableDataProvider().getSegmentoRecurso() : null;
    }

    public Long getSegmentoRecurso(RowKey rowKey) {
        return this.isRecursoSegmentable() ? this.getRecursoSegmentableDataProvider().getSegmentoRecurso(rowKey) : null;
    }

    public Long getRecursoSuperior() {
        return this.isRecursoJerarquizable() ? this.getRecursoJerarquizableDataProvider().getRecursoSuperior() : null;
    }

    public Long getRecursoSuperior(RowKey rowKey) {
        return this.isRecursoJerarquizable() ? this.getRecursoJerarquizableDataProvider().getRecursoSuperior(rowKey) : null;
    }

    public Integer getEsRecursoInactivo() {
        return this.isRecursoDesactivable() ? this.getRecursoDesactivableDataProvider().getEsRecursoInactivo() : null;
    }

    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.isRecursoDesactivable() ? this.getRecursoDesactivableDataProvider().getEsRecursoInactivo(rowKey) : null;
    }

    public Integer getNumeroRecurso() {
        return this.isRecursoEnumerable() ? this.getRecursoEnumerableDataProvider().getNumeroRecurso() : null;
    }

    public Integer getNumeroRecurso(RowKey rowKey) {
        return this.isRecursoEnumerable() ? this.getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey) : null;
    }

    public String getUrl() {
        return this.isRecursoLocalizable() ? this.getRecursoLocalizableDataProvider().getUrl() : null;
    }

    public String getUrl(RowKey rowKey) {
        return this.isRecursoLocalizable() ? this.getRecursoLocalizableDataProvider().getUrl(rowKey) : null;
    }

    public long getFuncionConsultarRecurso() {
        return this.isRecursoConsultable() ? this.getRecursoConsultableDataProvider().getFuncionConsultarRecurso() : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters y Setters de propiedades propias">
    /**
     * Getter para propiedad filasElegidas.
     *
     * @return Valor de la propiedad filasElegidas.
     */
    public Set getFilasElegidas() {
        return this.filasElegidas;
    }

    public boolean esFilaElegida(TableRowDataProvider tableRowDataProvider) {
        return tableRowDataProvider != null && this.esFilaElegida(tableRowDataProvider.getTableRow());
    }

    public boolean esFilaElegida(RowKey rowKey) {
        return rowKey != null && this.getFilasElegidas().contains(rowKey);
    }

    public void eligeFila(TableRowDataProvider tableRowDataProvider, boolean eleccion) {
        if (tableRowDataProvider != null) {
            this.eligeFila(tableRowDataProvider.getTableRow(), eleccion);
        }
    }

    public void eligeFila(RowKey rowKey, boolean eleccion) {
        if (eleccion) {
            this.getFilasElegidas().add(rowKey);
        } else {
            this.getFilasElegidas().remove(rowKey);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters y Setters de propiedades de RecursoCachedRowSet">
    /**
     * Getter para propiedad recursoCachedRowSetXImpl.
     *
     * @return Valor de la propiedad recursoCachedRowSetXImpl.
     */
    public RecursoCachedRowSet getRecursoCachedRowSet() {
        CachedRowSet crs = this.getCachedRowSet();
        return crs instanceof RecursoCachedRowSet ? (RecursoCachedRowSet) crs : null;
    }

    /**
     * Getter para propiedad inicializado.
     *
     * @return Valor de la propiedad inicializado.
     */
    public boolean isInicializado() {
        return this.getRecursoCachedRowSet() == null ? false : this.getRecursoCachedRowSet().isInicializado();
    }

    /**
     * Setter para propiedad inicializado.
     *
     * @param inicializado Nuevo valor de la propiedad inicializado.
     */
    protected void setInicializado(boolean inicializado) {
        if (this.getRecursoCachedRowSet() != null) {
            this.getRecursoCachedRowSet().setInicializado(inicializado);
        }
    }

    /**
     * Getter para propiedad soloReferencia.
     *
     * @return Valor de la propiedad soloReferencia.
     */
    public boolean isSoloReferencia() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isSoloReferencia();
    }

    /**
     * Setter para propiedad soloReferencia.
     *
     * @param soloReferencia Nuevo valor de la propiedad soloReferencia.
     */
    public void setSoloReferencia(boolean soloReferencia) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setSoloReferencia(soloReferencia);
        }
    }

    /**
     * Getter para propiedad filaEscogida.
     *
     * @return Valor de la propiedad filaEscogida.
     */
    public RowKey getFilaEscogida() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFilaEscogida();
    }

    /**
     * Setter para propiedad filaEscogida.
     *
     * @param filaElegida Nuevo valor de la propiedad filaEscogida.
     */
    public void setFilaEscogida() {
        // Bitacora.trace(this.getClass(), "setFilaEscogida");
        if (this.isInicializado()) {
            try {
                if (this.isCursorRowAvailable()) {
                    this.setFilaEscogida(this.getCursorRow());
                } else {
                    this.resetFilaEscogida();
                }
            } catch (Exception ex) {
                this.resetFilaEscogida();
            }
        }
    }

    /**
     * Setter para propiedad filaEscogida.
     *
     * @param filaElegida Nuevo valor de la propiedad filaEscogida.
     */
    public void setFilaEscogida(RowKey rowKey) {
        Bitacora.trace(this.getClass(), "setFilaEscogida", "RowKey=" + rowKey);
        if (this.isInicializado() && this.isRowAvailable(rowKey)) {
            this.getRecursoCachedRowSet().setFilaEscogida(rowKey);
            Long identificacion = null;
            if (this.isRecursoIdentificable()) {
                identificacion = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
            }
            this.setIdentificacionFilaEscogida(identificacion);
            Integer numero = null;
            if (this.isRecursoEnumerable()) {
                numero = this.getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey);
            }
            this.setNumeroFilaEscogida(numero);
            String codigo = null;
            if (this.isRecursoCodificable()) {
                codigo = this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
            }
            this.setCodigoFilaEscogida(codigo);
            Bitacora.trace(this.getClass(), "setFilaEscogida", "RowKey=" + rowKey,
                    "identificacion=" + identificacion, "numero=" + numero, "codigo=" + codigo);
        } else {
            this.resetFilaEscogida();
        }
    }

    /**
     * Setter para propiedad filaEscogida.
     *
     * @param filaElegida Nuevo valor de la propiedad filaEscogida.
     */
    protected void resetFilaEscogida() {
        // Bitacora.trace(this.getClass(), "resetFilaEscogida");
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFilaEscogida(null);
            this.getRecursoCachedRowSet().setIdentificacionFilaEscogida(null);
            this.getRecursoCachedRowSet().setCodigoFilaEscogida(null);
        }
    }

    public boolean esFilaEscogida(RowKey rowKey) {
        RowKey filaEscogida = !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFilaEscogida();
        return filaEscogida != null && rowKey != null && rowKey.equals(filaEscogida);
    }

    /**
     * Getter para propiedad identificacionFilaEscogida.
     *
     * @return Valor de la propiedad identificacionFilaEscogida.
     */
    protected Long getIdentificacionFilaEscogida() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getIdentificacionFilaEscogida();
    }

    /**
     * Setter para propiedad identificacionFilaEscogida.
     *
     * @param identificacionFilaEscogida Nuevo valor de la propiedad identificacionFilaEscogida.
     */
    protected void setIdentificacionFilaEscogida(Long identificacionFilaEscogida) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setIdentificacionFilaEscogida(identificacionFilaEscogida);
        }
    }

    /**
     * Getter para propiedad numeroFilaEscogida.
     *
     * @return Valor de la propiedad numeroFilaEscogida.
     */
    protected Integer getNumeroFilaEscogida() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getNumeroFilaEscogida();
    }

    /**
     * Setter para propiedad numeroFilaEscogida.
     *
     * @param numeroFilaEscogida Nuevo valor de la propiedad numeroFilaEscogida.
     */
    protected void setNumeroFilaEscogida(Integer numeroFilaEscogida) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setNumeroFilaEscogida(numeroFilaEscogida);
        }
    }

    /**
     * Getter para propiedad codigoFilaEscogida.
     *
     * @return Valor de la propiedad codigoFilaEscogida.
     */
    protected String getCodigoFilaEscogida() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getCodigoFilaEscogida();
    }

    /**
     * Setter para propiedad codigoFilaEscogida.
     *
     * @param codigoFilaEscogida Nuevo valor de la propiedad codigoFilaEscogida.
     */
    protected void setCodigoFilaEscogida(String codigoFilaEscogida) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCodigoFilaEscogida(codigoFilaEscogida);
        }
    }

    /**
     * Getter para propiedad tablaMaestro.
     *
     * @return Valor de la propiedad tablaMaestro.
     */
    public String getTablaMaestro() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getTablaMaestro();
    }

    /**
     * Setter para propiedad tablaMaestro.
     *
     * @param tablaMaestro Nuevo valor de la propiedad tablaMaestro.
     */
    public void setTablaMaestro(String tablaMaestro) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setTablaMaestro(tablaMaestro);
        }
    }

    /**
     * Getter para propiedad columnaMaestro.
     *
     * @return Valor de la propiedad columnaMaestro.
     */
    public String getColumnaMaestro() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getColumnaMaestro();
    }

    /**
     * Setter para propiedad columnaMaestro.
     *
     * @param columnaMaestro Nuevo valor de la propiedad columnaMaestro.
     */
    public void setColumnaMaestro(String columnaMaestro) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setColumnaMaestro(columnaMaestro);
        }
    }

    /**
     * Getter para propiedad columnaMaestroAnterior.
     *
     * @return Valor de la propiedad columnaMaestroAnterior.
     */
    public String getColumnaMaestroAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getColumnaMaestroAnterior();
    }

    /**
     * Setter para propiedad columnaMaestroAnterior.
     *
     * @param columnaMaestroAnterior Nuevo valor de la propiedad columnaMaestroAnterior.
     */
    public void setColumnaMaestroAnterior(String columnaMaestroAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setColumnaMaestroAnterior(columnaMaestroAnterior);
        }
    }

    /**
     * Getter para propiedad identificacionMaestro.
     *
     * @return Valor de la propiedad identificacionMaestro.
     */
    public Long getIdentificacionMaestro() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getIdentificacionMaestro();
    }

    /**
     * Setter para propiedad identificacionMaestro.
     *
     * @param identificacionMaestro Nuevo valor de la propiedad identificacionMaestro.
     */
    public void setIdentificacionMaestro(Long identificacionMaestro) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setIdentificacionMaestro(identificacionMaestro);
        }
    }

    /**
     * Getter para propiedad identificacionMaestroAnterior.
     *
     * @return Valor de la propiedad identificacionMaestroAnterior.
     */
    public Long getIdentificacionMaestroAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getIdentificacionMaestroAnterior();
    }

    /**
     * Setter para propiedad identificacionMaestroAnterior.
     *
     * @param identificacionMaestroAnterior Nuevo valor de la propiedad identificacionMaestroAnterior.
     */
    public void setIdentificacionMaestroAnterior(Long identificacionMaestroAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setIdentificacionMaestroAnterior(identificacionMaestroAnterior);
        }
    }

    /**
     * Getter para propiedad filasProcesadas.
     *
     * @return Valor de la propiedad filasProcesadas.
     */
    public Map getFilasProcesadas() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFilasProcesadas();
    }

    public boolean esFilaProcesada(TableRowDataProvider tableRowDataProvider) {
        return tableRowDataProvider != null && this.esFilaProcesada(tableRowDataProvider.getTableRow());
    }

    public boolean esFilaProcesada(RowKey rowKey) {
        return rowKey != null && this.getFilasProcesadas().containsKey(rowKey.getRowId());
    }

    /**
     * Getter para propiedad filasRemovidas.
     *
     * @return Valor de la propiedad filasRemovidas.
     */
    public Map getFilasRemovidas() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFilasRemovidas();
    }

    public boolean esFilaRemovida(TableRowDataProvider tableRowDataProvider) {
        return tableRowDataProvider != null && this.esFilaRemovida(tableRowDataProvider.getTableRow());
    }

    public boolean esFilaRemovida(RowKey rowKey) {
        return rowKey != null && this.getFilasRemovidas().containsKey(rowKey.getRowId());
    }

    /**
     * Conserva el valor de la propiedad filasPorConfirmar.
     */
    private int filasProcesadasPorConfirmar = 0;

    /**
     * Getter para propiedad filasPorConfirmar.
     *
     * @return Valor de la propiedad filasPorConfirmar.
     */
    protected int getFilasProcesadasPorConfirmar() {
        return this.filasProcesadasPorConfirmar;
    }

    /**
     * Getter para propiedad filasConflictivas.
     *
     * @return Valor de la propiedad filasConflictivas.
     */
    public Map getFilasConflictivas() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFilasConflictivas();
    }

    public boolean esFilaConflictiva(TableRowDataProvider tableRowDataProvider) {
        return tableRowDataProvider != null && this.esFilaConflictiva(tableRowDataProvider.getTableRow());
    }

    public boolean esFilaConflictiva(RowKey rowKey) {
        return rowKey != null && this.getFilasConflictivas().containsKey(rowKey.getRowId());
    }

    /**
     * Getter para propiedad filasEliminadas.
     *
     * @return Valor de la propiedad filasEliminadas.
     */
    public int getFilasEliminadas() {
        return !this.isInicializado() ? 0 : this.getRecursoCachedRowSet().getFilasEliminadas();
    }

    /**
     * Setter para propiedad filasEliminadas.
     *
     * @param filasEliminadas Nuevo valor de la propiedad filasEliminadas.
     */
    protected void setFilasEliminadas(int filasEliminadas) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFilasEliminadas(filasEliminadas);
        }
    }

    protected int incrementaFilasEliminadas() {
        int i = this.getFilasEliminadas();
        this.setFilasEliminadas(++i);
        return this.getFilasEliminadas();
    }

    /**
     * Getter para propiedad filtroFuncionSelect.
     *
     * @return Valor de la propiedad filtroFuncionSelect.
     */
    public Long getFiltroFuncionSelect() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFiltroFuncionSelect();
    }

    /**
     * Setter para propiedad filtroFuncionSelect.
     *
     * @param filtroFuncionSelect Nuevo valor de la propiedad filtroFuncionSelect.
     */
    public void setFiltroFuncionSelect(Long filtroFuncionSelect) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFiltroFuncionSelect(filtroFuncionSelect);
        }
    }

    /**
     * Getter para propiedad filtroFuncionSelectAnterior.
     *
     * @return Valor de la propiedad filtroFuncionSelectAnterior.
     */
    public Long getFiltroFuncionSelectAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getFiltroFuncionSelectAnterior();
    }

    /**
     * Setter para propiedad filtroFuncionSelectAnterior.
     *
     * @param filtroFuncionSelectAnterior Nuevo valor de la propiedad filtroFuncionSelectAnterior.
     */
    public void setFiltroFuncionSelectAnterior(Long filtroFuncionSelectAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFiltroFuncionSelectAnterior(filtroFuncionSelectAnterior);
        }
    }

    /**
     * Getter para propiedad filtroFuncionSelectModificado.
     *
     * @return Valor de la propiedad filtroFuncionSelectModificado.
     */
    public boolean isFiltroFuncionSelectModificado() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFiltroFuncionSelectModificado();
    }

    /**
     * Setter para propiedad filtroFuncionSelectModificado.
     *
     * @param filtroFuncionSelectModificado Nuevo valor de la propiedad filtroFuncionSelectModificado.
     */
    public void setFiltroFuncionSelectModificado(boolean filtroFuncionSelectModificado) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFiltroFuncionSelectModificado(filtroFuncionSelectModificado);
        }
    }

    /**
     * Getter para propiedad codigoFuncionSelect.
     *
     * @return Valor de la propiedad codigoFuncionSelect.
     */
    public String getCodigoFuncionSelect() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getCodigoFuncionSelect();
    }

    /**
     * Setter para propiedad codigoFuncionSelect.
     *
     * @param codigoFuncionSelect Nuevo valor de la propiedad codigoFuncionSelect.
     */
    public void setCodigoFuncionSelect(String codigoFuncionSelect) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCodigoFuncionSelect(codigoFuncionSelect);
        }
    }

    /**
     * Getter para propiedad codigoFuncionSelectAnterior.
     *
     * @return Valor de la propiedad codigoFuncionSelectAnterior.
     */
    public String getCodigoFuncionSelectAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getCodigoFuncionSelectAnterior();
    }

    /**
     * Setter para propiedad codigoFuncionSelectAnterior.
     *
     * @param codigoFuncionSelectAnterior Nuevo valor de la propiedad codigoFuncionSelectAnterior.
     */
    public void setCodigoFuncionSelectAnterior(String codigoFuncionSelectAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCodigoFuncionSelectAnterior(codigoFuncionSelectAnterior);
        }
    }

    /**
     * Getter para propiedad codigoFuncionSelectModificado.
     *
     * @return Valor de la propiedad codigoFuncionSelectModificado.
     */
    public boolean isCodigoFuncionSelectModificado() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isCodigoFuncionSelectModificado();
    }

    /**
     * Setter para propiedad codigoFuncionSelectModificado.
     *
     * @param codigoFuncionSelectModificado Nuevo valor de la propiedad codigoFuncionSelectModificado.
     */
    public void setCodigoFuncionSelectModificado(boolean codigoFuncionSelectModificado) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCodigoFuncionSelectModificado(codigoFuncionSelectModificado);
        }
    }

    /**
     * Getter para propiedad nombreFuncionSelect.
     *
     * @return Valor de la propiedad nombreFuncionSelect.
     */
    public String getNombreFuncionSelect() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getNombreFuncionSelect();
    }

    /**
     * Setter para propiedad nombreFuncionSelect.
     *
     * @param nombreFuncionSelect Nuevo valor de la propiedad nombreFuncionSelect.
     */
    public void setNombreFuncionSelect(String nombreFuncionSelect) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setNombreFuncionSelect(nombreFuncionSelect);
        }
    }

    /**
     * Getter para propiedad nombreFuncionSelectAnterior.
     *
     * @return Valor de la propiedad nombreFuncionSelectAnterior.
     */
    public String getNombreFuncionSelectAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getNombreFuncionSelectAnterior();
    }

    /**
     * Setter para propiedad nombreFuncionSelectAnterior.
     *
     * @param nombreFuncionSelectAnterior Nuevo valor de la propiedad nombreFuncionSelectAnterior.
     */
    public void setNombreFuncionSelectAnterior(String nombreFuncionSelectAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setNombreFuncionSelectAnterior(nombreFuncionSelectAnterior);
        }
    }

    /**
     * Getter para propiedad nombreFuncionSelectModificado.
     *
     * @return Valor de la propiedad nombreFuncionSelectModificado.
     */
    public boolean isNombreFuncionSelectModificado() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isNombreFuncionSelectModificado();
    }

    /**
     * Setter para propiedad nombreFuncionSelectModificado.
     *
     * @param nombreFuncionSelectModificado Nuevo valor de la propiedad nombreFuncionSelectModificado.
     */
    public void setNombreFuncionSelectModificado(boolean nombreFuncionSelectModificado) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setNombreFuncionSelectModificado(nombreFuncionSelectModificado);
        }
    }

    /**
     * Getter para propiedad filtroFuncionSelect.
     *
     * @return Valor de la propiedad filtroFuncionSelect.
     */
    public Long getSegmentoFuncionSelect() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getSegmentoFuncionSelect();
    }

    /**
     * Setter para propiedad filtroFuncionSelect.
     *
     * @param filtroFuncionSelect Nuevo valor de la propiedad filtroFuncionSelect.
     */
    public void setSegmentoFuncionSelect(Long filtroFuncionSelect) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setSegmentoFuncionSelect(filtroFuncionSelect);
        }
    }

    /**
     * Getter para propiedad funcionSelect.
     *
     * @return Valor de la propiedad funcionSelect.
     */
    public long getFuncionSelect() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getFuncionSelect();
    }

    /**
     * Setter para propiedad funcionSelect.
     *
     * @param funcionSelect Nuevo valor de la propiedad funcionSelect.
     */
    public void setFuncionSelect(long funcion) throws ExcepcionAplicacion {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionSelect(funcion);
        }
    }

    /**
     * Getter para propiedad funcionInsert.
     *
     * @return Valor de la propiedad funcionInsert.
     */
    public long getFuncionInsert() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getFuncionInsert();
    }

    /**
     * Setter para propiedad funcionInsert.
     *
     * @param funcionInsert Nuevo valor de la propiedad funcionInsert.
     */
    public void setFuncionInsert(long funcion) throws ExcepcionAplicacion {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionInsert(funcion);
        }
    }

    /**
     * Getter para propiedad funcionUpdate.
     *
     * @return Valor de la propiedad funcionUpdate.
     */
    public long getFuncionUpdate() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getFuncionUpdate();
    }

    /**
     * Setter para propiedad funcionUpdate.
     *
     * @param funcionUpdate Nuevo valor de la propiedad funcionUpdate.
     */
    public void setFuncionUpdate(long funcion) throws ExcepcionAplicacion {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionUpdate(funcion);
        }
    }

    /**
     * Getter para propiedad funcionDelete.
     *
     * @return Valor de la propiedad funcionDelete.
     */
    public long getFuncionDelete() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getFuncionDelete();
    }

    /**
     * Setter para propiedad funcionDelete.
     *
     * @param funcionDelete Nuevo valor de la propiedad funcionDelete.
     */
    public void setFuncionDelete(long funcion) throws ExcepcionAplicacion {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionDelete(funcion);
        }
    }

    /**
     * Getter para propiedad funcionBusinessProcess.
     *
     * @return Valor de la propiedad funcionBusinessProcess.
     */
    public long getFuncionBusinessProcess() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getFuncionBusinessProcess();
    }

    /**
     * Setter para propiedad funcionBusinessProcess.
     *
     * @param funcionBusinessProcess Nuevo valor de la propiedad funcionBusinessProcess.
     */
    public void setFuncionBusinessProcess(long funcion) throws ExcepcionAplicacion {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionBusinessProcess(funcion);
        }
    }

    /**
     * Getter para propiedad funcionSelectAutorizada.
     *
     * @return Valor de la propiedad funcionSelectAutorizada.
     */
    public boolean isFuncionSelectAutorizada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionSelectAutorizada();
    }

    /**
     * Getter para propiedad funcionInsertAutorizada.
     *
     * @return Valor de la propiedad funcionInsertAutorizada.
     */
    public boolean isFuncionInsertAutorizada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionInsertAutorizada();
    }

    /**
     * Getter para propiedad funcionUpdateAutorizada.
     *
     * @return Valor de la propiedad funcionUpdateAutorizada.
     */
    public boolean isFuncionUpdateAutorizada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionUpdateAutorizada();
    }

    /**
     * Getter para propiedad funcionDeleteAutorizada.
     *
     * @return Valor de la propiedad funcionDeleteAutorizada.
     */
    public boolean isFuncionDeleteAutorizada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionDeleteAutorizada();
    }

    /**
     * Getter para propiedad funcionBusinessProcessAutorizada.
     *
     * @return Valor de la propiedad funcionBusinessProcessAutorizada.
     */
    public boolean isFuncionBusinessProcessAutorizada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionBusinessProcessAutorizada();
    }

    /**
     * Getter para propiedad funcionSelectEjecutada.
     *
     * @return Valor de la propiedad funcionSelectEjecutada.
     */
    public boolean isFuncionSelectEjecutada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionSelectEjecutada();
    }

    /**
     * Setter para propiedad funcionSelectEjecutada.
     *
     * @param funcionSelectEjecutada Nuevo valor de la propiedad funcionSelectEjecutada.
     */
    protected void setFuncionSelectEjecutada(boolean funcionSelectEjecutada) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionSelectEjecutada(funcionSelectEjecutada);
        }
    }

    /**
     * Getter para propiedad funcionInsertEjecutada.
     *
     * @return Valor de la propiedad funcionInsertEjecutada.
     */
    public boolean isFuncionInsertEjecutada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionInsertEjecutada();
    }

    /**
     * Setter para propiedad funcionInsertEjecutada.
     *
     * @param funcionInsertEjecutada Nuevo valor de la propiedad funcionInsertEjecutada.
     */
    protected void setFuncionInsertEjecutada(boolean funcionInsertEjecutada) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionInsertEjecutada(funcionInsertEjecutada);
        }
    }

    /**
     * Getter para propiedad funcionUpdateEjecutada.
     *
     * @return Valor de la propiedad funcionUpdateEjecutada.
     */
    public boolean isFuncionUpdateEjecutada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionUpdateEjecutada();
    }

    /**
     * Setter para propiedad funcionUpdateEjecutada.
     *
     * @param funcionUpdateEjecutada Nuevo valor de la propiedad funcionUpdateEjecutada.
     */
    protected void setFuncionUpdateEjecutada(boolean funcionUpdateEjecutada) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionUpdateEjecutada(funcionUpdateEjecutada);
        }
    }

    /**
     * Getter para propiedad funcionDeleteEjecutada.
     *
     * @return Valor de la propiedad funcionDeleteEjecutada.
     */
    public boolean isFuncionDeleteEjecutada() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionDeleteEjecutada();
    }

    /**
     * Setter para propiedad funcionDeleteEjecutada.
     *
     * @param funcionDeleteEjecutada Nuevo valor de la propiedad funcionDeleteEjecutada.
     */
    protected void setFuncionDeleteEjecutada(boolean funcionDeleteEjecutada) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFuncionDeleteEjecutada(funcionDeleteEjecutada);
        }
    }

    /**
     * Getter para propiedad funcionBusinessProcessEjecutada.
     *
     * @return Valor de la propiedad funcionBusinessProcessEjecutada.
     */
//  public boolean isFuncionBusinessProcessEjecutada() {
//      return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFuncionBusinessProcessEjecutada();
//  }
//
    /**
     * Setter para propiedad funcionBusinessProcessEjecutada.
     *
     * @param funcionBusinessProcessEjecutada Nuevo valor de la propiedad funcionBusinessProcessEjecutada.
     */
//  protected void setFuncionBusinessProcessEjecutada(boolean funcionBusinessProcessEjecutada) {
//      if (this.isInicializado()) {
//          this.getRecursoCachedRowSet().setFuncionBusinessProcessEjecutada(funcionBusinessProcessEjecutada);
//      }
//  }
//
    /**
     * Getter para propiedad filtroEscondido.
     *
     * @return Valor de la propiedad filtroEscondido.
     */
    public boolean isFiltroEscondido() {
        return !this.isInicializado() ? false : this.getRecursoCachedRowSet().isFiltroEscondido();
    }

    /**
     * Setter para propiedad filtroEscondido.
     *
     * @param filtroEscondido Nuevo valor de la propiedad filtroEscondido.
     */
    public void setFiltroEscondido(boolean filtroEscondido) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setFiltroEscondido(filtroEscondido);
        }
    }

    /**
     * Getter para propiedad versionComandoSelect.
     *
     * @return Valor de la propiedad versionComandoSelect.
     */
    public long getVersionComandoSelect() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getVersionComandoSelect();
    }

    /**
     * Setter para propiedad versionComandoSelect.
     *
     * @param versionComandoSelect Nuevo valor de la propiedad versionComandoSelect.
     */
    protected void setVersionComandoSelect(long versionComandoSelect) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setVersionComandoSelect(versionComandoSelect);
        }
    }

    protected void incrementaVersionComandoSelect() {
        long i = this.getVersionComandoSelect();
        this.setVersionComandoSelect(++i);
    }

    /**
     * Getter para propiedad versionComandoSelectAnterior.
     *
     * @return Valor de la propiedad versionComandoSelectAnterior.
     */
    public long getVersionComandoSelectAnterior() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getVersionComandoSelectAnterior();
    }

    /**
     * Setter para propiedad versionComandoSelectAnterior.
     *
     * @param versionComandoSelectAnterior Nuevo valor de la propiedad versionComandoSelectAnterior.
     */
    protected void setVersionComandoSelectAnterior(long versionComandoSelectAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setVersionComandoSelectAnterior(versionComandoSelectAnterior);
        }
    }

    /**
     * Getter para propiedad versionComandoInsert.
     *
     * @return Valor de la propiedad versionComandoInsert.
     */
    public long getVersionComandoInsert() {
        return !this.isInicializado() ? -1L : this.getRecursoCachedRowSet().getVersionComandoInsert();
    }

    /**
     * Setter para propiedad versionComandoInsert.
     *
     * @param versionComandoInsert Nuevo valor de la propiedad versionComandoInsert.
     */
    protected void setVersionComandoInsert(long versionComandoInsert) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setVersionComandoInsert(versionComandoInsert);
        }
    }

    /**
     * Getter para propiedad criteriosBusqueda.
     *
     * @return Valor de la propiedad criteriosBusqueda.
     */
    public String getCriteriosBusqueda() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getCriteriosBusqueda();
    }

    /**
     * Setter para propiedad criteriosBusqueda.
     *
     * @param criteriosBusqueda Nuevo valor de la propiedad criteriosBusqueda.
     */
    public void setCriteriosBusqueda(String criteriosBusqueda) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCriteriosBusqueda(criteriosBusqueda);
        }
    }

    /**
     * Setter para propiedad criteriosBusqueda.
     *
     * @param criteriosBusqueda Nuevo valor de la propiedad criteriosBusqueda.
     */
    public void setCriteriosBusqueda(FiltroBusqueda filtro) {
        if (this.isInicializado()) {
            String criteriosBusqueda = filtro == null ? null : filtro.toString(this.getCodigoDominioRecurso());
            this.getRecursoCachedRowSet().setCriteriosBusqueda(criteriosBusqueda);
        }
    }

    /**
     * Getter para propiedad criteriosOrden.
     *
     * @return Valor de la propiedad criteriosOrden.
     */
    public String getCriteriosOrden() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getCriteriosOrden();
    }

    /**
     * Setter para propiedad criteriosOrden.
     *
     * @param criteriosOrden Nuevo valor de la propiedad criteriosOrden.
     */
    public void setCriteriosOrden(String criteriosOrden) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setCriteriosOrden(criteriosOrden);
        }
    }

    /**
     * Setter para propiedad criteriosOrden.
     *
     * @param criteriosOrden Nuevo valor de la propiedad criteriosOrden.
     */
    public void setCriteriosOrden(OrdenConjuntoResultados orden) {
        if (this.isInicializado()) {
            String criteriosOrden = orden == null ? null : orden.toString();
            this.getRecursoCachedRowSet().setCriteriosOrden(criteriosOrden);
        }
    }

    /**
     * Getter para propiedad comandoSelectAnsi.
     *
     * @return Valor de la propiedad comandoSelectAnsi.
     */
    public String getComandoSelectAnsi() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getComandoSelectAnsi();
    }

    /**
     * Setter para propiedad comandoSelectAnsi.
     *
     * @param comandoSelectAnsi Nuevo valor de la propiedad comandoSelectAnsi.
     */
    protected void setComandoSelectAnsi(String comandoSelectAnsi) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setComandoSelectAnsi(comandoSelectAnsi);
        }
    }

    /**
     * Getter para propiedad comandoSelectAnterior.
     *
     * @return Valor de la propiedad comandoSelectAnterior.
     */
    public String getComandoSelectAnterior() {
        return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getComandoSelectAnterior();
    }

    /**
     * Setter para propiedad comandoSelectAnterior.
     *
     * @param comandoSelectAnterior Nuevo valor de la propiedad comandoSelectAnterior.
     */
    protected void setComandoSelectAnterior(String comandoSelectAnterior) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setComandoSelectAnterior(comandoSelectAnterior);
        }
    }

    /**
     * Getter para propiedad opcionZumNodo.
     *
     * @return Valor de la propiedad opcionZumNodo.
     */
    public EnumOpcionZumNodo getOpcionZumNodo() {
        return !this.isInicializado() ? EnumOpcionZumNodo.TODO : this.getRecursoCachedRowSet().getOpcionZumNodo();
    }

    /**
     * Setter para propiedad opcionZumNodo.
     *
     * @param opcionZumNodo Nuevo valor de la propiedad opcionZumNodo.
     */
    public void setOpcionZumNodo(EnumOpcionZumNodo opcionZumNodo) {
        if (this.isInicializado()) {
            this.getRecursoCachedRowSet().setOpcionZumNodo(opcionZumNodo);
        }
    }

    /**
     * Conserva el valor de la propiedad segmentoKeyColumn.
     */
    private String segmentoKeyColumn;

    /**
     * Conserva el valor de la propiedad segmentoFunctionName.
     */
    private String segmentoFunctionName;

    public String getSegmentoKeyColumn() {
//      return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getSegmentoKeyColumn();
        return segmentoKeyColumn;
    }

    public void setSegmentoKeyColumn(String segmentoKeyColumn) {
//      if (this.isInicializado()) {
//          this.getRecursoCachedRowSet().setSegmentoKeyColumn(segmentoKeyColumn);
//      }
        this.segmentoKeyColumn = segmentoKeyColumn;
    }

    public String getSegmentoFunctionName() {
//      return !this.isInicializado() ? null : this.getRecursoCachedRowSet().getSegmentoFunctionName();
        return segmentoFunctionName;
    }

    public void setSegmentoFunctionName(String segmentoFunctionName) {
//      if (this.isInicializado()) {
//          this.getRecursoCachedRowSet().setSegmentoFunctionName(segmentoFunctionName);
//      }
        this.segmentoFunctionName = segmentoFunctionName;
    }

    /**
     * Getter para propiedad consultaInsertDisponible.
     *
     * @return Valor de la propiedad consultaInsertDisponible.
     */
    public boolean isConsultaInsertDisponible() {
        return !this.isInicializado() ? false : this.getVersionComandoInsert() > 0L;
    }

    /**
     * Getter para propiedad consultaAnteriorDisponible.
     *
     * @return Valor de la propiedad consultaAnteriorDisponible.
     */
    public boolean isConsultaAnteriorDisponible() {
        return !this.isInicializado() ? false : this.getVersionComandoSelectAnterior() > 0L;
    }

    /**
     * Getter para propiedad funcionSelectHabilitada.
     *
     * @return Valor de la propiedad funcionSelectHabilitada.
     */
    public boolean isFuncionSelectHabilitada() {
        // boolean b = this.isFuncionSelectAutorizada();
        // int i = this.getFilasProcesadas().size() + this.getFilasEliminadas();
        // return b && i == 0;
        return this.isFuncionSelectAutorizada() && this.isLoteSinCambios();
    }

    /**
     * Getter para propiedad funcionInsertHabilitada.
     *
     * @return Valor de la propiedad funcionInsertHabilitada.
     */
    public boolean isFuncionInsertHabilitada() {
        // removeRow + appendRow + setCursorRow = java.lang.IllegalArgumentException
        // por lo tanto, hay que evitar el appendRow(con su consecuente setCursorRow) si se ejecuta un removeRow
        // boolean b = this.isFuncionInsertAutorizada();
        // int i = this.getFilasEliminadas();
        // return b && i == 0;
        // return this.isFuncionInsertAutorizada() && !this.isFuncionDeleteEjecutada();
        return this.isFuncionSelectEjecutada() && !this.isFuncionUpdateEjecutada() && !this.isFuncionDeleteEjecutada();
    }

    /**
     * Getter para propiedad funcionUpdateHabilitada.
     *
     * @return Valor de la propiedad funcionUpdateHabilitada.
     */
    public boolean isFuncionUpdateHabilitada() {
        // return this.isFuncionUpdateAutorizada() && this.isLoteConFilas();
        return this.isLoteConFilas() && !this.isFuncionInsertEjecutada() && !this.isFuncionDeleteEjecutada();
    }

    /**
     * Getter para propiedad funcionDeleteHabilitada.
     *
     * @return Valor de la propiedad funcionDeleteHabilitada.
     */
    public boolean isFuncionDeleteHabilitada() {
        // return this.isFuncionDeleteAutorizada() && this.isLoteConFilas();
        return this.isLoteConFilas() && !this.isFuncionInsertEjecutada() && !this.isFuncionUpdateEjecutada();
    }

    /**
     * Getter para propiedad funcionBusinessProcessHabilitada.
     *
     * @return Valor de la propiedad funcionBusinessProcessHabilitada.
     */
    public boolean isFuncionBusinessProcessHabilitada() {
        // return this.isFuncionBusinessProcessAutorizada() && this.isLoteConFilas();
        return this.isFuncionBusinessProcessAutorizada() && this.isLoteConFilas() && this.isLoteSinCambios();
    }

    /**
     * Getter para propiedad funcionHideFilterHabilitada.
     *
     * @return Valor de la propiedad funcionHideFilterHabilitada.
     */
    public boolean isFuncionHideFilterHabilitada() {
        return this.isFuncionSelectHabilitada() && this.isFuncionSelectEjecutada() && !this.isFiltroEscondido();
    }

    /**
     * Getter para propiedad funcionHideFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionHideFilterInhabilitada.
     */
    public boolean isFuncionHideFilterInhabilitada() {
        return !this.isFuncionHideFilterHabilitada();
    }

    /**
     * Getter para propiedad funcionShowFilterHabilitada.
     *
     * @return Valor de la propiedad funcionShowFilterHabilitada.
     */
    public boolean isFuncionShowFilterHabilitada() {
        return this.isFuncionSelectHabilitada() && this.isFiltroEscondido();
    }

    /**
     * Getter para propiedad funcionShowFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionShowFilterInhabilitada.
     */
    public boolean isFuncionShowFilterInhabilitada() {
        return !this.isFuncionShowFilterHabilitada();
    }

    /**
     * Getter para propiedad funcionModifyFilterHabilitada.
     *
     * @return Valor de la propiedad funcionModifyFilterHabilitada.
     */
    public boolean isFuncionViewFilterHabilitada() {
        return this.isFuncionSelectHabilitada() && !this.isFiltroEscondido();
    }

    /**
     * Getter para propiedad funcionModifyFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionModifyFilterInhabilitada.
     */
    public boolean isFuncionViewFilterInhabilitada() {
        return !this.isFuncionViewFilterHabilitada();
    }

    /**
     * Getter para propiedad funcionApplyFilterHabilitada.
     *
     * @return Valor de la propiedad funcionApplyFilterHabilitada.
     */
    public boolean isFuncionApplyFilterHabilitada() {
        return this.isFuncionSelectHabilitada();
    }

    /**
     * Getter para propiedad funcionApplyFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionApplyFilterInhabilitada.
     */
    public boolean isFuncionApplyFilterInhabilitada() {
        return !this.isFuncionApplyFilterHabilitada();
    }

    /**
     * Getter para propiedad funcionRemoveFilterHabilitada.
     *
     * @return Valor de la propiedad funcionRemoveFilterHabilitada.
     */
    public boolean isFuncionRemoveFilterHabilitada() {
        return this.isFuncionSelectHabilitada() && this.isFiltroFuncionSelectDisponible();
    }

    /**
     * Getter para propiedad funcionRemoveFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionRemoveFilterInhabilitada.
     */
    public boolean isFuncionRemoveFilterInhabilitada() {
        return !this.isFuncionRemoveFilterHabilitada();
    }

    /**
     * Getter para propiedad funcionRestoreFilterHabilitada.
     *
     * @return Valor de la propiedad funcionRestoreFilterHabilitada.
     */
    public boolean isFuncionRestoreFilterHabilitada() {
        return this.isFuncionSelectHabilitada() && this.isFiltroFuncionSelectAnteriorDisponible();
    }

    /**
     * Getter para propiedad funcionRestoreFilterInhabilitada.
     *
     * @return Valor de la propiedad funcionRestoreFilterInhabilitada.
     */
    public boolean isFuncionRestoreFilterInhabilitada() {
        return !this.isFuncionRestoreFilterHabilitada();
    }

    /**
     * Getter para propiedad filtroFuncionSelectDisponible.
     *
     * @return Valor de la propiedad filtroFuncionSelectDisponible.
     */
    private boolean isFiltroFuncionSelectDisponible() {
        return (this.getFiltroFuncionSelect() != null
                || this.getCodigoFuncionSelect() != null
                || this.getNombreFuncionSelect() != null);
    }

    /**
     * Getter para propiedad filtroFuncionSelectAnteriorDisponible.
     *
     * @return Valor de la propiedad filtroFuncionSelectAnteriorDisponible.
     */
    private boolean isFiltroFuncionSelectAnteriorDisponible() {
        return (this.getFiltroFuncionSelectAnterior() != null
                || this.getCodigoFuncionSelectAnterior() != null
                || this.getNombreFuncionSelectAnterior() != null);
    }

    /**
     * Getter para propiedad loteConFilas.
     *
     * @return Valor de la propiedad loteConFilas.
     */
    public boolean isLoteConFilas() {
//      return this.isInicializado() && this.getRowCount() > 0;
        return this.isInicializado() && this.getRowKeys(1, null).length > 0;
    }

    /**
     * Getter para propiedad loteSinFilas.
     *
     * @return Valor de la propiedad loteSinFilas.
     */
    public boolean isLoteSinFilas() {
        return !this.isLoteConFilas();
    }

    /**
     * Getter para propiedad loteConCambios.
     *
     * @return Valor de la propiedad loteConCambios.
     */
    public boolean isLoteConCambios() {
        return this.isFuncionInsertEjecutada() || this.isFuncionUpdateEjecutada() || this.isFuncionDeleteEjecutada();
    }

    /**
     * Getter para propiedad loteSinCambios.
     *
     * @return Valor de la propiedad loteSinCambios.
     */
    public boolean isLoteSinCambios() {
        return !this.isLoteConCambios();
    }

    /**
     * Getter para propiedad loteConFilasEliminadas.
     *
     * @return Valor de la propiedad loteConFilasEliminadas.
     */
    public boolean isLoteConFilasEliminadas() {
        int i = !this.isInicializado() ? 0 : this.getFilasEliminadas();
        return i > 0;
    }

    /**
     * Getter para propiedad loteSinFilasEliminadas.
     *
     * @return Valor de la propiedad loteSinFilasEliminadas.
     */
    public boolean isLoteSinFilasEliminadas() {
        return !this.isLoteConFilasEliminadas();
    }

    /**
     * Getter para propiedad cursorRowAvailable.
     *
     * @return Valor de la propiedad cursorRowAvailable.
     */
    public boolean isCursorRowAvailable() {
        if (this.isInicializado()) {
            try {
                RowKey rowKey = this.getCursorRow();
                return this.isRowAvailable(rowKey);
            } catch (Exception ex) {
            }
        }
        return false;
    }

    /**
     * Getter para propiedad filaEscogidaDisponible.
     *
     * @return Valor de la propiedad filaEscogidaDisponible.
     */
    public boolean isFilaEscogidaDisponible() {
        if (this.isInicializado()) {
            try {
                RowKey rowKey = this.getFilaEscogida();
                return this.isRowAvailable(rowKey);
            } catch (Exception ex) {
            }
        }
        return false;
    }

    /**
     * Conserva el valor de la propiedad codigoDominio.
     */
    private static final String CODIGO_DOMINIO_RECURSO = "recurso";

    /**
     * Getter para propiedad codigoDominio.
     *
     * @return Valor de la propiedad codigoDominio.
     */
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    /**
     * Conserva el valor de la propiedad nombreDominio.
     */
    private static final String NOMBRE_DOMINIO_RECURSO = "Recursos";

    /**
     * Getter para propiedad nombreDominio.
     *
     * @return Valor de la propiedad nombreDominio.
     */
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    /**
     * Conserva el valor de la propiedad comandoSelect.
     */
    private static final String COMANDO_SELECT = "SELECT * FROM " + CODIGO_DOMINIO_RECURSO + " ";

    /**
     * Getter para propiedad comandoSelect.
     *
     * @return Valor de la propiedad comandoSelect.
     */
    public String getComandoSelect() {
        return COMANDO_SELECT;
    }

    /**
     * Conserva el valor de la propiedad comandoSelectNothing.
     */
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";

    /**
     * Getter para propiedad comandoSelectNothing.
     *
     * @return Valor de la propiedad comandoSelectNothing.
     */
    public String getComandoSelectNothing() {
        return COMANDO_SELECT_NOTHING;
    }

    /**
     * Conserva el valor de la propiedad tablaDestino.
     */
    private static final String TABLA_DESTINO = CODIGO_DOMINIO_RECURSO;

    /**
     * Getter para propiedad tablaDestino.
     *
     * @return Valor de la propiedad tablaDestino.
     */
    public String getTablaDestino() {
        return TABLA_DESTINO;
    }

    /**
     * Getter para propiedad etiquetaRecurso.
     *
     * @return Valor de la propiedad etiquetaRecurso.
     */
    public String getEtiquetaRecurso() {
        return !this.isInicializado() ? null : this.getEtiquetaRecurso(this.getCursorRow());
    }

    /**
     * Getter para propiedad etiquetaRecurso.
     *
     * @return Valor de la propiedad etiquetaRecurso.
     */
    public String getEtiquetaRecurso(RowKey rowKey) {
        Integer id = Integer.valueOf(rowKey.getRowId());
        String tag = Global.PREFIJO_ETIQUETA_ID_RECURSO + String.valueOf(id + 1);
        return tag;
    }

    /**
     * Getter para propiedad denominacionFilaEscogida.
     *
     * @return Valor de la propiedad denominacionFilaEscogida.
     */
    public String getDenominacionFilaEscogida() {
        return this.getDenominacionFilaEscogida(null);
    }

    /**
     * Getter para propiedad denominacionFilaEscogida.
     *
     * @return Valor de la propiedad denominacionFilaEscogida.
     */
    public String getDenominacionFilaEscogida(String etiqueta) {
        String tag = StringUtils.isBlank(etiqueta) ? "" : etiqueta.trim() + " ";
        if (this.isInicializado()) { /* DTR (design-time-requirement) */
            RowKey rowKey = this.getFilaEscogida();
            if (this.isRowAvailable(rowKey)) {
                String quotes = "";
                String number = "";
                String id2str = null;
                String codigo = null;
                String nombre = null;
                if (StringUtils.isNotBlank(etiqueta)) {
                    quotes = "\"";
                    number = "N\272 ";
                }
                if (this.isRecursoIdentificable()) {
                    Long id = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                    id2str = id == null ? STP.STRING_VALOR_NULO : id.toString();
                } else if (this.isRecursoEnumerable()) {
                    Integer id = this.getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey);
                    id2str = id == null ? STP.STRING_VALOR_NULO : id.toString();
                }
                if (this.isRecursoCodificable()) {
                    codigo = this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
                }
                if (this.isRecursoNombrable()) {
                    nombre = this.getRecursoNombrableDataProvider().getNombreRecurso(rowKey);
                }
                if (StringUtils.isBlank(codigo) && StringUtils.isBlank(nombre)) {
                    tag += number + id2str;
                } else if (StringUtils.isNotBlank(codigo) && StringUtils.isBlank(nombre)) {
                    tag += quotes + codigo + quotes;
                } else if (StringUtils.isBlank(codigo) && StringUtils.isNotBlank(nombre)) {
                    tag += quotes + nombre + quotes;
                } else {
                    tag += quotes + nombre + quotes;
                }
            }
        }
        return tag;
    }

    /**
     * Getter para propiedad mensajeCambiosPorConfirmar.
     *
     * @return Valor de la propiedad mensajeCambiosPorConfirmar.
     */
    public String getMensajeCambiosPorConfirmar() {
        if (!this.isInicializado()) {
            return null;
        }
        String clave = CBM2.CHANGES_TO_COMMIT;
        int i = this.getFilasProcesadas().size();
        int j = this.getFilasEliminadas();
        return i > 0 || j > 0 ? Bitacora.getTextoMensaje(clave, Integer.valueOf(i), Integer.valueOf(j)) : null;
    }

    /**
     * Getter para propiedad mensajeCambiosPorDescartar.
     *
     * @return Valor de la propiedad mensajeCambiosPorDescartar.
     */
    public String getMensajeCambiosPorDescartar() {
        if (!this.isInicializado()) {
            return null;
        }
        String clave = CBM2.CHANGES_TO_REVERT;
        int i = this.getFilasProcesadas().size();
        int j = this.getFilasEliminadas();
        return i > 0 || j > 0 ? Bitacora.getTextoMensaje(clave, Integer.valueOf(i), Integer.valueOf(j)) : null;
    }

    /**
     * Conserva el valor de la propiedad mensajeErrorFinal.
     */
    private String mensajeErrorFinal;

    /**
     * Getter para propiedad mensajeErrorFinal.
     *
     * @return Valor de la propiedad mensajeErrorFinal.
     */
    private String getMensajeErrorFinal() {
        return this.mensajeErrorFinal;
    }

    /**
     * Setter para propiedad mensajeErrorFinal.
     *
     * @param mensajeErrorFinal Nuevo valor de la propiedad mensajeErrorFinal.
     */
    private void setMensajeErrorFinal(String mensajeErrorFinal) {
        this.mensajeErrorFinal = mensajeErrorFinal;
    }

    /**
     * Conserva el valor de la propiedad limiteFilasFuncionSelect.
     */
    private int limiteFilasFuncionSelect = 0;

    /**
     * Getter para propiedad limiteFilasFuncionSelect.
     *
     * @return Valor de la propiedad limiteFilasFuncionSelect.
     */
    public int getLimiteFilasFuncionSelect() {
        return this.limiteFilasFuncionSelect;
    }

    /**
     * Setter para propiedad limiteFilasFuncionSelect.
     *
     * @param limiteFilasFuncionSelect Nuevo valor de la propiedad limiteFilasFuncionSelect.
     */
    public void setLimiteFilasFuncionSelect(int limiteFilasFuncionSelect) {
        this.limiteFilasFuncionSelect = limiteFilasFuncionSelect;
    }

    public String getDataSourceCachedRowSet() {
        CachedRowSet crs = this.getCachedRowSet();
        return crs == null ? "" : crs.getDataSourceName();
    }

    protected void setDataSourceCachedRowSet(String dataSource) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "setDataSourceCachedRowSet", dataSource);
        if (StringUtils.isNotBlank(dataSource)) {
            CachedRowSet crs = this.getCachedRowSet();
            Bitacora.trace(this.getClass(), "setDataSourceCachedRowSet", crs == null ? "CachedRowSet=?" : "CachedRowSet=" + crs);
            if (crs != null && !dataSource.equalsIgnoreCase(crs.getDataSourceName())) {
                try {
                    crs.setDataSourceName(dataSource); /* throws SQLException */
                } catch (SQLException ex) {
                    TLC.getBitacora().fatal(ex);
                    throw new ExcepcionAplicacion(ex);
                }
            }
        }
    }

    public String getComandoCachedRowSet() {
        CachedRowSet crs = this.getCachedRowSet();
        return crs == null ? "" : crs.getCommand();
    }

    protected void setComandoCachedRowSet(String comando) throws ExcepcionAplicacion {
        if (EA.isLoaded() && StringUtils.isBlank(this.getDataSourceCachedRowSet())) {
            this.setDataSourceCachedRowSet(EA.getString(EAC.JDBC_DATASOURCE));
        }
        this.setComandoCachedRowSet(comando, false);
    }

    protected void setComandoCachedRowSet(String comando, boolean refresh) throws ExcepcionAplicacion {
        this.setComandoCachedRowSet(comando, refresh, 0L);
    }

    private void setComandoCachedRowSet(String comando, boolean refresh, long version) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "setComandoCachedRowSet", comando, "refresh=" + refresh);
        if (StringUtils.isNotBlank(comando)) {
            CachedRowSet crs = this.getCachedRowSet();
            Bitacora.trace(this.getClass(), "setComandoCachedRowSet", crs == null ? "CachedRowSet=?" : "CachedRowSet=" + crs);
            if (crs != null) {
                try {
                    InterpreteSql interprete = TLC.getInterpreteSql();
                    if (interprete != null) {
                        String command = crs.getCommand();
                        String comandoSelect = interprete.getComandoSelect(comando, this.getLimiteFilasFuncionSelect());
                        if (comandoSelect != null && !comandoSelect.equals(command)) {
                            crs.setCommand(comandoSelect); /* throws SQLException */
                            this.setComandoSelectAnsi(comando);
                            this.incrementaVersionComandoSelect();
                            this.setVersionComandoInsert(version);
                        }
                        if (refresh) {
                            this.refresh(); /* throws DataProviderException */
                        }
                    }
                } catch (SQLException | DataProviderException ex) {
                    TLC.getBitacora().fatal(ex);
                    throw new ExcepcionAplicacion(ex);
                }
            }
        }
    }

    public String getTablaCachedRowSet() throws SQLException {
        CachedRowSet crs = this.getCachedRowSet();
        return crs == null ? "" : crs.getTableName();
    }

    protected void setTablaCachedRowSet(String tabla) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "setTablaCachedRowSet", tabla);
        if (StringUtils.isNotBlank(tabla)) {
            CachedRowSet crs = this.getCachedRowSet();
            Bitacora.trace(this.getClass(), "setTablaCachedRowSet", crs == null ? "CachedRowSet=?" : "CachedRowSet=" + crs);
            if (crs != null) {
                try {
                    InterpreteSql interprete = TLC.getInterpreteSql();
                    if (interprete != null) {
                        String tableName = crs.getTableName(); /* throws SQLException */
                        String nombreTabla = interprete.getNombreTabla(tabla);
                        if (nombreTabla != null && !nombreTabla.equals(tableName)) {
                            crs.setTableName(nombreTabla); /* throws SQLException */
                        }
                    }
                } catch (SQLException ex) {
                    TLC.getBitacora().fatal(ex);
                    throw new ExcepcionAplicacion(ex);
                }
            }
        }
    }

    protected void setColumnasInsertables(boolean insertable) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys != null && keys.length > 0) {
                CachedRowSetX crsx = (CachedRowSetX) crs;
                boolean[] columns = crsx.getInsertableColumns();
                int colcount = columns == null ? 0 : columns.length;
                if (keys.length != colcount) {
                    columns = new boolean[keys.length];
                }
                for (int i = 0; i < columns.length; i++) {
                    columns[i] = insertable;
                }
                crsx.setInsertableColumns(columns);
            }
        }
    }

    protected void setColumnasInsertables(String columna, boolean insertable) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys != null && keys.length > 0) {
                CachedRowSetX crsx = (CachedRowSetX) crs;
                boolean[] columns = crsx.getInsertableColumns();
                int colcount = columns == null ? 0 : columns.length;
                if (keys.length != colcount) {
                    columns = new boolean[keys.length];
                    for (int i = 0; i < columns.length; i++) {
                        columns[i] = false;
                    }
                    crsx.setInsertableColumns(columns);
                }
                for (int i = 0; i < keys.length; i++) {
                    if (columna.equalsIgnoreCase(keys[i].getDisplayName())) {
                        crsx.setInsertableColumns(i, insertable);
                    }
                }
            }
        }
    }

    protected void setColumnasModificables(boolean modificable) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys != null && keys.length > 0) {
                CachedRowSetX crsx = (CachedRowSetX) crs;
                boolean[] columns = crsx.getUpdatableColumns();
                int colcount = columns == null ? 0 : columns.length;
                if (keys.length != colcount) {
                    columns = new boolean[keys.length];
                }
                for (int i = 0; i < columns.length; i++) {
                    columns[i] = modificable;
                }
                crsx.setUpdatableColumns(columns);
            }
        }
    }

    protected void setColumnasModificables(String columna, boolean modificable) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys != null && keys.length > 0) {
                CachedRowSetX crsx = (CachedRowSetX) crs;
                boolean[] columns = crsx.getUpdatableColumns();
                int colcount = columns == null ? 0 : columns.length;
                if (keys.length != colcount) {
                    columns = new boolean[keys.length];
                    for (int i = 0; i < columns.length; i++) {
                        columns[i] = false;
                    }
                    crsx.setUpdatableColumns(columns);
                }
                for (int i = 0; i < keys.length; i++) {
                    if (columna.equalsIgnoreCase(keys[i].getDisplayName())) {
                        crsx.setUpdatableColumns(i, modificable);
                    }
                }
            }
        }
    }

    public boolean isColumnaInsertable(String columna) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys == null || keys.length == 0) {
                return false;
            }
            CachedRowSetX crsx = (CachedRowSetX) crs;
            boolean[] columns = crsx.getInsertableColumns();
            if (columns == null || columns.length == 0 || columns.length != keys.length) {
                return false;
            }
            for (int i = 0; i < keys.length; i++) {
                if (columna.equalsIgnoreCase(keys[i].getDisplayName())) {
                    return columns[i];
                }
            }
        }
        return false;
    }

    public boolean isColumnaModificable(String columna) {
        CachedRowSet crs = this.getCachedRowSet();
        if (crs instanceof CachedRowSetX) {
            FieldKey[] keys = this.getFieldKeys();
            if (keys == null || keys.length == 0) {
                return false;
            }
            CachedRowSetX crsx = (CachedRowSetX) crs;
            boolean[] columns = crsx.getUpdatableColumns();
            if (columns == null || columns.length == 0 || columns.length != keys.length) {
                return false;
            }
            for (int i = 0; i < keys.length; i++) {
                if (columna.equalsIgnoreCase(keys[i].getDisplayName())) {
                    return columns[i];
                }
            }
        }
        return false;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a la Lista de Opciones">
    public ArrayList getListaOpciones() {
        return this.getListaOpciones(false, EnumColumnaEtiqueta.AMBAS_COLUMNAS, true);
    }

    public ArrayList getListaOpciones(boolean anulable) {
        return this.getListaOpciones(anulable, EnumColumnaEtiqueta.AMBAS_COLUMNAS, true);
    }

    public ArrayList getListaOpciones(boolean anulable, String columna) {
        return this.getListaOpciones(anulable, columna, true);
    }

    public ArrayList getListaOpciones(boolean anulable, EnumColumnaEtiqueta columna) {
        return this.getListaOpciones(anulable, columna, true);
    }

    public ArrayList getListaOpciones(boolean anulable, boolean ordenado) {
        return this.getListaOpciones(anulable, EnumColumnaEtiqueta.AMBAS_COLUMNAS, ordenado);
    }

    public ArrayList getListaOpciones(String columna) {
        return this.getListaOpciones(false, columna, true);
    }

    public ArrayList getListaOpciones(EnumColumnaEtiqueta columna) {
        return this.getListaOpciones(false, columna, true);
    }

    public ArrayList getListaOpciones(String columna, boolean ordenado) {
        return this.getListaOpciones(false, columna, ordenado);
    }

    public ArrayList getListaOpciones(EnumColumnaEtiqueta columna, boolean ordenado) {
        return this.getListaOpciones(false, columna, ordenado);
    }

    public ArrayList getListaOpciones(boolean anulable, String columna, boolean ordenado) {
        return JSF.getListaOpciones(this, anulable, columna, ordenado);
    }

    public ArrayList getListaOpciones(boolean anulable, EnumColumnaEtiqueta columna, boolean ordenado) {
        return JSF.getListaOpciones(this, anulable, columna, ordenado);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a la Etiqueta de la Transaccion">
    public String getEtiquetaTransaccion(RowKey rowKey) throws SQLException {
        if (this.isInicializado()) {
            this.setCursorRow(rowKey); /* throws TableCursorVetoException */
            return this.getEtiquetaTransaccion();
        }
        return null;
    }

    public String getEtiquetaTransaccion() throws SQLException {
        if (this.isInicializado()) {
            CachedRowSet crs = this.getCachedRowSet();
            if (crs == null) {
                return null;
            } else if (crs.rowInserted()) {
                return DBC.COMANDO_INSERT;
            } else if (crs.rowUpdated()) {
                return DBC.COMANDO_UPDATE;
            } else if (crs.rowDeleted()) {
                return DBC.COMANDO_DELETE;
            } else {
                return DBC.COMANDO_COMMIT;
            }
        }
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a appendRow">
    /**
     * {@inheritDoc}
     */
    @Override
    public RowKey appendRow() throws DataProviderException {
        return this.appendRow(this.getFuncionInsert());
    }

    public RowKey appendRow(long funcion) throws DataProviderException {
        Bitacora.trace(this.getClass(), "appendRow", funcion);
        try {
            if (this.isFuncionUpdateEjecutada() || this.isFuncionDeleteEjecutada()) {
                throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.INSERT_ROW_EXCEPTION_4));
            }
            this.setFuncionInsert(funcion); /* throws ExcepcionAplicacion */
            if (this.esPermitidoAgregar()) {
                this.setComandoSelectVersion(); /* throws ExcepcionAplicacion */
                RowKey rowKey = super.appendRow(); /* throws DataProviderException */
                this.setFuncionInsertEjecutada(true);
                this.getFilasProcesadas().put(rowKey.getRowId(), rowKey);
                this.posAppendRow(rowKey, funcion); /* fire afterAppendRow event? */
                this.setAppendedRowVersion(rowKey);
                this.setFilaEscogida(rowKey);
                return rowKey;
            }
            this.setMensajeErrorFinal(CBM2.CHECK_CHANGES_EXCEPTION_0);
            return null;
        } catch (ExcepcionAplicacion ex) {
            throw new DataProviderException(ex);
        } catch (DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw ex;
        }
    }

    protected boolean esPermitidoAgregar() {
        Bitacora.trace(getClass(), "esPermitidoAgregar");
        Object object = execute(getBeforeAppendingProcedure(), getIdentificacionMaestro());
        return object == null || BitUtils.valueOf(object);
    }

    protected void setComandoSelectVersion() throws ExcepcionAplicacion {
        if (this.isRecursoVersionable() && this.getVersionComandoInsert() == 0L) {
            String columnaId = this.getRecursoVersionableDataProvider().getColumnaIdentificacionRecurso();
            String columnaVersion = this.getRecursoVersionableDataProvider().getColumnaVersionRecurso();
            long version = LongUtils.getNewId();
            FiltroBusqueda filtro = new FiltroBusqueda();
            filtro.addCriterio(columnaVersion, EnumOperadorCom.ES_IGUAL, version);
            String comando = this.getComandoSelect();
            comando += "WHERE " + filtro.toString() + " ";
            comando += "ORDER BY " + columnaId + " ";
            this.setComandoCachedRowSet(comando, true, version);
            this.resetFilter();
        }
    }

    protected void posAppendRow(RowKey rowKey, long funcion) {
        /* fire afterAppendRow event? */
        Bitacora.trace(this.getClass(), "posAppendRow", rowKey, funcion);
    }

    protected void setAppendedRowVersion(RowKey rowKey) {
        if (this.isRecursoVersionable()) {
            this.getRecursoVersionableDataProvider().setVersionRecurso(rowKey, this.getVersionComandoInsert());
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a editRow">
    public void recursoCachedRowSetDataProvider_valueChanged(TableDataProvider tdp, FieldKey fk, RowKey rk, Object o3, Object o4) {
        // o3 es el valor original y o4 es el nuevo
        Bitacora.trace(this.getClass(), "valueChanged", fk.getDisplayName() + "(" + rk.getRowId() + ")", o3, o4);
        //
        // CachedRowSetX crsx = (CachedRowSetX) this.getCachedRowSet();
        // FieldKey[] fieldKeys = this.getFieldKeys();
        // int columnsUpdated = 0;
        // for (int i = 0; i < fieldKeys.length; i++)
        //     if (crsx.columnUpdated(fieldKeys[i].getDisplayName()))
        //         columnsUpdated++;
        //
        try {
            this.setCursorRow(rk); /* throws TableCursorVetoException */
            if (this.getFilasProcesadas().containsKey(rk.getRowId())) {
                this.setFilaEscogida(rk); /* fila recion insertada o ya editada */
            } else {
                boolean b = TLC.getBitacora().isSinDuplicados();
                TLC.getBitacora().setSinDuplicados(true);
                String texto = TLC.getBitacora().error(CBM2.CHECK_CHANGES_EXCEPTION_3, this.getEtiquetaRecurso(rk));
                TLC.getBitacora().setSinDuplicados(b);
                throw new ExcepcionAplicacion(texto);
            }
        } catch (TableCursorVetoException ex) {
            TLC.getBitacora().fatal(ex); /* throw new DataProviderException(ex); */
        } catch (ExcepcionAplicacion ex) {
            try {
                this.getCachedRowSet().cancelRowUpdates(); /* throws SQLException */
            } catch (SQLException sqlex) {
                TLC.getBitacora().fatal(sqlex); /* throw new DataProviderException(sqlex); */
            }
        }
    }

    public boolean editRow(RowKey rowKey) throws ExcepcionAplicacion {
        return this.editRow(rowKey, this.getFuncionUpdate());
    }

    public boolean editRow(Set rowSet) throws ExcepcionAplicacion {
        return this.editRow(rowSet, this.getFuncionUpdate());
    }

    public boolean editRow(Set rowSet, long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "editRow", funcion);
        this.setFuncionUpdate(funcion); /* throws ExcepcionAplicacion */
        if (rowSet.isEmpty()) {
            TLC.getBitacora().warn(CBM2.UPDATE_NONE);
            return false;
        } else {
            this.setMensajeErrorFinal(null);
            Iterator iterator = rowSet.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                this.editRow(rowKey, funcion); /* throws ExcepcionAplicacion */
            }
            if (this.getMensajeErrorFinal() != null) {
                TLC.getBitacora().error(this.getMensajeErrorFinal());
            }
            return true;
        }
    }

    public boolean editRow(RowKey rowKey, long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "editRow", rowKey, funcion);
        try {
            if (this.isRowAvailable(rowKey)) {
                this.setCursorRow(rowKey); /* throws SQLException */
                if (this.getFilasProcesadas().containsKey(rowKey.getRowId())) {
                    return false; /* fila recion insertada o ya editada */
                }
                if (this.getCachedRowSet().rowDeleted() || this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.UPDATE_ROW_EXCEPTION_3));
                }
                if (this.isFuncionInsertEjecutada() || this.isFuncionDeleteEjecutada()) {
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.UPDATE_ROW_EXCEPTION_4));
                }
                this.setFuncionUpdate(funcion); /* throws ExcepcionAplicacion */
                if (this.esPermitidoEditar(rowKey)) {
                    if (this.esFilaModificable(rowKey, funcion)) {
                        this.setFuncionUpdateEjecutada(true);
                        this.getFilasProcesadas().put(rowKey.getRowId(), rowKey);
                        this.posEditRow(rowKey, funcion); /* fire afterEditRow event? */
                        this.setFilaEscogida(rowKey);
                        return true;
                    }
                }
//              String mensaje = TLC.getBitacora().error(CBM2.UPDATE_ROW_EXCEPTION_2, this.getEtiquetaRecurso(rowKey));
//              throw new ExcepcionAplicacion(mensaje);
                this.setMensajeErrorFinal(CBM2.CHECK_CHANGES_EXCEPTION_0);
            } else {
                TLC.getBitacora().warn(CBM2.UPDATE_NONE);
            }
            return false;
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            throw new ExcepcionAplicacion(ex);
        }
    }

    protected boolean esPermitidoEditar(RowKey rowKey) {
        Bitacora.trace(getClass(), "esPermitidoEditar", rowKey);
        Object object = execute(getBeforeEditingProcedure(), getIdentificacionRecurso(rowKey));
        return object == null || BitUtils.valueOf(object);
    }

    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaModificable", rowKey, funcion);
        return this.esFilaRecursoPropio(rowKey, funcion) && this.esFilaSegmentoAutorizado(rowKey, funcion);
    }

    protected void posEditRow(RowKey rowKey, long funcion) {
        /* fire afterEditRow event? */
        Bitacora.trace(this.getClass(), "posEditRow", rowKey, funcion);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a undoRow">
    public boolean undoRow(Set rowSet) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "undoRow");
        if (rowSet.isEmpty()) {
            TLC.getBitacora().warn(CBM2.UNDO_CHANGES_NONE);
            return false;
        } else {
            Iterator iterator = rowSet.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                this.undoRow(rowKey); /* throws ExcepcionAplicacion */
            }
            return true;
        }
    }

    public boolean undoRow(RowKey rowKey) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "undoRow", rowKey);
        try {
            if (this.isRowAvailable(rowKey)) {
                if (this.getFilasProcesadas().containsKey(rowKey.getRowId())) { /* fila insertada o editada y aun no confirmada */
                    this.setCursorRow(rowKey); /* throws SQLException */
                    if (this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                        // this.getCachedRowSet().undoInsert(); throws SQLException Y NO FUNCIONA!
                        super.removeRow(rowKey); /* siempre es posible eliminar lo recion insertado y aun no guardado */
                        this.setFuncionDeleteEjecutada(true);
                    } else {
                        // this.getCachedRowSet().undoUpdate(); /* throws SQLException */ NO FUNCIONA!
                        this.getCachedRowSet().cancelRowUpdates(); /* throws SQLException */
                    }
                    if (this.esFilaEscogida(rowKey)) {
                        this.resetFilaEscogida();
                    }
                    this.getFilasProcesadas().remove(rowKey.getRowId());
                    this.getFilasConflictivas().remove(rowKey.getRowId());
                    this.checkRevertChanges();
                    return true;
                }
            } else {
                TLC.getBitacora().warn(CBM2.UNDO_CHANGES_NONE);
            }
            return false;
        } catch (SQLException | DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw new ExcepcionAplicacion(ex);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a removeRow">
    /**
     * {@inheritDoc}
     */
    @Override
    public void removeRow(RowKey rowKey) throws DataProviderException {
        this.removeRow(rowKey, this.getFuncionDelete()); /* throws ExcepcionAplicacion */
    }

    public void removeRow(Set rowSet) throws DataProviderException {
        this.removeRow(rowSet, this.getFuncionDelete()); /* throws ExcepcionAplicacion */
    }

    public void removeRow(Set rowSet, long funcion) throws DataProviderException {
        Bitacora.trace(this.getClass(), "removeRow", funcion);
        try {
            this.setFuncionDelete(funcion); /* throws ExcepcionAplicacion */
            if (rowSet.isEmpty()) {
                TLC.getBitacora().warn(CBM2.DELETE_NONE);
            } else {
                this.setMensajeErrorFinal(null);
                Iterator iterator = rowSet.iterator();
                while (iterator.hasNext()) {
                    RowKey rowKey = (RowKey) iterator.next();
                    this.removeRow(rowKey, funcion); /* throws DataProviderException */
                }
                if (this.getMensajeErrorFinal() != null) {
                    TLC.getBitacora().error(this.getMensajeErrorFinal());
                }
            }
        } catch (ExcepcionAplicacion ex) {
            throw new DataProviderException(ex);
        } catch (DataProviderException ex) {
            // viene de removeRow(rowKey, funcion) y por lo tanto ya esta anotado en la bitacora
            throw ex;
        }
    }

    public void removeRow(RowKey rowKey, long funcion) throws DataProviderException {
        Bitacora.trace(this.getClass(), "removeRow", rowKey, funcion);
        try {
            if (this.isRowAvailable(rowKey)) {
                this.setCursorRow(rowKey); /* throws TableCursorVetoException */
                if (this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                    this.undoRow(rowKey); /* siempre es posible eliminar lo recion insertado y aun no guardado */
                } else {
                    if (this.isFuncionInsertEjecutada() || this.isFuncionUpdateEjecutada()) {
                        throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.DELETE_ROW_EXCEPTION_4));
                    }
                    this.setFuncionDelete(funcion); /* throws ExcepcionAplicacion */
                    if (this.esPermitidoEliminar(rowKey)) {
                        if (this.esFilaEliminable(rowKey, funcion)) {
                            this.preRemoveRow(rowKey, funcion); /* fire beforeRemoveRow event? */
                            super.removeRow(rowKey); /* throws DataProviderException */
                            this.setFuncionDeleteEjecutada(true);
                            this.getFilasRemovidas().put(rowKey.getRowId(), rowKey);
                            if (this.esFilaEscogida(rowKey)) {
                                this.resetFilaEscogida();
                            }
                            this.getFilasProcesadas().remove(rowKey.getRowId());
                            this.getFilasConflictivas().remove(rowKey.getRowId());
                            this.posRemoveRow(rowKey, funcion); /* fire afterRemoveRow event? */
                            this.incrementaFilasEliminadas();
                            return;
                        }
                    }
//                  String mensaje = TLC.getBitacora().error(CBM2.DELETE_ROW_EXCEPTION_2, this.getEtiquetaRecurso(rowKey));
//                  throw new ExcepcionAplicacion(mensaje);
                    this.setMensajeErrorFinal(CBM2.CHECK_CHANGES_EXCEPTION_0);
                }
            } else {
                TLC.getBitacora().warn(CBM2.DELETE_NONE);
            }
        } catch (ExcepcionAplicacion ex) {
            throw new DataProviderException(ex);
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            throw new DataProviderException(ex);
        } catch (DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw ex;
        }
    }

    protected boolean esPermitidoEliminar(RowKey rowKey) {
        Bitacora.trace(getClass(), "esPermitidoEliminar", rowKey);
        Object object = execute(getBeforeRemovingProcedure(), getIdentificacionRecurso(rowKey));
        return object == null || BitUtils.valueOf(object);
    }

    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaEliminable", rowKey, funcion);
        return this.esFilaRecursoPropio(rowKey, funcion) && this.esFilaSegmentoAutorizado(rowKey, funcion);
    }

    protected void preRemoveRow(RowKey rowKey, long funcion) {
        /* fire beforeRemoveRow event? */
        Bitacora.trace(this.getClass(), "preRemoveRow", rowKey, funcion);
    }

    protected void posRemoveRow(RowKey rowKey, long funcion) {
        /* fire afterRemoveRow event? */
        Bitacora.trace(this.getClass(), "posRemoveRow", rowKey, funcion);
        FieldKey[] fields = this.getFieldKeys();
        for (int i = 0; i < fields.length; i++) {
            Object obj = this.getValue(fields[i]);
            String value = "NULL";
            if (obj != null) {
                value = this.getValue(fields[i]).toString();
            }
            Bitacora.trace(fields[i].getDisplayName() + " = " + value);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a processRow">
    public boolean processRow(Set rowSet, long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "processRow", funcion);
//      if (!TLC.getControlador().esFuncionAutorizada(funcion)) {
//          throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_1));
//      }
        this.setFuncionBusinessProcess(funcion); /* throws ExcepcionAplicacion */
        if (rowSet.isEmpty()) {
            TLC.getBitacora().warn(CBM2.PROCESS_NONE);
            return false;
        } else {
            this.setMensajeErrorFinal(null);
            Iterator iterator = rowSet.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                this.processRow(rowKey, funcion); /* throws ExcepcionAplicacion */
            }
            if (this.getMensajeErrorFinal() != null) {
                TLC.getBitacora().error(this.getMensajeErrorFinal());
            }
            return false;
        }
    }

    public boolean processRow(RowKey rowKey, long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "processRow", rowKey, funcion);
        if (this.canProcessRow(rowKey, funcion)) {
            this.runProcessRow(rowKey, funcion); /* fire onProcessRow event? */
            this.posProcessRow(rowKey, funcion); /* fire afterProcessRow event? */
            return true;
        }
        return false;
    }

    public boolean canProcessRow(RowKey rowKey, long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "canProcessRow", rowKey, funcion);
        try {
            if (this.isRowAvailable(rowKey)) {
                this.setCursorRow(rowKey); /* throws SQLException */
                if (this.getCachedRowSet().rowDeleted() || this.getCachedRowSet().rowUpdated() || this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_3));
                }
                if (this.isLoteConCambios()) { /*(this.isFuncionInsertEjecutada() || this.isFuncionUpdateEjecutada() || this.isFuncionDeleteEjecutada())*/
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_4));
                }
//              if (!TLC.getControlador().esFuncionAutorizada(funcion)) {
//                  throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_1));
//              }
                this.setFuncionBusinessProcess(funcion); /* throws ExcepcionAplicacion */
                if (this.esFilaProcesable(rowKey, funcion)) {
                    TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, this.getEtiquetaRecurso(rowKey));
                    return true;
                }
                this.setMensajeErrorFinal(CBM2.CHECK_CHANGES_EXCEPTION_0);
                //  String mensaje = TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_2, this.getEtiquetaRecurso(rowKey));
                //  throw new ExcepcionAplicacion(mensaje);
            } else {
                TLC.getBitacora().warn(CBM2.PROCESS_NONE);
            }
            return false;
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            throw new ExcepcionAplicacion(ex);
        }
    }

    protected boolean esFilaProcesable(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaProcesable", rowKey, funcion);
        return this.esFilaRecursoPropio(rowKey, funcion) && this.esFilaSegmentoAutorizado(rowKey, funcion);
    }

    protected void runProcessRow(RowKey rowKey, long funcion) throws ExcepcionAplicacion {
        /* fire onProcessRow event? */
        Bitacora.trace(this.getClass(), "runProcessRow", rowKey, funcion);
    }

    protected void posProcessRow(RowKey rowKey, long funcion) {
        /* fire afterProcessRow event? */
        Bitacora.trace(this.getClass(), "posProcessRow", rowKey, funcion);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a commit y revert">
    /**
     * (@inheritDoc}
     */
    @Override
    public void commitChanges() throws DataProviderException {
        Bitacora.trace(this.getClass(), "commitChanges");
        try {
            if (this.isFuncionDeleteEjecutada() || !this.getFilasProcesadas().values().isEmpty()) {
                if (this.esLoteValido()) { /* throws ExcepcionAplicacion */
                    Connection connection = TLC.getConnection(); /* conexion para los rastros de auditoria */
                    DB.setAutoCommit(connection, false); /* para que los rastros de auditoria no se confirmen sin antes confirmar los cambios */
                    this.preCommitChanges(); /* graba los rastros de auditoria // throws ExcepcionAplicacion */
                    super.commitChanges(); /* confirma los cambios // throws DataProviderException */
                    DB.commit(connection); /* confirma los rastros de auditoria */
                    this.resetState();
                } else {
                    throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.COMMIT_CHANGES_EXCEPTION));
                }
            } else {
                TLC.getBitacora().warn(CBM2.NO_CHANGES_TO_COMMIT);
                this.resetState();
            }
        } catch (ExcepcionAplicacion ex) {
            throw new DataProviderException(ex);
        } catch (DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw ex;
        }
    }

    private boolean checkRevertChanges() throws DataProviderException {
        // ejecuta el metodo revertChanges si NO quedan filas agregadas, editadas o eliminadas
        // vale mas un "por si acaso" ...
        boolean check = (this.getFilasProcesadas().isEmpty() && this.getFilasEliminadas() == 0);
        if (check) {
            this.revertChanges();
            this.refresh();
        }
        return check;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void revertChanges() throws DataProviderException {
        Bitacora.trace(this.getClass(), "revertChanges");
        super.revertChanges(); /* throws DataProviderException */
        this.resetState();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a refresh">
    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() throws DataProviderException {
        Bitacora.trace(this.getClass(), "refresh");
        super.refresh(); /* throws DataProviderException */
        this.resetFlags();
        this.resetState();
        this.setFuncionSelectEjecutada(true);
//      this.setFuncionDeleteEjecutada(false) en este punto, porque despues del refresh ya no ocurre el java.lang.IllegalArgumentException
        this.setFuncionDeleteEjecutada(false); /* removeRow + appendRow + setCursorRow = java.lang.IllegalArgumentException ... */
        this.restoreFilaEscogida();
        int limite = this.getLimiteFilasFuncionSelect();
        if (limite > 0) {
            int filas = this.getRowCount();
            Bitacora.trace(this.getClass(), "refresh", "limite=" + limite, "filas=" + filas);
            if (filas == limite) {
                TLC.getBitacora().warn(CBM2.SELECT_ROW_LIMIT_REACHED, String.valueOf(limite));
            }
        }
    }

    private void resetFlags() {
        this.setFiltroFuncionSelectModificado(false);
        this.setCodigoFuncionSelectModificado(false);
        this.setNombreFuncionSelectModificado(false);
    }

    private void resetState() {
        this.getFilasElegidas().clear();
        this.getFilasProcesadas().clear();
        this.getFilasRemovidas().clear();
        this.getFilasConflictivas().clear();
        this.setFilasEliminadas(0);
        this.setFuncionInsertEjecutada(false);
        this.setFuncionUpdateEjecutada(false);
//----->this.setFuncionDeleteEjecutada(false); /* removeRow + appendRow + setCursorRow = java.lang.IllegalArgumentException ... */
    }

    private void restoreFilaEscogida() {
        Bitacora.trace(this.getClass(), "restoreFilaEscogida");
        try {
            if (this.isLoteSinFilas()) {
                this.resetFilaEscogida();
            } else {
                RowKey rowKey = null;
                if (this.isRecursoIdentificable()) {
                    String clave = this.getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
                    Long valor = this.getIdentificacionFilaEscogida();
                    Bitacora.trace(this.getClass(), "restoreFilaEscogida", clave + "=" + valor);
                    if (valor != null) {
                        rowKey = this.findFirst(clave, valor);
                    }
                }
                if (rowKey == null && this.isRecursoEnumerable()) {
                    String clave = this.getRecursoEnumerableDataProvider().getColumnaNumeroRecurso();
                    Integer valor = this.getNumeroFilaEscogida();
                    Bitacora.trace(this.getClass(), "restoreFilaEscogida", clave + "=" + valor);
                    if (valor != null) {
                        rowKey = this.findFirst(clave, valor);
                    }
                }
                if (rowKey == null && this.isRecursoCodificable()) {
                    String clave = this.getRecursoCodificableDataProvider().getColumnaCodigoRecurso();
                    String valor = this.getCodigoFilaEscogida();
                    Bitacora.trace(this.getClass(), "restoreFilaEscogida", clave + "=" + valor);
                    if (valor != null) {
                        rowKey = this.findFirst(clave, valor); /* TODO: OJO con (appendRow + codigo que ya existe + revert + refresh) */
                    }
                }
                if (this.isRowAvailable(rowKey)) {
                    this.setCursorRow(rowKey);
                    this.setFilaEscogida(rowKey);
                } else {
                    this.setFilaEscogida(); /* attempt to set to current cursor row */
                }
            }
        } catch (Exception ex) {
            this.resetFilaEscogida();
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a release, ...">
    public void release() throws SQLException {
        this.getCachedRowSet().release();
        this.incrementaVersionComandoSelect();
        this.reset();
    }

    public void setComandoEmptyCachedRowSet() throws ExcepcionAplicacion {
        this.setComandoEmptyCachedRowSet("SELECT * FROM " + this.getCodigoDominioRecurso() + " WHERE (0=1)");
    }

    public void setComandoEmptyCachedRowSet(String comando) throws ExcepcionAplicacion {
        this.setComandoCachedRowSet(comando, true);
        this.reset();
    }

    void reset() {
        this.resetFilter();
        this.resetState();
        this.setFuncionSelectEjecutada(false);
        this.setFuncionDeleteEjecutada(false);
        this.setFilaEscogida(null);
    }

    public void storeQuery() {
        this.storeCommand();
        this.storeFilter();
        this.storeMaster();
    }

    public void restoreQuery() throws ExcepcionAplicacion {
        this.restoreCommand();
        this.restoreFilter();
        this.restoreMaster();
    }

    void resetFilter() {
        this.setFiltroFuncionSelect(null);
        this.setCodigoFuncionSelect(null);
        this.setNombreFuncionSelect(null);
        this.setFiltroFuncionSelectModificado(true);
        this.setCodigoFuncionSelectModificado(true);
        this.setNombreFuncionSelectModificado(true);
    }

    void resetMaster() {
        this.setColumnaMaestro(null);
        this.setIdentificacionMaestro(null);
    }

    void storeCommand() {
        Bitacora.trace(this.getClass(), "storeCommand", "Comando=" + this.getComandoSelectAnsi());
        Bitacora.trace(this.getClass(), "storeCommand", "Version=" + this.getVersionComandoSelect());
        this.setComandoSelectAnterior(this.getComandoSelectAnsi());
        this.setVersionComandoSelectAnterior(this.getVersionComandoSelect());
    }

    void restoreCommand() throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "restoreCommand", "Comando=" + this.getComandoSelectAnterior());
        Bitacora.trace(this.getClass(), "restoreCommand", "Version=" + this.getVersionComandoSelectAnterior());
        this.setComandoCachedRowSet(this.getComandoSelectAnterior(), true);
        this.setVersionComandoSelect(this.getVersionComandoSelectAnterior());
    }

    void storeFilter() {
        Bitacora.trace(this.getClass(), "storeFilter", "Filtro=" + this.getFiltroFuncionSelect());
        Bitacora.trace(this.getClass(), "storeFilter", "Codigo=" + this.getCodigoFuncionSelect());
        Bitacora.trace(this.getClass(), "storeFilter", "Nombre=" + this.getNombreFuncionSelect());
        this.setFiltroFuncionSelectAnterior(this.getFiltroFuncionSelect());
        this.setCodigoFuncionSelectAnterior(this.getCodigoFuncionSelect());
        this.setNombreFuncionSelectAnterior(this.getNombreFuncionSelect());
    }

    void restoreFilter() {
        Bitacora.trace(this.getClass(), "restoreFilter", "Filtro=" + this.getFiltroFuncionSelectAnterior());
        Bitacora.trace(this.getClass(), "restoreFilter", "Codigo=" + this.getCodigoFuncionSelectAnterior());
        Bitacora.trace(this.getClass(), "restoreFilter", "Nombre=" + this.getNombreFuncionSelectAnterior());
        this.setFiltroFuncionSelect(this.getFiltroFuncionSelectAnterior());
        this.setCodigoFuncionSelect(this.getCodigoFuncionSelectAnterior());
        this.setNombreFuncionSelect(this.getNombreFuncionSelectAnterior());
        this.setFiltroFuncionSelectModificado(false);
        this.setCodigoFuncionSelectModificado(false);
        this.setNombreFuncionSelectModificado(false);
    }

    void storeMaster() {
        Bitacora.trace(this.getClass(), "storeMaster", "Clave=" + this.getColumnaMaestro());
        Bitacora.trace(this.getClass(), "storeMaster", "Valor=" + this.getIdentificacionMaestro());
        this.setColumnaMaestroAnterior(this.getColumnaMaestro());
        this.setIdentificacionMaestroAnterior(this.getIdentificacionMaestro());
    }

    void restoreMaster() {
        Bitacora.trace(this.getClass(), "restoreMaster", "Clave=" + this.getColumnaMaestroAnterior());
        Bitacora.trace(this.getClass(), "restoreMaster", "valor=" + this.getIdentificacionMaestroAnterior());
        this.setColumnaMaestro(this.getColumnaMaestroAnterior());
        this.setIdentificacionMaestro(this.getIdentificacionMaestroAnterior());
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a validaciones">
    public boolean esFilaAutorizada(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaAutorizada", rowKey, funcion);
        boolean es = true;
        try {
            if (this.isRowAvailable(rowKey)) {
                this.setCursorRow(rowKey); /* throws SQLException */
                if (this.getCachedRowSet().rowDeleted() || this.getCachedRowSet().rowUpdated() || this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                    TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_3);
                    es = false;
                }
                if (this.isLoteConCambios()) { /*(this.isFuncionInsertEjecutada() || this.isFuncionUpdateEjecutada() || this.isFuncionDeleteEjecutada())*/
                    TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_4);
                    es = false;
                }
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    es &= this.esFilaRecursoPropio(rowKey, funcion);
                    es &= this.esFilaSegmentoAutorizado(rowKey, funcion);
                } else {
                    TLC.getBitacora().error(CBM2.PROCESS_ROW_EXCEPTION_1);
                    es = false;
                }
            } else {
                TLC.getBitacora().warn(CBM2.PROCESS_NONE);
                es = false;
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        }
        return es;
    }

    public boolean esFilaRecursoActivo(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaRecursoActivo", rowKey, funcion);
        if (this.isRecursoDesactivable()) {
            Integer inactivo = this.getRecursoDesactivableDataProvider().getEsRecursoInactivo(rowKey);
            if (BitUtils.valueOf(inactivo)) {
                String columna = this.isRecursoIdentificable()
                        ? this.getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso()
                        : this.isRecursoEnumerable()
                        ? this.getRecursoEnumerableDataProvider().getColumnaNumeroRecurso()
                        : this.getNombreDominioRecurso();
                TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + columna + ">", this.getEtiquetaRecurso(rowKey));
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public boolean esFilaRecursoPropio(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaRecursoPropio", rowKey, funcion);
        if (this.isRecursoPersonalizable()) {
            Long propietario = this.getRecursoPersonalizableDataProvider().getPropietarioRecurso(rowKey);
            if (TLC.getControlador().esPropietarioRecurso(propietario, funcion)) {
                return true;
            } else {
                String columna = this.getRecursoPersonalizableDataProvider().getColumnaPropietarioRecurso();
                TLC.getBitacora().error(CBM2.USUARIO_NO_PROPIETARIO, "<" + columna + ">", this.getEtiquetaRecurso(rowKey));
                return false;
            }
        }
        return true;
    }

    public boolean esFilaSegmentoAutorizado(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaSegmentoAutorizado", rowKey, funcion);
        if (this.isRecursoSegmentable()) {
            Long segmento = this.getRecursoSegmentableDataProvider().getSegmentoRecurso(rowKey);
            if (TLC.getControlador().esSegmentoAutorizado(segmento, funcion)) {
                return true;
            } else {
                String columna = this.getRecursoSegmentableDataProvider().getColumnaSegmentoRecurso();
                TLC.getBitacora().error(CBM2.SEGMENTO_NO_AUTORIZADO, "<" + columna + ">", this.getEtiquetaRecurso(rowKey));
                return false;
            }
        }
        return true;
    }

    public boolean esLoteValido() throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "esLoteValido");
        this.getFilasConflictivas().clear();
        this.filasProcesadasPorConfirmar = 0;
        boolean ok = true;
        // boolean cursor = this.cursorFirst();
        // while (cursor) {
        // ok &= this.esFilaValida(this.cursorRow, false);
        // cursor = this.cursorNext();
        // }
        Collection filas = this.getFilasProcesadas().values();
        if (filas.isEmpty()) {
            // la lista de filas procesadas no incluye las filas eliminadas,
            // por lo tanto seria valido hacer commit aun cuando este vacia
            // ok = this.isFuncionDeleteEjecutada();
            // if (!ok)
            // TLC.getBitacora().warn(CBM2.NO_CHANGES_TO_COMMIT);
        } else {
            Iterator iterator = filas.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                ok &= this.esFilaValida(rowKey, true);
            }
        }
        return ok;
    }

    public boolean esFilaValida(RowKey rowKey) throws ExcepcionAplicacion {
        return this.esFilaValida(rowKey, true);
    }

    private boolean esFilaValida(RowKey rowKey, boolean cursor) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "esFilaValida", rowKey, String.valueOf(cursor));
        try {
            long funcion = -1L;
            int status = SyncResolver.NO_ROW_CONFLICT;
            int tipoError = 3; /* OJO con la constante, 3 -> fila con uno o mas errores, todos conocidos */
            boolean ejecutada = false;
            boolean autorizada = false;
            String comando;
            String mensaje;
            if (cursor) {
                this.setCursorRow(rowKey); /* throws TableCursorVetoException */
            }
            if (this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                funcion = this.getFuncionInsert();
                status = SyncResolver.INSERT_ROW_CONFLICT;
                ejecutada = true; /* this.isFuncionInsertEjecutada(); */
                autorizada = this.isFuncionInsertAutorizada();
            } else {
                if (this.getCachedRowSet().rowUpdated()) { /* throws SQLException */
                    funcion = this.getFuncionUpdate();
                    status = SyncResolver.UPDATE_ROW_CONFLICT;
                    ejecutada = true; /* this.isFuncionUpdateEjecutada(); */
                    autorizada = this.isFuncionUpdateAutorizada();
                }
            }
            boolean es = true;
            if (ejecutada) {
                this.filasProcesadasPorConfirmar++;
                if (autorizada) {
                    es = this.esFilaValida(rowKey, funcion); /* check */
                    if (es) {
                        Bitacora.trace(CBM2.CHECK_CHANGES_1, this.getEtiquetaRecurso(rowKey));
                    } else {
                        comando = DBUtils.getTransactionLabel(status);
                        mensaje = tipoError + TLC.getBitacora().error(CBM2.CHECK_CHANGES_EXCEPTION_2, comando, this.getEtiquetaRecurso(rowKey));
                        this.getFilasConflictivas().put(rowKey.getRowId(), mensaje);
                    }
                } else {
                    comando = DBUtils.getTransactionLabel(status);
                    mensaje = tipoError + TLC.getBitacora().error(CBM2.CHECK_CHANGES_EXCEPTION_2, comando, this.getEtiquetaRecurso(rowKey));
                    this.getFilasConflictivas().put(rowKey.getRowId(), mensaje);
                }
            } else {
                Bitacora.trace(CBM2.CHECK_CHANGES_2, this.getEtiquetaRecurso(rowKey));
            }
            return es;
        } catch (IllegalArgumentException | SQLException | DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw new ExcepcionAplicacion(ex);
        }
    }

    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "esFilaValida", rowKey, funcion);
        return this.esFilaSegmentoAutorizado(rowKey, funcion);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a preCommitRow">
    protected void preCommitChanges() throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "preCommitChanges");
        if (this.getFilasProcesadas().size() > 0) {
            Collection filas = this.getFilasProcesadas().values();
            Iterator iterator = filas.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                this.preCommitRow(rowKey, true);
            }
        }
        if (this.getFilasRemovidas().size() > 0) {
            Collection filas = this.getFilasRemovidas().values();
            Iterator iterator = filas.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                this.preCommitRow(rowKey, false);
            }
        }
    }

    protected void preCommitRow(RowKey rowKey) throws ExcepcionAplicacion {
        this.preCommitRow(rowKey, true);
    }

    protected void preCommitRow(RowKey rowKey, boolean cursor) throws ExcepcionAplicacion {
        Bitacora.trace(this.getClass(), "preCommitRow", rowKey, String.valueOf(cursor));
        try {
            long funcion = -1L;
            boolean ejecutada = false;
            if (cursor) {
                this.setCursorRow(rowKey); /* throws TableCursorVetoException */
                if (this.getCachedRowSet().rowInserted()) { /* throws SQLException */
                    funcion = this.getFuncionInsert();
                    ejecutada = true; /* this.isFuncionInsertEjecutada(); */
                    if (this.isRecursoIdentificable()) {
                        Long identificacion = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                        if (identificacion == null || identificacion == 0) {
                            identificacion = LongUtils.getNewId();
                            this.getRecursoIdentificableDataProvider().setIdentificacionRecurso(rowKey, identificacion);
                        }
                        if (this.isRecursoCodificable()) {
                            String codigo = this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
                            if (StringUtils.isBlank(codigo)) {
                                codigo = identificacion.toString();
                                this.getRecursoCodificableDataProvider().setCodigoRecurso(rowKey, codigo);
                            }
                        }
                    }
                    if (this.isRecursoEnumerable() && this.isRecursoCodificable()) {
                        String codigo = this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
                        if (StringUtils.isBlank(codigo)) {
                            Integer numero = this.getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey);
                            if (numero != null) {
                                codigo = numero.toString();
                                this.getRecursoCodificableDataProvider().setCodigoRecurso(rowKey, codigo);
                            }
                        }
                    }
                } else {
                    if (this.getCachedRowSet().rowUpdated()) { /* throws SQLException */
                        funcion = this.getFuncionUpdate();
                        ejecutada = true; /* this.isFuncionUpdateEjecutada(); */
                    } else {
                        if (this.getCachedRowSet().rowDeleted()) { /* throws SQLException */
                            funcion = this.getFuncionDelete();
                            ejecutada = true; /* this.isFuncionDeleteEjecutada(); */
                        }
                    }
                }
            } else {
                funcion = this.getFuncionDelete();
                ejecutada = true; /* this.isFuncionDeleteEjecutada(); */
            }
            if (ejecutada && funcion > 0) {
                this.preCommitRow(rowKey, funcion);
            } else {
                Bitacora.trace(CBM2.CHECK_CHANGES_2, this.getEtiquetaRecurso(rowKey));
            }
        } catch (IllegalArgumentException | SQLException | DataProviderException ex) {
            TLC.getBitacora().fatal(ex);
            throw new ExcepcionAplicacion(ex);
        }
    }

    protected void preCommitRow(RowKey rowKey, long funcion) {
        Bitacora.trace(this.getClass(), "preCommitRow", rowKey, funcion);
        FieldKey[] fields = this.getFieldKeys();
        for (int i = 0; i < fields.length; i++) {
            Object obj = this.getValue(fields[i]);
            String value = "NULL";
            if (obj != null) {
                value = this.getValue(fields[i]).toString();
            }
            Bitacora.trace(fields[i].getDisplayName() + " = " + value);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a setValue">
//  /**
//   * {@inheritDoc}
//   */
//    @Override
//    public void setValue(String fieldId, Object value) throws DataProviderException {
//        Object object = this.getSqlObject(fieldId, value);
//        super.setValue(fieldId, object);
//    }
//
//  /**
//   * {@inheritDoc}
//   */
//    @Override
//    public void setValue(String fieldId, RowKey row, Object value) throws DataProviderException {
//        Object object = this.getSqlObject(fieldId, value);
//        super.setValue(fieldId, row, object);
//    }
//
//  /**
//   * {@inheritDoc}
//   */
//  @Override
//  public void setValue(FieldKey fieldKey, Object value) throws DataProviderException {
//      Object object = this.getSqlObject(fieldKey, value);
//      super.setValue(fieldKey, object);
//  }
//
    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(FieldKey fieldKey, RowKey row, Object value) throws DataProviderException {
        Bitacora.trace(this.getClass(), "setValue", fieldKey, row, value);
        Object object = this.getSqlObject(fieldKey, value);
        super.setValue(fieldKey, row, object);
    }

    private static Calendar calendar = Calendar.getInstance();

    private Object getSqlObject(FieldKey fieldKey, Object value) {
        if (value == null) {
            return null;
        }
        String fieldId = fieldKey.getFieldId();
        int type = this.getSqlColumnType(fieldId);
        boolean nullable = this.isNullableColumn(fieldId);
        if (nullable && value instanceof String && StringUtils.isBlank((String) value)) {
            return null;
        }
        Object object = value;
        Bitacora.trace(fieldId + " (" + type + ", " + nullable + ") = (" + object.getClass().getSimpleName() + ") " + object);
        switch (type) {
            case java.sql.Types.INTEGER:
                if (value instanceof Long) {
                    object = Integer.valueOf(((Long) value).intValue());
                } else if (value instanceof BigInteger) {
                    object = Integer.valueOf(((BigInteger) value).intValue());
                } else if (value instanceof Double) {
                    object = Integer.valueOf(((Double) value).intValue());
                }
                break;
            case java.sql.Types.BIGINT:
                if (value instanceof Integer) {
                    object = Long.valueOf(((Integer) value).longValue());
                } else if (value instanceof BigInteger) {
                    object = Long.valueOf(((BigInteger) value).longValue());
                } else if (value instanceof Double) {
                    object = Long.valueOf(((Double) value).longValue());
                }
                break;
            case java.sql.Types.NUMERIC:
            case java.sql.Types.DECIMAL:
                if (value instanceof Integer) {
                    object = BigDecimal.valueOf(((Integer) value).longValue());
                } else if (value instanceof Long) {
                    object = BigDecimal.valueOf(((Long) value).longValue());
                } else if (value instanceof BigInteger) {
                    object = BigDecimal.valueOf(((BigInteger) value).longValue());
                } else if (value instanceof Double) {
                    object = BigDecimal.valueOf(((Double) value).doubleValue());
                }
                break;
            case java.sql.Types.TIMESTAMP:
                if (value instanceof Date) {
                    calendar.setTime((Date) value);
                    object = new Timestamp(calendar.getTimeInMillis());
                }
                break;
            default:
                break;
        }
        Bitacora.trace(fieldId + " (" + type + ", " + nullable + ") = (" + object.getClass().getSimpleName() + ") " + object);
        return object;
    }

    private int getSqlColumnType(String fieldId) {
        try {
            ResultSetMetaData rsmd = this.getCachedRowSet().getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                if (rsmd.getColumnName(i).equalsIgnoreCase(fieldId)) {
                    return rsmd.getColumnType(i);
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return java.sql.Types.OTHER;
    }

    private boolean isNullableColumn(String fieldId) {
        try {
            ResultSetMetaData rsmd = this.getCachedRowSet().getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                if (rsmd.getColumnName(i).equalsIgnoreCase(fieldId)) {
                    if (rsmd.isNullable(i) == ResultSetMetaData.columnNullable) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return false;
    }

    public boolean isColumnaDisponible(String fieldId) {
        try {
            ResultSetMetaData rsmd = this.getCachedRowSet().getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                if (rsmd.getColumnName(i).equalsIgnoreCase(fieldId)) {
                    return true;
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return false;
    }
    // </editor-fold>

    public void setSegmento(RowKey rowKey) {
        Bitacora.trace(getClass(), "setSegmento", rowKey);
        if (isRecursoSegmentable() && isRowAvailable(rowKey)) {
            setSegmentoFields();
            String colname = getSegmentoKeyColumn();
            String stpname = getSegmentoFunctionName();
            if (StringUtils.isNotBlank(colname) && StringUtils.isNotBlank(stpname)) {
                Long segmento = null;
                Object argumento = getValue(colname, rowKey);
                if (argumento instanceof Long) {
                    Object object = execute(stpname, argumento);
                    segmento = LongUtils.toLong(object);
                }
                getRecursoSegmentableDataProvider().setSegmentoRecurso(rowKey, segmento);
            }
        }
    }

    private void setSegmentoFields() {
        String colname = null;
        String stpname = null;
        String tabname = this.getTablaDestino();
        if (StringUtils.isNotBlank(tabname)) {
            colname = BundleSegmentos.getKeyColumn(tabname);
            stpname = BundleSegmentos.getFunctionName(tabname);
            if (StringUtils.isBlank(colname) || StringUtils.isBlank(stpname)) {
                colname = null;
                stpname = null;
            } else if (colname.contains("{maestro}") || stpname.contains("{maestro}")) {
                tabname = this.getTablaMaestro();
                if (StringUtils.isBlank(tabname)) {
                    colname = null;
                    stpname = null;
                } else {
                    colname = this.getColumnaMaestro();
                    stpname = stpname.replace("{maestro}", tabname);
                    if (StringUtils.isBlank(colname)) {
                        colname = null;
                        stpname = null;
                    }
                }
            }
        }
        this.setSegmentoKeyColumn(colname);
        this.setSegmentoFunctionName(stpname);
    }

    private Object execute(String procedure, Object argumento) { // throws SQLException
        Bitacora.trace(getClass(), "executeFunction", procedure, argumento);
        if (StringUtils.isNotBlank(procedure) && argumento != null) {
            try {
                if (TLC.getAgenteSql().isStoredProcedure(procedure)) {
                    Object[] args = new Object[]{argumento};
                    Object resultado = TLC.getAgenteSql().executeProcedure(procedure, args);
                    if (resultado instanceof ResultSet) {
                        ResultSet resultSet = (ResultSet) resultado;
                        if (resultSet.next()) {
                            return resultSet.getObject(1);
                        }
//                  } else if (resultado instanceof Number) {
//                      return resultado;
                    }
                    return resultado;
                }
            } catch (SQLException ex) {
                String localizedMessage = StringUtils.substringBefore(ex.getLocalizedMessage(), " Where: ");
                TLC.getBitacora().error(localizedMessage);
                return ex;
            }
        }
        return null;
    }

    private String getBeforeAppendingProcedure() {
        String tablaDestino = getTablaDestino();
        String tablaMaestro = getTablaMaestro();
        if (StringUtils.isBlank(tablaDestino) || StringUtils.isBlank(tablaMaestro)) {
            return null;
        }
        return tablaMaestro + "_b4_append_" + tablaDestino;
    }

    private String getBeforeEditingProcedure() {
        String tablaDestino = getTablaDestino();
        if (StringUtils.isBlank(tablaDestino)) {
            return null;
        }
        return tablaDestino + "_b4_edit";
    }

    private String getBeforeRemovingProcedure() {
        String tablaDestino = getTablaDestino();
        if (StringUtils.isBlank(tablaDestino)) {
            return null;
        }
        return tablaDestino + "_b4_remove";
    }

}
