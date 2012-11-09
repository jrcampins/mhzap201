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

public class BundleWebui {

    private static final String BASE_NAME = "com.egt.base.bundles.BundleWebui";

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(BASE_NAME);

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public static String getString(String key) {
        if (key == null) {
            return null;
        }
        try {
            String string = resourceBundle.getString(key);
            return string == null || string.trim().equals("") ? key : string;
        } catch (MissingResourceException e) {
            return key;
        }
    }
}
