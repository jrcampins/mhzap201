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

import com.egt.base.jms.messages.SqlAgentMessage;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.Local;
import javax.jms.ObjectMessage;

@Local
public interface SqlAgentBrokerLocal {

    public boolean connected() throws SQLException;

    public boolean isStoredProcedure(String sql) throws SQLException;

    public Object executeProcedure(String sql) throws SQLException;

    public Object executeProcedure(String sql, Object[] args) throws SQLException;

    public ResultSet executeQuery(String sql) throws SQLException;

    public ResultSet executeQuery(String sql, int limite) throws SQLException;

    public ResultSet executeQuery(String sql, Object[] args) throws SQLException;

    public ResultSet executeQuery(String sql, int limite, Object[] args) throws SQLException;

    public ObjectMessage executeProcedure(String procedimiento, long funcion);

    public ObjectMessage executeProcedure(String procedimiento, long funcion, Object[] args);

    public SqlAgentMessage processSqlAgentMessage(SqlAgentMessage message);

}
