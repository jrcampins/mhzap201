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

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;

public interface PaginaConsulta extends PaginaBasica {

    /**
     * Getter para propiedad consultaPendiente.
     * @return Valor de la propiedad consultaPendiente.
     */
    public boolean isConsultaPendiente();

    /**
     * Setter para propiedad consultaPendiente.
     * @param consultaPendiente Nuevo valor de la propiedad consultaPendiente.
     */
    public void setConsultaPendiente(boolean consultaPendiente);

    /**
     * Getter para propiedad etiquetaClaseDetalle.
     * @return Valor de la propiedad etiquetaClaseDetalle.
     */
    public String getEtiquetaClaseDetalle();

    /**
     * Getter para propiedad recursoDataProvider.
     * @return Valor de la propiedad recursoDataProvider.
     */
    public RecursoCachedRowSetDataProvider getRecursoDataProvider();

    /**
     * Getter para propiedad funcionConsultarRecurso.
     * @return Valor de la propiedad funcionConsultarRecurso.
     */
    public long getFuncionConsultarRecurso();

    public void consultar();

    public void posconsultar();

    public void posrefrescar();
}
