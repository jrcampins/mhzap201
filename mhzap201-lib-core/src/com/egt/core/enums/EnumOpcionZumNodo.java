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

import com.egt.commons.list.ListOption;
import com.egt.commons.util.IntUtils;
import com.egt.core.util.Bundle;

public enum EnumOpcionZumNodo implements ListOption {

    TODO(1, "opcion.zum.nodo.todo"),
    SELECCIONADO(2, "opcion.zum.nodo.seleccionado"),
    SUPERIOR(3, "opcion.zum.nodo.superior");

    public static EnumOpcionZumNodo valueOf(int i) {
        switch (i) {
            case 1:
                return TODO;
            case 2:
                return SELECCIONADO;
            case 3:
                return SUPERIOR;
            default:
                return null;
        }
    }

    public static EnumOpcionZumNodo valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumOpcionZumNodo valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumOpcionZumNodo(int value, String label) {
        this.value = value;
        this.label = Bundle.getString(label);
    }

    public int intValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public Object getOptionValue() {
        return Integer.valueOf(value);
    }

    public String getOptionLabel() {
        return getLabel();
    }

    public String getOptionDescription() {
        return null;
    }

    public boolean isOptionDisabled() {
        return false;
    }
}
