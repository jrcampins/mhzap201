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

import com.egt.data.specific.xdp2.LogImpPerCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogImpPer extends PaginaActualizacion {

    TextField getCampoIdLogImpPer1();

    TextArea getCampoP01a1();

    TextArea getCampoP01b1();

    TextArea getCampoP01c1();

    TextArea getCampoP01d1();

    TextArea getCampoP021();

    TextArea getCampoP031();

    TextArea getCampoP1041();

    TextArea getCampoP431();

    TextArea getCampoP45a1();

    TextArea getCampoP45b1();

    TextArea getCampoP44a1();

    TextArea getCampoP44b1();

    TextArea getCampoVar000011();

    TextArea getCampoVar000021();

    TextArea getCampoP461();

    TextArea getCampoP471();

    TextArea getCampoVar000301();

    TextArea getCampoP481();

    TextArea getCampoP491();

    TextArea getCampoP50a1();

    TextArea getCampoP50b1();

    TextArea getCampoP50c1();

    TextArea getCampoP511();

    TextArea getCampoVar000031();

    TextArea getCampoVar000041();

    TextArea getCampoP52d1();

    TextArea getCampoP52m1();

    TextArea getCampoP52a1();

    TextArea getCampoP53a1();

    TextArea getCampoP53b1();

    TextArea getCampoP53c1();

    TextArea getCampoP53z1();

    TextArea getCampoP541();

    TextArea getCampoP54e1();

    TextArea getCampoP561();

    TextArea getCampoP581();

    TextArea getCampoP58e1();

    TextArea getCampoP591();

    TextArea getCampoP601();

    TextArea getCampoP611();

    TextArea getCampoP621();

    TextArea getCampoP631();

    TextArea getCampoP641();

    TextArea getCampoP651();

    TextArea getCampoP65e1();

    TextArea getCampoP661();

    TextArea getCampoP66e1();

    TextArea getCampoP671();

    TextArea getCampoP681();

    TextArea getCampoP68e1();

    TextArea getCampoP731();

    TextArea getCampoP741();

    TextArea getCampoVar000061();

    TextArea getCampoVar000071();

    TextArea getCampoVar000081();

    TextArea getCampoVar000091();

    TextArea getCampoVar000101();

    TextArea getCampoVar000111();

    TextArea getCampoVar000311();

    TextArea getCampoVar000121();

    TextArea getCampoVar000131();

    TextArea getCampoP861();

    TextArea getCampoP871();

    TextArea getCampoP87e1();

    TextArea getCampoP881();

    TextArea getCampoP88e1();

    TextArea getCampoP911();

    TextArea getCampoVar000171();

    TextArea getCampoVar000181();

    TextArea getCampoVar000191();

    TextArea getCampoVar000201();

    TextArea getCampoVar000211();

    TextArea getCampoVar000221();

    TextArea getCampoVar000231();

    TextArea getCampoVar000241();

    TextArea getCampoVar000251();

    TextArea getCampoVar000261();

    TextArea getCampoVar000271();

    TextArea getCampoVar000281();

    TextArea getCampoP921();

    TextArea getCampoIcv1();

    TextArea getCampoFichaActiva1();

    DropDown getListaEsImportado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    TextArea getCampoNombreArchivo1();

    TextArea getCampoCodigoArchivo1();

    TextField getCampoIdFichaPersona1();

    Button getBotonAplicar1();

    LogImpPerCachedRowSetDataProvider2 getLogImpPerDataProvider();

    FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider();
}
