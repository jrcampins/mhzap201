/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.base.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class BundleMensajes {

    private static final String BASE_NAME_1 = "com.egt.base.bundles.BundleMensajes";

    private static final String BASE_NAME_2 = "com.egt.base.bundles.BundleMensajes2";

    private static final ResourceBundle resourceBundle1 = ResourceBundle.getBundle(BASE_NAME_1);

    private static final ResourceBundle resourceBundle2 = ResourceBundle.getBundle(BASE_NAME_2);

    public static String getString(String key) {
        if (key == null) {
            return null;
        }
        String string;
        try {
            string = resourceBundle2.getString(key);
        } catch (MissingResourceException e) {
            string = null;
        }
        if (string == null || string.trim().equals("")) {
            try {
                string = resourceBundle1.getString(key);
            } catch (MissingResourceException e) {
                string = null;
            }
        }
        return string == null || string.trim().equals("") ? key : string;
    }
}
