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

public enum EnumTipoExcepcionCed implements ListOption {

    NO_INSCRITO_EN_EL_REGISTRO(1, "tipo_excepcion_ced_no_inscrito_en_el_registro"),
    NUNCA_OBTUVO_UNA_CEDULA(2, "tipo_excepcion_ced_nunca_obtuvo_una_cedula"),
    YA_TIENE_CONTRASENA(3, "tipo_excepcion_ced_ya_tiene_contrasena"),
    TIENE_PERO_NO_LA_RECUERDA(4, "tipo_excepcion_ced_tiene_pero_no_la_recuerda"),
    PERSONA_AUSENTE(5, "tipo_excepcion_ced_persona_ausente"),
    EXTRANJERO(6, "tipo_excepcion_ced_extranjero");

    public static EnumTipoExcepcionCed valueOf(int i) {
        switch (i) {
            case 1:
                return NO_INSCRITO_EN_EL_REGISTRO;
            case 2:
                return NUNCA_OBTUVO_UNA_CEDULA;
            case 3:
                return YA_TIENE_CONTRASENA;
            case 4:
                return TIENE_PERO_NO_LA_RECUERDA;
            case 5:
                return PERSONA_AUSENTE;
            case 6:
                return EXTRANJERO;
            default:
                return null;
        }
    }

    public static EnumTipoExcepcionCed valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoExcepcionCed valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoExcepcionCed(int value, String label) {
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
