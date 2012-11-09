/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.core.sqlagent;

import com.egt.base.constants.CBM2;
import com.egt.base.constants.EAB;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.SqlAgentMessage;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.db.util.SqlAgent;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.egt.ejb.core.jms.UtilityProcessMessengerLocal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.ObjectMessage;
import org.apache.commons.lang.StringUtils;

@Stateless
public class SqlAgentBrokerBean implements SqlAgentBrokerLocal {

    @Resource(name = EAB.ENTERPRISE_APPLICATION_JDBC_DATABASE, mappedName = EAB.ENTERPRISE_APPLICATION_JNDI_DATABASE)
    private javax.sql.DataSource ds;

    @EJB
    private UtilityProcessMessengerLocal messenger;

    @Override
    public boolean connected() throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().connected();
    }

    @Override
    public boolean isStoredProcedure(String sql) throws SQLException {
//      Bitacora.trace(this.getClass(), "isStoredProcedure", sql);
//      String spn = BundleProcedimientos.getString(sql);
//      return StringUtils.isNotBlank(spn) && StringUtils.isNumeric(spn);
        TLC.getConnection(ds);
        return TLC.getAgenteSql().isStoredProcedure(sql);
    }

    @Override
    public Object executeProcedure(String sql) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeProcedure(sql);
    }

    @Override
    public Object executeProcedure(String sql, Object[] args) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeProcedure(sql, args);
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeQuery(sql);
    }

    @Override
    public ResultSet executeQuery(String sql, int limite) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeQuery(sql, limite);
    }

    @Override
    public ResultSet executeQuery(String sql, Object[] args) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeQuery(sql, args);
    }

    @Override
    public ResultSet executeQuery(String sql, int limite, Object[] args) throws SQLException {
        TLC.getConnection(ds);
        return TLC.getAgenteSql().executeQuery(sql, limite, args);
    }

    @Override
    public ObjectMessage executeProcedure(String procedimiento, long funcion) {
        return executeProcedure(procedimiento, funcion, null);
    }

    @Override
    public ObjectMessage executeProcedure(String procedimiento, long funcion, Object[] args) {
        Bitacora.trace(this.getClass(), "executeProcedure", procedimiento, String.valueOf(funcion));
        Utils.traceObjectArray(args);
        Long rastro = null;
        ObjectMessage reply = null;
        try {
            procedimiento = StringUtils.trimToEmpty(procedimiento);
            if (STP.esIdentificadorArchivoValido(procedimiento)) {
                if (TLC.getControlador().esFuncionAutorizada(funcion)) {
                    TLC.getConnection(ds);
                    rastro = TLC.getControlador().ponerProcesoPendiente(funcion);
                    SqlAgentMessage message = new SqlAgentMessage(procedimiento, funcion);
                    TLC.getControlador().ponerUsuarioEnMensaje(message);
                    message.setRastro(rastro);
                    message.setMensaje(Bitacora.getTextoMensaje(CBM2.PROCESS_EXECUTION_REQUEST, procedimiento));
                    message.setArgs(args);
                    reply = messenger.send(message);
                    TLC.getBitacora().info(message.getMensaje());
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
        return reply;
    }

    @Override
    public SqlAgentMessage processSqlAgentMessage(SqlAgentMessage message) {
        return SqlAgent.executeProcedure(message);
    }

}
