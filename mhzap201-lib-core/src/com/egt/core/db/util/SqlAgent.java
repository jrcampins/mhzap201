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
import com.egt.base.jms.messages.SqlAgentMessage;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import com.egt.core.control.Auditor;
import com.egt.core.util.EA;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import java.io.File;
import java.sql.ResultSet;
import org.apache.commons.lang.StringUtils;

public class SqlAgent {

    private static final String DEFAULT_NUMBER_KW = "DEFAULT";

    public static Process executeProcedure(String procedimiento, long funcion) {
        return executeProcedure(procedimiento, funcion, null);
    }

    public static Process executeProcedure(String procedimiento, long funcion, Object[] args) {
        Bitacora.trace(SqlAgent.class, "executeProcedure", procedimiento, String.valueOf(funcion));
        Utils.traceObjectArray(args);
        Long rastro = null;
        Process process = null;
        try {
            procedimiento = StringUtils.trimToEmpty(procedimiento);
            if (STP.esIdentificadorArchivoValido(procedimiento)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    rastro = TLC.getControlador().ponerProcesoPendiente(funcion);
                    String command = EA.getString(EAC.SQLPRC_RUNNER_DIR) + EA.getString(EAC.SQLPRC_RUNNER_CMD);
                    command += " " + commandParameters(procedimiento, funcion, rastro, args);
                    String[] envp = null;
                    File dir = new File(EA.getString(EAC.SQLPRC_RUNNER_DIR));
                    Bitacora.trace(command);
                    Bitacora.trace(dir.getPath());
                    process = Runtime.getRuntime().exec(command, envp, dir);
                    TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_REQUEST, procedimiento);
                } else {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.FUNCION_NO_AUTORIZADA, procedimiento));
                }
            } else {
                throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.IDENTIFICADOR_ARCHIVO_INVALIDO, procedimiento));
            }
        } catch (Exception ex) {
            EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            String mensaje = ThrowableUtils.getString(ex);
            Auditor.grabarRastroProceso(rastro, condicion, null, mensaje);
            TLC.getBitacora().error(mensaje);
        }
        return process;
    }

    private static String commandParameters(String procedimiento, long funcion, Long rastro, Object[] args) {
        String str = procedimiento + " " + rastro;
        str += " " + Utils.getQuotedParameterString(args);
        return str;
    }

    public static SqlAgentMessage executeProcedure(SqlAgentMessage message) {
        return executeProcedure(message.getProcedimiento(), message.getRastro(), message.getArgs(), false);
    }

    static SqlAgentMessage executeProcedure(String procedure, String number, Object[] args, boolean logging) {
        String proceso = StringUtils.trimToEmpty(procedure);
        Long rastro = trimToNullNumber(number);
        return executeProcedure(proceso, rastro, args, logging);
    }

    private static SqlAgentMessage executeProcedure(String procedimiento, Long rastro, Object[] args, boolean logging) {
        Bitacora.trace(SqlAgent.class, "executeProcedure", procedimiento, rastro);
        Utils.traceObjectArray(args);
        String procedure = StringUtils.trimToEmpty(procedimiento);
//      String archivo = logging ? getLogFileName(rastro) : null;
        String archivo = null;
        EnumCondicionEjeFun condicion = EnumCondicionEjeFun.EJECUCION_EN_PROGRESO;
        String mensaje = TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_BEGIN, procedure);
        boolean ok = Auditor.grabarRastroProceso(rastro, condicion, archivo, mensaje);
        if (ok) {
            try {
                // <editor-fold defaultstate="collapsed">
//              Object resultado = TLC.getAgenteSql().executeProcedure(procedure, args);
//              if (resultado == null) {
//                  condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
//                  mensaje = TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, procedure);
//              } else {
//                  condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
//                  if (resultado instanceof Number) {
//                      mensaje = TLC.getBitacora().info(procedure + " = " + resultado);
//                  } else if (resultado instanceof ResultSet) {
//                      ResultSet resultSet = (ResultSet) resultado;
//                      if (resultSet.next()) {
//                          mensaje = TLC.getBitacora().info(procedure + " = " + resultSet.getObject(1));
//                      } else {
//                          mensaje = TLC.getBitacora().info(procedure + " = " + STP.STRING_VALOR_NULO);
//                      }
//                  } else {
//                      mensaje = TLC.getBitacora().warn(CBM2.PROCESS_EXECUTION_END, procedure);
//                  }
//              }
                // </editor-fold>
                Object resultado = TLC.getAgenteSql().executeProcedure(procedure, args);
                if (resultado == null) {
                    condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                    mensaje = TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, procedure);
                } else {
                    condicion = EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES;
                    mensaje = TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, procedure);
                    if (resultado instanceof ResultSet) {
                        ResultSet resultSet = (ResultSet) resultado;
                        if (resultSet.next()) {
                            mensaje += " (" + resultSet.getObject(1) + ") ";
                        }
                    } else if (resultado.getClass().isPrimitive()) {
                        mensaje += " (" + resultado + ") ";
                    }
                }
            } catch (Exception ex) {
                condicion = EnumCondicionEjeFun.EJECUTADO_CON_ERRORES;
                mensaje = ThrowableUtils.getString(ex);
                TLC.getBitacora().fatal(ex);
                TLC.getBitacora().fatal(CBM2.PROCESS_EXECUTION_ABEND, procedure);
            } finally {
                Auditor.grabarRastroProceso(rastro, condicion, archivo, mensaje);
//              DB.close(resultSet);
            }
        } else {
            condicion = EnumCondicionEjeFun.EJECUCION_CANCELADA;
            mensaje = TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, procedure);
        }
        SqlAgentMessage message = new SqlAgentMessage(procedure);
        message.setArgs(args);
        message.setRastro(rastro);
        message.setCondicion(condicion);
        message.setArchivo(archivo);
        message.setMensaje(mensaje);
        return message;
    }

    // <editor-fold defaultstate="collapsed" desc="getLogFileName">
//  private static String getLogFileName(Long rastro) {
//      if (rastro == null || rastro == 0) {
//          return null;
//      }
//      return System.getenv(SEV.SQLPRC_RUNNER_LOG);
//  }
    // </editor-fold>
//
    private static Long trimToNullNumber(String number) {
        String str = StringUtils.trimToEmpty(number);
        return StringUtils.isEmpty(str) || str.equalsIgnoreCase(DEFAULT_NUMBER_KW) || !StringUtils.isNumeric(str) ? null : Long.valueOf(str);
    }
//
    // <editor-fold defaultstate="collapsed" desc="exportLog">
//  private static String exportLog(String process) {
//      Bitacora.trace(SqlAgent.class, "exportLog", process);
//      try {
//          String targetFileName = process + "_" + System.currentTimeMillis() + "_" + TLC.getBitacora().hashCode();
//          targetFileName += "." + "log";
//          targetFileName = targetFileName.toLowerCase();
//          String log = Utils.getSpooledFilesDir() + targetFileName;
//          FileWriter fileWriter = new FileWriter(log);
//          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//          bufferedWriter.write(TLC.getBitacora().getLogString());
//          bufferedWriter.close();
//          return targetFileName;
//      } catch (IOException ex) {
//          TLC.getBitacora().fatal(ex);
//      }
//      return null;
//  }
    // </editor-fold>
}
