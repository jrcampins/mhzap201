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

    public static final String ENT_APP_VAR_PREFFIX = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase() + "_";

    public static final String ENT_APP_CONTENT_ROOT_DIR = ENT_APP_VAR_PREFFIX + EAC.CONTENT_ROOT_DIR;

    public static final String ENT_APP_RESOURCES_DIR = ENT_APP_VAR_PREFFIX + EAC.RESOURCES_DIR;

    public static final String ENT_APP_BOOTSTRAPPING_PROPERTIES_FILE = ENT_APP_VAR_PREFFIX + "BOOTSTRAPPING_PROPERTIES_FILE";

    public static final String ENT_APP_CONFIGURATION_PROPERTIES_FILE = ENT_APP_VAR_PREFFIX + "CONFIGURATION_PROPERTIES_FILE";

    public static final String ENT_APP_JDBC_DRIVER = ENT_APP_VAR_PREFFIX + EAC.JDBC_DRIVER;

    public static final String ENT_APP_JDBC_URL = ENT_APP_VAR_PREFFIX + EAC.JDBC_URL;

    public static final String ENT_APP_JDBC_USER = ENT_APP_VAR_PREFFIX + EAC.JDBC_USER;

    public static final String ENT_APP_JDBC_PASSWORD = ENT_APP_VAR_PREFFIX + EAC.JDBC_PASSWORD;

    public static final String ENT_APP_JNDI_EJB_PERSISTENCE_PATTERN = ENT_APP_VAR_PREFFIX + EAC.JNDI_EJB_PERSISTENCE_PATTERN;

    public static final String ENT_APP_VELOCITY_PROPERTIES_FILE = ENT_APP_VAR_PREFFIX + EAC.VELOCITY_PROPERTIES_FILE;

    public static final String ENT_APP_VELOCITY_FILE_RESOURCE_LOADER_PATH = ENT_APP_VAR_PREFFIX + EAC.VELOCITY_FILE_RESOURCE_LOADER_PATH;

    public static final String JAVA_PARAMETER_LIST = "JAVA_PARAMETER_LIST";

    public static final String EXPORT_RUNNER_LOG = "EXPORT_RUNNER_LOG";

    public static final String REPORT_RUNNER_LOG = "REPORT_RUNNER_LOG";

    public static final String SQLPRC_RUNNER_LOG = "SQLPRC_RUNNER_LOG";

}
