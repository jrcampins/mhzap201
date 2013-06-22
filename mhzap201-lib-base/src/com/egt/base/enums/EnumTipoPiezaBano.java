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

public enum EnumTipoPiezaBano implements ListOption {

    CON_TERMO_CALEFON(1, "tipo_pieza_bano_con_termo_calefon"),
    CON_DUCHA_ELECTRICA(2, "tipo_pieza_bano_con_ducha_electrica"),
    CON_DUCHA_COMUN(3, "tipo_pieza_bano_con_ducha_comun"),
    PIEZA_SIN_DUCHA(4, "tipo_pieza_bano_pieza_sin_ducha"),
    NO_TIENE_PIEZA_PARA_BANARSE(6, "tipo_pieza_bano_no_tiene_pieza_para_banarse"),
    NO_REPORTA(9, "tipo_pieza_bano_no_reporta");

    public static EnumTipoPiezaBano valueOf(int i) {
        switch (i) {
            case 1:
                return CON_TERMO_CALEFON;
            case 2:
                return CON_DUCHA_ELECTRICA;
            case 3:
                return CON_DUCHA_COMUN;
            case 4:
                return PIEZA_SIN_DUCHA;
            case 6:
                return NO_TIENE_PIEZA_PARA_BANARSE;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoPiezaBano valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoPiezaBano valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoPiezaBano(int value, String label) {
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
