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

public interface RecursoDescriptibleDataProvider {

    /**
     * Getter para propiedad descripcionRecurso.
     * @return Valor de la propiedad descripcionRecurso.
     */
    public String getDescripcionRecurso();

    /**
     * Getter para propiedad descripcionRecurso.
     * @return Valor de la propiedad descripcionRecurso.
     */
    public String getDescripcionRecurso(RowKey rowKey);

    /**
     * Setter para propiedad descripcionRecurso.
     * @param descripcionRecurso Nuevo valor de la propiedad descripcionRecurso.
     */
    public void setDescripcionRecurso(String descripcionRecurso);

    /**
     * Setter para propiedad descripcionRecurso.
     * @param descripcionRecurso Nuevo valor de la propiedad descripcionRecurso.
     */
    public void setDescripcionRecurso(RowKey rowKey, String descripcionRecurso);

    /**
     * Getter para propiedad columnaDescripcionRecurso.
     * @return Valor de la propiedad columnaDescripcionRecurso.
     */
    public String getColumnaDescripcionRecurso();

    /**
     * Getter para propiedad etiquetaDescripcionRecurso.
     * @return Valor de la propiedad etiquetaDescripcionRecurso.
     */
    public String getEtiquetaDescripcionRecurso();
}
