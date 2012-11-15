/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.util;

public class ApplicationInitializationException extends RuntimeException {

    public ApplicationInitializationException() {
        super();
    }

    public ApplicationInitializationException(String message) {
        super(message);
    }

    public ApplicationInitializationException(Throwable cause) {
        super(cause);
    }

    public ApplicationInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

}
