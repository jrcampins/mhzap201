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

public enum EnumMotivoInaEsc implements ListOption {

    SIN_RECURSOS_EN_EL_HOGAR(1, "motivo_ina_esc_sin_recursos_en_el_hogar"),
    NECESIDAD_DE_TRABAJAR(2, "motivo_ina_esc_necesidad_de_trabajar"),
    DEBE_HACER_LABORES_EN_EL_HOGAR(3, "motivo_ina_esc_debe_hacer_labores_en_el_hogar"),
    MUY_COSTOSOS_LOS_MATERIALES_Y_MATRICULAS(4, "motivo_ina_esc_muy_costosos_los_materiales_y_matriculas"),
    NO_EXISTE_INSTITUCION_PUBLICA_OFICIAL_CERCANA(5, "motivo_ina_esc_no_existe_institucion_publica_oficial_cercana"),
    NO_EXISTE_NINGUNA_INSTITUCION_CERCANA(6, "motivo_ina_esc_no_existe_ninguna_institucion_cercana"),
    NO_TIENE_EDAD_ADECUADA(7, "motivo_ina_esc_no_tiene_edad_adecuada"),
    CONSIDERA_QUE_TERMINO_LOS_ESTUDIOS(8, "motivo_ina_esc_considera_que_termino_los_estudios"),
    CONSIDERA_DE_POCO_VALOR_LA_EDUCACION(9, "motivo_ina_esc_considera_de_poco_valor_la_educacion"),
    INSTITUCION_CERCANA_DE_BAJA_CALIDAD(10, "motivo_ina_esc_institucion_cercana_de_baja_calidad"),
    EN_LA_INSTITUCION_CERCANA_NO_EXISTE_CUPO(12, "motivo_ina_esc_en_la_institucion_cercana_no_existe_cupo"),
    EL_HORARIO_NO_ES_CONVENIENTE(13, "motivo_ina_esc_el_horario_no_es_conveniente"),
    LA_INSTITUCION_ESTA_CLAUSURADA(14, "motivo_ina_esc_la_institucion_esta_clausurada"),
    EL_DOCENTE_NO_ASISTE_CON_REGULARIDAD(15, "motivo_ina_esc_el_docente_no_asiste_con_regularidad"),
    INSTITUCION_NO_OFRECE_TODOS_LOS_GRADOS_CURSOS(16, "motivo_ina_esc_institucion_no_ofrece_todos_los_grados_cursos"),
    REQUIERE_EDUCACION_ESPECIAL(17, "motivo_ina_esc_requiere_educacion_especial"),
    NO_QUIERE_ESTUDIAR(18, "motivo_ina_esc_no_quiere_estudiar"),
    ASISTE_A_ENSENANZA_NO_FORMAL(19, "motivo_ina_esc_asiste_a_ensenanza_no_formal"),
    POR_ENFERMEDAD(20, "motivo_ina_esc_por_enfermedad"),
    POR_EMBARAZO(21, "motivo_ina_esc_por_embarazo"),
    DEBE_CUIDAR_DE_HERMANOS_MENORES(22, "motivo_ina_esc_debe_cuidar_de_hermanos_menores"),
    OTRAS_RAZONES_FAMILIARES(23, "motivo_ina_esc_otras_razones_familiares"),
    SERVICIO_MILITAR(24, "motivo_ina_esc_servicio_militar"),
    OTROS_ESPECIFICAR(25, "motivo_ina_esc_otros_especificar");

    public static EnumMotivoInaEsc valueOf(int i) {
        switch (i) {
            case 1:
                return SIN_RECURSOS_EN_EL_HOGAR;
            case 2:
                return NECESIDAD_DE_TRABAJAR;
            case 3:
                return DEBE_HACER_LABORES_EN_EL_HOGAR;
            case 4:
                return MUY_COSTOSOS_LOS_MATERIALES_Y_MATRICULAS;
            case 5:
                return NO_EXISTE_INSTITUCION_PUBLICA_OFICIAL_CERCANA;
            case 6:
                return NO_EXISTE_NINGUNA_INSTITUCION_CERCANA;
            case 7:
                return NO_TIENE_EDAD_ADECUADA;
            case 8:
                return CONSIDERA_QUE_TERMINO_LOS_ESTUDIOS;
            case 9:
                return CONSIDERA_DE_POCO_VALOR_LA_EDUCACION;
            case 10:
                return INSTITUCION_CERCANA_DE_BAJA_CALIDAD;
            case 12:
                return EN_LA_INSTITUCION_CERCANA_NO_EXISTE_CUPO;
            case 13:
                return EL_HORARIO_NO_ES_CONVENIENTE;
            case 14:
                return LA_INSTITUCION_ESTA_CLAUSURADA;
            case 15:
                return EL_DOCENTE_NO_ASISTE_CON_REGULARIDAD;
            case 16:
                return INSTITUCION_NO_OFRECE_TODOS_LOS_GRADOS_CURSOS;
            case 17:
                return REQUIERE_EDUCACION_ESPECIAL;
            case 18:
                return NO_QUIERE_ESTUDIAR;
            case 19:
                return ASISTE_A_ENSENANZA_NO_FORMAL;
            case 20:
                return POR_ENFERMEDAD;
            case 21:
                return POR_EMBARAZO;
            case 22:
                return DEBE_CUIDAR_DE_HERMANOS_MENORES;
            case 23:
                return OTRAS_RAZONES_FAMILIARES;
            case 24:
                return SERVICIO_MILITAR;
            case 25:
                return OTROS_ESPECIFICAR;
            default:
                return null;
        }
    }

    public static EnumMotivoInaEsc valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumMotivoInaEsc valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumMotivoInaEsc(int value, String label) {
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
