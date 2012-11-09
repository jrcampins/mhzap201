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

public enum EnumCondicionReclCen implements ListOption {

    REGISTRADO(1, "condicion_recl_cen_registrado"),
    APROBADO(2, "condicion_recl_cen_aprobado"),
    DENEGADO(3, "condicion_recl_cen_denegado");

    public static EnumCondicionReclCen valueOf(int i) {
        switch (i) {
            case 1:
                return REGISTRADO;
            case 2:
                return APROBADO;
            case 3:
                return DENEGADO;
            default:
                return null;
        }
    }

    public static EnumCondicionReclCen valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCondicionReclCen valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCondicionReclCen(int value, String label) {
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
