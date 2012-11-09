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

import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionFuncionPorDominio extends PaginaActualizacion {

    TextField getCampoIdFuncion1();

    TextField getCampoCodigoFuncion1();

    TextField getCampoNombreFuncion1();

    TextArea getCampoDescripcionFuncion1();

    DropDown getListaNumeroTipoFuncion1();

    DropDown getListaNumeroTipoRastroFun1();

    TextArea getCampoClausulaWhere1();

    TextArea getCampoClausulaOrder1();

    DropDown getListaEsPublica1();

    DropDown getListaEsProgramatica1();

    DropDown getListaEsPersonalizada1();

    DropDown getListaEsSegmentada1();

    TextField getCampoIdGrupoProceso1();

    Button getBotonAplicar1();

    FuncionCachedRowSetDataProvider2 getFuncionDataProvider();

    DominioCachedRowSetDataProvider2 getDominioDataProvider();

    GrupoProcesoCachedRowSetDataProvider2 getGrupoProcesoReferenceDataProvider();
}
