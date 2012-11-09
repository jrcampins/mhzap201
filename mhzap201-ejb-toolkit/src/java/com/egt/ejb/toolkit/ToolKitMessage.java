/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

import com.egt.base.jms.messages.AbstractMessage;
import java.io.Serializable;

public class ToolKitMessage extends AbstractMessage implements Serializable {

    private EnumToolKitMessageType tipo;

    private Long recurso;

    public ToolKitMessage(EnumToolKitMessageType tipo, long funcion) {
        this.init();
        this.tipo = tipo;
        this.funcion = funcion;
    }

    @Override
    protected void init() {
        super.init();
        tipo = null;
        recurso = null;
    }

    public EnumToolKitMessageType getTipo() {
        return tipo;
    }

    public void setTipo(EnumToolKitMessageType tipo) {
        this.tipo = tipo;
    }

    public Long getRecurso() {
        return recurso;
    }

    public void setRecurso(Long recurso) {
        this.recurso = recurso;
    }

    @Override
    public String toString() {
//      return this.getClass().getSimpleName() + "(" + id + ", " + funcion + ", " + condicion.name() + ", " + tipo.name() + ", " + recurso + ")";
        return tipo.name() + (recurso == null ? "" : "#" + recurso);
    }
}
