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

import com.egt.commons.enums.EnumFormatoInforme;
import java.io.Serializable;
import java.util.Map;

public class ReporterMessage extends AbstractMessage implements Serializable {

    private String informe;

    private String destino;

    private EnumFormatoInforme tipo;

    private String select;

    private Object[] args;

    private Map parameters;

    public ReporterMessage(String informe) {
        this.init();
        this.informe = informe;
    }

    public ReporterMessage(String informe, long funcion) {
        this.init();
        this.informe = informe;
        this.funcion = funcion;
    }

    @Override
    protected void init() {
        super.init();
        informe = null;
        destino = null;
        tipo = EnumFormatoInforme.PDF;
        select = null;
        args = null;
        parameters = null;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public EnumFormatoInforme getTipo() {
        return tipo;
    }

    public void setTipo(EnumFormatoInforme tipo) {
        this.tipo = tipo;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Map getParameters() {
        return parameters;
    }

    public void setParameters(Map parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + id + ", " + funcion + ", " + condicion.name() + ", " + tipo.name() + ", " + informe + ")";
    }
}
