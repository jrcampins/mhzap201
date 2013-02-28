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

public enum EnumTipoArcDatExt implements ListOption {

    IDENTIFICACIONES(101, "tipo_arc_dat_ext_identificaciones"),
    POTENCIALES_BENEFICIARIOS(102, "tipo_arc_dat_ext_potenciales_beneficiarios"),
    EMPLEADOS(201, "tipo_arc_dat_ext_empleados"),
    JUBILADOS(202, "tipo_arc_dat_ext_jubilados"),
    DEUDORES(203, "tipo_arc_dat_ext_deudores"),
    PENAS_JUDICIALES_PENDIENTES(204, "tipo_arc_dat_ext_penas_judiciales_pendientes"),
    PENSIONADOS(205, "tipo_arc_dat_ext_pensionados"),
    SUBSIDIADOS(206, "tipo_arc_dat_ext_subsidiados"),
    FALLECIDOS(301, "tipo_arc_dat_ext_fallecidos"),
    PRESUNTOS_FALLECIDOS(302, "tipo_arc_dat_ext_presuntos_fallecidos"),
    FICHA_HOGAR(401, "tipo_arc_dat_ext_ficha_hogar"),
    FICHA_PERSONA(402, "tipo_arc_dat_ext_ficha_persona"),
    CENSOS_VALIDADOS(501, "tipo_arc_dat_ext_censos_validados");

    public static EnumTipoArcDatExt valueOf(int i) {
        switch (i) {
            case 101:
                return IDENTIFICACIONES;
            case 102:
                return POTENCIALES_BENEFICIARIOS;
            case 201:
                return EMPLEADOS;
            case 202:
                return JUBILADOS;
            case 203:
                return DEUDORES;
            case 204:
                return PENAS_JUDICIALES_PENDIENTES;
            case 205:
                return PENSIONADOS;
            case 206:
                return SUBSIDIADOS;
            case 301:
                return FALLECIDOS;
            case 302:
                return PRESUNTOS_FALLECIDOS;
            case 401:
                return FICHA_HOGAR;
            case 402:
                return FICHA_PERSONA;
            case 501:
                return CENSOS_VALIDADOS;
            default:
                return null;
        }
    }

    public static EnumTipoArcDatExt valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoArcDatExt valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoArcDatExt(int value, String label) {
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
