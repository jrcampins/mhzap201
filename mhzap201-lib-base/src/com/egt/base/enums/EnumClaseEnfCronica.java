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

public enum EnumClaseEnfCronica implements ListOption {

    NO_TIENE_ENFERMEDAD_CRONICA(6, "clase_enf_cronica_no_tiene_enfermedad_cronica"),
    ALERGIAS(11, "clase_enf_cronica_alergias"),
    PROBLEMAS_DE_CORAZON_CARDIOPATIAS(12, "clase_enf_cronica_problemas_de_corazon_cardiopatias"),
    ANEMIA(13, "clase_enf_cronica_anemia"),
    DIABETES(14, "clase_enf_cronica_diabetes"),
    ASMA(15, "clase_enf_cronica_asma"),
    HIPERTENSION_PRESION_ALTA(16, "clase_enf_cronica_hipertension_presion_alta"),
    CONVULSIONES(17, "clase_enf_cronica_convulsiones"),
    LESMANIASIS(18, "clase_enf_cronica_lesmaniasis"),
    TUBERCULOSIS(19, "clase_enf_cronica_tuberculosis"),
    SIDA(20, "clase_enf_cronica_sida"),
    CANCER(21, "clase_enf_cronica_cancer"),
    ARTRITIS(22, "clase_enf_cronica_artritis"),
    CATARATAS(23, "clase_enf_cronica_cataratas"),
    ENFERMEDAD_RENAL_CRONICA(24, "clase_enf_cronica_enfermedad_renal_cronica"),
    ENFERMEDAD_BRONCOPULMONAR_CRONICA(25, "clase_enf_cronica_enfermedad_broncopulmonar_cronica"),
    HERNIA(26, "clase_enf_cronica_hernia"),
    PROSTATA_HIPERTROFIA_PROSTETICA_BENIGNA(27, "clase_enf_cronica_prostata_hipertrofia_prostetica_benigna"),
    PIEDRA_EN_LA_VESICULA(28, "clase_enf_cronica_piedra_en_la_vesicula"),
    CIRROSIS(29, "clase_enf_cronica_cirrosis"),
    ARTROSIS(30, "clase_enf_cronica_artrosis"),
    REUMA(31, "clase_enf_cronica_reuma"),
    EPILEPSIA(32, "clase_enf_cronica_epilepsia"),
    VARICES(33, "clase_enf_cronica_varices"),
    ACCIDENTE_CEREBRO_VASCULAR(34, "clase_enf_cronica_accidente_cerebro_vascular"),
    COLESTEROL_HIPERCOLESTEROLEMIA(35, "clase_enf_cronica_colesterol_hipercolesterolemia"),
    EXEMA(36, "clase_enf_cronica_exema"),
    ACIDO_URICO_GOTA(37, "clase_enf_cronica_acido_urico_gota"),
    INFECCION(38, "clase_enf_cronica_infeccion"),
    HIDROCEFALIA(39, "clase_enf_cronica_hidrocefalia"),
    MAL_DE_PARKINSON(40, "clase_enf_cronica_mal_de_parkinson"),
    FIEBRE_REUMATICA(41, "clase_enf_cronica_fiebre_reumatica"),
    OTROS_ESPECIFICAR(42, "clase_enf_cronica_otros_especificar");

    public static EnumClaseEnfCronica valueOf(int i) {
        switch (i) {
            case 6:
                return NO_TIENE_ENFERMEDAD_CRONICA;
            case 11:
                return ALERGIAS;
            case 12:
                return PROBLEMAS_DE_CORAZON_CARDIOPATIAS;
            case 13:
                return ANEMIA;
            case 14:
                return DIABETES;
            case 15:
                return ASMA;
            case 16:
                return HIPERTENSION_PRESION_ALTA;
            case 17:
                return CONVULSIONES;
            case 18:
                return LESMANIASIS;
            case 19:
                return TUBERCULOSIS;
            case 20:
                return SIDA;
            case 21:
                return CANCER;
            case 22:
                return ARTRITIS;
            case 23:
                return CATARATAS;
            case 24:
                return ENFERMEDAD_RENAL_CRONICA;
            case 25:
                return ENFERMEDAD_BRONCOPULMONAR_CRONICA;
            case 26:
                return HERNIA;
            case 27:
                return PROSTATA_HIPERTROFIA_PROSTETICA_BENIGNA;
            case 28:
                return PIEDRA_EN_LA_VESICULA;
            case 29:
                return CIRROSIS;
            case 30:
                return ARTROSIS;
            case 31:
                return REUMA;
            case 32:
                return EPILEPSIA;
            case 33:
                return VARICES;
            case 34:
                return ACCIDENTE_CEREBRO_VASCULAR;
            case 35:
                return COLESTEROL_HIPERCOLESTEROLEMIA;
            case 36:
                return EXEMA;
            case 37:
                return ACIDO_URICO_GOTA;
            case 38:
                return INFECCION;
            case 39:
                return HIDROCEFALIA;
            case 40:
                return MAL_DE_PARKINSON;
            case 41:
                return FIEBRE_REUMATICA;
            case 42:
                return OTROS_ESPECIFICAR;
            default:
                return null;
        }
    }

    public static EnumClaseEnfCronica valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumClaseEnfCronica valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumClaseEnfCronica(int value, String label) {
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
