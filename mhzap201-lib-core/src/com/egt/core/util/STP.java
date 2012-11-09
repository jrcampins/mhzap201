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

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.constants.Global;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.UUID;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;

public class STP {

    public static final String STRING_VALOR_NULO = Bundle.getString("string.valor.nulo");

    public static String getRandomString() {
        return getRandomString(0);
    }

    public static String getRandomString(int length) {
        String uuid = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
        int endIndex = length < 1 || length > uuid.length() ? uuid.length() : length;
        return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "").substring(0, endIndex);
    }

    public static String getSimpleString(Object obj) {
        String type = obj == null ? "" : "<" + obj.getClass().getSimpleName() + ">";
        return type + getString(obj);
    }

    public static String getString(int n, char c) {
        String string = "";
        for (int i = 0; i < n; i++, string += c) {
        }
        return string;
    }

    public static String getString(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof String) {
            return obj.toString();
        } else if (obj instanceof Integer) {
            return obj.toString();
        } else if (obj instanceof Long) {
            return obj.toString();
        } else if (obj instanceof BigInteger) {
            return obj.toString();
        } else if (obj instanceof BigDecimal) {
            /*
             * OJO: configuracion regional (signo, punto y coma)
             */
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else if (obj instanceof Date) {
            /*
             * OJO: configuracion regional
             */
            return new DateTime(obj).toString("dd/MM/yyyy");
        } else if (obj instanceof Time) {
            /*
             * OJO: configuracion regional
             */
            return new DateTime(obj).toString("hh:mm aa"); 
        } else if (obj instanceof Timestamp || obj instanceof java.util.Date) {
            /*
             * OJO: configuracion regional
             */
            DateTime datetime = new DateTime(obj);
            String pattern = datetime.getMillisOfDay() == 0 ? "dd/MM/yyyy" : "dd/MM/yyyy hh:mm:ss aa"; 
            return datetime.toString(pattern);
        } else {
            return obj.toString();
        }
    }

    public static String getStringDelimitado(Object obj) {
        String string = getString(obj);
        if (string == null) {
            return string;
        }
        if (obj instanceof String) {
            return "'" + string + "'";
        }
        return string;
    }

    public static String getStringNoDelimitado(String delimitado) {
        String string = delimitado;
        if (string == null) {
            return string;
        }
        if ((string.startsWith("'") && string.endsWith("'"))
                || (string.startsWith("(") && string.endsWith(")"))
                || (string.startsWith("[") && string.endsWith("]"))
                || (string.startsWith("{") && string.endsWith("}"))
                || (string.startsWith("<") && string.endsWith(">"))
                || (string.startsWith("¡") && string.endsWith("!"))
                || (string.startsWith("¿") && string.endsWith("?"))) {
            string = string.substring(1, (string.length() - 1)).trim();
        }
        return string;
    }

    public static String getStringParametrizado(String patron, String arg0) {
        return getStringParametrizado(patron, arg0, null, null, null);
    }

    public static String getStringParametrizado(String patron, String arg0, String arg1) {
        return getStringParametrizado(patron, arg0, arg1, null, null);
    }

    public static String getStringParametrizado(String patron, String arg0, String arg1, String arg2) {
        return getStringParametrizado(patron, arg0, arg1, arg2, null);
    }

    public static String getStringParametrizado(String patron, String arg0, String arg1, String arg2, String arg3) {
        Object[] argumentos = {StringUtils.trimToEmpty(arg0), StringUtils.trimToEmpty(arg1), StringUtils.trimToEmpty(arg2), StringUtils.trimToEmpty(arg3)};
        return getStringParametrizado(patron, argumentos);
    }

    public static String getStringParametrizado(String patron, Object[] argumentos) {
        return StringUtils.isBlank(patron) ? null : MessageFormat.format(patron, argumentos);
    }

    public static String getStringSql(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof String) {
            return obj.toString();
        } else if (obj instanceof Integer) {
            return obj.toString();
        } else if (obj instanceof Long) {
            return obj.toString();
        } else if (obj instanceof BigInteger) {
            return obj.toString();
        } else if (obj instanceof BigDecimal) {
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else if (obj instanceof Date) {
            return new DateTime(obj).toString("yyyy-MM-dd");
        } else if (obj instanceof Time) {
            return new DateTime(obj).toString("HH:mm:ss");
        } else if (obj instanceof Timestamp || obj instanceof java.util.Date) {
            return new DateTime(obj).toString("yyyy-MM-dd HH:mm:ss");
        } else {
            return null;
        }
    }

    public static String getStringSqlDelimitado(Object obj) {
        String string = getStringSql(obj);
        if (string == null) {
            return null;
        } else if (obj instanceof String) {
            return "'" + string + "'";
        } else if (obj instanceof Date) {
            return "'" + string + "'";
        } else if (obj instanceof Time) {
            return "'" + string + "'";
        } else if (obj instanceof Timestamp || obj instanceof java.util.Date) {
            return "'" + string + "'";
        } else {
            return string;
        }
    }

    public static String getStringSqlParametrizado(String patron, Object arg0) {
        return getStringSqlParametrizado(patron, arg0, null, null, null);
    }

    public static String getStringSqlParametrizado(String patron, Object arg0, Object arg1) {
        return getStringSqlParametrizado(patron, arg0, arg1, null, null);
    }

    public static String getStringSqlParametrizado(String patron, Object arg0, Object arg1, Object arg2) {
        return getStringSqlParametrizado(patron, arg0, arg1, arg2, null);
    }

    public static String getStringSqlParametrizado(String patron, Object arg0, Object arg1, Object arg2, Object arg3) {
        Object[] argumentos = {arg0, arg1, arg2, arg3};
        return getStringSqlParametrizado(patron, argumentos);
    }

    public static String getStringSqlParametrizado(String patron, Object[] argumentos) {
        if (StringUtils.isBlank(patron)) {
            return null;
        }
        Object[] strings = new Object[argumentos.length];
        for (int i = 0; i < argumentos.length; i++) {
            strings[i] = argumentos[i] == null
                    ? "null" : StringUtils.trimToEmpty(getStringSql(argumentos[i]));
        }
        return MessageFormat.format(patron, strings);
    }

    public static String getStringCodigoRecurso(Object obj) {
//      if (obj instanceof Long) {
//          return Global.PREFIJO_STRING_ID_RECURSO + obj;
//      } else {
//          return getString(obj);
//      }
        return getString(obj);
    }

    public static String getString(ResourceBundle resourceBundle, String key) {
        return getString(resourceBundle, key, null, null);
    }

    public static String getString(ResourceBundle resourceBundle, String key, String left, String right) {
        if (resourceBundle == null || StringUtils.isBlank(key)) {
            return null;
        }
        try {
            return getNullStringWhenBlankOrEqualsToKey(resourceBundle.getString(key), key, left, right);
        } catch (MissingResourceException e) {
            return null;
        }
    }

    public static String getNullStringWhenBlankOrEqualsToKey(String string, String key) {
        return getNullStringWhenBlankOrEqualsToKey(string, key, null, null);
    }

    public static String getNullStringWhenBlankOrEqualsToKey(String string, String key, String left, String right) {
        String s = StringUtils.trimToEmpty(string);
        String k = StringUtils.trimToEmpty(key);
        String l = StringUtils.trimToEmpty(left);
        String r = StringUtils.trimToEmpty(right);
        return StringUtils.isBlank(s) || s.equals(k) ? null : l + s + r;
    }

    public static Object getObjeto(String string) {
        Object objeto = null;
        String cadena = StringUtils.trimToNull(string);
        if (cadena == null) {
            return null;
        }
        if (StringUtils.isNumeric(cadena)) {
            objeto = getObjeto(cadena, EnumTipoDatoPar.ENTERO);
        }
        if (objeto == null && StringUtils.isNumeric(cadena)) {
            objeto = getObjeto(cadena, EnumTipoDatoPar.ENTERO_GRANDE);
        }
        if (objeto == null && cadena.startsWith(Global.PREFIJO_STRING_ID_RECURSO)) {
            String substr = cadena.substring(1);
            if (StringUtils.isNumeric(substr)) {
                objeto = getObjeto(substr, EnumTipoDatoPar.ENTERO_GRANDE);
            }
        }
        if (objeto == null) {
            objeto = getObjeto(cadena, EnumTipoDatoPar.NUMERICO);
        }
        if (objeto == null) {
            objeto = getObjeto(cadena, EnumTipoDatoPar.FECHA_HORA);
        }
        if (objeto == null) {
            objeto = getObjeto(cadena, EnumTipoDatoPar.ALFANUMERICO);
        }
        return objeto;
    }

    public static Object getObjeto(String string, EnumTipoDatoPar tipo) {
        String cadena = StringUtils.trimToNull(string);
        if (cadena == null) {
            return null;
        }
        Object objeto = null;
        switch (tipo) {
            case ALFANUMERICO:
                objeto = new String(string);
                break;
            case NUMERICO:
                try {
                    objeto = new BigDecimal(cadena);
                } catch (NumberFormatException e) {
                    objeto = null;
                }
                break;
            case FECHA_HORA:
                int year = 0;
                int monthOfYear = 0;
                int dayOfMonth = 0;
                int hourOfDay = 0;
                int minuteOfHour = 0;
                int secondOfMinute = 0;
                try {
                    String xm = "";
                    String xs = "";
                    int len = cadena.length();
                    switch (len) {
                        case 22:
                            xm = cadena.substring(20);
                        case 19:
                            if (xm.equals("")) {
                                xs = cadena.substring(17, 19);
                            }
                            if (xs.equalsIgnoreCase("AM") || xs.equalsIgnoreCase("PM")) {
                                xm = xs;
                            } else {
                                secondOfMinute = Integer.parseInt(cadena.substring(17, 19));
                            }
                        case 16:
                            minuteOfHour = Integer.parseInt(cadena.substring(14, 16));
                            hourOfDay = Integer.parseInt(cadena.substring(11, 13));
                            if (xm.equalsIgnoreCase("AM") && hourOfDay == 12) {
                                hourOfDay = 0;
                            }
                            if (xm.equalsIgnoreCase("PM") && hourOfDay <= 11) {
                                hourOfDay += 12;
                            }
                        case 10:
                            year = Integer.parseInt(cadena.substring(6, 10));
                            monthOfYear = Integer.parseInt(cadena.substring(3, 5));
                            dayOfMonth = Integer.parseInt(cadena.substring(0, 2));
                            break;
                    }
                    DateTime dateTime = new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour,
                            secondOfMinute, 0);
                    objeto = new Timestamp(dateTime.getMillis());
                } catch (RuntimeException e) {
                    objeto = null;
                }
                break;
            case ENTERO:
                try {
                    objeto = new Integer(new BigDecimal(cadena).intValue());
                } catch (NumberFormatException e) {
                    objeto = null;
                }
                break;
            case ENTERO_GRANDE:
                try {
                    objeto = new Long(new BigDecimal(cadena).longValue());
                } catch (NumberFormatException e) {
                    objeto = null;
                }
                break;
            default:
                objeto = null;
                break;
        }
        return objeto;
    }

    public static Object getObjetoCodigoRecurso(Object obj) throws ExcepcionAplicacion {
        return getObjetoCodigoRecurso(obj, false);
    }

    public static Object getObjetoCodigoRecurso(Object obj, boolean id) throws ExcepcionAplicacion {
        Object object = null;
        String string = null;
        if (obj instanceof String) {
            string = obj.toString();
            boolean starts = string.startsWith(Global.PREFIJO_STRING_ID_RECURSO);
            if (starts) {
                string = string.substring(1);
            }
            if (starts || id) {
                object = getObjeto(string, EnumTipoDatoPar.ENTERO_GRANDE);
                if (object == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.CHECK_CHANGES_EXCEPTION_4,
                            EnumTipoDatoPar.ENTERO_GRANDE.getLabel()));
                }
            } else {
                object = string;
            }
        }
        return object;
    }

    public static String trimToStringRecursoSinNombre(String nombre) {
        return StringUtils.isBlank(nombre)
                ? Bundle.getString("string.recurso.sin.nombre")
                : nombre.trim();
    }

    public static boolean esObjetoEnRango(Object objeto, Object minimo, Object maximo) {
        boolean es = true;
        EnumTipoDatoPar tipo;
        if (objeto == null) {
            return false;
        } else if (objeto instanceof String) {
            tipo = EnumTipoDatoPar.ALFANUMERICO;
        } else if (objeto instanceof BigDecimal) {
            tipo = EnumTipoDatoPar.NUMERICO;
        } else if (objeto instanceof Timestamp) {
            tipo = EnumTipoDatoPar.FECHA_HORA;
        } else if (objeto instanceof Integer) {
            tipo = EnumTipoDatoPar.ENTERO;
        } else if (objeto instanceof Long) {
            tipo = EnumTipoDatoPar.ENTERO_GRANDE;
        } else if (objeto instanceof BigInteger) {
            tipo = EnumTipoDatoPar.ENTERO_GRANDE;
        } else {
            return false;
        }
        switch (tipo) {
            case ALFANUMERICO:
                String val1 = (String) objeto;
                String min1 = (String) minimo;
                String max1 = (String) maximo;
                if (min1 != null && val1.compareTo(min1) < 0) {
                    es = false;
                }
                if (max1 != null && val1.compareTo(max1) > 0) {
                    es = false;
                }
                break;
            case NUMERICO:
                BigDecimal val2 = (BigDecimal) objeto;
                BigDecimal min2 = (BigDecimal) minimo;
                BigDecimal max2 = (BigDecimal) maximo;
                if (min2 != null && val2.compareTo(min2) < 0) {
                    es = false;
                }
                if (max2 != null && val2.compareTo(max2) > 0) {
                    es = false;
                }
                break;
            case FECHA_HORA:
                Timestamp val3 = (Timestamp) objeto;
                Timestamp min3 = (Timestamp) minimo;
                Timestamp max3 = (Timestamp) maximo;
                if (min3 != null && val3.compareTo(min3) < 0) {
                    es = false;
                }
                if (max3 != null && val3.compareTo(max3) > 0) {
                    es = false;
                }
                break;
            case ENTERO:
                Integer val4 = (Integer) objeto;
                Integer min4 = (Integer) minimo;
                Integer max4 = (Integer) maximo;
                if (min4 != null && val4.compareTo(min4) < 0) {
                    es = false;
                }
                if (max4 != null && val4.compareTo(max4) > 0) {
                    es = false;
                }
                break;
            case ENTERO_GRANDE:
                Long val5 = objeto instanceof BigInteger ? ((BigInteger) objeto).longValue() : (Long) objeto;
                Long min5 = (Long) minimo;
                Long max5 = (Long) maximo;
                if (min5 != null && val5.compareTo(min5) < 0) {
                    es = false;
                }
                if (max5 != null && val5.compareTo(max5) > 0) {
                    es = false;
                }
                break;
        }
        return es;
    }

    public static boolean esIdentificadorSqlValido(String string) {
        String validChars = "abcdefghijklmnopqrstuvwxyz_1234567890";
        return (StringUtils.isNotBlank(string) && StringUtils.containsOnly(string, validChars) && StringUtils.isAlpha(string.substring(0, 1)));
    }

    public static boolean esIdentificadorArchivoValido(String string) {
        String validChars = "abcdefghijklmnopqrstuvwxyz_1234567890";
        return (StringUtils.isNotBlank(string) && StringUtils.containsOnly(string, validChars));
    }

    public static String getIdentificadorJava(String string) {
        if (string == null) {
            return null;
        }
        return getCamelCase(getIdentificadorSql(string));
    }

    public static String getIdentificadorSql(String string) {
        if (string == null) {
            return null;
        }
        String x = getStringAscii(string);
        String y = "";
        String z = "";
        char c;
        boolean b = false;
        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if ((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') || (c >= '0') && (c <= '9')) {
                y += c;
                b = false;
            } else {
                z = b ? "" : "_";
                y += z;
                b = true;
            }
        }
        return y;
    }

    public static String getStringAscii(String string) {
        if (string == null) {
            return null;
        }
        String s = StringUtils.trimToEmpty(string);
        s = s.replace("á", "a");
        s = s.replace("é", "e");
        s = s.replace("í", "i");
        s = s.replace("ó", "o");
        s = s.replace("ú", "u");
        s = s.replace("ü", "u");
        s = s.replace("ñ", "n");
        s = s.replace("Á", "A");
        s = s.replace("É", "E");
        s = s.replace("Í", "I");
        s = s.replace("Ó", "O");
        s = s.replace("Ú", "U");
        s = s.replace("Ü", "U");
        s = s.replace("Ñ", "N");
        try {
            byte[] bytes = s.getBytes();
            return new String(bytes, "US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            Bitacora.logFatal(ex);
        }
        return s;
    }

    public static String getStringUtf8(String string) {
        if (string == null) {
            return null;
        }
        try {
            byte[] bytes = StringUtils.trimToEmpty(string).getBytes();
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Bitacora.logFatal(ex);
        }
        return null;
    }

    public static String getCamelCase(String string) {
        return getCamelCase(string, null);
    }

    public static String getCamelCase(String string, String gap) {
        if (string == null) {
            return null;
        }
        String x = string.trim();
        String y = "";
        String z = gap == null ? "" : gap;
        boolean b = false;
        boolean g = false;
        char c;
        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            switch (c) {
                case '_':
                case '-':
                case '.':
                    b = true;
                    break;
                default:
                    if (b) {
                        y += g ? z : "";
                        y += Character.toUpperCase(c);
                    } else {
                        y += Character.toLowerCase(c);
                    }
                    b = false;
                    g = true;
                    break;
            }
        }
        return y;
    }

    public static String getHumplessCase(String string) {
        return getHumplessCase(string, '_');
    }

    public static String getHumplessCase(String string, char hump) {
        if (string == null) {
            return null;
        }
        String x = string.trim();
        String y = "";
        boolean b = false;
        char c;
        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if (Character.isUpperCase(c)) {
                if (b) {
                    y += hump;
                }
                y += Character.toLowerCase(c);
            } else {
                y += c;
            }
            b = true;
        }
        return y;
    }

    public static String getToken(String string) {
        return getToken(string, 0);
    }

    public static String getToken(String string, int index) {
        return getToken(string, index, " ");
    }

    public static String getToken(String string, int index, String regex) {
        if (string == null) {
            return null;
        }
        String[] tokens = string.split(regex);
        return tokens == null || tokens.length == 0 ? string : index < tokens.length ? tokens[index] : tokens[tokens.length
                - 1];
    }

}
