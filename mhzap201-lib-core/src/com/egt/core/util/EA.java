/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.util;

import com.egt.base.constants.EAB;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;

public class EA {

    // <editor-fold defaultstate="collapsed" desc="private static final">
    private static final String LCC = "$LCC";

    private static final String UCC = "$UCC";

    private static final String DIR = "$DIR";

    private static final String DOC = "$DOC";

    private static final String JDBC_DRIVER = "$" + EAC.JDBC_DRIVER;

    private static final String JDBC_URL = "$" + EAC.JDBC_URL;

    private static final String JDBC_USER = "$" + EAC.JDBC_USER;

    private static final String JDBC_PASSWORD = "$" + EAC.JDBC_PASSWORD;

    private static final String EYE_CATCHER = "********************";

    private static boolean ikq = false;

    private static boolean pdq = false;

    private static String lcc = EAB.ENTERPRISE_APPLICATION_CODE.toLowerCase();

    private static String ucc = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase();

    private static String dir;

    private static String doc;

    private static String epf;

    private static String cpf;

    private static String vpf;

    private static String vlp;

    private static String jdbc_driver;

    private static String jdbc_url;

    private static String jdbc_user;

    private static String jdbc_password;

    private static Properties environment;

    private static Properties configuration;

    private static final int CHECK_NOT_BLANK = 0;

    private static final int CHECK_EXIST = 1;

    private static final int CHECK_DIRECTORY = 2;

    private static final int CHECK_FILE = 3;

    private static final int CHECK_PATH = 4;
    // </editor-fold>

    static {
        init();
    }

    private static void init() {
        printSystemProperties();
        loadEnvironmentPropertiesFile();
        loadEnvironmentVariables();
        String sep = System.getProperties().getProperty("file.separator");
        String osname1 = System.getProperties().getProperty("os.name");
        String osname2 = StringUtils.containsIgnoreCase(osname1, "windows") ? "windows" : "linux";
        String rootdir = System.getProperties().getProperty("com.sun.aas.instanceRoot");
        String homedir = System.getProperties().getProperty("jboss.home.dir");
        String userdir = System.getProperties().getProperty("user.dir");
        boolean windows = osname2.equals("windows");
        boolean glassfish = StringUtils.isNotBlank(rootdir);
        boolean jboss = StringUtils.isNotBlank(homedir);
        if (StringUtils.isBlank(dir)) {
            dir = (windows ? "C:" : "/opt") + sep + lcc + sep + "resources";
            Bitacora.trace(SEV.ENTERPRISE_APPLICATION_DIR + "=" + dir);
            isDirectory(dir);
        }
        if (StringUtils.isBlank(doc)) {
            if (glassfish) {
                doc = rootdir + sep + "docroot";
            } else if (jboss) {
                doc = homedir + sep + "welcome-content";
            } else {
                doc = userdir + sep + "ROOT";
            }
            Bitacora.trace(SEV.ENTERPRISE_APPLICATION_DOC + "=" + doc);
            isDirectory(doc);
        }
        if (StringUtils.isBlank(cpf)) {
            cpf = dir + sep + "config" + sep + osname2 + sep + lcc + "." + "properties";
            Bitacora.trace(SEV.ENTERPRISE_APPLICATION_PROPERTIES + "=" + cpf);
            isFile(cpf);
        }
        loadConfigurationPropertiesFile();
    }

    private static void printSystemProperties() {
//      Properties properties = System.getProperties();
//      String[] names = new String[properties.stringPropertyNames().size()];
//      properties.stringPropertyNames().toArray(names);
//      Arrays.sort(names);
//      String value;
//      for (String name : names) {
//          value = properties.getProperty(name);
//          try {
//              Bitacora.trace(name + "=" + value);
//          } catch (Exception ex) {
//              Bitacora.trace(name + "=" + ex.getClass().getSimpleName());
//          }
//      }
        getProperty("com.sun.aas.instanceRoot");
        getProperty("jboss.home.dir");
        getProperty("jboss.server.base.dir");
        getProperty("file.separator");
        getProperty("path.separator");
        getProperty("java.class.path");
        getProperty("os.arch");
        getProperty("os.name");
        getProperty("os.version");
        getProperty("user.dir");
        getProperty("user.home");
        getProperty("user.name");
    }

    private static String getProperty(String name) {
        String var = System.getProperties().getProperty(name);
        Bitacora.trace(name + "=" + var);
        return StringUtils.trimToEmpty(var);
    }

    private static void loadEnvironmentPropertiesFile() {
        String sep = System.getProperties().getProperty("file.separator");
        String rootdir = System.getProperties().getProperty("com.sun.aas.instanceRoot");
        String basedir = System.getProperties().getProperty("jboss.server.base.dir");
        String userdir = System.getProperties().getProperty("user.dir");
        boolean glassfish = StringUtils.isNotBlank(rootdir);
        boolean jboss = StringUtils.isNotBlank(basedir);
        if (glassfish) {
            epf = rootdir + sep + "config";
        } else if (jboss) {
            epf = basedir + sep + "configuration";
        } else {
            epf = userdir + sep + "conf";
        }
        epf += sep + "environment" + sep + lcc + "." + "properties";
        environment = new Properties();
        if (Utils.isFile(epf)) {
            try {
                try (FileInputStream inStream = new FileInputStream(epf)) {
                    environment.load(inStream);
                }
            } catch (Exception ex) {
                Bitacora.logFatal(ex);
            }
        }
        ikq = !environment.isEmpty();
        if (ikq) {
            printEnvironmentProperties();
        }
    }

    private static void printEnvironmentProperties() {
        Bitacora.trace(epf);
        String[] names = new String[environment.stringPropertyNames().size()];
        environment.stringPropertyNames().toArray(names);
        Arrays.sort(names);
        String value;
        for (String name : names) {
            value = environment.getProperty(name);
            Bitacora.trace(name + "=" + (StringUtils.containsIgnoreCase(name, "password") ? EYE_CATCHER : value));
        }
    }

    private static void loadEnvironmentVariables() {
        dir = getenv(SEV.ENTERPRISE_APPLICATION_DIR, CHECK_DIRECTORY);
        doc = getenv(SEV.ENTERPRISE_APPLICATION_DOC, CHECK_DIRECTORY);
        cpf = getenv(SEV.ENTERPRISE_APPLICATION_PROPERTIES, CHECK_FILE);
        vpf = getenv(SEV.ENTERPRISE_VELOCITY_PROPERTIES, CHECK_FILE);
        vlp = getenv(SEV.ENTERPRISE_VELOCITY_FILE_RESOURCE_LOADER_PATH, CHECK_PATH);
        jdbc_driver = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_DRIVER, CHECK_NOT_BLANK);
        jdbc_url = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_URL, CHECK_NOT_BLANK);
        jdbc_user = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_USER, CHECK_NOT_BLANK);
        jdbc_password = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_PASSWORD, CHECK_NOT_BLANK);
    }

    private static String getenv(String name, int type) {
        String var = getenv(name);
        check(var, type);
        return var;
    }

    public static String getenv(String name) {
        String sep = System.getProperties().getProperty("file.separator");
        String key = name;
        String var = System.getenv(key);
        if (StringUtils.isNotBlank(var)) {
            printenv(key, var);
        } else if (ikq) {
            key = StringUtils.removeStartIgnoreCase(name, EAB.ENTERPRISE_APPLICATION_CODE + '_');
            var = environment.getProperty(key, "");
            if (StringUtils.isNotBlank(var)) {
                printenv(epf.substring(1 + epf.lastIndexOf(sep)) + sep + key, var);
            }
        }
        return StringUtils.trimToEmpty(var);
    }

    private static void printenv(String key, String value) {
        String s = StringUtils.containsIgnoreCase(key, "password") ? EYE_CATCHER : value;
        Bitacora.trace(key + "=" + s);
    }

    private static boolean check(String path, int type) {
        boolean b = StringUtils.isNotBlank(path);
        if (b) {
            switch (type) {
                case CHECK_EXIST:
                    return exists(path);
                case CHECK_DIRECTORY:
                    return isDirectory(path);
                case CHECK_FILE:
                    return isFile(path);
                case CHECK_PATH:
                    return isPath(path);
                default:
                    return true;
            }
        }
        return b;
    }

    private static boolean exists(String pathname) {
        boolean b = Utils.exists(pathname);
        if (!b) {
            Bitacora.trace(EYE_CATCHER + " " + pathname + " NO EXISTE " + EYE_CATCHER);
        }
        return b;
    }

    private static boolean isDirectory(String pathname) {
        boolean b = Utils.isDirectory(pathname);
        if (!b) {
            Bitacora.trace(EYE_CATCHER + " " + pathname + " NO EXISTE O NO ES UN DIRECTORIO " + EYE_CATCHER);
        }
        return b;
    }

    private static boolean isFile(String pathname) {
        boolean b = Utils.isFile(pathname);
        if (!b) {
            Bitacora.trace(EYE_CATCHER + " " + pathname + " NO EXISTE O NO ES UN ARCHIVO " + EYE_CATCHER);
        }
        return b;
    }

    private static boolean isPath(String path) {
        boolean b = StringUtils.isNotBlank(path);
        if (b) {
            String sep = System.getProperties().getProperty("path.separator");
            String[] pathnames = StringUtils.split(path, sep);
            for (String pathname : pathnames) {
                b &= isDirectory(pathname);
            }
        }
        return b;
    }

    private static void loadConfigurationPropertiesFile() {
        configuration = new Properties();
        try {
            if (Utils.isFile(cpf)) {
                try (FileInputStream inStream = new FileInputStream(cpf)) {
                    configuration.load(inStream);
                }
            }
        } catch (Exception ex) {
            Bitacora.logFatal(ex);
        }
        pdq = !configuration.isEmpty();
        if (pdq) {
            printConfigurationProperties();
        }
    }

    private static void printConfigurationProperties() {
        Bitacora.trace(cpf);
        String[] names = new String[configuration.stringPropertyNames().size()];
        configuration.stringPropertyNames().toArray(names);
        Arrays.sort(names);
        String valor;
        String value;
        for (String name : names) {
            value = configuration.getProperty(name);
            valor = getString(name);
            Bitacora.trace(name + "=" + (StringUtils.containsIgnoreCase(name, "password") ? EYE_CATCHER : valor));
            if (StringUtils.isBlank(valor)) {
            } else if (value.startsWith(DIR)) {
                exists(valor);
            } else if (value.startsWith(DOC)) {
                exists(valor);
            }
        }
    }

    public static boolean isLoaded() {
        return pdq;
    }

    public static String getLcc() {
        return lcc;
    }

    public static String getUcc() {
        return ucc;
    }

    public static String getDir() {
        return dir;
    }

    public static String getDoc() {
        return doc;
    }

    public static String getEnvironmentPropertiesFile() {
        return epf;
    }

    public static String getConfigurationPropertiesFile() {
        return cpf;
    }

    public static String getVelocityPropertiesFile() {
        return vpf;
    }

    public static String getVelocityFileResourceLoaderPath() {
        return vlp;
    }

    public static String getString(String key) {
        String value = configuration.getProperty(key, "");
        if (StringUtils.isBlank(value)) {
            return "";
        } else if (value.startsWith(DIR)) {
            value = value.replace(DIR, dir);
        } else if (value.startsWith(DOC)) {
            value = value.replace(DOC, doc);
        } else if (value.startsWith(JDBC_DRIVER)) {
            value = value.replace(JDBC_DRIVER, jdbc_driver);
        } else if (value.startsWith(JDBC_URL)) {
            value = value.replace(JDBC_URL, jdbc_url);
        } else if (value.startsWith(JDBC_USER)) {
            value = value.replace(JDBC_USER, jdbc_user);
        } else if (value.startsWith(JDBC_PASSWORD)) {
            value = value.replace(JDBC_PASSWORD, jdbc_password);
        }
        value = value.replace(LCC, lcc);
        value = value.replace(UCC, ucc);
        return value;
    }

}
