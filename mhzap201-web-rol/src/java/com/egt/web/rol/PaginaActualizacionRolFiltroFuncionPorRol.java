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
package com.egt.web.rol;

import com.egt.data.general.xdp2.RolFiltroFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FiltroFuncionCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionRolFiltroFuncionPorRol extends PaginaActualizacion {

    TextField getCampoIdRolFiltroFuncion1();

    TextField getCampoIdFiltroFuncion1();

    Button getBotonAplicar1();

    RolFiltroFuncionCachedRowSetDataProvider2 getRolFiltroFuncionDataProvider();

    RolCachedRowSetDataProvider2 getRolDataProvider();

    FiltroFuncionCachedRowSetDataProvider2 getFiltroFuncionReferenceDataProvider();
}
