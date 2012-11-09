/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.control;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.LongUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.enums.EnumTipoDatoSQL;
import java.sql.SQLException;
import java.util.Iterator;

public class Auditor {

    private static final String RASTRO_FUNCION_INSERT = "rastro_funcion_insert";

    private static final String RASTRO_FUNCION_PAR_INSERT = "rastro_funcion_par_insert";

    private static final String RASTRO_INFORME_INSERT = "rastro_informe_insert";

    private static final String RASTRO_INFORME_UPDATE = "rastro_informe_update";

    private static final String RASTRO_PROCESO_INSERT = "rastro_proceso_insert";

    private static final String RASTRO_PROCESO_UPDATE = "rastro_proceso_update";

    public static Long grabarRastroFuncion(RastroFuncion rastro) {
        Bitacora.trace(Auditor.class, "grabarRastroFuncion", rastro);
        Object[] args1, args2;
        // <editor-fold defaultstate="collapsed">
//      Object resultado;
//      ResultSet resultSet = null;
//      Object object;
        // </editor-fold>
        Long id;
        Iterator iterator;
        RastroFuncionPar parametro;
        if (TLC.getAgenteSql().connected()) {
            try {
                args1 = new Object[11];
                // <editor-fold defaultstate="collapsed">
//              args1[0] = rastro.getIdRastroFuncion() == null ? LongUtils.getNewId() : rastro.getIdRastroFuncion();
//              args1[1] = rastro.getIdUsuario() == null ? TLC.getControlador().getUsuario().getIdUsuario() : rastro.getIdUsuario();
//              args1[2] = rastro.getIdFuncion();
//              args1[3] = rastro.getIdRecurso();
//              args1[4] = rastro.getVersionRecurso();
//              args1[5] = rastro.getCodigoRecurso();
//              args1[6] = rastro.getNombreRecurso();
//              args1[7] = rastro.getIdPropietarioRecurso();
//              args1[8] = rastro.getIdSegmentoRecurso();
//              args1[9] = rastro.getNumeroError();
//              args1[10] = rastro.getDescripcionError();
                /**/
//              resultado = TLC.getAgenteSql().executeProcedure(RASTRO_FUNCION_INSERT, args1, EnumTipoResultadoSQL.SIMPLE);
//              if (resultado instanceof ResultSet) {
//                  resultSet = (ResultSet) resultado;
//                  if (resultSet.next()) {
//                      object = resultSet.getObject(1);
//                      id = LongUtils.toLong(object);
//                      if (id != null) {
//                          iterator = rastro.getParametros().iterator();
//                          while (iterator.hasNext()) {
//                              parametro = (RastroFuncionPar) iterator.next();
//                              args2 = new Object[4];
//                              args2[0] = LongUtils.getNewId();
//                              args2[1] = id;
//                              args2[2] = parametro.getIdParametro();
//                              args2[3] = parametro.getValorParametro();
//                              TLC.getAgenteSql().executeProcedure(RASTRO_FUNCION_PAR_INSERT, args2, EnumTipoResultadoSQL.SIMPLE);
//                          }
//                      }
//                  }
//              }
                // </editor-fold>
                id = rastro.getIdRastroFuncion() == null ? LongUtils.getNewId() : rastro.getIdRastroFuncion();
                args1[0] = id;
                args1[1] = rastro.getIdUsuario() == null ? TLC.getControlador().getUsuario().getIdUsuario() : rastro.getIdUsuario();
                args1[2] = rastro.getIdFuncion() == null ? EnumTipoDatoSQL.BIGINT : rastro.getIdFuncion();
                args1[3] = rastro.getIdRecurso() == null ? EnumTipoDatoSQL.BIGINT : rastro.getIdRecurso();
                args1[4] = rastro.getVersionRecurso() == null ? EnumTipoDatoSQL.BIGINT : rastro.getVersionRecurso();
                args1[5] = rastro.getCodigoRecurso() == null ? EnumTipoDatoSQL.VARCHAR : rastro.getCodigoRecurso();
                args1[6] = rastro.getNombreRecurso() == null ? EnumTipoDatoSQL.VARCHAR : rastro.getNombreRecurso();
                args1[7] = rastro.getIdPropietarioRecurso() == null ? EnumTipoDatoSQL.BIGINT : rastro.getIdPropietarioRecurso();
                args1[8] = rastro.getIdSegmentoRecurso() == null ? EnumTipoDatoSQL.BIGINT : rastro.getIdSegmentoRecurso();
                args1[9] = rastro.getNumeroError() == null ? EnumTipoDatoSQL.INTEGER : rastro.getNumeroError();
                args1[10] = rastro.getDescripcionError() == null ? EnumTipoDatoSQL.VARCHAR : rastro.getDescripcionError();
                TLC.getAgenteSql().executeProcedure(RASTRO_FUNCION_INSERT, args1);
                iterator = rastro.getParametros().iterator();
                while (iterator.hasNext()) {
                    parametro = (RastroFuncionPar) iterator.next();
                    args2 = new Object[4];
                    args2[0] = LongUtils.getNewId();
                    args2[1] = id;
                    args2[2] = parametro.getIdParametro() == null ? EnumTipoDatoSQL.BIGINT : parametro.getIdParametro();
                    args2[3] = parametro.getValorParametro() == null ? EnumTipoDatoSQL.VARCHAR : parametro.getValorParametro();
                    TLC.getAgenteSql().executeProcedure(RASTRO_FUNCION_PAR_INSERT, args2);
                }
                return id;
            } catch (SQLException ex) {
                TLC.getBitacora().error(ex);
            } finally {
//              DB.close(resultSet);
            }
        }
        return null;
    }

    static Long grabarRastroInforme(long funcion, long usuario) throws Exception {
        return insertRastro(RASTRO_INFORME_INSERT, funcion, usuario);
    }

    static Long grabarRastroProceso(long funcion, long usuario) throws Exception {
        return insertRastro(RASTRO_PROCESO_INSERT, funcion, usuario);
    }

    // <editor-fold defaultstate="collapsed">
//  static AbstractMessage grabarRastroInforme(AbstractMessage message) throws Exception {
//      Bitacora.trace(Auditor.class, "grabarRastroInforme", message);
//      if (message.getUsuario() == null) {
//          TLC.getControlador().ponerUsuarioEnMensaje(message);
//      }
//      Long rastro = insertRastro(RASTRO_INFORME_INSERT, message.getFuncion(), message.getUsuario());
//      message.setRastro(rastro);
//      message.setMensaje(Bitacora.getTextoMensaje(CBM2.PROCESS_EXECUTION_REQUEST, rastro));
//      message.setGrabarRastroPendiente(true);
//      return message;
//  }
    // </editor-fold>
//
    static AbstractMessage grabarRastroProceso(AbstractMessage message) throws Exception {
        Bitacora.trace(Auditor.class, "grabarRastroProceso", message);
        if (message.getUsuario() == null) {
            TLC.getControlador().ponerUsuarioEnMensaje(message);
        }
        Long rastro = insertRastro(RASTRO_PROCESO_INSERT, message.getFuncion(), message.getUsuario());
        message.setRastro(rastro);
        message.setMensaje(Bitacora.getTextoMensaje(CBM2.PROCESS_EXECUTION_REQUEST, rastro));
        message.setGrabarRastroPendiente(true);
        return message;
    }

    // <editor-fold defaultstate="collapsed">
//  public static boolean grabarRastroInforme(AbstractMessage message, Throwable throwable) {
//      message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
//      message.setMensaje(ThrowableUtils.getString(throwable));
//      boolean ok = message.getRastro() != null && message.getRastro() != 0 && message.isGrabarRastroPendiente();
//      ok = ok ? grabarRastroInforme(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje()) : true;
//      message.setGrabarRastroPendiente(!ok);
//      return ok;
//  }
    // </editor-fold>
//
    public static boolean grabarRastroProceso(AbstractMessage message, Throwable throwable) {
        message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
        message.setMensaje(ThrowableUtils.getString(throwable));
        boolean ok = message.getRastro() != null && message.getRastro() != 0 && message.isGrabarRastroPendiente();
        ok = ok ? grabarRastroProceso(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje()) : true;
        message.setGrabarRastroPendiente(!ok);
        return ok;
    }

    public static boolean grabarRastroInforme(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje) {
        return updateRastro(RASTRO_INFORME_UPDATE, rastro, condicion, archivo, mensaje);
    }

    public static boolean grabarRastroProceso(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje) {
        return updateRastro(RASTRO_PROCESO_UPDATE, rastro, condicion, archivo, mensaje);
    }

    private static Long insertRastro(String rastroInsert, long funcion, long usuario) throws Exception {
        Bitacora.trace(Auditor.class, "insertRastro", rastroInsert, funcion, usuario);
        Object[] args;
        // <editor-fold defaultstate="collapsed">
//      Object resultado;
//      ResultSet resultSet = null;
//      Object object;
        // </editor-fold>
        Long id;
        if (TLC.getAgenteSql().connected()) {
            try {
                args = new Object[3];
                // <editor-fold defaultstate="collapsed">
//              args[0] = LongUtils.getNewId();
//              args[1] = Long.valueOf(usuario);
//              args[2] = Long.valueOf(funcion);
//              resultado = TLC.getAgenteSql().executeProcedure(rastroInsert, args, EnumTipoResultadoSQL.SIMPLE);
//              if (resultado != null && resultado instanceof ResultSet) {
//                  resultSet = (ResultSet) resultado;
//                  if (resultSet.next()) {
//                      object = resultSet.getObject(1);
//                      id = LongUtils.toLong(object);
//                  }
//              }
                // </editor-fold>
                id = LongUtils.getNewId();
                args[0] = id;
                args[1] = usuario;
                args[2] = funcion;
                TLC.getAgenteSql().executeProcedure(rastroInsert, args);
                return id;
            } catch (SQLException ex) {
                TLC.getBitacora().error(ex);
            } finally {
//              DB.close(resultSet);
            }
        }
        throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.CHECK_CHANGES_EXCEPTION_0));
    }

    private static boolean updateRastro(String rastroUpdate, Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje) {
        Bitacora.trace(Auditor.class, "updateRastro", rastroUpdate, rastro, condicion, archivo + "," + mensaje);
        Object[] args;
        if (rastro == null || rastro == 0) {
            return true;
        } else if (TLC.getAgenteSql().connected()) {
            try {
                args = new Object[4];
                // <editor-fold defaultstate="collapsed">
//              args[0] = rastro;
//              args[1] = Integer.valueOf(condicion.intValue());
//              args[2] = archivo;
//              args[3] = mensaje;
                // </editor-fold>
                args[0] = rastro;
                args[1] = condicion.intValue();
                args[2] = archivo == null ? EnumTipoDatoSQL.VARCHAR : archivo;
                args[3] = mensaje == null ? EnumTipoDatoSQL.VARCHAR : mensaje;
                TLC.getAgenteSql().executeProcedure(rastroUpdate, args);
                return true;
            } catch (SQLException ex) {
                TLC.getBitacora().error(ex);
            }
        }
        return false;
    }

    public static RastroFuncion getRastroFuncion(AbstractMessage message) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdRastroFuncion(message.getIdRastro());
        rastro.setIdUsuario(message.getUsuario());
        rastro.setIdFuncion(message.getFuncion());
        rastro.setNumeroError(message.getCondicion().intValue());
        rastro.setDescripcionError(message.getMensaje());
        return rastro;
    }
//
    // <editor-fold defaultstate="collapsed">
//  public static RastroInforme getRastroInforme(AbstractMessage message) {
//      RastroInforme rastro = new RastroInforme();
//      rastro.setIdRastroInforme(message.getIdRastro());
//      rastro.setIdUsuario(message.getUsuario());
//      rastro.setIdFuncion(message.getFuncion());
//      rastro.setNumeroCondicionEjeFun(message.getCondicion().intValue());
//      rastro.setNombreArchivo(message.getArchivo());
//      rastro.setDescripcionError(message.getMensaje());
//      return rastro;
//  }
//
//  public static RastroProceso getRastroProceso(AbstractMessage message) {
//      RastroProceso rastro = new RastroProceso();
//      rastro.setIdRastroProceso(message.getIdRastro());
//      rastro.setIdUsuario(message.getUsuario());
//      rastro.setIdFuncion(message.getFuncion());
//      rastro.setNumeroCondicionEjeFun(message.getCondicion().intValue());
//      rastro.setNombreArchivo(message.getArchivo());
//      rastro.setDescripcionError(message.getMensaje());
//      return rastro;
//  }
    // </editor-fold>
}
