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

import com.egt.core.jsf.JSF;
import com.egt.core.util.Bundle;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.WebuiInput;
import org.apache.commons.lang.StringUtils;

public class Hipervinculo extends ImageHyperlink {

    public Hipervinculo() {
        super();
    }

    private boolean unaware = true;

    private WebuiInput sibling = null;

    synchronized protected WebuiInput getSibling() {
        if (unaware && sibling == null && this.getId() != null) {
            unaware = false;
            sibling = JSF.getWebuiInput(this);
        }
        return sibling;
    }

    /** {@inheritDoc} */
    @Override
    public String getImageURL() {
        String string = super.getImageURL();
        return string != null ? string : this.getString("imageURL");
    }

    /** {@inheritDoc} */
    @Override
    public Object getText() {
        Object superobj = super.getText();
        String superstr = superobj == null ? null : superobj.toString();
        if (StringUtils.isBlank(superstr)) {
            return superobj;
        } else if (getValueExpression("text") != null) {
            return superobj;
        }
        String webuistr = JSF.getWebuiString(this, "text");
        if (webuistr == null) {
            webuistr = JSF.getWebuiString(superstr);
        }
        return webuistr == null ? superobj : webuistr;
    }

    /** {@inheritDoc} */
    @Override
    public String getToolTip() {
        String superstr = super.getToolTip();
        if (StringUtils.isBlank(superstr)) {
            return superstr;
        } else if (getValueExpression("toolTip") != null) {
            return superstr;
        }
        String webuistr = JSF.getWebuiString(this, "toolTip");
        return webuistr == null ? superstr : webuistr;
    }

    protected String getString(String key) {
        String clave = this.getClass().getName() + "." + key;
        String valor = Bundle.getString(clave);
        return StringUtils.isBlank(valor) || valor.equals(clave) ? null : valor;
    }
}
