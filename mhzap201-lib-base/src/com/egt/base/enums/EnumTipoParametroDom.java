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

public enum EnumTipoParametroDom implements ListOption {

    ID(1, "tipo_parametro_dom_id"),
    VERSION(2, "tipo_parametro_dom_version"),
    CODIGO(3, "tipo_parametro_dom_codigo"),
    NOMBRE(4, "tipo_parametro_dom_nombre"),
    PROPIETARIO(5, "tipo_parametro_dom_propietario"),
    SEGMENTO(6, "tipo_parametro_dom_segmento"),
    SUPERIOR(7, "tipo_parametro_dom_superior"),
    INACTIVO(8, "tipo_parametro_dom_inactivo"),
    NUMERO(9, "tipo_parametro_dom_numero");

    public static EnumTipoParametroDom valueOf(int i) {
        switch (i) {
            case 1:
                return ID;
            case 2:
                return VERSION;
            case 3:
                return CODIGO;
            case 4:
                return NOMBRE;
            case 5:
                return PROPIETARIO;
            case 6:
                return SEGMENTO;
            case 7:
                return SUPERIOR;
            case 8:
                return INACTIVO;
            case 9:
                return NUMERO;
            default:
                return null;
        }
    }

    public static EnumTipoParametroDom valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoParametroDom valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoParametroDom(int value, String label) {
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
