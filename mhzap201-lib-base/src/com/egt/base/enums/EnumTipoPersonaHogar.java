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

public enum EnumTipoPersonaHogar implements ListOption {

    JEFE_DEL_HOGAR(1, "tipo_persona_hogar_jefe_del_hogar"),
    ESPOSO_A_COMPANERO_A(2, "tipo_persona_hogar_esposo_a_companero_a"),
    HIJO_A_HIJASTRO_A(3, "tipo_persona_hogar_hijo_a_hijastro_a"),
    YERNO_O_NUERA(4, "tipo_persona_hogar_yerno_o_nuera"),
    NIETO_A(5, "tipo_persona_hogar_nieto_a"),
    OTRO_PARENTESCO_CON_EL_JEFE(6, "tipo_persona_hogar_otro_parentesco_con_el_jefe"),
    SIN_PARENTESCO_CON_EL_JEFE(7, "tipo_persona_hogar_sin_parentesco_con_el_jefe"),
    EMPLEADO_A_DOMESTICO_A(8, "tipo_persona_hogar_empleado_a_domestico_a");

    public static EnumTipoPersonaHogar valueOf(int i) {
        switch (i) {
            case 1:
                return JEFE_DEL_HOGAR;
            case 2:
                return ESPOSO_A_COMPANERO_A;
            case 3:
                return HIJO_A_HIJASTRO_A;
            case 4:
                return YERNO_O_NUERA;
            case 5:
                return NIETO_A;
            case 6:
                return OTRO_PARENTESCO_CON_EL_JEFE;
            case 7:
                return SIN_PARENTESCO_CON_EL_JEFE;
            case 8:
                return EMPLEADO_A_DOMESTICO_A;
            default:
                return null;
        }
    }

    public static EnumTipoPersonaHogar valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoPersonaHogar valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoPersonaHogar(int value, String label) {
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
