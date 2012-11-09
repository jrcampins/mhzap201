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

public enum EnumTipoMatParedes implements ListOption {

    ESTAQUEO(1, "tipo_mat_paredes_estaqueo"),
    ADOBE_CARNIZO(2, "tipo_mat_paredes_adobe_carnizo"),
    MADERA(3, "tipo_mat_paredes_madera"),
    LADRILLO_CEMENTO(4, "tipo_mat_paredes_ladrillo_cemento"),
    PIEDRA(5, "tipo_mat_paredes_piedra"),
    CHAPA_TELA_CARTON_LATAS_OTROS(6, "tipo_mat_paredes_chapa_tela_carton_latas_otros"),
    SIN_PAREDES(7, "tipo_mat_paredes_sin_paredes");

    public static EnumTipoMatParedes valueOf(int i) {
        switch (i) {
            case 1:
                return ESTAQUEO;
            case 2:
                return ADOBE_CARNIZO;
            case 3:
                return MADERA;
            case 4:
                return LADRILLO_CEMENTO;
            case 5:
                return PIEDRA;
            case 6:
                return CHAPA_TELA_CARTON_LATAS_OTROS;
            case 7:
                return SIN_PAREDES;
            default:
                return null;
        }
    }

    public static EnumTipoMatParedes valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoMatParedes valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoMatParedes(int value, String label) {
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
