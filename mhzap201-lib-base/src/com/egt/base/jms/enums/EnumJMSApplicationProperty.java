/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.base.jms.enums;

import com.egt.commons.util.BitUtils;

public enum EnumJMSApplicationProperty {
    /* Any name that does not begin with 'JMS' is an application-specific property name */

    RECEIVE_REPLY_TIMEOUT("7000"),
    SEND_REQUEST_TIME_TO_LIVE("3000");

    private final String value;

    EnumJMSApplicationProperty(String value) {
        this.value = value;
    }

    public boolean getBooleanValue() {
        return BitUtils.valueOf(value);
    }

    public int getIntValue() {
        return Integer.valueOf(value);
    }

    public long getLongValue() {
        return Long.valueOf(value);
    }

    public String getStringValue() {
        return value;
    }
}
