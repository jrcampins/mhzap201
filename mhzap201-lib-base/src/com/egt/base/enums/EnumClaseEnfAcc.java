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

public enum EnumClaseEnfAcc implements ListOption {

    SARAMPION_RUBEOLA_VARICELA(11, "clase_enf_acc_sarampion_rubeola_varicela"),
    RESFRIO_GRIPE_TOS_DOLOR_DE_GARGANTA(12, "clase_enf_acc_resfrio_gripe_tos_dolor_de_garganta"),
    BRONQUITIS(13, "clase_enf_acc_bronquitis"),
    NEUMONIA(14, "clase_enf_acc_neumonia"),
    PALUDISMO(15, "clase_enf_acc_paludismo"),
    GRANOS_SARNA_OTRAS_ENFREMEDADES_DE_LA_PIEL(16, "clase_enf_acc_granos_sarna_otras_enfremedades_de_la_piel"),
    DIARREA(17, "clase_enf_acc_diarrea"),
    ANEMIA_GRAVE(18, "clase_enf_acc_anemia_grave"),
    PARASITOSIS(19, "clase_enf_acc_parasitosis"),
    FIEBRE(20, "clase_enf_acc_fiebre"),
    DOLOR_DE_OIDO(21, "clase_enf_acc_dolor_de_oido"),
    GINECOLOGICO(22, "clase_enf_acc_ginecologico"),
    ULCERA(23, "clase_enf_acc_ulcera"),
    VIRUELA(24, "clase_enf_acc_viruela"),
    ACCIDENTE(25, "clase_enf_acc_accidente"),
    TIROIDES(26, "clase_enf_acc_tiroides"),
    OPERACION_HIPOTEMA(27, "clase_enf_acc_operacion_hipotema"),
    HEPATITIS(28, "clase_enf_acc_hepatitis"),
    GASTRITIS(29, "clase_enf_acc_gastritis"),
    HEMORROIDE(30, "clase_enf_acc_hemorroide"),
    DENGUE(31, "clase_enf_acc_dengue"),
    CEFALEA(32, "clase_enf_acc_cefalea"),
    EPILEPSIA(33, "clase_enf_acc_epilepsia"),
    MIOPIA(34, "clase_enf_acc_miopia"),
    ESTRES(35, "clase_enf_acc_estres"),
    URTICARIA(36, "clase_enf_acc_urticaria"),
    PROBLEMAS_DE_OJO(37, "clase_enf_acc_problemas_de_ojo"),
    PROBLEMAS_DEL_ESTOMAGO(38, "clase_enf_acc_problemas_del_estomago"),
    DOLORES_DE_ESPALDA_CINTURA(39, "clase_enf_acc_dolores_de_espalda_cintura"),
    PRESION_BAJA(40, "clase_enf_acc_presion_baja"),
    PRESION_ALTA(41, "clase_enf_acc_presion_alta"),
    ALERGIA(42, "clase_enf_acc_alergia"),
    PULMONIA(43, "clase_enf_acc_pulmonia"),
    OTROS_ESPECIFICAR(44, "clase_enf_acc_otros_especificar"),
    NO_REPORTA(99, "clase_enf_acc_no_reporta");

    public static EnumClaseEnfAcc valueOf(int i) {
        switch (i) {
            case 11:
                return SARAMPION_RUBEOLA_VARICELA;
            case 12:
                return RESFRIO_GRIPE_TOS_DOLOR_DE_GARGANTA;
            case 13:
                return BRONQUITIS;
            case 14:
                return NEUMONIA;
            case 15:
                return PALUDISMO;
            case 16:
                return GRANOS_SARNA_OTRAS_ENFREMEDADES_DE_LA_PIEL;
            case 17:
                return DIARREA;
            case 18:
                return ANEMIA_GRAVE;
            case 19:
                return PARASITOSIS;
            case 20:
                return FIEBRE;
            case 21:
                return DOLOR_DE_OIDO;
            case 22:
                return GINECOLOGICO;
            case 23:
                return ULCERA;
            case 24:
                return VIRUELA;
            case 25:
                return ACCIDENTE;
            case 26:
                return TIROIDES;
            case 27:
                return OPERACION_HIPOTEMA;
            case 28:
                return HEPATITIS;
            case 29:
                return GASTRITIS;
            case 30:
                return HEMORROIDE;
            case 31:
                return DENGUE;
            case 32:
                return CEFALEA;
            case 33:
                return EPILEPSIA;
            case 34:
                return MIOPIA;
            case 35:
                return ESTRES;
            case 36:
                return URTICARIA;
            case 37:
                return PROBLEMAS_DE_OJO;
            case 38:
                return PROBLEMAS_DEL_ESTOMAGO;
            case 39:
                return DOLORES_DE_ESPALDA_CINTURA;
            case 40:
                return PRESION_BAJA;
            case 41:
                return PRESION_ALTA;
            case 42:
                return ALERGIA;
            case 43:
                return PULMONIA;
            case 44:
                return OTROS_ESPECIFICAR;
            case 99:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumClaseEnfAcc valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumClaseEnfAcc valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumClaseEnfAcc(int value, String label) {
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
