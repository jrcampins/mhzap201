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
import com.egt.core.enums.EnumTipoResultadoSQL;
import java.sql.SQLException;
import org.apache.commons.lang.StringUtils;

public class InterpreteSqlSQLServer extends InterpreteSqlAbstracto {

    // <editor-fold defaultstate="collapsed" desc="constantes protegidas">
    private static final String LIKE = " ILIKE ";

    private static final String NOT_LIKE = " NOT ILIKE ";

    @Override
    protected String getLike() {
        return LIKE;
    }

    @Override
    protected String getNotLike() {
        return NOT_LIKE;
    }
    // </editor-fold>

    private static final String COMANDO_SELECT_1 = "SELECT";

    private static final String COMANDO_SELECT_2 = "SELECT TOP";

    /* para funciones que retornan tipos basicos */
    private static final String COMANDO_EXECUTE_1 = "SELECT dbo.";

    /* para funciones que retornan tipos compuestos (records, rows, sets, ...) */
    private static final String COMANDO_EXECUTE_2 = "SELECT dbo.";

    InterpreteSqlSQLServer() {
        Bitacora.stamp(this);
    }

    @Override
    public String getComandoSelect(String comando, int limite) {
        String select = StringUtils.stripToNull(comando);
        if (select != null && limite > 0) {
            boolean b1 = StringUtils.startsWithIgnoreCase(select, COMANDO_SELECT_1);
            boolean b2 = StringUtils.startsWithIgnoreCase(select, COMANDO_SELECT_2);
            if (b1 && !b2) {
                select = StringUtils.replaceOnce(select, COMANDO_SELECT_1, COMANDO_SELECT_2 + " " + limite);
            }
        }
        return select;
    }

    @Override
    public String getComandoExecute(String comando, int argumentos) {
        return this.getComandoExecute(comando, argumentos, EnumTipoResultadoSQL.VOID);
    }

    @Override
    public String getComandoExecute(String comando, int argumentos, EnumTipoResultadoSQL tipoResultado) {
        boolean retornaResultadoCompuesto = EnumTipoResultadoSQL.COMPUESTO.equals(tipoResultado);
        String execute = StringUtils.stripToNull(comando);
        String command = retornaResultadoCompuesto ? COMANDO_EXECUTE_2 : COMANDO_EXECUTE_1;
        if (execute != null) {
            String[] token = StringUtils.split(execute);
            String parametros = "()";
            if (argumentos > 0) {
                parametros = "";
                for (int i = 0; i < argumentos; i++, parametros += ",?") {
                }
                parametros = "(" + parametros.substring(1) + ")";
            }
            if (!token[0].equalsIgnoreCase(COMANDO_EXECUTE_1)) {
                execute = command + " " + execute;
            }
            if (!execute.endsWith(parametros) && !execute.endsWith(";")) {
                execute += parametros;
            }
        }
        Bitacora.trace(execute);
        return execute;
    }

    @Override
    public boolean isCommandIgnoredException(SQLException sqle) {
        boolean is = false;
        if (sqle != null) {
            String token1 = "current transaction is aborted";
            String token2 = "commands ignored until end of transaction block";
            is = sqle.getMessage().contains(token1) && sqle.getMessage().contains(token2);
        }
        return is;
    }

    @Override
    public boolean isNotNullConstraintViolation(SQLException sqle) {
        boolean is = false;
        if (sqle != null) {
            String token1 = "null value in column";
            String token2 = "violates not-null constraint";
            is = sqle.getMessage().contains(token1) && sqle.getMessage().contains(token2);
        }
        return is;
    }

    @Override
    public String getNotNullConstraintViolationColumn(SQLException sqle) {
        String column = null;
        boolean is = this.isNotNullConstraintViolation(sqle);
        if (is) {
            String[] token = sqle.getMessage().split("\"");
            if (token.length > 2) {
                column = token[1];
            }
        }
        return column;
    }

}
