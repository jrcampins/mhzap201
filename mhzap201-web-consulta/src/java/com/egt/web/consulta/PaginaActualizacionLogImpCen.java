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

import com.egt.data.specific.xdp2.LogImpCenCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogImpCen extends PaginaActualizacion {

    TextField getCampoIdLogImpCen1();

    TextArea getCampoOrden1();

    TextArea getCampoBarrio1();

    TextArea getCampoDireccion1();

    TextArea getCampoTelefono1();

    TextArea getCampoPrimerNombre1();

    TextArea getCampoSegundoNombre1();

    TextArea getCampoPrimerApellido1();

    TextArea getCampoSegundoApellido1();

    TextArea getCampoEdadALaFecha1();

    TextArea getCampoSexo1();

    TextArea getCampoParentesco1();

    TextArea getCampoCedula1();

    TextArea getCampoNombreJefeHogar1();

    TextArea getCampoCedulaJefeHogar1();

    TextArea getCampoIcv1();

    TextArea getCampoValidado1();

    TextArea getCampoObservaciones1();

    TextArea getCampoFuncionario1();

    TextArea getCampoCausaInvalidacion1();

    DropDown getListaEsImportado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    TextArea getCampoNombreArchivo1();

    TextArea getCampoCodigoArchivo1();

    Button getBotonAplicar1();

    LogImpCenCachedRowSetDataProvider2 getLogImpCenDataProvider();
}
