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

public interface PaginaActualizacionConAccionMultiple extends PaginaActualizacion {

    /**
     * Getter para propiedad listaFuncionAccion1.
     * @return Valor de la propiedad listaFuncionAccion1.
     */
    public DropDown getListaFuncionAccion1();

    /**
     * Getter para propiedad opcionesListaFuncionAccion.
     * @return Valor de la propiedad opcionesListaFuncionAccion.
     */
    public Option[] getOpcionesListaFuncionAccion();
}
