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
package com.egt.web.consulta;

import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionUbicacion extends PaginaActualizacion {

    TextField getCampoIdUbicacion1();

    TextField getCampoCodigoUbicacion1();

    TextField getCampoNombreUbicacion1();

    TextField getCampoIdUbicacionSuperior1();

    DropDown getListaNumeroTipoNodo1();

    DropDown getListaNumeroNivelUbicacion1();

    TextField getCampoSecuenciaUbicacion1();

    TextField getCampoClaveUbicacion1();

    DropDown getListaNumeroTipoArea1();

    TextField getCampoCodigoUbicacionJupe1();

    Button getBotonAplicar1();

    UbicacionCachedRowSetDataProvider2 getUbicacionDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();

    Object getUbicacionBusinessProcess();

    Object getMessenger();
}
