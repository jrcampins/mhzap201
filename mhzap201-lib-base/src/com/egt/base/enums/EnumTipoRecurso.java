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

public enum EnumTipoRecurso implements ListOption {

    CONFIGURACION_BASICA(11, "tipo_recurso_configuracion_basica"),
    CONFIGURACION_FIJA(12, "tipo_recurso_configuracion_fija"),
    CONFIGURACION_MANUAL(13, "tipo_recurso_configuracion_manual"),
    CONFIGURACION_AUTOMATICA(14, "tipo_recurso_configuracion_automatica"),
    GESTION_MANUAL(21, "tipo_recurso_gestion_manual"),
    GESTION_AUTOMATICA(22, "tipo_recurso_gestion_automatica");

    public static EnumTipoRecurso valueOf(int i) {
        switch (i) {
            case 11:
                return CONFIGURACION_BASICA;
            case 12:
                return CONFIGURACION_FIJA;
            case 13:
                return CONFIGURACION_MANUAL;
            case 14:
                return CONFIGURACION_AUTOMATICA;
            case 21:
                return GESTION_MANUAL;
            case 22:
                return GESTION_AUTOMATICA;
            default:
                return null;
        }
    }

    public static EnumTipoRecurso valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoRecurso valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoRecurso(int value, String label) {
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
