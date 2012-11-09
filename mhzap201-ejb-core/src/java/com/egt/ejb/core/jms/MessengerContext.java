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

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

public class MessengerContext {

    private ConnectionFactory connectionFactory;

    private Destination requestDestination;

    private Destination replyDestination;

    private Destination returnDestination;

    public MessengerContext() {
        connectionFactory = null;
        requestDestination = null;
        replyDestination = null;
        returnDestination = null;
    }

    public MessengerContext(ConnectionFactory connectionFactory, Destination requestDestination, Destination replyDestination, Destination returnDestination) {
        this.connectionFactory = connectionFactory;
        this.requestDestination = requestDestination;
        this.replyDestination = replyDestination;
        this.returnDestination = returnDestination;
    }

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Destination getReplyDestination() {
        return replyDestination;
    }

    public void setReplyDestination(Destination replyDestination) {
        this.replyDestination = replyDestination;
    }

    public Destination getRequestDestination() {
        return requestDestination;
    }

    public void setRequestDestination(Destination requestDestination) {
        this.requestDestination = requestDestination;
    }

    public Destination getReturnDestination() {
        return returnDestination;
    }

    public void setReturnDestination(Destination returnDestination) {
        this.returnDestination = returnDestination;
    }
}
