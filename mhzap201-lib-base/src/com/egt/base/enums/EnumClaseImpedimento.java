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

public enum EnumClaseImpedimento implements ListOption {

    TIENE_PARALISIS_EN_SUS_PIERNAS_O_BRAZOS_O_DISMINUCION_DE_SUS_FUERZAS_KANGY(1, "clase_impedimento_tiene_paralisis_en_sus_piernas_o_brazos_o_disminucion_de_sus_fuerzas_kangy"),
    LE_FALTA_ALGUNA_PARTE_DE_SU_CUERPO(2, "clase_impedimento_le_falta_alguna_parte_de_su_cuerpo"),
    ES_SORDO_NO_ESCUCHA_NADA(3, "clase_impedimento_es_sordo_no_escucha_nada"),
    NO_ESCUCHA_BIEN_NECESITA_O_USA_APARATO_PARA_OIR(4, "clase_impedimento_no_escucha_bien_necesita_o_usa_aparato_para_oir"),
    ES_MUDO_NO_HABLA(5, "clase_impedimento_es_mudo_no_habla"),
    NO_TIENE_IMPEDIMENTO(6, "clase_impedimento_no_tiene_impedimento"),
    ES_CIEGO_EN_AMBOS_OJOS_NO_VE_NADA(7, "clase_impedimento_es_ciego_en_ambos_ojos_no_ve_nada"),
    ES_CIEGO_EN_UN_OJO(8, "clase_impedimento_es_ciego_en_un_ojo"),
    VE_CON_DIFICULTAD_AUN_CON_ANTEOJOS(9, "clase_impedimento_ve_con_dificultad_aun_con_anteojos"),
    TIENE_SINDROME_DE_DOWN_MONGOLICO(10, "clase_impedimento_tiene_sindrome_de_down_mongolico"),
    TIENE_ALGUN_RETRASO_MENTAL(11, "clase_impedimento_tiene_algun_retraso_mental"),
    TIENE_LOCURA_DEMENCIA(12, "clase_impedimento_tiene_locura_demencia"),
    OTROS_ESPECIFICAR(13, "clase_impedimento_otros_especificar"),
    HABLA_CON_MUCHA_DIFICULTAD(16, "clase_impedimento_habla_con_mucha_dificultad"),
    NO_REPORTA(99, "clase_impedimento_no_reporta");

    public static EnumClaseImpedimento valueOf(int i) {
        switch (i) {
            case 1:
                return TIENE_PARALISIS_EN_SUS_PIERNAS_O_BRAZOS_O_DISMINUCION_DE_SUS_FUERZAS_KANGY;
            case 2:
                return LE_FALTA_ALGUNA_PARTE_DE_SU_CUERPO;
            case 3:
                return ES_SORDO_NO_ESCUCHA_NADA;
            case 4:
                return NO_ESCUCHA_BIEN_NECESITA_O_USA_APARATO_PARA_OIR;
            case 5:
                return ES_MUDO_NO_HABLA;
            case 6:
                return NO_TIENE_IMPEDIMENTO;
            case 7:
                return ES_CIEGO_EN_AMBOS_OJOS_NO_VE_NADA;
            case 8:
                return ES_CIEGO_EN_UN_OJO;
            case 9:
                return VE_CON_DIFICULTAD_AUN_CON_ANTEOJOS;
            case 10:
                return TIENE_SINDROME_DE_DOWN_MONGOLICO;
            case 11:
                return TIENE_ALGUN_RETRASO_MENTAL;
            case 12:
                return TIENE_LOCURA_DEMENCIA;
            case 13:
                return OTROS_ESPECIFICAR;
            case 16:
                return HABLA_CON_MUCHA_DIFICULTAD;
            case 99:
                return NO_REPORTA;
            default:
                return null;
        }
    }

    public static EnumClaseImpedimento valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumClaseImpedimento valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumClaseImpedimento(int value, String label) {
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
