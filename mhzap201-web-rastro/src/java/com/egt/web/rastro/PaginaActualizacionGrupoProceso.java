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
package com.egt.web.rastro;

import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;

public interface PaginaActualizacionGrupoProceso extends PaginaActualizacion {

    TextField getCampoIdGrupoProceso1();

    TextField getCampoCodigoGrupoProceso1();

    TextField getCampoNombreGrupoProceso1();

    TextArea getCampoDescripcionGrupoProceso1();

    TextField getCampoIdRastroProceso1();

    DropDown getListaNumeroCondicionEjeFun1();

    Button getBotonAplicar1();

    GrupoProcesoCachedRowSetDataProvider2 getGrupoProcesoDataProvider();

    Object getGrupoProcesoBusinessProcess();

    Object getMessenger();
}