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

import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoAplicacionCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionClaseRecurso extends PaginaActualizacion {

    TextField getCampoIdClaseRecurso1();

    TextField getCampoCodigoClaseRecurso1();

    TextField getCampoNombreClaseRecurso1();

    TextArea getCampoDescripcionClaseRecurso1();

    DropDown getListaEsClaseRecursoIndependiente1();

    DropDown getListaEsClaseRecursoSinDetalle1();

    DropDown getListaEsClaseRecursoConArbol1();

    DropDown getListaNumeroTipoClaseRecurso1();

    DropDown getListaNumeroTipoRecurso1();

    TextField getCampoIdFuncionSeleccion1();

    TextField getCampoIdPaginaSeleccion1();

    TextField getCampoIdPaginaDetalle1();

    TextField getCampoIdClaseRecursoMaestro1();

    TextField getCampoIdClaseRecursoSegmento1();

    TextField getCampoIdClaseRecursoBase1();

    TextField getCampoIdGrupoAplicacion1();

    TextField getCampoIdAplicacionWeb1();

    TextField getCampoLimiteFilasConsulta1();

    TextField getCampoLimiteFilasInforme1();

    TextField getCampoOrdenPresentacion1();

    DropDown getListaEsClaseRecursoInsertable1();

    DropDown getListaEsClaseRecursoModificable1();

    DropDown getListaEsClaseRecursoEliminable1();

    DropDown getListaEsClaseRecursoExtendida1();

    TextField getCampoEtiquetaHipervinculo1();

    DropDown getListaEsEnumeradorConNumero1();

    TextField getCampoAliasClaseRecurso1();

    Button getBotonAplicar1();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider();

    FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider();

    PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider();

    GrupoAplicacionCachedRowSetDataProvider2 getGrupoAplicacionReferenceDataProvider();
}
