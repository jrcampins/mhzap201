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

import com.egt.base.util.BundleProcedimientos;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.enums.EnumTipoDatoSQL;
import com.egt.core.enums.EnumTipoResultadoSQL;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.lang.StringUtils;

public class AgenteSql {

//  private static final String DEFAULT_NUMBER_KW = "DEFAULT";
//
    private static final String CHECK_PROCEDURE = "check_procedure";

    private boolean establishedConnection = false;

    private Connection connection = null;

    private CallableStatement callableStatement = null;

    private PreparedStatement preparedStatement = null;

    public AgenteSql() {
        Bitacora.stamp(this);
        connect(TLC.getConnection());
    }

    private void connect(Connection connection) {
        if (connection == null) {
            this.establishedConnection = false;
            this.connection = null;
        } else {
            this.establishedConnection = true;
            this.connection = connection;
        }
    }

    /**
     * Getter para propiedad establishedConnection.
     *
     * @return Valor de la propiedad establishedConnection.
     */
    public boolean connected() {
        return establishedConnection;
    }

    /**
     * Setter para propiedad autoCommit.
     *
     * @param autoCommit Nuevo valor de la propiedad autoCommit.
     */
    public boolean setAutoCommit(boolean autoCommit) {
        Bitacora.trace(getClass(), "setAutoCommit", String.valueOf(autoCommit));
        return DB.setAutoCommit(connection, autoCommit);
    }

    public boolean runScript(String script) throws SQLException {
        Bitacora.trace(getClass(), "runScript");
        String BOS = "/* EXEC SQL */";
        String EOS = "/* END EXEC */";
        String EOL = "\\r\\n"; /* "[\\t\\n\\x0B\\f\\r]" */
        String DLM = "$$";
        String regex1 = BOS.replace("*", "[*]") + EOL;
        String regex2 = EOL + EOS.replace("*", "[*]");
        String regex3 = DLM.replace("$", "[$]");
        boolean ok = true;
        if (StringUtils.isNotBlank(script)) {
            String[] token1 = script.split(regex1);
            if (token1 != null && token1.length > 0) {
                for (int i = 0; ok && i < token1.length; i++) {
                    if (StringUtils.isNotBlank(token1[i])) {
                        int j = token1[i].indexOf(EOS);
                        if (j > 0) {
                            String[] token2 = token1[i].split(regex2);
                            if (token2 != null && token2.length > 0 && StringUtils.isNotBlank(token2[0])) {
                                String sql = token2[0];
                                int k = sql.indexOf(DLM);
                                if (k > 0) {
                                    sql = getQuotedStatement(sql, regex3);
                                }
                                Object obj = execute(sql);
                                ok = obj == null ? false : true;
                                if (ok && obj instanceof Integer) {
                                    Bitacora.trace("***");
                                    Bitacora.trace("*** comando [" + i + "] = " + (Integer) obj);
                                    Bitacora.trace("***");
                                }
                                Bitacora.trace(STP.getString(500, '-'));
                            }
                        }
                    }
                }
            }
        }
        return ok;
    }

    private String getQuotedStatement(String sql, String regex) {
        if (StringUtils.isBlank(sql) || StringUtils.isBlank(regex)) {
            return null;
        }
        String qstmt = sql;
        String[] token = sql.split(regex);
        if (token != null && token.length > 0) {
            qstmt = "";
            for (int i = 0; i < token.length; i++) {
                if (i % 2 == 0) {
                    qstmt += token[i];
                } else {
                    qstmt += "'" + token[i].replace("'", "''") + "'";
                }
            }
        }
        return qstmt;
    }

    private Object execute(String sql) throws SQLException {
        return execute(sql, null);
    }

    private Object execute(String sql, Object[] args) throws SQLException {
        return execute(sql, args, null, null);
    }

    private Object execute(String sql, Object[] args, EnumTipoResultadoSQL resultType, EnumTipoDatoSQL dataType) throws SQLException {
        Bitacora.trace(getClass(), "execute", sql, args == null ? 0 : args.length, resultType, dataType);
        Utils.traceObjectArray(args);
        try {
            InterpreteSql interpreteSql = TLC.getInterpreteSql();
            if (interpreteSql instanceof InterpreteSqlOracle) {
                DB.close(callableStatement);
                callableStatement = DB.prepareCall(connection, sql, args, resultType, dataType);
                if (callableStatement.execute()) {
                    return callableStatement.getResultSet();
                } else if (EnumTipoResultadoSQL.SIMPLE.equals(resultType)) {
                    int n = args == null ? 0 : args.length;
                    return callableStatement.getObject(n + 1);
                } else {
                    return callableStatement.getUpdateCount();
                }
            } else {
                DB.close(preparedStatement);
                preparedStatement = DB.prepareStatement(connection, sql, args);
                if (preparedStatement.execute()) {
                    return preparedStatement.getResultSet();
                } else {
                    return preparedStatement.getUpdateCount();
                }
            }
        } catch (SQLException ex) {
            Bitacora.logFatal(ThrowableUtils.getString(ex));
            DB.rollback(connection);
            throw ex;
        }
    }

    public boolean isStoredProcedure(String sql) throws SQLException {
        Bitacora.trace(getClass(), "isStoredProcedure", sql);
        Object resultado;
        ResultSet resultSet;
        Object object;
        boolean is = false;
        if (sql != null) {
            String procedureName = BundleProcedimientos.getProcedureName(sql);
            Object[] args = new Object[]{procedureName};
            resultado = executeProcedure(CHECK_PROCEDURE, args);
            if (resultado instanceof ResultSet) {
                resultSet = (ResultSet) resultado;
                if (resultSet.next()) {
                    object = resultSet.getObject(1);
                    is = BitUtils.valueOf(object);
                }
            } else if (resultado instanceof Number) {
                is = BitUtils.valueOf(resultado);
            }
            Bitacora.trace(procedureName + " " + is);
        }
        return is;
    }

    public Object executeProcedure(String sql) throws SQLException {
        return executeProcedure(sql, null);
    }

    public Object executeProcedure(String sql, Object[] args) throws SQLException {
        String string;
        string = BundleProcedimientos.getProcedureType(sql);
        EnumTipoResultadoSQL resultType;
        try {
            resultType = EnumTipoResultadoSQL.valueOf(string);
        } catch (Exception ex) {
            resultType = EnumTipoResultadoSQL.SIMPLE;
        }
        string = BundleProcedimientos.getDataType(sql);
        EnumTipoDatoSQL dataType;
        try {
            dataType = EnumTipoDatoSQL.valueOf(string);
        } catch (Exception ex) {
            dataType = EnumTipoDatoSQL.BIGINT;
        }
        return executeProcedure(sql, args, resultType, dataType);
    }

    public Object executeProcedure(String sql, Object[] args, EnumTipoResultadoSQL resultType, EnumTipoDatoSQL dataType) throws SQLException {
        Bitacora.trace(getClass(), "executeProcedure", sql, "resultType=" + resultType);
        String procedureName = BundleProcedimientos.getProcedureName(sql);
        int argumentos = args == null ? 0 : args.length;
        String comando = TLC.getInterpreteSql().getComandoExecute(procedureName, argumentos, resultType);
        return execute(comando, args, resultType, dataType);
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        return executeQuery(sql, 0, null);
    }

    public ResultSet executeQuery(String sql, int limite) throws SQLException {
        return executeQuery(sql, limite, null);
    }

    public ResultSet executeQuery(String sql, Object[] args) throws SQLException {
        return executeQuery(sql, 0, args);
    }

    public ResultSet executeQuery(String sql, int limite, Object[] args) throws SQLException {
        Bitacora.trace(getClass(), "executeQuery", sql, "limite=" + limite, "args=" + (args == null ? 0 : args.length));
        Utils.traceObjectArray(args);
        try {
            String comando = TLC.getInterpreteSql().getComandoSelect(sql, limite);
            DB.close(preparedStatement);
            preparedStatement = DB.prepareStatement(connection, comando, args);
            return preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Bitacora.logFatal(ThrowableUtils.getString(ex));
            DB.rollback(connection);
            throw ex;
        }
    }

    public boolean commit() {
        Bitacora.trace(getClass(), "commit");
        return DB.commit(connection);
    }

    public boolean rollback() {
        Bitacora.trace(getClass(), "rollback");
        return DB.rollback(connection);
    }

    public void close() {
        Bitacora.trace(getClass(), "close");
        DB.close(callableStatement);
        DB.close(preparedStatement);
    }

}
