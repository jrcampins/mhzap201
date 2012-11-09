/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.core.jms;

import com.egt.base.constants.EAB;
import com.egt.base.jms.messages.ExporterMessage;
import com.egt.base.jms.messages.ReporterMessage;
import com.egt.base.jms.messages.SqlAgentMessage;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.ejb.core.exporter.ExporterBrokerLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import java.io.Serializable;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(mappedName = "jms/UtilityProcessRequestMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
//
//  GlassFish/JBoss conditional compilation
//
//  if GlassFish: destination property must NOT be specified
//
//  if JBoss:
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/UtilityProcessRequestMessageQueue"),
//
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/UtilityProcessRequestMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class UtilityProcessRequestMessageBean implements MessageListener {

    public UtilityProcessRequestMessageBean() {
    }

    @Resource
    private MessageDrivenContext mdc;

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private UtilityProcessMessengerLocal messenger;

    @EJB
    private ExporterBrokerLocal exporter;

    @EJB
    private ReporterBrokerLocal reporter;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;

    @Override
    public void onMessage(Message message) {
//      Utils.traceContext();
        TLC.iniciar();
        try {
            Bitacora.trace(this.getClass(), "onMessage", message.getJMSType(), message.getJMSMessageID(), message.getJMSCorrelationID());
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Object object = objectMessage.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
                if (message.getJMSRedelivered()) {
                    this.sendReturn(message);
                } else if (object instanceof ExporterMessage) {
//                  TLC.setConnection(ds.getConnection());
                    ExporterMessage solicitud = (ExporterMessage) object;
                    ExporterMessage respuesta = exporter.processExporterMessage(solicitud);
                    this.sendReply(respuesta, objectMessage);
                } else if (object instanceof ReporterMessage) {
//                  TLC.setConnection(ds.getConnection());
                    ReporterMessage solicitud = (ReporterMessage) object;
                    ReporterMessage respuesta = reporter.processReporterMessage(solicitud);
                    this.sendReply(respuesta, objectMessage);
                } else if (object instanceof SqlAgentMessage) {
//                  TLC.setConnection(ds.getConnection());
                    SqlAgentMessage solicitud = (SqlAgentMessage) object;
                    SqlAgentMessage respuesta = sqlAgent.processSqlAgentMessage(solicitud);
                    this.sendReply(respuesta, objectMessage);
                } else {
                    this.sendReturn(message);
                }
            } else {
                this.sendReturn(message);
            }
        } catch (Throwable throwable) {
            mdc.setRollbackOnly();
            Bitacora.logError(throwable);
        }
        TLC.destruir();
    }

    private void sendReply(Serializable message, Message request) {
        try {
            messenger.sendReply(message, request);
        } catch (JMSException throwable) {
            Bitacora.logError(throwable);
        }
    }

    private void sendReturn(Message message) {
        try {
            messenger.sendReturn(message);
        } catch (JMSException throwable) {
            Bitacora.logError(throwable);
        }
    }

}
