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

public enum EnumTipoMatTecho implements ListOption {

    PAJA_MADERA_TACUARA_OTROS(1, "tipo_mat_techo_paja_madera_tacuara_otros"),
    TEJA_LOSA(2, "tipo_mat_techo_teja_losa"),
    ETHERNIT(3, "tipo_mat_techo_ethernit"),
    ZINC(4, "tipo_mat_techo_zinc");

    public static EnumTipoMatTecho valueOf(int i) {
        switch (i) {
            case 1:
                return PAJA_MADERA_TACUARA_OTROS;
            case 2:
                return TEJA_LOSA;
            case 3:
                return ETHERNIT;
            case 4:
                return ZINC;
            default:
                return null;
        }
    }

    public static EnumTipoMatTecho valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoMatTecho valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoMatTecho(int value, String label) {
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
