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

import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;

public interface PaginaConsultaConTabla extends PaginaConsulta {

    public Table getTable1();

    public TableRowGroup getTableRowGroup1();

    public void setTableRowGroup1(TableRowGroup trg);

    public Checkbox getCheckbox1();

    public TextField getTextoFilasPorPagina1();

    /**
     * Getter para propiedad vinculoPaginaConsultaConArbol.
     * @return Valor de la propiedad vinculoPaginaConsultaConArbol.
     */
    public String getVinculoPaginaConsultaConArbol();

    /**
     * Getter para propiedad vinculoPaginaConsultaDetalle.
     * @return Valor de la propiedad vinculoPaginaConsultaDetalle.
     */
    public String getVinculoPaginaConsultaDetalle();
}
