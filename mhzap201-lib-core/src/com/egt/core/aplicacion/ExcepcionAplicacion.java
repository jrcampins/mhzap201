/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.aplicacion;

public class ExcepcionAplicacion extends Exception {

    /* @inheritdoc */
    public ExcepcionAplicacion() {
        super();
    }

    /* @inheritdoc */
    public ExcepcionAplicacion(String mensaje) {
        super(mensaje);
    }

    /* @inheritdoc */
    public ExcepcionAplicacion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    /* @inheritdoc */
    public ExcepcionAplicacion(Throwable causa) {
        super(causa);
    }
}
