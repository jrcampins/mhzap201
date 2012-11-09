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

import com.egt.base.jms.messages.AbstractMessage;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

@Local
public interface MessengerLocal {

    public ObjectMessage post(MessengerContext context, AbstractMessage message) throws Exception;

    public ObjectMessage post(MessengerContext context, AbstractMessage message, Long requestTimeToLive) throws Exception;

    public ObjectMessage postRequest(MessengerContext context, AbstractMessage message) throws Exception;

    public ObjectMessage postRequest(MessengerContext context, AbstractMessage message, Long requestTimeToLive, Long replyTimeToWait) throws Exception;

    public ObjectMessage send(MessengerContext context, Serializable message) throws JMSException;

    public ObjectMessage send(MessengerContext context, Serializable message, Long requestTimeToLive) throws JMSException;

    public ObjectMessage sendRequest(MessengerContext context, Serializable message) throws JMSException;

    public ObjectMessage sendRequest(MessengerContext context, Serializable message, Long requestTimeToLive, Long replyTimeToWait) throws JMSException;

    public void forkRequest(MessengerContext context, AbstractMessage root, List<AbstractMessage> messages) throws JMSException;

    public void forkRequest(MessengerContext context, AbstractMessage root, List<AbstractMessage> messages, Long requestTimeToLive, Long replyTimeToWait) throws JMSException;

    public ObjectMessage sendReply(MessengerContext context, Serializable message, Message request) throws JMSException;

    public ObjectMessage sendReturn(MessengerContext context, Message message) throws JMSException;

    public ObjectMessage receiveReply(MessengerContext context, Message request) throws JMSException;
}
