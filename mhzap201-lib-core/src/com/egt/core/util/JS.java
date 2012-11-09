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
package com.egt.core.util;

import com.egt.base.constants.CPP;
import com.egt.commons.info.ImageInfo;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.constants.Global;
import com.egt.core.enums.EnumOpcionAbrirVentana;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class JS {

    public static final String FILE_PREFIX = "file://";

    public static final String HTTP_PREFIX = "http://";

    public static final String HTTPS_PREFIX = "https://";

    public static final String JSP_SUFFIX = ".jsp";

    public static String getAlertScript(String key) {
        String script = "";
        script += "alert('" + Bundle.getString(key) + "');";
        script += "return false;";
        return script;
    }

    public static String getGoBackJavaScript() {
        String script = "";
        script += "if(history.length>1){history.back()}";
        script += "return false;";
        return script;
    }

    public static String getRefreshJavaScript() {
        String script = "";
        script += "history.go();";
        script += "return false;";
        return script;
    }

    public static String getCloseWindowJavaScript() {
        return getCloseWindowJavaScript(null, null, null);
    }

    public static String getCloseWindowJavaScript(String button) {
        return getCloseWindowJavaScript(null, null, button);
    }

    public static String getCloseWindowJavaScript(String field, String value) {
        return getCloseWindowJavaScript(field, value, null);
    }

    public static String getCloseWindowJavaScript(String field, String value, String button) {
        VelocityContext context = new VelocityContext();
        context.put("field", StringUtils.trimToNull(field));
        context.put("value", StringUtils.trimToNull(value));
        context.put("button", StringUtils.trimToNull(button));
        return merge("js-close-window", context);
    }

    public static String getConfirmDialogJavaScript(String table, String alertMessage, String confirmMessage) {
        VelocityContext context = new VelocityContext();
        context.put("table", StringUtils.trimToNull(table));
        context.put("alertMessage", StringUtils.trimToNull(alertMessage));
        context.put("confirmMessage", StringUtils.trimToNull(confirmMessage));
        return merge("js-confirm-dialog", context);
    }

    public static String getConfirmDialogJavaScript(String confirmMessage, boolean blur) {
        VelocityContext context = new VelocityContext();
        context.put("confirmMessage", StringUtils.trimToNull(confirmMessage));
        context.put("blur", blur ? "blur" : null);
        return merge("js-confirm-discard", context);
    }

    public static String getOpenSearchWindowJavaScript(String url, EnumOpcionAbrirVentana option, String field, String button, ListaParametros rpl, String window) {
        if (rpl == null) {
            rpl = new ListaParametros();
        }
        rpl.addParametro(CPP.ID_OPCION_CAMPO_RETORNO, Integer.valueOf(option.intValue()));
        rpl.addParametro(CPP.ID_CAMPO_ACCION_RETORNO, field);
        rpl.addParametro(CPP.ID_BOTON_ACCION_RETORNO, button);
        return getOpenWindowJavaScript(url, rpl.toString(), window);
    }

    public static String getOpenSearchWindowJavaScript(String url, String column, String field, String button, ListaParametros rpl, String window) {
        if (rpl == null) {
            rpl = new ListaParametros();
        }
        rpl.addParametro(CPP.ID_OPCION_CAMPO_RETORNO, column);
        rpl.addParametro(CPP.ID_CAMPO_ACCION_RETORNO, field);
        rpl.addParametro(CPP.ID_BOTON_ACCION_RETORNO, button);
        return getOpenWindowJavaScript(url, rpl.toString(), window);
    }

//  public static String getOpenWindowJavaScript(String url) {
//      return getOpenWindowJavaScript(url, null);
//  }
//
    public static String getOpenWindowJavaScript(String url, String rpl) {
        String window = getApplication(url); /* abrir una sola ventana por aplicacion es de momento la mejor opcion */
        return getOpenWindowJavaScript(url, rpl, window);
    }

    public static String getOpenWindowJavaScript(String url, String rpl, String window) {
        String session = Global.PARAMETRO_CONDICION_SESION + "=" + Global.SESION_REINICIADA;
        return getOpenWindowJavaScript(url, rpl, window, session);
    }

    public static String getOpenWindowJavaScript(String url, String rpl, String window, String session) {
        if (url == null) {
            return null;
        }
        String ventana = StringUtils.isBlank(window) ? Global.DEFAULT_WINDOW_NAME : window;
        VelocityContext context = new VelocityContext();
        context.put("url", StringUtils.trimToNull(url));
        context.put("rpl", StringUtils.trimToNull(rpl));
        context.put("window", StringUtils.trimToNull(ventana));
        context.put("sesion", StringUtils.trimToNull(session));
        return merge("js-open-window", context);
    }

    public static String getOpenFileWindowJavaScript(String spec) {
        Bitacora.trace(JS.class, "getOpenFileWindowJavaScript", spec);
        VelocityContext context = new VelocityContext();
        context.put("url", StringUtils.trimToNull(spec));
        context.put("msg", "Recurso no disponible"); /* TODO: obtener de una tabla de mensajes */
        if (StringUtils.isNotBlank(spec)) {
            RandomAccessFile input;
            try {
                URL url = new URL(spec); // throws MalformedURLException
                File file = new File(Utils.getAttachedFileName(url));
                if (file.exists()) {
                    input = new RandomAccessFile(file, "r"); // throws FileNotFoundException
                    ImageInfo imageInfo = new ImageInfo();
                    imageInfo.setInput(input); // input can be InputStream or RandomAccessFile
                    imageInfo.setDetermineImageNumber(false); // default is false
                    imageInfo.setCollectComments(false); // default is false
                    if (imageInfo.check()) {
                        context.put("imageInfo", imageInfo);
                    }
                    input.close(); // throws IOException
                }
            } catch (MalformedURLException ex) {
                Bitacora.logFatal(ex);
            } catch (FileNotFoundException ex) {
                Bitacora.logFatal(ex);
            } catch (IOException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return merge("js-open-window", context);
    }

    public static String getOnClickJavaScript() {
        return merge("js-on-input");
    }

    public static String getOnDblClickJavaScript() {
        return merge("js-on-input");
    }

    public static String getOnKeyPressJavaScript() {
        return merge("js-on-input");
    }

    public static String getOnLoadJavaScript() {
        return merge("js-on-load");
    }

    public static String getOnUnloadJavaScript() {
        return merge("js-on-unload");
    }

    public static String getOnClickRowSelectorJavaScript(String value) {
        VelocityContext context = new VelocityContext();
        context.put("value", StringUtils.trimToNull(value));
        return merge("js-on-click-row-selector", context);
    }

    public static String getApplication(String url) {
        String uri = getURI(url);
        if (uri == null) {
            return null;
        }
        int i = uri.indexOf("/", 1);
        return i > 1 ? uri.substring(1, i) : null;
    }

    private static String getURI(String url) {
        String uri = null;
        if (url != null && (url.startsWith(HTTP_PREFIX) || url.startsWith(HTTPS_PREFIX)) && url.endsWith(JSP_SUFFIX)) {
            int i = url.startsWith(HTTP_PREFIX) ? HTTP_PREFIX.length() : HTTPS_PREFIX.length();
            int j = url.indexOf("/", i);
            if (j > i) {
                uri = url.substring(j);
            }
        }
        return uri;
    }

    private static String merge(String name) {
        return merge(name, null);
    }

    private static String merge(String name, VelocityContext context) {
        String script = null;
        if (VelocityEngineer.init()) {
            try {
                Template template = Velocity.getTemplate(name + "." + "vm");
                if (context == null) {
                    context = new VelocityContext();
                }
                StringWriter writer = new StringWriter();
                template.merge(context, writer);
                script = StringUtils.trimToNull(writer.toString());
            } catch (Exception ex) {
                // ex.printStackTrace();
            }
        }
        return script;
    }

}
