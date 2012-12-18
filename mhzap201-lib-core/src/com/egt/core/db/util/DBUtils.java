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

import com.egt.core.constants.DBC;
import javax.sql.rowset.spi.SyncResolver;
import org.apache.commons.lang.StringUtils;

public class DBUtils {

    private static final String SUFIJO = "_zy"; // _egt_com_ve

    /**
     * Busca el nombre del constraint en el mensaje que envia el RDBMS cuando se produce un conflicto
     *
     * @param message Cadena correspondiente al mensaje que envia el RDBMS
     * @param status Entero correspondiente al tipo de conflicto (cualquiera de las constantes ROW_CONFLICT de
     * SyncResolver)
     * @return Si se consigue, el nombre del constraint; de lo contratio retorna null
     */
    public static String getConstraintMessageKey(String message, int status) {
        String value = null;
        if (!StringUtils.isEmpty(StringUtils.trimToNull(message))) {
            int i;
            int j = StringUtils.indexOfIgnoreCase(message, SUFIJO);
            if (j != -1) {
                String c = StringUtils.substring(message, j, j + 1);
                for (i = j; i >= 0 && (StringUtils.isAlphanumeric(c) || c.equalsIgnoreCase("_")); i--, c = StringUtils.substring(message, i, i + 1)) {
                }
                value = StringUtils.substring(message, i + 1, j + SUFIJO.length());
                if (StringUtils.substring(value, 0, 2).equalsIgnoreCase("fk") && status == 1) {
                    value = value + "_" + status;
                }
                value = "<" + value.toLowerCase() + ">";
            }
        }
        return value;
    }

    public static String getTransactionLabel(int status) {
        String value;
        switch (status) {
            case SyncResolver.INSERT_ROW_CONFLICT:
                value = DBC.COMANDO_INSERT;
                break;
            case SyncResolver.UPDATE_ROW_CONFLICT:
                value = DBC.COMANDO_UPDATE;
                break;
            case SyncResolver.DELETE_ROW_CONFLICT:
                value = DBC.COMANDO_DELETE;
                break;
            default:
                value = DBC.COMANDO_COMMIT;
                break;
        }
        return value;
    }

}
