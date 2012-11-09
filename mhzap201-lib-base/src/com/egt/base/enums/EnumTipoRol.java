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

public enum EnumTipoRol implements ListOption {

    OPERADOR(0, "tipo_rol_operador"),
    REGISTRADOR(1, "tipo_rol_registrador"),
    PROCESADOR(2, "tipo_rol_procesador"),
    LECTOR(4, "tipo_rol_lector"),
    CONFIGURADOR(8, "tipo_rol_configurador"),
    GESTOR(16, "tipo_rol_gestor");

    public static EnumTipoRol valueOf(int i) {
        switch (i) {
            case 0:
                return OPERADOR;
            case 1:
                return REGISTRADOR;
            case 2:
                return PROCESADOR;
            case 4:
                return LECTOR;
            case 8:
                return CONFIGURADOR;
            case 16:
                return GESTOR;
            default:
                return null;
        }
    }

    public static EnumTipoRol valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoRol valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoRol(int value, String label) {
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
