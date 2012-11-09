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
package com.egt.core.db.xdp;

import com.sun.data.provider.RowKey;

public interface RecursoEnumerableDataProvider {

    /**
     * Getter para propiedad numeroRecurso.
     * @return Valor de la propiedad numeroRecurso.
     */
    public Integer getNumeroRecurso();

    /**
     * Getter para propiedad numeroRecurso.
     * @return Valor de la propiedad numeroRecurso.
     */
    public Integer getNumeroRecurso(RowKey rowKey);

    /**
     * Setter para propiedad numeroRecurso.
     * @param numeroRecurso Nuevo valor de la propiedad numeroRecurso.
     */
    public void setNumeroRecurso(Integer numeroRecurso);

    /**
     * Setter para propiedad numeroRecurso.
     * @param numeroRecurso Nuevo valor de la propiedad numeroRecurso.
     */
    public void setNumeroRecurso(RowKey rowKey, Integer numeroRecurso);

    /**
     * Getter para propiedad columnaNumeroRecurso.
     * @return Valor de la propiedad columnaNumeroRecurso.
     */
    public String getColumnaNumeroRecurso();

    /**
     * Getter para propiedad etiquetaNumeroRecurso.
     * @return Valor de la propiedad etiquetaNumeroRecurso.
     */
    public String getEtiquetaNumeroRecurso();
}
