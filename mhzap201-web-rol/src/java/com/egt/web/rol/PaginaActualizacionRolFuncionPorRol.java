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

import com.egt.data.general.xdp2.RolFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.RolCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionRolFuncionPorRol extends PaginaActualizacion {

    TextField getCampoIdRolFuncion1();

    TextField getCampoIdFuncion1();

    TextField getCampoIdConjuntoSegmento1();

    Button getBotonAplicar1();

    RolFuncionCachedRowSetDataProvider2 getRolFuncionDataProvider();

    RolCachedRowSetDataProvider2 getRolDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider();

    ConjuntoSegmentoCachedRowSetDataProvider2 getConjuntoSegmentoReferenceDataProvider();
}
