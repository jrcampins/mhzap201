/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.enums;

import com.egt.base.util.BundleEnums;
import com.egt.commons.list.ListOption;
import com.egt.commons.util.IntUtils;

public enum EnumTipoPagina implements ListOption {

    TABLA(1, "tipo_pagina_tabla"),
    DETALLE(2, "tipo_pagina_detalle"),
    ARBOL(3, "tipo_pagina_arbol"),
    COMANDO(4, "tipo_pagina_comando"),
    CONSULTA_TABLA(5, "tipo_pagina_consulta_tabla"),
    CONSULTA_DETALLE(6, "tipo_pagina_consulta_detalle"),
    CONSULTA_ARBOL(7, "tipo_pagina_consulta_arbol");

    public static EnumTipoPagina valueOf(int i) {
        switch (i) {
            case 1:
                return TABLA;
            case 2:
                return DETALLE;
            case 3:
                return ARBOL;
            case 4:
                return COMANDO;
            case 5:
                return CONSULTA_TABLA;
            case 6:
                return CONSULTA_DETALLE;
            case 7:
                return CONSULTA_ARBOL;
            default:
                return null;
        }
    }

    public static EnumTipoPagina valueOf(Integer i) {
        return valueOf(IntUtils.valueOf(i));
    }

    public static EnumTipoPagina valueOf(Long l) {
        return valueOf(IntUtils.valueOf(l));
    }

    private final int value;

    private final String label;

    EnumTipoPagina(int value, String label) {
        this.value = value;
        this.label = BundleEnums.getString(label);
    }

    public int intValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public Object getOptionValue() {
        return Integer.valueOf(value);
    }

    @Override
    public String getOptionLabel() {
        return getLabel();
    }

    @Override
    public String getOptionDescription() {
        return null;
    }

    @Override
    public boolean isOptionDisabled() {
        return false;
    }
}
