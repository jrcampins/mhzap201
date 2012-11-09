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
import com.egt.core.aplicacion.TLC;
import com.egt.core.jsf.component.GrupoFilasTabla;
import com.egt.core.util.Bundle;
import com.egt.core.util.JS;
import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.TableRowDataProvider;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.lang.StringUtils;

public class GestorPaginaActualizacionConTabla extends GestorPaginaActualizacion {

    public GestorPaginaActualizacionConTabla() {
        super();
    }

    public GestorPaginaActualizacionConTabla(PaginaAbstracta paginaAbstracta) {
        super(paginaAbstracta);
    }

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar de la pagina de actualizacion con tabla">
    /**
     * Getter para propiedad paginaConsultaConTabla.
     * @return Valor de la propiedad paginaConsultaConTabla.
     */
    protected PaginaConsultaConTabla getPaginaConsultaConTabla() {
        return this.getPaginaAbstracta() instanceof PaginaConsultaConTabla
                ? (PaginaConsultaConTabla) this.getPaginaAbstracta()
                : null;
    }

    @Override
    public RowKey getCurrentRowKey() {
        if (designing) {
            return null;
        }
        Object bean = this.getPaginaConsultaConTabla().getBean("currentRow");
        if (bean != null && bean instanceof TableRowDataProvider) {
            return ((TableRowDataProvider) bean).getTableRow();
        } else {
            return this.getPaginaConsultaConTabla().getRecursoDataProvider().getCursorRow();
        }
    }

    @Override
    public boolean isFuncionCheckChangesHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaConsultaConTabla().getRecursoDataProvider().isFuncionInsertEjecutada() ||
                this.getPaginaConsultaConTabla().getRecursoDataProvider().isFuncionUpdateEjecutada());
    }

    @Override
    public boolean isFuncionCancelUpdateHabilitada() {
        if (designing) {
            return true;
        }
        return (this.getPaginaConsultaConTabla().getRecursoDataProvider().isFuncionInsertEjecutada() ||
                this.getPaginaConsultaConTabla().getRecursoDataProvider().isFuncionUpdateEjecutada());
    }

    public boolean isFilaElegida() {
        if (designing) {
            return false;
        }
        return this.getPaginaConsultaConTabla().getRecursoDataProvider().esFilaElegida(this.getCurrentRowKey());
    }

    public void setFilaElegida(boolean b) {
        RowKey rowKey = this.getCurrentRowKey();
        if (this.getPaginaConsultaConTabla().getRecursoDataProvider().isRowAvailable(rowKey)) {
            boolean checked = this.getPaginaConsultaConTabla().getCheckbox1().isChecked();
            this.getPaginaConsultaConTabla().getRecursoDataProvider().eligeFila(rowKey, checked);
        }
    }

//  private RowKey synchronizeCursorRowCurrentRowKey() {
//      RowKey rowKey = this.getCurrentRowKey();
//      this.track("synchronizeCursorRowCurrentRowKey", "RowKey=" + rowKey);
//      try {
//          if (rowKey != null && this.getPaginaConsultaConTabla().getRecursoDataProvider().isRowAvailable(rowKey)) {
//              this.getPaginaConsultaConTabla().getRecursoDataProvider().setCursorRow(rowKey);
//              return rowKey;
//          }
//      } catch (Exception ex) {
//          this.handle(ex);
//      }
//      return null;
//  }
//
    /**
     * Getter para propiedad rowsPerPage.
     * @return Valor de la propiedad rowsPerPage.
     */
    public Integer getRowsPerPage() {
        return GrupoFilasTabla.FILAS_POR_PAGINA;
    }

    /**
     * Getter para propiedad filasPorPagina.
     * @return Valor de la propiedad filasPorPagina.
     */
    public Integer getFilasPorPagina() {
        if (designing) {
            return 1;
        }
        int rows = this.getPaginaConsultaConTabla().getTableRowGroup1().getRows();
        return rows > 0 ? rows : GrupoFilasTabla.FILAS_POR_PAGINA;
    }

    /**
     * Setter para propiedad filasPorPagina.
     * @param filasPorPagina Nuevo valor de la propiedad filasPorPagina.
     */
    public void setFilasPorPagina(Integer filasPorPagina) {
        if (this.getPaginaConsultaConTabla().getTableRowGroup1().isPaginated()) {
            int rows = filasPorPagina != null && filasPorPagina > 0 ? filasPorPagina : GrupoFilasTabla.FILAS_POR_PAGINA;
            this.getPaginaConsultaConTabla().getTableRowGroup1().setRows(rows);
        }
    }

    public boolean isPaginacionHabilitada() {
        if (designing) {
            return true;
        }
        return this.getPaginaConsultaConTabla().getTableRowGroup1().isPaginated();
    }

    public boolean isPaginacionInhabilitada() {
        return !this.isPaginacionHabilitada();
    }

    // </editor-fold>
/**/
    @Override
    public void preiniciar() {
        super.preiniciar();
        if (this.paginaAutorizada) {
            if (this.getPaginaConsultaConTabla().isPostBack() || this.getPaginaConsultaConTabla().getTableRowGroup1() instanceof GrupoFilasTabla) {
            } else {
                this.getPaginaConsultaConTabla().setTableRowGroup1(new GrupoFilasTabla());
            }
        }
    }

    @Override
    protected void continuar() {
        this.track("continuar");
    }

    @Override
    protected void consultar() {
        super.consultar();
        if (this.isRetruque()) {
            this.paginate();
        }
    }

    protected boolean paginate() {
        // esta funcion hace que la tabla muestre la pagina donde aparece la fila escogida.
        // STBY: HACER QUE FUNCIONE CUANDO SE EJECUTA EN EL PRERENDER
        // quiza no esta funcionando cuando se ejecuta en el prerender porque la tabla se "prepara" despues, en el render;
        // no he logrado encontrar un mecanismo que me permita "prepararla" aqui.
        this.track("paginate");
        int rows = this.getFilasPorPagina();
        this.getPaginaConsultaConTabla().getTableRowGroup1().setPaginated(true);
        this.getPaginaConsultaConTabla().getTableRowGroup1().setRows(rows);
        int first = 0;
        boolean ok = this.reposicionar();
        if (ok && this.getPaginaConsultaConTabla().getTableRowGroup1().getSortCount() == 0) {
            RowKey rowKey = this.getPaginaConsultaConTabla().getRecursoDataProvider().getCursorRow();
            first = Integer.parseInt(rowKey.getRowId());
            first = first / rows;
            first = first * rows;
        }
        this.getPaginaConsultaConTabla().getTableRowGroup1().setFirst(first);
        return ok;
    }

    @Override
    protected void appendRow(long funcion) throws ExcepcionAplicacion {
//    this.track("appendRow", "funcion=" + funcion);
        try {
            super.appendRow(funcion);
            this.getPaginaConsultaConTabla().getTableRowGroup1().clearSort();
            this.getPaginaConsultaConTabla().getTableRowGroup1().setFirst(this.getPaginaConsultaConTabla().getTableRowGroup1().getRowCount());
        } catch (Exception ex) {
            throw ex instanceof ExcepcionAplicacion ? (ExcepcionAplicacion) ex : new ExcepcionAplicacion(ex);
        }
    }

    @Override
    protected void setPropiedadesPresentacionPagina() {
        super.setPropiedadesPresentacionPagina();
        this.setPropiedadesPresentacionTabla();
    }

    protected void setPropiedadesPresentacionTabla() {
        String titulo = this.getTituloTabla();
        if (titulo != null) {
            this.getPaginaConsultaConTabla().getTable1().setTitle(titulo);
        }
        String footerText = this.getMensajeCambiosPorConfirmar();
        this.getPaginaConsultaConTabla().getTableRowGroup1().setFooterText(footerText);
    }

    protected String getTituloTabla() {
        return this.getTituloConsulta();
    }

    @Override
    protected String getToolTipHipervinculoMigasPan() {
        return this.getTituloConsulta();
    }

    @Override
    protected String getToolTipImagenFilaNoProcesada() {
        return Bundle.getString("imagenFilaNoProcesada.toolTip");
    }

    public boolean isArbolDisponible() {
        if (designing) {
            return true;
        }
        String v = this.getPaginaConsultaConTabla() == null ? null : this.getPaginaConsultaConTabla().getVinculoPaginaConsultaConArbol();
        return StringUtils.isNotBlank(v) && this.getPaginaConsultaConTabla().getRecursoDataProvider().isRecursoJerarquizable();
    }

    public boolean isDetalleDisponible() {
        if (designing) {
            return true;
        }
        String v = this.getPaginaConsultaConTabla() == null ? null : this.getPaginaConsultaConTabla().getVinculoPaginaConsultaDetalle();
        return StringUtils.isNotBlank(v);
    }

    public String accionVincularArbol() {
        // OJO con las constantes
        // validacion=3 --> valida que el lote no tenga cambios
        // origen=1 --> usa la fila escogida
        String v = this.getPaginaConsultaConTabla().getVinculoPaginaConsultaConArbol();
        return this.accionVincular(v, 3, true, 1);
    }

    public String accionVincularDetalle() {
        // OJO con las constantes
        // validacion=0 --> no valida nada
        // origen=1 --> usa la fila escogida
        String v = this.getPaginaConsultaConTabla().getVinculoPaginaConsultaDetalle();
        return this.accionVincular(v, 0, false, 1);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para ejecutar las acciones de la pagina de actualizacion con tabla">
    public boolean escoger() {
        this.track("escoger");
        this.descartarFormulariosVirtuales();
        return this.setIdentificacionRecursoPagina();
    }

    public String accionDetallar() {
        this.track("accionDetallar");
        return this.escoger() ? this.accionVincularDetalle() : null;
    }

    public boolean repaginar() {
        this.track("repaginar");
        this.descartarFormulariosVirtuales();
        return this.paginate();
    }

    @Override
    public boolean editar(long funcion) {
        this.track("editar", "funcion=" + funcion);
        if (this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas().isEmpty()) {
            return super.editar(funcion);
        }
        try {
            this.getPaginaConsultaConTabla().getRecursoDataProvider().setFuncionUpdate(funcion);
            this.getPaginaConsultaConTabla().getRecursoDataProvider().editRow(this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas());
            this.descartarFormulariosVirtuales();
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(long funcion) {
        this.track("eliminar", "funcion=" + funcion);
        if (this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas().isEmpty()) {
            return super.eliminar(funcion);
        }
        try {
            this.getPaginaConsultaConTabla().getRecursoDataProvider().setFuncionDelete(funcion);
            this.getPaginaConsultaConTabla().getRecursoDataProvider().removeRow(this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas());
            this.descartarFormulariosVirtuales();
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean deshacer() {
        this.track("deshacer");
        if (this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas().isEmpty()) {
            return super.deshacer();
        }
        try {
            this.getPaginaConsultaConTabla().getRecursoDataProvider().undoRow(this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas());
            this.descartarFormulariosVirtuales();
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean procesar(long funcion) {
        this.track("procesar", "funcion=" + funcion);
        if (this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas().isEmpty()) {
            return super.procesar(funcion);
        }
        try {
            this.getPaginaConsultaConTabla().getRecursoDataProvider().setFuncionBusinessProcess(funcion);
            this.getPaginaConsultaConTabla().getRecursoDataProvider().processRow(this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas(), funcion);
            this.refresh(); /* this.descartarFormulariosVirtuales(); */
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean procesar(RowProcessor processor) {
        this.track("procesar", processor);
        Set rowSet = this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas();
        if (rowSet.isEmpty()) {
            return super.procesar(processor);
        }
        try {
            Iterator iterator = rowSet.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, this.getPaginaConsultaConTabla().getRecursoDataProvider().getEtiquetaRecurso(rowKey));
                processor.processRow(rowKey);
            }
            TLC.getBitacora().warn(CBM2.PROCESS_EXECUTION_END, "");
            this.refresh(); /* this.descartarFormulariosVirtuales(); */
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean procesar(String metodo) {
        this.track("procesar", metodo);
        Set rowSet = this.getPaginaConsultaConTabla().getRecursoDataProvider().getFilasElegidas();
        if (rowSet.isEmpty()) {
            return super.procesar(metodo);
        }
        try {
            Object object = this.getPaginaActualizacion();
            Method method = this.getPaginaActualizacion().getClass().getMethod(metodo, new Class[]{RowKey.class});
            Iterator iterator = rowSet.iterator();
            while (iterator.hasNext()) {
                RowKey rowKey = (RowKey) iterator.next();
                TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, this.getPaginaConsultaConTabla().getRecursoDataProvider().getEtiquetaRecurso(rowKey));
                method.invoke(object, rowKey);
            }
            TLC.getBitacora().warn(CBM2.PROCESS_EXECUTION_END, metodo);
            this.refresh(); /* this.descartarFormulariosVirtuales(); */
            return true;
        } catch (Exception ex) {
            this.handle(ex);
        }
        return false;
    }

    @Override
    public boolean vincular(int validacion, boolean remover) {
        return this.vincular(validacion, remover, 1); /* OJO con la constante: usa la fila escogida */
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el script de los botones de la pagina de actualizacion con tabla">
    public String getScriptElegir() {
        return null;
    }

    public String getScriptElegirRecursoActual() {
        this.track("getScriptElegirRecursoActual");
        String valor = this.getValorRetornoRecursoActual();
        String script = JS.getOnClickRowSelectorJavaScript(valor);
        //Bitacora.trace(script);
        return script;
    }

    public String getScriptEscoger() {
        return null;
    }

    @Override
    public String getScriptEditar() {
        if (designing) {
            return null;
        }
        this.track("getScriptEditar");
//      String table = this.getPaginaConsultaConTabla().getTable1().getClientId(this.getPaginaConsultaConTabla().getFacesContext());
        String table = null;
//      String message1 = Bitacora.getTextoMensaje(CBM2.UPDATE_NONE);
        String message1 = null;
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }

    @Override
    public String getScriptDeshacer() {
        if (designing) {
            return null;
        }
        this.track("getScriptDeshacer");
//      String table = this.getPaginaConsultaConTabla().getTable1().getClientId(this.getPaginaConsultaConTabla().getFacesContext());
        String table = null;
//      String message1 = Bitacora.getTextoMensaje(CBM2.UNDO_CHANGES_NONE);
        String message1 = null;
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }

    @Override
    public String getScriptEliminar() {
        if (designing) {
            return null;
        }
        this.track("getScriptEliminar");
//      String table = this.getPaginaConsultaConTabla().getTable1().getClientId(this.getPaginaConsultaConTabla().getFacesContext());
        String table = null;
//      String message1 = Bitacora.getTextoMensaje(CBM2.DELETE_NONE);
        String message1 = null;
//      String message2 = Bitacora.getTextoMensaje(CBM2.DELETE_CONFIRM_MESSAGE);
        String message2 = null;
        String script = JS.getConfirmDialogJavaScript(table, message1, message2);
        return script;
    }    // </editor-fold>
}
