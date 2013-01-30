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

import com.egt.data.specific.xdp2.LogImpHogEecCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogImpHogEec extends PaginaActualizacion {

    TextField getCampoIdLogImpHogEec1();

    TextArea getCampoDptod1();

    TextArea getCampoDistritod1();

    TextArea getCampoDistripg1();

    TextArea getCampoArea1();

    TextArea getCampoBarrio1();

    TextArea getCampoManzana1();

    TextArea getCampoFormulario1();

    TextArea getCampoVivi1();

    TextArea getCampoHogar1();

    TextArea getCampoDireccion1();

    TextArea getCampoNroDe1();

    TextArea getCampoTelefono1();

    TextArea getCampoFecha1();

    TextArea getCampoDia1();

    TextArea getCampoMes1();

    TextArea getCampoAno1();

    TextArea getCampoV10t1();

    TextArea getCampoV111();

    TextArea getCampoV121();

    TextArea getCampoV131();

    TextArea getCampoV141();

    TextArea getCampoV151();

    TextArea getCampoV161();

    TextArea getCampoV16Otr1();

    TextArea getCampoV17a1();

    TextArea getCampoV17b1();

    TextArea getCampoV181();

    TextArea getCampoV191();

    TextArea getCampoV201();

    TextArea getCampoV211();

    TextArea getCampoV221();

    TextArea getCampoV231();

    TextArea getCampoV241();

    TextArea getCampoV251();

    TextArea getCampoV261();

    TextArea getCampoV26espCelular1();

    TextArea getCampoV271();

    TextArea getCampoV27espLinea1();

    TextArea getCampoV2811();

    TextArea getCampoV2821();

    TextArea getCampoV2831();

    TextArea getCampoV2841();

    TextArea getCampoV2851();

    TextArea getCampoV2861();

    TextArea getCampoV2871();

    TextArea getCampoV2881();

    TextArea getCampoV29nombreJefe1();

    TextArea getCampoCedulajefe1();

    TextArea getCampoVar000011();

    DropDown getListaEsImportado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    TextArea getCampoNombreArchivo1();

    TextArea getCampoCodigoArchivo1();

    Button getBotonAplicar1();

    LogImpHogEecCachedRowSetDataProvider2 getLogImpHogEecDataProvider();
}
