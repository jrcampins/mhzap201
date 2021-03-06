/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.enums;

public enum EnumConjuncion {

    Y("AND"), O("OR");

    private final String value;

    EnumConjuncion(String value) {
        this.value = value;
    }

    public String palabra() {
        return " " + value + " ";
    }
}
