/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.data.generic.xdp2.PersonaAnotadaCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionPersonaAnotada extends PaginaActualizacion {

    TextField getCampoIdPersonaAnotada1();

    TextField getCampoIdPersona1();

    TextField getCampoCodigoPersona1();

    TextField getCampoNombrePersona1();

    TextField getCampoIdUsuario1();

    TextField getCampoCodigoUsuario1();

    TextField getCampoNombreUsuario1();

    TextField getTextFieldCampoFechaHoraSeleccion1();

    Button getBotonAplicar1();

    PersonaAnotadaCachedRowSetDataProvider2 getPersonaAnotadaDataProvider();

    Object getPersonaAnotadaBusinessProcess();

    Object getMessenger();
}
