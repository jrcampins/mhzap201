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

import com.egt.base.util.BundleParametros;
import com.egt.core.jsf.JSF;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.WebuiInput;
import org.apache.commons.lang.StringUtils;

public class Etiqueta extends Label {

    public Etiqueta() {
        super();
    }

    private boolean unaware = true;

    private WebuiInput sibling = null;

    synchronized protected WebuiInput getSibling() {
        if (unaware && sibling == null && this.getId() != null && super.getFor() != null) {
            unaware = false;
            sibling = JSF.getWebuiInput(this);
        }
        return sibling;
    }

    @Override
    public String getFor() {
        return this.getSibling() == null || this.getSibling().isRendered() ? super.getFor() : null;
    }

    public String getFor(boolean b) {
        return super.getFor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getValue() {
        Object superobj = super.getValue();
        String superstr = superobj == null ? null : superobj.toString();
        if (StringUtils.isBlank(superstr)) {
            return superobj;
        } else if (getValueExpression("value") != null) {
            return superobj;
        }
        String supertip = super.getToolTip();
        if (supertip != null && getValueExpression("toolTip") == null && supertip.startsWith("BundleParametros.")) {
            int i = supertip.indexOf('.');
            String key = supertip.substring(i + 1);
            String str = BundleParametros.getString(key, BundleParametros.TOOLTIP, true);
            if (str != null) {
                return str;
            }
        }
        String webuistr = JSF.getWebuiString(this, "text");
        if (webuistr == null) {
            String prefix = "label";
            String thisid = StringUtils.trimToEmpty(this.getId());
            String altkey = thisid.startsWith(prefix) ? thisid.substring(prefix.length()) : null;
            String styles = StringUtils.trimToEmpty(this.getStyleClass());
//          boolean b = super.getFor() == null;
            webuistr = StringUtils.lowerCase(JSF.getWebuiString(superstr, altkey, styles));
        }
        return webuistr == null ? superobj : webuistr;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getToolTip() {
        String superstr = super.getToolTip();
        if (StringUtils.isBlank(superstr)) {
            return superstr;
        } else if (getValueExpression("toolTip") != null) {
            return superstr;
        } else if (superstr.startsWith("BundleParametros.")) {
            int i = superstr.indexOf('.');
            String key = superstr.substring(i + 1);
            return BundleParametros.getToolTip(key);
        }
        String webuistr = JSF.getWebuiString(this, "toolTip");
        return webuistr == null ? superstr : webuistr;
    }

}
