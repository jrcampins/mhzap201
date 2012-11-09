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

import com.egt.data.general.xdp2.FuncionParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionFuncionParametroPorFuncion extends PaginaActualizacion {

    TextField getCampoIdFuncionParametro1();

    TextField getCampoIdParametro1();

    DropDown getListaNumeroTipoParametro1();

    DropDown getListaNumeroTipoComparacion1();

    TextField getCampoIdFuncionReferencia1();

    DropDown getListaNumeroTipoValor1();

    TextField getCampoIdListaValor1();

    TextField getCampoIdClaseObjetoValor1();

    TextField getCampoIdClaseRecursoValor1();

    TextField getCampoValorMinimo1();

    TextField getCampoValorMaximo1();

    TextField getCampoValorOmision1();

    DropDown getListaEsParametroSinRastro1();

    DropDown getListaEsParametroSegmento1();

    Button getBotonAplicar1();

    FuncionParametroCachedRowSetDataProvider2 getFuncionParametroDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionDataProvider();

    ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider();
}
