/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener cursor informacion.
 *
 */
package com.egt.core.db.util;

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import org.apache.commons.lang.StringUtils;

public class InterpreteSqlCachingServiceLocator {

//  private static HashMap dataSourceNames = new HashMap();
    private static HashMap instances = new HashMap();

    public static synchronized InterpreteSql getInstance() {
        Bitacora.trace(InterpreteSqlCachingServiceLocator.class, "getInstance");
        return getInstance(TLC.getConnection());
    }

    private static synchronized InterpreteSql getInstance(Connection connection) {
        Bitacora.trace(InterpreteSqlCachingServiceLocator.class, "getInstance", connection);
        if (connection == null) {
            return null;
        } else {
            try {
                String driver = connection.getMetaData().getDriverName();
                String url = connection.getMetaData().getURL();
//              String user = connection.getMetaData().getUserName();
//              String password = connection.getMetaData().getUserName();
                String version = connection.getMetaData().getDriverVersion();
                return getInstance(driver, url, version);
            } catch (SQLException ex) {
                TLC.getBitacora().fatal(ex);
            }
            return null;
        }
    }

    private static synchronized InterpreteSql getInstance(String driver, String url, String version) {
        Bitacora.trace(InterpreteSqlCachingServiceLocator.class, "getInstance", driver, url, version);
        String d = StringUtils.trimToNull(driver);
        String u = StringUtils.trimToNull(url);
//      String v = StringUtils.trimToNull(version);
        if (d == null || u == null) {
            return null;
        }
        InterpreteSql instance;
        if (instances.containsKey(d)) {
            return (InterpreteSql) instances.get(d);
        } else if (StringUtils.containsIgnoreCase(u, "oracle")) {
            instance = new InterpreteSqlOracle();
        } else if (StringUtils.containsIgnoreCase(u, "postgresql")) {
            instance = new InterpreteSqlPostgreSQL();
        } else if (StringUtils.containsIgnoreCase(u, "sqlserver")) {
            instance = new InterpreteSqlSQLServer();
        } else {
            return null;
        }
        instances.put(d, instance);
        return instance;
    }

}
