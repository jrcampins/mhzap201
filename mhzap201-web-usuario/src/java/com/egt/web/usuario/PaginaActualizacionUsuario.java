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

package com.egt.web.usuario;

import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextField;

public interface PaginaActualizacionUsuario extends PaginaActualizacion {

    TextField getCampoIdUsuario1();

    TextField getCampoCodigoUsuario1();

    TextField getCampoNombreUsuario1();

    TextField getCampoCorreoElectronico1();

    TextField getCampoIdUsuarioSupervisor1();

    DropDown getListaEsSuperUsuario1();

    DropDown getListaEsUsuarioInactivo1();

    DropDown getListaEsUsuarioModificado1();

    Button getBotonAplicar1();

    UsuarioCachedRowSetDataProvider3 getUsuarioDataProvider();

    PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider();

    UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider();

    Object getUsuarioBusinessProcess();

    Object getMessenger();

    Object getReporter();

}
