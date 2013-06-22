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

public enum EnumMotivoNoTrabajo implements ListOption {

    BUSCO_TRABAJO(1, "motivo_no_trabajo_busco_trabajo"),
    DEDICACION_EXCLUSIVA_AL_HOGAR(2, "motivo_no_trabajo_dedicacion_exclusiva_al_hogar"),
    ESTUDIANTE(3, "motivo_no_trabajo_estudiante"),
    PRESTA_SERVICIO_MILITAR(4, "motivo_no_trabajo_presta_servicio_militar"),
    DISCAPACITADO(5, "motivo_no_trabajo_discapacitado"),
    RENTISTA(6, "motivo_no_trabajo_rentista"),
    JUBILADO_A(7, "motivo_no_trabajo_jubilado_a"),
    PENSIONADO_A(8, "motivo_no_trabajo_pensionado_a"),
    OTROS(9, "motivo_no_trabajo_otros"),
    NO_REPORTA(99, "motivo_no_trabajo_no_reporta");

    public static EnumMotivoNoTrabajo valueOf(int i) {
        switch (i) {
            case 1:
                return BUSCO_TRABAJO;
            case 2:
                return DEDICACION_EXCLUSIVA_AL_HOGAR;
            case 3:
                return ESTUDIANTE;
            case 4:
                return PRESTA_SERVICIO_MILITAR;
            case 5:
                return DISCAPACITADO;
            case 6:
                return RENTISTA;
            case 7:
                return JUBILADO_A;
            case 8:
                return PENSIONADO_A;
            case 9:
                return OTROS;
            case 99:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumMotivoNoTrabajo valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumMotivoNoTrabajo valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumMotivoNoTrabajo(int value, String label) {
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
