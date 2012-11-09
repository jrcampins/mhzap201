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

public enum EnumEstadoCivil implements ListOption {

    SOLTERO(1, "estado_civil_soltero"),
    CASADO(2, "estado_civil_casado"),
    VIUDO(3, "estado_civil_viudo"),
    DIVORCIADO(4, "estado_civil_divorciado");

    public static EnumEstadoCivil valueOf(int i) {
        switch (i) {
            case 1:
                return SOLTERO;
            case 2:
                return CASADO;
            case 3:
                return VIUDO;
            case 4:
                return DIVORCIADO;
            default:
                return null;
        }
    }

    public static EnumEstadoCivil valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumEstadoCivil valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumEstadoCivil(int value, String label) {
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
