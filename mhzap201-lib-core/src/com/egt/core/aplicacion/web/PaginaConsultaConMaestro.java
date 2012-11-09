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

public interface PaginaConsultaConMaestro extends PaginaConsulta {

    /**
     * Getter para propiedad recursoMaestroDataProvider.
     * @return Valor de la propiedad recursoMaestroDataProvider.
     */
    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider();

    /**
     * Getter para propiedad columnaReferenciaMaestro.
     * @return Valor de la propiedad columnaReferenciaMaestro.
     */
    public String getColumnaIdentificacionRecursoMaestro();

    /**
     * Getter para propiedad etiquetaClaseMaestro.
     * @return Valor de la propiedad etiquetaClaseMaestro.
     */
    public String getEtiquetaClaseMaestro();
}
