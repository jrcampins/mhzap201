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

public interface RecursoCodificableDataProvider {

    /**
     * Getter para propiedad codigoRecurso.
     * @return Valor de la propiedad codigoRecurso.
     */
    public String getCodigoRecurso();

    /**
     * Getter para propiedad codigoRecurso.
     * @return Valor de la propiedad codigoRecurso.
     */
    public String getCodigoRecurso(RowKey rowKey);

    /**
     * Setter para propiedad codigoRecurso.
     * @param codigoRecurso Nuevo valor de la propiedad codigoRecurso.
     */
    public void setCodigoRecurso(String codigoRecurso);

    /**
     * Setter para propiedad codigoRecurso.
     * @param codigoRecurso Nuevo valor de la propiedad codigoRecurso.
     */
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso);

    /**
     * Getter para propiedad columnaCodigoRecurso.
     * @return Valor de la propiedad columnaCodigoRecurso.
     */
    public String getColumnaCodigoRecurso();

    /**
     * Getter para propiedad etiquetaCodigoRecurso.
     * @return Valor de la propiedad etiquetaCodigoRecurso.
     */
    public String getEtiquetaCodigoRecurso();
}
