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

public enum EnumTipoServicioSan implements ListOption {

    WC_CONECTADO_A_LA_RED_PUBLICA(1, "tipo_servicio_san_wc_conectado_a_la_red_publica"),
    WC_CON_POZO_CIEGO(2, "tipo_servicio_san_wc_con_pozo_ciego"),
    EXCUSADO_TIPO_MUNICIPAL(3, "tipo_servicio_san_excusado_tipo_municipal"),
    LETRINA_COMUN(4, "tipo_servicio_san_letrina_comun"),
    DESAGUE_EN_RIO_ARROYO_LAGUNA(5, "tipo_servicio_san_desague_en_rio_arroyo_laguna"),
    NO_TIENE(6, "tipo_servicio_san_no_tiene"),
    NO_REPORTA(9, "tipo_servicio_san_no_reporta");

    public static EnumTipoServicioSan valueOf(int i) {
        switch (i) {
            case 1:
                return WC_CONECTADO_A_LA_RED_PUBLICA;
            case 2:
                return WC_CON_POZO_CIEGO;
            case 3:
                return EXCUSADO_TIPO_MUNICIPAL;
            case 4:
                return LETRINA_COMUN;
            case 5:
                return DESAGUE_EN_RIO_ARROYO_LAGUNA;
            case 6:
                return NO_TIENE;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoServicioSan valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoServicioSan valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoServicioSan(int value, String label) {
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
