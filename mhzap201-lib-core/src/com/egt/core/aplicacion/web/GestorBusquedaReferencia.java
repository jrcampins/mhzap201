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
package com.egt.core.aplicacion.web;

import com.egt.base.constants.CBM2;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.util.Bundle;
import com.egt.core.util.STP;
import com.sun.data.provider.RowKey;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.apache.commons.lang.StringUtils;

public class GestorBusquedaReferencia {

    public GestorBusquedaReferencia(RecursoCachedRowSetDataProvider recursoDataProvider,
            RecursoCachedRowSetDataProvider recursoReferenciadoDataProvider,
            String columnaIdentificacionRecursoReferenciado) {
        this.init(recursoDataProvider, recursoReferenciadoDataProvider, columnaIdentificacionRecursoReferenciado, true);
    }

    public GestorBusquedaReferencia(RecursoCachedRowSetDataProvider recursoDataProvider,
            RecursoCachedRowSetDataProvider recursoReferenciadoDataProvider,
            String columnaIdentificacionRecursoReferenciado,
            boolean funcionSelectEjecutable) {
        this.init(recursoDataProvider, recursoReferenciadoDataProvider, columnaIdentificacionRecursoReferenciado, funcionSelectEjecutable);
    }

    private void init(RecursoCachedRowSetDataProvider recursoDataProvider,
            RecursoCachedRowSetDataProvider recursoReferenciadoDataProvider,
            String columnaIdentificacionRecursoReferenciado,
            boolean funcionSelectEjecutable) {
        this.recursoDataProvider = recursoDataProvider;
        this.recursoReferenciadoDataProvider = recursoReferenciadoDataProvider; /* OJO: tiene que implementar RecursoIdentificableDataProvider */
        this.recursoReferenciadoDataProvider.setSoloReferencia(true);
        this.columnaIdentificacionRecursoReferenciado = columnaIdentificacionRecursoReferenciado;
        this.funcionSelectEjecutable = funcionSelectEjecutable;
        this.filtroBusqueda = null;
    }

    /**
     * Conserva el valor de la propiedad recursoDataProvider.
     */
    private RecursoCachedRowSetDataProvider recursoDataProvider;

    /**
     * Getter para propiedad recursoDataProvider.
     * @return Valor de la propiedad recursoDataProvider.
     */
    private RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.recursoDataProvider;
    }

    /**
     * Conserva el valor de la propiedad recursoReferenciadoDataProvider.
     */
    private RecursoCachedRowSetDataProvider recursoReferenciadoDataProvider;

    /**
     * Getter para propiedad recursoReferenciadoDataProvider.
     * @return Valor de la propiedad recursoReferenciadoDataProvider.
     */
    private RecursoCachedRowSetDataProvider getRecursoReferenciadoDataProvider() {
        return this.recursoReferenciadoDataProvider;
    }

    /**
     * Conserva el valor de la propiedad columnaIdentificacionRecursoReferenciado.
     */
    private String columnaIdentificacionRecursoReferenciado;

    /**
     * Getter para propiedad columnaIdentificacionRecursoReferenciado.
     * @return Valor de la propiedad columnaIdentificacionRecursoReferenciado.
     */
    private String getColumnaIdentificacionRecursoReferenciado() {
        return this.columnaIdentificacionRecursoReferenciado;
    }

    /**
     * Conserva el valor de la propiedad funcionSelectEjecutable.
     */
    private boolean funcionSelectEjecutable = false;

    /**
     * Getter para propiedad funcionSelectEjecutable.
     * @return Valor de la propiedad funcionSelectEjecutable.
     */
    private boolean isFuncionSelectEjecutable() {
        return this.funcionSelectEjecutable;
    }

    /**
     * Conserva el valor de la propiedad nuevoFiltro.
     */
    private boolean nuevoFiltro = false;

    /**
     * Getter para propiedad nuevoFiltro.
     * @return Valor de la propiedad nuevoFiltro.
     */
    private boolean isNuevoFiltro() {
        return this.nuevoFiltro;
    }

    /**
     * Setter para propiedad nuevoFiltro.
     * @param nuevoFiltro Nuevo valor de la propiedad nuevoFiltro.
     */
    private void setNuevoFiltro(boolean nuevoFiltro) {
        this.nuevoFiltro = nuevoFiltro;
    }

    /**
     * Conserva el valor de la propiedad filtroBusqueda.
     */
    private FiltroBusqueda filtroBusqueda;

    /**
     * Getter para propiedad filtroBusqueda.
     * @return Valor de la propiedad filtroBusqueda.
     */
    public FiltroBusqueda getFiltroBusqueda() {
        return this.filtroBusqueda;
    }

    /**
     * Setter para propiedad filtroBusqueda.
     * @param filtroBusqueda Nuevo valor de la propiedad filtroBusqueda.
     */
    public void setFiltroBusqueda(FiltroBusqueda filtroBusqueda) {
        if (this.filtroBusqueda == null && filtroBusqueda == null) {
            this.nuevoFiltro = false;
        } else if (this.filtroBusqueda == null) {
            this.nuevoFiltro = true;
        } else {
            this.nuevoFiltro = !this.filtroBusqueda.equals(filtroBusqueda);
        }
        this.filtroBusqueda = filtroBusqueda;
        this.funcionSelectEjecutable = true;
    }

    public void validarCodigoRecursoReferenciado(FacesContext fc, UIComponent uic, Object o, RowKey currentRowKey) {
        this.validarCodigoRecursoReferenciado(fc, uic, o, currentRowKey, false);
    }

    public void validarCodigoRecursoReferenciado(FacesContext fc, UIComponent uic, Object o, RowKey currentRowKey, boolean flexible) {
        String string = STP.getString(o);
        boolean id = false;
        if ((string != null) && string.startsWith(Global.PREFIJO_STRING_ID_RECURSO)) {
            string = string.substring(1);
            id = true;
        }
        this.validarCodigoRecursoReferenciado(fc, uic, string, currentRowKey, flexible, id);
    }

    public void validarCodigoRecursoReferenciado(FacesContext fc, UIComponent uic, Object o, RowKey rk, boolean flexible, boolean id) {
        Bitacora.trace(this.getClass(), "validarCodigoRecursoReferenciado", uic.getId() + "=" + o, "rk=" + rk, "flex=" + flexible, "id=" + id);
        // int tipoError = 1; /* OJO con la constante, 1 -> fila con un error desconocido */
        String columna = this.getColumnaIdentificacionRecursoReferenciado();
        try {
            Long idViejo = (Long) this.getRecursoDataProvider().getValue(columna, rk);
            Long idNuevo = null;
            boolean esIgual = false;
            String string = STP.getString(o);
            if (StringUtils.isEmpty(string)) {
                esIgual = (idViejo == null) ? true : false;
            } else {
                String clave = null;
                Object valor = null;
                if (!id && this.getRecursoReferenciadoDataProvider().isRecursoCodificable()) {
                    clave = this.getRecursoReferenciadoDataProvider().getRecursoCodificableDataProvider().getColumnaCodigoRecurso();
                    valor = string;
                } else if (this.getRecursoReferenciadoDataProvider().isRecursoIdentificable()) {
                    clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
                    valor = STP.getObjeto(string, EnumTipoDatoPar.ENTERO_GRANDE); /* Long.valueOf(string); */
                    if (valor == null) {
                        // tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                        throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.CHECK_CHANGES_EXCEPTION_4,
                                EnumTipoDatoPar.ENTERO_GRANDE.getLabel()));
                    }
                } else if (this.getRecursoReferenciadoDataProvider().isRecursoEnumerable()) {
                    clave = this.getRecursoReferenciadoDataProvider().getRecursoEnumerableDataProvider().getColumnaNumeroRecurso();
                    valor = STP.getObjeto(string, EnumTipoDatoPar.ENTERO); /* Integer.valueOf(string); */
                    if (valor == null) {
                        // tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                        throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.CHECK_CHANGES_EXCEPTION_4,
                                EnumTipoDatoPar.ENTERO.getLabel()));
                    }
                } else {
                    // tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + columna + ">", string));
                }
                RowKey rowKey = this.getRow(clave, valor);
                if (rowKey != null) {
                    if (this.getRecursoReferenciadoDataProvider().isRecursoIdentificable()) {
                        idNuevo = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                    } else if (this.getRecursoReferenciadoDataProvider().isRecursoEnumerable()) {
                        idNuevo = Long.valueOf(this.getRecursoReferenciadoDataProvider().getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey));
                    }
                    esIgual = idViejo == null ? false : idViejo.equals(idNuevo);
                    if (!esIgual && !flexible && this.getRecursoReferenciadoDataProvider().isRecursoDesactivable()) {
                        Integer inactivo = this.getRecursoReferenciadoDataProvider().getRecursoDesactivableDataProvider().getEsRecursoInactivo(rowKey);
                        if (BitUtils.valueOf(inactivo)) {
                            // tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                            throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_INACTIVO, "<" + columna + ">", string));
                        }
                    }
                } else {
                    // tipoError = 2; /* OJO con la constante, 2 -> fila con un error conocido */
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + columna + ">", string));
                }
            }
            if (!esIgual) {
                this.getRecursoDataProvider().setValue(columna, rk, idNuevo);
            }
        } catch (Exception ex) {
            this.getRecursoDataProvider().setValue(columna, rk, null);
            if (ex instanceof ValidatorException) {
                throw (ValidatorException) ex;
            } else {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null);
//              String mensaje = tipoError + ex.getMessage();
//              this.getRecursoDataProvider().getFilasConflictivas().put(currentRowKey.getRowId(), mensaje);
                throw new ValidatorException(message);
            }
        }
    }

    public String getCodigoRecursoReferenciado(RowKey currentRowKey) {
//      Bitacora.trace(this.getClass(), "getCodigoRecursoReferenciado");
        Bitacora.stack();
        String codigo = null;
        try {
//          String clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            String clave = null;
            Long valor = (Long) this.getRecursoDataProvider().getValue(this.getColumnaIdentificacionRecursoReferenciado(), currentRowKey);
            if (this.getRecursoReferenciadoDataProvider().isRecursoIdentificable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            } else if (this.getRecursoReferenciadoDataProvider().isRecursoEnumerable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoEnumerableDataProvider().getColumnaNumeroRecurso();
            }
            if (clave != null && BitUtils.valueOf(valor)) { /* valor != null && valor != 0 */
                RowKey rowKey = this.getRow(clave, valor);
                if (rowKey != null) {
                    if (this.getRecursoReferenciadoDataProvider().isRecursoCodificable()) {
                        codigo = this.getRecursoReferenciadoDataProvider().
                                getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
                    } else {
                        codigo = this.getRecursoReferenciadoDataProvider().
                                getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey).toString();
                    }
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return codigo;
    }

    public void setCodigoRecursoReferenciado(RowKey currentRowKey, String valor) {
        Bitacora.trace(this.getClass(), "setCodigoRecursoReferenciado", "valor=" + valor);
        if (StringUtils.isEmpty(valor)) {
            this.getRecursoDataProvider().setValue(this.getColumnaIdentificacionRecursoReferenciado(), currentRowKey, null);
        }
    }

    public String getNombreRecursoReferenciado(RowKey currentRowKey) {
//      Bitacora.trace(this.getClass(), "getNombreRecursoReferenciado");
        Bitacora.stack();
        String nombre = null;
        try {
//          String clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            String clave = null;
            Long valor = (Long) this.getRecursoDataProvider().getValue(this.getColumnaIdentificacionRecursoReferenciado(), currentRowKey);
            if (this.getRecursoReferenciadoDataProvider().isRecursoIdentificable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            } else if (this.getRecursoReferenciadoDataProvider().isRecursoEnumerable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoEnumerableDataProvider().getColumnaNumeroRecurso();
            }
            if (clave != null && BitUtils.valueOf(valor)) { /* valor != null && valor != 0 */
                RowKey rowKey = this.getRow(clave, valor);
                if (rowKey != null) {
                    if (this.getRecursoReferenciadoDataProvider().isRecursoNombrable()) {
                        nombre = this.getRecursoReferenciadoDataProvider().getRecursoNombrableDataProvider().getNombreRecurso(rowKey);
                    }
                    if (nombre == null) {
                        nombre = Bundle.getString("string.recurso.sin.nombre");
                    }
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return nombre;
    }

    public String getNombreRecursoReferenciado(RowKey currentRowKey, String columna) {
        Bitacora.trace(this.getClass(), "getNombreRecursoReferenciado");
        String nombre = null;
        try {
//          String clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            String clave = null;
            Long valor = (Long) this.getRecursoDataProvider().getValue(this.getColumnaIdentificacionRecursoReferenciado(), currentRowKey);
            if (this.getRecursoReferenciadoDataProvider().isRecursoIdentificable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            } else if (this.getRecursoReferenciadoDataProvider().isRecursoEnumerable()) {
                clave = this.getRecursoReferenciadoDataProvider().getRecursoEnumerableDataProvider().getColumnaNumeroRecurso();
            }
            if (clave != null && BitUtils.valueOf(valor)) { /* valor != null && valor != 0 */
                RowKey rowKey = this.getRow(clave, valor);
                if (rowKey != null) {
                    nombre = STP.getString(this.getRecursoReferenciadoDataProvider().getValue(columna, rowKey));
                    if (nombre == null) {
                        nombre = Bundle.getString("string.recurso.sin.nombre");
                    }
                }
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return nombre;
    }

    private RowKey getRow(String clave, Object valor) {
        Bitacora.trace(this.getClass(), "getRow", clave + "=" + valor, "fse=" + this.isFuncionSelectEjecutable(), "nf=" + this.isNuevoFiltro());
        RowKey rowKey = null;
        try {
            if (this.getRecursoReferenciadoDataProvider().cursorFirst()) {
                if (this.isFuncionSelectEjecutable() && this.isNuevoFiltro()) {
                } else {
                    rowKey = this.getRecursoReferenciadoDataProvider().findFirst(clave, valor);
                }
            }
            if (this.isFuncionSelectEjecutable() && rowKey == null) {
                this.getRecursoReferenciadoDataProvider().getRecursoConsultableDataProvider().ejecutarFuncionSelect(this.getFilter(clave, valor));
                this.setNuevoFiltro(false);
                if (this.getRecursoReferenciadoDataProvider().cursorFirst()) {
                    rowKey = this.getRecursoReferenciadoDataProvider().getCursorRow();
                }
            }
            if (this.getRecursoReferenciadoDataProvider().isRowAvailable(rowKey)) {
                this.getRecursoReferenciadoDataProvider().setCursorRow(rowKey);
            }
        } catch (Exception ex) {
            rowKey = null;
            TLC.getBitacora().fatal(ex);
        }
        return this.getRecursoReferenciadoDataProvider().isRowAvailable(rowKey) ? rowKey : null;
    }

    private FiltroBusqueda getFilter(String clave, Object valor) {
//      FiltroBusqueda filtro = new FiltroBusqueda(this.getRecursoDataProvider().getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(clave, valor);
        filtro.addFiltro(this.getFiltroBusqueda());
        return filtro;
    }
}
