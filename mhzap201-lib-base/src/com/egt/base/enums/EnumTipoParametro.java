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

public enum EnumTipoParametro implements ListOption {

    OBLIGATORIO(1, "tipo_parametro_obligatorio"),
    OMITIDO(2, "tipo_parametro_omitido"),
    OPCIONAL(3, "tipo_parametro_opcional"),
    PROGRAMATICO(4, "tipo_parametro_programatico");

    public static EnumTipoParametro valueOf(int i) {
        switch (i) {
            case 1:
                return OBLIGATORIO;
            case 2:
                return OMITIDO;
            case 3:
                return OPCIONAL;
            case 4:
                return PROGRAMATICO;
            default:
                return null;
        }
    }

    public static EnumTipoParametro valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoParametro valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoParametro(int value, String label) {
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
