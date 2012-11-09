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

import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.aplicacion.CriterioBusqueda;
import com.egt.core.aplicacion.CriterioOrden;
import com.egt.core.enums.EnumCriterioOrden;
import com.egt.core.util.STP;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;

public abstract class InterpreteSqlAbstracto implements InterpreteSql {

    private static final String IS_NULL = " IS NULL ";

    private static final String IS_NOT_NULL = " IS NOT NULL ";

    private static final String EQ = " = ";

    private static final String NEQ = " <> ";

    private static final String GT = " > ";

    private static final String LTEQ = " <= ";

    private static final String GTEQ = " >= ";

    private static final String LT = " < ";

    private static final String LIKE = " LIKE ";

    private static final String NOT_LIKE = " NOT LIKE ";

    private static final String LIKE_SINGLE = "_";

    private static final String LIKE_STRING = "%";

    private static final String IN = " IN ";

    private static final String NOT_IN = " NOT IN ";

    private static final String IS_NULL_OR = " IS NULL OR ";

    private static final String EXISTS = " EXISTS ";

    private static final String NOT_EXISTS = " NOT EXISTS ";

    private static final String ASCENDING = "ASC";

    private static final String DESCENDING = "DESC";

    protected String getIsNull() {
        return IS_NULL;
    }

    protected String getIsNotNull() {
        return IS_NOT_NULL;
    }

    protected String getEQ() {
        return EQ;
    }

    protected String getNEQ() {
        return NEQ;
    }

    protected String getGT() {
        return GT;
    }

    protected String getLTEQ() {
        return LTEQ;
    }

    protected String getGTEQ() {
        return GTEQ;
    }

    protected String getLT() {
        return LT;
    }

    protected String getLike() {
        return LIKE;
    }

    protected String getNotLike() {
        return NOT_LIKE;
    }

    @Override
    public String getLikeSingle() {
        return LIKE_SINGLE;
    }

    @Override
    public String getLikeString() {
        return LIKE_STRING;
    }

    protected String getIn() {
        return IN;
    }

    protected String getNotIn() {
        return NOT_IN;
    }

    protected String getIsNullOr() {
        return IS_NULL_OR;
    }

    protected String getExists() {
        return EXISTS;
    }

    protected String getNotExists() {
        return NOT_EXISTS;
    }

    protected String getAscending() {
        return ASCENDING;
    }

    protected String getDescending() {
        return DESCENDING;
    }

    @Override
    public String getString(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof String) {
            return obj.toString();
        } else if (obj instanceof Integer) {
            return obj.toString();
        } else if (obj instanceof Long) {
            return obj.toString();
        } else if (obj instanceof BigInteger) {
            return obj.toString();
        } else if (obj instanceof BigDecimal) {
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else if (obj instanceof Date) {
            return new DateTime(obj).toString("yyyy-MM-dd");
        } else if (obj instanceof Time) {
            return new DateTime(obj).toString("HH:mm:ss");
        } else if (obj instanceof Timestamp || obj instanceof java.util.Date) {
            return new DateTime(obj).toString("yyyy-MM-dd HH:mm:ss");
        } else {
            return STP.getStringSql(obj);
        }
    }

    @Override
    public String getStringDelimitado(Object obj) {
        String string = getString(obj);
        if (string == null) {
            return null;
        } else if (obj instanceof String) {
            return "'" + string + "'";
        } else if (obj instanceof Date) {
            return "'" + string + "'";
        } else if (obj instanceof Time) {
            return "'" + string + "'";
        } else if (obj instanceof Timestamp || obj instanceof java.util.Date) {
            return "'" + string + "'";
        } else {
            return STP.getStringSqlDelimitado(obj);
        }
    }

    @Override
    public String getStringCriterioBusqueda(CriterioBusqueda criterio) {
        EnumOperadorCom comparacion = criterio.getComparacion();
        if (comparacion == null) {
            return null;
        }
        String string = null;
//      String columna = StringUtils.trimToNull(criterio.getColumna(dominio));
        String columna = StringUtils.trimToNull(criterio.getColumna());
        Object valor = criterio.getValor();
        if (columna == null) {
            if (valor != null && valor instanceof String) {
                String expresion = (String) valor;
                switch (comparacion) {
                    case EXISTE:
                        string = getExists() + "(" + expresion + ")";
                        break;
                    case NO_EXISTE:
                        string = getNotExists() + "(" + expresion + ")";
                        break;
                }
            }
            return string == null ? null : "(" + string.trim() + ")";
        }
        if (valor == null) {
            switch (comparacion) {
                case ES_NULO:
                    string = columna + getIsNull();
                    break;
                case NO_ES_NULO:
                    string = columna + getIsNotNull();
                    break;
            }
            return string == null ? null : "(" + string.trim() + ")";
        }
        switch (comparacion) {
            case ES_NULO:
                string = columna + getIsNull();
                break;
            case NO_ES_NULO:
                string = columna + getIsNotNull();
                break;
            case ES_IGUAL:
                string = columna + getEQ() + getStringDelimitado(valor);
                break;
            case NO_ES_IGUAL:
                string = columna + getNEQ() + getStringDelimitado(valor);
                break;
            case ES_MAYOR:
                string = columna + getGT() + getStringDelimitado(valor);
                break;
            case ES_MENOR_O_IGUAL:
                string = columna + getLTEQ() + getStringDelimitado(valor);
                break;
            case ES_MAYOR_O_IGUAL:
                string = columna + getGTEQ() + getStringDelimitado(valor);
                break;
            case ES_MENOR:
                string = columna + getLT() + getStringDelimitado(valor);
                break;
            case COMIENZA_POR:
                string = columna + getLike() + getStringDelimitado(getString(valor) + getLikeString());
                break;
            case NO_COMIENZA_POR:
                string = columna + getNotLike() + getStringDelimitado(getString(valor) + getLikeString());
                break;
            case CONTIENE:
                string = columna + getLike() + getStringDelimitado(getLikeString() + getString(valor) + getLikeString());
                break;
            case NO_CONTIENE:
                string = columna + getNotLike() + getStringDelimitado(getLikeString() + getString(valor) + getLikeString());
                break;
            case TERMINA_EN:
                string = columna + getLike() + getStringDelimitado(getLikeString() + getString(valor));
                break;
            case NO_TERMINA_EN:
                string = columna + getNotLike() + getStringDelimitado(getLikeString() + getString(valor));
                break;
            case ESTA_ENTRE:
                string = columna + getIn() + "(" + getString(valor) + ")";
                break;
            case NO_ESTA_ENTRE:
                string = columna + getNotIn() + "(" + getString(valor) + ")";
                break;
            case ES_NULO_O_ES_IGUAL:
                string = columna + getIsNullOr() + columna + getEQ() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_NO_ES_IGUAL:
                string = columna + getIsNullOr() + columna + getNEQ() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_ES_MAYOR:
                string = columna + getIsNullOr() + columna + getGT() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_ES_MENOR_O_IGUAL:
                string = columna + getIsNullOr() + columna + getLTEQ() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_ES_MAYOR_O_IGUAL:
                string = columna + getIsNullOr() + columna + getGTEQ() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_ES_MENOR:
                string = columna + getIsNullOr() + columna + getLT() + getStringDelimitado(valor);
                break;
            case ES_NULO_O_COMIENZA_POR:
                string = columna + getIsNullOr() + columna + getLike() + getStringDelimitado(getString(valor) + getLikeString());
                break;
            case ES_NULO_O_NO_COMIENZA_POR:
                string = columna + getIsNullOr() + columna + getNotLike() + getStringDelimitado(getString(valor) + getLikeString());
                break;
            case ES_NULO_O_CONTIENE:
                string = columna + getIsNullOr() + columna + getLike() + getStringDelimitado(getLikeString() + getString(valor) + getLikeString());
                break;
            case ES_NULO_O_NO_CONTIENE:
                string = columna + getIsNullOr() + columna + getNotLike() + getStringDelimitado(getLikeString() + getString(valor) + getLikeString());
                break;
            case ES_NULO_O_TERMINA_EN:
                string = columna + getIsNullOr() + columna + getLike() + getStringDelimitado(getLikeString() + getString(valor));
                break;
            case ES_NULO_O_NO_TERMINA_EN:
                string = columna + getIsNullOr() + columna + getNotLike() + getStringDelimitado(getLikeString() + getString(valor));
                break;
            case ES_NULO_O_ESTA_ENTRE:
                string = columna + getIsNullOr() + columna + getIn() + "(" + getString(valor) + ")";
                break;
            case ES_NULO_O_NO_ESTA_ENTRE:
                string = columna + getIsNullOr() + columna + getNotIn() + "(" + getString(valor) + ")";
                break;
        }
        return StringUtils.isBlank(string) ? null : "(" + string.trim() + ")";
    }

    @Override
    public String getStringCriterioOrden(CriterioOrden criterio) {
        String columna = StringUtils.trimToNull(criterio.getColumna());
        if (columna == null) {
            return null;
        }
        if (EnumCriterioOrden.ORDEN_DESCENDENTE.equals(criterio.getOrden())) {
            return columna + " " + getDescending();
        } else {
//          return columna + " " + getAscending();
            return columna;
        }
    }

    @Override
    public String getComandoSelect(String comando) {
        return StringUtils.stripToNull(comando);
    }

    @Override
    public String getNombreTabla(String tabla) {
        return StringUtils.stripToNull(tabla);
    }

}
