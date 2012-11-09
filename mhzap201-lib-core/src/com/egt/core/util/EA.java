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
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;

public class EA {

    private static final String LCC = "$LCC";

    private static final String UCC = "$UCC";

    private static final String DIR = "$DIR";

    private static final String DOC = "$DOC";

//  private static final String EAR = "$EAR";
//
//  private static final String WAR = "$WAR";
//
//  private static final String WEB = "$WEB";
//
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

//  private static String ear;
//
//  private static String war;
//
    private static String epf;

    private static String cpf;

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

    static {
        init();
    }

    private static void init() {
        getProperty("user.name");
        getProperty("user.home");
        getProperty("os.name");
        getProperty("os.version");
        getProperty("os.arch");
        getProperty("file.separator");
        getProperty("path.separator");
        getProperty("user.dir");
        getProperty("java.class.path");
        loadEnvironmentPropertiesFile();
        dir = getenv(SEV.ENTERPRISE_APPLICATION_DIR, CHECK_DIRECTORY);
        doc = getenv(SEV.ENTERPRISE_APPLICATION_DOC, CHECK_DIRECTORY);
//      ear = getenv(SEV.ENTERPRISE_APPLICATION_EAR, CHECK_DIRECTORY);
//      war = getenv(SEV.ENTERPRISE_APPLICATION_WAR, CHECK_DIRECTORY);
        cpf = getenv(SEV.ENTERPRISE_APPLICATION_PROPERTIES, CHECK_FILE);
        vlp = getenv(SEV.ENTERPRISE_VELOCITY_FILE_RESOURCE_LOADER_PATH, CHECK_PATH);
        jdbc_driver = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_DRIVER, CHECK_NOT_BLANK);
        jdbc_url = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_URL, CHECK_NOT_BLANK);
        jdbc_user = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_USER, CHECK_NOT_BLANK);
        jdbc_password = getenv(SEV.ENTERPRISE_APPLICATION_JDBC_PASSWORD, CHECK_NOT_BLANK);
        String osn = System.getProperties().getProperty("os.name");
        String sep = System.getProperties().getProperty("file.separator");
        String dp1 = System.getProperties().getProperty("user.dir");
        String dp2 = lcc;
        String dp3 = "resources";
        String dp4 = "applications";
//      String dp5 = "j2ee-apps";
        String dp6 = "config";
        String dp7 = StringUtils.containsIgnoreCase(osn, "windows") ? "windows" : "linux";
        String dp8 = "velocity";
        String dp9 = "templates";
        String ds1 = "-" + "web" + "_" + "war";
        String ds2 = "." + "properties";
        String gf1 = "domains"; // glassfish domains folder
        String gf2 = "docroot"; // glassfish documents root folder
        File file1 = new File(dp1);
        if (file1 != null && file1.isDirectory()) {
            if (StringUtils.isBlank(dir)) {
                dir = dp1 + sep + dp2 + sep + dp3;
                Bitacora.trace(SEV.ENTERPRISE_APPLICATION_DIR + "=" + dir);
                isDirectory(dir);
            }
            File file2 = file1.getParentFile();
            if (file2 != null && file2.isDirectory()) {
                String gf3 = file2.getName().equals(gf1) ? file1.getAbsolutePath() : file2.getAbsolutePath();
                if (StringUtils.isBlank(doc)) {
                    doc = gf3 + sep + gf2;
                    Bitacora.trace(SEV.ENTERPRISE_APPLICATION_DOC + "=" + doc);
                    isDirectory(doc);
                }
//              if (StringUtils.isBlank(ear)) {
////                ear = gf3 + sep + dp4 + sep + dp5 + sep + dp2;
//                  ear = gf3 + sep + dp4 + sep + dp2;
//                  Bitacora.trace(SEV.ENTERPRISE_APPLICATION_EAR + "=" + ear);
//                  isDirectory(ear);
//              }
//              if (StringUtils.isBlank(war)) {
//                  war = ear + sep + dp2 + ds1;
//                  Bitacora.trace(SEV.ENTERPRISE_APPLICATION_WAR + "=" + war);
//                  isDirectory(war);
//              }
            }
            if (StringUtils.isBlank(cpf)) {
                cpf = dir + sep + dp6 + sep + dp7 + sep + dp2 + ds2;
                Bitacora.trace(SEV.ENTERPRISE_APPLICATION_PROPERTIES + "=" + cpf);
                isFile(cpf);
            }
            if (StringUtils.isBlank(vlp)) {
                vlp = dir + sep + dp8 + sep + dp9;
                Bitacora.trace(SEV.ENTERPRISE_VELOCITY_FILE_RESOURCE_LOADER_PATH + "=" + vlp);
                isPath(vlp);
            }
        }
        loadConfigurationPropertiesFile();
    }

    private static String getProperty(String name) {
        String var = System.getProperties().getProperty(name);
        Bitacora.trace(name + "=" + var);
        return StringUtils.trimToEmpty(var);
    }

    private static void loadEnvironmentPropertiesFile() {
        String sep = System.getProperties().getProperty("file.separator");
        String dp1 = System.getProperties().getProperty("user.dir");
        String dp2 = "resources";
        String ds1 = "." + "properties";
        epf = dp1 + sep + dp2 + sep + lcc + ds1;
        environment = new Properties();
        try {
            if (Utils.isFile(epf)) {
                FileInputStream inStream = new FileInputStream(epf);
                environment.load(inStream);
                inStream.close();
                printEnvironmentProperties();
                ikq = true;
            }
        } catch (Exception ex) {
            Bitacora.logFatal(ex);
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

    private static String getenv(String name, int type) {
        String var = getenv(name);
        Bitacora.trace(name + "=" + (StringUtils.containsIgnoreCase(name, "password") ? EYE_CATCHER : var));
        check(var, type);
        return StringUtils.trimToEmpty(var);
    }

    public static String getenv(String name) {
        String key;
        String var;
        if (ikq) {
            key = StringUtils.removeStartIgnoreCase(name, EAB.ENTERPRISE_APPLICATION_CODE + '_');
            var = environment.getProperty(key, "");
        } else {
            key = name;
            var = System.getenv(key);
        }
        return StringUtils.trimToEmpty(var);
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
                FileInputStream inStream = new FileInputStream(cpf);
                configuration.load(inStream);
                inStream.close();
                printConfigurationProperties();
                pdq = true;
            }
        } catch (Exception ex) {
            Bitacora.logFatal(ex);
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
//          } else if (value.startsWith(EAR)) {
//              exists(valor);
//          } else if (value.startsWith(WAR)) {
//              exists(valor);
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

//  public static String getEar() {
//      return ear;
//  }
//
//  public static String getWar() {
//      return war;
//  }
//
    public static String getEnvironmentPropertiesFile() {
        return epf;
    }

    public static String getConfigurationPropertiesFile() {
        return cpf;
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
//      } else if (value.startsWith(EAR)) {
//          value = value.replace(EAR, ear);
//      } else if (value.startsWith(WAR)) {
//          value = value.replace(WAR, war);
//      } else if (value.startsWith(WEB)) {
//          value = value.replace(WEB, URX2.WEB);
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