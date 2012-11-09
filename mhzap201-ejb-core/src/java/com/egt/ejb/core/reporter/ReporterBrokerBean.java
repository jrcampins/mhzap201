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

import com.egt.base.constants.CBM2;
import com.egt.base.constants.EAB;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.ReporterMessage;
import com.egt.commons.enums.EnumFormatoInforme;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.db.util.Reporter;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.egt.ejb.core.jms.UtilityProcessMessengerLocal;
import java.util.Map;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ObjectMessage;
import org.apache.commons.lang.StringUtils;

@Stateless
public class ReporterBrokerBean implements ReporterBrokerLocal {

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private UtilityProcessMessengerLocal messenger;

    @Override
    public ObjectMessage executeReport(String informe, long funcion) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, null, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo) {
        return executeReport(informe, funcion, null, tipo, null, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String select) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, select, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, Map parametros) {
//      return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, null, Reporter.getReportParametersArray(parametros));
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, null, null, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo, String select) {
        return executeReport(informe, funcion, null, tipo, select, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, EnumFormatoInforme tipo, Map parametros) {
//      return executeReport(informe, funcion, null, tipo, null, Reporter.getReportParametersArray(parametros));
        return executeReport(informe, funcion, null, tipo, null, null, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String select, Object[] args) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, select, args, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String select, Object[] args, Map parametros) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, select, args, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo) {
        return executeReport(informe, funcion, destino, tipo, null, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, String select) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, select, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, Map parametros) {
//      return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, null, Reporter.getReportParametersArray(parametros));
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, null, null, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select) {
        return executeReport(informe, funcion, destino, tipo, select, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, Map parametros) {
//      return executeReport(informe, funcion, destino, tipo, null, Reporter.getReportParametersArray(parametros));
        return executeReport(informe, funcion, destino, tipo, null, null, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, String select, Object[] args) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, select, args, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, String select, Object[] args, Map parametros) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, select, args, parametros);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args) {
        return executeReport(informe, funcion, destino, tipo, select, args, null);
    }

    @Override
    public ObjectMessage executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args, Map parametros) {
        Bitacora.trace(this.getClass(), "executeReport", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
        Bitacora.trace(select);
        Utils.traceObjectArray(args);
        Long rastro = null;
        ObjectMessage reply = null;
        try {
            informe = StringUtils.trimToEmpty(informe);
            if (STP.esIdentificadorArchivoValido(informe)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    TLC.getConnection(ds);
                    rastro = TLC.getControlador().ponerInformePendiente(funcion);
                    ReporterMessage message = new ReporterMessage(informe, funcion);
                    TLC.getControlador().ponerUsuarioEnMensaje(message);
                    message.setRastro(rastro);
                    message.setMensaje(Bitacora.getTextoMensaje(CBM2.REPORT_EXECUTION_REQUEST, informe));
                    message.setDestino(destino);
                    message.setTipo(tipo);
                    message.setSelect(select);
                    message.setArgs(args);
                    message.setParameters(parametros);
                    reply = messenger.send(message);
                    TLC.getBitacora().info(message.getMensaje());
                } else {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.FUNCION_NO_AUTORIZADA, informe));
                }
            } else {
                throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.IDENTIFICADOR_ARCHIVO_INVALIDO, informe));
            }
        } catch (Exception ex) {
            EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            String mensaje = ThrowableUtils.getString(ex);
            Auditor.grabarRastroInforme(rastro, condicion, null, mensaje);
            TLC.getBitacora().error(mensaje);
        }
        return reply;
    }

    @Override
    public ReporterMessage processReporterMessage(ReporterMessage message) {
        return Reporter.report(message);
    }

}
