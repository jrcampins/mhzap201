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

public enum EnumCausaImpedimento implements ListOption {

    PORQUE_NACIO_ASI(1, "causa_impedimento_porque_nacio_asi"),
    POR_UNA_ENFERMEDAD(2, "causa_impedimento_por_una_enfermedad"),
    POR_UN_ACCIDENTE(3, "causa_impedimento_por_un_accidente"),
    POR_EDAD_AVANZADA(4, "causa_impedimento_por_edad_avanzada"),
    OTROS_ESPECIFICAR(5, "causa_impedimento_otros_especificar"),
    NO_REPORTA(99, "causa_impedimento_no_reporta");

    public static EnumCausaImpedimento valueOf(int i) {
        switch (i) {
            case 1:
                return PORQUE_NACIO_ASI;
            case 2:
                return POR_UNA_ENFERMEDAD;
            case 3:
                return POR_UN_ACCIDENTE;
            case 4:
                return POR_EDAD_AVANZADA;
            case 5:
                return OTROS_ESPECIFICAR;
            case 99:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumCausaImpedimento valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCausaImpedimento valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCausaImpedimento(int value, String label) {
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
