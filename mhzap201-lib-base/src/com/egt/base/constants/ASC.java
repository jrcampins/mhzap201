/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.base.constants;

/**
 * Application Server Constants (GlassFish/JBoss)
 */
public class ASC {

    private static final boolean JBOSS = false;

    public static final String JDBC_JNDI_PREFIX = JBOSS ? "java:/" : "";

    public static final String JMS_JNDI_PREFIX = JBOSS ? "jms/" : "";

}
