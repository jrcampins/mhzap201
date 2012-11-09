/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.basica;

import com.egt.data.general.xdp3.OpcionMenuCachedRowSetDataProvider3;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionOpcionMenu extends PaginaActualizacion {

    TextField getCampoIdOpcionMenu1();

    TextField getCampoCodigoOpcionMenu1();

    TextField getCampoNombreOpcionMenu1();

    TextArea getCampoDescripcionOpcionMenu1();

    TextArea getCampoUrlOpcionMenu1();

    TextField getCampoIdAplicacion1();

    TextField getCampoIdPagina1();

    TextField getCampoIdOpcionMenuSuperior1();

    DropDown getListaEsOpcionMenuInactiva1();

    DropDown getListaEsOpcionMenuSincronizada1();

    Button getBotonAplicar1();

    OpcionMenuCachedRowSetDataProvider3 getOpcionMenuDataProvider();

    AplicacionCachedRowSetDataProvider2 getAplicacionReferenceDataProvider();

    PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider();

    OpcionMenuCachedRowSetDataProvider3 getOpcionMenuReferenceDataProvider();
}
