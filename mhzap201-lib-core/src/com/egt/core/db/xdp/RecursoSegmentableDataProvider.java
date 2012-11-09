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

public interface RecursoSegmentableDataProvider {

    /**
     * Getter para propiedad segmentoRecurso.
     * @return Valor de la propiedad segmentoRecurso.
     */
    public Long getSegmentoRecurso();

    /**
     * Getter para propiedad segmentoRecurso.
     * @return Valor de la propiedad segmentoRecurso.
     */
    public Long getSegmentoRecurso(RowKey rowKey);

    /**
     * Setter para propiedad segmentoRecurso.
     * @param segmentoRecurso Nuevo valor de la propiedad segmentoRecurso.
     */
    public void setSegmentoRecurso(Long segmentoRecurso);

    /**
     * Setter para propiedad segmentoRecurso.
     * @param segmentoRecurso Nuevo valor de la propiedad segmentoRecurso.
     */
    public void setSegmentoRecurso(RowKey rowKey, Long segmentoRecurso);

    /**
     * Getter para propiedad columnaSegmentoRecurso.
     * @return Valor de la propiedad columnaSegmentoRecurso.
     */
    public String getColumnaSegmentoRecurso();

    /**
     * Getter para propiedad etiquetaSegmentoRecurso.
     * @return Valor de la propiedad etiquetaSegmentoRecurso.
     */
    public String getEtiquetaSegmentoRecurso();
}
