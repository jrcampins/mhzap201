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

public interface RecursoPersonalizableDataProvider {

    /**
     * Getter para propiedad propietarioRecurso.
     * @return Valor de la propiedad propietarioRecurso.
     */
    public Long getPropietarioRecurso();

    /**
     * Getter para propiedad propietarioRecurso.
     * @return Valor de la propiedad propietarioRecurso.
     */
    public Long getPropietarioRecurso(RowKey rowKey);

    /**
     * Setter para propiedad propietarioRecurso.
     * @param propietarioRecurso Nuevo valor de la propiedad propietarioRecurso.
     */
    public void setPropietarioRecurso(Long propietarioRecurso);

    /**
     * Setter para propiedad propietarioRecurso.
     * @param propietarioRecurso Nuevo valor de la propiedad propietarioRecurso.
     */
    public void setPropietarioRecurso(RowKey rowKey, Long propietarioRecurso);

    /**
     * Getter para propiedad columnaPropietarioRecurso.
     * @return Valor de la propiedad columnaPropietarioRecurso.
     */
    public String getColumnaPropietarioRecurso();

    /**
     * Getter para propiedad etiquetaPropietarioRecurso.
     * @return Valor de la propiedad etiquetaPropietarioRecurso.
     */
    public String getEtiquetaPropietarioRecurso();
}
