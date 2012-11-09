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

import java.io.Serializable;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

@Stateless
public class UtilityProcessMessengerBean implements UtilityProcessMessengerLocal {

    @Resource(name = "jms/UtilityProcessMessageFactory", mappedName = "java:/jms/UtilityProcessMessageFactory")
    private ConnectionFactory connectionFactory;

    @Resource(name = "jms/UtilityProcessRequestMessageQueue", mappedName = "java:/jms/UtilityProcessRequestMessageQueue")
    private Queue requestQueue;

    @Resource(name = "jms/UtilityProcessReplyMessageQueue", mappedName = "java:/jms/UtilityProcessReplyMessageQueue")
    private Queue replyQueue;

    @Resource(name = "jms/UtilityProcessReturnMessageQueue", mappedName = "java:/jms/UtilityProcessReturnMessageQueue")
    private Queue returnQueue;

    @EJB
    MessengerLocal messenger;

    @Override
    public ObjectMessage send(Serializable message) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.send(context, message);
    }

    @Override
    public ObjectMessage send(Serializable message, Long requestTimeToLive) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.send(context, message, requestTimeToLive);
    }

    @Override
    public ObjectMessage sendRequest(Serializable message) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.sendRequest(context, message);
    }

    @Override
    public ObjectMessage sendRequest(Serializable message, Long requestTimeToLive, Long replyTimeToWait) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.sendRequest(context, message, requestTimeToLive, replyTimeToWait);
    }

    @Override
    public ObjectMessage sendReply(Serializable message, Message request) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.sendReply(context, message, request);
    }

    @Override
    public ObjectMessage sendReturn(Message message) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.sendReturn(context, message);
    }

    @Override
    public ObjectMessage receiveReply(Message request) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.receiveReply(context, request);
    }
}
