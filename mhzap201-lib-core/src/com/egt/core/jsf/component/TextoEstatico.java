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
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.WebuiInput;

public abstract class TextoEstatico extends StaticText {

    public TextoEstatico() {
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
}
