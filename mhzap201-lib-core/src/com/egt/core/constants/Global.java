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
package com.egt.core.constants;

import com.egt.base.constants.EAB;

public class Global {

    public static final String DEFAULT_WINDOW_NAME = EAB.ENTERPRISE_APPLICATION_CODE.toLowerCase();

    public static final String HELP_WINDOW_NAME = "ayuda";

    public static final String PARAMETRO_RECURSION = "OpenPostBack";

    public static final String PARAMETRO_RETRUCAR = "FakePostBack";

    public static final String PARAMETRO_RETRUQUE = "javax.faces.ViewState";

    public static final String PARAMETRO_FRAMEWORK_SESION = "SessionFrame";

    public static final String PARAMETRO_TIMESTAMP_SESION = "SessionStamp";

    public static final String PARAMETRO_CONDICION_SESION = "SessionState";

    public static final String PREFIJO_ENLACE_URL_HTTP = "#";

    public static final String PREFIJO_ETIQUETA_ID_RECURSO = "#";

    public static final String PREFIJO_STRING_ID_RECURSO = "#";

    public static final Integer SESION_REINICIADA = 0;

    public static final Integer SESION_RESTAURADA = 1;
}
