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

import com.egt.data.general.xdp2.RolUsuarioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionRolUsuarioPorRol extends PaginaActualizacion {

    TextField getCampoIdRolUsuario1();

    TextField getCampoIdUsuario1();

    Button getBotonAplicar1();

    RolUsuarioCachedRowSetDataProvider2 getRolUsuarioDataProvider();

    RolCachedRowSetDataProvider2 getRolDataProvider();

    UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider();
}
