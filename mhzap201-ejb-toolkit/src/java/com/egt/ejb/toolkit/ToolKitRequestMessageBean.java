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

import com.egt.base.constants.EAB;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
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

@MessageDriven(mappedName = "jms/ToolKitRequestMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
//  @ActivationConfigProperty(propertyName = "endpointExceptionRedeliveryAttempts", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "endpointExceptionRedeliveryInterval", propertyValue = "10"),
//  @ActivationConfigProperty(propertyName = "endpointPoolMaxSize", propertyValue = "4"),
//  @ActivationConfigProperty(propertyName = "endpointPoolResizeCount", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "endpointPoolResizeTimeout", propertyValue = "300"),
//  @ActivationConfigProperty(propertyName = "endpointPoolSteadySize", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "sendUndeliverableMsgsToDMQ", propertyValue = "true"),
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/ToolKitRequestMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ToolKitRequestMessageBean implements MessageListener {

    public ToolKitRequestMessageBean() {
    }

    @Resource
    private MessageDrivenContext mdc;

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private ToolKitBrokerLocal broker;

    @EJB
    private ToolKitMessengerLocal messenger;

    @Override
    public void onMessage(Message message) {
//      Utils.traceContext();
        TLC.iniciar();
        try {
            Bitacora.traceMessage(this.getClass(), "onMessage", message);
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Object object = objectMessage.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
                if (object instanceof ToolKitMessage) {
                    if (message.getJMSRedelivered()) {
                        this.sendReturn(message);
                    } else {
//                      TLC.setConnection(ds.getConnection());
                        ToolKitMessage solicitud = (ToolKitMessage) object;
                        ToolKitMessage respuesta = broker.processToolKitMessage(solicitud);
                        this.sendReply(respuesta, objectMessage);
                    }
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
