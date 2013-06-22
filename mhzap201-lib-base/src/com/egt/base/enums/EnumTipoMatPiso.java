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

public enum EnumTipoMatPiso implements ListOption {

    TIERRA(1, "tipo_mat_piso_tierra"),
    MADERA(2, "tipo_mat_piso_madera"),
    LADRILLO(3, "tipo_mat_piso_ladrillo"),
    LECHERADA(4, "tipo_mat_piso_lecherada"),
    BALDOSA(5, "tipo_mat_piso_baldosa"),
    CERAMICA_ALFOMBRA_VINILO_OTROS(6, "tipo_mat_piso_ceramica_alfombra_vinilo_otros"),
    GRANITO_PARQUET_MARMOL(7, "tipo_mat_piso_granito_parquet_marmol"),
    NO_REPORTA(9, "tipo_mat_piso_no_reporta");

    public static EnumTipoMatPiso valueOf(int i) {
        switch (i) {
            case 1:
                return TIERRA;
            case 2:
                return MADERA;
            case 3:
                return LADRILLO;
            case 4:
                return LECHERADA;
            case 5:
                return BALDOSA;
            case 6:
                return CERAMICA_ALFOMBRA_VINILO_OTROS;
            case 7:
                return GRANITO_PARQUET_MARMOL;
            case 9:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumTipoMatPiso valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoMatPiso valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoMatPiso(int value, String label) {
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
