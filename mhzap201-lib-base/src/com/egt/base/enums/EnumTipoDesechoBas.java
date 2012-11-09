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

public enum EnumTipoDesechoBas implements ListOption {

    RECOGE_CAMION_PUBLICO_PRIVADO(1, "tipo_desecho_bas_recoge_camion_publico_privado"),
    QUEMA(2, "tipo_desecho_bas_quema"),
    ARROJA_EN_UN_HOYO(3, "tipo_desecho_bas_arroja_en_un_hoyo"),
    TIRA_EN_EL_PATIO_DE_LA_CHACRA(4, "tipo_desecho_bas_tira_en_el_patio_de_la_chacra"),
    TIRA_EN_ZANJA_ARROYO_RIO_ETC(5, "tipo_desecho_bas_tira_en_zanja_arroyo_rio_etc"),
    RECOGE_EN_CARRITO(6, "tipo_desecho_bas_recoge_en_carrito");

    public static EnumTipoDesechoBas valueOf(int i) {
        switch (i) {
            case 1:
                return RECOGE_CAMION_PUBLICO_PRIVADO;
            case 2:
                return QUEMA;
            case 3:
                return ARROJA_EN_UN_HOYO;
            case 4:
                return TIRA_EN_EL_PATIO_DE_LA_CHACRA;
            case 5:
                return TIRA_EN_ZANJA_ARROYO_RIO_ETC;
            case 6:
                return RECOGE_EN_CARRITO;
            default:
                return null;
        }
    }

    public static EnumTipoDesechoBas valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoDesechoBas valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoDesechoBas(int value, String label) {
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
