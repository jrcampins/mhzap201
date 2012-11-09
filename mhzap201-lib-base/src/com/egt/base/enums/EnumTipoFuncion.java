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

public enum EnumTipoFuncion implements ListOption {

    PROCEDIMIENTO_FILA(11, "tipo_funcion_procedimiento_fila"),
    PROCEDIMIENTO_FILA_PARAMETROS(12, "tipo_funcion_procedimiento_fila_parametros"),
    PROCEDIMIENTO_PARAMETROS(13, "tipo_funcion_procedimiento_parametros"),
    CONSULTA(21, "tipo_funcion_consulta"),
    INFORME(22, "tipo_funcion_informe"),
    ARCHIVO(23, "tipo_funcion_archivo"),
    CREACION(31, "tipo_funcion_creacion"),
    MODIFICACION(32, "tipo_funcion_modificacion"),
    ELIMINACION(33, "tipo_funcion_eliminacion");

    public static EnumTipoFuncion valueOf(int i) {
        switch (i) {
            case 11:
                return PROCEDIMIENTO_FILA;
            case 12:
                return PROCEDIMIENTO_FILA_PARAMETROS;
            case 13:
                return PROCEDIMIENTO_PARAMETROS;
            case 21:
                return CONSULTA;
            case 22:
                return INFORME;
            case 23:
                return ARCHIVO;
            case 31:
                return CREACION;
            case 32:
                return MODIFICACION;
            case 33:
                return ELIMINACION;
            default:
                return null;
        }
    }

    public static EnumTipoFuncion valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoFuncion valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoFuncion(int value, String label) {
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
