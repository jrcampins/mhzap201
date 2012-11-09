/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.enums;

import com.egt.base.util.BundleEnums;
import com.egt.commons.list.ListOption;
import com.egt.commons.util.IntUtils;

public enum EnumTipoComparacion implements ListOption {

    IGUAL_NO_IGUAL(1, "tipo_comparacion_igual_no_igual"),
    MAYOR_MENOR_O_IGUAL(2, "tipo_comparacion_mayor_menor_o_igual"),
    MAYOR_O_IGUAL_MENOR(3, "tipo_comparacion_mayor_o_igual_menor"),
    COMIENZA_NO_COMIENZA(4, "tipo_comparacion_comienza_no_comienza");

    public static EnumTipoComparacion valueOf(int i) {
        switch (i) {
            case 1:
                return IGUAL_NO_IGUAL;
            case 2:
                return MAYOR_MENOR_O_IGUAL;
            case 3:
                return MAYOR_O_IGUAL_MENOR;
            case 4:
                return COMIENZA_NO_COMIENZA;
            default:
                return null;
        }
    }

    public static EnumTipoComparacion valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoComparacion valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoComparacion(int value, String label) {
        this.value = value;
        this.label = BundleEnums.getString(label);
    }

    public int intValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public Object getOptionValue() {
        return Integer.valueOf(value);
    }

    @Override
    public String getOptionLabel() {
        return getLabel();
    }

    @Override
    public String getOptionDescription() {
        return null;
    }

    @Override
    public boolean isOptionDisabled() {
        return false;
    }
}
