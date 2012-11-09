/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.util;

import com.sun.webui.jsf.model.Option;
import java.util.Comparator;

public class OptionLabelComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Option opt1 = (Option) obj1;
        Option opt2 = (Option) obj2;

        Long val1 = null;
        Long val2 = null;

        if (opt1.getValue() instanceof Integer) {
            val1 = new Long((Integer) opt1.getValue());
        } else if (opt1.getValue() instanceof Long) {
            val1 = (Long) opt1.getValue();
        }

        if (opt2.getValue() instanceof Integer) {
            val2 = new Long((Integer) opt2.getValue());
        } else if (opt2.getValue() instanceof Long) {
            val2 = (Long) opt2.getValue();
        }

        if (val1 == null && val2 != null) {
            return -1;
        }

        if (val2 == null && val1 != null) {
            return 1;
        }

        String lab1 = opt1.getLabel();
        String lab2 = opt2.getLabel();

        if (lab1 == null && lab2 == null) {
            return 0;
        }

        if (lab1 == null) {
            return -1;
        }

        if (lab2 == null) {
            return 1;
        }

        return lab1.compareToIgnoreCase(lab2);
    }
}
