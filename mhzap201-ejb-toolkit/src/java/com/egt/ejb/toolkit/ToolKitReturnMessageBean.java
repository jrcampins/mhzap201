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

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(mappedName = "jms/ToolKitReturnMessageQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
//  @ActivationConfigProperty(propertyName = "endpointExceptionRedeliveryAttempts", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "endpointExceptionRedeliveryInterval", propertyValue = "10"),
//  @ActivationConfigProperty(propertyName = "endpointPoolMaxSize", propertyValue = "4"),
//  @ActivationConfigProperty(propertyName = "endpointPoolResizeCount", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "endpointPoolResizeTimeout", propertyValue = "300"),
//  @ActivationConfigProperty(propertyName = "endpointPoolSteadySize", propertyValue = "1"),
//  @ActivationConfigProperty(propertyName = "sendUndeliverableMsgsToDMQ", propertyValue = "true"),
//  @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/ToolKitReturnMessageQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ToolKitReturnMessageBean implements MessageListener {

    public ToolKitReturnMessageBean() {
    }

    @Override
    public void onMessage(Message message) {
        TLC.iniciar();
        try {
            Bitacora.traceMessage(this.getClass(), "onMessage", message);
            if (message instanceof ObjectMessage) {
                ObjectMessage request = (ObjectMessage) message;
                Object object = request.getObject();
                Bitacora.trace(this.getClass(), "onMessage", object);
            }
        } catch (Throwable throwable) {
            Bitacora.logTrace(throwable);
        }
        TLC.destruir();
    }

}
