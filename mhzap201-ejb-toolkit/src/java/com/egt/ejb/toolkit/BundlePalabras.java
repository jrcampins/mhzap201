/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.ejb.toolkit;

import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

public class BundlePalabras {

    private static final String BASE_NAME = BundlePalabras.class.getName();

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(BASE_NAME);

    public static String getString(String key) {
        try {
            return resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            return key;
        }
    }

    public static Enumeration<String> getKeys() {
        return resourceBundle.getKeys();
    }

    public static Set<String> getKeySet() {
        Set<String> set = new TreeSet<>();
        for (Enumeration<String> e = resourceBundle.getKeys(); e.hasMoreElements();) {
            set.add(e.nextElement());
        }
        return set;
    }

}
