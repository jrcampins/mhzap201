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

public enum EnumOperadorCom implements ListOption {

    ES_NULO(1, "operador_com_es_nulo"),
    NO_ES_NULO(2, "operador_com_no_es_nulo"),
    ES_IGUAL(11, "operador_com_es_igual"),
    NO_ES_IGUAL(12, "operador_com_no_es_igual"),
    ES_MAYOR(21, "operador_com_es_mayor"),
    ES_MENOR_O_IGUAL(22, "operador_com_es_menor_o_igual"),
    ES_MAYOR_O_IGUAL(31, "operador_com_es_mayor_o_igual"),
    ES_MENOR(32, "operador_com_es_menor"),
    COMIENZA_POR(41, "operador_com_comienza_por"),
    NO_COMIENZA_POR(42, "operador_com_no_comienza_por"),
    CONTIENE(43, "operador_com_contiene"),
    NO_CONTIENE(44, "operador_com_no_contiene"),
    TERMINA_EN(45, "operador_com_termina_en"),
    NO_TERMINA_EN(46, "operador_com_no_termina_en"),
    ESTA_ENTRE(51, "operador_com_esta_entre"),
    NO_ESTA_ENTRE(52, "operador_com_no_esta_entre"),
    ES_NULO_O_ES_IGUAL(111, "operador_com_es_nulo_o_es_igual"),
    ES_NULO_O_NO_ES_IGUAL(112, "operador_com_es_nulo_o_no_es_igual"),
    ES_NULO_O_ES_MAYOR(121, "operador_com_es_nulo_o_es_mayor"),
    ES_NULO_O_ES_MENOR_O_IGUAL(122, "operador_com_es_nulo_o_es_menor_o_igual"),
    ES_NULO_O_ES_MAYOR_O_IGUAL(131, "operador_com_es_nulo_o_es_mayor_o_igual"),
    ES_NULO_O_ES_MENOR(132, "operador_com_es_nulo_o_es_menor"),
    ES_NULO_O_COMIENZA_POR(141, "operador_com_es_nulo_o_comienza_por"),
    ES_NULO_O_NO_COMIENZA_POR(142, "operador_com_es_nulo_o_no_comienza_por"),
    ES_NULO_O_CONTIENE(143, "operador_com_es_nulo_o_contiene"),
    ES_NULO_O_NO_CONTIENE(144, "operador_com_es_nulo_o_no_contiene"),
    ES_NULO_O_TERMINA_EN(145, "operador_com_es_nulo_o_termina_en"),
    ES_NULO_O_NO_TERMINA_EN(146, "operador_com_es_nulo_o_no_termina_en"),
    ES_NULO_O_ESTA_ENTRE(151, "operador_com_es_nulo_o_esta_entre"),
    ES_NULO_O_NO_ESTA_ENTRE(152, "operador_com_es_nulo_o_no_esta_entre"),
    EXISTE(161, "operador_com_existe"),
    NO_EXISTE(162, "operador_com_no_existe");

    public static EnumOperadorCom valueOf(int i) {
        switch (i) {
            case 1:
                return ES_NULO;
            case 2:
                return NO_ES_NULO;
            case 11:
                return ES_IGUAL;
            case 12:
                return NO_ES_IGUAL;
            case 21:
                return ES_MAYOR;
            case 22:
                return ES_MENOR_O_IGUAL;
            case 31:
                return ES_MAYOR_O_IGUAL;
            case 32:
                return ES_MENOR;
            case 41:
                return COMIENZA_POR;
            case 42:
                return NO_COMIENZA_POR;
            case 43:
                return CONTIENE;
            case 44:
                return NO_CONTIENE;
            case 45:
                return TERMINA_EN;
            case 46:
                return NO_TERMINA_EN;
            case 51:
                return ESTA_ENTRE;
            case 52:
                return NO_ESTA_ENTRE;
            case 111:
                return ES_NULO_O_ES_IGUAL;
            case 112:
                return ES_NULO_O_NO_ES_IGUAL;
            case 121:
                return ES_NULO_O_ES_MAYOR;
            case 122:
                return ES_NULO_O_ES_MENOR_O_IGUAL;
            case 131:
                return ES_NULO_O_ES_MAYOR_O_IGUAL;
            case 132:
                return ES_NULO_O_ES_MENOR;
            case 141:
                return ES_NULO_O_COMIENZA_POR;
            case 142:
                return ES_NULO_O_NO_COMIENZA_POR;
            case 143:
                return ES_NULO_O_CONTIENE;
            case 144:
                return ES_NULO_O_NO_CONTIENE;
            case 145:
                return ES_NULO_O_TERMINA_EN;
            case 146:
                return ES_NULO_O_NO_TERMINA_EN;
            case 151:
                return ES_NULO_O_ESTA_ENTRE;
            case 152:
                return ES_NULO_O_NO_ESTA_ENTRE;
            case 161:
                return EXISTE;
            case 162:
                return NO_EXISTE;
            default:
                return null;
        }
    }

    public static EnumOperadorCom valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumOperadorCom valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumOperadorCom(int value, String label) {
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
