/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */

package com.egt.core.util;

import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.list.ListOption;
import com.egt.core.aplicacion.TLC;

public class StateTransition {

    private static String cambio_condicion_repetido = Bundle.getString("cambio_condicion_repetido");

    private static String cambio_condicion_invalido = Bundle.getString("cambio_condicion_invalido");

    /*
     * rsrc = resource name
     * curr = current state
     * dest = destination state
     * iisa = invalid initial state arry
     * ssta = self-state transitions allowed
     */
    public static boolean isInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest) {
        return isInvalid(message, rsrc, curr, dest, null);
    }

    public static boolean isInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] iisa) {
        return isInvalid(message, rsrc, curr, dest, iisa, false);
    }

    public static boolean isInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] iisa, boolean ssta) {
        if (!ssta && dest.equals(curr)) { // Self-State Transition
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().error(cambio_condicion_repetido, rsrc, curr.getOptionLabel()));
            return true;
        }
        if (iisa != null && iisa.length > 0) {
            for (ListOption state : iisa) {
                if (state.equals(curr)) {
                    message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                    message.setMensaje(TLC.getBitacora().error(cambio_condicion_invalido, rsrc, curr.getOptionLabel(), dest.getOptionLabel()));
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNotInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest) {
        return !isInvalid(message, rsrc, curr, dest);
    }

    public static boolean isNotInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] iisa) {
        return !isInvalid(message, rsrc, curr, dest, iisa);
    }

    public static boolean isNotInvalid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] iisa, boolean ssta) {
        return !isInvalid(message, rsrc, curr, dest, iisa, ssta);
    }

    /*
     * rsrc = resource name
     * curr = current state
     * dest = destination state
     * visa = valid initial state arry
     * ssta = self-state transitions allowed
     */
    public static boolean isValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest) {
        return isValid(message, rsrc, curr, dest, null);
    }

    public static boolean isValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] visa) {
        return isValid(message, rsrc, curr, dest, visa, false);
    }

    public static boolean isValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] visa, boolean ssta) {
        if (ssta && dest.equals(curr)) {
            return true;
        }
        if (visa != null && visa.length > 0) {
            for (ListOption state : visa) {
                if (state.equals(curr)) {
                    return true;
                }
            }
        }
        if (dest.equals(curr)) { // Self-State Transition
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().error(cambio_condicion_repetido, rsrc, curr.getOptionLabel()));
        } else if (visa != null && visa.length > 0) {
            message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
            message.setMensaje(TLC.getBitacora().error(cambio_condicion_invalido, rsrc, curr.getOptionLabel(), dest.getOptionLabel()));
        } else {
            return true;
        }
        return false;
    }

    public static boolean isNotValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest) {
        return !isValid(message, rsrc, curr, dest);
    }

    public static boolean isNotValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] visa) {
        return !isValid(message, rsrc, curr, dest, visa);
    }

    public static boolean isNotValid(AbstractMessage message, String rsrc, ListOption curr, ListOption dest, ListOption[] visa, boolean ssta) {
        return !isValid(message, rsrc, curr, dest, visa, ssta);
    }

}
