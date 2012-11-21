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
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.web.EJBL;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Properties;
import javax.naming.InitialContext;
import org.apache.commons.lang.StringUtils;

public class EA {

    // <editor-fold defaultstate="collapsed" desc="private static final fields">
    private static final String LOWER_CASE_CODE = "$LOWER_CASE_CODE";

    private static final String UPPER_CASE_CODE = "$UPPER_CASE_CODE";

    private static final String CONTENT_ROOT_DIR = "$CONTENT_ROOT_DIR";

    private static final String HOME_DIR = "$HOME_DIR";

    private static final String JDBC_DRIVER = "$" + EAC.JDBC_DRIVER;

    private static final String JDBC_URL = "$" + EAC.JDBC_URL;

    private static final String JDBC_USER = "$" + EAC.JDBC_USER;

    private static final String JDBC_PASSWORD = "$" + EAC.JDBC_PASSWORD;

    private static final String JNDI_EJB_PERSISTENCE_PATTERN = "$" + EAC.JNDI_EJB_PERSISTENCE_PATTERN;

    private static final String VELOCITY_PROPERTIES_FILE = "$" + EAC.VELOCITY_PROPERTIES_FILE;

    private static final String VELOCITY_FILE_RESOURCE_LOADER_PATH = "$" + EAC.VELOCITY_FILE_RESOURCE_LOADER_PATH;

    private static final String EYE_CATCHER = "********************";

    private static final String lower_case_code = EAB.ENTERPRISE_APPLICATION_CODE.toLowerCase();

    private static final String upper_case_code = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="private static fields">
    private static String content_root_dir;

    private static String home_dir;

    private static String bootstrapping_properties_file;

    private static String configuration_properties_file;

    private static String jdbc_driver;

    private static String jdbc_url;

    private static String jdbc_user;

    private static String jdbc_password;

    private static String jndi_ejb_persistence_pattern;

    private static String velocity_properties_file;

    private static String velocity_file_resource_loader_path;

    private static Properties bootstrapping;

    private static Properties configuration;

    private static boolean locked;

    private static boolean loaded;

    private static String messages;
    // </editor-fold>

    private enum CheckOption {

        CHECK_EXIST, CHECK_DIRECTORY, CHECK_FILE, CHECK_PATH, CHECK_NOT_BLANK;

    }

    static {
        init();
    }

    private static void init() {
        Bitacora.stamp(upper_case_code);
        Bitacora.trace(EA.class, "init");
        locked = false;
        loaded = false;
        messages = "";
        showSystemProperties();
        loadBootstrappingProperties();
        loadEnvironmentVariables();
        clipConfigurationProperties();
        lockConfigurationProperties();
        loadConfigurationProperties();
        if (locked && loaded) {
        } else {
            Bitacora.logError(new ApplicationInitializationException(messages));
        }
    }

    private static void showSystemProperties() {
//      Bitacora.trace(EA.class, "showSystemProperties");
//      Properties properties = System.getProperties();
//      String[] names = new String[properties.stringPropertyNames().size()];
//      properties.stringPropertyNames().toArray(names);
//      Arrays.sort(names);
        String[] names = new String[]{
            "com.sun.aas.instanceRoot",
            "jboss.home.dir",
            "jboss.server.base.dir",
            "java.class.path",
            "java.library.path",
            "os.name",
            // "os.arch",
            // "os.version",
            // "file.separator",
            // "path.separator",
            // "line.separator",
            // "user.name",
            // "user.home",
            "user.dir"
        };
        for (String name : names) {
            showSystemProperty(name);
        }
    }

    private static void showSystemProperty(String name) {
        String value = System.getProperties().getProperty(name);
        try {
            Bitacora.trace(name + "=" + value);
        } catch (Exception ex) {
            Bitacora.trace(name + "=" + ex.getClass().getName());
        }
    }

    private static void loadBootstrappingProperties() {
        Bitacora.trace(EA.class, "loadBootstrappingProperties");
        String key;
        boolean ok = false;
        key = SEV.ENT_APP_BOOTSTRAPPING_PROPERTIES_FILE;
        bootstrapping_properties_file = System.getenv(key);
        if (StringUtils.isNotBlank(bootstrapping_properties_file)) {
            show(key, bootstrapping_properties_file);
            ok = isFile(bootstrapping_properties_file);
        }
        if (!ok) {
            key = SEV.ENT_APP_BOOTSTRAPPING_PROPERTIES_FILE.replace('_', '.').toLowerCase();
            bootstrapping_properties_file = System.getProperties().getProperty(key);
            if (StringUtils.isNotBlank(bootstrapping_properties_file)) {
                show(key, bootstrapping_properties_file);
                ok = isFile(bootstrapping_properties_file);
            }
        }
        if (!ok) {
            String sep = System.getProperties().getProperty("file.separator");
            String glassRoot = System.getProperties().getProperty("com.sun.aas.instanceRoot");
            String jbossBase = System.getProperties().getProperty("jboss.server.base.dir");
            String somedir = coalesceToUserDir(glassRoot, jbossBase);
            key = StringUtils.removeStart(SEV.ENT_APP_BOOTSTRAPPING_PROPERTIES_FILE, SEV.ENT_APP_VAR_PREFFIX);
            bootstrapping_properties_file = somedir + sep + lower_case_code + "." + "properties";
            show(key, bootstrapping_properties_file);
            ok = isFile(bootstrapping_properties_file);
        }
        bootstrapping = new Properties();
        if (ok) {
            try {
                try (FileInputStream inStream = new FileInputStream(bootstrapping_properties_file)) {
                    bootstrapping.load(inStream);
                }
            } catch (Exception ex) {
                Bitacora.logFatal(ex);
            }
        }
        ok = !bootstrapping.isEmpty();
        if (ok) {
            showBootstrappingProperties();
        }
    }

    private static void showBootstrappingProperties() {
//      Bitacora.trace(EA.class, "showBootstrappingProperties");
        String[] names = new String[bootstrapping.stringPropertyNames().size()];
        bootstrapping.stringPropertyNames().toArray(names);
        Arrays.sort(names);
        String value;
        for (String name : names) {
            value = bootstrapping.getProperty(name);
            show(name, value);
        }
    }

    private static void loadEnvironmentVariables() {
        Bitacora.trace(EA.class, "loadEnvironmentVariables");
        content_root_dir = get(SEV.ENT_APP_CONTENT_ROOT_DIR, CheckOption.CHECK_DIRECTORY);
        home_dir = get(SEV.ENT_APP_HOME_DIR, CheckOption.CHECK_DIRECTORY);
        configuration_properties_file = get(SEV.ENT_APP_CONFIGURATION_PROPERTIES_FILE, CheckOption.CHECK_FILE);
        jdbc_driver = get(SEV.ENT_APP_JDBC_DRIVER, CheckOption.CHECK_NOT_BLANK);
        jdbc_url = get(SEV.ENT_APP_JDBC_URL, CheckOption.CHECK_NOT_BLANK);
        jdbc_user = get(SEV.ENT_APP_JDBC_USER, CheckOption.CHECK_NOT_BLANK);
        jdbc_password = get(SEV.ENT_APP_JDBC_PASSWORD, CheckOption.CHECK_NOT_BLANK);
        jndi_ejb_persistence_pattern = get(SEV.ENT_APP_JNDI_EJB_PERSISTENCE_PATTERN);
        velocity_properties_file = get(SEV.ENT_APP_VELOCITY_PROPERTIES_FILE, CheckOption.CHECK_FILE);
        velocity_file_resource_loader_path = get(SEV.ENT_APP_VELOCITY_FILE_RESOURCE_LOADER_PATH, CheckOption.CHECK_PATH);
    }

    private static void clipConfigurationProperties() {
        Bitacora.trace(EA.class, "clipConfigurationProperties");
        String key;
        String sep = System.getProperties().getProperty("file.separator");
        String osname1 = System.getProperties().getProperty("os.name");
        String osname2 = StringUtils.containsIgnoreCase(osname1, "windows") ? "windows" : "linux";
        String glassRoot = System.getProperties().getProperty("com.sun.aas.instanceRoot");
        String jbossHome = System.getProperties().getProperty("jboss.home.dir");
        String jbossBase = System.getProperties().getProperty("jboss.server.base.dir");
        String somedir;
        boolean glassfish = StringUtils.isNotBlank(glassRoot);
        boolean jboss = StringUtils.isNotBlank(jbossHome);
        if (StringUtils.isBlank(content_root_dir)) {
            key = StringUtils.removeStart(SEV.ENT_APP_CONTENT_ROOT_DIR, SEV.ENT_APP_VAR_PREFFIX);
            somedir = coalesceToUserDir(glassRoot, jbossHome);
            if (glassfish) {
                content_root_dir = somedir + sep + "docroot";
            } else if (jboss) {
                content_root_dir = somedir + sep + "welcome-content";
            } else {
                content_root_dir = somedir + sep + "ROOT";
            }
            show(key, content_root_dir);
            isDirectory(content_root_dir);
        }
        if (StringUtils.isBlank(home_dir)) {
            key = StringUtils.removeStart(SEV.ENT_APP_HOME_DIR, SEV.ENT_APP_VAR_PREFFIX);
            somedir = coalesceToUserDir(glassRoot, jbossBase);
            home_dir = somedir + sep + lower_case_code;
            show(key, home_dir);
            isDirectory(home_dir);
        }
        if (StringUtils.isBlank(configuration_properties_file)) {
            key = StringUtils.removeStart(SEV.ENT_APP_CONFIGURATION_PROPERTIES_FILE, SEV.ENT_APP_VAR_PREFFIX);
            configuration_properties_file = home_dir + sep + "resources" + sep + "config" + sep + osname2 + sep + lower_case_code + ".properties";
            show(key, configuration_properties_file);
            isFile(configuration_properties_file);
        }
        if (StringUtils.isBlank(jdbc_driver)) {
            key = StringUtils.removeStart(SEV.ENT_APP_JDBC_DRIVER, SEV.ENT_APP_VAR_PREFFIX);
            jdbc_driver = "org.postgresql.Driver";
            show(key, jdbc_driver);
        }
        if (StringUtils.isBlank(jdbc_url)) {
            key = StringUtils.removeStart(SEV.ENT_APP_JDBC_URL, SEV.ENT_APP_VAR_PREFFIX);
            jdbc_url = "jdbc:postgresql://localhost:5432/" + upper_case_code;
            show(key, jdbc_url);
        }
        if (StringUtils.isBlank(jdbc_user)) {
            key = StringUtils.removeStart(SEV.ENT_APP_JDBC_USER, SEV.ENT_APP_VAR_PREFFIX);
            jdbc_user = lower_case_code;
            show(key, jdbc_user);
        }
        if (StringUtils.isBlank(jdbc_password)) {
            key = StringUtils.removeStart(SEV.ENT_APP_JDBC_PASSWORD, SEV.ENT_APP_VAR_PREFFIX);
            jdbc_password = lower_case_code;
            show(key, jdbc_password);
        }
        if (StringUtils.isBlank(jndi_ejb_persistence_pattern)) {
            key = StringUtils.removeStart(SEV.ENT_APP_JNDI_EJB_PERSISTENCE_PATTERN, SEV.ENT_APP_VAR_PREFFIX);
            jndi_ejb_persistence_pattern = "java:global" + "/" + lower_case_code + "/" + lower_case_code + "-ejb-persistence/{0}";
            show(key, jndi_ejb_persistence_pattern);
        }
        if (StringUtils.isBlank(velocity_properties_file)) {
            key = StringUtils.removeStart(SEV.ENT_APP_VELOCITY_PROPERTIES_FILE, SEV.ENT_APP_VAR_PREFFIX);
            velocity_properties_file = home_dir + sep + "resources" + sep + "velocity" + sep + "velocity.properties";
            show(key, velocity_properties_file);
            isFile(velocity_properties_file);
        }
        if (StringUtils.isBlank(velocity_file_resource_loader_path)) {
            key = StringUtils.removeStart(SEV.ENT_APP_VELOCITY_FILE_RESOURCE_LOADER_PATH, SEV.ENT_APP_VAR_PREFFIX);
            velocity_file_resource_loader_path = home_dir + sep + "resources" + sep + "velocity" + sep + "templates";
            show(key, velocity_file_resource_loader_path);
            isDirectory(velocity_file_resource_loader_path);
        }
    }

    private static void lockConfigurationProperties() {
        Bitacora.trace(EA.class, "lockConfigurationProperties");
        boolean ok;
        locked = true;
        ok = Utils.isDirectory(content_root_dir);
        locked &= ok;
        if (!ok) {
            messages += content_root_dir + " no existe o no es un directorio; ";
        }
        ok = Utils.isDirectory(home_dir);
        locked &= ok;
        if (!ok) {
            messages += home_dir + " no existe o no es un directorio; ";
        }
        ok = Utils.isFile(configuration_properties_file);
        locked &= ok;
        if (!ok) {
            messages += configuration_properties_file + " no existe o no es un archivo; ";
        }
        ok = Utils.isFile(velocity_properties_file);
        locked &= ok;
        if (!ok) {
            messages += velocity_properties_file + " no existe o no es un archivo; ";
        }
        ok = Utils.isPath(velocity_file_resource_loader_path);
        locked &= ok;
        if (!ok) {
            messages += velocity_file_resource_loader_path + " no es un path válido; ";
        }
        locked &= connect();
        locked &= lookup();
    }

    private static void loadConfigurationProperties() {
        Bitacora.trace(EA.class, "loadConfigurationProperties");
        configuration = new Properties();
        if (Utils.isFile(configuration_properties_file)) {
            try {
                try (FileInputStream inStream = new FileInputStream(configuration_properties_file)) {
                    configuration.load(inStream);
                }
            } catch (Exception ex) {
                Bitacora.logFatal(ex);
            }
        }
        loaded = !configuration.isEmpty();
        if (loaded) {
            rollConfigurationProperties();
            showConfigurationProperties();
        }
    }

    private static void rollConfigurationProperties() {
//      Bitacora.trace(EA.class, "rollConfigurationProperties");
        String[] names = new String[configuration.stringPropertyNames().size()];
        configuration.stringPropertyNames().toArray(names);
//      Arrays.sort(names);
        for (String name : names) {
            rollConfigurationProperty(name);
        }
    }

    public static void rollConfigurationProperty(String name) {
        String value = configuration.getProperty(name, "");
        value = StringUtils.trimToEmpty(value);
        value = value.replace(LOWER_CASE_CODE, lower_case_code);
        value = value.replace(UPPER_CASE_CODE, upper_case_code);
        value = value.replace(CONTENT_ROOT_DIR, content_root_dir);
        value = value.replace(HOME_DIR, home_dir);
        value = value.replace(JDBC_DRIVER, jdbc_driver);
        value = value.replace(JDBC_URL, jdbc_url);
        value = value.replace(JDBC_USER, jdbc_user);
        value = value.replace(JDBC_PASSWORD, jdbc_password);
        value = value.replace(JNDI_EJB_PERSISTENCE_PATTERN, jndi_ejb_persistence_pattern);
        value = value.replace(VELOCITY_PROPERTIES_FILE, velocity_properties_file);
        value = value.replace(VELOCITY_FILE_RESOURCE_LOADER_PATH, velocity_file_resource_loader_path);
        configuration.setProperty(name, value);
    }

    private static void showConfigurationProperties() {
//      Bitacora.trace(EA.class, "showConfigurationProperties");
        String[] names = new String[configuration.stringPropertyNames().size()];
        configuration.stringPropertyNames().toArray(names);
        Arrays.sort(names);
        String value;
        for (String name : names) {
            value = getString(name);
            show(name, value);
        }
    }

    private static String coalesceToUserDir(String... folders) {
        String sep = System.getProperties().getProperty("file.separator");
        for (String folder : folders) {
            if (Utils.isDirectory(folder)) {
                return StringUtils.removeEnd(folder, sep);
            }
        }
        String folder = System.getProperties().getProperty("user.dir");
        return StringUtils.removeEnd(folder, sep);
    }

    private static String get(String name) {
        String key = name;
        String value = System.getenv(key);
        if (StringUtils.isBlank(value)) {
            key = name.replace('_', '.').toLowerCase();
            value = System.getProperties().getProperty(key);
            if (StringUtils.isBlank(value)) {
                key = StringUtils.removeStart(name, SEV.ENT_APP_VAR_PREFFIX);
                value = bootstrapping.getProperty(key, "");
            }
        }
        show(key, value);
        return StringUtils.trimToEmpty(value);
    }

    private static String get(String name, CheckOption option) {
        String value = get(name);
        if (StringUtils.isNotBlank(value)) {
            check(value, option);
        }
        return value;
    }

    private static void show(String name, String value) {
        String s = StringUtils.containsIgnoreCase(name, "password") ? EYE_CATCHER : value;
        Bitacora.trace(name + "=" + s);
    }

    private static boolean check(String value, CheckOption option) {
        switch (option) {
            case CHECK_EXIST:
                return exists(value);
            case CHECK_DIRECTORY:
                return isDirectory(value);
            case CHECK_FILE:
                return isFile(value);
            case CHECK_PATH:
                return isPath(value);
            case CHECK_NOT_BLANK:
            default:
                return StringUtils.isNotBlank(value);
        }
    }

    private static boolean exists(String pathname) {
        boolean b = Utils.exists(pathname);
        if (!b) {
            String string = pathname + " no existe";
            Bitacora.trace(EYE_CATCHER + " " + string + " " + EYE_CATCHER);
        }
        return b;
    }

    private static boolean isDirectory(String pathname) {
        boolean b = Utils.isDirectory(pathname);
        if (!b) {
            String string = pathname + " no existe o no es un directorio";
            Bitacora.trace(EYE_CATCHER + " " + string + " " + EYE_CATCHER);
        }
        return b;
    }

    private static boolean isFile(String pathname) {
        boolean b = Utils.isFile(pathname);
        if (!b) {
            String string = pathname + " no existe o no es un archivo";
            Bitacora.trace(EYE_CATCHER + " " + string + " " + EYE_CATCHER);
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

    private static boolean connect() {
        Bitacora.trace(EA.class, "connect", jdbc_driver, jdbc_url, jdbc_user, EYE_CATCHER);
        try {
            Class.forName(jdbc_driver);
            DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_password);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            String string = ThrowableUtils.getString(ex);
            messages += string + " (connect " + jdbc_driver + ", " + jdbc_url + ", " + jdbc_user + ", " + EYE_CATCHER + "); ";
            Bitacora.trace(string);
        }
        return false;
    }

    private static boolean lookup() {
        Bitacora.trace(EA.class, "lookup", jndi_ejb_persistence_pattern);
        String jndi = MessageFormat.format(jndi_ejb_persistence_pattern, EJBL.UsuarioFacade);
        try {
            InitialContext.doLookup(jndi);
            return true;
        } catch (Exception ex) {
            String string = ThrowableUtils.getString(ex);
            messages += string + " (lookup " + jndi_ejb_persistence_pattern + "); ";
            Bitacora.trace(string);
        }
        return false;
    }

    public static String getLowerCaseCode() {
        return lower_case_code;
    }

    public static String getUpperCaseCode() {
        return upper_case_code;
    }

    public static boolean isLocked() {
        return locked;
    }

    public static boolean isLoaded() {
        return loaded;
    }

    public static String getString(String key) {
        String value = configuration.getProperty(key, "");
        return StringUtils.trimToEmpty(value);
    }

}
