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

import java.math.BigDecimal;
import java.math.BigInteger;

public class IntUtils {

    public static final int FALSE = 0;

    public static final int TRUE = 1;

    public static Integer toInteger(Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof Integer) {
            return (Integer) o;
        }
        if (o instanceof Long) {
            return ((Long) o).intValue();
        }
        if (o instanceof BigDecimal) {
            return ((BigDecimal) o).intValue();
        }
        if (o instanceof BigInteger) {
            return ((BigInteger) o).intValue();
        }
        throw new ClassCastException(o.getClass().getName() + "cannot be casted as java.lang.Integer");
    }

    public static int valueOf(Boolean b) {
        return b == null || !b ? FALSE : TRUE;
    }

    public static int valueOf(Integer i) {
        return i == null ? 0 : i.intValue();
    }

    public static int valueOf(Long l) {
        return l == null ? 0 : l.intValue();
    }

    private static int version = -1;

    public static synchronized int getNewId() {
        if (++version == 100000) {
            version = 0;
        }
        long thread = Thread.currentThread().getId();
        return version + 100000 * (int) (thread % 10000L); /* 9 digitos: 4t + 5v */
    }

}
