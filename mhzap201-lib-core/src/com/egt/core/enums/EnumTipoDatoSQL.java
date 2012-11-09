/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.enums;

import java.sql.Types;

public enum EnumTipoDatoSQL {

    BOOLEAN(Types.BOOLEAN),
    CHAR(Types.CHAR),
    VARCHAR(Types.VARCHAR),
    INTEGER(Types.INTEGER),
    BIGINT(Types.BIGINT),
    DECIMAL(Types.DECIMAL),
    NUMERIC(Types.NUMERIC),
    DATE(Types.DATE),
    TIME(Types.TIME),
    TIMESTAMP(Types.TIMESTAMP),
    OTHER(Types.OTHER);

    public static EnumTipoDatoSQL valueOf(int i) {
        switch (i) {
            case Types.BOOLEAN:
                return BOOLEAN;
            case Types.CHAR:
                return CHAR;
            case Types.VARCHAR:
                return VARCHAR;
            case Types.INTEGER:
                return INTEGER;
            case Types.BIGINT:
                return BIGINT;
            case Types.DECIMAL:
                return DECIMAL;
            case Types.NUMERIC:
                return NUMERIC;
            case Types.DATE:
                return DATE;
            case Types.TIME:
                return TIME;
            case Types.TIMESTAMP:
                return TIMESTAMP;
            default:
                return OTHER;
        }
    }

    private final int value;

    EnumTipoDatoSQL(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

}
