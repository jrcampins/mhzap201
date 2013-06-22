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

public enum EnumTipoOcupacionViv implements ListOption {

    PROPIA_O_EN_CONDOMINIO(1, "tipo_ocupacion_viv_propia_o_en_condominio"),
    PAGANDO_EN_CUOTAS(2, "tipo_ocupacion_viv_pagando_en_cuotas"),
    ALQUILADA(3, "tipo_ocupacion_viv_alquilada"),
    OCUPADA_DE_HECHO(4, "tipo_ocupacion_viv_ocupada_de_hecho"),
    CEDIDA(5, "tipo_ocupacion_viv_cedida"),
    OTROS(6, "tipo_ocupacion_viv_otros"),
    NO_REPORTA(9, "tipo_ocupacion_viv_no_reporta");

    public static EnumTipoOcupacionViv valueOf(int i) {
        switch (i) {
            case 1:
                return PROPIA_O_EN_CONDOMINIO;
            case 2:
                return PAGANDO_EN_CUOTAS;
            case 3:
                return ALQUILADA;
            case 4:
                return OCUPADA_DE_HECHO;
            case 5:
                return CEDIDA;
            case 6:
                return OTROS;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoOcupacionViv valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoOcupacionViv valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoOcupacionViv(int value, String label) {
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
