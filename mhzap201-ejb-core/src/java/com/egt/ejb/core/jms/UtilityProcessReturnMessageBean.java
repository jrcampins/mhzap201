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

import com.egt.base.constants.ASC;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(mappedName = "jms/UtilityProcessReturnMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = ASC.JMS_JNDI_PREFIX + "UtilityProcessReturnMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class UtilityProcessReturnMessageBean implements MessageListener {

    public UtilityProcessReturnMessageBean() {
    }

    @Override
    public void onMessage(Message message) {
        TLC.iniciar();
        try {
            Bitacora.trace(this.getClass(), "onMessage", message.getJMSType(), message.getJMSMessageID(), message.getJMSCorrelationID());
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Object object = objectMessage.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
            }
        } catch (Throwable throwable) {
            Bitacora.logTrace(throwable);
        }
        TLC.destruir();
    }

}
