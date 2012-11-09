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

import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionPagina extends PaginaActualizacion {

    TextField getCampoIdPagina1();

    TextField getCampoCodigoPagina1();

    TextField getCampoNombrePagina1();

    TextArea getCampoDescripcionPagina1();

    TextArea getCampoUrlPagina1();

    TextField getCampoIdAplicacion1();

    DropDown getListaEsPublica1();

    DropDown getListaNumeroTipoPagina1();

    TextField getCampoIdDominio1();

    TextField getCampoIdDominioMaestro1();

    TextField getCampoIdParametro1();

    Button getBotonAplicar1();

    PaginaCachedRowSetDataProvider2 getPaginaDataProvider();

    AplicacionCachedRowSetDataProvider2 getAplicacionReferenceDataProvider();

    DominioCachedRowSetDataProvider2 getDominioReferenceDataProvider();

    ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider();
}
