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
package com.egt.core.db.util;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.ReporterMessage;
import com.egt.base.util.BundleInformes;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import com.egt.commons.enums.EnumFormatoInforme;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.constants.Global;
import com.egt.core.control.Auditor;
import com.egt.core.util.EA;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.fill.JRFillParameter;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.lang.StringUtils;

public class Reporter {

    private static final String DEFAULT_NUMBER_KW = "DEFAULT";

    private static final String DEFAULT_TARGET_KW = "DEFAULT";

    private static final String DEFAULT_SELECT_KW = "DEFAULT";

    private static final int LIMITE_FILAS_FUNCION_SELECT = 10000;

    static int getLimiteFilasFuncionSelect(String informe) {
        String string = BundleInformes.getLimiteFilasFuncionSelect(informe);
        int limite = StringUtils.isNotBlank(string) && StringUtils.isNumeric(string) ? Integer.valueOf(string) : -1;
        return limite < 0 ? LIMITE_FILAS_FUNCION_SELECT : limite;
    }

    public static EnumFormatoInforme getReportType(String formato) {
        String str = StringUtils.trimToEmpty(formato);
        EnumFormatoInforme tipo = EnumFormatoInforme.PDF;
        if (EnumFormatoInforme.XLS.getExtension().equalsIgnoreCase(str)) {
            tipo = EnumFormatoInforme.XLS;
        }
        return tipo;
    }

    public static String getReportFormat(EnumFormatoInforme tipo) {
        String formato = null;
        switch (tipo) {
            case XLS:
                formato = EnumFormatoInforme.XLS.getExtension();
                break;
//          case CSV:
//              formato = EnumFormatoInforme.CSV.getExtension();
//              break;
            default:
                formato = EnumFormatoInforme.PDF.getExtension();
                break;
        }
        return formato;
    }

    public static JasperReport getJasperReport(String informe) {
        try {
            // OJO: hay que copiar jdt-compiler.jar a jre\ext o incluirlo en el CLASSPATH para compilar el archivo jrxml
            // OJO: compilar el archivo jrxml de origen evita problemas al cambiar la version de jasper
            return JasperCompileManager.compileReport(getReportSourceFileName(informe));
        } catch (Exception ex) {
            Bitacora.trace(ThrowableUtils.getString(ex));
            return null;
        }
    }

    public static String getReportSourceFileName(String informe) {
        File file = getReportSourceFile(informe);
        return file == null ? informe : file.getPath();
    }

    private static File getReportSourceFile(String informe) {
        String sep = System.getProperties().getProperty("file.separator");
        String dir = EA.getString(EAC.REPORT_SOURCE_DIR);
        String web = dir + "web" + sep;
        String pdq = informe + "." + "jrxml";
        String trick = dir + pdq;
        String treat = web + pdq;
        File file1 = new File(trick);
        File file2 = new File(treat);
        return file1.exists() ? file1 : file2.exists() ? file2 : null;
    }

    public static Process executeReport(String informe, long funcion) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, null);
    }

    public static Process executeReport(String informe, long funcion, EnumFormatoInforme tipo) {
        return executeReport(informe, funcion, null, tipo, DEFAULT_SELECT_KW, null);
    }

    public static Process executeReport(String informe, long funcion, String select) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, select, null);
    }

    public static Process executeReport(String informe, long funcion, Map parametros) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, getReportParametersArray(parametros));
    }

    public static Process executeReport(String informe, long funcion, EnumFormatoInforme tipo, String select) {
        return executeReport(informe, funcion, null, tipo, select, null);
    }

    public static Process executeReport(String informe, long funcion, EnumFormatoInforme tipo, Map parametros) {
        return executeReport(informe, funcion, null, tipo, DEFAULT_SELECT_KW, getReportParametersArray(parametros));
    }

    public static Process executeReport(String informe, long funcion, String select, Object[] args) {
        return executeReport(informe, funcion, null, EnumFormatoInforme.PDF, select, args);
    }

    public static Process executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo) {
        return executeReport(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, null);
    }

    public static Process executeReport(String informe, long funcion, String destino, String select) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, select, null);
    }

    public static Process executeReport(String informe, long funcion, String destino, Map parametros) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, getReportParametersArray(parametros));
    }

    public static Process executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select) {
        return executeReport(informe, funcion, destino, tipo, select, null);
    }

    public static Process executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, Map parametros) {
        return executeReport(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, getReportParametersArray(parametros));
    }

    public static Process executeReport(String informe, long funcion, String destino, String select, Object[] args) {
        return executeReport(informe, funcion, destino, EnumFormatoInforme.PDF, select, args);
    }

    public static Process executeReport(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args) {
        Bitacora.trace(Reporter.class, "executeReport", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
        Bitacora.trace(select);
        Utils.traceObjectArray(args);
        Long rastro = null;
        Process subprocess = null;
        try {
            informe = StringUtils.trimToEmpty(informe);
            if (STP.esIdentificadorArchivoValido(informe)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    rastro = TLC.getControlador().ponerInformePendiente(funcion);
                    String command = EA.getString(EAC.REPORT_RUNNER_DIR) + EA.getString(EAC.REPORT_RUNNER_CMD);
                    command += " " + commandParameters(informe, rastro, destino, tipo, select, args);
                    String[] envp = null;
                    File dir = new File(EA.getString(EAC.REPORT_RUNNER_DIR));
                    Bitacora.trace(command);
                    Bitacora.trace(dir.getPath());
                    subprocess = Runtime.getRuntime().exec(command, envp, dir);
                    TLC.getBitacora().info(CBM2.REPORT_EXECUTION_REQUEST, informe);
                } else {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.FUNCION_NO_AUTORIZADA, informe));
                }
            } else {
                throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.IDENTIFICADOR_ARCHIVO_INVALIDO, informe));
            }
        } catch (Exception ex) {
            EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            String mensaje = ThrowableUtils.getString(ex);
            Auditor.grabarRastroInforme(rastro, condicion, null, mensaje);
            TLC.getBitacora().error(mensaje);
        }
        return subprocess;
    }

    private static String commandParameters(String informe, Long rastro, String destino, EnumFormatoInforme tipo, String select, Object[] args) {
        String str = informe + " " + rastro;
        str += " " + trimToDefaultTarget(destino);
        str += " " + getReportFormat(tipo);
        str += " " + Utils.getQuotedParameterString(Utils.encodeSelect(trimToDefaultSelect(select)));
        str += " " + Utils.getQuotedParameterString(args);
        return str;
    }

    public static ReporterMessage report(String informe, long funcion) {
        return report(informe, funcion, null, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, null);
    }

    public static ReporterMessage report(String informe, long funcion, EnumFormatoInforme tipo) {
        return report(informe, funcion, null, tipo, DEFAULT_SELECT_KW, null);
    }

    public static ReporterMessage report(String informe, long funcion, String select) {
        return report(informe, funcion, null, EnumFormatoInforme.PDF, select, null);
    }

    public static ReporterMessage report(String informe, long funcion, Map parametros) {
        return report(informe, funcion, null, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, getReportParametersArray(parametros), parametros);
    }

    public static ReporterMessage report(String informe, long funcion, EnumFormatoInforme tipo, String select) {
        return report(informe, funcion, null, tipo, select, null);
    }

    public static ReporterMessage report(String informe, long funcion, EnumFormatoInforme tipo, Map parametros) {
        return report(informe, funcion, null, tipo, DEFAULT_SELECT_KW, getReportParametersArray(parametros), parametros);
    }

    public static ReporterMessage report(String informe, long funcion, String select, Object[] args) {
        return report(informe, funcion, null, EnumFormatoInforme.PDF, select, args, null);
    }

    public static ReporterMessage report(String informe, long funcion, String select, Object[] args, Map parametros) {
        return report(informe, funcion, null, EnumFormatoInforme.PDF, select, args, parametros);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, EnumFormatoInforme tipo) {
        return report(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, null);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, String select) {
        return report(informe, funcion, destino, EnumFormatoInforme.PDF, select, null);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, Map parametros) {
        return report(informe, funcion, destino, EnumFormatoInforme.PDF, DEFAULT_SELECT_KW, getReportParametersArray(parametros), parametros);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select) {
        return report(informe, funcion, destino, tipo, select, null);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, EnumFormatoInforme tipo, Map parametros) {
        return report(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, getReportParametersArray(parametros), parametros);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, String select, Object[] args) {
        return report(informe, funcion, destino, EnumFormatoInforme.PDF, select, args, null);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, String select, Object[] args, Map parametros) {
        return report(informe, funcion, destino, EnumFormatoInforme.PDF, select, args, parametros);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args) {
        return report(informe, funcion, destino, EnumFormatoInforme.PDF, select, args, null);
    }

    public static ReporterMessage report(String informe, long funcion, String destino, EnumFormatoInforme tipo, String select, Object[] args, Map parametros) {
        Bitacora.trace(Reporter.class, "report", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
        Long rastro = null;
        try {
            informe = StringUtils.trimToEmpty(informe);
            if (STP.esIdentificadorArchivoValido(informe)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    rastro = TLC.getControlador().ponerInformePendiente(funcion);
                    return report(informe,
                        rastro,
                        TLC.getControlador().getUsuario().getIdUsuario(),
                        TLC.getControlador().getUsuario().getCodigoUsuario(),
                        TLC.getControlador().getUsuario().getNombreUsuario(),
                        destino,
                        tipo,
                        select,
                        args,
                        parametros,
                        false);
                } else {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.FUNCION_NO_AUTORIZADA, informe));
                }
            } else {
                throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.IDENTIFICADOR_ARCHIVO_INVALIDO, informe));
            }
        } catch (Exception ex) {
            EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            String mensaje = ThrowableUtils.getString(ex);
            Auditor.grabarRastroInforme(rastro, condicion, null, mensaje);
            TLC.getBitacora().error(mensaje);
        }
        return null;
    }

    public static ReporterMessage report(ReporterMessage message) {
        return report(message.getInforme(),
            message.getRastro(),
            message.getUsuario(),
            message.getCodigoUsuario(),
            message.getNombreUsuario(),
            message.getDestino(),
            message.getTipo(),
            message.getSelect(),
            message.getArgs(),
            message.getParameters(),
            false);
    }

    static ReporterMessage report(String report, String number, String userid, String target, String format, String select, Object[] args, boolean logging) {
        Bitacora.trace(Reporter.class, "report", report, number, target, format);
        String informe = StringUtils.trimToEmpty(report);
        Long rastro = trimToNullNumber(number);
        Long usuario = StringUtils.isNotBlank(userid) && StringUtils.isNumeric(userid) ? Long.valueOf(userid) : null;
        String destino = trimToNullTarget(target);
        EnumFormatoInforme tipo = getReportType(format);
        String decode = Utils.decodeSelect(trimToNullSelect(select));
        return report(informe, rastro, usuario, null, null, destino, tipo, decode, args, null, logging);
    }

    private static ReporterMessage report(String informe, Long rastro, Long userid, String usercode, String username, String destino, EnumFormatoInforme tipo, String select, Object[] args, Map parametros, boolean logging) {
        Bitacora.trace(Reporter.class, "report", informe, rastro, destino, tipo);
        Bitacora.trace(Reporter.class, "report", userid, usercode, username);
        Bitacora.trace(trimToDefaultSelect(select));
        Utils.traceObjectArray(args);
        String report = StringUtils.trimToEmpty(informe);
        String target = trimToNullTarget(destino);
        String format = getReportFormat(tipo);
        ResultSet resultSet = null;
//      String archivo = logging ? getLogFileName(rastro) : null;
        String archivo = null;
        EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_EN_PROGRESO;
        String mensaje = TLC.getBitacora().info(CBM2.REPORT_EXECUTION_BEGIN, report);
        boolean ok = Auditor.grabarRastroInforme(rastro, condicion, archivo, mensaje);
        if (ok) {
            try {
                // OJO: hay que copiar jdt-compiler.jar a jre\ext o incluirlo en el CLASSPATH para compilar el archivo jrxml
                // OJO: compilar el archivo jrxml de origen evita problemas al cambiar la version de jasper
                JasperPrint jasperPrint = null;
                File sourceFile = getReportSourceFile(report);
                if (sourceFile == null) {
                    throw new FileNotFoundException(report);
                }
                String sourceFileName = sourceFile.getPath();
                JasperReport jasperReport = JasperCompileManager.compileReport(sourceFileName);
                Map parameters = getReportParametersMap(sourceFile, format, userid, usercode, username, parametros);
                if (StringUtils.isBlank(select)) {
                    jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, TLC.getConnection());
                    if (jasperPrint == null) {
                        condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
                        mensaje = TLC.getBitacora().error(CBM2.REPORT_EXECUTION_ABEND, report);
                    }
                } else {
                    select = Utils.replaceWhereClause(jasperReport.getQuery().getText(), select);
                    if (StringUtils.isBlank(select)) {
                        condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                        mensaje = TLC.getBitacora().error(CBM2.ERROR_COMANDO_SELECT);
                    } else {
                        int limite = getLimiteFilasFuncionSelect(report);
                        resultSet = TLC.getAgenteSql().executeQuery(select, limite, args);
                        if (resultSet.isBeforeFirst()) {
                            JRResultSetDataSource dataSource = new JRResultSetDataSource(resultSet);
                            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
                            if (jasperPrint == null) {
                                condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
                                mensaje = TLC.getBitacora().error(CBM2.REPORT_EXECUTION_ABEND, report);
                            }
                        } else {
                            condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
                            mensaje = TLC.getBitacora().error(CBM2.SELECT_ROW_EMPTY_SET, report);
                        }
                    }
                }
                if (jasperPrint != null) {
                    archivo = report(jasperPrint, target, format, userid);
                    condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
                    mensaje = TLC.getBitacora().warn(CBM2.REPORT_EXECUTION_END, report);
                }
            } catch (Exception ex) {
                condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                mensaje = ThrowableUtils.getString(ex);
                TLC.getBitacora().fatal(ex);
                TLC.getBitacora().fatal(CBM2.REPORT_EXECUTION_ABEND, report);
            } finally {
                Auditor.grabarRastroInforme(rastro, condicion, archivo, mensaje);
                DB.close(resultSet);
            }
        } else {
            condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            mensaje = TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, report);
        }
        ReporterMessage message = new ReporterMessage(report);
        message.setDestino(target);
        message.setTipo(tipo);
        message.setSelect(select);
        message.setArgs(args);
        message.setRastro(rastro);
        message.setCondicion(condicion);
        message.setArchivo(archivo);
        message.setMensaje(mensaje);
        return message;
    }

    private static String report(JasperPrint jasperPrint, String target, String format, Long usuario) throws Exception {
        Bitacora.trace(Reporter.class, "report", jasperPrint.getName(), target, format);
        String targetFileName = null;
        if (target == null) {
            targetFileName = jasperPrint.getName() + "_" + System.currentTimeMillis() + "_" + jasperPrint.hashCode();
        } else {
            targetFileName = target;
        }
        targetFileName += "." + format;
        targetFileName = targetFileName.toLowerCase();
        String outputFileName = Utils.getSpooledFilesDir(usuario) + targetFileName;
        EnumFormatoInforme type = getReportType(format);
        switch (type) {
            case XLS:
                JRXlsExporter xlsExporter = new JRXlsExporter();
                xlsExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                xlsExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFileName);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, Boolean.TRUE);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_FONT_SIZE_FIX_ENABLED, Boolean.TRUE);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
//              xlsExporter.setParameter(JRXlsExporterParameter.MAXIMUM_ROWS_PER_SHEET, Integer.valueOf(0));
                xlsExporter.exportReport();
                break;
//          case CSV:
//              JRCsvExporter csvExporter = new JRCsvExporter();
//              csvExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//              csvExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFileName);
//              csvExporter.setParameter(JRCsvExporterParameter.FIELD_DELIMITER, ";");
//              csvExporter.exportReport();
//              break;
            default:
                JasperExportManager.exportReportToPdfFile(jasperPrint, outputFileName);
                break;
        }
        return targetFileName;
    }

//  private static String getLogFileName(Long rastro) {
//      if (rastro == null || rastro == 0) {
//          return null;
//      }
//      return System.getenv(SEV.REPORT_RUNNER_LOG);
//  }

    private static String trimToDefaultNumber(String number) {
        String str = StringUtils.trimToEmpty(number);
        return StringUtils.isEmpty(str) || !StringUtils.isNumeric(str) ? DEFAULT_NUMBER_KW : str;
    }

    private static String trimToDefaultTarget(String target) {
        String str = StringUtils.trimToEmpty(target);
        return StringUtils.isEmpty(str) || !STP.esIdentificadorArchivoValido(str) ? DEFAULT_TARGET_KW : str;
    }

    private static String trimToDefaultSelect(String select) {
        String str = StringUtils.trimToEmpty(select);
        return StringUtils.isEmpty(str) ? DEFAULT_SELECT_KW : str;
    }

    private static Long trimToNullNumber(String number) {
        String str = StringUtils.trimToEmpty(number);
        return StringUtils.isEmpty(str) || str.equalsIgnoreCase(DEFAULT_NUMBER_KW) || !StringUtils.isNumeric(str) ? null : Long.valueOf(str);
    }

    private static String trimToNullTarget(String target) {
        String str = StringUtils.trimToEmpty(target);
        return StringUtils.isEmpty(str) || str.equalsIgnoreCase(DEFAULT_TARGET_KW) || !STP.esIdentificadorArchivoValido(str) ? null : str;
    }

    private static String trimToNullSelect(String select) {
        String str = StringUtils.trimToEmpty(select);
        return StringUtils.isEmpty(str) || str.equalsIgnoreCase(DEFAULT_SELECT_KW) ? null : str;
    }

    private static Object[] getReportParametersArray(Map parameters) {
        if (parameters == null || parameters.isEmpty()) {
            return null;
        }
        int n = parameters.size();
        Object[] args = new Object[n];
        Set set = parameters.keySet();
        Iterator iterator = set.iterator();
        Object key = null;
        Object val = null;
        String psi = null;
        String str = null;
        for (int i = 0; i < n && iterator.hasNext(); i++) {
            key = iterator.next();
            val = parameters.get(key);
            if (val != null) {
                psi = val instanceof Long ? Global.PREFIJO_STRING_ID_RECURSO : "";
                str = StringUtils.trimToEmpty(STP.getString(val));
                args[i] = key + "=" + psi + str;
                Bitacora.trace("args [" + i + "] = " + key + "=(" + val.getClass().getSimpleName() + ")" + str);
            }
        }
        return args;
    }

    private static Map getReportParametersMap(File file, String format, Long userid, String usercode, String username) {
        Bitacora.trace(Reporter.class, "getReportParametersMap", file.getName(), file.getParent(), file.getPath());
        Map parameters = new HashMap();
        EnumFormatoInforme type = getReportType(format);
        String sep = System.getProperties().getProperty("file.separator");
        String srd = file.getParent() + sep + "subreports" + sep;
        parameters.put(JRFillParameter.REPORT_CONNECTION, TLC.getConnection());
        parameters.put("SUBREPORT_DIR", srd);
        parameters.put("END_USER_ID", userid);
        parameters.put("END_USER_CODE", usercode);
        parameters.put("END_USER_NAME", username);
        parameters.put("SQL_WHERE_CLAUSE", "");
        parameters.put("SQL_LIMIT_CLAUSE", "");
        switch (type) {
            case XLS:
                parameters.put(JRFillParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);
                parameters.put(JRFillParameter.REPORT_MAX_COUNT, Integer.valueOf(60000));
                break;
//          case CSV:
//              parameters.put(JRFillParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);
//              parameters.put(JRFillParameter.REPORT_MAX_COUNT, null);
//              break;
            default:
                parameters.put(JRFillParameter.IS_IGNORE_PAGINATION, Boolean.FALSE);
                parameters.put(JRFillParameter.REPORT_MAX_COUNT, null);
                break;
        }
        return parameters;
    }

    private static Map getReportParametersMap(File file, String format, Long userid, String usercode, String username, Map parametros) {
        Map parameters = getReportParametersMap(file, format, userid, usercode, username);
        if (parametros != null && !parametros.isEmpty()) {
            parameters.putAll(parametros);
        }
        return parameters;
    }

    private static Map getReportParametersMap(File file, String format, Long userid, String usercode, String username, Object[] args) {
        Map parameters = getReportParametersMap(file, format, userid, usercode, username);
        if (args != null) {
            String pdq = null;
            String key = null;
            String str = null;
            Object val = null;
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof String) {
                    pdq = StringUtils.trimToEmpty((String) args[i]);
                    if (StringUtils.isNotEmpty(pdq)) {
                        int p = pdq.indexOf("=");
                        if (p > 0) {
                            key = StringUtils.trimToEmpty(pdq.substring(0, p));
                            str = StringUtils.trimToEmpty(pdq.substring(p + 1));
                            if (StringUtils.isNotEmpty(key) && StringUtils.isNotEmpty(str)) {
                                val = STP.getObjeto(str);
                                parameters.put(key, val);
                                Bitacora.trace("args [" + i + "] = " + key + "=(" + val.getClass().getSimpleName() + ")" + str);
                            }
                        }
                    }
                }
            }
        }
        return parameters;
    }

    private static void edit(String filename) throws IOException {
        if (filename.endsWith(".csv")) {
            Runtime.getRuntime().exec(EA.getString(EAC.JASPER_CSV_EDITOR) + " " + filename);
        }
        if (filename.endsWith(".xls")) {
            Runtime.getRuntime().exec(EA.getString(EAC.JASPER_XLS_EDITOR) + " " + filename);
        }
    }

    private static void read(String filename) throws IOException {
        Runtime.getRuntime().exec(EA.getString(EAC.JASPER_PDF_READER) + " " + filename);
    }

    private static void view(JasperPrint jasperPrint) throws JRException {
        JasperViewer.viewReport(jasperPrint, false);
    }
}
