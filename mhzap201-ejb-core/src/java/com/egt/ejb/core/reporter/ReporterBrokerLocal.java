/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.core.reporter;

import com.egt.base.jms.messages.ReporterMessage;
import com.egt.commons.enums.EnumFormatoInforme;
import java.util.Map;
import javax.ejb.Local;
import javax.jms.ObjectMessage;

@Local
public interface ReporterBrokerLocal {

    public ObjectMessage executeReport(String informe, long funcion);

    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo);

    public ObjectMessage executeReport(String informe, long funcion, String select);

    public ObjectMessage executeReport(String informe, long funcion, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo, String select);

    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, String select, Object[] args);

    public ObjectMessage executeReport(String informe, long funcion, String select, Object[] args, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo);

    public ObjectMessage executeReport(String informe, long funcion, String destino, String select);

    public ObjectMessage executeReport(String informe, long funcion, String destino, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select);

    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, String destino, String select, Object[] args);

    public ObjectMessage executeReport(String informe, long funcion, String destino, String select, Object[] args, Map parametros);

    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args);

    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args, Map parametros);

    public ReporterMessage processReporterMessage(ReporterMessage jasperReportMessage);
}
