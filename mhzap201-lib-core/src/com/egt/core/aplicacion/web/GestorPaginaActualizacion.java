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
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.util.BundleDominios;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.enums.EnumSeveridadMensaje;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.core.db.xdp.RecursoIdentificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.egt.core.db.xdp.RecursoSegmentableDataProvider;
import com.egt.core.enums.EnumOpcionAbrirVentana;
import com.egt.core.util.STP;
import com.egt.core.util.JS;
import com.egt.core.util.Bundle;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.lang.reflect.Method;
import java.sql.SQLException;
import org.apache.commons.lang.StringUtils;

public class GestorPaginaActualizacion extends GestorPaginaBasica {

    public GestorPaginaActualizacion() {
        super();
    }

    public GestorPaginaActualizacion(PaginaAbstracta paginaAbstracta) {
        super(paginaAbstracta);
    }

    private static final int LIMITE_FILAS_FUNCION_SELECT = 500;

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar de la pagina de actualizacion">
    /**
     * Getter para propiedad paginaActualizacion.
     * @return Valor de la propiedad paginaActualizacion.
     */
    protected PaginaActualizacion getPaginaActualizacion() {
        return this.getPaginaAbstracta() instanceof PaginaActualizacion
                ? (PaginaActualizacion) this.getPaginaAbstracta()
                : null;
    }

    /**
     * Getter para propiedad paginaActualizacionConAccionMultiple.
     * @return Valor de la propiedad paginaActualizacionConAccionMultiple.
     */
    protected PaginaActualizacionConAccionMultiple getPaginaActualizacionConAccionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaActualizacionConAccionMultiple
                ? (PaginaActualizacionConAccionMultiple) this.getPaginaAbstracta()
                : null;
    }

    /**
     * Getter para propiedad paginaActualizacionConEdicionMultiple.
     * @return Valor de la propiedad paginaActualizacionConEdicionMultiple.
     */
    protected PaginaActualizacionConEdicionMultiple getPaginaActualizacionConEdicionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaActualizacionConEdicionMultiple
                ? (PaginaActualizacionConEdicionMultiple) this.getPaginaAbstracta()
                : null;
    }

    /**
     * Getter para propiedad paginaConsultaConFiltro.
     * @return Valor de la propiedad paginaConsultaConFiltro.
     */
    protected PaginaConsultaConFiltro getPaginaConsultaConFiltro() {
        return this.getPaginaAbstracta() instanceof PaginaConsultaConFiltro
                ? (PaginaConsultaConFiltro) this.getPaginaAbstracta()
                : null;
    }

    /**
     * Getter para propiedad paginaConsultaConMaestro.
     * @return Valor de la propiedad paginaConsultaConMaestro.
     */
    protected PaginaConsultaConMaestro getPaginaConsultaConMaestro() {
        return this.getPaginaAbstracta() instanceof PaginaConsultaConMaestro
                ? (PaginaConsultaConMaestro) this.getPaginaAbstracta()
                : null;
    }

    public boolean isPaginaConsultaConMaestro() {
        if (designing) {
            return true;
        }
        return this.getPaginaAbstracta() instanceof PaginaConsultaConMaestro;
    }

    public boolean isPaginaConsultaConArbol() {
        if (designing) {
            return true;
        }
        return this.getPaginaAbstracta() instanceof PaginaConsultaConArbol;
    }

    public boolean isPaginaConsultaConTabla() {
        if (designing) {
            return true;
        }
        return this.getPaginaAbstracta() instanceof PaginaConsultaConTabla;
    }

    public boolean isPaginaConsultaConFiltro() {
        if (designing) {
            return true;
        }
        return this.getPaginaAbstracta() instanceof PaginaConsultaConFiltro;
    }

    public boolean isPaginaConsultaSinFiltro() {
        return !this.isPaginaConsultaConFiltro();
    }

    protected boolean isPaginaActualizacionConAccionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaActualizacionConAccionMultiple;
    }

    protected boolean isPaginaActualizacionConEdicionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaActualizacionConEdicionMultiple;
    }

    protected RecursoIdentificableDataProvider getRecursoIdentificableDataProvider() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getRecursoIdentificableDataProvider();
    }

    protected RecursoIdentificableDataProvider getRecursoMaestroIdentificableDataProvider() {
        return this.isPaginaConsultaConMaestro()
                ? this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getRecursoIdentificableDataProvider()
                : null;
    }

    protected RecursoCodificableDataProvider getRecursoCodificableDataProvider() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getRecursoCodificableDataProvider();
    }

    protected RecursoNombrableDataProvider getRecursoNombrableDataProvider() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getRecursoNombrableDataProvider();
    }

    protected RecursoSegmentableDataProvider getRecursoSegmentableDataProvider() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getRecursoSegmentableDataProvider();
    }

    protected RecursoConsultableDataProvider getRecursoConsultableDataProvider() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getRecursoConsultableDataProvider();
    }

    protected RecursoConsultableDataProvider getRecursoMaestroConsultableDataProvider() {
        return this.isPaginaConsultaConMaestro()
                ? this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getRecursoConsultableDataProvider()
                : null;
    }

    protected String getRecursoDataProviderDataSourceName() {
        return this.getPaginaActualizacion().getRecursoDataProvider().getCachedRowSet().getDataSourceName();
    }

    protected String getRecursoMaestroDataProviderDataSourceName() {
        return this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getCachedRowSet().getDataSourceName();
    }

    protected boolean isConsultaInsert() {
        if (designing) {
            return false;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isConsultaInsertDisponible();
    }

    protected boolean isConsultaAnteriorDisponible() {
        if (designing) {
            return true;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isConsultaAnteriorDisponible();
    }

    protected boolean isConsultaValida() {
        if (designing) {
            return true;
        }
        this.track("isConsultaValida");
        boolean ok = !this.isRestauracion() && this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectAutorizada();
        if (ok) {
            long f1 = this.getPaginaActualizacion().getRecursoDataProvider().getFuncionSelect();
            long f2 = this.getPaginaActualizacion().getFuncionConsultarRecurso();
            this.trace("funcion-actual=" + f1 + ", funcion-anterior=" + f2);
            ok = f1 == f2;
        }
        if (ok) {
            long v1 = this.getPaginaActualizacion().getRecursoDataProvider().getVersionComandoSelect();
            long v2 = this.getPaginaActualizacion().getContextoSesion().getVersionComandoSelectPagina(this.getClavePagina());
            this.trace("version-actual=" + v1 + ", version-anterior=" + v2);
            ok = v1 == v2;
        }
        if (ok && this.isReinicio()) {
            String c1 = StringUtils.trimToNull(this.getPaginaActualizacion().getRecursoDataProvider().getCriteriosBusqueda());
            String c2 = StringUtils.trimToNull(this.getPaginaActualizacion().getContextoPeticion().getCriteriosBusqueda());
            this.trace("criterio-actual=" + c1 + ", criterio-anterior=" + c2);
            ok = c1 == null ? c2 == null : c1.equals(c2);
        }
//      if (ok && this.isPaginaConsultaConMaestro()) {
//          Long i1 = this.getIdentificacionRecursoMaestro();
//          Long i2 = this.getPaginaActualizacion().getContextoSesion().getIdentificacionRecursoMaestroPagina(this.getClavePagina());
//          this.trace("maestro-actual=" + i1 + ", maestro-anterior=" + i2);
//          ok = i1 == null ? i2 == null : i1.equals(i2);
//      }
        if (ok) {
//          String c1 = this.getColumnaIdentificacionRecursoMaestro();
            String c1 = this.getPaginaActualizacion().getRecursoDataProvider().getColumnaMaestro();
            String c2 = this.getPaginaActualizacion().getContextoSesion().getColumnaIdentificacionRecursoMaestroPagina(this.getClavePagina());
            this.trace("maestro-actual=" + c1 + ", maestro-anterior=" + c2);
            ok = c1 == null ? c2 == null : c1.equals(c2);
        }
        if (ok) {
//          Long i1 = this.getIdentificacionRecursoMaestro();
            Long i1 = this.getPaginaActualizacion().getRecursoDataProvider().getIdentificacionMaestro();
            Long i2 = this.getPaginaActualizacion().getContextoSesion().getIdentificacionRecursoMaestroPagina(this.getClavePagina());
            this.trace("maestro-actual=" + i1 + ", maestro-anterior=" + i2);
            ok = i1 == null ? i2 == null : i1.equals(i2);
        }
        return ok;
    }

    protected boolean isConsultaInvalida() {
        return !this.isConsultaValida();
    }

    protected Long getIdentificacionRecursoActual() {
        if (designing) {
            return null;
        }
        Long valor = null;
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
                RowKey rowKey = this.getCurrentRowKey();
                if (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)) {
                    valor = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                }
            }
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            return valor;
        }
    }

    protected Long getIdentificacionRecursoEscogido() {
        if (designing) {
            return null;
        }
        Long valor = null;
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
                if (this.getPaginaActualizacion().getRecursoDataProvider().isFilaEscogidaDisponible()) {
                    RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                    valor = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                }
            }
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            return valor;
        }
    }

    protected String getColumnaIdentificacionRecurso() {
        if (designing) {
            return null;
        }
        String columna = null;
        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
            columna = this.getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
        }
        return columna;
    }

    protected String getColumnaIdentificacionRecursoMaestro() {
        if (designing) {
            return null;
        }
        String columna = null;
        if (this.isPaginaConsultaConMaestro()) {
            columna = this.getPaginaConsultaConMaestro().getColumnaIdentificacionRecursoMaestro();
            if (columna == null || columna.equals("")) {
                if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRecursoIdentificable()) {
                    columna = this.getRecursoMaestroIdentificableDataProvider().getColumnaIdentificacionRecurso();
                }
            }
        }
        return columna;
    }

    protected Long getIdentificacionRecursoMaestro() {
        if (designing) {
            return null;
        }
        Long valor = null;
        try {
            if (this.isPaginaConsultaConMaestro()) {
                if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRecursoIdentificable()) {
                    if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isFilaEscogidaDisponible()) {
                        RowKey rowKey = this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getFilaEscogida();
                        valor = this.getRecursoMaestroIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                    }
                }
            }
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            return valor;
        }
    }

    public String getDenominacionFilaMaestro() {
        if (designing) {
            return null;
        }
        return this.isPaginaConsultaConMaestro()
                ? this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getDenominacionFilaEscogida()
                : null;
    }

    public RowKey getCurrentRowKey() {
        if (designing) {
            return null;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().getCursorRow();
    }

    public String getIdentificacionFila() {
        if (designing) {
            return null;
        }
        RowKey rowKey = this.getCurrentRowKey();
        return this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)
                ? String.valueOf(Integer.parseInt(rowKey.getRowId()) + 1)
                : null;
    }

    public boolean isFuncionSelectHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getFuncionConsultarRecurso() > 0 &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectHabilitada());
    }

    public boolean isFuncionSelectInhabilitada() {
        return !this.isFuncionSelectHabilitada();
    }

    public boolean isFuncionInsertHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getFuncionCrearRecurso() > 0 &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionInsertHabilitada());
    }

    public boolean isFuncionInsertInhabilitada() {
        return !this.isFuncionInsertHabilitada();
    }

    public boolean isFuncionUpdateHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getFuncionModificarRecurso() > 0 &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionUpdateHabilitada() &&
                this.isEdicionMultiFuncionInhabilitada());
    }

    public boolean isFuncionUpdateInhabilitada() {
        return !this.isFuncionUpdateHabilitada();
    }

    public boolean isFuncionDeleteHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getFuncionEliminarRecurso() > 0 &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionDeleteHabilitada());
    }

    public boolean isFuncionDeleteInhabilitada() {
        return !this.isFuncionDeleteHabilitada();
    }

    public boolean isFuncionCheckChangesHabilitada() {
        if (designing) {
            return true;
        }
        return (this.isFilaDisponible() &&
                this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey()));
    }

    public boolean isFuncionCheckChangesInhabilitada() {
        return !this.isFuncionCheckChangesHabilitada();
    }

    public boolean isFuncionCancelUpdateHabilitada() {
        if (designing) {
            return true;
        }
        return (this.isFilaDisponible() &&
                this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey()));
    }

    public boolean isFuncionCancelUpdateInhabilitada() {
        return !this.isFuncionCancelUpdateHabilitada();
    }

    public boolean isFuncionCommitHabilitada() {
        if (designing) {
            return true;
        }
        return this.isLoteConCambios();
    }

    public boolean isFuncionCommitInhabilitada() {
        return !this.isFuncionCommitHabilitada();
    }

    public boolean isFuncionRevertHabilitada() {
        if (designing) {
            return true;
        }
        return this.isLoteConCambios();
    }

    public boolean isFuncionRevertInhabilitada() {
        return !this.isFuncionRevertHabilitada();
    }

    public boolean isFuncionExecuteHabilitada() {
        if (designing) {
            return true;
        }
        return this.isAccionMultiFuncionHabilitada() && this.getPaginaActualizacion().getRecursoDataProvider().isFuncionBusinessProcessHabilitada();
    }

    public boolean isFuncionExecuteInhabilitada() {
        return !this.isFuncionExecuteHabilitada();
    }

    public boolean isFuncionRefreshHabilitada() {
        if (designing) {
            return true;
        }
//      return this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectEjecutada();
        return (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectEjecutada() &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectHabilitada());
    }

    public boolean isFuncionRefreshInhabilitada() {
        return !this.isFuncionRefreshHabilitada();
    }

    public boolean isFuncionRequeryHabilitada() {
        if (designing) {
            return true;
        }
        return this.isFuncionSelectHabilitada() && this.isConsultaAnteriorDisponible() && this.isConsultaInsert();
    }

    public boolean isFuncionRequeryInhabilitada() {
        return !this.isFuncionRequeryHabilitada();
    }

    public boolean isFuncionRestoreFilterHabilitada() {
        if (designing) {
            return true;
        }
        return this.isFuncionSelectHabilitada() && this.isConsultaAnteriorDisponible();
    }

    public boolean isFuncionRestoreFilterInhabilitada() {
        return !this.isFuncionRestoreFilterHabilitada();
    }

    public boolean isFuncionReturnHabilitada() {
        if (designing) {
            return true;
        }
        return (this.isFilaDisponible() &&
                this.isValorRetornoRecursoDisponible() &&
                this.getPaginaActualizacion().getRecursoDataProvider().isLoteSinCambios());
    }

    public boolean isFuncionReturnInhabilitada() {
        return !this.isFuncionReturnHabilitada();
    }

    public boolean isFuncionReturnFilaEscogidaHabilitada() {
        if (designing) {
            return true;
        }
        return (this.isFilaEscogidaDisponible() &&
                this.isValorRetornoRecursoDisponible() &&
                this.getPaginaActualizacion().getRecursoDataProvider().isLoteSinCambios());
    }

    public boolean isFuncionReturnFilaEscogidaInhabilitada() {
        return !this.isFuncionReturnFilaEscogidaHabilitada();
    }

    public boolean isFuncionReturnVisible() {
        if (designing) {
            return true;
        }
        return this.getPaginaActualizacion().getContextoSesion().getOpcionCampoRetorno() != null;
    }

    public boolean isFuncionReturnInvisible() {
        return !this.isFuncionReturnVisible();
    }

    public boolean isFuncionPickItemHabilitada() {
        return true;
    }

    public boolean isFuncionPickItemInhabilitada() {
        return !this.isFuncionPickItemHabilitada();
    }

    public boolean isFuncionOpenLinkHabilitada() {
        if (designing) {
            return true;
        }
        return this.isFilaEscogidaDisponible() && this.isLoteSinCambios();
    }

    public boolean isFuncionOpenLinkInhabilitada() {
        return !this.isFuncionOpenLinkHabilitada();
    }

    public boolean isFilaDisponible() {
        if (designing) {
            return true;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(this.getCurrentRowKey());
    }

    public boolean isFilaNoDisponible() {
        if (designing) {
            return true; /* OJO: para que muestre el correspondiente grid de la P2 */
        }
        return !this.isFilaDisponible();
    }

    public boolean isFilaEscogida() {
        if (designing) {
            return false; /* OJO: para que las filas de la tabla no aparezcan todas resaltadas */
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().esFilaEscogida(this.getCurrentRowKey());
    }

    public boolean isFilaEscogidaDisponible() {
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(
                this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida()));
    }

    public boolean isFilaEscogidaNoDisponible() {
        return !this.isFilaEscogidaDisponible();
    }

    public boolean isFilaCreada() { /* 14/08/2007 "Fila procesada por FuncionCrearRecurso" */
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey()) &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionInsertEjecutada() &&
                this.getPaginaActualizacion().getRecursoDataProvider().getFuncionInsert() ==
                this.getPaginaActualizacion().getFuncionCrearRecurso());
    }

    public boolean isFilaNoCreada() { /* 14/08/2007 "Fila no procesada por FuncionCrearRecurso" */
        return !this.isFilaCreada();
    }

    public boolean isFilaModificada() { /* 14/08/2007 "Fila procesada por FuncionModificarRecurso" */
        if (designing) {
            return true;
        }
        return (this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey()) &&
                this.getPaginaActualizacion().getRecursoDataProvider().isFuncionUpdateEjecutada() &&
                this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate() ==
                this.getPaginaActualizacion().getFuncionModificarRecurso());
    }

    public boolean isFilaNoModificada() { /* 14/08/2007 "Fila no procesada por FuncionModificarRecurso" */
        return !this.isFilaModificada();
    }

    public boolean isFilaProcesada() {
        if (designing) {
            return true;
        }
        // 19/06/2007 a partir de hoy significa "Fila procesada por FuncionCrearRecurso o FuncionModificarRecurso"
        if (this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey())) {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionInsertEjecutada()) {
                return (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionInsert() ==
                        this.getPaginaActualizacion().getFuncionCrearRecurso());
            }
            if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionUpdateEjecutada()) {
                return (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate() ==
                        this.getPaginaActualizacion().getFuncionModificarRecurso());
            }
        }
        return false;
    }

    public boolean isFilaNoProcesada() {
        return !this.isFilaProcesada();
    }

    public boolean isFilaDisponibleProcesada() {
        return this.isFilaDisponible() && this.isFilaProcesada();
    }

    public boolean isFilaDisponibleNoProcesada() {
        return this.isFilaDisponible() && this.isFilaNoProcesada();
    }

    public boolean isFilaConCambios() {
        if (designing) {
            return true;
        }
        try {
            return (this.getPaginaActualizacion().getRecursoDataProvider().getCachedRowSet().rowInserted() ||
                    this.getPaginaActualizacion().getRecursoDataProvider().getCachedRowSet().rowUpdated() ||
                    this.getPaginaActualizacion().getRecursoDataProvider().getCachedRowSet().rowDeleted());
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean isFilaSinCambios() {
        if (designing) {
            return true;
        }
        return !this.isFilaConCambios();
    }

    public boolean isLoteConCambios() {
        if (designing) {
            return true;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isLoteConCambios();
    }

    public boolean isLoteSinCambios() {
        if (designing) {
            return true;
        }
        return !this.isLoteConCambios();
    }

    public boolean isLoteConFilas() {
        if (designing) {
            return true;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isLoteConFilas();
    }

    public boolean isLoteSinFilas() {
        if (designing) {
            return true;
        }
        return !this.isLoteConFilas();
    }

//  public boolean isLoteConFilasEliminadas() {
//      if (designing) {
//          return true;
//      }
//      return this.getPaginaActualizacion().getRecursoDataProvider().isLoteConFilasEliminadas();
//  }
//
//  public boolean isLoteSinFilasEliminadas() {
//      return !this.isLoteConFilasEliminadas();
//  }
//
    /**
     * Conserva el valor de la propiedad nuevaPosicionCursor.
     */
    private boolean nuevaPosicionCursor = false;

    /**
     * Getter para propiedad nuevaPosicionCursor.
     * @return Valor de la propiedad nuevaPosicionCursor.
     */
    public boolean isNuevaPosicionCursor() {
        return this.nuevaPosicionCursor;
    }

    /**
     * Setter para propiedad nuevaPosicionCursor.
     * @param nuevaPosicionCursor Nuevo valor de la propiedad nuevaPosicionCursor.
     */
    public void setNuevaPosicionCursor(boolean nuevaPosicionCursor) {
        this.nuevaPosicionCursor = nuevaPosicionCursor;
    }

    public String getMensajeCambiosPorConfirmar() {
        if (designing) {
            return this.getDesignTimeString("getMensajeCambiosPorConfirmar");
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().getMensajeCambiosPorConfirmar();
    }

    public String getMensajeCambiosPorDescartar() {
        if (designing) {
            return this.getDesignTimeString("getMensajeCambiosPorDescartar");
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().getMensajeCambiosPorDescartar();
    }

    public String getMensajeFilaNoDisponible() {
        if (designing) {
            return this.getDesignTimeString("getMensajeFilaNoDisponible");
        }
        String mensaje1 = this.getPaginaActualizacion().getRecursoDataProvider().getMensajeCambiosPorConfirmar();
        String mensaje2 = this.getMensaje();
        String mensaje3 = Bitacora.getTextoMensaje(CBM2.NO_CHANGES_TO_COMMIT);
        return mensaje1 == null ? mensaje2 == null ? mensaje3 : mensaje2 : mensaje1;
    }

    /**
     * Conserva el valor de la propiedad peticionInsert.
     */
    private boolean peticionInsert = false;

    /**
     * Getter para propiedad peticionInsert.
     * @return Valor de la propiedad peticionInsert.
     */
    public boolean isPeticionInsert() {
        return this.peticionInsert;
    }

    /**
     * Setter para propiedad peticionInsert.
     * @param peticionInsert Nuevo valor de la propiedad peticionInsert.
     */
    public void setPeticionInsert(boolean peticionInsert) {
        this.peticionInsert = peticionInsert;
    }

    /**
     * Conserva el valor de la propiedad reposicionPendiente.
     */
    private boolean reposicionPendiente = false;

    /**
     * Getter para propiedad reposicionPendiente.
     * @return Valor de la propiedad reposicionPendiente.
     */
    public boolean isReposicionPendiente() {
        return this.reposicionPendiente;
    }

    /**
     * Setter para propiedad reposicionPendiente.
     * @param reposicionPendiente Nuevo valor de la propiedad reposicionPendiente.
     */
    public void setReposicionPendiente(boolean reposicionPendiente) {
        this.reposicionPendiente = reposicionPendiente;
    }

    /**
     * Conserva el valor de la propiedad consultaPendiente.
     */
    private boolean consultaPendiente = false;

    /**
     * Getter para propiedad consultaPendiente.
     * @return Valor de la propiedad consultaPendiente.
     */
    public boolean isConsultaPendiente() {
        return this.consultaPendiente;
    }

    /**
     * Setter para propiedad consultaPendiente.
     * @param consultaPendiente Nuevo valor de la propiedad consultaPendiente.
     */
    public void setConsultaPendiente(boolean consultaPendiente) {
        this.consultaPendiente = consultaPendiente;
    }

    /**
     * Conserva el valor de la propiedad iniciacionPendiente.
     */
    private boolean iniciacionPendiente = false;

    /**
     * Getter para propiedad iniciacionPendiente.
     * @return Valor de la propiedad iniciacionPendiente.
     */
    public boolean isIniciacionPendiente() {
        return this.iniciacionPendiente;
    }

    /**
     * Setter para propiedad iniciacionPendiente.
     * @param iniciacionPendiente Nuevo valor de la propiedad iniciacionPendiente.
     */
    public void setIniciacionPendiente(boolean iniciacionPendiente) {
        this.iniciacionPendiente = iniciacionPendiente;
    }

    /**
     * Conserva el valor de la propiedad readOnlyProcessing.
     */
    private boolean readOnlyProcessing = false;

    /**
     * Getter para propiedad readOnlyProcessing.
     * @return Valor de la propiedad readOnlyProcessing.
     */
    public boolean isReadOnlyProcessing() {
        return this.readOnlyProcessing;
    }

    /**
     * Setter para propiedad readOnlyProcessing.
     * @param readOnlyProcessing Nuevo valor de la propiedad readOnlyProcessing.
     */
    public void setReadOnlyProcessing(boolean readOnlyProcessing) {
        this.readOnlyProcessing = readOnlyProcessing;
    }

    public String getTituloConsulta() {
        if (designing) {
            return this.getDesignTimeString("getTituloConsulta");
        }
        String titulo = this.getPaginaActualizacion().getRecursoDataProvider().getNombreDominioRecurso();
        if (this.isPaginaConsultaConMaestro()) {
            String detalle = this.getPaginaConsultaConMaestro().getEtiquetaClaseDetalle();
            String maestro = this.getPaginaConsultaConMaestro().getEtiquetaClaseMaestro();
            if (StringUtils.isNotBlank(detalle)) {
                String etiqueta = detalle.trim();
                if (StringUtils.isNotBlank(maestro)) {
                    etiqueta += " " + maestro.trim();
                }
                titulo = this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getDenominacionFilaEscogida(etiqueta);
            }
        } else if (this.isPaginaConsultaConArbol() || this.isPaginaConsultaConTabla()) {
        } else {
            String detalle = this.getPaginaActualizacion().getEtiquetaClaseDetalle();
            if (StringUtils.isNotBlank(detalle)) {
                String etiqueta = detalle.trim();
                titulo = this.getPaginaActualizacion().getRecursoDataProvider().getDenominacionFilaEscogida(etiqueta);
            }
        }
        return titulo;
    }

    @Override
    protected String getToolTipHipervinculoMigasPan() {
        if (designing) {
            return null;
        }
//      if (this.getPaginaActualizacion().getRecursoDataProvider().isFilaEscogidaDisponible()) {
//          return this.getPaginaActualizacion().getRecursoDataProvider().getDenominacionFilaEscogida();
//      } else {
//          return this.getTituloConsulta();
//      }
        return this.getTituloConsulta();
    }

    @Override
    protected String getMensajePeticionPorOmision() {
        return this.getMensajeCambiosPorConfirmar();
    }

    public String getValorRetornoRecursoActual() {
        if (designing) {
            return null;
        }
        return this.getValorRetornoRecurso(this.getCurrentRowKey());
    }

    public void setValorRetornoRecursoActual(String valor) {
        this.track("setValorRetornoRecursoActual", "valor=" + valor);
    }

    public String getValorRetornoRecursoEscogido() {
        if (designing) {
            return null;
        }
        return this.getValorRetornoRecurso(this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida());
    }

    public void setValorRetornoRecursoEscogido(String valor) {
        this.track("setValorRetornoRecursoEscogido", "valor=" + valor);
    }

    protected String getValorRetornoRecurso(RowKey rowKey) {
        if (designing) {
            return null;
        }
        this.track("getValorRetornoRecurso", "RowKey=" + rowKey);
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)) {
                String opcion = this.getPaginaActualizacion().getContextoSesion().getOpcionCampoRetorno();
                if (StringUtils.isBlank(opcion) || opcion.equals(String.valueOf(EnumOpcionAbrirVentana.BUSCAR_ID.intValue()))) {
                    if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
                        return STP.getString(this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey));
                    }
                } else {
                    if (opcion.equals(String.valueOf(EnumOpcionAbrirVentana.BUSCAR_CODIGO.intValue()))) {
                        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoCodificable()) {
                            return this.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
                        } else if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
                            return Global.PREFIJO_STRING_ID_RECURSO + this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                        }
                    } else {
                        Object obj = this.getPaginaActualizacion().getRecursoDataProvider().getValue(opcion, rowKey);
                        if (obj != null) {
                            if (obj instanceof Long) {
                                return Global.PREFIJO_STRING_ID_RECURSO + obj;
                            } else {
                                return STP.getString(obj);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            Bitacora.logTrace(ex);
        }
        return null;
    }

    private boolean isValorRetornoRecursoDisponible() {
        String opcion = this.getPaginaActualizacion().getContextoSesion().getOpcionCampoRetorno();
        if (StringUtils.isBlank(opcion)) {
            return false;
        }
        if (opcion.equals(String.valueOf(EnumOpcionAbrirVentana.BUSCAR_ID.intValue()))) {
            return this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable();
        }
        if (opcion.equals(String.valueOf(EnumOpcionAbrirVentana.BUSCAR_CODIGO.intValue()))) {
            return (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoCodificable() ||
                    this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable());
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isColumnaDisponible(opcion);
    }
    // </editor-fold>

    @Override
    protected void autorizar() {
        this.track("autorizar");
        long funcion = this.getPaginaActualizacion().getFuncionConsultarRecurso();
        this.paginaAutorizada = funcion == -1L || TLC.getControlador().esFuncionAutorizada(funcion);
    }

    @Override
    public void iniciar() {
        super.iniciar();
        this.iniciarDataProvider();
        this.setReposicionPendiente(true);
//      this.setConsultaPendiente(this.isRestauracion());
        this.setConsultaPendiente(false);
        this.setPeticionProcesada(false);
        this.setPeticionInsert(false);
    }

    private void iniciarDataProvider() {
        int limite = this.getLimiteFilasFuncionSelect();
        String tabla = null;
        this.getPaginaActualizacion().getRecursoDataProvider().setLimiteFilasFuncionSelect(limite);
        if (this.isPaginaConsultaConMaestro()) {
            tabla = this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().getTablaDestino();
        }
        this.getPaginaActualizacion().getRecursoDataProvider().setTablaMaestro(tabla);
    }

    private int getLimiteFilasFuncionSelect() {
        String dominio = this.getPaginaActualizacion().getRecursoDataProvider().getCodigoDominioRecurso();
        String string = BundleDominios.getLimiteFilasFuncionSelect(dominio);
        int limite = StringUtils.isNotBlank(string) && StringUtils.isNumeric(string) ? Integer.valueOf(string) : -1;
        return limite < 0 ? LIMITE_FILAS_FUNCION_SELECT : limite;
    }

    @Override
    public void preprocesar() { /* no se ejecuta si al apenas abrir la pagina se hace click en un link con url */
        super.preprocesar();
        this.inicializarFunciones(true);
        this.reposicionar(); /* no es necesario si es PaginaConsultaConTabla  */
    }

    @Override
    public void prepresentar() {
        this.track("prepresentar");
        this.setIniciacionPendiente(false);
        boolean consultaInsert = this.isConsultaInsert();
        boolean consultaValida = !consultaInsert && this.isConsultaValida();
        boolean reinicioFiltro = this.isReinicio() && this.getPaginaActualizacion().getContextoPeticion().getCriteriosBusqueda() != null;
//      this.trace();
//      this.trace("consultaInsert=" + consultaInsert);
//      this.trace("consultaValida=" + consultaValida);
//      this.trace("reinicioFiltro=" + reinicioFiltro);
        if (consultaInsert && this.isRetruque()) {
            this.retrucarAgregar();
        } else if (consultaValida && this.isRetruque()) {
            this.retrucar();
        } else if (reinicioFiltro || this.isConsultaPendiente() || this.isPaginaConsultaConMaestro() || this.isPaginaConsultaSinFiltro()) {
            this.inquirir();
        } else if (consultaValida && this.getPaginaActualizacion().getRecursoDataProvider().isLoteSinCambios()) {
            this.continuar();
        } else if (consultaValida && this.getPaginaActualizacion().getRecursoDataProvider().isLoteConCambios()) {
            this.refrescar();
        } else if (this.getPaginaActualizacion().getRecursoDataProvider().getLimiteFilasFuncionSelect() > 0) {
            this.iniciarConsulta();
        } else {
            this.inquirir();
        }
        this.posprepresentar();
    }

    private void trace() {
        this.track("trace@GestorPaginaActualizacion");
        this.trace("isRecursion=" + this.isRecursion());
        this.trace("isReinicio=" + this.isReinicio());
        this.trace("isRestauracion=" + this.isRestauracion());
        this.trace("isRetorno=" + this.isRetorno());
        this.trace("isRetruque=" + this.isRetruque());
        this.trace("isConsultaPendiente=" + this.isConsultaPendiente());
        this.trace("isPaginaConsultaConMaestro=" + this.isPaginaConsultaConMaestro());
        this.trace("isPaginaConsultaSinFiltro=" + this.isPaginaConsultaSinFiltro());
        this.trace("isLoteSinCambios=" + this.getPaginaActualizacion().getRecursoDataProvider().isLoteSinCambios());
        this.trace("isLoteConCambios=" + this.getPaginaActualizacion().getRecursoDataProvider().isLoteConCambios());
        this.trace("getLimiteFilasFuncionSelect=" + this.getPaginaActualizacion().getRecursoDataProvider().getLimiteFilasFuncionSelect());
    }

    // <editor-fold defaultstate="collapsed">
//  private boolean isConsultaConLimiteConFiltroSinMaestro() {
//      return !this.isConsultaPendiente() &&
//              this.getPaginaActualizacion().getRecursoDataProvider().getLimiteFilasFuncionSelect() != 0 &&
//              this.isPaginaConsultaConFiltro() && !this.isPaginaConsultaConMaestro();
//  }
    // </editor-fold>
    protected void retrucarAgregar() {
        this.track("retrucarAgregar");
        if (this.isConsultaPendiente()) {
            this.consultar();
        } else if (this.getPaginaActualizacion().getRecursoDataProvider().isLoteSinCambios()) {
            TLC.getBitacora().info(Bundle.getString("filtro_solo_filas_agregadas"));
        }
        this.continuar();
    }

    protected void retrucar() {
        this.track("retrucar");
        if (this.isConsultaPendiente()) {
            this.consultar();
        }
        this.continuar();
    }

    protected void continuar() {
        this.track("continuar");
        // OJO: reposicionar() y cursorSet(0) no son necesarios si es PaginaConsultaConTabla, pero no hacen daño
        if (this.isReposicionPendiente()) {
            this.reposicionar();
        } else {
            this.cursorSet(0); /* OJO con la constante: reposicionar [+ cursorNext [+ cursorFirst]] */
        }
    }

    protected void iniciarConsulta() {
        this.track("iniciarConsulta");
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().setFuncionSelect(this.getPaginaActualizacion().getFuncionConsultarRecurso());
            if (this.isReinicio()) {
                this.getPaginaActualizacion().getRecursoDataProvider().setCriteriosBusqueda(this.getPaginaActualizacion().getContextoPeticion().getCriteriosBusqueda());
            }
            this.getPaginaActualizacion().getRecursoDataProvider().setComandoEmptyCachedRowSet();
            this.getPaginaActualizacion().getRecursoDataProvider().setFiltroEscondido(false);
            TLC.getBitacora().warn(CBM2.SELECT_SET_SEARCH_CRITERIA, this.getPaginaActualizacion().getRecursoDataProvider().getLimiteFilasFuncionSelect());
        } catch (ExcepcionAplicacion ex) {
            Bitacora.logError(ex);
            this.inquirir();
        }
    }

    protected void inquirir() {
        this.track("inquirir");
        this.consultar();
        if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectAutorizada()) {
            this.inicializarFunciones(true);
            this.setIniciacionPendiente(true);
            this.getPaginaActualizacion().posconsultar();
            if (this.isRetruque() || this.isPaginaConsultaSinFiltro()) {
            } else {
                this.getPaginaActualizacion().getRecursoDataProvider().setFiltroEscondido(true);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para consultar">
    protected void consultar() {
        this.track("consultar");
        this.setConsultaPendiente(true);
        if (this.isReinicio()) {
            this.getPaginaActualizacion().getRecursoDataProvider().setCriteriosBusqueda(this.getPaginaActualizacion().getContextoPeticion().getCriteriosBusqueda());
            this.consultarPorIdentificacionRecurso();
            if (this.isConsultaPendiente()) {
                this.consultarMaestroPorIdentificacionRecursoMaestro();
            }
        }
        if (this.isConsultaPendiente()) {
            this.getPaginaActualizacion().consultar();
            if (this.isConsultaInsert()) {
            } else {
                this.getPaginaActualizacion().getRecursoDataProvider().storeQuery();
            }
        }
        if (this.isConsultaPendiente()) {
            this.release(); /* OJO: realmente hay que retornar un rowset vacio? */
        } else {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectAutorizada()) {
                this.setVersionComandoSelectPagina();
                this.setMaestroPagina();
                this.setNuevaPosicionCursor(true);
            } else {
                this.release(); /* OJO: realmente hay que retornar un rowset vacio? */
            }
        }
        this.descartarFormulariosVirtuales();
    }

    protected void consultarPorIdentificacionRecurso() {
        // consulta y posiciona el cursor utilizando la identificacion del recurso
        this.track("consultarPorIdentificacionRecurso");
        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
            String clave = this.getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            Long valor = this.getPaginaActualizacion().getContextoPeticion().getIdentificacionRecurso();
            // this.trace(clave + "=" + valor);
            if (valor != null) {
                RowKey rowKey = this.getRowRecurso(clave, valor);
                if (rowKey != null) {
                    this.posicionar(rowKey);
                    this.setConsultaPendiente(false);
                    if (this.isPaginaConsultaConMaestro()) {
                        this.consultarMaestroPorColumnaIdentificacionRecursoMaestro();
                    }
                }
            }
        }
    }

    protected RowKey getRowRecurso(String clave, Object valor) {
        this.track("getRow", clave + "=" + valor);
        RowKey rowKey = null;
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoConsultable()) {
//              FiltroBusqueda filtroBusqueda = new FiltroBusqueda(this.getRecursoDataProviderDataSourceName());
                FiltroBusqueda filtroBusqueda = new FiltroBusqueda();
                filtroBusqueda.addCriterio(clave, valor);
                long funcion = this.getPaginaActualizacion().getFuncionConsultarRecurso();
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionSelect(funcion);
                this.getRecursoConsultableDataProvider().ejecutarFuncionSelect(filtroBusqueda);
                if (this.getPaginaActualizacion().getRecursoDataProvider().cursorFirst()) {
                    rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getCursorRow();
                }
            }
        } catch (Exception ex) {
            rowKey = null;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey) ? rowKey : null;
    }

    protected void consultarMaestroPorIdentificacionRecursoMaestro() {
        this.track("consultarMaestroPorIdentificacionRecursoMaestro");
        if (this.isPaginaConsultaConMaestro()) {
            if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRecursoIdentificable()) {
                String clave = this.getRecursoMaestroIdentificableDataProvider().getColumnaIdentificacionRecurso();
                Long valor = this.getPaginaActualizacion().getContextoPeticion().getIdentificacionRecursoMaestro();
                // this.trace(clave + "=" + valor);
                if (valor != null) {
                    this.getRowMaestro(clave, valor);
                }
            }
        }
    }

    protected void consultarMaestroPorColumnaIdentificacionRecursoMaestro() {
        this.track("consultarMaestroPorColumnaIdentificacionRecursoMaestro");
        if (this.isPaginaConsultaConMaestro()) {
            if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRecursoIdentificable()) {
                String columna = this.getPaginaConsultaConMaestro().getColumnaIdentificacionRecursoMaestro();
                Long valor = (Long) this.getPaginaActualizacion().getRecursoDataProvider().getValue(columna);
                // this.trace(columna + "=" + valor);
                if (valor != null) {
                    String clave = this.getRecursoMaestroIdentificableDataProvider().getColumnaIdentificacionRecurso();
                    this.getRowMaestro(clave, valor);
                }
            }
        }
    }

    protected RowKey getRowMaestro(String clave, Object valor) {
        this.track("getRowMaestro", clave + "=" + valor);
        RowKey rowKey = null;
        if (this.isPaginaConsultaConMaestro()) {
            try {
                if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRecursoConsultable()) {
//                  FiltroBusqueda filtroBusqueda = new FiltroBusqueda(this.getRecursoMaestroDataProviderDataSourceName());
                    FiltroBusqueda filtroBusqueda = new FiltroBusqueda();
                    filtroBusqueda.addCriterio(clave, valor);
                    // int funcion = this.getRecursoMaestroConsultableDataProvider().getFuncionConsultarRecurso();
                    // this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().setFuncionSelect(funcion);
                    this.getRecursoMaestroConsultableDataProvider().ejecutarFuncionSelect(filtroBusqueda);
                    if (this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().cursorFirst()) {
                        rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getCursorRow();
                    }
                }
            } catch (Exception ex) {
                rowKey = null;
            }
        }
        return this.getPaginaConsultaConMaestro().getRecursoMaestroDataProvider().isRowAvailable(rowKey) ? rowKey : null;
    }

    protected void setVersionComandoSelectPagina() {
        long version = this.getPaginaActualizacion().getRecursoDataProvider().getVersionComandoSelect();
        this.getPaginaActualizacion().getContextoSesion().setVersionComandoSelectPagina(this.getClavePagina(), version);
    }

    protected void setMaestroPagina() {
        String p = this.getClavePagina();
        String c = this.isPaginaConsultaConMaestro() ? this.getColumnaIdentificacionRecursoMaestro() : null;
        Long irm = this.isPaginaConsultaConMaestro() ? this.getIdentificacionRecursoMaestro() : null;
        this.getPaginaActualizacion().getContextoSesion().setColumnaIdentificacionRecursoMaestroPagina(p, c);
        this.getPaginaActualizacion().getContextoSesion().setIdentificacionRecursoMaestroPagina(p, irm);
    }

    protected boolean release() {
        this.track("release");
        this.setConsultaPendiente(false);
        boolean ok = false;
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().release();
            ok = true;
        } catch (SQLException ex) {
            this.handle(ex);
        } finally {
            return ok;
        }
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para posicionar/reposicionar">
    public boolean reposicionar() {
        RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
        return this.posicionar(rowKey);
    }

    public boolean posicionar(Long identificacion) { /* posiciona el cursor utilizando la identificacion del recurso */
        this.track("posicionar", "identificacion=" + identificacion);
        RowKey rowKey = null;
        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
            String clave = this.getRecursoIdentificableDataProvider().getColumnaIdentificacionRecurso();
            Long valor = identificacion;
            // this.trace(clave + "=" + valor);
            if (valor != null && this.getPaginaActualizacion().getRecursoDataProvider().isLoteConFilas()) {
                rowKey = this.getPaginaActualizacion().getRecursoDataProvider().findFirst(clave, valor);
            }
        }
        return this.posicionar(rowKey);
    }

    public boolean posicionar(String codigo) { /* posiciona el cursor utilizando el codigo del recurso */
        this.track("posicionar", "codigo=" + codigo);
        RowKey rowKey = null;
        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoCodificable()) {
            String clave = this.getRecursoCodificableDataProvider().getColumnaCodigoRecurso();
            String valor = codigo;
            // this.trace(clave + "=" + valor);
            if (valor != null && this.getPaginaActualizacion().getRecursoDataProvider().isLoteConFilas()) {
                rowKey = this.getPaginaActualizacion().getRecursoDataProvider().findFirst(clave, valor);
            }
        }
        return this.posicionar(rowKey);
    }

    protected boolean posicionar(RowKey rowKey) {
        this.track("posicionar", "RowKey=" + rowKey);
        this.setReposicionPendiente(false);
        boolean ok = false;
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)) {
                this.getPaginaActualizacion().getRecursoDataProvider().setCursorRow(rowKey);
                this.getPaginaActualizacion().getRecursoDataProvider().setFilaEscogida(rowKey);
                ok = true;
            }
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            return ok;
        }
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el filtro de busqueda">
    public FiltroBusqueda getFiltroBusqueda(Long filtro, String codigo, String nombre) {
        return this.getFiltroBusqueda(filtro, codigo, nombre, null);
    }

    public FiltroBusqueda getFiltroBusqueda(Long filtro, Long segmento) {
        return this.getFiltroBusqueda(filtro, null, null, segmento);
    }

    public FiltroBusqueda getFiltroBusqueda(Long filtro, String codigo, String nombre, Long segmento) {
        this.track("getFiltroBusqueda", "filtro=" + filtro, "codigo=" + codigo, "nombre=" + nombre, "segmento=" + segmento);
        this.getPaginaActualizacion().getRecursoDataProvider().setFiltroFuncionSelect(filtro);
        this.getPaginaActualizacion().getRecursoDataProvider().setCodigoFuncionSelect(null);
        this.getPaginaActualizacion().getRecursoDataProvider().setNombreFuncionSelect(null);
        this.getPaginaActualizacion().getRecursoDataProvider().setSegmentoFuncionSelect(null);
        FiltroBusqueda filtroBusqueda = null;
        if (filtro == null) {
//          filtroBusqueda = new FiltroBusqueda(this.getRecursoDataProviderDataSourceName());
            filtroBusqueda = new FiltroBusqueda();
        } else {
//          filtroBusqueda = new FiltroBusqueda(this.getRecursoDataProviderDataSourceName(), filtro);
            filtroBusqueda = new FiltroBusqueda(filtro);
        }
        if (StringUtils.isNotBlank(codigo) && this.getPaginaActualizacion().getRecursoDataProvider().isRecursoCodificable()) {
            filtroBusqueda.addCriterio(this.getRecursoCodificableDataProvider().getColumnaCodigoRecurso(),
                this.getOperadorCom(codigo), this.getValorComparacion(codigo));
        }
        if (StringUtils.isNotBlank(nombre) && this.getPaginaActualizacion().getRecursoDataProvider().isRecursoNombrable()) {
            filtroBusqueda.addCriterio(this.getRecursoNombrableDataProvider().getColumnaNombreRecurso(),
                this.getOperadorCom(nombre), this.getValorComparacion(nombre));
        }
        if (segmento != null && this.getPaginaActualizacion().getRecursoDataProvider().isRecursoSegmentable()) {
            filtroBusqueda.addCriterio(this.getRecursoSegmentableDataProvider().getColumnaSegmentoRecurso(),
                EnumOperadorCom.ES_IGUAL, segmento);
        }
        String columna;
        Long maestro;
        if (this.isPaginaConsultaConMaestro()) {
            columna = this.getColumnaIdentificacionRecursoMaestro();
            maestro = this.getIdentificacionRecursoMaestro();
        } else {
            columna = null;
            maestro = null;
        }
        if (columna != null) {
            if (maestro == null) {
                filtroBusqueda.addCriterio(columna, true); /* OJO: rowset de filas SIN maestro? */
            } else {
                filtroBusqueda.addCriterio(columna, EnumOperadorCom.ES_IGUAL, maestro);
            }
        }
        /**/
        this.getPaginaActualizacion().getRecursoDataProvider().setCodigoFuncionSelect(codigo);
        this.getPaginaActualizacion().getRecursoDataProvider().setNombreFuncionSelect(nombre);
        this.getPaginaActualizacion().getRecursoDataProvider().setSegmentoFuncionSelect(segmento);
        this.getPaginaActualizacion().getRecursoDataProvider().setColumnaMaestro(columna);
        this.getPaginaActualizacion().getRecursoDataProvider().setIdentificacionMaestro(maestro);
        /**/
        return filtroBusqueda;
    }

//  public FiltroBusqueda getFiltroBusqueda(String clave, Long valor) {
//      this.track("getFiltroBusqueda", "clave=" + clave, "valor=" + valor);
////    FiltroBusqueda filtroBusqueda = new FiltroBusqueda(this.getRecursoDataProviderDataSourceName());
//      FiltroBusqueda filtroBusqueda = new FiltroBusqueda();
//      filtroBusqueda.addCriterio(clave, valor);
//      return filtroBusqueda;
//  }
//
    private EnumOperadorCom getOperadorCom(String string) {
        String not = "-";
        String any = TLC.getInterpreteSql().getLikeString();
        return StringUtils.isBlank(string)
            ? EnumOperadorCom.ES_NULO
            : string.startsWith(not + any) && string.endsWith(any)
            ? EnumOperadorCom.NO_CONTIENE
            : string.startsWith(not + any)
            ? EnumOperadorCom.NO_TERMINA_EN
            : string.startsWith(not) && string.endsWith(any)
            ? EnumOperadorCom.NO_COMIENZA_POR
            : string.startsWith(not)
            ? EnumOperadorCom.NO_ES_IGUAL
            : string.startsWith(any) && string.endsWith(any)
            ? EnumOperadorCom.CONTIENE
            : string.startsWith(any)
            ? EnumOperadorCom.TERMINA_EN
            : string.endsWith(any)
            ? EnumOperadorCom.COMIENZA_POR
            : EnumOperadorCom.ES_IGUAL;
    }

    private String getValorComparacion(String string) {
        String not = "-";
        String any = TLC.getInterpreteSql().getLikeString();
        String valor = StringUtils.trimToNull(string);
        int endIndex = valor == null ? 0 : valor.length() - 1;
        valor = valor == null
            ? null // ES_NULO
            : valor.startsWith(not + any) && valor.endsWith(any)
            ? valor.substring(2, endIndex) // NO_CONTIENE
            : valor.startsWith(not + any)
            ? valor.substring(2) // NO_TERMINA_EN
            : valor.startsWith(not) && valor.endsWith(any)
            ? valor.substring(1, endIndex) // NO_COMIENZA_POR
            : valor.startsWith(not)
            ? valor.substring(1) // NO_ES_IGUAL
            : valor.startsWith(any) && valor.endsWith(any)
            ? valor.substring(1, endIndex) // CONTIENE
            : valor.startsWith(any)
            ? valor.substring(1) // TERMINA_EN
            : valor.endsWith(any)
            ? valor.substring(0, endIndex) // COMIENZA_POR
            : valor; // ES_IGUAL
        /**/
        valor = StringUtils.trimToNull(valor);
        return valor == null ? null : valor.replace('/' + not + '/', not).replace('/' + any + '/', any);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para agregar">
    protected void appendRow(long funcion) throws ExcepcionAplicacion {
        this.track("appendRow", "funcion=" + funcion);
        this.setPeticionInsert(true);
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().setFuncionInsert(funcion);
            RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().appendRow();
            this.getPaginaActualizacion().getRecursoDataProvider().setCursorRow(rowKey);
            this.getPaginaActualizacion().getRecursoDataProvider().setFilaEscogida(rowKey);
            this.setNuevaPosicionCursor(true);
            String columna;
            Long maestro;
            if (this.isPaginaConsultaConMaestro()) {
                columna = this.getColumnaIdentificacionRecursoMaestro();
                maestro = this.getIdentificacionRecursoMaestro();
            } else {
                columna = this.getPaginaActualizacion().getRecursoDataProvider().getColumnaMaestro();
                maestro = this.getPaginaActualizacion().getRecursoDataProvider().getIdentificacionMaestro();
            }
            if (columna != null && maestro != null) {
                this.trace(columna + "=" + maestro);
                this.getPaginaActualizacion().getRecursoDataProvider().setValue(columna, maestro);
            }
            this.getPaginaActualizacion().getRecursoDataProvider().setSegmento(rowKey);
        } catch (Exception ex) {
            throw ex instanceof ExcepcionAplicacion ? (ExcepcionAplicacion) ex : new ExcepcionAplicacion(ex);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de la tabla (inicializarFunciones...)">
//  public void inicializarFuncionSelect() {
//      this.inicializarFuncionSelect(false);
//  }
//
//  public void inicializarFuncionSelect(boolean nohandle) {
//      this.track("inicializarFuncionSelect", "nohandle=" + nohandle);
//      EnumSeveridadMensaje severidad = TLC.getBitacora().getSeveridadMinima();
//      if (nohandle) {
//          TLC.getBitacora().setSeveridadMinima(EnumSeveridadMensaje.FATAL);
//      }
//      try {
//          if (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionSelect() < 0 && this.getPaginaActualizacion().getFuncionConsultarRecurso() > 0) {
//              this.getPaginaActualizacion().getRecursoDataProvider().setFuncionSelect(this.getPaginaActualizacion().getFuncionConsultarRecurso());
//          }
//      } catch (ExcepcionAplicacion ex) {
//          if (!nohandle) {
//              this.handle(ex);
//          }
//      }
//      TLC.getBitacora().setSeveridadMinima(severidad);
//      if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionSelectAutorizada()) {
//          this.inicializarFunciones(nohandle);
//      }
//  }
//
    public void inicializarFunciones() {
        this.inicializarFunciones(false);
    }

    public void inicializarFunciones(boolean nohandle) {
        this.track("inicializarFunciones", "nohandle=" + nohandle);
        EnumSeveridadMensaje severidad = TLC.getBitacora().getSeveridadMinima();
        if (nohandle) {
            TLC.getBitacora().setSeveridadMinima(EnumSeveridadMensaje.FATAL);
        }
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionInsert() < 0 && this.getPaginaActualizacion().getFuncionCrearRecurso() > 0) {
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionInsert(this.getPaginaActualizacion().getFuncionCrearRecurso());
            }
        } catch (ExcepcionAplicacion ex) {
            if (!nohandle) {
                this.handle(ex);
            }
        }
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate() < 0 && this.getPaginaActualizacion().getFuncionModificarRecurso() > 0) {
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionUpdate(this.getPaginaActualizacion().getFuncionModificarRecurso());
            }
        } catch (ExcepcionAplicacion ex) {
            if (!nohandle) {
                this.handle(ex);
            }
        }
        try {
            if (this.getPaginaActualizacion().getRecursoDataProvider().getFuncionDelete() < 0 && this.getPaginaActualizacion().getFuncionEliminarRecurso() > 0) {
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionDelete(this.getPaginaActualizacion().getFuncionEliminarRecurso());
            }
        } catch (ExcepcionAplicacion ex) {
            if (!nohandle) {
                this.handle(ex);
            }
        }
        TLC.getBitacora().setSeveridadMinima(severidad);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para ejecutar las acciones de la pagina de actualizacion">
    public boolean irAlPrimero() {
        this.track("irAlPrimero");
        return this.cursorSet(1); /* OJO con la constante: cursorFirst */
    }

    public boolean irAlAnterior() {
        this.track("irAlAnterior");
        return this.cursorSet(2); /* OJO con la constante: cursorPrevious */
    }

    public boolean irAlSiguiente() {
        this.track("irAlSiguiente");
        return this.cursorSet(3); /* OJO con la constante: cursorNext */
    }

    public boolean irAlUltimo() {
        this.track("irAlUltimo");
        return this.cursorSet(4); /* OJO con la constante: cursorLast */
    }

    public boolean refrescar() {
        this.track("refrescar");
        return this.refresh();
    }

    public boolean reconsultar() {
        this.track("reconsultar");
        return this.requery();
    }

    public boolean agregar() {
        return this.agregar(this.getPaginaActualizacion().getFuncionCrearRecurso());
    }

    public boolean agregar(long funcion) {
        this.track("agregar", "funcion=" + funcion);
        try {
            this.appendRow(funcion);
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean editar() {
        return this.editar(this.getFuncionEdicionSeleccionada());
    }

    public boolean editar(long funcion) {
        this.track("editar", "funcion=" + funcion);
        try {
            if (this.isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionUpdate(funcion);
                this.getPaginaActualizacion().getRecursoDataProvider().editRow(rowKey);
                this.descartarFormulariosVirtuales();
                return true;
            }
            TLC.getBitacora().warn(CBM2.UPDATE_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean eliminar() {
        return this.eliminar(this.getPaginaActualizacion().getFuncionEliminarRecurso());
    }

    public boolean eliminar(long funcion) {
        this.track("eliminar", "funcion=" + funcion);
        try {
            if (this.isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionDelete(funcion);
                this.getPaginaActualizacion().getRecursoDataProvider().removeRow(rowKey);
                this.descartarFormulariosVirtuales();
                this.cursorSet(3, true); /* OJO con la constante: cursorNext [+ cursorFirst] */
                return true;
            }
            TLC.getBitacora().warn(CBM2.DELETE_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean aplicar() {
//      this.track("aplicar");
        return true;
    }

    public boolean deshacer() {
        this.track("deshacer");
        try {
            if (this.isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                this.getPaginaActualizacion().getRecursoDataProvider().undoRow(rowKey);
                this.descartarFormulariosVirtuales();
                this.cursorSet(0); /* OJO con la constante: reposicionar [+ cursorNext [+ cursorFirst]] */
                return true;
            }
            TLC.getBitacora().warn(CBM2.UNDO_CHANGES_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean confirmar() {
        this.track("confirmar");
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().commitChanges();
            this.refresh();
            TLC.getBitacora().info(CBM2.COMMIT_CHANGES_OK);
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean descartar() {
        this.track("descartar");
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().revertChanges();
            this.refresh();
            TLC.getBitacora().info(CBM2.REVERT_CHANGES_OK);
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean procesar() {
        return this.procesar(this.getFuncionAccionSeleccionada());
    }

    public boolean procesar(long funcion) {
        this.track("procesar", "funcion=" + funcion);
        try {
            if (this.isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                this.getPaginaActualizacion().getRecursoDataProvider().setFuncionBusinessProcess(funcion);
                this.getPaginaActualizacion().getRecursoDataProvider().processRow(rowKey, funcion);
                this.refresh(); /* this.descartarFormulariosVirtuales(); */
                return true;
            }
            TLC.getBitacora().warn(CBM2.PROCESS_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean procesar(RowProcessor processor) {
        this.track("procesar", processor);
        try {
            if (this.isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, this.getPaginaActualizacion().getRecursoDataProvider().getEtiquetaRecurso(rowKey));
                processor.processRow(rowKey);
                TLC.getBitacora().warn(CBM2.PROCESS_EXECUTION_END, "");
                this.refresh(); /* this.descartarFormulariosVirtuales(); */
                return true;
            }
            TLC.getBitacora().warn(CBM2.PROCESS_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean procesar(String metodo) {
        this.track("procesar", metodo);
        try {
            if (this.isFilaEscogidaDisponible()) {
                Object object = this.getPaginaActualizacion();
                Method method = this.getPaginaActualizacion().getClass().getMethod(metodo, new Class[]{RowKey.class});
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, this.getPaginaActualizacion().getRecursoDataProvider().getEtiquetaRecurso(rowKey));
                method.invoke(object, rowKey);
                TLC.getBitacora().warn(CBM2.PROCESS_EXECUTION_END, metodo);
                this.refresh(); /* this.descartarFormulariosVirtuales(); */
                return true;
            }
            TLC.getBitacora().warn(CBM2.PROCESS_NONE);
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    public boolean retornar() {
//      this.track("retornar");
//      HttpServletRequest request = (HttpServletRequest) this.getPaginaActualizacion().getFacesContext().getExternalContext().getRequest();
//      HttpSession session = request.getSession(false);
//      session.invalidate();
        return true;
    }

    public boolean vincular() {
        return this.vincular(2); /* OJO con la constante: valida que el lote no tenga cambios */
    }

    public boolean vincular(int validacion) {
        return this.vincular(validacion, false);
    }

//  public boolean vincular(boolean remover) {
//      return this.vincular(2, remover); /* OJO con la constante: valida que el lote no tenga cambios */
//  }
//
    public boolean vincular(int validacion, boolean remover) {
        return this.vincular(validacion, remover, 0); /* OJO con la constante: usa la fila actual */
    }

    protected boolean vincular(int validacion, boolean remover, int origen) {
        this.track("vincular", "validacion=" + validacion, "remover=" + remover, "origen=" + origen);
        this.descartarFormulariosVirtuales();
//      boolean ok = this.setIdentificacionRecursoPagina(validacion, origen);
        boolean ok;
        boolean filaDisponible = this.setIdentificacionRecursoPagina(origen);
        switch (validacion) {
            case 1:  /* OJO con la constante /* valida que la fila no tenga cambios */
                ok = filaDisponible ? this.isFilaSinCambios() : false;
                break;
            case 2:  /* OJO con la constante /* valida que el lote no tenga cambios */
                ok = this.isLoteSinCambios();
                break;
            case 3:  /* OJO con la constante /* valida que el lote no tenga cambios */
                filaDisponible = true; /* no importa si no hay fila disponible */
                ok = this.isLoteSinCambios(); /* con tal que el lote no tenga cambios */
                break;
            default: /* solo valida que la fila este disponible */
                ok = filaDisponible;
                break;
        }
        if (filaDisponible) {
            if (ok) {
                this.removerHipervinculo(remover);
            } else {
                TLC.getBitacora().error(CBM2.HYPERLINK_EXCEPTION_1);
            }
        } else {
            TLC.getBitacora().error(CBM2.PROCESS_NONE);
        }
        return filaDisponible && ok;
    }

    protected String accionVincular(String vinculo, int validacion, boolean remover, int origen) {
        return StringUtils.isNotBlank(vinculo) && this.vincular(validacion, remover, origen) ? vinculo : null;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el script de los botones de la pagina de actualizacion">
    public String getScriptIrAlPrimero() {
//      this.track("getScriptIrAlPrimero");
        return null;
    }

    public String getScriptIrAlAnterior() {
//      this.track("getScriptIrAlAnterior");
        return null;
    }

    public String getScriptIrAlSiguiente() {
//      this.track("getScriptIrAlSiguiente");
        return null;
    }

    public String getScriptIrAlUltimo() {
//      this.track("getScriptIrAlUltimo");
        return null;
    }

    public String getScriptRepaginar() {
//      this.track("getScriptRepaginar");
        return null;
    }

    public String getScriptRefrescar() {
//      this.track("getScriptRefrescar");
        return null;
    }

    public String getScriptReconsultar() {
//      this.track("getScriptReconsultar");
        return null;
    }

    public String getScriptAgregar() {
//      this.track("getScriptAgregar");
        return null;
    }

    public String getScriptEditar() {
        this.track("getScriptEditar");
        String table = null;
        String message1 = null;
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }

    public String getScriptEliminar() {
        this.track("getScriptEliminar");
        String table = null;
        String message1 = null;
//      String message2 = Bitacora.getTextoMensaje(CBM2.DELETE_CONFIRM_MESSAGE);
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }

    public String getScriptAplicar() {
//      this.track("getScriptAplicar");
        return null;
    }

    public String getScriptDeshacer() {
        this.track("getScriptDeshacer");
        String table = null;
        String message1 = null;
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }

    public String getScriptConfirmar() {
        this.track("getScriptConfirmar");
        String message1 = null; /* this.getMensajeCambiosPorConfirmar(); */
        String script = JS.getConfirmDialogJavaScript(message1, true);
        return script;
    }

    public String getScriptDescartar() {
        this.track("getScriptDescartar");
        String message1 = this.getMensajeCambiosPorDescartar();
        String script = JS.getConfirmDialogJavaScript(message1, true);
        return script;
    }

    public String getScriptProcesar() {
        this.track("getScriptProcesar");
        String message1 = Bitacora.getTextoMensaje(CBM2.PROCESS_CONFIRM_MESSAGE);
        String script = JS.getConfirmDialogJavaScript(message1, true);
        return script;
    }

    public String getScriptRetornar() {
        if (designing) {
            return null;
        }
        this.track("getScriptRetornar");
        String campo = this.getPaginaActualizacion().getContextoSesion().getCampoAccionRetorno();
        String valor = null; /* getSessionCookie(); */
        String boton = this.getPaginaActualizacion().getContextoSesion().getBotonAccionRetorno();
        String script = JS.getCloseWindowJavaScript(campo, valor, boton);
        //Bitacora.trace(script);
        return script;
    }

    public String getScriptRetornarRecursoActual() {
        if (designing) {
            return null;
        }
        this.track("getScriptRetornarRecursoActual");
        String campo = this.getPaginaActualizacion().getContextoSesion().getCampoAccionRetorno();
        String valor = campo == null ? null : this.getValorRetornoRecursoActual();
        String boton = this.getPaginaActualizacion().getContextoSesion().getBotonAccionRetorno();
        String script = JS.getCloseWindowJavaScript(campo, valor, boton);
        //Bitacora.trace(script);
        return script;
    }

    public String getScriptRetornarRecursoEscogido() {
        if (designing) {
            return null;
        }
        this.track("getScriptRetornarRecursoEscogido");
        String campo = this.getPaginaActualizacion().getContextoSesion().getCampoAccionRetorno();
        String valor = campo == null ? null : this.getValorRetornoRecursoEscogido();
        String boton = this.getPaginaActualizacion().getContextoSesion().getBotonAccionRetorno();
        String script = JS.getCloseWindowJavaScript(campo, valor, boton);
        //Bitacora.trace(script);
        return script;
    }

    public String getScriptAbrirVentana(String urx) {
        return this.getScriptAbrirVentana(urx, 0); /* OJO con la constante: usa la fila actual */
    }

    public String getScriptAbrirVentana(String urx, int origen) {
        Long recurso = null;
        switch (origen) {
            case 1:  /* OJO con la constante: usa la fila escogida */
                recurso = this.getIdentificacionRecursoEscogido();
            default: /* usa la fila actual */
                recurso = this.getIdentificacionRecursoActual();
        }
        return recurso == null ? null : this.getScriptAbrirVentana(urx, recurso);
    }

    public String getScriptAbrirVentanaVerDetalle(String urx) {
        return this.getScriptAbrirVentanaVerDetalle(urx, 0); /* OJO con la constante: usa la fila actual */
    }

    public String getScriptAbrirVentanaVerDetalle(String urx, int origen) {
        Long recurso = null;
        switch (origen) {
            case 1:  /* OJO con la constante: usa la fila escogida */
                recurso = this.getIdentificacionRecursoEscogido();
            default: /* usa la fila actual */
                recurso = this.getIdentificacionRecursoActual();
        }
        return recurso == null ? null : this.getScriptAbrirVentanaVerDetalle(urx, recurso);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el url de la imagen los botones de la pagina de actualizacion">
    public String getUrlImagenIrAlPrimero() {
        return "resources/pagination_first.gif";
    }

    public String getUrlImagenIrAlAnterior() {
        return "resources/pagination_prev.gif";
    }

    public String getUrlImagenIrAlSiguiente() {
        return "resources/pagination_next.gif";
    }

    public String getUrlImagenIrAlUltimo() {
        return "resources/pagination_last.gif";
    }

    public String getUrlImagenRepaginar() {
        return "resources/repaginate24.gif";
    }

    public String getUrlImagenRefrescar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/refresh24.gif";
    }

    public String getUrlImagenAgregar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/add24.gif";
    }

    public String getUrlImagenEditar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/edit24.gif";
    }

    public String getUrlImagenDeshacer() {
        return this.isBotonesAccionSinImagen() ? null : "resources/undo24.gif";
    }

    public String getUrlImagenEliminar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/delete24.gif";
    }

    public String getUrlImagenAplicar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/apply24.gif";
    }

    public String getUrlImagenConfirmar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/save24.gif";
    }

    public String getUrlImagenDescartar() {
        return this.isBotonesAccionSinImagen() ? null : "resources/discard24.gif";
    }

    public String getUrlImagenRetornar() {
//      return this.isBotonesAccionSinImagen() ? null : "resources/return24.gif";
        return "resources/return.gif";
    }

    public String getUrlImagenDetallar() {
        return "resources/detail.gif";
    }

    public String getUrlImagenProcesar() {
        return "resources/run.gif";
    }

    public String getUrlImagenEscoger() {
        return "resources/pick.gif";
    }

    @Override
    public String getUrlImagenAbrirVinculo() {
        if (designing) {
            return "resources/open_link_enabled.gif";
        }
        if (this.isFuncionOpenLinkInhabilitada()) {
            return "resources/open_link_disabled.gif";
        } else {
            return "resources/open_link_enabled.gif";
        }
    }

    public String getUrlImagenAbrirVentanaVerDetalles() {
        return "resources/detail.gif";
    }

    public String getUrlImagenFilaProcesada() {
        if (designing) {
            return "resources/ok_small.gif";
        }
        if (this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey())) {
            if (this.getPaginaActualizacion().getRecursoDataProvider().esFilaConflictiva(this.getCurrentRowKey())) {
                return this.getUrlImagenFilaConflictiva();
            } else {
                return "resources/ok_small.gif";
            }
        }
        return "resources/ok_dimmed.gif";
    }

    protected String getUrlImagenFilaConflictiva() {
        if (designing) {
            return "resources/failed_small.gif";
        }
        String clave = this.getCurrentRowKey().getRowId();
        String valor = (String) this.getPaginaActualizacion().getRecursoDataProvider().getFilasConflictivas().get(clave);
        if (valor != null) {
            int severidad = Integer.parseInt(valor.substring(0, 1));
            if (severidad == 0) {
                return "resources/unknown_small.gif";
            }
//          switch (severidad) {
//              case 0: /* OJO con la constante: 0 -> fila "ignorada" (no se sabe si tiene o no errores) */
//                  return "resources/unknown_small.gif";
//              case 1: /* OJO con la constante: 1 -> fila con un error desconocido */
//                  break;
//              case 2: /* OJO con la constante: 2 -> fila con un error conocido */
//                  break;
//              case 3: /* OJO con la constante: 3 -> fila con uno o mas errores, todos conocidos */
//                  break;
//              default:
//                  break;
//              }
        }
        return "resources/failed_small.gif";
    }

    public String getUrlImagenMaestroFilaProcesada() {
        if (designing) {
            return "resources/ok_small.gif";
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey())
                ? "resources/ok_small.gif"
                : "resources/ok_dimmed.gif";
    }

    public String getUrlImagenSeveridadMensajeFilaNoDisponible() {
        return "resources/info_medium.gif";
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el toolTip de los botones de la pagina de actualizacion">
    public String getToolTipImagenFilaProcesada() {
        if (designing) {
            return null;
        }
        if (this.getPaginaActualizacion().getRecursoDataProvider().esFilaProcesada(this.getCurrentRowKey())) {
            if (this.getPaginaActualizacion().getRecursoDataProvider().esFilaConflictiva(this.getCurrentRowKey())) {
                return this.getToolTipImagenFilaConflictiva();
            } else {
                return Bundle.getString("imagenFilaProcesada.toolTip");
            }
        }
        return this.getToolTipImagenFilaNoProcesada();
    }

    protected String getToolTipImagenFilaNoProcesada() {
        return null;
    }

    protected String getToolTipImagenFilaConflictiva() {
        if (designing) {
            return null;
        }
        String clave = this.getCurrentRowKey().getRowId();
        String valor = (String) this.getPaginaActualizacion().getRecursoDataProvider().getFilasConflictivas().get(clave);
        return valor == null ? null : valor.substring(1);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estándar para establecer la identificacion del recurso (comentados)">
//  protected boolean setIdentificacionRecursoPagina() {
//      return this.setIdentificacionRecursoPagina(0); /* OJO con la constante: no valida nada */
//  }

//  protected boolean setIdentificacionRecursoPagina(int validacion) {
//      return this.setIdentificacionRecursoPagina(validacion, 0); /* OJO con la constante: usa la fila actual */
//  }

//  protected boolean setIdentificacionRecursoPagina(int validacion, int origen) {
//      this.track("setIdentificacionRecursoPagina", "validacion=" + validacion, "origen=" + origen);
//      RowKey rowKey = null;
//      switch (origen) {
//          case 1:  /* OJO con la constante: usa la fila escogida */
//              rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
//              break;
//          default: /* usa la fila actual */
//              rowKey = this.getCurrentRowKey();
//              break;
//      }
//      return this.setIdentificacionRecursoPagina(validacion, rowKey);
//  }

//  protected boolean setIdentificacionRecursoPagina(int validacion, RowKey rowKey) {
//      boolean ok = false;
//      Long valor = null;
//      try {
//          if (rowKey != null) {
//              if (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)) {
//                  this.getPaginaActualizacion().getRecursoDataProvider().setCursorRow(rowKey);
//                  if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
//                      valor = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
//                  }
//                  switch (validacion) {
//                      case 1:  /* OJO con la constante: valida que la fila no tenga cambios */
//                          ok = this.isFilaSinCambios();
//                          break;
//                      case 2:  /* OJO con la constante: valida que el lote no tenga cambios */
//                          ok = this.isLoteSinCambios();
//                          break;
//                      default: /* no valida nada! */
//                          ok = true;
//                          break;
//                  }
//              } else {
//                  rowKey = null;
//              }
//          }
//      } catch (Exception ex) {
//          rowKey = null;
//          valor = null;
//          this.handle(ex);
//      }
//      this.getPaginaActualizacion().getRecursoDataProvider().setFilaEscogida(rowKey);
//      this.getPaginaActualizacion().getContextoPeticion().setIdentificacionRecurso(valor);
//      return ok;
//  }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para establecer la identificacion del recurso">
    protected boolean setIdentificacionRecursoPagina() {
        return this.setIdentificacionRecursoPagina(0); /* OJO con la constante: usa la fila actual */
    }

    protected boolean setIdentificacionRecursoPagina(int origen) {
        this.track("setIdentificacionRecursoPagina", "origen=" + origen);
        RowKey rowKey = null;
        switch (origen) {
            case 1:  /* OJO con la constante: usa la fila escogida */
                rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                break;
            default: /* usa la fila actual */
                rowKey = this.getCurrentRowKey();
                break;
        }
        return this.setIdentificacionRecursoPagina(rowKey);
    }

    protected boolean setIdentificacionRecursoPagina(RowKey rowKey) {
        Long valor = null;
        if (rowKey != null) {
            try {
                if (this.getPaginaActualizacion().getRecursoDataProvider().isRowAvailable(rowKey)) {
                    this.getPaginaActualizacion().getRecursoDataProvider().setCursorRow(rowKey);
                    if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
                        valor = this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
                    }
                } else {
                    rowKey = null;
                }
            } catch (Exception ex) {
                rowKey = null;
                valor = null;
                this.handle(ex);
            }
        }
        this.getPaginaActualizacion().getRecursoDataProvider().setFilaEscogida(rowKey);
        this.getPaginaActualizacion().getContextoPeticion().setIdentificacionRecurso(valor);
        return rowKey != null;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para establecer la posicion del cursor">
    protected boolean cursorSet(int posicion) {
        return this.cursorSet(posicion, false);
    }

    protected boolean cursorSet(int posicion, boolean circular) {
        this.track("cursorSet", "posicion=" + posicion, "circular=" + circular);
        boolean ok = false;
        boolean reposicion = false;
        try {
            switch (posicion) {
                case 1:
                    ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorFirst();
                    break;
                case 2:
                    ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorPrevious();
                    if (!ok && circular) {
                        ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorLast();
                    }
                    break;
                case 3:
                    ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorNext();
                    if (!ok && circular) {
                        ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorFirst();
                    }
                    break;
                case 4:
                    ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorLast();
                    break;
                default:
                    ok = this.reposicionar();
                    reposicion = ok;
                    if (!ok) {
                        ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorNext();
                    }
                    if (!ok) {
                        ok = this.getPaginaActualizacion().getRecursoDataProvider().cursorFirst();
                    }
                    break;
            }
            if (ok && !reposicion) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getCursorRow();
                this.getPaginaActualizacion().getRecursoDataProvider().setFilaEscogida(rowKey);
            }
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            if (!reposicion) {
                this.setNuevaPosicionCursor(ok);
            }
            return ok;
        }
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el refresh de la pagina de actualizacion">
    protected boolean refresh() {
        this.track("refresh");
        if (this.isReadOnlyProcessing()) {
            return true;
        }
        boolean ok = false;
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().refresh();
            this.getPaginaActualizacion().posrefrescar();
            this.descartarFormulariosVirtuales();
            ok = this.getPaginaActualizacion().getRecursoDataProvider().isFilaEscogidaDisponible();
            // OJO: cursorSet(1) no es necesario si es PaginaConsultaConArbol ó PaginaConsultaConTabla, pero no hace daño
            ok = ok || this.cursorSet(1); /* OJO con la constante: cursorFirst */
        } catch (Exception ex) {
            this.handle(ex);
        }
        this.setNuevaPosicionCursor(ok);
        return ok;
    }

    protected boolean requery() {
        this.track("requery");
//      if (this.isReadOnlyProcessing()) {
//          return true;
//      }
        boolean ok = false;
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().restoreQuery();
            this.getPaginaActualizacion().posconsultar();
            this.descartarFormulariosVirtuales();
            ok = this.getPaginaActualizacion().getRecursoDataProvider().isFilaEscogidaDisponible();
            // OJO: cursorSet(1) no es necesario si es PaginaConsultaConArbol ó PaginaConsultaConTabla, pero no hace daño
            ok = ok || this.cursorSet(1); /* OJO con la constante: cursorFirst */
            this.setVersionComandoSelectPagina();
            this.setMaestroPagina();
        } catch (Exception ex) {
            this.handle(ex);
        }
        this.setNuevaPosicionCursor(ok);
        return ok;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de multiples funciones de accion">
    public boolean isAccionMultiFuncion() {
        if (designing) {
            return true;
        }
        if (this.isPaginaActualizacionConAccionMultiple()) {
            Option[] items = this.getPaginaActualizacionConAccionMultiple().getOpcionesListaFuncionAccion();
            return items != null && items.length > 1;
        }
        return false;
    }

    public boolean isAccionMultiFuncionHabilitada() {
        if (designing) {
            return true;
        }
        return this.isAccionMultiFuncion() && this.isFilaDisponible() && this.isLoteSinCambios();
    }

    public boolean isAccionMultiFuncionInhabilitada() {
        if (designing) {
            return true;
        }
        return !isAccionMultiFuncionHabilitada();
    }

    public Long getFuncionAccionSeleccionada() {
        if (designing) {
            return null;
        }
        return this.getPaginaActualizacion().getRecursoDataProvider().getFuncionBusinessProcess();
    }

    public void setFuncionAccionSeleccionada(Long funcionAccionSeleccionada) {
        Long funcionProcesarRecurso = this.getFuncionProcesarRecurso(funcionAccionSeleccionada);
        long funcion = funcionProcesarRecurso == null ? -1L : funcionProcesarRecurso;
        try {
            this.getPaginaActualizacion().getRecursoDataProvider().setFuncionBusinessProcess(funcion);
        } catch (ExcepcionAplicacion ex) {
            this.handle(ex);
        }
    }

    public String getEtiquetaOpcionSeleccionadaListaFuncionAccion() {
        if (designing) {
            return null;
        }
        String label = this.isAccionMultiFuncion()
                ? STP.getToken(this.getEtiquetaOpcionSeleccionada(this.getPaginaActualizacionConAccionMultiple().getListaFuncionAccion1()))
                : null; /* Bundle.getString("botonProcesar.text") */
        /**/
        return label == null
                ? this.getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()
                : label;
    }

    public String getEtiquetaSeleccioneUnaOpcionListaFuncionAccion() {
        return Bundle.getString("listaFuncionAccion.opcion1");
    }

    private Long getFuncionProcesarRecurso(Long funcion) {
        Option opcion = null;
        if (this.isAccionMultiFuncion()) {
            opcion = this.getOpcionListaDesplegable(funcion, this.getPaginaActualizacionConAccionMultiple().getListaFuncionAccion1());
        }
//      return opcion == null ? this.getPaginaActualizacion().getFuncionModificarRecurso() : funcion;
        return opcion == null ? null : funcion;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de multiples funciones de edicion">
    public boolean isEdicionMultiFuncion() {
        if (designing) {
            return true;
        }
        if (this.isPaginaActualizacionConEdicionMultiple()) {
            Option[] items = this.getPaginaActualizacionConEdicionMultiple().getOpcionesListaFuncionEdicion();
            return items != null && items.length > 1;
        }
        return false;
    }

    public boolean isEdicionMultiFuncionHabilitada() {
        if (designing) {
            return true;
        }
        return this.isEdicionMultiFuncion() && this.isFilaDisponible() && this.isLoteSinCambios();
    }

    public boolean isEdicionMultiFuncionInhabilitada() {
        if (designing) {
            return true;
        }
        return !isEdicionMultiFuncionHabilitada();
    }

    private Long funcionEdicionSeleccionada = null;

    public Long getFuncionEdicionSeleccionada() {
        if (designing) {
            return null;
        }
        if (this.getPaginaActualizacion().getRecursoDataProvider().isFuncionUpdateEjecutada()) {
            return this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate();
        }
        if (this.isEdicionMultiFuncion()) {
            return this.funcionEdicionSeleccionada;
        }
//      return this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate();
        return this.getPaginaActualizacion().getRecursoDataProvider().isFuncionUpdateAutorizada()
                ? this.getPaginaActualizacion().getRecursoDataProvider().getFuncionUpdate()
                : this.getPaginaActualizacion().getFuncionModificarRecurso();
    }

    public void setFuncionEdicionSeleccionada(Long funcionEdicionSeleccionada) {
        Long funcion = this.getFuncionEditarRecurso(funcionEdicionSeleccionada);
        if (funcion != null) {
            this.funcionEdicionSeleccionada = funcion;
            this.editar(funcion);
        }
    }

    public String getEtiquetaOpcionSeleccionadaListaFuncionEdicion() {
        if (designing) {
            return null;
        }
        String label = this.isEdicionMultiFuncion()
                ? STP.getToken(this.getEtiquetaOpcionSeleccionada(this.getPaginaActualizacionConEdicionMultiple().getListaFuncionEdicion1()))
                : Bundle.getString("botonEditar.text");
        /**/
        return label == null
                ? this.getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion()
                : label;
    }

    public String getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion() {
        return Bundle.getString("listaFuncionEdicion.opcion1");
    }

    private Long getFuncionEditarRecurso(Long funcion) {
        Option opcion = null;
        if (this.isEdicionMultiFuncion()) {
            opcion = this.getOpcionListaDesplegable(funcion, this.getPaginaActualizacionConEdicionMultiple().getListaFuncionEdicion1());
        }
//      return opcion == null ? this.getPaginaActualizacion().getFuncionModificarRecurso() : funcion;
        return opcion == null ? null : funcion;
    }
    // </editor-fold>
}
