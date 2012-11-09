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

import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaqueteCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionDominioPorClaseRecurso extends PaginaActualizacion {

    TextField getCampoIdDominio1();

    TextField getCampoCodigoDominio1();

    TextField getCampoNombreDominio1();

    TextArea getCampoDescripcionDominio1();

    TextField getCampoNombreTabla1();

    DropDown getListaNumeroTipoDominio1();

    TextField getCampoIdFuncionSeleccion1();

    TextField getCampoIdDominioSegmento1();

    TextField getCampoIdPaquete1();

    Button getBotonAplicar1();

    DominioCachedRowSetDataProvider2 getDominioDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider();

    DominioCachedRowSetDataProvider2 getDominioReferenceDataProvider();

    PaqueteCachedRowSetDataProvider2 getPaqueteReferenceDataProvider();
}
