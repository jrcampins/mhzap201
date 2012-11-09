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

public class LongUtils {

    public static final long FALSE = 0L;

    public static final long TRUE = 1L;

    public static Long toLong(Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof Long) {
            return (Long) o;
        }
        if (o instanceof Integer) {
            return ((Integer) o).longValue();
        }
        if (o instanceof BigDecimal) {
            return ((BigDecimal) o).longValue();
        }
        if (o instanceof BigInteger) {
            return ((BigInteger) o).longValue();
        }
        throw new ClassCastException(o.getClass().getName() + " cannot be casted as java.lang.Long");
    }

    public static long valueOf(Boolean b) {
        return b == null || !b ? FALSE : TRUE;
    }

    public static long valueOf(Integer i) {
        return i == null ? 0 : i.intValue();
    }

    public static long valueOf(Long l) {
        return l == null ? 0 : l.intValue();
    }

    public static long getNewId() {
        long millis = TimeUtils.currentTimeMillis();
        long thread = Thread.currentThread().getId();
        return 100000L * millis + 10L * (thread % 10000L); /* 18 digitos: 13m + 5t */
    }

}
