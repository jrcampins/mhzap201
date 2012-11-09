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

public interface RecursoVersionableDataProvider extends RecursoIdentificableDataProvider {

    /**
     * Getter para propiedad versionRecurso.
     * @return Valor de la propiedad versionRecurso.
     */
    public Long getVersionRecurso();

    /**
     * Getter para propiedad versionRecurso.
     * @return Valor de la propiedad versionRecurso.
     */
    public Long getVersionRecurso(RowKey rowKey);

    /**
     * Setter para propiedad versionRecurso.
     * @param versionRecurso Nuevo valor de la propiedad versionRecurso.
     */
    public void setVersionRecurso(Long versionRecurso);

    /**
     * Setter para propiedad versionRecurso.
     * @param versionRecurso Nuevo valor de la propiedad versionRecurso.
     */
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso);

    /**
     * Getter para propiedad columnaVersionRecurso.
     * @return Valor de la propiedad columnaVersionRecurso.
     */
    public String getColumnaVersionRecurso();

    /**
     * Getter para propiedad etiquetaVersionRecurso.
     * @return Valor de la propiedad etiquetaVersionRecurso.
     */
    public String getEtiquetaVersionRecurso();
}
