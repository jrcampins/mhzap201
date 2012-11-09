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

public enum EnumCondicionDenuPen implements ListOption {

    REGISTRADA(1, "condicion_denu_pen_registrada"),
    CONFIRMADA(2, "condicion_denu_pen_confirmada"),
    DESMENTIDA(3, "condicion_denu_pen_desmentida");

    public static EnumCondicionDenuPen valueOf(int i) {
        switch (i) {
            case 1:
                return REGISTRADA;
            case 2:
                return CONFIRMADA;
            case 3:
                return DESMENTIDA;
            default:
                return null;
        }
    }

    public static EnumCondicionDenuPen valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCondicionDenuPen valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCondicionDenuPen(int value, String label) {
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
