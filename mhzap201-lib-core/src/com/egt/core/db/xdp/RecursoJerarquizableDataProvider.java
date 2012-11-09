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

public interface RecursoJerarquizableDataProvider extends RecursoIdentificableDataProvider {

    /**
     * Getter para propiedad recursoSuperior.
     * @return Valor de la propiedad recursoSuperior.
     */
    public Long getRecursoSuperior();

    /**
     * Getter para propiedad recursoSuperior.
     * @return Valor de la propiedad recursoSuperior.
     */
    public Long getRecursoSuperior(RowKey rowKey);

    /**
     * Setter para propiedad recursoSuperior.
     * @param recursoSuperior Nuevo valor de la propiedad recursoSuperior.
     */
    public void setRecursoSuperior(Long recursoSuperior);

    /**
     * Setter para propiedad recursoSuperior.
     * @param recursoSuperior Nuevo valor de la propiedad recursoSuperior.
     */
    public void setRecursoSuperior(RowKey rowKey, Long recursoSuperior);

    /**
     * Getter para propiedad columnaRecursoSuperior.
     * @return Valor de la propiedad columnaRecursoSuperior.
     */
    public String getColumnaRecursoSuperior();

    /**
     * Getter para propiedad etiquetaRecursoSuperior.
     * @return Valor de la propiedad etiquetaRecursoSuperior.
     */
    public String getEtiquetaRecursoSuperior();
}
