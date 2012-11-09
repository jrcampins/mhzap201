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

public enum EnumSeveridadMensaje implements ListOption {

    TRAZA(-1, "severidad.mensaje.traza"),
    INFORMATIVO(0, "severidad.mensaje.informativo"),
    ADVERTENCIA(1, "severidad.mensaje.advertencia"),
    ERROR(2, "severidad.mensaje.error"),
    FATAL(3, "severidad.mensaje.fatal");

    public static EnumSeveridadMensaje valueOf(int i) {
        switch (i) {
            case 0:
                return INFORMATIVO;
            case 1:
                return ADVERTENCIA;
            case 2:
                return ERROR;
            case 3:
                return FATAL;
            default:
                return TRAZA;
        }
    }

    public static EnumSeveridadMensaje valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumSeveridadMensaje valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumSeveridadMensaje(int value, String label) {
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
