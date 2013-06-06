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

public class BundleParametros {

    private static final String BASE_NAME = "com.egt.base.bundles.BundleParametros";

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(BASE_NAME);

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public static String getString(String key) {
        return getString(key, false);
    }

    public static String getString(String key, boolean nullIfMissing) {
        if (key == null) {
            return null;
        }
        String defaultString = nullIfMissing ? null : key;
        try {
            String string = resourceBundle.getString(key);
            return string == null || string.trim().equals("") ? defaultString : string;
        } catch (MissingResourceException e) {
            return defaultString;
        }
    }

    public static String getString(String key, String suffix) {
        return getString(key, suffix, false);
    }

    public static String getString(String key, String suffix, boolean nullIfMissing) {
        if (key == null || suffix == null) {
            return null;
        }
        String defaultString = nullIfMissing ? null : key;
        try {
            String string = resourceBundle.getString(key + '.' + suffix);
            return string == null || string.trim().equals("") ? defaultString : string;
        } catch (MissingResourceException e) {
            return defaultString;
        }
    }

    public static final String INLINE_HELP = "inline_help";

    public static final String TOOLTIP = "tooltip";

    public static String getInlineHelp(String key) {
        String subkey;
        String string = getString(key, INLINE_HELP);
        if (string == null || string.equals(key)) {
            int i = key == null ? 0 : key.indexOf('.');
            if (i > 0) {
                subkey = key.substring(0, i);
                string = getString(subkey, INLINE_HELP);
                return string == null || string.equals(subkey) ? null : string;
            } else {
                return null;
            }
        } else {
            return string;
        }
    }

    public static String getToolTip(String key) {
        String subkey;
        String string = getString(key, TOOLTIP);
        if (string == null || string.equals(key)) {
            int i = key == null ? 0 : key.indexOf('.');
            if (i > 0) {
                subkey = key.substring(0, i);
                string = getString(subkey, TOOLTIP);
                return string == null || string.equals(subkey) ? null : string;
            } else {
                return null;
            }
        } else {
            return string;
        }
    }

}
