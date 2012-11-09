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

import com.egt.base.constants.CBM2;
import com.egt.base.constants.EAB;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.ExporterMessage;
import com.egt.commons.enums.EnumFormatoArchivo;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.db.util.Exporter;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.egt.ejb.core.jms.UtilityProcessMessengerLocal;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ObjectMessage;
import org.apache.commons.lang.StringUtils;

@Stateless
public class ExporterBrokerBean implements ExporterBrokerLocal {

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private UtilityProcessMessengerLocal messenger;

    @Override
    public ObjectMessage executeExport(String informe, long funcion) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, null, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, EnumFormatoArchivo tipo) {
        return executeExport(informe, funcion, null, tipo, null, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String select) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, select, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, EnumFormatoArchivo tipo, String select) {
        return executeExport(informe, funcion, null, tipo, select, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String select, Object[] args) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, select, args);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo) {
        return executeExport(informe, funcion, destino, tipo, null, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String destino, String select) {
        return executeExport(informe, funcion, destino, EnumFormatoArchivo.CSV, select, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select) {
        return executeExport(informe, funcion, destino, tipo, select, null);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String destino, String select, Object[] args) {
        return executeExport(informe, funcion, destino, EnumFormatoArchivo.CSV, select, args);
    }

    @Override
    public ObjectMessage executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select, Object[] args) {
        Bitacora.trace(this.getClass(), "executeExport", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
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
                    ExporterMessage message = new ExporterMessage(informe, funcion);
                    TLC.getControlador().ponerUsuarioEnMensaje(message);
                    message.setRastro(rastro);
                    message.setMensaje(Bitacora.getTextoMensaje(CBM2.EXPORT_EXECUTION_REQUEST, informe));
                    message.setDestino(destino);
                    message.setTipo(tipo);
                    message.setSelect(select);
                    message.setArgs(args);
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
    public ExporterMessage processExporterMessage(ExporterMessage message) {
        return Exporter.export(message);
    }

}
