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

public class InterpreteSqlOracle extends InterpreteSqlAbstracto {

    // <editor-fold defaultstate="collapsed" desc="constantes protegidas">
    private static final String LIKE = " LIKE ";

    private static final String NOT_LIKE = " NOT LIKE ";

    @Override
    protected String getLike() {
        return LIKE;
    }

    @Override
    protected String getNotLike() {
        return NOT_LIKE;
    }
    // </editor-fold>

    /* para stored procedures */
    private static final String COMANDO_EXECUTE = "CALL";

    /* para stored procedures */
    private static final String FIN_COMANDO_EXECUTE = "";

    /* para funciones que retornan tipos basicos */
    private static final String COMANDO_EXECUTE_SIMPLE = "CALL";

    /* para funciones que retornan tipos basicos */
    private static final String FIN_COMANDO_EXECUTE_SIMPLE = "INTO ?";

    /* para funciones que retornan tipos compuestos (records, rows, sets, ...) */
    private static final String COMANDO_EXECUTE_COMPUESTO = "SELECT";

    /* para funciones que retornan tipos compuestos (records, rows, sets, ...) */
    private static final String FIN_COMANDO_EXECUTE_COMPUESTO = "";

    InterpreteSqlOracle() {
        Bitacora.stamp(this);
    }

    @Override
    public String getComandoSelect(String comando, int limite) {
        Bitacora.trace(InterpreteSqlOracle.class, "getComandoSelect", comando, limite);
        int i, j, k;
        String select = StringUtils.stripToNull(comando);
        if (select != null && limite > 0) {
            String query = select.toUpperCase();
            String where = " WHERE ";
            String limit = "(ROWNUM <= " + limite + ")";
            i = StringUtils.indexOf(query, where);
            j = i + where.length();
            if (i > 0) {
                select = select.substring(0, j) + limit + " AND " + select.substring(j);
                Bitacora.trace("{0}", select);
            } else {
                String order = " ORDER BY ";
                i = StringUtils.indexOf(query, order);
                if (i > 0) {
                    select = select.substring(0, i) + where + limit + select.substring(i);
                    Bitacora.trace("{0}", select);
                } else {
                    select += where + limit;
                    Bitacora.trace("{0}", select);
                }
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
        String command = StringUtils.stripToNull(comando);
        if (command != null) {
            String prefix;
            String suffix;
            switch (tipoResultado) {
                case COMPUESTO:
                    prefix = COMANDO_EXECUTE_COMPUESTO;
                    suffix = FIN_COMANDO_EXECUTE_COMPUESTO;
                    break;
                case SIMPLE:
                    prefix = COMANDO_EXECUTE_SIMPLE;
                    suffix = FIN_COMANDO_EXECUTE_SIMPLE;
                    break;
                default:
                    prefix = COMANDO_EXECUTE;
                    suffix = FIN_COMANDO_EXECUTE;
                    break;
            }
            if (!StringUtils.startsWithIgnoreCase(command, prefix)) {
                command = prefix + " " + command;
            }
            String parametros = "";
            if (argumentos > 0) {
                for (int i = 0; i < argumentos; i++, parametros += ",?") {
                }
                parametros = "(" + parametros.substring(1) + ")";
            }
            if (!command.endsWith(";")) {
                if (!command.endsWith(parametros)) {
                    command += parametros;
                }
                if (!command.endsWith(suffix)) {
                    command += " " + suffix;
                }
            }
            command = StringUtils.removeEnd(command, ";");
//          command = "{" + command + "}";
        }
        return command;
    }

    @Override
    public String getNombreTabla(String tabla) {
        return StringUtils.upperCase(StringUtils.stripToNull(tabla));
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
