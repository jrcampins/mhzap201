/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.commons.util;

import com.egt.commons.enums.EnumBitLabelSet;
import java.math.BigDecimal;

public class BitUtils {

    public static boolean valueOf(Boolean b) {
        return b == null ? false : b.booleanValue();
    }

    public static boolean valueOf(Character c) {
        return c == null ? false : valueOf(c.charValue());
    }

    public static boolean valueOf(char c) {
        return c == 'N' || c == 'n' ? false : true;
    }

    public static boolean valueOf(Integer i) {
        return i == null || i == IntUtils.FALSE ? false : true;
    }

    public static boolean valueOf(Long l) {
        return l == null || l == LongUtils.FALSE ? false : true;
    }

    public static boolean valueOf(BigDecimal bd) {
        return bd == null || bd.longValue() == LongUtils.FALSE ? false : true;
    }

    public static boolean valueOf(String s) {
        return (s == null)
                || s.equalsIgnoreCase("")
                || s.equalsIgnoreCase("" + Boolean.FALSE)
                || s.equalsIgnoreCase("" + IntUtils.FALSE)
                || s.equalsIgnoreCase("" + LongUtils.FALSE)
                || s.equalsIgnoreCase(Bundle.getString("bit.no"))
                || s.equalsIgnoreCase(Bundle.getString("bit.inactivo"))
                || s.equalsIgnoreCase(Bundle.getString("bit.apagado"))
                || s.equalsIgnoreCase(Bundle.getString("bit.negativo"))
                || s.equalsIgnoreCase(Bundle.getString("bit.ausente"))
                || s.equalsIgnoreCase(Bundle.getString("bit.falso"))
                ? false : true;
    }

    public static boolean valueOf(Object o) {
        if (o instanceof Boolean) {
            Boolean b = (Boolean) o;
            return valueOf(b);
        } else if (o instanceof Character) {
            Character c = (Character) o;
            return valueOf(c);
        } else if (o instanceof Integer) {
            Integer i = (Integer) o;
            return valueOf(i);
        } else if (o instanceof Long) {
            Long l = (Long) o;
            return valueOf(l);
        } else if (o instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal) o;
            return valueOf(bd);
        } else if (o instanceof String) {
            String s = (String) o;
            return valueOf(s);
        } else {
            return o != null;
        }
    }

    public static String getLabel(Boolean b) {
        return getLabel(b, EnumBitLabelSet.SI_NO);
    }

    public static String getLabel(Boolean b, EnumBitLabelSet bls) {
        switch (bls) {
            case SI_NO:
                return b ? Bundle.getString("bit.si") : Bundle.getString("bit.no");
            case ACTIVO_INACTIVO:
                return b ? Bundle.getString("bit.activo") : Bundle.getString("bit.inactivo");
            case ENCENDIDO_APAGADO:
                return b ? Bundle.getString("bit.encendido") : Bundle.getString("bit.apagado");
            case POSITIVO_NEGATIVO:
                return b ? Bundle.getString("bit.positivo") : Bundle.getString("bit.negativo");
            case PRESENTE_AUSENTE:
                return b ? Bundle.getString("bit.presente") : Bundle.getString("bit.ausente");
            case VERDADERO_FALSO:
                return b ? Bundle.getString("bit.verdadero") : Bundle.getString("bit.falso");
            default:
                return b ? Bundle.getString("bit.si") : Bundle.getString("bit.no");
        }
    }

}
