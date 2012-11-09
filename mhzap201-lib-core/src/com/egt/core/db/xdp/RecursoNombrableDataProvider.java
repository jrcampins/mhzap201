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

public interface RecursoNombrableDataProvider {

    /**
     * Getter para propiedad nombreRecurso.
     * @return Valor de la propiedad nombreRecurso.
     */
    public String getNombreRecurso();

    /**
     * Getter para propiedad nombreRecurso.
     * @return Valor de la propiedad nombreRecurso.
     */
    public String getNombreRecurso(RowKey rowKey);

    /**
     * Setter para propiedad nombreRecurso.
     * @param nombreRecurso Nuevo valor de la propiedad nombreRecurso.
     */
    public void setNombreRecurso(String nombreRecurso);

    /**
     * Setter para propiedad nombreRecurso.
     * @param nombreRecurso Nuevo valor de la propiedad nombreRecurso.
     */
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso);

    /**
     * Getter para propiedad columnaNombreRecurso.
     * @return Valor de la propiedad columnaNombreRecurso.
     */
    public String getColumnaNombreRecurso();

    /**
     * Getter para propiedad etiquetaNombreRecurso.
     * @return Valor de la propiedad etiquetaNombreRecurso.
     */
    public String getEtiquetaNombreRecurso();
}
