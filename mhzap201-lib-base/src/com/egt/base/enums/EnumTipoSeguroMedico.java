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

public enum EnumTipoSeguroMedico implements ListOption {

    IPS(1, "tipo_seguro_medico_ips"),
    PRIVADO_PERSONAL_FAMILIAR(2, "tipo_seguro_medico_privado_personal_familiar"),
    PRIVADO_LABORAL(3, "tipo_seguro_medico_privado_laboral"),
    MILITAR_POLICIAL(4, "tipo_seguro_medico_militar_policial"),
    NO_TIENE(6, "tipo_seguro_medico_no_tiene"),
    NO_REPORTA(9, "tipo_seguro_medico_no_reporta");

    public static EnumTipoSeguroMedico valueOf(int i) {
        switch (i) {
            case 1:
                return IPS;
            case 2:
                return PRIVADO_PERSONAL_FAMILIAR;
            case 3:
                return PRIVADO_LABORAL;
            case 4:
                return MILITAR_POLICIAL;
            case 6:
                return NO_TIENE;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoSeguroMedico valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoSeguroMedico valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoSeguroMedico(int value, String label) {
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
