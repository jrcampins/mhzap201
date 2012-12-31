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

public enum EnumCondicionPension implements ListOption {

    SOLICITADA(1, "condicion_pension_solicitada"),
    APROBADA(2, "condicion_pension_aprobada"),
    OBJETADA(3, "condicion_pension_objetada"),
    REVOCADA(4, "condicion_pension_revocada"),
    OTORGADA(5, "condicion_pension_otorgada"),
    DENEGADA(6, "condicion_pension_denegada");

    public static EnumCondicionPension valueOf(int i) {
        switch (i) {
            case 1:
                return SOLICITADA;
            case 2:
                return APROBADA;
            case 3:
                return OBJETADA;
            case 4:
                return REVOCADA;
            case 5:
                return OTORGADA;
            case 6:
                return DENEGADA;
            default:
                return null;
        }
    }

    public static EnumCondicionPension valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCondicionPension valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCondicionPension(int value, String label) {
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
