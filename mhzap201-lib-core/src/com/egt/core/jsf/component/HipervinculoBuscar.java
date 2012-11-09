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

import com.sun.webui.jsf.component.TextField;
import org.apache.commons.lang.StringUtils;

public class HipervinculoBuscar extends Hipervinculo {

    public HipervinculoBuscar() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRendered() {
        return super.isRendered() && this.isRenderedToo();
    }

    private boolean isRenderedToo() {
        String script = this.getOnClick();
        return StringUtils.isBlank(script)
                ? false
                : this.getSibling() instanceof TextField
                ? this.getSibling().isRendered() && !((TextField) this.getSibling()).isReadOnly()
                : true;
    }

    /** {@inheritDoc} */
    @Override
    public Object getText() {
        Object object = super.getText();
        return object != null ? object : this.getString("text");
    }

    /** {@inheritDoc} */
    @Override
    public String getToolTip() {
        String string = super.getToolTip();
        return string != null ? string : this.getString("toolTip");
    }
}
