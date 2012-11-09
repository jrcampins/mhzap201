/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.business.jms;

import com.egt.base.jms.messages.AbstractMessage;
import java.io.Serializable;

public abstract class BusinessProcessMessage extends AbstractMessage implements Serializable {

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + id + ", " + funcion + ", " + condicion.name() + ", " + rastro + ")";
    }
}
