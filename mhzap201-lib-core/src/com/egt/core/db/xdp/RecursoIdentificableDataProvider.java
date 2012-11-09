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

public interface RecursoIdentificableDataProvider {

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    public Long getIdentificacionRecurso();

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    public Long getIdentificacionRecurso(RowKey rowKey);

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    public void setIdentificacionRecurso(Long identificacionRecurso);

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso);

    /**
     * Getter para propiedad columnaIdentificacionRecurso.
     * @return Valor de la propiedad columnaIdentificacionRecurso.
     */
    public String getColumnaIdentificacionRecurso();

    /**
     * Getter para propiedad etiquetaIdentificacionRecurso.
     * @return Valor de la propiedad etiquetaIdentificacionRecurso.
     */
    public String getEtiquetaIdentificacionRecurso();
}
