/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.base.jms.messages;

import java.io.Serializable;

public class SqlAgentMessage extends AbstractMessage implements Serializable {

    private String procedimiento;

    private Object[] args;

    public SqlAgentMessage(String procedimiento) {
        this.init();
        this.procedimiento = procedimiento;
    }

    public SqlAgentMessage(String procedimiento, long funcion) {
        this.init();
        this.procedimiento = procedimiento;
        this.funcion = funcion;
    }

    @Override
    protected void init() {
        super.init();
        procedimiento = null;
        args = null;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String informe) {
        this.procedimiento = informe;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + id + ", " + funcion + ", " + condicion.name() + ", " + procedimiento + ")";
    }
}
