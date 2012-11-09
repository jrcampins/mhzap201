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
import javax.ejb.Local;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

@Local
public interface UtilityProcessMessengerLocal {

    public ObjectMessage send(Serializable message) throws JMSException;

    public ObjectMessage send(Serializable message, Long requestTimeToLive) throws JMSException;

    public ObjectMessage sendRequest(Serializable message) throws JMSException;

    public ObjectMessage sendRequest(Serializable message, Long requestTimeToLive, Long replyTimeToWait) throws JMSException;

    public ObjectMessage sendReply(Serializable message, Message request) throws JMSException;

    public ObjectMessage sendReturn(Message message) throws JMSException;

    public ObjectMessage receiveReply(Message request) throws JMSException;
}
