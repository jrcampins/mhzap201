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

public enum EnumTipoCombustible implements ListOption {

    LENA(1, "tipo_combustible_lena"),
    CARBON(2, "tipo_combustible_carbon"),
    GAS(3, "tipo_combustible_gas"),
    KEROSENE_ALCOHOL(4, "tipo_combustible_kerosene_alcohol"),
    ELECTRICIDAD(5, "tipo_combustible_electricidad"),
    NO_COCINA(6, "tipo_combustible_no_cocina");

    public static EnumTipoCombustible valueOf(int i) {
        switch (i) {
            case 1:
                return LENA;
            case 2:
                return CARBON;
            case 3:
                return GAS;
            case 4:
                return KEROSENE_ALCOHOL;
            case 5:
                return ELECTRICIDAD;
            case 6:
                return NO_COCINA;
            default:
                return null;
        }
    }

    public static EnumTipoCombustible valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoCombustible valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoCombustible(int value, String label) {
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
