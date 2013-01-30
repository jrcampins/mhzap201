/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.consulta;

import com.egt.data.specific.xdp2.LogImpPerEecCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogImpPerEec extends PaginaActualizacion {

    TextField getCampoIdLogImpPerEec1();

    TextArea getCampoDptod1();

    TextArea getCampoDistritod1();

    TextArea getCampoDistripg1();

    TextArea getCampoArea1();

    TextArea getCampoBarrio1();

    TextArea getCampoManzana1();

    TextArea getCampoFormulario1();

    TextArea getCampoVivi1();

    TextArea getCampoHogar1();

    TextArea getCampoOrden1();

    TextArea getCampoP301();

    TextArea getCampoP311();

    TextArea getCampoP321();

    TextArea getCampoP331();

    TextArea getCampoP341();

    TextArea getCampoP351();

    TextArea getCampoP36OrdenConyugue1();

    TextArea getCampoP36OrdenPadre1();

    TextArea getCampoP36OrdenMadre1();

    TextArea getCampoP371();

    TextArea getCampoP37Cedula1();

    TextArea getCampoP38Dia1();

    TextArea getCampoP38Mes1();

    TextArea getCampoP38Ano1();

    TextArea getCampoP39pais1();

    TextArea getCampoP39dpto1();

    TextArea getCampoP39dist1();

    TextArea getCampoP39area1();

    TextArea getCampoP40Idioma1();

    TextArea getCampoP40otr1();

    TextArea getCampoP411();

    TextArea getCampoP421();

    TextArea getCampoP431();

    TextArea getCampoP4445t1();

    TextArea getCampoP441();

    TextArea getCampoP451();

    TextArea getCampoP461();

    TextArea getCampoP471();

    TextArea getCampoP481();

    TextArea getCampoP491();

    TextArea getCampoP49Otr1();

    TextArea getCampoP501();

    TextArea getCampoP50Otr1();

    TextArea getCampoP511();

    TextArea getCampoP521();

    TextArea getCampoP52Otr1();

    TextArea getCampoP531();

    TextArea getCampoP541();

    TextArea getCampoP54a1();

    TextArea getCampoP54Otr1();

    TextArea getCampoP551();

    TextArea getCampoP55Otr1();

    TextArea getCampoP561();

    TextArea getCampoP571();

    TextArea getCampoP581();

    TextArea getCampoP591();

    TextArea getCampoP601();

    TextArea getCampoP611();

    TextArea getCampoP621();

    TextArea getCampoP631();

    TextArea getCampoP63Especificar1();

    TextArea getCampoP64des1();

    TextArea getCampoP64c1();

    TextArea getCampoP65des1();

    TextArea getCampoP65c1();

    TextArea getCampoP661();

    TextArea getCampoP67a1();

    TextArea getCampoP67b1();

    TextArea getCampoP67c1();

    TextArea getCampoP67d1();

    TextArea getCampoP67e1();

    TextArea getCampoP67f1();

    TextArea getCampoP67g1();

    TextArea getCampoP67h1();

    TextArea getCampoP67i1();

    TextArea getCampoP67j1();

    TextArea getCampoP67k1();

    TextArea getCampoP67l1();

    TextArea getCampoP67tot1();

    DropDown getListaEsImportado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    TextArea getCampoNombreArchivo1();

    TextArea getCampoCodigoArchivo1();

    Button getBotonAplicar1();

    LogImpPerEecCachedRowSetDataProvider2 getLogImpPerEecDataProvider();
}
