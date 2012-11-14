/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.constants;

import com.egt.base.constants.EAB;

public class SEV {

    private static final String EAC2UC = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase();

    public static final String ENTERPRISE_APPLICATION_DIR = EAC2UC + "_DIR";

    public static final String ENTERPRISE_APPLICATION_DOC = EAC2UC + "_DOC";

//  public static final String ENTERPRISE_APPLICATION_EAR = EAC2UC + "_EAR";
//
//  public static final String ENTERPRISE_APPLICATION_WAR = EAC2UC + "_WAR";
//
    public static final String ENTERPRISE_APPLICATION_JDBC_DRIVER = EAC2UC + "_" + EAC.JDBC_DRIVER;

    public static final String ENTERPRISE_APPLICATION_JDBC_URL = EAC2UC + "_" + EAC.JDBC_URL;

    public static final String ENTERPRISE_APPLICATION_JDBC_USER = EAC2UC + "_" + EAC.JDBC_USER;

    public static final String ENTERPRISE_APPLICATION_JDBC_PASSWORD = EAC2UC + "_" + EAC.JDBC_PASSWORD;

    public static final String ENTERPRISE_APPLICATION_PROPERTIES = EAC2UC + "_PROPERTIES";

    public static final String ENTERPRISE_VELOCITY_PROPERTIES = EAC2UC + "_VELOCITY_PROPERTIES";

    public static final String ENTERPRISE_JNDI_EJB_PERSISTENCE_PATTERN = EAC2UC + "_" + EAC.JNDI_EJB_PERSISTENCE_PATTERN;

    public static final String ENTERPRISE_VELOCITY_FILE_RESOURCE_LOADER_PATH = EAC2UC + "_" + EAC.VELOCITY_FILE_RESOURCE_LOADER_PATH;

    public static final String JAVA_PARAMETER_LIST = "JAVA_PARAMETER_LIST";

    public static final String EXPORT_RUNNER_LOG = "EXPORT_RUNNER_LOG";

    public static final String REPORT_RUNNER_LOG = "REPORT_RUNNER_LOG";

    public static final String SQLPRC_RUNNER_LOG = "SQLPRC_RUNNER_LOG";

}
