/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.commons.list;

import java.util.Comparator;

public class ListOptionValueComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        ListOption opt1 = (ListOption) obj1;
        ListOption opt2 = (ListOption) obj2;

        Long val1 = null;
        Long val2 = null;

        if (opt1.getOptionValue() instanceof Integer) {
            val1 = new Long((Integer) opt1.getOptionValue());
        } else if (opt1.getOptionValue() instanceof Long) {
            val1 = (Long) opt1.getOptionValue();
        }

        if (opt2.getOptionValue() instanceof Integer) {
            val2 = new Long((Integer) opt2.getOptionValue());
        } else if (opt2.getOptionValue() instanceof Long) {
            val2 = (Long) opt2.getOptionValue();
        }

        if (val1 == null && val2 == null) {
            return 0;
        }

        if (val1 == null) {
            return -1;
        }

        if (val2 == null) {
            return 1;
        }

        return val1.compareTo(val2);
    }
}
