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

public enum EnumTipoServicioAgua implements ListOption {

    ESSAP_SENASA(1, "tipo_servicio_agua_essap_senasa"),
    RED_PRIVADA(2, "tipo_servicio_agua_red_privada"),
    POZO_CON_BOMBA(3, "tipo_servicio_agua_pozo_con_bomba"),
    POZO_SIN_BOMBA(4, "tipo_servicio_agua_pozo_sin_bomba"),
    AGUADERO_SIN_CANERIA(5, "tipo_servicio_agua_aguadero_sin_caneria"),
    YOUA_MANANTIAL(6, "tipo_servicio_agua_youa_manantial"),
    ARROYO_RIO(7, "tipo_servicio_agua_arroyo_rio"),
    NO_REPORTA(9, "tipo_servicio_agua_no_reporta");

    public static EnumTipoServicioAgua valueOf(int i) {
        switch (i) {
            case 1:
                return ESSAP_SENASA;
            case 2:
                return RED_PRIVADA;
            case 3:
                return POZO_CON_BOMBA;
            case 4:
                return POZO_SIN_BOMBA;
            case 5:
                return AGUADERO_SIN_CANERIA;
            case 6:
                return YOUA_MANANTIAL;
            case 7:
                return ARROYO_RIO;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoServicioAgua valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoServicioAgua valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoServicioAgua(int value, String label) {
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
