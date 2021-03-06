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
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(mappedName = "jms/BusinessProcessReplyMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "messageSelector", propertyValue = "JMSCorrelationID IS NULL"),
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = ASC.JMS_JNDI_PREFIX + "BusinessProcessReplyMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class BusinessProcessReplyMessageBean implements MessageListener {

    public BusinessProcessReplyMessageBean() {
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public void onMessage(Message message) {
        TLC.iniciar();
        try {
            Bitacora.traceMessage(this.getClass(), "onMessage", message);
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Object object = objectMessage.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
                if (object instanceof BusinessProcessMessage) {
                    messenger.sendReturn(message);
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
