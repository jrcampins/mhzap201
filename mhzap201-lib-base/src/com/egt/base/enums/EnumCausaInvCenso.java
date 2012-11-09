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

public enum EnumCausaInvCenso implements ListOption {

    BENEFICIARIO_DESCONOCIDO(1, "causa_inv_censo_beneficiario_desconocido"),
    BENFICIARIO_FALLECIDO(2, "causa_inv_censo_benficiario_fallecido"),
    ICV_NO_CORRESPONDE(3, "causa_inv_censo_icv_no_corresponde"),
    OTRA_CAUSA(99, "causa_inv_censo_otra_causa");

    public static EnumCausaInvCenso valueOf(int i) {
        switch (i) {
            case 1:
                return BENEFICIARIO_DESCONOCIDO;
            case 2:
                return BENFICIARIO_FALLECIDO;
            case 3:
                return ICV_NO_CORRESPONDE;
            case 99:
                return OTRA_CAUSA;
            default:
                return null;
        }
    }

    public static EnumCausaInvCenso valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCausaInvCenso valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCausaInvCenso(int value, String label) {
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
