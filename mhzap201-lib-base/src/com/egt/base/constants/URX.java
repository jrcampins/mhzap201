/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.base.constants;

class URX { // URI/URL de las paginas de la aplicacion

    public static final String WEB = "/" + EAB.ENTERPRISE_APPLICATION_CODE.toLowerCase() + "-web";

    public static final String AYUDA = "/ayuda.html";

    public static final String REDIRECT = "redirect.html";

    public static final String REJECT = WEB + "/faces/reject.jsp";

    public static final String INICIO = WEB + "/faces/Menu.jsp";

    public static final String FAVORITOS = WEB + "/faces/Favoritos.jsp";

    public static final String CAMBIO_PASSWORD = WEB + "/faces/Password.jsp";

    public static final String FILTRO_FUNCION = WEB + "-filtro/faces/FiltroFuncion1.jsp";

    public static final String FILTRO_FUNCION_DETALLE = WEB + "-filtro/faces/FiltroFuncion2.jsp";

    public static final String FILTRO_FUNCION_PAR = WEB + "-filtro/faces/FiltroFuncionPar1.jsp";

    public static final String FILTRO_FUNCION_PAR_DETALLE = WEB + "-filtro/faces/FiltroFuncionPar2.jsp";

    public static final String FILTRO_FUNCION_PAR_OBJETO = WEB + "-recurso-filtro/faces/Objeto1.jsp";

    public static final String FILTRO_FUNCION_PAR_RECURSO = WEB + "-recurso-filtro/faces/Recurso1.jsp";

    public static final String FILTRO_FUNCION_PAR_RECURSO_ARBOL = WEB + "-recurso-filtro/faces/Recurso3.jsp";

    public static final String RASTRO_FUNCION = WEB + "-rastro/faces/RastroFuncion1.jsp";

    public static final String RASTRO_INFORME = WEB + "-rastro/faces/RastroInforme1.jsp";

    public static final String RASTRO_PROCESO = WEB + "-rastro/faces/RastroProceso1.jsp";

    public static final String LISTA_OBJETOS = WEB + "-recurso/faces/Objeto1.jsp";

    public static final String LISTA_RECURSOS = WEB + "-recurso/faces/Recurso1.jsp";

    public static final String ARBOL_RECURSOS = WEB + "-recurso/faces/Recurso3.jsp";

    public static final String DETALLE_OBJETO = WEB; /* TODO: eliminar al incluir la aplicación web-objeto */

}
