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

public class EAB {

    public static final String ENTERPRISE_APPLICATION_CODE = "mhzap201";

    public static final String ENTERPRISE_APPLICATION_NAME = "Gestión del Programa de Pensión Alimentaria";

    public static final String ENTERPRISE_APPLICATION_JDBC_DATABASE = "jdbc/" + ENTERPRISE_APPLICATION_CODE;

//
//  GlassFish/JBoss conditional compilation
//
//  if GlassFish:
//  public static final String ENTERPRISE_APPLICATION_JNDI_DATABASE = "jdbc/" + ENTERPRISE_APPLICATION_CODE;
//
//  if JBoss:
//  public static final String ENTERPRISE_APPLICATION_JNDI_DATABASE = "java:/jdbc/" + ENTERPRISE_APPLICATION_CODE;
//
    public static final String ENTERPRISE_APPLICATION_JNDI_DATABASE = "java:/jdbc/" + ENTERPRISE_APPLICATION_CODE;

}
