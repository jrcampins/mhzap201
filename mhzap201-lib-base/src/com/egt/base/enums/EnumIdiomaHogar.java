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

public enum EnumIdiomaHogar implements ListOption {

    SOLO_GUARANI(1, "idioma_hogar_solo_guarani"),
    GUARANI_Y_CASTELLANO(2, "idioma_hogar_guarani_y_castellano"),
    CASTELLANO(3, "idioma_hogar_castellano"),
    OTRO_IDIOMA(4, "idioma_hogar_otro_idioma"),
    NO_HABLA(5, "idioma_hogar_no_habla");

    public static EnumIdiomaHogar valueOf(int i) {
        switch (i) {
            case 1:
                return SOLO_GUARANI;
            case 2:
                return GUARANI_Y_CASTELLANO;
            case 3:
                return CASTELLANO;
            case 4:
                return OTRO_IDIOMA;
            case 5:
                return NO_HABLA;
            default:
                return null;
        }
    }

    public static EnumIdiomaHogar valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumIdiomaHogar valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumIdiomaHogar(int value, String label) {
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
