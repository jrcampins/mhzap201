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

import com.egt.data.general.xdp2.GrupoAplicacionCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionGrupoAplicacion extends PaginaActualizacion {

    TextField getCampoIdGrupoAplicacion1();

    TextField getCampoCodigoGrupoAplicacion1();

    TextField getCampoNombreGrupoAplicacion1();

    TextArea getCampoDescripcionGrupoAplicacion1();

    Button getBotonAplicar1();

    GrupoAplicacionCachedRowSetDataProvider2 getGrupoAplicacionDataProvider();
}
