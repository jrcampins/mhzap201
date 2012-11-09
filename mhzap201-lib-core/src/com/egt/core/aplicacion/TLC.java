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

import com.egt.core.control.Controlador;
import com.egt.core.db.util.AgenteSql;
import com.egt.core.db.util.DB;
import com.egt.core.db.util.InterpreteSql;
import com.egt.core.db.util.InterpreteSqlCachingServiceLocator;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class TLC {

    private static final ThreadLocal _agenteSql = new ThreadLocal();

    private static final ThreadLocal _bitacora = new ThreadLocal();

    private static final ThreadLocal _connection = new ThreadLocal();

    private static final ThreadLocal _controlador = new ThreadLocal();

    private static final ThreadLocal _interpreteSql = new ThreadLocal();

    public static void iniciar() {
        Bitacora.trace(TLC.class, "iniciar");
    }

    public static void destruir() {
        Bitacora.trace(TLC.class, "destruir");
        removeControlador(); /* TLC.getBitacora(), TLC.getAgenteSql() */
        removeAgenteSql(); /* TLC.getBitacora(), TLC.getConnection(), TLC.getInterpreteSql() */
        removeInterpreteSql(); /* TLC.getConnection() */
        removeConnection();
        removeBitacora();
    }

    public static AgenteSql getAgenteSql() {
        if (_agenteSql.get() == null) {
            setAgenteSql(new AgenteSql());
        }
        return (AgenteSql) _agenteSql.get();
    }

    public static void setAgenteSql(AgenteSql agenteSql) {
        _agenteSql.set(agenteSql);
    }

    public static void removeAgenteSql() {
        Bitacora.trace(TLC.class, "removeAgenteSql");
        if (_agenteSql.get() != null) {
            ((AgenteSql) _agenteSql.get()).close();
        }
        _agenteSql.remove();
    }

    public static Bitacora getBitacora() {
        if (_bitacora.get() == null) {
            setBitacora(new Bitacora());
        }
        return (Bitacora) _bitacora.get();
    }

    public static void setBitacora(Bitacora bitacora) {
        _bitacora.set(bitacora);
    }

    public static void removeBitacora() {
        Bitacora.trace(TLC.class, "removeBitacora");
        if (_bitacora.get() != null) {
            ((Bitacora) _bitacora.get()).clear();
        }
        _bitacora.remove();
    }

    public static Connection getConnection() {
        Bitacora.trace(TLC.class, "getConnection");
        if (badConnection()) {
            setConnection(DB.connect());
        } else {
            Bitacora.trace(TLC.class, "getConnection", _connection.get());
        }
        return (Connection) _connection.get();
    }

    public static Connection getConnection(DataSource ds) throws SQLException {
        Bitacora.trace(TLC.class, "getConnection", ds);
        if (badConnection()) {
//          setConnection(ds.getConnection());
            setConnection(DB.connect());
        } else {
            Bitacora.trace(TLC.class, "getConnection", _connection.get());
        }
        return (Connection) _connection.get();
    }

    public static void setConnection(Connection connection) {
        Bitacora.trace(TLC.class, "setConnection", connection);
        _connection.set(connection);
    }

    public static void removeConnection() {
        Bitacora.trace(TLC.class, "removeConnection");
        if (badConnection()) {
        } else {
            DB.close((Connection) _connection.get());
        }
        _connection.remove();
    }

    private static boolean badConnection() {
        if (_connection.get() instanceof Connection) {
            try {
                Connection c = (Connection) _connection.get();
                boolean b = c.isClosed();
                if (b) {
                    Bitacora.trace(TLC.class, "badConnection", c);
                }
                return b;
            } catch (SQLException ex) {
                Bitacora.logError(ex);
                return true;
            }
        }
        return true;
    }

    public static Controlador getControlador() {
        if (_controlador.get() == null) {
            setControlador(new Controlador());
        }
        return (Controlador) _controlador.get();
    }

    public static void setControlador(Controlador controlador) {
        _controlador.set(controlador);
    }

    public static void removeControlador() {
        Bitacora.trace(TLC.class, "removeControlador");
        if (_controlador.get() != null) {
            ((Controlador) _controlador.get()).close();
        }
        _controlador.remove();
    }

    public static InterpreteSql getInterpreteSql() {
        if (_interpreteSql.get() == null) {
            setInterpreteSql(InterpreteSqlCachingServiceLocator.getInstance());
        }
        return (InterpreteSql) _interpreteSql.get();
    }

    public static void setInterpreteSql(InterpreteSql interpreteSql) {
        _interpreteSql.set(interpreteSql);
    }

    public static void removeInterpreteSql() {
        Bitacora.trace(TLC.class, "removeInterpreteSql");
        _interpreteSql.remove();
    }

}
