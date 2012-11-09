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

public enum EnumCondicionCenso implements ListOption {

    POR_CENSAR(1, "condicion_censo_por_censar"),
    POR_VALIDAR(2, "condicion_censo_por_validar"),
    VALIDADO(3, "condicion_censo_validado"),
    INVALIDADO(4, "condicion_censo_invalidado"),
    CENSADO(5, "condicion_censo_censado");

    public static EnumCondicionCenso valueOf(int i) {
        switch (i) {
            case 1:
                return POR_CENSAR;
            case 2:
                return POR_VALIDAR;
            case 3:
                return VALIDADO;
            case 4:
                return INVALIDADO;
            case 5:
                return CENSADO;
            default:
                return null;
        }
    }

    public static EnumCondicionCenso valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCondicionCenso valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCondicionCenso(int value, String label) {
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
