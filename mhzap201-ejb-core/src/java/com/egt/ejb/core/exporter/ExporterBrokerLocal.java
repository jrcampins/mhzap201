/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.core.exporter;

import com.egt.base.jms.messages.ExporterMessage;
import com.egt.commons.enums.EnumFormatoArchivo;
import javax.ejb.Local;
import javax.jms.ObjectMessage;

@Local
public interface ExporterBrokerLocal {

    public ObjectMessage executeExport(String informe, long funcion);

    public ObjectMessage executeExport(String informe, long funcion, EnumFormatoArchivo tipo);

    public ObjectMessage executeExport(String informe, long funcion, String select);

    public ObjectMessage executeExport(String informe, long funcion, EnumFormatoArchivo tipo, String select);

    public ObjectMessage executeExport(String informe, long funcion, String select, Object[] args);

    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo);

    public ObjectMessage executeExport(String informe, long funcion, String destino, String select);

    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select);

    public ObjectMessage executeExport(String informe, long funcion, String destino, String select, Object[] args);

    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select, Object[] args);

    public ExporterMessage processExporterMessage(ExporterMessage message);
}
