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
package com.egt.core.aplicacion;

import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleMensajes;
import com.egt.base.util.BundleParametros;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.enums.EnumSeveridadMensaje;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.jms.JMSException;
import javax.jms.Message;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class Bitacora implements Serializable {

    static {
        init();
    }

    private static final String PREFIJO_PAQUETE = "com.egt.";

    private static final String METODO_TRACKING = "track";

    private static String DASHES;

    private static org.apache.log4j.Logger log4jLogger;
//
//  private static java.util.logging.Logger loggingLogger;

    private static void init() {
        DASHES = STP.getString(150, '-');
        String key = "logging";
        String env = System.getenv(key);
        String log = StringUtils.isBlank(env) ? "default" : env.trim().toLowerCase();
        String[] ayes = new String[]{"default", "yes", "true", "on"};
        boolean logging = ArrayUtils.contains(ayes, log);
        trace(key + "=" + log);
        trace(key + "=" + logging);
        log4jLogger = null;
//      loggingLogger = null;
        if (logging) {
            try {
                log4jLogger = org.apache.log4j.Logger.getLogger(Bitacora.class);
                trace(key + "=" + log4jLogger);
            } catch (Throwable throwable1) {
                System.err.println(ThrowableUtils.getString(throwable1));
//              try {
//                  loggingLogger = java.util.logging.Logger.getLogger(Bitacora.class.getName());
//                  trace(key + "=" + loggingLogger);
//              } catch (Throwable throwable2) {
//                  System.err.println(ThrowableUtils.getString(throwable2));
//              }
            }
        } else {
            trace(key + "=" + System.out.toString());
        }
        stamp(Bitacora.class.getSimpleName());
    }

    public static void stack() {
        boolean b = true;
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        for (StackTraceElement trace : stack) {
            if (trace.getClassName().startsWith(PREFIJO_PAQUETE)) {
                if (trace.getClassName().equals(Bitacora.class.getName())) {
                    continue;
                } else if (b) {
                    b = false;
                    logTrace(trace.getClassName() + "." + trace.getMethodName() + ":" + trace.getLineNumber());
                } else {
                    logTrace("..." + getStackTraceElementTrack(trace));
                }
            }
        }
    }

    private void stamp() {
        stamp(null, null);
    }

    public static void stamp(Object obj) {
        stamp(obj, null);
    }

    public static void stamp(Object obj, String str) {
        String objeto = obj == null ? "" : getFirmaMetodo(obj, null, 0) + " ";
        stamp(objeto + StringUtils.trimToEmpty(str));
    }

    public static void stamp(String str) {
        logTrace(DASHES);
        logTrace(StringUtils.trimToEmpty(str));
        logTrace(DASHES);
    }

    public static void trace(String clave) {
        logTrace(getTextoMensaje(clave, null, null, null, null));
    }

    public static void trace(String clave, Object arg0) {
        logTrace(getTextoMensaje(clave, arg0, null, null, null));
    }

    public static void trace(String clave, Object arg0, Object arg1) {
        logTrace(getTextoMensaje(clave, arg0, arg1, null, null));
    }

    public static void trace(String clave, Object arg0, Object arg1, Object arg2) {
        logTrace(getTextoMensaje(clave, arg0, arg1, arg2, null));
    }

    public static void trace(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        logTrace(getTextoMensaje(clave, arg0, arg1, arg2, arg3));
    }

    public static void trace(Class clase) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, null, 0), null));
    }

    public static void trace(Class clase, String metodo) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 0), null));
    }

    public static void trace(Class clase, String metodo, Object arg0) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 1), new Object[]{arg0}));
    }

    public static void trace(Class clase, String metodo, Object arg0, Object arg1) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 2), new Object[]{arg0, arg1}));
    }

    public static void trace(Class clase, String metodo, Object arg0, Object arg1, Object arg2) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 3), new Object[]{arg0, arg1, arg2}));
    }

    public static void trace(Class clase, String metodo, Object arg0, Object arg1, Object arg2, Object arg3) {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 4), new Object[]{arg0, arg1, arg2, arg3}));
    }

    public static void traceMessage(Class clase, String metodo, Message message) throws JMSException {
        logTrace(Utils.getTraceMessageFormat(getCallingMethodStackTraceElementTrack(clase, metodo, 4),
                new Object[]{message.getJMSType(), message.getJMSMessageID(), message.getJMSCorrelationID(), message.getJMSRedelivered()}));
    }

    public static void log(AbstractMessage message) {
        switch (message.getCondicion()) {
            case EJECUTADO_CON_ERRORES:
                log(EnumSeveridadMensaje.ERROR, message.getMensaje(), null);
                log(EnumSeveridadMensaje.ERROR, message.getCondicion().getLabel(), null);
                break;
            case EJECUCION_CANCELADA:
                log(EnumSeveridadMensaje.FATAL, message.getMensaje(), null);
                log(EnumSeveridadMensaje.FATAL, message.getCondicion().getLabel(), null);
                break;
            default:
                log(EnumSeveridadMensaje.INFORMATIVO, message.getMensaje(), null);
                log(EnumSeveridadMensaje.INFORMATIVO, message.getCondicion().getLabel(), null);
                break;
        }
    }

    public static void log(EnumSeveridadMensaje severidad, String texto, Throwable throwable) {
        switch (severidad) {
            case INFORMATIVO:
                logInfo(texto, throwable);
                break;
            case ADVERTENCIA:
                logWarn(texto, throwable);
                break;
            case ERROR:
                logError(texto, throwable);
                break;
            case FATAL:
                logFatal(texto, throwable);
                break;
            default:
                logTrace(texto, throwable);
                break;
        }
    }

    public static void logTrace(String texto) {
        logTrace(texto, null);
    }

    public static void logTrace(Throwable throwable) {
        logTrace(null, throwable);
    }

    public static void logTrace(String texto, Throwable throwable) {
        String message = getLogMessage(texto, EnumSeveridadMensaje.TRAZA);
        if (log4jLogger != null) {
            if (log4jLogger.isDebugEnabled()) {
                if (throwable == null) {
                    log4jLogger.debug(message);
                } else {
                    log4jLogger.debug(message, throwable);
                }
            }
//      } else if (loggingLogger != null) {
//          if (throwable == null) {
//              loggingLogger.log(java.util.logging.Level.FINE, message);
//          } else {
//              loggingLogger.log(java.util.logging.Level.FINE, message, throwable);
//          }
        } else {
            if (throwable == null) {
                System.out.println(message);
            } else {
                System.out.println(message);
                throwable.printStackTrace(System.out);
            }
        }
    }

    public static void logInfo(String texto) {
        logInfo(texto, null);
    }

    public static void logInfo(Throwable throwable) {
        logInfo(null, throwable);
    }

    public static void logInfo(String texto, Throwable throwable) {
        String message = getLogMessage(texto, EnumSeveridadMensaje.INFORMATIVO);
        if (log4jLogger != null) {
            if (log4jLogger.isInfoEnabled()) {
                if (throwable == null) {
                    log4jLogger.info(message);
                } else {
                    log4jLogger.info(message, throwable);
                }
            }
//      } else if (loggingLogger != null) {
//          if (throwable == null) {
//              loggingLogger.log(java.util.logging.Level.INFO, message);
//          } else {
//              loggingLogger.log(java.util.logging.Level.INFO, message, throwable);
//          }
        } else {
            if (throwable == null) {
                System.out.println(message);
            } else {
                System.out.println(message);
                throwable.printStackTrace(System.out);
            }
        }
    }

    public static void logWarn(String texto) {
        logWarn(texto, null);
    }

    public static void logWarn(Throwable throwable) {
        logWarn(null, throwable);
    }

    public static void logWarn(String texto, Throwable throwable) {
        String message = getLogMessage(texto, EnumSeveridadMensaje.ADVERTENCIA);
        if (log4jLogger != null) {
            if (throwable == null) {
                log4jLogger.warn(message);
            } else {
                log4jLogger.warn(message, throwable);
            }
//      } else if (loggingLogger != null) {
//          if (throwable == null) {
//              loggingLogger.log(java.util.logging.Level.WARNING, message);
//          } else {
//              loggingLogger.log(java.util.logging.Level.WARNING, message, throwable);
//          }
        } else {
            if (throwable == null) {
                System.out.println(message);
            } else {
                System.out.println(message);
                throwable.printStackTrace(System.out);
            }
        }
    }

    public static void logError(String texto) {
        logError(texto, null);
    }

    public static void logError(Throwable throwable) {
        logError(null, throwable);
    }

    public static void logError(String texto, Throwable throwable) {
        String message = getLogMessage(texto, EnumSeveridadMensaje.ERROR);
        if (log4jLogger != null) {
            if (throwable == null) {
                log4jLogger.error(message);
            } else {
                log4jLogger.error(message, throwable);
            }
//      } else if (loggingLogger != null) {
//          if (throwable == null) {
//              loggingLogger.log(java.util.logging.Level.SEVERE, message);
//          } else {
//              loggingLogger.log(java.util.logging.Level.SEVERE, message, throwable);
//          }
        } else {
            if (throwable == null) {
                System.err.println(message);
            } else {
                System.err.println(message);
                throwable.printStackTrace(System.out);
            }
        }
    }

    public static void logFatal(String texto) {
        logFatal(texto, null);
    }

    public static void logFatal(Throwable throwable) {
        logFatal("", throwable);
    }

    public static void logFatal(Throwable throwable, Object objeto) {
        logFatal(throwable, objeto, null);
    }

    public static void logFatal(Throwable throwable, Object objeto, String metodo) {
        logFatal(throwable, objeto, metodo, null);
    }

    public static void logFatal(Throwable throwable, Object objeto, String metodo, Object[] arg) {
        String mensaje = Utils.getTraceMessageFormat(getFirmaMetodo(objeto, metodo, arg == null ? 0 : arg.length), arg);
        logFatal(mensaje, throwable);
    }

    public static void logFatal(String texto, Throwable throwable) {
        String message = getLogMessage(texto, EnumSeveridadMensaje.FATAL);
        if (log4jLogger != null) {
            if (throwable == null) {
                log4jLogger.fatal(message);
            } else {
                log4jLogger.fatal(message, throwable);
            }
//      } else if (loggingLogger != null) {
//          if (throwable == null) {
//              loggingLogger.log(java.util.logging.Level.SEVERE, message);
//          } else {
//              loggingLogger.log(java.util.logging.Level.SEVERE, message, throwable);
//          }
        } else {
            if (throwable == null) {
                System.err.println(message);
            } else {
                System.err.println(message);
                throwable.printStackTrace(System.out);
            }
        }
    }

    public static String getTextoMensaje(String clave) {
        return getTextoMensaje(clave, null, null, null, null);
    }

    public static String getTextoMensaje(String clave, Object arg0) {
        return getTextoMensaje(clave, arg0, null, null, null);
    }

    public static String getTextoMensaje(String clave, Object arg0, Object arg1) {
        return getTextoMensaje(clave, arg0, arg1, null, null);
    }

    public static String getTextoMensaje(String clave, Object arg0, Object arg1, Object arg2) {
        return getTextoMensaje(clave, arg0, arg1, arg2, null);
    }

    public static String getTextoMensaje(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        String texto = StringUtils.trimToNull(clave);
        if (texto != null) {
            String patron = getPatron(clave, arg0, arg1, arg2, arg3);
            if (patron != null) {
                texto = Utils.getMessageFormat(patron, getArgumentos(arg0, arg1, arg2, arg3));
            }
        }
        return texto;
    }

    private static String getFirmaMetodo(Class clase, String metodo, int argumentos) {
        String string = clase == null ? "" : clase.getSimpleName();
        return getFirmaMetodo(string, metodo, argumentos);
    }

    private static String getFirmaMetodo(Object objeto, String metodo, int argumentos) {
//      String string = objeto == null ? "" : objeto.getClass().getName();
        String string = objeto == null ? "" : objeto.getClass().getSimpleName() + "#" + objeto.hashCode();
        return getFirmaMetodo(string, metodo, argumentos);
    }

    private static String getFirmaMetodo(String string, String metodo, int argumentos) {
        String punto = StringUtils.isBlank(string) ? "" : ".";
        String firma = StringUtils.isBlank(metodo) ? string : string + punto + metodo;
        if (StringUtils.isNotBlank(firma)) {
            String parametros = "";
            if (argumentos > 0) {
                for (int i = 0; i < argumentos; i++) {
                    parametros += ",{" + i + "}";
                }
                parametros = parametros.substring(1);
            }
            firma += "(" + parametros + ")";
        }
        return firma;
    }

    private static String getPatron(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        if (isKey(clave)) {
            return BundleMensajes.getString(getKey(clave));
        } else {
            return StringUtils.trimToNull(clave);
        }
//      String patron = StringUtils.trimToEmpty(clave);
//      if (arg0 != null && patron.indexOf("{0}") >= 0) {
//          return patron;
//      }
//      if (arg1 != null && patron.indexOf("{1}") >= 0) {
//          return patron;
//      }
//      if (arg2 != null && patron.indexOf("{2}") >= 0) {
//          return patron;
//      }
//      if (arg3 != null && patron.indexOf("{3}") >= 0) {
//          return patron;
//      }
//      return null;
    }

    private static Object[] getArgumentos(Object arg0, Object arg1, Object arg2, Object arg3) {
        String str0 = isKey(arg0) ? BundleParametros.getString(getKey(arg0)) : STP.getString(arg0);
        String str1 = isKey(arg1) ? BundleParametros.getString(getKey(arg1)) : STP.getString(arg1);
        String str2 = isKey(arg2) ? BundleParametros.getString(getKey(arg2)) : STP.getString(arg2);
        String str3 = isKey(arg3) ? BundleParametros.getString(getKey(arg3)) : STP.getString(arg3);
        return new Object[]{str0, str1, str2, str3};
    }

    private static boolean isKey(String str) {
        String key = StringUtils.trimToEmpty(str);
        return key.startsWith("<") && key.endsWith(">");
    }

    private static boolean isKey(Object obj) {
        return isKey(STP.getString(obj));
    }

    private static String getKey(String str) {
        String key = StringUtils.trimToEmpty(str);
        return isKey(key) ? key.substring(1, (key.length() - 1)).trim() : key;
    }

    private static String getKey(Object obj) {
        return getKey(STP.getString(obj));
    }

    private static String getLogMessage(String texto, EnumSeveridadMensaje severidad) {
        String message = StringUtils.isBlank(texto) ? severidad.getLabel() : StringUtils.trimToEmpty(texto);
        message = "[" + Thread.currentThread().getId() + "]" + " " + message;
        if (severidad.intValue() >= EnumSeveridadMensaje.ERROR.intValue()) {
            StackTraceElement trace = getCallingMethodStackTraceElement();
            if (trace != null) {
                message += getStackTraceElementTrack(trace);
            }
        }
        return message;
    }

    private static StackTraceElement getCallingMethodStackTraceElement() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        for (StackTraceElement trace : stack) {
            if (trace.getClassName().startsWith(PREFIJO_PAQUETE)) {
                if (trace.getClassName().equals(Bitacora.class.getName())) {
                    continue;
                } else if (trace.getMethodName().equals(METODO_TRACKING)) {
                    continue;
                } else {
                    return trace;
                }
            }
        }
        return null;
    }

    private static String getCallingMethodStackTraceElementTrack(Class clase, String metodo, int argumentos) {
        StackTraceElement trace = getCallingMethodStackTraceElement();
        String track = getStackTraceElementTrack(trace);
        String firma = clase == null || clase.getName().equals(trace.getClassName())
                ? getFirmaMetodo("", metodo, argumentos)
                : getFirmaMetodo(clase.getSimpleName(), metodo, argumentos);
        /**/
        return firma + track;
    }

    private static String getStackTraceElementTrack(StackTraceElement trace) {
        return trace == null ? "" : " @ " + getSimpleClassName(trace.getClassName()) + "." + trace.getMethodName() + ":" + trace.getLineNumber();
    }

    private static String getSimpleClassName(String className) {
        int i = StringUtils.lastIndexOf(className, '.');
        return i < 0 ? className : className.substring(i + 1);
    }

    /**
     * Conserva el valor de la propiedad mensajes.
     */
    private LinkedHashSet mensajes;

    /**
     * Conserva el valor de la propiedad severidadMinima.
     */
    private EnumSeveridadMensaje severidadMinima;

    /**
     * Conserva el valor de la propiedad sinDuplicados.
     */
    private boolean sinDuplicados;

    public Bitacora() {
        this.mensajes = new LinkedHashSet();
        this.severidadMinima = EnumSeveridadMensaje.INFORMATIVO;
        this.sinDuplicados = false;
        stamp();
    }

    /**
     * Getter para propiedad severidadMinima.
     *
     * @return Valor de la propiedad severidadMinima.
     */
    public EnumSeveridadMensaje getSeveridadMinima() {
        return this.severidadMinima;
    }

    /**
     * Setter para propiedad severidadMinima.
     *
     * @param severidadMinima Nuevo valor de la propiedad severidadMinima.
     */
    public void setSeveridadMinima(EnumSeveridadMensaje severidadMinima) {
        this.severidadMinima = severidadMinima;
    }

    /**
     * Getter para propiedad sinDuplicados.
     *
     * @return Valor de la propiedad sinDuplicados.
     */
    public boolean isSinDuplicados() {
        return this.sinDuplicados;
    }

    /**
     * Setter para propiedad sinDuplicados.
     *
     * @param sinDuplicados Nuevo valor de la propiedad sinDuplicados.
     */
    public void setSinDuplicados(boolean sinDuplicados) {
        this.sinDuplicados = sinDuplicados;
    }

    public String info(String clave) {
        String texto = getTextoMensaje(clave, null, null, null, null);
        this.add(EnumSeveridadMensaje.INFORMATIVO, texto, null);
        return texto;
    }

    public String info(String clave, Object arg0) {
        String texto = getTextoMensaje(clave, arg0, null, null, null);
        this.add(EnumSeveridadMensaje.INFORMATIVO, texto, null);
        return texto;
    }

    public String info(String clave, Object arg0, Object arg1) {
        String texto = getTextoMensaje(clave, arg0, arg1, null, null);
        this.add(EnumSeveridadMensaje.INFORMATIVO, texto, null);
        return texto;
    }

    public String info(String clave, Object arg0, Object arg1, Object arg2) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, null);
        this.add(EnumSeveridadMensaje.INFORMATIVO, texto, null);
        return texto;
    }

    public String info(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, arg3);
        this.add(EnumSeveridadMensaje.INFORMATIVO, texto, null);
        return texto;
    }

    public String warn(String clave) {
        String texto = getTextoMensaje(clave, null, null, null, null);
        this.add(EnumSeveridadMensaje.ADVERTENCIA, texto, null);
        return texto;
    }

    public String warn(String clave, Object arg0) {
        String texto = getTextoMensaje(clave, arg0, null, null, null);
        this.add(EnumSeveridadMensaje.ADVERTENCIA, texto, null);
        return texto;
    }

    public String warn(String clave, Object arg0, Object arg1) {
        String texto = getTextoMensaje(clave, arg0, arg1, null, null);
        this.add(EnumSeveridadMensaje.ADVERTENCIA, texto, null);
        return texto;
    }

    public String warn(String clave, Object arg0, Object arg1, Object arg2) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, null);
        this.add(EnumSeveridadMensaje.ADVERTENCIA, texto, null);
        return texto;
    }

    public String warn(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, arg3);
        this.add(EnumSeveridadMensaje.ADVERTENCIA, texto, null);
        return texto;
    }

    public String error(String clave) {
        String texto = getTextoMensaje(clave, null, null, null, null);
        this.add(EnumSeveridadMensaje.ERROR, texto, null);
        return texto;
    }

    public String error(String clave, Object arg0) {
        String texto = getTextoMensaje(clave, arg0, null, null, null);
        this.add(EnumSeveridadMensaje.ERROR, texto, null);
        return texto;
    }

    public String error(String clave, Object arg0, Object arg1) {
        String texto = getTextoMensaje(clave, arg0, arg1, null, null);
        this.add(EnumSeveridadMensaje.ERROR, texto, null);
        return texto;
    }

    public String error(String clave, Object arg0, Object arg1, Object arg2) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, null);
        this.add(EnumSeveridadMensaje.ERROR, texto, null);
        return texto;
    }

    public String error(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, arg3);
        this.add(EnumSeveridadMensaje.ERROR, texto, null);
        return texto;
    }

    public String error(Throwable throwable) {
        String texto = throwable == null ? null : ThrowableUtils.getString(throwable);
        this.add(EnumSeveridadMensaje.ERROR, texto, throwable);
        return texto;
    }

    public String fatal(String clave) {
        String texto = getTextoMensaje(clave, null, null, null, null);
        this.add(EnumSeveridadMensaje.FATAL, texto, null);
        return texto;
    }

    public String fatal(String clave, Object arg0) {
        String texto = getTextoMensaje(clave, arg0, null, null, null);
        this.add(EnumSeveridadMensaje.FATAL, texto, null);
        return texto;
    }

    public String fatal(String clave, Object arg0, Object arg1) {
        String texto = getTextoMensaje(clave, arg0, arg1, null, null);
        this.add(EnumSeveridadMensaje.FATAL, texto, null);
        return texto;
    }

    public String fatal(String clave, Object arg0, Object arg1, Object arg2) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, null);
        this.add(EnumSeveridadMensaje.FATAL, texto, null);
        return texto;
    }

    public String fatal(String clave, Object arg0, Object arg1, Object arg2, Object arg3) {
        String texto = getTextoMensaje(clave, arg0, arg1, arg2, arg3);
        this.add(EnumSeveridadMensaje.FATAL, texto, null);
        return texto;
    }

    public String fatal(Throwable throwable) {
        String texto = throwable == null ? null : ThrowableUtils.getString(throwable);
        this.add(EnumSeveridadMensaje.FATAL, texto, throwable);
        return texto;
    }

    public void add(AbstractMessage message) {
        switch (message.getCondicion()) {
            case EJECUTADO_CON_ERRORES:
                add(EnumSeveridadMensaje.ERROR, message.getMensaje(), null);
                add(EnumSeveridadMensaje.ERROR, message.getCondicion().getLabel(), null);
                break;
            case EJECUCION_CANCELADA:
                add(EnumSeveridadMensaje.FATAL, message.getMensaje(), null);
                add(EnumSeveridadMensaje.FATAL, message.getCondicion().getLabel(), null);
                break;
            default:
                add(EnumSeveridadMensaje.INFORMATIVO, message.getMensaje(), null);
                add(EnumSeveridadMensaje.INFORMATIVO, message.getCondicion().getLabel(), null);
                break;
        }
    }

    private void add(EnumSeveridadMensaje severidad, String texto, Throwable throwable) {
        log(severidad, texto, throwable);
        if (severidad.intValue() < this.severidadMinima.intValue() || StringUtils.isBlank(texto) || (this.sinDuplicados && this.contiene(texto))) {
        } else {
            this.mensajes.add(new Mensaje(texto, severidad));
        }

    }

    public Iterator iterator() {
        return this.mensajes.iterator();
    }

    public boolean isEmpty() {
        return this.mensajes.isEmpty();
    }

    public void clear() {
        this.mensajes.clear();
        trace(this.getClass(), "clear");
    }

    public void close() {
        if (log4jLogger != null) {
            log4jLogger.removeAllAppenders();
        }
    }

    public boolean contains(Object o) {
        return this.mensajes.contains(o);
    }

    public boolean contiene(String texto) {
        if (StringUtils.isNotBlank(texto)) {
            Mensaje mensaje;
            String textoMensaje;
            Iterator iterator = this.mensajes.iterator();
            while (iterator.hasNext()) {
                mensaje = (Mensaje) iterator.next();
                if (mensaje != null) {
                    textoMensaje = mensaje.getTexto();
                    if (StringUtils.isNotBlank(textoMensaje)) {
                        if (texto.endsWith(textoMensaje) || textoMensaje.endsWith(texto)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getLogString() {
        return getLogString(EnumSeveridadMensaje.INFORMATIVO);
    }

    public String getLogString(EnumSeveridadMensaje severidad) {
        String str = "";
        Iterator iterator = this.mensajes.iterator();
        while (iterator.hasNext()) {
            Mensaje mensaje = (Mensaje) iterator.next();
            if (mensaje != null && mensaje.getSeveridad().intValue() >= severidad.intValue()) {
                str += mensaje + "\n";
            }
        }
        return str;
    }

}
