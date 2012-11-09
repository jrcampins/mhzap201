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

public class TextoEstaticoComplementario extends TextoEstatico implements ComponenteComplementario {

    public TextoEstaticoComplementario() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRendered() {
        return super.isRendered() && this.isRenderedToo();
    }

    private boolean isRenderedToo() {
        Object object = this.getText();
        return object != null && StringUtils.isNotBlank(object.toString());
    }

    /** {@inheritDoc} */
    @Override
    public Object getText() {
        Object object = super.getText();
        if (this.getSibling() instanceof TextField) {
            TextField textField = (TextField) this.getSibling();
            if (textField.isRendered() || (object == null && getValueExpression("text") == null)) {
                return textField.getToolTip();
            }
        }
        return object;
    }
}
