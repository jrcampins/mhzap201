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

public enum EnumTipoAbaAgua implements ListOption {

    DENTRO_DE_LA_VIVIENDA(1, "tipo_aba_agua_dentro_de_la_vivienda"),
    DENTRO_DE_LA_PROPIEDAD(2, "tipo_aba_agua_dentro_de_la_propiedad"),
    FUERA_DE_LA_PROPIEDAD(3, "tipo_aba_agua_fuera_de_la_propiedad");

    public static EnumTipoAbaAgua valueOf(int i) {
        switch (i) {
            case 1:
                return DENTRO_DE_LA_VIVIENDA;
            case 2:
                return DENTRO_DE_LA_PROPIEDAD;
            case 3:
                return FUERA_DE_LA_PROPIEDAD;
            default:
                return null;
        }
    }

    public static EnumTipoAbaAgua valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoAbaAgua valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoAbaAgua(int value, String label) {
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
