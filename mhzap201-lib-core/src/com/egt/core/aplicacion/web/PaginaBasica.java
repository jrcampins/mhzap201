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

import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Form;

public interface PaginaBasica extends PaginaAbstracta {

    /**
     * Getter para propiedad form1.
     * @return Valor de la propiedad form1.
     */
    public Form getForm1();

    /**
     * Getter para propiedad breadcrumbs1.
     * @return Valor de la propiedad breadcrumbs1.
     */
    public Breadcrumbs getBreadcrumbs1();

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    public ContextoPeticionEstandar getContextoPeticion();

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    public ContextoSesionEstandar getContextoSesion();

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    public ContextoAplicacionEstandar getContextoAplicacion();

    /**
     * Getter para propiedad etiquetaMigasPan.
     * @return Valor de la propiedad etiquetaMigasPan.
     */
    public String getEtiquetaMigasPan();
}
