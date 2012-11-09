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
import com.sun.webui.jsf.model.Option;

public interface PaginaActualizacionConEdicionMultiple extends PaginaActualizacion {

    /**
     * Getter para propiedad listaFuncionEdicion1.
     * @return Valor de la propiedad listaFuncionEdicion1.
     */
    public DropDown getListaFuncionEdicion1();

    /**
     * Getter para propiedad opcionesListaFuncionEdicion.
     * @return Valor de la propiedad opcionesListaFuncionEdicion.
     */
    public Option[] getOpcionesListaFuncionEdicion();
}
