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

import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoJerarquizableDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.egt.core.jsf.JSF;
import com.egt.core.util.Bundle;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.component.Tree;
import com.sun.webui.jsf.component.TreeNode;
import java.util.ArrayList;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import org.apache.commons.lang.StringUtils;

public class GestorPaginaActualizacionConArbol extends GestorPaginaActualizacion {

    public GestorPaginaActualizacionConArbol() {
        super();
    }

    public GestorPaginaActualizacionConArbol(PaginaAbstracta paginaAbstracta) {
        super(paginaAbstracta);
    }

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar de la pagina de actualizacion con arbol">
    /**
     * Getter para propiedad paginaConsultaConArbol.
     * @return Valor de la propiedad paginaConsultaConArbol.
     */
    protected PaginaConsultaConArbol getPaginaConsultaConArbol() {
        return this.getPaginaAbstracta() instanceof PaginaConsultaConArbol
                ? (PaginaConsultaConArbol) this.getPaginaAbstracta()
                : null;
    }

    protected RecursoJerarquizableDataProvider getRecursoJerarquizableDataProvider() {
        return this.getPaginaConsultaConArbol().getRecursoDataProvider().getRecursoJerarquizableDataProvider();
    }

    public ArrayList getOpcionesZumNodo() {
        return JSF.getListaOpciones(EnumOpcionZumNodo.values(), false, false);
    }

    MethodExpression expresionAccionZum = null;

    protected MethodExpression getExpresionAccionEscogerNodo() {
        if (expresionAccionZum == null) {
            ExpressionFactory factory = FacesContext.getCurrentInstance().getApplication().getExpressionFactory();
            ELContext context = FacesContext.getCurrentInstance().getELContext();
            String expression = "#{" + this.getPaginaAbstracta().getClass().getSimpleName() + ".accionEscogerNodo}";
            expresionAccionZum = factory.createMethodExpression(context, expression, String.class, new Class[]{});
            this.track("getExpresionAccionEscogerNodo", expression);
        }
        return expresionAccionZum;
    }

    public String getEstiloArbol() {
        if (designing) {
            return "border-width: 1px; border-style: dotted; height: 24px; width: 100%";
        }
        return null;
    }
    // </editor-fold>

    public boolean isFuncionZoomHabilitada() {
        if (designing) {
            return true;
        }
        return this.isLoteSinCambios() || !this.isConsultaInsert();
    }

    public boolean isFuncionZoomInhabilitada() {
        return !this.isFuncionZoomHabilitada();
    }

    @Override
    protected void retrucarAgregar() {
        super.retrucar(); /* OJO: retrucar en lugar de retrucarAgregar */
        if (this.isConsultaInsert()) {
            this.prune();
        } else if (this.isRetorno() || !this.isPeticionProcesada() || this.isNuevaPosicionCursor()) {
            this.populate();
        }
    }

    @Override
    protected void retrucar() {
        super.retrucar();
        if (this.isRetorno() || !this.isPeticionProcesada() || this.isNuevaPosicionCursor()) {
            this.populate();
        }
    }

    @Override
    protected void consultar() {
        this.track("consultar");
        if (this.isRetorno() && !this.isPeticionProcesada() && !this.isConsultaInsert()) {
            this.populate();
        } else {
            super.consultar();
//          if (this.isRetruque()) {
//              this.paginate();
//          } else {
            this.populate();
//          }
        }
    }

    protected boolean prune() {
        this.track("prune");
        this.getPaginaConsultaConArbol().getTree1().getChildren().clear();
        TLC.getBitacora().info(Bundle.getString("filtro_solo_nodos_agregados"));
        return true;
    }

    protected boolean paginate() {
        this.track("paginate");
        return true;
    }

    protected boolean populate() {
        this.track("populate");
        Long id = this.getPaginaActualizacion().getContextoPeticion().getIdentificacionRecurso();
        if (id != null) {
            this.posicionar(id);
        }
        return this.zumNodo(this.getPaginaConsultaConArbol().getRecursoDataProvider().getOpcionZumNodo());
    }

    @Override
    public boolean refrescar() {
        this.setConsultaPendiente(true);
        this.getPaginaConsultaConArbol().getRecursoDataProvider().setOpcionZumNodo(null);
        return true;
    }

//  protected boolean seleccionarNodo(Long id) {
//      return JSF.setNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1(), id) != null;
//  }
//
    protected boolean seleccionarNodoFilaEscogida() {
        this.track("seleccionarNodoFilaEscogida");
        if (this.getPaginaActualizacion().getRecursoDataProvider().isRecursoIdentificable()) {
            if (this.getPaginaActualizacion().getRecursoDataProvider().isFilaEscogidaDisponible()) {
                RowKey rowKey = this.getPaginaActualizacion().getRecursoDataProvider().getFilaEscogida();
                return JSF.setNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1(),
                        this.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey)) != null;
            }
        }
        return false;
    }

    public boolean rearborizar() {
        return this.rearborizar(null, false);
    }

    protected boolean rearborizar(Long id, boolean base) {
        Object columna = this.getPaginaConsultaConArbol().getColumnaEtiqueta();
        if (columna == null) {
            return this.rearborizar(null, EnumColumnaEtiqueta.AMBAS_COLUMNAS, id, base);
        } else if (columna instanceof String) {
            return this.rearborizar((String) columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, id, base);
        } else if (columna instanceof EnumColumnaEtiqueta) {
            return this.rearborizar(null, (EnumColumnaEtiqueta) columna, id, base);
        } else {
            return this.rearborizar(null, EnumColumnaEtiqueta.AMBAS_COLUMNAS, id, base);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="rearborizar (comentado)">
//  protected boolean rearborizar(String columna) {
//      return this.rearborizar(columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, null, false);
//  }
//
//  protected boolean rearborizar(String columna, Long id) {
//      return this.rearborizar(columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, id, false);
//  }
//
//  protected boolean rearborizar(String columna, Long id, boolean base) {
//      return this.rearborizar(columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, id, base);
//  }
//
//  protected boolean rearborizar(EnumColumnaEtiqueta columna) {
//      return this.rearborizar(null, columna, null, false);
//  }
//
//  protected boolean rearborizar(EnumColumnaEtiqueta columna, Long id) {
//      return this.rearborizar(null, columna, id, false);
//  }
//
//  protected boolean rearborizar(EnumColumnaEtiqueta columna, Long id, boolean base) {
//      return this.rearborizar(null, columna, id, base);
//  }
    // </editor-fold>
/**/
    protected boolean rearborizar(String colname, EnumColumnaEtiqueta coltype, Long id, boolean base) {
        this.track("rearborizar", "colname=" + colname, "coltype=" + coltype, "id=" + id, "base=" + base);
        if (this.isConsultaInsert()) {
            return false;
        }
        RecursoCachedRowSetDataProvider dp = this.getPaginaConsultaConArbol().getRecursoDataProvider();
        Tree tree1 = this.getPaginaConsultaConArbol().getTree1();
        Tree tree2 = JSF.getArbolNodos(dp, colname, coltype, null, this.getExpresionAccionEscogerNodo(), id, base);
        tree1.setText(tree2.getText());
        tree1.getChildren().clear();
//      tree1.getChildren().addAll(tree2.getChildren()); /* *** NO FUNCIONA *** */
        JSF.addNodosArbol(tree2, tree1);
        return true;
    }

    @Override
    public boolean reposicionar() {
        this.track("reposicionar");
        if (this.isRetruque() && (this.isRetorno() || !this.isPeticionProcesada() || this.isNuevaPosicionCursor())) {
            return this.posicionar(this.getPaginaConsultaConArbol().getRecursoDataProvider().getFilaEscogida());
        }
        return this.escoger();
    }

    public boolean escoger() { /* posiciona el cursor utilizando el nodo seleccionado del arbol */
        this.track("escoger");
//      TreeNode nodo = JSF.getNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1(), this.getPaginaConsultaConArbol().getForm1());
        TreeNode nodo = JSF.getNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1());
        if (nodo == null) {
            return this.posicionar(this.getPaginaConsultaConArbol().getRecursoDataProvider().getFilaEscogida());
        } else {
            return this.posicionar(Long.valueOf(nodo.getId().substring(1)));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="setPropiedadesPresentacionPagina (comentado) ">
//  protected void setPropiedadesPresentacionPagina() {
//      super.setPropiedadesPresentacionPagina();
//      TreeNode nodo = JSF.getNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1(), this.getPaginaConsultaConArbol().getForm1());
//      if (nodo != null) {
//          String texto = nodo.getText();
//          if (texto != null) {
//              TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, "\"" + texto + "\"");
//              TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, nodo.getId());
//          }
//      }
//      String nodeClientId = this.getPaginaConsultaConArbol().getTree1().getSelected();
//      TLC.getBitacora().info(CBM2.CHECK_CHANGES_1, nodeClientId);
//  }
    // </editor-fold>
/**/
    @Override
    protected String getToolTipHipervinculoMigasPan() {
        return this.getTituloConsulta();
    }

    public boolean isTablaDisponible() {
        if (designing) {
            return true;
        }
        String v = this.getPaginaConsultaConArbol() == null ? null : this.getPaginaConsultaConArbol().getVinculoPaginaConsultaConTabla();
        return StringUtils.isNotBlank(v);
    }

    public boolean isDetalleDisponible() {
        if (designing) {
            return true;
        }
        String v = this.getPaginaConsultaConArbol() == null ? null : this.getPaginaConsultaConArbol().getVinculoPaginaConsultaDetalle();
        return StringUtils.isNotBlank(v);
    }

    public String accionVincularTabla() {
        // OJO con las constantes
        // validacion=3 --> valida que el lote no tenga cambios
        // origen=1 --> usa la fila escogida
        String v = this.getPaginaConsultaConArbol().getVinculoPaginaConsultaConTabla();
        return this.accionVincular(v, 3, true, 1);
    }

    public String accionVincularDetalle() {
        // OJO con las constantes
        // validacion=0 --> no valida nada
        // origen=1 --> usa la fila escogida
        String v = this.getPaginaConsultaConArbol().getVinculoPaginaConsultaDetalle();
        return this.accionVincular(v, 0, false, 1);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para ejecutar las acciones de la pagina de actualizacion con tabla">
    public boolean zumNodo() {
        return this.zumNodo(this.getPaginaConsultaConArbol().getListaOpcionZum1().getSelected());
    }

    protected boolean zumNodo(Object opcion) {
        EnumOpcionZumNodo ozn = opcion instanceof Integer
                ? EnumOpcionZumNodo.valueOf((Integer) opcion)
                : EnumOpcionZumNodo.TODO;
        /**/
        return this.zumNodo(ozn);
    }

    protected boolean zumNodo(EnumOpcionZumNodo opcion) {
        this.track("zumNodo", "opcion=" + opcion);
        if (this.isConsultaInsert()) {
            return false;
        }
        this.descartarFormulariosVirtuales();
        boolean ok = this.isReposicionPendiente() ? this.reposicionar() : true;
        if (ok && opcion != null) {
            Long id = null;
            switch (opcion) {
                case SELECCIONADO: /* zum al recurso seleccionado y sus dependientes */
                    id = this.getRecursoJerarquizableDataProvider().getIdentificacionRecurso();
                    ok = this.rearborizar(id, true);
                    break;
                case SUPERIOR: /* zum al superior del recurso seleccionado y sus dependientes */
                    id = this.getRecursoJerarquizableDataProvider().getRecursoSuperior();
                    ok = this.rearborizar(id, true);
                    break;
                default:
                    ok = this.rearborizar(null, false);
                    break;
            }
        } else {
            ok = this.rearborizar();
        }
        return ok && this.seleccionarNodoFilaEscogida();
    }

    public boolean zumTodo() {
        this.track("zumTodo");
//      this.descartarFormulariosVirtuales();
//      this.getPaginaConsultaConArbol().getListaOpcionZum1().setSelected(null);
//      boolean ok = this.rearborizar();
//      return ok && this.seleccionarNodoFilaEscogida();
        return refrescar();
    }

    @Override
    public boolean eliminar() {
        this.track("eliminar");
        boolean ok = super.eliminar();
        if (ok) {
            TreeNode nodo = JSF.getNodoSeleccionado(this.getPaginaConsultaConArbol().getTree1());
            if (nodo != null) {
                nodo.setUrl(null);
            }
        }
        return ok;
    }

    @Override
    public boolean vincular(int validacion, boolean remover) {
        return this.vincular(validacion, remover, 1); /* OJO con la constante // usa la fila escogida */
    }
    // </editor-fold>
}
