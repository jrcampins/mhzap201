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

import com.egt.base.jms.messages.AbstractMessage;
import com.egt.ejb.core.jms.MessengerContext;
import com.egt.ejb.core.jms.MessengerLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

@Stateless
public class BusinessProcessMessengerBean implements BusinessProcessMessengerLocal {

    @Resource(name = "jms/BusinessProcessMessageFactory", mappedName = "java:/jms/BusinessProcessMessageFactory")
    private ConnectionFactory connectionFactory;

    @Resource(name = "jms/BusinessProcessRequestMessageQueue", mappedName = "java:/jms/BusinessProcessRequestMessageQueue")
    private Queue requestQueue;

    @Resource(name = "jms/BusinessProcessReplyMessageQueue", mappedName = "java:/jms/BusinessProcessReplyMessageQueue")
    private Queue replyQueue;

    @Resource(name = "jms/BusinessProcessReturnMessageQueue", mappedName = "java:/jms/BusinessProcessReturnMessageQueue")
    private Queue returnQueue;

    @EJB
    MessengerLocal messenger;

    @Override
    public ObjectMessage post(AbstractMessage message) throws Exception {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.post(context, message);
    }

    @Override
    public ObjectMessage post(AbstractMessage message, Long requestTimeToLive) throws Exception {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.post(context, message, requestTimeToLive);
    }

    @Override
    public ObjectMessage postRequest(AbstractMessage message) throws Exception {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.postRequest(context, message);
    }

    @Override
    public ObjectMessage postRequest(AbstractMessage message, Long requestTimeToLive, Long replyTimeToWait) throws Exception {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        return messenger.postRequest(context, message, requestTimeToLive, replyTimeToWait);
    }

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
    public void forkRequest(AbstractMessage root, List<AbstractMessage> messages) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        messenger.forkRequest(context, root, messages);
    }

    @Override
    public void forkRequest(AbstractMessage root, List<AbstractMessage> messages, Long requestTimeToLive, Long replyTimeToWait) throws JMSException {
        MessengerContext context = new MessengerContext(connectionFactory, requestQueue, replyQueue, returnQueue);
        messenger.forkRequest(context, root, messages, requestTimeToLive, replyTimeToWait);
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
