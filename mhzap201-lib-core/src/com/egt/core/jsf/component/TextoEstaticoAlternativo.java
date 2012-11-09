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
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;

public class TextoEstaticoAlternativo extends TextoEstatico {

    public TextoEstaticoAlternativo() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRendered() {
        return super.isRendered() && (this.getSibling() == null || !this.getSibling().isRendered());
    }

    /** {@inheritDoc} */
    @Override
    public Object getText() {
        Object object = super.getText();
        if (object == null && getValueExpression("text") == null) {
            if (this.getSibling() == null) {
            } else if (this.getSibling() instanceof Calendar) {
                return this.getText((Calendar) this.getSibling());
            } else if (this.getSibling() instanceof DropDown) {
                return this.getText((DropDown) this.getSibling());
            } else if (this.getSibling() instanceof TextField) {
                return this.getText((TextField) this.getSibling());
            }
        }
        return object;
    }

    private Object getText(Calendar calendar) {
//      return STP.getString(calendar.getSelectedDate());
        return calendar.getSelectedDate();
    }

    private Object getText(DropDown dropDown) {
        Option opcion = JSF.getOpcion(dropDown);
        return opcion == null ? null : opcion.getLabel();
    }

    private Object getText(TextField textField) {
//      return STP.getString(textField.getText());
        return textField.getText();
    }
}
