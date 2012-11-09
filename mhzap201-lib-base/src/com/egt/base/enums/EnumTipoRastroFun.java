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

public enum EnumTipoRastroFun implements ListOption {

    NINGUNO(0, "tipo_rastro_fun_ninguno"),
    EXITO(1, "tipo_rastro_fun_exito"),
    ERROR(2, "tipo_rastro_fun_error"),
    AMBOS(3, "tipo_rastro_fun_ambos");

    public static EnumTipoRastroFun valueOf(int i) {
        switch (i) {
            case 0:
                return NINGUNO;
            case 1:
                return EXITO;
            case 2:
                return ERROR;
            case 3:
                return AMBOS;
            default:
                return null;
        }
    }

    public static EnumTipoRastroFun valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoRastroFun valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoRastroFun(int value, String label) {
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
