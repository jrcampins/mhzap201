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

public enum EnumCondicionEjeFun implements ListOption {

    EJECUCION_PENDIENTE(11, "condicion_eje_fun_ejecucion_pendiente"),
    EJECUCION_EN_PROGRESO(12, "condicion_eje_fun_ejecucion_en_progreso"),
    EJECUTADO_SIN_ERRORES(21, "condicion_eje_fun_ejecutado_sin_errores"),
    EJECUTADO_CON_ERRORES(22, "condicion_eje_fun_ejecutado_con_errores"),
    EJECUCION_CANCELADA(23, "condicion_eje_fun_ejecucion_cancelada");

    public static EnumCondicionEjeFun valueOf(int i) {
        switch (i) {
            case 11:
                return EJECUCION_PENDIENTE;
            case 12:
                return EJECUCION_EN_PROGRESO;
            case 21:
                return EJECUTADO_SIN_ERRORES;
            case 22:
                return EJECUTADO_CON_ERRORES;
            case 23:
                return EJECUCION_CANCELADA;
            default:
                return null;
        }
    }

    public static EnumCondicionEjeFun valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCondicionEjeFun valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCondicionEjeFun(int value, String label) {
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
