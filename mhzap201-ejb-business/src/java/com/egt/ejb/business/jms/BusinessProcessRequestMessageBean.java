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

import com.egt.base.constants.ASC;
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

@MessageDriven(mappedName = "jms/BusinessProcessRequestMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = ASC.JMS_JNDI_PREFIX + "BusinessProcessRequestMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class BusinessProcessRequestMessageBean implements MessageListener {

    public BusinessProcessRequestMessageBean() {
    }

    @Resource
    private MessageDrivenContext mdc;

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private BusinessProcessBrokerLocal broker;

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
                if (object instanceof BusinessProcessMessage) {
                    BusinessProcessMessage solicitud = (BusinessProcessMessage) object;
                    BusinessProcessMessage respuesta;
                    if (message.getJMSRedelivered()) {
                        if (message.getJMSReplyTo() == null) {
                            this.sendReturn(message);
                        } else {
                            respuesta = broker.processRedeliveredBusinessProcessMessage(solicitud);
                            this.sendReply(respuesta, objectMessage);
                        }
                    } else {
//                      TLC.setConnection(ds.getConnection());
                        respuesta = broker.processBusinessProcessMessage(solicitud);
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
