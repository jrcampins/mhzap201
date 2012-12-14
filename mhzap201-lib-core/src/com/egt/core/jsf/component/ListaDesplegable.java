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
import com.sun.webui.jsf.component.DropDown;
import org.apache.commons.lang.StringUtils;

public class ListaDesplegable extends DropDown {

    public ListaDesplegable() {
        super();
    }

    private boolean unaware = true;

    private TextoEstaticoAlternativo sibling = null;

    synchronized protected TextoEstaticoAlternativo getSibling() {
        if (unaware && sibling == null && this.getId() != null) {
            unaware = false;
            sibling = JSF.getTextoEstaticoAlternativo(this);
        }
        return sibling;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRendered() {
        return this.getSibling() == null
                ? super.isRendered()
                : super.isRendered() && !super.isDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getToolTip() {
        String superstr = super.getToolTip();
        if (StringUtils.isNotBlank(superstr) && getValueExpression("toolTip") == null) {
            if (superstr.startsWith("BundleParametros.")) {
                int i = superstr.indexOf('.');
                String key = superstr.substring(i + 1);
                return BundleParametros.getToolTip(key);
            }
        }
        return superstr;
    }

}
