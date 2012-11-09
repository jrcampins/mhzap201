/*
 * Copyright (C) 2010, EGT Consultores, C.A.
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

public enum EnumEstadoSalud implements ListOption {

    SOLO_ENFERMO_Y_O_ACCIDENTADO(1, "estado_salud_solo_enfermo_y_o_accidentado"),
    ENFERMO_CRONICO(2, "estado_salud_enfermo_cronico"),
    ENFERMO_ACCIDENTADO_Y_CRONICO(3, "estado_salud_enfermo_accidentado_y_cronico"),
    SANO(6, "estado_salud_sano");

    public static EnumEstadoSalud valueOf(int i) {
        switch (i) {
            case 1:
                return SOLO_ENFERMO_Y_O_ACCIDENTADO;
            case 2:
                return ENFERMO_CRONICO;
            case 3:
                return ENFERMO_ACCIDENTADO_Y_CRONICO;
            case 6:
                return SANO;
            default:
                return null;
        }
    }

    public static EnumEstadoSalud valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumEstadoSalud valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumEstadoSalud(int value, String label) {
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
