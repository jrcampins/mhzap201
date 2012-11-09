/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

public enum EnumToolKitMessageType {

    GENERAR_BASE(900),
    GENERAR_ENTITY(901),
    GENERAR_FACADE(902),
    GENERAR_URX(911),
    GENERAR_MENU(912),
    GENERAR_BUNDLES(913),
    GENERAR_ENTITY_CONSTANTS(914),
    GENERAR_INFORME(921),
    GENERAR_VISTAS(922),
    GENERAR_MENSAJE(931),
    GENERAR_PROCESO(932),
    GENERAR_PLANTILLA(941),
    GENERAR_APLICACIONES(942),
    GENERAR_APLICACIONES_ESPECIFICAS(943),
    GENERAR_VISTAS_WEB(944),
    GENERAR_APLICACION(991),
    GENERAR_PAGINA(992);

    private final long value;

    EnumToolKitMessageType(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
