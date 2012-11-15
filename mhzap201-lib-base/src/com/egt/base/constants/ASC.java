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

/*
 * Application Server Contants (GlassFish/JBoss)
 */
public class ASC {

    /*  
     *  GlassFish
     *      JDBC_JNDI_PREFIX = "";
     *  JBoss
     *      JDBC_JNDI_PREFIX = "java:";
     */
    public static final String JDBC_JNDI_PREFIX = "java:";

    /*  
     *  GlassFish
     *      JMS_JNDI_PREFIX = "";
     *  JBoss
     *      JMS_JNDI_PREFIX = "jms/";
     */
    public static final String JMS_JNDI_PREFIX = "jms/";

}
