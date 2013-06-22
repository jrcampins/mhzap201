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

public enum EnumTipoRelacionLab implements ListOption {

    EMPLEADO_PUBLICO(1, "tipo_relacion_lab_empleado_publico"),
    EMPLEADO_PRIVADO(2, "tipo_relacion_lab_empleado_privado"),
    OBRERO_PUBLICO(3, "tipo_relacion_lab_obrero_publico"),
    OBRERO_PRIVADO(4, "tipo_relacion_lab_obrero_privado"),
    EMPLEADOR_O_PATRON(5, "tipo_relacion_lab_empleador_o_patron"),
    TRABAJADOR_POR_CUENTA_PROPIA(6, "tipo_relacion_lab_trabajador_por_cuenta_propia"),
    TRABAJADOR_NO_REMUNERADO(7, "tipo_relacion_lab_trabajador_no_remunerado"),
    EMPLEADO_A_DOMESTICO_A(8, "tipo_relacion_lab_empleado_a_domestico_a"),
    NO_REPORTA(9, "tipo_relacion_lab_no_reporta");

    public static EnumTipoRelacionLab valueOf(int i) {
        switch (i) {
            case 1:
                return EMPLEADO_PUBLICO;
            case 2:
                return EMPLEADO_PRIVADO;
            case 3:
                return OBRERO_PUBLICO;
            case 4:
                return OBRERO_PRIVADO;
            case 5:
                return EMPLEADOR_O_PATRON;
            case 6:
                return TRABAJADOR_POR_CUENTA_PROPIA;
            case 7:
                return TRABAJADOR_NO_REMUNERADO;
            case 8:
                return EMPLEADO_A_DOMESTICO_A;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoRelacionLab valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoRelacionLab valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoRelacionLab(int value, String label) {
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
