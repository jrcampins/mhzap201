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

public interface RecursoLocalizableDataProvider {

    /**
     * Getter para propiedad url.
     * @return Valor de la propiedad url.
     */
    public String getUrl();

    /**
     * Getter para propiedad url.
     * @return Valor de la propiedad url.
     */
    public String getUrl(RowKey rowKey);
}
