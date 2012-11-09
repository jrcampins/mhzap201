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

public interface RecursoPersonalizable {

    /**
     * Getter para propiedad propietarioRecurso.
     * @return Valor de la propiedad propietarioRecurso.
     */
    public Long getPropietarioRecurso();

    /**
     * Setter para propiedad propietarioRecurso.
     * @param propietarioRecurso Nuevo valor de la propiedad propietarioRecurso.
     */
    public void setPropietarioRecurso(Long propietarioRecurso);
}
