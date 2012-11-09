/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.jsf.component;

import com.egt.base.util.BundleDominios;
import com.egt.base.util.BundleParametros;
import com.egt.base.util.BundleWebui;
import com.egt.core.util.STP;
import com.sun.webui.jsf.component.HelpInline;

public class AyudaEnLinea extends HelpInline {

    public AyudaEnLinea() {
        super();
    }

    @Override
    public Object getText() {
        Object object = super.getText();
        if (object instanceof String) {
            String left = null;
            String right = null;
            String string = object.toString();
            int i = string.indexOf('.');
            String key = i < 0 ? "" : string.substring(i + 1).trim();
            if (key.length() == 0) {
                return object;
            } else if (string.startsWith("BundleDominios.")) {
                string = BundleDominios.getInlineHelp(key);
            } else if (string.startsWith("BundleParametros.")) {
//              left = "(";
//              right = ")";
                string = BundleParametros.getInlineHelp(key);
            } else if (string.startsWith("BundleWebui.")) {
                string = BundleWebui.getString(key);
            }
            return STP.getNullStringWhenBlankOrEqualsToKey(string, key, left, right);
        }
        return object;
    }
}
