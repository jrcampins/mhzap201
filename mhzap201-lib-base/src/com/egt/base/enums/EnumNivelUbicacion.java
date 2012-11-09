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

public enum EnumNivelUbicacion implements ListOption {

    DEPARTAMENTO(1, "nivel_ubicacion_departamento"),
    DISTRITO_MUNICIPIO(2, "nivel_ubicacion_distrito_municipio"),
    BARRIO_LOCALIDAD(3, "nivel_ubicacion_barrio_localidad"),
    MANZANA(4, "nivel_ubicacion_manzana"),
    NIVEL_05(5, "nivel_ubicacion_nivel_05"),
    NIVEL_06(6, "nivel_ubicacion_nivel_06"),
    NIVEL_07(7, "nivel_ubicacion_nivel_07"),
    NIVEL_08(8, "nivel_ubicacion_nivel_08"),
    NIVEL_09(9, "nivel_ubicacion_nivel_09"),
    NIVEL_10(10, "nivel_ubicacion_nivel_10"),
    NIVEL_11(11, "nivel_ubicacion_nivel_11"),
    NIVEL_12(12, "nivel_ubicacion_nivel_12"),
    NIVEL_13(13, "nivel_ubicacion_nivel_13"),
    NIVEL_14(14, "nivel_ubicacion_nivel_14"),
    NIVEL_15(15, "nivel_ubicacion_nivel_15");

    public static EnumNivelUbicacion valueOf(int i) {
        switch (i) {
            case 1:
                return DEPARTAMENTO;
            case 2:
                return DISTRITO_MUNICIPIO;
            case 3:
                return BARRIO_LOCALIDAD;
            case 4:
                return MANZANA;
            case 5:
                return NIVEL_05;
            case 6:
                return NIVEL_06;
            case 7:
                return NIVEL_07;
            case 8:
                return NIVEL_08;
            case 9:
                return NIVEL_09;
            case 10:
                return NIVEL_10;
            case 11:
                return NIVEL_11;
            case 12:
                return NIVEL_12;
            case 13:
                return NIVEL_13;
            case 14:
                return NIVEL_14;
            case 15:
                return NIVEL_15;
            default:
                return null;
        }
    }

    public static EnumNivelUbicacion valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumNivelUbicacion valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumNivelUbicacion(int value, String label) {
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
