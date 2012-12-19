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

import com.egt.data.specific.xdp2.LogProVerElePenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionLogProVerElePen extends PaginaActualizacion {

    TextField getCampoIdLogProVerElePen1();

    TextField getCampoIdPersona1();

    TextField getCampoCodigoPersona1();

    TextField getCampoNombrePersona1();

    TextField getCampoIdDepartamento1();

    TextField getCampoIdDistrito1();

    TextField getCampoIdBarrio1();

    TextField getCampoIndiceCalidadVida1();

    DropDown getListaNumeroCondicionPension1();

    DropDown getListaNumeroCondicionDenuPen1();

    DropDown getListaNumeroCondicionRecoPen1();

    DropDown getListaEsProcesado1();

    TextArea getCampoObservacion1();

    TextField getTextFieldCampoFechaHoraTransaccion1();

    Button getBotonAplicar1();

    LogProVerElePenCachedRowSetDataProvider2 getLogProVerElePenDataProvider();

    PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();
}
