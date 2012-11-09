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

import com.egt.base.constants.EAB;
import com.egt.base.jms.enums.EnumJMSApplicationProperty;
import com.egt.base.jms.enums.EnumJMSHeaderField;
import com.egt.base.jms.enums.EnumJMSType;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.util.STP;
import com.egt.ejb.core.AuditorLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

@Stateless
public class MessengerBean implements MessengerLocal {

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private AuditorLocal auditor;

    @Override
    public ObjectMessage post(MessengerContext context, AbstractMessage message) throws Exception {
        return postRequest(context, message, Message.DEFAULT_TIME_TO_LIVE, null);
    }

    @Override
    public ObjectMessage post(MessengerContext context, AbstractMessage message, Long requestTimeToLive) throws Exception {
        return postRequest(context, message, requestTimeToLive, null);
    }

    @Override
    public ObjectMessage postRequest(MessengerContext context, AbstractMessage message) throws Exception {
        long timeToLive = Message.DEFAULT_TIME_TO_LIVE;
        long timeToWait = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.getLongValue();
        return postRequest(context, message, timeToLive, timeToWait);
    }

    @Override
    public ObjectMessage postRequest(MessengerContext context, AbstractMessage message, Long requestTimeToLive, Long replyTimeToWait) throws Exception {
        TLC.getConnection(ds);
        AbstractMessage request = TLC.getControlador().ponerProcesoPendiente(message);
        try {
            return sendRequest(context, request, requestTimeToLive, replyTimeToWait);
        } catch (JMSException ex) {
            Auditor.grabarRastroProceso(request, ex);
            throw ex;
        }
    }

    @Override
    public ObjectMessage send(MessengerContext context, Serializable message) throws JMSException {
        return sendRequest(context, message, Message.DEFAULT_TIME_TO_LIVE, null);
    }

    @Override
    public ObjectMessage send(MessengerContext context, Serializable message, Long requestTimeToLive) throws JMSException {
        return sendRequest(context, message, requestTimeToLive, null);
    }

    @Override
    public ObjectMessage sendRequest(MessengerContext context, Serializable message) throws JMSException {
        long timeToLive = EnumJMSApplicationProperty.SEND_REQUEST_TIME_TO_LIVE.getLongValue();
        long timeToWait = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.getLongValue();
        return sendRequest(context, message, timeToLive, timeToWait);
    }

    @Override
    public ObjectMessage sendRequest(MessengerContext context, Serializable message, Long requestTimeToLive, Long replyTimeToWait) throws JMSException {
        String metodo = "sendRequest";
        Bitacora.trace(this.getClass(), metodo, message, requestTimeToLive, replyTimeToWait);
        Connection connection = null;
        Session session = null;
        MessageProducer producer = null;
        ObjectMessage request = null;
        String TIME_TO_LIVE = EnumJMSApplicationProperty.SEND_REQUEST_TIME_TO_LIVE.name();
        String TIMEOUT = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.name();
        long timeToLive = requestTimeToLive == null ? Message.DEFAULT_TIME_TO_LIVE : requestTimeToLive;
        try {
            connection = context.getConnectionFactory().createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(context.getRequestDestination());
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            producer.setTimeToLive(timeToLive);
            request = session.createObjectMessage(message);
            if (replyTimeToWait == null || context.getReplyDestination() == null) {
                request.setJMSType(EnumJMSType.POST.name());
            } else {
                request.setJMSType(EnumJMSType.REQUEST.name());
                request.setJMSReplyTo(context.getReplyDestination());
                request.setLongProperty(TIMEOUT, replyTimeToWait);
            }
            producer.send(request);
            Bitacora.trace(this.getClass(), metodo, request.getJMSMessageID(), TIME_TO_LIVE + "=" + producer.getTimeToLive());
        } finally {
            if (producer != null) {
                producer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return request;
    }

    @Override
    public void forkRequest(MessengerContext context, AbstractMessage root, List<AbstractMessage> messages) throws JMSException {
        forkRequest(context, root, messages, Message.DEFAULT_TIME_TO_LIVE, Message.DEFAULT_TIME_TO_LIVE);
    }

    @Override
    public void forkRequest(MessengerContext context, AbstractMessage root, List<AbstractMessage> messages, Long requestTimeToLive, Long replyTimeToWait) throws JMSException {
        String metodo = "forkRequest";
        Bitacora.trace(this.getClass(), metodo, root, "size=" + messages.size(), requestTimeToLive, replyTimeToWait);
        Connection connection = null;
        Session session = null;
        MessageProducer producer = null;
        ObjectMessage request;
        String TIME_TO_LIVE = EnumJMSApplicationProperty.SEND_REQUEST_TIME_TO_LIVE.name();
        String TIMEOUT = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.name();
        long timeToLive = requestTimeToLive == null ? Message.DEFAULT_TIME_TO_LIVE : requestTimeToLive;
        try {
            connection = context.getConnectionFactory().createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(context.getRequestDestination());
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            producer.setTimeToLive(timeToLive);
            for (AbstractMessage message : messages) {
                message.copyUsuario(root);
                message.setGrupo(root.getGrupo());
                message.setSuperior(root.getRastro());
                message.setRaiz(root.getRaiz() == null ? root.getRastro() : root.getRaiz());
                message = auditor.grabarRastroProceso(message);
                if (message != null) {
                    request = session.createObjectMessage(message);
                    if (replyTimeToWait == null || context.getReplyDestination() == null) {
                        request.setJMSType(EnumJMSType.POST.name());
                    } else {
                        request.setJMSType(EnumJMSType.REQUEST.name());
                        request.setJMSReplyTo(context.getReplyDestination());
                        request.setLongProperty(TIMEOUT, replyTimeToWait);
                    }
                    producer.send(request);
                    Bitacora.trace(this.getClass(), metodo, request.getJMSMessageID(), TIME_TO_LIVE + "=" + producer.getTimeToLive());
                }
            }
            root.setSubprocesos(messages.size());
        } finally {
            if (producer != null) {
                producer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public ObjectMessage sendReply(MessengerContext context, Serializable message, Message request) throws JMSException {
        String metodo = "sendReply";
        Bitacora.trace(this.getClass(), metodo, message);
        Connection connection = null;
        Session session = null;
        Destination destination;
        MessageProducer producer = null;
        ObjectMessage reply = null;
        String TIMEOUT = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.name();
        long timeToLive; // = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.getLongValue();
        try {
            destination = request.getJMSReplyTo();
            if (destination != null) {
                connection = context.getConnectionFactory().createConnection();
                session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                producer = session.createProducer(destination);
                producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
                reply = session.createObjectMessage(message);
                reply.setJMSType(EnumJMSType.REPLY.name());
                if (request.getJMSCorrelationID() == null) {
                    timeToLive = request.propertyExists(TIMEOUT) ? request.getLongProperty(TIMEOUT) : Message.DEFAULT_TIME_TO_LIVE;
                    reply.setJMSCorrelationID(request.getJMSMessageID());
                } else {
                    timeToLive = Message.DEFAULT_TIME_TO_LIVE;
                    reply.setJMSCorrelationID(request.getJMSCorrelationID());
                }
                producer.setTimeToLive(timeToLive);
                producer.send(reply);
                Bitacora.trace(this.getClass(), metodo, reply.getJMSType(), reply.getJMSMessageID(), reply.getJMSCorrelationID());
            }
        } finally {
            if (producer != null) {
                producer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return reply;
    }

    @Override
    public ObjectMessage sendReturn(MessengerContext context, Message message) throws JMSException {
        String metodo = "sendReturn";
        Bitacora.trace(this.getClass(), metodo, message.getJMSType(), message.getJMSMessageID());
        Connection connection = null;
        Session session = null;
        MessageProducer producer = null;
        ObjectMessage _return = message instanceof ObjectMessage ? (ObjectMessage) message : null;
        try {
            connection = context.getConnectionFactory().createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(context.getReturnDestination());
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            producer.send(message);
            Bitacora.trace(this.getClass(), metodo, message.getJMSType(), message.getJMSMessageID(), message.getJMSCorrelationID());
        } finally {
            if (producer != null) {
                producer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return _return;
    }

    @Override
    public ObjectMessage receiveReply(MessengerContext context, Message request) throws JMSException {
        String metodo = "receiveReply";
        Bitacora.trace(this.getClass(), metodo, request.getJMSType(), request.getJMSMessageID());
        Connection connection = null;
        Session session = null;
        Message message;
        Destination destination;
        MessageConsumer consumer = null;
        ObjectMessage reply = null;
        String selector;
        String TIMEOUT = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.name();
        long timeout = EnumJMSApplicationProperty.RECEIVE_REPLY_TIMEOUT.getLongValue();
        try {
            destination = request.getJMSReplyTo();
            if (destination != null) {
                connection = context.getConnectionFactory().createConnection();
                session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                selector = EnumJMSHeaderField.JMSCorrelationID.name() + "=" + STP.getStringDelimitado(request.getJMSMessageID());
                consumer = session.createConsumer(destination, selector);
                if (request.propertyExists(TIMEOUT)) {
                    timeout = request.getLongProperty(TIMEOUT);
                }
                connection.start();
                message = consumer.receive(timeout);
                if (message == null) {
                    Bitacora.trace(this.getClass(), metodo, selector, TIMEOUT + "=" + timeout);
                } else {
                    Bitacora.trace(this.getClass(), metodo, message.getJMSType(), message.getJMSMessageID());
                    reply = message instanceof ObjectMessage ? (ObjectMessage) message : null;
                }
            }
        } finally {
            if (consumer != null) {
                consumer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return reply;
    }

}
