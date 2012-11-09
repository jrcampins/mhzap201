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

public enum EnumTipoObjElePen implements ListOption {

    PERSONA_CON_EMPLEO(21, "tipo_obj_ele_pen_persona_con_empleo"),
    PERSONA_CON_JUBILACION(22, "tipo_obj_ele_pen_persona_con_jubilacion"),
    PERSONA_CON_DEUDA(23, "tipo_obj_ele_pen_persona_con_deuda"),
    PERSONA_CON_PENA_JUDICIAL(24, "tipo_obj_ele_pen_persona_con_pena_judicial"),
    PERSONA_CON_OTRA_PENSION(25, "tipo_obj_ele_pen_persona_con_otra_pension"),
    OTRA_CAUSA(99, "tipo_obj_ele_pen_otra_causa");

    public static EnumTipoObjElePen valueOf(int i) {
        switch (i) {
            case 21:
                return PERSONA_CON_EMPLEO;
            case 22:
                return PERSONA_CON_JUBILACION;
            case 23:
                return PERSONA_CON_DEUDA;
            case 24:
                return PERSONA_CON_PENA_JUDICIAL;
            case 25:
                return PERSONA_CON_OTRA_PENSION;
            case 99:
                return OTRA_CAUSA;
            default:
                return null;
        }
    }

    public static EnumTipoObjElePen valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoObjElePen valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoObjElePen(int value, String label) {
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
