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

public enum EnumCausaDenRecoPen implements ListOption {

    PERSONA_SIN_CVR_VIGENTE(11, "causa_den_reco_pen_persona_sin_cvr_vigente"),
    PERSONA_FALLECIDA(12, "causa_den_reco_pen_persona_fallecida"),
    PERSONA_NO_ES_NATURAL(13, "causa_den_reco_pen_persona_no_es_natural"),
    PERSONA_NO_ES_MAYOR_DE_65_ANOS(14, "causa_den_reco_pen_persona_no_es_mayor_de_65_anos"),
    PERSONA_CON_EMPLEO(21, "causa_den_reco_pen_persona_con_empleo"),
    PERSONA_CON_JUBILACION(22, "causa_den_reco_pen_persona_con_jubilacion"),
    PERSONA_CON_DEUDA(23, "causa_den_reco_pen_persona_con_deuda"),
    PERSONA_CON_PENA_JUDICIAL(24, "causa_den_reco_pen_persona_con_pena_judicial"),
    PERSONA_CON_OTRA_PENSION(25, "causa_den_reco_pen_persona_con_otra_pension"),
    PERSONA_CON_SUBSIDIO(26, "causa_den_reco_pen_persona_con_subsidio"),
    PERSONA_SIN_FICHA_HOGAR(31, "causa_den_reco_pen_persona_sin_ficha_hogar"),
    PERSONA_CON_ICV_MAYOR_QUE_65(32, "causa_den_reco_pen_persona_con_icv_mayor_que_65"),
    OTRA_CAUSA(99, "causa_den_reco_pen_otra_causa");

    public static EnumCausaDenRecoPen valueOf(int i) {
        switch (i) {
            case 11:
                return PERSONA_SIN_CVR_VIGENTE;
            case 12:
                return PERSONA_FALLECIDA;
            case 13:
                return PERSONA_NO_ES_NATURAL;
            case 14:
                return PERSONA_NO_ES_MAYOR_DE_65_ANOS;
            case 21:
                return PERSONA_CON_EMPLEO;
            case 22:
                return PERSONA_CON_JUBILACION;
            case 23:
                return PERSONA_CON_DEUDA;
            case 24:
                return PERSONA_CON_PENA_JUDICIAL;
            case 25:
                return PERSONA_CON_OTRA_PENSION;
            case 26:
                return PERSONA_CON_SUBSIDIO;
            case 31:
                return PERSONA_SIN_FICHA_HOGAR;
            case 32:
                return PERSONA_CON_ICV_MAYOR_QUE_65;
            case 99:
                return OTRA_CAUSA;
            default:
                return null;
        }
    }

    public static EnumCausaDenRecoPen valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumCausaDenRecoPen valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumCausaDenRecoPen(int value, String label) {
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
