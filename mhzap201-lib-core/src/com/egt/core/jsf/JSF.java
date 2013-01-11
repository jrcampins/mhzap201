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
package com.egt.core.jsf;

import com.egt.base.constants.CPP;
import com.egt.base.constants.URX2;
import com.egt.base.util.BundlePaginas;
import com.egt.base.util.BundleWebui;
import com.egt.commons.list.ListOption;
import com.egt.commons.list.ListOptions;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.constants.Global;
import com.egt.core.db.wrapper.RecursoWrapper;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionAbrirVentana;
import com.egt.core.jsf.component.ComponenteComplementario;
import com.egt.core.jsf.component.Etiqueta;
import com.egt.core.jsf.component.TextoEstaticoAlternativo;
import com.egt.core.util.Bundle;
import com.egt.core.util.JS;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Field;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Selector;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TabSet;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Tree;
import com.sun.webui.jsf.component.TreeNode;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.component.WebuiInput;
import com.sun.webui.jsf.model.Option;
import com.sun.webui.jsf.model.UploadedFile;
import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;

public class JSF {

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de archivos adjuntos ">
    public static String upload(Upload upload) throws Exception {
        return upload(upload, null);
    }

    public static String upload(Upload upload, String carpeta) throws Exception {
        Bitacora.trace(JSF.class, "upload", upload, carpeta);
        if (upload == null) {
            return null;
        }
        UploadedFile uploadedFile = upload.getUploadedFile();
        if (uploadedFile == null) {
            return null;
        }
        Bitacora.trace(JSF.class, "upload", "name=" + uploadedFile.getOriginalName());
        Bitacora.trace(JSF.class, "upload", "path=" + uploadedFile.getClientFilePath());
        Bitacora.trace(JSF.class, "upload", "type=" + uploadedFile.getContentType());
        Bitacora.trace(JSF.class, "upload", "size=" + uploadedFile.getSize());
        String validChars = "abcdefghijklmnopqrstuvwxyz_1234567890";
        String filepath = null;
        if (StringUtils.isNotBlank(carpeta)) {
            String str = carpeta.toLowerCase();
            if (StringUtils.containsOnly(str, validChars)) {
                filepath = str + "/";
            }
        }
        String filename = STP.getRandomString();
        String pathname = Utils.getAttachedFilesDir(filepath) + filename;
        String ofn = getNombreArchivo(uploadedFile.getOriginalName().replace('\\', '/'));
        String ext = getExtensionArchivo(ofn);
        if (StringUtils.isNotBlank(ext)) {
            String str = ext.toLowerCase();
            if (StringUtils.containsOnly(str, validChars)) {
                filename += "." + str;
                pathname += "." + str;
            }
        }
        File file = new File(pathname);
        uploadedFile.write(file);
        return StringUtils.trimToEmpty(filepath) + filename;
    }

    public static String getExtensionNombreArchivo(String pathname) {
        String filename = getNombreArchivo(pathname);
        String filepath = getCarpetaArchivo(pathname);
        return getExtensionNombreArchivo(filename, filepath);
    }

    public static String getExtensionNombreArchivo(String archivo, String carpeta) {
        String str = StringUtils.trimToEmpty(archivo);
        String dir = Utils.getAttachedFilesDir(carpeta);
        String ext = getExtensionArchivo(archivo);
        if (StringUtils.isNotBlank(ext)) {
            File file = new File(dir + str);
            if (file.isFile()) {
                return ext.toUpperCase();
            }
        }
        return null;
    }

    public static String getExtensionNombreArchivo(String archivo, Long usuario) {
        String str = StringUtils.trimToEmpty(archivo);
        String dir = Utils.getSpooledFilesDir(usuario);
        String ext = getExtensionArchivo(archivo);
        if (StringUtils.isNotBlank(ext)) {
            File file = new File(dir + str);
            if (file.isFile()) {
                return ext.toUpperCase();
            }
        }
        return null;
    }

    public static String getUrlNombreArchivo(String pathname) {
        String filename = getNombreArchivo(pathname);
        String filepath = getCarpetaArchivo(pathname);
        return getUrlNombreArchivo(filename, filepath);
    }

    public static String getUrlNombreArchivo(String archivo, String carpeta) {
        return getFileURL(archivo, Utils.getAttachedFilesWebDir(carpeta));
    }

    public static String getUrlNombreArchivo(String archivo, Long usuario) {
        return getFileURL(archivo, Utils.getSpooledFilesWebDir(usuario));
    }

    public static String getScriptAbrirVentanaArchivo(String pathname) {
        String filename = getNombreArchivo(pathname);
        String filepath = getCarpetaArchivo(pathname);
        return getScriptAbrirVentanaArchivo(filename, filepath);
    }

    public static String getScriptAbrirVentanaArchivo(String archivo, String carpeta) {
        return getOpenFileWindowJavaScript(archivo, Utils.getAttachedFilesWebDir(carpeta));
    }

    public static String getScriptAbrirVentanaArchivo(String archivo, Long usuario) {
        return getOpenFileWindowJavaScript(archivo, Utils.getSpooledFilesWebDir(usuario));
    }

    private static String getCarpetaArchivo(String pathname) {
        int i = pathname == null ? -1 : pathname.lastIndexOf('/');
        return i >= 0 ? pathname.substring(0, i) : null;
    }

    private static String getNombreArchivo(String pathname) {
        int i = pathname == null ? -1 : pathname.lastIndexOf('/');
        return i >= 0 && i < pathname.length() ? pathname.substring(i + 1) : pathname;
    }

    private static String getExtensionArchivo(String pathname) {
        int i = pathname == null ? -1 : pathname.lastIndexOf('.');
        return i >= 0 && i < pathname.length() ? pathname.substring(i + 1) : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer propiedades de componentes visuales ">
    public static Form getForm(UIComponent uic) {
        UIComponent parent = uic.getParent();
        while (parent != null && parent != uic && !(parent instanceof Form)) {
            parent = parent.getParent();
        }
        return parent instanceof Form ? (Form) parent : null;
    }

    public static Page getPage(UIComponent uic) {
        UIComponent parent = uic.getParent();
        while (parent != null && parent != uic && !(parent instanceof Page)) {
            parent = parent.getParent();
        }
        return parent instanceof Page ? (Page) parent : null;
    }

    public static WebuiInput getWebuiInput(UIComponent uic) {
        return getWebuiInput(uic, getForm(uic));
    }

    public static WebuiInput getWebuiInput(UIComponent uic, UIComponent parent) {
        if (parent != null) {
            WebuiInput webuiInput;
            List<UIComponent> children = parent.getChildren();
            for (UIComponent child : children) {
                if (child instanceof WebuiInput) {
                    if (child.getId() == null || uic.getId().equals(child.getId())) {
                    } else if (uic instanceof Etiqueta && child.getId().equals(((Etiqueta) uic).getFor(true))) {
                        //Bitacora.trace(uic.getClass().getName() + "$" + uic.getId() + ".webuiInput=" + child.getId());
                        return (WebuiInput) child;
                    } else if (child instanceof TabSet) {
                        webuiInput = getWebuiInput(uic, child);
                        if (webuiInput != null) {
                            return webuiInput;
                        }
                    } else if (uic.getId().startsWith(child.getId())) {
                        //Bitacora.trace(uic.getClass().getName() + "$" + uic.getId() + ".webuiInput=" + child.getId());
                        return (WebuiInput) child;
                    }
                } else {
                    webuiInput = getWebuiInput(uic, child);
                    if (webuiInput != null) {
                        return webuiInput;
                    }
                }
            }
        }
        return null;
    }

    public static TextoEstaticoAlternativo getTextoEstaticoAlternativo(UIComponent uic) {
        return getTextoEstaticoAlternativo(uic, getForm(uic));
    }

    public static TextoEstaticoAlternativo getTextoEstaticoAlternativo(UIComponent uic, UIComponent parent) {
        if (parent != null) {
            TextoEstaticoAlternativo tea;
            List<UIComponent> children = parent.getChildren();
            for (UIComponent child : children) {
                if (child instanceof TextoEstaticoAlternativo) {
                    if (child.getId() == null || uic.getId().equals(child.getId())) {
                    } else if (child.getId().startsWith(uic.getId())) {
                        //Bitacora.trace(uic.getClass().getName() + "$" + uic.getId() + ".TextoEstaticoAlternativo=" + child.getId());
                        return (TextoEstaticoAlternativo) child;
                    }
                } else {
                    tea = getTextoEstaticoAlternativo(uic, child);
                    if (tea != null) {
                        return tea;
                    }
                }
            }
        }
        return null;
    }

    public static ComponenteComplementario getComponenteComplementario(UIComponent uic) {
        return getComponenteComplementario(uic, getForm(uic));
    }

    public static ComponenteComplementario getComponenteComplementario(UIComponent uic, UIComponent parent) {
        if (parent != null) {
            ComponenteComplementario cc;
            List<UIComponent> children = parent.getChildren();
            for (UIComponent child : children) {
                if (child instanceof ComponenteComplementario) {
                    if (child.getId() == null || uic.getId().equals(child.getId())) {
                    } else if (child.getId().startsWith(uic.getId())) {
                        //Bitacora.trace(uic.getClass().getName() + "$" + uic.getId() + ".ComponenteComplementario=" + child.getId());
                        return (ComponenteComplementario) child;
                    }
                } else {
                    cc = getComponenteComplementario(uic, child);
                    if (cc != null) {
                        return cc;
                    }
                }
            }
        }
        return null;
    }

    public static String getWebuiString(UIComponent uic, String key) {
//      Bitacora.trace(JSF.class, "getWebuiString-1", uic, key);
        FacesContext fc = FacesContext.getCurrentInstance();
        UIViewRoot uivr = fc.getViewRoot();
        ResourceBundle rb = fc.getApplication().getResourceBundle(fc, "bundle");
        String x = StringUtils.trimToEmpty(uivr.getViewId()).replace("/", "").replace(JS.JSP_SUFFIX, "_");
        String y = StringUtils.trimToEmpty(uic.getId());
        String z = StringUtils.isBlank(key) ? "" : "_" + key;
        String k = x + y + z;
        if (StringUtils.isNotBlank(k)) {
            String v = getWebuiString(rb, k);
            // <editor-fold defaultstate="collapsed">
//          if (v == null) {
//              k = y + z;
//              v = getWebuiString(rb, k);
//          }
            // </editor-fold>
            return v;
        }
        return null;
    }

    public static String getWebuiString(String key) {
        return getWebuiString(key, null);
    }

    public static String getWebuiString(String key, String altkey) {
        return getWebuiString(key, altkey, null);
    }

    public static String getWebuiString(String key, String altkey, String styles) {
//      Bitacora.trace(JSF.class, "getWebuiString-2", key, altkey, styles);
        String k = StringUtils.trimToEmpty(key);
        if (StringUtils.isNotBlank(k)) {
            String v = getWebuiString(BundleWebui.getResourceBundle(), k);
            // <editor-fold defaultstate="collapsed">
//          if (v == null) {
//              String ak = StringUtils.trimToEmpty(altkey);
//              int l = ak.length() - 1;
//              if (l > 0) {
//                  ak = ak.substring(0, l).trim();
//                  ak = STP.getHumplessCase(ak);
//                  String w = ak.startsWith("id_") ? "id" : ak.startsWith("numero_") ? "numero" : "";
//                  l = w.length();
//                  if (l > 0) {
//                      String s = StringUtils.trimToEmpty(styles);
//                      String c = "pdq-estilo-id-2";
//                      if (s.contains(c)) {
//                          ak = "nombre" + ak.substring(l);
////------------------------v = getWebuiString(BundleParametros.getResourceBundle(), ak);
//                      }
//                  }
////----------------v = getWebuiString(BundleParametros.getResourceBundle(), ak);
//              }
//          }
            // </editor-fold>
            return fix(v);
        }
        return null;
    }

    private static String getWebuiString(ResourceBundle resourceBundle, String key) {
//      Bitacora.trace(JSF.class, "getWebuiString-3", key);
        try {
            return resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            return null;
        }
    }

    private static String fix(String s) {
        if (StringUtils.isBlank(s)) {
            return s;
        }
        s = " " + s + " ";
        s = s.replace(" Ano ", " Año ");
        s = s.replace(" ano ", " año ");
        s = s.replace(" Anos ", " Años ");
        s = s.replace(" anos ", " años ");
        return s.trim();
    }

    private static final String BLANK_LABEL = " ";

    public static void fixBlankLabels(UIComponent uic) {
        if (uic != null) {
            Field field;
            Selector selector;
            List<UIComponent> children = uic.getChildren();
            for (UIComponent child : children) {
                if (child instanceof Field) {
                    field = (Field) child;
                    if (field.isDisabled() || field.isReadOnly() || StringUtils.isNotBlank(field.getLabel())) {
                    } else {
                        field.setLabel(BLANK_LABEL);
                    }
                } else if (child instanceof Selector) {
                    selector = (Selector) child;
                    if (selector.isDisabled() || StringUtils.isNotBlank(selector.getLabel())) {
                    } else {
                        selector.setLabel(BLANK_LABEL);
                    }
                } else {
                    fixBlankLabels(child);
                }
            }
        }
    }

    public static String getFirstClientIdWithMessages() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Iterator<String> messageClientIds = facesContext.getClientIdsWithMessages();
        String clientId;
        while (messageClientIds.hasNext()) {
            clientId = messageClientIds.next();
            if (clientId != null) {
                return clientId;
            }
        }
        return null;
    }

    public static void fixFacesMessages() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uivr = facesContext.getViewRoot();
        Iterator<String> messageClientIds = facesContext.getClientIdsWithMessages();
        String clientId;
        UIComponent uic;
        Iterator<FacesMessage> messages;
        FacesMessage message;
        String detail;
        String summary;
        String detalle;
        String resumen;
        while (messageClientIds.hasNext()) {
            clientId = messageClientIds.next();
            if (clientId != null) {
                uic = uivr == null ? null : uivr.findComponent(clientId);
                messages = facesContext.getMessages(clientId);
                while (messages.hasNext()) {
                    message = messages.next();
                    // Get the message detail
                    detail = message.getDetail();
                    summary = message.getSummary();
                    // translate                    
                    //Bitacora.trace("detalle(" + clientId + ")" + detail);
                    //Bitacora.trace("resumen(" + clientId + ")" + summary);
                    detalle = getMensaje(uic, detail);
                    resumen = getMensaje(uic, summary);
                    // Set your own message
                    message.setDetail(detalle);
                    message.setSummary(resumen);
                }
            }
        }
    }

    private static String getMensaje(UIComponent uic, String message) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String mensaje = StringUtils.trimToEmpty(message);
        /*
         *
         */
        if (uic != null) {
            mensaje = Utils.trimPrefix(mensaje, uic.getClientId(facesContext));
            mensaje = Utils.trimPrefix(mensaje, uic.getId());
        }
        mensaje = Utils.trimPrefix(mensaje, ": ");
        mensaje = Utils.trimPrefix(mensaje, "Validation Error: ");
        mensaje = Utils.trimPrefix(mensaje, "Error de Validación: ");
        /*
         *
         */
        mensaje = Utils.trimSuffix(mensaje, "Example:");
        mensaje = Utils.trimSuffix(mensaje, "Ejemplo:");
        /*
         *
         */
        mensaje = mensaje.replace(
                "is not a number",
                "debe ser un número");
        mensaje = mensaje.replace(
                "must be a number consisting of one or more digits",
                "debe ser un número");
        mensaje = mensaje.replace(
                "must be a number between",
                "debe ser un número entre");
        mensaje = mensaje.replace(
                "Specified attribute is not between the expected values of",
                "El valor debe estar comprendido entre");
        mensaje = mensaje.replace(
                " and ",
                " y ");
        /*
         *
         */
        mensaje = mensaje.replace(
                "Valor es necesario",
                "El valor es necesario");
        /*
         *
         */
        String sujeto = uic instanceof TextArea
                ? "La longitud del valor"
                : "El valor";
        mensaje = mensaje.replace(
                "Valor es más grande de valor de máximo permitido:",
                sujeto + " debe ser menor o igual que");
        mensaje = mensaje.replace(
                "Valor is menos de valor de mínimo permitido:",
                sujeto + " debe ser mayor o igual que");
        /*
         *
         */
        return mensaje;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer propiedades de componentes visuales ">
    public static void set(HtmlPanelGrid[] htmlPanelGrids, boolean rendered) {
        for (HtmlPanelGrid htmlPanelGrid : htmlPanelGrids) {
            set(htmlPanelGrid, rendered);
        }
    }

    public static void set(HtmlPanelGrid htmlPanelGrid, boolean rendered) {
        htmlPanelGrid.setRendered(rendered);
    }

    public static void set(TextField textField, boolean readOnly, boolean rendered) {
        if (textField != null) {
            textField.setReadOnly(readOnly);
            textField.setRendered(rendered);
        }
    }

    public static void set(Calendar calendar, StaticText staticText, boolean readOnly, boolean rendered) {
        setRendered(calendar, staticText, readOnly, rendered);
        setText(calendar, staticText, readOnly, rendered);
    }

    public static void set(DropDown dropDown, StaticText staticText, boolean readOnly, boolean rendered) {
        setRendered(dropDown, staticText, readOnly, rendered);
        setText(dropDown, staticText, readOnly, rendered);
    }

    private static void setRendered(WebuiInput webuiInput, StaticText staticText, boolean readOnly, boolean rendered) {
        boolean editable = !readOnly;
        if (webuiInput != null) {
            webuiInput.setRendered(rendered && editable);
        }
        if (staticText != null) {
            staticText.setRendered(rendered && readOnly);
        }
    }

    private static void setText(WebuiInput webuiInput, StaticText staticText, boolean readOnly, boolean rendered) {
        if (staticText != null) {
            String text = null;
            if (rendered && readOnly && webuiInput != null) {
                if (webuiInput instanceof Calendar) {
                    Calendar calendar = (Calendar) webuiInput;
                    java.util.Date selected = calendar.getSelectedDate();
                    text = selected == null ? "selected == null" : STP.getString(selected);
                }
                if (webuiInput instanceof DropDown) {
                    DropDown dropDown = (DropDown) webuiInput;
                    Option selected = getOpcion(dropDown);
                    text = selected == null ? "selected == null" : dropDown.getItems() == null ? "items == null"
                            : selected.getLabel();
                }
            }
            staticText.setText(text);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de ventanas ">
    public static String getCloseWindowJavaScript() {
        return JS.getCloseWindowJavaScript();
    }

    public static String getOpenFileWindowJavaScript(String file) {
        return getOpenFileWindowJavaScript(file, Utils.getSpooledFilesWebDir());
    }

    public static String getOpenFileWindowJavaScript(String file, String folder) {
        return JS.getOpenFileWindowJavaScript(getFileURL(file, folder));
    }

    public static String getOpenURIWindowJavaScript(String uri) {
        return JS.getOpenFileWindowJavaScript(encodeURI(uri));
    }

    public static String getOpenURLWindowJavaScript(String url) {
        return JS.getOpenFileWindowJavaScript(encodeURL(url));
    }

    public static String getOpenURXWindowJavaScript(String urx) {
        return JS.getOpenFileWindowJavaScript(encodeURX(urx));
    }

    public static String getOpenHelpWindowJavaScript(String pagina) {
//      FacesContext facesContext = FacesContext.getCurrentInstance();
//      if (facesContext == null) {
//          return null;
//      }
//      String url = facesContext.getExternalContext().getRequestContextPath() + URX2.AYUDA;
//      String rpi = facesContext.getExternalContext().getRequestPathInfo();
        String url = URX2.WEB + URX2.AYUDA;
        String rpl = null;
        String htm;
        if (StringUtils.isBlank(pagina)) {
//          if (rpi != null) {
//              int j = rpi.lastIndexOf(JS.JSP_SUFFIX);
//              if (j > 0) {
//                  rpl = "?jsp=" + rpi.substring(rpi.lastIndexOf("/", j) + 1, j);
//              }
//          }
        } else {
            rpl = "?jsp=" + pagina;
            htm = BundlePaginas.getCodigoGrupoAplicacion(pagina);
            if (StringUtils.isNotBlank(htm)) {
//              rpl += "&htm=" + STP.getCamelCase('_' + htm);
                rpl += "&htm=" + htm;
            }
        }
        return JS.getOpenWindowJavaScript(url, rpl, Global.HELP_WINDOW_NAME);
    }

    public static String getOpenSearchWindowJavaScript(String urx, EnumOpcionAbrirVentana option, String field) {
        return getOpenSearchWindowJavaScript(urx, option, field, null);
    }

    public static String getOpenSearchWindowJavaScript(String urx, EnumOpcionAbrirVentana option, String field, String button) {
        return getOpenSearchWindowJavaScript(urx, option, field, button, null);
    }

    public static String getOpenSearchWindowJavaScript(String urx, EnumOpcionAbrirVentana option, String field, String button, ListaParametros rpl) {
        String url = getJSPURL(urx);
        String window = getTargetWindowName(url);
        return JS.getOpenSearchWindowJavaScript(url, option, field, button, rpl, window);
    }

    public static String getOpenSearchWindowJavaScript(String urx, String column, String field) {
        return getOpenSearchWindowJavaScript(urx, column, field, null);
    }

    public static String getOpenSearchWindowJavaScript(String urx, String column, String field, String button) {
        return getOpenSearchWindowJavaScript(urx, column, field, button, null);
    }

    public static String getOpenSearchWindowJavaScript(String urx, String column, String field, String button, ListaParametros rpl) {
        String url = getJSPURL(urx);
        String window = getTargetWindowName(url);
        return JS.getOpenSearchWindowJavaScript(url, column, field, button, rpl, window);
    }

    public static String getOpenDetailWindowJavaScript(String urx, String rpl) {
        String url = getJSPURL(urx);
        String window = getTargetWindowName(url);
        return JS.getOpenWindowJavaScript(url, rpl, window);
    }

    public static String getOpenWindowJavaScript(String urx, String rpl) {
        return JS.getOpenWindowJavaScript(getJSPURL(urx), rpl);
    }

    public static String getFileURL(String file) {
        return getFileURL(file, Utils.getSpooledFilesWebDir());
    }

    public static String getFileURL(String file, String folder) {
        if (StringUtils.isBlank(file) || StringUtils.isBlank(folder)) {
            return null;
        }
        String url = getCurrentServer();
        if (url == null) {
            return null;
        }
        file = StringUtils.trimToEmpty(file);
        folder = StringUtils.trimToEmpty(folder);
        if (!folder.startsWith("/")) {
            url += "/";
        }
        url += folder;
        if (!folder.endsWith("/")) {
            url += "/";
        }
        url += file;
        return url;
    }

    public static String getRequestParameter(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
//      key = StringUtils.trimToEmpty(key);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext == null) {
            return null;
        }
        return ((HttpServletRequest) facesContext.getExternalContext().getRequest()).getParameter(key);
    }

    public static String getRequestURL() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext == null) {
            return null;
        }
        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        if (request == null) {
            return null;
        }
        return request.getRequestURL() == null ? null : StringUtils.trimToNull(request.getRequestURL().
                toString());
    }

    private static String getWindowName() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext == null) {
            return null;
        }
        return facesContext.getExternalContext().getRequestContextPath().replace("/", "").replace("-", "_");
    }

    private static String getTargetWindowName(String url) {
//      String sourceWindow = getWindowName();
        String targetWindow = JS.getApplication(url);
//      if (url != null && sourceWindow != null && sourceWindow.equals(targetWindow)) {
//          int j = url.lastIndexOf(JS.JSP_SUFFIX);
//          int i = url.lastIndexOf("/", j);
//          targetWindow = sourceWindow + "-" + url.substring(i + 1, j);
//      }
        return targetWindow.replace("-", "_");
    }

    public static String encodeURI(String uri) {
        if (StringUtils.isBlank(uri)) {
            return null;
        }
        String url = getCurrentServer();
        if (url == null) {
            return null;
        }
        uri = StringUtils.trimToEmpty(uri);
        if (!uri.startsWith("/")) {
            url += "/";
        }
        url += uri;
        return url;
    }

    public static String encodeURL(String url) {
        url = StringUtils.trimToEmpty(url);
        if (StringUtils.isBlank(url)) {
            return null;
        } else if (url.startsWith(JS.FILE_PREFIX)) {
        } else if (url.startsWith(JS.HTTP_PREFIX)) {
        } else if (url.startsWith(JS.HTTPS_PREFIX)) {
        } else {
//          url = JS.HTTP_PREFIX + url;
            return null;
        }
//      if(!url.endsWith("/")) url += "/";
        return url;
    }

    public static String encodeURX(String urx) {
        if (StringUtils.isBlank(urx)) {
            return null;
        }
        urx = StringUtils.trimToEmpty(urx);
        return urx.startsWith("/") ? encodeURI(urx) : encodeURL(urx);
    }

    public static void redirect(String url) throws IOException {
        redirect(url, true);
    }

    public static void redirect(String url, boolean encode) throws IOException {
        Bitacora.trace(JSF.class, "redirect", "url=" + url, "encode=" + encode);
        if (StringUtils.isBlank(url)) {
            return;
        }
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext == null) {
            return;
        }
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        url = StringUtils.trimToEmpty(url);
        url = encode ? response.encodeRedirectURL(url) : url;
        Bitacora.trace(url);
        try {
            response.sendRedirect(url);
            facesContext.responseComplete();
        } catch (Exception ex) {
            // TODO: manejar el java.lang.IllegalStateException?
            Bitacora.logTrace(ex);
        }
    }

    public static void stamp(Object objeto, String metodo, String contexto, boolean request) {
        if (objeto != null) {
            String str = "<" + StringUtils.trimToEmpty(metodo) + StringUtils.trimToEmpty(contexto) + ">";
            if (request) {
                String url = getRequestURL();
                if (StringUtils.isNotBlank(url)) {
                    str += " " + StringUtils.trimToEmpty(url);
                    String reset = getRequestParameter(Global.PARAMETRO_CONDICION_SESION);
                    if (StringUtils.isNotBlank(reset)) {
                        str += "?" + Global.PARAMETRO_CONDICION_SESION + "=" + StringUtils.trimToEmpty(reset);
                    }
                }
            }
            Bitacora.stamp(objeto, str);
        }
    }

    private static String getCurrentServer() {
        String url = getRequestURL();
        int j = jota(url);
        return j > 0 ? url.substring(0, j) : null;
    }

//  private static String getCurrentApplication() {
//      return getApplication(getRequestURL());
//  }
//
//  private static String getApplication(String url) {
//      int j = jota(url);
//      if (j > 0) {
//          int i = j + 1;
//          int k = url.indexOf("/", i);
//          if (k > j) {
//              return url.substring(i, k);
//          } else {
//              return url.substring(i);
//          }
//      }
//      return null;
//  }
//
    private static String getJSPURL(String urx) {
        if (StringUtils.isBlank(urx)) {
            return null;
        }
        urx = StringUtils.trimToEmpty(urx);
        String server = getJSPServer(urx);
        if (server == null) {
            return null;
        }
        String uri = getJSPURI(urx);
        if (uri == null) {
            return null;
        }
        return server + uri;
    }

    private static String getJSPServer(String urx) {
        if (StringUtils.isBlank(urx)) {
            return null;
        }
        urx = StringUtils.trimToEmpty(urx);
        if (urx.endsWith(JS.JSP_SUFFIX)) {
            urx = urx.startsWith("/") ? getRequestURL() : urx;
            int j = jota(urx);
            if (j > 0) {
                return urx.substring(0, j);
            }
        }
        return null;
    }

    private static String getJSPURI(String urx) {
        if (StringUtils.isBlank(urx)) {
            return null;
        }
        urx = StringUtils.trimToEmpty(urx);
        if (urx.endsWith(JS.JSP_SUFFIX)) {
            if (urx.startsWith("/")) {
                return urx;
            }
            int j = jota(urx);
            if (j > 0) {
                return urx.substring(j);
            }
        }
        return null;
    }

    private static int jota(String url) {
        if (StringUtils.isBlank(url)) {
            return -1;
        }
        url = StringUtils.trimToEmpty(url);
        if (url.startsWith(JS.HTTP_PREFIX) || url.startsWith(JS.HTTPS_PREFIX)) {
            int i = url.startsWith(JS.HTTP_PREFIX) ? JS.HTTP_PREFIX.length() : JS.HTTPS_PREFIX.length();
            int j = url.indexOf("/", i);
            if (j > i) {
                return j;
            }
        }
        return -1;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de cookies ">
    private static String getCookie(String key) {
        return getCookie(key, false);
    }

    private static String getCookie(String key, boolean qualified) {
        return qualified ? getCookie(key, 1) : getCookie(key, 2);
    }

    private static String getCookie(String key, int option) {
        Bitacora.trace(JSF.class, "getCookie", "key=" + key, "option=" + option);
        /*
         * 1 = busca con clave privada (cualificada)
         * 2 = busca con clave publica (no cualificada)
         * 3 = busca primero con clave privada y luego con clave publica
         * 4 = busca primero con clave publica y luego con clave privada
         */
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String qualifiedKey = key + getRequestQualifier();
        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        Cookie[] cookie = request.getCookies();
        String[] clave = {null, null};
        switch (option) {
            case 1:
                clave[0] = qualifiedKey;
                break;
            case 2:
                clave[0] = key;
                break;
            case 3:
                clave[0] = qualifiedKey;
                clave[1] = key;
                break;
            case 4:
                clave[0] = key;
                clave[1] = qualifiedKey;
                break;
            default:
                return null;
        }
        for (int i = 0; i < cookie.length; i++) {
            for (int j = 0; j < clave.length; j++) {
                if ((clave[j] != null && cookie[i].getName().equals(clave[j]))) {
                    return cookie[i].getValue();
                }
            }
        }
        return null;
    }

    private static String putCookie(String key, String value) {
        return putCookie(key, value, false);
    }

    private static String putCookie(String key, String value, boolean qualified) {
        return putCookie(key, value, qualified, -1);
    }

    private static String putCookie(String key, String value, boolean qualified, int expiry) {
        Bitacora.trace(JSF.class, "putCookie", "key=" + key, "value=" + value, "qualified=" + qualified, "expiry=" + expiry);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        String qualifiedKey = key + getRequestQualifier();
        String name = qualified ? qualifiedKey : key;
        Cookie cookie = new Cookie(name, value);
        /*
         * maximum age of the cookie in seconds; if negative, the cookie is not stored; if zero, deletes the cookie.
         */
        cookie.setMaxAge(expiry);
        response.addCookie(cookie);
        return name;
    }

    private static String deleteCookie(String key) {
        Bitacora.trace(JSF.class, "deleteCookie", "key=" + key);
        return getCookie(key) == null ? null : putCookie(key, "", false, 0);
    }

    private static String getRequestQualifier() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        String qualifier = request.getContextPath(); /*
         * request.getRequestURI().replace("/faces", StringUtils.EMPTY);
         */
        return qualifier;
    }

    private static String getRequestValue(String key, int cookies) {
        String value = getRequestParameter(key);
        if (value == null && cookies != 0) {
            value = getCookie(key, cookies);
        }
        return value;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de sesión ">
    public static HttpServletRequest getRequest() {
        FacesContext fc = FacesContext.getCurrentInstance();
        return fc != null && fc.getExternalContext() != null
                && fc.getExternalContext().getRequest() instanceof HttpServletRequest
                ? (HttpServletRequest) fc.getExternalContext().getRequest() : null;
    }

    public static HttpSession getSession() {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getSession(false);
    }

    public static Principal getPrincipal() {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getUserPrincipal();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de listas desplegables (DropDown) ">
    public static Option getOpcion(DropDown list) {
        Option option = null;
        if (list != null) {
            option = getOpcion(list.getSelected(), list.getItems());
        }
        return option;
    }

    public static Option getOpcion(Object value, Object items) {
        Option option = null;
        if (value != null && items != null) {
            if (items instanceof List) {
                Iterator iterator = ((List) items).iterator();
                Object optionObject;
                Object valueOption;
                while (iterator.hasNext() && option == null) {
                    optionObject = iterator.next();
                    if (optionObject != null && optionObject instanceof Option) {
                        valueOption = ((Option) optionObject).getValue();
                        if (valueOption != null && value.equals(valueOption)) {
                            option = (Option) optionObject;
                        }
                    }
                }
            } else {
                if (items instanceof Option[]) {
                    Option[] options = ((Option[]) items);
                    Object valueOption;
                    for (int i = 0; i < options.length && option == null; i++) {
                        valueOption = options[i].getValue();
                        if (valueOption != null && value.equals(valueOption)) {
                            option = options[i];
                        }
                    }
                }
            }
        }

        return option;
    }

    public static ArrayList getListaOpciones(RecursoCachedRowSetDataProvider dp, boolean anulable, String columna, boolean ordenado) {
        return getListaOpciones(dp, anulable, columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, ordenado);
    }

    public static ArrayList getListaOpciones(RecursoCachedRowSetDataProvider dp, boolean anulable, EnumColumnaEtiqueta columna, boolean ordenado) {
        return getListaOpciones(dp, anulable, null, columna, ordenado);
    }

    private static ArrayList getListaOpciones(RecursoCachedRowSetDataProvider dp, boolean anulable, String colname, EnumColumnaEtiqueta coltype, boolean ordenado) {
        Object value;
        String label;
        String description;
        ListOptions list = new ListOptions(anulable, ordenado);
        if (dp.isRecursoIdentificable() || dp.isRecursoEnumerable()) {
            if (dp.cursorFirst()) {
                do {
                    if (dp.isRecursoIdentificable()) {
                        value = dp.getRecursoIdentificableDataProvider().getIdentificacionRecurso();
                    } else {
                        value = dp.getRecursoEnumerableDataProvider().getNumeroRecurso();
                    }
                    if (value != null) {
                        if (StringUtils.isBlank(colname)) {
                            label = getRowLabel(dp, dp.getCursorRow(), coltype, PREFIJO_STRING_ID_FILA);
                        } else {
                            label = getRowLabel(dp, dp.getCursorRow(), colname, PREFIJO_STRING_ID_FILA);
                        }
                        if (dp.isRecursoNombrable()) {
                            description = dp.getRecursoNombrableDataProvider().getNombreRecurso();
                        } else {
                            description = null;
                        }
                        list.add(value, label, description);
                    }
                } while (dp.cursorNext());
            }
        }
        return getListaOpciones(list);
    }

    public static ArrayList getListaOpciones(Collection c, RecursoWrapper rw) {
        return getListaOpciones(c, rw, true);
    }

    public static ArrayList getListaOpciones(Collection c, RecursoWrapper rw, boolean anulable) {
        return getListaOpciones(c, rw, anulable, EnumColumnaEtiqueta.AMBAS_COLUMNAS);
    }

    public static ArrayList getListaOpciones(Collection c, RecursoWrapper rw, boolean anulable, EnumColumnaEtiqueta coltype) {
        return getListaOpciones(c, rw, anulable, coltype, true);
    }

    public static ArrayList getListaOpciones(Collection c, RecursoWrapper rw, boolean anulable, EnumColumnaEtiqueta coltype, boolean ordenado) {
        Object value;
        String label;
        String description;
        ListOptions list = new ListOptions(anulable, ordenado);
        for (Object recurso : c) {
            rw.setRecurso(recurso);
            if (rw.isRecursoIdentificable() || rw.isRecursoEnumerable()) {
                if (rw.isRecursoIdentificable()) {
                    value = rw.getRecursoIdentificable().getIdentificacionRecurso();
                } else {
                    value = rw.getRecursoEnumerable().getNumeroRecurso();
                }
                if (value != null) {
                    label = getRowLabel(rw, coltype, PREFIJO_STRING_ID_FILA);
                    if (rw.isRecursoNombrable()) {
                        description = rw.getRecursoNombrable().getNombreRecurso();
                    } else {
                        description = null;
                    }
                    list.add(value, label, description);
                }
            }
        }
        return getListaOpciones(list);
    }

    public static ArrayList getListaOpciones(ListOption[] options) {
        return getListaOpciones(options, true);
    }

    public static ArrayList getListaOpciones(ListOption[] options, boolean anulable) {
        return getListaOpciones(options, anulable, true);
    }

    public static ArrayList getListaOpciones(ListOption[] options, boolean anulable, boolean ordenado) {
        ListOptions list = new ListOptions(anulable, ordenado);
        list.add(options);
        return getListaOpciones(list);
    }

    public static ArrayList getListaOpciones(ListOptions list) {
        ArrayList<Option> options = new ArrayList();
        for (ListOption option : list.getList()) {
            options.add(new Option(option.getOptionValue(), option.getOptionLabel(), option.getOptionDescription(), option.isOptionDisabled()));
        }
        // TODO: comprobar que no se pierda el orden; si se pierde, activar el siguiente código
//      if (list.isOrdenado()) {
//          Collections.sort(options, new OptionLabelComparator());
//      } else {
//          Collections.sort(options, new OptionValueComparator());
//      }
        return options;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de arboles de nodos (Tree/TreeNode)">
    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, String columna, String url, MethodExpression mex) {
        return getArbolNodos(dp, columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, url, mex, null, false);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, String columna, String url, MethodExpression mex, Long id) {
        return getArbolNodos(dp, columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, url, mex, id, false);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, String columna, String url, MethodExpression mex, Long id, boolean base) {
        return getArbolNodos(dp, columna, EnumColumnaEtiqueta.AMBAS_COLUMNAS, url, mex, id, base);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, EnumColumnaEtiqueta columna, String url, MethodExpression mex) {
        return getArbolNodos(dp, null, columna, url, mex, null, false);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, EnumColumnaEtiqueta columna, String url, MethodExpression mex, Long id) {
        return getArbolNodos(dp, null, columna, url, mex, id, false);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, EnumColumnaEtiqueta columna, String url, MethodExpression mex, Long id, boolean base) {
        return getArbolNodos(dp, null, columna, url, mex, id, base);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, String colname, EnumColumnaEtiqueta coltype, String url, MethodExpression mex, Long id, boolean base) {
        return getArbolNodos(dp, colname, coltype, url, mex, id, base, false);
    }

    public static Tree getArbolNodos(RecursoCachedRowSetDataProvider dp, String colname, EnumColumnaEtiqueta coltype, String url, MethodExpression mex, Long id, boolean base,
            boolean activeOnly) {
        Tree arbol = getNewTree(dp);
        if (dp.isRecursoJerarquizable()) {
            if (dp.cursorFirst()) {
                int limite = dp.getLimiteFilasFuncionSelect();
                if (limite > 0) {
                    int filas = dp.getRowCount();
                    if (filas == limite) {
                        Bitacora.trace(JSF.class, "getArbolNodos", "limite=" + limite);
                        return arbol;
                    }
                }
                if (id == null) {
                    do {
                        if (dp.getRecursoJerarquizableDataProvider().getRecursoSuperior() == null) {
                            addTreeNode(arbol, dp, colname, coltype, url, mex, dp.getCursorRow(), activeOnly);
                        }
                    } while (dp.cursorNext());
                } else {
                    RowKey rowKey = dp.findFirst(dp.getRecursoJerarquizableDataProvider().
                            getColumnaIdentificacionRecurso(), id);
                    if (dp.isRowAvailable(rowKey)) {
                        if (base) {
                            addTreeNode(arbol, dp, colname, coltype, url, mex, rowKey, activeOnly);
                        } else {
                            arbol.setId(getTreeNodeId(dp, rowKey));
                            arbol.setText(getTreeNodeText(dp, rowKey, colname));
                            do {
                                if (dp.getRecursoJerarquizableDataProvider().getRecursoSuperior() != null) {
                                    if (dp.getRecursoJerarquizableDataProvider().getRecursoSuperior().equals(
                                            id)) {
                                        addTreeNode(arbol, dp, colname, coltype, url, mex, dp.getCursorRow(),
                                                activeOnly);
                                    }
                                }
                            } while (dp.cursorNext());
                        }
                    }
                }
            }
        }
        return arbol;
    }

    private static Tree getNewTree(RecursoCachedRowSetDataProvider dp) {
        Tree arbol = new Tree();
        arbol.setId(dp.getCodigoDominioRecurso());
        arbol.setText(dp.getNombreDominioRecurso());
        return arbol;
    }

    private static TreeNode addTreeNode(TreeNode parent, RecursoCachedRowSetDataProvider dp, String colname, EnumColumnaEtiqueta coltype, String url, MethodExpression mex, RowKey rowKey, boolean activeOnly) {
        if (activeOnly && dp.isRecursoDesactivable() && BitUtils.valueOf(dp.getRecursoDesactivableDataProvider().getEsRecursoInactivo(rowKey))) {
            return null;
        }
        String clave = dp.getRecursoJerarquizableDataProvider().getColumnaRecursoSuperior();
        Long id = dp.getRecursoJerarquizableDataProvider().getIdentificacionRecurso(rowKey);
        String tnid = getTreeNodeId(dp, rowKey);
        String text;
        String toolTip = getTreeNodeText(dp, rowKey, EnumColumnaEtiqueta.AMBAS_COLUMNAS);
        String urlx;
        String target = null;
        if (StringUtils.isBlank(colname)) {
            text = getTreeNodeText(dp, rowKey, coltype);
        } else {
            text = getTreeNodeText(dp, rowKey, colname);
        }
        if (dp.isRecursoLocalizable()) {
            urlx = dp.getRecursoLocalizableDataProvider().getUrl(rowKey);
            //  <editor-fold>
//          if (urlx != null) {
//              target = Global.DEFAULT_WINDOW_NAME;
//              target = getWindowName();
//              target = "_blank";    /* renders the response in a new, unnamed window */
//              target = "_self";     /* renders the response in the current frame */
//              target = "_parent";   /* renders the response in the immediate frameset parent */
//              target = "_top";      /* renders the response in the full, unframed window */
//          }
            //  </editor-fold>
        } else {
            urlx = addRequestPostBackParameters(url, id);
        }
        TreeNode child = addTreeNode(parent, tnid, text, toolTip, urlx, mex, target);
        if (dp.esFilaEscogida(rowKey)) {
            expand(child);
        }
        if (StringUtils.isBlank(clave)) { /*
             * para que no falle con ListaRecursoCachedRowSetDataProvider
             */
            return child;
        }
        RowKey[] children = dp.findAll(clave, id);
        if (children != null && children.length > 0) {
            for (int i = 0; i < children.length; i++) {
                addTreeNode(child, dp, colname, coltype, url, mex, children[i], activeOnly);
            }
        }
        return child;
    }

    private static TreeNode addTreeNode(TreeNode parent, String id, String text, String toolTip, String url, MethodExpression mex, String target) {
        TreeNode child = new TreeNode();
        child.setId(id);
        child.setText(text);
        child.setToolTip(toolTip);
        if (url != null) {
            child.setUrl(url);
        }
        if (mex != null) {
            child.setActionExpression(mex);
        }
        if (target != null) {
            child.setTarget(target);
        }
        List children = parent.getChildren();
        children.add(child);
        return child;
    }

    private static String getTreeNodeId(RecursoCachedRowSetDataProvider dp, RowKey rowKey) {
        return getRowIdStr(dp, rowKey, PREFIJO_STRING_ID_NODO);
    }

    private static String getTreeNodeId(Long id) {
        return PREFIJO_STRING_ID_NODO + id;
    }

    private static String getTreeNodeText(RecursoCachedRowSetDataProvider dp, RowKey rowKey, String columna) {
        return getRowLabel(dp, rowKey, columna, PREFIJO_STRING_ID_NODO);
    }

    private static String getTreeNodeText(RecursoCachedRowSetDataProvider dp, RowKey rowKey, EnumColumnaEtiqueta columna) {
        return getRowLabel(dp, rowKey, columna, PREFIJO_STRING_ID_NODO);
    }

    public static void addNodosArbol(TreeNode source, TreeNode target) {
        // No se puede usar el metodo addAll de la clase List; tampoco un loop con el Iterator o el ListIterator;
        // usando cualquiera de estos tres, el metodo add dentro del loop hace que se salten objetos de la lista,
        // dando como resultado una copia incompleta (uno si y uno no); por eso se necesita esta funcion.
        List sourceChildren = source.getChildren();
        List targetChildren = target.getChildren();
        Object child;
        Object[] sourceChildrenArray = sourceChildren.toArray();
        for (int i = 0; i < sourceChildrenArray.length; i++) {
            child = sourceChildrenArray[i];
            if (child != null && child instanceof TreeNode) {
                targetChildren.add((TreeNode) child);
            }
        }
    }

    public static TreeNode getNodo(Tree tree, Long id) {
        return getTreeNodeById(tree, getTreeNodeId(id));
    }

    public static TreeNode getNodo(Tree tree, String id) {
        return getTreeNodeById(tree, id);
    }

    public static TreeNode getNodoSeleccionado(Tree tree) {
//      String id = tree.getCookieSelectedTreeNode();
        String id = tree.getSelected();
        return getTreeNodeById(tree, id);
    }

    //  <editor-fold>
//  public static TreeNode getNodoSeleccionado(Tree tree, Form form) {
//      String id = tree.getCookieSelectedTreeNode();
//      return getTreeNodeById(form, id);
//  }
    //  </editor-fold>
/*
     *
     */
    public static TreeNode setNodoSeleccionado(Tree tree, Long id) {
        String treeKey = "form1:tree1";
        /*
         * expand node
         */
        /*
         * glassfish-3.1: El nombre de Cookie form1:tree1-expand es una palabra reservada
         */
//      String cookie1 = treeKey + "-expand";
        String cookie1 = "form1-tree1-expand";
//
        /*
         * highlight node
         */
        /*
         * glassfish-3.1: El nombre de Cookie form1:tree1-hi es una palabra reservada
         */
//      String cookie2 = treeKey + "-hi";
        String cookie2 = "form1-tree1-hi";
//
        TreeNode nodo = getNodo(tree, id);
        if (nodo == null) {
            deleteCookie(cookie1);
            deleteCookie(cookie2);
        } else {
            putCookie(cookie1, treeKey + ":" + getTreeNodeConcatId(nodo));
            putCookie(cookie2, treeKey + ":" + getTreeNodeConcatId(nodo));
        }
        return nodo;
    }

    private static TreeNode getTreeNodeById(TreeNode parent, String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        String nodeId = id.substring(id.lastIndexOf(":") + 1);
        Object child;
        TreeNode child1;
        TreeNode child2;
        List children = parent.getChildren();
        Iterator iterator = children.iterator();
        while (iterator.hasNext()) {
            child = iterator.next();
            if (child != null && child instanceof TreeNode) {
                child1 = (TreeNode) child;
                if (child1.getId().equals(nodeId)) {
                    return child1;
                } else {
                    child2 = getTreeNodeById(child1, id);
                    if (child2 != null) {
                        return child2;
                    }
                }
            }
        }
        return null;
    }

    //  <editor-fold>
//  private static TreeNode getTreeNodeById(Form form, String id) {
//      if (StringUtils.isBlank(id)) {
//          return null;
//      }
//      int i = id.lastIndexOf(":");
//      if (i < 0) {
//          return null;
//      }
//      UIComponent component = form.findComponent(id);
//      if (component != null && component instanceof TreeNode) {
//          return (TreeNode) component;
//      }
//      return null;
//  }
    //  </editor-fold>
/*
     *
     */
    private static Tree getTreeNodeTree(TreeNode node) {
        if (node instanceof Tree) {
            return (Tree) node;
        }
        UIComponent component = node.getParent();
        if (component != null && component instanceof TreeNode) {
            return getTreeNodeTree((TreeNode) component);
        }
        return null;
    }

    private static void expand(TreeNode child) {
        child.setExpanded(true);
        if (child.getParent() instanceof TreeNode) {
            expand((TreeNode) child.getParent());
        }
    }

    private static String getTreeNodeConcatId(TreeNode child) {
        if (child.getParent() instanceof Tree) {
            return child.getId();
        }
        if (child.getParent() instanceof TreeNode) {
            return getTreeNodeConcatId((TreeNode) child.getParent()) + ":" + child.getId();
        }
        return child.getId();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para el manejo de migas de pan (Breadcrumbs/Hyperlink) ">
    public static Hyperlink addHipervinculoInicio(Breadcrumbs breadcrumbs) {
        String text = Bundle.getString("hyperlink.inicio.text");
        String toolTip = Bundle.getString("hyperlink.inicio.toolTip");
        String url = encodeURX(URX2.INICIO);
        String target = null;
        return addHyperlink(breadcrumbs, text, toolTip, url, target);
    }

    public static Hyperlink addHipervinculo(Breadcrumbs parent, String text, String toolTip, String url, boolean scratch) {
        if (scratch && parent.getChildCount() > 0) {
            parent.getChildren().clear();
        }
        if (parent.getChildCount() == 0) {
            addHipervinculoInicio(parent);
        }
        if (StringUtils.isBlank(text) || StringUtils.isBlank(url)) {
            return null;
        }
        Hyperlink child = getHyperlinkByUrl(parent, url);
        if (child == null) {
            return addHyperlink(parent, text, toolTip, url, null);
        }
        child.setText(text);
        Breadcrumbs breadcrumbs = new Breadcrumbs();
        addHipervinculos(parent, breadcrumbs, url);
        addHipervinculos(breadcrumbs, parent);
        return getHyperlinkByUrl(parent, url);
    }

    public static Hyperlink updateHipervinculo(Breadcrumbs parent, String text, String toolTip, String url) {
        if (parent.getChildCount() == 0) {
            return null;
        }
        if (StringUtils.isBlank(text) || StringUtils.isBlank(url)) {
            return null;
        }
        Hyperlink child = getHyperlinkByUrl(parent, url);
        if (child == null) {
            return null;
        }
        child.setText(text);
        child.setToolTip(toolTip);
        child.setUrl(addRequestPostBackParameters(url));
        return child;
    }

    public static void removeHipervinculo(Breadcrumbs parent, String url) {
        if (StringUtils.isBlank(url)) {
            return;
        }
        Hyperlink child = getHyperlinkByUrl(parent, url);
        if (child != null) {
            parent.getChildren().remove(child);
        }
    }

    private static Hyperlink addHyperlink(Breadcrumbs parent, String text, String toolTip, String url, String target) {
        Hyperlink child = new Hyperlink();
        child.setId(parent.getId() + "Hyperlink" + (parent.getChildCount() + 1));
        child.setText(text);
        child.setToolTip(toolTip);
        if (url != null) {
            child.setUrl(url);
        }
        if (target != null) {
            child.setTarget(target);
        }
        List children = parent.getChildren();
        children.add(child);
        return child;
    }

    private static Hyperlink getHyperlinkByUrl(Breadcrumbs parent, String url) {
        if (StringUtils.isBlank(url)) {
            return null;
        }
        Hyperlink child;
        List children = parent.getChildren();
        Iterator iterator = children.iterator();
        while (iterator.hasNext()) {
            child = (Hyperlink) iterator.next();
            if (child != null) {
                if (StringUtils.substringBefore(url, "?").equals(StringUtils.substringBefore(child.getUrl(),
                        "?"))) {
                    return child;
                }
            }
        }
        return null;
    }

    public static void addHipervinculos(Breadcrumbs source, Breadcrumbs target) {
        /*
         * copia completa
         */
        addHipervinculos(source, target, null);
    }

    private static void addHipervinculos(Breadcrumbs source, Breadcrumbs target, String url) {
        // Esto esta peor que el TreeNode, falla aun con el Array
        // Hay que clonar el hyperlink para poder copiarlo
        /*
         * copia solo hasta el hyperlink con el url especoficado
         */
        boolean up2url = !StringUtils.isBlank(url);
        List sourceChildren = source.getChildren();
        List targetChildren = target.getChildren();
        Hyperlink child;
        Object[] sourceChildrenArray = sourceChildren.toArray();
        targetChildren.clear();
        for (int i = 0; i < sourceChildrenArray.length; i++) {
            child = (Hyperlink) sourceChildrenArray[i];
            if (child != null) {
                Hyperlink clone = new Hyperlink();
                clone.setId(child.getId());
                clone.setText(child.getText());
                clone.setToolTip(child.getToolTip());
                clone.setUrl(child.getUrl());
                clone.setTarget(child.getTarget());
                targetChildren.add(clone);
                if (up2url && StringUtils.substringBefore(url, "?").equals(StringUtils.substringBefore(clone.getUrl(), "?"))) {
                    return;
                }
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="constantes publicas y metodos privados ">
    private static final String PREFIJO_STRING_ID_FILA = Global.PREFIJO_STRING_ID_RECURSO;

    private static final String PREFIJO_STRING_ID_NODO = "N";

    private static String getRowIdStr(RecursoCachedRowSetDataProvider dp, RowKey rowKey, String prefijo) {
        Object id = null;
        if (dp.isRecursoIdentificable()) {
            id = dp.getRecursoIdentificableDataProvider().getIdentificacionRecurso(rowKey);
        } else if (dp.isRecursoEnumerable()) {
            id = dp.getRecursoEnumerableDataProvider().getNumeroRecurso(rowKey);
//      } else if (dp.isRecursoCodificable()) {
//          id = dp.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
        }
        return id == null ? null : prefijo + id;
    }

    private static String getRowLabel(RecursoCachedRowSetDataProvider dp, RowKey rowKey, String columna, String prefijo) {
        String id = getRowIdStr(dp, rowKey, prefijo);
        String label = null;
        Object value = dp.getValue(columna, rowKey);
        if (value instanceof String) {
            label = (String) value;
        }
        return StringUtils.isBlank(label) ? id : label;
    }

    private static String getRowLabel(RecursoCachedRowSetDataProvider dp, RowKey rowKey, EnumColumnaEtiqueta columna, String prefijo) {
        String id = getRowIdStr(dp, rowKey, prefijo);
        String code = null;
        String name = null;
        if (dp.isRecursoCodificable()) {
            code = dp.getRecursoCodificableDataProvider().getCodigoRecurso(rowKey);
        }
        if (dp.isRecursoNombrable()) {
            name = dp.getRecursoNombrableDataProvider().getNombreRecurso(rowKey);
        }
        return getRowLabel(columna, id, code, name);
    }

    private static String getRowLabel(RecursoWrapper rw, EnumColumnaEtiqueta columna, String prefijo) {
        String id = null;
        if (rw.isRecursoIdentificable()) {
            id = prefijo + rw.getRecursoIdentificable().getIdentificacionRecurso();
        } else if (rw.isRecursoEnumerable()) {
            id = prefijo + rw.getRecursoEnumerable().getNumeroRecurso();
//      } else if (rw.isRecursoCodificable()) {
//          id = prefijo + rw.getRecursoCodificable().getCodigoRecurso();
        }
        String code = rw.isRecursoCodificable() ? rw.getRecursoCodificable().getCodigoRecurso() : null;
        String name = rw.isRecursoNombrable() ? rw.getRecursoNombrable().getNombreRecurso() : null;
        return getRowLabel(columna, id, code, name);
    }

    private static String getRowLabel(EnumColumnaEtiqueta columna, String id, String code, String name) {
        String codigo = StringUtils.isBlank(code) ? StringUtils.isBlank(name) ? id : name : code;
        String nombre = StringUtils.isBlank(name) ? StringUtils.isBlank(code) ? id : code : name;
        switch (columna) {
            case COLUMNA_CODIGO:
                return codigo;
            case COLUMNA_NOMBRE:
                return nombre;
            default:
                if (codigo == null) {
                    return nombre;
                } else if (nombre == null || nombre.equals(codigo)) {
                    return codigo;
                } else {
                    return codigo + " (" + nombre + ") ";
                }
        }
    }

    private static String addRequestPostBackParameters(String url) {
        if (StringUtils.isBlank(url)) {
            return null;
        }
        String param = "";
        String state = getRequestParameter(Global.PARAMETRO_RETRUQUE);
        if (StringUtils.isNotBlank(state)) {
            param += StringUtils.indexOf(url, "?") < 0 ? "?" : "&";
            param += Global.PARAMETRO_RETRUCAR + "=" + true;
            param += "&" + Global.PARAMETRO_RETRUQUE + "=" + state;
        }
        return url + param;
    }

    private static String addRequestPostBackParameters(String url, Long id) {
        if (StringUtils.isBlank(url)) {
            return null;
        }
        String param = "";
        if (id != null) {
            param += StringUtils.indexOf(url, "?") < 0 ? "?" : "&";
            param += Global.PARAMETRO_RETRUCAR + "=" + true;
            param += "&" + CPP.ID_RECURSO + "=" + id + Global.PREFIJO_ENLACE_URL_HTTP;
        }
        return url + param;
    }
    // </editor-fold>
}
