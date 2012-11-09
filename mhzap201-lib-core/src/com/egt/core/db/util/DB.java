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

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.constants.EAC;
import com.egt.core.enums.EnumTipoDatoSQL;
import com.egt.core.enums.EnumTipoResultadoSQL;
import com.egt.core.util.EA;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DB {

    public static Connection connect() {
        Bitacora.trace(DB.class, "connect");
        Connection connection = null;
        if (EA.isLoaded()) {
//          String dataSourceName = EA.getString(EAC.JDBC_DATASOURCE);
//          connection = connect(dataSourceName);
            if (connection == null) {
                String driver = EA.getString(EAC.JDBC_DRIVER);
                String url = EA.getString(EAC.JDBC_URL);
                String user = EA.getString(EAC.JDBC_USER);
                String password = EA.getString(EAC.JDBC_PASSWORD);
                connection = connect(driver, url, user, password);
            }
        }
        return connection;
    }

    public static Connection connect(String[] args) {
        return connect(args[0], args[1], args[2], args[3]);
    }

    public static Connection connect(String driver, String url, String user, String password) {
        Bitacora.trace(DB.class, "connect", driver, url, user);
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (java.lang.ClassNotFoundException ex) {
            Bitacora.logFatal(ex);
        } catch (java.sql.SQLException ex) {
            Bitacora.logFatal(ex);
        }
        Bitacora.stamp(connection, url);
        return connection;
    }

    public static Connection connect(String dataSourceName) {
        return connect(dataSourceName, true);
    }

    public static Connection connect(String dataSourceName, boolean autoCommit) {
        Bitacora.trace(DB.class, "connect", dataSourceName, autoCommit);
        Connection connection = null;
        try {
            DataSource dataSource = (DataSource) InitialContext.doLookup(dataSourceName);
            connection = dataSource.getConnection();
            if (setAutoCommit(connection, autoCommit)) {
                Bitacora.stamp(connection, dataSourceName);
                return connection;
            }
        } catch (NamingException ex) {
            Bitacora.logFatal(ex);
        } catch (SQLException ex) {
            Bitacora.logFatal(ex);
        }
        close(connection);
        return null;
    }

    public static boolean setAutoCommit(Connection connection, boolean autoCommit) {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    if (connection.getAutoCommit() == autoCommit) {
                        Bitacora.trace("autocommit is already " + autoCommit);
                    } else {
                        Bitacora.trace("setting autocommit to " + autoCommit);
                        connection.setAutoCommit(autoCommit);
                    }
                    return true;
                }
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static boolean commit(Connection connection) {
        boolean autoCommit = true; /* evita el rollback si falla el getAutoCommit */
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    autoCommit = connection.getAutoCommit();
                    if (!autoCommit) {
                        connection.commit();
                    }
                    return true;
                }
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
                if (!autoCommit) {
                    rollback(connection);
                }
            }
        }
        return false;
    }

    public static boolean rollback(Connection connection) {
        if (connection != null) {
            try {
                if (!connection.isClosed() && !connection.getAutoCommit()) {
                    connection.rollback();
                }
                return true;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static boolean close(Connection connection) {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    Bitacora.stamp(connection, "*** close ***");
                    connection.close();
                }
                return true;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static boolean close(CallableStatement callableStatement) {
        if (callableStatement != null) {
            try {
                callableStatement.close();
                return true;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static boolean close(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
                return true;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static boolean close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
                return true;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return false;
    }

    public static CallableStatement prepareCall(Connection connection, String sql) {
        return prepareCall(connection, sql);
    }

    public static CallableStatement prepareCall(Connection connection, String sql, Object[] args) {
        return prepareCall(connection, sql, null);
    }

    public static CallableStatement prepareCall(Connection connection, String sql, Object[] args, EnumTipoResultadoSQL resultType, EnumTipoDatoSQL dataType) {
        CallableStatement callableStatement;
        if (connection != null && sql != null) {
            try {
                callableStatement = connection.prepareCall(sql);
                int n = args == null ? 0 : args.length;
                if (n > 0) {
                    for (int i = 0; i < n; i++) {
                        if (args[i] == null) {
//                          callableStatement.setNull(i + 1, java.sql.Types.OTHER);
                            callableStatement.setNull(i + 1, java.sql.Types.NULL);
                        } else if (args[i] instanceof EnumTipoDatoSQL) {
                            EnumTipoDatoSQL tipoDatoSQL = (EnumTipoDatoSQL) args[i];
                            callableStatement.setNull(i + 1, tipoDatoSQL.intValue());
                        } else {
                            callableStatement.setObject(i + 1, args[i]);
                        }
                    }
                }
                if (EnumTipoResultadoSQL.SIMPLE.equals(resultType) && dataType != null) {
                    callableStatement.registerOutParameter(n + 1, dataType.intValue());
                }
                return callableStatement;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return null;
    }

    public static PreparedStatement prepareStatement(Connection connection, String sql) {
        return prepareStatement(connection, sql);
    }

    public static PreparedStatement prepareStatement(Connection connection, String sql, Object[] args) {
        PreparedStatement preparedStatement;
        if (connection != null && sql != null) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                int n = args == null ? 0 : args.length;
                if (n > 0) {
                    for (int i = 0; i < n; i++) {
                        if (args[i] == null) {
//                          callableStatement.setNull(i + 1, java.sql.Types.OTHER);
                            preparedStatement.setNull(i + 1, java.sql.Types.NULL);
                        } else if (args[i] instanceof EnumTipoDatoSQL) {
                            EnumTipoDatoSQL tipoDatoSQL = (EnumTipoDatoSQL) args[i];
                            preparedStatement.setNull(i + 1, tipoDatoSQL.intValue());
                        } else {
                            preparedStatement.setObject(i + 1, args[i]);
                        }
                    }
                }
                return preparedStatement;
            } catch (SQLException ex) {
                Bitacora.logFatal(ex);
            }
        }
        return null;
    }

//  private static Calendar calendar = Calendar.getInstance();
//  
//  private static java.sql.Date getJavaSqlDate(Object arg) {
//      Bitacora.trace("*** getJavaSqlDate ***");
//      calendar.setTime((java.util.Date)arg);
//      return new java.sql.Date(calendar.getTimeInMillis());
//  }
//  
//  private static java.util.Date getJavaUtilDate(Object arg) {
//      Bitacora.trace("*** getJavaUtilDate ***");
//      calendar.setTime((java.util.Date)arg);
//      return new java.util.Date(calendar.getTimeInMillis());
//  }
}
