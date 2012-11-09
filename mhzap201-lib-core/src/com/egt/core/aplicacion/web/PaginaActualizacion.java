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

public interface PaginaActualizacion extends PaginaConsulta {

    /**
     * Getter para propiedad funcionCrearRecurso.
     * @return Valor de la propiedad funcionCrearRecurso.
     */
    public long getFuncionCrearRecurso();

    /**
     * Getter para propiedad funcionModificarRecurso.
     * @return Valor de la propiedad funcionModificarRecurso.
     */
    public long getFuncionModificarRecurso();

    /**
     * Getter para propiedad funcionEliminarRecurso.
     * @return Valor de la propiedad funcionEliminarRecurso.
     */
    public long getFuncionEliminarRecurso();

    /**
     * Getter para propiedad gestor.
     * @return Valor de la propiedad gestor.
     */
    public GestorPaginaActualizacion getGestor();
}
