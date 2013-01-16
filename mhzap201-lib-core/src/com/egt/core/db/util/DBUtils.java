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

    private static final String[] PREFIJOS = new String[]{"cc_", "tc_", "ck_", "fk_", "pk_", "uk_", "uq_"};

    private static final String SUFIJO = "___";

    private static final String SEPARADORES = "|°¬!\"#$%&/()='?\\¿¡+*~{}[]^<>,;.:- \b\t\n\f\r\u000B";

    /**
     * Busca el nombre del constraint en el mensaje que envia el RDBMS cuando se produce un conflicto
     *
     * @param message Cadena correspondiente al mensaje que envia el RDBMS
     * @param status Entero correspondiente al tipo de conflicto (cualquiera de las constantes ROW_CONFLICT de
     * SyncResolver)
     * @return Si se consigue, el nombre del constraint; de lo contratio retorna null
     */
    public static String getConstraintMessageKey(String message, int status) {
        String trimmed = StringUtils.trimToNull(message);
        if (trimmed != null) {
            String[] tokens = StringUtils.split(trimmed, SEPARADORES);
            if (tokens != null && tokens.length > 0) {
                String key;
                for (int i = 0; i < tokens.length; i++) {
                    key = tokens[i].toLowerCase();
                    if (key.endsWith(SUFIJO) && StringUtils.startsWithAny(key, PREFIJOS)) {
                        if (status == 1 && key.startsWith("fk_")) {
                            key += "_" + status;
                        }
                        return "<" + key + ">";
                    }
                }
            }
        }
        return null;
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
