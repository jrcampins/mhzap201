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

public interface ContextoAplicacionBasico extends ContextoAbstracto {

    /**
     * Getter para propiedad contextoAplicacion.
     * @return Valor de la propiedad contextoAplicacion.
     */
    public ContextoAplicacion getContextoAplicacion();

    /**
     * Getter para propiedad codigoAplicacion.
     * @return Valor de la propiedad codigoAplicacion.
     */
    public String getCodigoAplicacion();

    /**
     * Getter para propiedad nombreAplicacion.
     * @return Valor de la propiedad nombreAplicacion.
     */
    public String getNombreAplicacion();
}
