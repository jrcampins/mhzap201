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

import javax.faces.context.FacesContext;

public interface PaginaAbstracta {

    public FacesContext getFacesContext();

    public Object getBean(String name);

    public boolean isPostBack();

    public void erase();

    public void info(String summary);

    public void warn(String summary);

    public void error(String summary);

    public void fatal(String summary);

    public void log(String message);

    public void log(String message, Throwable throwable);
}
