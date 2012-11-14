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

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class VelocityEngineer {

    private static boolean initialized = false;

    private static File propertiesFile = null;

    public static boolean init() {
        if (initialized) {
            return true;
        }
        if (!EA.isLoaded()) {
            return false;
        }
        Bitacora.trace(VelocityEngineer.class, "init");
        try {
            String fileName = EA.getVelocityPropertiesFile();
            if (StringUtils.isNotBlank(fileName)) {
                propertiesFile = new File(fileName);
            }
            if (propertiesFile == null || !propertiesFile.isFile()) {
                fileName = EA.getString(EAC.VELOCITY_SOURCE_DIR) + EA.getString(EAC.VELOCITY_PROPERTIES);
                if (StringUtils.isNotBlank(fileName)) {
                    propertiesFile = new File(fileName);
                }
            }
            if (propertiesFile != null && propertiesFile.isFile()) {
                Velocity.init(getProperties(fileName));
                initialized = true;
            }
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
        return initialized;
    }

    private static Properties getProperties(String propsFilename) throws Exception {
        Bitacora.trace(VelocityEngineer.class, "getProperties", propsFilename);
        Properties p = new Properties();
        try (FileInputStream inStream = new FileInputStream(propsFilename)) {
            p.load(inStream);
        }
        String comma = System.getProperties().getProperty("path.separator");
        String key;
        String value;
//      String repl1 = "$" + EAC.VELOCITY_SOURCE_DIR;
//      String with1 = EA.getString(EAC.VELOCITY_SOURCE_DIR);
//      with1 = StringUtils.trimToEmpty(with1);
//      with1 = with1.replace('\\', '/');
        String repl2 = "$" + EAC.VELOCITY_FILE_RESOURCE_LOADER_PATH;
        String with2 = EA.getVelocityFileResourceLoaderPath();
        if (!Utils.isPath(with2)) {
            File templates = new File(propertiesFile.getParent(), "templates");
            if (templates.isDirectory()) {
                with2 = templates.getPath();
            }
        }
        with2 = StringUtils.trimToEmpty(with2);
        with2 = with2.replace(comma, ", ");
//      with2 = with2.replace('\\', '/').replace("/", "//");
        with2 = with2.replace('\\', '/');
        for (Enumeration e = p.propertyNames(); e.hasMoreElements();) {
            key = (String) e.nextElement();
            value = p.getProperty(key);
            Bitacora.trace(key + "=" + value);
//          if (StringUtils.isNotBlank(value) && value.startsWith(repl1)) {
//              value = value.replace(repl1, with1);
//              p.setProperty(key, value);
//              Bitacora.trace(key + "=" + value);
//          }
            if (StringUtils.isNotBlank(value) && value.startsWith(repl2)) {
                value = value.replace(repl2, with2);
                p.setProperty(key, value);
                Bitacora.trace(key + "=" + value);
            }
        }
        return p;
    }

    public static StringWriter write(VelocityContext context, String tempname) throws Exception {
//      Bitacora.trace(VelocityEngineer.class, "write", context, tempname);
        Template template;
        StringWriter sw = null;
        if (init()) {
            template = Velocity.getTemplate(tempname);
            sw = new StringWriter();
            template.merge(context, sw);
        }
        return sw;
    }

    public static void write(VelocityContext context, String tempname, String filename) throws Exception {
        Bitacora.trace(VelocityEngineer.class, "write", context, tempname, filename);
        StringWriter sw = write(context, tempname);
        if (sw != null) {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(filename);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(sw.toString());
            } catch (IOException ex) {
                throw ex;
            } finally {
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException ex) {
                        Bitacora.logFatal(ex);
                    }
                }
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException ex) {
                        Bitacora.logFatal(ex);
                    }
                }
            }
        }
    }

}
