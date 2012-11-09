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

public enum EnumTipoDatoPar implements ListOption {

    ALFANUMERICO(1, "tipo_dato_par_alfanumerico"),
    NUMERICO(2, "tipo_dato_par_numerico"),
    FECHA_HORA(3, "tipo_dato_par_fecha_hora"),
    ENTERO(4, "tipo_dato_par_entero"),
    ENTERO_GRANDE(5, "tipo_dato_par_entero_grande");

    public static EnumTipoDatoPar valueOf(int i) {
        switch (i) {
            case 1:
                return ALFANUMERICO;
            case 2:
                return NUMERICO;
            case 3:
                return FECHA_HORA;
            case 4:
                return ENTERO;
            case 5:
                return ENTERO_GRANDE;
            default:
                return null;
        }
    }

    public static EnumTipoDatoPar valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoDatoPar valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoDatoPar(int value, String label) {
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
