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
import com.egt.base.jms.messages.ExporterMessage;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import com.egt.commons.enums.EnumFormatoArchivo;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.util.EA;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.constants.SEV;
import com.egt.core.control.Auditor;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.egt.core.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import net.sf.jasperreports.engine.JasperReport;
import org.apache.commons.lang.StringUtils;

public class Exporter {

    private static final String DEFAULT_NUMBER_KW = "DEFAULT";

    private static final String DEFAULT_TARGET_KW = "DEFAULT";

    private static final String DEFAULT_SELECT_KW = "DEFAULT";

    public static EnumFormatoArchivo getExportType(String formato) {
        String str = StringUtils.trimToEmpty(formato);
        EnumFormatoArchivo tipo = EnumFormatoArchivo.CSV;
        if (EnumFormatoArchivo.TXT.getExtension().equalsIgnoreCase(str)) {
            tipo = EnumFormatoArchivo.TXT;
        }
        return tipo;
    }

    public static String getExportFormat(EnumFormatoArchivo tipo) {
        String formato = null;
        switch (tipo) {
            case TXT:
                formato = EnumFormatoArchivo.TXT.getExtension();
                break;
//          case XML:
//              formato = EnumFormatoArchivo.XML.getExtension();
//              break;
            default:
                formato = EnumFormatoArchivo.CSV.getExtension();
                break;
        }
        return formato;
    }

    public static Process executeExport(String informe, long funcion) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, DEFAULT_SELECT_KW, null);
    }

    public static Process executeExport(String informe, long funcion, EnumFormatoArchivo tipo) {
        return executeExport(informe, funcion, null, tipo, DEFAULT_SELECT_KW, null);
    }

    public static Process executeExport(String informe, long funcion, String select) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, select, null);
    }

    public static Process executeExport(String informe, long funcion, EnumFormatoArchivo tipo, String select) {
        return executeExport(informe, funcion, null, tipo, select, null);
    }

    public static Process executeExport(String informe, long funcion, String select, Object[] args) {
        return executeExport(informe, funcion, null, EnumFormatoArchivo.CSV, select, args);
    }

    public static Process executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo) {
        return executeExport(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, null);
    }

    public static Process executeExport(String informe, long funcion, String destino, String select) {
        return executeExport(informe, funcion, destino, EnumFormatoArchivo.CSV, select, null);
    }

    public static Process executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select) {
        return executeExport(informe, funcion, destino, tipo, select, null);
    }

    public static Process executeExport(String informe, long funcion, String destino, String select, Object[] args) {
        return executeExport(informe, funcion, destino, EnumFormatoArchivo.CSV, select, args);
    }

    public static Process executeExport(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select, Object[] args) {
        Bitacora.trace(Exporter.class, "executeExport", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
        Bitacora.trace(select);
        Utils.traceObjectArray(args);
        Long rastro = null;
        Process subprocess = null;
        try {
            informe = StringUtils.trimToEmpty(informe);
            if (STP.esIdentificadorArchivoValido(informe)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    rastro = TLC.getControlador().ponerInformePendiente(funcion);
                    String command = EA.getString(EAC.EXPORT_RUNNER_DIR) + EA.getString(EAC.EXPORT_RUNNER_CMD);
                    command += " " + commandParameters(informe, rastro, destino, tipo, select, args);
                    String[] envp = null;
                    File dir = new File(EA.getString(EAC.EXPORT_RUNNER_DIR));
                    Bitacora.trace(command);
                    Bitacora.trace(dir.getPath());
                    subprocess = Runtime.getRuntime().exec(command, envp, dir);
                    TLC.getBitacora().info(CBM2.EXPORT_EXECUTION_REQUEST, informe);
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

    private static String commandParameters(String informe, Long rastro, String destino, EnumFormatoArchivo tipo, String select, Object[] args) {
        String str = informe + " " + rastro;
        str += " " + trimToDefaultTarget(destino);
        str += " " + getExportFormat(tipo);
        str += " " + Utils.getQuotedParameterString(Utils.encodeSelect(trimToDefaultSelect(select)));
        str += " " + Utils.getQuotedParameterString(args);
        return str;
    }

    public static ExporterMessage export(String informe, long funcion) {
        return export(informe, funcion, null, EnumFormatoArchivo.CSV, DEFAULT_SELECT_KW, null);
    }

    public static ExporterMessage export(String informe, long funcion, EnumFormatoArchivo tipo) {
        return export(informe, funcion, null, tipo, DEFAULT_SELECT_KW, null);
    }

    public static ExporterMessage export(String informe, long funcion, String select) {
        return export(informe, funcion, null, EnumFormatoArchivo.CSV, select, null);
    }

    public static ExporterMessage export(String informe, long funcion, EnumFormatoArchivo tipo, String select) {
        return export(informe, funcion, null, tipo, select, null);
    }

    public static ExporterMessage export(String informe, long funcion, String select, Object[] args) {
        return export(informe, funcion, null, EnumFormatoArchivo.CSV, select, args);
    }

    public static ExporterMessage export(String informe, long funcion, String destino, EnumFormatoArchivo tipo) {
        return export(informe, funcion, destino, tipo, DEFAULT_SELECT_KW, null);
    }

    public static ExporterMessage export(String informe, long funcion, String destino, String select) {
        return export(informe, funcion, destino, EnumFormatoArchivo.CSV, select, null);
    }

    public static ExporterMessage export(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select) {
        return export(informe, funcion, destino, tipo, select, null);
    }

    public static ExporterMessage export(String informe, long funcion, String destino, String select, Object[] args) {
        return export(informe, funcion, destino, EnumFormatoArchivo.CSV, select, args);
    }

    public static ExporterMessage export(String informe, long funcion, String destino, EnumFormatoArchivo tipo, String select, Object[] args) {
        Bitacora.trace(Exporter.class, "export", informe, String.valueOf(funcion), destino, String.valueOf(tipo));
        Long rastro = null;
        try {
            informe = StringUtils.trimToEmpty(informe);
            if (STP.esIdentificadorArchivoValido(informe)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    rastro = TLC.getControlador().ponerInformePendiente(funcion);
                    return export(informe, rastro, TLC.getControlador().getUsuario().getIdUsuario(), destino, tipo, select, args, false);
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

    public static ExporterMessage export(ExporterMessage message) {
        return export(message.getInforme(), message.getRastro(), message.getUsuario(), message.getDestino(), message.getTipo(), message.getSelect(), message.getArgs(), false);
    }

    static ExporterMessage export(String report, String number, String userid, String target, String format, String select, Object[] args, boolean logging) {
        Bitacora.trace(Exporter.class, "export", report, number, target, format);
        String informe = StringUtils.trimToEmpty(report);
        Long rastro = trimToNullNumber(number);
        Long usuario = StringUtils.isNotBlank(userid) && StringUtils.isNumeric(userid) ? Long.valueOf(userid) : null;
        String destino = trimToNullTarget(target);
        EnumFormatoArchivo tipo = getExportType(format);
        String decode = Utils.decodeSelect(trimToNullSelect(select));
        return export(informe, rastro, usuario, destino, tipo, decode, args, logging);
    }

    private static ExporterMessage export(String informe, Long rastro, Long usuario, String destino, EnumFormatoArchivo tipo, String select, Object[] args, boolean logging) {
        Bitacora.trace(Exporter.class, "export", informe, rastro, destino, tipo);
        Bitacora.trace(trimToDefaultSelect(select));
        Utils.traceObjectArray(args);
        String report = StringUtils.trimToEmpty(informe);
        String target = trimToNullTarget(destino);
        String format = getExportFormat(tipo);
        ResultSet resultSet = null;
//      String archivo = logging ? getLogFileName(rastro) : null;
        String archivo = null;
        EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_EN_PROGRESO;
        String mensaje = TLC.getBitacora().info(CBM2.EXPORT_EXECUTION_BEGIN, report);
        boolean ok = Auditor.grabarRastroInforme(rastro, condicion, archivo, mensaje);
        if (ok) {
            try {
                JasperReport jasperReport = Reporter.getJasperReport(report);
                select = jasperReport == null ? select : Utils.replaceWhereClause(jasperReport.getQuery().getText(), select);
                if (StringUtils.isBlank(select)) {
                    condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                    mensaje = TLC.getBitacora().error(CBM2.ERROR_COMANDO_SELECT);
                } else {
                    int limite = Reporter.getLimiteFilasFuncionSelect(report);
                    resultSet = TLC.getAgenteSql().executeQuery(select, limite, args);
                    if (resultSet.isBeforeFirst()) {
                        archivo = export(resultSet, report, target, format, usuario);
                        condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
                        mensaje = TLC.getBitacora().warn(CBM2.EXPORT_EXECUTION_END, report);
                    } else {
                        condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
                        mensaje = TLC.getBitacora().error(CBM2.SELECT_ROW_EMPTY_SET, report);
                    }
                }
            } catch (Exception ex) {
                condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                mensaje = ThrowableUtils.getString(ex);
                TLC.getBitacora().fatal(ex);
                TLC.getBitacora().fatal(CBM2.EXPORT_EXECUTION_ABEND, report);
            } finally {
                Auditor.grabarRastroInforme(rastro, condicion, archivo, mensaje);
                DB.close(resultSet);
            }
        } else {
            condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            mensaje = TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, report);
        }
        ExporterMessage message = new ExporterMessage(report);
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

    private static String export(ResultSet resultSet, String report, String target, String format, Long usuario) throws Exception {
        Bitacora.trace(Exporter.class, "export", report, target, format);
        String targetFileName = null;
        if (target == null) {
            targetFileName = report + "_" + System.currentTimeMillis() + "_" + resultSet.hashCode();
        } else {
            targetFileName = target;
        }
        targetFileName += "." + format;
        targetFileName = targetFileName.toLowerCase();
        String outputFileName = Utils.getSpooledFilesDir(usuario) + targetFileName;
        EnumFormatoArchivo type = getExportType(format);
        switch (type) {
            case TXT:
                FileWriter txtFileWriter = new FileWriter(outputFileName);
                CSVWriter txtCSVWriter = new CSVWriter(txtFileWriter, '\t', CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, ',');
                txtCSVWriter.writeAll(resultSet, true);
                txtCSVWriter.close();
                break;
//          case XML:
//              break;
            default:
                FileWriter csvFileWriter = new FileWriter(outputFileName);
                CSVWriter csvCSVWriter = new CSVWriter(csvFileWriter, ';', '"', CSVWriter.DEFAULT_ESCAPE_CHARACTER, ',');
                csvCSVWriter.writeAll(resultSet, true);
                csvCSVWriter.close();
                break;
        }
        return targetFileName;
    }

//  private static String getLogFileName(Long rastro) {
//      if (rastro == null || rastro == 0) {
//          return null;
//      }
//      return System.getenv(SEV.EXPORT_RUNNER_LOG);
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
}
