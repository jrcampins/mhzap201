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

public enum EnumMotivoNoAtencion implements ListOption {

    NO_FUE_GRAVE_NO_HACIA_FALTA(1, "motivo_no_atencion_no_fue_grave_no_hacia_falta"),
    ESTA_LEJOS_DE_SU_CASA(2, "motivo_no_atencion_esta_lejos_de_su_casa"),
    MALA_ATENCION(3, "motivo_no_atencion_mala_atencion"),
    NO_HAY_MEDICOS_O_PREFESIONALES(4, "motivo_no_atencion_no_hay_medicos_o_prefesionales"),
    NO_HAY_TRANSPORTE(5, "motivo_no_atencion_no_hay_transporte"),
    ES_CARO(6, "motivo_no_atencion_es_caro"),
    NO_TUVO_TIEMPO(7, "motivo_no_atencion_no_tuvo_tiempo"),
    NO_CONFIA_EN_LOS_MEDICOS(8, "motivo_no_atencion_no_confia_en_los_medicos"),
    OTROS(9, "motivo_no_atencion_otros");

    public static EnumMotivoNoAtencion valueOf(int i) {
        switch (i) {
            case 1:
                return NO_FUE_GRAVE_NO_HACIA_FALTA;
            case 2:
                return ESTA_LEJOS_DE_SU_CASA;
            case 3:
                return MALA_ATENCION;
            case 4:
                return NO_HAY_MEDICOS_O_PREFESIONALES;
            case 5:
                return NO_HAY_TRANSPORTE;
            case 6:
                return ES_CARO;
            case 7:
                return NO_TUVO_TIEMPO;
            case 8:
                return NO_CONFIA_EN_LOS_MEDICOS;
            case 9:
                return OTROS;
            default:
                return null;
        }
    }

    public static EnumMotivoNoAtencion valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumMotivoNoAtencion valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumMotivoNoAtencion(int value, String label) {
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
