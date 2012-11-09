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

import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Tree;

public interface PaginaConsultaConArbol extends PaginaConsulta {

    /**
     * Getter para propiedad tree1.
     * @return Valor de la propiedad tree1.
     */
    public Tree getTree1();

    /**
     * Getter para propiedad listaOpcionZum1.
     * @return Valor de la propiedad listaOpcionZum1.
     */
    public DropDown getListaOpcionZum1();

    /**
     * Getter para propiedad opcionZumSeleccionada.
     * @return Valor de la propiedad opcionZumSeleccionada.
     */
    public Integer getOpcionZumSeleccionada();

    /**
     * Setter para propiedad opcionZumSeleccionada.
     * @param opcionZumSeleccionada Nuevo valor de la propiedad opcionZumSeleccionada.
     */
    public void setOpcionZumSeleccionada(Integer opcionZumSeleccionada);

    /**
     * Getter para propiedad columnaEtiqueta.
     * @return Valor de la propiedad columnaEtiqueta.
     */
    public Object getColumnaEtiqueta();

    /**
     * Getter para propiedad vinculoPaginaConsultaConTabla.
     * @return Valor de la propiedad vinculoPaginaConsultaConTabla.
     */
    public String getVinculoPaginaConsultaConTabla();

    /**
     * Getter para propiedad vinculoPaginaConsultaDetalle.
     * @return Valor de la propiedad vinculoPaginaConsultaDetalle.
     */
    public String getVinculoPaginaConsultaDetalle();

    /**
     * Ejecuta la acción EscogerNodo.
     * @return Vínculo (navigation-case-from-outcome) de  la acción EscogerNodo.
     */
    public String accionEscogerNodo();
}
