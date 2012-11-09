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
package com.egt.core.db.wrapper;

public interface RecursoNombrable {

    /**
     * Getter para propiedad nombreRecurso.
     * @return Valor de la propiedad nombreRecurso.
     */
    public String getNombreRecurso();

    /**
     * Setter para propiedad nombreRecurso.
     * @param nombreRecurso Nuevo valor de la propiedad nombreRecurso.
     */
    public void setNombreRecurso(String nombreRecurso);
}
