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

public enum EnumNivelEducativo implements ListOption {

    NINGUNO(0, "nivel_educativo_ninguno"),
    EDUCACION_ESPECIAL(1, "nivel_educativo_educacion_especial"),
    EDUCACION_INICIAL(2, "nivel_educativo_educacion_inicial"),
    EDUCACION_ESCOLAR_BASICA_DEL_1_AL_6_PRIMARIA(3, "nivel_educativo_educacion_escolar_basica_del_1_al_6_primaria"),
    EDUCACION_ESCOLAR_BASICA_DEL_7_AL_9(4, "nivel_educativo_educacion_escolar_basica_del_7_al_9"),
    SECUNDARIA_CICLO_BASICO(5, "nivel_educativo_secundaria_ciclo_basico"),
    BACHILLERATO_HUMANISTICO_CIENTIFICO(6, "nivel_educativo_bachillerato_humanistico_cientifico"),
    BACHILLERATO_TECNICO_COMERCIAL(7, "nivel_educativo_bachillerato_tecnico_comercial"),
    BACHILLERATO_A_DISTANCIA(8, "nivel_educativo_bachillerato_a_distancia"),
    EDUCACION_MEDIA_CIENTIFICA(9, "nivel_educativo_educacion_media_cientifica"),
    EDUCACION_MEDIA_TECNICA(10, "nivel_educativo_educacion_media_tecnica"),
    EDUCACION_BASICA_BILINGUE_DE_JOVENES_Y_ADULTOS(11, "nivel_educativo_educacion_basica_bilingue_de_jovenes_y_adultos"),
    EDUCACION_MEDIA_A_DISTANCIA_PARA_JOVENES_Y_ADULTOS(12, "nivel_educativo_educacion_media_a_distancia_para_jovenes_y_adultos"),
    EDUCACION_BASICA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS(13, "nivel_educativo_educacion_basica_alternativa_de_jovenes_y_adultos"),
    EDUCACION_MEDIA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS(14, "nivel_educativo_educacion_media_alternativa_de_jovenes_y_adultos"),
    FORMACION_PROFESIONAL_NO_BACHILLERATO_DE_LA_MEDIA(15, "nivel_educativo_formacion_profesional_no_bachillerato_de_la_media"),
    PROGRAMA_DE_ALFABETIZACION(16, "nivel_educativo_programa_de_alfabetizacion"),
    GRADO_ESPECIAL_PROGRAMAS_ESPECIALES(17, "nivel_educativo_grado_especial_programas_especiales"),
    TECNICA_SUPERIOR(18, "nivel_educativo_tecnica_superior"),
    FORMACION_DOCENTE(19, "nivel_educativo_formacion_docente"),
    PROFESIONALIZACION_DOCENTE(20, "nivel_educativo_profesionalizacion_docente"),
    FORMACION_MILITAR_POLICIAL(21, "nivel_educativo_formacion_militar_policial"),
    SUPERIOR_UNIVERSITARIA(22, "nivel_educativo_superior_universitaria");

    public static EnumNivelEducativo valueOf(int i) {
        switch (i) {
            case 0:
                return NINGUNO;
            case 1:
                return EDUCACION_ESPECIAL;
            case 2:
                return EDUCACION_INICIAL;
            case 3:
                return EDUCACION_ESCOLAR_BASICA_DEL_1_AL_6_PRIMARIA;
            case 4:
                return EDUCACION_ESCOLAR_BASICA_DEL_7_AL_9;
            case 5:
                return SECUNDARIA_CICLO_BASICO;
            case 6:
                return BACHILLERATO_HUMANISTICO_CIENTIFICO;
            case 7:
                return BACHILLERATO_TECNICO_COMERCIAL;
            case 8:
                return BACHILLERATO_A_DISTANCIA;
            case 9:
                return EDUCACION_MEDIA_CIENTIFICA;
            case 10:
                return EDUCACION_MEDIA_TECNICA;
            case 11:
                return EDUCACION_BASICA_BILINGUE_DE_JOVENES_Y_ADULTOS;
            case 12:
                return EDUCACION_MEDIA_A_DISTANCIA_PARA_JOVENES_Y_ADULTOS;
            case 13:
                return EDUCACION_BASICA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS;
            case 14:
                return EDUCACION_MEDIA_ALTERNATIVA_DE_JOVENES_Y_ADULTOS;
            case 15:
                return FORMACION_PROFESIONAL_NO_BACHILLERATO_DE_LA_MEDIA;
            case 16:
                return PROGRAMA_DE_ALFABETIZACION;
            case 17:
                return GRADO_ESPECIAL_PROGRAMAS_ESPECIALES;
            case 18:
                return TECNICA_SUPERIOR;
            case 19:
                return FORMACION_DOCENTE;
            case 20:
                return PROFESIONALIZACION_DOCENTE;
            case 21:
                return FORMACION_MILITAR_POLICIAL;
            case 22:
                return SUPERIOR_UNIVERSITARIA;
            default:
                return null;
        }
    }

    public static EnumNivelEducativo valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumNivelEducativo valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumNivelEducativo(int value, String label) {
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
