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

import com.egt.base.jms.messages.ExporterMessage;
import com.egt.base.jms.messages.ReporterMessage;
import com.egt.base.jms.messages.SqlAgentMessage;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(mappedName = "jms/UtilityProcessReplyMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "messageSelector", propertyValue = "JMSCorrelationID IS NULL"),
//
//  GlassFish/JBoss conditional compilation
//
//  if GlassFish: destination property must not contain special characters
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "UtilityProcessReplyMessageQueue"),
//
//  if JBoss:
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/UtilityProcessReplyMessageQueue"),
//
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/UtilityProcessReplyMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class UtilityProcessReplyMessageBean implements MessageListener {

    public UtilityProcessReplyMessageBean() {
    }

    @EJB
    private UtilityProcessMessengerLocal messenger;

    @Override
    public void onMessage(Message message) {
        TLC.iniciar();
        try {
            Bitacora.trace(this.getClass(), "onMessage", message.getJMSType(), message.getJMSMessageID(), message.getJMSCorrelationID());
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Object object = objectMessage.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
                if (object instanceof ExporterMessage) {
                    ExporterMessage respuesta = (ExporterMessage) object;
                    Bitacora.trace(this.getClass(), "onMessage", respuesta);
                } else if (object instanceof ReporterMessage) {
                    ReporterMessage respuesta = (ReporterMessage) object;
                    Bitacora.trace(this.getClass(), "onMessage", respuesta);
                } else if (object instanceof SqlAgentMessage) {
                    SqlAgentMessage respuesta = (SqlAgentMessage) object;
                    Bitacora.trace(this.getClass(), "onMessage", respuesta);
                } else {
                    messenger.sendReturn(message);
                }
            } else {
                messenger.sendReturn(message);
            }
        } catch (Throwable throwable) {
            Bitacora.logTrace(throwable);
        }
        TLC.destruir();
    }

}
