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

import com.egt.data.general.xdp2.ClaseRecursoParCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoSecCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionClaseRecursoParPorClaseRecurso extends PaginaActualizacion {

    TextField getCampoIdClaseRecursoPar1();

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

    DropDown getListaEsParametroOmisible1();

    DropDown getListaEsParametroInmutable1();

    DropDown getListaEsParametroSubmit1();

    DropDown getListaEsParametroPrimordial1();

    DropDown getListaEsParametroMaestro1();

    DropDown getListaEsParametroSegmento1();

    DropDown getListaEsParametroSinRastro1();

    DropDown getListaEsParametroSincronizado1();

    TextField getCampoOrdenPresentacion1();

    TextField getCampoIdClaseRecursoSec1();

    DropDown getListaEsReferenciaAlternativa1();

    DropDown getListaNumeroTipoValorAlternativo1();

    TextField getCampoIdFuncionReferenciaAlt1();

    TextField getCampoIdListaValorAlternativa1();

    TextField getCampoIdClaseObjetoValorAlt1();

    TextField getCampoIdClaseRecursoValorAlt1();

    TextField getCampoOrdenPaginaSeleccion1();

    Button getBotonAplicar1();

    ClaseRecursoParCachedRowSetDataProvider2 getClaseRecursoParDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider();

    ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider();

    ClaseRecursoSecCachedRowSetDataProvider2 getClaseRecursoSecReferenceDataProvider();
}
