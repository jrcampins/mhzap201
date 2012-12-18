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

import com.egt.data.specific.xdp2.LogImpHogCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogImpHog extends PaginaActualizacion {

    TextField getCampoIdLogImpHog1();

    TextArea getCampoP20d1();

    TextArea getCampoP20m1();

    TextArea getCampoP20a1();

    TextArea getCampoP171();

    TextArea getCampoP181();

    TextArea getCampoVar000011();

    TextArea getCampoP191();

    TextArea getCampoObservaciones1();

    TextArea getCampoUtm1();

    TextArea getCampoGps1();

    TextArea getCampoOrden1();

    TextArea getCampoCoordx1();

    TextArea getCampoP01a1();

    TextArea getCampoP01b1();

    TextArea getCampoP01c1();

    TextArea getCampoP01d1();

    TextArea getCampoP021();

    TextArea getCampoP031();

    TextArea getCampoP041();

    TextArea getCampoP051();

    TextArea getCampoP061();

    TextArea getCampoP081();

    TextArea getCampoP071();

    TextArea getCampoP091();

    TextArea getCampoP141();

    TextArea getCampoP151();

    TextArea getCampoP161();

    TextArea getCampoP241();

    TextArea getCampoP251();

    TextArea getCampoP261();

    TextArea getCampoP271();

    TextArea getCampoP27e1();

    TextArea getCampoP28a1();

    TextArea getCampoP28b1();

    TextArea getCampoP291();

    TextArea getCampoP301();

    TextArea getCampoP311();

    TextArea getCampoP321();

    TextArea getCampoP331();

    TextArea getCampoP341();

    TextArea getCampoP351();

    TextArea getCampoP361();

    TextArea getCampoP371();

    TextArea getCampoNroCelular1();

    TextArea getCampoP381();

    TextArea getCampoNroLineaBaja1();

    TextArea getCampoP3911();

    TextArea getCampoP3921();

    TextArea getCampoP3931();

    TextArea getCampoP3941();

    TextArea getCampoP3951();

    TextArea getCampoP3961();

    TextArea getCampoP3971();

    TextArea getCampoP42n1();

    TextArea getCampoP42ci1();

    TextArea getCampoLetraCi1();

    TextArea getCampoP431();

    TextArea getCampoVar000021();

    TextArea getCampoVar000031();

    TextArea getCampoVar000041();

    TextArea getCampoP1041();

    DropDown getListaEsImportado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    TextArea getCampoNombreArchivo1();

    TextArea getCampoCodigoArchivo1();

    Button getBotonAplicar1();

    LogImpHogCachedRowSetDataProvider2 getLogImpHogDataProvider();
}
