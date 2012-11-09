/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.jsf.component;

import com.sun.webui.jsf.component.TableRowGroup;

public class GrupoFilasTabla extends TableRowGroup {

    public static final int FILAS_POR_PAGINA = 10;

    public GrupoFilasTabla() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public int getRows() {
        int _rows = super.getRows();
        return _rows == 0 ? FILAS_POR_PAGINA : _rows;
    }

    /** {@inheritDoc} */
    @Override
    public void setRows(int rows) {
        int _rows = super.getRows() == 0 ? FILAS_POR_PAGINA : rows;
        super.setRows(_rows);
    }
}
